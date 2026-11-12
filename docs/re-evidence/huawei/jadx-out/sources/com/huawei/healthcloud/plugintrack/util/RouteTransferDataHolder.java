package com.huawei.healthcloud.plugintrack.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.basefitnessadvice.api.BaseSportModelApi;
import com.huawei.basefitnessadvice.callback.DeviceCallback;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.algorithm.api.TrackFeatureExtractionApi;
import com.huawei.health.basesport.wearengine.SportHiWearBusinessType;
import com.huawei.health.device.api.OfflineMapApi;
import com.huawei.health.device.callback.DownloadCityCallback;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.RouteResultCallBack;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity;
import com.huawei.healthcloud.plugintrack.util.RouteTransferDataHolder;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ProgressListener;
import com.huawei.route.Manger.RouteDataStorageManager;
import com.huawei.route.RouteOutputForApp;
import com.huawei.route.RouteTrackInfo;
import com.huawei.route.RouteTrackPoint;
import com.huawei.route.RouteType;
import com.huawei.route.SceneType;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ddv;
import defpackage.ecu;
import defpackage.eey;
import defpackage.gur;
import defpackage.jdn;
import defpackage.jdo;
import defpackage.jpg;
import defpackage.lmf;
import defpackage.nio;
import defpackage.njy;
import defpackage.oer;
import defpackage.oet;
import defpackage.qpx;
import defpackage.qre;
import defpackage.xjl;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes10.dex */
public class RouteTransferDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomViewDialog f11434a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomViewDialog f11436c;
    private CustomTextAlertDialog d;
    private CustomTextAlertDialog e;
    private String g;
    private String h;
    private final Context i;
    private int j;
    private boolean k;
    private boolean l;
    private RouteOutputForApp m;
    private RouteData n;
    private double p;
    private RouteTrackInfo q;
    private int r;
    private List<RouteTrackInfo> s;
    private SendFileCallback t;
    private CustomTextAlertDialog v;
    private CustomProgressDialog w;
    private CustomProgressDialog.Builder x;
    private CustomTextAlertDialog y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f11435b = new e(this);
    private boolean o = false;
    private final BaseSportModelApi f = (BaseSportModelApi) Services.d("BaseSportModel", BaseSportModelApi.class);

    public interface SendFileCallback {
        void onFail();

        void onSuccess();
    }

    public static /* synthetic */ void a(View view) {
    }

    public static /* synthetic */ void b(View view) {
    }

    public RouteTransferDataHolder(Context context) {
        this.i = context;
    }

    public void d(String str, RouteData routeData) {
        if (str == null) {
            return;
        }
        this.n = routeData;
        this.p = routeData.getRouteDistance();
        RouteTrackInfo routeTrackInfoConvertRouteTrackInfo = RouteTrackInfo.convertRouteTrackInfo(routeData);
        this.q = routeTrackInfoConvertRouteTrackInfo;
        routeTrackInfoConvertRouteTrackInfo.setTrackName(d(str));
        RouteTrackInfo routeTrackInfo = this.q;
        routeTrackInfo.setTrackId(nio.a(routeTrackInfo.getTrackName()));
    }

    public void a(List<RouteData> list) {
        if (njy.e(list)) {
            return;
        }
        if (this.s == null) {
            this.s = new ArrayList();
        }
        for (RouteData routeData : list) {
            RouteTrackInfo routeTrackInfoConvertRouteTrackInfo = RouteTrackInfo.convertRouteTrackInfo(routeData);
            routeTrackInfoConvertRouteTrackInfo.setTrackId(nio.a(routeTrackInfoConvertRouteTrackInfo.getTrackName()));
            this.s.add(RouteTrackInfo.convertRouteTrackInfo(routeData));
        }
    }

    public RouteTrackInfo h() {
        return this.q;
    }

    public List<RouteTrackInfo> o() {
        return this.s;
    }

    public void b(String str) {
        this.h = str;
    }

    public void m() {
        RouteTrackInfo routeTrackInfo;
        TrackFeatureExtractionApi trackFeatureExtractionApi = (TrackFeatureExtractionApi) Services.d("TrackFeatureExtractionAlgorithmService", TrackFeatureExtractionApi.class);
        if (trackFeatureExtractionApi == null || (routeTrackInfo = this.q) == null) {
            return;
        }
        try {
            this.m = trackFeatureExtractionApi.getTrackOutputForApp(routeTrackInfo, 80000, this.p, false);
        } catch (RuntimeException e2) {
            ReleaseLogUtil.a("Track_RouteTransferUtils", LogAnonymous.b(e2));
        }
    }

    public RouteOutputForApp i() {
        return this.m;
    }

    private String d(String str) {
        return (str.endsWith(".gpx") || str.endsWith(".tcx") || str.endsWith(".kml")) ? str.substring(0, str.lastIndexOf(".")) : str;
    }

    public void q() {
        b(h(), ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RouteTransferUtils"), (SendFileCallback) null);
    }

    public void b(RouteTrackInfo routeTrackInfo, DeviceInfo deviceInfo, SendFileCallback sendFileCallback) {
        LogUtil.a("Track_RouteTransferUtils", "sendToDevice");
        this.t = sendFileCallback;
        this.q = routeTrackInfo;
        if (!a(deviceInfo)) {
            this.f11435b.sendEmptyMessage(100);
            e(0);
            return;
        }
        if (!d()) {
            this.f11435b.sendEmptyMessage(101);
            e(1);
            return;
        }
        if (!d(routeTrackInfo, deviceInfo)) {
            if (p()) {
                this.f11435b.sendEmptyMessage(102);
                return;
            } else {
                f();
                return;
            }
        }
        if (!e(deviceInfo)) {
            this.f11435b.sendEmptyMessage(103);
            e(2);
        } else if (routeTrackInfo.getSceneType() == SceneType.EXP.sceneType() && !d(deviceInfo) && g(deviceInfo)) {
            this.f11435b.sendEmptyMessage(104);
            e(2);
        } else {
            LogUtil.a("Track_RouteTransferUtils", "sceneType = ", Integer.valueOf(routeTrackInfo.getSceneType()));
            a(routeTrackInfo.getTrackName(), SportHiWearBusinessType.TRAJECTORY_HANDLE_SHAKE.getTypeValue());
        }
    }

    public int n() {
        return this.r;
    }

    public void c(int i) {
        this.r = i;
    }

    public boolean p() {
        return njy.e(this.s) || this.r >= this.s.size() - 1;
    }

    public boolean k() {
        return njy.e(this.s) || this.s.size() == 1;
    }

    public void s() {
        if (njy.e(this.s)) {
            return;
        }
        this.r = this.s.size() - 1;
    }

    public boolean l() {
        return this.o;
    }

    public void b(boolean z) {
        this.o = z;
    }

    public void g() {
        SendFileCallback sendFileCallback = this.t;
        if (sendFileCallback == null) {
            return;
        }
        sendFileCallback.onSuccess();
    }

    public void f() {
        SendFileCallback sendFileCallback = this.t;
        if (sendFileCallback == null) {
            return;
        }
        sendFileCallback.onFail();
    }

    private void e(int i) {
        d(3, i, jdn.e());
    }

    private boolean d(RouteTrackInfo routeTrackInfo, DeviceInfo deviceInfo) {
        if (routeTrackInfo.getTrackType() != RouteType.EXP.routeType()) {
            return true;
        }
        return b(deviceInfo);
    }

    private void a(final String str, final int i) {
        g(i);
        gur.d().a(str, i, new IBaseResponseCallback() { // from class: jwk
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.e.d(i, str, i2, obj);
            }
        });
        ac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i, String str, int i2, Object obj) {
        ReleaseLogUtil.d("Track_RouteTransferUtils", "startTransferToDevice onResponse", Integer.valueOf(i2), " objData = ", obj);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i;
        messageObtain.obj = str;
        if (obj instanceof int[]) {
            Bundle bundle = new Bundle();
            bundle.putIntArray("pointMaxNum", (int[]) obj);
            messageObtain.setData(bundle);
        } else if (obj instanceof Integer) {
            messageObtain.arg1 = ((Integer) obj).intValue();
        }
        this.f11435b.sendMessage(messageObtain);
        v();
    }

    private void g(int i) {
        if (SportHiWearBusinessType.TRAJECTORY_IMAGE.getTypeValue() == i) {
            this.l = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2) {
        if (SportHiWearBusinessType.TRAJECTORY_IMAGE_HANDLE_SHAKE.getTypeValue() == i) {
            this.l = i2 == 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        a(this.q.getTrackId(), SportHiWearBusinessType.TRAJECTORY_HANDLE_SHAKE.getTypeValue());
    }

    private void d(int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_RouteTransferUtils", "routeId is empty, no bi");
            return;
        }
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        if (i2 != -1) {
            map.put("failReason", Integer.valueOf(i2));
        }
        map.put("routeID", str);
        lmf.d().c(BaseApplication.b(), "1040090", map, 0);
    }

    public static boolean a(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("Track_RouteTransferUtils", "isBindedDevice");
        return deviceInfo != null;
    }

    public static boolean d() {
        ReleaseLogUtil.d("Track_RouteTransferUtils", "isConnectDevice");
        return ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RouteTransferUtils") != null;
    }

    public static boolean e() {
        return eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RouteTransferUtils"), 216);
    }

    public static boolean c() {
        return eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RouteTransferUtils"), TypedValues.AttributesType.TYPE_PIVOT_TARGET);
    }

    public static boolean b(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 216);
    }

    public static boolean b() {
        return c(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RouteTransferUtils"));
    }

    public static boolean c(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 218);
    }

    public static boolean e(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("Track_RouteTransferUtils", "isSupportRouteDeliver");
        return eey.d(deviceInfo, 70);
    }

    public static boolean d(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER);
        ReleaseLogUtil.d("Track_RouteTransferUtils", "isSupportExpRoute", Boolean.valueOf(zD));
        return zD;
    }

    public static boolean g(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 272);
        ReleaseLogUtil.d("Track_RouteTransferUtils", "isSupportRouteSceneType", Boolean.valueOf(zD));
        return zD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (this.f11435b.hasMessages(4)) {
            LogUtil.a("Track_RouteTransferUtils", "removeTimeOutMessage");
            this.f11435b.removeMessages(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i, int i2, int i3) {
        ReleaseLogUtil.d("Track_RouteTransferUtils", "setErrorCodeResult", str, "errorCode", Integer.valueOf(i));
        if (i == 1) {
            if (i2 == SportHiWearBusinessType.TRAJECTORY_IMAGE_HANDLE_SHAKE.getTypeValue()) {
                ad();
                return;
            } else {
                f(i3);
                return;
            }
        }
        if (i == 2) {
            x();
            s();
            if (l()) {
                a(this.i.getString(R.string.IDS_track_rt_save_sus_but_max), k());
            } else {
                Context context = this.i;
                qpx.b(context, context.getString(R.string.IDS_running_route_detail_file_full));
            }
            d(3, 5, jdn.e());
            d(4);
            return;
        }
        if (i == 3) {
            f();
            if (l()) {
                a(R.string.IDS_track_rt_save_sus);
            } else {
                l(1);
            }
            d(3, 3, jdn.e());
            d(3);
            return;
        }
        if (i == 4) {
            f();
            x();
            if (l()) {
                a(this.i.getString(R.string.IDS_track_rt_save_sus_and_send_fail), k());
            } else {
                Context context2 = this.i;
                qpx.b(context2, context2.getString(R.string.IDS_my_track_detail_send_fail));
            }
            d(3, 4, jdn.e());
            return;
        }
        if (i != 5) {
            return;
        }
        f();
        x();
        if (l()) {
            a(this.i.getString(R.string.IDS_track_rt_save_sus_but_too_long), k());
        } else {
            Context context3 = this.i;
            qpx.b(context3, context3.getString(R.string.IDS_my_track_detail_file_name_too_long));
        }
        d(3, 6, jdn.e());
    }

    public static void b(String str, final ResponseCallback<Boolean> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("Track_RouteTransferUtils", "isRouteInDevice callback is null");
            return;
        }
        if (!d()) {
            ReleaseLogUtil.e("Track_RouteTransferUtils", "Device not connect");
            responseCallback.onResponse(-1, false);
        } else if (!b()) {
            ReleaseLogUtil.e("Track_RouteTransferUtils", "not support Route Draw");
            responseCallback.onResponse(-1, false);
        } else {
            gur.d().a(str, SportHiWearBusinessType.TRAJECTORY_IMAGE_HANDLE_SHAKE.getTypeValue(), new IBaseResponseCallback() { // from class: jwh
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    RouteTransferDataHolder.c(responseCallback, i, obj);
                }
            });
        }
    }

    public static /* synthetic */ void c(ResponseCallback responseCallback, int i, Object obj) {
        ReleaseLogUtil.d("Track_RouteTransferUtils", "isRouteInDevice return: ", obj);
        if (obj instanceof int[]) {
            responseCallback.onResponse(0, Boolean.valueOf(((int[]) obj)[0] == 3));
        } else if (obj instanceof Integer) {
            responseCallback.onResponse(0, Boolean.valueOf(((Integer) obj).intValue() == 3));
        } else {
            responseCallback.onResponse(0, false);
        }
    }

    public void e(String str, RouteTrackInfo routeTrackInfo, double d2) {
        if (routeTrackInfo == null) {
            ReleaseLogUtil.a("Track_RouteTransferUtils", "RouteTrackInfo is null");
            return;
        }
        this.q = routeTrackInfo;
        this.p = d2;
        e("m1");
        if (TextUtils.isEmpty(str)) {
            q();
        } else {
            c(str);
        }
    }

    public void j() {
        ReleaseLogUtil.d("Track_RouteTransferUtils", "auto routeToDevice start.");
        List<RouteData> routeDataList = RouteDataStorageManager.getRouteDataList();
        if (njy.e(routeDataList)) {
            a(qre.f(R.string.IDS_track_rt_save_sus_and_send_fail), true);
            return;
        }
        b(true);
        int size = routeDataList.size();
        if (size == 1) {
            RouteData routeData = routeDataList.get(0);
            d(routeData.getRouteName(), routeData);
            q();
        } else {
            this.j = 0;
            a(routeDataList);
            a(new LinkedList(o()), ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RouteTransferUtils"));
            ReleaseLogUtil.d("Track_RouteTransferUtils", "autoSendSize = ", Integer.valueOf(size));
        }
        RouteDataStorageManager.clearRouteData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(final int i) {
        HandlerExecutor.c(new Runnable() { // from class: jwt
            @Override // java.lang.Runnable
            public final void run() {
                this.d.j(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(int i) {
        if (this.j == 0) {
            qpx.b(this.i, qre.f(R.string.IDS_track_rt_save_sus_and_send_suc));
            return;
        }
        int i2 = R.string.IDS_track_rt_save_sus_and_send_komoot_fail;
        String strE = qre.e(R.plurals.IDS_track_route_unit, i, Integer.valueOf(i));
        int i3 = R.plurals.IDS_track_route_unit;
        int i4 = this.j;
        a(qre.a(i2, strE, qre.e(i3, i4, Integer.valueOf(i4))), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Queue<RouteTrackInfo> queue, final DeviceInfo deviceInfo) {
        b(queue.poll(), deviceInfo, new SendFileCallback() { // from class: com.huawei.healthcloud.plugintrack.util.RouteTransferDataHolder.4
            @Override // com.huawei.healthcloud.plugintrack.util.RouteTransferDataHolder.SendFileCallback
            public void onSuccess() {
                ReleaseLogUtil.d("Track_RouteTransferUtils", "onSuccess holder.getSendIndex() = ", Integer.valueOf(RouteTransferDataHolder.this.n()));
                if (!RouteTransferDataHolder.this.p()) {
                    RouteTransferDataHolder routeTransferDataHolder = RouteTransferDataHolder.this;
                    routeTransferDataHolder.c(routeTransferDataHolder.n() + 1);
                    RouteTransferDataHolder.this.a((Queue<RouteTrackInfo>) queue, deviceInfo);
                } else {
                    RouteTransferDataHolder routeTransferDataHolder2 = RouteTransferDataHolder.this;
                    routeTransferDataHolder2.h(routeTransferDataHolder2.o().size());
                }
            }

            @Override // com.huawei.healthcloud.plugintrack.util.RouteTransferDataHolder.SendFileCallback
            public void onFail() {
                ReleaseLogUtil.d("Track_RouteTransferUtils", "onSuccess holder.onFail() = ", Integer.valueOf(RouteTransferDataHolder.this.n()));
                RouteTransferDataHolder.this.j++;
                if (!RouteTransferDataHolder.this.p()) {
                    RouteTransferDataHolder routeTransferDataHolder = RouteTransferDataHolder.this;
                    routeTransferDataHolder.c(routeTransferDataHolder.n() + 1);
                    RouteTransferDataHolder.this.a((Queue<RouteTrackInfo>) queue, deviceInfo);
                } else {
                    RouteTransferDataHolder routeTransferDataHolder2 = RouteTransferDataHolder.this;
                    routeTransferDataHolder2.h(routeTransferDataHolder2.o().size());
                }
            }
        });
    }

    private void c(String str) {
        this.g = str;
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RouteTransferUtils");
        if (!a(deviceInfo)) {
            d(0);
            qpx.e(this.i, R.string.IDS_running_route_detail_transfer);
            return;
        }
        if (!d()) {
            d(1);
            qpx.e(this.i, R.string.IDS_running_route_detail_connect_trans);
        } else {
            if (!c(deviceInfo)) {
                d(2);
                if (RunningRouteUtils.g()) {
                    qpx.e(this.i, R.string.IDS_track_route_draw_device_version_not_support);
                    return;
                } else {
                    qpx.e(this.i, R.string.IDS_track_route_draw_device_not_support);
                    return;
                }
            }
            t();
        }
    }

    private void t() {
        if (this.i == null) {
            ReleaseLogUtil.a("Track_RouteTransferUtils", "activity or pathDetailInfo is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.i);
        builder.a(qre.f(R.string.IDS_track_route_draw_transmit_to_wearable_device_tip)).c(R.string.IDS_track_route_draw_start_transfer, new View.OnClickListener() { // from class: jwi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39136c.c(view);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: jww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RouteTransferDataHolder.a(view);
            }
        });
        builder.c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        e("m2");
        a(this.q.getTrackId(), SportHiWearBusinessType.TRAJECTORY_IMAGE_HANDLE_SHAKE.getTypeValue());
    }

    private boolean y() {
        RouteTrackInfo routeTrackInfo = this.q;
        return routeTrackInfo != null && routeTrackInfo.getTrackType() == RouteType.DRAW.routeType();
    }

    private void ad() {
        LogUtil.a("Track_RouteTransferUtils", " start sendRouteImage:", this.g);
        String str = xjl.c() + "/route_draw";
        LogUtil.a("Track_RouteTransferUtils", " start sendRouteImage filePath:", str);
        File file = new File(str);
        if (!file.exists()) {
            LogUtil.a("Track_RouteTransferUtils", "CreateFile : ", file.mkdir() ? "Success" : "Failed");
        }
        oet.d().a(new oer(this.g, null, file, new ProgressListener<File>() { // from class: com.huawei.healthcloud.plugintrack.util.RouteTransferDataHolder.3
            @Override // com.huawei.networkclient.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
            }

            @Override // com.huawei.networkclient.ProgressListener
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file2) throws Throwable {
                byte[] bArrA = xjl.a(file2);
                LogUtil.a("Track_RouteTransferUtils", "DeleteFile : ", FileUtils.b(file2) ? "Success" : "Failed");
                if (bArrA == null || bArrA.length == 0) {
                    ReleaseLogUtil.a("Track_RouteTransferUtils", "imageByte is null ");
                    qpx.e(RouteTransferDataHolder.this.i, R.string.IDS_my_track_detail_send_fail);
                } else {
                    RouteTransferDataHolder.this.e(bArrA, SportHiWearBusinessType.TRAJECTORY_IMAGE.getTypeValue());
                }
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onFail(Throwable th) {
                LogUtil.e("Track_RouteTransferUtils", " commonDownload onFail:", th);
                qpx.e(RouteTransferDataHolder.this.i, R.string.IDS_my_track_detail_send_fail);
            }
        }));
    }

    private void ab() {
        LogUtil.a("Track_RouteTransferUtils", " start sendRouteImageSmall:", this.h);
        if (TextUtils.isEmpty(this.h)) {
            ReleaseLogUtil.d("Track_RouteTransferUtils", "no Small Image");
            z();
            return;
        }
        String str = xjl.c() + "/route_draw_small";
        ReleaseLogUtil.d("Track_RouteTransferUtils", " start sendRouteImageSmall");
        File file = new File(str);
        if (!file.exists()) {
            ReleaseLogUtil.d("Track_RouteTransferUtils", "ImageSmall CreateFile : ", file.mkdir() ? "Success" : "Failed");
        }
        ac();
        oet.d().a(new oer(this.h, null, file, new ProgressListener<File>() { // from class: com.huawei.healthcloud.plugintrack.util.RouteTransferDataHolder.2
            @Override // com.huawei.networkclient.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
            }

            @Override // com.huawei.networkclient.ProgressListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file2) throws Throwable {
                byte[] bArrA = xjl.a(file2);
                ReleaseLogUtil.d("Track_RouteTransferUtils", "DeleteFile : ", FileUtils.b(file2) ? "Success" : "Failed");
                if (bArrA == null || bArrA.length == 0) {
                    ReleaseLogUtil.a("Track_RouteTransferUtils", "imageByte is null in sendRouteImageSmall");
                    RouteTransferDataHolder.this.z();
                } else {
                    ReleaseLogUtil.d("Track_RouteTransferUtils", "sendRouteImageSmall pointNum = ", Integer.valueOf(bArrA.length));
                    RouteTransferDataHolder.this.f.sendCommandToDevice(bArrA, SportHiWearBusinessType.TRAJECTORY_IMAGE_SMALL.getTypeValue(), new DeviceCallback() { // from class: com.huawei.healthcloud.plugintrack.util.RouteTransferDataHolder.2.2
                        @Override // com.huawei.basefitnessadvice.callback.DeviceCallback
                        public void onSendProgress(long j) {
                        }

                        @Override // com.huawei.basefitnessadvice.callback.DeviceCallback
                        public void onSendResult(int i) {
                            ReleaseLogUtil.d("Track_RouteTransferUtils", "sendRouteImageSmall send result ", Integer.valueOf(i));
                            RouteTransferDataHolder.this.z();
                        }
                    });
                }
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onFail(Throwable th) {
                ReleaseLogUtil.a("Track_RouteTransferUtils", " commonDownload onFail:", th);
                RouteTransferDataHolder.this.z();
            }
        }));
    }

    private void f(int i) {
        TrackFeatureExtractionApi trackFeatureExtractionApi = (TrackFeatureExtractionApi) Services.d("TrackFeatureExtractionAlgorithmService", TrackFeatureExtractionApi.class);
        if (trackFeatureExtractionApi == null || this.q == null) {
            LogUtil.a("Track_RouteTransferUtils", "sendRouteFile mRouteTrackInfo == ", this.q);
            x();
            f();
            if (l()) {
                a(this.i.getString(R.string.IDS_track_rt_save_sus_and_send_fail), k());
                return;
            } else {
                Context context = this.i;
                qpx.b(context, context.getString(R.string.IDS_my_track_detail_send_fail));
                return;
            }
        }
        boolean zE = e();
        LogUtil.a("Track_RouteTransferUtils", "sendRouteFile point size ", Long.valueOf(this.q.getPointsNum()), " cp size ", Integer.valueOf(this.q.getMarkerPointsNum()), " isSupportRouteCp = ", Boolean.valueOf(zE));
        if (!zE) {
            this.q.setVersion(1);
            this.q.setShowAltitude(false);
            this.q.setMarkerPoints(new ArrayList());
            this.q.setMarkerPointsNum(0);
        }
        if (this.q.getSceneType() == SceneType.BIKE.sceneType() && c()) {
            this.q.setSupportClimb(true);
            LogUtil.a("Track_RouteTransferUtils", "sendRouteFile supportSlope is true");
        }
        e(trackFeatureExtractionApi.algTrackImport(this.q, i, this.p), SportHiWearBusinessType.TRAJECTORY_FILE.getTypeValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(byte[] bArr, int i) {
        ReleaseLogUtil.d("Track_RouteTransferUtils", "sendRouteData pointNum = ", Integer.valueOf((bArr.length - 12) / 40));
        this.k = false;
        this.f.sendCommandToDevice(bArr, i, new d(this, i));
        ac();
    }

    static class d implements DeviceCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<RouteTransferDataHolder> f11441a;
        private final int d;

        public d(RouteTransferDataHolder routeTransferDataHolder, int i) {
            this.f11441a = new WeakReference<>(routeTransferDataHolder);
            this.d = i;
        }

        @Override // com.huawei.basefitnessadvice.callback.DeviceCallback
        public void onSendResult(int i) {
            RouteTransferDataHolder routeTransferDataHolder = this.f11441a.get();
            if (routeTransferDataHolder == null) {
                LogUtil.j("Track_RouteTransferUtils", "onSendResult holder is null");
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            messageObtain.arg1 = i;
            messageObtain.arg2 = this.d;
            routeTransferDataHolder.f11435b.sendMessage(messageObtain);
            routeTransferDataHolder.v();
        }

        @Override // com.huawei.basefitnessadvice.callback.DeviceCallback
        public void onSendProgress(long j) {
            RouteTransferDataHolder routeTransferDataHolder = this.f11441a.get();
            if (routeTransferDataHolder == null) {
                LogUtil.j("Track_RouteTransferUtils", "onSendResult holder is null");
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.arg1 = routeTransferDataHolder.e(j, this.d);
            messageObtain.what = 3;
            routeTransferDataHolder.f11435b.sendMessage(messageObtain);
            if (j > 0) {
                routeTransferDataHolder.ac();
            }
            if (routeTransferDataHolder.p() && j == 100 && this.d == SportHiWearBusinessType.TRAJECTORY_FILE.getTypeValue() && routeTransferDataHolder.w != null) {
                routeTransferDataHolder.w.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(long j, int i) {
        if (y()) {
            int i2 = (int) (j * 0.5d);
            return i == SportHiWearBusinessType.TRAJECTORY_IMAGE.getTypeValue() ? i2 : i2 + 50;
        }
        if (!l() || njy.e(this.s) || this.s.size() <= 1) {
            return (int) j;
        }
        LogUtil.a("Track_RouteTransferUtils", "getRealProgress mSendIndex=", Integer.valueOf(this.r), " list.size = ", Integer.valueOf(this.s.size()));
        return (int) ((j + ((long) (this.r * 100))) / ((long) this.s.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        LogUtil.a("Track_RouteTransferUtils", "sendTimeOutMessage");
        v();
        if (this.k) {
            return;
        }
        this.f11435b.sendEmptyMessageDelayed(4, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        LogUtil.a("Track_RouteTransferUtils", "setFileResult:errorCode", Integer.valueOf(i));
        if (i == 1) {
            if (i2 == SportHiWearBusinessType.TRAJECTORY_IMAGE.getTypeValue()) {
                if (this.l) {
                    ab();
                    return;
                } else {
                    z();
                    return;
                }
            }
            CustomProgressDialog customProgressDialog = this.w;
            if (customProgressDialog != null) {
                customProgressDialog.dismiss();
            }
            if ((this.i instanceof ClockingRankActivity) && y()) {
                e("m3");
                ((ClockingRankActivity) this.i).c(true);
            }
            aa();
            d(2, -1, jdn.e());
            return;
        }
        x();
        qpx.b(this.i, R.string.IDS_my_track_detail_send_fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        LogUtil.a("Track_RouteTransferUtils", "showGuideToDescriptionDialog");
        if (this.f11434a == null) {
            String strF = qre.f(R.string.IDS_my_track_detail_unsupported);
            View viewInflate = View.inflate(this.i, R.layout.dialog_not_support_device, null);
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.not_support_device_describe);
            b((TextView) healthTextView);
            healthTextView.setText(strF);
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.i);
            builder.d(viewInflate);
            builder.c(qre.f(R.string.IDS_my_track_detail_i_got_it), new View.OnClickListener() { // from class: jwq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f39147c.j(view);
                }
            }).a(qre.f(R.string.IDS_my_track_detail_supported_devices), new View.OnClickListener() { // from class: jwo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f39144a.h(view);
                }
            });
            CustomViewDialog customViewDialogD = builder.d();
            this.f11434a = customViewDialogD;
            customViewDialogD.findViewById(R.id.custom_dialog_title_layout).setPadding(0, 0, 0, 0);
            this.f11434a.setCancelable(false);
        }
        if (((Activity) this.i).isFinishing()) {
            return;
        }
        this.f11434a.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        this.f11434a.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        u();
        d(4, -1, jdn.e());
    }

    private void b(TextView textView) {
        LogUtil.a("Track_RouteTransferUtils", "increaseTvHeight");
        if (!LanguageUtil.bo(this.i) || textView == null) {
            return;
        }
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), (int) this.i.getResources().getDimension(com.huawei.ui.commonui.R.dimen.health_common_6dp));
    }

    private void u() {
        LogUtil.a("Track_RouteTransferUtils", "goToDescriptionPage");
        ddv.b().initH5Pro();
        H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).setImmerse().showStatusBar().setStatusBarTextBlack(true).setForceDarkMode(0).build();
        LogUtil.a("Track_RouteTransferUtils", "goToDescriptionPage baseUrl", EnvironmentHelper.getInstance().getUrl());
        H5ProClient.startH5LightApp(this.i, EnvironmentHelper.getInstance().getUrl() + "weixinScan/dist/index.html#/runPlanDevices", h5ProLaunchOptionBuild);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i) {
        LogUtil.e("Track_RouteTransferUtils", "showTrasferProgressDialog:", Integer.valueOf(i), " mIsSendFileOverTime = ", Boolean.valueOf(this.k));
        if (this.k) {
            return;
        }
        if (this.i == null) {
            ReleaseLogUtil.a("Track_RouteTransferUtils", "showProgressDialog mContext is null");
            return;
        }
        CustomProgressDialog customProgressDialog = this.w;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            this.x.b(i);
            this.x.d(i);
            return;
        }
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.i);
        this.x = builder;
        builder.e(qre.f(R.string.IDS_hwh_my_detail_transfer));
        CustomProgressDialog customProgressDialogC = this.x.c();
        this.w = customProgressDialogC;
        LinearLayout linearLayout = (LinearLayout) customProgressDialogC.findViewById(R.id.AppUpdateDialog_progress_layout);
        if (linearLayout.getChildAt(0).getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getChildAt(0).getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.rightMargin = 0;
        }
        linearLayout.getChildAt(1).setVisibility(8);
        this.w.setCanceledOnTouchOutside(false);
        this.w.setCancelable(false);
        if (((Activity) this.i).isFinishing()) {
            return;
        }
        this.w.show();
    }

    public void a(String str, boolean z) {
        if (z) {
            x();
            this.e = new CustomTextAlertDialog.Builder(this.i).e(this.i.getString(R.string.IDS_social_information_tips)).a(str).a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: jwr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RouteTransferDataHolder.b(view);
                }
            }).b();
            if (((Activity) this.i).isFinishing()) {
                return;
            }
            this.e.show();
        }
    }

    public void a(int i) {
        if (k()) {
            x();
            Context context = this.i;
            qpx.b(context, context.getString(i));
        }
    }

    private void aa() {
        LogUtil.a("Track_RouteTransferUtils", "showExportSucceededDialog");
        x();
        String strF = qre.f(y() ? R.string.IDS_running_route_draw_tip : R.string.IDS_running_route_detail_tip);
        String strF2 = qre.f(R.string.IDS_my_track_detail_i_go_it);
        String strF3 = qre.f(R.string.IDS_track_detail_trans_succeed);
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.i);
        builder.e(strF3).a(strF).b(strF2, new View.OnClickListener() { // from class: jwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39149b.f(view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.y = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (((Activity) this.i).isFinishing()) {
            return;
        }
        this.y.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        this.y.dismiss();
        w();
    }

    private void w() {
        LogUtil.a("Track_RouteTransferUtils", "linkDownloadOfflineMap");
        if (this.q == null) {
            LogUtil.e("Track_RouteTransferUtils", "mRouteTrackInfo is null");
            return;
        }
        if (l()) {
            LogUtil.a("Track_RouteTransferUtils", "isAutoSendFile");
            return;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RouteTransferUtils");
        if (deviceInfo == null) {
            LogUtil.e("Track_RouteTransferUtils", "deviceInfo is null");
            return;
        }
        if (((DeviceFeatureSupportApi) Services.b("Module_Device_Feature", DeviceFeatureSupportApi.class)).isSupportOfflineMap(deviceInfo)) {
            List<RouteTrackPoint> listB = njy.b(this.q.getPoints(), 20);
            if (njy.e(listB)) {
                LogUtil.e("Track_RouteTransferUtils", "trackPoints isEmpty");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (RouteTrackPoint routeTrackPoint : listB) {
                arrayList.add(new jpg(routeTrackPoint.getLatitude(), routeTrackPoint.getLongitude()));
            }
            OfflineMapApi offlineMapApi = (OfflineMapApi) Services.b("Device", OfflineMapApi.class);
            offlineMapApi.initOfflineMap(deviceInfo.getUuid());
            offlineMapApi.queryingDownloadCity(arrayList, new DownloadCityCallback() { // from class: jws
                @Override // com.huawei.health.device.callback.DownloadCityCallback
                public final void onResponse(List list) {
                    this.f39148a.e((List<String>) list);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<String> list) {
        Message messageObtain = Message.obtain();
        messageObtain.obj = list;
        messageObtain.what = 5;
        this.f11435b.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final List<String> list) {
        if (njy.e(list)) {
            LogUtil.a("Track_RouteTransferUtils", "showDownloadOfflineMapDialog cityIdList is null");
            return;
        }
        String string = this.i.getString(R.string.IDS_running_path_download_offline_map);
        String string2 = this.i.getString(R.string.IDS_running_path_download_map);
        String string3 = this.i.getString(R.string.IDS_hw_common_ui_dialog_cancel);
        String string4 = this.i.getString(R.string.IDS_running_path_download_map_tips_title);
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.i);
        builder.e(string4).a(string).b(string2, new View.OnClickListener() { // from class: jwy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39150a.d(list, view);
            }
        }).a(string3, new View.OnClickListener() { // from class: jxa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39156b.i(view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.d = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (((Activity) this.i).isFinishing()) {
            return;
        }
        this.d.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(List list, View view) {
        this.d.dismiss();
        d((List<String>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        this.d.dismiss();
    }

    private void d(List<String> list) {
        if (CommonUtil.ab(BaseApplication.b())) {
            DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RouteTransferUtils");
            if (deviceInfo == null) {
                LogUtil.a("Track_RouteTransferUtils", "linkDownloadOfflineMap deviceInfo is null");
                return;
            } else {
                ((OfflineMapApi) Services.b("Device", OfflineMapApi.class)).jumpToOfflineMap(deviceInfo, list);
                return;
            }
        }
        qpx.e(BaseApplication.b(), R.string.IDS_connect_network);
        LogUtil.j("Track_RouteTransferUtils", "Network not Available");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        Context context = this.i;
        if (context == null || !(context instanceof Activity)) {
            ReleaseLogUtil.a("Track_RouteTransferUtils", "dismiss Dialog fail： activity is null");
            return;
        }
        Activity activity = (Activity) context;
        if (activity.isFinishing() || activity.isDestroyed()) {
            ReleaseLogUtil.a("Track_RouteTransferUtils", "dismiss Dialog fail： activity is Finishing or Destroyed");
            return;
        }
        CustomTextAlertDialog customTextAlertDialog = this.e;
        if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
            this.e.dismiss();
        }
        CustomTextAlertDialog customTextAlertDialog2 = this.y;
        if (customTextAlertDialog2 != null && customTextAlertDialog2.isShowing()) {
            this.y.dismiss();
        }
        CustomTextAlertDialog customTextAlertDialog3 = this.v;
        if (customTextAlertDialog3 != null && customTextAlertDialog3.isShowing()) {
            this.v.dismiss();
        }
        CustomProgressDialog customProgressDialog = this.w;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            this.w.dismiss();
        }
        CustomViewDialog customViewDialog = this.f11434a;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            this.f11434a.dismiss();
        }
        CustomViewDialog customViewDialog2 = this.f11436c;
        if (customViewDialog2 != null && customViewDialog2.isShowing()) {
            this.f11436c.dismiss();
        }
        CustomTextAlertDialog customTextAlertDialog4 = this.d;
        if (customTextAlertDialog4 == null || !customTextAlertDialog4.isShowing()) {
            return;
        }
        this.d.dismiss();
    }

    private void l(final int i) {
        LogUtil.a("Track_RouteTransferUtils", "showTipDialog: ", Integer.valueOf(i));
        x();
        Context context = this.i;
        if (context == null) {
            ReleaseLogUtil.a("Track_RouteTransferUtils", "activity or pathDetailInfo is null");
            return;
        }
        if (i == 1) {
            Toast.makeText(context, context.getString(R.string.IDS_track_path_name_existed), 0).show();
            return;
        }
        if (i == 2) {
            String string = context.getString(R.string.IDS_running_route_confirm_delete);
            String string2 = this.i.getString(R.string.IDS_route_confirm_delete_line);
            String string3 = this.i.getString(R.string.IDS_music_management_delete);
            CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.i);
            builder.e(string).a(string2).a(this.i.getResources().getString(R.string.IDS_motiontrack_show_cancel), new View.OnClickListener() { // from class: jwu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.g(view);
                }
            }).b(string3, new View.OnClickListener() { // from class: jwv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.b(i, view);
                }
            });
            CustomTextAlertDialog customTextAlertDialogB = builder.b();
            this.v = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            if (((Activity) this.i).isFinishing()) {
                return;
            }
            this.v.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        this.v.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(int i, View view) {
        b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final int i) {
        String strF;
        String strF2;
        String strF3;
        LogUtil.a("Track_RouteTransferUtils", "status: ", Integer.valueOf(i));
        x();
        if (this.i == null) {
            ReleaseLogUtil.a("Track_RouteTransferUtils", "showDeviceStatusDialog mContext is null");
            return;
        }
        if (i == -1) {
            strF = qre.f(R.string.IDS_track_unbound_device);
            strF2 = qre.f(R.string.IDS_running_route_detail_transfer);
            strF3 = qre.f(R.string.IDS_my_track_detail_unbinding);
        } else if (i != 0) {
            strF = null;
            strF2 = null;
            strF3 = null;
        } else {
            strF = a() + qre.f(R.string.IDS_track_detail_unconnected);
            strF2 = qre.f(R.string.IDS_running_route_detail_connect_trans);
            strF3 = qre.f(R.string.IDS_my_track_detail_reconnect);
        }
        View viewInflate = View.inflate(this.i, R.layout.dialog_not_support_device, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.not_support_device_describe);
        b((TextView) healthTextView);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.support_device_list);
        healthTextView2.setVisibility(0);
        healthTextView2.setText(qre.f(R.string.IDS_my_track_detail_to_supported_devices));
        healthTextView.setText(strF2);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.i);
        builder.b(viewInflate, 24, 24).a(strF);
        healthTextView2.setOnClickListener(new View.OnClickListener() { // from class: jwm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39142c.e(view);
            }
        });
        builder.c(qre.f(R.string.IDS_motiontrack_show_cancel), new View.OnClickListener() { // from class: jwn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39143c.d(view);
            }
        }).a(strF3, new View.OnClickListener() { // from class: jwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39145a.d(i, view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.f11436c = customViewDialogD;
        View viewFindViewById = customViewDialogD.findViewById(com.huawei.ui.commonui.R.id.dialog_rlyt_content);
        if (viewFindViewById instanceof RelativeLayout) {
            if (LanguageUtil.ba(this.i)) {
                ((RelativeLayout) viewFindViewById).setGravity(21);
            } else {
                ((RelativeLayout) viewFindViewById).setGravity(19);
            }
        }
        this.f11436c.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        u();
        d(4, -1, jdn.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f11436c.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i, View view) {
        b(i);
    }

    public static String a() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RouteTransferUtils");
        if (deviceInfo == null) {
            health.compact.a.util.LogUtil.a("Track_RouteTransferUtils", "getDeviceName   DeviceInfo:null");
            return "";
        }
        LogUtil.a("Track_RouteTransferUtils", "getDeviceName: ", deviceInfo.getDeviceName());
        return deviceInfo.getDeviceName();
    }

    private void b(int i) {
        LogUtil.a("Track_RouteTransferUtils", "excutePositive, tipType: ", Integer.valueOf(i));
        if (i == -1) {
            e((Activity) this.i);
        } else if (i == 0) {
            d((Activity) this.i);
        } else if (i == 2) {
            r();
        }
        CustomTextAlertDialog customTextAlertDialog = this.v;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
        }
    }

    private static void e(Activity activity) {
        try {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.d(), "com.huawei.ui.device.activity.adddevice.OneKeyScanActivity");
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            health.compact.a.util.LogUtil.c("Track_RouteTransferUtils", "startScanActivity ActivityNotFoundException");
        }
    }

    private void r() {
        LogUtil.a("Track_RouteTransferUtils", "deleteRoute");
        if (!CommonUtil.ab(this.i)) {
            qpx.e(this.i, R.string.IDS_hw_show_set_about_privacy_connectting_error);
        } else {
            if (this.n == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(this.n.getRouteVersion()));
            ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).deleteRoutes(arrayList, new a(this));
        }
    }

    static class a implements RouteResultCallBack<CloudCommonReponse> {
        private final WeakReference<RouteTransferDataHolder> d;

        public a(RouteTransferDataHolder routeTransferDataHolder) {
            this.d = new WeakReference<>(routeTransferDataHolder);
        }

        @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(CloudCommonReponse cloudCommonReponse) {
            RouteTransferDataHolder routeTransferDataHolder = this.d.get();
            if (routeTransferDataHolder == null) {
                LogUtil.j("Track_RouteTransferUtils", "onSuccess holder is null");
            } else if (cloudCommonReponse.getResultCode().intValue() != 0) {
                qpx.b(routeTransferDataHolder.i, R.string.IDS_watchface_delete_failed);
                LogUtil.d("Track_RouteTransferUtils", "delete resp resultCode:", cloudCommonReponse.getResultCode(), ",resp resultDesc:", cloudCommonReponse.getResultDesc());
            }
        }

        @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
        public void onFailure(Throwable th) {
            RouteTransferDataHolder routeTransferDataHolder = this.d.get();
            if (routeTransferDataHolder == null) {
                LogUtil.j("Track_RouteTransferUtils", "onSuccess holder is null");
            } else {
                qpx.b(routeTransferDataHolder.i, R.string.IDS_watchface_delete_failed);
                LogUtil.e("Track_RouteTransferUtils", "delete onFailure:", th.getMessage());
            }
        }
    }

    private void d(int i) {
        RouteTrackInfo routeTrackInfo = this.q;
        if (routeTrackInfo == null) {
            return;
        }
        jdo.c(i, routeTrackInfo.getTrackId(), this.q.getTrackName(), y());
    }

    private void e(String str) {
        RouteTrackInfo routeTrackInfo = this.q;
        if (routeTrackInfo == null) {
            return;
        }
        jdo.b(str, routeTrackInfo.getTrackId(), this.q.getTrackName(), y());
    }

    public static void d(Activity activity) {
        try {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.d(), "com.huawei.ui.homewear21.home.WearHomeActivity");
            DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RouteTransferUtils");
            intent.putExtra("is_jump_to_device_detail", true);
            if (deviceInfo != null) {
                intent.putExtra("device_id", deviceInfo.getDeviceIdentify());
            }
            intent.setFlags(268435456);
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Track_RouteTransferUtils", "startWearHomeActivity ActivityNotFoundException");
        }
    }

    static class e extends BaseHandler<RouteTransferDataHolder> {
        e(RouteTransferDataHolder routeTransferDataHolder) {
            super(routeTransferDataHolder);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(RouteTransferDataHolder routeTransferDataHolder, Message message) {
            ReleaseLogUtil.d("Track_RouteTransferUtils", "handleMessageWhenReferenceNotNull, MSG: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                if (message.obj instanceof String) {
                    String str = (String) message.obj;
                    int i2 = 0;
                    if (message.getData().containsKey("pointMaxNum")) {
                        int[] intArray = message.getData().getIntArray("pointMaxNum");
                        if (intArray.length > 0) {
                            message.arg1 = intArray[0];
                        }
                        if (intArray.length > 1) {
                            i2 = intArray[1];
                        }
                    }
                    ReleaseLogUtil.d("Track_RouteTransferUtils", "pointMaxNum:", Integer.valueOf(i2));
                    routeTransferDataHolder.e(message.arg2, i2);
                    routeTransferDataHolder.a(str, message.arg1, message.arg2, Math.max(i2, 200));
                    return;
                }
                routeTransferDataHolder.f();
                return;
            }
            if (i == 2) {
                if (routeTransferDataHolder.l()) {
                    routeTransferDataHolder.a(R.string.IDS_track_rt_save_sus_and_send_suc);
                } else {
                    routeTransferDataHolder.a(message.arg1, message.arg2);
                }
                routeTransferDataHolder.g();
                return;
            }
            if (i == 3) {
                routeTransferDataHolder.k(message.arg1);
                return;
            }
            if (i == 4) {
                routeTransferDataHolder.f();
                a(routeTransferDataHolder);
                return;
            }
            if (i == 5) {
                if (njy.b(message.obj, String.class)) {
                    routeTransferDataHolder.b((List<String>) message.obj);
                }
            } else {
                if (i == 8) {
                    if (routeTransferDataHolder.l()) {
                        routeTransferDataHolder.a(routeTransferDataHolder.i.getString(R.string.IDS_track_rt_save_sus_and_send_fail), routeTransferDataHolder.k());
                    } else {
                        qpx.b(BaseApplication.b(), R.string.IDS_my_route_parse_error);
                    }
                    routeTransferDataHolder.f();
                    return;
                }
                c(routeTransferDataHolder, message);
            }
        }

        private void c(RouteTransferDataHolder routeTransferDataHolder, Message message) {
            switch (message.what) {
                case 100:
                    if (routeTransferDataHolder.l()) {
                        routeTransferDataHolder.s();
                        qpx.e(routeTransferDataHolder.i, R.string.IDS_track_rt_save_sus);
                    } else {
                        routeTransferDataHolder.i(-1);
                    }
                    break;
                case 101:
                    if (routeTransferDataHolder.l()) {
                        routeTransferDataHolder.s();
                        routeTransferDataHolder.a(routeTransferDataHolder.i.getString(R.string.IDS_track_rt_save_sus_but_not_connect), true);
                    } else {
                        routeTransferDataHolder.i(0);
                    }
                    break;
                case 102:
                    if (routeTransferDataHolder.l()) {
                        routeTransferDataHolder.a(R.string.IDS_track_rt_save_sus);
                        routeTransferDataHolder.f();
                    } else {
                        qpx.e(routeTransferDataHolder.i, R.string.IDS_track_route_draw_device_not_support);
                    }
                    break;
                case 103:
                    if (routeTransferDataHolder.l()) {
                        routeTransferDataHolder.s();
                        qpx.e(routeTransferDataHolder.i, R.string.IDS_track_rt_save_sus);
                    } else {
                        routeTransferDataHolder.af();
                    }
                    break;
                case 104:
                    if (routeTransferDataHolder.l()) {
                        routeTransferDataHolder.s();
                        qpx.e(routeTransferDataHolder.i, R.string.IDS_track_rt_save_sus);
                    } else {
                        qpx.e(routeTransferDataHolder.i, R.string.IDS_track_route_exp_not_support);
                    }
                    break;
            }
        }

        private void a(RouteTransferDataHolder routeTransferDataHolder) {
            routeTransferDataHolder.x();
            routeTransferDataHolder.k = true;
            Context context = routeTransferDataHolder.i;
            ReleaseLogUtil.d("Track_RouteTransferUtils", "send data device timeout:");
            if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
                return;
            }
            ReleaseLogUtil.a("Track_RouteTransferUtils", "showOverTimeTip");
            if (routeTransferDataHolder.l()) {
                routeTransferDataHolder.a(routeTransferDataHolder.i.getString(R.string.IDS_track_rt_save_sus_and_send_fail), routeTransferDataHolder.k());
            } else {
                qpx.b(context, context.getString(R.string.IDS_my_track_detail_send_fail));
            }
        }
    }
}
