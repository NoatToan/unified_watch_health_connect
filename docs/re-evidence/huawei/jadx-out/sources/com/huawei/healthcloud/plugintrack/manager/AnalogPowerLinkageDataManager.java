package com.huawei.healthcloud.plugintrack.manager;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.reflect.TypeToken;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsport.ftp.PowerZoneConfigHelper;
import defpackage.jpq;
import defpackage.jqm;
import defpackage.njb;
import defpackage.njy;
import defpackage.qqt;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class AnalogPowerLinkageDataManager extends LinkageDataManager<njb> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PowerZoneConfigHelper f10448c;
    private int e;

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected long getRefreshInterval() {
        return 1000L;
    }

    public AnalogPowerLinkageDataManager(Context context) {
        super(context);
        this.f10447b = Integer.MIN_VALUE;
        this.f10446a = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.f10448c = new PowerZoneConfigHelper(new PowerZoneConfigHelper.OnConfigHelperListener() { // from class: iwf
            @Override // com.huawei.pluginsport.ftp.PowerZoneConfigHelper.OnConfigHelperListener
            public final void onInitComplete(boolean z) {
                ReleaseLogUtil.d("Track_AnalogPowerLinkageDataManager", " PowerZoneConfig isSuccess: ", Boolean.valueOf(z));
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected String getTAG() {
        return "Track_AnalogPowerLinkageDataManager";
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected List<Integer> getDataType() {
        return Arrays.asList(27, 32, 30);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected String getSpKey() {
        return "saved_temp_analog_power";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public njb convertLinkData(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
        if (hiHealthData == null) {
            LogUtil.e("Track_AnalogPowerLinkageDataManager", "onChange HiHealthData is null!");
            return null;
        }
        LogUtil.d("Track_AnalogPowerLinkageDataManager", "change type is ", Integer.valueOf(i), " value is ", Integer.valueOf(hiHealthData.getIntValue()));
        if (i == 32) {
            this.e = hiHealthData.getIntValue();
            return null;
        }
        if (i == 30) {
            this.f10446a = hiHealthData.getIntValue();
            return null;
        }
        return new njb(hiHealthData.getStartTime(), hiHealthData.getIntValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void updateLinkData(njb njbVar) {
        if (njbVar == null) {
            LogUtil.e("Track_AnalogPowerLinkageDataManager", "analogPowerData is null");
            return;
        }
        this.mLastUpdateTime = njbVar.acquireTime();
        if (njbVar.a() >= 0) {
            this.mCurrentIndex++;
            this.f10447b = njbVar.a();
            this.mRealTimeLinkDataBuffer.add((T) njbVar);
        }
        if ((njy.b(this.mRealTimeLinkDataBuffer) && checkOverInvalidTime(njbVar.acquireTime(), ((njb) this.mRealTimeLinkDataBuffer.get(this.mRealTimeLinkDataBuffer.size() - 1)).acquireTime())) || this.mCurrentIndex == 5) {
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void b() {
        if (njy.e(this.mRealTimeLinkDataBuffer)) {
            LogUtil.j("Track_AnalogPowerLinkageDataManager", "mRealTimeLinkDataBuffer is empty");
            return;
        }
        this.mCurrentIndex = 0;
        int iB = jpq.b(this.mRealTimeLinkDataBuffer);
        njb njbVar = new njb();
        njbVar.b(iB);
        njbVar.b(((njb) this.mRealTimeLinkDataBuffer.get(0)).acquireTime());
        this.mRealTimeLinkDataBuffer.clear();
        if (!this.mTempPointDataBuffer.contains(njbVar)) {
            this.mTempPointDataBuffer.add((T) njbVar);
        }
        if (this.mPointDataBuffer.contains(njbVar)) {
            return;
        }
        this.mPointDataBuffer.add((T) njbVar);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    public void saveLinkDataToMotionPath(MotionPath motionPath, boolean z, boolean z2) {
        if (motionPath == null) {
            LogUtil.j("Track_AnalogPowerLinkageDataManager", "motionPath is null");
            return;
        }
        if (z) {
            List<njb> listRequestAnalogPowerList = motionPath.requestAnalogPowerList();
            if (listRequestAnalogPowerList == null) {
                listRequestAnalogPowerList = new ArrayList<>();
            }
            listRequestAnalogPowerList.addAll(getCacheLinkDataList(z2));
            return;
        }
        motionPath.saveAnalogPowerList(getCacheLinkDataList(z2));
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    public void saveDataToSimplify(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.j("Track_AnalogPowerLinkageDataManager", "saveDataToSimplify simplifyData is null");
            return;
        }
        int iB = jpq.b((List<njb>) this.mPointDataBuffer);
        if (iB > 0) {
            motionPathSimplify.addExtendDataMap("avgAnalogPower", String.valueOf(iB));
        }
        jqm.d(this.mPointDataBuffer, this.f10448c, motionPathSimplify, false);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected void putLatestLinkData(Bundle bundle) {
        if (bundle == null) {
            LogUtil.e("Track_AnalogPowerLinkageDataManager", "sportData is null");
            return;
        }
        if (this.mLastUpdateTime != 0 && checkOverInvalidTime(System.currentTimeMillis(), this.mLastUpdateTime)) {
            this.f10447b = Integer.MIN_VALUE;
            this.f10446a = Integer.MIN_VALUE;
        }
        int i = this.f10447b;
        if (i != Integer.MIN_VALUE) {
            bundle.putInt(HwExerciseConstants.EXTEND_CYCLE_ANALOG_POWER, i);
        }
        int i2 = this.f10446a;
        if (i2 != Integer.MIN_VALUE) {
            bundle.putInt("threeSecAnalogPower", i2);
        }
        int i3 = this.e;
        if (i3 != Integer.MIN_VALUE) {
            bundle.putInt("avgAnalogPower", i3);
            return;
        }
        int iB = jpq.b((List<njb>) this.mRealTimeLinkDataBuffer);
        if (iB != 0) {
            bundle.putInt("avgAnalogPower", iB);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected CopyOnWriteArrayList<njb> recoverRealTimeData(String str) {
        return (CopyOnWriteArrayList) qqt.c(str, new TypeToken<CopyOnWriteArrayList<njb>>(this) { // from class: com.huawei.healthcloud.plugintrack.manager.AnalogPowerLinkageDataManager.1
        }.getType());
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected List<njb> recoverPointData(MotionData motionData) {
        return motionData.getAnalogPowerList();
    }
}
