package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class b0a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f3644a = JsonReader.a.a("fFamily", "fName", "fStyle", "ascent");

    public static sz9 a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        float fNextDouble = 0.0f;
        String strNextString3 = null;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f3644a);
            if (iP == 0) {
                strNextString = jsonReader.nextString();
            } else if (iP == 1) {
                strNextString3 = jsonReader.nextString();
            } else if (iP == 2) {
                strNextString2 = jsonReader.nextString();
            } else if (iP != 3) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                fNextDouble = (float) jsonReader.nextDouble();
            }
        }
        jsonReader.endObject();
        return new sz9(strNextString, strNextString3, strNextString2, fNextDouble);
    }
}
