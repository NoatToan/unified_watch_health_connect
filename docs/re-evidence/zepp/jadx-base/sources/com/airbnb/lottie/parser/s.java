package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.content.ShapePath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class s {
    public static JsonReader.Options a = JsonReader.Options.of("nm", "ind", "ks", "hd");

    private s() {
    }

    public static ShapePath a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        int iNextInt = 0;
        String strNextString = null;
        AnimatableShapeValue animatableShapeValueI = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(a);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                iNextInt = jsonReader.nextInt();
            } else if (iSelectName == 2) {
                animatableShapeValueI = AnimatableValueParser.i(jsonReader, lottieComposition);
            } else if (iSelectName != 3) {
                jsonReader.skipValue();
            } else {
                zNextBoolean = jsonReader.nextBoolean();
            }
        }
        return new ShapePath(strNextString, iNextInt, animatableShapeValueI, zNextBoolean);
    }
}
