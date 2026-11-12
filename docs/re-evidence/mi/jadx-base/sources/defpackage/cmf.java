package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class cmf implements d7g<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5484a;

    public static class a implements e7g<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f5485a;

        public a(Context context) {
            this.f5485a = context;
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Uri, InputStream> d(iag iagVar) {
            return new cmf(this.f5485a);
        }
    }

    public cmf(Context context) {
        this.f5484a = context.getApplicationContext();
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<InputStream> b(Uri uri, int i, int i2, cch cchVar) {
        if (bmf.e(i, i2) && e(cchVar)) {
            return new d7g.a<>(new b4h(uri), xdp.g(this.f5484a, uri));
        }
        return null;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return bmf.d(uri);
    }

    public final boolean e(cch cchVar) {
        Long l = (Long) cchVar.c(jqq.d);
        return l != null && l.longValue() == -1;
    }
}
