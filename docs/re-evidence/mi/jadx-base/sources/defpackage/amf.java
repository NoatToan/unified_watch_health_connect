package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class amf implements d7g<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1209a;

    public static class a implements e7g<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1210a;

        public a(Context context) {
            this.f1210a = context;
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Uri, InputStream> d(iag iagVar) {
            return new amf(this.f1210a);
        }
    }

    public amf(Context context) {
        this.f1209a = context.getApplicationContext();
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<InputStream> b(Uri uri, int i, int i2, cch cchVar) {
        if (bmf.e(i, i2)) {
            return new d7g.a<>(new b4h(uri), xdp.f(this.f1209a, uri));
        }
        return null;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return bmf.b(uri);
    }
}
