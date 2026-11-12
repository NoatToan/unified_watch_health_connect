package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.utils.PowerUtil;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class wud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f52493a = BaseApplication.getContext().getResources().getColor(R.color.core_sleep_normal_tip_color);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f52494b = BaseApplication.getContext().getResources().getColor(R.color.weight_tips_color_5);
    private static int e = BaseApplication.getContext().getResources().getColor(R.color.weight_tips_color_1);

    public static int a(int i) {
        return (i < 0 || i < 1200 || i >= 1440) ? 71 : 73;
    }

    public static int b(int i) {
        return (i < 0 || i <= 360 || i >= 1200) ? 72 : 73;
    }

    public static int d(int i) {
        return (i < 0 || i >= 70) ? 73 : 72;
    }

    public static int d(int i, int i2) {
        return (i < 0 || i >= (i2 == 5 ? 65 : 55)) ? 71 : 73;
    }

    public static int e(int i) {
        if (i > 630.0f) {
            return 71;
        }
        return i < 360 ? 72 : 73;
    }

    public static int e(int i, int i2) {
        int i3 = i2 == 5 ? 30 : 60;
        int i4 = i2 == 5 ? 10 : 20;
        if (i < 0 || i >= i4) {
            return i > i3 ? 71 : 73;
        }
        return 72;
    }

    public static int h(int i) {
        if (i < 0 || i >= 360) {
            return i > 600 ? 71 : 73;
        }
        return 72;
    }

    public static int i(int i) {
        if (i >= 0 && i < 20) {
            return -1;
        }
        if ((i < 20 || i >= 70) && i != 0) {
            return i > 100 ? 71 : 73;
        }
        return 72;
    }

    public static int j(int i) {
        if (i < 0 || i >= 10) {
            return i > 30 ? 71 : 73;
        }
        return 72;
    }

    public static int k(int i) {
        return (i < 0 || i >= 70) ? 73 : 72;
    }

    public static int l(int i) {
        if (i > 600) {
            return 71;
        }
        return i < 360 ? 72 : 73;
    }

    public static int m(int i) {
        return i >= 20 ? 73 : 72;
    }

    public static int n(int i) {
        return (i < 85 || i > 100) ? 72 : 73;
    }

    public static int o(int i) {
        return i >= 30 ? 71 : 73;
    }

    public static int p(int i) {
        return (i < 0 || i >= 70) ? 73 : 72;
    }

    public static int q(int i) {
        return i > 360 ? 73 : 72;
    }

    public static int s(int i) {
        return (i < 0 || i > 1) ? 71 : 73;
    }

    public static void d(HealthTextView healthTextView, int i) {
        e(healthTextView, i, false);
    }

    public static void e(HealthTextView healthTextView, int i, boolean z) {
        if (healthTextView == null) {
            return;
        }
        switch (i) {
            case 71:
                if (z) {
                    healthTextView.setText(R.string.IDS_details_sleep_grade_late);
                } else {
                    healthTextView.setText(R.string.IDS_details_sleep_grade_high);
                }
                healthTextView.setTextColor(f52494b);
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                if (z) {
                    healthTextView.setText(R.string.IDS_details_sleep_grade_early);
                } else {
                    healthTextView.setText(R.string.IDS_details_sleep_grade_low);
                }
                healthTextView.setTextColor(e);
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                healthTextView.setText(R.string.IDS_details_sleep_grade_normal);
                healthTextView.setTextColor(f52493a);
                break;
        }
    }

    public static int f(int i) {
        return e(i, 0);
    }

    public static int g(int i) {
        return d(i, 0);
    }

    public static int a(int i, int[] iArr) {
        if (iArr.length < 2) {
            ReleaseLogUtil.b("R_Sleep_FitnessSleepUtils", "itemBaseline.length < 2");
            return -1;
        }
        if (i < iArr[0]) {
            return 72;
        }
        return i > iArr[1] ? 71 : 73;
    }

    public static String c(Context context, int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        String quantityString = BaseApplication.getContext().getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_min_unit, i3, UnitUtil.e(i3, 1, 0));
        if (i2 == 0) {
            return quantityString;
        }
        return BaseApplication.getContext().getString(com.huawei.ui.commonui.R.string.IDS_two_parts, BaseApplication.getContext().getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_hour_unit, i2, UnitUtil.e(i2, 1, 0)), quantityString);
    }

    public static void e(HealthTextView healthTextView) {
        if (healthTextView == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (d()) {
            layoutParams.gravity = 16;
        } else {
            layoutParams.gravity = 80;
        }
        healthTextView.setLayoutParams(layoutParams);
    }

    public static boolean d() {
        if ("ar".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            LogUtil.a("FitnessSleepUtils", "is Arab language");
            return true;
        }
        LogUtil.a("FitnessSleepUtils", "is not Arab language");
        return false;
    }

    public static float b(float f) {
        return f * BaseApplication.getContext().getResources().getDisplayMetrics().density;
    }

    public static String e(long j) {
        return new SimpleDateFormat("HH:mm").format(new Date(j));
    }

    public static String b(long j) {
        String str = new SimpleDateFormat("HH:mm").format(new Date(j));
        String[] strArrSplit = str.split(":");
        LogUtil.a("FitnessSleepUtils", "timeArray: " + Arrays.toString(strArrSplit));
        try {
            if (strArrSplit.length == 2) {
                return c(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
            }
        } catch (NumberFormatException unused) {
            LogUtil.a("FitnessSleepUtils", "parseInt fail, timeArray: " + Arrays.toString(strArrSplit));
        }
        return str;
    }

    public static String c(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(ltb.e(), ltb.c(), 1, i, i2);
        return UnitUtil.a(calendar.getTime(), 1);
    }

    public static String c(int i) {
        return String.format(BaseApplication.getContext().getResources().getString(R.string.IDS_h_min_unit), UnitUtil.e(i / 60, 1, 0), UnitUtil.e(i % 60, 1, 0));
    }

    public static String r(int i) {
        if (i < 10) {
            return UnitUtil.e(0.0d, 1, 0) + UnitUtil.e(i, 1, 0);
        }
        return UnitUtil.e(i, 1, 0);
    }

    public static String a(String str) {
        try {
            return UnitUtil.a(new SimpleDateFormat("HH:mm", Locale.getDefault()).parse(str), 129);
        } catch (ParseException unused) {
            LogUtil.a("FitnessSleepUtils", "formatTime.ParseException");
            return str;
        }
    }

    public static boolean e() {
        DeviceInfo deviceInfoC = mgg.c("FitnessSleepUtils");
        if (deviceInfoC == null) {
            LogUtil.j("FitnessSleepUtils", "hasCoreSleepDevice currentDeviceInfo is null");
            return false;
        }
        if (deviceInfoC.getDeviceConnectState() != 2) {
            LogUtil.j("FitnessSleepUtils", "device not connected");
            return false;
        }
        DeviceCapability deviceCapabilityC = eej.c();
        return deviceCapabilityC != null && deviceCapabilityC.isDeviceSupportCoreSleep();
    }

    public static String b(Context context) {
        if (LanguageUtil.c(context)) {
            return " - ";
        }
        return Constants.LINK;
    }

    public static List<qjp> a(Context context, List<Integer> list, boolean z, int i) {
        String string;
        String string2;
        String string3;
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            string = context.getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_deepsleep);
            string2 = context.getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep);
            string3 = context.getString(R.string.IDS_fitness_core_sleep_rem_sleep);
        } else if (i == 4) {
            string = context.getString(R.string.IDS_details_sleep_avg_deep_sleep);
            string2 = context.getString(R.string.IDS_details_sleep_avg_light_sleep);
            string3 = context.getString(R.string.IDS_fitness_core_sleep_avg_rem_sleep);
        } else {
            string = context.getString(R.string.IDS_core_sleep_average_deep_sleep);
            string2 = context.getString(R.string.IDS_core_sleep_average_light_sleep);
            string3 = context.getString(R.string.IDS_core_sleep_average_eye_movement);
        }
        arrayList.add(string);
        arrayList.add(string2);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_deep_sleep_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_deep_sleep_color_end)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_shallow_sleep_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_shallow_sleep_color_end)));
        if (z) {
            arrayList.add(string3);
            arrayList3.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_rem_sleep_color_begin)));
            arrayList2.add(Integer.valueOf(ContextCompat.getColor(context, R.color.pie_sector_rem_sleep_color_end)));
        }
        int size = list != null ? list.size() : 0;
        ArrayList arrayList4 = new ArrayList(size);
        int i2 = 0;
        while (i2 < size) {
            arrayList4.add(new qjp(i2 < arrayList.size() ? (String) arrayList.get(i2) : "", list.get(i2).intValue(), i2 < arrayList2.size() ? ((Integer) arrayList2.get(i2)).intValue() : 0, i2 < arrayList3.size() ? ((Integer) arrayList3.get(i2)).intValue() : 0));
            i2++;
        }
        return arrayList4;
    }

    public static int t(int i) {
        if (i == -1) {
            return R.string.IDS_fitness_core_sleep_no_device_connected;
        }
        if (i == 0) {
            return R.string.IDS_fitness_core_sleep_no_new_data;
        }
        if (i == 1) {
            return R.string.IDS_fitness_core_sleep_no_new_data;
        }
        if (i == 2) {
            return R.string.IDS_fitness_core_sleep_sync_failed;
        }
        if (i == 3) {
            return R.string.IDS_fitness_core_sleep_calculate_failed;
        }
        if (i == 5) {
            return R.string.IDS_fitness_core_sleep_no_sleep_data;
        }
        if (i != 6) {
            return 0;
        }
        return R.string.IDS_device_ota_later_note;
    }

    public static void d(final WeakReference<Context> weakReference) {
        ReleaseLogUtil.c("R_Sleep_FitnessSleepUtils", "handleDetectionDialog start");
        if (!fua.c(weakReference.get())) {
            LogUtil.a("FitnessSleepUtils", "handleDetectionDialog not supported");
            return;
        }
        final pjo pjoVarB = pjo.b();
        if (!pjoVarB.isPluginAvaiable()) {
            ReleaseLogUtil.d("R_Sleep_FitnessSleepUtils", "showDetectionDialog is Unavailable");
            pjoVarB.loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: wuh
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public final boolean call(Context context, Intent intent) {
                    return wud.d(weakReference, pjoVarB, context, intent);
                }
            });
        } else {
            d(weakReference, pjoVarB);
        }
    }

    static /* synthetic */ boolean d(WeakReference weakReference, pjo pjoVar, Context context, Intent intent) {
        ReleaseLogUtil.c("R_Sleep_FitnessSleepUtils", "PluginSleepDetectionProxy loadPlugin success");
        d((WeakReference<Context>) weakReference, pjoVar);
        return true;
    }

    private static void d(final WeakReference<Context> weakReference, final pjo pjoVar) {
        pjoVar.sleepRecordStatus(new IBaseResponseCallback() { // from class: wue
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                wud.e(weakReference, pjoVar, i, obj);
            }
        });
    }

    static /* synthetic */ void e(WeakReference weakReference, pjo pjoVar, int i, Object obj) {
        ReleaseLogUtil.c("R_Sleep_FitnessSleepUtils", "sleepRecordStatus: ", Integer.valueOf(i));
        Context context = (Context) weakReference.get();
        if (context == null) {
            return;
        }
        if (i == 5) {
            c(context, pjoVar);
        } else if (i == 3) {
            pjoVar.c(context, true, "4");
        } else {
            pjoVar.disconnect();
        }
    }

    public static void c(Context context, pjo pjoVar) {
        if (PowerUtil.a(context) < 10) {
            LogUtil.j("FitnessSleepUtils", "showDetectionDialog batteryPercent < 10");
        } else {
            HandlerExecutor.b(new AnonymousClass2(context, pjoVar));
        }
    }

    /* JADX INFO: renamed from: wud$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pjo f52495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f52496b;

        AnonymousClass2(Context context, pjo pjoVar) {
            this.f52496b = context;
            this.f52495a = pjoVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f52496b);
            NoTitleCustomAlertDialog.Builder builderA = builder.a(this.f52496b.getString(R.string.IDS_sleep_record_interrupt_description));
            String string = this.f52496b.getString(R.string.IDS_sleep_record_restores);
            final Context context = this.f52496b;
            final pjo pjoVar = this.f52495a;
            NoTitleCustomAlertDialog.Builder builderA2 = builderA.a(string, new View.OnClickListener() { // from class: wul
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wud.AnonymousClass2.c(context, pjoVar, view);
                }
            });
            String string2 = this.f52496b.getString(R.string.IDS_sleep_record_terminate);
            final Context context2 = this.f52496b;
            final pjo pjoVar2 = this.f52495a;
            builderA2.d(string2, new View.OnClickListener() { // from class: wuk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wud.AnonymousClass2.d(context2, pjoVar2, view);
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.setOnShowListener(new c(noTitleCustomAlertDialogC));
            noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: wuj
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    wud.AnonymousClass2.a(dialogInterface);
                }
            });
            noTitleCustomAlertDialogC.show();
        }

        static /* synthetic */ void c(Context context, pjo pjoVar, View view) {
            wud.a(context, "2");
            pjoVar.c(context, true, "4");
        }

        static /* synthetic */ void d(Context context, pjo pjoVar, View view) {
            wud.a(context, "1");
            wud.a(context, pjoVar);
        }

        static /* synthetic */ void a(DialogInterface dialogInterface) {
            LogUtil.a("FitnessSleepUtils", "onDismiss");
            ObserverManagerUtil.a("DISMISS_DETECTION_DIALOG");
        }
    }

    static class c implements DialogInterface.OnShowListener {
        public WeakReference<NoTitleCustomAlertDialog> e;

        c(NoTitleCustomAlertDialog noTitleCustomAlertDialog) {
            this.e = new WeakReference<>(noTitleCustomAlertDialog);
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            LogUtil.a("FitnessSleepUtils", "onShow");
            ObserverManagerUtil.d(new Observer() { // from class: wud.c.1
                @Override // com.huawei.haf.design.pattern.Observer
                public void notify(String str, Object... objArr) {
                    NoTitleCustomAlertDialog noTitleCustomAlertDialog = c.this.e.get();
                    if (noTitleCustomAlertDialog == null) {
                        LogUtil.a("FitnessSleepUtils", "onShow null");
                    } else {
                        LogUtil.a("FitnessSleepUtils", "detection dialog dismiss");
                        noTitleCustomAlertDialog.dismiss();
                    }
                }
            }, "DISMISS_DETECTION_DIALOG");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Context context, String str) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", str);
        lmf.d().c(context, AnalyticsValue.SLEEP_RECORD_21300039.value(), map, 0);
    }

    public static void a(Context context, pjo pjoVar) {
        if (context == null) {
            return;
        }
        pjoVar.stopSleepRecord(context);
    }
}
