package y90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import ok2.a0;
import ok2.g0;
import ok2.w;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.y;
import yr1.o;
import yr1.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ly90/h;", "", "Ly90/g;", "skipUserInitiatedFailedSyncUseCase", "<init>", "(Ly90/g;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {
    static {
        new a(null);
    }

    public h(g gVar) {
        gVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(q90.c cVar, boolean z14, v13.c cVar2) {
        i iVar;
        d90.f fVar;
        if (cVar2 instanceof i) {
            iVar = (i) cVar2;
            int i14 = iVar.f195288d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f195288d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar2);
            }
        } else {
            iVar = new i(this, cVar2);
        }
        Object objQ = iVar.f195286b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f195288d;
        if (i15 == 0) {
            r.b(objQ);
            l90.b bVar = cVar.f143495c;
            d90.f fVar2 = bVar.f111531p.f58441g;
            yl2.b bVar2 = bVar.f111530o;
            String str = cVar.f143494b;
            long j8 = cVar.f143493a;
            if (!yr1.e.d(str)) {
                yr1.e.a(j8, "TriggerDeviceSetupSyncUseCase");
                return z90.c.TRIGGERED;
            }
            u.f199129b.getClass();
            List<o> list = u.a.a(bVar2, z14).f199133a;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((o) it.next()).f199119a);
            }
            ok2.y.c cVar3 = ok2.y.f132805h;
            j0 j0Var = j0.f134944a;
            ok2.y.d dVar = ok2.y.d.FORCED;
            ok2.y yVarA = ok2.y.c.a(cVar3, j0Var, arrayList, dVar, dVar, 16);
            w wVarA = a0.f132585h.a().a(str);
            if (wVarA != null) {
                iVar.f195285a = fVar2;
                iVar.f195288d = 1;
                objQ = wVarA.q(yVarA, iVar);
                if (objQ == aVar) {
                    return aVar;
                }
                fVar = fVar2;
            }
            return z90.c.SKIPPED;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fVar = iVar.f195285a;
        r.b(objQ);
        al2.c cVar4 = (al2.c) objQ;
        if (cVar4 != null) {
            boolean zA = g.a(cVar4.f3775a.getF92741e(), cVar4);
            boolean z15 = (-cVar4.f3776b.ordinal()) < (-g0.USER_INITIATED_PREFERRED.ordinal());
            boolean z16 = fVar instanceof d90.f.C1248f;
            a2 a2Var = a2.DEVICE_SETUP;
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("startSyncProgress() request sync callback firmwareUpdateSync[", "] skipFailedSync[", "] lowPrioritySync[", z16, zA);
            sbM.append(z15);
            sbM.append("] status[");
            sbM.append(cVar4);
            sbM.append("]");
            String string = sbM.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var, "TriggerDeviceSetupSyncUseCase", string);
            if (z16 || !(zA || z15)) {
                i2.a.b(a2.BIC, "TriggerDeviceSetupSyncUseCase", "startSyncProgress() -> Sync started successfully");
                return z90.c.TRIGGERED;
            }
            i2.a.b(a2.BIC, "TriggerDeviceSetupSyncUseCase", "startSyncProgress() -> Skip for Sync 2.0 and proceed to next step");
            return z90.c.SKIPPED;
        }
        return z90.c.SKIPPED;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly90/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
