package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.threecircle.ActiveTipStringUtils;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.main.R;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class ujr {
    static /* synthetic */ void a(View view) {
    }

    static /* synthetic */ void b(View view) {
    }

    public static void e(final Activity activity, final String str) {
        HandlerExecutor.b(new Runnable() { // from class: ujz
            @Override // java.lang.Runnable
            public final void run() {
                ujr.b(activity, str);
            }
        });
    }

    static /* synthetic */ void b(Activity activity, final String str) {
        final Context contextB = BaseApplication.b();
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.a(R.string.IDS_active_task_dialog_subscribe_title).b(R.string.IDS_active_task_dialog_subscribe_text).a(R.string.IDS_active_task_dialog_subscribe_button, new View.OnClickListener() { // from class: ujx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ujr.e(contextB, str, view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: ujw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ujq.g(1);
            }
        });
        builder.b().show();
        ujq.g(0);
    }

    static /* synthetic */ void e(final Context context, String str, View view) {
        ttn.e(new ResultCallback<ttm>() { // from class: ujr.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ttm ttmVar) {
                ReleaseLogUtil.d("SCUI_ActiveTaskUtils", "subscribe response: ", Integer.valueOf(ttmVar.a()));
                if (ttmVar.a() != 0) {
                    qpx.e(context, R.string.IDS_active_task_get_network_error);
                } else {
                    ObserverManagerUtil.e("observer_refresh_active_record_provider", "");
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("SCUI_ActiveTaskUtils", "subscribe error ", th == null ? null : th.getMessage());
                qpx.e(context, R.string.IDS_active_task_get_network_error);
            }
        }, str);
        ujq.g(2);
    }

    public static void d(final Activity activity, final ttr ttrVar) {
        final Context contextB = BaseApplication.b();
        ttn.d(new ResultCallback<ttm>() { // from class: ujr.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ttm ttmVar) {
                int iA = ttmVar.a();
                ReleaseLogUtil.d("SCUI_ActiveTaskUtils", "handleGetPoints : ", Integer.valueOf(iA));
                ujq.e(iA);
                if (iA == 12038139) {
                    qpx.e(contextB, R.string.IDS_active_task_today_get_over_error);
                } else if (iA == 12038138) {
                    qpx.e(contextB, R.string.IDS_active_task_all_get_over_error);
                } else if (iA == 12038140) {
                    qpx.e(contextB, R.string.IDS_active_task_get_account_error);
                } else if (iA == 12030004) {
                    qpx.e(contextB, R.string.IDS_active_task_get_network_error);
                } else if (iA == 0) {
                    ujr.c(activity, ttrVar.b());
                } else {
                    qpx.e(contextB, R.string.IDS_active_task_get_vmall_error);
                }
                ObserverManagerUtil.e("observer_refresh_active_record_provider", "");
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("SCUI_ActiveTaskUtils", "handleGetPoints error ", th == null ? null : th.getMessage());
                qpx.e(contextB, R.string.IDS_active_task_get_network_error);
            }
        }, ttrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final Activity activity, final int i) {
        HandlerExecutor.b(new Runnable() { // from class: ujv
            @Override // java.lang.Runnable
            public final void run() {
                ujr.b(i, activity);
            }
        });
    }

    static /* synthetic */ void b(int i, Activity activity) {
        String strE = qre.e(R.plurals.IDS_active_task_point, i, a(i));
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.a(R.string.IDS_active_task_dialog_get_title).a(qre.a(R.string.IDS_active_task_dialog_get_text, strE)).a(R.string.IDS_active_task_dialog_get_button, new View.OnClickListener() { // from class: uju
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ujr.j();
            }
        }).e(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: ujt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ujr.b(view);
            }
        });
        builder.b().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j() {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.external-task?h5pro=true&urlType=4&pName=com.huawei.health&isImmerse&path=mypoints"));
        intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
        lsx.c(intent, BaseApplication.b());
    }

    public static void e(final Activity activity, final int i, final int i2) {
        if (i < 0) {
            LogUtil.e("SCUI_ActiveTaskUtils", "error point with ", Integer.valueOf(i));
        } else {
            HandlerExecutor.b(new Runnable() { // from class: ujy
                @Override // java.lang.Runnable
                public final void run() {
                    ujr.d(i, i2, activity);
                }
            });
        }
    }

    static /* synthetic */ void d(int i, int i2, Activity activity) {
        String strE = qre.e(R.plurals.IDS_active_task_point, i, a(i));
        String strE2 = qre.e(R.plurals.IDS_benefit_message_num_day, i2, a(i2));
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.a(R.string.IDS_active_task_dialog_description_title).a(a(strE2, strE)).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: ujs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ujr.a(view);
            }
        });
        builder.b().show();
    }

    private static String a(String str, String str2) {
        int i = R.string.IDS_active_task_dialog_description_text_new2;
        if (Utils.o()) {
            i = R.string.IDS_active_task_dialog_description_text_oversea_new;
        }
        return qre.a(i, a(1), str, str2, a(2), a(3), a(4), a(3), a(5));
    }

    private static String a(int i) {
        return UnitUtil.e(i, 1, 0);
    }

    public static boolean d() {
        if (!a()) {
            LogUtil.j("SCUI_ActiveTaskUtils", "isOversea");
            return false;
        }
        if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j("SCUI_ActiveTaskUtils", "NetworkConnected is invalid");
            return false;
        }
        if (!i()) {
            LogUtil.j("SCUI_ActiveTaskUtils", "PrivacyHealth is close");
            return false;
        }
        return b();
    }

    private static boolean i() {
        return "true".equals(ioi.d().c(7));
    }

    public static boolean b() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900200021");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        qhp.c(arrayList, new IBaseResponseCallback() { // from class: ukd
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                ujr.e(countDownLatch, atomicBoolean, i, obj);
            }
        });
        try {
            if (!countDownLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                LogUtil.j("SCUI_ActiveTaskUtils", "RequestData wait timeout, set mIsTaskRemindOpen");
            }
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a("SCUI_ActiveTaskUtils", "interrupted while waiting for getSwitchStatusFromDb");
        }
        return atomicBoolean.get();
    }

    static /* synthetic */ void e(CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, int i, Object obj) {
        if (!(obj instanceof HashMap)) {
            LogUtil.j("SCUI_ActiveTaskUtils", "onResponse: objData is not instanceof HashMap");
            countDownLatch.countDown();
        } else {
            HashMap map = (HashMap) obj;
            if (map.containsKey("900200021")) {
                atomicBoolean.set("1".equals(map.get("900200021")));
            }
            countDownLatch.countDown();
        }
    }

    public static boolean a(String str) {
        String strB = SharedPreferenceManager.b("threeCircleSp", "taskSubscribeShow", "");
        int iA = DateFormatUtil.a(System.currentTimeMillis(), lsl.d());
        if (TextUtils.isEmpty(strB)) {
            a(iA, 1, str);
            return false;
        }
        String[] strArrSplit = strB.split("#");
        LogUtil.a("SCUI_ActiveTaskUtils", "valText is ", Arrays.toString(strArrSplit));
        if (strArrSplit.length != 3) {
            a(iA, 1, str);
            return false;
        }
        if (!str.equals(strArrSplit[2])) {
            a(iA, 1, str);
            return false;
        }
        int iN = CommonUtil.n(BaseApplication.b(), strArrSplit[0]);
        int iN2 = CommonUtil.n(BaseApplication.b(), strArrSplit[1]);
        if (iN2 > 2) {
            return true;
        }
        if (iA != iN) {
            iN2++;
            a(iA, iN2, str);
        }
        return iN2 > 2;
    }

    private static void a(int i, int i2, String str) {
        SharedPreferenceManager.c("threeCircleSp", "taskSubscribeShow", i + "#" + i2 + "#" + str);
    }

    public static boolean a() {
        return ActiveTipStringUtils.c();
    }

    public static void c() {
        if (Utils.o()) {
            e();
        } else {
            pap.e("&cid=71885050");
        }
    }

    public static void e() {
        if (lsj.c(BaseApplication.b(), "com.huawei.phoneservice")) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("myhuawei://dispatch/shop/"));
            intent.setPackage("com.huawei.phoneservice");
            intent.setFlags(268435456);
            a(intent, true);
            return;
        }
        Intent intent2 = new Intent();
        intent2.setClassName(BaseApplication.d(), "com.huawei.operation.activity.WebViewActivity");
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010);
        if ("GB".equals(accountInfo)) {
            accountInfo = "uk";
        }
        intent2.putExtra("url", GRSManager.c(BaseApplication.b()).getUrl("domainMyHuawei") + "/" + accountInfo.toLowerCase(Locale.ENGLISH) + "/offer/");
        a(intent2, false);
    }

    public static void a(Intent intent, boolean z) {
        Context contextB;
        PackageManager packageManager;
        ResolveInfo resolveInfoResolveActivity;
        if (intent == null || (packageManager = (contextB = BaseApplication.b()).getPackageManager()) == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
            return;
        }
        ComponentName componentName = new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
        intent.setComponent(componentName);
        if (z) {
            qrs.c(intent, componentName.getPackageName(), contextB, qre.f(R.string.IDS_myhuawei_app));
        } else {
            intent.addFlags(268435456);
            iov.d(contextB, intent);
        }
    }

    public static void c(List<Integer> list) {
        LogUtil.a("SCUI_ActiveTaskUtils", "dataSyncCloudAfterInsert", list);
        if (list == null) {
            ReleaseLogUtil.e("SCUI_ActiveTaskUtils", "dataSyncCloudAfterInsert dataTypeList is null");
            return;
        }
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataTypes(list);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, null);
    }
}
