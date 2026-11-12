package lg2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.buttons.ButtonsViewModel$onDiscardClick$1", f = "ButtonsViewModel.kt", l = {202, 208}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f112303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f112304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f112305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f112305d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f112305d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r1.emit(r3, r6) == r0) goto L20;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objL;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f112304c;
        a aVar2 = this.f112305d;
        if (i14 == 0) {
            o13.r.b(obj);
            a.x4(aVar2, true);
            fg2.f fVarB4 = aVar2.B4();
            this.f112304c = 1;
            objL = fVarB4.l(this);
            if (objL != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objL = ((o13.q) obj).f128597a;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar2 = this.f112303b;
            o13.r.b(obj);
        }
        a.x4(aVar2, false);
        return Unit.INSTANCE;
        int i15 = o13.q.f128596b;
        if (!(objL instanceof o13.q.b)) {
            aVar2.B4().q(false);
            a.x4(aVar2, false);
        }
        if (o13.q.b(objL) != null) {
            e2 e2Var = aVar2.f112266m;
            Boolean bool = Boolean.TRUE;
            this.f112302a = objL;
            this.f112303b = aVar2;
            this.f112304c = 2;
        }
        return Unit.INSTANCE;
    }
}
