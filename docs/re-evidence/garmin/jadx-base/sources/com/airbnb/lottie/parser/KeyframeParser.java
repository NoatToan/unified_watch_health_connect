package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.lang.ref.WeakReference;
import p1.l1;

/* JADX INFO: loaded from: classes7.dex */
class KeyframeParser {
    private static final float MAX_CP_VALUE = 100.0f;
    private static l1<WeakReference<Interpolator>> pathInterpolatorCache;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    static JsonReader.Options NAMES = JsonReader.Options.of(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "s", JWKParameterNames.RSA_EXPONENT, "o", IntegerTokenConverter.CONVERTER_KEY, "h", "to", "ti");
    static JsonReader.Options INTERPOLATOR_NAMES = JsonReader.Options.of("x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE);

    private static WeakReference<Interpolator> getInterpolator(int i14) {
        WeakReference<Interpolator> weakReferenceC;
        synchronized (KeyframeParser.class) {
            weakReferenceC = pathInterpolatorCache().c(i14);
        }
        return weakReferenceC;
    }

    private static Interpolator interpolatorFor(PointF pointF, PointF pointF2) {
        Interpolator pathInterpolator;
        pointF.x = MiscUtils.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.clamp(pointF.y, -100.0f, MAX_CP_VALUE);
        pointF2.x = MiscUtils.clamp(pointF2.x, -1.0f, 1.0f);
        float fClamp = MiscUtils.clamp(pointF2.y, -100.0f, MAX_CP_VALUE);
        pointF2.y = fClamp;
        int iHashFor = Utils.hashFor(pointF.x, pointF.y, pointF2.x, fClamp);
        WeakReference<Interpolator> interpolator = L.getDisablePathInterpolatorCache() ? null : getInterpolator(iHashFor);
        Interpolator interpolator2 = interpolator != null ? interpolator.get() : null;
        if (interpolator != null && interpolator2 != null) {
            return interpolator2;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e4) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e4.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!L.getDisablePathInterpolatorCache()) {
            try {
                putInterpolator(iHashFor, new WeakReference(pathInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return pathInterpolator;
    }

    public static <T> Keyframe<T> parse(JsonReader jsonReader, LottieComposition lottieComposition, float f14, ValueParser<T> valueParser, boolean z14, boolean z15) {
        if (z14 && z15) {
            return parseMultiDimensionalKeyframe(lottieComposition, jsonReader, f14, valueParser);
        }
        return z14 ? parseKeyframe(lottieComposition, jsonReader, f14, valueParser) : parseStaticValue(jsonReader, f14, valueParser);
    }

    private static <T> Keyframe<T> parseKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f14, ValueParser<T> valueParser) {
        Interpolator interpolatorInterpolatorFor;
        T t7;
        jsonReader.beginObject();
        PointF pointFJsonToPoint = null;
        T t14 = null;
        T t15 = null;
        PointF pointFJsonToPoint2 = null;
        PointF pointFJsonToPoint3 = null;
        float fNextDouble = 0.0f;
        boolean z14 = false;
        PointF pointFJsonToPoint4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t15 = valueParser.parse(jsonReader, f14);
                    break;
                case 2:
                    t14 = valueParser.parse(jsonReader, f14);
                    break;
                case 3:
                    pointFJsonToPoint = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 4:
                    pointFJsonToPoint4 = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 5:
                    z14 = jsonReader.nextInt() == 1;
                    break;
                case 6:
                    pointFJsonToPoint2 = JsonUtils.jsonToPoint(jsonReader, f14);
                    break;
                case 7:
                    pointFJsonToPoint3 = JsonUtils.jsonToPoint(jsonReader, f14);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z14) {
            interpolatorInterpolatorFor = LINEAR_INTERPOLATOR;
            t7 = t15;
        } else {
            interpolatorInterpolatorFor = (pointFJsonToPoint == null || pointFJsonToPoint4 == null) ? LINEAR_INTERPOLATOR : interpolatorFor(pointFJsonToPoint, pointFJsonToPoint4);
            t7 = t14;
        }
        Keyframe<T> keyframe = new Keyframe<>(lottieComposition, t15, t7, interpolatorInterpolatorFor, fNextDouble, null);
        keyframe.pathCp1 = pointFJsonToPoint2;
        keyframe.pathCp2 = pointFJsonToPoint3;
        return keyframe;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    private static <T> Keyframe<T> parseMultiDimensionalKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f14, ValueParser<T> valueParser) {
        Interpolator interpolatorInterpolatorFor;
        Interpolator interpolatorInterpolatorFor2;
        Interpolator interpolatorInterpolatorFor3;
        T t7;
        Interpolator interpolator;
        PointF pointF;
        Keyframe<T> keyframe;
        PointF pointF2;
        boolean z14;
        float f15;
        jsonReader.beginObject();
        boolean z15 = false;
        PointF pointFJsonToPoint = null;
        PointF pointFJsonToPoint2 = null;
        PointF pointF3 = null;
        T t14 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointFJsonToPoint3 = null;
        PointF pointFJsonToPoint4 = null;
        float fNextDouble = 0.0f;
        T t15 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t14 = valueParser.parse(jsonReader, f14);
                    break;
                case 2:
                    t15 = valueParser.parse(jsonReader, f14);
                    break;
                case 3:
                    boolean z16 = z15;
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int iSelectName = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (iSelectName == 0) {
                                pointF2 = pointF5;
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
                                    pointF2 = pointF5;
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    pointF2 = pointF5;
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == token2 ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            }
                            pointF5 = pointF2;
                        }
                        pointF3 = new PointF(fNextDouble2, fNextDouble3);
                        pointF4 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                    } else {
                        pointFJsonToPoint = JsonUtils.jsonToPoint(jsonReader, f14);
                    }
                    z15 = z16;
                    break;
                case 4:
                    if (jsonReader.peek() != JsonReader.Token.BEGIN_OBJECT) {
                        pointFJsonToPoint2 = JsonUtils.jsonToPoint(jsonReader, f14);
                    } else {
                        jsonReader.beginObject();
                        float f16 = 0.0f;
                        float f17 = 0.0f;
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int iSelectName2 = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (iSelectName2 != 0) {
                                z14 = z15;
                                if (iSelectName2 != 1) {
                                    jsonReader.skipValue();
                                } else {
                                    JsonReader.Token tokenPeek3 = jsonReader.peek();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenPeek3 == token3) {
                                        fNextDouble7 = (float) jsonReader.nextDouble();
                                        f17 = fNextDouble7;
                                    } else {
                                        jsonReader.beginArray();
                                        PointF pointF7 = pointFJsonToPoint3;
                                        float fNextDouble8 = (float) jsonReader.nextDouble();
                                        fNextDouble7 = jsonReader.peek() == token3 ? (float) jsonReader.nextDouble() : fNextDouble8;
                                        jsonReader.endArray();
                                        pointFJsonToPoint3 = pointF7;
                                        f17 = fNextDouble8;
                                    }
                                }
                            } else {
                                z14 = z15;
                                PointF pointF8 = pointFJsonToPoint3;
                                JsonReader.Token tokenPeek4 = jsonReader.peek();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenPeek4 == token4) {
                                    pointFJsonToPoint3 = pointF8;
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    f16 = fNextDouble6;
                                } else {
                                    pointFJsonToPoint3 = pointF8;
                                    jsonReader.beginArray();
                                    float fNextDouble9 = (float) jsonReader.nextDouble();
                                    if (jsonReader.peek() == token4) {
                                        f15 = fNextDouble9;
                                        fNextDouble6 = (float) jsonReader.nextDouble();
                                    } else {
                                        f15 = fNextDouble9;
                                        fNextDouble6 = f15;
                                    }
                                    jsonReader.endArray();
                                    f16 = f15;
                                }
                            }
                            z15 = z14;
                        }
                        PointF pointF9 = new PointF(f16, f17);
                        PointF pointF10 = new PointF(fNextDouble6, fNextDouble7);
                        jsonReader.endObject();
                        pointF6 = pointF10;
                        pointF5 = pointF9;
                    }
                    break;
                case 5:
                    z15 = jsonReader.nextInt() == 1;
                    break;
                case 6:
                    pointFJsonToPoint3 = JsonUtils.jsonToPoint(jsonReader, f14);
                    break;
                case 7:
                    pointFJsonToPoint4 = JsonUtils.jsonToPoint(jsonReader, f14);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        boolean z17 = z15;
        PointF pointF11 = pointF5;
        jsonReader.endObject();
        if (z17) {
            interpolator = LINEAR_INTERPOLATOR;
            t7 = t14;
        } else {
            if (pointFJsonToPoint == null || pointFJsonToPoint2 == null) {
                if (pointF3 == null || pointF4 == null || pointF11 == null || pointF6 == null) {
                    interpolatorInterpolatorFor = LINEAR_INTERPOLATOR;
                } else {
                    interpolatorInterpolatorFor2 = interpolatorFor(pointF3, pointF11);
                    interpolatorInterpolatorFor3 = interpolatorFor(pointF4, pointF6);
                    t7 = t15;
                    interpolator = null;
                }
                if (interpolatorInterpolatorFor2 != null || interpolatorInterpolatorFor3 == null) {
                    pointF = pointFJsonToPoint4;
                    keyframe = new Keyframe<>(lottieComposition, t14, t7, interpolator, fNextDouble, null);
                } else {
                    pointF = pointFJsonToPoint4;
                    keyframe = new Keyframe<>(lottieComposition, t14, t7, interpolatorInterpolatorFor2, interpolatorInterpolatorFor3, fNextDouble, null);
                }
                keyframe.pathCp1 = pointFJsonToPoint3;
                keyframe.pathCp2 = pointF;
                return keyframe;
            }
            interpolatorInterpolatorFor = interpolatorFor(pointFJsonToPoint, pointFJsonToPoint2);
            interpolator = interpolatorInterpolatorFor;
            t7 = t15;
        }
        interpolatorInterpolatorFor2 = null;
        interpolatorInterpolatorFor3 = null;
        if (interpolatorInterpolatorFor2 != null) {
            pointF = pointFJsonToPoint4;
            keyframe = new Keyframe<>(lottieComposition, t14, t7, interpolator, fNextDouble, null);
        } else {
            pointF = pointFJsonToPoint4;
            keyframe = new Keyframe<>(lottieComposition, t14, t7, interpolator, fNextDouble, null);
        }
        keyframe.pathCp1 = pointFJsonToPoint3;
        keyframe.pathCp2 = pointF;
        return keyframe;
    }

    private static <T> Keyframe<T> parseStaticValue(JsonReader jsonReader, float f14, ValueParser<T> valueParser) {
        return new Keyframe<>(valueParser.parse(jsonReader, f14));
    }

    private static l1<WeakReference<Interpolator>> pathInterpolatorCache() {
        if (pathInterpolatorCache == null) {
            pathInterpolatorCache = new l1<>();
        }
        return pathInterpolatorCache;
    }

    private static void putInterpolator(int i14, WeakReference<Interpolator> weakReference) {
        synchronized (KeyframeParser.class) {
            pathInterpolatorCache.e(i14, weakReference);
        }
    }
}
