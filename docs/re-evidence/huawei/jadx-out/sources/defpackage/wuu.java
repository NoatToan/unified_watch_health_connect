package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.ui.main.stories.me.views.privacy.PermissionGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wuu {
    public static void c() {
        lmn lmnVar = new lmn();
        HashMap map = new HashMap(4);
        map.put("pageId", "My_page_0001");
        lmnVar.d(map);
        HashMap map2 = new HashMap(4);
        map2.put(WebViewHelp.BI_KEY_PULL_FROM, "PrivacyCenterActivity");
        lmnVar.c(map2);
        HashMap map3 = new HashMap(4);
        map3.put("event", 1);
        map3.put(FunctionSetBeanReader.BI_ELEMENT, "permission_management");
        map3.put("moduleName", "data_privacy_management");
        lmnVar.e(map3);
        LogUtil.a("PermissionBiAnalyticsUtil", AnalyticsValue.HEALTH_MINE_SETTINGS_2040013.value(), lmnVar.toString());
        lmf.d().a(BaseApplication.b(), AnalyticsValue.HEALTH_MINE_SETTINGS_2040013.value(), lmnVar, 0);
    }

    public static void d(List<PermissionGroup> list) {
        lmn lmnVar = new lmn();
        e(lmnVar);
        a(lmnVar, 0, "m0");
        b(lmnVar, list);
        LogUtil.a("PermissionBiAnalyticsUtil", AnalyticsValue.PERMISSION_SETTINGS_H2040013001.value(), lmnVar.toString());
        lmf.d().a(BaseApplication.b(), AnalyticsValue.PERMISSION_SETTINGS_H2040013001.value(), lmnVar, 0);
    }

    public static void b(PermissionGroup permissionGroup, List<PermissionGroup> list) {
        String strE = e(permissionGroup.e());
        lmn lmnVar = new lmn();
        e(lmnVar);
        a(lmnVar, 1, strE);
        b(lmnVar, list);
        LogUtil.a("PermissionBiAnalyticsUtil", AnalyticsValue.PERMISSION_SETTINGS_H2040013001.value(), lmnVar.toString());
        lmf.d().a(BaseApplication.b(), AnalyticsValue.PERMISSION_SETTINGS_H2040013001.value(), lmnVar, 0);
    }

    public static void b(List<PermissionGroup> list) {
        lmn lmnVar = new lmn();
        e(lmnVar);
        a(lmnVar, 1, "privacy_statement");
        b(lmnVar, list);
        LogUtil.a("PermissionBiAnalyticsUtil", AnalyticsValue.PERMISSION_SETTINGS_H2040013001.value(), lmnVar.toString());
        lmf.d().a(BaseApplication.b(), AnalyticsValue.PERMISSION_SETTINGS_H2040013001.value(), lmnVar, 0);
    }

    private static String b(PermissionGroup.PermissionStatus permissionStatus) {
        if (permissionStatus == null) {
            return "not_available";
        }
        int i = AnonymousClass2.f52523a[permissionStatus.ordinal()];
        if (i == 1) {
            return "granted";
        }
        if (i == 2) {
            return "partial_granted";
        }
        if (i != 3) {
            return "not_available";
        }
        return "not_granted";
    }

    /* JADX INFO: renamed from: wuu$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f52523a;

        static {
            int[] iArr = new int[PermissionGroup.PermissionStatus.values().length];
            f52523a = iArr;
            try {
                iArr[PermissionGroup.PermissionStatus.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52523a[PermissionGroup.PermissionStatus.PARTIAL_GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52523a[PermissionGroup.PermissionStatus.NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52523a[PermissionGroup.PermissionStatus.GO_SETTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    private static String e(String str) {
        if (str == null) {
            return "";
        }
        str.hashCode();
        switch (str) {
            case "android.permission-group.CONTACTS":
                return "contacts";
            case "android.permission-group.PHONE":
                return "phone";
            case "KEEP_ALIVE":
                return w9.j;
            case "android.permission-group.CALENDAR":
                return "calendar";
            case "android.permission-group.CALL_LOG":
                return "call_log";
            case "android.permission-group.CAMERA":
                return "camera";
            case "NOTIFICATIONS_ACCESS":
                return "notice_access";
            case "android.permission-group.ACTIVITY_RECOGNITION":
                return "fitness";
            case "android.permission-group.LOCATION":
                return "location";
            case "android.permission-group.STORAGE":
                return "storage";
            case "android.permission-group.MICROPHONE":
                return "mic";
            case "android.permission-group.NEARBY_DEVICES":
                return "nearby_device";
            case "android.permission-group.SMS":
                return "message";
            default:
                return "";
        }
    }

    private static void e(lmn lmnVar) {
        HashMap map = new HashMap(4);
        map.put("pageId", "My_page_permission_setting_001");
        lmnVar.d(map);
        HashMap map2 = new HashMap(4);
        map2.put(WebViewHelp.BI_KEY_PULL_FROM, "PermissionSettingsActivity");
        lmnVar.c(map2);
    }

    private static void a(lmn lmnVar, int i, String str) {
        HashMap map = new HashMap(4);
        map.put("event", Integer.valueOf(i));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map.put("moduleName", "main_page");
        lmnVar.e(map);
    }

    private static void b(lmn lmnVar, List<PermissionGroup> list) {
        if (list == null) {
            return;
        }
        List<Map<String, Object>> listE = lmnVar.e();
        if (listE == null) {
            listE = new ArrayList<>();
        }
        for (PermissionGroup permissionGroup : list) {
            String strE = e(permissionGroup.e());
            if (!strE.isEmpty()) {
                Map<String, Object> map = new HashMap<>(4);
                map.put("action", 0);
                map.put("moduleName", strE);
                map.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, b(permissionGroup.i()));
                listE.add(map);
            }
        }
        lmnVar.d(listE);
    }
}
