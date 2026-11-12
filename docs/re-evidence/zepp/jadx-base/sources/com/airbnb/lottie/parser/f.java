package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.content.GradientFill;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.amap.api.mapcore.util.hl;
import java.io.IOException;
import java.util.Collections;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes2.dex */
class f {
    private static final JsonReader.Options a = JsonReader.Options.of("nm", "g", "o", "t", SOAP.XMLNS, "e", "r", "hd");
    private static final JsonReader.Options b = JsonReader.Options.of(com.google.android.exoplayer2.text.ttml.b.r, hl.k);

    private f() {
    }

    public static GradientFill a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        AnimatableIntegerValue animatableIntegerValueF = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        GradientType gradientType = null;
        AnimatableGradientColorValue animatableGradientColorValueE = null;
        AnimatablePointValue animatablePointValueG = null;
        AnimatablePointValue animatablePointValueG2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(a)) {
                case 0:
                    strNextString = jsonReader.nextString();
                    break;
                case 1:
                    int iNextInt = -1;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        int iSelectName = jsonReader.selectName(b);
                        if (iSelectName == 0) {
                            iNextInt = jsonReader.nextInt();
                        } else if (iSelectName != 1) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            animatableGradientColorValueE = AnimatableValueParser.e(jsonReader, lottieComposition, iNextInt);
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    animatableIntegerValueF = AnimatableValueParser.f(jsonReader, lottieComposition);
                    break;
                case 3:
                    gradientType = jsonReader.nextInt() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    animatablePointValueG = AnimatableValueParser.g(jsonReader, lottieComposition);
                    break;
                case 5:
                    animatablePointValueG2 = AnimatableValueParser.g(jsonReader, lottieComposition);
                    break;
                case 6:
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        return new GradientFill(strNextString, gradientType, fillType, animatableGradientColorValueE, animatableIntegerValueF == null ? new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100))) : animatableIntegerValueF, animatablePointValueG, animatablePointValueG2, null, null, zNextBoolean);
    }
}
