package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableSplitDimensionPathValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.ScaleXY;
import com.amap.api.mapcore.util.hl;
import com.huami.watch.companion.mediac.Command;
import java.io.IOException;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatableTransformParser {
    private static final JsonReader.Options a = JsonReader.Options.of("a", com.google.android.exoplayer2.text.ttml.b.r, SOAP.XMLNS, "rz", "r", "o", Command.SCREEN_ON, "eo", "sk", "sa");
    private static final JsonReader.Options b = JsonReader.Options.of(hl.k);

    private AnimatableTransformParser() {
    }

    private static boolean a(AnimatablePathValue animatablePathValue) {
        return animatablePathValue == null || (animatablePathValue.isStatic() && animatablePathValue.getKeyframes().get(0).startValue.equals(0.0f, 0.0f));
    }

    private static boolean b(AnimatableValue<PointF, PointF> animatableValue) {
        return animatableValue == null || (!(animatableValue instanceof AnimatableSplitDimensionPathValue) && animatableValue.isStatic() && animatableValue.getKeyframes().get(0).startValue.equals(0.0f, 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean c(AnimatableFloatValue animatableFloatValue) {
        return animatableFloatValue == null || (animatableFloatValue.isStatic() && ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean d(AnimatableScaleValue animatableScaleValue) {
        return animatableScaleValue == null || (animatableScaleValue.isStatic() && ((ScaleXY) ((Keyframe) animatableScaleValue.getKeyframes().get(0)).startValue).equals(1.0f, 1.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean e(AnimatableFloatValue animatableFloatValue) {
        return animatableFloatValue == null || (animatableFloatValue.isStatic() && ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean f(AnimatableFloatValue animatableFloatValue) {
        return animatableFloatValue == null || (animatableFloatValue.isStatic() && ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() == 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    public static AnimatableTransform parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        AnimatableFloatValue animatableFloatValue;
        boolean z = false;
        boolean z2 = jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT;
        if (z2) {
            jsonReader.beginObject();
        }
        AnimatableFloatValue animatableFloatValue2 = null;
        AnimatablePathValue animatablePathValue = null;
        AnimatableValue<PointF, PointF> animatableValueA = null;
        AnimatableScaleValue animatableScaleValueH = null;
        AnimatableFloatValue animatableFloatValue3 = null;
        AnimatableFloatValue animatableFloatValue4 = null;
        AnimatableIntegerValue animatableIntegerValueF = null;
        AnimatableFloatValue animatableFloatValue5 = null;
        AnimatableFloatValue animatableFloatValue6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(a)) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.selectName(b) != 0) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            animatablePathValue = AnimatablePathValueParser.parse(jsonReader, lottieComposition);
                        }
                    }
                    jsonReader.endObject();
                    z = false;
                    break;
                case 1:
                    animatableValueA = AnimatablePathValueParser.a(jsonReader, lottieComposition);
                    z = false;
                    break;
                case 2:
                    animatableScaleValueH = AnimatableValueParser.h(jsonReader, lottieComposition);
                    z = false;
                    break;
                case 3:
                    lottieComposition.addWarning("Lottie doesn't support 3D layers.");
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z);
                    if (animatableFloatValue.getKeyframes().isEmpty()) {
                        if (((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue == 0) {
                            animatableFloatValue.getKeyframes().set(0, new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.getEndFrame())));
                        }
                        animatableFloatValue2 = animatableFloatValue;
                        z = false;
                    } else {
                        animatableFloatValue.getKeyframes().add(new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.getEndFrame())));
                    }
                    animatableFloatValue2 = animatableFloatValue;
                    z = false;
                    break;
                case 4:
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z);
                    if (animatableFloatValue.getKeyframes().isEmpty()) {
                        if (((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue == 0) {
                            animatableFloatValue.getKeyframes().set(0, new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.getEndFrame())));
                        }
                        animatableFloatValue2 = animatableFloatValue;
                        z = false;
                    } else {
                        animatableFloatValue.getKeyframes().add(new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.getEndFrame())));
                    }
                    animatableFloatValue2 = animatableFloatValue;
                    z = false;
                    break;
                case 5:
                    animatableIntegerValueF = AnimatableValueParser.f(jsonReader, lottieComposition);
                    break;
                case 6:
                    animatableFloatValue5 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z);
                    break;
                case 7:
                    animatableFloatValue6 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z);
                    break;
                case 8:
                    animatableFloatValue3 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z);
                    break;
                case 9:
                    animatableFloatValue4 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z);
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    z = false;
                    break;
            }
        }
        if (z2) {
            jsonReader.endObject();
        }
        AnimatablePathValue animatablePathValue2 = a(animatablePathValue) ? null : animatablePathValue;
        AnimatableValue<PointF, PointF> animatableValue = b(animatableValueA) ? null : animatableValueA;
        AnimatableFloatValue animatableFloatValue7 = c(animatableFloatValue2) ? null : animatableFloatValue2;
        if (d(animatableScaleValueH)) {
            animatableScaleValueH = null;
        }
        return new AnimatableTransform(animatablePathValue2, animatableValue, animatableScaleValueH, animatableFloatValue7, animatableIntegerValueF, animatableFloatValue5, animatableFloatValue6, f(animatableFloatValue3) ? null : animatableFloatValue3, e(animatableFloatValue4) ? null : animatableFloatValue4);
    }
}
