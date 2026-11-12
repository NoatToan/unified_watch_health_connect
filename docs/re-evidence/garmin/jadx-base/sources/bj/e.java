package bj;

import aj.h;
import aj.o;
import aj.p;
import aj.s;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public class e implements o<URL, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<h, InputStream> f18324a;

    public static class a implements p<URL, InputStream> {
        @Override // aj.p
        public final o<URL, InputStream> d(s sVar) {
            return new e(sVar.c(h.class, InputStream.class));
        }
    }

    public e(o<h, InputStream> oVar) {
        this.f18324a = oVar;
    }

    @Override // aj.o
    public final o.a<InputStream> a(URL url, int i14, int i15, ui.h hVar) {
        return this.f18324a.a(new h(url), i14, i15, hVar);
    }

    @Override // aj.o
    public final /* bridge */ /* synthetic */ boolean b(URL url) {
        return true;
    }
}
