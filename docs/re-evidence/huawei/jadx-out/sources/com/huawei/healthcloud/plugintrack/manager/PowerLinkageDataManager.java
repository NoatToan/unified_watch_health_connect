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
import com.huawei.pluginsport.ftp.PowerZoneConfigHelper;
import defpackage.jpq;
import defpackage.jqm;
import defpackage.njh;
import defpackage.njy;
import defpackage.qqt;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class PowerLinkageDataManager extends LinkageDataManager<njh> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10451c;
    private final PowerZoneConfigHelper d;
    private int e;

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    public long getRefreshInterval() {
        return 1000L;
    }

    public PowerLinkageDataManager(Context context) {
        super(context);
        this.e = Integer.MIN_VALUE;
        this.f10451c = Integer.MIN_VALUE;
        this.f10450b = Integer.MIN_VALUE;
        this.d = new PowerZoneConfigHelper(new PowerZoneConfigHelper.OnConfigHelperListener() { // from class: iww
            @Override // com.huawei.pluginsport.ftp.PowerZoneConfigHelper.OnConfigHelperListener
            public final void onInitComplete(boolean z) {
                ReleaseLogUtil.d("Track_PowerLinkageDataManager", " PowerZoneConfig isSuccess: ", Boolean.valueOf(z));
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    public String getTAG() {
        return "Track_PowerLinkageDataManager";
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    public List<Integer> getDataType() {
        return Arrays.asList(26, 31, 29);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected String getSpKey() {
        return "saved_temp_power";
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public njh convertLinkData(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
        if (hiHealthData == null) {
            LogUtil.e("Track_PowerLinkageDataManager", "convertLinkData HiHealthData is null!");
            return null;
        }
        LogUtil.d("Track_PowerLinkageDataManager", "change type is ", Integer.valueOf(i), " value is ", Integer.valueOf(hiHealthData.getIntValue()));
        if (i == 31) {
            this.f10450b = hiHealthData.getIntValue();
            return null;
        }
        if (i == 29) {
            this.f10451c = hiHealthData.getIntValue();
            return null;
        }
        return new njh(hiHealthData.getStartTime(), hiHealthData.getIntValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void updateLinkData(njh njhVar) {
        if (njhVar == null) {
            LogUtil.e("Track_PowerLinkageDataManager", "power data is null");
            return;
        }
        this.mLastUpdateTime = njhVar.acquireTime();
        if (njhVar.e() >= 0) {
            this.mCurrentIndex++;
            this.e = njhVar.e();
            this.mRealTimeLinkDataBuffer.add((T) njhVar);
        }
        if ((njy.b(this.mRealTimeLinkDataBuffer) && checkOverInvalidTime(njhVar.acquireTime(), ((njh) this.mRealTimeLinkDataBuffer.get(this.mRealTimeLinkDataBuffer.size() - 1)).acquireTime())) || this.mCurrentIndex == 5) {
            a();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    public void saveLinkDataToMotionPath(MotionPath motionPath, boolean z, boolean z2) {
        if (motionPath == null) {
            return;
        }
        if (z) {
            List<njh> listRequestPowerList = motionPath.requestPowerList();
            if (listRequestPowerList == null) {
                listRequestPowerList = new ArrayList<>();
            }
            listRequestPowerList.addAll(getCacheLinkDataList(z2));
            return;
        }
        motionPath.savePowerList(getCacheLinkDataList(z2));
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    public void saveDataToSimplify(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.j("Track_PowerLinkageDataManager", "saveDataToSimplify simplifyData is null");
            return;
        }
        int iA = jpq.a((List<njh>) this.mPointDataBuffer);
        if (iA > 0) {
            motionPathSimplify.addExtendDataMap("avgPower", String.valueOf(iA));
        }
        jqm.d(this.mPointDataBuffer, this.d, motionPathSimplify, true);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected void putLatestLinkData(Bundle bundle) {
        if (bundle == null) {
            LogUtil.e("Track_PowerLinkageDataManager", "sportData is null");
            return;
        }
        if (this.mLastUpdateTime != 0 && checkOverInvalidTime(System.currentTimeMillis(), this.mLastUpdateTime)) {
            this.e = Integer.MIN_VALUE;
            this.f10451c = Integer.MIN_VALUE;
        }
        int i = this.e;
        if (i != Integer.MIN_VALUE) {
            bundle.putInt("power", i);
        }
        int i2 = this.f10451c;
        if (i2 != Integer.MIN_VALUE) {
            bundle.putInt("threeSecPower", i2);
        }
        int i3 = this.f10450b;
        if (i3 != Integer.MIN_VALUE) {
            bundle.putInt("avgPower", i3);
            return;
        }
        int iA = jpq.a((List<njh>) this.mRealTimeLinkDataBuffer);
        if (iA != 0) {
            bundle.putInt("avgPower", iA);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected CopyOnWriteArrayList<njh> recoverRealTimeData(String str) {
        return (CopyOnWriteArrayList) qqt.c(str, new TypeToken<CopyOnWriteArrayList<njh>>(this) { // from class: com.huawei.healthcloud.plugintrack.manager.PowerLinkageDataManager.1
        }.getType());
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected List<njh> recoverPointData(MotionData motionData) {
        return motionData.getPowerList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void a() {
        if (njy.e(this.mRealTimeLinkDataBuffer)) {
            LogUtil.j("Track_PowerLinkageDataManager", "mRealTimeLinkDataBuffer is empty");
            return;
        }
        this.mCurrentIndex = 0;
        int iA = jpq.a(this.mRealTimeLinkDataBuffer);
        njh njhVar = new njh();
        njhVar.b(iA);
        njhVar.b(((njh) this.mRealTimeLinkDataBuffer.get(0)).acquireTime());
        this.mRealTimeLinkDataBuffer.clear();
        if (!this.mTempPointDataBuffer.contains(njhVar)) {
            this.mTempPointDataBuffer.add((T) njhVar);
        }
        if (this.mPointDataBuffer.contains(njhVar)) {
            return;
        }
        this.mPointDataBuffer.add((T) njhVar);
    }
}
