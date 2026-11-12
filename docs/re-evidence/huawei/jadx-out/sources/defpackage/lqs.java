package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.callback.IHttpOperationResult;
import com.huawei.hwcloudmodel.callback.WifiRequestCallBack;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.WifiDataCloudFactory;
import com.huawei.hwcloudmodel.model.intelligent.DeviceLinkResultNotifyRequest;
import com.huawei.hwcloudmodel.model.intelligent.DeviceLinkResultNotifyResponse;
import com.huawei.hwcloudmodel.model.intelligent.ReleaseDeviceLinkageRequest;
import com.huawei.hwcloudmodel.model.intelligent.StartDeviceLinkageRequest;
import com.huawei.hwcloudmodel.model.intelligent.StopDeviceLinkageRequest;
import com.huawei.hwcloudmodel.model.intelligent.TransferDeviceDataRequest;
import com.huawei.hwcloudmodel.model.unite.AddEvaluationResultReq;
import com.huawei.hwcloudmodel.model.unite.AddSleepStatReq;
import com.huawei.hwcloudmodel.model.unite.DelEvaluationResultReq;
import com.huawei.hwcloudmodel.model.unite.DeleteAllHealthDataReq;
import com.huawei.hwcloudmodel.model.unite.DeleteAllMotionPathReq;
import com.huawei.hwcloudmodel.model.unite.DeleteAllSportDataReq;
import com.huawei.hwcloudmodel.model.unite.DeleteSportDataReq;
import com.huawei.hwcloudmodel.model.unite.GetEvaluationResultReq;
import com.huawei.hwcloudmodel.model.unite.GetMotionPathByTimeReq;
import com.huawei.hwcloudmodel.model.unite.GetSleepStatReq;
import com.huawei.hwcloudmodel.model.unite.GetThirdSignReq;
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
import com.huawei.hwcloudmodel.model.userprofile.DeleteAuthorizeReq;
import com.huawei.hwcloudmodel.model.userprofile.GetAuthorizeReq;
import com.huawei.hwcloudmodel.model.userprofile.GetCommentReq;
import com.huawei.hwcloudmodel.model.userprofile.GetCommentRsp;
import com.huawei.hwcloudmodel.model.userprofile.GetThirdIdentifyReq;
import com.huawei.hwcloudmodel.model.userprofile.GetUserMergeInfoReq;
import com.huawei.hwcloudmodel.model.userprofile.GetUserMergeInfoRsp;
import com.huawei.hwcloudmodel.model.userprofile.MergeUserAllDataReq;
import com.huawei.hwcloudmodel.model.userprofile.MergeUserAllDataRsp;
import com.huawei.hwcloudmodel.model.userprofile.SetAuthorizeReq;
import com.huawei.hwcloudmodel.model.userprofile.UpdateCommentReq;
import com.huawei.hwcloudmodel.utils.GetEvaluationResultRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lqs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private lqx f40661b;
    private WifiDataCloudFactory f;
    private lqu h;
    public static final HostnameVerifier e = new HostnameVerifier() { // from class: lqs.3
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40659a = new Object();
    private static Context d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile lqs f40660c = null;

    private lqs() {
        Context context = BaseApplication.getContext();
        d = context;
        this.h = new lqu(context);
        lqx lqxVar = new lqx();
        this.f40661b = lqxVar;
        lqxVar.e();
        this.f = new WifiDataCloudFactory(d);
    }

    public static lqs d() {
        if (f40660c == null) {
            synchronized (f40659a) {
                if (f40660c == null) {
                    f40660c = new lqs();
                }
            }
        }
        return f40660c;
    }

    private String b(Object obj) {
        if (obj instanceof MergeUserAllDataReq) {
            return "/profile/merge/mergeUserAllData";
        }
        if (obj instanceof GetUserMergeInfoReq) {
            return "/profile/merge/getUserMergeInfo";
        }
        if (obj instanceof UpdateCommentReq) {
            return "/dataRecommend/common/updateCommentRemainderTimes";
        }
        if (obj instanceof GetCommentReq) {
            return "/dataRecommend/common/getCommentRemainderTimes";
        }
        if (obj instanceof DeleteSportDataReq) {
            return "/dataSync/sport/deleteSportsData";
        }
        if (obj instanceof DeleteAllSportDataReq) {
            return "/dataSync/sport/deleteAllSportsData";
        }
        if (obj instanceof AddSleepStatReq) {
            return "/dataSync/sport/addSleepStat";
        }
        if (obj instanceof GetSleepStatReq) {
            return "/dataQuery/sport/getSleepStat";
        }
        if (obj instanceof DeleteAllHealthDataReq) {
            return "/dataSync/health/deleteAllHealthData";
        }
        if (obj instanceof GetMotionPathByTimeReq) {
            return "/dataQuery/path/getMotionPathData";
        }
        if (obj instanceof DeleteAllMotionPathReq) {
            return "/dataSync/path/deleteAllMotionPathData";
        }
        String strC = c(obj);
        if (strC != null) {
            return strC;
        }
        String strA = a(obj);
        if (strA != null) {
            return strA;
        }
        return null;
    }

    private String c(Object obj) {
        if (obj instanceof SetAuthorizeReq) {
            return "/profile/third/authorize";
        }
        if (obj instanceof GetAuthorizeReq) {
            return "/profile/third/getAuthorizeToken";
        }
        if (obj instanceof DeleteAuthorizeReq) {
            return "/profile/third/cancelAuthorize";
        }
        if (obj instanceof GetThirdSignReq) {
            return "/dataOpen/third/getThirdSign";
        }
        if (obj instanceof AddEvaluationResultReq) {
            return "/profile/evaluation/addEvaluationResult";
        }
        if (obj instanceof GetEvaluationResultReq) {
            return "/profile/evaluation/getEvaluationResult";
        }
        if (obj instanceof DelEvaluationResultReq) {
            return "/profile/evaluation/deleteEvaluationResult";
        }
        return null;
    }

    private String a(Object obj) {
        if (obj instanceof StartDeviceLinkageRequest) {
            return "/deviceAgent/startDeviceLinkage";
        }
        if (obj instanceof TransferDeviceDataRequest) {
            return "/deviceAgent/transDeviceData";
        }
        if (obj instanceof StopDeviceLinkageRequest) {
            return "/deviceAgent/stopDeviceLinkage";
        }
        if (obj instanceof ReleaseDeviceLinkageRequest) {
            return "/deviceAgent/releaseDeviceLinkage";
        }
        if (obj instanceof GetThirdIdentifyReq) {
            return "hiHealth/getThirdIdentify";
        }
        return null;
    }

    public void e(GetCommentReq getCommentReq, final ICloudOperationResult<GetCommentRsp> iCloudOperationResult) {
        if (getCommentReq == null || iCloudOperationResult == null) {
            LogUtil.j("HWCloudUtils", "getCommentRemainderTimes req or cb is null");
            return;
        }
        LogUtil.a("HWCloudUtils", " Enter getCommentRemainderTimes ");
        HashMap<String, Object> map = new HashMap<>();
        try {
            e(getCommentReq, map);
        } catch (Exception unused) {
            LogUtil.e("HWCloudUtils", "getCommentRemainderTimes Exception");
        }
        String strB = b(getCommentReq);
        if (strB == null) {
            LogUtil.j("HWCloudUtils", "getCommentRemainderTimes unknown url");
            iCloudOperationResult.operationResult(null, "unknown url", false);
        } else {
            this.h.b(strB, map, new IHttpOperationResult() { // from class: lqs.9
                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void operationResult(String str) {
                    LogUtil.a("HWCloudUtils", "getCommentRemainderTimes in operationResult");
                    try {
                        GetCommentRsp getCommentRsp = (GetCommentRsp) new Gson().fromJson(str, GetCommentRsp.class);
                        if (getCommentRsp != null) {
                            if (getCommentRsp.getResultCode().intValue() == 0) {
                                LogUtil.a("HWCloudUtils", "getCommentRemainderTimes in operationResult successful");
                                iCloudOperationResult.operationResult(getCommentRsp, null, true);
                                return;
                            }
                            LogUtil.a("HWCloudUtils", "getCommentRemainderTimes in operationResult fail:", getCommentRsp.getResultCode());
                            iCloudOperationResult.operationResult(null, "code:" + getCommentRsp.getResultCode(), false);
                        }
                    } catch (JsonSyntaxException e2) {
                        LogUtil.e("HWCloudUtils", "getCommentRemainderTimes json exception :", e2.getMessage());
                        iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                    }
                }

                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void exception(int i, Exception exc) {
                    LogUtil.a("HWCloudUtils", "addPrivacyRecord Exception code:", Integer.valueOf(i));
                    iCloudOperationResult.operationResult(null, exc.getMessage(), false);
                }
            });
        }
    }

    public void a(UpdateCommentReq updateCommentReq, final ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", " Enter updateCommentRemainderTimes ");
        HashMap<String, Object> map = new HashMap<>();
        try {
            e(updateCommentReq, map);
        } catch (Exception unused) {
            LogUtil.e("HWCloudUtils", "updateCommentRemainderTimes Exception");
        }
        String strB = b(updateCommentReq);
        if (strB == null) {
            LogUtil.j("HWCloudUtils", "updateCommentRemainderTimes unknown url");
            iCloudOperationResult.operationResult(null, "unknown url", false);
        } else {
            this.h.b(strB, map, new IHttpOperationResult() { // from class: lqs.16
                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void operationResult(String str) {
                    LogUtil.a("HWCloudUtils", "updateCommentRemainderTimes in operationResult");
                    try {
                        CloudCommonReponse cloudCommonReponse = (CloudCommonReponse) new Gson().fromJson(str, CloudCommonReponse.class);
                        if (cloudCommonReponse != null) {
                            if (cloudCommonReponse.getResultCode().intValue() == 0) {
                                LogUtil.a("HWCloudUtils", "updateCommentRemainderTimes in operationResult successful");
                                iCloudOperationResult.operationResult(cloudCommonReponse, null, true);
                                return;
                            }
                            LogUtil.a("HWCloudUtils", "updateCommentRemainderTimes in operationResult fail: ", cloudCommonReponse.getResultCode());
                            iCloudOperationResult.operationResult(null, "code:" + cloudCommonReponse.getResultCode(), false);
                        }
                    } catch (JsonSyntaxException e2) {
                        LogUtil.e("HWCloudUtils", "updateCommentRemainderTimes json exception : ", e2.getMessage());
                        iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                    }
                }

                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void exception(int i, Exception exc) {
                    LogUtil.a("HWCloudUtils", "addPrivacyRecord Exception code: ", Integer.valueOf(i));
                    iCloudOperationResult.operationResult(null, exc.getMessage(), false);
                }
            });
        }
    }

    public void a(MergeUserAllDataReq mergeUserAllDataReq, final ICloudOperationResult<MergeUserAllDataRsp> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter mergeUserAllData ");
        HashMap<String, Object> map = new HashMap<>();
        try {
            e(mergeUserAllDataReq, map);
        } catch (Exception unused) {
            LogUtil.e("HWCloudUtils", "mergeUserAllData Exception");
        }
        String strB = b(mergeUserAllDataReq);
        if (strB == null) {
            LogUtil.j("HWCloudUtils", "mergeUserAllData unknown url");
            iCloudOperationResult.operationResult(null, "unknown url", false);
        } else {
            this.h.b(strB, map, new IHttpOperationResult() { // from class: lqs.21
                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void operationResult(String str) {
                    LogUtil.a("HWCloudUtils", "mergeUserAllData in operationResult");
                    try {
                        MergeUserAllDataRsp mergeUserAllDataRsp = (MergeUserAllDataRsp) new Gson().fromJson(str, MergeUserAllDataRsp.class);
                        if (mergeUserAllDataRsp != null) {
                            if (mergeUserAllDataRsp.getResultCode().intValue() == 0) {
                                LogUtil.a("HWCloudUtils", "mergeUserAllData in operationResult successful");
                                iCloudOperationResult.operationResult(mergeUserAllDataRsp, null, true);
                                return;
                            }
                            LogUtil.a("HWCloudUtils", "mergeUserAllData in operationResult fail: ", mergeUserAllDataRsp.getResultCode());
                            iCloudOperationResult.operationResult(null, "" + mergeUserAllDataRsp.getResultCode(), false);
                        }
                    } catch (JsonSyntaxException e2) {
                        LogUtil.e("HWCloudUtils", "mergeUserAllData json exception : ", e2.getMessage());
                        iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                    }
                }

                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void exception(int i, Exception exc) {
                    LogUtil.a("HWCloudUtils", "mergeUserAllData Exception code: ", Integer.valueOf(i));
                    iCloudOperationResult.operationResult(null, exc.getMessage(), false);
                }
            });
        }
    }

    public void b(GetUserMergeInfoReq getUserMergeInfoReq, final ICloudOperationResult<GetUserMergeInfoRsp> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter getUserMergeInfo");
        HashMap<String, Object> map = new HashMap<>();
        try {
            e(getUserMergeInfoReq, map);
        } catch (Exception unused) {
            LogUtil.e("HWCloudUtils", "getUserMergeInfo Exception");
        }
        String strB = b(getUserMergeInfoReq);
        if (strB == null) {
            LogUtil.a("HWCloudUtils", "getUserMergeInfo unknown url");
            iCloudOperationResult.operationResult(null, "unknown url", false);
        } else {
            this.h.b(strB, map, new IHttpOperationResult() { // from class: lqs.24
                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void operationResult(String str) {
                    LogUtil.a("HWCloudUtils", "getUserMergeInfo in operationResult");
                    try {
                        GetUserMergeInfoRsp getUserMergeInfoRsp = (GetUserMergeInfoRsp) new Gson().fromJson(str, GetUserMergeInfoRsp.class);
                        if (getUserMergeInfoRsp != null) {
                            if (getUserMergeInfoRsp.getResultCode().intValue() == 0) {
                                LogUtil.a("HWCloudUtils", "getUserMergeInfo in operationResult successful");
                                iCloudOperationResult.operationResult(getUserMergeInfoRsp, null, true);
                                return;
                            }
                            LogUtil.a("HWCloudUtils", "getUserMergeInfo in operationResult fail: ", getUserMergeInfoRsp.getResultCode());
                            iCloudOperationResult.operationResult(null, "" + getUserMergeInfoRsp.getResultCode(), false);
                        }
                    } catch (JsonSyntaxException e2) {
                        LogUtil.e("HWCloudUtils", "getUserMergeInfo json exception : ", e2.getMessage());
                        iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                    }
                }

                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void exception(int i, Exception exc) {
                    LogUtil.a("HWCloudUtils", "getUserMergeInfo Exception code: ", Integer.valueOf(i));
                    iCloudOperationResult.operationResult(null, exc.getMessage(), false);
                }
            });
        }
    }

    public static boolean e(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isAvailable();
    }

    public void e(final double d2, final double d3, final ICloudOperationResult<lqp> iCloudOperationResult) {
        ThreadPoolManager.c().b("HWCloudUtils", new Runnable() { // from class: lqs.23
            @Override // java.lang.Runnable
            public void run() {
                lqp lqpVarE = lqh.d().e(d2, d3);
                if (lqpVarE.a() != -1.0d && lqpVarE.c() != 0) {
                    iCloudOperationResult.operationResult(lqpVarE, null, true);
                } else {
                    iCloudOperationResult.operationResult(lqpVarE, null, false);
                }
            }
        });
    }

    public void a(AddEvaluationResultReq addEvaluationResultReq, final ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter addEvaluationResult ");
        HashMap<String, Object> map = new HashMap<>();
        try {
            e(addEvaluationResultReq, map);
        } catch (Exception unused) {
            LogUtil.a("HWCloudUtils", "addEvaluationResult Exception");
        }
        String strB = b(addEvaluationResultReq);
        if (strB == null) {
            LogUtil.j("HWCloudUtils", "addEvaluationResult unknown url");
            iCloudOperationResult.operationResult(null, "unknown url", false);
        } else {
            this.h.b(strB, map, new IHttpOperationResult() { // from class: lqs.4
                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void operationResult(String str) {
                    LogUtil.a("HWCloudUtils", "addEvaluationResult in operationResult");
                    try {
                        CloudCommonReponse cloudCommonReponse = (CloudCommonReponse) new Gson().fromJson(str, CloudCommonReponse.class);
                        if (cloudCommonReponse != null) {
                            if (cloudCommonReponse.getResultCode().intValue() == 0) {
                                LogUtil.a("HWCloudUtils", "addEvaluationResult in operationResult successful");
                                iCloudOperationResult.operationResult(cloudCommonReponse, null, true);
                                return;
                            }
                            LogUtil.a("HWCloudUtils", "addEvaluationResult in operationResult fail: ", cloudCommonReponse.getResultCode());
                            iCloudOperationResult.operationResult(null, "code:" + cloudCommonReponse.getResultCode(), false);
                        }
                    } catch (JsonSyntaxException e2) {
                        LogUtil.a("HWCloudUtils", "addEvaluationResult json exception : ", e2.getMessage());
                        iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                    }
                }

                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void exception(int i, Exception exc) {
                    LogUtil.a("HWCloudUtils", "addEvaluationResult Exception code: ", Integer.valueOf(i));
                    iCloudOperationResult.operationResult(null, exc.getMessage(), false);
                }
            });
        }
    }

    public void a(GetEvaluationResultReq getEvaluationResultReq, final ICloudOperationResult<GetEvaluationResultRsp> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter getEvaluationResult  ");
        HashMap<String, Object> map = new HashMap<>();
        try {
            e(getEvaluationResultReq, map);
        } catch (Exception unused) {
            LogUtil.a("HWCloudUtils", "getEvaluationResult eception");
        }
        String strB = b(getEvaluationResultReq);
        if (strB == null) {
            LogUtil.j("HWCloudUtils", "getEvaluationResult unknown url");
            iCloudOperationResult.operationResult(null, "unknown url", false);
        } else {
            this.h.b(strB, map, new IHttpOperationResult() { // from class: lqs.1
                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void operationResult(String str) {
                    LogUtil.a("HWCloudUtils", "getEvaluationResult in operationResult");
                    try {
                        GetEvaluationResultRsp getEvaluationResultRsp = (GetEvaluationResultRsp) new Gson().fromJson(str, GetEvaluationResultRsp.class);
                        if (getEvaluationResultRsp != null) {
                            if (getEvaluationResultRsp.getResultCode().intValue() == 0) {
                                LogUtil.a("HWCloudUtils", "getEvaluationResult in operationResult successful");
                                iCloudOperationResult.operationResult(getEvaluationResultRsp, null, true);
                                return;
                            }
                            LogUtil.a("HWCloudUtils", "getEvaluationResult in operationResult fail: ", getEvaluationResultRsp.getResultCode());
                            iCloudOperationResult.operationResult(null, "code:" + getEvaluationResultRsp.getResultCode(), false);
                        }
                    } catch (JsonSyntaxException e2) {
                        LogUtil.a("HWCloudUtils", "getEvaluationResult json exception : ", e2.getMessage());
                        iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                    }
                }

                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void exception(int i, Exception exc) {
                    LogUtil.a("HWCloudUtils", "getEvaluationResult Exception code: ", Integer.valueOf(i));
                    iCloudOperationResult.operationResult(null, exc.getMessage(), false);
                }
            });
        }
    }

    public void b(DelEvaluationResultReq delEvaluationResultReq, final ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter delEvaluationResult ");
        HashMap<String, Object> map = new HashMap<>();
        try {
            e(delEvaluationResultReq, map);
        } catch (Exception unused) {
            LogUtil.a("HWCloudUtils", "delEvaluationResult Exception");
        }
        String strB = b(delEvaluationResultReq);
        if (strB == null) {
            LogUtil.j("HWCloudUtils", "delEvaluationResult unknown url");
            iCloudOperationResult.operationResult(null, "unknown url", false);
        } else {
            this.h.b(strB, map, new IHttpOperationResult() { // from class: lqs.5
                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void operationResult(String str) {
                    LogUtil.a("HWCloudUtils", "delEvaluationResult in operationResult");
                    try {
                        CloudCommonReponse cloudCommonReponse = (CloudCommonReponse) new Gson().fromJson(str, CloudCommonReponse.class);
                        if (cloudCommonReponse != null) {
                            if (cloudCommonReponse.getResultCode().intValue() == 0) {
                                LogUtil.a("HWCloudUtils", "delEvaluationResult in operationResult successful");
                                iCloudOperationResult.operationResult(cloudCommonReponse, null, true);
                                return;
                            }
                            LogUtil.a("HWCloudUtils", "delEvaluationResult  in operationResult fail: ", cloudCommonReponse.getResultCode());
                            iCloudOperationResult.operationResult(null, "code:" + cloudCommonReponse.getResultCode(), false);
                        }
                    } catch (JsonSyntaxException e2) {
                        LogUtil.a("HWCloudUtils", "delEvaluationResult json exception : ", e2.getMessage());
                        iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                    }
                }

                @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
                public void exception(int i, Exception exc) {
                    LogUtil.a("HWCloudUtils", "delEvaluationResult Exception code: ", Integer.valueOf(i));
                    iCloudOperationResult.operationResult(null, exc.getMessage(), false);
                }
            });
        }
    }

    public void e(Object obj, HashMap<String, Object> map) {
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                String name = field.getName();
                boolean zIsAccessible = field.isAccessible();
                if (!zIsAccessible) {
                    field.setAccessible(true);
                }
                Object obj2 = field.get(obj);
                if (!zIsAccessible) {
                    field.setAccessible(false);
                }
                if (obj2 != null) {
                    map.put(name, obj2);
                }
            }
        } catch (IllegalAccessException e2) {
            LogUtil.e("HWCloudUtils", "HWCloudUtils IllegalAccessException E: ", e2.getMessage());
        } catch (IllegalArgumentException e3) {
            LogUtil.e("HWCloudUtils", "HWCloudUtils IllegalArgumentException E: ", e3.getMessage());
        }
    }

    public void e(WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq, final ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter syncWifiDeviceControl");
        String strC = ofe.c(this.f.getBody(wifiDeviceControlDataModelReq));
        Map<String, String> headers = this.f.getHeaders();
        this.f40661b.d(this.f.getRequestUrl(wifiDeviceControlDataModelReq.getUrl()), strC, headers, new WifiRequestCallBack() { // from class: lqs.2
            @Override // com.huawei.hwcloudmodel.callback.WifiRequestCallBack
            public void operationResult(String str) {
                LogUtil.a("HWCloudUtils", "syncWifiDeviceControl in operationResult text=***");
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("HWCloudUtils", "syncWifiDeviceControl, json is empty");
                        iCloudOperationResult.operationResult(null, null, false);
                        return;
                    }
                    CloudCommonReponse cloudCommonReponse = (CloudCommonReponse) new Gson().fromJson(str, CloudCommonReponse.class);
                    if (cloudCommonReponse != null) {
                        LogUtil.a("HWCloudUtils", "syncWifiDeviceControl ResultCode = ", cloudCommonReponse.getResultCode());
                        if (cloudCommonReponse.getResultCode().intValue() == 0) {
                            iCloudOperationResult.operationResult(cloudCommonReponse, null, true);
                        } else {
                            iCloudOperationResult.operationResult(cloudCommonReponse, null, false);
                        }
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", " syncWifiDeviceControl JsonSyntaxException");
                    iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                }
            }
        });
    }

    public void c(WifiDeviceUnbindReq wifiDeviceUnbindReq, final ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter unBindWifiDevice");
        String strC = ofe.c(this.f.getBody(wifiDeviceUnbindReq));
        Map<String, String> headers = this.f.getHeaders();
        this.f40661b.d(this.f.getRequestUrl(wifiDeviceUnbindReq.getUrl()), strC, headers, new WifiRequestCallBack() { // from class: lqs.6
            @Override // com.huawei.hwcloudmodel.callback.WifiRequestCallBack
            public void operationResult(String str) {
                LogUtil.a("HWCloudUtils", "unBindWifiDevice in operationResult text=***");
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("HWCloudUtils", "unBindWifiDevice, json is empty");
                        iCloudOperationResult.operationResult(null, null, false);
                        return;
                    }
                    CloudCommonReponse cloudCommonReponse = (CloudCommonReponse) new Gson().fromJson(str, CloudCommonReponse.class);
                    if (cloudCommonReponse != null) {
                        LogUtil.a("HWCloudUtils", "unBindWifiDevice ResultCode = ", cloudCommonReponse.getResultCode());
                        if (cloudCommonReponse.getResultCode().intValue() == 0) {
                            iCloudOperationResult.operationResult(cloudCommonReponse, null, true);
                        } else {
                            iCloudOperationResult.operationResult(cloudCommonReponse, null, false);
                        }
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", " unBindWifiDevice JsonSyntaxException");
                    iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                }
            }
        });
    }

    public void b(WifiDeviceGetWifiDeviceInfoReq wifiDeviceGetWifiDeviceInfoReq, final ICloudOperationResult<WifiDeviceGetWifiDeviceInfoRsp> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter getWifiDeviceInfo");
        String strC = ofe.c(this.f.getBody(wifiDeviceGetWifiDeviceInfoReq));
        Map<String, String> headers = this.f.getHeaders();
        String requestUrl = this.f.getRequestUrl(wifiDeviceGetWifiDeviceInfoReq.getUrl());
        LogUtil.d("HWCloudUtils", "getWifiDeviceInfo, httpUrl: ", requestUrl, " params: ", strC);
        this.f40661b.d(requestUrl, strC, headers, new WifiRequestCallBack() { // from class: lqs.10
            @Override // com.huawei.hwcloudmodel.callback.WifiRequestCallBack
            public void operationResult(String str) {
                LogUtil.a("HWCloudUtils", "getWifiDeviceInfo in operationResult text=***");
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("HWCloudUtils", "getWifiDeviceInfo, json is empty");
                        iCloudOperationResult.operationResult(null, null, false);
                        return;
                    }
                    LogUtil.d("HWCloudUtils", "getWifiDeviceInfo json: ", str);
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        LogUtil.a("HWCloudUtils", "getWifiDeviceInfo primal json resultCode: ", Integer.valueOf(jSONObject.has("resultCode") ? jSONObject.getInt("resultCode") : -1));
                    } catch (JSONException unused) {
                        LogUtil.e("HWCloudUtils", "getWifiDeviceInfo JSONException");
                    }
                    WifiDeviceGetWifiDeviceInfoRsp wifiDeviceGetWifiDeviceInfoRsp = (WifiDeviceGetWifiDeviceInfoRsp) new Gson().fromJson(str, WifiDeviceGetWifiDeviceInfoRsp.class);
                    if (wifiDeviceGetWifiDeviceInfoRsp != null) {
                        LogUtil.a("HWCloudUtils", "getWifiDeviceInfo ResultCode = ", wifiDeviceGetWifiDeviceInfoRsp.getResultCode());
                        if (wifiDeviceGetWifiDeviceInfoRsp.getResultCode().intValue() == 0) {
                            iCloudOperationResult.operationResult(wifiDeviceGetWifiDeviceInfoRsp, null, true);
                        } else {
                            iCloudOperationResult.operationResult(wifiDeviceGetWifiDeviceInfoRsp, null, false);
                        }
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", " getWifiDeviceInfo JsonSyntaxException");
                    iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                }
            }
        });
    }

    public void e(final WifiDeviceServiceInfoReq wifiDeviceServiceInfoReq, final ICloudOperationResult<WifiDeviceServiceInfoRsp> iCloudOperationResult) {
        ThreadPoolManager.c().a("getWifiDeviceServiceInfo", new Runnable() { // from class: lqt
            @Override // java.lang.Runnable
            public final void run() {
                this.f40688a.d(wifiDeviceServiceInfoReq, iCloudOperationResult);
            }
        });
    }

    /* synthetic */ void d(WifiDeviceServiceInfoReq wifiDeviceServiceInfoReq, final ICloudOperationResult iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter getWifiDeviceServiceInfo");
        String strC = ofe.c(this.f.getBody(wifiDeviceServiceInfoReq));
        Map<String, String> headers = this.f.getHeaders();
        this.f40661b.d(this.f.getRequestUrl(wifiDeviceServiceInfoReq.getUrl()), strC, headers, new WifiRequestCallBack() { // from class: lqs.8
            @Override // com.huawei.hwcloudmodel.callback.WifiRequestCallBack
            public void operationResult(String str) {
                LogUtil.a("HWCloudUtils", "getWifiDeviceServiceInfo in operationResult text=***");
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("HWCloudUtils", "getWifiDeviceServiceInfo, json is empty");
                        iCloudOperationResult.operationResult(null, null, false);
                        return;
                    }
                    WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp = new WifiDeviceServiceInfoRsp();
                    wifiDeviceServiceInfoRsp.toObject(str);
                    LogUtil.a("HWCloudUtils", "getWifiDeviceServiceInfo ResultCode = ", wifiDeviceServiceInfoRsp.getResultCode());
                    if (wifiDeviceServiceInfoRsp.getResultCode().intValue() == 0) {
                        iCloudOperationResult.operationResult(wifiDeviceServiceInfoRsp, null, true);
                    } else {
                        iCloudOperationResult.operationResult(wifiDeviceServiceInfoRsp, null, false);
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", " getWifiDeviceServiceInfo JsonSyntaxException");
                    iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                }
            }
        });
    }

    public void e(final ICloudOperationResult<WifiDeviceGetAllDeviceRsp> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter getUserAllWifiDevice");
        String strC = ofe.c(this.f.getBody(null));
        Map<String, String> headers = this.f.getHeaders();
        this.f40661b.d(this.f.getRequestUrl("/deviceAgent/getUserDevice"), strC, headers, new WifiRequestCallBack() { // from class: lqs.7
            @Override // com.huawei.hwcloudmodel.callback.WifiRequestCallBack
            public void operationResult(String str) {
                LogUtil.a("HWCloudUtils", "getUserAllWifiDevice in operationResult text=***");
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("HWCloudUtils", "getUserAllWifiDevice, json is empty");
                        iCloudOperationResult.operationResult(null, null, false);
                        return;
                    }
                    WifiDeviceGetAllDeviceRsp wifiDeviceGetAllDeviceRsp = (WifiDeviceGetAllDeviceRsp) new Gson().fromJson(str, WifiDeviceGetAllDeviceRsp.class);
                    if (wifiDeviceGetAllDeviceRsp != null) {
                        LogUtil.a("HWCloudUtils", "getUserAllWifiDevice ResultCode = ", wifiDeviceGetAllDeviceRsp.getResultCode());
                        if (Objects.equals(wifiDeviceGetAllDeviceRsp.getResultCode(), 0)) {
                            iCloudOperationResult.operationResult(wifiDeviceGetAllDeviceRsp, null, true);
                        } else {
                            iCloudOperationResult.operationResult(wifiDeviceGetAllDeviceRsp, null, false);
                        }
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", " getUserAllWifiDevice JsonSyntaxException");
                    iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                }
            }
        });
    }

    public void e(WifiDeviceAddAuthorizeForSubUserReq wifiDeviceAddAuthorizeForSubUserReq, final ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter addWifiDeviceAuthorizeForSubUser");
        String strC = ofe.c(this.f.getBody(wifiDeviceAddAuthorizeForSubUserReq));
        Map<String, String> headers = this.f.getHeaders();
        this.f40661b.d(this.f.getRequestUrl(wifiDeviceAddAuthorizeForSubUserReq.getUrl()), strC, headers, new WifiRequestCallBack() { // from class: lqs.12
            @Override // com.huawei.hwcloudmodel.callback.WifiRequestCallBack
            public void operationResult(String str) {
                LogUtil.a("HWCloudUtils", "addWifiDeviceAuthorizeForSubUser in operationResult text=***");
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("HWCloudUtils", "addWifiDeviceAuthorizeForSubUser, json is empty");
                        iCloudOperationResult.operationResult(null, null, false);
                        return;
                    }
                    CloudCommonReponse cloudCommonReponse = (CloudCommonReponse) new Gson().fromJson(str, CloudCommonReponse.class);
                    if (cloudCommonReponse != null) {
                        LogUtil.a("HWCloudUtils", "addWifiDeviceAuthorizeForSubUser ResultCode = ", cloudCommonReponse.getResultCode());
                        if (cloudCommonReponse.getResultCode().intValue() != 0 && cloudCommonReponse.getResultCode().intValue() != 112000020) {
                            iCloudOperationResult.operationResult(cloudCommonReponse, null, false);
                            return;
                        }
                        iCloudOperationResult.operationResult(cloudCommonReponse, null, true);
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", "addWifiDeviceAuthorizeForSubUser JsonSyntaxException");
                    iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                }
            }
        });
    }

    public void b(WifiDeviceGetAuthorizeSubUserReq wifiDeviceGetAuthorizeSubUserReq, final ICloudOperationResult<WifiDeviceGetAuthorizeSubUserRsp> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter getWifiDeviceAuthorizeSubUser");
        String strC = ofe.c(this.f.getBody(wifiDeviceGetAuthorizeSubUserReq));
        Map<String, String> headers = this.f.getHeaders();
        this.f40661b.d(this.f.getRequestUrl(wifiDeviceGetAuthorizeSubUserReq.getUrl()), strC, headers, new WifiRequestCallBack() { // from class: lqs.15
            @Override // com.huawei.hwcloudmodel.callback.WifiRequestCallBack
            public void operationResult(String str) {
                LogUtil.a("HWCloudUtils", "getWifiDeviceAuthorizeSubUser in operationResult text=***");
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("HWCloudUtils", "getWifiDeviceAuthorizeSubUser, json is empty");
                        iCloudOperationResult.operationResult(null, null, false);
                        return;
                    }
                    WifiDeviceGetAuthorizeSubUserRsp wifiDeviceGetAuthorizeSubUserRsp = (WifiDeviceGetAuthorizeSubUserRsp) new Gson().fromJson(str, WifiDeviceGetAuthorizeSubUserRsp.class);
                    if (wifiDeviceGetAuthorizeSubUserRsp != null) {
                        LogUtil.a("HWCloudUtils", "getWifiDeviceAuthorizeSubUser ResultCode = ", wifiDeviceGetAuthorizeSubUserRsp.getResultCode());
                        if (wifiDeviceGetAuthorizeSubUserRsp.getResultCode().intValue() == 0) {
                            iCloudOperationResult.operationResult(wifiDeviceGetAuthorizeSubUserRsp, null, true);
                        } else {
                            iCloudOperationResult.operationResult(wifiDeviceGetAuthorizeSubUserRsp, null, false);
                        }
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", "getWifiDeviceAuthorizeSubUser, JsonSyntaxException");
                    iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                }
            }
        });
    }

    public void e(WifiDeviceUpdateAuthorizeSubUserReq wifiDeviceUpdateAuthorizeSubUserReq, final ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter upateWifiDeviceAuthorizeSubUser");
        String strC = ofe.c(this.f.getBody(wifiDeviceUpdateAuthorizeSubUserReq));
        Map<String, String> headers = this.f.getHeaders();
        this.f40661b.d(this.f.getRequestUrl(wifiDeviceUpdateAuthorizeSubUserReq.getUrl()), strC, headers, new WifiRequestCallBack() { // from class: lqs.11
            @Override // com.huawei.hwcloudmodel.callback.WifiRequestCallBack
            public void operationResult(String str) {
                LogUtil.a("HWCloudUtils", "upateWifiDeviceAuthorizeSubUser in operationResult text=***");
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("HWCloudUtils", "updateWifiDeviceAuthorizeSubUser, json is null");
                        iCloudOperationResult.operationResult(null, null, false);
                        return;
                    }
                    CloudCommonReponse cloudCommonReponse = (CloudCommonReponse) new Gson().fromJson(str, CloudCommonReponse.class);
                    if (cloudCommonReponse != null) {
                        LogUtil.a("HWCloudUtils", "upateWifiDeviceAuthorizeSubUser ResultCode = ", cloudCommonReponse.getResultCode());
                        if (cloudCommonReponse.getResultCode().intValue() == 0) {
                            iCloudOperationResult.operationResult(cloudCommonReponse, null, true);
                        } else {
                            iCloudOperationResult.operationResult(cloudCommonReponse, null, false);
                        }
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", "upateWifiDeviceAuthorizeSubUser, JsonSyntaxException");
                    iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                }
            }
        });
    }

    public void d(WifiDeviceDeleteAuthorizeSubUserReq wifiDeviceDeleteAuthorizeSubUserReq, final ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter deleteWifiDeviceAuthorizeSubUser");
        String strC = ofe.c(this.f.getBody(wifiDeviceDeleteAuthorizeSubUserReq));
        Map<String, String> headers = this.f.getHeaders();
        this.f40661b.d(this.f.getRequestUrl(wifiDeviceDeleteAuthorizeSubUserReq.getUrl()), strC, headers, new WifiRequestCallBack() { // from class: lqs.14
            @Override // com.huawei.hwcloudmodel.callback.WifiRequestCallBack
            public void operationResult(String str) {
                LogUtil.a("HWCloudUtils", "deleteWifiDeviceAuthorizeSubUser in operationResult text=***");
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("HWCloudUtils", "deleteWifiDeviceAuthorizeSubUser, json is empty");
                        iCloudOperationResult.operationResult(null, null, false);
                        return;
                    }
                    CloudCommonReponse cloudCommonReponse = (CloudCommonReponse) new Gson().fromJson(str, CloudCommonReponse.class);
                    if (cloudCommonReponse != null) {
                        LogUtil.a("HWCloudUtils", "deleteWifiDeviceAuthorizeSubUser ResultCode = ", cloudCommonReponse.getResultCode());
                        if (cloudCommonReponse.getResultCode().intValue() == 0) {
                            iCloudOperationResult.operationResult(cloudCommonReponse, null, true);
                        } else {
                            iCloudOperationResult.operationResult(cloudCommonReponse, null, false);
                        }
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", "deleteWifiDeviceAuthorizeSubUser JsonSyntaxException");
                    iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                }
            }
        });
    }

    public void a(WifiDeviceExitAuthorizeSubUserReq wifiDeviceExitAuthorizeSubUserReq, final ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter exitWifiDeviceAuthorizeSubUser");
        String strC = ofe.c(this.f.getBody(wifiDeviceExitAuthorizeSubUserReq));
        Map<String, String> headers = this.f.getHeaders();
        this.f40661b.d(this.f.getRequestUrl(wifiDeviceExitAuthorizeSubUserReq.getUrl()), strC, headers, new WifiRequestCallBack() { // from class: lqs.13
            @Override // com.huawei.hwcloudmodel.callback.WifiRequestCallBack
            public void operationResult(String str) {
                LogUtil.a("HWCloudUtils", "exitWifiDeviceAuthorizeSubUser in operationResult text=***");
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("HWCloudUtils", "deleteWifiDeviceAuthorizeSubUser, json is empty");
                        iCloudOperationResult.operationResult(null, null, false);
                        return;
                    }
                    CloudCommonReponse cloudCommonReponse = (CloudCommonReponse) new Gson().fromJson(str, CloudCommonReponse.class);
                    if (cloudCommonReponse != null) {
                        LogUtil.a("HWCloudUtils", "exitWifiDeviceAuthorizeSubUser ResultCode = ", cloudCommonReponse.getResultCode());
                        if (cloudCommonReponse.getResultCode().intValue() == 0) {
                            iCloudOperationResult.operationResult(cloudCommonReponse, null, true);
                        } else {
                            iCloudOperationResult.operationResult(cloudCommonReponse, null, false);
                        }
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", "exitWifiDeviceAuthorizeSubUser JsonSyntaxException");
                    iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                }
            }
        });
    }

    public void d(final ICloudOperationResult<WifiDeviceGetVerifyCodeForMainUserRsp> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter getWifiDeviceVerifyCodeForMainUser");
        String strC = ofe.c(this.f.getBody(null));
        Map<String, String> headers = this.f.getHeaders();
        this.f40661b.d(this.f.getRequestUrl("/deviceAgent/getVerifyCode"), strC, headers, new WifiRequestCallBack() { // from class: lqs.20
            @Override // com.huawei.hwcloudmodel.callback.WifiRequestCallBack
            public void operationResult(String str) {
                LogUtil.a("HWCloudUtils", "getWifiDeviceVerifyCodeForMainUser in operationResult text=***");
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("HWCloudUtils", "getWifiDeviceVerifyCodeForMainUser, json is empty");
                        iCloudOperationResult.operationResult(null, null, false);
                        return;
                    }
                    WifiDeviceGetVerifyCodeForMainUserRsp wifiDeviceGetVerifyCodeForMainUserRsp = (WifiDeviceGetVerifyCodeForMainUserRsp) new Gson().fromJson(str, WifiDeviceGetVerifyCodeForMainUserRsp.class);
                    if (wifiDeviceGetVerifyCodeForMainUserRsp != null) {
                        LogUtil.a("HWCloudUtils", "getWifiDeviceVerifyCodeForMainUser ResultCode = ", wifiDeviceGetVerifyCodeForMainUserRsp.getResultCode());
                        if (wifiDeviceGetVerifyCodeForMainUserRsp.getResultCode().intValue() == 0) {
                            iCloudOperationResult.operationResult(wifiDeviceGetVerifyCodeForMainUserRsp, null, true);
                        } else {
                            iCloudOperationResult.operationResult(wifiDeviceGetVerifyCodeForMainUserRsp, null, false);
                        }
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", " getWifiDeviceVerifyCodeForMainUser JsonSyntaxException");
                    iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                }
            }
        });
    }

    public void c(WifiDeviceAddAuthMsgBySubUserReq wifiDeviceAddAuthMsgBySubUserReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "enter wifiDeviceAddAuthMsgBySubUser");
        c(ofe.c(this.f.getBody(wifiDeviceAddAuthMsgBySubUserReq)), wifiDeviceAddAuthMsgBySubUserReq.getUrl(), iCloudOperationResult);
    }

    public void e(WifiDeviceGetSubUserAuthMsgReq wifiDeviceGetSubUserAuthMsgReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "enter wifiDeviceGetSubUserAuthMsg");
        c(ofe.c(this.f.getBody(wifiDeviceGetSubUserAuthMsgReq)), wifiDeviceGetSubUserAuthMsgReq.getUrl(), iCloudOperationResult);
    }

    public void d(WifiDeviceAuthorizeByMainUserReq wifiDeviceAuthorizeByMainUserReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "enter wifiDeviceAuthorizeByMainUser");
        c(ofe.c(this.f.getBody(wifiDeviceAuthorizeByMainUserReq)), wifiDeviceAuthorizeByMainUserReq.getUrl(), iCloudOperationResult);
    }

    private void c(String str, String str2, final ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter wifiDeviceRequest");
        Map<String, String> headers = this.f.getHeaders();
        this.f40661b.d(this.f.getRequestUrl(str2), str, headers, new WifiRequestCallBack() { // from class: lqs.19
            @Override // com.huawei.hwcloudmodel.callback.WifiRequestCallBack
            public void operationResult(String str3) {
                LogUtil.a("HWCloudUtils", "wifiDeviceRequest in operationResult result is ", str3);
                try {
                    if (TextUtils.isEmpty(str3)) {
                        LogUtil.j("HWCloudUtils", "wifiDeviceRequest, json is empty");
                        iCloudOperationResult.operationResult(null, null, false);
                        return;
                    }
                    CloudCommonReponse cloudCommonReponse = (CloudCommonReponse) new Gson().fromJson(str3, CloudCommonReponse.class);
                    if (cloudCommonReponse != null) {
                        LogUtil.a("HWCloudUtils", "wifiDeviceRequest ResultCode = ", cloudCommonReponse.getResultCode());
                        if (cloudCommonReponse.getResultCode().intValue() == 0) {
                            iCloudOperationResult.operationResult(cloudCommonReponse, str3, true);
                        } else {
                            iCloudOperationResult.operationResult(cloudCommonReponse, str3, false);
                        }
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", "wifiDeviceRequest JsonSyntaxException");
                    iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                }
            }
        });
    }

    public void d(WifiDeviceShareByMainUserReq wifiDeviceShareByMainUserReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "enter addAuthMsgByMainUser");
        c(ofe.c(this.f.getBody(wifiDeviceShareByMainUserReq)), wifiDeviceShareByMainUserReq.getUrl(), iCloudOperationResult);
    }

    public void c(WifiDeviceSubuserAuthorize wifiDeviceSubuserAuthorize, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "enter authorizeBySubUser");
        c(ofe.c(this.f.getBody(wifiDeviceSubuserAuthorize)), wifiDeviceSubuserAuthorize.getUrl(), iCloudOperationResult);
    }

    public void b(WifiDeviceGetMainUserAuth wifiDeviceGetMainUserAuth, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "enter authorizeBySubUser");
        c(ofe.c(this.f.getBody(wifiDeviceGetMainUserAuth)), wifiDeviceGetMainUserAuth.getUrl(), iCloudOperationResult);
    }

    public void d(WifiDeviceGetDeviceRegistration wifiDeviceGetDeviceRegistration, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "enter getDeviceRegistration");
        c(ofe.c(this.f.getBody(wifiDeviceGetDeviceRegistration)), wifiDeviceGetDeviceRegistration.getUrl(), iCloudOperationResult);
    }

    public void e(WifiDeviceShareMemberInfoBySubUserReq wifiDeviceShareMemberInfoBySubUserReq, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "enter getMemberInfoBySubUser");
        c(ofe.c(this.f.getBody(wifiDeviceShareMemberInfoBySubUserReq)), wifiDeviceShareMemberInfoBySubUserReq.getUrl(), iCloudOperationResult);
    }

    public void d(DeviceLinkResultNotifyRequest deviceLinkResultNotifyRequest, final ICloudOperationResult<DeviceLinkResultNotifyResponse> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "deviceLinkResultNotify");
        if (deviceLinkResultNotifyRequest == null || iCloudOperationResult == null) {
            LogUtil.j("HWCloudUtils", "deviceLinkResultNotify params is null.please check.");
            return;
        }
        HashMap<String, Object> map = new HashMap<>();
        e(deviceLinkResultNotifyRequest, map);
        this.h.b("/deviceAgent/deviceLinkResultNotify", map, new IHttpOperationResult() { // from class: lqs.17
            @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
            public void operationResult(String str) {
                try {
                    DeviceLinkResultNotifyResponse deviceLinkResultNotifyResponse = (DeviceLinkResultNotifyResponse) new Gson().fromJson(str, DeviceLinkResultNotifyResponse.class);
                    if (deviceLinkResultNotifyResponse == null) {
                        LogUtil.j("HWCloudUtils", "responseEntity is null.");
                        return;
                    }
                    LogUtil.a("HWCloudUtils", "responseEntity ResultCode : ", deviceLinkResultNotifyResponse.getResultCode());
                    if (deviceLinkResultNotifyResponse.getResultCode().intValue() == 0) {
                        iCloudOperationResult.operationResult(deviceLinkResultNotifyResponse, null, true);
                    } else {
                        iCloudOperationResult.operationResult(deviceLinkResultNotifyResponse, null, false);
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", "deviceLinkResultNotify exception : ", ExceptionUtils.c(e2));
                    iCloudOperationResult.operationResult(null, ExceptionUtils.c(e2), false);
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.IHttpOperationResult
            public void exception(int i, Exception exc) {
                LogUtil.a("HWCloudUtils", "deviceLinkResultNotify Exception code: ", Integer.valueOf(i));
                iCloudOperationResult.operationResult(null, ExceptionUtils.c(exc), false);
            }
        });
    }

    public void a(WifiDeviceGetDeviceStatusReq wifiDeviceGetDeviceStatusReq, final ICloudOperationResult<WifiDeviceGetDeviceStatusRsp> iCloudOperationResult) {
        LogUtil.a("HWCloudUtils", "Enter getWifiDeviceStatus");
        String strC = ofe.c(this.f.getBody(wifiDeviceGetDeviceStatusReq));
        Map<String, String> headers = this.f.getHeaders();
        this.f40661b.d(this.f.getRequestUrl(wifiDeviceGetDeviceStatusReq.getUrl()), strC, headers, new WifiRequestCallBack() { // from class: lqs.18
            @Override // com.huawei.hwcloudmodel.callback.WifiRequestCallBack
            public void operationResult(String str) {
                LogUtil.a("HWCloudUtils", "getWifiDeviceStatus in operationResult text=***");
                try {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.j("HWCloudUtils", "getWifiDeviceStatus, json is empty");
                        iCloudOperationResult.operationResult(null, null, false);
                        return;
                    }
                    WifiDeviceGetDeviceStatusRsp wifiDeviceGetDeviceStatusRsp = (WifiDeviceGetDeviceStatusRsp) new Gson().fromJson(str, WifiDeviceGetDeviceStatusRsp.class);
                    if (wifiDeviceGetDeviceStatusRsp != null) {
                        LogUtil.a("HWCloudUtils", "getWifiDeviceStatus ResultCode = ", wifiDeviceGetDeviceStatusRsp.getResultCode());
                        if (wifiDeviceGetDeviceStatusRsp.getResultCode().intValue() == 0) {
                            iCloudOperationResult.operationResult(wifiDeviceGetDeviceStatusRsp, null, true);
                        } else {
                            iCloudOperationResult.operationResult(wifiDeviceGetDeviceStatusRsp, null, false);
                        }
                    }
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("HWCloudUtils", " getWifiDeviceStatus JsonSyntaxException");
                    iCloudOperationResult.operationResult(null, e2.getMessage(), false);
                }
            }
        });
    }
}
