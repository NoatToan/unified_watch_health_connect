package defpackage;

import com.airbnb.lottie.parser.ValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class hu implements ValueParser<Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hu f37148c = new hu();

    private hu() {
    }

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Integer parse(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(hw.e(jsonReader) * f));
    }
}
