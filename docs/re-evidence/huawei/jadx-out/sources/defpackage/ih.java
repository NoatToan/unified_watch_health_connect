package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
class ih {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.d f37617b = JsonReader.d.e("nm", "c", "o", "tr", "hd");

    static gr e(JsonReader jsonReader, cx cxVar) throws IOException {
        String strNextString = null;
        fu fuVarE = null;
        fu fuVarE2 = null;
        gf gfVarE = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f37617b);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                fuVarE = hl.e(jsonReader, cxVar, false);
            } else if (iSelectName == 2) {
                fuVarE2 = hl.e(jsonReader, cxVar, false);
            } else if (iSelectName == 3) {
                gfVarE = he.e(jsonReader, cxVar);
            } else if (iSelectName == 4) {
                zNextBoolean = jsonReader.nextBoolean();
            } else {
                jsonReader.skipValue();
            }
        }
        return new gr(strNextString, fuVarE, fuVarE2, gfVarE, zNextBoolean);
    }
}
