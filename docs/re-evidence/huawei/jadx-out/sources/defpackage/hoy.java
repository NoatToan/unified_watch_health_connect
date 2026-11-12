package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.sport.CourseUpdateListener;
import com.huawei.health.sport.model.CourseEnvParams;
import com.huawei.health.suggestion.h5pro.AudioConstant;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor;
import com.huawei.health.suggestion.ui.voice.helper.IntensityVoiceGuider;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.Audio;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.Comment;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.TargetConfig;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hoy implements CourseUpdateListener {
    private static volatile hoy d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CourseEnvParams f37005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ido f37006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ChoreographedSingleAction> f37007c;
    private HeartZoneConf j;
    private gzf s;
    private int w;
    private FitWorkout f = null;
    private Map<Integer, List<FitRunPlayAudio>> t = new HashMap();
    private int v = -1;
    private int q = 0;
    private int p = 0;
    private iet g = null;
    private boolean m = false;
    private long i = 0;
    private boolean o = false;
    private int r = 0;
    private boolean k = false;
    private boolean l = false;
    private boolean n = false;
    private Map<Integer, IntensityVoiceGuider> h = new ArrayMap();

    private hoy() {
    }

    public void c(List<ChoreographedSingleAction> list, FitWorkout fitWorkout, boolean z, CourseEnvParams courseEnvParams) {
        k();
        this.f37007c = list;
        this.f = fitWorkout;
        this.f37005a = courseEnvParams;
        h();
        boolean zB = pqj.b().b(BaseApplication.getContext(), "Sport");
        LogUtil.a("Suggestion_FitRunManager", "init() enableCurLang:", Boolean.valueOf(zB));
        if (zB) {
            f();
        } else {
            i();
        }
        this.m = false;
        this.i = 0L;
        this.g = new iet(20000L);
        this.o = z;
        FitWorkout fitWorkout2 = this.f;
        if (fitWorkout2 != null) {
            this.n = fitWorkout2.isNewRunCourse();
            this.k = this.f.isMusicRun();
        }
        if (this.k) {
            hcu.b().b("fitness_audio_player", "fitness_audio_player", 1);
        }
        this.s = this.f37005a.f();
        this.j = this.f37005a.a();
    }

    @Override // com.huawei.health.sport.CourseUpdateListener
    public void switchAction(int i) {
        if (i <= this.v) {
            LogUtil.d("Suggestion_FitRunManager", "switchAction with the error index:", Integer.valueOf(i));
            return;
        }
        this.v = i;
        if (njy.e(this.f37007c, i)) {
            LogUtil.d("Suggestion_FitRunManager", "switchAction with the error index:", Integer.valueOf(this.v));
            return;
        }
        LogUtil.a("Suggestion_FitRunManager", "switchAction with the index:", Integer.valueOf(this.v));
        this.l = true;
        d(this.f37007c.get(this.v), this.v, this.f37007c.size());
        m();
    }

    @Override // com.huawei.health.sport.CourseUpdateListener
    public void seekToAction(int i) {
        if (i == this.v) {
            LogUtil.d("Suggestion_FitRunManager", "seek to action with the same index:", Integer.valueOf(i));
            return;
        }
        this.v = i;
        if (njy.e(this.f37007c, i)) {
            LogUtil.d("Suggestion_FitRunManager", "seek to action with the error index:", Integer.valueOf(this.v));
            return;
        }
        LogUtil.a("Suggestion_FitRunManager", "seek to action with the index:", Integer.valueOf(this.v));
        l();
        m();
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback
    public void getSportInfo(Bundle bundle) {
        if (bundle == null) {
            LogUtil.c("Suggestion_FitRunManager", "sportInfo == null");
            return;
        }
        int i = bundle.getInt("sportState", 0);
        if (i == 2) {
            this.i = 0L;
            if (n()) {
                hcu.b().b("fitness_audio_player", 1);
            }
            this.r = i;
        }
        if (i != 1) {
            LogUtil.d("Suggestion_FitRunManager", "sportState = ", Integer.valueOf(i));
            return;
        }
        int i2 = bundle.getInt("distance", 0);
        int i3 = bundle.getInt("duration", 0);
        this.w = i3;
        if (this.l) {
            this.q = i2;
            this.p = i3;
            this.l = false;
        }
        if (njy.e(this.f37007c, this.v)) {
            LogUtil.d("Suggestion_FitRunManager", "mTargetIndex out of bounds. mTargetIndex = ", Integer.valueOf(this.v));
            return;
        }
        if (this.r == 2 && n()) {
            LogUtil.a("Suggestion_FitRunManager", "continue music");
            hcu.b().b("fitness_audio_player", 2);
        }
        this.r = i;
        int i4 = bundle.getInt(IndoorEquipManagerApi.KEY_HEART_RATE, 0);
        int i5 = this.q;
        int i6 = this.w - this.p;
        int iE = ped.e(i6);
        float fC = ped.c(bundle.getFloat("speed", 0.0f));
        c(this.v, i2 - i5, iE, i4, fC);
        ChoreographedSingleAction choreographedSingleAction = this.f37007c.get(this.v);
        if (!n()) {
            d(choreographedSingleAction, fC, i4, bundle.getInt("stepRate"), i6);
        }
        b(bundle.getLong("heartRateTime"));
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback
    public void onSummary(MotionPathSimplify motionPathSimplify) {
        g();
    }

    public boolean b() {
        CourseEnvParams courseEnvParams = this.f37005a;
        if (courseEnvParams != null) {
            return courseEnvParams.j();
        }
        return false;
    }

    public boolean e() {
        return this.n;
    }

    public HeartZoneConf a() {
        return this.j;
    }

    private void i() {
        if (this.f37006b != null) {
            return;
        }
        if (LanguageUtil.o(BaseApplication.getContext())) {
            FitWorkout fitWorkout = this.f;
            if (fitWorkout != null) {
                this.f37006b = new ido(AudioConstant.WOMAN, FitWorkout.acquireComeFrom(fitWorkout.acquireId(), this.f.getCourseDefineType()), AudioConstant.AUDIO);
                return;
            } else {
                this.f37006b = new ido(AudioConstant.WOMAN, "", AudioConstant.AUDIO);
                return;
            }
        }
        FitWorkout fitWorkout2 = this.f;
        if (fitWorkout2 != null) {
            this.f37006b = new ido("M", FitWorkout.acquireComeFrom(fitWorkout2.acquireId(), this.f.getCourseDefineType()), AudioConstant.AUDIO);
        } else {
            this.f37006b = new ido("M", "", AudioConstant.AUDIO);
        }
    }

    private void f() {
        if (this.f37006b != null) {
            return;
        }
        if (LanguageUtil.o(BaseApplication.getContext())) {
            FitWorkout fitWorkout = this.f;
            if (fitWorkout != null) {
                this.f37006b = new idp(AudioConstant.WOMAN, FitWorkout.acquireComeFrom(fitWorkout.acquireId(), this.f.getCourseDefineType()), AudioConstant.AUDIO);
                return;
            } else {
                this.f37006b = new idp(AudioConstant.WOMAN, "", AudioConstant.AUDIO);
                return;
            }
        }
        FitWorkout fitWorkout2 = this.f;
        if (fitWorkout2 != null) {
            this.f37006b = new idp("M", FitWorkout.acquireComeFrom(fitWorkout2.acquireId(), this.f.getCourseDefineType()), AudioConstant.AUDIO);
        } else {
            this.f37006b = new idp("M", "", AudioConstant.AUDIO);
        }
    }

    private void h() {
        this.t.clear();
        for (int i = 0; i < this.f37007c.size(); i++) {
            ChoreographedSingleAction choreographedSingleAction = this.f37007c.get(i);
            if (choreographedSingleAction != null) {
                ArrayList arrayList = new ArrayList();
                List<Comment> commentaryTraining = choreographedSingleAction.getCommentaryTraining();
                if (commentaryTraining != null) {
                    for (Comment comment : commentaryTraining) {
                        if (comment != null) {
                            String strAcquirePlayType = comment.acquirePlayType();
                            String strAcquirePlayValue = comment.acquirePlayValue();
                            String strAcquireName = comment.acquireName();
                            String id = comment.getId();
                            FitRunPlayAudio fitRunPlayAudioC = c(strAcquirePlayValue);
                            fitRunPlayAudioC.saveAudioId(id);
                            fitRunPlayAudioC.saveAudioUrl(strAcquireName);
                            fitRunPlayAudioC.savePlayType(strAcquirePlayType);
                            arrayList.add(fitRunPlayAudioC);
                        }
                    }
                    this.t.put(Integer.valueOf(i), arrayList);
                }
            }
        }
    }

    private void k() {
        this.f = null;
        this.v = -1;
        this.t.clear();
        this.f37006b = null;
        this.h.clear();
        this.q = 0;
        this.p = 0;
        this.o = false;
        this.f37007c = null;
        this.n = false;
    }

    public static hoy c() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new hoy();
                }
            }
        }
        return d;
    }

    private boolean n() {
        return this.k;
    }

    private void m() {
        Iterator<IntensityVoiceGuider> it = this.h.values().iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
    }

    private void b(long j) {
        if (this.i <= 0) {
            this.i = System.currentTimeMillis();
        }
        c(Math.max(j, this.i));
    }

    private void c(long j) {
        if (this.o) {
            this.g.b(j);
            if (this.g.d(System.currentTimeMillis()) == 1) {
                if (!this.m) {
                    LogUtil.a("Suggestion_FitRunManager", " heartRateDevice HeartRateDeviceError");
                    b(j().getHeartRateDeviceError());
                }
                this.m = true;
                return;
            }
            if (this.m) {
                LogUtil.a("Suggestion_FitRunManager", " heartRateDevice getHeartRateDeviceConnected");
                b(j().getHeartRateDeviceConnected());
            }
            this.m = false;
        }
    }

    private void d(ChoreographedSingleAction choreographedSingleAction, int i, int i2) {
        LogUtil.a("Suggestion_FitRunManager", "change index = ", Integer.valueOf(i), "  size=", Integer.valueOf(i2));
        if (choreographedSingleAction.getAction() == null) {
            LogUtil.c("Suggestion_FitRunManager", "change workoutAction.getAction() == null");
            return;
        }
        if (n() && choreographedSingleAction.getAction().getExtendProperty() != null) {
            Audio audio = (Audio) new Gson().fromJson(StringUtils.c((Object) choreographedSingleAction.getAction().getExtendProperty().get("actionMusic")), Audio.class);
            if (audio != null) {
                hcu.b().d("fitness_audio_player", xkf.b(audio.getUrl()), "run background music");
                onChange(this.f37005a.g());
                return;
            }
            return;
        }
        if (i == 0) {
            a(choreographedSingleAction);
        } else if (i == i2 - 1) {
            c(choreographedSingleAction);
        } else if (i < i2) {
            d(choreographedSingleAction);
        }
    }

    private void d(ChoreographedSingleAction choreographedSingleAction) {
        LogUtil.a("Suggestion_FitRunManager", "changeNextAction workoutAction = ", new Gson().toJson(choreographedSingleAction));
        String strH = h(choreographedSingleAction);
        int iJ = CommonUtils.j(choreographedSingleAction.getTargetConfig().getId());
        a(j().getChangeNextAction(strH, c(iJ, ien.c(choreographedSingleAction)), iJ, choreographedSingleAction.getIntensityConfig()), "immediately_play");
    }

    private void c(ChoreographedSingleAction choreographedSingleAction) {
        LogUtil.a("Suggestion_FitRunManager", "changeLastAction workoutAction = ", choreographedSingleAction);
        String strH = h(choreographedSingleAction);
        int iJ = CommonUtils.j(choreographedSingleAction.getTargetConfig().getId());
        a(j().getChangeLastAction(strH, c(iJ, ien.c(choreographedSingleAction)), iJ, choreographedSingleAction.getIntensityConfig()), "immediately_play");
    }

    private int c(int i, int i2) {
        return (i == 5 || i == 4) ? (int) UnitUtil.d(ifk.d(this.j, i2), 0) : i2;
    }

    private String h(ChoreographedSingleAction choreographedSingleAction) {
        AtomicAction action = choreographedSingleAction.getAction();
        if (action == null || action.getExtendProperty() == null) {
            LogUtil.c("Suggestion_FitRunManager", "getWorkoutActionNameAudios action == null");
            return e(choreographedSingleAction);
        }
        String str = action.getExtendProperty().get("audios");
        if (TextUtils.isEmpty(str)) {
            LogUtil.c("Suggestion_FitRunManager", "getWorkoutActionNameAudios audios null");
            return e(choreographedSingleAction);
        }
        List list = (List) new Gson().fromJson(str, new TypeToken<List<Audio>>() { // from class: com.huawei.health.suggestion.ui.manage.FitnessRunManager$1
        }.getType());
        if (njy.e(list)) {
            LogUtil.c("Suggestion_FitRunManager", "getWorkoutActionNameAudios CollectionUtils.isEmpty(audios)");
            return e(choreographedSingleAction);
        }
        return ((Audio) list.get(0)).getUrl();
    }

    private String e(ChoreographedSingleAction choreographedSingleAction) {
        if (choreographedSingleAction == null) {
            LogUtil.c("Suggestion_FitRunManager", "getActionId workoutAction is null.");
            return "";
        }
        AtomicAction action = choreographedSingleAction.getAction();
        if (action == null) {
            LogUtil.c("Suggestion_FitRunManager", "getActionId action is null.");
            return "";
        }
        String id = action.getId();
        LogUtil.a("Suggestion_FitRunManager", "getActionId actionId = ", id);
        return id;
    }

    private void a(ChoreographedSingleAction choreographedSingleAction) {
        LogUtil.a("Suggestion_FitRunManager", "changeFirstAction workoutAction = ", choreographedSingleAction.toString());
        String strH = h(choreographedSingleAction);
        int iJ = CommonUtils.j(choreographedSingleAction.getTargetConfig().getId());
        b(j().getChangeFirstAction(strH, c(iJ, ien.c(choreographedSingleAction)), iJ, choreographedSingleAction.getIntensityConfig()));
    }

    private static FitRunPlayAudio c(String str) {
        FitRunPlayAudio fitRunPlayAudio = new FitRunPlayAudio();
        if (str == null || str.length() < 3) {
            LogUtil.c("Suggestion_FitRunManager", "(playValue == null) || (playValue.length() < 3) ");
            return fitRunPlayAudio;
        }
        try {
            fitRunPlayAudio.savePlayValue(Integer.parseInt(str.substring(2)));
            fitRunPlayAudio.saveOpportunity(str.substring(1, 2));
            return fitRunPlayAudio;
        } catch (NumberFormatException unused) {
            LogUtil.c("Suggestion_FitRunManager", "parsePlayValue parse exception");
            return fitRunPlayAudio;
        }
    }

    private void c(int i, int i2, int i3, int i4, float f) {
        LogUtil.e("Suggestion_FitRunManager", "speakAside");
        List<FitRunPlayAudio> list = this.t.get(Integer.valueOf(i));
        if (njy.e(list)) {
            LogUtil.c("Suggestion_FitRunManager", "speakAside CollectionUtils.isEmpty(fitRunPlayAudios)");
            return;
        }
        for (FitRunPlayAudio fitRunPlayAudio : list) {
            if (fitRunPlayAudio != null) {
                d(fitRunPlayAudio, i2, i3, i4, f);
            }
        }
    }

    private void d(FitRunPlayAudio fitRunPlayAudio, int i, int i2, int i3, float f) {
        LogUtil.e("Suggestion_FitRunManager", "speakAside fitRunPlayAudio=", fitRunPlayAudio);
        if (fitRunPlayAudio.acquireIsPlay()) {
            return;
        }
        String strAcquirePlayType = fitRunPlayAudio.acquirePlayType();
        if ("d".equals(strAcquirePlayType)) {
            b(fitRunPlayAudio, i);
            return;
        }
        if ("h".equals(strAcquirePlayType)) {
            b(fitRunPlayAudio, i3);
        } else if (FitRunPlayAudio.PLAY_TYPE_T.equals(strAcquirePlayType)) {
            b(fitRunPlayAudio, i2);
        } else if ("v".equals(strAcquirePlayType)) {
            c(fitRunPlayAudio, f);
        }
    }

    private void b(FitRunPlayAudio fitRunPlayAudio, int i) {
        float fAcquirePlayValue = fitRunPlayAudio.acquirePlayValue();
        String strAcquireOpportunity = fitRunPlayAudio.acquireOpportunity();
        if (FitRunPlayAudio.OPPORTUNITY_E.equals(strAcquireOpportunity)) {
            if (fAcquirePlayValue == i) {
                String strAcquireAudioUrl = fitRunPlayAudio.acquireAudioUrl();
                fitRunPlayAudio.saveIsPlay(true);
                e(strAcquireAudioUrl);
                return;
            }
            return;
        }
        if (FitRunPlayAudio.OPPORTUNITY_M.equals(strAcquireOpportunity)) {
            if (fAcquirePlayValue > i) {
                String strAcquireAudioUrl2 = fitRunPlayAudio.acquireAudioUrl();
                fitRunPlayAudio.saveIsPlay(true);
                e(strAcquireAudioUrl2);
                return;
            }
            return;
        }
        if (!"p".equals(strAcquireOpportunity) || fAcquirePlayValue >= i) {
            return;
        }
        String strAcquireAudioUrl3 = fitRunPlayAudio.acquireAudioUrl();
        fitRunPlayAudio.saveIsPlay(true);
        e(strAcquireAudioUrl3);
    }

    private void c(FitRunPlayAudio fitRunPlayAudio, float f) {
        float fAcquirePlayValue = fitRunPlayAudio.acquirePlayValue();
        String strAcquireOpportunity = fitRunPlayAudio.acquireOpportunity();
        if (FitRunPlayAudio.OPPORTUNITY_E.equals(strAcquireOpportunity)) {
            if (fAcquirePlayValue == f) {
                String strAcquireAudioUrl = fitRunPlayAudio.acquireAudioUrl();
                fitRunPlayAudio.saveIsPlay(true);
                e(strAcquireAudioUrl);
                return;
            }
            return;
        }
        if (FitRunPlayAudio.OPPORTUNITY_M.equals(strAcquireOpportunity)) {
            if (fAcquirePlayValue > f) {
                String strAcquireAudioUrl2 = fitRunPlayAudio.acquireAudioUrl();
                fitRunPlayAudio.saveIsPlay(true);
                e(strAcquireAudioUrl2);
                return;
            }
            return;
        }
        if (!"p".equals(strAcquireOpportunity) || fAcquirePlayValue >= f) {
            return;
        }
        String strAcquireAudioUrl3 = fitRunPlayAudio.acquireAudioUrl();
        fitRunPlayAudio.saveIsPlay(true);
        e(strAcquireAudioUrl3);
    }

    private void e(String str) {
        String strC = idi.c(str);
        LogUtil.a("Suggestion_FitRunManager", "broadcastSpeakAside audioUrl = ", str, "audiosFilePath = ", strC);
        o();
        b(strC);
    }

    private IFitRunVoiceContentConstructor j() {
        return this.f37006b;
    }

    public gzf d() {
        return this.s;
    }

    public void c(int i) {
        LogUtil.a("Suggestion_FitRunManager", "play pull up course broadcast with type=", Integer.valueOf(i));
        Object objConstructContent = idk.e().constructContent(101, Integer.valueOf(i));
        if (njy.b(objConstructContent, Integer.class)) {
            hkw.e(BaseApplication.getContext(), new ArrayList((List) objConstructContent));
        }
    }

    private void b(Object obj) {
        a(obj, null);
    }

    private void a(Object obj, String str) {
        if (UnitUtil.f() || !gcn.c().getVoiceEnable()) {
            return;
        }
        if (obj == null) {
            LogUtil.c("Suggestion_FitRunManager", "playSound sound == null");
        } else {
            hcu.b().c(obj, str);
        }
    }

    private void d(ChoreographedSingleAction choreographedSingleAction, float f, int i, int i2, int i3) {
        if (choreographedSingleAction == null || choreographedSingleAction.getIntensityConfig() == null) {
            LogUtil.d("Suggestion_FitRunManager", "guide workoutAction is null");
            return;
        }
        if (CommonUtil.b(choreographedSingleAction.getIntensityConfig().getValueL()) && CommonUtil.b(choreographedSingleAction.getIntensityConfig().getValueH())) {
            LogUtil.d("Suggestion_FitRunManager", "guide value == zero");
            return;
        }
        if (i3 < 30) {
            LogUtil.a("Suggestion_FitRunManager", "action duration too short,", Integer.valueOf(i3));
            return;
        }
        int iB = b(choreographedSingleAction);
        if (iB != 0) {
            if (iB != 1 && iB != 2) {
                if (iB == 3) {
                    c(0, choreographedSingleAction.getIntensityConfig(), f);
                    c(1, choreographedSingleAction.getIntensityConfig(), i);
                    return;
                } else if (iB != 4 && iB != 7 && iB != 8 && iB != 9) {
                    if (iB != 13 && iB != 15) {
                        a(iB, choreographedSingleAction, f, i, i2);
                        return;
                    }
                }
            }
            if (this.w < 300) {
                return;
            }
            c(iB, choreographedSingleAction.getIntensityConfig(), i);
            return;
        }
        c(iB, choreographedSingleAction.getIntensityConfig(), f);
    }

    private int b(ChoreographedSingleAction choreographedSingleAction) {
        int iJ = CommonUtils.j(choreographedSingleAction.getIntensityConfig().getId());
        if (iJ == 17) {
            return this.j.getClassifyMethod() == 0 ? 4 : 8;
        }
        return iJ;
    }

    private void a(int i, ChoreographedSingleAction choreographedSingleAction, float f, int i2, int i3) {
        if (i == 5) {
            c(0, choreographedSingleAction.getIntensityConfig(), f);
            c(2, choreographedSingleAction.getIntensityConfig(), i2);
        } else if (i == 6) {
            c(0, choreographedSingleAction.getIntensityConfig(), f);
            c(4, choreographedSingleAction.getIntensityConfig(), f);
        } else if (i == 14) {
            b(choreographedSingleAction, i2, f);
        } else {
            if (i != 16) {
                return;
            }
            c(i, choreographedSingleAction.getIntensityConfig(), i3);
        }
    }

    private void b(ChoreographedSingleAction choreographedSingleAction, int i, float f) {
        if (b()) {
            if (this.w < 300) {
                return;
            }
            c(8, choreographedSingleAction.getIntensityConfig(), i);
            return;
        }
        c(13, choreographedSingleAction.getIntensityConfig(), f);
    }

    private void c(int i, TargetConfig targetConfig, float f) {
        IntensityVoiceGuider intensityVoiceGuiderE = this.h.get(Integer.valueOf(i));
        if (intensityVoiceGuiderE == null) {
            intensityVoiceGuiderE = e(i);
            if (intensityVoiceGuiderE == null) {
                return;
            } else {
                this.h.put(Integer.valueOf(i), intensityVoiceGuiderE);
            }
        }
        intensityVoiceGuiderE.guide(targetConfig, f);
    }

    private IntensityVoiceGuider e(int i) {
        if (i == 0) {
            return new idu(j());
        }
        if (i != 1) {
            if (i == 2) {
                return new idm(j());
            }
            if (i != 4) {
                if (i == 13) {
                    idt idtVar = new idt(j());
                    idtVar.c(this.s);
                    return idtVar;
                }
                if (i != 7 && i != 8) {
                    if (i == 9) {
                        return new ids(j());
                    }
                    if (i == 15) {
                        return new idv(j());
                    }
                    if (i != 16) {
                        return null;
                    }
                    return new idr(j());
                }
            }
        }
        idq idqVar = new idq(j());
        idqVar.a(this.j);
        return idqVar;
    }

    private void o() {
        buh.d("run_course_voice_action_start_time", String.valueOf(this.p));
        buh.d("run_course_voice_action_start_distance", String.valueOf(this.q));
        buh.d("run_course_voice_speak_aside_cache", qqt.b(this.t));
    }

    private void l() {
        Map<Integer, List<FitRunPlayAudio>> map;
        this.q = CommonUtil.j(buh.e("run_course_voice_action_start_distance"));
        this.p = CommonUtil.j(buh.e("run_course_voice_action_start_time"));
        try {
            map = (Map) qqt.c(buh.e("run_course_voice_speak_aside_cache"), new TypeToken<ArrayMap<Integer, List<FitRunPlayAudio>>>() { // from class: com.huawei.health.suggestion.ui.manage.FitnessRunManager$2
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.c("Suggestion_FitRunManager", "JsonSyntaxException");
            map = Collections.EMPTY_MAP;
        }
        if (map == null || this.t == null || map.size() != this.t.size()) {
            return;
        }
        this.t = map;
    }

    private void g() {
        buh.c("run_course_voice_action_start_time");
        buh.c("run_course_voice_action_start_distance");
        buh.c("run_course_voice_speak_aside_cache");
    }

    @Override // com.huawei.health.sportservice.SportComponent
    public void destroy() {
        if (n()) {
            hcu.b().b("fitness_audio_player", 5);
            hcu.b().a("fitness_audio_player");
        }
    }

    @Override // com.huawei.health.sportservice.SportVoiceEnableListener
    public void onChange(boolean z) {
        if (n()) {
            this.f37005a.a(z);
            hcu.b().b("fitness_audio_player", z ? 102 : 101);
        }
    }
}
