package cm2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "com.garmin.device.pairing.handlers.DualPairingRequestHandler$Companion$ProbeDualPairingCallback$sendFeatureMessages$1", f = "DualPairingRequestHandler.kt", l = {104}, m = "invokeSuspend")
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a.C0429a f27969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f27971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b.a.C0429a c0429a, String str, e23.a<Unit> aVar, d<? super a> dVar) {
        super(2, dVar);
        this.f27969b = c0429a;
        this.f27970c = str;
        this.f27971d = aVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f27969b, this.f27970c, this.f27971d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str = this.f27970c;
        b.a.C0429a c0429a = this.f27969b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f27968a;
        e23.a<Unit> aVar2 = this.f27971d;
        try {
            if (i14 == 0) {
                r.b(obj);
                if (!s.g(c0429a.f27978a, str)) {
                    b.f27973e.warn("Expected " + c0429a.f27978a + ", found " + str);
                }
                this.f27968a = 1;
                if (b.a.C0429a.f(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception unused) {
        } finally {
            aVar2.invoke();
        }
        return Unit.INSTANCE;
    }
}
