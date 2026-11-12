package health.compact.a;

import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LogConfigCenter {
    private LogConfigCenter() {
    }

    private static List<String> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList("Login", "Track", "Step", "HiH", "PluginDevice", "HealthAdapter", "HWhealthLinkage", "SCUI", "UIHLH", "UIME", "PLGACHIEVE", "UIDV", "PLGLOGIN", "Opera", "Share", "Suggestion", "TimeEat", "Group", "GRS", "Dfx", SyncDataConstant.SYNC_DATA_TRACKS_EXPORT_FOLDER, "BaseModule", "ServicesApi", "EcologyDevice"));
        arrayList.addAll(Arrays.asList("BTSDK", "DMS", "Fitness", "KIDWATCH", "Notify", "OTA", "SMART", "DEVMGR", "AW70", "CORESLEEPMISSON", "WearEngine", "HWWEAR"));
        arrayList.addAll(c());
        return arrayList;
    }

    private static List<String> c() {
        return Arrays.asList("R", "QrCode", "BloodOxygen", "PersonalInfo", "Sleep", "Weight", "Bundle", "HAF", "Nps", "BTSYNC");
    }

    private static List<String> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList("Login", "Track", "FitnessSug", "Dfx", SyncDataConstant.SYNC_DATA_TRACKS_EXPORT_FOLDER, "ServicesApi"));
        arrayList.addAll(Arrays.asList("HiH", "PluginDevice", "HealthAdapter", "Suggestion", "HWhealthLinkage", "SCUI", "UIHLH", "UIME", "PLGACHIEVE", "UIDV", "PLGLOGIN", "Opera", "Share", "GRS", "EcologyDevice"));
        arrayList.addAll(Arrays.asList("BTSDK", "DMS", "Fitness", "KIDWATCH", "Notify", "OTA", "SMART", "DEVMGR", "CORESLEEPMISSON"));
        arrayList.addAll(b());
        return arrayList;
    }

    private static List<String> b() {
        return Arrays.asList("R", "QrCode", "BloodOxygen", "PersonalInfo", "Sleep", "Weight", "Bundle", "HAF", "BTSYNC");
    }

    private static LogAllowListConfig d() {
        LogAllowListConfig logAllowListConfig = new LogAllowListConfig();
        logAllowListConfig.b(a());
        logAllowListConfig.c(e());
        return logAllowListConfig;
    }

    public static com.huawei.hwlogsmodel.common.LogConfig c(String str) {
        return new com.huawei.hwlogsmodel.common.LogConfig.b(str).a(d()).a(5242880.0d).d(false).b();
    }

    public static com.huawei.hwlogsmodel.common.LogConfig d(String str) {
        return new com.huawei.hwlogsmodel.common.LogConfig.b(str).e(5).e(5242880.0d).a(d()).b();
    }

    public static com.huawei.hwlogsmodel.common.LogConfig e(String str) {
        return new com.huawei.hwlogsmodel.common.LogConfig.b(str).a(d()).e(30).d(false).a(5242880.0d).b();
    }

    public static com.huawei.hwlogsmodel.common.LogConfig b(String str) {
        return new com.huawei.hwlogsmodel.common.LogConfig.b(str).b("sensor").e(2).d(false).a(512000.0d).a(d()).b();
    }
}
