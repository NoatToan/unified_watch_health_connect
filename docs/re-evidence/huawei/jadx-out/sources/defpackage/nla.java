package defpackage;

import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateZoneMgr;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwcommonmodel.fitnessdatatype.StudentHeartRateZoneMgr;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import java.util.List;

/* JADX INFO: loaded from: classes38.dex */
@ApiDefine(uri = HealthDataMgrApi.class)
@Singleton
public class nla implements HealthDataMgrApi {
    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public void getLastVo2max(IBaseResponseCallback iBaseResponseCallback) {
        nkb.d().e(iBaseResponseCallback);
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public void requestTrackSimplifyData(long j, long j2, int i, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        nkx.e().c(j, j2, i, z, iBaseResponseCallback);
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public void requestTotalSportTimes(long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        nkx.e().b(j, j2, i, iBaseResponseCallback);
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public HeartZoneConf getHeartZoneConf() {
        return nkb.d().j();
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public void getCoreSleepDetail(long j, int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        nkb.d().c(j, i, i2, i3, iBaseResponseCallback);
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public void getTodayFitnessTotalData(IBaseResponseCallback iBaseResponseCallback) {
        nkb.d().a(iBaseResponseCallback);
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public HeartRateZoneMgr getHeartRateZoneMgr() {
        return nkd.c().a();
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public HeartRateZoneMgr getHeartRateZoneMgrByCache() {
        return nkd.c().d();
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public HeartZoneConf getHeartZoneConfForBluetoothSend() {
        return nkb.d().i();
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public void getLastVo2maxForMaxMet(IBaseResponseCallback iBaseResponseCallback) {
        nkg.e().b(iBaseResponseCallback);
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public StudentHeartRateZoneMgr getStudentHeartRateData() {
        return nkd.c().b().b();
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public int getStudentAge() {
        return nkd.c().b().c();
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public void resetHeartZoneData() throws Throwable {
        nkd.c().b().a(nkd.c().b().c());
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public void getUserPressureAdjustDatas(IBaseResponseCallback iBaseResponseCallback) {
        nkp.a().b(iBaseResponseCallback);
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public void setStressData(String str, List<HiStressMetaData> list, IBaseResponseCallback iBaseResponseCallback) {
        nkp.a().b(str, list, iBaseResponseCallback);
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public void requestTrackSimplifyData(long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        nkb.d().c(j, j2, i, iBaseResponseCallback);
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public String convertHiDataToTrackData(HiHealthData hiHealthData, MotionPathSimplify motionPathSimplify) {
        return nlt.c(hiHealthData, motionPathSimplify);
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public void requestTrackDetailData(long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        jxh.d(j, j2, false, iBaseResponseCallback);
    }

    @Override // com.huawei.health.healthdatamgr.api.HealthDataMgrApi
    public void getGolfStartTimeList(long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        jxh.b(j, j2, iBaseResponseCallback);
    }
}
