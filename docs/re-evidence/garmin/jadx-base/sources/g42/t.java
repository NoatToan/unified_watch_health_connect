package g42;

import android.location.Address;
import androidx.lifecycle.t0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Landroid/location/Address;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationSelectionViewModel$getAddressFromDescription$1", f = "WeatherLocationSelectionViewModel.kt", l = {154, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<t0<Address>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f75832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f75833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f75833c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f75833c, dVar);
        tVar.f75832b = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(t0<Address> t0Var, t13.d<? super Unit> dVar) {
        return ((t) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f75832b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75831a;
        com.garmin.android.library.mapsdkadapter.i.d dVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        com.garmin.android.library.mapsdkadapter.g gVar = new com.garmin.android.library.mapsdkadapter.g(dVar, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        this.f75832b = t0Var;
        this.f75831a = 1;
        obj = gVar.f50285a.b(this.f75833c, this);
        if (obj != aVar) {
        }
        return aVar;
        Address address = (Address) h0.d0((List) obj);
        this.f75832b = null;
        this.f75831a = 2;
    }
}
