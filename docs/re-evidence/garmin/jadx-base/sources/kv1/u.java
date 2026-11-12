package kv1;

import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusDeviceDTO;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lkv1/u;", "", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusDeviceDTO;", "a", "()Lo53/i0;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface u {
    @i83.f("/userpreference-service/TrainingStatus.last.device")
    i0<c83.a0<TrainingStatusDeviceDTO>> a();
}
