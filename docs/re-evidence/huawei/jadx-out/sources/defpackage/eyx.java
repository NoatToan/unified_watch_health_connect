package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.request.SleepAudioInfoApi;
import com.huawei.health.playercontroller.api.PlayerEventApi;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class eyx implements PlayerEventApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gog f33708a;
    private ParamsFactory d;
    private SleepAudioInfoApi e;

    @Override // com.huawei.health.playercontroller.api.PlayerEventApi
    public void onPlayerStartPlayEvent(final gog gogVar, long j, int i, long j2) {
        this.f33708a = null;
        if (gogVar == null) {
            LogUtil.j("CoursePlayerEventImpl", "onPlayerStartPlayEvent eventParamInfo is invalid");
        } else {
            LogUtil.a("CoursePlayerEventImpl", "onPlayerStartPlayEvent");
            ThreadPoolManager.c().execute(new Runnable() { // from class: eyt
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(gogVar);
                }
            });
        }
    }

    @Override // com.huawei.health.playercontroller.api.PlayerEventApi
    public void onPlayerProgressChange(final gog gogVar, long j, final int i) {
        if (gogVar == null) {
            LogUtil.j("CoursePlayerEventImpl", "onPlayerProgressChange eventParamInfo is invalid");
        } else {
            LogUtil.a("CoursePlayerEventImpl", "onPlayerProgressChange progress:", Long.valueOf(j), " playDuration:", Integer.valueOf(i));
            ThreadPoolManager.c().execute(new Runnable() { // from class: eyw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33707c.b(i, gogVar);
                }
            });
        }
    }

    /* synthetic */ void b(int i, gog gogVar) {
        if (i < 180) {
            return;
        }
        b(gogVar, i);
    }

    @Override // com.huawei.health.playercontroller.api.PlayerEventApi
    public void onPlayerPauseEvent(final gog gogVar, final long j, final int i, final long j2) {
        if (gogVar == null) {
            LogUtil.j("CoursePlayerEventImpl", "onPlayerPauseEvent eventParamInfo is invalid");
        } else {
            LogUtil.a("CoursePlayerEventImpl", "onPlayerPauseEvent progress:", Long.valueOf(j), " playDuration:", Integer.valueOf(i));
            ThreadPoolManager.c().execute(new Runnable() { // from class: eza
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33713a.c(gogVar, j, i, j2);
                }
            });
        }
    }

    /* synthetic */ void c(gog gogVar, long j, int i, long j2) {
        if (TextUtils.isEmpty(gogVar.a())) {
            a(gogVar, j, i, j2);
        } else {
            c(gogVar.c(), i, false, gogVar.a());
        }
    }

    private void a(gog gogVar, long j, int i, long j2) {
        c(gogVar.c(), j, false, (String) null);
        d(gogVar, i, j2);
        e(gogVar.c(), i);
    }

    @Override // com.huawei.health.playercontroller.api.PlayerEventApi
    public void onPlayerStopEvent(final gog gogVar, final long j, final int i, final long j2, boolean z) {
        if (gogVar == null) {
            LogUtil.j("CoursePlayerEventImpl", "onPlayerStopEvent eventParamInfo is invalid");
        } else if (z) {
            LogUtil.j("CoursePlayerEventImpl", "onPlayerStopEvent isReportedOnPause, return");
        } else {
            LogUtil.a("CoursePlayerEventImpl", "onPlayerStopEvent progress:", Long.valueOf(j), " playDuration:", Integer.valueOf(i));
            ThreadPoolManager.c().execute(new Runnable() { // from class: eyu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33703a.d(gogVar, j, i, j2);
                }
            });
        }
    }

    /* synthetic */ void d(gog gogVar, long j, int i, long j2) {
        if (TextUtils.isEmpty(gogVar.a())) {
            a(gogVar, j, i, j2);
        } else {
            c(gogVar.c(), i, false, gogVar.a());
        }
    }

    @Override // com.huawei.health.playercontroller.api.PlayerEventApi
    public void onPlayerFinishedMediaEvent(final gog gogVar, final long j, final int i, final long j2) {
        if (gogVar == null) {
            LogUtil.j("CoursePlayerEventImpl", "onPlayerStopEvent eventParamInfo is invalid");
        } else {
            LogUtil.a("CoursePlayerEventImpl", "onPlayerFinishedMediaEvent, progress:", Long.valueOf(j), " playDuration:", Integer.valueOf(i));
            ThreadPoolManager.c().execute(new Runnable() { // from class: ezb
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(gogVar, j, i, j2);
                }
            });
        }
    }

    /* synthetic */ void e(gog gogVar, long j, int i, long j2) {
        if (TextUtils.isEmpty(gogVar.a())) {
            a(gogVar, j, i, j2);
            b(gogVar, i);
        } else {
            c(gogVar.c(), i, false, gogVar.a());
        }
    }

    @Override // com.huawei.health.playercontroller.api.PlayerEventApi
    public void onPlayStatusChangeFromNotification(gog gogVar, int i) {
        if (gogVar == null) {
            LogUtil.j("CoursePlayerEventImpl", "onPlayStatusChangeFromNotification eventParamInfo is invalid");
            return;
        }
        int i2 = CommonUtil.ad(BaseApplication.b()) ? 8 : 7;
        int i3 = i == 3 ? 0 : 1;
        if (gogVar.l() > 0) {
            b(gogVar, i2, i3);
        } else {
            a(gogVar, i2, i3);
        }
    }

    private void e(int i, int i2) {
        ReleaseLogUtil.c("CoursePlayerEventImpl", "reportFinishKakaTask audioId:", Integer.valueOf(i), " playDuration:", Integer.valueOf(i2));
        HashMap map = new HashMap(10);
        map.put(KakaConstants.SLEEP_MUSIC_ID, Integer.valueOf(i));
        map.put(KakaConstants.SLEEP_MUSIC_DURATION, Integer.valueOf((i2 * 1000) + 2000));
        ddq.d().finishKakaTask(BaseApplication.b(), 30009, map);
    }

    private void c(int i, long j, boolean z, String str) {
        gnz gnzVarE;
        ReleaseLogUtil.c("R_CoursePlayerEventImpl", "saveSleepPlayRecord,aiAudioId:", str);
        if (TextUtils.isEmpty(str)) {
            gnzVarE = new gnz.e().a(i).b(j).e(z).c(fxl.d()).e();
        } else {
            gnzVarE = new gnz.e().a(1).b(str).b(j).e(z).c(fxl.d()).e();
        }
        if (this.d == null) {
            this.d = new chj();
        }
        Map<String, String> headers = this.d.getHeaders();
        String strC = ofe.c(this.d.getBody(gnzVarE));
        LogUtil.a("CoursePlayerEventImpl", "saveSleepPlayRecord apply url: ", gnzVarE.getUrl(), " apply headers:", headers.toString(), " apply body: ", strC);
        if (this.e == null) {
            this.e = (SleepAudioInfoApi) oet.d().e(SleepAudioInfoApi.class);
        }
        try {
            Response<goa> responseExecute = this.e.saveSleepPlayRecord(gnzVarE.getUrl(), this.d.getHeaders(), strC).execute();
            LogUtil.a("CoursePlayerEventImpl", "saveSleepPlayRecord response is ", responseExecute);
            ReleaseLogUtil.c("R_CoursePlayerEventImpl", "saveSleepPlayRecord response code is: ", Integer.valueOf(responseExecute.getCode()));
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            ReleaseLogUtil.b("R_CoursePlayerEventImpl", "saveSleepPlayRecord exception");
        }
    }

    private void d(gog gogVar, int i, long j) {
        ReleaseLogUtil.c("R_CoursePlayerEventImpl", "addSleepPlayLog");
        gob gobVarE = new gob.b().c(gogVar.c()).a(i).b(j).a(System.currentTimeMillis()).b(lsl.q(System.currentTimeMillis())).e();
        if (this.d == null) {
            this.d = new chj();
        }
        Map<String, String> headers = this.d.getHeaders();
        String strC = ofe.c(this.d.getBody(gobVarE));
        LogUtil.a("CoursePlayerEventImpl", "addSleepPlayLog apply url: ", gobVarE.getUrl(), " apply headers:", headers.toString(), " apply body: ", strC);
        if (this.e == null) {
            this.e = (SleepAudioInfoApi) oet.d().e(SleepAudioInfoApi.class);
        }
        try {
            ReleaseLogUtil.c("R_CoursePlayerEventImpl", "addSleepPlayLog response code is: ", Integer.valueOf(this.e.addSleepPlayLog(gobVarE.getUrl(), this.d.getHeaders(), strC).execute().getCode()));
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            ReleaseLogUtil.b("R_CoursePlayerEventImpl", "addSleepPlayLog exception");
        }
    }

    private void b(gog gogVar, int i) {
        if (this.f33708a == null || gogVar.c() != this.f33708a.c()) {
            List<gny> listI = gogVar.i();
            if (njy.e(listI)) {
                LogUtil.d("CoursePlayerEventImpl", "resourceTypes is empty");
                return;
            }
            ReleaseLogUtil.c("CoursePlayerEventImpl", "saveWorkoutRecord enter");
            HiHealthData hiHealthData = new HiHealthData();
            hiHealthData.setDeviceUuid("-1");
            hiHealthData.setStartTime(System.currentTimeMillis());
            hiHealthData.setEndTime(System.currentTimeMillis());
            final int iValue = listI.get(0).b() == 5 ? DicDataTypeUtil.DataType.MINDFULNESS_TYPE.value() : DicDataTypeUtil.DataType.COURSE_RECORD.value();
            hiHealthData.setType(iValue);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("trainTime", i);
                jSONObject.put("lessonID", String.valueOf(gogVar.c()));
                jSONObject.put("lessonName", gogVar.e());
                jSONObject.put("resourceType", qqt.b(gogVar.i()));
                jSONObject.put("lessonType", gogVar.d());
                hiHealthData.setMetaData(jSONObject.toString());
                hiHealthData.setSequenceData("{}");
                HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
                hiDataInsertOption.addData(hiHealthData);
                HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: eyy
                    @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                    public final void onResult(int i2, Object obj) {
                        this.f33709a.a(iValue, i2, obj);
                    }
                });
                this.f33708a = gogVar;
            } catch (JSONException e) {
                ReleaseLogUtil.b("CoursePlayerEventImpl", "value JSONException ", ExceptionUtils.c(e));
            }
        }
    }

    /* synthetic */ void a(int i, int i2, Object obj) {
        ReleaseLogUtil.c("CoursePlayerEventImpl", "error code is ", Integer.valueOf(i2), " object is ", obj);
        if (i2 == 0) {
            e(i);
        }
    }

    private void e(int i) {
        ReleaseLogUtil.c("CoursePlayerEventImpl", "syncHiHealthData is network connected : ", Boolean.valueOf(CommonUtil.ab(BaseApplication.b())));
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(i);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setForceSync(true);
        LogUtil.a("CoursePlayerEventImpl", "type is ", Integer.valueOf(i));
        hiSyncOption.setSyncId(System.currentTimeMillis());
        HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(gog gogVar) {
        ReleaseLogUtil.c("R_CoursePlayerEventImpl", "postBehavior");
        if (gogVar.l() <= 0) {
            return;
        }
        gnx gnxVarB = new gnx.e().b(4).e(String.valueOf(gogVar.c())).c(String.valueOf(gogVar.l())).e(3).b();
        if (this.d == null) {
            this.d = new chj();
        }
        Map<String, String> headers = this.d.getHeaders();
        String strC = ofe.c(this.d.getBody(gnxVarB));
        LogUtil.a("CoursePlayerEventImpl", "postBehavior apply url: ", gnxVarB.getUrl(), " apply headers:", headers.toString(), " apply body: ", strC);
        if (this.e == null) {
            this.e = (SleepAudioInfoApi) oet.d().e(SleepAudioInfoApi.class);
        }
        try {
            ReleaseLogUtil.c("R_CoursePlayerEventImpl", "postBehavior response code is: ", Integer.valueOf(this.e.postBehavior(gnxVarB.getUrl(), this.d.getHeaders(), strC).execute().getCode()));
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            ReleaseLogUtil.b("R_CoursePlayerEventImpl", "postBehavior exception");
        }
    }

    private void a(gog gogVar, int i, int i2) {
        HashMap map = new HashMap();
        map.put("name", gogVar.e());
        map.put("click", 1);
        map.put("audioType", Integer.valueOf(gogVar.d()));
        map.put("from", Integer.valueOf(i));
        map.put("audioId", Integer.valueOf(gogVar.c()));
        map.put("BIType", 2);
        map.put("status", Integer.valueOf(i2));
        map.put("vipMode", Integer.valueOf(gogVar.j()));
        map.put("resourceLabel", gogVar.h());
        map.put("isSeries", false);
        map.put("isAuditoryClip", false);
        lmf.d().c(BaseApplication.b(), AnalyticsValue.SLEEP_RECORD_1090095.value(), map, 0);
    }

    private void b(gog gogVar, int i, int i2) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("SleepingType", Integer.valueOf(gogVar.d()));
        map.put("decompressingType", Integer.valueOf(gogVar.g()));
        map.put("resourceMode", Integer.valueOf(gogVar.j()));
        map.put("resourceName", gogVar.f());
        map.put("name", gogVar.e());
        map.put("id", Integer.valueOf(gogVar.l()));
        map.put("event", 2);
        map.put("from", Integer.valueOf(i));
        map.put("status", Integer.valueOf(i2));
        lmf.d().c(BaseApplication.b(), AnalyticsValue.SERIES_COURSE_RECORD_1130078.value(), map, 0);
    }
}
