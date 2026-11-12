package w5;

import kotlinx.coroutines.CoroutineExceptionHandler;
import o53.e2;
import o53.l1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lw5/x;", "", "Lw5/j;", "asyncTypefaceCache", "Lt13/g;", "injectedContext", "<init>", "(Lw5/j;Lt13/g;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f182177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f182178d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f182179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53.d f182180b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"w5/x$b", "Lt13/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends t13.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.a aVar) {
            super(aVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void L(Throwable th3, t13.g gVar) {
        }
    }

    static {
        new a(null);
        f182177c = new a0();
        f182178d = new b(CoroutineExceptionHandler.f105965e0);
    }

    public x(j jVar, t13.g gVar) {
        this.f182179a = jVar;
        this.f182180b = o53.c0.a(f182178d.plus(a6.n.f1516a).plus(gVar).plus(new e2((l1) gVar.get(l1.f129368i0))));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw5/x$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ x(j jVar, t13.g gVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? new j() : jVar, (i14 & 2) != 0 ? t13.h.f161748a : gVar);
    }
}
