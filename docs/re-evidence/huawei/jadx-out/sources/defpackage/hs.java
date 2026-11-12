package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
class hs {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JsonReader.d f37100c = JsonReader.d.e("fFamily", "fName", "fStyle", "ascent");

    static fs c(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        float fNextDouble = 0.0f;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f37100c);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                strNextString3 = jsonReader.nextString();
            } else if (iSelectName == 2) {
                strNextString2 = jsonReader.nextString();
            } else if (iSelectName == 3) {
                fNextDouble = (float) jsonReader.nextDouble();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new fs(strNextString, strNextString3, strNextString2, fNextDouble);
    }
}
