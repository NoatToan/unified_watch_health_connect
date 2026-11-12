package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class a {
    private static final JsonReader.Options a = JsonReader.Options.of("ef");
    private static final JsonReader.Options b = JsonReader.Options.of(com.alipay.sdk.m.s.a.q, "v");

    @Nullable
    private static BlurEffect a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        jsonReader.beginObject();
        BlurEffect blurEffect = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (!jsonReader.hasNext()) {
                    jsonReader.endObject();
                    return blurEffect;
                }
                int iSelectName = jsonReader.selectName(b);
                if (iSelectName != 0) {
                    if (iSelectName != 1) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else if (z) {
                        blurEffect = new BlurEffect(AnimatableValueParser.parseFloat(jsonReader, lottieComposition));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (jsonReader.nextInt() == 0) {
                    z = true;
                }
            }
        }
    }

    @Nullable
    public static BlurEffect b(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        BlurEffect blurEffect = null;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(a) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    BlurEffect blurEffectA = a(jsonReader, lottieComposition);
                    if (blurEffectA != null) {
                        blurEffect = blurEffectA;
                    }
                }
                jsonReader.endArray();
            }
        }
        return blurEffect;
    }
}
