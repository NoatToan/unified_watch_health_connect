package com.huawei.health.basesport.helper;

import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import defpackage.gcn;
import defpackage.hae;
import defpackage.lsy;
import defpackage.njy;
import health.compact.a.Services;
import health.compact.a.util.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class HeartRateConfigHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6215b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnConfigHelperListener f6216c;
    private HeartZoneConf d;

    public interface OnConfigHelperListener {
        void onInitComplete();
    }

    public HeartRateConfigHelper(final int i, OnConfigHelperListener onConfigHelperListener) {
        this.f6216c = onConfigHelperListener;
        lsy.a(new Runnable() { // from class: dei
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(i);
            }
        });
    }

    public /* synthetic */ void a(int i) {
        int heartPostureType = gcn.c().getHeartPostureType(i);
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.d("HeartRateConfigHelper", "init : userProfileMgrApi is null.");
            return;
        }
        HeartZoneConf heartZoneConfA = hae.a(heartPostureType, userProfileMgrApi.getLocalUserInfo().getAgeOrDefaultValue());
        this.d = heartZoneConfA;
        if (heartZoneConfA != null) {
            this.f6215b = heartZoneConfA.getClassifyMethod();
        }
        OnConfigHelperListener onConfigHelperListener = this.f6216c;
        if (onConfigHelperListener != null) {
            onConfigHelperListener.onInitComplete();
        }
    }

    public int c(int i) {
        HeartZoneConf heartZoneConf = this.d;
        if (heartZoneConf != null) {
            return heartZoneConf.findRateRegion(i, this.f6215b);
        }
        return -1;
    }

    public float b(int i) {
        HeartZoneConf heartZoneConf = this.d;
        if (heartZoneConf != null) {
            return heartZoneConf.findRateRegionRatio(i, this.f6215b);
        }
        return -1.0f;
    }

    public String e(int i) {
        int iC = c(i);
        List<String> listC = hae.c(this.f6215b);
        if (njy.c(listC, iC)) {
            return listC.get(iC);
        }
        return "";
    }

    public HeartZoneConf c() {
        return this.d;
    }

    public void d(int i) {
        this.f6215b = i;
    }
}
