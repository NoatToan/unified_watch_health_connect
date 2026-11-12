package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class hc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.d f36383b = JsonReader.d.e("a");
    private static final JsonReader.d e = JsonReader.d.e("fc", "sc", "sw", FitRunPlayAudio.PLAY_TYPE_T);

    public static gg b(JsonReader jsonReader, cx cxVar) throws IOException {
        jsonReader.beginObject();
        gg ggVarD = null;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(f36383b) == 0) {
                ggVarD = d(jsonReader, cxVar);
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return ggVarD == null ? new gg(null, null, null, null) : ggVarD;
    }

    private static gg d(JsonReader jsonReader, cx cxVar) throws IOException {
        jsonReader.beginObject();
        fx fxVarE = null;
        fx fxVarE2 = null;
        fu fuVarB = null;
        fu fuVarB2 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(e);
            if (iSelectName == 0) {
                fxVarE = hl.e(jsonReader, cxVar);
            } else if (iSelectName == 1) {
                fxVarE2 = hl.e(jsonReader, cxVar);
            } else if (iSelectName == 2) {
                fuVarB = hl.b(jsonReader, cxVar);
            } else if (iSelectName == 3) {
                fuVarB2 = hl.b(jsonReader, cxVar);
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new gg(fxVarE, fxVarE2, fuVarB, fuVarB2);
    }
}
