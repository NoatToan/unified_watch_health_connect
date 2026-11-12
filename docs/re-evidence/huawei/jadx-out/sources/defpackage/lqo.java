package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudGzipFactory;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddHealthDataReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddHealthStatReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddMotionPathReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddSportDataReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddSportTotalReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.BindDeviceReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.DeleteDataByTimeReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.DeleteHealthDataReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.DeleteHealthStatReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.DeleteMotionPathReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.DeleteSampleSequenceRep;
import com.huawei.hwcloudmodel.healthdatacloud.model.DeleteSampleSequenceRsq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetBindDeviceReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByReversedOrderReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByReversedOrderRsp;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByTimeReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByVersionReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataLatestReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataLatestRsp;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthStatReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetMotionPathByVersionReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSleepSportsDataLatestReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSleepSportsDataLatestRsp;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSportDataByTimeReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSportDataByVersionReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSportDimenStatisticsReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSportStatReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetSyncVersionsReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.UnbindDeviceRequest;
import com.huawei.hwcloudmodel.healthdatacloud.model.UpdateBindDeviceReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.WechatDeviceRegistReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.WechatDeviceSignReq;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.CloudCommonRequest;
import com.huawei.hwcloudmodel.model.ThirdOauthTokenI;
import com.huawei.hwcloudmodel.model.ThirdOauthTokenO;
import com.huawei.hwcloudmodel.model.ecgservice.EcgGiftCardRequest;
import com.huawei.hwcloudmodel.model.ecgservice.EcgGiftCardResponse;
import com.huawei.hwcloudmodel.model.ecgservice.EcgIvActivationRequest;
import com.huawei.hwcloudmodel.model.ecgservice.EcgServiceActivationData;
import com.huawei.hwcloudmodel.model.intelligent.DeviceLinkResultNotifyRequest;
import com.huawei.hwcloudmodel.model.intelligent.DeviceLinkResultNotifyResponse;
import com.huawei.hwcloudmodel.model.intelligent.ReleaseDeviceLinkageRequest;
import com.huawei.hwcloudmodel.model.intelligent.ReleaseDeviceLinkageResponse;
import com.huawei.hwcloudmodel.model.intelligent.StartDeviceLinkageRequest;
import com.huawei.hwcloudmodel.model.intelligent.StartDeviceLinkageResponse;
import com.huawei.hwcloudmodel.model.intelligent.StopDeviceLinkageRequest;
import com.huawei.hwcloudmodel.model.intelligent.StopDeviceLinkageResponse;
import com.huawei.hwcloudmodel.model.intelligent.TransferDeviceDataRequest;
import com.huawei.hwcloudmodel.model.intelligent.TransferDeviceDataResponse;
import com.huawei.hwcloudmodel.model.unite.AddEvaluationResultReq;
import com.huawei.hwcloudmodel.model.unite.AddHealthDataRsp;
import com.huawei.hwcloudmodel.model.unite.AddHealthStatRsp;
import com.huawei.hwcloudmodel.model.unite.AddMotionPathRsp;
import com.huawei.hwcloudmodel.model.unite.AddSportDataRsp;
import com.huawei.hwcloudmodel.model.unite.AddSportTotalRsp;
import com.huawei.hwcloudmodel.model.unite.DelEvaluationResultReq;
import com.huawei.hwcloudmodel.model.unite.DelHealthDataRsp;
import com.huawei.hwcloudmodel.model.unite.DeleteHealthStatRsp;
import com.huawei.hwcloudmodel.model.unite.DeleteMotionPathRsp;
import com.huawei.hwcloudmodel.model.unite.DevInfo;
import com.huawei.hwcloudmodel.model.unite.DeviceDetailInfo;
import com.huawei.hwcloudmodel.model.unite.GetEvaluationResultReq;
import com.huawei.hwcloudmodel.model.unite.GetHealthDataByTimeRsp;
import com.huawei.hwcloudmodel.model.unite.GetHealthDataByVersionRsp;
import com.huawei.hwcloudmodel.model.unite.GetHealthStatRsp;
import com.huawei.hwcloudmodel.model.unite.GetLacticStatisticsReq;
import com.huawei.hwcloudmodel.model.unite.GetLacticStatisticsRsp;
import com.huawei.hwcloudmodel.model.unite.GetLatestLacticReq;
import com.huawei.hwcloudmodel.model.unite.GetLatestLacticRsp;
import com.huawei.hwcloudmodel.model.unite.GetLoadPeakReq;
import com.huawei.hwcloudmodel.model.unite.GetLoadPeakRsp;
import com.huawei.hwcloudmodel.model.unite.GetMotionPathByVersionRsp;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelReq;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelRsp;
import com.huawei.hwcloudmodel.model.unite.GetSportDataByTimeRsp;
import com.huawei.hwcloudmodel.model.unite.GetSportDataByVersionRsp;
import com.huawei.hwcloudmodel.model.unite.GetSportDimenStatRsp;
import com.huawei.hwcloudmodel.model.unite.GetSportStatRsp;
import com.huawei.hwcloudmodel.model.unite.GetSyncVersionsRsp;
import com.huawei.hwcloudmodel.model.unite.PushMessageToDeviceReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceAddAuthMsgBySubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceAddAuthorizeForSubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceAuthorizeByMainUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceControlDataModelReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceDeleteAuthorizeSubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceExitAuthorizeSubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAllDeviceRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAuthorizeSubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAuthorizeSubUserRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetDeviceRegistration;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetDeviceStatusReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetDeviceStatusRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetMainUserAuth;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetSubUserAuthMsgReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetVerifyCodeForMainUserRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceShareByMainUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceShareMemberInfoBySubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceSubuserAuthorize;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceUnbindReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceUpdateAuthorizeSubUserReq;
import com.huawei.hwcloudmodel.model.userprofile.AddPrivacyRecordReq;
import com.huawei.hwcloudmodel.model.userprofile.AddPrivacyRecordRsp;
import com.huawei.hwcloudmodel.model.userprofile.BindDeviceRsp;
import com.huawei.hwcloudmodel.model.userprofile.DeleteAccountCheckReq;
import com.huawei.hwcloudmodel.model.userprofile.DeleteAccountCheckRsp;
import com.huawei.hwcloudmodel.model.userprofile.DeleteAllUserProfileReq;
import com.huawei.hwcloudmodel.model.userprofile.DeleteAllUserProfileRsp;
import com.huawei.hwcloudmodel.model.userprofile.GetBindDeviceRsp;
import com.huawei.hwcloudmodel.model.userprofile.GetPrivacyRecordReq;
import com.huawei.hwcloudmodel.model.userprofile.GetPrivacyRecordRsp;
import com.huawei.hwcloudmodel.model.userprofile.GetUserMergeInfoReq;
import com.huawei.hwcloudmodel.model.userprofile.GetUserMergeInfoRsp;
import com.huawei.hwcloudmodel.model.userprofile.GetUserProfileReq;
import com.huawei.hwcloudmodel.model.userprofile.GetUserProfileRsp;
import com.huawei.hwcloudmodel.model.userprofile.LastClearCloudDataTimeReq;
import com.huawei.hwcloudmodel.model.userprofile.LastClearCloudDataTimeRsp;
import com.huawei.hwcloudmodel.model.userprofile.MergeUserAllDataReq;
import com.huawei.hwcloudmodel.model.userprofile.MergeUserAllDataRsp;
import com.huawei.hwcloudmodel.model.userprofile.SetUserProfileReq;
import com.huawei.hwcloudmodel.model.userprofile.SetUserProfileRsp;
import com.huawei.hwcloudmodel.model.userprofile.UpdateBindDeviceRsp;
import com.huawei.hwcloudmodel.model.wjx.SurveyIdRequest;
import com.huawei.hwcloudmodel.model.wjx.SurveyIdResponse;
import com.huawei.hwcloudmodel.utils.GetEvaluationResultRsp;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class lqo extends HwBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f40633a = new ArrayList<String>() { // from class: lqo.1
        {
            add("007B");
            add("M00F");
            add("M00D");
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static lqo f40634c = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private lqs f40635b;
    private HealthDataCloudFactory d;

    private lqo(Context context) {
        super(context);
        this.f40635b = null;
        this.f40635b = lqs.d();
        this.d = new HealthDataCloudGzipFactory(BaseApplication.b());
    }

    public HealthDataCloudFactory b() {
        return this.d;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 1002;
    }

    public static lqo b(Context context) {
        if (f40634c == null) {
            f40634c = new lqo(BaseApplication.b());
        }
        return f40634c;
    }

    public CloudCommonReponse d(UnbindDeviceRequest unbindDeviceRequest) {
        return (CloudCommonReponse) oet.d().e(unbindDeviceRequest.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(unbindDeviceRequest)), CloudCommonReponse.class);
    }

    public void e(MergeUserAllDataReq mergeUserAllDataReq, ICloudOperationResult<MergeUserAllDataRsp> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.a(mergeUserAllDataReq, iCloudOperationResult);
        }
    }

    public void d(GetUserMergeInfoReq getUserMergeInfoReq, ICloudOperationResult<GetUserMergeInfoRsp> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.b(getUserMergeInfoReq, iCloudOperationResult);
        }
    }

    public AddHealthStatRsp c(AddHealthStatReq addHealthStatReq) {
        return (AddHealthStatRsp) oet.d().e(addHealthStatReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(addHealthStatReq)), AddHealthStatRsp.class);
    }

    public GetHealthStatRsp a(GetHealthStatReq getHealthStatReq) {
        return (GetHealthStatRsp) oet.d().e(getHealthStatReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getHealthStatReq)), GetHealthStatRsp.class);
    }

    public BindDeviceRsp b(BindDeviceReq bindDeviceReq) {
        String str = this.d.getHeaders().get("x-huid");
        String strValueOf = String.valueOf(this.d.getBody(bindDeviceReq).get("token"));
        if (TextUtils.isEmpty(str) || "0".equals(str) || TextUtils.isEmpty(strValueOf)) {
            LogUtil.e("HWCloudMgr", "wrong request params, dont request bindDevice");
            BindDeviceRsp bindDeviceRsp = new BindDeviceRsp();
            bindDeviceRsp.setResultCode(1);
            bindDeviceRsp.setResultDesc("wrong request params, dont request bindDevice");
            return bindDeviceRsp;
        }
        e(bindDeviceReq);
        return (BindDeviceRsp) oet.d().e(bindDeviceReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(bindDeviceReq)), BindDeviceRsp.class);
    }

    private void e(BindDeviceReq bindDeviceReq) {
        if (bindDeviceReq == null || !f40633a.contains(bindDeviceReq.getProdid())) {
            return;
        }
        final String[] strArr = {bindDeviceReq.getUniqueId()};
        if (TextUtils.isEmpty(strArr[0])) {
            return;
        }
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        d(new ICloudOperationResult<WifiDeviceGetAllDeviceRsp>() { // from class: lqo.3
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void operationResult(WifiDeviceGetAllDeviceRsp wifiDeviceGetAllDeviceRsp, String str, boolean z) {
                if (z) {
                    try {
                        List<DeviceDetailInfo> authorizedDeviceDetailInfoList = wifiDeviceGetAllDeviceRsp.getAuthorizedDeviceDetailInfoList();
                        if (!njy.e(authorizedDeviceDetailInfoList)) {
                            for (DeviceDetailInfo deviceDetailInfo : authorizedDeviceDetailInfoList) {
                                if (c(deviceDetailInfo, strArr[0])) {
                                    atomicReference.set(deviceDetailInfo.getDevId());
                                    break;
                                }
                            }
                        }
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            }

            private boolean c(DeviceDetailInfo deviceDetailInfo, String str) {
                DevInfo devInfo;
                if (deviceDetailInfo == null || (devInfo = deviceDetailInfo.getDevInfo()) == null) {
                    return false;
                }
                String sn = devInfo.getSn();
                if (TextUtils.isEmpty(sn)) {
                    return false;
                }
                return sn.contains(str);
            }
        });
        try {
            if (!countDownLatch.await(30L, TimeUnit.SECONDS)) {
                ReleaseLogUtil.d("R_HWCloudMgr", "checkAuthorizedDevice getUserAllWifiDevice timeOut");
            }
        } catch (InterruptedException unused) {
            LogUtil.a("HWCloudMgr", "checkAuthorizedDevice InterruptedException");
        }
        String str = (String) atomicReference.get();
        ReleaseLogUtil.d("R_HWCloudMgr", "checkAuthorizedDevice devId:", CommonUtil.n(str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bindDeviceReq.setDevId(str);
    }

    public GetBindDeviceRsp c(GetBindDeviceReq getBindDeviceReq) {
        return (GetBindDeviceRsp) oet.d().e(getBindDeviceReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getBindDeviceReq)), GetBindDeviceRsp.class);
    }

    public GetBindDeviceRsp a(GetBindDeviceReq getBindDeviceReq) {
        return (GetBindDeviceRsp) oet.d().e(getBindDeviceReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getBindDeviceReq)), GetBindDeviceRsp.class);
    }

    public UpdateBindDeviceRsp a(UpdateBindDeviceReq updateBindDeviceReq) {
        return (UpdateBindDeviceRsp) oet.d().e(updateBindDeviceReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(updateBindDeviceReq)), UpdateBindDeviceRsp.class);
    }

    public SetUserProfileRsp d(SetUserProfileReq setUserProfileReq) {
        return (SetUserProfileRsp) oet.d().e(setUserProfileReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(setUserProfileReq)), SetUserProfileRsp.class);
    }

    public CloudCommonReponse e(PushMessageToDeviceReq pushMessageToDeviceReq) {
        return (CloudCommonReponse) oet.d().e(pushMessageToDeviceReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(pushMessageToDeviceReq)), CloudCommonReponse.class);
    }

    public void c(GetRunLevelReq getRunLevelReq, ResultCallback<GetRunLevelRsp> resultCallback) {
        LogUtil.a("HWCloudMgr", "Enter getRunLevel ");
        if (getRunLevelReq == null || resultCallback == null) {
            LogUtil.j("HWCloudMgr", "Enter getRunLevel params error");
            return;
        }
        try {
            oet.d().c(getRunLevelReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getRunLevelReq)), GetRunLevelRsp.class, resultCallback);
        } catch (NullPointerException e) {
            LogUtil.e("HWCloudMgr", "getRunLevel Exception is ", ExceptionUtils.c(e));
        }
    }

    public void e(GetLoadPeakReq getLoadPeakReq, ResultCallback<GetLoadPeakRsp> resultCallback) {
        LogUtil.a("HWCloudMgr", "Enter getLoadPeakData ");
        if (getLoadPeakReq == null || resultCallback == null) {
            ReleaseLogUtil.a("HWCloudMgr", "Enter getLoadPeakData params error");
        } else {
            oet.d().c(getLoadPeakReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getLoadPeakReq)), GetLoadPeakRsp.class, resultCallback);
        }
    }

    public void c(GetLatestLacticReq getLatestLacticReq, ResultCallback<GetLatestLacticRsp> resultCallback) {
        LogUtil.a("HWCloudMgr", "Enter getLatestLacticData ");
        if (getLatestLacticReq == null || resultCallback == null) {
            ReleaseLogUtil.a("HWCloudMgr", "Enter getLatestLacticData params error");
        } else {
            oet.d().c(getLatestLacticReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getLatestLacticReq)), GetLatestLacticRsp.class, resultCallback);
        }
    }

    public void b(GetLacticStatisticsReq getLacticStatisticsReq, ResultCallback<GetLacticStatisticsRsp> resultCallback) {
        LogUtil.a("HWCloudMgr", "Enter getLacticStatisticsData ");
        if (getLacticStatisticsReq == null || resultCallback == null) {
            ReleaseLogUtil.a("HWCloudMgr", "Enter getLacticStatisticsData params error");
        } else {
            oet.d().c(getLacticStatisticsReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getLacticStatisticsReq)), GetLacticStatisticsRsp.class, resultCallback);
        }
    }

    public GetUserProfileRsp e(GetUserProfileReq getUserProfileReq) {
        return (GetUserProfileRsp) oet.d().e(getUserProfileReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getUserProfileReq)), GetUserProfileRsp.class);
    }

    public GetSyncVersionsRsp a(GetSyncVersionsReq getSyncVersionsReq) {
        return (GetSyncVersionsRsp) oet.d().e(getSyncVersionsReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getSyncVersionsReq)), GetSyncVersionsRsp.class);
    }

    public AddSportDataRsp a(AddSportDataReq addSportDataReq) {
        return (AddSportDataRsp) oet.d().e(addSportDataReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(addSportDataReq)), AddSportDataRsp.class);
    }

    public GetSportDataByTimeRsp b(GetSportDataByTimeReq getSportDataByTimeReq) {
        return (GetSportDataByTimeRsp) oet.d().e(getSportDataByTimeReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getSportDataByTimeReq)), GetSportDataByTimeRsp.class);
    }

    public GetSportDataByVersionRsp a(GetSportDataByVersionReq getSportDataByVersionReq) {
        return (GetSportDataByVersionRsp) oet.d().e(getSportDataByVersionReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getSportDataByVersionReq)), GetSportDataByVersionRsp.class);
    }

    public AddSportTotalRsp b(AddSportTotalReq addSportTotalReq) {
        return (AddSportTotalRsp) oet.d().e(addSportTotalReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(addSportTotalReq)), AddSportTotalRsp.class);
    }

    public GetSportStatRsp d(GetSportStatReq getSportStatReq) {
        return (GetSportStatRsp) oet.d().e(getSportStatReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getSportStatReq)), GetSportStatRsp.class);
    }

    public GetSportDimenStatRsp b(GetSportDimenStatisticsReq getSportDimenStatisticsReq) {
        return (GetSportDimenStatRsp) oet.d().e(getSportDimenStatisticsReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getSportDimenStatisticsReq)), GetSportDimenStatRsp.class);
    }

    public AddHealthDataRsp b(AddHealthDataReq addHealthDataReq) {
        return (AddHealthDataRsp) oet.d().e(addHealthDataReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(addHealthDataReq)), AddHealthDataRsp.class);
    }

    public GetHealthDataByTimeRsp a(GetHealthDataByTimeReq getHealthDataByTimeReq) {
        return (GetHealthDataByTimeRsp) oet.d().e(getHealthDataByTimeReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getHealthDataByTimeReq)), GetHealthDataByTimeRsp.class);
    }

    public GetHealthDataByVersionRsp b(GetHealthDataByVersionReq getHealthDataByVersionReq) {
        return (GetHealthDataByVersionRsp) oet.d().e(getHealthDataByVersionReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getHealthDataByVersionReq)), GetHealthDataByVersionRsp.class);
    }

    public GetHealthDataByReversedOrderRsp c(GetHealthDataByReversedOrderReq getHealthDataByReversedOrderReq) {
        return (GetHealthDataByReversedOrderRsp) oet.d().e(getHealthDataByReversedOrderReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getHealthDataByReversedOrderReq)), GetHealthDataByReversedOrderRsp.class);
    }

    public DelHealthDataRsp d(DeleteHealthDataReq deleteHealthDataReq) {
        return (DelHealthDataRsp) oet.d().e(deleteHealthDataReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(deleteHealthDataReq)), DelHealthDataRsp.class);
    }

    public DelHealthDataRsp c(DeleteDataByTimeReq deleteDataByTimeReq) {
        return (DelHealthDataRsp) oet.d().e(deleteDataByTimeReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(deleteDataByTimeReq)), DelHealthDataRsp.class);
    }

    public DeleteHealthStatRsp c(DeleteHealthStatReq deleteHealthStatReq) {
        return (DeleteHealthStatRsp) oet.d().e(deleteHealthStatReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(deleteHealthStatReq)), DeleteHealthStatRsp.class);
    }

    public AddMotionPathRsp e(AddMotionPathReq addMotionPathReq) {
        return (AddMotionPathRsp) oet.d().e(addMotionPathReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(addMotionPathReq)), AddMotionPathRsp.class);
    }

    public GetMotionPathByVersionRsp e(GetMotionPathByVersionReq getMotionPathByVersionReq) {
        return (GetMotionPathByVersionRsp) oet.d().e(getMotionPathByVersionReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getMotionPathByVersionReq)), GetMotionPathByVersionRsp.class);
    }

    public DeleteMotionPathRsp c(DeleteMotionPathReq deleteMotionPathReq) {
        return (DeleteMotionPathRsp) oet.d().e(deleteMotionPathReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(deleteMotionPathReq)), DeleteMotionPathRsp.class);
    }

    public void c(double d, double d2, ICloudOperationResult<lqp> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.e(d, d2, iCloudOperationResult);
        }
    }

    public void d(ThirdOauthTokenO thirdOauthTokenO, final ICloudOperationResult<ThirdOauthTokenI> iCloudOperationResult) {
        LogUtil.a("HWCloudMgr", "Enter getOauthAtWithCode = ", Integer.valueOf(thirdOauthTokenO.getThirdAccountType()));
        HashMap map = new HashMap();
        map.put("thirdAuthToken", thirdOauthTokenO);
        oet.d().c(GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataOpen/third/getAtWithCode", c(), ofe.c(this.d.getBody(map)), ThirdOauthTokenI.class, new ResultCallback<ThirdOauthTokenI>() { // from class: lqo.8
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ThirdOauthTokenI thirdOauthTokenI) {
                LogUtil.a("HWCloudMgr", "getOauthAtWithCode resultCode ", Integer.valueOf(thirdOauthTokenI.getResultCode()));
                iCloudOperationResult.operationResult(thirdOauthTokenI, thirdOauthTokenI.getResultDesc(), true);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HWCloudMgr", " getOauthAtWithRt exception :", th.getMessage());
                iCloudOperationResult.operationResult(null, th.getMessage(), false);
            }
        });
    }

    private Map<String, String> c() {
        Map<String, String> headers = this.d.getHeaders();
        headers.put("Content-Encoding", HealthEngineRequestManager.CONTENT_TYPE);
        return headers;
    }

    public void e(ThirdOauthTokenO thirdOauthTokenO, final ICloudOperationResult<ThirdOauthTokenI> iCloudOperationResult) {
        LogUtil.a("HWCloudMgr", "Enter getOauthAtWithRt = ", Integer.valueOf(thirdOauthTokenO.getThirdAccountType()));
        HashMap map = new HashMap();
        map.put("thirdAuthToken", thirdOauthTokenO);
        oet.d().c(GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataOpen/third/getAtWithRt", c(), ofe.c(this.d.getBody(map)), ThirdOauthTokenI.class, new ResultCallback<ThirdOauthTokenI>() { // from class: lqo.10
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ThirdOauthTokenI thirdOauthTokenI) {
                LogUtil.a("HWCloudMgr", "getOauthAtWithRt resultCode ", Integer.valueOf(thirdOauthTokenI.getResultCode()));
                iCloudOperationResult.operationResult(thirdOauthTokenI, thirdOauthTokenI.getResultDesc(), true);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HWCloudMgr", " getOauthAtWithRt exception :", th.getMessage());
                iCloudOperationResult.operationResult(null, th.getMessage(), false);
            }
        });
    }

    public void e(int i, final ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudMgr", "Enter cancelOauthAuthorization = ", Integer.valueOf(i));
        HashMap map = new HashMap();
        map.put("thirdAccountType", Integer.valueOf(i));
        oet.d().c(GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataOpen/third/cancelThirdAuthorization", c(), ofe.c(this.d.getBody(map)), CloudCommonReponse.class, new ResultCallback<CloudCommonReponse>() { // from class: lqo.9
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                LogUtil.a("HWCloudMgr", "cancelOauthAuthorization resultCode ", cloudCommonReponse.getResultCode());
                iCloudOperationResult.operationResult(cloudCommonReponse, cloudCommonReponse.getResultDesc(), true);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HWCloudMgr", " cancelOauthAuthorization exception :", th.getMessage());
                iCloudOperationResult.operationResult(null, th.getMessage(), false);
            }
        });
    }

    public void b(AddEvaluationResultReq addEvaluationResultReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.a(addEvaluationResultReq, iCloudOperationResult);
        }
    }

    public void b(GetEvaluationResultReq getEvaluationResultReq, ICloudOperationResult<GetEvaluationResultRsp> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.a(getEvaluationResultReq, iCloudOperationResult);
        }
    }

    public void e(DelEvaluationResultReq delEvaluationResultReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.b(delEvaluationResultReq, iCloudOperationResult);
        }
    }

    public SetUserProfileRsp a() {
        SetUserProfileReq setUserProfileReq = new SetUserProfileReq();
        return (SetUserProfileRsp) oet.d().e(setUserProfileReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(setUserProfileReq)), SetUserProfileRsp.class);
    }

    public void e(WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.e(wifiDeviceControlDataModelReq, iCloudOperationResult);
        }
    }

    public void e(WifiDeviceUnbindReq wifiDeviceUnbindReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.c(wifiDeviceUnbindReq, iCloudOperationResult);
        }
    }

    public void b(WifiDeviceGetWifiDeviceInfoReq wifiDeviceGetWifiDeviceInfoReq, ICloudOperationResult<WifiDeviceGetWifiDeviceInfoRsp> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.b(wifiDeviceGetWifiDeviceInfoReq, iCloudOperationResult);
        }
    }

    public void d(WifiDeviceServiceInfoReq wifiDeviceServiceInfoReq, ICloudOperationResult<WifiDeviceServiceInfoRsp> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.e(wifiDeviceServiceInfoReq, iCloudOperationResult);
        }
    }

    public void d(ICloudOperationResult<WifiDeviceGetAllDeviceRsp> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.e(iCloudOperationResult);
        }
    }

    public void c(WifiDeviceGetDeviceStatusReq wifiDeviceGetDeviceStatusReq, ICloudOperationResult<WifiDeviceGetDeviceStatusRsp> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.a(wifiDeviceGetDeviceStatusReq, iCloudOperationResult);
        }
    }

    public void b(WifiDeviceAddAuthorizeForSubUserReq wifiDeviceAddAuthorizeForSubUserReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.e(wifiDeviceAddAuthorizeForSubUserReq, iCloudOperationResult);
        }
    }

    public void b(WifiDeviceGetAuthorizeSubUserReq wifiDeviceGetAuthorizeSubUserReq, ICloudOperationResult<WifiDeviceGetAuthorizeSubUserRsp> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.b(wifiDeviceGetAuthorizeSubUserReq, iCloudOperationResult);
        }
    }

    public void e(WifiDeviceUpdateAuthorizeSubUserReq wifiDeviceUpdateAuthorizeSubUserReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.e(wifiDeviceUpdateAuthorizeSubUserReq, iCloudOperationResult);
        }
    }

    public void a(WifiDeviceDeleteAuthorizeSubUserReq wifiDeviceDeleteAuthorizeSubUserReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.d(wifiDeviceDeleteAuthorizeSubUserReq, iCloudOperationResult);
        }
    }

    public void b(WifiDeviceExitAuthorizeSubUserReq wifiDeviceExitAuthorizeSubUserReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.a(wifiDeviceExitAuthorizeSubUserReq, iCloudOperationResult);
        }
    }

    public void e(ICloudOperationResult<WifiDeviceGetVerifyCodeForMainUserRsp> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.d(iCloudOperationResult);
        }
    }

    public void e(WifiDeviceAddAuthMsgBySubUserReq wifiDeviceAddAuthMsgBySubUserReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.c(wifiDeviceAddAuthMsgBySubUserReq, iCloudOperationResult);
        }
    }

    public void b(WifiDeviceGetSubUserAuthMsgReq wifiDeviceGetSubUserAuthMsgReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.e(wifiDeviceGetSubUserAuthMsgReq, iCloudOperationResult);
        }
    }

    public void b(WifiDeviceAuthorizeByMainUserReq wifiDeviceAuthorizeByMainUserReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.d(wifiDeviceAuthorizeByMainUserReq, iCloudOperationResult);
        }
    }

    public void e(StartDeviceLinkageRequest startDeviceLinkageRequest, final ICloudOperationResult<StartDeviceLinkageResponse> iCloudOperationResult) {
        LogUtil.a("HWCloudMgr", "Enter startDeviceLinkage");
        Map<String, Object> mapA = ofe.a(startDeviceLinkageRequest);
        String strD = d();
        if (strD == null) {
            iCloudOperationResult.operationResult(null, "unknown url", false);
            return;
        }
        String str = strD + "/deviceAgent/startDeviceLinkage";
        LogUtil.a("HWCloudMgr", "startDeviceLinkage url:", str);
        oet.d().c(str, this.d.getHeaders(), ofe.c(this.d.getBody(mapA)), StartDeviceLinkageResponse.class, new ResultCallback<StartDeviceLinkageResponse>() { // from class: lqo.7
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(StartDeviceLinkageResponse startDeviceLinkageResponse) {
                LogUtil.a("HWCloudMgr", "StartDeviceLinkageResponse resultCode ", startDeviceLinkageResponse.getResultCode());
                iCloudOperationResult.operationResult(startDeviceLinkageResponse, startDeviceLinkageResponse.getResultDesc(), true);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HWCloudMgr", " StartDeviceLinkageResponse exception :", th.getMessage());
                iCloudOperationResult.operationResult(null, th.getMessage(), false);
            }
        });
    }

    private String d() {
        String strE;
        return (CommonUtil.ap() && (strE = SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(10008), "key_download_config")) != null && strE.contains("lfhealthtest2")) ? strE : GRSManager.c(BaseApplication.b()).getUrl("healthDeviceUrl");
    }

    public void a(StopDeviceLinkageRequest stopDeviceLinkageRequest, final ICloudOperationResult<StopDeviceLinkageResponse> iCloudOperationResult) {
        LogUtil.a("HWCloudMgr", "Enter stopDeviceLinkage");
        Map<String, Object> mapA = ofe.a(stopDeviceLinkageRequest);
        String strD = d();
        if (strD == null) {
            iCloudOperationResult.operationResult(null, "unknown url", false);
            return;
        }
        String str = strD + "/deviceAgent/stopDeviceLinkage";
        LogUtil.a("HWCloudMgr", "stopDeviceLinkage url:", str);
        oet.d().c(str, this.d.getHeaders(), ofe.c(this.d.getBody(mapA)), StopDeviceLinkageResponse.class, new ResultCallback<StopDeviceLinkageResponse>() { // from class: lqo.6
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(StopDeviceLinkageResponse stopDeviceLinkageResponse) {
                LogUtil.a("HWCloudMgr", "StopDeviceLinkageRequest resultCode ", stopDeviceLinkageResponse.getResultCode());
                iCloudOperationResult.operationResult(stopDeviceLinkageResponse, stopDeviceLinkageResponse.getResultDesc(), true);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HWCloudMgr", " StopDeviceLinkageRequest exception :", th.getMessage());
                iCloudOperationResult.operationResult(null, th.getMessage(), false);
            }
        });
    }

    public void b(TransferDeviceDataRequest transferDeviceDataRequest, final ICloudOperationResult<TransferDeviceDataResponse> iCloudOperationResult) {
        LogUtil.a("HWCloudMgr", "Enter transDeviceData");
        Map<String, Object> mapA = ofe.a(transferDeviceDataRequest);
        String strD = d();
        if (strD == null) {
            iCloudOperationResult.operationResult(null, "unknown url", false);
            return;
        }
        String str = strD + "/deviceAgent/transDeviceData";
        LogUtil.a("HWCloudMgr", "transDeviceData url:", str);
        oet.d().c(str, this.d.getHeaders(), ofe.c(this.d.getBody(mapA)), TransferDeviceDataResponse.class, new ResultCallback<TransferDeviceDataResponse>() { // from class: lqo.15
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(TransferDeviceDataResponse transferDeviceDataResponse) {
                LogUtil.a("HWCloudMgr", "transDeviceData resultCode ", transferDeviceDataResponse.getResultCode());
                iCloudOperationResult.operationResult(transferDeviceDataResponse, transferDeviceDataResponse.getResultDesc(), true);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HWCloudMgr", " transDeviceData exception :", th.getMessage());
                iCloudOperationResult.operationResult(null, th.getMessage(), false);
            }
        });
    }

    public void b(ReleaseDeviceLinkageRequest releaseDeviceLinkageRequest, final ICloudOperationResult<ReleaseDeviceLinkageResponse> iCloudOperationResult) {
        LogUtil.a("HWCloudMgr", "Enter releaseDeviceLinkage");
        Map<String, Object> mapA = ofe.a(releaseDeviceLinkageRequest);
        String strD = d();
        if (strD == null) {
            iCloudOperationResult.operationResult(null, "unknown url", false);
            return;
        }
        String str = strD + "/deviceAgent/releaseDeviceLinkage";
        LogUtil.a("HWCloudMgr", "releaseDeviceLinkage url:", str);
        oet.d().c(str, this.d.getHeaders(), ofe.c(this.d.getBody(mapA)), ReleaseDeviceLinkageResponse.class, new ResultCallback<ReleaseDeviceLinkageResponse>() { // from class: lqo.14
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ReleaseDeviceLinkageResponse releaseDeviceLinkageResponse) {
                LogUtil.a("HWCloudMgr", "releaseDeviceLinkage resultCode ", releaseDeviceLinkageResponse.getResultCode());
                iCloudOperationResult.operationResult(releaseDeviceLinkageResponse, releaseDeviceLinkageResponse.getResultDesc(), true);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HWCloudMgr", " releaseDeviceLinkage exception :", th.getMessage());
                iCloudOperationResult.operationResult(null, th.getMessage(), false);
            }
        });
    }

    public void d(DeviceLinkResultNotifyRequest deviceLinkResultNotifyRequest, ICloudOperationResult<DeviceLinkResultNotifyResponse> iCloudOperationResult) {
        if (deviceLinkResultNotifyRequest == null || iCloudOperationResult == null) {
            LogUtil.j("HWCloudMgr", "deviceLinkResultNotify param is null.please check.");
            return;
        }
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.d(deviceLinkResultNotifyRequest, iCloudOperationResult);
        }
    }

    public void a(WifiDeviceShareByMainUserReq wifiDeviceShareByMainUserReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.d(wifiDeviceShareByMainUserReq, iCloudOperationResult);
        }
    }

    public void c(WifiDeviceSubuserAuthorize wifiDeviceSubuserAuthorize, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.c(wifiDeviceSubuserAuthorize, iCloudOperationResult);
        }
    }

    public void b(WifiDeviceGetMainUserAuth wifiDeviceGetMainUserAuth, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.b(wifiDeviceGetMainUserAuth, iCloudOperationResult);
        }
    }

    public void a(WifiDeviceGetDeviceRegistration wifiDeviceGetDeviceRegistration, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.d(wifiDeviceGetDeviceRegistration, iCloudOperationResult);
        }
    }

    public void c(WifiDeviceShareMemberInfoBySubUserReq wifiDeviceShareMemberInfoBySubUserReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqs lqsVar = this.f40635b;
        if (lqsVar != null) {
            lqsVar.e(wifiDeviceShareMemberInfoBySubUserReq, iCloudOperationResult);
        }
    }

    public void c(lpd lpdVar, ResultCallback<lpc> resultCallback) {
        oet.d().c(lpdVar.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(lpdVar)), lpc.class, resultCallback);
    }

    public lpj a(lph lphVar) {
        return (lpj) oet.d().e(lphVar.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(lphVar)), lpj.class);
    }

    public void a(lpp lppVar, ResultCallback<CloudCommonReponse> resultCallback) {
        oet.d().c(lppVar.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(lppVar)), CloudCommonReponse.class, resultCallback);
    }

    public void d(lop lopVar, ResultCallback<loq> resultCallback) {
        String strC = KeyValDbManager.d(BaseApplication.b()).c("user_id");
        if (TextUtils.isEmpty(strC)) {
            LogUtil.a("HWCloudMgr", "huid isEmpty");
            resultCallback.onFailure(new Throwable("huid is empty"));
        } else {
            if ("0".equals(strC)) {
                LogUtil.e("HWCloudMgr", "huid is 0");
                resultCallback.onFailure(new Throwable("huid is 0"));
                return;
            }
            Map<String, Object> body = this.d.getBody(lopVar);
            body.put("deviceId", strC);
            Map<String, String> headers = this.d.getHeaders();
            headers.put("x-version", b(CommonUtil.c(BaseApplication.b())));
            oet.d().c(lopVar.getUrl(), headers, ofe.c(body), loq.class, resultCallback);
        }
    }

    public void b(String str, lop lopVar, ResultCallback<loq> resultCallback) {
        String strC = KeyValDbManager.d(BaseApplication.b()).c("user_id");
        if (TextUtils.isEmpty(strC)) {
            LogUtil.a("HWCloudMgr", "huid isEmpty");
            resultCallback.onFailure(new Throwable("huid is empty"));
            return;
        }
        if ("0".equals(strC)) {
            LogUtil.e("HWCloudMgr", "huid is 0");
            resultCallback.onFailure(new Throwable("huid is 0"));
            return;
        }
        Map<String, Object> body = this.d.getBody(lopVar);
        if (!TextUtils.isEmpty(str)) {
            body.put("abTestFlowID", str);
        }
        body.put("deviceId", strC);
        Map<String, String> headers = this.d.getHeaders();
        headers.put("x-version", b(CommonUtil.c(BaseApplication.b())));
        LogUtil.a("HWCloudMgr", "url: ", lopVar.getUrl(), ", header: ", headers, ", body: ", ofe.c(body));
        oet.d().c(lopVar.getUrl(), headers, ofe.c(body), loq.class, resultCallback);
    }

    public String b(String str) {
        int iIndexOf;
        return (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(Constants.LINK)) <= 0) ? str : str.substring(0, iIndexOf);
    }

    public <T extends CloudCommonReponse, V extends CloudCommonRequest> void a(String str, V v, final ICloudOperationResult<T> iCloudOperationResult, Class<T> cls) {
        oet.d().c(GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + str, this.d.getHeaders(), ofe.c(this.d.getBody(v)), (Class) cls, (ResultCallback) new ResultCallback<T>() { // from class: lqo.5
            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                if (cloudCommonReponse.getResultCode().intValue() == 0) {
                    LogUtil.a("HWCloudMgr", "callHttpPost in operationResult successful");
                    iCloudOperationResult.operationResult(cloudCommonReponse, null, true);
                    return;
                }
                LogUtil.j("HWCloudMgr", "callHttpPost in operationResult fail:", cloudCommonReponse.getResultCode());
                iCloudOperationResult.operationResult(cloudCommonReponse, "code:" + cloudCommonReponse.getResultCode(), false);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                iCloudOperationResult.operationResult(null, th.getMessage(), false);
            }
        });
    }

    public lpg d(lpe lpeVar) {
        if (lpeVar == null) {
            LogUtil.e("HWCloudMgr", "uploadFileInfo req is null");
            return null;
        }
        Map<String, String> headers = this.d.getHeaders();
        String strC = ofe.c(this.d.getBody(lpeVar));
        LogUtil.a("HWCloudMgr", "uploadFileInfo headers is : ", headers, " body is : ", strC);
        return (lpg) oet.d().e(lpeVar.getUrl(), headers, strC, lpg.class);
    }

    public EcgServiceActivationData a(EcgIvActivationRequest ecgIvActivationRequest) {
        return (EcgServiceActivationData) oet.d().e(ecgIvActivationRequest.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(ecgIvActivationRequest)), EcgServiceActivationData.class);
    }

    public EcgGiftCardResponse c(EcgGiftCardRequest ecgGiftCardRequest) {
        return (EcgGiftCardResponse) oet.d().e(ecgGiftCardRequest.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(ecgGiftCardRequest)), EcgGiftCardResponse.class);
    }

    public DeleteSampleSequenceRsq b(DeleteSampleSequenceRep deleteSampleSequenceRep) {
        return (DeleteSampleSequenceRsq) oet.d().e(deleteSampleSequenceRep.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(deleteSampleSequenceRep)), DeleteSampleSequenceRsq.class);
    }

    public void a(DeleteAllUserProfileReq deleteAllUserProfileReq, ResultCallback<DeleteAllUserProfileRsp> resultCallback) {
        oet.d().c(deleteAllUserProfileReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(deleteAllUserProfileReq)), DeleteAllUserProfileRsp.class, resultCallback);
    }

    public void c(ResultCallback<LastClearCloudDataTimeRsp> resultCallback) {
        LastClearCloudDataTimeReq lastClearCloudDataTimeReq = new LastClearCloudDataTimeReq();
        oet.d().c(lastClearCloudDataTimeReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(lastClearCloudDataTimeReq)), LastClearCloudDataTimeRsp.class, resultCallback);
    }

    public void b(int i, ResultCallback<LastClearCloudDataTimeRsp> resultCallback) {
        LastClearCloudDataTimeReq lastClearCloudDataTimeReq = new LastClearCloudDataTimeReq();
        lastClearCloudDataTimeReq.setScenario(i);
        oet.d().c(lastClearCloudDataTimeReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(lastClearCloudDataTimeReq)), LastClearCloudDataTimeRsp.class, resultCallback);
    }

    public SurveyIdResponse a(SurveyIdRequest surveyIdRequest) {
        return (SurveyIdResponse) oet.d().e(surveyIdRequest.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(surveyIdRequest)), SurveyIdResponse.class);
    }

    public void b(AddPrivacyRecordReq addPrivacyRecordReq, final ICloudOperationResult<AddPrivacyRecordRsp> iCloudOperationResult) {
        oet.d().c(addPrivacyRecordReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(addPrivacyRecordReq)), AddPrivacyRecordRsp.class, new ResultCallback<AddPrivacyRecordRsp>() { // from class: lqo.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(AddPrivacyRecordRsp addPrivacyRecordRsp) {
                int iIntValue = addPrivacyRecordRsp.getResultCode().intValue();
                if (iIntValue == 0) {
                    iCloudOperationResult.operationResult(addPrivacyRecordRsp, null, true);
                    return;
                }
                iCloudOperationResult.operationResult(null, "code:" + iIntValue, false);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                iCloudOperationResult.operationResult(null, th.getMessage(), false);
            }
        });
    }

    public void e(GetPrivacyRecordReq getPrivacyRecordReq, final ICloudOperationResult<GetPrivacyRecordRsp> iCloudOperationResult) {
        oet.d().c(getPrivacyRecordReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getPrivacyRecordReq)), GetPrivacyRecordRsp.class, new ResultCallback<GetPrivacyRecordRsp>() { // from class: lqo.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(GetPrivacyRecordRsp getPrivacyRecordRsp) {
                iCloudOperationResult.operationResult(getPrivacyRecordRsp, null, true);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                iCloudOperationResult.operationResult(null, th.getMessage(), false);
            }
        });
    }

    public String a(WechatDeviceSignReq wechatDeviceSignReq) {
        return (String) oet.d().e(wechatDeviceSignReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(wechatDeviceSignReq)), String.class);
    }

    public String e(WechatDeviceRegistReq wechatDeviceRegistReq) {
        return (String) oet.d().e(wechatDeviceRegistReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(wechatDeviceRegistReq)), String.class);
    }

    public GetSleepSportsDataLatestRsp e(GetSleepSportsDataLatestReq getSleepSportsDataLatestReq) {
        return (GetSleepSportsDataLatestRsp) oet.d().e(getSleepSportsDataLatestReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getSleepSportsDataLatestReq)), GetSleepSportsDataLatestRsp.class);
    }

    public GetHealthDataLatestRsp a(GetHealthDataLatestReq getHealthDataLatestReq) {
        return (GetHealthDataLatestRsp) oet.d().e(getHealthDataLatestReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(getHealthDataLatestReq)), GetHealthDataLatestRsp.class);
    }

    public void b(ResultCallback<DeleteAccountCheckRsp> resultCallback) {
        DeleteAccountCheckReq deleteAccountCheckReq = new DeleteAccountCheckReq();
        deleteAccountCheckReq.setlanguageCode((TextUtils.isEmpty(LanguageUtil.a()) ? "zh-cn" : LanguageUtil.a()).replace("_", Constants.LINK).toLowerCase());
        oet.d().c(deleteAccountCheckReq.getUrl(), this.d.getHeaders(), ofe.c(this.d.getBody(deleteAccountCheckReq)), DeleteAccountCheckRsp.class, resultCallback);
    }
}
