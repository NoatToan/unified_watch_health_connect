package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class fix implements LinkageDataHandler {
    private boolean d = false;

    @Override // com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler
    public void handle(double d, oax oaxVar) {
        if (d != 0.0d) {
            this.d = true;
        }
        if (this.d) {
            oaxVar.m((int) d);
        }
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
            ReleaseLogUtil.a("R_LINKAGE_CyclingCadence", "packageSamplePointInfo JSONException: ", ExceptionUtils.c(e));
            return new eed();
        }
    }

    @Override // com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler
    public void reset() {
        this.d = false;
    }
}
