package w53;

import e23.p;
import java.util.concurrent.CancellationException;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q03.m;
import r53.j;
import v13.i;
import vb.h;
import w3.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", l = {110}, m = "invokeSuspend")
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f182773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f182774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r53.i<Object> f182775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Object> f182776d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m<T> f182777a;

        public a(m<T> mVar) {
            this.f182777a = mVar;
        }

        @Override // r53.j
        public final Object emit(T t7, t13.d<? super Unit> dVar) {
            d13.c.a aVar = (d13.c.a) this.f182777a;
            if (t7 == null) {
                aVar.a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (!aVar.b()) {
                aVar.f57127a.c(t7);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r53.i<Object> iVar, m<Object> mVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f182775c = iVar;
        this.f182776d = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f182775c, this.f182776d, dVar);
        eVar.f182774b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        Throwable th3;
        d13.c.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f182773a;
        m<Object> mVar = this.f182776d;
        if (i14 == 0) {
            r.b(obj);
            b0 b0Var2 = (b0) this.f182774b;
            try {
                r53.i<Object> iVar = this.f182775c;
                a aVar3 = new a(mVar);
                this.f182774b = b0Var2;
                this.f182773a = 1;
                if (iVar.collect(aVar3, this) == aVar2) {
                    return aVar2;
                }
                b0Var = b0Var2;
            } catch (Throwable th4) {
                b0Var = b0Var2;
                th3 = th4;
                if (!(th3 instanceof CancellationException)) {
                    aVar = (d13.c.a) mVar;
                    if (!aVar.b()) {
                        aVar.f57127a.onComplete();
                    }
                } else if (!((d13.c.a) mVar).c(th3)) {
                    x.o(th3, b0Var.getF195311f());
                }
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b0Var = (b0) this.f182774b;
            try {
                r.b(obj);
            } catch (Throwable th5) {
                th3 = th5;
                if (!(th3 instanceof CancellationException)) {
                    aVar = (d13.c.a) mVar;
                    if (!aVar.b()) {
                        try {
                            aVar.f57127a.onComplete();
                        } finally {
                            v03.c.a(aVar);
                        }
                    }
                } else if (!((d13.c.a) mVar).c(th3)) {
                    x.o(th3, b0Var.getF195311f());
                }
            }
        }
        d13.c.a aVar4 = (d13.c.a) mVar;
        if (!aVar4.b()) {
            try {
                aVar4.f57127a.onComplete();
            } finally {
                v03.c.a(aVar4);
            }
        }
        return Unit.INSTANCE;
    }
}
