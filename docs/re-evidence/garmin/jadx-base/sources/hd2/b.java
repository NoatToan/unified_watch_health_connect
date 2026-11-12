package hd2;

import e23.l;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.Call;
import okhttp3.EventListener;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhd2/b;", "Lokhttp3/EventListener$Factory;", "<init>", "()V", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements EventListener.Factory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f83446c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f83444a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicLong f83445b = new AtomicLong(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static l<? super String, Unit> f83447d = new ha0.b(14);

    private b() {
    }

    @Override // okhttp3.EventListener.Factory
    public final EventListener create(Call call) {
        call.getClass();
        return new a(f83445b.getAndIncrement(), call.request().url(), System.currentTimeMillis(), f83446c, f83447d);
    }
}
