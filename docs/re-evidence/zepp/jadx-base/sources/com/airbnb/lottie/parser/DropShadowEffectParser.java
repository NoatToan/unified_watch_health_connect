package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DropShadowEffectParser {
    private static final JsonReader.Options f = JsonReader.Options.of("ef");
    private static final JsonReader.Options g = JsonReader.Options.of("nm", "v");
    private AnimatableColorValue a;
    private AnimatableFloatValue b;
    private AnimatableFloatValue c;
    private AnimatableFloatValue d;
    private AnimatableFloatValue e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    private void a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(g);
            if (iSelectName != 0) {
                if (iSelectName == 1) {
                    strNextString.hashCode();
                    switch (strNextString) {
                        case "Distance":
                            this.d = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                            break;
                        case "Opacity":
                            this.b = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                            break;
                        case "Direction":
                            this.c = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                            break;
                        case "Shadow Color":
                            this.a = AnimatableValueParser.c(jsonReader, lottieComposition);
                            break;
                        case "Softness":
                            this.e = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } else {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                }
            } else {
                strNextString = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
    }

    @Nullable
    public DropShadowEffect b(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        AnimatableFloatValue animatableFloatValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableFloatValue animatableFloatValue3;
        AnimatableFloatValue animatableFloatValue4;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(f) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    a(jsonReader, lottieComposition);
                }
                jsonReader.endArray();
            }
        }
        AnimatableColorValue animatableColorValue = this.a;
        if (animatableColorValue == null || (animatableFloatValue = this.b) == null || (animatableFloatValue2 = this.c) == null || (animatableFloatValue3 = this.d) == null || (animatableFloatValue4 = this.e) == null) {
            return null;
        }
        return new DropShadowEffect(animatableColorValue, animatableFloatValue, animatableFloatValue2, animatableFloatValue3, animatableFloatValue4);
    }
}
