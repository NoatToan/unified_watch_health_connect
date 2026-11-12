package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.content.ShapeFill;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
class q {
    private static final JsonReader.Options a = JsonReader.Options.of("nm", "c", "o", "fillEnabled", "r", "hd");

    private q() {
    }

    public static ShapeFill a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        AnimatableIntegerValue animatableIntegerValueF = null;
        String strNextString = null;
        AnimatableColorValue animatableColorValueC = null;
        int iNextInt = 1;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(a);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                animatableColorValueC = AnimatableValueParser.c(jsonReader, lottieComposition);
            } else if (iSelectName == 2) {
                animatableIntegerValueF = AnimatableValueParser.f(jsonReader, lottieComposition);
            } else if (iSelectName == 3) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (iSelectName == 4) {
                iNextInt = jsonReader.nextInt();
            } else if (iSelectName != 5) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                zNextBoolean2 = jsonReader.nextBoolean();
            }
        }
        return new ShapeFill(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, animatableColorValueC, animatableIntegerValueF == null ? new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100))) : animatableIntegerValueF, zNextBoolean2);
    }
}
