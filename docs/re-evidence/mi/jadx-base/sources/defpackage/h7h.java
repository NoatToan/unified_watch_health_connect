package defpackage;

import com.google.android.exoplayer2.upstream.HttpDataSource;
import okhttp3.CacheControl;
import okhttp3.Call;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h7h extends HttpDataSource.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call.Factory f19777b;
    public final String c;
    public final fxp d;
    public final CacheControl e;

    public h7h(Call.Factory factory, String str, fxp fxpVar) {
        this(factory, str, fxpVar, null);
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public g7h b(HttpDataSource.c cVar) {
        g7h g7hVar = new g7h(this.f19777b, this.c, this.e, cVar);
        fxp fxpVar = this.d;
        if (fxpVar != null) {
            g7hVar.f(fxpVar);
        }
        return g7hVar;
    }

    public h7h(Call.Factory factory, String str, fxp fxpVar, CacheControl cacheControl) {
        this.f19777b = factory;
        this.c = str;
        this.d = fxpVar;
        this.e = cacheControl;
    }
}
