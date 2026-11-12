package defpackage;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
class ir {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.d f37981b = JsonReader.d.e("s", FitRunPlayAudio.OPPORTUNITY_E, "o", "nm", FitRunPlayAudio.OPPORTUNITY_M, "hd");

    static ShapeTrimPath c(JsonReader jsonReader, cx cxVar) throws IOException {
        String strNextString = null;
        ShapeTrimPath.Type typeForId = null;
        fu fuVarE = null;
        fu fuVarE2 = null;
        fu fuVarE3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f37981b);
            if (iSelectName == 0) {
                fuVarE = hl.e(jsonReader, cxVar, false);
            } else if (iSelectName == 1) {
                fuVarE2 = hl.e(jsonReader, cxVar, false);
            } else if (iSelectName == 2) {
                fuVarE3 = hl.e(jsonReader, cxVar, false);
            } else if (iSelectName == 3) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 4) {
                typeForId = ShapeTrimPath.Type.forId(jsonReader.nextInt());
            } else if (iSelectName == 5) {
                zNextBoolean = jsonReader.nextBoolean();
            } else {
                jsonReader.skipValue();
            }
        }
        return new ShapeTrimPath(strNextString, typeForId, fuVarE, fuVarE2, fuVarE3, zNextBoolean);
    }
}
