package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatableTextPropertiesParser {
    private static JsonReader.Options a = JsonReader.Options.of("a");
    private static JsonReader.Options b = JsonReader.Options.of("fc", "sc", "sw", "t");

    private AnimatableTextPropertiesParser() {
    }

    private static AnimatableTextProperties a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        jsonReader.beginObject();
        AnimatableColorValue animatableColorValueC = null;
        AnimatableColorValue animatableColorValueC2 = null;
        AnimatableFloatValue animatableFloatValue = null;
        AnimatableFloatValue animatableFloatValue2 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(b);
            if (iSelectName == 0) {
                animatableColorValueC = AnimatableValueParser.c(jsonReader, lottieComposition);
            } else if (iSelectName == 1) {
                animatableColorValueC2 = AnimatableValueParser.c(jsonReader, lottieComposition);
            } else if (iSelectName == 2) {
                animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
            } else if (iSelectName != 3) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                animatableFloatValue2 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
            }
        }
        jsonReader.endObject();
        return new AnimatableTextProperties(animatableColorValueC, animatableColorValueC2, animatableFloatValue, animatableFloatValue2);
    }

    public static AnimatableTextProperties parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        jsonReader.beginObject();
        AnimatableTextProperties animatableTextPropertiesA = null;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(a) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                animatableTextPropertiesA = a(jsonReader, lottieComposition);
            }
        }
        jsonReader.endObject();
        return animatableTextPropertiesA == null ? new AnimatableTextProperties(null, null, null, null) : animatableTextPropertiesA;
    }
}
