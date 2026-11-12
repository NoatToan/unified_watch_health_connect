package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.ScaleXY;

/* JADX INFO: loaded from: classes7.dex */
public class ScaleXYParser implements ValueParser<ScaleXY> {
    public static final ScaleXYParser INSTANCE = new ScaleXYParser();

    private ScaleXYParser() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.parser.ValueParser
    public ScaleXY parse(JsonReader jsonReader, float f14) {
        boolean z14 = jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY;
        if (z14) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z14) {
            jsonReader.endArray();
        }
        return new ScaleXY((fNextDouble / 100.0f) * f14, (fNextDouble2 / 100.0f) * f14);
    }
}
