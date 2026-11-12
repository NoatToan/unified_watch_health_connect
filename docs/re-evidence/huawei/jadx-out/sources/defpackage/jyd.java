package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.unite.GetLacticStatisticsReq;
import com.huawei.hwcloudmodel.model.unite.GetLacticStatisticsRsp;
import com.huawei.hwcloudmodel.model.unite.GetLatestLacticReq;
import com.huawei.hwcloudmodel.model.unite.GetLatestLacticRsp;
import com.huawei.hwcloudmodel.model.unite.GetLoadPeakReq;
import com.huawei.hwcloudmodel.model.unite.GetLoadPeakRsp;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelReq;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelRsp;
import com.huawei.hwcloudmodel.model.unite.LacticBasic;
import com.huawei.hwcloudmodel.model.unite.LacticData;
import com.huawei.hwcloudmodel.model.unite.LacticStatistics;
import com.huawei.hwcloudmodel.model.unite.RunLevelDetail;
import com.huawei.hwcloudmodel.model.unite.UserRunLevelData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jyd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39205c;
    private gzp d = new gzp();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HiUserPreference f39204b = new HiUserPreference();
    private Context e = BaseApplication.b();

    public void b(final Context context, final int i) {
        if (context == null) {
            ReleaseLogUtil.a("Track_RQDataManager", "pushRQDataToDevice: context is null");
        } else {
            lsy.a(new Runnable() { // from class: jyd.1
                @Override // java.lang.Runnable
                public void run() {
                    if (jyd.this.f39205c) {
                        ReleaseLogUtil.d("Track_RQDataManager", "RqData has been pushed!");
                        return;
                    }
                    GetRunLevelReq getRunLevelReq = new GetRunLevelReq();
                    LogUtil.a("Track_RQDataManager", "testInitData: ", Integer.valueOf(i));
                    getRunLevelReq.setStartDay(i);
                    getRunLevelReq.setEndDay(i);
                    getRunLevelReq.setQueryType(0);
                    HashSet hashSet = new HashSet(16);
                    hashSet.add(1);
                    hashSet.add(2);
                    hashSet.add(3);
                    hashSet.add(4);
                    hashSet.add(5);
                    hashSet.add(6);
                    getRunLevelReq.setTypes(hashSet);
                    getRunLevelReq.setTimeZone(ieg.d());
                    LogUtil.a("Track_RQDataManager", getRunLevelReq.toString());
                    lqo.b(context).c(getRunLevelReq, new ResultCallback<GetRunLevelRsp>() { // from class: jyd.1.3
                        @Override // com.huawei.networkclient.ResultCallback
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(GetRunLevelRsp getRunLevelRsp) {
                            ReleaseLogUtil.d("Track_RQDataManager", "pushRqDataToDevice: GetRunLevelRsp success");
                            jyd.this.b(getRunLevelRsp);
                            if (jyd.this.d == null) {
                                ReleaseLogUtil.a("Track_RQDataManager", "Failed to parse rqData");
                            } else {
                                jyd.this.d(context, i, jyd.this.d);
                            }
                        }

                        @Override // com.huawei.networkclient.ResultCallback
                        public void onFailure(Throwable th) {
                            ReleaseLogUtil.a("Track_RQDataManager", "getRunLevelDetail: request fail");
                            if (TextUtils.isEmpty(th.getMessage())) {
                                ReleaseLogUtil.a("Track_RQDataManager", "getRunLevelDetail: request fail and throwable.getMessage is null");
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(GetRunLevelRsp getRunLevelRsp) {
        if (getRunLevelRsp == null) {
            ReleaseLogUtil.a("Track_RQDataManager", "getRqData runLevelRsp is null");
            return;
        }
        Map<Integer, RunLevelDetail> data = getRunLevelRsp.getData();
        UserRunLevelData userRunLevelData = getRunLevelRsp.getUserRunLevelData();
        if (data == null || userRunLevelData == null) {
            ReleaseLogUtil.a("Track_RQDataManager", "runLevelDetails or userRunLevelData is null");
            return;
        }
        this.d.e(data);
        this.d.e(userRunLevelData);
        this.d.b((int) (System.currentTimeMillis() / 1000));
        ReleaseLogUtil.d("Track_RQDataManager", "runLevelRsp convert to rqdata success!");
    }

    public void d(Context context, int i, gzp gzpVar) {
        if (gzpVar == null) {
            ReleaseLogUtil.e("Track_RQDataManager", "pushToDevice rqData is null");
            return;
        }
        RunLevelDetail runLevelDetail = gzpVar.a().get(Integer.valueOf(i));
        UserRunLevelData userRunLevelDataE = gzpVar.e();
        if (runLevelDetail == null || userRunLevelDataE == null) {
            ReleaseLogUtil.a("Track_RQDataManager", "runLevelDetail or userRunLevelData is null");
        } else {
            jye.d(context).e(gzpVar, i, false, new IBaseResponseCallback() { // from class: jyd.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.a("Track_RQDataManager", "mDeviceResponseCallback errorCode = ", Integer.valueOf(i2));
                    if (i2 == 0) {
                        ReleaseLogUtil.d("Track_RQDataManager", "mDeviceResponseCallback success");
                        jyd.this.f39204b.setKey("track.rq_config");
                        HashMap map = new HashMap();
                        map.put("isSyncOrNot", Boolean.toString(true));
                        jyd.this.f39204b.setValue(peh.c(map));
                        HiHealthManager.d(jyd.this.e).setUserPreference(jyd.this.f39204b);
                        return;
                    }
                    ReleaseLogUtil.d("Track_RQDataManager", "mDeviceResponseCallback something error");
                }
            });
        }
    }

    public void c(Context context, int i, int i2, int i3, final IBaseResponseCallback iBaseResponseCallback) {
        if (context == null || iBaseResponseCallback == null) {
            return;
        }
        GetRunLevelReq getRunLevelReq = new GetRunLevelReq();
        getRunLevelReq.setStartDay(i);
        getRunLevelReq.setEndDay(i2);
        getRunLevelReq.setQueryType(i3);
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        getRunLevelReq.setTypes(hashSet);
        getRunLevelReq.setTimeZone(ieg.d());
        LogUtil.a("Track_RQDataManager", getRunLevelReq.toString());
        lqo.b(context.getApplicationContext()).c(getRunLevelReq, new ResultCallback<GetRunLevelRsp>(this) { // from class: jyd.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(GetRunLevelRsp getRunLevelRsp) {
                if (getRunLevelRsp == null) {
                    ReleaseLogUtil.e("getRunLevel, resp is null", new Object[0]);
                    return;
                }
                LogUtil.a("Track_RQDataManager", getRunLevelRsp.toString());
                if (getRunLevelRsp.getUserRunLevelData() != null) {
                    ReleaseLogUtil.d("Track_RQDataManager", getRunLevelRsp.printString());
                } else {
                    ReleaseLogUtil.e("Track_RQDataManager", "userRunLevel is null");
                }
                if (getRunLevelRsp.getResultCode().intValue() == 0) {
                    iBaseResponseCallback.a(200, getRunLevelRsp);
                } else {
                    iBaseResponseCallback.a(2, getRunLevelRsp);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("Track_RQDataManager", "getRunlevel error:", th.getMessage());
                iBaseResponseCallback.a(2, null);
            }
        });
    }

    public void d(Context context, long j, long j2, int i, final IBaseResponseCallback iBaseResponseCallback) {
        if (context == null || iBaseResponseCallback == null) {
            LogUtil.c("Track_RQDataManager", "getLoadPeakData context: ", context, ", callback: ", iBaseResponseCallback);
            return;
        }
        GetLoadPeakReq getLoadPeakReq = new GetLoadPeakReq();
        getLoadPeakReq.setStartDay(j);
        getLoadPeakReq.setEndDay(j2);
        getLoadPeakReq.setType(i);
        getLoadPeakReq.setDataType(2);
        getLoadPeakReq.setDeviceCode(0);
        LogUtil.a("Track_RQDataManager", getLoadPeakReq.toString());
        lqo.b(context.getApplicationContext()).e(getLoadPeakReq, new ResultCallback<GetLoadPeakRsp>(this) { // from class: jyd.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(GetLoadPeakRsp getLoadPeakRsp) {
                if (getLoadPeakRsp == null) {
                    onFailure(new Throwable("response is null"));
                    return;
                }
                LogUtil.a("Track_RQDataManager", "GetLoadPeakRsp response: ", getLoadPeakRsp.toString());
                if (getLoadPeakRsp.getData() == null) {
                    onFailure(new Throwable("data is null"));
                } else {
                    iBaseResponseCallback.a(getLoadPeakRsp.getResultCode().intValue(), getLoadPeakRsp);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("Track_RQDataManager", "getLoadPeakData error:", th.getMessage());
                iBaseResponseCallback.a(2, null);
            }
        });
    }

    public void b(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        if (context == null || iBaseResponseCallback == null) {
            LogUtil.c("Track_RQDataManager", "getLatestLacticData context: ", context, ", callback: ", iBaseResponseCallback);
            return;
        }
        GetLatestLacticReq getLatestLacticReq = new GetLatestLacticReq();
        getLatestLacticReq.setTimestamp(System.currentTimeMillis());
        getLatestLacticReq.setCounts(1);
        getLatestLacticReq.setType(300012);
        getLatestLacticReq.setDataType(0);
        LogUtil.a("Track_RQDataManager", getLatestLacticReq.toString());
        lqo.b(context.getApplicationContext()).c(getLatestLacticReq, new ResultCallback<GetLatestLacticRsp>() { // from class: jyd.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(GetLatestLacticRsp getLatestLacticRsp) {
                if (getLatestLacticRsp == null) {
                    onFailure(new Throwable("response is null"));
                    return;
                }
                LogUtil.a("Track_RQDataManager", "getLatestLacticData response: ", getLatestLacticRsp.toString());
                iBaseResponseCallback.a(getLatestLacticRsp.getResultCode().intValue(), jyd.this.b(getLatestLacticRsp));
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("Track_RQDataManager", "getLatestLacticData error:", th.getMessage());
                iBaseResponseCallback.a(2, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LacticBasic b(GetLatestLacticRsp getLatestLacticRsp) {
        List<LacticData> detailInfos = getLatestLacticRsp.getDetailInfos();
        if (njy.e(detailInfos)) {
            return null;
        }
        LacticData lacticData = detailInfos.get(0);
        if (njy.e(lacticData.getSamplePoints())) {
            return null;
        }
        return (LacticBasic) HiJsonUtil.d(lacticData.getSamplePoints().get(0).getValue(), LacticBasic.class);
    }

    public void c(Context context, long j, long j2, final int i, final IBaseResponseCallback iBaseResponseCallback) {
        if (context == null || iBaseResponseCallback == null) {
            LogUtil.c("Track_RQDataManager", "getLacticStatisticsData context: ", context, ", callback: ", iBaseResponseCallback);
            return;
        }
        GetLacticStatisticsReq getLacticStatisticsReq = new GetLacticStatisticsReq();
        getLacticStatisticsReq.setStartTime(DateFormatUtil.a(j));
        getLacticStatisticsReq.setEndTime(DateFormatUtil.a(j2));
        getLacticStatisticsReq.setType(new int[]{i});
        LogUtil.a("Track_RQDataManager", getLacticStatisticsReq.toString());
        lqo.b(context.getApplicationContext()).b(getLacticStatisticsReq, new ResultCallback<GetLacticStatisticsRsp>(this) { // from class: jyd.7
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(GetLacticStatisticsRsp getLacticStatisticsRsp) {
                if (getLacticStatisticsRsp == null) {
                    onFailure(new Throwable("response is null"));
                    return;
                }
                LogUtil.a("Track_RQDataManager", "getLacticStatisticsData response: ", getLacticStatisticsRsp.toString());
                if (getLacticStatisticsRsp.getStatisticTotal() == null) {
                    onFailure(new Throwable("data is null"));
                } else {
                    iBaseResponseCallback.a(getLacticStatisticsRsp.getResultCode().intValue(), jyd.c(getLacticStatisticsRsp, i));
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("Track_RQDataManager", "getLacticStatisticsData error:", th.getMessage());
                iBaseResponseCallback.a(2, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<LacticStatistics> c(GetLacticStatisticsRsp getLacticStatisticsRsp, int i) {
        Map<Integer, List<LacticStatistics>> statisticTotal = getLacticStatisticsRsp.getStatisticTotal();
        List<LacticStatistics> arrayList = new ArrayList<>();
        for (Map.Entry<Integer, List<LacticStatistics>> entry : statisticTotal.entrySet()) {
            if (entry.getKey().intValue() == i) {
                arrayList = entry.getValue();
            }
        }
        return arrayList;
    }
}
