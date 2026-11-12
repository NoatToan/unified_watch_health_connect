package com.huawei.ui.homehealth.interactors;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback;
import com.huawei.healthcloud.plugintrack.golf.Utils;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseData;
import com.huawei.healthcloud.plugintrack.golf.cloud.CloudManager;
import com.huawei.healthcloud.plugintrack.golf.cloud.GolfDownloadTaskUtils;
import com.huawei.healthcloud.plugintrack.golf.cloud.beans.CourseMapData;
import com.huawei.healthcloud.plugintrack.golf.cloud.requests.GetGolfCourseMapDataReq;
import com.huawei.healthcloud.plugintrack.golf.cloud.response.GetGolfCourseMapDataRsp;
import com.huawei.healthcloud.plugintrack.golf.device.CloudHelper;
import com.huawei.healthcloud.plugintrack.golf.device.GolfDataCallback;
import com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceEngineManager;
import com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.Social;
import com.huawei.ui.commonui.dialog.CustomImageDialog;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.interactors.GolfUpdateMapInteractor;
import defpackage.ddv;
import defpackage.ecu;
import defpackage.eey;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqt;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class GolfUpdateMapInteractor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f25561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GolfUpdateMapReceiver f25562c;

    public GolfUpdateMapInteractor() {
        e();
    }

    public static class GolfUpdateMapReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<GolfUpdateMapInteractor> f25563c;

        public GolfUpdateMapReceiver(GolfUpdateMapInteractor golfUpdateMapInteractor) {
            this.f25563c = new WeakReference<>(golfUpdateMapInteractor);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GolfUpdateMapInteractor golfUpdateMapInteractor = this.f25563c.get();
            if (golfUpdateMapInteractor != null) {
                if (intent == null) {
                    LogUtil.j("Track_GolfUpdateMapUtils", "onReceive intent is null");
                    return;
                }
                LogUtil.a("Track_GolfUpdateMapUtils", "GolfUpdateMapReceiver onReceive to enter, action = ", intent.getAction());
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    golfUpdateMapInteractor.e();
                }
            }
        }
    }

    public void e(Handler handler) {
        try {
            if (this.f25562c == null) {
                IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
                this.f25562c = new GolfUpdateMapReceiver(this);
                this.f25561b = handler;
                BroadcastManagerUtil.c(BaseApplication.getContext(), this.f25562c, intentFilter, LocalBroadcast.f36595c, null);
            }
        } catch (Exception unused) {
            LogUtil.e("Track_GolfUpdateMapUtils", "registerDeviceStatusBroadcast Exception");
        }
    }

    public void c() {
        try {
            LogUtil.a("Track_GolfUpdateMapUtils", "Enter unregisterNonLocalBroadcast!");
            if (this.f25562c != null) {
                BaseApplication.getContext().unregisterReceiver(this.f25562c);
            }
        } catch (IllegalArgumentException e) {
            LogUtil.e("Track_GolfUpdateMapUtils", LogAnonymous.b(e));
        }
    }

    public void e() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            LogUtil.a("Track_GolfUpdateMapUtils", "checkGolfUpdateMap mainThread");
            ThreadPoolManager.c().execute(new Runnable() { // from class: spb
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e();
                }
            });
        } else {
            if (!b()) {
                LogUtil.a("Track_GolfUpdateMapUtils", "checkGolfUpdateMap isIntervalTime not Finish");
                return;
            }
            final DeviceInfo deviceInfoD = d();
            if (deviceInfoD == null) {
                return;
            }
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "golf_update_map_last_query_time", Long.toString(System.currentTimeMillis()), null);
            GolfDeviceProxy.getInstance().getDeviceDownloadedCoursesForNative(new GolfDataCallback() { // from class: soy
                @Override // com.huawei.healthcloud.plugintrack.golf.device.GolfDataCallback
                public final void onReceived(List list) {
                    this.f48480a.a(deviceInfoD, list);
                }
            });
        }
    }

    public /* synthetic */ void a(DeviceInfo deviceInfo, List list) {
        LogUtil.a("Track_GolfUpdateMapUtils", "getDeviceDownloadedCoursesForNative list.size() = ", Integer.valueOf(list.size()));
        List<Long> listB = b(list, e((List<GolfCourseData>) list));
        if (njy.e(listB)) {
            ReleaseLogUtil.a("Track_GolfUpdateMapUtils", "checkGolfUpdateMap courseIds isEmpty");
        } else {
            c(deviceInfo, listB);
        }
    }

    private void c(DeviceInfo deviceInfo, List<Long> list) {
        String strB = SharedPreferenceManager.b(String.valueOf(10000), "sp_golf_not_update_map_ids", "");
        LogUtil.a("Track_GolfUpdateMapUtils", "sendUpdateMapMessage spIds = ", strB);
        if (!TextUtils.isEmpty(strB)) {
            List list2 = (List) qqt.c(strB, new TypeToken<List<Long>>() { // from class: com.huawei.ui.homehealth.interactors.GolfUpdateMapInteractor.1
            }.getType());
            LogUtil.a("Track_GolfUpdateMapUtils", "sendUpdateMapMessage longList = ", Integer.valueOf(list2.size()));
            if (njy.b(list2) && list2.containsAll(list)) {
                ReleaseLogUtil.a("Track_GolfUpdateMapUtils", "sendUpdateMapMessage spIds json = ", strB);
                return;
            }
        }
        int iD = d(deviceInfo, list);
        Bundle bundle = new Bundle();
        bundle.putString("bundle_golf_update_map_device_name", deviceInfo.getDeviceName());
        Message message = new Message();
        message.setData(bundle);
        message.arg1 = iD;
        message.obj = list;
        message.what = 20241105;
        Handler handler = this.f25561b;
        if (handler != null) {
            handler.sendMessageDelayed(message, 10000L);
        }
    }

    private int d(DeviceInfo deviceInfo, List<Long> list) {
        if (CommonUtil.o(BaseApplication.getContext()) == 1) {
            return -1;
        }
        GetGolfCourseMapDataRsp getGolfCourseMapDataRspE = e(deviceInfo, list);
        if (getGolfCourseMapDataRspE == null) {
            LogUtil.e("Track_GolfUpdateMapUtils", "sendUpdateMapMessage response == null");
            return -1;
        }
        List<CourseMapData> courseMapDataList = getGolfCourseMapDataRspE.getCourseMapDataList();
        if (njy.e(courseMapDataList)) {
            LogUtil.e("Track_GolfUpdateMapUtils", "golf map is not update");
            return -1;
        }
        Iterator<CourseMapData> it = courseMapDataList.iterator();
        double size = 0.0d;
        while (it.hasNext()) {
            size += it.next().getSize();
        }
        return (int) Math.round((size / 1024.0d) / 1024.0d);
    }

    private static GetGolfCourseMapDataRsp e(DeviceInfo deviceInfo, List<Long> list) {
        boolean zIsVectorMap = GolfDeviceEngineManager.getInstance().isVectorMap(deviceInfo);
        GetGolfCourseMapDataReq.Builder builder = new GetGolfCourseMapDataReq.Builder();
        builder.addCourseIds(list).language(Utils.getLanguage()).type(GolfDownloadTaskUtils.DeviceType.getType(zIsVectorMap ? 1 : 0)).mapLevel(Utils.getGolfMapDeviceLevel("Track_GolfUpdateMapUtils"));
        return CloudManager.getInstance().getGolfCourseMapData(builder.build());
    }

    public static void d(Activity activity, Message message) {
        String str;
        if (activity == null || activity.isFinishing()) {
            LogUtil.a("Track_GolfUpdateMapUtils", "showGolfUpdateMapDialog activity == null or isFinishing");
            return;
        }
        if (!njy.b(message.obj, Long.class)) {
            LogUtil.a("Track_GolfUpdateMapUtils", "showGolfUpdateMapDialog msg.obj is not list");
            return;
        }
        final List list = (List) message.obj;
        if (njy.e(list)) {
            LogUtil.a("Track_GolfUpdateMapUtils", "showGolfUpdateMapDialog courseIds is empty");
            return;
        }
        final Context context = BaseApplication.getContext();
        SharedPreferenceManager.c(String.valueOf(10000), "sp_golf_not_update_map_ids", "");
        int size = list.size();
        String strE = qre.e(R.plurals.IDS_golf_update_map_count, size, Integer.valueOf(size));
        String string = context.getString(R.string.IDS_device_upgrade_file_size_mb, String.valueOf(message.arg1));
        String string2 = message.getData().getString("bundle_golf_update_map_device_name");
        if (message.arg1 == -1) {
            str = String.format(Locale.ENGLISH, context.getString(R.string.IDS_golf_update_map_content_wifi), string2, strE);
        } else {
            str = String.format(Locale.ENGLISH, context.getString(R.string.IDS_golf_update_map_content), string2, strE, string);
        }
        b(activity, str, new View.OnClickListener() { // from class: sos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GolfUpdateMapInteractor.d(list, context, view);
            }
        }, new View.OnClickListener() { // from class: sou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GolfUpdateMapInteractor.d(view);
            }
        }, new View.OnClickListener() { // from class: sow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GolfUpdateMapInteractor.d(list, view);
            }
        });
    }

    public static /* synthetic */ void d(List list, Context context, View view) {
        if (qrs.c(500)) {
            LogUtil.a("Track_GolfUpdateMapUtils", "onClick isFastClick");
        } else {
            a(list);
            qpx.b(context, R.string.IDS_golf_update_map_background);
        }
    }

    public static /* synthetic */ void d(View view) {
        if (qrs.c(500)) {
            LogUtil.a("Track_GolfUpdateMapUtils", "onClick isFastClick");
        } else {
            ReleaseLogUtil.d("Track_GolfUpdateMapUtils", "showGolfUpdateMapDialog and see maps");
            e(BaseApplication.getContext(), "0");
        }
    }

    public static /* synthetic */ void d(List list, View view) {
        ReleaseLogUtil.d("Track_GolfUpdateMapUtils", "showGolfUpdateMapDialog not update again");
        SharedPreferenceManager.c(String.valueOf(10000), "sp_golf_not_update_map_ids", qqt.b(list));
    }

    public static void b(Context context, String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3) {
        LogUtil.a("Track_GolfUpdateMapUtils", "showGolfUpdateMapDialog enter", " content = ", str);
        if (context == null) {
            context = BaseApplication.getActivity();
        }
        if (context == null) {
            ReleaseLogUtil.e("Track_GolfUpdateMapUtils", "topActivity and context are null");
            return;
        }
        CustomImageDialog.Builder builder = new CustomImageDialog.Builder(context);
        builder.e(R.mipmap.golf_dialog_content_bg).c(context.getString(R.string.IDS_golf_update_map_title)).a(str).e(context.getString(R.string.IDS_golf_update_map_button)).b(context.getString(R.string.IDS_hw_messagecenter_more_detail)).d(context.getString(R.string.IDS_auto_track_dialog_cancel)).a(onClickListener).b(onClickListener2).c(onClickListener3).e(new View.OnClickListener() { // from class: sov
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("Track_GolfUpdateMapUtils", "showGolfUpdateMapDialog cancel");
            }
        });
        CustomImageDialog customImageDialogB = builder.b();
        customImageDialogB.setCancelable(false);
        customImageDialogB.show();
    }

    private static void a(final List<Long> list) {
        ReleaseLogUtil.d("Track_GolfUpdateMapUtils", "showGolfUpdateMapDialog and update all courseIds = ", list);
        GolfDeviceProxy.getInstance().isDevicesPinged(new CommonSingleCallback() { // from class: spa
            @Override // com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback
            public final void callback(Object obj) {
                GolfUpdateMapInteractor.a(list, (Boolean) obj);
            }
        });
    }

    public static /* synthetic */ void a(List list, Boolean bool) {
        if (!bool.booleanValue()) {
            ReleaseLogUtil.e("Track_GolfUpdateMapUtils", "App ping devices failed in downloadMap");
            qpx.b(BaseApplication.getActivity(), R.string.IDS_watchface_wearable_need_connect_to_use);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (CloudHelper.getVersion(l.longValue(), false) <= 0) {
                LogUtil.j("Track_GolfUpdateMapUtils", "invalid course version");
            } else {
                GolfDownloadTaskUtils.getInstance().bgUpdateDownloadHandler(l.longValue(), GolfDeviceProxy.getInstance().getWatchType(), -1);
            }
        }
    }

    private static DeviceInfo d() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_GolfUpdateMapUtils");
        if (deviceInfo == null) {
            LogUtil.a("Track_GolfUpdateMapUtils", "checkGolfUpdateMap deviceInfo == null");
            return null;
        }
        if (deviceInfo.getDeviceConnectState() == 2 && eey.d(deviceInfo, 105)) {
            return deviceInfo;
        }
        LogUtil.a("Track_GolfUpdateMapUtils", "showGolfUpdateMapDialog(): device is not  not connect or not support golf.");
        return null;
    }

    private static boolean b() {
        long jM = CommonUtil.m(BaseApplication.getContext(), SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "golf_update_map_last_query_time"));
        if (jM == 0 || System.currentTimeMillis() - jM > 86400000) {
            return true;
        }
        LogUtil.a("Track_GolfUpdateMapUtils", "lastQueryTime:", Long.valueOf(jM));
        return false;
    }

    public static List<Long> b(List<GolfCourseData> list, HashMap<Long, String> map) {
        ArrayList arrayList = new ArrayList();
        for (GolfCourseData golfCourseData : list) {
            int courseId = golfCourseData.getCourseId();
            int version = golfCourseData.getVersion();
            LogUtil.a("Track_GolfUpdateMapUtils", "current course, courseId = ", Integer.valueOf(courseId), ", version = ", Integer.valueOf(version));
            String strValueOf = String.valueOf(version);
            String str = map.get(Long.valueOf(golfCourseData.getCourseId()));
            LogUtil.a("Track_GolfUpdateMapUtils", "current version info, curMapVersionStr = ", strValueOf, ", cloudMapVersionStr = ", str);
            if (TextUtils.isEmpty(strValueOf)) {
                LogUtil.e("Track_GolfUpdateMapUtils", "curMapVersionStr is empty");
            } else if (TextUtils.isEmpty(str)) {
                LogUtil.e("Track_GolfUpdateMapUtils", "cloudMapVersionStr is empty");
            } else if (!strValueOf.equals(str)) {
                arrayList.add(Long.valueOf(courseId));
            }
        }
        return arrayList;
    }

    public static HashMap<Long, String> e(List<GolfCourseData> list) {
        HashMap<Long, String> map = new HashMap<>();
        if (njy.e(list)) {
            LogUtil.a("Track_GolfUpdateMapUtils", "updateVersionMap(), courses isEmpty");
            return map;
        }
        DeviceInfo deviceInfoD = d();
        if (deviceInfoD == null) {
            LogUtil.a("Track_GolfUpdateMapUtils", "getUpdateVersionMap(), deviceInfo == null");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<GolfCourseData> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getCourseId()));
        }
        for (CourseMapData courseMapData : e(deviceInfoD, arrayList).getCourseMapDataList()) {
            map.put(courseMapData.getCourseId(), courseMapData.getVersion());
        }
        return map;
    }

    public static void e(Context context, String str) {
        if (context == null) {
            LogUtil.j("Track_GolfUpdateMapUtils", "jumpToGolfTrainingCourse(): context is null");
            return;
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        builder.setImmerse();
        builder.showStatusBar();
        builder.addPath("#/map?updateClicked=" + str);
        builder.addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, Social.class);
        builder.setStatusBarTextBlack(true);
        builder.setForceDarkMode(1);
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.golf", builder);
    }
}
