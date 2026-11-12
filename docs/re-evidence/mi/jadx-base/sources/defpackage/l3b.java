package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class l3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f24596a = JsonReader.a.a("nm", PluginDeviceInfo.FLOCALIZATIONS, DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, DeviceTagInterface.CUSTOM_TAG_TYPE, "s", PluginDeviceInfo.FICONOFFLINE, "r", "hd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f24597b = JsonReader.a.a(FitnessFilePathUtils.TimeZoneConstant.POSITIVE, Constant.KeyValue.KEY_COLUMN);

    public static j3b a(JsonReader jsonReader, lse lseVar) throws IOException {
        gb1 gb1VarH = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        GradientType gradientType = null;
        fb1 fb1VarG = null;
        jb1 jb1VarI = null;
        jb1 jb1VarI2 = null;
        boolean zL = false;
        while (jsonReader.d()) {
            switch (jsonReader.p(f24596a)) {
                case 0:
                    strNextString = jsonReader.nextString();
                    break;
                case 1:
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.d()) {
                        int iP = jsonReader.p(f24597b);
                        if (iP == 0) {
                            iNextInt = jsonReader.nextInt();
                        } else if (iP != 1) {
                            jsonReader.s();
                            jsonReader.skipValue();
                        } else {
                            fb1VarG = tb1.g(jsonReader, lseVar, iNextInt);
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    gb1VarH = tb1.h(jsonReader, lseVar);
                    break;
                case 3:
                    gradientType = jsonReader.nextInt() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    jb1VarI = tb1.i(jsonReader, lseVar);
                    break;
                case 5:
                    jb1VarI2 = tb1.i(jsonReader, lseVar);
                    break;
                case 6:
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zL = jsonReader.l();
                    break;
                default:
                    jsonReader.s();
                    jsonReader.skipValue();
                    break;
            }
        }
        return new j3b(strNextString, gradientType, fillType, fb1VarG, gb1VarH == null ? new gb1(Collections.singletonList(new e1e(100))) : gb1VarH, jb1VarI, jb1VarI2, null, null, zL);
    }
}
