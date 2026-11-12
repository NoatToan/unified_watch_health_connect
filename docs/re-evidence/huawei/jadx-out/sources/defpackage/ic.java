package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
class ic {
    static fc a(JsonReader jsonReader, cx cxVar) throws IOException {
        return new fc(cxVar, hx.e(jsonReader, cxVar, je.e(), ie.f37525b, jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT, false));
    }
}
