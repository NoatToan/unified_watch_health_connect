package com.huawei.healthcloud.plugintrack.manager;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.reflect.TypeToken;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jpq;
import defpackage.jxk;
import defpackage.njc;
import defpackage.njy;
import defpackage.qqt;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class AnalogCadenceManager extends LinkageDataManager<njc> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10445a;
    private int d;

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected long getRefreshInterval() {
        return 1000L;
    }

    public AnalogCadenceManager(Context context) {
        super(context);
        this.f10445a = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected String getTAG() {
        return "Track_AnalogCadenceManager";
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected List<Integer> getDataType() {
        return Arrays.asList(33, 35);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected String getSpKey() {
        return "saved_temp_analog_cadence";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public njc convertLinkData(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
        if (((Boolean) jxk.f39162a.second).booleanValue()) {
            unregisterLinkageData();
            ReleaseLogUtil.d("Track_AnalogCadenceManager", "has Cadence, unregister Analog");
            return null;
        }
        if (hiHealthData == null) {
            LogUtil.e("Track_AnalogCadenceManager", "onChange HiHealthData is null!");
            return null;
        }
        LogUtil.d("Track_AnalogCadenceManager", "change type is ", Integer.valueOf(i), " value is ", Integer.valueOf(hiHealthData.getIntValue()));
        if (i == 35) {
            this.d = hiHealthData.getIntValue();
            return null;
        }
        return new njc(hiHealthData.getStartTime(), hiHealthData.getIntValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void updateLinkData(njc njcVar) {
        if (njcVar == null) {
            LogUtil.e("Track_AnalogCadenceManager", "analogPowerData is null");
            return;
        }
        this.mLastUpdateTime = njcVar.acquireTime();
        LogUtil.a("Track_AnalogCadenceManager", "mLastUpdateTime is ", DateFormatUtil.d(this.mLastUpdateTime, DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE_SEC));
        if (njcVar.a() >= 0) {
            this.mCurrentIndex++;
            this.f10445a = njcVar.a();
            this.mRealTimeLinkDataBuffer.add((T) njcVar);
        }
        if ((njy.b(this.mRealTimeLinkDataBuffer) && checkOverInvalidTime(njcVar.acquireTime(), ((njc) this.mRealTimeLinkDataBuffer.get(this.mRealTimeLinkDataBuffer.size() - 1)).acquireTime())) || this.mCurrentIndex == 5) {
            a();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    public void saveLinkDataToMotionPath(MotionPath motionPath, boolean z, boolean z2) {
        if (motionPath == null) {
            LogUtil.j("Track_AnalogCadenceManager", "motionPath is null");
            return;
        }
        if (z) {
            List<njc> listRequestAnalogCadenceList = motionPath.requestAnalogCadenceList();
            if (listRequestAnalogCadenceList == null) {
                listRequestAnalogCadenceList = new ArrayList<>();
            }
            listRequestAnalogCadenceList.addAll(getCacheLinkDataList(z2));
            return;
        }
        motionPath.saveAnalogCadenceList(getCacheLinkDataList(z2));
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    public void saveDataToSimplify(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.j("Track_AnalogCadenceManager", "saveDataToSimplify simplifyData is null");
            return;
        }
        int iE = jpq.e((List<njc>) this.mPointDataBuffer);
        if (iE > 0) {
            motionPathSimplify.addExtendDataMap("avgAnalogCadence", String.valueOf(iE));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected void putLatestLinkData(Bundle bundle) {
        if (bundle == null) {
            LogUtil.e("Track_AnalogCadenceManager", "sportData is null");
            return;
        }
        if (this.mLastUpdateTime != 0 && checkOverInvalidTime(System.currentTimeMillis(), this.mLastUpdateTime)) {
            this.f10445a = Integer.MIN_VALUE;
        }
        int i = this.f10445a;
        if (i != Integer.MIN_VALUE) {
            bundle.putInt(HwExerciseConstants.EXTEND_CYCLE_ANALOG_CADENCE, i);
        }
        int i2 = this.d;
        if (i2 != Integer.MIN_VALUE) {
            bundle.putInt("avgAnalogCadence", i2);
            return;
        }
        int iE = jpq.e((List<njc>) this.mRealTimeLinkDataBuffer);
        if (iE != 0) {
            bundle.putInt("avgAnalogCadence", iE);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected CopyOnWriteArrayList<njc> recoverRealTimeData(String str) {
        return (CopyOnWriteArrayList) qqt.c(str, new TypeToken<CopyOnWriteArrayList<njc>>(this) { // from class: com.huawei.healthcloud.plugintrack.manager.AnalogCadenceManager.1
        }.getType());
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.LinkageDataManager
    protected List<njc> recoverPointData(MotionData motionData) {
        return motionData.getAnalogCadenceList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void a() {
        if (njy.e(this.mRealTimeLinkDataBuffer)) {
            LogUtil.j("Track_AnalogCadenceManager", "mRealTimeLinkDataBuffer is empty");
            return;
        }
        this.mCurrentIndex = 0;
        int iE = jpq.e(this.mRealTimeLinkDataBuffer);
        njc njcVar = new njc();
        njcVar.c(iE);
        njcVar.e(((njc) this.mRealTimeLinkDataBuffer.get(0)).acquireTime());
        this.mRealTimeLinkDataBuffer.clear();
        if (!this.mTempPointDataBuffer.contains(njcVar)) {
            this.mTempPointDataBuffer.add((T) njcVar);
        }
        if (this.mPointDataBuffer.contains(njcVar)) {
            return;
        }
        this.mPointDataBuffer.add((T) njcVar);
    }
}
