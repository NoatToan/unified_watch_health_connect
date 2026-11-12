package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class wz9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f38506a = JsonReader.a.a("ch", MediaStoreUtil.MediaInfo.SIZE, Constants.DEVICE_TYPE_WEAR, "style", "fFamily", "data");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f38507b = JsonReader.a.a("shapes");

    public static vz9 a(JsonReader jsonReader, lse lseVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        double dNextDouble = 0.0d;
        String strNextString = null;
        String strNextString2 = null;
        char cCharAt = 0;
        double dNextDouble2 = 0.0d;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f38506a);
            if (iP == 0) {
                cCharAt = jsonReader.nextString().charAt(0);
            } else if (iP == 1) {
                dNextDouble2 = jsonReader.nextDouble();
            } else if (iP == 2) {
                dNextDouble = jsonReader.nextDouble();
            } else if (iP == 3) {
                strNextString = jsonReader.nextString();
            } else if (iP == 4) {
                strNextString2 = jsonReader.nextString();
            } else if (iP != 5) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                jsonReader.beginObject();
                while (jsonReader.d()) {
                    if (jsonReader.p(f38507b) != 0) {
                        jsonReader.s();
                        jsonReader.skipValue();
                    } else {
                        jsonReader.b();
                        while (jsonReader.d()) {
                            arrayList.add((y2m) gi4.a(jsonReader, lseVar));
                        }
                        jsonReader.c();
                    }
                }
                jsonReader.endObject();
            }
        }
        jsonReader.endObject();
        return new vz9(arrayList, cCharAt, dNextDouble2, dNextDouble, strNextString, strNextString2);
    }
}
