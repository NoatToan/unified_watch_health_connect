package com.huawei.health.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.AccountHelper;
import com.huawei.common.util.AccountInteractors;
import com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.exception.HafRuntimeException;
import com.huawei.haf.common.utils.AbiUtil;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.HuaweiLoginActivity;
import com.huawei.health.R;
import com.huawei.health.association.AssociationDialog;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.plan.association.SportEventAssociator;
import com.huawei.health.splash.GuideActivity;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.utils.MainInteractorsUtils;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.HiDataUpdateOption;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.type.HiSyncType;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl;
import com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl;
import com.huawei.hwauthutil.utils.PackageManagerHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.userprofile.DeleteOperationRecord;
import com.huawei.hwcloudmodel.model.userprofile.GetUserMergeInfoReq;
import com.huawei.hwcloudmodel.model.userprofile.GetUserMergeInfoRsp;
import com.huawei.hwcloudmodel.model.userprofile.LastClearCloudDataTimeRsp;
import com.huawei.hwcloudmodel.model.userprofile.MergeUserAllDataReq;
import com.huawei.hwcloudmodel.model.userprofile.UserMergeInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.MainLoginCallBack;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.Action;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.trade.PayApi;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider;
import com.huawei.ui.main.stories.me.activity.AppSettingActivity;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.googlefit.GoogleFitDataManage;
import defpackage.btw;
import defpackage.bxc;
import defpackage.bxd;
import defpackage.cxz;
import defpackage.ddv;
import defpackage.fga;
import defpackage.fxl;
import defpackage.gyo;
import defpackage.gyp;
import defpackage.iod;
import defpackage.ioi;
import defpackage.ipx;
import defpackage.iqb;
import defpackage.iqd;
import defpackage.ive;
import defpackage.lmf;
import defpackage.lor;
import defpackage.lqo;
import defpackage.lua;
import defpackage.lub;
import defpackage.lvi;
import defpackage.mgg;
import defpackage.nio;
import defpackage.niz;
import defpackage.njy;
import defpackage.oet;
import defpackage.oru;
import defpackage.otd;
import defpackage.otx;
import defpackage.pal;
import defpackage.pap;
import defpackage.qqt;
import defpackage.qre;
import defpackage.qri;
import defpackage.rcz;
import defpackage.wme;
import defpackage.wmq;
import defpackage.wnb;
import defpackage.wzu;
import health.compact.a.CloudImpl;
import health.compact.a.CommonLibUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HwEncryptUtil;
import health.compact.a.KeyManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes9.dex */
public class MainInteractorsUtils {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10362b;
    private AssociationDialog d;
    private Activity h;
    private CustomTextAlertDialog j;
    private static int e = c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f10361a = false;
    private int f = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f10363c = 0;

    /* JADX INFO: loaded from: classes32.dex */
    public interface UpdateType {
        public static final int GOOGLE_PLAY = 1;
        public static final int GOOGLE_PLAY_WAP = 2;
    }

    public static /* synthetic */ void a(DialogInterface dialogInterface, int i) {
    }

    public void j(Context context) {
        this.f10362b = context;
        this.h = (Activity) context;
    }

