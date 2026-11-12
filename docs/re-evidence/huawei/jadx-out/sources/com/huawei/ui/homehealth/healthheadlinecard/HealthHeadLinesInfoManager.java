package com.huawei.ui.homehealth.healthheadlinecard;

import android.os.Looper;
import com.google.gson.JsonSyntaxException;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import defpackage.fxl;
import defpackage.ltb;
import defpackage.njy;
import defpackage.oet;
import defpackage.ofe;
import defpackage.pap;
import defpackage.pjn;
import defpackage.qrs;
import defpackage.sls;
import defpackage.smh;
import defpackage.smk;
import defpackage.sml;
import defpackage.smm;
import defpackage.smn;
import defpackage.smo;
import defpackage.smp;
import defpackage.smt;
import defpackage.sni;
import defpackage.snj;
import defpackage.snk;
import defpackage.snl;
import defpackage.snm;
import defpackage.snn;
import defpackage.sno;
import defpackage.snt;
import defpackage.sny;
import defpackage.sob;
import defpackage.soc;
import health.compact.a.ReleaseLogUtil;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class HealthHeadLinesInfoManager {
    private static volatile HealthHeadLinesInfoManager d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HealthHeadLinesApi f25534c = (HealthHeadLinesApi) oet.d().e(HealthHeadLinesApi.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ParamsFactory f25533b = new HealthHeadlinesFactory(BaseApplication.getContext());

    public interface RequestCallBack<T, V> {
        void onFailure(int i, String str);

        void onSuccess(T t, V v);
    }

    private HealthHeadLinesInfoManager() {
    }

    public static HealthHeadLinesInfoManager d() {
        if (d == null) {
            synchronized (HealthHeadLinesInfoManager.class) {
                if (d == null) {
                    d = new HealthHeadLinesInfoManager();
                }
            }
        }
        return d;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(final String str, final long j, final long j2) {
        ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "setWorkOutPost");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: smd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48357c.a(str, j, j2);
                }
            });
            return;
        }
        smt smtVar = new smt();
        smtVar.a(j);
        smtVar.a(str);
        smtVar.e(System.currentTimeMillis());
        smtVar.c(0);
        smtVar.b(pap.e());
        smtVar.d(j2);
        Map<String, String> headers = this.f25533b.getHeaders();
        String strC = ofe.c(this.f25533b.getBody(smtVar));
        LogUtil.a("HealthHeadLinesInfoManager", "setWorkOutPost apply url: ", smtVar.getUrl(), " apply headers:", this.f25533b.getHeaders().toString(), " apply body: ", strC);
        try {
            Response<snt> responseExecute = this.f25534c.setWorkoutPlay(smtVar.getUrl(), headers, strC).execute();
            if (!responseExecute.isOK()) {
                ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "response code is: ", Integer.valueOf(responseExecute.getCode()));
                return;
            }
            ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "setWorkOutPost response is OK.");
            snt body = responseExecute.getBody();
            if (body == null) {
                return;
            }
            ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "setWorkOutPost apply resultCode: ", body.b());
            if ("0".equals(body.b())) {
                smp.b().ad();
            }
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "setWorkOutPost exception");
        }
    }

    public void b(final UiCallback<List<snn>> uiCallback, final long j, final long j2) {
        ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getWorkoutListHistoryRsp");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: smb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48350a.e(uiCallback, j, j2);
                }
            });
            return;
        }
        smn smnVar = new smn();
        String strD = DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD);
        String strD2 = DateFormatUtil.d(j2, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD);
        smnVar.b(strD);
        smnVar.a(strD2);
        smnVar.d(pap.e());
        Map<String, String> headers = this.f25533b.getHeaders();
        String strC = ofe.c(this.f25533b.getBody(smnVar));
        LogUtil.a("HealthHeadLinesInfoManager", "getWorkoutListHistory startDate = ", strD, ", endDate = ", strD2, ", apply url: ", smnVar.getUrl(), " getWorkoutListHistory apply headers:", this.f25533b.getHeaders().toString(), " getWorkoutListHistory apply body: ", strC);
        try {
            Response<snj> responseExecute = this.f25534c.getWorkoutListHistory(smnVar.getUrl(), headers, strC).execute();
            if (!responseExecute.isOK()) {
                ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "response code is ", Integer.valueOf(responseExecute.getCode()));
                return;
            }
            ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getWorkoutListHistory response is OK.");
            snj body = responseExecute.getBody();
            if (body == null) {
                uiCallback.onFailure(1, "getWorkoutListHistory responseBody is null");
                return;
            }
            ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getWorkoutListHistory apply resultCode: ", body.e());
            if (!"0".equals(body.e())) {
                LogUtil.j("HealthHeadLinesInfoManager", "getWorkoutListHistory apply resultDesc: ", body.b());
                uiCallback.onFailure(1, "getWorkoutListHistory responseBody is error");
                return;
            }
            List<snn> listC = body.c();
            if (njy.e(listC)) {
                ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "workoutHistoryList is empty");
                uiCallback.onFailure(1, "workoutHistoryList is empty");
            } else {
                ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "workoutHistoryList size =", Integer.valueOf(listC.size()));
                uiCallback.onSuccess(listC);
            }
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getWorkoutListHistory exception");
        }
    }

    public /* synthetic */ void e(UiCallback uiCallback, long j, long j2) {
        b((UiCallback<List<snn>>) uiCallback, j, j2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(final String str, final RequestCallBack<List<sni>, Integer> requestCallBack, final int i) {
        ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getWorkoutListHistoryRsp");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: slv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48337c.d(str, requestCallBack, i);
                }
            });
            return;
        }
        smo smoVar = new smo();
        boolean zIsTv = BaseApplication.isTv();
        smoVar.c(str);
        smoVar.e(zIsTv ? 1 : 0);
        smoVar.a(i);
        smoVar.a("5");
        smoVar.c(qrs.a(fxl.d()));
        smoVar.d(pjn.b(null));
        smoVar.d(System.currentTimeMillis());
        Map<String, String> headers = this.f25533b.getHeaders();
        String strC = ofe.c(this.f25533b.getBody(smoVar));
        LogUtil.a("HealthHeadLinesInfoManager", "getWorkoutsByTopicId apply url: ", smoVar.getUrl(), " getWorkoutsByTopicId apply headers:", this.f25533b.getHeaders().toString(), " getWorkoutsByTopicId apply body: ", strC);
        try {
            Response<snm> responseExecute = this.f25534c.getWorkoutsByTopicId(smoVar.getUrl(), headers, strC).execute();
            if (!responseExecute.isOK()) {
                ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "response code is ", Integer.valueOf(responseExecute.getCode()));
                return;
            }
            ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getWorkoutsByTopicId response is OK.");
            snm body = responseExecute.getBody();
            if (body == null) {
                ReleaseLogUtil.d("R_HealthHeadLinesInfoManager", "getWorkoutsByTopicId responseBody is empty");
                requestCallBack.onFailure(1, "getWorkoutsByTopicId responseBody is null");
                return;
            }
            LogUtil.a("HealthHeadLinesInfoManager", "getWorkoutsByTopicId apply resultCode: ", body.d(), " getWorkoutsByTopicId apply resultDesc: ", body.b());
            if (!"0".equals(body.d())) {
                ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getWorkoutsByTopicId apply resultCode: ", body.d());
                requestCallBack.onFailure(1, "getWorkoutListHistory responseBody is error");
                return;
            }
            smp.b().f(body.c());
            List<sni> listE = body.e();
            if (njy.e(listE)) {
                ReleaseLogUtil.d("R_HealthHeadLinesInfoManager", "getWorkoutsByTopicId workoutByTopicList is empty");
                requestCallBack.onFailure(1, "workoutByTopicList is empty");
            } else {
                ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "workoutByTopicList size", Integer.valueOf(listE.size()));
                requestCallBack.onSuccess(listE, Integer.valueOf(body.a()));
            }
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getWorkoutsByTopicId exception");
        }
    }

    public /* synthetic */ void d(String str, RequestCallBack requestCallBack, int i) {
        a(str, (RequestCallBack<List<sni>, Integer>) requestCallBack, i);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(final String str, final UiCallback<List<snk>> uiCallback) {
        ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getLecturerInfo");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: sme
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48358a.a(str, uiCallback);
                }
            });
            return;
        }
        smk smkVar = new smk();
        smkVar.b(str);
        smkVar.c(System.currentTimeMillis());
        Map<String, String> headers = this.f25533b.getHeaders();
        String strC = ofe.c(this.f25533b.getBody(smkVar));
        LogUtil.a("HealthHeadLinesInfoManager", "getLecturerInfoRsp apply url: ", smkVar.getUrl(), " getLecturerInfoRsp apply headers:", this.f25533b.getHeaders().toString(), " getLecturerInfoRsp apply body: ", strC);
        try {
            Response<snl> responseExecute = this.f25534c.getLecturerInfo(smkVar.getUrl(), headers, strC).execute();
            if (!responseExecute.isOK()) {
                ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "response code is ", Integer.valueOf(responseExecute.getCode()));
                return;
            }
            ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getLecturerInfoRsp response is OK.");
            snl body = responseExecute.getBody();
            if (body == null) {
                ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getLecturerInfoRsp responseBody is null");
                uiCallback.onFailure(1, "getLecturerInfoRsp responseBody is null");
                return;
            }
            LogUtil.a("HealthHeadLinesInfoManager", "getLecturerInfoRsp apply resultCode: ", body.b(), " getLecturerInfoRsp apply resultDesc: ", body.a());
            if (!"0".equals(body.b())) {
                ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getLecturerInfoRsp apply resultCode: ", body.b());
                uiCallback.onFailure(1, "getLecturerInfoRsp responseBody is error");
                return;
            }
            String strE = body.e();
            String strD = body.d();
            List<snk> listC = body.c();
            for (snk snkVar : listC) {
                snkVar.a(strE);
                snkVar.c(strD);
            }
            if (njy.e(listC)) {
                ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getLecturerInfoRsp lecturerWorks is empty");
                uiCallback.onFailure(1, "lectureDetail is empty");
            } else {
                ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "lectureDetail size ", Integer.valueOf(listC.size()));
                uiCallback.onSuccess(listC);
            }
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getLecturerInfoRsp exception");
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(final UiCallback<List<snk>> uiCallback) {
        ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getUserBehaviorListRsp");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: sly
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(uiCallback);
                }
            });
            return;
        }
        smm smmVar = new smm();
        smmVar.d(System.currentTimeMillis());
        Map<String, String> headers = this.f25533b.getHeaders();
        String strC = ofe.c(this.f25533b.getBody(smmVar));
        LogUtil.a("HealthHeadLinesInfoManager", "getUserBehaviorListRsp apply url: ", smmVar.getUrl(), " getUserBehaviorListRsp apply headers:", this.f25533b.getHeaders().toString(), " getUserBehaviorListRsp apply body: ", strC);
        try {
            Response<sob> responseExecute = this.f25534c.userBehaviorList(smmVar.getUrl(), headers, strC).execute();
            if (!responseExecute.isOK()) {
                ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "response code is ", Integer.valueOf(responseExecute.getCode()));
                return;
            }
            ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getUserBehaviorListRsp response is OK.");
            sob body = responseExecute.getBody();
            if (body == null) {
                ReleaseLogUtil.d("R_HealthHeadLinesInfoManager", "getUserBehaviorListRsp responseBody is null");
                uiCallback.onFailure(1, "getUserBehaviorListRsp responseBody is null");
                return;
            }
            LogUtil.a("HealthHeadLinesInfoManager", "getUserBehaviorListRsp apply resultCode: ", body.e(), " getUserBehaviorListRsp apply resultDesc: ", body.a());
            if (!"0".equals(body.e())) {
                ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getUserBehaviorListRsp apply resultCode: ", body.e());
                uiCallback.onFailure(1, "getUserBehaviorListRsp responseBody is error");
                return;
            }
            List<snk> listB = body.b();
            if (njy.e(listB)) {
                ReleaseLogUtil.d("R_HealthHeadLinesInfoManager", "audioWorkoutLists lectureDetail is empty");
                uiCallback.onFailure(1, "lectureDetail is empty");
            } else {
                ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "audioWorkoutLists size ", Integer.valueOf(listB.size()));
                uiCallback.onSuccess(listB);
            }
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getUserBehaviorListRsp exception");
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void j(final UiCallback<List<snk>> uiCallback) {
        ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getUserPlayRecordRsp");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: slz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48342b.j(uiCallback);
                }
            });
            return;
        }
        sml smlVar = new sml();
        smlVar.a(System.currentTimeMillis());
        Map<String, String> headers = this.f25533b.getHeaders();
        String strC = ofe.c(this.f25533b.getBody(smlVar));
        LogUtil.a("HealthHeadLinesInfoManager", "getUserPlayRecordRsp apply url: ", smlVar.getUrl(), " getUserPlayRecordRsp apply headers:", this.f25533b.getHeaders().toString(), " getUserPlayRecordRsp apply body: ", strC);
        try {
            Response<sny> responseExecute = this.f25534c.userPlayRecord(smlVar.getUrl(), headers, strC).execute();
            if (!responseExecute.isOK()) {
                ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "response code is ", Integer.valueOf(responseExecute.getCode()));
                return;
            }
            ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getUserPlayRecordRsp response is OK.");
            sny body = responseExecute.getBody();
            if (body == null) {
                uiCallback.onFailure(1, "getUserPlayRecordRsp responseBody is null");
                return;
            }
            LogUtil.a("HealthHeadLinesInfoManager", "getUserPlayRecordRsp apply resultCode: ", body.e(), " getUserPlayRecordRsp apply resultDesc: ", body.b());
            if (!"0".equals(body.e())) {
                ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getUserPlayRecordRsp apply resultCode: ", body.e());
                uiCallback.onFailure(1, "getUserPlayRecordRsp responseBody is error");
                return;
            }
            List<snk> listA = body.a();
            if (njy.e(listA)) {
                ReleaseLogUtil.d("R_HealthHeadLinesInfoManager", "audioWorkoutLists is empty ");
                uiCallback.onFailure(1, "audioWorkoutLists is empty");
            } else {
                ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "audioWorkoutLists size=", Integer.valueOf(listA.size()));
                uiCallback.onSuccess(listA);
            }
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getUserPlayRecordRsp exception");
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(final UiCallback<Long> uiCallback) {
        ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getUserAccumulatedPlayDuration");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: slx
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(uiCallback);
                }
            });
            return;
        }
        smh smhVar = new smh();
        smhVar.c(ltb.m(new Date()) * 1000);
        smhVar.a(System.currentTimeMillis());
        Map<String, String> headers = this.f25533b.getHeaders();
        String strC = ofe.c(this.f25533b.getBody(smhVar));
        LogUtil.a("HealthHeadLinesInfoManager", "getUserAccumulatedPlayDuration apply url: ", smhVar.getUrl(), " apply headers:", this.f25533b.getHeaders().toString(), " apply body: ", strC);
        try {
            Response<soc> responseExecute = this.f25534c.userAccumulatedPlayDuration(smhVar.getUrl(), headers, strC).execute();
            if (!responseExecute.isOK()) {
                ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getUserAccumulatedPlayDuration response code is ", Integer.valueOf(responseExecute.getCode()));
                return;
            }
            ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getUserAccumulatedPlayDuration response is OK.");
            soc body = responseExecute.getBody();
            if (body == null) {
                ReleaseLogUtil.d("R_HealthHeadLinesInfoManager", "getUserAccumulatedPlayDuration responseBody is null");
                uiCallback.onFailure(1, "getUserAccumulatedPlayDuration responseBody is null");
                return;
            }
            LogUtil.a("HealthHeadLinesInfoManager", "getUserAccumulatedPlayDuration apply resultCode: ", body.c(), " getUserAccumulatedPlayDuration apply resultDesc: ", body.d());
            if (!"0".equals(body.c())) {
                ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getUserAccumulatedPlayDuration apply resultCode: ", body.c());
                uiCallback.onFailure(1, "getUserAccumulatedPlayDuration responseBody is error");
            } else {
                long jE = body.e();
                ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "User accumulated duration is: ", Long.valueOf(jE));
                uiCallback.onSuccess(Long.valueOf(jE));
            }
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getUserAccumulatedPlayDuration exception");
        }
    }

    public void b(final long j, final long j2, final UiCallback<soc> uiCallback) {
        ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getUserAccumulatedPlayDurationInfo startTime=" + j + " endTime=" + j2);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: slw
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(j, j2, uiCallback);
                }
            });
            return;
        }
        smh smhVar = new smh();
        smhVar.c(j);
        smhVar.a(j2);
        Map<String, String> headers = this.f25533b.getHeaders();
        String strC = ofe.c(this.f25533b.getBody(smhVar));
        LogUtil.a("HealthHeadLinesInfoManager", "getUserAccumulatedPlayDurationInfo apply url: ", smhVar.getUrl());
        try {
            Response<soc> responseExecute = this.f25534c.userAccumulatedPlayDuration(smhVar.getUrl(), headers, strC).execute();
            if (responseExecute.isOK()) {
                ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getUserAccumulatedPlayDurationInfo response is OK.");
                soc body = responseExecute.getBody();
                if (body == null) {
                    ReleaseLogUtil.d("R_HealthHeadLinesInfoManager", "getUserAccumulatedPlayDurationInfo responseBody is null");
                    uiCallback.onFailure(1, "responseBody is null");
                    return;
                }
                LogUtil.a("HealthHeadLinesInfoManager", "getUserAccumulatedPlayDurationInfo resultCode: ", body.c(), " totalCount: ", Integer.valueOf(body.b()), " duration: ", Long.valueOf(body.e()));
                if (!"0".equals(body.c())) {
                    ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getUserAccumulatedPlayDurationInfo resultCode error");
                    uiCallback.onFailure(1, "resultCode error");
                    return;
                } else {
                    uiCallback.onSuccess(body);
                    return;
                }
            }
            ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getUserAccumulatedPlayDurationInfo response code is ", Integer.valueOf(responseExecute.getCode()));
            uiCallback.onFailure(1, "response code error");
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getUserAccumulatedPlayDurationInfo exception");
            uiCallback.onFailure(1, TrackConstants$Events.EXCEPTION);
        }
    }

    public /* synthetic */ void c(long j, long j2, UiCallback uiCallback) {
        b(j, j2, (UiCallback<soc>) uiCallback);
    }

    public void d(final long j, final long j2, final UiCallback<sno> uiCallback) {
        ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getSleepMusicBehaviorList startTime=" + j + " endTime=" + j2);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: smc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48354c.a(j, j2, uiCallback);
                }
            });
            return;
        }
        sls slsVar = new sls();
        slsVar.c(1);
        slsVar.e(100);
        slsVar.d(1);
        slsVar.a(1000622);
        slsVar.e(j);
        slsVar.d(j2);
        Map<String, String> headers = this.f25533b.getHeaders();
        String strC = ofe.c(this.f25533b.getBody(slsVar));
        LogUtil.a("HealthHeadLinesInfoManager", "getSleepMusicBehaviorList apply url: ", slsVar.getUrl());
        try {
            Response<sno> responseExecute = this.f25534c.getBehaviorList(slsVar.getUrl(), headers, strC).execute();
            if (responseExecute.isOK()) {
                ReleaseLogUtil.c("R_HealthHeadLinesInfoManager", "getSleepMusicBehaviorList response is OK.");
                sno body = responseExecute.getBody();
                if (body == null) {
                    ReleaseLogUtil.d("R_HealthHeadLinesInfoManager", "getSleepMusicBehaviorList responseBody is null");
                    uiCallback.onFailure(1, "responseBody is null");
                    return;
                }
                LogUtil.a("HealthHeadLinesInfoManager", "getSleepMusicBehaviorList resultCode: ", body.d(), " totalCount: ", Integer.valueOf(body.b()));
                if (!"0".equals(body.d())) {
                    ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getSleepMusicBehaviorList resultCode error");
                    uiCallback.onFailure(1, "resultCode error");
                    return;
                } else {
                    uiCallback.onSuccess(body);
                    return;
                }
            }
            ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getSleepMusicBehaviorList response code is ", Integer.valueOf(responseExecute.getCode()));
            uiCallback.onFailure(1, "response code error");
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            ReleaseLogUtil.b("R_HealthHeadLinesInfoManager", "getSleepMusicBehaviorList exception");
            uiCallback.onFailure(1, TrackConstants$Events.EXCEPTION);
        }
    }

    public /* synthetic */ void a(long j, long j2, UiCallback uiCallback) {
        d(j, j2, (UiCallback<sno>) uiCallback);
    }
}
