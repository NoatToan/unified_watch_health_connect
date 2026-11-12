package xn1;

import c83.a0;
import com.garmin.android.apps.connectmobile.smartscale.model.WeightScaleServiceResponseDTO;
import com.garmin.android.apps.connectmobile.smartscale.model.WeightScaleUserInfoDTO;
import i83.f;
import i83.p;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\nH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lxn1/a;", "", "", "deviceId", "Lo53/i0;", "Lc83/a0;", "", "", "b", "(J)Lo53/i0;", "Lcom/garmin/android/apps/connectmobile/smartscale/model/WeightScaleUserInfoDTO;", "a", "(Ljava/lang/String;)Lo53/i0;", "weightScaleUserInfoDTO", "Lcom/garmin/android/apps/connectmobile/smartscale/model/WeightScaleServiceResponseDTO;", "c", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/smartscale/model/WeightScaleUserInfoDTO;)Lo53/i0;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/weightscale-service/weightscale/{deviceId}/user-info")
    i0<a0<WeightScaleUserInfoDTO>> a(@s("deviceId") String deviceId);

    @f("/weightscale-service/weightscale/{deviceId}/shortnames")
    i0<a0<List<String>>> b(@s("deviceId") long deviceId);

    @p("/weightscale-service/weightscale/{deviceId}/user-info")
    i0<a0<WeightScaleServiceResponseDTO>> c(@s("deviceId") String deviceId, @i83.a WeightScaleUserInfoDTO weightScaleUserInfoDTO);
}
