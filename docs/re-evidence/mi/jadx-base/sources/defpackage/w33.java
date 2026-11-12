package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class w33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f37504a = JsonReader.a.a("ef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f37505b = JsonReader.a.a("ty", "v");

    public static v33 a(JsonReader jsonReader, lse lseVar) throws IOException {
        jsonReader.beginObject();
        v33 v33Var = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (!jsonReader.d()) {
                    jsonReader.endObject();
                    return v33Var;
                }
                int iP = jsonReader.p(f37505b);
                if (iP != 0) {
                    if (iP != 1) {
                        jsonReader.s();
                        jsonReader.skipValue();
                    } else if (z) {
                        v33Var = new v33(tb1.e(jsonReader, lseVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (jsonReader.nextInt() == 0) {
                    z = true;
                }
            }
        }
    }

    public static v33 b(JsonReader jsonReader, lse lseVar) throws IOException {
        v33 v33Var = null;
        while (jsonReader.d()) {
            if (jsonReader.p(f37504a) != 0) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                jsonReader.b();
                while (jsonReader.d()) {
                    v33 v33VarA = a(jsonReader, lseVar);
                    if (v33VarA != null) {
                        v33Var = v33VarA;
                    }
                }
                jsonReader.c();
            }
        }
        return v33Var;
    }
}
