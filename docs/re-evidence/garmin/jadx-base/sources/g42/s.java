package g42;

import android.location.Address;
import androidx.lifecycle.t0;
import c22.z1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Landroid/location/Address;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationSelectionViewModel$getAddressFromCountryName$1", f = "WeatherLocationSelectionViewModel.kt", l = {131, 132}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<t0<Address>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f75829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f75830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f75830c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f75830c, dVar);
        sVar.f75829b = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(t0<Address> t0Var, t13.d<? super Unit> dVar) {
        return ((s) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r0.emit((android.location.Address) r6, r5) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f75829b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75828a;
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
        z1 z1Var = z1.f23762a;
        this.f75829b = t0Var;
        this.f75828a = 1;
        obj = z1Var.f(this.f75830c, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f75829b = null;
        this.f75828a = 2;
    }
}
