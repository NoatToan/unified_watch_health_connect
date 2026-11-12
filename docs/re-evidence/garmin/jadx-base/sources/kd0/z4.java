package kd0;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/z4;", "Lr71/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z4 implements r71.a {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r71.a
    public final Serializable a(v13.c cVar) {
        y4 y4Var;
        gj1.b bVar;
        List<gj1.b> listB;
        Object next;
        Long deviceId;
        if (cVar instanceof y4) {
            y4Var = (y4) cVar;
            int i14 = y4Var.f104460c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y4Var.f104460c = i14 - Integer.MIN_VALUE;
            } else {
                y4Var = new y4(this, cVar);
            }
        } else {
            y4Var = new y4(this, cVar);
        }
        Object objA = y4Var.f104458a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = y4Var.f104460c;
        if (i15 == 0) {
            o13.r.b(objA);
            fj1.b bVarA = fj1.b.a.a(fj1.b.f71828c);
            y4Var.f104460c = 1;
            objA = bVarA.a(y4Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objA;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            return null;
        }
        gj1.f fVar = (gj1.f) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        gj1.d primaryTrainingDeviceDTO = fVar.getPrimaryTrainingDeviceDTO();
        long jLongValue = (primaryTrainingDeviceDTO == null || (deviceId = primaryTrainingDeviceDTO.getDeviceId()) == null) ? -1L : deviceId.longValue();
        gj1.e primaryTrainingDevices = fVar.getPrimaryTrainingDevices();
        if (primaryTrainingDevices == null || (listB = primaryTrainingDevices.b()) == null) {
            bVar = null;
        } else {
            Iterator<T> it = listB.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Long deviceId2 = ((gj1.b) next).getDeviceId();
                if (deviceId2 != null && deviceId2.longValue() == jLongValue) {
                    break;
                }
            }
            bVar = (gj1.b) next;
        }
        Long deviceId3 = bVar != null ? bVar.getDeviceId() : null;
        String displayName = bVar != null ? bVar.getDisplayName() : null;
        if (deviceId3 == null || displayName == null) {
            return null;
        }
        return new o13.p(deviceId3, displayName);
    }
}
