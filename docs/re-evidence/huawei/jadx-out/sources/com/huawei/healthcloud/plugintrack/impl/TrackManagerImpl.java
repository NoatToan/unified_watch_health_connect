package com.huawei.healthcloud.plugintrack.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.huawei.health.motiontrack.api.TrackManagerApi;
import com.huawei.health.motiontrack.api.ViewHolderBase;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import defpackage.gze;
import defpackage.ive;
import defpackage.ivv;
import defpackage.iwy;
import defpackage.iyn;
import defpackage.izn;
import defpackage.jac;
import defpackage.jaf;
import defpackage.jau;
import defpackage.jqq;
import defpackage.jry;
import defpackage.jtd;
import defpackage.jxn;
import defpackage.jxu;
import defpackage.jxv;
import defpackage.jyd;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class TrackManagerImpl implements TrackManagerApi {
    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public boolean getRunWorkoutStarted() {
        return iwy.a(BaseApplication.getContext()).ai();
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public boolean getVoiceEnable() {
        return iwy.a(BaseApplication.getContext()).am();
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void initTargetList(List<gze> list) {
        ive.c().b(list);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public ViewHolderBase getChartViewHolder(Context context, int i) {
        return new jtd(context, 1, i);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public int getHeartPostureType(int i) {
        HwSportTypeInfo hwSportTypeInfoB = jry.a(com.huawei.haf.application.BaseApplication.b()).b(i);
        if (hwSportTypeInfoB == null) {
            return 1;
        }
        return hwSportTypeInfoB.getHeartPostureType();
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public Drawable acquireSportTypeDrawable(int i) {
        jry jryVarA = jry.a(BaseApplication.getContext());
        Drawable drawable = BaseApplication.getContext().getDrawable(R.drawable.ic_health_list_outdoor_running);
        if (jryVarA.b(i) == null || jryVarA.b(i).getHistoryList() == null) {
            LogUtil.e("Track_TrackManagerImpl", "getSportTypeInfoById =null sportType= ", Integer.valueOf(i));
            return drawable;
        }
        return jryVarA.b(i).getHistoryList().getItemDrawable();
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public boolean isSportingStatus() {
        return ive.c().r();
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public Map<Integer, Float> validPaceMap(Map<Integer, Float> map) {
        return izn.a(map);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public boolean sentHeartZoneSplicingMessages() {
        return jxv.c().d();
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void pushRqData(int i) {
        new jyd().b(BaseApplication.getContext(), i);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void getUserRunLevelDataByRq(int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        new jyd().c(com.huawei.haf.application.BaseApplication.b(), i, i2, i3, iBaseResponseCallback);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void getTrackDraw(List<Map<Long, double[]>> list, IBaseResponseCallback iBaseResponseCallback) {
        jxu.e(list, iBaseResponseCallback);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void getTrackDraw(List<Long> list, List<Long> list2, IBaseResponseCallback iBaseResponseCallback) {
        jxu.b(list, list2, BaseApplication.getContext(), iBaseResponseCallback);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public MotionPath readTemporaryMotionPath(Context context, String str) {
        return jac.d(context, str, 0);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void initGolfDeviceEngineManager() {
        GolfDeviceProxy.getInstance().sendDevicePullSuccessMsg();
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void startTrackDetail(long j, long j2) {
        ivv.a(j, j2);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public int startRunCourseSport(Context context, int i, int i2, float f, Bundle bundle) {
        ive.c().init(context);
        Bundle bundleB = ive.c().b(i, i2, f, -1);
        bundleB.putAll(bundle);
        int iC = ive.c().c(0, bundleB, (ISportDataCallback) null, context, (String) null);
        ReleaseLogUtil.c("Track_TrackManagerImpl", "startRunCourseSport responseCode = ", Integer.valueOf(iC));
        return iC;
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void startNearTrackDetail() {
        ivv.a();
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void gotoSport(Context context, int i, int i2, float f) {
        ive.c().c(context, i, i2, f);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void playSound(Object obj, String str) {
        LogUtil.b("Track_TrackManagerImpl", "playSound:", obj, " sound desc:", str);
        if (obj instanceof Integer) {
            jau.c().a(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof String) {
            jau.c().b((String) obj);
            return;
        }
        if (obj instanceof int[]) {
            jau.c().a((int[]) obj);
        } else if (obj instanceof String[]) {
            jau.c().c((String[]) obj, str);
        } else {
            LogUtil.e("Track_TrackManagerImpl", "playSound sound else ");
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void playSound(String str, Object obj, String str2) {
        LogUtil.b("Track_TrackManagerImpl", "playSound player:", str, " sound:", obj, " sound desc:", str2);
        if (obj instanceof String) {
            jau.c().e(str, (String) obj);
        } else {
            ReleaseLogUtil.d("Track_TrackManagerImpl", "playSound failed player:", str, " sound:", obj, " sound desc:", str2);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void sendPlayerCommand(String str, int i) {
        ReleaseLogUtil.c("Track_TrackManagerImpl", "setPlayerStatus player:", str, " playerCommand:", Integer.valueOf(i));
        jau.c().d(str, i);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void startVoiceService(String str, String str2, int i) {
        ReleaseLogUtil.c("Track_TrackManagerImpl", " startVoiceService moduleName:", str, " playerName:", str2, " playerType:", Integer.valueOf(i));
        jau.c().d(str, str2, i);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void stopVoiceService(String str) {
        ReleaseLogUtil.c("Track_TrackManagerImpl", " stopVoiceService moduleName:", str);
        jau.c().h(str);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public List<Integer> getFitnessSportTypeList(String str) {
        return jry.a(BaseApplication.getContext()).e(str);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void pourInterfaceToKitSportApi() {
        iyn.e();
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public int getSportState() {
        return ive.c().g();
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void stopLastAutoTrack() {
        ive.c().aa();
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public String getMarathonTitleName(Map<String, String> map) {
        return jqq.e(map);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void showEditRecordNameDialog(Context context, long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        jxn.b(context, j, j2, false, iBaseResponseCallback);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public boolean deleteFile(Context context, String str) {
        return jaf.c(context, str);
    }
}
