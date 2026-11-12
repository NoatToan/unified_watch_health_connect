package m80;

import android.companion.AssociationInfo;
import android.companion.CompanionDeviceManager;
import android.net.MacAddress;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.u;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ls0.v;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rd2.j;
import v13.i;
import zb0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.companion.data.CompanionDeviceRepositoryImpl$checkObservingDevicePresence$2", f = "CompanionDeviceRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f117139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CompanionDeviceManager f117140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f117141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f117142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CompanionDeviceManager companionDeviceManager, b bVar, boolean z14, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f117140b = companionDeviceManager;
        this.f117141c = bVar;
        this.f117142d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f117140b, this.f117141c, this.f117142d, dVar);
        cVar.f117139a = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14;
        MacAddress deviceMacAddress;
        b bVar = this.f117141c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            List myAssociations = this.f117140b.getMyAssociations();
            myAssociations.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = myAssociations.iterator();
            while (true) {
                String string = null;
                if (!it.hasNext()) {
                    break;
                }
                AssociationInfo associationInfoB = v.b(it.next());
                if (associationInfoB != null && (deviceMacAddress = associationInfoB.getDeviceMacAddress()) != null) {
                    string = deviceMacAddress.toString();
                }
                if (string != null) {
                    arrayList.add(string);
                }
            }
            int i14 = b.f117134f;
            Set<String> setL1 = bVar.f117137d.L1("companion_device_associations_observing");
            bVar.f117136c.f152045a.getClass();
            ArrayList<sd2.f> arrayListE = j.e();
            if (arrayListE == null) {
                return null;
            }
            boolean z15 = this.f117142d;
            for (sd2.f fVar : arrayListE) {
                fVar.getClass();
                String strC = k.c(fVar);
                if (strC != null) {
                    boolean z16 = true;
                    if (arrayList.isEmpty()) {
                        z14 = false;
                        break;
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z14 = false;
                            break;
                        }
                        if (u.q((String) it3.next(), strC, true)) {
                            z14 = true;
                            break;
                        }
                    }
                    Set<String> set = setL1;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator<T> it4 = set.iterator();
                        do {
                            if (!it4.hasNext()) {
                                z16 = false;
                                break;
                            }
                        } while (!u.q((String) it4.next(), strC, true));
                    } else {
                        z16 = false;
                        break;
                    }
                    if (z14 && (z15 || !z16)) {
                        i2.f36769a.getClass();
                        i2.a.b(a2.DEVICES, "CompanionDeviceRepository", "checkObservingDevicePresence() - Device with MAC address " + strC + " is linked but not observing presence, starting observation.");
                        bVar.h(strC);
                    }
                }
            }
            return Unit.INSTANCE;
        } catch (Exception e4) {
            a2 a2Var = a2.DEVICES;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "checkObservingDevicePresence() - Exception: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "CompanionDeviceRepository", strD);
            return Unit.INSTANCE;
        }
    }
}
