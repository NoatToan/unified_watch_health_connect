package ln2;

import e23.l;
import java.util.concurrent.atomic.AtomicLong;
import li0.x;
import okhttp3.Call;
import okhttp3.EventListener;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lln2/g;", "Lokhttp3/EventListener$Factory;", "", "enableLogging", "Lkotlin/Function1;", "", "", "logger", "<init>", "(ZLe23/l;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements EventListener.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<String, Unit> f113703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f113704c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(boolean z14, l<? super String, Unit> lVar) {
        lVar.getClass();
        this.f113702a = z14;
        this.f113703b = lVar;
        this.f113704c = new AtomicLong(1L);
    }

    @Override // okhttp3.EventListener.Factory
    public final EventListener create(Call call) {
        call.getClass();
        return new f(this.f113704c.getAndIncrement(), call.request().url(), System.currentTimeMillis(), this.f113702a, this.f113703b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ g(boolean z14, l lVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? new x(27) : lVar);
    }
}
