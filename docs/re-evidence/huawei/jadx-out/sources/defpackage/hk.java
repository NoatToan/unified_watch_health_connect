package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
class hk {
    private static final JsonReader.d e = JsonReader.d.e("ef");
    private static final JsonReader.d d = JsonReader.d.e("ty", "v");

    hk() {
    }

    static ge e(JsonReader jsonReader, cx cxVar) throws IOException {
        ge geVar = null;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(e) == 0) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ge geVarD = d(jsonReader, cxVar);
                    if (geVarD != null) {
                        geVar = geVarD;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        return geVar;
    }

    private static ge d(JsonReader jsonReader, cx cxVar) throws IOException {
        jsonReader.beginObject();
        ge geVar = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (jsonReader.hasNext()) {
                    int iSelectName = jsonReader.selectName(d);
                    if (iSelectName != 0) {
                        if (iSelectName != 1) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else if (z) {
                            geVar = new ge(hl.b(jsonReader, cxVar));
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (jsonReader.nextInt() == 0) {
                        z = true;
                    }
                } else {
                    jsonReader.endObject();
                    return geVar;
                }
            }
        }
    }
}
