package im2;

import c83.a0;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lim2/f;", "Lc83/f;", "Lokhttp3/ResponseBody;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements c83.f<ResponseBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lm2.i.b<String> f94269a;

    public f(lm2.i.b<String> bVar) {
        this.f94269a = bVar;
    }

    @Override // c83.f
    public final void a(c83.d<ResponseBody> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        this.f94269a.onFailure(th3);
    }

    @Override // c83.f
    public final void c(c83.d<ResponseBody> dVar, a0<ResponseBody> a0Var) {
        dVar.getClass();
        ResponseBody responseBody = a0Var.f25746b;
        this.f94269a.a(responseBody != null ? responseBody.string() : null);
    }
}
