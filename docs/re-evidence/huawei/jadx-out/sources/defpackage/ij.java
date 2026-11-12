package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class ij {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.d f37688b = JsonReader.d.e("nm", "r", "hd");

    static gp b(JsonReader jsonReader, cx cxVar) throws IOException {
        boolean zNextBoolean = false;
        String strNextString = null;
        fu fuVarE = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f37688b);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                fuVarE = hl.e(jsonReader, cxVar, true);
            } else if (iSelectName == 2) {
                zNextBoolean = jsonReader.nextBoolean();
            } else {
                jsonReader.skipValue();
            }
        }
        if (zNextBoolean) {
            return null;
        }
        return new gp(strNextString, fuVarE);
    }
}
