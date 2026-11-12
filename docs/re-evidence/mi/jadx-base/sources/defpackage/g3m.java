package defpackage;

import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.b.m;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class g3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f18553a = JsonReader.a.a("nm", PluginDeviceInfo.FICONON, Constants.DEVICE_TYPE_WEAR, DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "lc", "lj", m.g, "hd", PluginDeviceInfo.FICONOFF);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f18554b = JsonReader.a.a("n", "v");

    public static ShapeStroke a(JsonReader jsonReader, lse lseVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        boolean zL = false;
        String strNextString = null;
        eb1 eb1Var = null;
        db1 db1VarC = null;
        eb1 eb1VarE = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        gb1 gb1Var = null;
        while (jsonReader.d()) {
            switch (jsonReader.p(f18553a)) {
                case 0:
                    strNextString = jsonReader.nextString();
                    break;
                case 1:
                    db1VarC = tb1.c(jsonReader, lseVar);
                    break;
                case 2:
                    eb1VarE = tb1.e(jsonReader, lseVar);
                    break;
                case 3:
                    gb1Var = tb1.h(jsonReader, lseVar);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                    break;
                case 6:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    zL = jsonReader.l();
                    break;
                case 8:
                    jsonReader.b();
                    while (jsonReader.d()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        eb1 eb1VarE2 = null;
                        while (jsonReader.d()) {
                            int iP = jsonReader.p(f18554b);
                            if (iP == 0) {
                                strNextString2 = jsonReader.nextString();
                            } else if (iP != 1) {
                                jsonReader.s();
                                jsonReader.skipValue();
                            } else {
                                eb1VarE2 = tb1.e(jsonReader, lseVar);
                            }
                        }
                        jsonReader.endObject();
                        strNextString2.hashCode();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                lseVar.u(true);
                                arrayList.add(eb1VarE2);
                                break;
                            case "o":
                                eb1Var = eb1VarE2;
                                break;
                        }
                    }
                    jsonReader.c();
                    if (arrayList.size() == 1) {
                        arrayList.add((eb1) arrayList.get(0));
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (gb1Var == null) {
            gb1Var = new gb1(Collections.singletonList(new e1e(100)));
        }
        return new ShapeStroke(strNextString, eb1Var, arrayList, db1VarC, gb1Var, eb1VarE, lineCapType, lineJoinType, fNextDouble, zL);
    }
}
