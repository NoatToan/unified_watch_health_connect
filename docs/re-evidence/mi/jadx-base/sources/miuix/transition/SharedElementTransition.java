package miuix.transition;

import android.content.Context;
import android.util.ArrayMap;
import android.util.AttributeSet;
import java.util.Map;
import miuix.animation.property.ViewProperty;
import miuix.animation.property.ViewPropertyExt;

/* JADX INFO: loaded from: classes3.dex */
public class SharedElementTransition extends ChangeBounds {
    public static final String[] I = {"android:transition:bounds", "android:transition:parent", "android:transition:windowX", "android:transition:windowY", "android:transition:z", "android:transition:scaleX", "android:transition:scaleY", "android:transition:rotation", "android:transition:rotationX", "android:transition:rotationY", "android:transition:scrollX", "android:transition:scrollY", "android:transition:alpha", "android:transition:background", "android:transition:foreground"};
    public static Map<String, ViewProperty> J;

    static {
        ArrayMap arrayMap = new ArrayMap();
        J = arrayMap;
        arrayMap.put("android:transition:z", ViewProperty.Z);
        J.put("android:transition:translationX", ViewProperty.TRANSLATION_X);
        J.put("android:transition:translationY", ViewProperty.TRANSLATION_Y);
        J.put("android:transition:translationZ", ViewProperty.TRANSLATION_Z);
        J.put("android:transition:scaleX", ViewProperty.SCALE_X);
        J.put("android:transition:scaleY", ViewProperty.SCALE_Y);
        J.put("android:transition:rotation", ViewProperty.ROTATION);
        J.put("android:transition:rotationX", ViewProperty.ROTATION_X);
        J.put("android:transition:rotationY", ViewProperty.ROTATION_Y);
        J.put("android:transition:scrollX", ViewProperty.SCROLL_X);
        J.put("android:transition:scrollY", ViewProperty.SCROLL_Y);
        J.put("android:transition:alpha", ViewProperty.ALPHA);
        J.put("android:transition:background", ViewPropertyExt.BACKGROUND);
        J.put("android:transition:foreground", ViewPropertyExt.FOREGROUND);
    }

    public SharedElementTransition() {
    }

    public SharedElementTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
