package nj2;

import androidx.lifecycle.y0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel$loadPhoneNumber$1", f = "CustomerManagementViewModel.kt", l = {352}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f126330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f126331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f126333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f126334e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a aVar, String str, boolean z14, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f126332c = aVar;
        this.f126333d = str;
        this.f126334e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f126332c, this.f126333d, this.f126334e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126331b;
        a aVar2 = this.f126332c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                aVar2.G4().debug("loadPhoneNumber");
                y0<fj2.h> y0Var2 = aVar2.f126265q;
                dj2.a aVar3 = aVar2.f126249a;
                String str = this.f126333d;
                this.f126330a = y0Var2;
                this.f126331b = 1;
                Object objN = aVar3.n(str, this);
                if (objN == aVar) {
                    return aVar;
                }
                y0Var = y0Var2;
                obj = objN;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = this.f126330a;
                o13.r.b(obj);
            }
            y0Var.m(obj);
            if (this.f126334e) {
                a.x4(aVar2);
            }
        } catch (Exception e4) {
            int i15 = a.A;
            aVar2.I4(e4);
        }
        return Unit.INSTANCE;
    }
}
