package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.l;
import java.util.ArrayList;
import java.util.List;
import p1.k1;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class MotionSpec {
    private static final String TAG = "MotionSpec";
    private final k1<String, MotionTiming> timings = new k1<>();
    private final k1<String, PropertyValuesHolder[]> propertyValues = new k1<>();

    private static void addInfoFromAnimator(MotionSpec motionSpec, Animator animator) {
        if (!(animator instanceof ObjectAnimator)) {
            l.j(animator, "Animator must be an ObjectAnimator: ");
            return;
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) animator;
        motionSpec.setPropertyValues(objectAnimator.getPropertyName(), objectAnimator.getValues());
        motionSpec.setTiming(objectAnimator.getPropertyName(), MotionTiming.createFromAnimator(objectAnimator));
    }

    private PropertyValuesHolder[] clonePropertyValuesHolder(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i14 = 0; i14 < propertyValuesHolderArr.length; i14++) {
            propertyValuesHolderArr2[i14] = propertyValuesHolderArr[i14].clone();
        }
        return propertyValuesHolderArr2;
    }

    public static MotionSpec createFromAttribute(Context context, TypedArray typedArray, int i14) {
        int resourceId;
        if (!typedArray.hasValue(i14) || (resourceId = typedArray.getResourceId(i14, 0)) == 0) {
            return null;
        }
        return createFromResource(context, resourceId);
    }

    public static MotionSpec createFromResource(Context context, int i14) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i14);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return createSpecFromAnimators(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return createSpecFromAnimators(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i14);
            return null;
        }
    }

    private static MotionSpec createSpecFromAnimators(List<Animator> list) {
        MotionSpec motionSpec = new MotionSpec();
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            addInfoFromAnimator(motionSpec, list.get(i14));
        }
        return motionSpec;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MotionSpec) {
            return this.timings.equals(((MotionSpec) obj).timings);
        }
        return false;
    }

    public <T> ObjectAnimator getAnimator(String str, T t7, Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t7, getPropertyValues(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        getTiming(str).apply(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public PropertyValuesHolder[] getPropertyValues(String str) {
        if (hasPropertyValues(str)) {
            return clonePropertyValuesHolder(this.propertyValues.get(str));
        }
        h.w();
        return null;
    }

    public MotionTiming getTiming(String str) {
        if (hasTiming(str)) {
            return this.timings.get(str);
        }
        h.w();
        return null;
    }

    public long getTotalDuration() {
        int i14 = this.timings.f134761c;
        long jMax = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            MotionTiming motionTimingK = this.timings.k(i15);
            jMax = Math.max(jMax, motionTimingK.getDuration() + motionTimingK.getDelay());
        }
        return jMax;
    }

    public boolean hasPropertyValues(String str) {
        return this.propertyValues.get(str) != null;
    }

    public boolean hasTiming(String str) {
        return this.timings.get(str) != null;
    }

    public int hashCode() {
        return this.timings.hashCode();
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.propertyValues.put(str, propertyValuesHolderArr);
    }

    public void setTiming(String str, MotionTiming motionTiming) {
        this.timings.put(str, motionTiming);
    }

    public String toString() {
        return "\n" + getClass().getName() + CoreConstants.CURLY_LEFT + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.timings + "}\n";
    }
}
