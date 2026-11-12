package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class g67 {
    public static final JsonReader.a f = JsonReader.a.a("ef");
    public static final JsonReader.a g = JsonReader.a.a("nm", "v");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public db1 f18646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public eb1 f18647b;
    public eb1 c;
    public eb1 d;
    public eb1 e;

    public final void a(JsonReader jsonReader, lse lseVar) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.d()) {
            int iP = jsonReader.p(g);
            if (iP != 0) {
                if (iP == 1) {
                    strNextString.hashCode();
                    switch (strNextString) {
                        case "Distance":
                            this.d = tb1.e(jsonReader, lseVar);
                            break;
                        case "Opacity":
                            this.f18647b = tb1.f(jsonReader, lseVar, false);
                            break;
                        case "Direction":
                            this.c = tb1.f(jsonReader, lseVar, false);
                            break;
                        case "Shadow Color":
                            this.f18646a = tb1.c(jsonReader, lseVar);
                            break;
                        case "Softness":
                            this.e = tb1.e(jsonReader, lseVar);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } else {
                    jsonReader.s();
                    jsonReader.skipValue();
                }
            } else {
                strNextString = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
    }

    public f67 b(JsonReader jsonReader, lse lseVar) throws IOException {
        eb1 eb1Var;
        eb1 eb1Var2;
        eb1 eb1Var3;
        eb1 eb1Var4;
        while (jsonReader.d()) {
            if (jsonReader.p(f) != 0) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                jsonReader.b();
                while (jsonReader.d()) {
                    a(jsonReader, lseVar);
                }
                jsonReader.c();
            }
        }
        db1 db1Var = this.f18646a;
        if (db1Var == null || (eb1Var = this.f18647b) == null || (eb1Var2 = this.c) == null || (eb1Var3 = this.d) == null || (eb1Var4 = this.e) == null) {
            return null;
        }
        return new f67(db1Var, eb1Var, eb1Var2, eb1Var3, eb1Var4);
    }
}
