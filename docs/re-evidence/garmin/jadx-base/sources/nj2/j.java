package nj2;

import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel$loadCountries$1", f = "CustomerManagementViewModel.kt", l = {422}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f126324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f126325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f126326c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f126326c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126325b;
        a aVar2 = this.f126326c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                aVar2.G4().debug("loadCountries");
                aVar2.f126252d.setValue(Boolean.TRUE);
                y0<List<fj2.d>> y0Var2 = aVar2.f126266r;
                dj2.a aVar3 = aVar2.f126249a;
                this.f126324a = y0Var2;
                this.f126325b = 1;
                Object objL = aVar3.l(this);
                if (objL == aVar) {
                    return aVar;
                }
                y0Var = y0Var2;
                obj = objL;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = this.f126324a;
                o13.r.b(obj);
            }
            List<fj2.d> list = (List) obj;
            y0<List<o13.p<String, String>>> y0Var3 = aVar2.f126270x;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (fj2.d dVar : list) {
                arrayList.add(new o13.p(dVar.getCallingCode() + "-" + dVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String(), dVar.getCountryName() + " (+ " + dVar.getCallingCode() + ")"));
            }
            y0Var3.m(arrayList);
            aVar2.f126252d.setValue(Boolean.FALSE);
            y0Var.m(obj);
        } catch (Exception e4) {
            aVar2.f126252d.setValue(Boolean.FALSE);
            aVar2.I4(e4);
        }
        return Unit.INSTANCE;
    }
}
