package defpackage;

import com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnReportProvider;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class jvk implements IRnReportProvider {
    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnReportProvider
    public int getRnNativeApiLevel() {
        return 0;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnReportProvider
    public boolean needTrace(int i, String str) {
        return false;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnReportProvider
    public void statReport(String str, String str2, Map<String, Object> map) {
    }
}
