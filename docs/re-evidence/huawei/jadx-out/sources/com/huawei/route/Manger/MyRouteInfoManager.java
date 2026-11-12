package com.huawei.route.Manger;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userprofilemgr.model.RouteResultCallBack;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.DeleteRouteDetailReq;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.networkclient.cache.ICacheStrategy;
import com.huawei.route.AddRouteDetailReq;
import com.huawei.route.GetRouteDetailReq;
import com.huawei.route.GetRouteDetailRsp;
import com.huawei.route.UpdateRouteDetailReq;
import defpackage.njy;
import defpackage.oet;
import defpackage.ofe;
import defpackage.ofg;
import defpackage.ofj;
import health.compact.a.LanguageUtil;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class MyRouteInfoManager {
    private static final long DISK_TIMEOUT = 1;
    private static final String TAG = "MyRouteInfoManager";
    public static final int TYPE_TRACK = 1;
    public static final int TYPE_TRACK_SUMMARY = 0;

    private MyRouteInfoManager() {
    }

    public static void queryRouteDetailOrSummary(final int i, final long j, final RouteResultCallBack<GetRouteDetailRsp> routeResultCallBack) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.route.Manger.MyRouteInfoManager.1
            @Override // java.lang.Runnable
            public void run() {
                GetRouteDetailReq getRouteDetailReq = new GetRouteDetailReq();
                getRouteDetailReq.setType(i);
                getRouteDetailReq.setVersion(j);
                if (i == 0) {
                    oet.d().c(getRouteDetailReq.getUrl(), MyRouteInfoManager.getHealthDataCloudFactory().getHeaders(), ofe.c(MyRouteInfoManager.getHealthDataCloudFactory().getBody(getRouteDetailReq)), GetRouteDetailRsp.class, MyRouteInfoManager.getRouteDetailCallBack(routeResultCallBack));
                } else {
                    oet.d().b(getRouteDetailReq.getUrl(), MyRouteInfoManager.getHealthDataCloudFactory().getHeaders(), ofe.c(MyRouteInfoManager.getHealthDataCloudFactory().getBody(getRouteDetailReq)), GetRouteDetailRsp.class, MyRouteInfoManager.getCacheCallback(routeResultCallBack), MyRouteInfoManager.getCacheStrategy(getRouteDetailReq, j));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ResultCallback<GetRouteDetailRsp> getRouteDetailCallBack(final RouteResultCallBack<GetRouteDetailRsp> routeResultCallBack) {
        return new ResultCallback<GetRouteDetailRsp>() { // from class: com.huawei.route.Manger.MyRouteInfoManager.2
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(GetRouteDetailRsp getRouteDetailRsp) {
                routeResultCallBack.onSuccess(getRouteDetailRsp);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                routeResultCallBack.onFailure(th);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ResultCallback<ofg<GetRouteDetailRsp>> getCacheCallback(final RouteResultCallBack<GetRouteDetailRsp> routeResultCallBack) {
        return new ResultCallback<ofg<GetRouteDetailRsp>>() { // from class: com.huawei.route.Manger.MyRouteInfoManager.3
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(ofg<GetRouteDetailRsp> ofgVar) {
                RouteResultCallBack routeResultCallBack2 = routeResultCallBack;
                if (routeResultCallBack2 != null) {
                    routeResultCallBack2.onSuccess(ofgVar.c());
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                RouteResultCallBack routeResultCallBack2 = routeResultCallBack;
                if (routeResultCallBack2 != null) {
                    routeResultCallBack2.onFailure(th);
                }
            }
        };
    }

    public static void updateRouteDetail(final RouteData routeData, final ResultCallback<CloudCommonReponse> resultCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.route.Manger.MyRouteInfoManager.4
            @Override // java.lang.Runnable
            public void run() {
                UpdateRouteDetailReq updateRouteDetailReq = new UpdateRouteDetailReq();
                updateRouteDetailReq.setType(1);
                updateRouteDetailReq.setRouteData(routeData);
                oet.d().c(updateRouteDetailReq.getUrl(), MyRouteInfoManager.getHealthDataCloudFactory().getHeaders(), ofe.c(MyRouteInfoManager.getHealthDataCloudFactory().getBody(updateRouteDetailReq)), CloudCommonReponse.class, resultCallback);
            }
        });
    }

    public static void deleteRoutes(final List<Long> list, final RouteResultCallBack<CloudCommonReponse> routeResultCallBack) {
        if (njy.e(list)) {
            LogUtil.j(TAG, "deleteRouteDetail routeVersions is empty");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.route.Manger.MyRouteInfoManager.5
                @Override // java.lang.Runnable
                public void run() {
                    DeleteRouteDetailReq deleteRouteDetailReq = new DeleteRouteDetailReq();
                    deleteRouteDetailReq.setType(1);
                    deleteRouteDetailReq.setRouteVersions(list);
                    oet.d().c(deleteRouteDetailReq.getUrl(), MyRouteInfoManager.getHealthDataCloudFactory().getHeaders(), ofe.c(MyRouteInfoManager.getHealthDataCloudFactory().getBody(deleteRouteDetailReq)), CloudCommonReponse.class, MyRouteInfoManager.getResultCallBack(routeResultCallBack));
                }
            });
        }
    }

    public static void addRouteDetails(final List<RouteData> list, final RouteResultCallBack<CloudCommonReponse> routeResultCallBack) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.route.Manger.MyRouteInfoManager.6
            @Override // java.lang.Runnable
            public void run() {
                AddRouteDetailReq addRouteDetailReq = new AddRouteDetailReq();
                addRouteDetailReq.setType(1);
                addRouteDetailReq.setRouteDatas(list);
                oet.d().c(addRouteDetailReq.getUrl(), MyRouteInfoManager.getHealthDataCloudFactory().getHeaders(), ofe.c(MyRouteInfoManager.getHealthDataCloudFactory().getBody(addRouteDetailReq)), CloudCommonReponse.class, MyRouteInfoManager.getResultCallBack(routeResultCallBack));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ResultCallback<CloudCommonReponse> getResultCallBack(final RouteResultCallBack<CloudCommonReponse> routeResultCallBack) {
        return new ResultCallback<CloudCommonReponse>() { // from class: com.huawei.route.Manger.MyRouteInfoManager.7
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                routeResultCallBack.onSuccess(cloudCommonReponse);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                routeResultCallBack.onFailure(th);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HealthDataCloudFactory getHealthDataCloudFactory() {
        return new HealthDataCloudFactory(BaseApplication.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ICacheStrategy getCacheStrategy(final GetRouteDetailReq getRouteDetailReq, final long j) {
        return new ICacheStrategy() { // from class: com.huawei.route.Manger.MyRouteInfoManager.8
            @Override // com.huawei.networkclient.cache.ICacheStrategy
            public int getCacheStrategy() {
                return 1;
            }

            @Override // com.huawei.networkclient.cache.ICacheStrategy
            public boolean needEncrypt() {
                return false;
            }

            @Override // com.huawei.networkclient.cache.ICacheStrategy
            public Long getDiskTimeOut() {
                return 1L;
            }

            @Override // com.huawei.networkclient.cache.ICacheStrategy
            public TimeUnit getDiskTimeUnit() {
                return TimeUnit.MINUTES;
            }

            @Override // com.huawei.networkclient.cache.ICacheStrategy
            public String getKey() {
                return ofj.d(getRouteDetailReq.getUrl(), LanguageUtil.a(), String.valueOf(j));
            }
        };
    }
}
