package ni;

import java.util.List;
import okhttp3.Headers;
import wh.e;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final Headers a(List<e> list) {
        list.getClass();
        Headers.Builder builder = new Headers.Builder();
        for (e eVar : list) {
            builder.add(eVar.f185221a, eVar.f185222b);
        }
        return builder.build();
    }
}
