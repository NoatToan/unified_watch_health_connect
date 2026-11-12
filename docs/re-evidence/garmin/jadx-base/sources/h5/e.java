package h5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f81756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f81757b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h5/e$a", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh5/c;", "it", "", "invoke", "(Lh5/c;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.l<h5.c, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f81758a = new b();

        public b() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(h5.c cVar) {
            h5.c cVar2 = cVar;
            cVar2.f81699b = true;
            t.a(cVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh5/c;", "it", "", "invoke", "(Lh5/c;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.l<h5.c, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f81759a = new c();

        public c() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(h5.c cVar) {
            cVar.W1();
            return Unit.INSTANCE;
        }
    }

    static {
        new a();
        f81756a = b.f81758a;
        f81757b = c.f81759a;
    }

    public static final boolean a(h5.c cVar) {
        b2 b2Var = k.g(cVar).P.f81684e;
        b2Var.getClass();
        return b2Var.f81697a;
    }
}
