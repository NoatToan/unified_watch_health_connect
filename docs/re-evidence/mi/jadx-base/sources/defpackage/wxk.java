package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class wxk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f38462a = JsonReader.a.a("nm", "r", "hd");

    public static uxk a(JsonReader jsonReader, lse lseVar) throws IOException {
        boolean zL = false;
        String strNextString = null;
        eb1 eb1VarF = null;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f38462a);
            if (iP == 0) {
                strNextString = jsonReader.nextString();
            } else if (iP == 1) {
                eb1VarF = tb1.f(jsonReader, lseVar, true);
            } else if (iP != 2) {
                jsonReader.skipValue();
            } else {
                zL = jsonReader.l();
            }
        }
        if (zL) {
            return null;
        }
        return new uxk(strNextString, eb1VarF);
    }
}
