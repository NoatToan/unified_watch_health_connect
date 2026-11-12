package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class e {
    private static final JsonReader.Options a = JsonReader.Options.of("fFamily", "fName", "fStyle", "ascent");

    private e() {
    }

    public static Font a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        float fNextDouble = 0.0f;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(a);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                strNextString2 = jsonReader.nextString();
            } else if (iSelectName == 2) {
                strNextString3 = jsonReader.nextString();
            } else if (iSelectName != 3) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                fNextDouble = (float) jsonReader.nextDouble();
            }
        }
        jsonReader.endObject();
        return new Font(strNextString, strNextString2, strNextString3, fNextDouble);
    }
}
