package defpackage;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.content.a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.onetrack.b.m;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class n3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f27505a = JsonReader.a.a("nm", PluginDeviceInfo.FLOCALIZATIONS, DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, DeviceTagInterface.CUSTOM_TAG_TYPE, "s", PluginDeviceInfo.FICONOFFLINE, Constants.DEVICE_TYPE_WEAR, "lc", "lj", m.g, "hd", PluginDeviceInfo.FICONOFF);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f27506b = JsonReader.a.a(FitnessFilePathUtils.TimeZoneConstant.POSITIVE, Constant.KeyValue.KEY_COLUMN);
    public static final JsonReader.a c = JsonReader.a.a("n", "v");

    public static a a(JsonReader jsonReader, lse lseVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        String strNextString = null;
        GradientType gradientType = null;
        fb1 fb1VarG = null;
        jb1 jb1VarI = null;
        jb1 jb1VarI2 = null;
        eb1 eb1VarE = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        eb1 eb1Var = null;
        boolean zL = false;
        gb1 gb1Var = null;
        while (jsonReader.d()) {
            switch (jsonReader.p(f27505a)) {
                case 0:
                    strNextString = jsonReader.nextString();
                    continue;
                case 1:
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.d()) {
                        int iP = jsonReader.p(f27506b);
                        if (iP == 0) {
                            iNextInt = jsonReader.nextInt();
                        } else if (iP != 1) {
                            jsonReader.s();
                            jsonReader.skipValue();
                        } else {
                            fb1VarG = tb1.g(jsonReader, lseVar, iNextInt);
                        }
                        fb1VarG = fb1VarG;
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    gb1Var = tb1.h(jsonReader, lseVar);
                    continue;
                case 3:
                    gradientType = jsonReader.nextInt() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    jb1VarI = tb1.i(jsonReader, lseVar);
                    continue;
                case 5:
                    jb1VarI2 = tb1.i(jsonReader, lseVar);
                    continue;
                case 6:
                    eb1VarE = tb1.e(jsonReader, lseVar);
                    continue;
                case 7:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                    break;
                case 8:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                    break;
                case 9:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    zL = jsonReader.l();
                    continue;
                case 11:
                    jsonReader.b();
                    while (jsonReader.d()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        eb1 eb1VarE2 = null;
                        while (jsonReader.d()) {
                            int iP2 = jsonReader.p(c);
                            if (iP2 != 0) {
                                eb1 eb1Var2 = eb1Var;
                                if (iP2 != 1) {
                                    jsonReader.s();
                                    jsonReader.skipValue();
                                } else {
                                    eb1VarE2 = tb1.e(jsonReader, lseVar);
                                }
                                eb1Var = eb1Var2;
                            } else {
                                strNextString2 = jsonReader.nextString();
                            }
                        }
                        eb1 eb1Var3 = eb1Var;
                        jsonReader.endObject();
                        if (strNextString2.equals(DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER)) {
                            eb1Var = eb1VarE2;
                        } else {
                            if (strNextString2.equals(PluginDeviceInfo.FICONOFF) || strNextString2.equals(PluginDeviceInfo.FLOCALIZATIONS)) {
                                lseVar.u(true);
                                arrayList.add(eb1VarE2);
                            }
                            eb1Var = eb1Var3;
                        }
                    }
                    eb1 eb1Var4 = eb1Var;
                    jsonReader.c();
                    if (arrayList.size() == 1) {
                        arrayList.add((eb1) arrayList.get(0));
                    }
                    eb1Var = eb1Var4;
                    continue;
                default:
                    jsonReader.s();
                    jsonReader.skipValue();
                    continue;
            }
            strNextString = strNextString;
        }
        String str = strNextString;
        if (gb1Var == null) {
            gb1Var = new gb1(Collections.singletonList(new e1e(100)));
        }
        return new a(str, gradientType, fb1VarG, gb1Var, jb1VarI, jb1VarI2, eb1VarE, lineCapType, lineJoinType, fNextDouble, arrayList, eb1Var, zL);
    }
}
