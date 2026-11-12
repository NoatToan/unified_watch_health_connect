package hd0;

import com.garmin.proto.generated.WifiSetup;
import e23.p;
import java.util.ArrayList;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.wifi.WifiNetworksViewModel$forgetNetwork$1", f = "WifiNetworksViewModel.kt", l = {217}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f83327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WifiSetup.StoredAccessPoint f83328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, WifiSetup.StoredAccessPoint storedAccessPoint, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f83327b = bVar;
        this.f83328c = storedAccessPoint;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f83327b, this.f83328c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f83326a;
        WifiSetup.StoredAccessPoint storedAccessPoint = this.f83328c;
        b bVar = this.f83327b;
        if (i14 == 0) {
            r.b(obj);
            ArrayList arrayList = bVar.f83310c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!s.g(((WifiSetup.StoredAccessPoint) obj2).getSsid(), storedAccessPoint.getSsid())) {
                    arrayList2.add(obj2);
                }
            }
            this.f83326a = 1;
            obj = b.x4(bVar, arrayList2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        bVar.f83309b.j(new h.f(storedAccessPoint, ((Boolean) obj).booleanValue()));
        return Unit.INSTANCE;
    }
}
