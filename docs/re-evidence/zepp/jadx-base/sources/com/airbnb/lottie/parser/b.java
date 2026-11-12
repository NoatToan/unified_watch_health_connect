package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.CircleShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.IOException;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes2.dex */
class b {
    private static JsonReader.Options a = JsonReader.Options.of("nm", com.google.android.exoplayer2.text.ttml.b.r, SOAP.XMLNS, "hd", GoogleApiAvailabilityLight.a);

    private b() {
    }

    public static CircleShape a(JsonReader jsonReader, LottieComposition lottieComposition, int i) throws IOException {
        boolean z = i == 3;
        String strNextString = null;
        AnimatableValue<PointF, PointF> animatableValueA = null;
        AnimatablePointValue animatablePointValueG = null;
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
                zNextBoolean = jsonReader.nextBoolean();
            } else if (iSelectName != 4) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextInt() == 3;
            }
        }
        return new CircleShape(strNextString, animatableValueA, animatablePointValueG, z, zNextBoolean);
    }
}
