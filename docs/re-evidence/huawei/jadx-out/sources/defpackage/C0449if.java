package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.ValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: if, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C0449if implements ValueParser<PointF> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0449if f37557b = new C0449if();

    private C0449if() {
    }

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PointF parse(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token tokenPeek = jsonReader.peek();
        if (tokenPeek == JsonReader.Token.BEGIN_ARRAY) {
            return hw.b(jsonReader, f);
        }
        if (tokenPeek == JsonReader.Token.BEGIN_OBJECT) {
            return hw.b(jsonReader, f);
        }
        if (tokenPeek == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenPeek);
    }
}
