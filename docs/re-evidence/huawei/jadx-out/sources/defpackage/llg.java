package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.common.dfx.process.DefaultProcessHandler;
import com.huawei.haf.common.dfx.process.ProcessCallback;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.CommonUtil;
import health.compact.a.DaemonServiceSpUtils;
import health.compact.a.EnvironmentUtils;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class llg extends DefaultProcessHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Integer f40409b = 30000;
    private static final Pattern d = Pattern.compile("startTime=([^,]+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    llo f40410c;

    public llg() {
        super("TimeEat_ProcessHandler");
        this.f40410c = new llo(f40409b.intValue());
    }

    @Override // com.huawei.haf.common.dfx.process.DefaultProcessHandler
    public void c(String str, List<String> list, String str2) {
        if (LogUtil.c() || LogUtil.b()) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(OpAnalyticsConstants.PROC_NAME, list.toString());
            a(linkedHashMap, str, str2);
        }
    }

    @Override // com.huawei.haf.common.dfx.process.DefaultProcessHandler
    public void c(String str, String str2, long j, String str3) {
        DaemonServiceSpUtils.b(str2, a(str3), j, str);
        if (LogUtil.c() || LogUtil.b()) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(OpAnalyticsConstants.PROC_NAME, str2);
            linkedHashMap.put("duration", String.valueOf(j));
            a(linkedHashMap, str, str3);
        }
    }

    @Override // com.huawei.haf.common.dfx.process.DefaultProcessHandler, com.huawei.haf.common.dfx.process.ProcessCallback
    public void processStart(List<String> list, String str, ProcessCallback.StartInfo startInfo, List<String> list2) {
        super.processStart(list, str, startInfo, list2);
        if (EnvironmentUtils.d()) {
            return;
        }
        if (CommonUtil.bu() && CommonUtil.bg()) {
            return;
        }
        LogUtil.b("TimeEat_ProcessHandler", "start to freezeDetector");
        this.f40410c.d();
    }

    private void a(LinkedHashMap<String, String> linkedHashMap, String str, String str2) {
        linkedHashMap.put(OpAnalyticsConstants.MONITOR_KEY, str);
        linkedHashMap.put(OpAnalyticsConstants.MONITOR_INFO, str2);
        linkedHashMap.put("deviceType", Build.MANUFACTURER);
        linkedHashMap.put(DeviceCategoryFragment.DEVICE_TYPE, Build.BOARD);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_PROCESS_90030007.value(), linkedHashMap);
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = d.matcher(str);
        return matcher.find() ? matcher.group(1) : "";
    }

    public static List<String> c() {
        return Arrays.asList(ProcessUtil.e(null), ProcessUtil.e(":DaemonService"), ProcessUtil.e(":PhoneService"));
    }
}
