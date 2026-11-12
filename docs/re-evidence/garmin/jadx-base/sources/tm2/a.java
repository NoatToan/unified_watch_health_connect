package tm2;

import com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto;
import com.garmin.device.sharing.management.dtos.RegisteredDeviceDtoJsonParser;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltm2/a;", "Lcom/garmin/device/sharing/management/dtos/RegisteredDeviceDtoJsonParser;", "<init>", "()V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements RegisteredDeviceDtoJsonParser {
    @Override // com.garmin.device.sharing.management.dtos.RegisteredDeviceDtoJsonParser
    public final IRegisteredDeviceDto fromJSONObject(JSONObject jSONObject) {
        jSONObject.getClass();
        try {
            return bm2.c.d(jSONObject);
        } catch (Exception unused) {
            return null;
        }
    }
}
