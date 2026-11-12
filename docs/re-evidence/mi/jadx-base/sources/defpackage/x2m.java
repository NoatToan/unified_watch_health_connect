package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class x2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f38618a = JsonReader.a.a("nm", PluginDeviceInfo.FICONON, DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "fillEnabled", "r", "hd");

    public static w2m a(JsonReader jsonReader, lse lseVar) throws IOException {
        gb1 gb1Var = null;
        String strNextString = null;
        db1 db1VarC = null;
        boolean zL = false;
        boolean zL2 = false;
        int iNextInt = 1;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f38618a);
            if (iP == 0) {
                strNextString = jsonReader.nextString();
            } else if (iP == 1) {
                db1VarC = tb1.c(jsonReader, lseVar);
            } else if (iP == 2) {
                gb1Var = tb1.h(jsonReader, lseVar);
            } else if (iP == 3) {
                zL = jsonReader.l();
            } else if (iP == 4) {
                iNextInt = jsonReader.nextInt();
            } else if (iP != 5) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                zL2 = jsonReader.l();
            }
        }
        if (gb1Var == null) {
            gb1Var = new gb1(Collections.singletonList(new e1e(100)));
        }
        return new w2m(strNextString, zL, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, db1VarC, gb1Var, zL2);
    }
}
