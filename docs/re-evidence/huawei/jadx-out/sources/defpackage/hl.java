package defpackage;

import com.airbnb.lottie.parser.ValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class hl {
    public static fu b(JsonReader jsonReader, cx cxVar) throws IOException {
        return e(jsonReader, cxVar, true);
    }

    public static fu e(JsonReader jsonReader, cx cxVar, boolean z) throws IOException {
        return new fu(c(jsonReader, z ? je.e() : 1.0f, cxVar, hp.e));
    }

    static gb d(JsonReader jsonReader, cx cxVar) throws IOException {
        return new gb(d(jsonReader, cxVar, hu.f37148c));
    }

    static fz c(JsonReader jsonReader, cx cxVar) throws IOException {
        return new fz(ia.b(jsonReader, cxVar, je.e(), C0449if.f37557b, true));
    }

    static gc g(JsonReader jsonReader, cx cxVar) throws IOException {
        return new gc(d(jsonReader, cxVar, ii.f37641b));
    }

    static fy j(JsonReader jsonReader, cx cxVar) throws IOException {
        return new fy(c(jsonReader, je.e(), cxVar, ip.d));
    }

    static gd a(JsonReader jsonReader, cx cxVar) throws IOException {
        return new gd(c(jsonReader, je.e(), cxVar, hm.f36889c));
    }

    static fx e(JsonReader jsonReader, cx cxVar) throws IOException {
        return new fx(d(jsonReader, cxVar, hh.f36734b));
    }

    static ft e(JsonReader jsonReader, cx cxVar, int i) throws IOException {
        return new ft(d(jsonReader, cxVar, new hr(i)));
    }

    private static <T> List<jb<T>> d(JsonReader jsonReader, cx cxVar, ValueParser<T> valueParser) throws IOException {
        return ia.b(jsonReader, cxVar, 1.0f, valueParser, false);
    }

    private static <T> List<jb<T>> c(JsonReader jsonReader, float f, cx cxVar, ValueParser<T> valueParser) throws IOException {
        return ia.b(jsonReader, cxVar, f, valueParser, false);
    }
}
