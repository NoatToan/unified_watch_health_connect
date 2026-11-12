package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.mvp.ScreenController;
import com.huawei.health.suggestion.ui.fitness.mvp.VideoPlayer;
import com.huawei.health.suggestion.ui.fitness.mvp.ViewVideoPlayListener;
import com.huawei.health.suggestion.ui.fitness.mvp.VipViewShowProvider;
import com.huawei.health.suggestion.ui.view.AutoFillColorView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.seekbar.HealthSeekBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import health.compact.a.CommonUtil;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class hhv implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AutoFillColorView f36749a;
    private ImageView aa;
    private ImageView ad;
    private LinearLayout ae;
    private LinearLayout ag;
    private ImageView ah;
    private ImageView ai;
    private View aj;
    private LinearLayout ak;
    private FrameLayout al;
    private FrameLayout am;
    private LinearLayout ao;
    private hkh ap;
    private RelativeLayout aq;
    private HealthSeekBar as;
    private HealthTextView at;
    private ScreenController au;
    private HealthTextView av;
    private String ax;
    private VideoPlayer ay;
    private int az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HealthTextView f36750b;
    private VipViewShowProvider ba;
    private ViewVideoPlayListener bb;
    private FrameLayout bc;
    private ImageView bd;
    private HealthTextView be;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioManager f36751c;
    private HealthTextView d;
    private Context e;
    private FitWorkout g;
    private ImageView h;
    private RelativeLayout i;
    private CustomTitleBar j;
    private HealthSeekBar k;
    private ImageView m;
    private ImageView n;
    private View o;
    private ImageView p;
    private HealthTextView q;
    private FrameLayout r;
    private HealthTextView s;
    private ImageView t;
    private LinearLayout y;
    private boolean ar = false;
    private boolean w = false;
    private boolean x = false;
    private boolean ac = false;
    private int an = 0;
    private int f = 0;
    private int af = 0;
    private int l = 0;
    private Runnable aw = new b(this);
    private Handler v = new a(Looper.getMainLooper(), this);
    private boolean z = false;
    private boolean ab = true;
    private boolean u = false;

    static class b implements Runnable {
        private WeakReference<hhv> d;

        b(hhv hhvVar) {
            this.d = new WeakReference<>(hhvVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<hhv> weakReference = this.d;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.j("Suggestion_VipPreview", "VipPreview is destroyed.");
                return;
            }
            hhv hhvVar = this.d.get();
            if (hhvVar.w) {
                hhvVar.ag.setVisibility(8);
                hhvVar.w = false;
            }
            if (hhvVar.x) {
                hhvVar.i.setVisibility(8);
                hhvVar.t.setVisibility(8);
                hhvVar.d.setVisibility(8);
                hhvVar.x = false;
            }
        }
    }

    static class a extends BaseHandler<hhv> {
        a(Looper looper, hhv hhvVar) {
            super(looper, hhvVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(hhv hhvVar, Message message) {
            int i = message.what;
            if (i == 0) {
                if (message.obj instanceof Integer) {
                    hhvVar.f = ((Integer) message.obj).intValue();
                    if (hhvVar.ac) {
                        hhvVar.an();
                        return;
                    } else {
                        hhvVar.al();
                        return;
                    }
                }
                return;
            }
            if (i == 1) {
                if (message.obj instanceof Integer) {
                    hhvVar.an = ((Integer) message.obj).intValue();
                    hhvVar.ac();
                    return;
                }
                return;
            }
            if (i == 2 && (message.obj instanceof Integer)) {
                Integer num = (Integer) message.obj;
                int iIntValue = num.intValue();
                LogUtil.a("Suggestion_VipPreview", "MSG_PREVIEW_PLAY_STATUS_CHANGE state:", num);
                hhvVar.d(iIntValue);
            }
        }
    }

    public hhv(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        LogUtil.a("Suggestion_VipPreview", "VipPreview init");
        if (frameLayout == null || frameLayout2 == null) {
            LogUtil.e("Suggestion_VipPreview", "trainDetailContentLayout is null");
            return;
        }
        this.bc = frameLayout3;
        this.e = context;
        this.ay = new VideoPlayer(context);
        if (context.getSystemService("audio") instanceof AudioManager) {
            this.f36751c = (AudioManager) context.getSystemService("audio");
        }
        am();
        this.ay.c(new VideoPlayer.VideoPlayStateListener() { // from class: hhx
            @Override // com.huawei.health.suggestion.ui.fitness.mvp.VideoPlayer.VideoPlayStateListener
            public final void onPlayStateChange(int i) {
                this.f36755c.a(i);
            }
        });
        this.al = frameLayout;
        this.am = frameLayout2;
        p();
        this.ap = new hkh(this.e, this.al, this.am, this);
    }

    /* synthetic */ void a(int i) {
        LogUtil.d("Suggestion_VipPreview", "onPlayStateChange mVideoPlayer");
        Message messageObtainMessage = this.v.obtainMessage();
        messageObtainMessage.what = 2;
        messageObtainMessage.obj = Integer.valueOf(i);
        this.v.sendMessage(messageObtainMessage);
    }

    private void am() {
        this.ay.a(new VideoPlayer.VideoCurrentPositionCallBack() { // from class: hhv.1
            @Override // com.huawei.health.suggestion.ui.fitness.mvp.VideoPlayer.VideoCurrentPositionCallBack
            public void onCurrentPostionChange(int i) {
                if ((hhv.this.as == null || hhv.this.at == null) && (hhv.this.k == null || hhv.this.q == null)) {
                    return;
                }
                Message messageObtainMessage = hhv.this.v.obtainMessage();
                messageObtainMessage.what = 0;
                messageObtainMessage.obj = Integer.valueOf(i);
                hhv.this.v.sendMessage(messageObtainMessage);
            }

            @Override // com.huawei.health.suggestion.ui.fitness.mvp.VideoPlayer.VideoCurrentPositionCallBack
            public void onVideoDurationChange(int i) {
                if (hhv.this.at == null && hhv.this.q == null) {
                    return;
                }
                hhv.this.z = true;
                LogUtil.a("Suggestion_VipPreview", "onVideoDurationChange mIsFistClickPreStart:", Boolean.valueOf(hhv.this.ab), "mIsClicked:", Boolean.valueOf(hhv.this.u));
                if (hhv.this.u && hhv.this.ab && hhv.this.af != 1) {
                    hhv.this.ab();
                    hhv.this.ay.d(0);
                    hhv.this.ab = false;
                }
                Message messageObtainMessage = hhv.this.v.obtainMessage();
                messageObtainMessage.what = 1;
                messageObtainMessage.obj = Integer.valueOf(i);
                hhv.this.v.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (this.ac) {
            e(i);
        } else {
            c(i);
        }
    }

    private void c(int i) {
        if (i == 1) {
            LogUtil.a("Suggestion_VipPreview", "STATE_SMALL_PLAYING");
            this.af = 1;
            y();
        } else if (i == 2) {
            LogUtil.a("Suggestion_VipPreview", "STATE_SMALL_PAUSE");
            this.af = 2;
            y();
        } else if (i == 0) {
            LogUtil.a("Suggestion_VipPreview", "STATE_SMALL_STOP");
            this.af = 0;
            y();
        } else if (i == 3) {
            LogUtil.a("Suggestion_VipPreview", "STATE_SMALL_RESET");
            this.af = 3;
            this.ay.j();
            this.ay.f();
            l();
        } else {
            LogUtil.j("Suggestion_VipPreview", "handlePlayStatusMessage else");
        }
        LogUtil.a("Suggestion_VipPreview", "handlePlayStatusMessage mPlayState:", Integer.valueOf(this.af));
        this.aj.setVisibility(8);
    }

    private void e(int i) {
        if (i == 1) {
            LogUtil.d("Suggestion_VipPreview", "STATE_FULL_PLAYING");
            this.l = 1;
        } else if (i == 2) {
            LogUtil.d("Suggestion_VipPreview", "STATE_FULL_PAUSE");
            this.l = 2;
            k();
        } else if (i == 0) {
            LogUtil.d("Suggestion_VipPreview", "STATE_FULL_STOP");
            this.l = 0;
            k();
        } else {
            LogUtil.j("Suggestion_VipPreview", "handleFullPlayStatusMessage else");
        }
        this.o.setVisibility(8);
        LogUtil.d("Suggestion_VipPreview", "handleFullPlayStatusMessage mFullPlayState :", Integer.valueOf(this.l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        int i = this.an;
        if (i > 0) {
            int i2 = this.f;
            if (i - i2 >= 0) {
                int i3 = this.af;
                if (i3 == 1) {
                    this.as.setProgress(i2);
                    this.at.setText(new SimpleDateFormat("mm:ss").format(Integer.valueOf(this.an - this.f)));
                } else if (i3 == 2) {
                    LogUtil.d("Suggestion_VipPreview", "upFullDateProgressAndTime STATE_SMALL_PAUSE");
                } else if (i3 != 0) {
                    LogUtil.j("Suggestion_VipPreview", "updateProgressAndTime STATE OTHER");
                } else {
                    this.as.setProgress(0);
                    this.at.setText(new SimpleDateFormat("mm:ss").format(Integer.valueOf(this.an)));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an() {
        int i = this.an;
        if (i > 0) {
            int i2 = this.f;
            if (i - i2 >= 0) {
                int i3 = this.l;
                if (i3 == 1) {
                    this.k.setProgress(i2);
                    this.q.setText(new SimpleDateFormat("mm:ss").format(Integer.valueOf(this.an - this.f)));
                } else if (i3 == 2) {
                    LogUtil.d("Suggestion_VipPreview", "upFullDateProgressAndTime STATE_FULL_PAUSE");
                } else if (i3 != 0) {
                    LogUtil.j("Suggestion_VipPreview", "updataFullDateProgressAndTime STATE OTHER");
                } else {
                    this.k.setProgress(0);
                    this.q.setText(new SimpleDateFormat("mm:ss").format(Integer.valueOf(this.an)));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        LogUtil.a("Suggestion_VipPreview", "setPreviewTime mPreviewDuration :", Integer.valueOf(this.an));
        if (this.an > 0) {
            this.at.setText(new SimpleDateFormat("mm:ss").format(Integer.valueOf(this.an)));
            this.q.setText(new SimpleDateFormat("mm:ss").format(Integer.valueOf(this.an)));
            this.as.setMax(this.an);
            this.k.setMax(this.an);
            this.ap.c(t(), this.be, this.ao);
        }
    }

    private String t() {
        if (this.an <= 0) {
            return "";
        }
        String strB = gzx.b(TimeUnit.MILLISECONDS.toSeconds(this.an));
        this.f36750b.setText(gzx.c(this.e, R.string.IDS_sug_try_watch_time, strB));
        if (e().f()) {
            this.f36750b.setText(gzx.c(this.e, R.string.sug_start_train, new Object[0]));
        }
        return strB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        AudioManager audioManager = this.f36751c;
        if (audioManager == null) {
            LogUtil.e("Suggestion_VipPreview", "mAudioManager is null.");
        } else {
            LogUtil.a("Suggestion_VipPreview", "requestAudioFocus:", Integer.valueOf(audioManager.requestAudioFocus(null, 3, 1)));
        }
    }

    private void n() {
        AudioManager audioManager = this.f36751c;
        if (audioManager == null) {
            LogUtil.e("Suggestion_VipPreview", "mAudioManager is null.");
        } else {
            LogUtil.a("Suggestion_VipPreview", "abandonMusicFocus:", Integer.valueOf(audioManager.abandonAudioFocus(null)));
        }
    }

    private void p() {
        this.aj = this.al.findViewById(R.id.sug_preview_coach_loading_progress);
        this.f36749a = (AutoFillColorView) this.al.findViewById(R.id.auto_fill_color_view_preview);
        this.aq = (RelativeLayout) this.al.findViewById(R.id.preview_start);
        this.ai = (ImageView) this.al.findViewById(R.id.preview_button);
        this.p = (ImageView) this.al.findViewById(R.id.full_screen_change);
        this.ao = (LinearLayout) this.al.findViewById(R.id.preview_tips);
        this.ad = (ImageView) this.al.findViewById(R.id.pause_image);
        this.ah = (ImageView) this.al.findViewById(R.id.play_image);
        this.ag = (LinearLayout) this.al.findViewById(R.id.sug_preview_coach_control_);
        this.as = (HealthSeekBar) this.al.findViewById(R.id.sug_preview_seekBar_progress);
        this.at = (HealthTextView) this.al.findViewById(R.id.sug_preview_tv_second);
        this.ak = (LinearLayout) this.al.findViewById(R.id.member_preview_header);
        this.f36750b = (HealthTextView) this.al.findViewById(R.id.pre_time_try_watch);
        this.be = (HealthTextView) this.al.findViewById(R.id.pre_tips_goto_vip);
        this.o = this.am.findViewById(R.id.sug_full_preview_loading_progress);
        this.t = (ImageView) this.am.findViewById(R.id.full_screen_back);
        this.d = (HealthTextView) this.am.findViewById(R.id.course_title);
        this.h = (ImageView) this.am.findViewById(R.id.small_screen_change);
        this.bd = (ImageView) this.am.findViewById(R.id.volume_adjustment);
        this.r = (FrameLayout) this.am.findViewById(R.id.sfv_parent_preview);
        this.k = (HealthSeekBar) this.am.findViewById(R.id.sug_full_preview_seekBar_progress);
        this.m = (ImageView) this.am.findViewById(R.id.full_pause_image);
        this.n = (ImageView) this.am.findViewById(R.id.full_play_image);
        this.i = (RelativeLayout) this.am.findViewById(R.id.sug_full_coach_rl_actiontools);
        this.q = (HealthTextView) this.am.findViewById(R.id.sug_full_preview_tv_second);
        this.y = (LinearLayout) this.am.findViewById(R.id.full_screen_play_end);
        this.aa = (ImageView) this.am.findViewById(R.id.play_end_full_screen_sfv);
        this.ae = (LinearLayout) this.al.findViewById(R.id.member_preview_end);
        this.av = (HealthTextView) this.al.findViewById(R.id.re_start_play);
        this.s = (HealthTextView) this.am.findViewById(R.id.full_re_start_play);
        this.j = (CustomTitleBar) this.al.findViewById(R.id.titlebar_panel);
        s();
        q();
        x();
        ad();
        l();
    }

    private void q() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.ak.getLayoutParams();
        layoutParams.topMargin = this.az;
        this.ak.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.ae.getLayoutParams();
        layoutParams2.topMargin = this.az;
        this.ae.setLayoutParams(layoutParams2);
    }

    private void s() {
        CustomTitleBar customTitleBar = this.j;
        if (customTitleBar == null || customTitleBar.getHeight() == 0) {
            int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.custom_normal_titlebar_height);
            this.az = dimensionPixelSize;
            LogUtil.a("Suggestion_VipPreview", "getMarginTop marginTop default:", Integer.valueOf(dimensionPixelSize));
        } else {
            int height = this.j.getHeight();
            this.az = height;
            LogUtil.a("Suggestion_VipPreview", "getMarginTop marginTop:", Integer.valueOf(height));
        }
    }

    private void x() {
        this.i.setVisibility(8);
        this.t.setVisibility(8);
        this.d.setVisibility(8);
        this.y.setVisibility(8);
        this.aa.setVisibility(8);
        this.ae.setVisibility(8);
    }

    private void ad() {
        this.bc.setOnClickListener(this);
        this.ai.setOnClickListener(this);
        this.p.setOnClickListener(this);
        this.ad.setOnClickListener(this);
        this.ah.setVisibility(8);
        this.ah.setOnClickListener(this);
        this.t.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.bd.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.k.setTouchable(true);
        this.av.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.k.setOnSeekBarChangeListener(new HealthSeekBar.OnSeekBarChangeListener() { // from class: hhv.2
            @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(HealthSeekBar healthSeekBar) {
            }

            @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
            public void onProgressChanged(HealthSeekBar healthSeekBar, int i, boolean z) {
                if (z) {
                    hhv.this.ay.m();
                    hhv.this.j(i);
                } else {
                    LogUtil.j("Suggestion_VipPreview", "onProgressChanged isFromUser is false.");
                }
            }

            @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(HealthSeekBar healthSeekBar) {
                hhv.this.j(healthSeekBar.getProgress());
                hhv.this.ay.c(healthSeekBar.getProgress());
                hhv.this.ay.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i) {
        this.v.removeCallbacksAndMessages(null);
        this.k.setProgress(i);
        this.f = i;
        this.q.setText(new SimpleDateFormat("mm:ss", Locale.getDefault()).format(Integer.valueOf(this.an - this.f)));
    }

    public void b(FitWorkout fitWorkout) {
        this.u = false;
        this.ab = true;
        this.z = false;
        LogUtil.a("Suggestion_VipPreview", "vipPreView bind");
        this.g = fitWorkout;
        if (TextUtils.isEmpty(fitWorkout.getPreviewVideoUrl())) {
            return;
        }
        this.ax = fitWorkout.getPreviewVideoUrl();
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_VipPreview", "setCourseTitle title is null");
            return;
        }
        this.d.setText(str);
        if (e().f()) {
            this.f36750b.setText(gzx.c(this.e, R.string.sug_start_train, new Object[0]));
        }
    }

    private void u() {
        if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j("Suggestion_VipPreview", "Network is not Connected!");
            qpx.b(BaseApplication.b(), R.string.CS_network_connect_error);
        } else if (CommonUtil.o(BaseApplication.b()) != 1) {
            qpx.e(BaseApplication.b(), R.string.IDS_app_help_3gnet_diag_conent);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.ai;
        if (view == imageView) {
            a(imageView);
            return;
        }
        if (view == this.p) {
            ai();
            return;
        }
        ImageView imageView2 = this.ad;
        if (view == imageView2) {
            d(imageView2);
            return;
        }
        ImageView imageView3 = this.m;
        if (view == imageView3) {
            d(imageView3);
            return;
        }
        ImageView imageView4 = this.ah;
        if (view == imageView4) {
            a(imageView4);
            return;
        }
        ImageView imageView5 = this.n;
        if (view == imageView5) {
            a(imageView5);
            return;
        }
        if (view == this.av || view == this.s) {
            this.ac = false;
            this.ay.c(0);
            l();
            v();
            return;
        }
        if (view == this.t || view == this.h) {
            b();
            return;
        }
        if (view == this.bd) {
            aj();
            return;
        }
        FrameLayout frameLayout = this.bc;
        if (view == frameLayout) {
            b(frameLayout);
        } else {
            LogUtil.j("Suggestion_VipPreview", "onClick else");
        }
    }

    public void d(boolean z) {
        if (TextUtils.isEmpty(this.ax)) {
            return;
        }
        LogUtil.d("Suggestion_VipPreview", "playerResourceLoading");
        this.ay.a();
        this.ay.c(this.bc);
        this.ay.e(this.ax, z);
        this.ay.b(false);
        if (z) {
            ab();
        }
    }

    public hld e() {
        VipViewShowProvider vipViewShowProvider = this.ba;
        if (vipViewShowProvider == null) {
            LogUtil.j("Suggestion_VipPreview", "getAuditionCourseData() mVipViewShowProvider null");
            return new hld();
        }
        hld auditionCourseData = vipViewShowProvider.getAuditionCourseData();
        if (auditionCourseData != null) {
            return auditionCourseData;
        }
        LogUtil.j("Suggestion_VipPreview", "getAuditionCourseData() auditionCourseData null");
        return new hld();
    }

    private void m() {
        LogUtil.d("Suggestion_VipPreview", "hideFullScreen");
        this.r.setVisibility(8);
        this.aa.setVisibility(8);
        this.y.setVisibility(8);
        this.ac = false;
        ScreenController screenController = this.au;
        if (screenController != null) {
            screenController.setScreenOrientation(1);
            LogUtil.d("Suggestion_VipPreview", "SCREEN_ORIENTATION_PORTRAIT OVER");
        }
    }

    private void r() {
        this.ak.setVisibility(8);
        this.ae.setVisibility(8);
        ScreenController screenController = this.au;
        if (screenController != null) {
            screenController.setScreenOrientation(0);
        }
        c(true);
    }

    public void c(boolean z) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.bc.getLayoutParams();
        if (z) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
        } else {
            layoutParams.width = -1;
            layoutParams.height = this.e.getResources().getDimensionPixelSize(R.dimen.member_preview_small_screen_height);
            layoutParams.topMargin = this.az;
        }
        this.bc.setLayoutParams(layoutParams);
        SurfaceView surfaceViewE = this.ay.e();
        if (surfaceViewE == null) {
            LogUtil.j("Suggestion_VipPreview", "setScreenLayout surfaceView == null");
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) surfaceViewE.getLayoutParams();
        if (z) {
            layoutParams2.width = -1;
            layoutParams2.height = -1;
        } else {
            layoutParams2.width = -1;
            layoutParams2.height = this.e.getResources().getDimensionPixelSize(R.dimen.member_preview_small_screen_height);
        }
        surfaceViewE.setLayoutParams(layoutParams2);
        surfaceViewE.post(new Runnable() { // from class: hhy
            @Override // java.lang.Runnable
            public final void run() {
                this.f36756a.c();
            }
        });
    }

    /* synthetic */ void c() {
        this.ay.i();
    }

    private void aa() {
        if (TextUtils.isEmpty(this.ax)) {
            return;
        }
        LogUtil.d("Suggestion_VipPreview", "previewLoadingDisplay");
        this.ar = true;
        this.ak.setVisibility(0);
        this.aj.setVisibility(0);
        this.f36749a.setVisibility(8);
        this.aq.setVisibility(8);
        this.ae.setVisibility(8);
        this.r.setVisibility(8);
        this.aa.setVisibility(8);
        this.y.setVisibility(8);
        this.bc.setVisibility(8);
        LogUtil.d("Suggestion_VipPreview", "previewLoadingDisplay end");
    }

    private void l() {
        LogUtil.d("Suggestion_VipPreview", "displayDefaultPreview");
        this.af = 0;
        this.l = 0;
        this.ag.setVisibility(8);
        this.ak.setVisibility(0);
        this.f36749a.setVisibility(0);
        this.aq.setVisibility(0);
        this.ae.setVisibility(8);
        this.ao.setVisibility(8);
        m();
        this.ay.j();
        this.ay.f();
        this.bc.setVisibility(8);
        LogUtil.d("Suggestion_VipPreview", "displayDefaultPreview end");
        t();
    }

    private void o() {
        this.r.setVisibility(0);
        this.t.setVisibility(0);
        this.d.setVisibility(0);
        this.aa.setVisibility(8);
        this.y.setVisibility(8);
        this.o.setVisibility(8);
        this.bc.setVisibility(0);
        LogUtil.d("Suggestion_VipPreview", "fullScreenSetVisibility");
    }

    private void k() {
        int i = this.l;
        if (i == 1) {
            LogUtil.d("Suggestion_VipPreview", "fullScreenPreviewDisplay mFullPlayState STATE_PLAYING");
            this.n.setVisibility(8);
            this.m.setVisibility(0);
        } else if (i == 2) {
            LogUtil.d("Suggestion_VipPreview", "fullScreenPreviewDisplay mFullPlayState STATE_PAUSE");
            this.n.setVisibility(0);
            this.m.setVisibility(8);
        } else if (i == 0) {
            LogUtil.d("Suggestion_VipPreview", "fullScreenPreviewDisplay mFullPlayState STATE_STOP");
            if (e().g()) {
                l();
            } else {
                i();
                this.y.setVisibility(0);
                this.t.setVisibility(0);
                this.d.setVisibility(0);
                this.aa.setVisibility(0);
            }
            this.i.setVisibility(8);
            this.f = 0;
            this.k.setProgress(0);
            this.o.setVisibility(8);
        } else {
            LogUtil.j("Suggestion_VipPreview", "fullScreenPreviewDisplay mFullPlayState else");
        }
        this.o.setVisibility(8);
        LogUtil.d("Suggestion_VipPreview", "fullScreenPreviewDisplay ok");
    }

    private void y() {
        int i = this.af;
        if (i == 1) {
            LogUtil.d("Suggestion_VipPreview", "previewDisplay mPlayState STATE_PLAYING");
            if (!e().g() && this.ar) {
                this.ao.setVisibility(0);
                this.ar = false;
                this.v.removeCallbacks(this.aw);
                this.v.postDelayed(this.aw, 5000L);
            }
            this.ah.setVisibility(8);
            this.ad.setVisibility(0);
            af();
            return;
        }
        if (i == 2) {
            LogUtil.d("Suggestion_VipPreview", "previewDisplay mPlayState STATE_PAUSE");
            this.ah.setVisibility(0);
            this.ad.setVisibility(8);
            af();
            return;
        }
        if (i == 0) {
            LogUtil.d("Suggestion_VipPreview", "previewDisplay mPlayState STATE_STOP");
            if (e().g()) {
                l();
            } else {
                i();
                this.ae.setVisibility(0);
                this.ak.setVisibility(8);
                this.f36749a.setVisibility(8);
                this.aq.setVisibility(8);
            }
            this.ao.setVisibility(8);
            this.aj.setVisibility(8);
            this.f = 0;
            this.as.setProgress(0);
            LogUtil.a("Suggestion_VipPreview", "previewDisplay small stop");
            return;
        }
        LogUtil.d("Suggestion_VipPreview", "previewDisplay else");
    }

    private void d(View view) {
        if (view == this.ad) {
            this.ay.d(true);
        } else if (view == this.m) {
            this.ay.d(true);
        } else {
            LogUtil.e("Suggestion_VipPreview", "clickPauseDealWith error click");
        }
    }

    private void a(View view) {
        ImageView imageView = this.ah;
        if (view == imageView) {
            if (this.af == 2) {
                imageView.setVisibility(8);
                this.ad.setVisibility(0);
                this.ay.e(this.f);
                return;
            }
            return;
        }
        ImageView imageView2 = this.n;
        if (view == imageView2) {
            if (this.l == 2) {
                imageView2.setVisibility(8);
                this.m.setVisibility(0);
                this.ay.e(this.f);
                return;
            }
            return;
        }
        if (view == this.ai) {
            w();
        } else {
            LogUtil.e("Suggestion_VipPreview", "clickPlayDealWith error click");
        }
    }

    private void w() {
        if (e().f()) {
            LogUtil.a("Suggestion_VipPreview", "clickPlayDealWith isNormalStarPlay");
            ae();
        } else {
            v();
        }
    }

    private void ae() {
        ViewVideoPlayListener viewVideoPlayListener = this.bb;
        if (viewVideoPlayListener != null) {
            viewVideoPlayListener.startCoachPlay();
        }
    }

    private void v() {
        u();
        this.f = 0;
        if (TextUtils.isEmpty(this.ax)) {
            return;
        }
        LogUtil.a("Suggestion_VipPreview", "clickPlayDealWith mPreviewButton");
        ViewVideoPlayListener viewVideoPlayListener = this.bb;
        if (viewVideoPlayListener != null) {
            viewVideoPlayListener.onVideoStartPlay();
        }
        this.u = true;
        if (this.ab) {
            if (this.z) {
                ab();
                this.ay.d(0);
                this.ab = false;
            }
        } else {
            d(true);
        }
        aa();
        iei.a(this.g, 0, this.an / 1000, 1);
    }

    private void b(View view) {
        LogUtil.d("Suggestion_VipPreview", "clickPlayArea start");
        if (!this.ac) {
            LogUtil.d("Suggestion_VipPreview", "clickPlayArea mSmallViewFrameLayout");
            int i = this.af;
            if (i == 1 || i == 2) {
                LogUtil.a("Suggestion_VipPreview", "clickPlayArea mSmallViewFrameLayout mPlayState:", Integer.valueOf(i));
                this.ag.setVisibility(0);
                this.w = true;
                this.v.removeCallbacks(this.aw);
                this.v.postDelayed(this.aw, 7000L);
                return;
            }
            LogUtil.d("Suggestion_VipPreview", "onclick mSmallViewFrameLayout else");
            return;
        }
        LogUtil.d("Suggestion_VipPreview", "clickPlayArea mFullViewFrameLayout");
        int i2 = this.l;
        if (i2 == 1 || i2 == 2) {
            LogUtil.a("Suggestion_VipPreview", "clickPlayArea mFullViewFrameLayout mFullPlayState:", Integer.valueOf(i2));
            this.i.setVisibility(0);
            this.t.setVisibility(0);
            this.d.setVisibility(0);
            this.x = true;
            this.v.removeCallbacks(this.aw);
            this.v.postDelayed(this.aw, 7000L);
            return;
        }
        if (i2 == 0) {
            this.t.setVisibility(0);
            this.d.setVisibility(0);
            this.x = true;
            this.v.removeCallbacks(this.aw);
            this.v.postDelayed(this.aw, 7000L);
            return;
        }
        LogUtil.d("Suggestion_VipPreview", "onclick mFullViewFrameLayout else");
    }

    public void j() {
        if (TextUtils.isEmpty(this.ax)) {
            return;
        }
        LogUtil.d("Suggestion_VipPreview", "switchBackToSmallScreenPlayer");
        ag();
        int i = this.l;
        if (i == 1) {
            LogUtil.d("Suggestion_VipPreview", "switchBackToSmallScreenPlayer mFullPlayState STATE_PLAYING");
            this.ay.e(this.f);
            this.af = 1;
            this.ah.setVisibility(8);
            this.ad.setVisibility(0);
        } else if (i == 2) {
            LogUtil.d("Suggestion_VipPreview", "switchBackToSmallScreenPlayer mFullPlayState STATE_PAUSE");
            this.ay.d(false);
            this.af = 2;
            this.ah.setVisibility(0);
            this.ad.setVisibility(8);
        } else {
            this.af = 0;
            LogUtil.d("Suggestion_VipPreview", "switchBackToSmallScreenPlayer else");
        }
        this.ay.c(this.f);
    }

    private void af() {
        this.ak.setVisibility(0);
        this.ae.setVisibility(8);
        this.f36749a.setVisibility(8);
        this.aq.setVisibility(8);
        this.aj.setVisibility(8);
        this.bc.setVisibility(0);
        c(false);
        LogUtil.d("Suggestion_VipPreview", "smallScreenSetVisibility");
    }

    private void ag() {
        LogUtil.d("Suggestion_VipPreview", "switchSmallScreenDisplay");
        this.ac = false;
        LogUtil.a("Suggestion_VipPreview", "switchSmallScreenDisplay mPlaybackPosition:", Integer.valueOf(this.f));
        this.as.setProgress(this.f);
        this.at.setText(new SimpleDateFormat("mm:ss").format(Integer.valueOf(this.an - this.f)));
        af();
        m();
    }

    private void ah() {
        LogUtil.d("Suggestion_VipPreview", "switchFullScreenDisplay");
        this.ac = true;
        this.k.setProgress(this.f);
        this.q.setText(new SimpleDateFormat("mm:ss").format(Integer.valueOf(this.an - this.f)));
        o();
        r();
    }

    private void ai() {
        if (TextUtils.isEmpty(this.ax)) {
            return;
        }
        ah();
        int i = this.af;
        if (i == 1) {
            LogUtil.d("Suggestion_VipPreview", "switchFullScreenPlayer mPlayState STATE_PLAYING");
            this.ay.e(this.f);
            this.l = 1;
            this.n.setVisibility(8);
            this.m.setVisibility(0);
        } else if (i == 2) {
            LogUtil.d("Suggestion_VipPreview", "switchFullScreenPlayer STATE_PAUSE");
            this.ay.d(false);
            this.l = 2;
            this.aa.setVisibility(8);
            this.y.setVisibility(8);
            this.n.setVisibility(0);
            this.m.setVisibility(8);
        } else {
            this.l = 0;
            LogUtil.d("Suggestion_VipPreview", "switchFullScreenPlayer else");
        }
        this.ay.c(this.f);
    }

    public boolean a() {
        return this.ac;
    }

    private void aj() {
        hkb.b(this.e, this.bd);
    }

    public void e(ScreenController screenController) {
        this.au = screenController;
    }

    public void c(VipViewShowProvider vipViewShowProvider) {
        this.ba = vipViewShowProvider;
    }

    public void f() {
        LogUtil.d("Suggestion_VipPreview", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        l();
    }

    public void b() {
        int i = this.l;
        if (i == 1 || i == 2) {
            j();
        } else {
            l();
        }
    }

    public void b(ViewVideoPlayListener viewVideoPlayListener) {
        this.bb = viewVideoPlayListener;
    }

    public void g() {
        LogUtil.a("Suggestion_VipPreview", "stopVideoPlay");
        l();
    }

    public void d() {
        LogUtil.a("Suggestion_VipPreview", "destroy.");
        VideoPlayer videoPlayer = this.ay;
        if (videoPlayer != null) {
            videoPlayer.c();
        }
        Handler handler = this.v;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        n();
        iei.a(this.g, this.f / 1000, this.an / 1000, 0);
    }

    public void h() {
        z();
        l();
        this.f36750b.setText(gzx.c(this.e, R.string.sug_start_train, new Object[0]));
    }

    private void z() {
        this.f = 0;
        this.ac = false;
        this.ay.c(0);
    }

    public void i() {
        hld hldVarE = e();
        LogUtil.a("Suggestion_VipPreview", "updateVipOrPayView vip:", Boolean.valueOf(hldVarE.i()), "isBuy:", Boolean.valueOf(hldVarE.b()), "commodityFlag:", Integer.valueOf(hldVarE.d()));
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: hht
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36747c.i();
                }
            });
            return;
        }
        if (this.ap == null) {
            LogUtil.j("Suggestion_VipPreview", "updateVipOrPayView mPreviewStatusHelper == null");
            return;
        }
        if (hldVarE.f()) {
            this.f36750b.setText(gzx.c(this.e, R.string.sug_start_train, new Object[0]));
            return;
        }
        if (hldVarE.n()) {
            this.ap.openVipView();
            return;
        }
        if (hldVarE.l()) {
            this.ap.payCourseHasVipPriceNotOpenVip();
        } else if (hldVarE.m()) {
            this.ap.payCourseHasVipPriceByOpenVip();
        } else if (hldVarE.o()) {
            this.ap.payCourseNotVipPriceView();
        }
    }

    public void b(int i) {
        iei.a(this.g, this.f, this.an / 1000, i);
    }
}
