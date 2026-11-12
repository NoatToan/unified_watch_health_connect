package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.common.LogConfig;
import health.compact.a.ProcessUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class muw {
    public static final String d = LogConfig.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f42466c = BaseApplication.d();
    public static final String e = "dfx_log_" + BaseApplication.i();
    public static final String j = ProcessUtil.e("_PhoneService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f42464a = ProcessUtil.e("_DaemonService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f42465b = Collections.unmodifiableList(Arrays.asList(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage(), "Fortuna", "Talos", "ELA", "Crius", "Terra", "Andes", "Latona", "Diana", "Minos", "Hebe", "Fides", "Janus", "AW70", "TerraB09"));
}
