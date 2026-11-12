package defpackage;

import android.text.TextUtils;
import com.huawei.basichealthmodel.cloud.HealthModelParamsFactory;
import com.huawei.basichealthmodel.cloud.bean.Record;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bwh extends HwBaseManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile bwh f1231c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ParamsFactory f1232b;

    private bwh() {
        super(BaseApplication.b());
        this.f1232b = new HealthModelParamsFactory(BaseApplication.b());
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return Integer.valueOf(CapabilityStatus.AWA_CAP_CODE_APPLICATION);
    }

    public static bwh b() {
        if (f1231c == null) {
            synchronized (bwh.class) {
                if (f1231c == null) {
                    f1231c = new bwh();
                }
            }
        }
        return f1231c;
    }

    private <T> T a(String str, Map<String, String> map, String str2, Class<T> cls) {
        try {
            return (T) oet.d().e(str, map, str2, cls);
        } catch (OutOfMemoryError e) {
            LogUtil.e("HL_HealthModelCloudManager", "callHttpPost error ", LogAnonymous.b(e), " url ", str, " headers ", map, " body ", str2, " responseType ", cls);
            return null;
        }
    }

    private <T> void d(String str, Map<String, String> map, String str2, Class<T> cls, ResultCallback<T> resultCallback) {
        try {
            oet.d().c(str, map, str2, cls, resultCallback);
        } catch (OutOfMemoryError e) {
            LogUtil.e("HL_HealthModelCloudManager", "callHttpPost error ", LogAnonymous.b(e), " url ", str, " headers ", map, " body ", str2, " responseType ", cls, " callback ", resultCallback);
        }
    }

    public void d(ResultCallback<bwx> resultCallback) {
        bwq bwqVar = new bwq();
        String strC = ofe.c(this.f1232b.getBody(bwqVar));
        LogUtil.a("HL_HealthModelCloudManager", "getHealthLife body ", strC);
        d(bwqVar.getUrl(), this.f1232b.getHeaders(), strC, bwx.class, resultCallback);
    }

    public bwx b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_HealthModelCloudManager", "getHealthLifeSync host ", str);
            return null;
        }
        String strC = ofe.c(this.f1232b.getBody(new bwg()));
        LogUtil.a("HL_HealthModelCloudManager", "getHealthLifeSync body ", strC);
        return (bwx) a(str + "/achievement/getHealthLife", this.f1232b.getHeaders(), strC, bwx.class);
    }

    public void d(boolean z, List<Record> list, ResultCallback<bwi> resultCallback) {
        if (njy.e(list)) {
            LogUtil.j("HL_HealthModelCloudManager", "addHealthLifeConfig records ", list, " isUpgrade ", Boolean.valueOf(z));
            return;
        }
        bwn bwnVar = new bwn();
        bwnVar.b(list);
        bwnVar.e(System.currentTimeMillis());
        if (z) {
            bwnVar.a(1);
        }
        String strC = ofe.c(this.f1232b.getBody(bwnVar));
        LogUtil.a("HL_HealthModelCloudManager", "addHealthLifeConfig body ", strC);
        d(bwnVar.getUrl(), this.f1232b.getHeaders(), strC, bwi.class, resultCallback);
    }

    public bws d(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_HealthModelCloudManager", "getHealthLifeConfigSync host ", str, " startTime ", Integer.valueOf(i), " endTime ", Integer.valueOf(i2));
            return null;
        }
        bwo bwoVar = new bwo();
        bwoVar.e(i);
        bwoVar.d(i2);
        String strC = ofe.c(this.f1232b.getBody(bwoVar));
        LogUtil.a("HL_HealthModelCloudManager", "getHealthLifeConfigSync body ", strC);
        return (bws) a(str + "/achievement/getHealthLifeConfig", this.f1232b.getHeaders(), strC, bws.class);
    }

    public bwi a(String str, List<Record> list) {
        if (TextUtils.isEmpty(str) || njy.e(list)) {
            LogUtil.j("HL_HealthModelCloudManager", "addHealthLifeRecordSync host ", str, " records ", list);
            return null;
        }
        bwy bwyVar = new bwy();
        bwyVar.b(list);
        String strC = ofe.c(this.f1232b.getBody(bwyVar));
        LogUtil.a("HL_HealthModelCloudManager", "addHealthLifeRecordSync body ", strC);
        return (bwi) a(str + "/achievement/addHealthLifeRecord", this.f1232b.getHeaders(), strC, bwi.class);
    }

    public bwu b(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_HealthModelCloudManager", "getHealthLifeRecordSync host ", str, " startTime ", Integer.valueOf(i), " endTime ", Integer.valueOf(i2));
            return null;
        }
        bwo bwoVar = new bwo();
        bwoVar.e(i);
        bwoVar.d(i2);
        String strC = ofe.c(this.f1232b.getBody(bwoVar));
        LogUtil.a("HL_HealthModelCloudManager", "getHealthLifeRecordSync body ", strC);
        return (bwu) a(str + "/achievement/getHealthLifeRecord", this.f1232b.getHeaders(), strC, bwu.class);
    }

    public bwu b(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_HealthModelCloudManager", "getHealthLifeRecordByVersionSync host ", str, " version ", Long.valueOf(j));
            return null;
        }
        bwo bwoVar = new bwo();
        bwoVar.b(j);
        String strC = ofe.c(this.f1232b.getBody(bwoVar));
        LogUtil.a("HL_HealthModelCloudManager", "getHealthLifeRecordByVersionSync body ", strC);
        return (bwu) a(str + "/achievement/getHealthLifeRecordByVersion", this.f1232b.getHeaders(), strC, bwu.class);
    }

    public void b(List<Integer> list, List<Integer> list2, ResultCallback<bwr> resultCallback) {
        bwt bwtVar = new bwt();
        if (njy.b(list)) {
            bwtVar.b(list);
        }
        if (njy.b(list2)) {
            bwtVar.a(list2);
        }
        String strC = ofe.c(this.f1232b.getBody(bwtVar));
        LogUtil.a("HL_HealthModelCloudManager", "getHealthLifeStat body ", strC);
        d(bwtVar.getUrl(), this.f1232b.getHeaders(), strC, bwr.class, resultCallback);
    }

    public bwi c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_HealthModelCloudManager", "getHealthLifeLastVersionSync host ", str);
            return null;
        }
        String strC = ofe.c(this.f1232b.getBody(new bwg()));
        LogUtil.a("HL_HealthModelCloudManager", "getHealthLifeLastVersionSync body ", strC);
        return (bwi) a(str + "/achievement/getHealthLifeLastVersion", this.f1232b.getHeaders(), strC, bwi.class);
    }

    public void e(int i, int i2, ResultCallback<bwi> resultCallback) {
        bwv bwvVar = new bwv();
        bwvVar.c(i);
        bwvVar.a(i2);
        String strC = ofe.c(this.f1232b.getBody(bwvVar));
        LogUtil.a("HL_HealthModelCloudManager", "updateHealthLifeChallenge body ", strC);
        d(bwvVar.getUrl(), this.f1232b.getHeaders(), strC, bwi.class, resultCallback);
    }

    public void b(int i, int i2, ResultCallback<bwm> resultCallback) {
        bwp bwpVar = new bwp();
        bwpVar.d(i);
        bwpVar.c(i2);
        String strC = ofe.c(this.f1232b.getBody(bwpVar));
        LogUtil.a("HL_HealthModelCloudManager", "getHealthLifeChallenges body ", strC);
        d(bwpVar.getUrl(), this.f1232b.getHeaders(), strC, bwm.class, resultCallback);
    }

    public void b(long j, ResultCallback<ffp> resultCallback) {
        if (resultCallback == null) {
            LogUtil.j("HL_HealthModelCloudManager", "queryWeekHealthReport callback is null");
            return;
        }
        ffm ffmVar = new ffm();
        ffmVar.c("week");
        ffmVar.d(j);
        String strC = ofe.c(this.f1232b.getBody(ffmVar));
        LogUtil.a("HL_HealthModelCloudManager", "queryWeekHealthReport body ", strC);
        d(ffmVar.getUrl(), this.f1232b.getHeaders(), strC, ffp.class, resultCallback);
    }

    public void e(ResultCallback<ffk> resultCallback) {
        if (resultCallback == null) {
            LogUtil.j("HL_HealthModelCloudManager", "getDoctorBasicInfo callback is null");
            return;
        }
        ffh ffhVar = new ffh();
        String strC = ofe.c(this.f1232b.getBody(ffhVar));
        LogUtil.a("HL_HealthModelCloudManager", "getDoctorBasicInfo body ", strC);
        d(ffhVar.getUrl(), this.f1232b.getHeaders(), strC, ffk.class, resultCallback);
    }

    public void b(ResultCallback<ffj> resultCallback) {
        if (resultCallback == null) {
            LogUtil.j("HL_HealthModelCloudManager", "getDoctorImInfo callback is null");
            return;
        }
        ffl fflVar = new ffl();
        String strC = ofe.c(this.f1232b.getBody(fflVar));
        LogUtil.a("HL_HealthModelCloudManager", "getDoctorImInfo body ", strC);
        d(fflVar.getUrl(), this.f1232b.getHeaders(), strC, ffj.class, resultCallback);
    }

    public void c(ResultCallback<ffq> resultCallback) {
        if (resultCallback == null) {
            LogUtil.j("HL_HealthModelCloudManager", "queryInterventionPlanInfo callback is null");
            return;
        }
        ffn ffnVar = new ffn();
        String strC = ofe.c(this.f1232b.getBody(ffnVar));
        LogUtil.a("HL_HealthModelCloudManager", "queryInterventionPlanInfo body ", strC);
        d(ffnVar.getUrl(), this.f1232b.getHeaders(), strC, ffq.class, resultCallback);
    }

    public void b(String str, String str2, ResultCallback<ffo> resultCallback) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || resultCallback == null) {
            LogUtil.j("HL_HealthModelCloudManager", "getUserSampleConfigList type ", str, " id ", str2, " callback ", resultCallback);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ffb(str, str2));
        ffi ffiVar = new ffi(arrayList);
        try {
            String strC = ofe.c(this.f1232b.getBody(ffiVar));
            LogUtil.a("HL_HealthModelCloudManager", "getUserSampleConfigList body ", strC);
            d(ffiVar.getUrl(), this.f1232b.getHeaders(), strC, ffo.class, resultCallback);
        } catch (NullPointerException e) {
            LogUtil.e("HL_HealthModelCloudManager", "getUserSampleConfigList NullPointerException");
            resultCallback.onFailure(e);
        }
    }

    public void d(List<Integer> list, ResultCallback<bww> resultCallback) {
        if (njy.e(list)) {
            LogUtil.j("HL_HealthModelCloudManager", "getHealthLifeConDays ids ", list, " callback ", resultCallback);
            return;
        }
        bwz bwzVar = new bwz();
        bwzVar.c(list);
        String strC = ofe.c(this.f1232b.getBody(bwzVar));
        LogUtil.a("HL_HealthModelCloudManager", "getHealthLifeConDays body ", strC);
        d(bwzVar.getUrl(), this.f1232b.getHeaders(), strC, bww.class, resultCallback);
    }
}
