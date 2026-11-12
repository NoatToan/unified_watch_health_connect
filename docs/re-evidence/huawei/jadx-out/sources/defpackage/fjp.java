package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class fjp implements LinkageDataHandler {
    @Override // com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler
    public void reset() {
    }

    @Override // com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler
    public void handle(double d, oax oaxVar) {
        oaxVar.y((int) d);
    }

    @Override // com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler
    public eed packageSamplePointInfo(JSONObject jSONObject, String str, int i) {
        try {
            int i2 = jSONObject.getInt(str);
            eed eedVar = new eed();
            eedVar.e(i);
            eedVar.a(cph.a(i2));
            return eedVar;
        } catch (JSONException e) {
            ReleaseLogUtil.a("R_LINKAGE_MaxSpeed", "packageSamplePointInfo JSONException: ", ExceptionUtils.c(e));
            return new eed();
        }
    }
}
