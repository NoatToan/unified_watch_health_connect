package o53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public interface i extends x1 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo53/i$a;", "Lo53/i;", "Lkotlin/Function1;", "", "", "handler", "<init>", "(Le23/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.l<Throwable, Unit> f129349a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Throwable, Unit> lVar) {
            this.f129349a = lVar;
        }

        @Override // o53.i
        public final void a(Throwable th3) {
            this.f129349a.invoke(th3);
        }

        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.f129349a.getClass().getSimpleName() + '@' + f0.u(this) + ']';
        }
    }

    void a(Throwable th3);
}
