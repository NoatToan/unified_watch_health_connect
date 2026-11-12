package defpackage;

import android.text.TextUtils;
import com.huawei.basichealthmodel.cloud.bean.Record;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.LogAnonymous;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile bwk f1236a;

    private bwk() {
    }

    public static bwk d() {
        if (f1236a == null) {
            synchronized (bwk.class) {
                if (f1236a == null) {
                    f1236a = new bwk();
                }
            }
        }
        return f1236a;
    }

    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            return;
        }
        bwh.b().d(new ResultCallback<bwx>() { // from class: bwk.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(bwx bwxVar) {
                iBaseResponseCallback.a(0, bwxVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.a("HL_HealthModelCloudHelper", "getHealthLife ", LogAnonymous.b(th));
                iBaseResponseCallback.a(-1, null);
            }
        });
    }

    public void c(boolean z, List<Record> list, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            return;
        }
        bwh.b().d(z, list, new ResultCallback<bwi>() { // from class: bwk.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(bwi bwiVar) {
                iBaseResponseCallback.a(0, bwiVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.a("HL_HealthModelCloudHelper", "addHealthLifeConfig ", LogAnonymous.b(th));
                iBaseResponseCallback.a(-1, null);
            }
        });
    }

    public void e(List<Integer> list, List<Integer> list2, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            return;
        }
        bwh.b().b(list, list2, new ResultCallback<bwr>() { // from class: bwk.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(bwr bwrVar) {
                if (bwrVar == null || bwrVar.b() != 0) {
                    LogUtil.j("HL_HealthModelCloudHelper", "getHealthLifeStat fail");
                    iBaseResponseCallback.a(-1, null);
                } else {
                    iBaseResponseCallback.a(0, bwrVar);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.a("HL_HealthModelCloudHelper", "getHealthLifeStat ", LogAnonymous.b(th));
                iBaseResponseCallback.a(-1, null);
            }
        });
    }

    public void c(int i, int i2, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            return;
        }
        bwh.b().e(i, i2, new ResultCallback<bwi>() { // from class: bwk.10
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(bwi bwiVar) {
                if (bwiVar == null || bwiVar.b() != 0) {
                    LogUtil.j("HL_HealthModelCloudHelper", "updateHealthLifeChallenge fail");
                    iBaseResponseCallback.a(-1, null);
                } else {
                    iBaseResponseCallback.a(0, bwiVar);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.a("HL_HealthModelCloudHelper", "updateHealthLifeChallenge ", LogAnonymous.b(th));
                iBaseResponseCallback.a(-1, null);
            }
        });
    }

    public void c(long j, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HL_HealthModelCloudHelper", "queryWeekHealthReport callback is null");
        } else {
            bwh.b().b(j, new ResultCallback<ffp>() { // from class: bwk.7
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ffp ffpVar) {
                    if (ffpVar == null || ffpVar.a() != 0) {
                        LogUtil.j("HL_HealthModelCloudHelper", "queryWeekHealthReport onSuccess response ", ffpVar);
                        iBaseResponseCallback.a(0, null);
                    } else {
                        iBaseResponseCallback.a(0, ffpVar);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.j("HL_HealthModelCloudHelper", "queryWeekHealthReport onFailure ", LogAnonymous.b(th));
                    iBaseResponseCallback.a(-1, null);
                }
            });
        }
    }

    public void b(final ResponseCallback<ffk> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_HealthModelCloudHelper", "getDoctorBasicInfo callback is null");
        } else {
            bwh.b().e(new ResultCallback<ffk>() { // from class: bwk.8
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ffk ffkVar) {
                    if (ffkVar == null || ffkVar.f() != 0) {
                        LogUtil.j("HL_HealthModelCloudHelper", "getDoctorBasicInfo onSuccess response ", ffkVar);
                        responseCallback.onResponse(-1, null);
                    } else {
                        responseCallback.onResponse(0, ffkVar);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.j("HL_HealthModelCloudHelper", "getDoctorBasicInfo onFailure ", LogAnonymous.b(th));
                    responseCallback.onResponse(-1, null);
                }
            });
        }
    }

    public void e(final ResponseCallback<ffj> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_HealthModelCloudHelper", "getDoctorImInfo callback is null");
        } else {
            bwh.b().b(new ResultCallback<ffj>() { // from class: bwk.9
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ffj ffjVar) {
                    if (ffjVar == null || ffjVar.e() != 0) {
                        LogUtil.j("HL_HealthModelCloudHelper", "getDoctorImInfo onSuccess response ", ffjVar);
                        responseCallback.onResponse(-1, null);
                    } else {
                        responseCallback.onResponse(0, ffjVar);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.j("HL_HealthModelCloudHelper", "getDoctorImInfo onFailure ", LogAnonymous.b(th));
                    responseCallback.onResponse(-1, null);
                }
            });
        }
    }

    public void c(final ResponseCallback<ffq> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_HealthModelCloudHelper", "queryInterventionPlanInfo callback is null");
        } else {
            bwh.b().c(new ResultCallback<ffq>() { // from class: bwk.6
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ffq ffqVar) {
                    if (ffqVar == null || ffqVar.a() != 0) {
                        LogUtil.j("HL_HealthModelCloudHelper", "queryInterventionPlanInfo onSuccess response ", ffqVar);
                        responseCallback.onResponse(-1, null);
                    } else {
                        responseCallback.onResponse(0, ffqVar);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.j("HL_HealthModelCloudHelper", "queryInterventionPlanInfo onFailure ", LogAnonymous.b(th));
                    responseCallback.onResponse(-1, null);
                }
            });
        }
    }

    public void e(String str, String str2, final IBaseResponseCallback iBaseResponseCallback) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || iBaseResponseCallback == null) {
            LogUtil.j("HL_HealthModelCloudHelper", "getUserSampleConfigList type ", str, " id ", str2, " callback ", iBaseResponseCallback);
        } else {
            bwh.b().b(str, str2, new ResultCallback<ffo>() { // from class: bwk.2
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ffo ffoVar) {
                    if (ffoVar == null || ffoVar.c() != 0) {
                        LogUtil.j("HL_HealthModelCloudHelper", "getUserSampleConfigList onSuccess response ", ffoVar);
                        iBaseResponseCallback.a(-1, null);
                    } else {
                        iBaseResponseCallback.a(0, ffoVar.e());
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.j("HL_HealthModelCloudHelper", "getUserSampleConfigList onFailure ", LogAnonymous.b(th));
                    iBaseResponseCallback.a(-1, null);
                }
            });
        }
    }

    public void e(List<Integer> list, final ResponseCallback<ffe> responseCallback) {
        bwh.b().d(list, new ResultCallback<bww>() { // from class: bwk.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(bww bwwVar) {
                if (bwwVar == null || bwwVar.b() != 0) {
                    LogUtil.j("HL_HealthModelCloudHelper", "getHealthLifeConDays onSuccess response ", bwwVar);
                    responseCallback.onResponse(-1, null);
                    return;
                }
                ffe ffeVar = new ffe();
                ffeVar.a(DateFormatUtil.a(System.currentTimeMillis()));
                ffeVar.b(bwwVar.e());
                ffeVar.e(bwwVar.d());
                cgc.c(ffeVar);
                LogUtil.a("HL_HealthModelCloudHelper", "HealthTaskConsResponse is ", bwwVar.toString());
                responseCallback.onResponse(0, ffeVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HL_HealthModelCloudHelper", "getHealthLifeConDays onFailure ", LogAnonymous.b(th));
                responseCallback.onResponse(-1, null);
            }
        });
    }
}
