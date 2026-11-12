package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class g1e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SparseArrayCompat<WeakReference<Interpolator>> f18463b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Interpolator f18462a = new LinearInterpolator();
    public static JsonReader.a c = JsonReader.a.a(DeviceTagInterface.CUSTOM_TAG_TYPE, "s", PluginDeviceInfo.FICONOFFLINE, DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "i", "h", "to", "ti");
    public static JsonReader.a d = JsonReader.a.a("x", "y");

    public static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (g1e.class) {
            weakReference = g().get(i);
        }
        return weakReference;
    }

    public static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorA;
        pointF.x = d5g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = d5g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = d5g.b(pointF2.x, -1.0f, 1.0f);
        float fB = d5g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        int i = emq.i(pointF.x, pointF.y, pointF2.x, fB);
        WeakReference<Interpolator> weakReferenceA = w1e.c() ? null : a(i);
        Interpolator interpolator = weakReferenceA != null ? weakReferenceA.get() : null;
        if (weakReferenceA == null || interpolator == null) {
            try {
                interpolatorA = tlh.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                interpolatorA = "The Path cannot loop back on itself.".equals(e.getMessage()) ? tlh.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = interpolatorA;
            if (!w1e.c()) {
                try {
                    h(i, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    public static <T> e1e<T> c(JsonReader jsonReader, lse lseVar, float f, snq<T> snqVar, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return e(lseVar, jsonReader, f, snqVar);
        }
        return z ? d(lseVar, jsonReader, f, snqVar) : f(jsonReader, f, snqVar);
    }

    public static <T> e1e<T> d(lse lseVar, JsonReader jsonReader, float f, snq<T> snqVar) throws IOException {
        Interpolator interpolatorB;
        T t;
        jsonReader.beginObject();
        PointF pointFE = null;
        T tA = null;
        T tA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fNextDouble = 0.0f;
        boolean z = false;
        PointF pointFE4 = null;
        while (jsonReader.d()) {
            switch (jsonReader.p(c)) {
                case 0:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    tA2 = snqVar.a(jsonReader, f);
                    break;
                case 2:
                    tA = snqVar.a(jsonReader, f);
                    break;
                case 3:
                    pointFE = sud.e(jsonReader, 1.0f);
                    break;
                case 4:
                    pointFE4 = sud.e(jsonReader, 1.0f);
                    break;
                case 5:
                    z = jsonReader.nextInt() == 1;
                    break;
                case 6:
                    pointFE2 = sud.e(jsonReader, f);
                    break;
                case 7:
                    pointFE3 = sud.e(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            interpolatorB = f18462a;
            t = tA2;
        } else {
            interpolatorB = (pointFE == null || pointFE4 == null) ? f18462a : b(pointFE, pointFE4);
            t = tA;
        }
        e1e<T> e1eVar = new e1e<>(lseVar, tA2, t, interpolatorB, fNextDouble, null);
        e1eVar.o = pointFE2;
        e1eVar.p = pointFE3;
        return e1eVar;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01ea  */
    public static <T> e1e<T> e(lse lseVar, JsonReader jsonReader, float f, snq<T> snqVar) throws IOException {
        Interpolator interpolatorB;
        Interpolator interpolatorB2;
        Interpolator interpolatorB3;
        T t;
        e1e<T> e1eVar;
        PointF pointF;
        float f2;
        PointF pointF2;
        jsonReader.beginObject();
        PointF pointFE = null;
        boolean z = false;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        PointF pointF3 = null;
        T tA = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        float fNextDouble = 0.0f;
        PointF pointFE4 = null;
        T tA2 = null;
        while (jsonReader.d()) {
            switch (jsonReader.p(c)) {
                case 0:
                    pointF = pointFE;
                    fNextDouble = (float) jsonReader.nextDouble();
                    pointFE = pointF;
                    break;
                case 1:
                    pointF = pointFE;
                    tA = snqVar.a(jsonReader, f);
                    pointFE = pointF;
                    break;
                case 2:
                    pointF = pointFE;
                    tA2 = snqVar.a(jsonReader, f);
                    pointFE = pointF;
                    break;
                case 3:
                    pointF = pointFE;
                    f2 = fNextDouble;
                    PointF pointF7 = pointFE4;
                    if (jsonReader.n() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.d()) {
                            int iP = jsonReader.p(d);
                            if (iP == 0) {
                                JsonReader.Token tokenN = jsonReader.n();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenN == token) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.b();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.n() == token ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.c();
                                }
                            } else if (iP != 1) {
                                jsonReader.skipValue();
                            } else {
                                JsonReader.Token tokenN2 = jsonReader.n();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenN2 == token2) {
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    jsonReader.b();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.n() == token2 ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.c();
                                }
                            }
                        }
                        PointF pointF8 = new PointF(fNextDouble2, fNextDouble3);
                        PointF pointF9 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF4 = pointF9;
                        pointF3 = pointF8;
                        pointFE4 = pointF7;
                        fNextDouble = f2;
                    } else {
                        pointFE2 = sud.e(jsonReader, f);
                        fNextDouble = f2;
                        pointFE4 = pointF7;
                    }
                    pointFE = pointF;
                    break;
                case 4:
                    if (jsonReader.n() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = 0.0f;
                        float f3 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        while (jsonReader.d()) {
                            pointFE4 = pointFE4;
                            int iP2 = jsonReader.p(d);
                            if (iP2 != 0) {
                                pointF2 = pointFE;
                                if (iP2 != 1) {
                                    jsonReader.skipValue();
                                } else {
                                    JsonReader.Token tokenN3 = jsonReader.n();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenN3 == token3) {
                                        fNextDouble8 = (float) jsonReader.nextDouble();
                                        fNextDouble = fNextDouble;
                                        f3 = fNextDouble8;
                                    } else {
                                        float f4 = fNextDouble;
                                        jsonReader.b();
                                        float fNextDouble9 = (float) jsonReader.nextDouble();
                                        float fNextDouble10 = jsonReader.n() == token3 ? (float) jsonReader.nextDouble() : fNextDouble9;
                                        jsonReader.c();
                                        fNextDouble = f4;
                                        pointFE = pointF2;
                                        fNextDouble8 = fNextDouble10;
                                        f3 = fNextDouble9;
                                    }
                                }
                            } else {
                                pointF2 = pointFE;
                                float f5 = fNextDouble;
                                JsonReader.Token tokenN4 = jsonReader.n();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenN4 == token4) {
                                    fNextDouble7 = (float) jsonReader.nextDouble();
                                    fNextDouble = f5;
                                    fNextDouble6 = fNextDouble7;
                                } else {
                                    jsonReader.b();
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble7 = jsonReader.n() == token4 ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.c();
                                    fNextDouble = f5;
                                }
                            }
                            pointFE = pointF2;
                        }
                        pointF = pointFE;
                        f2 = fNextDouble;
                        PointF pointF10 = new PointF(fNextDouble6, f3);
                        PointF pointF11 = new PointF(fNextDouble7, fNextDouble8);
                        jsonReader.endObject();
                        pointF6 = pointF11;
                        pointF5 = pointF10;
                        fNextDouble = f2;
                    } else {
                        pointF = pointFE;
                        pointFE3 = sud.e(jsonReader, f);
                    }
                    pointFE = pointF;
                    break;
                case 5:
                    z = jsonReader.nextInt() == 1;
                    break;
                case 6:
                    pointFE4 = sud.e(jsonReader, f);
                    break;
                case 7:
                    pointFE = sud.e(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        PointF pointF12 = pointFE;
        float f6 = fNextDouble;
        PointF pointF13 = pointFE4;
        jsonReader.endObject();
        if (z) {
            interpolatorB = f18462a;
            t = tA;
        } else {
            if (pointFE2 == null || pointFE3 == null) {
                if (pointF3 == null || pointF4 == null || pointF5 == null || pointF6 == null) {
                    interpolatorB = f18462a;
                } else {
                    interpolatorB2 = b(pointF3, pointF5);
                    interpolatorB3 = b(pointF4, pointF6);
                    t = tA2;
                    interpolatorB = null;
                }
                if (interpolatorB2 != null || interpolatorB3 == null) {
                    e1eVar = new e1e<>(lseVar, tA, t, interpolatorB, f6, null);
                } else {
                    e1eVar = new e1e<>(lseVar, tA, t, interpolatorB2, interpolatorB3, f6, null);
                }
                e1eVar.o = pointF13;
                e1eVar.p = pointF12;
                return e1eVar;
            }
            interpolatorB = b(pointFE2, pointFE3);
            t = tA2;
        }
        interpolatorB2 = null;
        interpolatorB3 = null;
        if (interpolatorB2 != null) {
            e1eVar = new e1e<>(lseVar, tA, t, interpolatorB, f6, null);
        } else {
            e1eVar = new e1e<>(lseVar, tA, t, interpolatorB, f6, null);
        }
        e1eVar.o = pointF13;
        e1eVar.p = pointF12;
        return e1eVar;
    }

    public static <T> e1e<T> f(JsonReader jsonReader, float f, snq<T> snqVar) throws IOException {
        return new e1e<>(snqVar.a(jsonReader, f));
    }

    public static SparseArrayCompat<WeakReference<Interpolator>> g() {
        if (f18463b == null) {
            f18463b = new SparseArrayCompat<>();
        }
        return f18463b;
    }

    public static void h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (g1e.class) {
            f18463b.put(i, weakReference);
        }
    }
}
