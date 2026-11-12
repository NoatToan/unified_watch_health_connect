package qe;

import android.content.Context;
import java.util.concurrent.Executor;
import oe.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lqe/a;", "Lpe/a;", "backend", "<init>", "(Lpe/a;)V", "a", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements pe.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2722a f144507b = new C2722a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pe.a f144508a;

    public a(pe.a aVar) {
        aVar.getClass();
        this.f144508a = aVar;
    }

    @Override // pe.a
    public final void a(Context context, Executor executor, k7.b<l> bVar) {
        context.getClass();
        this.f144508a.a(context, executor, bVar);
    }

    @Override // pe.a
    public final void b(k7.b<l> bVar) {
        this.f144508a.b(bVar);
    }

    /* JADX INFO: renamed from: qe.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqe/a$a;", "", "<init>", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2722a {
        public /* synthetic */ C2722a(j jVar) {
            this();
        }

        private C2722a() {
        }
    }
}
