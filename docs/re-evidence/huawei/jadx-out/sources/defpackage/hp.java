package defpackage;

import com.airbnb.lottie.parser.ValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class hp implements ValueParser<Float> {
    public static final hp e = new hp();

    private hp() {
    }

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float parse(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(hw.e(jsonReader) * f);
    }
}
