package defpackage;

import com.huawei.health.device.wifi.entity.builder.BaseBuilder;
import com.huawei.health.device.wifi.entity.model.Entity;

/* JADX INFO: loaded from: classes7.dex */
public class ebg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BaseBuilder f32668a = null;

    public void b(ebt ebtVar, Entity.EntityResponseCallback entityResponseCallback) {
        this.f32668a = new ebk(ebtVar);
        ebx.d(ecn.c("238"));
        dyg.e(true, "CoapsDeviceApi", "createSessionInterface: body = ", this.f32668a.makeRequestStream());
        ebx.d(this.f32668a, entityResponseCallback);
    }

    public void e(String str, ebq ebqVar, Entity.EntityResponseCallback entityResponseCallback) {
        this.f32668a = new ebn(ebqVar);
        ebx.d(str);
        dyg.e(true, "CoapsDeviceApi", "createSessionInterface: ip = ", str, "; body = ", this.f32668a.makeRequestStream());
        ebx.b(this.f32668a, entityResponseCallback);
    }

    public void b(ebr ebrVar, String str, Long l, int i) {
        this.f32668a = new ebp(ebrVar, str, l, i);
    }

    public void c(String str, String str2, String str3, Entity.EntityResponseCallback entityResponseCallback) {
        ((ebp) this.f32668a).e(str2, str3);
        ebx.d(str);
        dyg.e(true, "CoapsDeviceApi", "writeIdentifyCode: ip = ", str, "; body = ", this.f32668a.makeRequestByte());
        ebx.e(this.f32668a, entityResponseCallback);
    }

    public void b(String str, ebr ebrVar, String str2, String str3) {
        ebm ebmVar = new ebm(ebrVar, str2, str3);
        ebx.d(str);
        this.f32668a = ebmVar;
        dyg.e(true, "CoapsDeviceApi", "writeAdvancedIdentifyCode: ip = ", str, "; body = ", ebmVar.makeRequestStream());
    }

    public void a(Integer num, Entity.EntityResponseCallback entityResponseCallback) {
        BaseBuilder baseBuilder = this.f32668a;
        if (baseBuilder instanceof ebm) {
            ebx.d(baseBuilder, num, ((ebm) baseBuilder).a(), entityResponseCallback);
        } else {
            dyg.d(true, "CoapsDeviceApi", "mBaseBuilder not instanceof CoapIdentifyAdvancedCodeBuilder");
        }
    }
}
