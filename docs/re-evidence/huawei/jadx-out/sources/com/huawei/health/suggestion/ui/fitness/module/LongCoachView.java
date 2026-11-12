package com.huawei.health.suggestion.ui.fitness.module;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.extractor.ts.PsExtractor;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.common.collect.UnmodifiableIterator;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.distributedservice.api.DistributedApi;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.BaseCoachActivity;
import com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity;
import com.huawei.health.suggestion.ui.fitness.activity.OpenMembershipActivity;
import com.huawei.health.suggestion.ui.fitness.helper.LongMediaHelper;
import com.huawei.health.suggestion.ui.fitness.helper.MediaHelper;
import com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper;
import com.huawei.health.suggestion.ui.fitness.helper.VolumeChangeObserver;
import com.huawei.health.suggestion.ui.fitness.mvp.CaloriesConsumeHandler;
import com.huawei.health.suggestion.ui.view.AniFrameLayout;
import com.huawei.health.suggestion.ui.view.BrightnessOrVolumeProgressPlus;
import com.huawei.health.suggestion.util.HeartRateGetterUtil;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.VideoSegment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.HealthButtonBarLayout;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.seekbar.HealthSeekBar;
import defpackage.buh;
import defpackage.fxl;
import defpackage.gzx;
import defpackage.hit;
import defpackage.hiu;
import defpackage.hjg;
import defpackage.hjr;
import defpackage.hka;
import defpackage.hkb;
import defpackage.hke;
import defpackage.hkf;
import defpackage.hku;
import defpackage.hla;
import defpackage.hma;
import defpackage.hme;
import defpackage.hmx;
import defpackage.hmz;
import defpackage.hnb;
import defpackage.hnn;
import defpackage.iei;
import defpackage.ifq;
import defpackage.iov;
import defpackage.irz;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lso;
import defpackage.ltc;
import defpackage.njy;
import defpackage.pao;
import defpackage.ped;
import defpackage.qpx;
import defpackage.qqp;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class LongCoachView extends RelativeLayout implements SurfaceHolder.Callback, View.OnClickListener, GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, CoachViewInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9382a;
    private HealthTextView aa;
    private hjr ab;
    private hmz ac;
    private DistributedApi ad;
    private int ae;
    private AniFrameLayout af;
    private GestureDetector ag;
    private String ah;
    private Handler ai;
    private ImageView aj;
    private int ak;
    private ImageView al;
    private ImageView am;
    private SurfaceHolder an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private ImageView ar;
    private ImageView as;
    private boolean at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private boolean az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LongMediaHelper f9383b;
    private boolean ba;
    private boolean bb;
    private boolean bc;
    private boolean bd;
    private boolean be;
    private boolean bf;
    private boolean bg;
    private boolean bh;
    private LinearLayout bi;
    private RelativeLayout bj;
    private int bk;
    private int bl;
    private boolean bm;
    private HealthSeekBar bn;
    private OnLongVideoChangeListener bo;
    private int bp;
    private ImageView bq;
    private LongMediaHelper br;
    private OnMotionChangeListener bs;
    private d bt;
    private List<Motion> bu;
    private DisplayMetrics bv;
    private PopupWindow bw;
    private CustomAlertDialog bx;
    private HealthTextView by;
    private LinearLayout bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ToolsLayout f9384c;
    private HealthTextView ca;
    private HealthTextView cb;
    private HealthTextView cc;
    private hnn cd;
    private RelativeLayout ce;
    private HealthTextView cf;
    private HealthTextView cg;
    private Runnable ch;
    private int ci;
    private float cj;
    private int ck;
    private ImageView cl;
    private hnb cm;
    private Map<Integer, hma> cn;
    private SurfaceView co;
    private HealthTextView cp;
    private int cq;
    private HealthTextView cr;
    private HealthTextView cs;
    private HealthTextView ct;
    private HealthTextView cu;
    private int cv;
    private final Handler cw;
    private long cx;
    private long cy;
    private Map<Integer, ArrayList<hme>> cz;
    private BrightnessOrVolumeProgressPlus d;
    private long da;
    private VolumeChangeObserver db;
    private int dc;
    private String dd;
    private List<VideoSegment> de;
    private HealthProgressBar df;
    private int dg;
    private LinearLayout dh;
    private Consumer<Boolean> di;
    private Handler dj;
    private float dk;
    private long e;
    private final Handler f;
    private hiu.d g;
    private hmx h;
    private int i;
    private CaloriesConsumeHandler j;
    private hla k;
    private String l;
    private CoachPauseRestView m;
    private String n;
    private Context o;
    private float p;
    private int q;
    private int r;
    private final int[] s;
    private final int[] t;
    private HealthTextView u;
    private LinearLayout v;
    private HealthTextView w;
    private HealthTextView x;
    private HealthTextView y;
    private float z;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
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

    public LongCoachView(Context context) {
        this(context, null);
    }

    public LongCoachView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LongCoachView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new hla();
        this.ah = "NORMAL_MODE";
        this.ax = true;
        this.az = true;
        this.ai = new hka(this);
        this.cx = 0L;
        this.cy = 0L;
        this.bk = 0;
        this.dj = new hku(this);
        this.bp = 0;
        this.de = new ArrayList(16);
        this.bd = false;
        this.be = false;
        this.cj = 1.0f;
        this.aq = false;
        this.cq = 10001;
        this.ao = false;
        this.ba = false;
        this.bc = false;
        this.s = new int[]{R.string.IDS_long_video_fhd, R.string.IDS_long_video_hd, R.string.IDS_long_video_sd};
        this.t = new int[]{R.string.IDS_long_video_fhd_quality, R.string.IDS_long_video_hd_quality, R.string.IDS_long_video_sd_quality};
        this.cz = new HashMap();
        this.cw = new Handler(Looper.getMainLooper());
        this.f = new Handler(Looper.getMainLooper());
        this.dg = -1;
        this.ay = false;
        this.o = context;
        LongMediaHelper longMediaHelper = new LongMediaHelper(1);
        this.br = longMediaHelper;
        longMediaHelper.b(new Player.Listener() { // from class: com.huawei.health.suggestion.ui.fitness.module.LongCoachView.1
            @Override // androidx.media3.common.Player.Listener
            public void onVideoSizeChanged(VideoSize videoSize) {
                LongCoachView.this.bg();
                LongCoachView.this.be();
            }
        });
        this.bv = new DisplayMetrics();
        if (context instanceof Activity) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(this.bv);
        }
        this.ak = this.bv.heightPixels;
        this.ch = new Runnable() { // from class: hlg
            @Override // java.lang.Runnable
            public final void run() {
                this.e.an();
            }
        };
        if (CommonUtil.bg() && this.bt == null) {
            d dVar = new d(this);
            this.bt = dVar;
            lso.d(context, true, (lso.e) dVar);
        }
        if (CommonUtil.bg() && CommonUtil.bb()) {
            DistributedApi distributedApi = (DistributedApi) Services.d("DistributedService", DistributedApi.class);
            this.ad = distributedApi;
            if (distributedApi != null) {
                distributedApi.init(this.o);
                this.ad.setHideNavigationBar(true);
                this.ad.detectLastWirelessDevice();
                return;
            }
            LogUtil.e("Suggestion_LongCoachView", "can not get DistributedApi.");
        }
    }

    public /* synthetic */ void an() {
        this.d.setVisibility(4);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!this.be) {
            return true;
        }
        if (this.ba) {
            bx();
        } else {
            bc();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.be && !this.ba) {
            ReleaseLogUtil.d("Suggestion_LongCoachView", "onDoubleTap toPause");
            hiu.a(this.g, 1);
            bb();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        a(false);
        if (this.br == null) {
            LogUtil.j("Suggestion_LongCoachView", "onDown mMediaHelper is null.");
            return false;
        }
        this.cx = System.currentTimeMillis();
        this.r = this.br.j();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null || this.ba || !ai()) {
            LogUtil.j("Suggestion_LongCoachView", "lastEvent == null or curEvent == null mIsLocked:", Boolean.valueOf(this.ba));
            return false;
        }
        if (Math.abs(f2) > ((double) Math.abs(f)) * 1.2d) {
            return d(motionEvent, f2);
        }
        if (Math.abs(f) <= ((double) Math.abs(f2)) * 1.2d) {
            LogUtil.d("Suggestion_LongCoachView", "onScroll didn't set visibility");
            return false;
        }
        return e(motionEvent, motionEvent2, f);
    }

    private boolean e(MotionEvent motionEvent, MotionEvent motionEvent2, float f) {
        if (this.ax) {
            this.ax = false;
            this.az = true;
        }
        if (!this.az) {
            LogUtil.j("Suggestion_LongCoachView", "onScroll current sliding is horizontal, invalid.");
            return false;
        }
        if (!bw()) {
            LogUtil.j("Suggestion_LongCoachView", "leftRightDragOperation isCourseEntrance is true.");
            return false;
        }
        this.bd = true;
        this.ai.removeCallbacksAndMessages(null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.cy = jCurrentTimeMillis;
        if (jCurrentTimeMillis - this.cx < 300) {
            this.bk = motionEvent2.getX() - motionEvent.getX() > 0.0f ? 1 : -1;
            if (LanguageUtil.ba(this.o)) {
                this.bk = -this.bk;
            }
            return true;
        }
        if (LanguageUtil.ba(this.o)) {
            f = -f;
        }
        return b(f);
    }

    private boolean d(MotionEvent motionEvent, float f) {
        if (EnvironmentInfo.m()) {
            LogUtil.j("Suggestion_LongCoachView", "upDownDragOperation mobile app engine mute volume and brightness.");
            return false;
        }
        if (this.ax) {
            this.ax = false;
            this.az = false;
        }
        if (this.az) {
            LogUtil.j("Suggestion_LongCoachView", "onScroll current sliding is vertical, invalid.");
            return false;
        }
        if (motionEvent.getX() < (getWidth() * 2.0f) / 5.0f) {
            if (LanguageUtil.ba(this.o)) {
                setVolume(f);
            } else {
                setBrightness(f / (this.ak / 2.0f));
            }
        } else if (LanguageUtil.ba(this.o)) {
            setBrightness(f / (this.ak / 2.0f));
        } else {
            setVolume(f);
        }
        this.d.setVisibility(0);
        return true;
    }

    private boolean b(float f) {
        this.bk = 0;
        LogUtil.a("Suggestion_LongCoachView", "dragScreen() player getDuration()");
        int i = this.r + ((int) (-((((f / getWidth()) * this.br.g()) * 5.0f) / 4.0f)));
        this.r = i;
        if (i < 0) {
            this.r = 0;
        }
        if (this.r >= this.br.g()) {
            this.r = this.br.g() - 1;
        }
        j(this.r);
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        LogUtil.a("Suggestion_LongCoachView", "surfaceCreated--- mIsHolderCreated = ", Boolean.valueOf(this.au));
        this.br.b(surfaceHolder);
        if (njy.e(this.bu)) {
            LogUtil.a("Suggestion_LongCoachView", "surfaceCreated mMotions is empty");
            return;
        }
        if (!this.au) {
            if (NetworkUtil.k()) {
                bh();
            }
        } else {
            this.bf = false;
            bj();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        LogUtil.a("Suggestion_LongCoachView", "surfaceChanged");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.bf = true;
        LogUtil.a("Suggestion_LongCoachView", "surfaceDestroyed");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("Suggestion_LongCoachView", "view is null");
            return;
        }
        int id = view.getId();
        if (hkb.e(id)) {
            hiu.a(this.g, 2);
            ay();
            return;
        }
        if (hkb.b(this, id)) {
            LogUtil.a("Suggestion_LongCoachView", ":training completed");
            if (qrs.r()) {
                LogUtil.a("Suggestion_LongCoachView", "isFastClick stop");
                return;
            }
            this.ao = true;
            if (am()) {
                hiu.a(this.g, 3);
            }
            OnMotionChangeListener onMotionChangeListener = this.bs;
            if (onMotionChangeListener != null) {
                onMotionChangeListener.onCustomBeave();
                return;
            }
            return;
        }
        if (id == R.id.sug_playback_params) {
            this.bz.setVisibility(0);
            return;
        }
        if (id == R.id.sug_playback_params_l1) {
            b(0.25f, this.cb);
            return;
        }
        if (id == R.id.sug_playback_params_l2) {
            b(0.5f, this.ca);
            return;
        }
        if (id == R.id.sug_playback_params_l3) {
            b(1.0f, this.cf);
            return;
        }
        if (id == R.id.sug_playback_params_l4) {
            b(1.5f, this.cg);
            return;
        }
        if (id == R.id.sug_playback_params_l5) {
            b(2.0f, this.cc);
            return;
        }
        if (id == R.id.sug_definition_params) {
            this.v.setVisibility(0);
            return;
        }
        if (id == R.id.sug_definition_layout) {
            this.v.setVisibility(8);
            return;
        }
        if (id == R.id.sug_definition_fhd) {
            setDefinitionClickEvent(EnumDefinitionOptions.FHD);
            return;
        }
        if (id == R.id.sug_definition_hd) {
            setDefinitionClickEvent(EnumDefinitionOptions.HD);
        } else if (id != R.id.sug_definition_sd) {
            LogUtil.d("Suggestion_LongCoachView", "Click action is not Continue or Finish");
        } else {
            setDefinitionClickEvent(EnumDefinitionOptions.SD);
        }
    }

    private void b(float f, HealthTextView healthTextView) {
        LogUtil.a("Suggestion_LongCoachView", "onclick level", Float.valueOf(f));
        if (f == 0.25f) {
            this.by.setText(getResources().getString(R.string.IDS_long_coach_multiples_level, UnitUtil.e(f, 1, 2)));
        } else {
            this.by.setText(getResources().getString(R.string.IDS_long_coach_multiples_level, UnitUtil.e(f, 1, 1)));
        }
        setPlayerSpeed(f);
        this.bz.setVisibility(8);
        cj();
        healthTextView.setTextColor(ContextCompat.getColor(this.o, R.color.colorAccent));
    }

    private void cj() {
        this.cb.setTextColor(ContextCompat.getColor(this.o, R.color.textColorPrimaryInverse));
        this.ca.setTextColor(ContextCompat.getColor(this.o, R.color.textColorPrimaryInverse));
        this.cf.setTextColor(ContextCompat.getColor(this.o, R.color.textColorPrimaryInverse));
        this.cg.setTextColor(ContextCompat.getColor(this.o, R.color.textColorPrimaryInverse));
        this.cc.setTextColor(ContextCompat.getColor(this.o, R.color.textColorPrimaryInverse));
    }

    private void setPlayerSpeed(float f) {
        this.cj = f;
        this.br.e(f);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(this.o).inflate(R.layout.sug_fitness_coachview, this);
        bd();
        SurfaceHolder holder = this.co.getHolder();
        this.an = holder;
        holder.setType(3);
        this.an.addCallback(this);
        LongMediaHelper longMediaHelper = this.br;
        if (longMediaHelper != null) {
            longMediaHelper.c(this.co);
            this.br.c((ViewGroup) findViewById(R.id.sfv_parent));
            ck();
            cq();
        }
        this.dk = hjg.a();
        GestureDetector gestureDetector = new GestureDetector(this.o.getApplicationContext(), this);
        this.ag = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
        setTag(false);
    }

    public void b(String str) {
        this.ah = str;
        int dimension = (int) getResources().getDimension(com.huawei.ui.commonui.R.dimen.bottom_btn_share_width);
        int iM = (qrs.m() / 2) - pao.e(this.o, 24.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dimension, -1, GravityCompat.END);
        if ("HORIZONTAL_FOLDING_MODE".equals(this.ah)) {
            layoutParams = new FrameLayout.LayoutParams(-1, iM, 48);
            layoutParams2 = new FrameLayout.LayoutParams(-1, iM, 80);
            layoutParams3 = new FrameLayout.LayoutParams(dimension, iM, 8388693);
        }
        b(findViewById(R.id.sfv_parent), layoutParams);
        b(this.ce, layoutParams);
        b(this.af, layoutParams);
        b(this.f9384c, layoutParams2);
        b(this.bj, layoutParams2);
        b((RelativeLayout) findViewById(R.id.sug_progress_layout), layoutParams2);
        b(this.d, layoutParams2);
        b(this.m, layoutParams2);
        b(this.bz, layoutParams3);
        hnn hnnVar = this.cd;
        if (hnnVar != null) {
            hnnVar.c(this.ah);
        }
    }

    private void b(View view, FrameLayout.LayoutParams layoutParams) {
        if (view == null) {
            LogUtil.j("Suggestion_LongCoachView", "setLayoutParamsByNoNull view null");
        } else {
            view.setLayoutParams(layoutParams);
        }
    }

    private void ck() {
        this.br.e(new PlayerHelper.OnPreparedListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.LongCoachView.4
            @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
            public void onPrepared() {
                ReleaseLogUtil.d("Suggestion_LongCoachView", "setPlayerListener() onPrepared");
                LongCoachView.this.setLoadingStatus(false);
                LongCoachView.this.bn.setMax(LongCoachView.this.br.g());
                LongCoachView.this.cd.d(LongCoachView.this.br.g());
                LongCoachView.this.cr.setText(new SimpleDateFormat("mm:ss", Locale.getDefault()).format(Integer.valueOf(LongCoachView.this.br.g())));
                LongCoachView.this.ci();
                LongCoachView.this.bc();
                if (!LongCoachView.this.ah() && LongCoachView.this.at) {
                    LogUtil.a("Suggestion_LongCoachView", "CalorieHeartView setViewsVisible");
                    LongCoachView.this.h.j(0);
                }
                LongCoachView.this.bl();
            }

            @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
            public void onBufferingStart() {
                LogUtil.a("Suggestion_LongCoachView", "setPlayerListener() onBufferingStart");
                LongCoachView.this.setLoadingStatus(true);
            }

            @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
            public void onBufferingEnd() {
                LogUtil.a("Suggestion_LongCoachView", "setPlayerListener() onBufferingEnd");
                LongCoachView.this.setLoadingStatus(false);
            }

            @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
            public void onSeekComplete() {
                LogUtil.a("Suggestion_LongCoachView", "onSeekComplete:", Integer.valueOf(LongCoachView.this.br.j()));
                LongCoachView.this.bk();
            }

            @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
            public void onVideoError() {
                LogUtil.e("Suggestion_LongCoachView", "video play error");
                LongCoachView longCoachView = LongCoachView.this;
                longCoachView.e(true, CommonUtil.ab(longCoachView.o));
            }
        });
    }

    private boolean bw() {
        return !this.aq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ci() {
        this.br.q().addListener(new Player.Listener() { // from class: com.huawei.health.suggestion.ui.fitness.module.LongCoachView.2
            @Override // androidx.media3.common.Player.Listener
            public void onPlaybackStateChanged(int i) {
                LogUtil.a("Suggestion_LongCoachView", "OnInfoListener", ", what=", Integer.valueOf(i));
                if (i == 2) {
                    LongCoachView.this.setLoadingStatus(true);
                }
                if (i == 3) {
                    LongCoachView.this.setLoadingStatus(false);
                }
                if (i == 4) {
                    LogUtil.a("Suggestion_LongCoachView", "Long video completion");
                    LongCoachView.this.k.a(253);
                    LongCoachView.this.finishTrain();
                }
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException playbackException) {
                if (playbackException.errorCode != 0) {
                    if (LongCoachView.this.bf) {
                        LogUtil.j("Suggestion_LongCoachView", "player is not playing.");
                    } else {
                        LongCoachView longCoachView = LongCoachView.this;
                        longCoachView.e(true, CommonUtil.ab(longCoachView.o));
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bk() {
        if (this.bh) {
            if (CommonUtil.ab(this.o)) {
                ch();
                if (bt()) {
                    as();
                    return;
                }
                this.br.videoContinue();
                if (this.ai.hasMessages(259)) {
                    return;
                }
                this.ai.sendEmptyMessage(259);
                return;
            }
            return;
        }
        this.cv = 251;
        this.k.a(251);
        ca();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bl() {
        int oldProgressTime = getOldProgressTime();
        if (this.bh && oldProgressTime > 0) {
            if (oldProgressTime >= this.br.g() && this.br.g() > 0) {
                this.br.a(0);
                this.cu.setTag(0);
            } else {
                this.br.a(oldProgressTime);
            }
        } else {
            ch();
        }
        LogUtil.a("Suggestion_LongCoachView", "checkPreparedNextStep(), onPrepared, seekTo msec=", Integer.valueOf(oldProgressTime));
        bf();
    }

    private int getOldProgressTime() {
        if (this.cu.getTag() instanceof Integer) {
            return ((Integer) this.cu.getTag()).intValue();
        }
        return 0;
    }

    private void ch() {
        this.bh = false;
        this.cu.setTag(0);
    }

    private void bf() {
        LogUtil.a("Suggestion_LongCoachView", "allowPlay()");
        if (bs()) {
            LogUtil.a("Suggestion_LongCoachView", "allowPlay isShowWifiTipsDialog");
            return;
        }
        this.br.start();
        this.be = true;
        this.cv = 251;
        this.k.a(251);
        bz();
        this.f9384c.setVisibility(0);
        e(0);
        ca();
        p();
        if (njy.e(this.bu, this.k.c())) {
            LogUtil.j("Suggestion_LongCoachView", "onPrepared mMotions isOutOfBounds");
            return;
        }
        Motion motion = this.bu.get(this.k.c());
        if (motion == null) {
            LogUtil.j("Suggestion_LongCoachView", "onPrepared currentMotion is null");
            return;
        }
        hke.d(this, motion);
        OnMotionChangeListener onMotionChangeListener = this.bs;
        if (onMotionChangeListener != null) {
            onMotionChangeListener.onMotionStart(motion, this.k.c());
        }
        ImageView imageView = this.am;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.sug_fitness_pause_selector);
            this.am.setTag(false);
        }
    }

    private void ca() {
        this.ai.sendEmptyMessage(259);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            LogUtil.e("Suggestion_LongCoachView", "onTouchEvent event == null");
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.dj.removeMessages(1201);
        } else if (action != 1) {
            LogUtil.d("Suggestion_LongCoachView", "do not handle this action");
            this.bz.setVisibility(8);
            this.v.setVisibility(8);
        } else {
            if (!lrd.d()) {
                this.dj.removeMessages(1201);
                this.dj.sendMessageDelayed(this.dj.obtainMessage(1201), 7000L);
            }
            removeCallbacks(this.ch);
            postDelayed(this.ch, 1200L);
            this.cd.a();
            if (bw() && !this.ax && this.az) {
                if (this.bk != 0) {
                    bu();
                } else {
                    setDragScreenBiEvent(this.r);
                    this.br.a(this.r);
                    LogUtil.a("Suggestion_LongCoachView", "onTouchEvent(),seekTo msec=", Integer.valueOf(this.r));
                }
            }
            bv();
        }
        return this.ag.onTouchEvent(motionEvent);
    }

    private void bu() {
        int iMax;
        this.bd = true;
        if (this.de.size() == 1) {
            int iJ = this.br.j();
            LogUtil.a("Suggestion_LongCoachView", "quickDrag() player getDuration()");
            if (this.bk == 1) {
                iMax = Math.min(iJ + (this.br.g() / 5), this.br.g());
            } else {
                iMax = Math.max(iJ - (this.br.g() / 5), 0);
            }
            d(iMax, CoachController.StatusSource.APP);
            this.br.a(iMax);
            LogUtil.a("Suggestion_LongCoachView", "quickDrag(),seekTo msec=", Integer.valueOf(iMax));
            w();
            return;
        }
        d(this.bk == 1 ? this.aj : this.as);
    }

    private void bv() {
        this.bk = 0;
        this.cx = 0L;
        this.cy = 0L;
        this.ax = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.ch);
        this.dj.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg() {
        LongMediaHelper longMediaHelper = this.br;
        int iH = longMediaHelper != null ? longMediaHelper.h() : 0;
        hmx hmxVar = this.h;
        if (hmxVar != null) {
            hmxVar.b(iH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void be() {
        if (this.av) {
            HealthTextView healthTextViewM = m();
            if (healthTextViewM == null) {
                LogUtil.j("Suggestion_LongCoachView", "adjustCaptionsMargin textView == null");
                return;
            }
            int iA = qqp.a(this.o, 38.0f);
            LongMediaHelper longMediaHelper = this.br;
            if (longMediaHelper != null) {
                iA = longMediaHelper.h() + qqp.a(this.o, 48.0f);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) healthTextViewM.getLayoutParams();
            layoutParams.setMarginStart(iA);
            layoutParams.setMarginEnd(iA);
            healthTextViewM.setLayoutParams(layoutParams);
        }
    }

    public void setBrightness(float f) {
        hkb.c(this, f, getContext());
    }

    public void setVolume(float f) {
        if (!(getContext().getSystemService("audio") instanceof AudioManager)) {
            LogUtil.j("Suggestion_LongCoachView", "setVolume getContext().getSystemService(AUDIO_SERVICE) not instanceof AudioManager");
            return;
        }
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager == null) {
            LogUtil.j("Suggestion_LongCoachView", "setVolume audioManager is null");
            return;
        }
        this.q = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f2 = this.z + f;
        this.z = f2;
        float f3 = streamMaxVolume;
        if (Math.abs(f2) >= this.ak / (2.0f * f3)) {
            if (this.z > 0.0f) {
                int i = this.q + 1;
                this.q = i;
                audioManager.setStreamVolume(3, i, 0);
            } else {
                int i2 = this.q - 1;
                this.q = i2;
                audioManager.setStreamVolume(3, i2, 0);
            }
            this.z = 0.0f;
        }
        this.d.setProgressMax(f3);
        if (this.q <= 0) {
            this.d.c(R.drawable.ic_video_mute);
            e(this.ar, R.drawable.sug_fitness_volume_off, R.drawable.sug_fitness_volume_off);
            lrd.b(this.ar, qre.i(R.string.accessibility_on_sound));
        } else {
            this.d.c(R.drawable.ic_video_voice);
            e(this.ar, R.drawable.sug_fitness_volume_selector, R.drawable.sug_fitness_volume_normal);
            lrd.b(this.ar, qre.i(R.string.accessibility_off_sound));
        }
        int i3 = this.q;
        if (i3 >= 0) {
            this.d.setProgress(i3);
        }
        this.d.a(getResources().getString(R.string.IDS_FitnessAdvice_volume));
    }

    public void ar() {
        if (!this.au) {
            bh();
            return;
        }
        LogUtil.d("Suggestion_LongCoachView", "onResume===", Boolean.valueOf(this.bf));
        ImageView imageView = this.am;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.sug_fitness_pause_selector);
            this.am.setTag(false);
        }
        ay();
    }

    public void p() {
        if (this.at) {
            this.h.c(0.0f, 1.0f);
        } else {
            this.h.c();
        }
    }

    private void bd() {
        this.ce = (RelativeLayout) findViewById(R.id.sug_coach_right_data_layout);
        hmx hmxVar = new hmx();
        this.h = hmxVar;
        this.ce.addView(hmxVar.a());
        this.h.j(8);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.sug_progress_layout);
        hnn hnnVar = new hnn();
        this.cd = hnnVar;
        relativeLayout.addView(hnnVar.c());
        this.cd.a();
        this.cd.d();
        this.dh = (LinearLayout) findViewById(R.id.marketing_wound_plast_view);
        this.m = (CoachPauseRestView) findViewById(R.id.sug_coach_set_rl_show);
        this.af = (AniFrameLayout) findViewById(R.id.fl_animation);
        bn();
        findViewById(R.id.sug_coach_mp_progress).setVisibility(8);
        this.d = (BrightnessOrVolumeProgressPlus) findViewById(R.id.brightorvolumeprogressplus_setting);
        this.al = (ImageView) findViewById(R.id.sug_coach_iv_lock);
        findViewById(R.id.sug_rl_coach_guide).setVisibility(8);
        findViewById(R.id.sug_coach_caintro).setVisibility(8);
        setLoadingStatus(true);
        this.co.setTag(false);
        this.cl = (ImageView) findViewById(R.id.sug_screen_cast);
        bq();
        bo();
        if (CommonUtil.bg() && CommonUtil.bb() && !EnvironmentInfo.m()) {
            this.cl.setVisibility(0);
            this.cl.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.LongCoachView.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TextUtils.isEmpty(buh.e("screenCastTipShow"))) {
                        LongCoachView.this.cn();
                    } else {
                        LongCoachView.this.co();
                    }
                }
            });
        }
        by();
        cd();
        fxl.e(10001, this.dh);
        hkb.e(this.o, this.ar);
    }

    private void bo() {
        this.x = (HealthTextView) findViewById(R.id.sug_definition_params);
        this.v = (LinearLayout) findViewById(R.id.sug_definition_layout);
        this.u = (HealthTextView) findViewById(R.id.sug_definition_fhd);
        this.y = (HealthTextView) findViewById(R.id.sug_definition_hd);
        this.w = (HealthTextView) findViewById(R.id.sug_definition_sd);
        this.aa = (HealthTextView) findViewById(R.id.sug_definition_tip);
        this.x.setOnClickListener(this);
        this.v.setOnClickListener(this);
        this.u.setOnClickListener(this);
        this.y.setOnClickListener(this);
        this.w.setOnClickListener(this);
    }

    private void bq() {
        this.by = (HealthTextView) findViewById(R.id.sug_playback_params);
        this.cb = (HealthTextView) findViewById(R.id.sug_playback_params_l1);
        this.ca = (HealthTextView) findViewById(R.id.sug_playback_params_l2);
        this.cf = (HealthTextView) findViewById(R.id.sug_playback_params_l3);
        this.cg = (HealthTextView) findViewById(R.id.sug_playback_params_l4);
        this.cc = (HealthTextView) findViewById(R.id.sug_playback_params_l5);
        this.bz = (LinearLayout) findViewById(R.id.sug_playback_params_layout);
        this.by.setVisibility(0);
        bp();
        this.by.setOnClickListener(this);
        this.cb.setOnClickListener(this);
        this.ca.setOnClickListener(this);
        this.cf.setOnClickListener(this);
        this.cg.setOnClickListener(this);
        this.cc.setOnClickListener(this);
    }

    private void bn() {
        this.df = (HealthProgressBar) findViewById(R.id.sug_coach_loading_progress);
        HealthSeekBar healthSeekBar = (HealthSeekBar) findViewById(R.id.sug_long_media_progress);
        this.bn = healthSeekBar;
        healthSeekBar.setVisibility(0);
        ToolsLayout toolsLayout = (ToolsLayout) findViewById(R.id.sug_coach_rl_actiontools);
        this.f9384c = toolsLayout;
        toolsLayout.setIsShowLockAnim(false);
        this.aj = (ImageView) findViewById(R.id.sug_coach_iv_next);
        this.am = (ImageView) findViewById(R.id.sug_coach_iv_pause);
        this.co = (SurfaceView) findViewById(R.id.sfv);
        this.ar = (ImageView) findViewById(R.id.sug_iv_voice_change);
        this.as = (ImageView) findViewById(R.id.sug_coach_iv_pre);
        this.cp = (HealthTextView) findViewById(R.id.sug_tv_coach_course_name);
        this.cu = (HealthTextView) findViewById(R.id.sug_coach_tv_second);
        this.cr = (HealthTextView) findViewById(R.id.tv_total_second);
        this.cs = (HealthTextView) findViewById(R.id.sug_tv_video_srt);
        this.ct = (HealthTextView) findViewById(R.id.sug_tv_video_srt_top);
        this.bj = (RelativeLayout) findViewById(R.id.lock_layout);
        this.bq = (ImageView) findViewById(R.id.sug_coach_iv_locked);
    }

    private void by() {
        if (LanguageUtil.ba(this.o)) {
            ((ImageView) findViewById(R.id.sug_coachiv_close)).setImageDrawable(qqz.e(this.o, R.drawable.sug_coach_back_normal));
            this.al.setImageResource(R.drawable.ic_sug_coach_unlock_rtl);
        }
    }

    private void bp() {
        this.cb.setText(getResources().getString(R.string.IDS_long_coach_multiples_level, UnitUtil.e(0.25d, 1, 2)));
        this.ca.setText(getResources().getString(R.string.IDS_long_coach_multiples_level, UnitUtil.e(0.5d, 1, 1)));
        this.cf.setText(getResources().getString(R.string.IDS_long_coach_multiples_level, UnitUtil.e(1.0d, 1, 1)));
        this.cg.setText(getResources().getString(R.string.IDS_long_coach_multiples_level, UnitUtil.e(1.5d, 1, 1)));
        this.cc.setText(getResources().getString(R.string.IDS_long_coach_multiples_level, UnitUtil.e(2.0d, 1, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.o).a(this.o.getString(R.string.IDS_screen_cast_tip)).a(this.o.getString(R.string.IDS_user_permission_know), new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.LongCoachView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                buh.d("screenCastTipShow", Boolean.toString(true));
                LongCoachView.this.co();
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
        LogUtil.a("Suggestion_LongCoachView", "showScreenCastTipDialog.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void co() {
        DistributedApi distributedApi = this.ad;
        if (distributedApi != null) {
            int iStartWirelessProjection = distributedApi.startWirelessProjection();
            HashMap map = new HashMap(3);
            map.put("click", 1);
            map.put("courseId", this.l);
            map.put("action", Integer.valueOf(iStartWirelessProjection));
            lmf.d().c(this.o, AnalyticsValue.HEALTH_GYM_EQUIP_CLICK_BTN_2170008.value(), map, 0);
        }
    }

    private void cd() {
        cg();
        cf();
        this.ar.setOnClickListener(new View.OnClickListener() { // from class: hlu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36884a.i(view);
            }
        });
        this.bq.setOnClickListener(new View.OnClickListener() { // from class: hlw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.g(view);
            }
        });
    }

    public /* synthetic */ void i(View view) {
        cu();
    }

    public /* synthetic */ void g(View view) {
        this.ba = false;
        this.bj.setVisibility(8);
        bc();
    }

    private void cf() {
        this.aj.setOnClickListener(new View.OnClickListener() { // from class: hlp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.h(view);
            }
        });
        this.m.getCoachSetStop().setOnClickListener(this);
        this.m.getCoachSetOk().setOnClickListener(this);
        this.m.getCoachSetContinue().setOnClickListener(new View.OnClickListener() { // from class: hls
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36882c.f(view);
            }
        });
    }

    public /* synthetic */ void h(View view) {
        d(this.aj);
    }

    public /* synthetic */ void f(View view) {
        hiu.a(this.g, 2);
        ay();
        LogUtil.a("Suggestion_LongCoachView", "Click Continue Button ,all continue ");
    }

    private void cg() {
        this.al.setOnClickListener(new View.OnClickListener() { // from class: hlf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(view);
            }
        });
        this.am.setOnClickListener(new View.OnClickListener() { // from class: hlr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
        findViewById(R.id.sug_coachiv_close).setOnClickListener(new View.OnClickListener() { // from class: hlq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36881a.c(view);
            }
        });
        this.as.setOnClickListener(new View.OnClickListener() { // from class: hlt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36883a.b(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        this.ba = true;
        bx();
    }

    public /* synthetic */ void e(View view) {
        ReleaseLogUtil.d("Suggestion_LongCoachView", "mImgPlay toPause");
        hiu.a(this.g, 1);
        bb();
    }

    public /* synthetic */ void c(View view) {
        aa();
    }

    public /* synthetic */ void b(View view) {
        d(this.as);
    }

    private void bh() {
        if (TextUtils.isEmpty(this.dd)) {
            ReleaseLogUtil.e("Suggestion_LongCoachView", "afterHolderCreate mVideoUrl null");
            return;
        }
        this.au = true;
        this.cp.setText(this.l);
        this.br.setMediaSources(Uri.parse(this.dd));
        this.br.r();
        cl();
        this.cv = 251;
        this.k.a(251);
        hkb.d(this, this.bu.size());
        this.h.c();
        this.f9384c.setVisibility(8);
        VolumeChangeObserver volumeChangeObserver = new VolumeChangeObserver(getContext());
        this.db = volumeChangeObserver;
        volumeChangeObserver.b(new VolumeChangeObserver.VolumeChangeListener() { // from class: hlk
            @Override // com.huawei.health.suggestion.ui.fitness.helper.VolumeChangeObserver.VolumeChangeListener
            public final void onVolumeChanged(int i) {
                this.e.d(i);
            }
        });
        this.db.e();
        this.bb = true;
        HeartRateGetterUtil.d().d(0, (CoachController.c().f() || this.aq) ? false : true);
        CoachController.c().d(CoachController.StatusSource.APP, 1);
    }

    public /* synthetic */ void d(int i) {
        this.q = i;
        if (i <= 0) {
            e(this.ar, R.drawable.sug_fitness_volume_off, R.drawable.sug_fitness_volume_off);
            lrd.b(this.ar, qre.i(R.string.accessibility_on_sound));
        } else {
            e(this.ar, R.drawable.sug_fitness_volume_selector, R.drawable.sug_fitness_volume_normal);
            lrd.b(this.ar, qre.i(R.string.accessibility_off_sound));
        }
    }

    private void e(ImageView imageView, int i, int i2) {
        if (LanguageUtil.ba(this.o)) {
            imageView.setImageDrawable(qqz.e(this.o, i2));
        } else {
            imageView.setImageResource(i);
        }
    }

    public void ax() {
        LogUtil.a("Suggestion_LongCoachView", "allPause()--");
        ImageView imageView = this.am;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.sug_fitness_play_normal);
            this.am.setTag(true);
        }
        if (this.bz.getVisibility() == 0) {
            this.bz.setVisibility(8);
            this.v.setVisibility(8);
        }
        setLoadingStatus(false);
        this.br.pause();
        LongMediaHelper longMediaHelper = this.f9383b;
        if (longMediaHelper != null) {
            longMediaHelper.pause();
        }
        HeartRateGetterUtil.d().d(1, (CoachController.c().f() || this.aq) ? false : true);
        CoachController.c().d(CoachController.StatusSource.APP, 2);
        this.ai.removeCallbacksAndMessages(null);
        if (this.bs != null && this.bu != null) {
            int iC = this.k.c();
            if (njy.e(this.bu, iC)) {
                return;
            }
            Motion motion = this.bu.get(iC);
            if (motion != null) {
                this.bs.onMotionPause(motion, iC);
            }
        }
        this.bb = false;
    }

    public void ao() {
        LogUtil.a("Suggestion_LongCoachView", "onPause()--mIsHolderCreated=", Boolean.valueOf(this.au));
        if (this.au) {
            ax();
            this.bb = false;
        }
    }

    public void as() {
        ReleaseLogUtil.d("Suggestion_LongCoachView", "onAllContinue");
        ImageView imageView = this.am;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.sug_fitness_pause_selector);
            this.am.setTag(false);
        }
        if (hkb.b(this.au, this.k.a(), this.bf)) {
            ReleaseLogUtil.d("Suggestion_LongCoachView", "onAllContinue ??");
            hkb.c(this, this.ai);
            LongMediaHelper longMediaHelper = this.f9383b;
            if (longMediaHelper != null) {
                longMediaHelper.videoContinue();
            }
            this.k.a(251);
            HeartRateGetterUtil.d().d(0, (CoachController.c().f() || this.aq) ? false : true);
            CoachController.c().d(CoachController.StatusSource.APP, 1);
            this.ai.sendEmptyMessage(259);
            if (this.bs != null && this.bu != null) {
                int iC = this.k.c();
                if (njy.e(this.bu, iC)) {
                    return;
                }
                Motion motion = this.bu.get(iC);
                if (motion != null) {
                    this.bs.onMotionContinue(motion, iC);
                }
            }
            this.bb = true;
        }
    }

    private void bj() {
        ReleaseLogUtil.d("Suggestion_LongCoachView", "allContinue", ",mIsPlaying=", Boolean.valueOf(this.bb), ",mIsHolderCreated=", Boolean.valueOf(this.au), ",mCoachState.acquireStation()=", Integer.valueOf(this.k.a()), ",mIsSurfaceDestroyed=", Boolean.valueOf(this.bf));
        if (this.bb || !hkb.b(this.au, this.k.a(), this.bf)) {
            return;
        }
        if (this.bh && CommonUtil.ab(this.o)) {
            cs();
        } else {
            as();
        }
    }

    public boolean ai() {
        return this.bb;
    }

    private void bx() {
        this.f9384c.setVisibility(4);
        lrd.c(this.f9384c, qre.i(R.string.accessibility_playback_control_hide));
        this.dj.removeCallbacksAndMessages(null);
        if (this.av) {
            this.dj.sendEmptyMessage(1202);
        }
        this.dj.sendMessage(this.dj.obtainMessage(1204));
        this.dj.sendMessageDelayed(this.dj.obtainMessage(1203), 7000L);
    }

    private void d(ImageView imageView) {
        if (imageView.getAlpha() == 1.0f) {
            this.ai.removeCallbacksAndMessages(null);
            this.af.d();
            this.dj.removeMessages(1201);
            this.f9384c.setIsShowBottomProgress(false);
            if (imageView == this.as) {
                this.bd = true;
                bi();
                LogUtil.a("Suggestion_LongCoachView", "change to previous action");
            } else {
                b(true);
                LogUtil.a("Suggestion_LongCoachView", "change to next action");
            }
        }
    }

    public void aa() {
        OnMotionChangeListener onMotionChangeListener = this.bs;
        if (onMotionChangeListener == null) {
            LogUtil.e("Suggestion_LongCoachView", "mMotionChangeListener null");
        } else {
            onMotionChangeListener.onCustomBeave();
        }
    }

    public void u() {
        LogUtil.a("Suggestion_LongCoachView", "changeMotionWhenPlaying==", Integer.valueOf(this.k.c()));
        if (this.k.c() != this.de.size() - 1) {
            b(false);
        }
    }

    public void ac() {
        LogUtil.d("Suggestion_LongCoachView", "finishAction action train time==", Long.valueOf(this.e));
        this.da += this.e;
        Motion motionCb = cb();
        this.e = 0L;
        this.da = (this.da / 1000) * 1000;
        LogUtil.d("Suggestion_LongCoachView", "finishAction action completed");
        this.k.c(0);
        hkb.c(this, motionCb);
        this.cv = 257;
        this.k.a(257);
        this.ai.sendEmptyMessage(257);
    }

    private Motion cb() {
        LogUtil.a("Suggestion_LongCoachView", "saveProgress, current action:{} current group:{} current beat:{}", Integer.valueOf(this.k.c()), Integer.valueOf(this.k.d()), Integer.valueOf(this.k.b()));
        if (njy.e(this.bu, this.k.c())) {
            return new Motion();
        }
        Motion motion = this.bu.get(this.k.c());
        if (motion == null) {
            return new Motion();
        }
        int iRound = Math.round(this.e / 1000.0f);
        if (this.ap && !"timer".equals(motion.acquireMotionType())) {
            iRound--;
        }
        if (njy.e(motion.getVideoSegments(), 0)) {
            LogUtil.j("Suggestion_LongCoachView", "saveProgress() getVideoSegments out of bounds");
            return motion;
        }
        int duration = motion.getVideoSegments().get(0).getDuration();
        if (duration == 0) {
            LogUtil.j("Suggestion_LongCoachView", "saveProgress() videoSegment duration is zero");
            return motion;
        }
        hkb.b(this, (iRound * 1.0f) / duration);
        if (iRound > motion.acquireActionTrainTime()) {
            motion.saveActionTrainTime(iRound);
        }
        if (motion.acquireActionTrainTime() > duration) {
            motion.saveActionTrainTime(duration);
        }
        return motion;
    }

    public void w() {
        LogUtil.d("Suggestion_LongCoachView", "changeAction", Integer.valueOf(this.k.c()));
        hkb.d(this, this.bu.size());
    }

    private void bi() {
        if (this.m.getVisibility() == 0) {
            this.m.setVisibility(4);
        }
        ac();
        this.k.e();
        if (this.k.c() < 0) {
            this.k.d(0);
            return;
        }
        VideoSegment videoSegment = this.de.get(this.k.c());
        int endTime = (int) videoSegment.getEndTime();
        d(endTime, CoachController.StatusSource.APP);
        this.br.a(endTime);
        LogUtil.a("Suggestion_LongCoachView", "changeToPreAction(),seekTo msec=", Long.valueOf(videoSegment.getStartTime()));
        LogUtil.a("Suggestion_LongCoachView", "change to previous action, current action:{}", Integer.valueOf(this.k.c()));
        this.cv = 251;
        this.k.a(251);
        w();
    }

    private void b(boolean z) {
        if (this.m.getVisibility() == 0) {
            this.m.setVisibility(4);
        }
        ac();
        this.k.h();
        if (this.bu == null) {
            ReleaseLogUtil.e("Suggestion_LongCoachView", "changeToNextAction mMotions null");
            return;
        }
        if (this.k.c() >= this.bu.size()) {
            this.k.d(this.bu.size() - 1);
            return;
        }
        LogUtil.a("Suggestion_LongCoachView", "change to next action, current action:{}", Integer.valueOf(this.k.c()));
        if (z && this.de.get(this.k.c()) != null) {
            LogUtil.d("Suggestion_LongCoachView", "remove long coach training");
            this.ai.removeMessages(251);
            VideoSegment videoSegment = this.de.get(this.k.c());
            d((int) videoSegment.getStartTime(), CoachController.StatusSource.APP);
            this.br.a((int) videoSegment.getStartTime());
            this.bd = true;
        } else {
            ca();
        }
        this.cv = 251;
        this.k.a(251);
        w();
    }

    public void v() {
        hla hlaVar = this.k;
        if (hlaVar == null || this.de.get(hlaVar.c()) == null || this.bn == null) {
            ReleaseLogUtil.d("Suggestion_LongCoachView", "chapterForward mCoachState = ", this.k, " mLongMediaSeekBar ", this.bn);
            return;
        }
        VideoSegment videoSegment = this.de.get(this.k.c());
        long progress = this.bn.getProgress();
        long endTime = videoSegment.getEndTime() - progress;
        f(endTime >= 10000 ? (int) (progress + 10000) : (int) (10000 - endTime));
    }

    public void x() {
        hla hlaVar = this.k;
        if (hlaVar == null || this.de.get(hlaVar.c()) == null || this.bn == null) {
            ReleaseLogUtil.d("Suggestion_LongCoachView", "chapterForward mCoachState = ", this.k, " mLongMediaSeekBar ", this.bn);
            return;
        }
        VideoSegment videoSegment = this.de.get(this.k.c());
        long progress = this.bn.getProgress();
        long startTime = progress - videoSegment.getStartTime();
        f(startTime >= 10000 ? (int) (progress - 10000) : (int) (10000 - startTime));
    }

    private void f(int i) {
        d(i, CoachController.StatusSource.NEW_LINK_WEAR);
        this.bn.setProgress(i);
        this.br.a(i);
        this.bd = true;
        ReleaseLogUtil.d("Suggestion_LongCoachView", "chapterForward mCoachState = ", this.k, " mLongMediaSeekBar ", this.bn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HealthSeekBar healthSeekBar) {
        hnn hnnVar = this.cd;
        if (hnnVar != null) {
            hnnVar.a();
        }
        this.bd = true;
        if (healthSeekBar == null) {
            ReleaseLogUtil.e("Suggestion_LongCoachView", "seekTo healthSeekBar is null");
            return;
        }
        int progress = healthSeekBar.getProgress();
        if (this.br == null) {
            ReleaseLogUtil.e("Suggestion_LongCoachView", "seekTo mMediaHelper is null");
            return;
        }
        Handler handler = this.ai;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        setDragScreenBiEvent(progress);
        this.br.a(progress);
        LogUtil.a("Suggestion_LongCoachView", "seekTo progress ", Integer.valueOf(progress));
    }

    private void cu() {
        hkb.b(getContext(), this.ar);
    }

    public void bb() {
        if (this.av) {
            this.dj.removeMessages(1202);
        }
        removeCallbacks(this.ch);
        post(this.ch);
        ax();
        this.k.a(PsExtractor.AUDIO_STREAM);
        if (njy.e(this.bu, this.k.c())) {
            return;
        }
        Motion motion = this.bu.get(this.k.c());
        String string = getResources().getString(R.string.sug_string_default);
        if (motion == null) {
            LogUtil.j("Suggestion_LongCoachView", "toPause motion is null");
            return;
        }
        String string2 = "";
        this.m.c(this.l, gzx.c(getContext().getApplicationContext(), com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal, ped.e((((this.dk * motion.acquireCalorie()) * motion.acquireGroups()) * motion.acquireDuration()) / 1000.0f)), gzx.c(getContext().getApplicationContext(), R.string.sug_fitcoach_sec, ped.j(motion.acquireDuration() * motion.acquireGroups())), this.aw ? "" : hkf.b(motion, string), this.n);
        if (this.aq) {
            int i = this.ae;
            if (i == 1) {
                string2 = this.o.getResources().getString(R.string.IDS_sug_coach_treadmill_tips);
            } else if (i != 2) {
                LogUtil.j("Suggestion_LongCoachView", "toPause other mEquipmentType: ", Integer.valueOf(i));
            } else {
                string2 = this.o.getResources().getString(R.string.IDS_sug_coach_bicycle_tips, 60);
            }
            this.m.setEquipmentPauseTips(string2);
            this.m.c();
        }
        lrd.c(this.f9384c, 4);
        lrd.c(this.ce, 4);
        lrd.c(this.af, 4);
    }

    public void ay() {
        if (this.bh && !CommonUtil.ab(this.o)) {
            qpx.e(this.o, this.o.getResources().getString(com.huawei.ui.commonui.R.string.IDS_connect_error));
            return;
        }
        if (this.av) {
            this.dj.sendEmptyMessage(1202);
        }
        this.k.a(this.cv);
        if (this.bh) {
            LogUtil.a("Suggestion_LongCoachView", "mIsErrorByPlayVideo， after resume paly");
            cs();
        } else {
            LogUtil.a("Suggestion_LongCoachView", "toContinue, onAllContinue");
            as();
        }
        this.m.setVisibility(4);
        lrd.c(this.f9384c, 0);
        lrd.c(this.ce, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z, boolean z2) {
        if (this.bh) {
            return;
        }
        if (z2) {
            if (z) {
                this.bh = true;
                cs();
                return;
            }
            return;
        }
        LogUtil.a("Suggestion_LongCoachView", "setStuckErrorStateAndHints, is not network connect, isOnVideoError=", Boolean.valueOf(z));
        this.bh = true;
        qpx.b(this.o, this.o.getResources().getString(com.huawei.ui.commonui.R.string.IDS_connect_error));
        setLoadingStatus(true);
    }

    public void y() {
        LogUtil.a("Suggestion_LongCoachView", "checkResumePlayback, mIsStuckOrErrorByMediaPlayer=", Boolean.valueOf(this.bh), ", mIsPlaying=", Boolean.valueOf(this.bb), ", isPause()=", Boolean.valueOf(bt()));
        if (!this.bh || bt()) {
            return;
        }
        LogUtil.a("Suggestion_LongCoachView", "checkResumePlayback, resume paly");
        cs();
    }

    private boolean bt() {
        if (this.am.getTag() instanceof Boolean) {
            return ((Boolean) this.am.getTag()).booleanValue();
        }
        return false;
    }

    public void setEquipmentCourseAndType(boolean z, int i) {
        LogUtil.a("Suggestion_LongCoachView", "setEquipmentCourseAndType isEquipmentCourse = ", Boolean.valueOf(z), " equipmentType = ", Integer.valueOf(i));
        this.aw = z;
        this.ae = i;
    }

    public void t() {
        List<Motion> list = this.bu;
        if (list == null) {
            ReleaseLogUtil.e("Suggestion_LongCoachView", "addEquipmentCourseTimeCounterView mMotions == null");
            return;
        }
        if (list.size() == 1) {
            ReleaseLogUtil.d("Suggestion_LongCoachView", "addEquipmentCourseTimeCounterView mMotions.size() == 1");
        } else {
            if (!this.aw || ah()) {
                return;
            }
            hmz hmzVar = new hmz();
            this.ac = hmzVar;
            this.ce.addView(hmzVar.a());
        }
    }

    public void setTimeView(int i, int i2, boolean z) {
        hmz hmzVar;
        if (!this.aw || (hmzVar = this.ac) == null) {
            return;
        }
        hmzVar.d(i, i2, z);
    }

    private void cs() {
        if (this.br == null || TextUtils.isEmpty(this.dd)) {
            ReleaseLogUtil.e("Suggestion_LongCoachView", "stuckResumePlayback() mMediaHelper or mVideoUrl is null ");
            return;
        }
        setLoadingStatus(true);
        this.cu.setTag(Integer.valueOf(this.br.j()));
        this.br.setMediaSources(Uri.parse(this.dd));
        setPlayerSpeed(this.cj);
        LongMediaHelper longMediaHelper = this.f9383b;
        if (longMediaHelper == null || longMediaHelper.o()) {
            return;
        }
        this.f9383b.videoContinue();
    }

    public void setMotions(List<Motion> list) {
        this.bu = list;
        this.h.c((int) hit.d(list, this.dk, true));
        int duration = 0;
        for (Motion motion : list) {
            if (motion == null) {
                LogUtil.j("Suggestion_LongCoachView", "setMotions() motion is null");
            } else if (njy.e(motion.getVideoSegments(), 0)) {
                LogUtil.j("Suggestion_LongCoachView", "setMotions() VideoSegments is empty");
            } else {
                VideoSegment videoSegment = motion.getVideoSegments().get(0);
                if (videoSegment != null) {
                    this.de.add(videoSegment);
                    duration += videoSegment.getDuration();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment2 : this.de) {
            if (videoSegment2 != null) {
                if (duration == 0) {
                    duration = 1;
                }
                arrayList.add(Float.valueOf((videoSegment2.getStartTime() / 1000.0f) / duration));
            }
        }
        this.bn.setNodeList(arrayList);
        cm();
    }

    public List<VideoSegment> getVideoSegments() {
        return this.de;
    }

    public void at() {
        LogUtil.a("Suggestion_LongCoachView", "CoachView release---");
        lso.d(this.o, false, (lso.e) this.bt);
        this.ai.removeCallbacksAndMessages(null);
        LongMediaHelper longMediaHelper = this.br;
        if (longMediaHelper != null) {
            longMediaHelper.n();
            this.br.release();
        }
        VolumeChangeObserver volumeChangeObserver = this.db;
        if (volumeChangeObserver != null) {
            volumeChangeObserver.c();
        }
        DistributedApi distributedApi = this.ad;
        if (distributedApi != null) {
            distributedApi.destroyWirelessProjection();
        }
        if (this.ae == 2) {
            ((IndoorEquipManagerApi) Services.b("PluginLinkIndoorEquip", IndoorEquipManagerApi.class)).setSuppressPause(false);
            LogUtil.a("Suggestion_LongCoachView", "closeImgAction, setSuppressPause false");
        }
        LongMediaHelper longMediaHelper2 = this.f9383b;
        if (longMediaHelper2 != null) {
            longMediaHelper2.n();
            this.f9383b.release();
        }
        hjr.d();
        CoachController.c().d(CoachController.StatusSource.APP, 3);
        Handler handler = this.cw;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        PopupWindow popupWindow = this.bw;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        CustomAlertDialog customAlertDialog = this.bx;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
    }

    public void b(OnMotionChangeListener onMotionChangeListener) {
        this.bs = onMotionChangeListener;
    }

    public void setLongVideoChangeListener(OnLongVideoChangeListener onLongVideoChangeListener) {
        this.bo = onLongVideoChangeListener;
    }

    public int getTrainStation() {
        return this.k.a();
    }

    public void bc() {
        int i = this.f9384c.getVisibility() == 0 ? 4 : 0;
        this.f9384c.setVisibility(i);
        e(i);
        if (lrd.d()) {
            LogUtil.a("Suggestion_LongCoachView", "toggleTool isTouchExplorationEnabled");
            ToolsLayout toolsLayout = this.f9384c;
            lrd.c(toolsLayout, qre.i(toolsLayout.getVisibility() == 0 ? R.string.accessibility_playback_control_show : R.string.accessibility_playback_control_hide));
        } else {
            this.dj.removeMessages(1201);
            this.dj.sendMessageDelayed(this.dj.obtainMessage(1201), 7000L);
        }
    }

    public void setDeviceConnected() {
        this.ap = true;
        this.bg = true;
    }

    public void ab() {
        this.ap = false;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.module.CoachViewInterface
    public void finishTrain() {
        OnMotionChangeListener onMotionChangeListener;
        OnLongVideoChangeListener onLongVideoChangeListener;
        OnLongVideoChangeListener onLongVideoChangeListener2;
        LogUtil.a("Suggestion_LongCoachView", "finishTrain-----");
        Motion motionCb = cb();
        this.k.a(-100);
        if (motionCb == null || motionCb.getVideoSegments() == null) {
            LogUtil.j("Suggestion_LongCoachView", "finishMotion or VideoSegment is null");
            return;
        }
        List<VideoSegment> videoSegments = motionCb.getVideoSegments();
        if (njy.e(videoSegments, 0)) {
            LogUtil.j("Suggestion_LongCoachView", "videoSegments 0 is out bound");
            return;
        }
        VideoSegment videoSegment = videoSegments.get(0);
        if (videoSegment == null) {
            LogUtil.j("Suggestion_LongCoachView", "segment is null");
            return;
        }
        if (ah() && (onLongVideoChangeListener2 = this.bo) != null) {
            onLongVideoChangeListener2.onLongExplanationVideoComplete(getLongExplanationVideoWatchTime(), videoSegment.getDuration() * 1000);
        }
        if (af() && (onLongVideoChangeListener = this.bo) != null) {
            onLongVideoChangeListener.onLongExerciseVideoComplete(s(), this.br.g());
        }
        at();
        if (!af() || (onMotionChangeListener = this.bs) == null) {
            return;
        }
        onMotionChangeListener.onMotionOver(motionCb, this.k.c());
        this.bs.onTrainOver(this.bm);
    }

    public void ba() {
        if (this.k.a() != 192) {
            this.cv = this.k.a();
            this.k.a(PsExtractor.AUDIO_STREAM);
        }
    }

    public void av() {
        if (this.m.getVisibility() != 0) {
            this.k.a(this.cv);
            as();
        }
    }

    public hla a() {
        return this.k;
    }

    public CoachPauseRestView d() {
        return this.m;
    }

    public int q() {
        return this.cv;
    }

    public void a(boolean z) {
        if (z) {
            View viewInflate = ((ViewStub) findViewById(R.id.viewstub)).inflate();
            if (viewInflate instanceof LinearLayout) {
                this.bi = (LinearLayout) viewInflate;
                bm();
                return;
            }
            return;
        }
        LinearLayout linearLayout = this.bi;
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
        }
    }

    private void bm() {
        if (EnvironmentInfo.m()) {
            View viewFindViewById = this.bi.findViewById(R.id.sug_guid_brightness);
            View viewFindViewById2 = this.bi.findViewById(R.id.sug_guid_volume);
            viewFindViewById.setVisibility(4);
            viewFindViewById2.setVisibility(4);
        }
    }

    public void d(String str) {
        this.br.b(str);
    }

    public void c(hiu.d dVar) {
        this.g = dVar;
    }

    public SurfaceView n() {
        return this.co;
    }

    public ImageView i() {
        return this.aj;
    }

    public ImageView j() {
        return this.as;
    }

    public HealthTextView r() {
        return this.cu;
    }

    public long e() {
        return this.e;
    }

    public void c(long j) {
        if (ag()) {
            return;
        }
        this.e += j;
    }

    public boolean b() {
        return this.ap;
    }

    public OnMotionChangeListener h() {
        return this.bs;
    }

    public ToolsLayout c() {
        return this.f9384c;
    }

    public RelativeLayout getLockLayout() {
        return this.bj;
    }

    public void setSrtFile(File file) {
        if (file == null || !file.exists()) {
            LogUtil.j("Suggestion_LongCoachView", "setSrtFile() file is null or no exists");
            return;
        }
        Map<Integer, hma> mapC = ifq.c(file);
        if (mapC.isEmpty()) {
            LogUtil.j("Suggestion_LongCoachView", "setSrtFile() srtMap is empty");
            return;
        }
        this.av = true;
        this.cn = mapC;
        this.bl = mapC.get(Integer.valueOf(mapC.size() - 1)).b();
        this.dj.sendEmptyMessage(1202);
    }

    public HealthTextView m() {
        if (this.aw) {
            return this.ct;
        }
        return this.cs;
    }

    public Map<Integer, hma> k() {
        return this.cn;
    }

    public int o() {
        return this.bl;
    }

    public void c(boolean z) {
        this.bm = z;
        Consumer<Boolean> consumer = this.di;
        if (consumer != null) {
            consumer.accept(Boolean.valueOf(z));
            this.di = null;
        }
    }

    public void setValidListener(Consumer<Boolean> consumer) {
        this.di = consumer;
    }

    public void i(int i) {
        this.cv = i;
    }

    public MediaHelper f() {
        return this.br;
    }

    public List<Motion> l() {
        return this.bu;
    }

    public boolean g() {
        return this.bg;
    }

    public long s() {
        return this.da;
    }

    public boolean am() {
        return this.bm;
    }

    public HealthSeekBar getLongMediaProgress() {
        return this.bn;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.module.CoachViewInterface
    public void updateHeartRate(int i) {
        this.dj.removeMessages(1200);
        this.dj.sendMessageDelayed(this.dj.obtainMessage(1200), 300000L);
        if (this.ck == 0) {
            return;
        }
        this.h.e(this.cq);
        this.h.i(i);
    }

    public void setSportType(int i) {
        LogUtil.a("Suggestion_LongCoachView", "setSportType = ", Integer.valueOf(i));
        this.cq = i;
    }

    public void b(int i, int i2) {
        if (ag()) {
            LogUtil.d("Suggestion_LongCoachView", "updateCaloriesByVideoProgress isLoading");
            return;
        }
        int size = this.bu.size() - 1;
        if (njy.c(this.de, size) && this.bu.size() > 1) {
            long j = i;
            if (j > this.de.get(0).getEndTime() || j > this.de.get(size).getStartTime()) {
                hkb.d(this, this.bu.size());
            }
        }
        Motion motion = this.bu.get(this.k.c());
        if (this.j != null) {
            float fC = hit.c(i, motion, this.dk);
            this.j.a(this.j.e() + fC, this.j.d() + (fC - hit.e(i, motion, this.dk)), CaloriesConsumeHandler.CaloriesSource.COURSE_PRESET);
        }
    }

    public void c(float f) {
        CoachController.c().a(f);
        this.h.e(f / 1000.0f);
        this.h.g((int) f);
    }

    private void setDragScreenBiEvent(int i) {
        d(i, CoachController.StatusSource.APP);
    }

    private void d(int i, CoachController.StatusSource statusSource) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("resourceType", Integer.valueOf(this.g.f()));
        CharSequence text = this.cp.getText();
        if (!TextUtils.isEmpty(text)) {
            map.put("workout_name", text);
        }
        if (njy.c(this.bu, 0)) {
            Motion motion = this.bu.get(0);
            if (motion == null) {
                LogUtil.j("Suggestion_LongCoachView", "setDragScreenBiEvent motion is null.");
                return;
            } else {
                String strAcquireId = motion.acquireId();
                if (!TextUtils.isEmpty(strAcquireId)) {
                    map.put("workout_id", strAcquireId);
                }
            }
        }
        map.put("course_type", this.g.a());
        map.put("body_position", this.g.c());
        map.put("course_rate", this.g.b());
        map.put("eventType", Integer.valueOf(i <= this.br.j() ? 2 : 1));
        if (statusSource.equals(CoachController.StatusSource.NEW_LINK_WEAR)) {
            map.put("ControlMode", PutDataRequest.WEAR_URI_SCHEME);
        } else {
            map.put("ControlMode", "app");
        }
        lmf.d().c(this.o, AnalyticsValue.EVENT_FITNESS_COURSE_VIDEO_PROGRESS_DRAG.value(), map, 0);
    }

    private void cm() {
        cc();
        this.bn.setOnSeekBarChangeListener(new HealthSeekBar.OnSeekBarChangeListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.LongCoachView.10
            @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(HealthSeekBar healthSeekBar) {
            }

            @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
            public void onProgressChanged(HealthSeekBar healthSeekBar, int i, boolean z) {
                if (z) {
                    LongCoachView.this.ai.removeCallbacksAndMessages(null);
                    LongCoachView.this.bd = true;
                    LongCoachView.this.j(i);
                    if (lrd.d()) {
                        LongCoachView.this.e(healthSeekBar);
                    }
                }
            }

            @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(HealthSeekBar healthSeekBar) {
                LongCoachView.this.e(healthSeekBar);
            }
        });
        this.bn.setTouchable(bw());
    }

    private void cc() {
        if (!bw()) {
            this.as.setVisibility(8);
            this.am.setVisibility(8);
            this.aj.setVisibility(8);
        } else if (this.de.size() == 1) {
            this.as.setVisibility(8);
            this.aj.setVisibility(8);
        } else {
            LogUtil.a("Suggestion_LongCoachView", "setImgBtnVisibility is not support drag and mVideoSegments.size() > 1.");
        }
        if (this.am.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.am.getLayoutParams();
            layoutParams.setMarginStart(getResources().getDimensionPixelSize(R.dimen.health_common_8dp));
            this.am.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i) {
        if (this.bu.size() > 1) {
            int i2 = 0;
            while (i2 < this.de.size() && i >= this.de.get(i2).getEndTime()) {
                i2++;
            }
            hkb.d(this, this.bu.size());
            if (i2 == this.de.size()) {
                i2--;
            }
            this.k.d(i2);
        }
        this.bn.setProgress(i);
        this.cd.b(i);
        this.cu.setText(new SimpleDateFormat("mm:ss", Locale.getDefault()).format(Integer.valueOf(i)));
    }

    public void setCoachPictureAndName(String str, String str2) {
        this.n = str;
        this.l = str2;
    }

    public void setVideoType(int i) {
        if (!FitWorkout.b.b(i)) {
            LogUtil.e("Suggestion_LongCoachView", "videoProperty is not support!");
        } else {
            this.dc = i;
            cm();
        }
    }

    public boolean af() {
        return FitWorkout.b.d(this.dc);
    }

    public boolean ah() {
        return FitWorkout.b.c(this.dc);
    }

    public void c(int i) {
        this.ci = i;
    }

    public void g(int i) {
        this.ck = i;
    }

    public void setHeartRateAndCalorieVisibility(int i) {
        this.h.j(i);
    }

    public void setVideoUrl(String str) {
        ReleaseLogUtil.d("Suggestion_LongCoachView", "setVideoUrl() videoUrl:", str);
        this.dd = str;
    }

    private void cl() {
        LongMediaHelper longMediaHelper;
        if (TextUtils.isEmpty(this.f9382a) || (longMediaHelper = this.f9383b) == null) {
            ReleaseLogUtil.d("Suggestion_LongCoachView", "setPlayBackGroundMusic() bgMusicUrl isEmpty");
        } else {
            longMediaHelper.setMediaSources(Uri.parse(this.f9382a));
            this.f9383b.e(new PlayerHelper.OnPreparedListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.LongCoachView.9
                @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
                public void onPrepared() {
                    LogUtil.a("Suggestion_LongCoachView", "BackgroundMusic onPrepared");
                    LongCoachView.this.f9383b.start();
                }

                @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
                public void onBufferingStart() {
                    LogUtil.a("Suggestion_LongCoachView", "BackgroundMusic onBufferingStart");
                }

                @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
                public void onBufferingEnd() {
                    LogUtil.a("Suggestion_LongCoachView", "BackgroundMusic onBufferingEnd");
                }

                @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
                public void onSeekComplete() {
                    LogUtil.a("Suggestion_LongCoachView", "BackgroundMusic onSeekComplete:", Integer.valueOf(LongCoachView.this.f9383b.j()));
                }

                @Override // com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper.OnPreparedListener
                public void onVideoError() {
                    boolean zAb = CommonUtil.ab(LongCoachView.this.o);
                    LogUtil.e("Suggestion_LongCoachView", "background music play error.", Boolean.valueOf(zAb));
                    if (zAb) {
                        LongCoachView.this.f9383b.setMediaSources(Uri.parse(LongCoachView.this.f9382a));
                    }
                }
            });
        }
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("Suggestion_LongCoachView", "setBackgroundMusicListener() bgMusicUrl null");
            return;
        }
        ReleaseLogUtil.d("Suggestion_LongCoachView", "setBackgroundMusicUrl() bgMusicUrl:", str);
        this.f9382a = str;
        LongMediaHelper longMediaHelper = new LongMediaHelper(1);
        this.f9383b = longMediaHelper;
        longMediaHelper.b(true);
    }

    public int getLongExplanationVideoWatchTime() {
        return this.bp;
    }

    public void h(int i) {
        if (ag()) {
            return;
        }
        this.bp += i;
    }

    public void setTextViewMotionName(String str) {
        if (this.aw) {
            this.ac.a(str);
        }
    }

    public BrightnessOrVolumeProgressPlus getBrightOrVolumeProgressPlus() {
        return this.d;
    }

    public void setSeekVideoFinish() {
        this.bd = false;
    }

    public boolean al() {
        return this.bd;
    }

    public void b(Bundle bundle) {
        double dB;
        int i = bundle.getInt("fitnessHeart");
        LogUtil.a("Suggestion_LongCoachView", "notifyUpdateItemData heartValue: ", Integer.valueOf(i));
        updateHeartRate(i);
        this.cm.a(UnitUtil.e(bundle.getInt("fitnessTime") / 60, 1, 0));
        int i2 = bundle.getInt("fitnessDistance");
        if (i2 >= 100 && !this.bm) {
            LogUtil.a("Suggestion_LongCoachView", "notifyUpdateItemData() mIsValid save record!");
            this.bm = true;
        }
        if (UnitUtil.f()) {
            dB = ltc.d(i2);
        } else {
            dB = ltc.b(i2);
        }
        LogUtil.a("Suggestion_LongCoachView", "notifyUpdateItemData distance: ", Double.valueOf(dB));
        this.cm.b(dB);
        float f = bundle.getFloat("fitnessSpeed");
        this.p = f;
        LogUtil.a("Suggestion_LongCoachView", "notifyUpdateItemData speed: ", Float.valueOf(f));
        setSpeedToView(this.p);
        if (this.ae == 1) {
            String string = bundle.getString("fitnessSlope");
            LogUtil.a("Suggestion_LongCoachView", "notifyUpdateItemData slopeValue: ", string);
            this.cm.b(string);
            String string2 = bundle.getString("fitnessSteps");
            LogUtil.a("Suggestion_LongCoachView", "notifyUpdateItemData stepsValue: ", string2);
            this.cm.g(string2);
            String string3 = bundle.getString("fitnessStepFrequency");
            LogUtil.a("Suggestion_LongCoachView", "notifyUpdateItemData stepFrequencyValue: ", string3);
            this.cm.e(string3);
            return;
        }
        String string4 = bundle.getString("fitnessResistance");
        LogUtil.a("Suggestion_LongCoachView", "notifyUpdateItemData resistanceValue: ", string4);
        this.cm.c(string4);
        int i3 = bundle.getInt("fitnessTreadFrequancy");
        LogUtil.a("Suggestion_LongCoachView", "notifyUpdateItemData treadFrequencyValue: ", Integer.valueOf(i3));
        this.cm.a(i3, 150, this.o.getResources().getString(R.string.IDS_cadence_unit), "", 0);
        String string5 = bundle.getString("fitnessPower");
        LogUtil.a("Suggestion_LongCoachView", "notifyUpdateItemData powerValue: ", string5);
        this.cm.d(string5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ce() {
        hnb hnbVar = this.cm;
        if (hnbVar == null) {
            LogUtil.j("Suggestion_LongCoachView", "setEquipmentDefaultData mSportDataViewHolder == null");
            return;
        }
        hnbVar.b(0.0d);
        setSpeedToView(0.0f);
        if (this.ae == 2) {
            this.cm.c("");
            this.cm.a(0.0f, 150, this.o.getResources().getString(R.string.IDS_cadence_unit), "", 0);
            this.cm.d("");
            return;
        }
        this.cm.b("");
        this.cm.g("");
        this.cm.e("");
    }

    private void setSpeedToView(float f) {
        String string;
        if (this.ae == 2) {
            this.cm.i(UnitUtil.e(f, 1, 1));
            return;
        }
        if (UnitUtil.f()) {
            string = this.o.getResources().getString(R.string.IDS_hwh_motiontrack_show_speed_mi_hour);
        } else {
            string = this.o.getResources().getString(R.string.IDS_hwh_motiontrack_show_speed_km_hour);
        }
        this.cm.a(f, 100, string, "", 1);
    }

    public void a(int i) {
        String string;
        this.aq = true;
        if (hjr.b() != null && hjr.b().length != 0) {
            this.ab = new hjr();
            HealthTextView healthTextView = this.by;
            if (healthTextView != null) {
                healthTextView.setVisibility(8);
            }
        }
        hnb hnbVar = new hnb(i);
        this.cm = hnbVar;
        this.ce.addView(hnbVar.d());
        LogUtil.a("Suggestion_LongCoachView", "initEquipmentViewState addView equipmentType:", Integer.valueOf(i));
        if (i == 2) {
            this.cm.a(0.0f, 150, this.o.getResources().getString(R.string.IDS_cadence_unit), "", 0);
            return;
        }
        if (UnitUtil.f()) {
            string = this.o.getResources().getString(R.string.IDS_hwh_motiontrack_show_speed_mi_hour);
        } else {
            string = this.o.getResources().getString(R.string.IDS_hwh_motiontrack_show_speed_km_hour);
        }
        this.cm.a(0.0f, 100, string, "", 1);
    }

    public void b(int i) {
        hjr hjrVar = this.ab;
        if (hjrVar == null) {
            return;
        }
        float fA = hjrVar.a(i / 1000, (int) (this.p * 1000.0f));
        float f = this.cj;
        if (f != fA) {
            setPlayerSpeed(fA);
        } else {
            LogUtil.a("Suggestion_LongCoachView", "mSpeedLevel is not change.", Float.valueOf(f));
        }
    }

    public void aw() {
        LogUtil.a("Suggestion_LongCoachView", "onStopSport");
        this.ai.sendEmptyMessage(10001);
    }

    public void au() {
        HandlerExecutor.b(new Runnable() { // from class: hlv
            @Override // java.lang.Runnable
            public final void run() {
                this.d.ay();
            }
        });
        LogUtil.a("Suggestion_LongCoachView", "onResumeSport ,all continue ");
    }

    public void aq() {
        HandlerExecutor.b(new Runnable() { // from class: hlx
            @Override // java.lang.Runnable
            public final void run() {
                this.f36885a.bb();
            }
        });
        LogUtil.a("Suggestion_LongCoachView", "onPauseSport");
    }

    public void setBlutoothConnected(boolean z) {
        LogUtil.a("Suggestion_LongCoachView", "setBlutoothConnected : ", Boolean.valueOf(z));
        if (z) {
            return;
        }
        HandlerExecutor.b(new Runnable() { // from class: hlj
            @Override // java.lang.Runnable
            public final void run() {
                this.f36877a.ce();
            }
        });
    }

    public void setScreenCastVisibility(int i) {
        qsp.c((View) this.cl, i);
    }

    public boolean z() {
        return this.ao;
    }

    public void setClickStop(boolean z) {
        this.ao = z;
    }

    public void setCaloriesConsumeHandler(CaloriesConsumeHandler caloriesConsumeHandler) {
        this.j = caloriesConsumeHandler;
    }

    public boolean ae() {
        return this.ba;
    }

    public int getCalorieStartTime() {
        return this.i;
    }

    public void setCalorieStartTime(int i) {
        this.i = i;
    }

    public boolean ak() {
        if (this.ci != 1 || ah()) {
            this.at = false;
            return false;
        }
        if (this.aw || this.j.c()) {
            this.at = true;
            return true;
        }
        if (this.br.q() == null) {
            LogUtil.j("Suggestion_LongCoachView", "isStartCalCalorie mMediaHelper.getPlayer() == null");
            this.at = true;
            return true;
        }
        ReleaseLogUtil.d("Suggestion_LongCoachView", "mShowCalories:", Integer.valueOf(this.ci), "getCurrentPosition: ", Integer.valueOf(this.br.j()), "mCalorieStartTime:", Integer.valueOf(this.i));
        boolean z = this.br.j() >= this.i * 1000;
        this.at = z;
        return z;
    }

    public void az() {
        if (!this.at && ak()) {
            setHeartRateAndCalorieVisibility(0);
            this.h.c(0.0f, 1.0f);
        }
    }

    public void setHasRemindMobileConnected(boolean z) {
        this.bc = z;
    }

    public boolean ad() {
        return this.bc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadingStatus(boolean z) {
        HealthProgressBar healthProgressBar = this.df;
        if (healthProgressBar == null) {
            return;
        }
        if (z && healthProgressBar.getVisibility() == 0) {
            LogUtil.a("Suggestion_LongCoachView", "setLoadingStatus VISIBLE same");
            return;
        }
        if (!z && this.df.getVisibility() == 8) {
            LogUtil.a("Suggestion_LongCoachView", "setLoadingStatus GONE same");
            return;
        }
        if (z) {
            this.df.setVisibility(0);
        } else {
            this.df.setVisibility(8);
        }
        e(z);
    }

    private void e(boolean z) {
        if (!(this.o instanceof BaseCoachActivity)) {
            LogUtil.j("Suggestion_LongCoachView", "setLoadingStatus !(mContext instanceof BaseCoachActivity)");
            return;
        }
        LogUtil.a("Suggestion_LongCoachView", "calculateLoadingTime isVisible", Boolean.valueOf(z));
        BaseCoachActivity baseCoachActivity = (BaseCoachActivity) this.o;
        if (z) {
            baseCoachActivity.mLoadingStartTime = System.currentTimeMillis();
        }
        if (baseCoachActivity.mLoadingStartTime == 0) {
            LogUtil.a("Suggestion_LongCoachView", "calculateLoadingTime mLoadingStartTime == 0");
            return;
        }
        if (baseCoachActivity.mLoadingStartTime < baseCoachActivity.mStartTrainTime) {
            LogUtil.a("Suggestion_LongCoachView", "mLoadingStartTime < activity.mPlayStartTime", Boolean.valueOf(z), " mLoadingStartTime", Long.valueOf(baseCoachActivity.mLoadingStartTime), "mStartTrainTime:", Long.valueOf(baseCoachActivity.mStartTrainTime));
            return;
        }
        if (!z) {
            baseCoachActivity.mLoadingEndTime = System.currentTimeMillis();
            baseCoachActivity.mLoadingDuration = (baseCoachActivity.mLoadingDuration + baseCoachActivity.mLoadingEndTime) - baseCoachActivity.mLoadingStartTime;
        }
        ReleaseLogUtil.d("Suggestion_LongCoachView", "calculateLoadingTime mLoadingDuration:", Long.valueOf(baseCoachActivity.mLoadingDuration), " loadStarTime:", Long.valueOf(baseCoachActivity.mLoadingStartTime), " loadEndTime:", Long.valueOf(baseCoachActivity.mLoadingEndTime));
    }

    public boolean ag() {
        HealthProgressBar healthProgressBar = this.df;
        return (healthProgressBar != null && healthProgressBar.getVisibility() == 0) || this.bh;
    }

    private boolean bs() {
        Context context = this.o;
        if (!(context instanceof LongCoachActivity)) {
            LogUtil.j("Suggestion_LongCoachView", "isShowWifiTipsDialog !(mContext instanceof BaseCoachActivity)");
            return false;
        }
        return ((LongCoachActivity) context).c();
    }

    static class d extends lso.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<LongCoachView> f9389a;

        d(LongCoachView longCoachView) {
            this.f9389a = new WeakReference<>(longCoachView);
        }

        @Override // lso.e, android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            LongCoachView longCoachView = this.f9389a.get();
            if (longCoachView != null) {
                boolean z = longCoachView.bb;
                LogUtil.a("Suggestion_LongCoachView", "onCallStateChanged state = ", Integer.valueOf(i), ", mIsPlaying = ", Boolean.valueOf(z));
                if (z && i == 1) {
                    longCoachView.bb();
                    return;
                }
                return;
            }
            LogUtil.j("Suggestion_LongCoachView", "MyPhoneStateListener onCallStateChanged longCoachView == null");
        }
    }

    private void cq() {
        this.br.e(new OnTracksChangedListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.LongCoachView.6
            @Override // com.huawei.health.suggestion.ui.fitness.module.OnTracksChangedListener
            public void onTracksChanged(Tracks tracks) {
                LogUtil.a("Suggestion_LongCoachView", "setTracksListener  mTrackHashMap:", Boolean.valueOf(LongCoachView.this.cz.isEmpty()));
                if (LongCoachView.this.cz.isEmpty()) {
                    LongCoachView.this.d(tracks);
                }
            }

            @Override // com.huawei.health.suggestion.ui.fitness.module.OnTracksChangedListener
            public void onBufferingEnd() {
                LogUtil.a("Suggestion_LongCoachView", "setTracksListener onBufferingEnd, optionIndex:", Integer.valueOf(LongCoachView.this.dg));
                if (LongCoachView.this.dg != -1) {
                    LongCoachView.this.cv();
                    LongCoachView longCoachView = LongCoachView.this;
                    longCoachView.m(longCoachView.dg);
                    SharedPreferenceManager.d(String.valueOf(101010), "DEFINITION_LAST_SELECTED", LongCoachView.this.dg);
                    iei.b(LongCoachView.this.dd, false, LongCoachView.this.dg);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cv() {
        if (this.ay) {
            c(false, this.dg);
        }
        this.ay = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Tracks tracks) {
        UnmodifiableIterator<Tracks.Group> it = tracks.getGroups().iterator();
        while (it.hasNext()) {
            Tracks.Group next = it.next();
            if (next.isSupported() && next.getType() == 2 && next.length > 0) {
                for (int i = 0; i < next.length; i++) {
                    TrackGroup mediaTrackGroup = next.getMediaTrackGroup();
                    Format trackFormat = next.getTrackFormat(i);
                    int i2 = trackFormat.height;
                    ArrayList<hme> orDefault = this.cz.getOrDefault(Integer.valueOf(i2), new ArrayList<>());
                    orDefault.add(new hme(i, mediaTrackGroup, trackFormat));
                    this.cz.put(Integer.valueOf(i2), orDefault);
                }
                return;
            }
        }
    }

    private void bz() {
        LogUtil.a("Suggestion_LongCoachView", "setDefinitionParams mTrackHashMap:", Integer.valueOf(this.cz.size()));
        if (!this.cz.containsKey(Integer.valueOf(EnumDefinitionOptions.FHD.getHeight())) || !this.cz.containsKey(Integer.valueOf(EnumDefinitionOptions.HD.getHeight())) || !this.cz.containsKey(Integer.valueOf(EnumDefinitionOptions.SD.getHeight()))) {
            this.x.setVisibility(8);
            return;
        }
        this.x.setVisibility(0);
        int iC = SharedPreferenceManager.c(String.valueOf(101010), "DEFINITION_LAST_SELECTED", -1);
        LogUtil.a("Suggestion_LongCoachView", "handleTrackSelection lastLevel:", Integer.valueOf(iC));
        if (iC == EnumDefinitionOptions.FHD.getIndex()) {
            setTrackSelectionParameters(br() ? EnumDefinitionOptions.FHD : EnumDefinitionOptions.HD);
            m((br() ? EnumDefinitionOptions.FHD : EnumDefinitionOptions.HD).getIndex());
        } else if (iC == EnumDefinitionOptions.HD.getIndex()) {
            setTrackSelectionParameters(EnumDefinitionOptions.HD);
            m(EnumDefinitionOptions.HD.getIndex());
        } else if (iC == EnumDefinitionOptions.SD.getIndex()) {
            setTrackSelectionParameters(EnumDefinitionOptions.SD);
            m(EnumDefinitionOptions.SD.getIndex());
        } else {
            setTrackSelectionParameters(br() ? EnumDefinitionOptions.FHD : EnumDefinitionOptions.HD);
            m((br() ? EnumDefinitionOptions.FHD : EnumDefinitionOptions.HD).getIndex());
        }
    }

    private void setDefinitionClickEvent(EnumDefinitionOptions enumDefinitionOptions) {
        LogUtil.a("Suggestion_LongCoachView", "setDefinitionClickEvent");
        if (qrs.r()) {
            return;
        }
        this.v.setVisibility(8);
        if (enumDefinitionOptions == EnumDefinitionOptions.FHD && !br()) {
            cp();
            return;
        }
        if (this.dg == enumDefinitionOptions.getIndex()) {
            LogUtil.j("Suggestion_LongCoachView", "setDefinitionClickEvent do not need to switch");
            return;
        }
        iei.b(this.dd, true, this.dg);
        setTrackSelectionParameters(enumDefinitionOptions);
        this.f9384c.setVisibility(8);
        this.ay = true;
        c(true, this.dg);
    }

    private void setTrackSelectionParameters(EnumDefinitionOptions enumDefinitionOptions) {
        if (!CommonUtil.ab(getContext())) {
            LogUtil.j("Suggestion_LongCoachView", "net is not connected");
            return;
        }
        hme hmeVarD = d(enumDefinitionOptions.getHeight(), CommonUtil.ah(getContext()));
        if (hmeVarD == null) {
            LogUtil.j("Suggestion_LongCoachView", "videoTrackBean null");
            return;
        }
        TrackGroup trackGroupB = hmeVarD.b();
        Format formatD = hmeVarD.d();
        if (trackGroupB == null || formatD == null) {
            LogUtil.j("Suggestion_LongCoachView", "trackGroup or format is null");
            return;
        }
        LogUtil.a("Suggestion_LongCoachView", "format height:", Integer.valueOf(formatD.height), " bitrate", Integer.valueOf(formatD.bitrate));
        this.dg = enumDefinitionOptions.getIndex();
        ExoPlayer exoPlayerQ = this.br.q();
        exoPlayerQ.setTrackSelectionParameters(exoPlayerQ.getTrackSelectionParameters().buildUpon().setOverrideForType(new TrackSelectionOverride(trackGroupB, hmeVarD.e())).build());
    }

    private hme d(int i, boolean z) {
        hme hmeVar;
        if (this.cz.isEmpty()) {
            LogUtil.j("Suggestion_LongCoachView", "getTargetTrack map isEmpty");
            return null;
        }
        ArrayList<hme> arrayList = this.cz.get(Integer.valueOf(i));
        if (njy.e(arrayList)) {
            return null;
        }
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        int i2 = arrayList.get(0).d().bitrate;
        hme hmeVar2 = arrayList.get(0);
        for (int i3 = 1; i3 < arrayList.size(); i3++) {
            int i4 = arrayList.get(i3).d().bitrate;
            if (z) {
                if (i4 < i2) {
                    hmeVar = arrayList.get(i3);
                    hmeVar2 = hmeVar;
                    i2 = i4;
                }
            } else if (i4 > i2) {
                hmeVar = arrayList.get(i3);
                hmeVar2 = hmeVar;
                i2 = i4;
            }
        }
        return hmeVar2;
    }

    private void c(boolean z, int i) {
        int length;
        LogUtil.a("Suggestion_LongCoachView", "showTopTips index:", Integer.valueOf(i));
        if (i >= 0) {
            int[] iArr = this.t;
            if (i > iArr.length - 1) {
                return;
            }
            String strF = qre.f(iArr[i]);
            String strA = qre.a(z ? R.string.IDS_long_video_definition_switching : R.string.IDS_long_video_definition_switched, strF);
            LogUtil.a("Suggestion_LongCoachView", "showTopToast fullStr:", strA, " targetStr:", strF);
            if (TextUtils.isEmpty(strF) || TextUtils.isEmpty(strA) || !BaseApplication.isRunningForeground()) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
            int iIndexOf = strA.indexOf(strF);
            if (iIndexOf >= 0 && iIndexOf < strA.length() && (length = strF.length() + iIndexOf) <= strA.length()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.o, i == EnumDefinitionOptions.FHD.getIndex() ? R.color.vip_product_card_button_text_color : R.color.colorAccent)), iIndexOf, length, 33);
            }
            this.aa.setText(spannableStringBuilder);
            this.aa.setVisibility(0);
            if (z) {
                return;
            }
            this.cw.removeCallbacksAndMessages(null);
            this.cw.postDelayed(new Runnable() { // from class: hln
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36880a.ap();
                }
            }, 1000L);
        }
    }

    public /* synthetic */ void ap() {
        HealthTextView healthTextView = this.aa;
        if (healthTextView != null) {
            healthTextView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i) {
        LogUtil.a("Suggestion_LongCoachView", "updateDefinitionTv index:", Integer.valueOf(i));
        if (i < 0 || i > this.s.length - 1) {
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(this.o, R.drawable.ic_definition_vip);
        if (drawable != null && i == EnumDefinitionOptions.FHD.getIndex()) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.x.setCompoundDrawables(drawable, null, null, null);
            this.x.setTextColor(ContextCompat.getColor(this.o, R.color.vip_product_card_button_text_color));
        } else {
            this.x.setCompoundDrawables(null, null, null, null);
            this.x.setTextColor(ContextCompat.getColor(this.o, R.color.textColorPrimaryInverse));
        }
        this.x.setText(qre.f(this.s[i]));
        this.u.setTextColor(ContextCompat.getColor(this.o, i == EnumDefinitionOptions.FHD.getIndex() ? R.color.colorAccent : R.color.vip_product_card_button_text_color));
        this.y.setTextColor(ContextCompat.getColor(this.o, i == EnumDefinitionOptions.HD.getIndex() ? R.color.colorAccent : R.color.textColorPrimaryInverse));
        this.w.setTextColor(ContextCompat.getColor(this.o, i == EnumDefinitionOptions.SD.getIndex() ? R.color.colorAccent : R.color.textColorPrimaryInverse));
    }

    private boolean br() {
        UserMemberInfo userMemberInfoA = irz.a();
        if (userMemberInfoA != null && userMemberInfoA.getMemberFlag() != -1 && !irz.d(userMemberInfoA)) {
            return true;
        }
        LogUtil.j("Suggestion_LongCoachView", "isMembership is false");
        return false;
    }

    private void cp() {
        Context context = this.o;
        if (context == null || !(context instanceof LongCoachActivity)) {
            LogUtil.j("Suggestion_LongCoachView", "showOpenMembershipDialog mContext is null or not LongCoachActivity");
            return;
        }
        CustomAlertDialog customAlertDialog = this.bx;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
        final LongCoachActivity longCoachActivity = (LongCoachActivity) this.o;
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(longCoachActivity);
        CustomAlertDialog customAlertDialogB = builder.d(R.string.IDS_long_video_open_membership_benefit).a(View.inflate(longCoachActivity, R.layout.view_long_video_open_membership, null)).a(R.string.IDS_emergency_cancel, new DialogInterface.OnClickListener() { // from class: hlo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.e.b(dialogInterface, i);
            }
        }).d(R.string.IDS_long_video_open_membership_confirm, new DialogInterface.OnClickListener() { // from class: hlm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f36879a.c(longCoachActivity, dialogInterface, i);
            }
        }).e(false).e(17).b();
        this.bx = customAlertDialogB;
        HealthButtonBarLayout healthButtonBarLayout = (HealthButtonBarLayout) customAlertDialogB.findViewById(R.id.button_bar);
        if (healthButtonBarLayout != null) {
            healthButtonBarLayout.setDividerDrawable(new ColorDrawable(0));
        }
        HealthButton healthButtonA = builder.a();
        if (healthButtonA != null) {
            healthButtonA.setTextColor(ContextCompat.getColor(longCoachActivity, R.color.vip_product_card_button_text_color));
        }
        HealthButton healthButtonC = builder.c();
        if (healthButtonC != null) {
            healthButtonC.setTextColor(ContextCompat.getColor(longCoachActivity, R.color.vip_product_card_button_text_color));
            healthButtonC.setBackgroundResource(R.drawable.bg_long_video_definition_pop);
        }
        if (longCoachActivity.isFinishing() || longCoachActivity.isDestroyed()) {
            return;
        }
        this.bx.show();
        iei.c(0);
        ax();
        ba();
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ay();
    }

    public /* synthetic */ void c(LongCoachActivity longCoachActivity, DialogInterface dialogInterface, int i) {
        iei.c(1);
        Intent intent = new Intent(longCoachActivity, (Class<?>) OpenMembershipActivity.class);
        intent.putExtra("long_coach_video_url", this.dd);
        iov.d(longCoachActivity, intent);
        dialogInterface.dismiss();
        longCoachActivity.finish();
    }

    public void e(int i) {
        if (i == 0) {
            boolean zB = SharedPreferenceManager.b(String.valueOf(101010), "DEFINITION_BUBBLE_DISPLAYED", false);
            LogUtil.a("Suggestion_LongCoachView", "isDisplayed:", Boolean.valueOf(zB));
            if (!zB && this.cz.containsKey(Integer.valueOf(EnumDefinitionOptions.FHD.getHeight())) && this.cz.containsKey(Integer.valueOf(EnumDefinitionOptions.HD.getHeight())) && this.cz.containsKey(Integer.valueOf(EnumDefinitionOptions.SD.getHeight()))) {
                this.f.postDelayed(new Runnable() { // from class: hly
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f36886b.aj();
                    }
                }, 1000L);
                return;
            }
            return;
        }
        PopupWindow popupWindow = this.bw;
        if (popupWindow != null) {
            popupWindow.dismiss();
            SharedPreferenceManager.a(String.valueOf(101010), "DEFINITION_BUBBLE_DISPLAYED", true);
        }
    }

    public /* synthetic */ void aj() {
        if (this.x == null || this.bw != null) {
            return;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = this.x.getGlobalVisibleRect(rect);
        LogUtil.a("Suggestion_LongCoachView", "mDefinitionParams:", Boolean.valueOf(globalVisibleRect), " width:", Integer.valueOf(rect.width()), " height:", Integer.valueOf(rect.height()));
        if (!globalVisibleRect || rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.o).inflate(R.layout.view_long_video_definition_option, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, false);
        this.bw = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.bw.setBackgroundDrawable(ContextCompat.getDrawable(this.o, android.R.color.transparent));
        this.bw.setOutsideTouchable(true);
        this.bw.setClippingEnabled(false);
        int i = getResources().getDisplayMetrics().widthPixels;
        int[] iArr = new int[2];
        this.x.getLocationOnScreen(iArr);
        LogUtil.a("Suggestion_LongCoachView", "mDefinitionParams X:", Integer.valueOf(iArr[0]), " Y:", Integer.valueOf(iArr[1]));
        int i2 = iArr[0];
        int width = this.x.getWidth();
        PopupWindow popupWindow2 = this.bw;
        HealthTextView healthTextView = this.x;
        popupWindow2.showAsDropDown(healthTextView, (-(i - (i2 + width))) - (healthTextView.getWidth() / 2), 0);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: hll
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36878b.d(view);
            }
        });
        SharedPreferenceManager.a(String.valueOf(101010), "DEFINITION_BUBBLE_DISPLAYED", true);
    }

    public /* synthetic */ void d(View view) {
        this.bw.dismiss();
        this.v.setVisibility(0);
    }
}
