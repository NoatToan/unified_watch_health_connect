package defpackage;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class h3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f19655a = JsonReader.a.a("s", PluginDeviceInfo.FICONOFFLINE, DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "nm", "m", "hd");

    public static ShapeTrimPath a(JsonReader jsonReader, lse lseVar) throws IOException {
        String strNextString = null;
        ShapeTrimPath.Type typeForId = null;
        eb1 eb1VarF = null;
        eb1 eb1VarF2 = null;
        eb1 eb1VarF3 = null;
        boolean zL = false;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f19655a);
            if (iP == 0) {
                eb1VarF = tb1.f(jsonReader, lseVar, false);
            } else if (iP == 1) {
                eb1VarF2 = tb1.f(jsonReader, lseVar, false);
            } else if (iP == 2) {
                eb1VarF3 = tb1.f(jsonReader, lseVar, false);
            } else if (iP == 3) {
                strNextString = jsonReader.nextString();
            } else if (iP == 4) {
                typeForId = ShapeTrimPath.Type.forId(jsonReader.nextInt());
            } else if (iP != 5) {
                jsonReader.skipValue();
            } else {
                zL = jsonReader.l();
            }
        }
        return new ShapeTrimPath(strNextString, typeForId, eb1VarF, eb1VarF2, eb1VarF3, zL);
    }
}
