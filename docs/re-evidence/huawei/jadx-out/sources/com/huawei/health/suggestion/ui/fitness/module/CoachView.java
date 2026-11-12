package com.huawei.health.suggestion.ui.fitness.module;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.distributedservice.api.DistributedApi;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.utils.ColumnLayoutItemDecoration;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.model.CoachMotion;
import com.huawei.health.suggestion.ui.fitness.adapter.CoachActionRecyclerAdapter;
import com.huawei.health.suggestion.ui.fitness.helper.BeatHelper;
import com.huawei.health.suggestion.ui.fitness.helper.GuideHelper;
import com.huawei.health.suggestion.ui.fitness.helper.MediaHelper;
import com.huawei.health.suggestion.ui.fitness.helper.VideoMediaHelper;
import com.huawei.health.suggestion.ui.fitness.mvp.CaloriesConsumeHandler;
import com.huawei.health.suggestion.ui.view.AniFrameLayout;
import com.huawei.health.suggestion.ui.view.BrightnessOrVolumeProgressPlus;
import com.huawei.health.suggestion.util.HeartRateGetterUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Comment;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.seekbar.HealthSeekBar;
import defpackage.buh;
import defpackage.fxl;
import defpackage.gzx;
import defpackage.hit;
import defpackage.hiu;
import defpackage.hix;
import defpackage.hiy;
import defpackage.hiz;
import defpackage.hjg;
import defpackage.hkc;
import defpackage.hki;
import defpackage.hmu;
import defpackage.hmx;
import defpackage.iee;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lso;
import defpackage.njy;
import defpackage.pao;
import defpackage.ped;
import defpackage.pqj;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.xkf;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class CoachView extends RelativeLayout implements SurfaceHolder.Callback, View.OnClickListener, HealthSeekBar.OnSeekBarChangeListener, MediaPlayer.OnCompletionListener, GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, SwitchView.OnSwitchStateChangeListener, CoachViewInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9357a;
    private SurfaceHolder aa;
    private int ab;
    private boolean ac;
    private GuideHelper ad;
    private ImageView ae;
    private ImageView af;
    private ImageView ag;
    private ImageView ah;
    private ImageView ai;
    private List aj;
    private boolean ak;
    private boolean al;
    private hiy am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private MediaHelper at;
    private LinearLayout au;
    private RelativeLayout av;
    private ImageView aw;
    private Runnable ax;
    private String[] ay;
    private a az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ToolsLayout f9358b;
    private List<Motion> ba;
    private OnMotionChangeListener bb;
    private DisplayMetrics bc;
    private long bd;
    private Runnable be;
    private MediaProgress bf;
    private ImageView bg;
    private RelativeLayout bh;
    private SurfaceView bi;
    private int bj;
    private long bk;
    private int bl;
    private HealthTextView bm;
    private HealthTextView bn;
    private float bo;
    private long bp;
    private String bq;
    private TranslateAnimation br;
    private LinearLayout bs;
    private Handler bt;
    private float bu;
    private BeatHelper bw;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BeatHelper f9359c;
    private int d;
    private MediaHelper e;
    private hmx f;
    private BrightnessOrVolumeProgressPlus g;
    private CaloriesConsumeHandler h;
    private TrainActionIntro i;
    private long j;
    private CoachActionRecyclerAdapter k;
    private hiu.d l;
    private e m;
    private HealthRecycleView n;
    private CoachPauseRestView o;
    private int p;
    private List<Integer> q;
    private hmu r;
    private Context s;
    private float t;
    private DistributedApi u;
    private AniFrameLayout v;
    private TranslateAnimation w;
    private String x;
    private GestureDetector y;
    private Handler z;

    private int e(boolean z, int i) {
        return z ? i - 1 : i + 1;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(HealthSeekBar healthSeekBar) {
    }

    @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(HealthSeekBar healthSeekBar) {
    }

    public CoachView(Context context) {
        this(context, null);
    }

    public CoachView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoachView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.bd = 100L;
        this.m = new e();
        this.q = new ArrayList(10);
        this.an = true;
        this.z = new hix(this);
        this.ay = new String[2];
        this.bt = new c(this);
        this.al = false;
        this.ar = false;
        this.x = "NORMAL_MODE";
        this.s = context;
        VideoMediaHelper videoMediaHelper = new VideoMediaHelper(context);
        this.at = videoMediaHelper;
        videoMediaHelper.b(new MediaPlayer.OnVideoSizeChangedListener() { // from class: hli
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
                this.e.d(mediaPlayer, i2, i3);
            }
        });
        this.bw = new BeatHelper(this.s);
        this.bc = new DisplayMetrics();
        if (context instanceof Activity) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(this.bc);
        }
        this.ab = this.bc.heightPixels;
        this.be = new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.5
            @Override // java.lang.Runnable
            public void run() {
                CoachView.this.g.setVisibility(4);
            }
        };
        if (CommonUtil.bg() && this.az == null) {
            a aVar = new a(this);
            this.az = aVar;
            lso.d(context, true, (lso.e) aVar);
        }
        if (CommonUtil.bg() && CommonUtil.bb()) {
            DistributedApi distributedApi = (DistributedApi) Services.d("DistributedService", DistributedApi.class);
            this.u = distributedApi;
            if (distributedApi != null) {
                distributedApi.init(this.s);
                this.u.setHideNavigationBar(true);
                this.u.detectLastWirelessDevice();
                return;
            }
            LogUtil.e("Suggestion_CoachView", "can not get DistributedApi.");
        }
    }

    public /* synthetic */ void d(MediaPlayer mediaPlayer, int i, int i2) {
        az();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        LogUtil.d("Suggestion_CoachView", "Training voice completion");
        this.z.sendEmptyMessage(102);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        a(false);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null || this.ar) {
            LogUtil.e("Suggestion_CoachView", "onFling lastEvent == null or curEvent == null, mIsLocked: ", Boolean.valueOf(this.ar));
            return false;
        }
        if (motionEvent.getX() - motionEvent2.getX() > 150.0f && ((double) Math.abs(f)) * 0.5d > Math.abs(f2)) {
            b(this.ai, true, CoachController.StatusSource.APP);
        } else if (motionEvent2.getX() - motionEvent.getX() <= 150.0f || ((double) Math.abs(f)) * 0.5d <= Math.abs(f2)) {
            LogUtil.d("Suggestion_CoachView", "onFling didn't change action");
        } else {
            b(this.ah, false, CoachController.StatusSource.APP);
        }
        at();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null || this.ar || !an()) {
            LogUtil.e("Suggestion_CoachView", "lastEvent == null or curEvent == null mIsLocked:", Boolean.valueOf(this.ar));
            return false;
        }
        if (EnvironmentInfo.m()) {
            LogUtil.j("Suggestion_CoachView", "onScroll mobile app engine mute volume and brightness.");
            return false;
        }
        if (motionEvent2.getRawX() < (getWidth() * 2.0f) / 5.0f && Math.abs(f2) > ((double) Math.abs(f)) * 1.2d) {
            setBrightness(f2 / (this.ab / 2.0f));
            this.g.setVisibility(0);
            return true;
        }
        if (motionEvent2.getRawX() <= (getWidth() * 3.0f) / 5.0f || Math.abs(f2) <= ((double) Math.abs(f)) * 1.2d) {
            LogUtil.d("Suggestion_CoachView", "onScroll didn't set visibility");
            return true;
        }
        setVolume(f2);
        this.g.setVisibility(0);
        return true;
    }

    public void setBrightness(float f) {
        if (!(getContext() instanceof Activity)) {
            LogUtil.j("Suggestion_CoachView", "setBrightness getContext() not instanceof Activity");
            return;
        }
        WindowManager.LayoutParams attributes = ((Activity) getContext()).getWindow().getAttributes();
        if (attributes.screenBrightness == -1.0f) {
            attributes.screenBrightness = hkc.c(getContext()) / 255.0f;
        }
        attributes.screenBrightness += f;
        if (attributes.screenBrightness > 1.0d) {
            attributes.screenBrightness = 1.0f;
        } else if (attributes.screenBrightness < 0.01d) {
            attributes.screenBrightness = 0.01f;
        } else {
            LogUtil.d("Suggestion_CoachView", "screenBrightness is normal value");
        }
        this.g.setProgressMax(1.0f);
        this.g.setProgress(attributes.screenBrightness);
        this.g.c(R.drawable.ic_video_light);
        this.g.a(getResources().getString(R.string.IDS_FitnessAdvice_brightness));
        ((Activity) getContext()).getWindow().setAttributes(attributes);
    }

    public void setVolume(float f) {
        if (!(getContext().getSystemService("audio") instanceof AudioManager)) {
            LogUtil.j("Suggestion_CoachView", "setVolume getContext().getSystemService(AUDIO_SERVICE) not instanceof AudioManager");
            return;
        }
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        this.p = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f2 = this.t + f;
        this.t = f2;
        float f3 = streamMaxVolume;
        if (Math.abs(f2) >= this.ab / (2.0f * f3)) {
            if (this.t > 0.0f) {
                int i = this.p + 1;
                this.p = i;
                audioManager.setStreamVolume(3, i, 0);
            } else {
                int i2 = this.p - 1;
                this.p = i2;
                audioManager.setStreamVolume(3, i2, 0);
            }
            this.t = 0.0f;
        }
        this.g.setProgressMax(f3);
        if (this.p <= 0) {
            this.g.c(R.drawable.ic_video_mute);
        } else {
            this.g.c(R.drawable.ic_video_voice);
        }
        int i3 = this.p;
        if (i3 >= 0) {
            this.g.setProgress(i3);
        }
        this.g.a(getResources().getString(R.string.IDS_FitnessAdvice_volume));
    }

    @Override // com.huawei.health.suggestion.ui.fitness.module.SwitchView.OnSwitchStateChangeListener
    public void onSwitchStateChange(View view, boolean z) {
        if (view == null) {
            LogUtil.e("Suggestion_CoachView", "onSwitchStateChange switchView == null");
            return;
        }
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (iIntValue == 0) {
            hiz.c(this.f9359c, z, this.o.getCoachSetCountVoice().getProgress() / 1000.0f);
            LogUtil.a("Suggestion_CoachView", "change mBeatHelper");
        } else if (iIntValue == 1) {
            hiz.c(this.ad, z, this.o.getCoachSetGuideVoice().getProgress() / 1000.0f);
            LogUtil.a("Suggestion_CoachView", "change mGuiderhelper");
        } else {
            hiz.c(this.e, z, this.o.getCoachSetBackgroundVoice().getProgress() / 1000.0f);
            LogUtil.a("Suggestion_CoachView", "change mBackgroundHelper");
        }
    }

    public void ao() {
        LogUtil.d("Suggestion_CoachView", "onResume===", Boolean.valueOf(this.ao));
        if (gzx.e(this.am)) {
            this.am.notifyDataSetChanged();
        }
        bc();
    }

    public void d(int i, boolean z) {
        LogUtil.a("Suggestion_CoachView", "applyAnimation-", Integer.valueOf(i));
        if (!z) {
            this.v.b();
            return;
        }
        if (i >= 1 && i <= 3) {
            this.v.b(i);
        } else if (i == 0) {
            this.v.b(0);
            this.v.e();
        } else {
            LogUtil.d("Suggestion_CoachView", "Animation number is unexpected");
        }
    }

    public void ai() {
        this.r.b(0.0f, 1.0f);
    }

    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9373b = 0;
        private int e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9374c = 0;
        private int d = 190;

        public int a() {
            return this.f9373b;
        }

        public void c(int i) {
            this.f9373b = i;
        }

        public int d() {
            return this.e;
        }

        public void a(int i) {
            this.e = i;
        }

        public int e() {
            return this.f9374c;
        }

        public void d(int i) {
            this.f9374c = i;
        }

        public int b() {
            return this.d;
        }

        public void b(int i) {
            this.d = i;
        }

        public void c() {
            this.f9374c--;
        }

        public void h() {
            this.f9374c++;
        }
    }

    public void ax() {
        LogUtil.a("Suggestion_CoachView", "start rest.");
        this.r.c(3);
        this.at.pause();
        this.bj = 193;
        this.m.b(193);
        boolean z = this.m.e() != this.ba.size() - 1;
        Motion motion = this.ba.get(this.m.e());
        String strC = hjg.c(motion, getResources().getString(R.string.sug_string_default));
        int restTime = getRestTime();
        CoachController.c().e(this.m.e(), restTime, restTime);
        this.o.b(restTime, z, motion.acquireName(), gzx.c(getContext().getApplicationContext(), com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal, ped.e((((this.bu * motion.acquireCalorie()) * motion.acquireGroups()) * motion.acquireDuration()) / 1000.0f)), gzx.c(getContext().getApplicationContext(), R.string.sug_fitcoach_sec, ped.j(motion.acquireDuration() * motion.acquireGroups())), strC, motion.acquirePicUrl());
    }

    public void al() {
        LogUtil.a("Suggestion_CoachView", "end rest.");
        if (hiz.d(this)) {
            this.bj = 190;
            this.m.b(190);
            this.o.e();
            hjg.a(this, this.ba.size());
            if (this.an) {
                this.ad.restEnd(this.m.a());
            } else if (njy.c(this.ba, this.m.e())) {
                hjg.c(this, this.m.e(), this.ba.get(this.m.e()), this.ba.size() - 1);
            }
            this.at.repeat();
            CoachController.c().c(this.m.e());
        }
    }

    private void ba() {
        this.bh = (RelativeLayout) findViewById(R.id.sug_coach_right_data_layout);
        hmu hmuVar = new hmu();
        this.r = hmuVar;
        this.bh.addView(hmuVar.a());
        hmx hmxVar = new hmx();
        this.f = hmxVar;
        this.bh.addView(hmxVar.a());
        this.f.j(8);
        this.o = (CoachPauseRestView) findViewById(R.id.sug_coach_set_rl_show);
        this.i = (TrainActionIntro) findViewById(R.id.sug_coach_caintro);
        this.v = (AniFrameLayout) findViewById(R.id.fl_animation);
        this.bm = (HealthTextView) findViewById(R.id.sug_tv_coach_course_name);
        this.av = (RelativeLayout) findViewById(R.id.lock_layout);
        this.aw = (ImageView) findViewById(R.id.sug_coach_iv_locked);
        ToolsLayout toolsLayout = (ToolsLayout) findViewById(R.id.sug_coach_rl_actiontools);
        this.f9358b = toolsLayout;
        toolsLayout.setIsShowLockAnim(false);
        this.ah = (ImageView) findViewById(R.id.sug_coach_iv_next);
        this.ag = (ImageView) findViewById(R.id.sug_coach_iv_pause);
        this.bi = (SurfaceView) findViewById(R.id.sfv);
        this.af = (ImageView) findViewById(R.id.sug_iv_voice_change);
        this.ai = (ImageView) findViewById(R.id.sug_coach_iv_pre);
        bv();
        this.bf = (MediaProgress) findViewById(R.id.sug_coach_mp_progress);
        this.g = (BrightnessOrVolumeProgressPlus) findViewById(R.id.brightorvolumeprogressplus_setting);
        this.ae = (ImageView) findViewById(R.id.sug_coach_iv_lock);
        this.bs = (LinearLayout) findViewById(R.id.marketing_wound_plast_view);
        this.bi.setTag(false);
        this.bg = (ImageView) findViewById(R.id.sug_screen_cast);
        if (CommonUtil.bg() && CommonUtil.bb() && !EnvironmentInfo.m()) {
            this.bg.setVisibility(0);
            this.bg.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TextUtils.isEmpty(buh.e("screenCastTipShow"))) {
                        CoachView.this.bt();
                    } else {
                        CoachView.this.bw();
                    }
                }
            });
        }
        bd();
        bp();
    }

    public void d(hiu.d dVar) {
        this.l = dVar;
    }

    private void bv() {
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.tv_total_second);
        this.bn = healthTextView;
        if (healthTextView.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.bn.getLayoutParams();
            layoutParams.topMargin = this.s.getResources().getDimensionPixelSize(R.dimen.health_common_4dp);
            layoutParams.rightMargin = this.s.getResources().getDimensionPixelSize(R.dimen.health_common_4dp);
            this.bn.setLayoutParams(layoutParams);
        }
    }

    private void bd() {
        a(this.ah, R.drawable.sug_btn_next_selector, R.drawable.sug_btn_next_normal);
        a(this.ai, R.drawable.sug_btn_last_selector, R.drawable.sug_btn_last_normal);
        a(this.af, R.drawable.sug_fitness_volume_selector, R.drawable.sug_fitness_volume_normal);
        a((ImageView) findViewById(R.id.sug_coachiv_close), R.drawable.sug_coach_back_selector, R.drawable.sug_coach_back_normal);
        if (LanguageUtil.ba(this.s)) {
            this.bf.setScaleX(-1.0f);
            this.ae.setImageResource(R.drawable.ic_sug_coach_unlock_rtl);
        }
    }

    private void a(ImageView imageView, int i, int i2) {
        if (LanguageUtil.ba(this.s)) {
            imageView.setImageDrawable(qqz.e(this.s, i2));
        } else {
            imageView.setImageResource(i);
        }
    }

    public void setTimeView(int i, int i2, boolean z) {
        hmu hmuVar = this.r;
        if (hmuVar == null) {
            LogUtil.e("Suggestion_CoachView", "setTimeView mCountTimerViewHolder == null");
        } else {
            hmuVar.c(i, i2, z);
        }
    }

    public void setTimeProgress(int i) {
        hmu hmuVar = this.r;
        if (hmuVar == null) {
            LogUtil.e("Suggestion_CoachView", "setTimeProgress mCountTimerViewHolder == null");
        } else {
            hmuVar.c(i);
        }
    }

    public int getTimeProgressMax() {
        hmu hmuVar = this.r;
        if (hmuVar == null) {
            LogUtil.e("Suggestion_CoachView", "setTimeProgress mCountTimerViewHolder == null");
            return 0;
        }
        return hmuVar.d();
    }

    public void setTimeProgressMax(int i) {
        hmu hmuVar = this.r;
        if (hmuVar == null) {
            LogUtil.e("Suggestion_CoachView", "setTimeProgressMax mCountTimerViewHolder == null");
        } else {
            hmuVar.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bw() {
        DistributedApi distributedApi = this.u;
        if (distributedApi != null) {
            int iStartWirelessProjection = distributedApi.startWirelessProjection();
            HashMap map = new HashMap(3);
            map.put("click", 1);
            map.put("courseId", this.l.e());
            map.put("action", Integer.valueOf(iStartWirelessProjection));
            lmf.d().c(this.s, AnalyticsValue.HEALTH_GYM_EQUIP_CLICK_BTN_2170008.value(), map, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bt() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.s).a(this.s.getString(R.string.IDS_screen_cast_tip)).a(this.s.getString(R.string.IDS_user_permission_know), new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                buh.d("screenCastTipShow", Boolean.toString(true));
                CoachView.this.bw();
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
        LogUtil.a("Suggestion_CoachView", "showScreenCastTipDialog.");
    }

    private void bp() {
        bo();
        bn();
        this.o.getCoachSetPausePage().setOnClickListener(new View.OnClickListener() { // from class: hlb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        });
        this.o.b().a(new TimeProgressPlus.OnTimeCountFinishListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.16
            @Override // com.huawei.health.suggestion.ui.fitness.module.TimeProgressPlus.OnTimeCountFinishListener
            public void onTimeCountFinished() {
                CoachView.this.al();
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.TimeProgressPlus.OnTimeCountFinishListener
            public void setCountDownResidueSec(int i) {
                if (CoachController.c().h()) {
                    CoachController.c().c(iee.b(CoachView.this.m.e(), CoachView.this.getRestTime(), i));
                }
            }
        });
        this.af.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoachView.this.z();
                CoachView.this.bs();
            }
        });
        this.aw.setOnClickListener(new View.OnClickListener() { // from class: hle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
        this.o.c(this);
    }

    public /* synthetic */ void b(View view) {
        LogUtil.a("Suggestion_CoachView", "click endResting.", Integer.valueOf(this.m.b()));
        if (this.m.b() == 193) {
            al();
        }
    }

    public /* synthetic */ void d(View view) {
        this.ar = false;
        this.av.setVisibility(8);
        at();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRestTime() {
        if (njy.c(this.ba, this.m.e() - 1)) {
            return this.ba.get(this.m.e() - 1).acquireGap();
        }
        return 0;
    }

    private void bn() {
        this.ah.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoachView coachView = CoachView.this;
                coachView.b(coachView.ah, false, CoachController.StatusSource.APP);
            }
        });
        this.o.getCoachSetStop().setOnClickListener(this);
        this.o.getCoachSetOk().setOnClickListener(this);
        this.o.getCoachSetContinue().setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                hiu.a(CoachView.this.l, 2);
                CoachView.this.au();
                LogUtil.a("Suggestion_CoachView", "Click Continue Button ,all continue ");
            }
        });
        this.o.getCoachSetCountVoice().setOnSeekBarChangeListener(this);
        this.o.getCoachSetGuideVoice().setOnSeekBarChangeListener(this);
        this.o.getCoachSetBackgroundVoice().setOnSeekBarChangeListener(this);
        this.o.getCoachSetPreButton().setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.21
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoachView.this.b(true);
            }
        });
        this.o.getCoachSetNextButton().setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoachView.this.b(false);
            }
        });
    }

    private void bo() {
        bq();
        this.ae.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoachView.this.ar = true;
                CoachView.this.bj();
            }
        });
        this.ag.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("Suggestion_CoachView", "mImgPlay pause");
                CoachView.this.av();
                hiu.a(CoachView.this.l, 1);
            }
        });
        findViewById(R.id.sug_coachiv_close).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoachView.this.ae();
            }
        });
        findViewById(R.id.sug_rl_coach_guide).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Suggestion_CoachView", "enter motion detail interface");
                CoachView.this.i.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.2.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        CoachView.this.ae();
                    }
                });
                CoachView.this.bu();
            }
        });
        this.ai.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoachView coachView = CoachView.this;
                coachView.b(coachView.ai, true, CoachController.StatusSource.APP);
            }
        });
    }

    private void bq() {
        this.i.setOnSlidingListener(new OnSlidingListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.7
            @Override // com.huawei.health.suggestion.ui.fitness.module.OnSlidingListener
            public void onSliding(float f) {
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnSlidingListener
            public void onSlidingFinish(boolean z) {
                if (z) {
                    CoachView.this.i.setVisibility(4);
                    CoachView.this.au();
                }
            }
        });
        this.i.getPreAction().setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoachView.this.c(true);
            }
        });
        this.i.getNextAction().setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CoachView.this.c(false);
            }
        });
    }

    @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
    public void onProgressChanged(HealthSeekBar healthSeekBar, int i, boolean z) {
        if (healthSeekBar == null) {
            LogUtil.e("Suggestion_CoachView", "onProgressChanged seekBar == null");
        } else {
            if (this.f9359c == null || this.ad == null || this.e == null) {
                return;
            }
            hiz.a(this, i, healthSeekBar.getId());
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(this.s).inflate(R.layout.sug_fitness_coachview, this);
        ba();
        SurfaceHolder holder = this.bi.getHolder();
        this.aa = holder;
        holder.addCallback(this);
        MediaHelper mediaHelper = this.at;
        if (mediaHelper != null) {
            mediaHelper.c(this.bi);
            this.at.c((ViewGroup) findViewById(R.id.sfv_parent));
            br();
        }
        this.e = new MediaHelper(this.s);
        boolean zB = pqj.b().b(this.s, SingleDailyMomentContent.COURSE_TYPE);
        LogUtil.a("Suggestion_CoachView", "onFinishInflate() enableCurLang:", Boolean.valueOf(zB));
        if (zB) {
            this.ad = new hki(this.s, this.z);
        } else {
            this.ad = new GuideHelper(this.s, this.z);
        }
        this.f9359c = new BeatHelper(this.s);
        this.bu = hjg.a();
        GestureDetector gestureDetector = new GestureDetector(this.s.getApplicationContext(), this);
        this.y = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
        setTag(false);
        fxl.e(10001, this.bs);
    }

    public void d(String str) {
        int i;
        this.x = str;
        int iM = (qrs.m() / 2) - pao.e(this.s, 24.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        if ("HORIZONTAL_FOLDING_MODE".equals(str)) {
            layoutParams = new FrameLayout.LayoutParams(-1, iM, 48);
            layoutParams2 = new FrameLayout.LayoutParams(-1, iM, 80);
            i = 0;
        } else {
            i = 8;
        }
        e(findViewById(R.id.sfv_parent), layoutParams);
        e(this.bh, layoutParams);
        e(this.v, layoutParams);
        e(this.f9358b, layoutParams2);
        e(findViewById(R.id.sug_progress_layout), layoutParams2);
        e(this.g, layoutParams2);
        e(findViewById(R.id.sug_coach_set_rl_show), layoutParams2);
        e(this.i, layoutParams2);
        e(this.av, layoutParams2);
        HealthRecycleView healthRecycleView = this.n;
        if (healthRecycleView != null) {
            healthRecycleView.setVisibility(i);
        }
    }

    private void e(View view, FrameLayout.LayoutParams layoutParams) {
        if (view == null) {
            LogUtil.j("Suggestion_CoachView", "setLayoutParamsByNoNull view null");
        } else {
            view.setLayoutParams(layoutParams);
        }
    }

    private void bh() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.sug_rcv_motions);
        this.n = healthRecycleView;
        healthRecycleView.setNestedScrollingEnabled(false);
        CoachActionRecyclerAdapter coachActionRecyclerAdapter = new CoachActionRecyclerAdapter(this.n, this.i, this.s);
        this.k = coachActionRecyclerAdapter;
        this.n.setAdapter(coachActionRecyclerAdapter);
        this.n.setLayoutManager(new LinearLayoutManager(this.s, 0, false));
        this.n.addItemDecoration(getItemDecoration());
        final ArrayList arrayList = new ArrayList();
        List<Motion> list = this.ba;
        if (list != null && list.size() != 0) {
            for (int i = 0; i < this.ba.size(); i++) {
                Motion motion = this.ba.get(i);
                CoachMotion coachMotion = new CoachMotion();
                coachMotion.setMotionImageUrl(motion.acquirePicUrl());
                coachMotion.setTotalMotionNum(this.ba.size());
                coachMotion.setCurrMotionNum(i);
                coachMotion.setMotion(motion);
                arrayList.add(coachMotion);
            }
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.6
                @Override // java.lang.Runnable
                public void run() {
                    CoachView.this.k.b(arrayList);
                }
            });
        }
        this.n.setVisibility("HORIZONTAL_FOLDING_MODE".equals(this.x) ? 0 : 8);
    }

    private ColumnLayoutItemDecoration getItemDecoration() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_8dp);
        return new ColumnLayoutItemDecoration(getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle), 0, this.ba.size(), new int[]{0, 0, dimensionPixelSize, 0});
    }

    public void c(int i) {
        HealthRecycleView healthRecycleView = this.n;
        if (healthRecycleView == null || this.k == null) {
            return;
        }
        healthRecycleView.smoothScrollToPosition(i);
        this.k.d(i, true);
    }

    private void br() {
        this.at.s().setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: hlc
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return this.d.c(mediaPlayer, i, i2);
            }
        });
    }

    public /* synthetic */ boolean c(MediaPlayer mediaPlayer, int i, int i2) {
        MediaHelper mediaHelper = this.at;
        LogUtil.j("Suggestion_CoachView", "setPlayerListener, mMediaHelper is error, what = ", Integer.valueOf(i), ", currentName = ", mediaHelper != null ? mediaHelper.f() : null);
        return false;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    private void az() {
        MediaHelper mediaHelper = this.at;
        int i = 0;
        int iH = (mediaHelper == null || mediaHelper.h() <= 0) ? 0 : this.at.h();
        MediaHelper mediaHelper2 = this.at;
        if (mediaHelper2 != null && mediaHelper2.i() > 0) {
            i = this.at.i();
        }
        hmx hmxVar = this.f;
        if (hmxVar != null) {
            hmxVar.b(iH);
        }
        hmu hmuVar = this.r;
        if (hmuVar != null) {
            hmuVar.c(iH, i);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            LogUtil.e("Suggestion_CoachView", "onTouchEvent event == null");
            return false;
        }
        if (motionEvent.getAction() == 1) {
            removeCallbacks(this.be);
            postDelayed(this.be, 1200L);
        }
        return this.y.onTouchEvent(motionEvent);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        LogUtil.a("Suggestion_CoachView", "surfaceCreated--- mIsHolderCreated = ", Boolean.valueOf(this.ap));
        bm();
        this.at.b(surfaceHolder);
        if (njy.b(this.ba)) {
            if (!this.ap) {
                bb();
            } else {
                this.ao = false;
                bc();
            }
        }
    }

    private void bb() {
        int i;
        this.ap = true;
        String[] strArr = this.ay;
        if (strArr != null && strArr.length > 0) {
            this.at.setSdSources(strArr);
            LogUtil.a("Suggestion_CoachView", "mMediaHelper.setSdSources(mMotionPath):", Integer.valueOf(this.ay.length));
            this.bm.setText(this.l.j());
            this.bj = 190;
            this.m.b(190);
            j(this.bl);
            hjg.a(this, this.ba.size());
            be();
            LogUtil.a("Suggestion_CoachView", "afterHolderCreate -------");
            Runnable runnable = new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.11
                @Override // java.lang.Runnable
                public void run() {
                    if (CoachView.this.m.e() == 0) {
                        LogUtil.j("Suggestion_CoachView", "afterHolderCreate mMediaHelper not playing -- to replay: ", Integer.valueOf(CoachView.this.m.e()));
                        CoachView.this.at.start();
                    }
                }
            };
            this.ax = runnable;
            postDelayed(runnable, 185L);
            this.r.c();
            if (this.bl < this.ba.size() && (i = this.bl) >= 0) {
                this.f9359c.resetBeatNum(this.ba.get(i).acquireRepeat());
            }
            this.f9358b.setVisibility(0);
            this.as = true;
            return;
        }
        LogUtil.e("Suggestion_CoachView", "mMotionPath is null");
    }

    private void be() {
        this.at.start();
        int size = this.ba.size();
        LogUtil.a("Suggestion_CoachView", "{}---initFirstMotion--{}=={}", Integer.valueOf(size), this.ba.get(0).acquireName(), Boolean.valueOf(this.at.o()));
        this.ad.firstMotion(this.ba.get(0));
    }

    private void bm() {
        String strE = hjg.e("voicecoachviewcount");
        String strE2 = hjg.e("voicecoachviewbg");
        String strE3 = hjg.e("voicecoachviewguide");
        try {
            float f = (Integer.parseInt(strE) * 1.0f) / 1000.0f;
            this.bo = f;
            this.f9359c.b(f);
            this.ad.b((Integer.parseInt(strE3) * 1.0f) / 1000.0f);
            this.e.b((Integer.parseInt(strE2) * 0.5f) / 1000.0f);
        } catch (NumberFormatException e2) {
            LogUtil.a("Suggestion_CoachView", e2.getMessage());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        LogUtil.a("Suggestion_CoachView", "surfaceChanged");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.ao = true;
        LogUtil.a("Suggestion_CoachView", "surfaceDestroyed");
    }

    public void z() {
        LogUtil.a("Suggestion_CoachView", "allPause()--");
        ImageView imageView = this.ag;
        if (imageView != null) {
            a(imageView, R.drawable.sug_fitness_play_normal, R.drawable.sug_fitness_play_normal);
        }
        if (this.m.b() != -100) {
            this.at.pause();
            this.e.pause();
            this.f9359c.pause();
            HeartRateGetterUtil.d().d(1, !CoachController.c().f());
            CoachController.c().d(CoachController.StatusSource.APP, 2);
            if (this.m.b() == 193) {
                this.o.b().d();
            } else {
                bi();
                if (this.bb != null && njy.c(this.ba, this.m.e())) {
                    this.bb.onMotionPause(this.ba.get(this.m.e()), this.m.e());
                }
            }
        }
        this.as = false;
    }

    public void as() {
        LogUtil.a("Suggestion_CoachView", "onPause()--mIsHolderCreated=", Boolean.valueOf(this.ap));
        if (this.ap) {
            z();
            this.as = false;
        }
    }

    private void bi() {
        if (this.m.b() == 191) {
            this.f9359c.b();
            this.ad.voiceGuidePause();
            this.z.removeMessages(153);
            this.j = this.d;
            return;
        }
        if (this.m.b() == 190) {
            this.ad.voiceGuidePause();
        } else {
            LogUtil.d("Suggestion_CoachView", "Action mStation is not BEATING or GUIDING");
        }
    }

    public void aq() {
        LogUtil.a("Suggestion_CoachView", "onAllContinue");
        ImageView imageView = this.ag;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.sug_fitness_pause_selector);
        }
        if (hjg.b(this.ap, this.m.b(), this.ao)) {
            LogUtil.a("Suggestion_CoachView", "onAllContinue ??");
            hiz.e(this, this.z);
            HeartRateGetterUtil.d().d(0, !CoachController.c().f());
            CoachController.c().d(CoachController.StatusSource.APP, 1);
            if (this.bb != null && njy.c(this.ba, this.m.e())) {
                this.bb.onMotionContinue(this.ba.get(this.m.e()), this.m.e());
            }
            this.as = true;
        }
    }

    private void bc() {
        LogUtil.a("Suggestion_CoachView", "allContinue", ",mIsPlaying=", Boolean.valueOf(this.as), ",mIsHolderCreated=", Boolean.valueOf(this.ap), ",mCoachState.acquireStation()=", Integer.valueOf(this.m.b()), ",mIsSurfaceDestroyed=", Boolean.valueOf(this.ao));
        if (this.as || !hjg.b(this.ap, this.m.b(), this.ao)) {
            return;
        }
        aq();
    }

    public boolean an() {
        return this.as;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (hjg.a(id)) {
            au();
            hiu.a(this.l, 2);
            return;
        }
        if (hjg.d(this, id)) {
            if (qrs.r()) {
                LogUtil.a("Suggestion_CoachView", "isFastClick stop");
                return;
            }
            LogUtil.a("Suggestion_CoachView", ":training completed");
            this.al = true;
            if (ak()) {
                hiu.a(this.l, 3);
            }
            this.bb.onCustomBeave();
            return;
        }
        LogUtil.d("Suggestion_CoachView", "Click action is not Continue or Finish");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bj() {
        this.f9358b.setVisibility(4);
        lrd.c(this.f9358b, qre.i(R.string.accessibility_playback_control_hide));
        this.bt.removeCallbacksAndMessages(null);
        this.bt.sendMessage(this.bt.obtainMessage(1203));
        this.bt.sendMessageDelayed(this.bt.obtainMessage(1202), 7000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            this.e.pre();
        } else {
            this.e.next();
        }
        this.o.getCoachSetMotionText().setText(this.e.f());
        d(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bu() {
        z();
        e(this.i);
        this.m.b(194);
        this.i.d(UnitUtil.e(this.m.e() + 1, 1, 0), UnitUtil.e(this.ba.size(), 1, 0));
        h(this.m.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        int iE = e(z, this.i.getCurrentIndex());
        if (g(iE)) {
            this.i.setCurrentIndex(UnitUtil.e(iE, 1, 0));
            h(iE - 1);
        }
    }

    private boolean g(int i) {
        return i > 0 && i <= this.ba.size();
    }

    public void b(ImageView imageView, boolean z, CoachController.StatusSource statusSource) {
        if (imageView == null) {
            LogUtil.j("Suggestion_CoachView", "changeAction img == null");
            return;
        }
        if (imageView.getAlpha() == 1.0f) {
            this.z.removeCallbacksAndMessages(null);
            this.v.d();
            this.bt.removeCallbacksAndMessages(null);
            this.f9358b.setIsShowBottomProgress(false);
            if (z) {
                af();
                LogUtil.a("Suggestion_CoachView", "change to previous action");
            } else {
                ah();
                LogUtil.a("Suggestion_CoachView", "change to next action");
            }
            c(this.m.e());
        }
        a(z, statusSource);
    }

    private void d(boolean z) {
        a(z, CoachController.StatusSource.APP);
    }

    public void a(boolean z, CoachController.StatusSource statusSource) {
        hiu.d dVar = this.l;
        if (dVar != null) {
            dVar.c(z ? 2 : 1);
        }
        hiu.e(this.l, statusSource);
    }

    public void ae() {
        LogUtil.a("Suggestion_CoachView", "click x button");
        if (bk()) {
            this.bb.onCustomBeave();
        } else if (this.m.b() == 193) {
            al();
        } else {
            bf();
        }
    }

    private void bf() {
        if (this.m.b() == 194) {
            a(this.i);
        } else {
            au();
        }
    }

    private boolean bk() {
        return (this.bb != null && this.m.b() == 190) || this.m.b() == 191;
    }

    public void aa() {
        long j = this.bp + ((long) this.d);
        this.bp = j;
        this.d = 0;
        this.bp = (j / 1000) * 1000;
        this.f9357a = 0;
        LogUtil.d("Suggestion_CoachView", "action completed");
        hiz.d(this, this.z);
        Motion motionBl = bl();
        this.m.a(0);
        this.m.c(0);
        this.r.c();
        this.an = false;
        hiz.d(this, motionBl);
    }

    private Motion bl() {
        Motion motion;
        LogUtil.a("Suggestion_CoachView", "save process for training, current action:{} current group:{} current beat:{}", Integer.valueOf(this.m.e()), Integer.valueOf(this.m.a()), Integer.valueOf(this.m.d()));
        if (njy.c(this.ba, this.m.e())) {
            motion = this.ba.get(this.m.e());
        } else {
            motion = new Motion();
        }
        int iA = (this.m.a() * motion.acquireRepeat()) + this.m.d();
        if (this.ak && !"timer".equals(motion.acquireMotionType())) {
            iA--;
        }
        if (motion.acquireGroups() * motion.acquireRepeat() == 0) {
            LogUtil.j("Suggestion_CoachView", "Division by zero attempted!");
            return motion;
        }
        hjg.b(this, iA / ((motion.acquireGroups() * motion.acquireRepeat()) * 1.0f));
        if (iA > motion.acquireProgress()) {
            motion.saveProgress(iA);
        }
        return motion;
    }

    public void b(Motion motion) {
        this.z.removeMessages(153);
        long j = this.bp;
        long j2 = this.d;
        this.d = 0;
        this.bp = (long) (((j + j2) / 1000.0f) * 1000.0f);
        this.f9357a = 0;
        LogUtil.d("Suggestion_CoachView", "a group of actions completed.");
        this.ad.saveCurrent(-1);
        this.m.a(0);
        this.r.c();
        hjg.c(this, motion);
        this.an = true;
    }

    public void ab() {
        this.bf.setProgress(this.m.e(), this.m.a(), 0.0f);
        if (njy.e(this.ba, this.m.e())) {
            LogUtil.e("Suggestion_CoachView", "mMotions is out of bounds");
            return;
        }
        Motion motion = this.ba.get(this.m.e());
        hjg.a(this, this.ba.size());
        j(this.m.e());
        this.f9359c.resetBeatNum(motion.acquireRepeat());
    }

    public void af() {
        if (this.o.getVisibility() == 0) {
            this.o.setVisibility(4);
        }
        this.m.c(0);
        aa();
        this.m.c();
        if (this.m.e() < 0) {
            this.m.d(0);
            this.ad.firstMotion(this.ba.get(this.m.e()));
        } else if (this.m.e() == 0) {
            this.ad.firstMotion(this.ba.get(this.m.e()));
        } else {
            this.ad.preMotion(this.ba.get(this.m.e()));
        }
        LogUtil.a("Suggestion_CoachView", "change to previous action, current action:{}", Integer.valueOf(this.m.e()));
        this.at.pre();
        CoachController.c().e(CoachController.StatusSource.APP, this.m.e());
        this.bj = 190;
        this.m.b(190);
        ab();
    }

    public void ah() {
        if (this.o.getVisibility() == 0) {
            this.o.setVisibility(4);
        }
        this.ad.n();
        this.m.c(0);
        aa();
        this.m.h();
        if (this.m.e() >= this.ba.size()) {
            this.m.d(this.ba.size() - 1);
            this.ad.lastMotion(this.ba.get(this.m.e()));
        } else if (this.m.e() == this.ba.size() - 1) {
            this.ad.lastMotion(this.ba.get(this.m.e()));
        } else {
            this.ad.nextMotion(this.ba.get(this.m.e()));
        }
        LogUtil.a("Suggestion_CoachView", "change to next action, current action:{}", Integer.valueOf(this.m.e()));
        this.at.next();
        CoachController.c().c(CoachController.StatusSource.APP, this.m.e());
        this.bj = 190;
        this.m.b(190);
        ab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bs() {
        this.m.b(195);
        this.o.d();
        z();
        this.e.videoContinue();
    }

    public void av() {
        removeCallbacks(this.be);
        post(this.be);
        z();
        this.m.b(PsExtractor.AUDIO_STREAM);
        if (njy.e(this.ba, this.m.e())) {
            LogUtil.j("Suggestion_CoachView", "mMotions is outOfBounds");
            return;
        }
        Motion motion = this.ba.get(this.m.e());
        this.o.a(motion.acquireName(), gzx.c(getContext().getApplicationContext(), com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal, ped.e((((this.bu * motion.acquireCalorie()) * motion.acquireGroups()) * motion.acquireDuration()) / 1000.0f)), gzx.c(getContext().getApplicationContext(), R.string.sug_fitcoach_sec, ped.j(motion.acquireDuration() * motion.acquireGroups())), hjg.c(motion, getResources().getString(R.string.sug_string_default)), motion.acquirePicUrl());
        lrd.c(this.f9358b, 4);
        lrd.c(this.bh, 4);
        lrd.c(this.v, 4);
    }

    public void au() {
        this.m.b(this.bj);
        if (CoachController.c().h() && this.m.b() == 193) {
            this.o.a();
            aq();
        } else {
            aq();
            this.o.setVisibility(4);
            lrd.c(this.f9358b, 0);
            lrd.c(this.bh, 0);
        }
    }

    public void ay() {
        this.at.repeat();
    }

    private void h(int i) {
        List<Motion> list = this.ba;
        if (list == null || njy.e(list, i)) {
            LogUtil.e("Suggestion_CoachView", "mMoions is null or currPosition is invalid: ", Integer.valueOf(i));
            return;
        }
        Motion motion = this.ba.get(i);
        this.aj.clear();
        this.aj.add(motion);
        if (gzx.e(motion.acquireCovers())) {
            this.aj.add(motion.acquireCovers());
        }
        hjg.d(this, i, this.ba.size() - 1);
        this.i.setAdapter(this.am);
        this.am.notifyDataSetChanged();
    }

    public void setMotions(List<Motion> list, int i) {
        this.bl = i;
        this.ba = list;
        this.bf.setMotions(list);
        this.f.c((int) hit.d(this.ba, this.bu, false));
        this.ay = new String[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (TextUtils.isEmpty(list.get(i2).acquireMotionPath())) {
                this.ay[i2] = "";
            } else {
                this.ay[i2] = list.get(i2).acquireMotionPath();
            }
        }
        LogUtil.a("Suggestion_CoachView", "saveMotions----size-", Integer.valueOf(list.size()));
        this.aj = new ArrayList(10);
        hiy hiyVar = new hiy(this.aj, R.layout.sug_coach_vp_intro);
        this.am = hiyVar;
        hiyVar.e(this.bq);
        this.i.setAdapter(this.am);
        bh();
        c(this.m.e());
    }

    public void e(int i) {
        LogUtil.a("Suggestion_CoachView", "refresh guide voice");
        List<Motion> list = this.ba;
        if (list == null || njy.e(list, i)) {
            LogUtil.e("Suggestion_CoachView", "mMoions is null or startPosition is invalid: ", Integer.valueOf(i));
            return;
        }
        List<Comment> listAcquireCommentaryTraining = this.ba.get(i).acquireCommentaryTraining();
        if (njy.b(listAcquireCommentaryTraining)) {
            this.q.clear();
            ArrayList arrayList = new ArrayList(listAcquireCommentaryTraining.size() + 1);
            d(listAcquireCommentaryTraining, arrayList);
            this.ad.c(arrayList).saveCurrent(-1);
        }
    }

    private void d(List<Comment> list, List list2) {
        for (Comment comment : list) {
            if (comment != null) {
                int iRound = Math.round(comment.acquireTime() / 1000.0f) <= 0 ? 1 : Math.round(comment.acquireTime() / 1000.0f);
                this.q.add(Integer.valueOf(iRound));
                LogUtil.a("Suggestion_CoachView", "guide voice times: ", Integer.valueOf(iRound));
                list2.add(xkf.c(comment.acquireName()));
            }
        }
    }

    public CoachView b(String str) {
        this.e.d(str);
        if (!this.e.o()) {
            this.e.start();
        }
        this.o.getCoachSetMotionText().setText(str);
        return this;
    }

    public void ar() {
        LogUtil.a("Suggestion_CoachView", "CoachView release---");
        lso.d(this.s, false, (lso.e) this.az);
        this.z.removeCallbacksAndMessages(null);
        BeatHelper beatHelper = this.f9359c;
        if (beatHelper != null) {
            beatHelper.n();
            this.f9359c.release();
        }
        GuideHelper guideHelper = this.ad;
        if (guideHelper != null) {
            if (guideHelper.o() && this.ad.e() == 1) {
                LogUtil.a("Suggestion_CoachView", "mGuiderHelp isPlaying.not release.");
                this.ad.a(new OnFitnessStatusChangeCallback() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.15
                    @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
                    public void onUpdate() {
                        if (CoachView.this.ad != null) {
                            CoachView.this.ad.n();
                            CoachView.this.ad.release();
                        }
                    }
                });
            } else {
                this.ad.n();
                this.ad.release();
            }
        }
        MediaHelper mediaHelper = this.at;
        if (mediaHelper != null) {
            mediaHelper.n();
            this.at.release();
        }
        MediaHelper mediaHelper2 = this.e;
        if (mediaHelper2 != null) {
            mediaHelper2.n();
            this.e.release();
        }
        BeatHelper beatHelper2 = this.bw;
        if (beatHelper2 != null) {
            beatHelper2.n();
            this.bw.release();
        }
        DistributedApi distributedApi = this.u;
        if (distributedApi != null) {
            distributedApi.destroyWirelessProjection();
        }
        CoachController.c().d(CoachController.StatusSource.APP, 3);
    }

    public void e(OnMotionChangeListener onMotionChangeListener) {
        this.bb = onMotionChangeListener;
    }

    private void j(int i) {
        String str;
        String strE = UnitUtil.e(this.ba.size(), 1, 0);
        String strE2 = UnitUtil.e(i + 1, 1, 0);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            str = String.format(Locale.ENGLISH, "%s %s%s%s  ", this.ba.get(i).acquireName(), strE, "/", strE2);
        } else {
            str = String.format(Locale.ENGLISH, "%s%s%s %s  ", strE2, "/", strE, this.ba.get(i).acquireName());
        }
        this.r.a(str);
        if ("timer".equals(this.ba.get(i).acquireMotionType())) {
            setTimeView(-1, (int) (this.ba.get(i).acquireDuration() / 1000.0f), true);
        } else {
            setTimeView(-1, this.ba.get(i).acquireRepeat(), false);
        }
    }

    public int getTrainStation() {
        return this.m.b();
    }

    public void at() {
        this.f9358b.setVisibility(this.f9358b.getVisibility() == 0 ? 4 : 0);
        if (lrd.d()) {
            LogUtil.a("Suggestion_CoachView", "toggleTool isTouchExplorationEnabled");
            ToolsLayout toolsLayout = this.f9358b;
            lrd.c(toolsLayout, qre.i(toolsLayout.getVisibility() == 0 ? R.string.accessibility_playback_control_show : R.string.accessibility_playback_control_hide));
        } else {
            this.bt.removeCallbacksAndMessages(null);
            this.bt.sendMessageDelayed(this.bt.obtainMessage(1201), 7000L);
        }
    }

    public void setGender(int i) {
        this.ad.c(i);
        this.f9359c.c(i);
        this.bw.c(i);
    }

    public void ag() {
        this.ak = false;
    }

    private void a(final View view) {
        if (this.w == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            this.w = translateAnimation;
            translateAnimation.setDuration(400L);
            this.w.setInterpolator(new DecelerateInterpolator());
            this.w.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.14
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    view.setVisibility(4);
                    CoachView.this.au();
                }
            });
        }
        view.startAnimation(this.w);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.module.CoachViewInterface
    public void finishTrain() {
        LogUtil.a("Suggestion_CoachView", "finishTrain-----");
        Motion motionBl = bl();
        this.m.b(-100);
        ar();
        OnMotionChangeListener onMotionChangeListener = this.bb;
        if (onMotionChangeListener != null) {
            onMotionChangeListener.onMotionOver(motionBl, this.m.e());
            this.bb.onTrainOver(this.aq);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        LogUtil.a("Suggestion_CoachView", "onSingleTapConfirmed mIsLocked", Boolean.valueOf(this.ar));
        if (this.ar) {
            bj();
            return true;
        }
        at();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.ar) {
            LogUtil.a("Suggestion_CoachView", "onDoubleTap mIsLocked true");
            return true;
        }
        if (this.m.b() != 193) {
            ReleaseLogUtil.d("Suggestion_CoachView", "onDoubleTap toPause");
            hiu.a(this.l, 1);
            av();
        }
        return true;
    }

    public void e(final View view) {
        if (this.br == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.br = translateAnimation;
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            this.br.setDuration(400L);
            this.br.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachView.13
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    view.setVisibility(0);
                }
            });
        }
        view.startAnimation(this.br);
    }

    public void aw() {
        if (this.m.b() != 192) {
            this.bj = this.m.b();
            this.m.b(PsExtractor.AUDIO_STREAM);
        }
    }

    public void ap() {
        if (this.o.getVisibility() != 0) {
            this.m.b(this.bj);
            aq();
        }
    }

    public e i() {
        return this.m;
    }

    public CoachPauseRestView f() {
        return this.o;
    }

    public int x() {
        return this.bj;
    }

    public void a(boolean z) {
        if (z) {
            View viewInflate = ((ViewStub) findViewById(R.id.viewstub)).inflate();
            if (viewInflate instanceof LinearLayout) {
                this.au = (LinearLayout) viewInflate;
                bg();
                return;
            }
            return;
        }
        LinearLayout linearLayout = this.au;
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
        }
    }

    private void bg() {
        if (EnvironmentInfo.m()) {
            View viewFindViewById = this.au.findViewById(R.id.sug_guid_brightness);
            View viewFindViewById2 = this.au.findViewById(R.id.sug_guid_volume);
            viewFindViewById.setVisibility(4);
            viewFindViewById2.setVisibility(4);
        }
    }

    public void a(String str) {
        this.bq = str;
        this.at.b(str);
        this.e.b(str);
        this.f9359c.b(str);
        this.ad.b(str);
        this.bw.b(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.be);
        removeCallbacks(this.ax);
        this.bt.removeCallbacksAndMessages(null);
    }

    public long q() {
        return this.bd;
    }

    public SurfaceView w() {
        return this.bi;
    }

    public ImageView n() {
        return this.ah;
    }

    public ImageView m() {
        return this.ai;
    }

    public HealthTextView v() {
        return this.bn;
    }

    public int a() {
        return this.f9357a;
    }

    public void b(int i) {
        this.f9357a = i;
    }

    public int d() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public BeatHelper e() {
        return this.f9359c;
    }

    public MediaHelper b() {
        return this.e;
    }

    public long h() {
        return this.j;
    }

    public void a(long j) {
        this.j = j;
    }

    public TrainActionIntro j() {
        return this.i;
    }

    public boolean l() {
        return this.ak;
    }

    public GuideHelper o() {
        return this.ad;
    }

    public OnMotionChangeListener p() {
        return this.bb;
    }

    public MediaProgress r() {
        return this.bf;
    }

    public ToolsLayout c() {
        return this.f9358b;
    }

    public void setCaloreHeartViewsVisibility(int i) {
        hmx hmxVar = this.f;
        if (hmxVar == null) {
            LogUtil.j("Suggestion_CoachView", "mCalorieHeartViewHoldr == null");
        } else {
            hmxVar.j(i);
        }
    }

    public void e(boolean z) {
        this.aq = z;
    }

    public void d(int i) {
        this.bj = i;
    }

    public List<Integer> g() {
        return this.q;
    }

    public MediaHelper t() {
        return this.at;
    }

    public List<Motion> s() {
        return this.ba;
    }

    public void c(long j) {
        this.bk = j;
    }

    public boolean k() {
        return this.ac;
    }

    public long u() {
        return this.bk;
    }

    public long y() {
        return this.bp;
    }

    public BeatHelper ad() {
        return this.bw;
    }

    public boolean ak() {
        return this.aq;
    }

    public float ac() {
        return this.bo;
    }

    public void b(float f) {
        this.bo = f;
    }

    /* JADX INFO: loaded from: classes31.dex */
    static class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<CoachView> f9372a;

        c(CoachView coachView) {
            this.f9372a = new WeakReference<>(coachView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.e("Suggestion_CoachView", "UpdateUiHandler msg is null!");
                return;
            }
            super.handleMessage(message);
            CoachView coachView = this.f9372a.get();
            if (coachView == null) {
                LogUtil.e("Suggestion_CoachView", "UpdateUiHandler mWeakRefView.get() == null");
                return;
            }
            if (message.what == 1200) {
                LogUtil.j("Suggestion_CoachView", "last updateTime is 5 mins ago");
                return;
            }
            if (message.what == 1201 && coachView.f9358b != null && coachView.f9358b.getVisibility() == 0) {
                coachView.f9358b.setVisibility(8);
                lrd.c(coachView.f9358b, qre.i(R.string.accessibility_playback_control_hide));
            } else if (message.what == 1203 && coachView.av != null) {
                coachView.av.setVisibility(hjg.e(coachView.av));
            } else if (message.what == 1202 && coachView.av != null && coachView.av.getVisibility() == 0) {
                coachView.av.setVisibility(8);
            } else {
                LogUtil.d("Suggestion_CoachView", "Message mStation unexpected");
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.module.CoachViewInterface
    public void updateHeartRate(int i) {
        Message messageObtainMessage = this.bt.obtainMessage(1200);
        this.bt.removeMessages(1200);
        this.bt.sendMessageDelayed(messageObtainMessage, 300000L);
        this.f.i(i);
    }

    public void e(float f) {
        CoachController.c().a(f);
        this.f.e(f / 1000.0f);
        this.f.g((int) f);
    }

    public void c(int i, int i2) {
        this.f.b(i, i2);
    }

    public void setScreenCastVisibility(int i) {
        qsp.c((View) this.bg, i);
    }

    public boolean am() {
        return this.al;
    }

    public void setClickStop(boolean z) {
        this.al = z;
    }

    public boolean aj() {
        return this.ar;
    }

    public void setCaloriesConsumeHandler(CaloriesConsumeHandler caloriesConsumeHandler) {
        this.h = caloriesConsumeHandler;
    }

    public CaloriesConsumeHandler getCaloriesConsumeHandler() {
        return this.h;
    }

    public float getWeight() {
        return this.bu;
    }

    static class a extends lso.e {
        private final WeakReference<CoachView> e;

        a(CoachView coachView) {
            this.e = new WeakReference<>(coachView);
        }

        @Override // lso.e, android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            CoachView coachView = this.e.get();
            if (coachView != null) {
                boolean z = coachView.as;
                LogUtil.a("Suggestion_CoachView", "onCallStateChanged state = ", Integer.valueOf(i), ", mIsPlaying = ", Boolean.valueOf(z));
                if (z && i == 1) {
                    coachView.av();
                    return;
                }
                return;
            }
            LogUtil.j("Suggestion_CoachView", "MyPhoneStateListener onCallStateChanged coachView == null");
        }
    }
}
