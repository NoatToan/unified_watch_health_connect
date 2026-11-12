package com.facebook.react.uimanager;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import defpackage.agj;
import defpackage.cbe;
import defpackage.cm8;
import defpackage.dyp;
import defpackage.e4f;
import defpackage.exh;
import defpackage.fdj;
import defpackage.fqi;
import defpackage.iej;
import defpackage.iz6;
import defpackage.l1j;
import defpackage.vah;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseViewManager<T extends View, C extends cbe> extends ViewManager<T, C> {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    public static final Map<String, Integer> sStateDescription;
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static a.C0169a sMatrixDecompositionContext = new a.C0169a();
    private static double[] sTransformDecompositionArray = new double[16];

    static {
        HashMap map = new HashMap();
        sStateDescription = map;
        map.put(STATE_BUSY, Integer.valueOf(l1j.M));
        map.put(STATE_EXPANDED, Integer.valueOf(l1j.O));
        map.put("collapsed", Integer.valueOf(l1j.N));
    }

    private void logUnsupportedPropertyWarning(String str) {
        cm8.E("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(exh.c(0.0f));
        view.setTranslationY(exh.c(0.0f));
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        dyp.b(readableArray, sTransformDecompositionArray);
        a.k(sTransformDecompositionArray, sMatrixDecompositionContext);
        view.setTranslationX(exh.c((float) sMatrixDecompositionContext.translation[0]));
        view.setTranslationY(exh.c((float) sMatrixDecompositionContext.translation[1]));
        view.setRotation((float) sMatrixDecompositionContext.rotationDegrees[2]);
        view.setRotationX((float) sMatrixDecompositionContext.rotationDegrees[0]);
        view.setRotationY((float) sMatrixDecompositionContext.rotationDegrees[1]);
        view.setScaleX((float) sMatrixDecompositionContext.scale[0]);
        view.setScaleY((float) sMatrixDecompositionContext.scale[1]);
        double[] dArr = sMatrixDecompositionContext.perspective;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            float f2 = (-1.0f) / f;
            float f3 = iz6.e().density;
            view.setCameraDistance(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    private void updateViewAccessibility(T t) {
        ReactAccessibilityDelegate.a(t);
    }

    private void updateViewContentDescription(T t) {
        String str = (String) t.getTag(fqi.c);
        ReadableArray readableArray = (ReadableArray) t.getTag(fqi.f);
        ReadableMap readableMap = (ReadableMap) t.getTag(fqi.e);
        String str2 = (String) t.getTag(fqi.f18088b);
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                String string = readableArray.getString(i);
                Map<String, Integer> map = sStateDescription;
                if (map.containsKey(string)) {
                    arrayList.add(t.getContext().getString(map.get(string).intValue()));
                }
            }
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic = readableMap.getDynamic(strNextKey);
                if (strNextKey.equals(STATE_CHECKED) && dynamic.getType() == ReadableType.String && dynamic.asString().equals(STATE_MIXED)) {
                    arrayList.add(t.getContext().getString(l1j.P));
                } else if (strNextKey.equals(STATE_BUSY) && dynamic.getType() == ReadableType.Boolean && dynamic.asBoolean()) {
                    arrayList.add(t.getContext().getString(l1j.M));
                } else if (strNextKey.equals(STATE_EXPANDED) && dynamic.getType() == ReadableType.Boolean) {
                    arrayList.add(t.getContext().getString(dynamic.asBoolean() ? l1j.O : l1j.N));
                }
            }
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (arrayList.size() > 0) {
            t.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return e4f.a().b("topAccessibilityAction", e4f.d("registrationName", "onAccessibilityAction")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(T t) {
        super.onAfterUpdateTransaction(t);
        updateViewAccessibility(t);
    }

    @iej(name = "accessibilityActions")
    public void setAccessibilityActions(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t.setTag(fqi.f18087a, readableArray);
    }

    @iej(name = "accessibilityHint")
    public void setAccessibilityHint(T t, String str) {
        t.setTag(fqi.f18088b, str);
        updateViewContentDescription(t);
    }

    @iej(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t, String str) {
        t.setTag(fqi.c, str);
        updateViewContentDescription(t);
    }

    @iej(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t, String str) {
        if (str == null || str.equals("none")) {
            androidx.core.view.c.t0(t, 0);
        } else if (str.equals("polite")) {
            androidx.core.view.c.t0(t, 1);
        } else if (str.equals("assertive")) {
            androidx.core.view.c.t0(t, 2);
        }
    }

    @iej(name = "accessibilityRole")
    public void setAccessibilityRole(T t, String str) {
        if (str == null) {
            return;
        }
        t.setTag(fqi.d, ReactAccessibilityDelegate.AccessibilityRole.fromValue(str));
    }

    @iej(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(T t, int i) {
        t.setBackgroundColor(i);
    }

    public void setBorderBottomLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    public void setBorderBottomRightRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    public void setBorderRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    public void setBorderTopLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    public void setBorderTopRightRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @iej(name = BizTypeConstants.ELEVATION)
    public void setElevation(T t, float f) {
        androidx.core.view.c.z0(t, exh.c(f));
    }

    @iej(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t, String str) {
        if (str == null || str.equals("auto")) {
            androidx.core.view.c.C0(t, 0);
            return;
        }
        if (str.equals("yes")) {
            androidx.core.view.c.C0(t, 1);
        } else if (str.equals("no")) {
            androidx.core.view.c.C0(t, 2);
        } else if (str.equals("no-hide-descendants")) {
            androidx.core.view.c.C0(t, 4);
        }
    }

    @iej(name = "nativeID")
    public void setNativeId(T t, String str) {
        t.setTag(fqi.f18090r, str);
        fdj.b(t);
    }

    @iej(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t, float f) {
        if (t.getAnimation() instanceof vah) {
            vah vahVar = (vah) t.getAnimation();
            if (vahVar.a() != f) {
                StringBuilder sb = new StringBuilder();
                sb.append("--BaseViewManager-- clearAnimation getEndOpacity = ");
                sb.append(vahVar.a());
                sb.append(" set opacity = ");
                sb.append(f);
                t.clearAnimation();
            }
        }
        t.setAlpha(f);
    }

    @iej(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t, boolean z) {
        t.setLayerType(z ? 2 : 0, null);
    }

    @iej(name = "rotation")
    @Deprecated
    public void setRotation(T t, float f) {
        t.setRotation(f);
    }

    @iej(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(T t, float f) {
        t.setScaleX(f);
    }

    @iej(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(T t, float f) {
        t.setScaleY(f);
    }

    @iej(name = "testID")
    public void setTestId(T t, String str) {
        t.setTag(fqi.h, str);
        t.setTag(str);
    }

    @iej(name = "transform")
    public void setTransform(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(t);
        } else {
            setTransformProperty(t, readableArray);
        }
    }

    @iej(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(T t, float f) {
        t.setTranslationX(exh.c(f));
    }

    @iej(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(T t, float f) {
        t.setTranslationY(exh.c(f));
    }

    @iej(name = "accessibilityState")
    public void setViewState(T t, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        t.setTag(fqi.e, readableMap);
        t.setSelected(false);
        t.setEnabled(true);
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (strNextKey.equals(STATE_BUSY) || strNextKey.equals(STATE_EXPANDED) || (strNextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t);
                return;
            }
        }
    }

    @iej(name = "accessibilityStates")
    public void setViewStates(T t, ReadableArray readableArray) {
        boolean z = t.getTag(fqi.f) != null && readableArray == null;
        t.setTag(fqi.f, readableArray);
        t.setSelected(false);
        t.setEnabled(true);
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                String string = readableArray.getString(i);
                if (sStateDescription.containsKey(string)) {
                    z = true;
                }
                if ("selected".equals(string)) {
                    t.setSelected(true);
                } else if ("disabled".equals(string)) {
                    t.setEnabled(false);
                }
            }
        }
        if (z) {
            updateViewContentDescription(t);
        }
    }

    @iej(name = "zIndex")
    public void setZIndex(T t, float f) {
        ViewGroupManager.setViewZIndex(t, Math.round(f));
        ViewParent parent = t.getParent();
        if (parent instanceof agj) {
            ((agj) parent).updateDrawingOrder();
        }
    }
}
