package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
class il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static JsonReader.d f37760a = JsonReader.d.e("nm", "ind", "ks", "hd");

    static gt a(JsonReader jsonReader, cx cxVar) throws IOException {
        String strNextString = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        fy fyVarJ = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f37760a);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                iNextInt = jsonReader.nextInt();
            } else if (iSelectName == 2) {
                fyVarJ = hl.j(jsonReader, cxVar);
            } else if (iSelectName == 3) {
                zNextBoolean = jsonReader.nextBoolean();
            } else {
                jsonReader.skipValue();
            }
        }
        return new gt(strNextString, iNextInt, fyVarJ, zNextBoolean);
    }
}
