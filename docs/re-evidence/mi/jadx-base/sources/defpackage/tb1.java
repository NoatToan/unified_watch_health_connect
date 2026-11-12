package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class tb1 {
    public static <T> List<e1e<T>> a(JsonReader jsonReader, float f, lse lseVar, snq<T> snqVar) throws IOException {
        return h1e.a(jsonReader, lseVar, f, snqVar, false);
    }

    public static <T> List<e1e<T>> b(JsonReader jsonReader, lse lseVar, snq<T> snqVar) throws IOException {
        return h1e.a(jsonReader, lseVar, 1.0f, snqVar, false);
    }

    public static db1 c(JsonReader jsonReader, lse lseVar) throws IOException {
        return new db1(b(jsonReader, lseVar, u44.f35356a));
    }

    public static nb1 d(JsonReader jsonReader, lse lseVar) throws IOException {
        return new nb1(a(jsonReader, emq.e(), lseVar, y07.f39640a));
    }

    public static eb1 e(JsonReader jsonReader, lse lseVar) throws IOException {
        return f(jsonReader, lseVar, true);
    }

    public static eb1 f(JsonReader jsonReader, lse lseVar, boolean z) throws IOException {
        return new eb1(a(jsonReader, z ? emq.e() : 1.0f, lseVar, by9.f4721a));
    }

    public static fb1 g(JsonReader jsonReader, lse lseVar, int i) throws IOException {
        return new fb1(b(jsonReader, lseVar, new i3b(i)));
    }

    public static gb1 h(JsonReader jsonReader, lse lseVar) throws IOException {
        return new gb1(b(jsonReader, lseVar, pcd.f30243a));
    }

    public static jb1 i(JsonReader jsonReader, lse lseVar) throws IOException {
        return new jb1(h1e.a(jsonReader, lseVar, emq.e(), r2i.f32111a, true));
    }

    public static kb1 j(JsonReader jsonReader, lse lseVar) throws IOException {
        return new kb1(b(jsonReader, lseVar, qbl.f31344a));
    }

    public static lb1 k(JsonReader jsonReader, lse lseVar) throws IOException {
        return new lb1(a(jsonReader, emq.e(), lseVar, v2m.f36416a));
    }
}
