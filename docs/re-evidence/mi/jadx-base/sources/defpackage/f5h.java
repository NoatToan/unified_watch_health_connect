package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class f5h extends o4h<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hfl f17429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17430b;
    public final long c;
    public final TimeUnit d;

    public static final class a extends AtomicReference<jz6> implements jz6, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super Long> f17431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f17432b;

        public a(z5h<? super Long> z5hVar) {
            this.f17431a = z5hVar;
        }

        public void a(jz6 jz6Var) {
            DisposableHelper.setOnce(this, jz6Var);
        }

        @Override // defpackage.jz6
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != DisposableHelper.DISPOSED) {
                z5h<? super Long> z5hVar = this.f17431a;
                long j = this.f17432b;
                this.f17432b = 1 + j;
                z5hVar.onNext(Long.valueOf(j));
            }
        }
    }

    public f5h(long j, long j2, TimeUnit timeUnit, hfl hflVar) {
        this.f17430b = j;
        this.c = j2;
        this.d = timeUnit;
        this.f17429a = hflVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.o4h
    public void R(z5h<? super Long> z5hVar) {
        a aVar = new a(z5hVar);
        z5hVar.onSubscribe(aVar);
        hfl hflVar = this.f17429a;
        if (!(hflVar instanceof nwp)) {
            aVar.a(hflVar.e(aVar, this.f17430b, this.c, this.d));
            return;
        }
        hfl.c cVarB = hflVar.b();
        aVar.a(cVarB);
        cVarB.d(aVar, this.f17430b, this.c, this.d);
    }
}
