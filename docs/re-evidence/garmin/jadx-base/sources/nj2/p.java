package nj2;

import androidx.lifecycle.y0;
import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel$loadUpdatedAddresses$1", f = "CustomerManagementViewModel.kt", l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f126347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f126348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a aVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f126349c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f126349c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126348b;
        a aVar2 = this.f126349c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                aVar2.G4().debug("loadUpdatedAddresses");
                aVar2.f126252d.setValue(Boolean.TRUE);
                y0<List<fj2.a>> y0Var2 = aVar2.f126264p;
                dj2.a aVar3 = aVar2.f126249a;
                this.f126347a = y0Var2;
                this.f126348b = 1;
                Object objI = aVar3.i(this);
                if (objI == aVar) {
                    return aVar;
                }
                y0Var = y0Var2;
                obj = objI;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = this.f126347a;
                o13.r.b(obj);
            }
            y0Var.m(obj);
            aVar2.f126252d.setValue(Boolean.FALSE);
        } catch (Exception e4) {
            aVar2.f126252d.setValue(Boolean.FALSE);
            aVar2.I4(e4);
        }
        return Unit.INSTANCE;
    }
}
