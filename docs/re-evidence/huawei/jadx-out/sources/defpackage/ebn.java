package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.wifi.entity.builder.BaseBuilder;
import com.huawei.health.device.wifi.entity.utils.JsonParser;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class ebn extends BaseBuilder {
    private static final long serialVersionUID = -3512139991530124788L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ebq f32682c;

    public ebn(ebq ebqVar) {
        this.f32682c = null;
        super.setUri("/.sys/sessMngr");
        super.setDefaultTime(30000L);
        this.f32682c = ebqVar;
    }

    @Override // com.huawei.health.device.wifi.entity.builder.BaseBuilder
    public String makeRequestStream() {
        HashMap map = new HashMap(4);
        ebq ebqVar = this.f32682c;
        if (ebqVar == null) {
            return "";
        }
        map.put("type", ebqVar.e());
        map.put("modeSupport", this.f32682c.b());
        map.put("sn1", String.valueOf(this.f32682c.d()));
        map.put("seq", this.f32682c.c());
        String string = JsonParser.a(map).toString();
        LogUtil.a("CoapSessionInterfaceBuilder", "makeRequestStream: result is ", string);
        return string;
    }

    @Override // com.huawei.health.device.wifi.entity.builder.BaseBuilder
    public ebl makeResponseEntity(String str) {
        LogUtil.d("CoapSessionInterfaceBuilder", "makeResponseEntity: stream 1 is ", a(str));
        ebs ebsVar = new ebs();
        if (str != null && str.length() > 0) {
            Map<String, Object> mapA = JsonParser.a(str);
            try {
                if (mapA.containsKey("errcode")) {
                    Object obj = mapA.get("errcode");
                    if (obj instanceof Integer) {
                        ebsVar.c((Integer) obj);
                    } else {
                        LogUtil.j("CoapSessionInterfaceBuilder", "errorCodeObj not instanceof Integer");
                    }
                }
                if (mapA.containsKey("sessId")) {
                    Object obj2 = mapA.get("sessId");
                    if (obj2 instanceof String) {
                        ebsVar.d((String) obj2);
                    } else {
                        LogUtil.j("CoapSessionInterfaceBuilder", "sessIdObj not instanceof String");
                    }
                }
                a(ebsVar, mapA);
            } catch (ClassCastException unused) {
                LogUtil.e("CoapSessionInterfaceBuilder", "makeResponseEntity catch ClassCastException");
            }
            return ebsVar;
        }
        LogUtil.j("CoapSessionInterfaceBuilder", "makeResponseEntity stream is null");
        return ebsVar;
    }

    private void a(ebs ebsVar, Map<String, Object> map) {
        if (map.containsKey("modeResp")) {
            Object obj = map.get("modeResp");
            if (obj instanceof Integer) {
                ebsVar.b((Integer) obj);
            } else {
                LogUtil.j("CoapSessionInterfaceBuilder", "modeRespObj not instanceof Integer");
            }
        }
        if (map.containsKey("sn2")) {
            Object obj2 = map.get("sn2");
            if (obj2 instanceof String) {
                ebsVar.c((String) obj2);
            } else {
                LogUtil.j("CoapSessionInterfaceBuilder", "sn2Obj not instanceof String");
            }
        }
        if (map.containsKey("seq")) {
            Object obj3 = map.get("seq");
            if (obj3 instanceof Integer) {
                ebsVar.c(Long.valueOf(((Integer) obj3).intValue()));
            } else {
                LogUtil.j("CoapSessionInterfaceBuilder", "seqObj not instanceof Integer");
            }
        }
        if (map.containsKey("dtlsPort")) {
            Object obj4 = map.get("dtlsPort");
            if (obj4 instanceof Integer) {
                ebsVar.e((Integer) obj4);
            } else {
                LogUtil.j("CoapSessionInterfaceBuilder", "dtlsPortObj not instanceof Integer");
            }
        }
    }

    public static String a(String str) {
        return !TextUtils.isEmpty(str) ? Pattern.compile(System.lineSeparator()).matcher(str).replaceAll("") : "";
    }
}
