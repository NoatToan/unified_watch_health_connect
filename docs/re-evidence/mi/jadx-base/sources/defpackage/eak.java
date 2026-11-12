package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class eak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f16450a = JsonReader.a.a("nm", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "s", "r", "hd");

    public static dak a(JsonReader jsonReader, lse lseVar) throws IOException {
        String strNextString = null;
        sb1<PointF, PointF> sb1VarB = null;
        jb1 jb1VarI = null;
        eb1 eb1VarE = null;
        boolean zL = false;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f16450a);
            if (iP == 0) {
                strNextString = jsonReader.nextString();
            } else if (iP == 1) {
                sb1VarB = ib1.b(jsonReader, lseVar);
            } else if (iP == 2) {
                jb1VarI = tb1.i(jsonReader, lseVar);
            } else if (iP == 3) {
                eb1VarE = tb1.e(jsonReader, lseVar);
            } else if (iP != 4) {
                jsonReader.skipValue();
            } else {
                zL = jsonReader.l();
            }
        }
        return new dak(strNextString, sb1VarB, jb1VarI, eb1VarE, zL);
    }
}
