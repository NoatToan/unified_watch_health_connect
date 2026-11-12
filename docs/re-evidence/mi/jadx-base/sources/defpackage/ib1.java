package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.miui.circulate.device.api.Constant;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ib1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f20961a = JsonReader.a.a(Constant.KeyValue.KEY_COLUMN, "x", "y");

    public static hb1 a(JsonReader jsonReader, lse lseVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.n() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
            while (jsonReader.d()) {
                arrayList.add(wlh.a(jsonReader, lseVar));
            }
            jsonReader.c();
            h1e.b(arrayList);
        } else {
            arrayList.add(new e1e(sud.e(jsonReader, emq.e())));
        }
        return new hb1(arrayList);
    }

    public static sb1<PointF, PointF> b(JsonReader jsonReader, lse lseVar) throws IOException {
        jsonReader.beginObject();
        hb1 hb1VarA = null;
        eb1 eb1VarE = null;
        boolean z = false;
        eb1 eb1VarE2 = null;
        while (jsonReader.n() != JsonReader.Token.END_OBJECT) {
            int iP = jsonReader.p(f20961a);
            if (iP == 0) {
                hb1VarA = a(jsonReader, lseVar);
            } else if (iP != 1) {
                if (iP != 2) {
                    jsonReader.s();
                    jsonReader.skipValue();
                } else if (jsonReader.n() == JsonReader.Token.STRING) {
                    jsonReader.skipValue();
                    z = true;
                } else {
                    eb1VarE = tb1.e(jsonReader, lseVar);
                }
            } else if (jsonReader.n() == JsonReader.Token.STRING) {
                jsonReader.skipValue();
                z = true;
            } else {
                eb1VarE2 = tb1.e(jsonReader, lseVar);
            }
        }
        jsonReader.endObject();
        if (z) {
            lseVar.a("Lottie doesn't support expressions.");
        }
        return hb1VarA != null ? hb1VarA : new mb1(eb1VarE2, eb1VarE);
    }
}
