package defpackage;

import com.airbnb.lottie.parser.ValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class ii implements ValueParser<jj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ii f37641b = new ii();

    private ii() {
    }

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public jj parse(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new jj((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }
}
