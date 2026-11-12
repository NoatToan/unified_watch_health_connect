package dm;

import com.garmin.android.apps.connectmobile.devices.model.DeviceAppInfoDTO;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm/r;", "Liu1/i;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceAppInfoDTO;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r implements iu1.i<DeviceAppInfoDTO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f60406a;

    public r(o oVar) {
        this.f60406a = oVar;
    }

    @Override // iu1.i
    public final void b(List<? extends DeviceAppInfoDTO> list) {
        if (list.isEmpty()) {
            return;
        }
        ((aq.d) this.f60406a.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f11883e = (list.size() == 1 || ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).g(list.get(0).f33853a)) ? list.get(0) : list.get(1);
    }
}
