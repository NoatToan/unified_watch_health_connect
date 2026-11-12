package aj;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class z<Data> implements o<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f3417b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<h, Data> f3418a;

    public static class a implements p<Uri, InputStream> {
        @Override // aj.p
        public final o<Uri, InputStream> d(s sVar) {
            return new z(sVar.c(h.class, InputStream.class));
        }
    }

    public z(o<h, Data> oVar) {
        this.f3418a = oVar;
    }

    @Override // aj.o
    public final o.a a(Uri uri, int i14, int i15, ui.h hVar) {
        return this.f3418a.a(new h(uri.toString()), i14, i15, hVar);
    }

    @Override // aj.o
    public final boolean b(Uri uri) {
        return f3417b.contains(uri.getScheme());
    }
}
