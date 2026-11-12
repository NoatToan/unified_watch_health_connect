package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class z2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f40814a = JsonReader.a.a("nm", "hd", "it");

    public static y2m a(JsonReader jsonReader, lse lseVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        boolean zL = false;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f40814a);
            if (iP == 0) {
                strNextString = jsonReader.nextString();
            } else if (iP == 1) {
                zL = jsonReader.l();
            } else if (iP != 2) {
                jsonReader.skipValue();
            } else {
                jsonReader.b();
                while (jsonReader.d()) {
                    fi4 fi4VarA = gi4.a(jsonReader, lseVar);
                    if (fi4VarA != null) {
                        arrayList.add(fi4VarA);
                    }
                }
                jsonReader.c();
            }
        }
        return new y2m(strNextString, arrayList, zL);
    }
}
