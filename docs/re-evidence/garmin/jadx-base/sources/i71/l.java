package i71;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001BC\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Li71/l;", "Ln70/a0;", "Lr53/i;", "Li71/x;", "Lj70/d;", "", "", "data", "Li71/a;", "getLatestTrainingStatusDataUseCase", "Li71/p;", "getTrainingStatusSummariesDataUseCase", "Lf12/l;", "userSettings", "Lfj1/b;", "primaryDeviceRepo", "<init>", "(Lr53/i;Li71/a;Li71/p;Lf12/l;Lfj1/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements a0<r53.i<? extends x>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<j70.d<List<String>>> f91976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f91977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f91978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.l f91979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fj1.b f91980e;

    public l(r53.i<j70.d<List<String>>> iVar, a aVar, p pVar, f12.l lVar, fj1.b bVar) {
        iVar.getClass();
        aVar.getClass();
        pVar.getClass();
        lVar.getClass();
        bVar.getClass();
        this.f91976a = iVar;
        this.f91977b = aVar;
        this.f91978c = pVar;
        this.f91979d = lVar;
        this.f91980e = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(l lVar, v13.c cVar) {
        e eVar;
        Integer primaryTrainingDeviceCount;
        lVar.getClass();
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f91958c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f91958c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(lVar, cVar);
            }
        } else {
            eVar = new e(lVar, cVar);
        }
        Object objA = eVar.f91956a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f91958c;
        if (i15 == 0) {
            o13.r.b(objA);
            fj1.b bVar = lVar.f91980e;
            eVar.f91958c = 1;
            objA = bVar.a(eVar);
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
        v2 v2Var = (v2) objA;
        int iIntValue = 0;
        if (v2Var instanceof v2.b) {
            gj1.e primaryTrainingDevices = ((gj1.f) ((v2.b) v2Var).f47386a).getPrimaryTrainingDevices();
            if (primaryTrainingDevices != null && (primaryTrainingDeviceCount = primaryTrainingDevices.getPrimaryTrainingDeviceCount()) != null) {
                iIntValue = primaryTrainingDeviceCount.intValue();
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strG = androidx.room.a0.g(((v2.a) v2Var).f47384b, "there is a problem in fetching primary device data ");
            p92.y.f136664a.getClass();
            p92.y.a.c("TrainingStatusViewModel", strG);
        }
        return new Integer(iIntValue);
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetTrainingStatusKeyStatsDataUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends x> invoke() {
        return r53.s.A(new f(this.f91976a, this), s0.f129406a);
    }
}
