package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mibi.sdk.common.CommonConstants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class e3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f16223a = JsonReader.a.a("nm", "sy", "pt", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "r", "or", CommonConstants.KEY_OS, "ir", "is", "hd", PluginDeviceInfo.FICONOFF);

    public static PolystarShape a(JsonReader jsonReader, lse lseVar, int i) throws IOException {
        boolean zL = false;
        boolean z = i == 3;
        String strNextString = null;
        PolystarShape.Type typeForValue = null;
        eb1 eb1VarF = null;
        sb1<PointF, PointF> sb1VarB = null;
        eb1 eb1VarF2 = null;
        eb1 eb1VarE = null;
        eb1 eb1VarE2 = null;
        eb1 eb1VarF3 = null;
        eb1 eb1VarF4 = null;
        while (jsonReader.d()) {
            switch (jsonReader.p(f16223a)) {
                case 0:
                    strNextString = jsonReader.nextString();
                    break;
                case 1:
                    typeForValue = PolystarShape.Type.forValue(jsonReader.nextInt());
                    break;
                case 2:
                    eb1VarF = tb1.f(jsonReader, lseVar, false);
                    break;
                case 3:
                    sb1VarB = ib1.b(jsonReader, lseVar);
                    break;
                case 4:
                    eb1VarF2 = tb1.f(jsonReader, lseVar, false);
                    break;
                case 5:
                    eb1VarE2 = tb1.e(jsonReader, lseVar);
                    break;
                case 6:
                    eb1VarF4 = tb1.f(jsonReader, lseVar, false);
                    break;
                case 7:
                    eb1VarE = tb1.e(jsonReader, lseVar);
                    break;
                case 8:
                    eb1VarF3 = tb1.f(jsonReader, lseVar, false);
                    break;
                case 9:
                    zL = jsonReader.l();
                    break;
                case 10:
                    z = jsonReader.nextInt() == 3;
                    break;
                default:
                    jsonReader.s();
                    jsonReader.skipValue();
                    break;
            }
        }
        return new PolystarShape(strNextString, typeForValue, eb1VarF, sb1VarB, eb1VarF2, eb1VarE, eb1VarE2, eb1VarF3, eb1VarF4, zL, z);
    }
}
