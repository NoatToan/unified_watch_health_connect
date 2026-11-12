package defpackage;

import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class mdq implements d7g<URL, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7g<e0b, InputStream> f26046a;

    public static class a implements e7g<URL, InputStream> {
        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<URL, InputStream> d(iag iagVar) {
            return new mdq(iagVar.d(e0b.class, InputStream.class));
        }
    }

    public mdq(d7g<e0b, InputStream> d7gVar) {
        this.f26046a = d7gVar;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<InputStream> b(URL url, int i, int i2, cch cchVar) {
        return this.f26046a.b(new e0b(url), i, i2, cchVar);
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(URL url) {
        return true;
    }
}
