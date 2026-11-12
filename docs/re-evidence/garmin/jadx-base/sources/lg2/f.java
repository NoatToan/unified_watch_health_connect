package lg2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.buttons.ButtonsViewModel$onSaveValueEstimationActivity$1", f = "ButtonsViewModel.kt", l = {169, 175}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f112312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f112313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f112314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f112314d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f112314d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r1.emit(r5, r6) == r0) goto L20;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f112313c;
        a aVar2 = this.f112314d;
        if (i14 == 0) {
            o13.r.b(obj);
            aVar2.B4().s(true);
            fg2.f fVarB4 = aVar2.B4();
            this.f112313c = 1;
            objJ = fVarB4.j(this);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objJ = ((o13.q) obj).f128597a;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar2 = this.f112312b;
            o13.r.b(obj);
        }
        aVar2.B4().s(false);
        a.z4(aVar2, false);
        return Unit.INSTANCE;
        int i15 = o13.q.f128596b;
        if (!(objJ instanceof o13.q.b)) {
            aVar2.B4().s(true);
            a.z4(aVar2, false);
        }
        if (o13.q.b(objJ) != null) {
            e2 e2Var = aVar2.f112266m;
            Boolean bool = Boolean.TRUE;
            this.f112311a = objJ;
            this.f112312b = aVar2;
            this.f112313c = 2;
        }
        return Unit.INSTANCE;
    }
}
