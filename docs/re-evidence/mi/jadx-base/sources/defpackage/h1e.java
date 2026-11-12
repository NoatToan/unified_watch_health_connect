package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.miui.circulate.device.api.Constant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static JsonReader.a f19571a = JsonReader.a.a(Constant.KeyValue.KEY_COLUMN);

    public static <T> List<e1e<T>> a(JsonReader jsonReader, lse lseVar, float f, snq<T> snqVar, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.n() == JsonReader.Token.STRING) {
            lseVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.d()) {
            if (jsonReader.p(f19571a) != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.n() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.b();
                if (jsonReader.n() == JsonReader.Token.NUMBER) {
                    arrayList.add(g1e.c(jsonReader, lseVar, f, snqVar, false, z));
                } else {
                    while (jsonReader.d()) {
                        arrayList.add(g1e.c(jsonReader, lseVar, f, snqVar, true, z));
                    }
                }
                jsonReader.c();
            } else {
                arrayList.add(g1e.c(jsonReader, lseVar, f, snqVar, false, z));
            }
        }
        jsonReader.endObject();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends e1e<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            e1e<T> e1eVar = list.get(i2);
            i2++;
            e1e<T> e1eVar2 = list.get(i2);
            e1eVar.h = Float.valueOf(e1eVar2.g);
            if (e1eVar.c == null && (t = e1eVar2.f16153b) != null) {
                e1eVar.c = t;
                if (e1eVar instanceof ulh) {
                    ((ulh) e1eVar).j();
                }
            }
        }
        e1e<T> e1eVar3 = list.get(i);
        if ((e1eVar3.f16153b == null || e1eVar3.c == null) && list.size() > 1) {
            list.remove(e1eVar3);
        }
    }
}