    public static void e(final Context context) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.utils.MainInteractorsUtils$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                MainInteractorsUtils.c(context);
            }
        });
    }

    static /* synthetic */ void c(Context context) {
        if (lor.b(context)) {
            if (lor.c(context)) {
                LogUtil.a("Login_MainInteractorsUtils", "updateGrsConfig deleteGrsConfig");
                lor.d(context);
            }
            lor.d(context, 2);
        }
    }

    public static String c(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c2 = charArray[i];
            if (c2 != 65292 && c2 != 12290) {
                if (c2 == 12288) {
                    charArray[i] = ' ';
                } else if (c2 > 65280 && c2 < 65375) {
                    charArray[i] = (char) (c2 - 65248);
                }
            }
        }
        return new String(charArray);
    }

    public static void d(Context context, String str, long j) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferenceManager.e(context, Integer.toString(10000), str, String.valueOf(j), new StorageParams(0));
    }

    private static double a(Map<String, Double> map, String str) {
        Double d2;
        if (map == null || TextUtils.isEmpty(str) || (d2 = map.get(str)) == null) {
            return 0.0d;
        }
        return d2.doubleValue();
    }

    public void b(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, String str5) {
        HashMap<String, Double> mapS = CommonUtil.s(this.f10362b);
        double dA = a(mapS, str);
        double dA2 = a(mapS, str2);
        double dA3 = a(mapS, str3);
        double dA4 = a(mapS, str4);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (dA > i) {
            linkedHashMap.put(OpAnalyticsConstants.WIFI_TRAFFIC_RX, CommonUtil.d(dA, str5));
            d(this.f10362b, str, i + i);
        }
        if (dA2 > i2) {
            linkedHashMap.put(OpAnalyticsConstants.WIFI_TRAFFIC_TX, CommonUtil.d(dA2, str5));
            d(this.f10362b, str2, i2 + i2);
        }
        if (dA3 > i4) {
            linkedHashMap.put(OpAnalyticsConstants.MOBILE_TRAFFIC_RX, CommonUtil.d(dA3, str5));
            d(this.f10362b, str3, i4 + i4);
        }
        if (dA4 > i3) {
            linkedHashMap.put(OpAnalyticsConstants.MOBILE_TRAFFIC_TX, CommonUtil.d(dA4, str5));
            d(this.f10362b, str4, i3 + i3);
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_TRAFFIC_85010001.value(), linkedHashMap);
    }

    public static class d implements HiDataOperateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<Handler> f10396b;
        private WeakReference<Context> d;
        private WeakReference<MainInteractorsUtils> e;

        d(MainInteractorsUtils mainInteractorsUtils, Handler handler, String str, Context context) {
            this.e = new WeakReference<>(mainInteractorsUtils);
            this.f10395a = str;
            this.d = new WeakReference<>(context);
            this.f10396b = new WeakReference<>(handler);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            WeakReference<MainInteractorsUtils> weakReference = this.e;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyAToBByHiDATA onResult errorCode = ", Integer.valueOf(i));
            b(AccountHelper.getOldHid(), this.f10395a, i);
        }

        private void b(String str, String str2, int i) {
            Handler handler = this.f10396b.get();
            if (handler == null) {
                return;
            }
            if (i == 0 || i == 2) {
                lub.c().d(str, str2);
                Context context = this.d.get();
                if (context != null && "is_auth_failed_migrate_true".equals(SharedPreferenceManager.e(context, Integer.toString(10015), "is_auth_failed_migrate"))) {
                    handler.sendEmptyMessage(4009);
                    SharedPreferenceManager.e(context, Integer.toString(10015), "is_auth_failed_migrate", "is_auth_failed_migrate_false", new StorageParams(0));
                    return;
                }
                return;
            }
            if (i == 3) {
                lub.c().d(str, str2);
                if (!"0".equals(str) && !"com.huawei.health".equals(str) && !TextUtils.isEmpty(str) && !str.equals(str2)) {
                    handler.sendEmptyMessage(4013);
                }
                Bundle bundle = new Bundle();
                bundle.putLong("error_code", 3L);
                LogUtil.a(907127009, "Login_MainInteractorsUtils", bundle, false, "notice local migrate account data but return RESULT_NO_DETAIL_DATA message." + bundle);
                return;
            }
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: showDataMigrateDialog copyHealthDatasFromAtoB down and failed");
            Bundle bundle2 = new Bundle();
            bundle2.putLong("error_code", i);
            LogUtil.a(907127009, "Login_MainInteractorsUtils", bundle2, false, "notice local migrate account data but return error message." + bundle2);
        }
    }

    public void a(Handler handler, String str, String str2, boolean z) {
        LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyAToBByHiDATA enter oldHuid is ", str, " newHuid is ", str2, " isSync is ", Boolean.valueOf(z));
        HiDataUpdateOption hiDataUpdateOption = new HiDataUpdateOption();
        hiDataUpdateOption.putString("old_huid", str);
        hiDataUpdateOption.putString("new_huid", str2);
        hiDataUpdateOption.putBoolean("copy_sync_status", z);
        HiHealthManager.d(this.f10362b).updateHiHealthData(hiDataUpdateOption, new d(this, handler, str2, this.f10362b));
        LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyAToBByHiDATA end");
    }

    public void b(SpannableString spannableString) {
        View viewInflate = View.inflate(this.f10362b, R.layout.smart_gender_tips_dialog_view, null);
        ((HealthTextView) viewInflate.findViewById(R.id.hw_health_smartmsg_gender_tips_content)).setText(spannableString);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f10362b);
        builder.a(this.f10362b.getString(R.string.IDS_hw_wechat_rank_show_common_title)).d(viewInflate).a(this.f10362b.getString(R.string.IDS_main_btn_state_settings).toUpperCase(), new View.OnClickListener() { // from class: com.huawei.health.utils.MainInteractorsUtils.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    AppRouter.c("/HWUserProfileMgr/UserInfoActivity").b(MainInteractorsUtils.this.f10362b);
                } catch (Exception unused) {
                    LogUtil.a("Login_MainInteractorsUtils", "open systemmanager failed");
                }
            }
        }).c(this.f10362b.getString(R.string.IDS_hw_common_ui_dialog_cancel).toUpperCase(), new View.OnClickListener() { // from class: com.huawei.health.utils.MainInteractorsUtils.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.d().show();
    }

    public SpannableString b(String str, String str2) {
        SpannableString spannableString = new SpannableString(c(str));
        int iIndexOf = spannableString.toString().indexOf(str2);
        if (iIndexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(this.f10362b.getResources().getColor(R.color.custom_Button_Text_Color)), iIndexOf, str2.length() + iIndexOf, 33);
        }
        return spannableString;
    }

    public void d(String str, String str2, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Login_MainInteractorsUtils", "Enter showHmsDialog ");
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.f10362b);
        builder.e(str).a(str2).b(this.h.getString(R.string.IDS_settings_button_ok), new View.OnClickListener() { // from class: com.huawei.health.utils.MainInteractorsUtils.24
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                iBaseResponseCallback.a(1, "");
            }
        }).a(this.h.getString(R.string.IDS_settings_button_cancal), new View.OnClickListener() { // from class: com.huawei.health.utils.MainInteractorsUtils.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Login_MainInteractorsUtils", "cancel click");
                iBaseResponseCallback.a(2, "");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public int h() {
        int i = this.f;
        if (i == 1) {
            return 2002;
        }
        return i == 2 ? 2003 : 2001;
    }

    public static boolean b(Context context) {
        int iA = new PackageManagerHelper(context).a(CommonUtil.x());
        boolean z = iA > 0;
        LogUtil.e("Login_MainInteractorsUtils", "versionCode:" + iA);
        return z;
    }

    public void m() {
        LogUtil.a("Login_MainInteractorsUtils", "Enter gotoGooglePlayForUadate");
        this.f = 1;
        Activity activity = this.h;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.huawei.hwid"));
            intent.setPackage("com.android.vending");
            activity.startActivityForResult(intent, h());
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Login_MainInteractorsUtils", "can not open google play");
        }
    }

    public static int c() {
        ArrayList arrayList = new ArrayList(0);
        arrayList.add("arm64-v8a");
        arrayList.add("armeabi-v7a");
        try {
            return "arm64-v8a".equalsIgnoreCase(AbiUtil.e(arrayList)) ? 1 : 0;
        } catch (HafRuntimeException unused) {
            LogUtil.j("Login_MainInteractorsUtils", "findBasePrimaryAbi failed");
            return 0;
        }
    }

    public void f() {
        if (!Utils.o() || Utils.h()) {
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: checkAccountSync enter");
            String accountInfo = LoginInit.getInstance(this.f10362b).getAccountInfo(1011);
            lmf.d().c(accountInfo);
            lmf.d().a(LoginInit.getInstance(this.f10362b).getAccountInfo(1010));
            LogUtil.d("Login_MainInteractorsUtils", "accountmigrate checkAccountSync userId:", accountInfo);
            HashMap map = new HashMap();
            map.put("click", "1");
            lmf.d().c(this.f10362b, AnalyticsValue.HEALTH_LOGIN_APP_2050001.value(), map, 0);
            map.put("arch64", String.valueOf(e));
            map.put("sdk_ver", Build.VERSION.RELEASE);
            map.put("sdk_int", String.valueOf(Build.VERSION.SDK_INT));
            map.put("dev_manufacturer", Build.MANUFACTURER);
            map.put("dev_board", Build.BOARD);
            map.put("dev_model", Build.MODEL);
            lmf.d().c(this.f10362b, AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value(), map, 0);
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: checkAccountSync end");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        AccountHelper.setDownloadHmsTryCnt(this.f10362b, i);
    }

    public int g() {
        return AccountHelper.getDownloadHmsTryCnt(this.f10362b);
    }

    public static void b() {
        Intent intent = new Intent();
        intent.setAction("com.huawei.commonui.CLEAN_ACTIVITY");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    public void u() {
        String string;
        String string2;
        LogUtil.d("Login_MainInteractorsUtils", "showAlertDialog");
        if (b(this.h)) {
            string = this.h.getResources().getString(R.string.IDS_hwh_home_health_login_update_hwid);
            string2 = this.h.getResources().getString(R.string.IDS_hwh_home_health_login_update_old_hwid_notes);
        } else {
            string = this.h.getResources().getString(R.string.IDS_service_area_notice_title);
            string2 = this.h.getResources().getString(R.string.IDS_hwh_home_health_login_update_notes);
        }
        d(string, string2, new IBaseResponseCallback() { // from class: com.huawei.health.utils.MainInteractorsUtils.23
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (1 == i) {
                    int iG = MainInteractorsUtils.this.g();
                    if (CommonUtil.ab(MainInteractorsUtils.this.f10362b)) {
                        MainInteractorsUtils.this.e(iG + 1);
                    }
                    MainInteractorsUtils.this.m();
                    return;
                }
                LogUtil.j("Login_MainActivity", "finish MainAcitivity for cause:", "cancel update hms by google");
                MainInteractorsUtils.b();
            }
        });
    }

    public void w() {
        String strE = SharedPreferenceManager.e(this.f10362b, Integer.toString(10000), "start_huawei_health_current_time");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.a("Login_MainInteractorsUtils", " setFirstStartTime setSharedPreference result is ", Integer.valueOf(SharedPreferenceManager.e(this.f10362b, Integer.toString(10000), "start_huawei_health_current_time", String.valueOf(System.currentTimeMillis()), null)));
        } else {
            LogUtil.a("Login_MainInteractorsUtils", " setFirstStartTime getSharedPreference startTime is ", strE);
        }
    }

    public void b(String str, boolean z) {
        String str2;
        if (!z) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        SharedPreferenceManager.e(this.f10362b, Integer.toString(10015), str, str2, new StorageParams(0));
    }

    public void e() {
        AccountHelper.setIsFirstOpenApp(true);
        HashMap map = new HashMap();
        map.put("click", "1");
        lmf.d().c(this.f10362b, AnalyticsValue.HEALTH_GUIDE_PAGE_2070001.value(), map, 0);
        StorageParams storageParams = new StorageParams();
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10005), "health_guide_page", "health_app_first_start", storageParams);
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10005), "is_over_rride", "0", storageParams);
    }

    public void y() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.utils.MainInteractorsUtils.26
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferenceUtil.getInstance(MainInteractorsUtils.this.f10362b).loadAllHealthData();
                iqb.b().a();
                DfxBaseHandler.deleteOtherAllDfxLogFile(new File(CommonUtil.m(MainInteractorsUtils.this.f10362b)));
            }
        });
    }

    public void j() {
        LogUtil.a("Login_MainInteractorsUtils", "enter gotoAccountAuth.");
        Activity activity = this.h;
        if (activity == null) {
            LogUtil.j("Login_MainInteractorsUtils", "gotoAccountAuth() context is null");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.huawei.health.utils.MainInteractorsUtils.28
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent = new Intent(MainInteractorsUtils.this.f10362b, (Class<?>) HuaweiLoginActivity.class);
                    intent.putExtra("requestCode", SleepBaseBarLineChartProvider.MSG_UPDATE_DATA_ORIGINAL_ICON);
                    intent.putExtra(com.huawei.hms.support.hwid.common.constants.CommonConstant.REALNAMERESULT.KEY_VERIFY_TYPE, 1);
                    MainInteractorsUtils.this.h.startActivityForResult(intent, 6003);
                }
            });
        }
    }

    public boolean e(boolean z, int i) {
        if (!z) {
            LogUtil.a("Login_MainInteractorsUtils", "shouldShowGuide ", "SUPPORT_GUIDE ", Boolean.valueOf(z));
            return false;
        }
        if (!LanguageUtil.l(this.f10362b) || Utils.m()) {
            LogUtil.a("Login_MainInteractorsUtils", "shouldShowGuide ", "language ", Boolean.valueOf(LanguageUtil.l(this.f10362b)), "version ", Boolean.valueOf(Utils.m()));
            return false;
        }
        String strValueOf = String.valueOf(i);
        String strE = SharedPreferenceManager.e(this.f10362b, Integer.toString(10005), "version_code_sp");
        LogUtil.a("Login_MainInteractorsUtils", "versionCode = ", strValueOf, "versionCodeSp = ", strE);
        return !strValueOf.equals(strE);
    }

    public void c(int i) {
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10005), "version_code_sp", String.valueOf(i), new StorageParams());
        Intent intent = new Intent();
        intent.setClass(this.h, GuideActivity.class);
        this.h.startActivityForResult(intent, 101);
    }

    public void d(final Handler handler) {
        Context context = BaseApplication.getContext();
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "getUserInfo getUser, hmsCode:", Integer.valueOf(CommonUtil.i(context)), " isHmsLite:", Boolean.valueOf(CommonUtil.z(context)));
        LoginInit.getInstance(context).getUserInfo(new IBaseResponseCallback() { // from class: iqj
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f37967a.a(handler, i, obj);
            }
        });
    }

    public /* synthetic */ void a(Handler handler, int i, Object obj) {
        if (i == 0 && (obj instanceof HiUserInfo)) {
            i();
            handler.removeMessages(6001);
            handler.sendEmptyMessage(6001);
            d(true);
            return;
        }
        d(false);
    }

    public void i() {
        if (!CommonUtil.cc()) {
            ReleaseLogUtil.d("Login_MainInteractorsUtils", "getHomeCountryInfo isSupportHomeCountryVersion false.");
            return;
        }
        String migrateStatus = SharedPreferenceUtil.getInstance(this.f10362b).getMigrateStatus();
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "getHomeCountryInfo migrateStatus:", migrateStatus);
        if (!"true".equals(migrateStatus)) {
            ReleaseLogUtil.c("Login_MainInteractorsUtils", "getHomeCountryInfo showMigrateBaseDataDialog not need to show!");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: iqf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37964c.ak();
                }
            });
            this.h.runOnUiThread(new Runnable() { // from class: com.huawei.health.utils.MainInteractorsUtils.30
                @Override // java.lang.Runnable
                public void run() {
                    ReleaseLogUtil.c("Login_MainInteractorsUtils", "getHomeCountryInfo showMigrateBaseDataDialog show!");
                    SharedPreferenceUtil.getInstance(MainInteractorsUtils.this.f10362b).setMigrateStatus("false");
                    if (Utils.k()) {
                        MainInteractorsUtils.this.as();
                        return;
                    }
                    ioi ioiVarD = ioi.d();
                    String strC = ioiVarD.c(2);
                    String strC2 = ioiVarD.c(3);
                    String strC3 = ioiVarD.c(7);
                    boolean zEquals = "true".equals(strC);
                    boolean zEquals2 = "true".equals(strC2);
                    boolean zEquals3 = "true".equals(strC3);
                    if (zEquals || zEquals2 || zEquals3) {
                        MainInteractorsUtils.this.aq();
                    } else {
                        MainInteractorsUtils.this.as();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: iqn
            @Override // java.lang.Runnable
            public final void run() {
                this.e.p();
            }
        });
        HiHealthNativeApi.a(this.f10362b).migrateBaseData(new HiDataOperateListener() { // from class: com.huawei.health.utils.MainInteractorsUtils.27
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.c("Login_MainInteractorsUtils", "prePareMigrateData errorCode:", Integer.valueOf(i));
            }
        });
        String accountInfo = LoginInit.getInstance(this.f10362b).getAccountInfo(1011);
        bxc.c(accountInfo);
        bxd.e(accountInfo);
        LogUtil.a("Login_MainInteractorsUtils", "prePareMigrateData: courseApi.homeCountryFitnessDataMigrate: ", Boolean.valueOf(((CourseApi) Services.b("CoursePlanService", CourseApi.class)).homeCountryFitnessDataMigrate(accountInfo)));
    }

    public /* synthetic */ void p() {
        otd.c(this.f10362b).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.f10362b).b(qre.f(R.string.IDS_migrate_sync_data)).a(a(this.h, qre.f(R.string.IDS_migrate_base_data_cloud_content))).d(R.string.IDS_migrate_ok_btn, new DialogInterface.OnClickListener() { // from class: iqk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f37968b.c(dialogInterface, i);
            }
        }).a(R.string.IDS_migrate_know_btn, new DialogInterface.OnClickListener() { // from class: iqs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ReleaseLogUtil.c("Login_MainInteractorsUtils", "showMigrateBaseDataDialog cancel");
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "showMigrateBaseDataDialog ok");
        this.f10362b.startActivity(new Intent(this.f10362b, (Class<?>) AppSettingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void as() {
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.f10362b).b(qre.f(R.string.IDS_migrate_no_cloud_title)).a(a(this.h, qre.f(R.string.IDS_migrate_base_data_content))).d(R.string.IDS_migrate_know_btn, new DialogInterface.OnClickListener() { // from class: iqh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainInteractorsUtils.a(dialogInterface, i);
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    private View a(Context context, String str) {
        View viewInflate = View.inflate(context, R.layout.dialog_migrate_form, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_health_start_title);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.hw_health_secondary_item_one);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.hw_health_secondary_item_two);
        healthTextView.setText(str);
        healthTextView2.setText(am());
        healthTextView3.setText(ae());
        return viewInflate;
    }

    private static SpannableString am() {
        String strF = qre.f(R.string.IDS_migrate_base_sport);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_migrate_base_sport_content, strF));
        qri.a(spannableString, strF, new ForegroundColorSpan(qre.e(R.color.textColorPrimary)));
        return spannableString;
    }

    private static SpannableString ae() {
        String strF = qre.f(R.string.IDS_migrate_base_health);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_migrate_base_health_content, strF));
        qri.a(spannableString, strF, new ForegroundColorSpan(qre.e(R.color.textColorPrimary)));
        return spannableString;
    }

    public void e(final Handler handler) {
        f10361a = false;
        boolean isLogined = LoginInit.getInstance(this.f10362b).getIsLogined();
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "getLastClearCloudDataTime isLogined:", Boolean.valueOf(isLogined));
        if (isLogined) {
            long j = CommonUtil.j(SharedPreferenceManager.e(this.f10362b, Integer.toString(10000), "hw_health_start_count_key"));
            ReleaseLogUtil.c("Login_MainInteractorsUtils", "getLastClearCloudDataTime startCount = ", Long.valueOf(j));
            if (j < 2) {
                ReleaseLogUtil.c("Login_MainInteractorsUtils", "getLastClearCloudDataTime first enter app");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: iqm
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.i(handler);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void i(final Handler handler) {
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "getLastClearCloudDataTime enter");
        lqo.b(com.huawei.haf.application.BaseApplication.b()).b(1, new ResultCallback<LastClearCloudDataTimeRsp>() { // from class: com.huawei.health.utils.MainInteractorsUtils.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(LastClearCloudDataTimeRsp lastClearCloudDataTimeRsp) {
                DeleteOperationRecord lastRecord = lastClearCloudDataTimeRsp.getLastRecord();
                if (lastRecord == null) {
                    ReleaseLogUtil.d("Login_MainInteractorsUtils", "getLastClearCloudDataTime record == null");
                    return;
                }
                long operateTime = lastRecord.getOperateTime();
                String strE = SharedPreferenceManager.e(MainInteractorsUtils.this.f10362b, Integer.toString(10000), "service_last_clear_cloud_data_time");
                ReleaseLogUtil.c("Login_MainInteractorsUtils", "getLastClearCloudDataTime cloudTime：", Long.valueOf(operateTime), " lastTimeSp：", strE);
                if (TextUtils.isEmpty(strE)) {
                    MainInteractorsUtils.this.e(handler, operateTime);
                } else {
                    MainInteractorsUtils mainInteractorsUtils = MainInteractorsUtils.this;
                    mainInteractorsUtils.c(handler, operateTime, CommonUtil.m(mainInteractorsUtils.f10362b, strE));
                }
                SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "service_last_clear_cloud_data_time", String.valueOf(operateTime), new StorageParams());
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.d("Login_MainInteractorsUtils", "getLastClearCloudDataTime fail:", th.getMessage());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Handler handler, long j, long j2) {
        if (j <= j2) {
            ReleaseLogUtil.d("Login_MainInteractorsUtils", "judgeByLastTime no need show.");
            return;
        }
        ReleaseLogUtil.d("Login_MainInteractorsUtils", "judgeByLastTime need show, cloudTime <= lastTime.");
        al();
        handler.sendEmptyMessage(6014);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Handler handler, long j) {
        long jAi = ai();
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "judgeByAuthorizedAgreeTime cloudTime = ", Long.valueOf(j), " authorizedAgreeTime = ", Long.valueOf(jAi));
        if (jAi < j) {
            al();
            handler.sendEmptyMessage(6014);
        }
    }

    private void al() {
        ReleaseLogUtil.d("Login_MainInteractorsUtils", "getLastClearCloudDataTime setShowingServiceState.");
        f10361a = true;
        SharedPreferenceManager.e(this.h, Integer.toString(10000), "if_first_agr_sign", "", null);
    }

    private long ai() {
        String strE = SharedPreferenceManager.e(com.huawei.haf.application.BaseApplication.b(), Integer.toString(10000), "agr_if_privacy_authorize_details");
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "getAuthorizedAgreeTime json ：", strE);
        List arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strE)) {
            try {
                arrayList = (List) qqt.c(strE, new TypeToken<ArrayList<String>>() { // from class: com.huawei.health.utils.MainInteractorsUtils.11
                }.getType());
            } catch (JsonSyntaxException unused) {
                ReleaseLogUtil.b("Login_MainInteractorsUtils", "getAuthorizedAgreeTime json syntax exception: ", strE);
            }
        }
        if (njy.e(arrayList)) {
            ReleaseLogUtil.d("Login_MainInteractorsUtils", "getAuthorizedAgreeTime saveMsg is empty.");
            return 0L;
        }
        String str = (String) arrayList.get(Math.max(0, arrayList.size() - 6));
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "getAuthorizedAgreeTime timeStr: ", str);
        return CommonUtil.m(this.f10362b, str);
    }

    public void ab() {
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "showServiceDeregisteredDialog enter");
        new wme(this.h).d(this.h);
        String strF = qre.f(R.string.IDS_deregistered_service_title);
        String strF2 = qre.f(R.string.IDS_deregistered_service_tip);
        String upperCase = qre.f(R.string.IDS_close_btn).toUpperCase();
        String upperCase2 = qre.f(R.string.IDS_hw_watchface_login).toUpperCase();
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.f10362b);
        builder.e(strF).a(strF2).b(upperCase2, new View.OnClickListener() { // from class: iqe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37963c.b(view);
            }
        }).a(upperCase, new View.OnClickListener() { // from class: iqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainInteractorsUtils.a(view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void b(View view) {
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "showServiceDeregisteredDialog ok");
        f10361a = false;
        CommonLibUtil.d(this.f10362b);
    }

    public static /* synthetic */ void a(View view) {
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "showServiceDeregisteredDialog cancel");
        f10361a = false;
        System.exit(0);
    }

    private void d(boolean z) {
        ddv.b().functionEntrance("Login_MainInteractorsUtils", z);
        if (z) {
            btw.d();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    public void z() {
        byte b2;
        LogUtil.d("Login_MainInteractorsUtils", "MainActivit_showGenderDialog");
        String strE = SharedPreferenceManager.e(this.f10362b, Integer.toString(10000), "hw_health_gender_value");
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1005);
        LogUtil.d("Login_MainInteractorsUtils", "MainActivit_showGenderDialog_showgender", strE, "+ newGenderValue = ", accountInfo);
        String strE2 = SharedPreferenceManager.e(this.f10362b, Integer.toString(10000), "hw_health_huid_value");
        String accountInfo2 = LoginInit.getInstance(this.f10362b).getAccountInfo(1011);
        if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strE2) || !strE2.equals(accountInfo2)) {
            LogUtil.a("Login_MainInteractorsUtils", "genderValue is null");
            SharedPreferenceManager.e(this.f10362b, Integer.toString(10000), "hw_health_gender_value", accountInfo, new StorageParams(1));
            SharedPreferenceManager.e(this.f10362b, Integer.toString(10000), "hw_health_huid_value", accountInfo2, new StorageParams(1));
            return;
        }
        if (TextUtils.isEmpty(accountInfo) || strE.equals(accountInfo)) {
            return;
        }
        accountInfo.hashCode();
        switch (accountInfo) {
            case "0":
                b2 = 0;
                break;
            case "1":
                b2 = 1;
                break;
            case "2":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            String lowerCase = this.f10362b.getString(R.string.IDS_hwh_home_other_gender_male).toLowerCase();
            b(b(this.f10362b.getString(R.string.IDS_hwh_home_other_onboarding_gender_abnormal, lowerCase), lowerCase));
        } else if (b2 == 1) {
            String lowerCase2 = this.f10362b.getString(R.string.IDS_hwh_home_other_gender_female).toLowerCase();
            b(b(this.f10362b.getString(R.string.IDS_hwh_home_other_onboarding_gender_abnormal, lowerCase2), lowerCase2));
        } else if (b2 == 2) {
            b(new SpannableString(c(this.f10362b.getString(R.string.IDS_hwh_home_other_onboarding_gender_abnormal_content))));
        }
        SharedPreferenceManager.e(this.f10362b, Integer.toString(10000), "hw_health_gender_value", accountInfo, new StorageParams(1));
    }

    public void b(ExecutorService executorService) {
        if (executorService != null) {
            Context context = this.f10362b;
            if (context == null) {
                LogUtil.e("Login_MainInteractorsUtils", "pullAchievementAdapter mContext = null");
            } else {
                final boolean zO = oru.a(context).o();
                executorService.execute(new Runnable() { // from class: com.huawei.health.utils.MainInteractorsUtils.4
                    @Override // java.lang.Runnable
                    public void run() {
                        oru.a(MainInteractorsUtils.this.f10362b).c(zO);
                        oru.a(MainInteractorsUtils.this.f10362b).g();
                        oru.a(MainInteractorsUtils.this.f10362b).c();
                        long j = CommonUtil.j(SharedPreferenceManager.e(MainInteractorsUtils.this.f10362b, Integer.toString(10000), "hw_health_start_count_key"));
                        LogUtil.a("Login_MainInteractorsUtils", "initLoginedData startCount = ", Long.valueOf(j));
                        if (j == 1) {
                            otx.b(MainInteractorsUtils.this.f10362b).a(pal.c(-4, System.currentTimeMillis(), 1), System.currentTimeMillis(), 11, null);
                            LogUtil.a("Login_MainInteractorsUtils", "pullAchievement generateReportData！");
                        }
                    }
                });
            }
        }
    }

    public boolean t() {
        wmq wmqVarA = wmq.a(this.f10362b);
        return "true".equals(wmqVarA.c(2)) && "true".equals(wmqVarA.c(3)) && "true".equals(wmqVarA.c(6));
    }

    public void j(Handler handler) {
        ioi ioiVarD = ioi.d();
        String strC = ioiVarD.c(3);
        LogUtil.a("Login_MainInteractorsUtils", "shouldSetData sportData ", strC);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.a("Login_MainInteractorsUtils", "PRIVACY_SPORT_DATA  is null");
            if (TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10005), "is_over_rride"))) {
                LogUtil.a("Login_MainInteractorsUtils", "isOverride and sport data is Empty");
                ioiVarD.e(3, true, null, null);
                ioiVarD.e(6, true, null, null);
                ioiVarD.e(7, true, null, null);
                return;
            }
            LogUtil.a("Login_MainInteractorsUtils", "new install data is empty");
            handler.sendEmptyMessage(MainLoginCallBack.MSG_NO_NETWORK);
            return;
        }
        handler.sendEmptyMessage(MainLoginCallBack.MSG_NO_NETWORK);
    }

    public boolean f(Context context) {
        return CommonUtil.ab(context);
    }

    public void e(ExecutorService executorService, final Handler handler) {
        LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: checkIsReceivedCloudPush() getUserMergeInfo call back");
        if (AccountInteractors.isReceivedCloudPush(this.f10362b) && f(this.f10362b) && !Utils.m()) {
            if (executorService == null || executorService.isShutdown()) {
                LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: checkIsReceivedCloudPush() mExecutorService is shutdown");
                return;
            } else {
                executorService.execute(new Runnable() { // from class: com.huawei.health.utils.MainInteractorsUtils.1
                    @Override // java.lang.Runnable
                    public void run() {
                        lqo.b(MainInteractorsUtils.this.f10362b).d(new GetUserMergeInfoReq(), new ICloudOperationResult<GetUserMergeInfoRsp>() { // from class: com.huawei.health.utils.MainInteractorsUtils.1.4
                            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                            public void operationResult(GetUserMergeInfoRsp getUserMergeInfoRsp, String str, boolean z) {
                                LogUtil.a("Login_MainInteractorsUtils", "accountmigrate:checkIsReceivedCloudPush() getUserMergeInfo call back");
                                if (getUserMergeInfoRsp != null) {
                                    LogUtil.d("Login_MainInteractorsUtils", "accountmigrate: checkIsReceivedCloudPush() getUserMergeInfo " + getUserMergeInfoRsp.toString() + " text = " + str + "isSuccess = " + z);
                                    AccountInteractors.clearCloudPushRecevieTag(MainInteractorsUtils.this.f10362b);
                                    List<UserMergeInfo> userMergeInfos = getUserMergeInfoRsp.getUserMergeInfos();
                                    for (int i = 0; i < userMergeInfos.size(); i++) {
                                        String originalHuid = userMergeInfos.get(i).getOriginalHuid();
                                        if (userMergeInfos.get(i).getStatus().intValue() == 1) {
                                            lub.c().a(originalHuid, LoginInit.getInstance(MainInteractorsUtils.this.f10362b).getAccountInfo(1011));
                                        }
                                    }
                                    handler.sendEmptyMessage(4017);
                                    return;
                                }
                                LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: checkIsReceivedCloudPush() getUserMergeInfo == null");
                            }
                        });
                    }
                });
                return;
            }
        }
        LogUtil.a("Login_MainInteractorsUtils", "accountmigrate:checkIsReceivedCloudPush() else");
    }

    public void b(ExecutorService executorService, final Handler handler) {
        LogUtil.a("Login_MainInteractorsUtils", "accountmigrate:  checkCloudAndLocalMigrated()");
        if (executorService == null || executorService.isShutdown()) {
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate:  checkCloudAndLocalMigrated() is shutdown");
        } else {
            executorService.execute(new Runnable() { // from class: com.huawei.health.utils.MainInteractorsUtils.3
                @Override // java.lang.Runnable
                public void run() {
                    int iCheckCloudAndLocalDataMigrated = AccountInteractors.checkCloudAndLocalDataMigrated(MainInteractorsUtils.this.f10362b);
                    LogUtil.a("Login_MainInteractorsUtils", "accountmigrate:  checkCloudAndLocalMigrated() bothMigrated = ", Integer.valueOf(iCheckCloudAndLocalDataMigrated));
                    for (int i = 0; i < iCheckCloudAndLocalDataMigrated; i++) {
                        handler.sendEmptyMessage(4009);
                    }
                    AccountInteractors.clearCloudAndLocalDataMigratedTag(MainInteractorsUtils.this.f10362b);
                }
            });
        }
    }

    public void a(MergeUserAllDataReq mergeUserAllDataReq, Boolean bool, String str, Handler handler) {
        LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyDataByType");
        AccountInteractors.saveMigrateInfoToDb(mergeUserAllDataReq.getOriginalHuid(), mergeUserAllDataReq.getOriginalServiceToken(), LoginInit.getInstance(this.f10362b).getAccountInfo(1011), true);
        if (AccountHelper.getAccountType() == 1) {
            b(3, str, handler);
            return;
        }
        if (bool.booleanValue()) {
            b(4, str, handler);
        } else if (AccountHelper.getAccountType() == 2) {
            b(2, str, handler);
        } else {
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyDataByType fail");
        }
    }

    public void b(int i, String str, Handler handler) {
        LogUtil.a("TimeEat_MainInteractorsUtils", "accountmigrate: Enter copyData and type = ", Integer.valueOf(i));
        String strC = KeyValDbManager.d(this.f10362b).c("is_database_update_success");
        LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyData isdatabaseupdatesuccessful == " + strC);
        if (i == 2) {
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyData type == 2");
            str = AccountHelper.getHiAccountInfo().getHuid();
        } else if (i == 3) {
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyData type == 3, need judge database whether update done");
            if ("1".equals(strC)) {
                LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyData type == 3, judge database update done");
                str = SharedPreferenceManager.e(this.f10362b, Integer.toString(10015), "old_huid_need_to_migrate");
            } else {
                LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyData type == 3, judge database update not complete, next enter do again!");
                return;
            }
        } else if (i == 4) {
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyData type == 4, last cloud timeout and exception exit");
            if (TextUtils.isEmpty(str)) {
                LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyData sendMigrateOrigalHuid is empty");
                return;
            }
        } else {
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyData not type");
            str = null;
        }
        LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyData  isdatabaseupdatesuccessful == ", strC, "and getDatabasePath(DataBaseHelper.DATABASE_NAME).exists() is", Boolean.valueOf(BaseApplication.getContext().getDatabasePath("health_cloud.db").exists()));
        c(str, handler);
        LogUtil.a("TimeEat_MainInteractorsUtils", "Leave copyData");
    }

    public void c(String str, Handler handler) {
        LogUtil.a("TimeEat_MainInteractorsUtils", "accountmigrate: copyByHuid = ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyByHuid old is Empty");
            return;
        }
        String strC = KeyValDbManager.d(this.f10362b).c("is_database_update_success");
        KeyValDbManager.d(this.f10362b).b("is_database_update_success", "0");
        LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyData  isdatabaseupdatesuccessful == ", strC, "and getDatabasePath(DataBaseHelper.DATABASE_NAME).exists() is", Boolean.valueOf(BaseApplication.getContext().getDatabasePath("health_cloud.db").exists()));
        if (!"1".equals(strC) && BaseApplication.getContext().getDatabasePath("health_cloud.db").exists()) {
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyData  accountType == 1 and 1 is databaseupdatesuccessful");
            return;
        }
        String accountInfo = LoginInit.getInstance(this.f10362b).getAccountInfo(1011);
        try {
            if ("0".equals(str) || "com.huawei.health".equals(str)) {
                LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: copyData old = defualt");
                a(handler, "com.huawei.health", accountInfo, false);
            } else {
                a(handler, str, accountInfo, false);
            }
        } catch (Exception unused) {
            LogUtil.e("Login_MainInteractorsUtils", "accountmigrate: copyData copyHealthDatasFromAtoB copyByHuid Exception");
        }
        LogUtil.a("TimeEat_MainInteractorsUtils", "Leave copyByHuid");
    }

    private void ah() {
        if (!CommonUtil.ab(this.f10362b)) {
            LogUtil.a("Login_MainInteractorsUtils", "doSyncGoogleFit network is not connected!");
            return;
        }
        boolean zE = wzu.a().e();
        LogUtil.a("Login_MainInteractorsUtils", "doSyncGoogleFit.isConnect = " + zE);
        if (zE) {
            new GoogleFitDataManage(this.f10362b).d();
            LogUtil.a("Login_MainInteractorsUtils", "doSyncGoogleFit end");
        }
    }

    private void af() {
        LogUtil.d("Login_MainInteractorsUtils", "doSyncThirdPartService start.");
        if (CommonUtil.cb()) {
            ah();
        }
    }

    public void b(Handler handler, Intent intent) {
        LogUtil.d("Login_MainInteractorsUtils", "SyncBroadcastReceiver action = ACTION_SYNC");
        handler.sendMessage(handler.obtainMessage(3, 0, 0, intent));
        int intExtra = intent.getIntExtra("com.huawei.hihealth.action_sync_status", -1);
        LogUtil.d("Login_MainInteractorsUtils", "HiBroadcastAction =" + intExtra);
        if (1000 == intExtra) {
            af();
        }
    }

    public void b(String str, Handler handler) {
        LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: SyncBroadcastReceiver action = ACTION_SQLITE_UPGRADE_DONE oldhuidhistory = ", Integer.valueOf(AccountHelper.getOldHidHistory()));
        if (AccountHelper.getOldHidHistory() != 1) {
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: SyncBroadcastReceiver action = ACTION_SQLITE_UPGRADE_DONE oldhuidhistory not 1");
            b(1, str, handler);
        }
    }

    public HiAccountInfo x() {
        HiAccountInfo hiAccountInfo = new HiAccountInfo();
        LoginInit loginInit = LoginInit.getInstance(this.f10362b);
        String accountInfo = loginInit.getAccountInfo(1015);
        hiAccountInfo.setAccessToken(accountInfo);
        hiAccountInfo.setHuid(loginInit.getAccountInfo(1011));
        hiAccountInfo.setServiceToken(accountInfo);
        hiAccountInfo.setSiteId(CommonUtil.n(this.f10362b, loginInit.getAccountInfo(1009)));
        return hiAccountInfo;
    }

    public void h(Handler handler) {
        HuaweiLoginManager.setIsAllowedLoginValueToDB(this.f10362b, "0");
        String strD = KeyManager.d();
        String accountInfo = LoginInit.getInstance(this.f10362b).getAccountInfo(1011);
        LogUtil.a("Login_MainInteractorsUtils", "doInitPluginLoginHiHealth isClone=", Boolean.valueOf(KeyManager.g()));
        if (KeyManager.g()) {
            if (TextUtils.isEmpty(strD) || strD.equals(accountInfo)) {
                handler.sendEmptyMessage(10089);
            } else {
                KeyManager.a();
            }
        }
    }

    public void k() {
        String strC = ioi.d().c(403);
        LogUtil.a("Login_MainInteractorsUtils", "initKakaCheckInReminder status = ", strC);
        if (String.valueOf(true).equals(strC)) {
            pap.c();
        } else {
            pap.d();
        }
    }

    public void e(Context context, Intent intent) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - this.f10363c) < 5000) {
            LogUtil.a("Login_MainInteractorsUtils", "currentTime - mLastAccessTime  < INTERVAL_TIME_VALUE");
            return;
        }
        this.f10363c = jCurrentTimeMillis;
        boolean booleanExtra = intent.getBooleanExtra("logoutNotExit", false);
        AccountHelper.setLoginnotexit(booleanExtra);
        oet.d().b();
        LogUtil.d("Login_MainInteractorsUtils", "accountmigrate: relogin SyncBroadcastReceiver action = ACTION_LOGOUT_SUCCESSFUL loginnotexit 111 invalidST = " + intent.getStringExtra("invalidst"));
        if (booleanExtra && !AccountHelper.getIsCheckLogining()) {
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: relogin SyncBroadcastReceiver action = ACTION_LOGOUT_SUCCESSFUL loginnotexit");
            return;
        }
        LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: relogin: SyncBroadcastReceiver action = ACTION_LOGOUT_SUCCESSFUL loginnotexit = false");
        SharedPreferenceManager.e(this.f10362b, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN, "0", new StorageParams(0));
    }

    public void b(Handler handler) {
        LogUtil.a("Login_MainInteractorsUtils", "judgeAccountOverAge");
        String accountInfo = LoginInit.getInstance(this.f10362b).getAccountInfo(1010);
        if (!"true".equalsIgnoreCase(SharedPreferenceManager.e(this.f10362b, Integer.toString(20000), "key_ui_age_less_minimum")) || TextUtils.isEmpty(accountInfo) || "CN".equalsIgnoreCase(accountInfo)) {
            return;
        }
        String strE = SharedPreferenceManager.e(this.f10362b, Integer.toString(20000), "key_ui_if_show_age_less_minimum_alert");
        if (TextUtils.isEmpty(strE) || "false".equalsIgnoreCase(strE)) {
            LogUtil.a("Login_MainInteractorsUtils", "judgeAccountOverAge show alert");
            handler.sendEmptyMessage(4016);
            SharedPreferenceManager.e(this.f10362b, Integer.toString(20000), "key_ui_if_show_age_less_minimum_alert", String.valueOf(true), new StorageParams());
        }
    }

    public void c(Handler handler) {
        String accountInfo = LoginInit.getInstance(this.f10362b).getAccountInfo(1010);
        if (TextUtils.isEmpty(accountInfo) || CloudImpl.e(this.f10362b).isOverseaJudgeByCountry(accountInfo)) {
            return;
        }
        String strE = SharedPreferenceManager.e(this.f10362b, Integer.toString(20000), "key_ui_if_show_no_cloud_account_alert");
        if (TextUtils.isEmpty(strE) || "false".equalsIgnoreCase(strE)) {
            handler.sendEmptyMessage(4015);
            SharedPreferenceManager.e(this.f10362b, Integer.toString(20000), "key_ui_if_show_no_cloud_account_alert", String.valueOf(true), new StorageParams());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        this.j.dismiss();
        this.j = null;
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "oversea_user_agreed", str, new StorageParams(0));
    }

    public void a(final int i, ExecutorService executorService) {
        if (executorService != null) {
            if (executorService.isShutdown()) {
                executorService = Executors.newSingleThreadExecutor();
            }
            executorService.execute(new Runnable() { // from class: com.huawei.health.utils.MainInteractorsUtils.8
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    if (!lvi.f(i)) {
                        str = "SMART_WATCH";
                    } else {
                        str = "SMART_BAND";
                    }
                    ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByDeviceType(str);
                }
            });
        }
    }

    public void b(final int i, final ExecutorService executorService) {
        LogUtil.a("Login_MainInteractorsUtils", "enter showOverSeaDialog");
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.f10362b);
        builder.a(R.string.IDS_service_area_notice_title).b(R.string.IDS_device_download_resoure_tip_content_message_new).a(R.string.IDS_hwh_open_service_pop_up_notification_agree, new View.OnClickListener() { // from class: com.huawei.health.utils.MainInteractorsUtils.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MainInteractorsUtils.this.e("true");
                MainInteractorsUtils.this.a(i, executorService);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.utils.MainInteractorsUtils.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MainInteractorsUtils.this.e("false");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.j = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.j.show();
        LogUtil.a("Login_MainInteractorsUtils", "end showOverSeaDialog");
    }

    public void c(int i, ExecutorService executorService, Handler handler) {
        String str;
        if (!Utils.o()) {
            if (!lvi.f(i)) {
                str = "SMART_WATCH";
            } else {
                str = "SMART_BAND";
            }
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByDeviceType(str);
            return;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "oversea_user_agreed");
        LogUtil.a("Login_MainInteractorsUtils", "wear device plugin download is user agreed :" + strE);
        if (TextUtils.equals(strE, "true")) {
            a(i, executorService);
        } else if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(4014);
            messageObtainMessage.arg1 = i;
            handler.sendMessage(messageObtainMessage);
        }
    }

    public void c(final ExecutorService executorService, final Handler handler) {
        if (!CommonUtil.ck() || executorService == null || executorService.isShutdown()) {
            return;
        }
        executorService.execute(new Runnable() { // from class: com.huawei.health.utils.MainInteractorsUtils.6
            @Override // java.lang.Runnable
            public void run() {
                DeviceInfo deviceInfoC = mgg.c("Login_MainInteractorsUtils");
                if (deviceInfoC == null || !lvi.n(deviceInfoC.getProductType())) {
                    LogUtil.j("Login_MainInteractorsUtils", "current device is null or not support download!");
                    return;
                }
                int productType = deviceInfoC.getProductType();
                LogUtil.a("Login_MainInteractorsUtils", "current device support download type:", Integer.valueOf(productType));
                boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(lvi.j(productType));
                Boolean.valueOf(zIsResourcesAvailable).getClass();
                if (zIsResourcesAvailable) {
                    LogUtil.a("Login_MainInteractorsUtils", "current device has downloaded!!!");
                } else {
                    LogUtil.a("Login_MainInteractorsUtils", "current device has not downloaded!!!");
                    MainInteractorsUtils.this.c(productType, executorService, handler);
                }
            }
        });
    }

    public void c(ExecutorService executorService) {
        if (Utils.k() || executorService == null || executorService.isShutdown()) {
            return;
        }
        executorService.execute(new Runnable() { // from class: com.huawei.health.utils.MainInteractorsUtils.10
            @Override // java.lang.Runnable
            public void run() {
                rcz.c().d();
            }
        });
    }

    public void e(ExecutorService executorService, final ContentValues contentValues) {
        if (Utils.k() || executorService == null || executorService.isShutdown()) {
            return;
        }
        executorService.execute(new Runnable() { // from class: com.huawei.health.utils.MainInteractorsUtils.13
            @Override // java.lang.Runnable
            public void run() {
                rcz.c().b(contentValues);
            }
        });
    }

    public void a(VersionMgrApi versionMgrApi) {
        LogUtil.a("Login_MainInteractorsUtils", "autoCheckAppNewVersionService()");
        if (versionMgrApi != null) {
            versionMgrApi.autoCheckAppNewVersionService();
            if (versionMgrApi.haveNewAppVersion(this.f10362b)) {
                return;
            }
            versionMgrApi.deleteMessage();
        }
    }

    public void c(Handler handler, ExecutorService executorService, VersionMgrApi versionMgrApi) {
        if (com.huawei.haf.application.BaseApplication.h()) {
            LogUtil.a("Login_MainInteractorsUtils", "autoCheckAppNewVersionService_isForeground_stop");
            a(versionMgrApi);
            AppBundle.d().updateModules(this.f10362b, false);
            c(executorService, handler);
            c(executorService);
            ipx.b();
        } else {
            LogUtil.a("Login_MainInteractorsUtils", "autoCheckAppNewVersionService_isForeground_fail");
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "wifi_weight_device", "wifi_push_regist_key");
        if (strE != null && "1".equals(strE)) {
            SyncCloudUtils.e(2, HiSyncType.HiSyncDataType.f12263a, 2);
        }
        LogUtil.a("Login_MainInteractorsUtils", "Trigger one sync cloud in mainActivity， syncingFlag=", strE);
    }

    public void d(ExecutorService executorService) {
        if (executorService == null) {
            executorService = Executors.newSingleThreadExecutor();
        }
        executorService.execute(new Runnable() { // from class: com.huawei.health.utils.MainInteractorsUtils.12

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f10368b = 100;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f10369c = 30;
            private int d = 50;
            private int e = 20;

            @Override // java.lang.Runnable
            public void run() {
                String strE = SharedPreferenceManager.e(MainInteractorsUtils.this.f10362b, Integer.toString(10000), "traffic_time");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (CommonUtil.c(strE, jCurrentTimeMillis)) {
                    MainInteractorsUtils.d(MainInteractorsUtils.this.f10362b, "traffic_time", jCurrentTimeMillis);
                    MainInteractorsUtils.d(MainInteractorsUtils.this.f10362b, "wifi_rx", 100L);
                    MainInteractorsUtils.d(MainInteractorsUtils.this.f10362b, "wifi_tx", 30L);
                    MainInteractorsUtils.d(MainInteractorsUtils.this.f10362b, "mobile_rx", 50L);
                    MainInteractorsUtils.d(MainInteractorsUtils.this.f10362b, "mobile_tx", 20L);
                } else {
                    this.f10368b = CommonUtil.e(SharedPreferenceManager.e(MainInteractorsUtils.this.f10362b, Integer.toString(10000), "wifi_rx"), this.f10368b);
                    this.f10369c = CommonUtil.e(SharedPreferenceManager.e(MainInteractorsUtils.this.f10362b, Integer.toString(10000), "wifi_tx"), this.f10369c);
                    this.d = CommonUtil.e(SharedPreferenceManager.e(MainInteractorsUtils.this.f10362b, Integer.toString(10000), "mobile_rx"), this.d);
                    this.e = CommonUtil.e(SharedPreferenceManager.e(MainInteractorsUtils.this.f10362b, Integer.toString(10000), "mobile_tx"), this.e);
                }
                try {
                    MainInteractorsUtils.this.b("wifi_rx", "wifi_tx", "mobile_rx", "mobile_tx", this.f10368b, this.f10369c, this.e, this.d, "0.00");
                } catch (Throwable th) {
                    LogUtil.e("Login_MainInteractorsUtils", "Time error Throwable = " + th.getMessage());
                }
            }
        });
    }

    public void g(final Context context) {
        LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: showRootedDialog");
        if (!TextUtils.isEmpty(SharedPreferenceManager.e(context, Integer.toString(10015), "key_ui_login_is_rooted"))) {
            LogUtil.a("Login_MainInteractorsUtils", "accountmigrate: showRootedDialog has showed");
            return;
        }
        String upperCase = context.getString(R.string.IDS_common_notification_know_tips).toUpperCase();
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(context);
        builder.e(context.getString(R.string.IDS_hw_wechat_rank_show_common_title)).a(context.getString(R.string.IDS_hwh_home_main_root_reminder_msg)).b(upperCase, new View.OnClickListener() { // from class: com.huawei.health.utils.MainInteractorsUtils.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SharedPreferenceManager.e(context, Integer.toString(10015), "key_ui_login_is_rooted", "key_ui_login_is_rooted_clicked", new StorageParams(0));
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public void a(String str, String str2, String str3, final int i) {
        LogUtil.a("Login_MainInteractorsUtils", "showSingleButtonDialog enter", " title = ", str, " content = ", str2, " buttonText = ", str3, " type = ", Integer.valueOf(i));
        Context activity = BaseApplication.getActivity() != null ? BaseApplication.getActivity() : this.f10362b;
        if (activity == null) {
            ReleaseLogUtil.d("Login_MainInteractorsUtils", "topActivity and context are null");
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.e(str).a(str2).b(str3, new View.OnClickListener() { // from class: com.huawei.health.utils.MainInteractorsUtils.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Login_MainInteractorsUtils", "showSingleButtonDialog ok");
                if (i == 1) {
                    LogUtil.j("Login_MainActivity", "finish MainAcitivity for cause:", "no network,click I know, quit.");
                }
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public void a(final Handler handler) {
        LogUtil.a("Login_MainInteractorsUtils", "enter checkLoginByDeeplink");
        if (Boolean.parseBoolean(SharedPreferenceManager.e(this.f10362b, String.valueOf(20000), "needLogin"))) {
            if (!LoginInit.getInstance(this.f10362b).isBrowseMode()) {
                SharedPreferenceManager.e(this.f10362b, String.valueOf(20000), "needLogin", String.valueOf(false), null);
            } else if (!"fa".equals(SharedPreferenceManager.e(this.f10362b, String.valueOf(20000), "from"))) {
                LogUtil.a("Login_MainInteractorsUtils", "directNeedLogin goto login");
                LoginInit.getInstance(this.f10362b).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.health.utils.MainInteractorsUtils.16
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        SharedPreferenceManager.e(MainInteractorsUtils.this.f10362b, String.valueOf(20000), "needLogin", String.valueOf(false), null);
                        LogUtil.j("Login_MainInteractorsUtils", "onResponse errorCode:", Integer.valueOf(i));
                        Handler handler2 = handler;
                        if (handler2 == null || i == -1) {
                            return;
                        }
                        handler2.sendEmptyMessage(10);
                    }
                }, "");
            } else {
                SharedPreferenceManager.e(this.f10362b, String.valueOf(20000), "from", "", null);
            }
        }
    }

    public void f(final Handler handler) {
        LogUtil.a("Login_MainInteractorsUtils", "showMigrateDataAlertDialog()");
        SharedPreferenceManager.e(this.f10362b, Integer.toString(10015), "hasRemindMigrateData", String.valueOf(true), null);
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f10362b);
        builder.b(R.string.IDS_hwh_login_data_migration_dialog_content).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.utils.MainInteractorsUtils.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Login_MainInteractorsUtils", "showMigrateDataAlertDialog ok");
                SharedPreferenceManager.e(MainInteractorsUtils.this.f10362b, Integer.toString(10015), "neverMigrateData", String.valueOf(false), null);
                String accountInfo = LoginInit.getInstance(MainInteractorsUtils.this.f10362b).getAccountInfo(1011);
                MainInteractorsUtils mainInteractorsUtils = MainInteractorsUtils.this;
                mainInteractorsUtils.i(mainInteractorsUtils.f10362b);
                MainInteractorsUtils.this.a(handler, "com.huawei.health", accountInfo, false);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.utils.MainInteractorsUtils.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Login_MainInteractorsUtils", "showMigrateDataAlertDialog cancle");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public void v() {
        if (aj()) {
            ReleaseLogUtil.c("Login_MainInteractorsUtils", "AssociationDialog is already showing");
            return;
        }
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "enter showAssociationDialog");
        List<SportEventAssociator.c> listB = SportEventAssociator.b(HwExerciseConstants.MATCHED_COMPETITION);
        if (njy.e(listB) || !an()) {
            return;
        }
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "show showAssociationDialog");
        AssociationDialog associationDialog = new AssociationDialog(this.f10362b, listB);
        this.d = associationDialog;
        associationDialog.show();
    }

    private boolean aj() {
        AssociationDialog associationDialog = this.d;
        return associationDialog != null && associationDialog.isShowing();
    }

    private boolean an() {
        Activity activity = this.h;
        return (activity == null || activity.isFinishing() || this.h.isDestroyed()) ? false : true;
    }

    private String e(Context context, String str) {
        if (context == null || str == null) {
            ReleaseLogUtil.d("R_Login_MainInteractorsUtils", "getEmergencyContactsString context or userId is null");
            return "";
        }
        String strA = a(nio.b(str + "emergency_contacts"));
        if (!TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.c("R_Login_MainInteractorsUtils", "getEmergencyContactsString from mmkv");
            return strA;
        }
        ReleaseLogUtil.c("R_Login_MainInteractorsUtils", "getEmergencyContactsString from sp");
        return d(context, str);
    }

    private String a(String str) {
        try {
            return HwEncryptUtil.b(this.f10362b).c(2, lua.b(String.valueOf(1030), str));
        } catch (ClassCastException | GeneralSecurityException e2) {
            ReleaseLogUtil.b("Login_MainInteractorsUtils", "getContactStringFromMMKV catch exception", e2);
            return "";
        }
    }

    private String d(Context context, String str) {
        try {
            return HwEncryptUtil.b(context).c(2, PreferenceManager.getDefaultSharedPreferences(context).getString(str + "emergency_contacts", ""));
        } catch (ClassCastException | GeneralSecurityException e2) {
            ReleaseLogUtil.b("Login_MainInteractorsUtils", "getContactStringFromSharedPreferences catch exception", e2);
            return "";
        }
    }

    private void d(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("Login_MainInteractorsUtils", "saveEmergencyContacts mContacts isEmpty");
            return;
        }
        List<iod> listE = cxz.e("emergency_contacts", this.f10362b, str);
        if (listE == null || listE.isEmpty()) {
            ReleaseLogUtil.d("Login_MainInteractorsUtils", "saveEmergencyContacts No valid emergency contacts to save.");
            return;
        }
        ReleaseLogUtil.c("Login_MainInteractorsUtils", "begin saveEmergencyContacts");
        Iterator<iod> it = listE.iterator();
        while (it.hasNext()) {
            EmergencyInfoManager.a().a(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context) {
        String strE = e(context, "0");
        if (TextUtils.isEmpty(strE)) {
            strE = e(context, "");
        }
        d(strE);
    }

    public void ag() {
        String str;
        String str2;
        String strE = SharedPreferenceManager.e(this.f10362b, Integer.toString(10015), "key_ui_login_last_time");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        if (TextUtils.isEmpty(strE)) {
            str2 = strValueOf + "," + strValueOf;
            str = strValueOf;
        } else {
            String[] strArrSplit = strE.split(",");
            String str3 = strArrSplit.length > 1 ? strArrSplit[1] : strValueOf;
            str = str3;
            str2 = str3 + "," + strValueOf;
        }
        SharedPreferenceManager.e(this.f10362b, Integer.toString(10015), "key_ui_login_last_time", str2, new StorageParams());
        if (str.equals(strValueOf)) {
            SharedPreferenceManager.c(Integer.toString(10015), "user_first_login_app", "first_login");
        }
        LogUtil.d("Login_MainInteractorsUtils", "updateLastLogin lastLogin = ", str2);
    }

    public void r() {
        if (Utils.h() && LoginInit.getInstance(this.f10362b).getIsLogined() && ThirdPartyLoginManager.getInstance().getLogoutStatus() && !HuaweiLoginManager.checkIsInstallHuaweiAccount(this.f10362b)) {
            Intent intent = new Intent(this.f10362b, (Class<?>) iqd.class);
            intent.setAction(Action.ACTION_HW_ACCOUNT_LOGOUT);
            intent.putExtra(JsbMapKeyNames.H5_USER_ID, LoginInit.getInstance(this.f10362b).getAccountInfo(1011));
            iqd.b().e(this.f10362b, intent);
            CommonUtil.cr();
        }
    }

    public void aa() {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi != null) {
            payApi.startRetrievingOrders();
        }
    }

    public void h(Context context) {
        String country;
        if (LoginInit.getInstance(context).getIsLogined()) {
            country = LoginInit.getInstance(context).getAccountInfo(1010);
        } else {
            country = context.getResources().getConfiguration().locale.getCountry();
        }
        StorageParams storageParams = new StorageParams();
        SharedPreferenceManager.e(context, Integer.toString(10000), "agr_first_sign_country", country, storageParams);
        SharedPreferenceManager.e(context, Integer.toString(10000), "agr_first_sign_language", context.getResources().getConfiguration().locale.getLanguage(), storageParams);
    }

    static class c implements IBaseResponseCallback {
        private c() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 0) {
                LogUtil.a("Login_MainInteractorsUtils", "initAssetMessage success");
                String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
                long jCurrentTimeMillis = System.currentTimeMillis();
                SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_VICTORY), accountInfo + "key_asset_time", String.valueOf(jCurrentTimeMillis), null);
                return;
            }
            LogUtil.j("Login_MainInteractorsUtils", "initAssetMessage errorCode:", Integer.valueOf(i));
        }
    }

    public static void d() {
        LogUtil.a("Login_MainInteractorsUtils", "enter initAssetMessage");
        Context context = BaseApplication.getContext();
        if (LoginInit.getInstance(context).isBrowseMode() || Utils.o() || !VersionControlUtil.isSupportOperationAccount()) {
            LogUtil.a("Login_MainInteractorsUtils", "not need initAssetMessage");
            return;
        }
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        if (!CommonUtil.c(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_VICTORY), accountInfo + "key_asset_time"), System.currentTimeMillis())) {
            LogUtil.a("Login_MainInteractorsUtils", "today has init");
            return;
        }
        final PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j("Login_MainInteractorsUtils", "payApi = null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.utils.MainInteractorsUtils.17
                @Override // java.lang.Runnable
                public void run() {
                    payApi.assetMsgNotify(1, new c());
                }
            });
        }
    }

    public void ad() {
        LogUtil.a("Login_MainInteractorsUtils", "showHwIdStopedDialog");
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.f10362b);
        builder.e(this.f10362b.getString(R.string.IDS_hw_wechat_rank_show_common_title)).a(this.f10362b.getString(R.string.IDS_hwh_home_other_login_hwid_is_stoped)).b(this.f10362b.getString(R.string.IDS_main_btn_state_settings).toUpperCase(), new View.OnClickListener() { // from class: com.huawei.health.utils.MainInteractorsUtils.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Login_MainInteractorsUtils", "showHwIdStopedDialog ok");
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.MAIN");
                    intent.setClassName("com.android.settings", "com.android.settings.ManageApplications");
                    MainInteractorsUtils.this.f10362b.startActivity(intent);
                    LogUtil.j("Login_MainActivity", "finish MainAcitivity for cause:", "HwIdStopedDialog,goto com.android.settings");
                    MainInteractorsUtils.b();
                } catch (Exception unused) {
                    LogUtil.a("Login_MainInteractorsUtils", "open systemmanager failed");
                }
            }
        }).a(this.f10362b.getString(R.string.IDS_hw_health_show_common_dialog_cancle_button).toUpperCase(), new View.OnClickListener() { // from class: com.huawei.health.utils.MainInteractorsUtils.21
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.j("Login_MainActivity", "finish MainAcitivity for cause:", "showHwIdStopedDialog cancel");
                MainInteractorsUtils.b();
            }
        });
        builder.b().show();
    }

    public void ac() {
        LogUtil.a("Login_MainInteractorsUtils", "startDaemonService");
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.putExtra("THE_MAIN_UI_START_DAEMON_SERVICE", true);
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.manager.DaemonService");
        try {
            BaseApplication.getContext().startService(intent);
        } catch (IllegalStateException unused) {
            LogUtil.e("Login_MainInteractorsUtils", "startDaemonService illegalStateException");
        } catch (SecurityException unused2) {
            LogUtil.a("Login_MainInteractorsUtils", "startDaemonService securityException");
        }
    }

    public void a() {
        SyncCloudUtils.a(SyncCloudUtils.AppStartType.COLD_START);
    }

    public void n() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        PluginOperation pluginOperation = PluginOperation.getInstance(this.f10362b);
        pluginOperation.setAdapter(PluginOperationAdapterImpl.getInstance(this.f10362b));
        pluginOperation.init(this.f10362b);
        LogUtil.a("Login_MainInteractorsUtils", "initOperationAdapter finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    public void q() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        PluginHealthTrackAdapterImpl pluginHealthTrackAdapterImpl = PluginHealthTrackAdapterImpl.getInstance(this.f10362b);
        ive iveVarC = ive.c();
        iveVarC.setAdapter(pluginHealthTrackAdapterImpl);
        iveVarC.init(this.f10362b);
        gyp.d().b();
        LogUtil.a("Login_MainInteractorsUtils", "initPluginTrackApapter finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    public void l() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class)) != null) {
            gyo.e().d();
            LogUtil.a("Login_MainInteractorsUtils", "initPluginSuggestinAdapter finished, time cost: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        } else {
            try {
                Services.c("PluginFitnessAdvice", PluginSuggestion.class, com.huawei.haf.application.BaseApplication.b(), new Consumer() { // from class: iql
                    @Override // com.huawei.framework.servicemgr.Consumer
                    public final void accept(Object obj) {
                        this.f37969a.d((PluginSuggestion) obj);
                    }
                }, true);
            } catch (IllegalStateException e2) {
                ReleaseLogUtil.b("Login_MainInteractorsUtils", "initPluginSuggestinAdapter IllegalStateException:", ExceptionUtils.c(e2));
            }
        }
    }

    public /* synthetic */ void d(PluginSuggestion pluginSuggestion) {
        if (pluginSuggestion != null) {
            pluginSuggestion.init(this.f10362b);
        }
        l();
    }

    public void o() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        fga.d(this.f10362b).d();
        LogUtil.a("Login_MainInteractorsUtils", "initOpenSDK finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    public void s() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strE = SharedPreferenceManager.e(this.f10362b, Integer.toString(10000), "IS_FIRST_RULE");
        LogUtil.a("Login_MainInteractorsUtils", "isFirst = ", strE);
        if (!"0".equals(strE)) {
            wnb.d(this.f10362b);
            SharedPreferenceManager.e(this.f10362b, String.valueOf(10000), "IS_FIRST_RULE", "0", new StorageParams());
        }
        LogUtil.a("Login_MainInteractorsUtils", "initSmartAiRule finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    public static void e(Context context, int i, int i2) {
        if (context == null) {
            LogUtil.j("Login_MainInteractorsUtils", "doBiClickFromStepNotification context is null");
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        map.put("jumpTo", Integer.valueOf(i2));
        lmf.d().c(context, AnalyticsValue.HEALTH_PLUGIN_DAEMON_STEPS_NOTIFICATION_2080001.value(), map, 0);
    }

    public static void d(Context context, int i, String str) {
        if (context == null) {
            LogUtil.j("Login_MainInteractorsUtils", "doBiClickFromOpenAppSource context is null");
            return;
        }
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("from", Integer.valueOf(i));
        lmf.d().c(context, str, map, 0);
    }

    public static void a(int i, long j) {
        LogUtil.a("Login_MainInteractorsUtils", "doBiFromExitApp duration = ", Long.valueOf(j));
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        map.put("duration", Integer.valueOf((int) (j / 1000)));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_EXIT_APP_2050002.value(), map, 0);
    }

    public static void d(Context context) {
        LogUtil.a("Login_MainInteractorsUtils", "doBiFromLoginInApp");
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("BI_switchStatus", niz.b());
        map.put("healthService_switchStatus", Boolean.valueOf(fxl.c(context)));
        map.put("personalContent_switchStatus", Boolean.valueOf(fxl.b(context)));
        wmq wmqVarA = wmq.a(context);
        map.put("personalized_Ads", wmqVarA.c(13));
        map.put("huawei_Ads", wmqVarA.c(14));
        map.put("tripartite_Ads", wmqVarA.c(15));
        lmf.d().c(context, AnalyticsValue.HEALTH_LOGIN_APP_2050009.value(), map, 0);
    }

    public static void a(Context context) {
        if (context == null) {
            LogUtil.j("Login_MainInteractorsUtils", "doBiClickFromWiget context is null");
            return;
        }
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(context, AnalyticsValue.HEALTH_PLUGIN_DAEMON_WIDGET_2080003.value(), map, 0);
    }
}
