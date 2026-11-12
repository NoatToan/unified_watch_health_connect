package q31;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import hk1.a0;
import java.util.List;
import nk1.o;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lhk1/a0;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.komoot.KomootViewModel$getUserPartnerConnection$1", f = "KomootViewModel.kt", l = {12}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super v2<? extends List<? extends a0>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f142424b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f142424b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f142424b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends List<? extends a0>>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142423a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        nk1.g gVar = (nk1.g) this.f142424b.f142425a.getValue();
        this.f142423a = 1;
        gVar.getClass();
        Object objJ = f0.J(gVar, new o(gVar, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
