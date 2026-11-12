package defpackage;

import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
class im {
    private static final JsonReader.d d = JsonReader.d.e("nm", "hd", "it");

    static go a(JsonReader jsonReader, cx cxVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(d);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (iSelectName == 2) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ContentModel contentModelA = hi.a(jsonReader, cxVar);
                    if (contentModelA != null) {
                        arrayList.add(contentModelA);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return new go(strNextString, arrayList, zNextBoolean);
    }
}
