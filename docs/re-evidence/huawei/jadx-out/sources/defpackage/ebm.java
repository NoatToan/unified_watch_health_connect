package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.wifi.entity.builder.BaseBuilder;
import com.huawei.health.device.wifi.entity.utils.JsonParser;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ebm extends BaseBuilder {
    private static final long serialVersionUID = 1486107962578854578L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ebr f32680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient ebo f32681c;

    public ebm(ebr ebrVar, String str, String str2) {
        this.f32680b = null;
        super.setUri("/cloudSetup");
        super.setDefaultTime(5000L);
        this.f32680b = ebrVar;
        ebo eboVar = new ebo();
        this.f32681c = eboVar;
        eboVar.e(str, str2);
    }

    @Override // com.huawei.health.device.wifi.entity.builder.BaseBuilder
    public String makeRequestStream() {
        HashMap map = new HashMap(16);
        ebr ebrVar = this.f32680b;
        if (ebrVar == null) {
            return "";
        }
        if (ebrVar.e() != null) {
            map.put("code", this.f32680b.e());
        }
        if (this.f32680b.c() != null) {
            map.put("devId", this.f32680b.c());
        }
        if (this.f32680b.d() != null) {
            map.put("psk", this.f32680b.d());
        }
        if (this.f32680b.b() != null) {
            map.put("cloudUrl", this.f32680b.b());
        }
        String string = JsonParser.a(map).toString();
        dyg.e(true, "CoapIdentifyAdvancedCodeBuilder", "encryption String: ", string);
        dyg.e(true, "CoapIdentifyAdvancedCodeBuilder", "makeRequestStream: ", "");
        return string;
    }

    @Override // com.huawei.health.device.wifi.entity.builder.BaseBuilder
    public ebl makeResponseEntity(String str) {
        Map<String, Object> mapA;
        ebr ebrVar = new ebr();
        if (!TextUtils.isEmpty(str) && (mapA = JsonParser.a(str)) != null && mapA.containsKey("errcode")) {
            try {
                ebrVar.a(Integer.parseInt(mapA.get("errcode").toString()));
                return ebrVar;
            } catch (NumberFormatException e) {
                dyg.c(true, "CoapIdentifyAdvancedCodeBuilder", e.getMessage());
            }
        }
        return ebrVar;
    }

    public ebo a() {
        return this.f32681c;
    }
}
