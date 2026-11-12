package of2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$notifyLap$1", f = "LSVSession.kt", l = {329, 330}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f131848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f131849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f131850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f131851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.b f131852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.b f131853f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b bVar, int i14, rf2.b bVar2, rf2.b bVar3, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f131850c = bVar;
        this.f131851d = i14;
        this.f131852e = bVar2;
        this.f131853f = bVar3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f131850c, this.f131851d, this.f131852e, this.f131853f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        if (r2.b(r8, r16) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131849b;
        rf2.b bVar = this.f131853f;
        rf2.b bVar2 = this.f131852e;
        b bVar3 = this.f131850c;
        if (i14 != 0) {
            if (i14 == 1) {
                b0Var = this.f131848a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        b0Var = (b0) bVar3.f131736o.getValue();
        sf2.e.c cVar = new sf2.e.c(this.f131851d, p13.x.k(bVar2, bVar));
        this.f131848a = b0Var;
        this.f131849b = 1;
        if (b0Var.d(cVar, this) != aVar) {
        }
        return aVar;
        sf2.a.e eVar = new sf2.a.e(b0Var.f131744a, b0Var.f131748e, b0Var.f131757n, b0Var.f131753j, p13.x.k(bVar2, bVar), b.a(bVar3), bVar3.f131722a.getValue().booleanValue());
        this.f131848a = null;
        this.f131849b = 2;
    }
}
