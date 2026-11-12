package mz1;

import android.location.Address;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$getLocationNameFromLocation$1", f = "AddTIEventViewModel.kt", l = {3041}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.f f121836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AddTIEventViewModel addTIEventViewModel, com.garmin.android.library.mapsdkadapter.f fVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f121835c = addTIEventViewModel;
        this.f121836d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f121835c, this.f121836d, dVar);
        mVar.f121834b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f121834b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121833a;
        AddTIEventViewModel addTIEventViewModel = this.f121835c;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f121834b = b0Var;
            this.f121833a = 1;
            obj = addTIEventViewModel.i5(this.f121836d, this);
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
                    addTIEventViewModel.J6(locality + ", " + adminArea);
                } else {
                    addTIEventViewModel.J6(locality);
                }
            } else {
                String adminArea2 = address.getAdminArea();
                if (adminArea2 != null) {
                    addTIEventViewModel.J6(adminArea2);
                } else {
                    addTIEventViewModel.J6(address.toString());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
