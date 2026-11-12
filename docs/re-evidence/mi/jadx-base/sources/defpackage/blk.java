package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class blk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f4342a = JsonReader.a.a("nm", PluginDeviceInfo.FICONON, DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "tr", "hd");

    public static zkk a(JsonReader jsonReader, lse lseVar) throws IOException {
        String strNextString = null;
        eb1 eb1VarF = null;
        eb1 eb1VarF2 = null;
        qb1 qb1VarG = null;
        boolean zL = false;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f4342a);
            if (iP == 0) {
                strNextString = jsonReader.nextString();
            } else if (iP == 1) {
                eb1VarF = tb1.f(jsonReader, lseVar, false);
            } else if (iP == 2) {
                eb1VarF2 = tb1.f(jsonReader, lseVar, false);
            } else if (iP == 3) {
                qb1VarG = rb1.g(jsonReader, lseVar);
            } else if (iP != 4) {
                jsonReader.skipValue();
            } else {
                zL = jsonReader.l();
            }
        }
        return new zkk(strNextString, eb1VarF, eb1VarF2, qb1VarG, zL);
    }
}
