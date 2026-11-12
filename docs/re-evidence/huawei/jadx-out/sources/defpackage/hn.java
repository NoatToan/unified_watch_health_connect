package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class hn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.d f36941a = JsonReader.d.e("ef");
    private static final JsonReader.d e = JsonReader.d.e("nm", "v");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fx f36942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fu f36943c;
    private fu d;
    private fu f;
    private fu g;

    ho d(JsonReader jsonReader, cx cxVar) throws IOException {
        fu fuVar;
        fu fuVar2;
        fu fuVar3;
        fu fuVar4;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(f36941a) == 0) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    a(jsonReader, cxVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        fx fxVar = this.f36942b;
        if (fxVar == null || (fuVar = this.g) == null || (fuVar2 = this.d) == null || (fuVar3 = this.f36943c) == null || (fuVar4 = this.f) == null) {
            return null;
        }
        return new ho(fxVar, fuVar, fuVar2, fuVar3, fuVar4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    private void a(JsonReader jsonReader, cx cxVar) throws IOException {
        byte b2;
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(e);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                strNextString.hashCode();
                switch (strNextString) {
                    case "Distance":
                        b2 = 0;
                        break;
                    case "Opacity":
                        b2 = 1;
                        break;
                    case "Direction":
                        b2 = 2;
                        break;
                    case "Shadow Color":
                        b2 = 3;
                        break;
                    case "Softness":
                        b2 = 4;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    this.f36943c = hl.b(jsonReader, cxVar);
                } else if (b2 == 1) {
                    this.g = hl.e(jsonReader, cxVar, false);
                } else if (b2 == 2) {
                    this.d = hl.e(jsonReader, cxVar, false);
                } else if (b2 == 3) {
                    this.f36942b = hl.e(jsonReader, cxVar);
                } else if (b2 == 4) {
                    this.f = hl.b(jsonReader, cxVar);
                } else {
                    jsonReader.skipValue();
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }
}
