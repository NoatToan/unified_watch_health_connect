package defpackage;

import com.airbnb.lottie.parser.ValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static JsonReader.d f37398a = JsonReader.d.e("k");

    static <T> List<jb<T>> b(JsonReader jsonReader, cx cxVar, float f, ValueParser<T> valueParser, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonReader.Token.STRING) {
            cxVar.d("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(f37398a) == 0) {
                if (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    if (jsonReader.peek() == JsonReader.Token.NUMBER) {
                        arrayList.add(hx.e(jsonReader, cxVar, f, valueParser, false, z));
                    } else {
                        while (jsonReader.hasNext()) {
                            arrayList.add(hx.e(jsonReader, cxVar, f, valueParser, true, z));
                        }
                    }
                    jsonReader.endArray();
                } else {
                    arrayList.add(hx.e(jsonReader, cxVar, f, valueParser, false, z));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        d(arrayList);
        return arrayList;
    }

    public static <T> void d(List<? extends jb<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            jb<T> jbVar = list.get(i2);
            i2++;
            jb<T> jbVar2 = list.get(i2);
            jbVar.f38327a = Float.valueOf(jbVar2.h);
            if (jbVar.f38328b == null && jbVar2.j != null) {
                jbVar.f38328b = jbVar2.j;
                if (jbVar instanceof fc) {
                    ((fc) jbVar).a();
                }
            }
        }
        jb<T> jbVar3 = list.get(i);
        if ((jbVar3.j == null || jbVar3.f38328b == null) && list.size() > 1) {
            list.remove(jbVar3);
        }
    }
}
