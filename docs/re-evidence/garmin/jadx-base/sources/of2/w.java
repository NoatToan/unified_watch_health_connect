package of2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$notifyWorkoutStep$1", f = "LSVSession.kt", l = {351, 360}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f131940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f131941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f131942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f131943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f131944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f131945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.b f131946g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b bVar, String str, int i14, int i15, rf2.b bVar2, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f131942c = bVar;
        this.f131943d = str;
        this.f131944e = i14;
        this.f131945f = i15;
        this.f131946g = bVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f131942c, this.f131943d, this.f131944e, this.f131945f, this.f131946g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r1.b(r6, r14) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131941b;
        rf2.b bVar = this.f131946g;
        b bVar2 = this.f131942c;
        if (i14 != 0) {
            if (i14 == 1) {
                b0Var = this.f131940a;
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
        b0Var = (b0) bVar2.f131736o.getValue();
        sf2.e.k kVar = new sf2.e.k(this.f131943d, this.f131944e, this.f131945f, p13.w.c(bVar));
        this.f131940a = b0Var;
        this.f131941b = 1;
        if (b0Var.d(kVar, this) != aVar) {
        }
        return aVar;
        sf2.a.e eVar = new sf2.a.e(b0Var.f131744a, b0Var.f131748e, b0Var.f131757n, b0Var.f131753j, p13.w.c(bVar), b.a(bVar2), bVar2.f131722a.getValue().booleanValue());
        this.f131940a = null;
        this.f131941b = 2;
    }
}
