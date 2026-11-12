package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.huami.passport.Keeper;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes2.dex */
class i {
    private static final float a = 100.0f;
    private static SparseArrayCompat<WeakReference<Interpolator>> c;
    private static final Interpolator b = new LinearInterpolator();
    public static JsonReader.Options d = JsonReader.Options.of("t", SOAP.XMLNS, "e", "o", "i", "h", "to", Keeper.LOGIN_TOKEN);
    public static JsonReader.Options e = JsonReader.Options.of("x", "y");

    @Nullable
    private static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (i.class) {
            weakReference = g().get(i);
        }
        return weakReference;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorCreate;
        pointF.x = MiscUtils.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.clamp(pointF.y, -100.0f, 100.0f);
        pointF2.x = MiscUtils.clamp(pointF2.x, -1.0f, 1.0f);
        float fClamp = MiscUtils.clamp(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fClamp;
        int iHashFor = Utils.hashFor(pointF.x, pointF.y, pointF2.x, fClamp);
        WeakReference<Interpolator> weakReferenceA = a(iHashFor);
        Interpolator interpolator = weakReferenceA != null ? weakReferenceA.get() : null;
        if (weakReferenceA == null || interpolator == null) {
            try {
                interpolatorCreate = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e2) {
                interpolatorCreate = "The Path cannot loop back on itself.".equals(e2.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = interpolatorCreate;
            try {
                h(iHashFor, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    public static <T> Keyframe<T> c(JsonReader jsonReader, LottieComposition lottieComposition, float f, v<T> vVar, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return e(lottieComposition, jsonReader, f, vVar);
        }
        return z ? d(lottieComposition, jsonReader, f, vVar) : f(jsonReader, f, vVar);
    }

    private static <T> Keyframe<T> d(LottieComposition lottieComposition, JsonReader jsonReader, float f, v<T> vVar) throws IOException {
        Interpolator interpolatorB;
        T t;
        jsonReader.beginObject();
        PointF pointFE = null;
        PointF pointFE2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointFE3 = null;
        PointF pointFE4 = null;
        boolean z = false;
        float fNextDouble = 0.0f;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(d)) {
                case 0:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t3 = vVar.parse(jsonReader, f);
                    break;
                case 2:
                    t2 = vVar.parse(jsonReader, f);
                    break;
                case 3:
                    pointFE = h.e(jsonReader, 1.0f);
                    break;
                case 4:
                    pointFE2 = h.e(jsonReader, 1.0f);
                    break;
                case 5:
                    z = jsonReader.nextInt() == 1;
                    break;
                case 6:
                    pointFE3 = h.e(jsonReader, f);
                    break;
                case 7:
                    pointFE4 = h.e(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            interpolatorB = b;
            t = t3;
        } else {
            interpolatorB = (pointFE == null || pointFE2 == null) ? b : b(pointFE, pointFE2);
            t = t2;
        }
        Keyframe<T> keyframe = new Keyframe<>(lottieComposition, t3, t, interpolatorB, fNextDouble, null);
        keyframe.pathCp1 = pointFE3;
        keyframe.pathCp2 = pointFE4;
        return keyframe;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01ed  */
    private static <T> Keyframe<T> e(LottieComposition lottieComposition, JsonReader jsonReader, float f, v<T> vVar) throws IOException {
        Interpolator interpolatorB;
        Interpolator interpolatorB2;
        Interpolator interpolatorB3;
        T t;
        Keyframe<T> keyframe;
        PointF pointF;
        float f2;
        PointF pointF2;
        jsonReader.beginObject();
        PointF pointFE = null;
        boolean z = false;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        PointF pointF3 = null;
        T t2 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        float fNextDouble = 0.0f;
        PointF pointFE4 = null;
        T t3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(d)) {
                case 0:
                    pointF = pointFE;
                    fNextDouble = (float) jsonReader.nextDouble();
                    pointFE = pointF;
                    break;
                case 1:
                    pointF = pointFE;
                    t2 = vVar.parse(jsonReader, f);
                    pointFE = pointF;
                    break;
                case 2:
                    pointF = pointFE;
                    t3 = vVar.parse(jsonReader, f);
                    pointFE = pointF;
                    break;
                case 3:
                    pointF = pointFE;
                    f2 = fNextDouble;
                    PointF pointF7 = pointFE4;
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int iSelectName = jsonReader.selectName(e);
                            if (iSelectName == 0) {
                                JsonReader.Token tokenPeek = jsonReader.peek();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenPeek == token) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == token ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                }
                            } else if (iSelectName != 1) {
                                jsonReader.skipValue();
                            } else {
                                JsonReader.Token tokenPeek2 = jsonReader.peek();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenPeek2 == token2) {
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == token2 ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
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
                        pointFE2 = h.e(jsonReader, f);
                        fNextDouble = f2;
                        pointFE4 = pointF7;
                    }
                    pointFE = pointF;
                    break;
                case 4:
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = 0.0f;
                        float f3 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        while (jsonReader.hasNext()) {
                            pointFE4 = pointFE4;
                            int iSelectName2 = jsonReader.selectName(e);
                            if (iSelectName2 != 0) {
                                pointF2 = pointFE;
                                if (iSelectName2 != 1) {
                                    jsonReader.skipValue();
                                } else {
                                    JsonReader.Token tokenPeek3 = jsonReader.peek();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenPeek3 == token3) {
                                        fNextDouble8 = (float) jsonReader.nextDouble();
                                        fNextDouble = fNextDouble;
                                        f3 = fNextDouble8;
                                    } else {
                                        float f4 = fNextDouble;
                                        jsonReader.beginArray();
                                        float fNextDouble9 = (float) jsonReader.nextDouble();
                                        float fNextDouble10 = jsonReader.peek() == token3 ? (float) jsonReader.nextDouble() : fNextDouble9;
                                        jsonReader.endArray();
                                        fNextDouble = f4;
                                        pointFE = pointF2;
                                        fNextDouble8 = fNextDouble10;
                                        f3 = fNextDouble9;
                                    }
                                }
                            } else {
                                pointF2 = pointFE;
                                float f5 = fNextDouble;
                                JsonReader.Token tokenPeek4 = jsonReader.peek();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenPeek4 == token4) {
                                    fNextDouble7 = (float) jsonReader.nextDouble();
                                    fNextDouble = f5;
                                    fNextDouble6 = fNextDouble7;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble7 = jsonReader.peek() == token4 ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.endArray();
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
                        pointFE3 = h.e(jsonReader, f);
                    }
                    pointFE = pointF;
                    break;
                case 5:
                    z = jsonReader.nextInt() == 1;
                    break;
                case 6:
                    pointFE4 = h.e(jsonReader, f);
                    break;
                case 7:
                    pointFE = h.e(jsonReader, f);
                    break;
                default:
                    pointF = pointFE;
                    jsonReader.skipValue();
                    pointFE = pointF;
                    break;
            }
        }
        PointF pointF12 = pointFE;
        float f6 = fNextDouble;
        PointF pointF13 = pointFE4;
        jsonReader.endObject();
        if (z) {
            interpolatorB = b;
            t = t2;
        } else {
            if (pointFE2 == null || pointFE3 == null) {
                if (pointF3 == null || pointF4 == null || pointF5 == null || pointF6 == null) {
                    interpolatorB = b;
                } else {
                    interpolatorB2 = b(pointF3, pointF5);
                    interpolatorB3 = b(pointF4, pointF6);
                    t = t3;
                    interpolatorB = null;
                }
                if (interpolatorB2 != null || interpolatorB3 == null) {
                    keyframe = new Keyframe<>(lottieComposition, t2, t, interpolatorB, f6, null);
                } else {
                    keyframe = new Keyframe<>(lottieComposition, t2, t, interpolatorB2, interpolatorB3, f6, null);
                }
                keyframe.pathCp1 = pointF13;
                keyframe.pathCp2 = pointF12;
                return keyframe;
            }
            interpolatorB = b(pointFE2, pointFE3);
            t = t3;
        }
        interpolatorB2 = null;
        interpolatorB3 = null;
        if (interpolatorB2 != null) {
            keyframe = new Keyframe<>(lottieComposition, t2, t, interpolatorB, f6, null);
        } else {
            keyframe = new Keyframe<>(lottieComposition, t2, t, interpolatorB, f6, null);
        }
        keyframe.pathCp1 = pointF13;
        keyframe.pathCp2 = pointF12;
        return keyframe;
    }

    private static <T> Keyframe<T> f(JsonReader jsonReader, float f, v<T> vVar) throws IOException {
        return new Keyframe<>(vVar.parse(jsonReader, f));
    }

    private static SparseArrayCompat<WeakReference<Interpolator>> g() {
        if (c == null) {
            c = new SparseArrayCompat<>();
        }
        return c;
    }

    private static void h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (i.class) {
            c.put(i, weakReference);
        }
    }
}
