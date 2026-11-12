package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.watchface.videoedit.gles.Constant;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes38.dex */
public class lzk {
    private static final Object d = new Object();
    private static lzk e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f41200a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StorageParams f41201c = new StorageParams(0);

    private lzk(Context context) {
        this.f41200a = context.getApplicationContext();
    }

    public static lzk c(Context context) {
        lzk lzkVar;
        synchronized (d) {
            if (e == null) {
                e = new lzk(context);
            }
            lzkVar = e;
        }
        return lzkVar;
    }

    public long b() {
        LogUtil.a("HwNotificationBiTools", "getUpdateMessageNumberTime");
        return d("update_record_message_number_time");
    }

    public void e(long j) {
        LogUtil.a("HwNotificationBiTools", "setUpdateMessageNumberTime is:", Long.valueOf(j));
        b(j, "update_record_message_number_time");
    }

    public long e() {
        LogUtil.a("HwNotificationBiTools", "getReportBiTime");
        return d("update_report_number_time");
    }

    public void b(long j) {
        LogUtil.a("HwNotificationBiTools", "setReportBiTime is:", Long.valueOf(j));
        b(j, "update_report_number_time");
    }

    private long d(String str) {
        long j;
        String strE = SharedPreferenceManager.e(this.f41200a, String.valueOf(10039), str);
        try {
            j = Long.parseLong(strE);
        } catch (NumberFormatException unused) {
            LogUtil.e("HwNotificationBiTools", "getCurrentSystemTime NumberFormatException");
            j = 0;
        }
        LogUtil.a("HwNotificationBiTools", "getCurrentSystemTime currentTime is:", strE, ",time is:", Long.valueOf(j));
        return j;
    }

    private void b(long j, String str) {
        if (SharedPreferenceManager.e(this.f41200a, String.valueOf(10039), str, String.valueOf(j), this.f41201c) == 0) {
            LogUtil.a("HwNotificationBiTools", "setCurrentSystemTime setSharedPreference success");
        } else {
            LogUtil.j("HwNotificationBiTools", "setCurrentSystemTime setSharedPreference failed");
        }
    }

    public void a(int i) {
        e(this.f41200a, "received_message_number", d(this.f41200a, "received_message_number") + i);
        LogUtil.a("HwNotificationBiTools", "setReceivedNumber SharedPreference");
    }

    public void c(int i) {
        e(this.f41200a, "filtered_message_number", d(this.f41200a, "filtered_message_number") + i);
        LogUtil.a("HwNotificationBiTools", "setFilteredNumber SharedPreference");
    }

    public void d(int i) {
        e(this.f41200a, "synergy_message_number", d(this.f41200a, "synergy_message_number") + i);
        LogUtil.a("HwNotificationBiTools", "setSynergyNumber SharedPreference");
    }

    private int d(Context context, String str) {
        try {
            return Integer.parseInt(SharedPreferenceManager.e(context, String.valueOf(10039), str));
        } catch (NumberFormatException unused) {
            LogUtil.e("HwNotificationBiTools", "getMessageNumber NumberFormatException");
            return 0;
        }
    }

    private void e(Context context, String str, int i) {
        if (SharedPreferenceManager.e(context, String.valueOf(10039), str, String.valueOf(i), this.f41201c) == 0) {
            LogUtil.a("HwNotificationBiTools", "upDateMessageNumber setSharedPreference success");
        } else {
            LogUtil.j("HwNotificationBiTools", "upDateMessageNumber setSharedPreference failed");
        }
    }

    public void d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("HwNotificationBiTools", "setBiModel method parameter is illegal");
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put(str, str2);
        OpAnalyticsUtil.getInstance().setEvent2nd(str3, linkedHashMap);
        LogUtil.a("HwNotificationBiTools", "report BI success,key is:", str, "value is :", str2);
    }

    public void a() {
        String strE = SharedPreferenceManager.e(this.f41200a, String.valueOf(10039), "received_message_number");
        String strE2 = SharedPreferenceManager.e(this.f41200a, String.valueOf(10039), "filtered_message_number");
        String strE3 = SharedPreferenceManager.e(this.f41200a, String.valueOf(10039), "synergy_message_number");
        d("listen", strE, OperationKey.NOTIFY_RECEIVED_MESSAGE_2129001.value());
        d(Constant.FILTER, strE2, OperationKey.NOTIFY_FILTERED_MESSAGE_2129002.value());
        d("HwSynergy", strE3, OperationKey.NOTIFY_SYNERGY_PUSH_2129006.value());
    }
}
