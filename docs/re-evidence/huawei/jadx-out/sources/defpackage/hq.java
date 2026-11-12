package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
class hq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.d f37042b = JsonReader.d.e("ch", "size", "w", TtmlNode.TAG_STYLE, "fFamily", "data");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.d f37041a = JsonReader.d.e("shapes");

    static fq a(JsonReader jsonReader, cx cxVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        double dNextDouble = 0.0d;
        double dNextDouble2 = 0.0d;
        char cCharAt = 0;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f37042b);
            if (iSelectName == 0) {
                cCharAt = jsonReader.nextString().charAt(0);
            } else if (iSelectName == 1) {
                dNextDouble = jsonReader.nextDouble();
            } else if (iSelectName == 2) {
                dNextDouble2 = jsonReader.nextDouble();
            } else if (iSelectName == 3) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 4) {
                strNextString2 = jsonReader.nextString();
            } else if (iSelectName == 5) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if (jsonReader.selectName(f37041a) == 0) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add((go) hi.a(jsonReader, cxVar));
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new fq(arrayList, cCharAt, dNextDouble, dNextDouble2, strNextString, strNextString2);
    }
}
