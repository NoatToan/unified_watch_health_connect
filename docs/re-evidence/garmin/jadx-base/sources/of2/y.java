package of2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$notifyWorkoutTarget$1", f = "LSVSession.kt", l = {380, 381}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f131958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f131959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f131960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f131961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.b f131962e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b bVar, String str, rf2.b bVar2, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f131960c = bVar;
        this.f131961d = str;
        this.f131962e = bVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f131960c, this.f131961d, this.f131962e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (r1.b(r6, r14) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131959b;
        rf2.b bVar = this.f131962e;
        b bVar2 = this.f131960c;
        if (i14 == 0) {
            o13.r.b(obj);
            b0Var = (b0) bVar2.f131736o.getValue();
            sf2.e.n nVar = new sf2.e.n(this.f131961d, p13.w.c(bVar));
            this.f131958a = b0Var;
            this.f131959b = 1;
            if (b0Var.d(nVar, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            b0Var = this.f131958a;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        sf2.a.e eVar = new sf2.a.e(b0Var.f131744a, b0Var.f131748e, b0Var.f131757n, b0Var.f131753j, p13.w.c(bVar), b.a(bVar2), bVar2.f131722a.getValue().booleanValue());
        this.f131958a = null;
        this.f131959b = 2;
    }
}
