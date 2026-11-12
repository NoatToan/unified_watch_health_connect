package nj2;

import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel$deleteAddress$1", f = "CustomerManagementViewModel.kt", l = {562}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f126298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f126299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f126301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f126302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, String str, String str2, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f126300c = aVar;
        this.f126301d = str;
        this.f126302e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f126300c, this.f126301d, this.f126302e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126299b;
        a aVar2 = this.f126300c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                aVar2.G4().debug("deleteAddress");
                aVar2.f126252d.setValue(Boolean.TRUE);
                String str = this.f126301d;
                if (str != null) {
                    ge1.b.T(v1.a(aVar2), null, null, new d(aVar2, str, null), 3);
                }
                y0<Boolean> y0Var2 = aVar2.f126259k;
                dj2.a aVar3 = aVar2.f126249a;
                String str2 = this.f126302e;
                this.f126298a = y0Var2;
                this.f126299b = 1;
                Object objE = aVar3.e(str2, this);
                if (objE == aVar) {
                    return aVar;
                }
                y0Var = y0Var2;
                obj = objE;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = this.f126298a;
                o13.r.b(obj);
            }
            y0Var.j(obj);
            aVar2.f126252d.setValue(Boolean.FALSE);
        } catch (Exception e4) {
            c2 c2Var = aVar2.f126252d;
            Boolean bool = Boolean.FALSE;
            c2Var.setValue(bool);
            aVar2.f126259k.j(bool);
            aVar2.I4(e4);
        }
        return Unit.INSTANCE;
    }
}
