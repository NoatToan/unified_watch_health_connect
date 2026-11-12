package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class g5h extends o4h<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hfl f18620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18621b;
    public final long c;
    public final long d;
    public final long e;
    public final TimeUnit f;

    public static final class a extends AtomicReference<jz6> implements jz6, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super Long> f18622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18623b;
        public long c;

        public a(z5h<? super Long> z5hVar, long j, long j2) {
            this.f18622a = z5hVar;
            this.c = j;
            this.f18623b = j2;
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
            if (isDisposed()) {
                return;
            }
            long j = this.c;
            this.f18622a.onNext(Long.valueOf(j));
            if (j != this.f18623b) {
                this.c = j + 1;
            } else {
                DisposableHelper.dispose(this);
                this.f18622a.onComplete();
            }
        }
    }

    public g5h(long j, long j2, long j3, long j4, TimeUnit timeUnit, hfl hflVar) {
        this.d = j3;
        this.e = j4;
        this.f = timeUnit;
        this.f18620a = hflVar;
        this.f18621b = j;
        this.c = j2;
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
        a aVar = new a(z5hVar, this.f18621b, this.c);
        z5hVar.onSubscribe(aVar);
        hfl hflVar = this.f18620a;
        if (!(hflVar instanceof nwp)) {
            aVar.a(hflVar.e(aVar, this.d, this.e, this.f));
            return;
        }
        hfl.c cVarB = hflVar.b();
        aVar.a(cVarB);
        cVarB.d(aVar, this.d, this.e, this.f);
    }
}
