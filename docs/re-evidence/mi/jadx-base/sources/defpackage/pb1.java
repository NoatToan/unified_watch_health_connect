package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class pb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f30184a = JsonReader.a.a(PluginDeviceInfo.FMODEL);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f30185b = JsonReader.a.a("fc", "sc", "sw", DeviceTagInterface.CUSTOM_TAG_TYPE);

    public static ob1 a(JsonReader jsonReader, lse lseVar) throws IOException {
        jsonReader.beginObject();
        ob1 ob1VarB = null;
        while (jsonReader.d()) {
            if (jsonReader.p(f30184a) != 0) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                ob1VarB = b(jsonReader, lseVar);
            }
        }
        jsonReader.endObject();
        return ob1VarB == null ? new ob1(null, null, null, null) : ob1VarB;
    }

    public static ob1 b(JsonReader jsonReader, lse lseVar) throws IOException {
        jsonReader.beginObject();
        db1 db1VarC = null;
        db1 db1VarC2 = null;
        eb1 eb1VarE = null;
        eb1 eb1VarE2 = null;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f30185b);
            if (iP == 0) {
                db1VarC = tb1.c(jsonReader, lseVar);
            } else if (iP == 1) {
                db1VarC2 = tb1.c(jsonReader, lseVar);
            } else if (iP == 2) {
                eb1VarE = tb1.e(jsonReader, lseVar);
            } else if (iP != 3) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                eb1VarE2 = tb1.e(jsonReader, lseVar);
            }
        }
        jsonReader.endObject();
        return new ob1(db1VarC, db1VarC2, eb1VarE, eb1VarE2);
    }
}
