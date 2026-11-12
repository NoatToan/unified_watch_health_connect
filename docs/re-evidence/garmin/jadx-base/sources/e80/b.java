package e80;

import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le80/b;", "Le80/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<f80.a> f63441a = new AtomicReference<>();

    @Override // e80.a
    public final void a(String str, f80.b bVar) {
        str.getClass();
        bVar.getClass();
        this.f63441a.set(new f80.a(str, bVar));
    }

    @Override // e80.a
    public final void b() {
        this.f63441a.set(null);
    }

    @Override // e80.a
    public final f80.a getData() {
        return this.f63441a.get();
    }
}
