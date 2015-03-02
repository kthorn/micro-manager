package org.micromanager.display.internal.events;

/**
 * This event is used to ensure that the different histogram controls apply
 * their LUTs to the image.
 */
public class LUTUpdateEvent {
   // These are Integers and Doubles instead of ints and doubles so they can
   // be null, which is used to signify that the recipient of the event should
   // use their own values instead.
   private Integer min_;
   private Integer max_;
   private Double gamma_;

   public LUTUpdateEvent(Integer min, Integer max, Double gamma) {
      min_ = min;
      max_ = max;
      gamma_ = gamma;
   }

   public Integer getMin() {
      return min_;
   }

   public Integer getMax() {
      return max_;
   }

   public Double getGamma() {
      return gamma_;
   }
}