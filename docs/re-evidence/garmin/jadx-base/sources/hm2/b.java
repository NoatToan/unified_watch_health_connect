package hm2;

import com.garmin.device.datatypes.DeviceProfile;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhm2/b;", "", "<init>", "()V", "a", "device-pairing-gdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {
    static {
        new a(null);
    }

    public final DeviceProfile a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            long j8 = jSONObject.getLong("unitId");
            int i14 = jSONObject.getInt("productNumber");
            String string = jSONObject.getString("deviceName");
            int i15 = jSONObject.getInt("softwareVersion");
            String string2 = jSONObject.getString("macAddress");
            int i16 = jSONObject.getInt("connectionType");
            JSONArray jSONArray = jSONObject.getJSONArray("configuration");
            HashSet hashSet = new HashSet();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                hashSet.add(Integer.valueOf(jSONArray.getInt(i17)));
            }
            return new DeviceProfile(j8, i14, string, i15, string2, i16, hashSet, jSONObject.optString("dualPairingMacAddress", null), jSONObject.getBoolean("supportsMultiLink"), jSONObject.getInt("bluetoothLimitation"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lhm2/b$a;", "", "<init>", "()V", "", "UNIT_ID", "Ljava/lang/String;", "PRODUCT_NUMBER", "DEVICE_NAME", "SOFTWARE_VERSION", "MAC_ADDRESS", "CONNECTION_TYPE", "CONFIGURATION", "DUAL_PAIRING_MAC_ADDRESS", "SUPPORTS_MULTI_LINK", "BLUETOOTH_LIMITATION", "device-pairing-gdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
