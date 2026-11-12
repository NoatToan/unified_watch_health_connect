package lg2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.buttons.ButtonsViewModel$onCompleteSkippedWorkoutStepsClick$1", f = "ButtonsViewModel.kt", l = {220, 222}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f112298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f112299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f112300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f112301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, boolean z14, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f112300d = aVar;
        this.f112301e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f112300d, this.f112301e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r1.emit(r5, r6) == r0) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objK;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f112299c;
        a aVar2 = this.f112300d;
        if (i14 == 0) {
            o13.r.b(obj);
            fg2.f fVarB4 = aVar2.B4();
            this.f112299c = 1;
            objK = fVarB4.k(this.f112301e, this);
            if (objK != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objK = ((o13.q) obj).f128597a;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar2 = this.f112298b;
            o13.r.b(obj);
        }
        aVar2.B4().r(true);
        return Unit.INSTANCE;
        if (o13.q.b(objK) != null) {
            e2 e2Var = aVar2.f112266m;
            Boolean bool = Boolean.TRUE;
            this.f112297a = objK;
            this.f112298b = aVar2;
            this.f112299c = 2;
        }
        return Unit.INSTANCE;
    }
}
