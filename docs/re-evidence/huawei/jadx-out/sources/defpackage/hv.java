package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.amap.api.col.p0003sl.jt;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
class hv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.d f37191b = JsonReader.d.e("nm", jt.f, "o", FitRunPlayAudio.PLAY_TYPE_T, "s", FitRunPlayAudio.OPPORTUNITY_E, "r", "hd");
    private static final JsonReader.d e = JsonReader.d.e("p", "k");

    static gk a(JsonReader jsonReader, cx cxVar) throws IOException {
        gb gbVarD = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        GradientType gradientType = null;
        ft ftVarE = null;
        fz fzVarC = null;
        fz fzVarC2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(f37191b)) {
                case 0:
                    strNextString = jsonReader.nextString();
                    break;
                case 1:
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.hasNext()) {
                        int iSelectName = jsonReader.selectName(e);
                        if (iSelectName == 0) {
                            iNextInt = jsonReader.nextInt();
                        } else if (iSelectName == 1) {
                            ftVarE = hl.e(jsonReader, cxVar, iNextInt);
                        } else {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    gbVarD = hl.d(jsonReader, cxVar);
                    break;
                case 3:
                    gradientType = jsonReader.nextInt() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    fzVarC = hl.c(jsonReader, cxVar);
                    break;
                case 5:
                    fzVarC2 = hl.c(jsonReader, cxVar);
                    break;
                case 6:
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        return new gk(strNextString, gradientType, fillType, ftVarE, gbVarD == null ? new gb(Collections.singletonList(new jb(100))) : gbVarD, fzVarC, fzVarC2, null, null, zNextBoolean);
    }
}
