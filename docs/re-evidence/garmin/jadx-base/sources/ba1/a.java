package ba1;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import e23.l;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f16968b;

    public /* synthetic */ a(d dVar, int i14) {
        this.f16967a = i14;
        this.f16968b = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        List<n91.a> value;
        ArrayList arrayList;
        switch (this.f16967a) {
            case 0:
                n91.a aVar = (n91.a) obj;
                aVar.getClass();
                d dVar = this.f16968b;
                dVar.G4(aVar);
                dVar.D = true;
                break;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                d dVar2 = this.f16968b;
                z1<List<n91.a>> z1Var = dVar2.f16989o;
                do {
                    value = z1Var.getValue();
                    arrayList = new ArrayList();
                    for (Object obj2 : value) {
                        n91.a aVar2 = (n91.a) obj2;
                        if (!aVar2.r() || aVar2.getTypeId() != jLongValue) {
                            arrayList.add(obj2);
                        }
                    }
                } while (!z1Var.b(value, arrayList));
                dVar2.L4();
                dVar2.D = true;
                break;
            default:
                f.a aVar3 = (f.a) obj;
                aVar3.getClass();
                d dVar3 = this.f16968b;
                dVar3.getClass();
                if (aVar3.f67585a == -1) {
                    l2.a aVar4 = l2.f37135b;
                    Intent intent = aVar3.f67586b;
                    aVar4.getClass();
                    Bundle bundleA = l2.a.a(intent);
                    boolean z14 = false;
                    if (bundleA != null && bundleA.getBoolean("GCM_extra_activity_deleted", false)) {
                        z14 = true;
                    }
                    if ((bundleA != null && bundleA.containsKey("GCM_extra_activity_metadata")) || z14) {
                        dVar3.H4();
                        r91.k kVar = dVar3.f16985k;
                        q91.d dVar4 = kVar.f151434h;
                        com.garmin.android.apps.connectmobile.repcounting.model.f fVar = kVar.f151435i;
                        e23.a<Unit> aVar5 = kVar.f151436j;
                        if (dVar4 != null && fVar != null && aVar5 != null) {
                            ge1.b.T(kVar.f151429c, null, null, new r91.j(kVar, dVar4, fVar, aVar5, null), 3);
                        }
                        dVar3.D = true;
                        i2.a aVar6 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar6.getClass();
                        i2.a.a(a2Var, "Activity was edited or deleted, refreshing personal records data.");
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
