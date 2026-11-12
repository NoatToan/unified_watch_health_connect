package ty1;

import android.location.Address;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.TIReviewEntriesFragment$getLocationNameFromLocation$1", f = "TIReviewEntriesFragment.kt", l = {2021}, m = "invokeSuspend", v = 2)
public final class l2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f167173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f167174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 f167175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.f f167176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var, com.garmin.android.library.mapsdkadapter.f fVar, t13.d<? super l2> dVar) {
        super(2, dVar);
        this.f167175c = a0Var;
        this.f167176d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l2 l2Var = new l2(this.f167175c, this.f167176d, dVar);
        l2Var.f167174b = obj;
        return l2Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f167174b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f167173a;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var = this.f167175c;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
            AddTIEventViewModel addTIEventViewModelF6 = a0Var.F6();
            this.f167174b = b0Var;
            this.f167173a = 1;
            obj = addTIEventViewModelF6.i5(this.f167176d, this);
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
        Address address = (Address) obj;
        if (address != null) {
            String locality = address.getLocality();
            if (locality != null) {
                String adminArea = address.getAdminArea();
                if (adminArea != null) {
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                    a0Var.F6().J6(locality + ", " + adminArea);
                } else {
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                    a0Var.F6().J6(locality);
                }
            } else {
                String adminArea2 = address.getAdminArea();
                if (adminArea2 != null) {
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                    a0Var.F6().J6(adminArea2);
                } else {
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                    a0Var.F6().J6(address.toString());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
