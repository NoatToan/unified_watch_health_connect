package vr2;

import androidx.lifecycle.y0;
import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.x;
import zn2.g1;
import zn2.q3;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.PaymentCardDetailsViewModel$checkAvailableSpace$1", f = "PaymentCardDetailsViewModel.kt", l = {WalletConstants.ERROR_CODE_UNKNOWN}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f179622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f179623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f179624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zq2.g f179625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, zq2.g gVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f179624c = iVar;
        this.f179625d = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f179624c, this.f179625d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i14;
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f179623b;
        if (i15 == 0) {
            o13.r.b(obj);
            q3 q3Var = new q3();
            i iVar = this.f179624c;
            g1 g1Var = iVar.f179607j;
            List<fs2.a> listH = g1Var != null ? g1Var.f205527b.f205521a.h() : null;
            if (listH == null) {
                listH = j0.f134944a;
            }
            zq2.g gVar = this.f179625d;
            if (listH == null || !listH.isEmpty()) {
                i14 = 0;
                for (fs2.a aVar2 : listH) {
                    if (aVar2.f73431f == iVar.f179600c && aVar2.f73428c == gVar.f206687h && (i14 = i14 + 1) < 0) {
                        x.p();
                        throw null;
                    }
                }
            } else {
                i14 = 0;
            }
            int i16 = i14 == 0 ? gVar.f206688i : gVar.f206689j;
            y0<q3.a> y0Var2 = iVar.f179612o;
            if (y0Var2 == null) {
                s.m("isSpaceAvailable");
                throw null;
            }
            long j8 = iVar.f179600c;
            this.f179622a = y0Var2;
            this.f179623b = 1;
            obj = q3Var.a(j8, i16, this);
            if (obj == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f179622a;
            o13.r.b(obj);
        }
        y0Var.j(obj);
        return Unit.INSTANCE;
    }
}
