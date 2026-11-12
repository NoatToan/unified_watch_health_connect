package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.RectangleShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes2.dex */
class o {
    private static JsonReader.Options a = JsonReader.Options.of("nm", com.google.android.exoplayer2.text.ttml.b.r, SOAP.XMLNS, "r", "hd");

    private o() {
    }

    public static RectangleShape a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        String strNextString = null;
        AnimatableValue<PointF, PointF> animatableValueA = null;
        AnimatablePointValue animatablePointValueG = null;
        AnimatableFloatValue animatableFloatValue = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(a);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                animatableValueA = AnimatablePathValueParser.a(jsonReader, lottieComposition);
            } else if (iSelectName == 2) {
                animatablePointValueG = AnimatableValueParser.g(jsonReader, lottieComposition);
            } else if (iSelectName == 3) {
                animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
            } else if (iSelectName != 4) {
                jsonReader.skipValue();
            } else {
                zNextBoolean = jsonReader.nextBoolean();
            }
        }
        return new RectangleShape(strNextString, animatableValueA, animatablePointValueG, animatableFloatValue, zNextBoolean);
    }
}
