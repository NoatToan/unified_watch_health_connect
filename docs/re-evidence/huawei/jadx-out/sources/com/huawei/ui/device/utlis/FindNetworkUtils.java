package com.huawei.ui.device.utlis;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.findnetwork.FindNetwork;
import com.huawei.hms.findnetwork.FindNetworkEngine;
import com.huawei.hms.findnetwork.comm.exception.FindNetworkException;
import com.huawei.hms.findnetwork.comm.request.bean.RegisterDetailsBean;
import com.huawei.hms.findnetwork.comm.request.bean.RegisterStatusBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkStatusResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.dialog.HarmonyAlertDialog;
import com.huawei.ui.device.R;
import com.huawei.ui.device.utlis.FindNetworkUtils;
import defpackage.eey;
import defpackage.lua;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qxg;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class FindNetworkUtils {
    public static final Uri e = Uri.parse("content://com.huawei.android.phone.finder.provider/is_show_phone_finder_feature");

    public interface IFindNetworkCallback {
        void onFail(String str);

        void onSuccess(int i, HashMap<String, Object> map);
    }

    public static /* synthetic */ void a(View view) {
    }

    public static boolean c(DeviceInfo deviceInfo, Context context) {
        if (deviceInfo == null || context == null) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork deviceInfo or context is null.");
            return false;
        }
        if (!CommonUtil.bg()) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork system not support.");
            return false;
        }
        if (deviceInfo.getProductType() == 75) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork mDeviceInfo is bolt.");
            return false;
        }
        if (Utils.n()) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork StoreDemoSystem.");
            return false;
        }
        if (Utils.o()) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork  not support: isOversea.");
            return false;
        }
        if (CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009)) != 1) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork  not support: account.");
            return false;
        }
        boolean zA = a(context);
        if (!zA) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isPhoneFinderSupport(1):", Boolean.valueOf(zA));
            return false;
        }
        LogUtil.a("FindNetworkUtils", "isSupportOfflineFindNetwork support.");
        return true;
    }

    public static void c(Context context) {
        if (CommonUtil.av()) {
            LogUtil.a("FindNetworkUtils", "startFindNetwork DeepLink");
            try {
                qrs.c(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("hicloud://cloudDrive/finder?path=WapFindPhoneActivity&tab=device")), "com.huawei.hidisk", BaseApplication.getActivity(), qxg.d(BaseApplication.getContext(), "com.huawei.hidisk"));
                return;
            } catch (SecurityException unused) {
                LogUtil.e("FindNetworkUtils", "startFindNetworkDeepLink SecurityException");
                return;
            }
        }
        LogUtil.a("FindNetworkUtils", "startFindNetwork ACTION_MAIN");
        try {
            String strD = qxg.d(BaseApplication.getContext(), "com.huawei.android.findmyphone");
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setPackage("com.huawei.android.findmyphone");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setFlags(268435456);
            qrs.c(intent, "com.huawei.android.findmyphone", BaseApplication.getActivity(), strD);
        } catch (SecurityException unused2) {
            LogUtil.e("FindNetworkUtils", "startFindNetworkDeepLink SecurityException");
        }
    }

    public static boolean a(DeviceInfo deviceInfo, Context context) {
        if (deviceInfo == null || context == null) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork deviceInfo or context is null.");
            return false;
        }
        if (!CommonUtil.bc()) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork not Harmony system.");
            return false;
        }
        if (deviceInfo.getProductType() == 75) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork mDeviceInfo is bolt.");
            return false;
        }
        if (Utils.o()) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork  not support: isOversea.");
            return false;
        }
        if (!eey.d(deviceInfo, 315)) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork not support: capability.");
            return false;
        }
        String deviceFid = deviceInfo.getDeviceFid();
        LogUtil.a("FindNetworkUtils", "isSupportOfflineFindNetwork fid: ", CommonUtil.n(deviceFid));
        if (deviceFid == null || deviceFid.isEmpty() || "NA".equals(deviceFid)) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork fid is null.");
            return false;
        }
        if (!e()) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork HIDISK_PACKAGE  version is earlier than 160300300");
            return false;
        }
        if (CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009)) != 1) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork  not support: account.");
            return false;
        }
        boolean zA = a(context);
        if (!zA) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "isSupportOfflineFindNetwork isPhoneFinderSupport:", Boolean.valueOf(zA));
            return false;
        }
        LogUtil.a("FindNetworkUtils", "isSupportOfflineFindNetwork support.");
        return true;
    }

    public static boolean e() {
        int iB = b(BaseApplication.getContext(), "com.huawei.hidisk");
        ReleaseLogUtil.d("R_FindNetworkUtils", "version: ", Integer.valueOf(iB));
        return iB >= 160300101;
    }

    private static int b(Context context, String str) {
        if (context == null) {
            LogUtil.j("FindNetworkUtils", "getVersionCode context is null.");
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("FindNetworkUtils", "getVersion packageName is null.");
            return 0;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (TextUtils.isEmpty(str)) {
                str = context.getPackageName();
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("FindNetworkUtils", "get the app versioncode fail NameNotFoundException");
        }
        return 0;
    }

    public static void e(final DeviceInfo deviceInfo, final Context context) {
        if (a(deviceInfo, context)) {
            ThreadPoolManager.c().a("FindNetworkUtils", new Runnable() { // from class: rei
                @Override // java.lang.Runnable
                public final void run() {
                    FindNetworkUtils.a(context, deviceInfo);
                }
            });
        }
    }

    public static /* synthetic */ void a(Context context, DeviceInfo deviceInfo) {
        try {
            FindNetworkEngine findNetworkEngine = FindNetwork.getFindNetworkEngine(context.getApplicationContext());
            RegisterDetailsBean registerDetailsBean = new RegisterDetailsBean();
            registerDetailsBean.setDeviceId(deviceInfo.getDeviceFid());
            registerDetailsBean.setProductId(deviceInfo.getHiLinkDeviceId());
            registerDetailsBean.setMac(deviceInfo.getDeviceIdentify());
            String deviceUdid = deviceInfo.getDeviceUdid();
            if (TextUtils.isEmpty(deviceUdid)) {
                deviceUdid = deviceInfo.getUuid();
            }
            ReleaseLogUtil.d("R_FindNetworkUtils", "enter registerFindNetworkDevice businessType: 1");
            registerDetailsBean.setUdid(deviceUdid);
            registerDetailsBean.setBusinessType(1);
            Task<FindNetworkResult<RegisterStatusBean>> taskRegisterDevice = findNetworkEngine.registerDevice(registerDetailsBean);
            if (taskRegisterDevice == null) {
                ReleaseLogUtil.e("R_FindNetworkUtils", "findNetworkStatusResultTask is null.");
            } else {
                taskRegisterDevice.addOnSuccessListener(new OnSuccessListener() { // from class: ref
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        FindNetworkUtils.d((FindNetworkResult) obj);
                    }
                });
                taskRegisterDevice.addOnFailureListener(new OnFailureListener() { // from class: reh
                    @Override // com.huawei.hmf.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        FindNetworkUtils.e(exc);
                    }
                });
            }
        } catch (FindNetworkException e2) {
            ReleaseLogUtil.a("R_FindNetworkUtils", "registerFindNetworkDevice err: ", Integer.valueOf(e2.getCode()));
        }
    }

    public static /* synthetic */ void d(FindNetworkResult findNetworkResult) {
        if (findNetworkResult == null) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "registerFindNetworkDevice addOnSuccessListener result is null.");
            return;
        }
        if (findNetworkResult.getData() != null) {
            ReleaseLogUtil.d("R_FindNetworkUtils", "registerFindNetworkDevice status: ", Integer.valueOf(((RegisterStatusBean) findNetworkResult.getData()).getStatus()));
        }
        ReleaseLogUtil.d("R_FindNetworkUtils", "registerFindNetworkDevice result: ", Integer.valueOf(findNetworkResult.getRespCode()));
    }

    public static /* synthetic */ void e(Exception exc) {
        if (exc == null) {
            ReleaseLogUtil.e("R_FindNetworkUtils", "registerFindNetworkDevice addOnFailureListener result is null.");
        } else {
            ReleaseLogUtil.a("R_FindNetworkUtils", "registerFindNetworkDevice fail: ", exc.getMessage());
        }
    }

    public static void b(final Activity activity, final String str) {
        ReleaseLogUtil.d("R_FindNetworkUtils", "enter showMutiAccountTip");
        if (activity == null) {
            LogUtil.j("FindNetworkUtils", "showMutiAccountTip activity is null");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: rel
                @Override // java.lang.Runnable
                public final void run() {
                    FindNetworkUtils.e(activity, str);
                }
            });
        }
    }

    public static /* synthetic */ void e(Activity activity, String str) {
        HarmonyAlertDialog.Builder builder = new HarmonyAlertDialog.Builder(activity);
        builder.e(qre.f(R.string.IDS_service_area_notice_title));
        builder.a(String.format(qre.f(R.string.IDS_find_network_multi_account), str));
        builder.a(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: rea
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FindNetworkUtils.a(view);
            }
        });
        builder.c().show();
    }

    public static void e(DeviceInfo deviceInfo, Context context, final IFindNetworkCallback iFindNetworkCallback) {
        if (iFindNetworkCallback == null) {
            LogUtil.j("FindNetworkUtils", "queryRegisterStatus callBack is null");
            return;
        }
        if (!d(deviceInfo, context)) {
            iFindNetworkCallback.onFail("queryRegisterStatus param error");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(deviceInfo.getDeviceFid());
        ReleaseLogUtil.d("R_FindNetworkUtils", "enter queryRegisterStatus");
        try {
            Task<FindNetworkResult<List<RegisterStatusBean>>> taskQueryRegisterStatus = FindNetwork.getFindNetworkEngine(context.getApplicationContext()).queryRegisterStatus(arrayList);
            if (taskQueryRegisterStatus == null) {
                iFindNetworkCallback.onFail("queryRegisterStatus task is null");
            } else {
                taskQueryRegisterStatus.addOnSuccessListener(new OnSuccessListener() { // from class: red
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        FindNetworkUtils.d(iFindNetworkCallback, (FindNetworkResult) obj);
                    }
                });
                taskQueryRegisterStatus.addOnFailureListener(new OnFailureListener() { // from class: reb
                    @Override // com.huawei.hmf.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        FindNetworkUtils.c(exc, iFindNetworkCallback);
                    }
                });
            }
        } catch (FindNetworkException e2) {
            iFindNetworkCallback.onFail(String.format("queryRegisterStatus Exception: %s", ExceptionUtils.c(e2)));
        }
    }

    public static /* synthetic */ void d(IFindNetworkCallback iFindNetworkCallback, FindNetworkResult findNetworkResult) {
        if (findNetworkResult == null) {
            iFindNetworkCallback.onFail("queryRegisterStatus result is null");
            return;
        }
        List list = (List) findNetworkResult.getData();
        if (CollectionUtils.a(list)) {
            iFindNetworkCallback.onFail("queryRegisterStatus registerStatusBeanList is empty");
            return;
        }
        RegisterStatusBean registerStatusBean = (RegisterStatusBean) list.get(0);
        if (registerStatusBean == null) {
            iFindNetworkCallback.onFail("queryRegisterStatus registerStatusBean is null");
            return;
        }
        int status = registerStatusBean.getStatus();
        String displayName = registerStatusBean.getDisplayName();
        ReleaseLogUtil.d("R_FindNetworkUtils", "queryRegisterStatus status :", Integer.valueOf(status));
        HashMap<String, Object> map = new HashMap<>();
        map.put("deviceId", registerStatusBean.getDeviceId());
        map.put("displayName", displayName);
        iFindNetworkCallback.onSuccess(status, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Exception exc, IFindNetworkCallback iFindNetworkCallback) {
        if (exc instanceof ApiException) {
            int statusCode = ((ApiException) exc).getStatusCode();
            ReleaseLogUtil.d("R_FindNetworkUtils", "errorCode:", Integer.valueOf(statusCode));
            if (statusCode == 907201000) {
                iFindNetworkCallback.onSuccess(0, new HashMap<>());
                return;
            } else {
                d(exc, iFindNetworkCallback);
                return;
            }
        }
        ReleaseLogUtil.a("R_FindNetworkUtils", "specialHandStatusFail:", ExceptionUtils.c(exc));
        d(exc, iFindNetworkCallback);
    }

    private static boolean d(DeviceInfo deviceInfo, Context context) {
        if (!a(deviceInfo, context)) {
            LogUtil.j("FindNetworkUtils", "verifyingParam not SupportOfflineFindNetwork");
            return false;
        }
        if (context != null) {
            return true;
        }
        LogUtil.j("FindNetworkUtils", "verifyingParam context is null");
        return false;
    }

    public static void d(DeviceInfo deviceInfo, int i, Context context, final IFindNetworkCallback iFindNetworkCallback) {
        if (iFindNetworkCallback == null) {
            LogUtil.j("FindNetworkUtils", "registerDeviceToFindNetwork callBack is null");
            return;
        }
        if (!d(deviceInfo, context)) {
            iFindNetworkCallback.onFail("registerDeviceToFindNetwork param error");
            return;
        }
        try {
            FindNetworkEngine findNetworkEngine = FindNetwork.getFindNetworkEngine(context);
            RegisterDetailsBean registerDetailsBean = new RegisterDetailsBean();
            registerDetailsBean.setDeviceId(deviceInfo.getDeviceFid());
            registerDetailsBean.setBusinessType(i);
            registerDetailsBean.setMac(deviceInfo.getDeviceIdentify());
            registerDetailsBean.setProductId(deviceInfo.getHiLinkDeviceId());
            String deviceUdid = deviceInfo.getDeviceUdid();
            if (TextUtils.isEmpty(deviceUdid)) {
                deviceUdid = deviceInfo.getUuid();
            }
            ReleaseLogUtil.d("R_FindNetworkUtils", "enter registerDeviceToFindNetwork businessType", Integer.valueOf(i));
            registerDetailsBean.setUdid(deviceUdid);
            Task<FindNetworkResult<RegisterStatusBean>> taskRegisterDevice = findNetworkEngine.registerDevice(registerDetailsBean);
            if (taskRegisterDevice == null) {
                iFindNetworkCallback.onFail("registerDeviceToFindNetwork task is null");
            } else {
                taskRegisterDevice.addOnSuccessListener(new OnSuccessListener() { // from class: rec
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        FindNetworkUtils.e(iFindNetworkCallback, (FindNetworkResult) obj);
                    }
                });
                taskRegisterDevice.addOnFailureListener(new OnFailureListener() { // from class: rdz
                    @Override // com.huawei.hmf.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        FindNetworkUtils.d(exc, iFindNetworkCallback);
                    }
                });
            }
        } catch (FindNetworkException e2) {
            iFindNetworkCallback.onFail(String.format("registerDeviceToFindNetwork Exception: %s", ExceptionUtils.c(e2)));
        }
    }

    public static /* synthetic */ void e(IFindNetworkCallback iFindNetworkCallback, FindNetworkResult findNetworkResult) {
        if (findNetworkResult == null) {
            iFindNetworkCallback.onFail("registerDeviceToFindNetwork result is null");
            return;
        }
        RegisterStatusBean registerStatusBean = (RegisterStatusBean) findNetworkResult.getData();
        if (registerStatusBean == null) {
            iFindNetworkCallback.onFail("registerDeviceToFindNetwork registerStatusBean is null");
            return;
        }
        int status = registerStatusBean.getStatus();
        ReleaseLogUtil.d("R_FindNetworkUtils", "registerDeviceToFindNetwork status :", Integer.valueOf(status));
        iFindNetworkCallback.onSuccess(status, null);
    }

    public static void b(DeviceInfo deviceInfo, Context context) {
        if (!d(deviceInfo, context)) {
            LogUtil.j("FindNetworkUtils", "unPair param error");
            return;
        }
        String deviceFid = deviceInfo.getDeviceFid();
        ReleaseLogUtil.d("R_FindNetworkUtils", "enter unpair");
        try {
            Task<FindNetworkResult<Void>> taskUnPair = FindNetwork.getFindNetworkEngine(context.getApplicationContext()).unPair(deviceFid, new FindNetworkCallback<Void>() { // from class: com.huawei.ui.device.utlis.FindNetworkUtils.2
                @Override // com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback
                public void onSuccess(FindNetworkResult<Void> findNetworkResult) {
                    LogUtil.a("FindNetworkUtils", "unPair onSuccess");
                }

                @Override // com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback
                public void onFail(FindNetworkResult<Void> findNetworkResult) {
                    LogUtil.j("FindNetworkUtils", "unPair onFail");
                }

                @Override // com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback
                public void onUpdate(FindNetworkResult<Void> findNetworkResult) {
                    LogUtil.a("FindNetworkUtils", "unPair onUpdate");
                }
            });
            if (taskUnPair == null) {
                LogUtil.j("FindNetworkUtils", "unPair task is null");
            } else {
                taskUnPair.addOnSuccessListener(new OnSuccessListener() { // from class: rem
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        FindNetworkUtils.c((FindNetworkResult) obj);
                    }
                });
                taskUnPair.addOnFailureListener(new OnFailureListener() { // from class: ren
                    @Override // com.huawei.hmf.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        ReleaseLogUtil.d("R_FindNetworkUtils", "unPair Exception:", ExceptionUtils.c(exc));
                    }
                });
            }
        } catch (FindNetworkException e2) {
            ReleaseLogUtil.a("FindNetworkUtils", "unPair Exception:", ExceptionUtils.c(e2));
        }
    }

    public static /* synthetic */ void c(FindNetworkResult findNetworkResult) {
        if (findNetworkResult == null) {
            LogUtil.j("FindNetworkUtils", "unPair result is null");
        } else {
            ReleaseLogUtil.d("R_FindNetworkUtils", "unPair respCode:", Integer.valueOf(findNetworkResult.getRespCode()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Exception exc, IFindNetworkCallback iFindNetworkCallback) {
        if (iFindNetworkCallback == null) {
            LogUtil.j("FindNetworkUtils", "handleFailResult:", ExceptionUtils.c(exc));
        } else {
            if (exc == null) {
                iFindNetworkCallback.onFail("handleFailResult fail result is null");
                return;
            }
            String message = exc.getMessage();
            ReleaseLogUtil.e("R_FindNetworkUtils", "handleFailResult:", ExceptionUtils.c(exc));
            iFindNetworkCallback.onFail(String.format("handleFailResult fail message: %s", message));
        }
    }

    public static void c(Context context, final IFindNetworkCallback iFindNetworkCallback) {
        if (iFindNetworkCallback == null || context == null) {
            LogUtil.j("FindNetworkUtils", "queryFindNetworkStatus param error");
            return;
        }
        ReleaseLogUtil.d("R_FindNetworkUtils", "enter queryFindNetworkStatus");
        try {
            Task<FindNetworkStatusResult> taskQueryFindNetworkStatus = FindNetwork.getFindNetworkEngine(context.getApplicationContext()).queryFindNetworkStatus();
            if (taskQueryFindNetworkStatus == null) {
                iFindNetworkCallback.onFail("queryFindNetworkStatus task is null");
            } else {
                taskQueryFindNetworkStatus.addOnSuccessListener(new OnSuccessListener() { // from class: reg
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        FindNetworkUtils.c((FindNetworkStatusResult) obj, iFindNetworkCallback);
                    }
                });
                taskQueryFindNetworkStatus.addOnFailureListener(new OnFailureListener() { // from class: ree
                    @Override // com.huawei.hmf.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        FindNetworkUtils.d(exc, iFindNetworkCallback);
                    }
                });
            }
        } catch (FindNetworkException e2) {
            iFindNetworkCallback.onFail(String.format("queryFindNetworkStatus Exception: %s", ExceptionUtils.c(e2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(FindNetworkStatusResult findNetworkStatusResult, IFindNetworkCallback iFindNetworkCallback) {
        if (findNetworkStatusResult == null) {
            iFindNetworkCallback.onFail("queryFindNetworkStatus result is null");
            return;
        }
        int respCode = findNetworkStatusResult.getRespCode();
        ReleaseLogUtil.d("R_FindNetworkUtils", "queryFindNetworkStatus getRespCode: ", Integer.valueOf(respCode), ", version: ", findNetworkStatusResult.getVersion(), ", hmsVersion: ", findNetworkStatusResult.getHmsVersion());
        String version = findNetworkStatusResult.getVersion();
        String hmsVersion = findNetworkStatusResult.getHmsVersion();
        int i = 0;
        if (TextUtils.isEmpty(version) || TextUtils.isEmpty(hmsVersion)) {
            iFindNetworkCallback.onSuccess(0, null);
            return;
        }
        try {
            int i2 = Integer.parseInt(version);
            int i3 = Integer.parseInt(hmsVersion);
            if (i2 >= 61600230 && i3 >= 61602220) {
                i = 1;
            }
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("R_FindNetworkUtils", "queryFindNetworkStatus NumberFormatException");
        }
        ReleaseLogUtil.d("R_FindNetworkUtils", "queryFindNetworkStatus status: ", Integer.valueOf(i));
        iFindNetworkCallback.onSuccess(i, null);
    }

    private static boolean a(Context context) {
        int iB = lua.b("MODULE_PHONE_FINDER_NETWORK", "ShowPhoneFinderFeature", -1);
        if (iB != -1) {
            LogUtil.a("FindNetworkUtils", "readFormCache: ", Integer.valueOf(iB));
            return iB == 1;
        }
        ContentResolver contentResolver = context.getContentResolver();
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        LogUtil.a("FindNetworkUtils", "countCode: ", accountInfo);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(e, null, "", new String[]{accountInfo}, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    int columnIndex = cursorQuery.getColumnIndex("isShowPhoneFinderFeature");
                    if (columnIndex < 0) {
                        ReleaseLogUtil.a("R_FindNetworkUtils", "Column isShowPhoneFinderFeature not found");
                    } else {
                        int i = cursorQuery.getInt(columnIndex);
                        LogUtil.a("FindNetworkUtils", "result = ", Integer.valueOf(i));
                        if (i == 1 || i == 0) {
                            lua.c("MODULE_PHONE_FINDER_NETWORK", "ShowPhoneFinderFeature", i);
                        }
                        if (i == 1) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return true;
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return false;
                }
                ReleaseLogUtil.a("R_FindNetworkUtils", "cursor error");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return false;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLException | SecurityException e2) {
            LogUtil.e("FindNetworkUtils", "isShowPhoneFinderFeature, Exception:", ExceptionUtils.c(e2));
            if (0 != 0) {
            }
        }
    }
}
