package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.nimbusds.jose.jwk.JWKParameterNames;

/* JADX INFO: loaded from: classes7.dex */
public class RoundedCornersParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.of("nm", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "hd");

    private RoundedCornersParser() {
    }

    public static RoundedCorners parse(JsonReader jsonReader, LottieComposition lottieComposition) {
        boolean zNextBoolean = false;
        String strNextString = null;
        AnimatableFloatValue animatableFloatValue = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(NAMES);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, true);
            } else if (iSelectName != 2) {
                jsonReader.skipValue();
            } else {
                zNextBoolean = jsonReader.nextBoolean();
            }
        }
        if (zNextBoolean) {
            return null;
        }
        return new RoundedCorners(strNextString, animatableFloatValue);
    }
}
