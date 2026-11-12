package com.huawei.healthcloud.plugintrack.manager;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.reflect.TypeToken;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njk;
import defpackage.njy;
import defpackage.qqt;
import health.compact.a.SharedPreferenceManager;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class SlopeLinkageDataManager extends LinkageDataManager<njk> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10454c;
    private int d;
    private int e;

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected long getRefreshInterval() {
        return 1000L;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected List<njk> recoverPointData(MotionData motionData) {
        return null;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    public void saveLinkDataToMotionPath(MotionPath motionPath, boolean z, boolean z2) {
    }

    public SlopeLinkageDataManager(Context context) {
        super(context);
        this.d = Integer.MIN_VALUE;
        this.f10452a = 0;
        this.f10453b = 0;
        this.e = -101;
        this.f10454c = 101;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected String getTAG() {
        return "Track_SlopeLinkageDataManager";
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected List<Integer> getDataType() {
        return Arrays.asList(28);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected String getSpKey() {
        return "saved_temp_slope";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public njk convertLinkData(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
        if (hiHealthData == null) {
            LogUtil.e("Track_SlopeLinkageDataManager", "convertLinkData HiHealthData is null!");
            return null;
        }
        return new njk(hiHealthData.getStartTime(), hiHealthData.getIntValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void updateLinkData(njk njkVar) {
        if (njkVar == null) {
            LogUtil.e("Track_SlopeLinkageDataManager", "slopeData data is null");
            return;
        }
        this.mLastUpdateTime = njkVar.acquireTime();
        if (njkVar.e() > -101) {
            this.mCurrentIndex++;
            this.d = njkVar.e();
            this.mRealTimeLinkDataBuffer.add((T) njkVar);
        }
        if ((njy.b(this.mRealTimeLinkDataBuffer) && checkOverInvalidTime(njkVar.acquireTime(), ((njk) this.mRealTimeLinkDataBuffer.get(this.mRealTimeLinkDataBuffer.size() - 1)).acquireTime())) || this.mCurrentIndex == 5) {
            e();
        }
    }

    private void e() {
        if (njy.e(this.mRealTimeLinkDataBuffer)) {
            LogUtil.j("Track_SlopeLinkageDataManager", "mRealTimeLinkDataBuffer is empty");
            return;
        }
        this.mCurrentIndex = 0;
        int iA = a(this.mRealTimeLinkDataBuffer);
        this.mRealTimeLinkDataBuffer.clear();
        if (iA == -101) {
            LogUtil.j("Track_SlopeLinkageDataManager", "mRealTimeLinkDataBuffer is error");
            return;
        }
        if (iA < this.f10454c) {
            this.f10454c = iA;
        }
        if (iA > this.e) {
            this.e = iA;
        }
        this.f10452a += iA;
        this.f10453b++;
        SharedPreferenceManager.d(SP_MODULE_ID, "save_max_slope", this.e);
        SharedPreferenceManager.d(SP_MODULE_ID, "save_min_slope", this.f10454c);
        SharedPreferenceManager.d(SP_MODULE_ID, "save_sum_slope", this.f10452a);
        SharedPreferenceManager.d(SP_MODULE_ID, "save_count_slope", this.f10453b);
    }

    private int a(List<njk> list) {
        if (njy.e(list)) {
            LogUtil.j("Track_SlopeLinkageDataManager", "slopeDataList is empty");
            return -101;
        }
        int i = 0;
        int iE = 0;
        for (njk njkVar : list) {
            if (njkVar != null) {
                iE += njkVar.e();
                i++;
            }
        }
        if (i == 0) {
            LogUtil.j("Track_SlopeLinkageDataManager", "slopeDataList is all null");
            return -101;
        }
        return (int) Math.round(((double) iE) / ((double) i));
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    public void recoverLinkData(MotionData motionData) {
        super.recoverLinkData(motionData);
        this.e = SharedPreferenceManager.c(SP_MODULE_ID, "save_max_slope", -101);
        this.f10454c = SharedPreferenceManager.c(SP_MODULE_ID, "save_min_slope", 101);
        this.f10452a = SharedPreferenceManager.c(SP_MODULE_ID, "save_sum_slope", 0);
        this.f10453b = SharedPreferenceManager.c(SP_MODULE_ID, "save_count_slope", 0);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    public void clearCache() {
        super.clearCache();
        SharedPreferenceManager.b(SP_MODULE_ID, "save_max_slope");
        SharedPreferenceManager.b(SP_MODULE_ID, "save_min_slope");
        SharedPreferenceManager.b(SP_MODULE_ID, "save_sum_slope");
        SharedPreferenceManager.b(SP_MODULE_ID, "save_count_slope");
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    public void saveDataToSimplify(MotionPathSimplify motionPathSimplify) {
        int i;
        if (motionPathSimplify == null) {
            LogUtil.j("Track_SlopeLinkageDataManager", "saveDataToSimplify simplifyData is null");
            return;
        }
        int i2 = this.f10453b;
        if (i2 == 0) {
            LogUtil.a("Track_SlopeLinkageDataManager", "saveDataToSimplify no slope data");
            return;
        }
        motionPathSimplify.addExtendDataMap("avgSlope", String.valueOf(Math.round(this.f10452a / i2) * 10));
        int i3 = this.e;
        if (i3 >= 101 || (i = this.f10454c) <= -101 || i3 < i) {
            LogUtil.e("Track_SlopeLinkageDataManager", "slope data anomaly");
        } else {
            motionPathSimplify.addExtendDataMap("maxSlope", String.valueOf(i3 * 10));
            motionPathSimplify.addExtendDataMap("minSlope", String.valueOf(this.f10454c * 10));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected void putLatestLinkData(Bundle bundle) {
        if (bundle == null) {
            LogUtil.e("Track_SlopeLinkageDataManager", "sportData is null");
            return;
        }
        if (this.mLastUpdateTime != 0 && checkOverInvalidTime(System.currentTimeMillis(), this.mLastUpdateTime)) {
            this.d = Integer.MIN_VALUE;
        }
        int i = this.d;
        if (i != Integer.MIN_VALUE) {
            bundle.putInt("slope", i);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected CopyOnWriteArrayList<njk> recoverRealTimeData(String str) {
        return (CopyOnWriteArrayList) qqt.c(str, new TypeToken<CopyOnWriteArrayList<njk>>(this) { // from class: com.huawei.healthcloud.plugintrack.manager.SlopeLinkageDataManager.1
        }.getType());
    }
}
