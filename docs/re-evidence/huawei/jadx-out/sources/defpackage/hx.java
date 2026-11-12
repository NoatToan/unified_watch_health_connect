package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.parser.ValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
class hx {
    private static SparseArrayCompat<WeakReference<Interpolator>> e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Interpolator f37294b = new LinearInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static JsonReader.d f37293a = JsonReader.d.e(FitRunPlayAudio.PLAY_TYPE_T, "s", FitRunPlayAudio.OPPORTUNITY_E, "o", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "h", "to", "ti");
    static JsonReader.d d = JsonReader.d.e("x", "y");

    hx() {
    }

    private static SparseArrayCompat<WeakReference<Interpolator>> a() {
        if (e == null) {
            e = new SparseArrayCompat<>();
        }
        return e;
    }

    private static WeakReference<Interpolator> d(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (hx.class) {
            weakReference = a().get(i);
        }
        return weakReference;
    }

    private static void d(int i, WeakReference<Interpolator> weakReference) {
        synchronized (hx.class) {
            e.put(i, weakReference);
        }
    }

    static <T> jb<T> e(JsonReader jsonReader, cx cxVar, float f, ValueParser<T> valueParser, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return b(cxVar, jsonReader, f, valueParser);
        }
        if (z) {
            return d(cxVar, jsonReader, f, valueParser);
        }
        return b(jsonReader, f, valueParser);
    }

    private static <T> jb<T> d(cx cxVar, JsonReader jsonReader, float f, ValueParser<T> valueParser) throws IOException {
        Interpolator interpolatorA;
        Interpolator interpolator;
        T t;
        jsonReader.beginObject();
        PointF pointFB = null;
        T t2 = null;
        T t3 = null;
        PointF pointFB2 = null;
        PointF pointFB3 = null;
        float fNextDouble = 0.0f;
        boolean z = false;
        PointF pointFB4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(f37293a)) {
                case 0:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t3 = valueParser.parse(jsonReader, f);
                    break;
                case 2:
                    t2 = valueParser.parse(jsonReader, f);
                    break;
                case 3:
                    pointFB = hw.b(jsonReader, 1.0f);
                    break;
                case 4:
                    pointFB4 = hw.b(jsonReader, 1.0f);
                    break;
                case 5:
                    z = jsonReader.nextInt() == 1;
                    break;
                case 6:
                    pointFB3 = hw.b(jsonReader, f);
                    break;
                case 7:
                    pointFB2 = hw.b(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            interpolator = f37294b;
            t = t3;
        } else {
            if (pointFB != null && pointFB4 != null) {
                interpolatorA = a(pointFB, pointFB4);
            } else {
                interpolatorA = f37294b;
            }
            interpolator = interpolatorA;
            t = t2;
        }
        jb<T> jbVar = new jb<>(cxVar, t3, t, interpolator, fNextDouble, null);
        jbVar.f38329c = pointFB3;
        jbVar.e = pointFB2;
        return jbVar;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0203  */
    private static <T> jb<T> b(cx cxVar, JsonReader jsonReader, float f, ValueParser<T> valueParser) throws IOException {
        Interpolator interpolatorA;
        Interpolator interpolatorA2;
        Interpolator interpolatorA3;
        T t;
        T t2;
        jb<T> jbVar;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        PointF pointF5;
        jsonReader.beginObject();
        PointF pointFB = null;
        PointF pointFB2 = null;
        boolean z = false;
        PointF pointFB3 = null;
        PointF pointFB4 = null;
        PointF pointF6 = null;
        T t3 = null;
        PointF pointF7 = null;
        T t4 = null;
        PointF pointF8 = null;
        float fNextDouble = 0.0f;
        PointF pointF9 = null;
        while (jsonReader.hasNext()) {
            t4 = t4;
            switch (jsonReader.selectName(f37293a)) {
                case 0:
                    pointF = pointFB;
                    pointF2 = pointFB2;
                    fNextDouble = (float) jsonReader.nextDouble();
                    pointFB = pointF;
                    pointFB2 = pointF2;
                    break;
                case 1:
                    t3 = valueParser.parse(jsonReader, f);
                    t4 = t4;
                    break;
                case 2:
                    t4 = valueParser.parse(jsonReader, f);
                    break;
                case 3:
                    pointF = pointFB;
                    pointF2 = pointFB2;
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int iSelectName = jsonReader.selectName(d);
                            if (iSelectName == 0) {
                                pointF5 = pointF8;
                                if (jsonReader.peek() == JsonReader.Token.NUMBER) {
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = fNextDouble2;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == JsonReader.Token.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                }
                            } else if (iSelectName == 1) {
                                if (jsonReader.peek() == JsonReader.Token.NUMBER) {
                                    pointF5 = pointF8;
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = fNextDouble3;
                                } else {
                                    pointF5 = pointF8;
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == JsonReader.Token.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            pointF8 = pointF5;
                        }
                        pointF4 = pointF8;
                        pointF7 = new PointF(fNextDouble2, fNextDouble3);
                        PointF pointF10 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF6 = pointF10;
                    } else {
                        pointF4 = pointF8;
                        pointFB3 = hw.b(jsonReader, f);
                    }
                    pointF8 = pointF4;
                    pointFB = pointF;
                    pointFB2 = pointF2;
                    break;
                case 4:
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        float fNextDouble9 = 0.0f;
                        while (jsonReader.hasNext()) {
                            PointF pointF11 = pointFB;
                            int iSelectName2 = jsonReader.selectName(d);
                            if (iSelectName2 != 0) {
                                pointF3 = pointFB2;
                                if (iSelectName2 == 1) {
                                    if (jsonReader.peek() == JsonReader.Token.NUMBER) {
                                        fNextDouble7 = (float) jsonReader.nextDouble();
                                        fNextDouble9 = fNextDouble7;
                                    } else {
                                        jsonReader.beginArray();
                                        fNextDouble7 = (float) jsonReader.nextDouble();
                                        fNextDouble9 = jsonReader.peek() == JsonReader.Token.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble7;
                                        jsonReader.endArray();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else {
                                pointF3 = pointFB2;
                                if (jsonReader.peek() == JsonReader.Token.NUMBER) {
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble8 = fNextDouble6;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble8 = jsonReader.peek() == JsonReader.Token.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.endArray();
                                }
                            }
                            pointFB = pointF11;
                            pointFB2 = pointF3;
                        }
                        pointF = pointFB;
                        pointF2 = pointFB2;
                        PointF pointF12 = new PointF(fNextDouble6, fNextDouble7);
                        PointF pointF13 = new PointF(fNextDouble8, fNextDouble9);
                        jsonReader.endObject();
                        pointF8 = pointF12;
                        pointF9 = pointF13;
                        pointFB = pointF;
                        pointFB2 = pointF2;
                    } else {
                        pointFB4 = hw.b(jsonReader, f);
                        t4 = t4;
                    }
                    break;
                case 5:
                    if (jsonReader.nextInt() != 1) {
                        t4 = t4;
                        z = false;
                    } else {
                        z = true;
                        t4 = t4;
                    }
                    break;
                case 6:
                    pointFB2 = hw.b(jsonReader, f);
                    t4 = t4;
                    break;
                case 7:
                    pointFB = hw.b(jsonReader, f);
                    t4 = t4;
                    break;
                default:
                    jsonReader.skipValue();
                    t4 = t4;
                    break;
            }
        }
        PointF pointF14 = pointFB;
        PointF pointF15 = pointFB2;
        T t5 = t4;
        PointF pointF16 = pointF8;
        jsonReader.endObject();
        if (z) {
            interpolatorA = f37294b;
            t2 = t3;
        } else {
            if (pointFB3 != null && pointFB4 != null) {
                interpolatorA = a(pointFB3, pointFB4);
            } else {
                if (pointF7 != null && pointF6 != null && pointF16 != null && pointF9 != null) {
                    interpolatorA2 = a(pointF7, pointF16);
                    interpolatorA3 = a(pointF6, pointF9);
                    t = t5;
                    interpolatorA = null;
                } else {
                    interpolatorA = f37294b;
                }
                if (interpolatorA2 == null && interpolatorA3 != null) {
                    jbVar = new jb<>(cxVar, t3, t, interpolatorA2, interpolatorA3, fNextDouble, null);
                } else {
                    jbVar = new jb<>(cxVar, t3, t, interpolatorA, fNextDouble, null);
                }
                jbVar.f38329c = pointF15;
                jbVar.e = pointF14;
                return jbVar;
            }
            t2 = t5;
        }
        t = t2;
        interpolatorA2 = null;
        interpolatorA3 = null;
        if (interpolatorA2 == null) {
            jbVar = new jb<>(cxVar, t3, t, interpolatorA, fNextDouble, null);
        } else {
            jbVar = new jb<>(cxVar, t3, t, interpolatorA, fNextDouble, null);
        }
        jbVar.f38329c = pointF15;
        jbVar.e = pointF14;
        return jbVar;
    }

    private static Interpolator a(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = jc.b(pointF.x, -1.0f, 1.0f);
        pointF.y = jc.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = jc.b(pointF2.x, -1.0f, 1.0f);
        pointF2.y = jc.b(pointF2.y, -100.0f, 100.0f);
        int iC = je.c(pointF.x, pointF.y, pointF2.x, pointF2.y);
        WeakReference<Interpolator> weakReferenceD = cv.c() ? null : d(iC);
        Interpolator interpolator = weakReferenceD != null ? weakReferenceD.get() : null;
        if (weakReferenceD != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e2) {
            if ("The Path cannot loop back on itself.".equals(e2.getMessage())) {
                linearInterpolator = PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!cv.c()) {
            try {
                d(iC, new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> jb<T> b(JsonReader jsonReader, float f, ValueParser<T> valueParser) throws IOException {
        return new jb<>(valueParser.parse(jsonReader, f));
    }
}
