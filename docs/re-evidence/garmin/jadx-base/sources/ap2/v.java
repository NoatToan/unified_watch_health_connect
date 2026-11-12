package ap2;

import androidx.lifecycle.y0;
import ch.qos.logback.classic.Logger;
import ds.e0;
import java.util.Comparator;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$loadRequiredFieldsForNfcVerification$1", f = "FitPayAddCardViewModel.kt", l = {575}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f11790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11791c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((ep2.g) t7).getName(), ((ep2.g) t14).getName());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(h hVar, String str, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f11790b = hVar;
        this.f11791c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f11790b, this.f11791c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ep2.k fitPayNfcTokenDTO;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11789a;
        h hVar = this.f11790b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                h.a.a(h.f11695y).debug("loadRequiredFieldsForNfcVerification");
                g1 g1Var = hVar.E4().f205979a;
                String str = this.f11791c;
                this.f11789a = 1;
                Logger logger = g1.f205525n;
                obj = g1Var.J(str, null, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            ep2.j fitPayTemplatesDTO = ((ep2.f) obj).getFitPayTemplatesDTO();
            List<ep2.g> listB = (fitPayTemplatesDTO == null || (fitPayNfcTokenDTO = fitPayTemplatesDTO.getFitPayNfcTokenDTO()) == null) ? null : fitPayNfcTokenDTO.b();
            List<ep2.g> listN0 = listB != null ? h0.N0(listB, new a()) : null;
            y0<List<ep2.g>> y0Var = hVar.f11712p;
            if (listN0 == null) {
                listN0 = j0.f134944a;
            }
            y0Var.j(listN0);
        } catch (Exception e4) {
            e0.v("loadRequiredFieldsForNfcVerification: exception: ", e4.getMessage(), h.a.a(h.f11695y));
            hVar.f11698b.j(e4.getMessage());
        }
        return Unit.INSTANCE;
    }
}
