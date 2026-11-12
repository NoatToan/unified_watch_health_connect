package vf;

import e23.l;
import java.io.IOException;
import o13.q;
import o13.r;
import o53.j;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lvf/c;", "Lokhttp3/Callback;", "Lkotlin/Function1;", "", "", "Lkotlinx/coroutines/CompletionHandler;", "Lokhttp3/Call;", "call", "Lo53/j;", "Lokhttp3/Response;", "continuation", "<init>", "(Lokhttp3/Call;Lo53/j;)V", "coil-network-okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements Callback, l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call f177857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j<Response> f177858b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Call call, j<? super Response> jVar) {
        this.f177857a = call;
        this.f177858b = jVar;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        try {
            this.f177857a.cancel();
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        if (call.getCanceled()) {
            return;
        }
        int i14 = q.f128596b;
        this.f177858b.resumeWith(r.a(iOException));
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        int i14 = q.f128596b;
        this.f177858b.resumeWith(response);
    }
}
