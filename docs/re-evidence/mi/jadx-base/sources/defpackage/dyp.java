package defpackage;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes4.dex */
public class dyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ThreadLocal<double[]> f16072a = new a();

    public class a extends ThreadLocal<double[]> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public double[] initialValue() {
            return new double[16];
        }
    }

    public static double a(ReadableMap readableMap, String str) {
        double d;
        boolean z = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z = false;
            }
            d = Float.parseFloat(string);
        } else {
            d = readableMap.getDouble(str);
        }
        return z ? d : com.facebook.react.uimanager.a.l(d);
    }

    public static void b(ReadableArray readableArray, double[] dArr) {
        double[] dArr2 = f16072a.get();
        com.facebook.react.uimanager.a.r(dArr);
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            String strNextKey = map.keySetIterator().nextKey();
            com.facebook.react.uimanager.a.r(dArr2);
            if ("matrix".equals(strNextKey)) {
                ReadableArray array = map.getArray(strNextKey);
                for (int i2 = 0; i2 < 16; i2++) {
                    dArr2[i2] = array.getDouble(i2);
                }
            } else if ("perspective".equals(strNextKey)) {
                com.facebook.react.uimanager.a.a(dArr2, map.getDouble(strNextKey));
            } else if ("rotateX".equals(strNextKey)) {
                com.facebook.react.uimanager.a.b(dArr2, a(map, strNextKey));
            } else if ("rotateY".equals(strNextKey)) {
                com.facebook.react.uimanager.a.c(dArr2, a(map, strNextKey));
            } else if ("rotate".equals(strNextKey) || "rotateZ".equals(strNextKey)) {
                com.facebook.react.uimanager.a.d(dArr2, a(map, strNextKey));
            } else if ("scale".equals(strNextKey)) {
                double d = map.getDouble(strNextKey);
                com.facebook.react.uimanager.a.e(dArr2, d);
                com.facebook.react.uimanager.a.f(dArr2, d);
            } else if ("scaleX".equals(strNextKey)) {
                com.facebook.react.uimanager.a.e(dArr2, map.getDouble(strNextKey));
            } else if ("scaleY".equals(strNextKey)) {
                com.facebook.react.uimanager.a.f(dArr2, map.getDouble(strNextKey));
            } else if ("translate".equals(strNextKey)) {
                ReadableArray array2 = map.getArray(strNextKey);
                com.facebook.react.uimanager.a.j(dArr2, array2.getDouble(0), array2.getDouble(1), array2.size() > 2 ? array2.getDouble(2) : 0.0d);
            } else if ("translateX".equals(strNextKey)) {
                com.facebook.react.uimanager.a.i(dArr2, map.getDouble(strNextKey), 0.0d);
            } else if ("translateY".equals(strNextKey)) {
                com.facebook.react.uimanager.a.i(dArr2, 0.0d, map.getDouble(strNextKey));
            } else if ("skewX".equals(strNextKey)) {
                com.facebook.react.uimanager.a.g(dArr2, a(map, strNextKey));
            } else {
                if (!"skewY".equals(strNextKey)) {
                    throw new JSApplicationIllegalArgumentException("Unsupported transform type: " + strNextKey);
                }
                com.facebook.react.uimanager.a.h(dArr2, a(map, strNextKey));
            }
            com.facebook.react.uimanager.a.p(dArr, dArr, dArr2);
        }
    }
}
