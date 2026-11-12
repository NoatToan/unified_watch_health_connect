package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.wifi.entity.builder.BaseBuilder;
import org.eclipse.californium.core.network.Endpoint;

/* JADX INFO: loaded from: classes7.dex */
public class ecc extends zus {
    public ecd a(BaseBuilder baseBuilder, int i) {
        if (baseBuilder == null || !(baseBuilder instanceof ebp)) {
            return null;
        }
        zvg payload = zvg.d().b(super.d()).setPayload(baseBuilder.makeRequestByte());
        ebp ebpVar = (ebp) baseBuilder;
        if (!TextUtils.isEmpty(ebpVar.a())) {
            zvc zvcVar = new zvc(2048);
            zvcVar.e(ebpVar.a());
            payload.getOptions().b(zvcVar);
        }
        zvc zvcVar2 = new zvc(2053);
        zvcVar2.c(ebpVar.c().longValue() + 1);
        payload.getOptions().b(zvcVar2);
        payload.getOptions().b(i);
        payload.setToken(ebpVar.e());
        if (ebpVar.d() != null) {
            String strB = ecj.b(ebpVar.d());
            if (!TextUtils.isEmpty(strB)) {
                try {
                    payload.setMID(Integer.valueOf(strB, 16).intValue());
                } catch (NumberFormatException e) {
                    dyg.c(true, "MyCoapClient", e.getMessage());
                }
            }
        }
        return c(payload);
    }

    private ecd c(zvg zvgVar) {
        return b(zvgVar, b(zvgVar));
    }

    private ecd b(zvg zvgVar, Endpoint endpoint) {
        try {
            zvf zvfVarB = d(zvgVar, endpoint).b(e().longValue());
            if (zvfVarB == null) {
                return null;
            }
            return new ecd(zvfVarB);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
