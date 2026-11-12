package defpackage;

import com.huawei.health.device.wifi.entity.builder.BaseBuilder;
import com.huawei.health.device.wifi.entity.utils.JsonParser;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class ebk extends BaseBuilder {
    private static final long serialVersionUID = -2154071061393944584L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ebt f32678b;

    public ebk(ebt ebtVar) {
        this.f32678b = null;
        super.setUri("/.well-known/core?st=cloudSetup");
        super.setDefaultTime(5000L);
        this.f32678b = ebtVar;
    }

    @Override // com.huawei.health.device.wifi.entity.builder.BaseBuilder
    public String makeRequestStream() {
        HashMap map = new HashMap(16);
        ebt ebtVar = this.f32678b;
        if (ebtVar == null) {
            return "";
        }
        if (ebtVar.d() != null) {
            map.put(ProfileRequestConstants.HIV, this.f32678b.d());
        }
        if (this.f32678b.b() != null) {
            map.put("sn1", this.f32678b.b());
        }
        return JsonParser.a(map).toString();
    }

    @Override // com.huawei.health.device.wifi.entity.builder.BaseBuilder
    public ebl makeResponseEntity(String str, String str2) {
        dyg.e(false, "CoapDeviceInfoBuilder", "makeResponseEntity: stream is ", str);
        return parseResponseEntity(str, str2);
    }

    @Override // com.huawei.health.device.wifi.entity.builder.BaseBuilder
    public ebl makeResponseEntity(String str) {
        dyg.e(false, "CoapDeviceInfoBuilder", "makeResponseEntity: stream is ", str);
        return parseResponseEntity(str);
    }
}
