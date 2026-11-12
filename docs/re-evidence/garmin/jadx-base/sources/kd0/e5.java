package kd0;

import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/e5;", "Lcb1/b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e5 implements cb1.b {
    @Override // cb1.b
    public final long a(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Unit> interfaceC0995b) {
        userSettingsDTO.getClass();
        return cw.q.N().O(userSettingsDTO, jSONObject, interfaceC0995b);
    }

    @Override // cb1.b
    public final Long b() {
        Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
        rd2.f.a().f152045a.getClass();
        ArrayList<sd2.f> arrayListD = rd2.j.d();
        if (arrayListD == null || arrayListD.isEmpty()) {
            return null;
        }
        for (sd2.f fVar : arrayListD) {
            if (((zb0.u0) zb0.u0.f203782n6.get(fVar.getProductNumber())) == zb0.u0.P5) {
                return Long.valueOf(fVar.getUnitID());
            }
        }
        return null;
    }

    @Override // cb1.b
    public final Object c(qb1.k kVar) {
        return ((kp0.j) KoinJavaComponent.get$default(kp0.j.class, null, null, 6, null)).b(kVar);
    }

    @Override // cb1.b
    public final long d(qb1.f.c cVar) {
        return cw.q.N().M(cVar);
    }

    @Override // cb1.b
    public final UserSettingsDTO getUserSettings() {
        return GCMSettingManager.s();
    }
}
