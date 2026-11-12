package en2;

import c83.a0;
import com.garmin.device.sharing.management.dtos.DeviceConnectionInfoDto;
import i83.f;
import i83.p;
import i83.s;
import java.util.List;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\bH§@¢\u0006\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Len2/a;", "", "", "deviceId", "", "connectionType", "Lokhttp3/RequestBody;", "info", "Lc83/a0;", "", "b", "(JLjava/lang/String;Lokhttp3/RequestBody;Lt13/d;)Ljava/lang/Object;", "", "Lcom/garmin/device/sharing/management/dtos/DeviceConnectionInfoDto;", "a", "(Lt13/d;)Ljava/lang/Object;", "Lokhttp3/ResponseBody;", "c", "shared-device-management-retrofit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {
    @f("/device-service/bluetooth-connections")
    Object a(d<? super a0<List<DeviceConnectionInfoDto>>> dVar);

    @p("/device-service/bluetooth-connections/{device_id}/{connection_type}")
    Object b(@s(encoded = true, value = "device_id") long j8, @s(encoded = true, value = "connection_type") String str, @i83.a RequestBody requestBody, d<? super a0<Unit>> dVar);

    @f("/device-service/deviceregistration/devices")
    Object c(d<? super a0<ResponseBody>> dVar);
}
