package my2;

import c83.a0;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmy2/i;", "Lc83/f;", "Lokhttp3/ResponseBody;", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i implements c83.f<ResponseBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.d<hy2.c> f121566a;

    /* JADX WARN: Multi-variable type inference failed */
    public i(t13.d<? super hy2.c> dVar) {
        this.f121566a = dVar;
    }

    @Override // c83.f
    public final void a(c83.d<ResponseBody> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        int i14 = o13.q.f128596b;
        this.f121566a.resumeWith(new s(th3));
    }

    @Override // c83.f
    public final void c(c83.d<ResponseBody> dVar, a0<ResponseBody> a0Var) {
        dVar.getClass();
        int i14 = o13.q.f128596b;
        s.f121600d.getClass();
        this.f121566a.resumeWith(s.a.a(a0Var, null));
    }
}
