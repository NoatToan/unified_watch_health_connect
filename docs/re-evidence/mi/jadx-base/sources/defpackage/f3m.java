package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class f3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static JsonReader.a f17366a = JsonReader.a.a("nm", "ind", "ks", "hd");

    public static e3m a(JsonReader jsonReader, lse lseVar) throws IOException {
        String strNextString = null;
        int iNextInt = 0;
        boolean zL = false;
        lb1 lb1VarK = null;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f17366a);
            if (iP == 0) {
                strNextString = jsonReader.nextString();
            } else if (iP == 1) {
                iNextInt = jsonReader.nextInt();
            } else if (iP == 2) {
                lb1VarK = tb1.k(jsonReader, lseVar);
            } else if (iP != 3) {
                jsonReader.skipValue();
            } else {
                zL = jsonReader.l();
            }
        }
        return new e3m(strNextString, iNextInt, lb1VarK, zL);
    }
}
