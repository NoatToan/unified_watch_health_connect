package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class rw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f32959a = JsonReader.a.a("nm", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "s", "hd", PluginDeviceInfo.FICONOFF);

    public static qw3 a(JsonReader jsonReader, lse lseVar, int i) throws IOException {
        boolean z = i == 3;
        boolean zL = false;
        String strNextString = null;
        sb1<PointF, PointF> sb1VarB = null;
        jb1 jb1VarI = null;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f32959a);
            if (iP == 0) {
                strNextString = jsonReader.nextString();
            } else if (iP == 1) {
                sb1VarB = ib1.b(jsonReader, lseVar);
            } else if (iP == 2) {
                jb1VarI = tb1.i(jsonReader, lseVar);
            } else if (iP == 3) {
                zL = jsonReader.l();
            } else if (iP != 4) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextInt() == 3;
            }
        }
        return new qw3(strNextString, sb1VarB, jb1VarI, z, zL);
    }
}
