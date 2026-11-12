package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.overlay.OverlayTemplate;
import com.huawei.health.marketing.datatype.overlay.SpEffect;
import com.huawei.health.marketing.datatype.overlay.SpEffectButton;
import com.huawei.health.marketing.datatype.overlay.SpEffectFile;
import com.huawei.health.servicesui.R;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes29.dex */
public class gbo extends BaseDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResourceBriefInfo f34867a;
    private HealthImageView aa;
    private SpEffect ab;
    private FrameLayout ac;
    private SocialShareCenterApi ad;
    private final d ae;
    private OverlayTemplate af;
    private HealthTextView ag;
    private ImageView ah;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioAttributes f34868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f34869c;
    private AudioManager d;
    private ConcurrentHashMap<SpEffectButton, Drawable> e;
    private HealthImageView f;
    private ImageView g;
    private Context h;
    private HealthImageView i;
    private HealthImageView j;
    private AudioFocusRequest k;
    private volatile boolean l;
    private ImageView m;
    private AudioManager.OnAudioFocusChangeListener n;
    private ExoPlayer o;
    private long p;
    private boolean q;
    private FrameLayout r;
    private ImageView s;
    private LottieAnimationView t;
    private SpEffectButton u;
    private ImageView v;
    private int w;
    private PlayerView x;
    private Drawable y;
    private LinearLayout z;

    public gbo(Context context, SpEffect spEffect) {
        super(context, R.style.DialogTransparentFullScreen, 0);
        this.w = 0;
        this.ae = new d(this);
        this.e = new ConcurrentHashMap<>(16);
        this.h = context;
        this.ab = spEffect;
    }

    public void b(int i, ResourceBriefInfo resourceBriefInfo, OverlayTemplate overlayTemplate) {
        ReleaseLogUtil.c("R_OverlayAnimateDialog", "fillView");
        this.f34867a = resourceBriefInfo;
        this.w = i;
        this.af = overlayTemplate;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.marketing_overlay_dialog, (ViewGroup) null);
        setContentView(viewInflate);
        this.r = (FrameLayout) viewInflate.findViewById(R.id.overlay_root_layout);
        this.x = (PlayerView) viewInflate.findViewById(R.id.player_view);
        this.s = (ImageView) viewInflate.findViewById(R.id.last_frame_mask);
        this.t = (LottieAnimationView) viewInflate.findViewById(R.id.lottie_view);
        this.f34869c = (LinearLayout) viewInflate.findViewById(R.id.bottom_btn_layout);
        this.j = (HealthImageView) viewInflate.findViewById(R.id.button_one);
        this.i = (HealthImageView) viewInflate.findViewById(R.id.button_two);
        this.f = (HealthImageView) viewInflate.findViewById(R.id.button_three);
        this.g = (ImageView) viewInflate.findViewById(R.id.overlay_dialog_close_btn);
        this.v = (ImageView) viewInflate.findViewById(R.id.overlay_dialog_share_btn);
        this.ac = (FrameLayout) viewInflate.findViewById(R.id.overlay_share_layout);
        this.aa = (HealthImageView) viewInflate.findViewById(R.id.share_image);
        this.z = (LinearLayout) viewInflate.findViewById(R.id.share_user_info_layout);
        this.m = (ImageView) viewInflate.findViewById(R.id.head_imageview);
        this.ag = (HealthTextView) viewInflate.findViewById(R.id.name_textview);
        this.ah = (ImageView) viewInflate.findViewById(R.id.vip_image);
        this.g.setOnClickListener(this);
        this.v.setOnClickListener(this);
        Object systemService = BaseApplication.getContext().getSystemService("audio");
        this.d = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        this.n = new b(this);
    }

    private void c(int i, String str, SpEffectButton spEffectButton, int i2) {
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i));
        if (i == 2) {
            map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        }
        if (this.ac.getVisibility() == 0) {
            map.put("resourceType", "share_paintball");
            map.put("moduleName", "share_page");
        } else {
            SpEffect spEffect = this.ab;
            if (spEffect != null) {
                if (njy.b(spEffect.getButtonList())) {
                    map.put("resourceType", this.ab.getButtonList().size() > 1 ? "multiple_choice_paintball" : "single_choice_paintball");
                }
                map.put("moduleName", this.ab.getSpEffectName());
            }
        }
        if (spEffectButton != null) {
            String strE = fxl.e(spEffectButton.getRecommendList(), spEffectButton.getResourceId());
            if (!TextUtils.isEmpty(strE)) {
                map.put("smartRecommend", true);
                map.put("algId", strE);
            } else {
                map.put("smartRecommend", false);
                map.put("algId", "");
            }
        }
        if (i2 != -1) {
            map.put("value", Integer.valueOf(i2 + 1));
        }
        fxq.e(map);
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        lrd.c(this.ae);
        c(this.ab, "MP4");
        h();
        super.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ExoPlayer exoPlayer = this.o;
        if (exoPlayer != null) {
            exoPlayer.stop();
            PlayerView playerView = this.x;
            if (playerView != null) {
                playerView.setPlayer(null);
                this.x.setVisibility(8);
            }
            this.o.release();
            this.o = null;
        }
        LottieAnimationView lottieAnimationView = this.t;
        if (lottieAnimationView != null) {
            lottieAnimationView.b();
            this.t.clearAnimation();
        }
        b();
        j();
        lrd.b(this.ae);
        c();
        super.dismiss();
    }

    private void c() {
        this.e.clear();
        ResourceBriefInfo resourceBriefInfo = this.f34867a;
        if (resourceBriefInfo == null || resourceBriefInfo.getMarketingRule() == null) {
            LogUtil.j("OverlayAnimateDialog", "mBriefInfo is null or no rule");
        } else if (this.f34867a.getMarketingRule().getTriggerCycle() == null) {
            LogUtil.j("OverlayAnimateDialog", "cycleRuleBase is null");
        } else {
            da.d(BaseApplication.getContext());
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    private boolean m() {
        boolean z;
        if (this.d != null) {
            if (this.k == null && this.f34868b == null) {
                this.f34868b = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
            }
            AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(this.f34868b).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(this.n).build();
            this.k = audioFocusRequestBuild;
            z = this.d.requestAudioFocus(audioFocusRequestBuild) == 1;
        }
        LogUtil.a("OverlayAnimateDialog", "requestAudioFocus isFocus=", Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        AudioManager audioManager;
        AudioFocusRequest audioFocusRequest = this.k;
        if (audioFocusRequest != null && (audioManager = this.d) != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
            LogUtil.a("OverlayAnimateDialog", "abandonAudioFocus");
        } else {
            LogUtil.a("OverlayAnimateDialog", "no need abandonAudioFocus");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(SpEffect spEffect, String str) {
        if (spEffect == null) {
            ReleaseLogUtil.d("R_OverlayAnimateDialog", "loadAnimateResource, spEffect is null");
            return;
        }
        this.ab = spEffect;
        ReleaseLogUtil.c("R_OverlayAnimateDialog", "loadAnimateResource,  spEffect id:", spEffect.getSpEffectId());
        List<SpEffectFile> spEffectFileList = spEffect.getSpEffectFileList();
        if (njy.e(spEffectFileList)) {
            ReleaseLogUtil.d("R_OverlayAnimateDialog", "loadAnimateResource, spEffectFiles is null");
            return;
        }
        boolean zAf = qrs.af(this.h);
        SpEffectFile spEffectFile = null;
        SpEffectFile spEffectFile2 = null;
        for (SpEffectFile spEffectFile3 : spEffectFileList) {
            if (spEffectFile3 != null) {
                if (zAf && spEffectFile3.getResolution() == 1) {
                    if (!str.equals(spEffectFile3.getType())) {
                        spEffectFile2 = spEffectFile3;
                        if (!zAf) {
                            continue;
                        }
                    }
                    spEffectFile = spEffectFile3;
                    break;
                }
                if (!zAf && spEffectFile3.getResolution() == 0) {
                    if (str.equals(spEffectFile3.getType())) {
                        spEffectFile = spEffectFile3;
                        break;
                    }
                    spEffectFile2 = spEffectFile3;
                }
            }
        }
        if (spEffectFile == null && spEffectFile2 != null) {
            spEffectFile = spEffectFile2;
        } else if (spEffectFile == null) {
            spEffectFile = spEffectFileList.get(0);
        }
        d(spEffectFile);
    }

    private void d(SpEffectFile spEffectFile) {
        if (spEffectFile == null) {
            ReleaseLogUtil.d("R_OverlayAnimateDialog", "startPlay, effectFile is null");
            return;
        }
        LogUtil.a("OverlayAnimateDialog", "startPlay, effectFile:", spEffectFile.toString());
        if (TextUtils.equals(spEffectFile.getType(), "MP4")) {
            e(spEffectFile.getFileUrl());
        } else if (TextUtils.equals(spEffectFile.getType(), "lottie")) {
            d(spEffectFile.getFileUrl());
        } else {
            LogUtil.j("OverlayAnimateDialog", "startPlay, error effectFile type = ", spEffectFile.getType());
        }
        c(1, "", null, -1);
        Window window = getWindow();
        if (window == null) {
            ReleaseLogUtil.d("R_OverlayAnimateDialog", "window is null");
        } else {
            window.setBackgroundDrawableResource(R.color.common_transparent);
        }
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("R_OverlayAnimateDialog", "playMP4 playUrl is empty");
            return;
        }
        ReleaseLogUtil.c("R_OverlayAnimateDialog", "playMP4");
        this.t.setVisibility(8);
        if (this.o == null) {
            ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(this.h).build();
            this.o = exoPlayerBuild;
            this.x.setPlayer(exoPlayerBuild);
        }
        this.x.setResizeMode(4);
        this.o.setMediaItem(MediaItem.fromUri(str));
        this.o.prepare();
        this.o.addListener(new Player.Listener() { // from class: gbo.3
            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException playbackException) {
                super.onPlayerError(playbackException);
                if (!gbo.this.q) {
                    gbo gboVar = gbo.this;
                    gboVar.c(gboVar.ab, "lottie");
                }
                gbo.this.q = true;
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlaybackStateChanged(int i) {
                LogUtil.a("OverlayAnimateDialog", "onPlaybackStateChanged playbackState:", Integer.valueOf(i));
                if (i == 3) {
                    gbo.this.q();
                    super.onPlaybackStateChanged(i);
                } else if (i == 4) {
                    gbo.this.x.setKeepContentOnPlayerReset(true);
                    gbo.this.n();
                    gbo.this.l();
                }
            }
        });
        m();
        this.o.seekBack();
        this.o.play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        new Handler().postDelayed(new Runnable() { // from class: gby
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a();
            }
        }, 100L);
    }

    /* synthetic */ void a() {
        this.s.setVisibility(8);
        this.x.setVisibility(0);
    }

    private void d(final String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("R_OverlayAnimateDialog", "playLottie playUrl is empty");
            return;
        }
        ReleaseLogUtil.c("R_OverlayAnimateDialog", "playLottie");
        this.x.setVisibility(8);
        this.s.setVisibility(8);
        this.t.setVisibility(0);
        LogUtil.a("OverlayAnimateDialog", "playLottie playUrl : ", str);
        this.t.setFailureListener(new LottieListener() { // from class: gbw
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                this.f34878b.a((Throwable) obj);
            }
        });
        try {
            da.c(this.h, str).b(new LottieListener() { // from class: gbv
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    this.e.d(str, (cx) obj);
                }
            });
            this.t.b(new Animator.AnimatorListener() { // from class: gbo.5
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    LogUtil.a("OverlayAnimateDialog", "playLottie onAnimationStart");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    LogUtil.a("OverlayAnimateDialog", "playLottie onAnimationEnd");
                    gbo.this.l();
                }
            });
        } catch (Exception e) {
            LogUtil.e("OverlayAnimateDialog", "playLottie exception:", ExceptionUtils.c(e));
            dismiss();
        }
    }

    /* synthetic */ void a(Throwable th) {
        ReleaseLogUtil.b("R_OverlayAnimateDialog", " play lottie fail:", ExceptionUtils.c(th));
        dismiss();
    }

    /* synthetic */ void d(String str, cx cxVar) {
        if (cxVar != null) {
            LogUtil.a("OverlayAnimateDialog", "playLottie composition loaded");
            this.t.setComposition(cxVar);
            this.t.c();
        } else {
            LogUtil.a("OverlayAnimateDialog", "playLottie composition not loaded");
            this.t.setAnimationFromUrl(str);
            this.t.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        View videoSurfaceView = this.x.getVideoSurfaceView();
        if (videoSurfaceView instanceof TextureView) {
            this.s.setImageBitmap(((TextureView) videoSurfaceView).getBitmap());
        }
    }

    private void h() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: gbp
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d();
            }
        });
    }

    /* synthetic */ void d() {
        this.l = false;
        int size = this.ab.getButtonList().size();
        LogUtil.a("OverlayAnimateDialog", "load button count=", Integer.valueOf(size));
        for (int i = 0; i < size; i++) {
            SpEffectButton spEffectButton = this.ab.getButtonList().get(i);
            if (spEffectButton == null) {
                LogUtil.j("OverlayAnimateDialog", "load button spEffectButton is null, i= ", Integer.valueOf(i));
            } else if (this.e.get(spEffectButton) != null) {
                LogUtil.j("OverlayAnimateDialog", "button drawable has loaded");
            } else {
                if (spEffectButton.getInteractiveEffect() == 2) {
                    fxq.d(fxq.b(spEffectButton.getSpEffectId(), this.af.getSpEffectMap()), (ResponseCallback<Boolean>) new ResponseCallback() { // from class: gbt
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i2, Object obj) {
                            this.d.d(i2, (Boolean) obj);
                        }
                    });
                }
                LogUtil.a("OverlayAnimateDialog", "load button drawable i= ", Integer.valueOf(i), ", url=", spEffectButton.getButtonPicUrl());
                Drawable drawableB = qqf.b(this.h, spEffectButton.getButtonPicUrl());
                if (drawableB == null) {
                    ReleaseLogUtil.d("R_OverlayAnimateDialog", "button drawable is null, i=", Integer.valueOf(i));
                } else {
                    this.e.put(spEffectButton, drawableB);
                }
            }
        }
    }

    /* synthetic */ void d(int i, Boolean bool) {
        this.l = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f34869c.getVisibility() == 0) {
            LogUtil.a("OverlayAnimateDialog", "button has showed");
            return;
        }
        for (int i = 0; i < this.ab.getButtonList().size(); i++) {
            SpEffectButton spEffectButton = this.ab.getButtonList().get(i);
            if (spEffectButton != null) {
                ReleaseLogUtil.c("R_OverlayAnimateDialog", "showButton i = ", Integer.valueOf(i));
                if (i == 0) {
                    e(this.j, spEffectButton, i);
                } else if (i == 1) {
                    e(this.i, spEffectButton, i);
                } else if (i == 2) {
                    e(this.f, spEffectButton, i);
                }
            }
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        this.f34869c.startAnimation(alphaAnimation);
        this.f34869c.setVisibility(0);
    }

    private void j() {
        this.x.setVisibility(8);
        this.t.setVisibility(8);
        this.ac.setVisibility(8);
        this.s.setVisibility(8);
        f();
        this.e.clear();
    }

    private void f() {
        this.f34869c.setVisibility(8);
        this.j.setVisibility(8);
        this.i.setVisibility(8);
        this.f.setVisibility(8);
        this.v.setVisibility(8);
    }

    private void e(HealthImageView healthImageView, final SpEffectButton spEffectButton, final int i) {
        if (healthImageView == null || spEffectButton == null) {
            LogUtil.j("OverlayAnimateDialog", "loadButtonBgImg button is null");
            return;
        }
        healthImageView.setVisibility(0);
        d(healthImageView);
        Drawable drawable = this.e.get(spEffectButton);
        if (drawable != null) {
            healthImageView.setImageDrawable(drawable);
        } else {
            b(healthImageView, spEffectButton.getButtonPicUrl());
        }
        healthImageView.setOnClickListener(new View.OnClickListener() { // from class: gbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34874a.e(spEffectButton, i, view);
            }
        });
    }

    /* synthetic */ void e(SpEffectButton spEffectButton, int i, View view) {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            LogUtil.j("OverlayAnimateDialog", "button click network not connected");
            qpx.e(this.h, R.string.IDS_network_connect_error);
            return;
        }
        LogUtil.a("OverlayAnimateDialog", "loadButtonBgImg button type is ：", Integer.valueOf(spEffectButton.getInteractiveEffect()));
        if (spEffectButton.getInteractiveEffect() == 0) {
            fxq.d(spEffectButton.getPageLink(), this.w, this.f34867a);
            dismiss();
            c(2, "e2", spEffectButton, i);
            return;
        }
        if (spEffectButton.getInteractiveEffect() == 1) {
            a(spEffectButton, i);
            return;
        }
        if (spEffectButton.getInteractiveEffect() != 2) {
            LogUtil.a("OverlayAnimateDialog", "loadButtonBgImg error type");
            return;
        }
        if (!this.l) {
            LogUtil.j("OverlayAnimateDialog", "lottie file has loading");
            qpx.e(this.h, R.string.IDS_marketing_video_loading);
            return;
        }
        f();
        this.q = false;
        c(fxq.b(spEffectButton.getSpEffectId(), this.af.getSpEffectMap()), "MP4");
        h();
        c(2, "e2", spEffectButton, i);
    }

    private void b(final HealthImageView healthImageView, final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: gbm
            @Override // java.lang.Runnable
            public final void run() {
                this.f34865b.d(str, healthImageView);
            }
        });
    }

    /* synthetic */ void d(String str, final HealthImageView healthImageView) {
        final Drawable drawableB = qqf.b(this.h, str);
        HandlerExecutor.c(new Runnable() { // from class: gbs
            @Override // java.lang.Runnable
            public final void run() {
                gbo.d(drawableB, healthImageView);
            }
        });
    }

    static /* synthetic */ void d(Drawable drawable, HealthImageView healthImageView) {
        if (drawable == null) {
            ReleaseLogUtil.d("R_OverlayAnimateDialog", "button drawable is null");
            healthImageView.setVisibility(8);
        } else {
            healthImageView.setImageDrawable(drawable);
        }
    }

    private void d(HealthImageView healthImageView) {
        if (qrs.af(getContext())) {
            healthImageView.setMaxWidth(qre.b(R.dimen.health_common_448dp));
        } else {
            healthImageView.setMaxWidth(qre.b(R.dimen.health_common_328dp));
        }
    }

    private void a(SpEffectButton spEffectButton, int i) {
        ReleaseLogUtil.c("R_OverlayAnimateDialog", "showSharePage");
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: gbx
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    LogUtil.a("OverlayAnimateDialog", "errorCode = ", Integer.valueOf(i2));
                }
            }, "");
            return;
        }
        f();
        this.u = spEffectButton;
        c(spEffectButton.getSharePicUrl());
        i();
        c(2, "e3", spEffectButton, i);
    }

    private void i() {
        LogUtil.a("OverlayAnimateDialog", "initUserInfo");
        if (this.ad == null) {
            this.ad = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);
        }
        if (!this.ad.isShowUserInfo()) {
            this.z.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(this.ag.getText())) {
            this.z.setVisibility(0);
            return;
        }
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        String shareNickName = this.ad.getShareNickName();
        this.ag.setText(shareNickName);
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        String picPath = userInfo != null ? userInfo.getPicPath() : null;
        if (!TextUtils.isEmpty(picPath)) {
            Bitmap bitmapA = qqf.a(this.h, picPath);
            if (bitmapA != null) {
                this.m.setImageBitmap(bitmapA);
            } else {
                LogUtil.j("OverlayAnimateDialog", "initUserInfo() bmp == null ");
            }
        } else {
            LogUtil.j("OverlayAnimateDialog", "initUserInfo()! headImgPath is null! ");
        }
        if (Utils.o() && TextUtils.isEmpty(shareNickName)) {
            this.m.setVisibility(8);
        }
        this.z.setVisibility(0);
        this.ah.setVisibility(irz.i() ? 0 : 8);
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog
    public void dialogPause() {
        super.dialogPause();
        LogUtil.a("OverlayAnimateDialog", "dialogPause");
        if (this.o != null && this.x.getVisibility() == 0 && this.o.getPlaybackState() == 4) {
            LogUtil.a("OverlayAnimateDialog", "dialogPause, playbackState=STATE_ENDED");
            this.s.setVisibility(0);
            this.x.setVisibility(8);
        } else if (o()) {
            b();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog
    public void dialogResume() {
        super.dialogResume();
        LogUtil.a("OverlayAnimateDialog", "dialogResume");
        if (k()) {
            m();
        }
        if (this.ac.getVisibility() == 0) {
            i();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog
    public void configDialog() {
        super.configDialog();
        LogUtil.a("OverlayAnimateDialog", "configDialog");
        if (this.ac.getVisibility() == 0) {
            d(this.y);
        }
        if (this.t.getVisibility() == 0) {
            c(this.ab, "lottie");
        } else if (this.x.getVisibility() == 0 || this.s.getVisibility() == 0) {
            c(this.ab, "MP4");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        if (this.o == null || this.x.getVisibility() != 0) {
            return false;
        }
        LogUtil.a("OverlayAnimateDialog", "playerStart");
        this.o.seekTo(this.p);
        this.o.play();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        if (this.o == null || this.x.getVisibility() != 0) {
            return false;
        }
        LogUtil.a("OverlayAnimateDialog", "playerPause");
        this.o.pause();
        this.p = this.o.getCurrentPosition();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.e(view)) {
            return;
        }
        int id = view.getId();
        LogUtil.a("OverlayAnimateDialog", "viewId：", Integer.valueOf(id));
        if (id == R.id.overlay_dialog_close_btn) {
            c(4, "", null, -1);
            dismiss();
            e();
        } else if (id == R.id.overlay_dialog_share_btn) {
            HashMap map = new HashMap(1);
            map.put("event", 1);
            map.put("name", this.ab.getSpEffectName());
            Bitmap bitmapE = lsv.e(this.ac);
            if (bitmapE != null) {
                e(this.h, bitmapE, AnalyticsValue.MARKETING_OVERLAY_H1000006.value(), map);
            }
            c(2, "e4", this.u, -1);
        }
    }

    private void e(Context context, Bitmap bitmap, String str, Map<String, Object> map) {
        gxt gxtVar = new gxt(1);
        gxtVar.e((String) null);
        gxtVar.b((String) null);
        gxtVar.d(bitmap);
        gxtVar.f((String) null);
        gxtVar.d(str);
        gxtVar.f(true);
        gxtVar.a(1);
        gxtVar.e(false);
        if (map != null) {
            gxtVar.c(map);
        }
        if (this.ad == null) {
            this.ad = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);
        }
        this.ad.exeShare(gxtVar, context);
    }

    private void e() {
        this.f34867a = null;
        this.af = null;
    }

    public void c(final String str) {
        LogUtil.a("OverlayAnimateDialog", "loadShareImg start");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("OverlayAnimateDialog", "loadShareImg imgUrl is empty");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: gbq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34873a.b(str);
                }
            });
            LogUtil.a("OverlayAnimateDialog", "loadShareImg end");
        }
    }

    /* synthetic */ void b(String str) {
        if (g()) {
            LogUtil.j("OverlayAnimateDialog", "loadShareImg activity is destroyed");
            return;
        }
        final Drawable drawableB = qqf.b(BaseApplication.getContext(), str);
        LogUtil.a("OverlayAnimateDialog", "loadShareImg drawable is null ? ", Boolean.valueOf(drawableB == null));
        d(drawableB);
        HandlerExecutor.b(new Runnable() { // from class: gbu
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e(drawableB);
            }
        });
    }

    private void d(Drawable drawable) {
        int i;
        int iMin;
        if (g() || drawable == null) {
            LogUtil.j("OverlayAnimateDialog", "getImageSize is destroy or drawable is null");
            return;
        }
        LogUtil.a("OverlayAnimateDialog", "getImageSize");
        this.y = drawable;
        int i2 = qrs.i(getContext());
        int iG = qrs.g(getContext());
        LogUtil.a("OverlayAnimateDialog", "getImageSize windowWidth=", Integer.valueOf(i2), " windowHeight=", Integer.valueOf(iG));
        ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
        layoutParams.height = iG;
        layoutParams.width = i2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        LogUtil.a("OverlayAnimateDialog", "getImageSize drawableW=", Integer.valueOf(intrinsicWidth), " drawableH=", Integer.valueOf(intrinsicHeight));
        int iB = iG - qre.b(com.huawei.ui.commonui.R.dimen.health_common_44dp);
        if (qrs.af(getContext())) {
            int iS = qrs.s(getContext());
            LogUtil.a("OverlayAnimateDialog", "getImageSize statusBarHeight = ", Integer.valueOf(iS));
            iB -= iS;
        }
        int iQ = qrs.ad(getContext()) ? qrs.q(getContext()) : 0;
        LogUtil.a("OverlayAnimateDialog", "getImageSize navigationBarHeight = ", Integer.valueOf(iQ));
        int i3 = iB - iQ;
        int iB2 = i2 - qre.b(com.huawei.ui.commonui.R.dimen.health_common_24dp);
        if (iB2 * intrinsicHeight >= i3 * intrinsicWidth) {
            iMin = (int) (Math.min(qrs.d(getContext(), intrinsicHeight), i3) * 0.85f);
            i = (intrinsicWidth * iMin) / intrinsicHeight;
        } else {
            int iMin2 = (int) (Math.min(qrs.d(getContext(), intrinsicWidth), iB2) * 0.85f);
            int i4 = (intrinsicHeight * iMin2) / intrinsicWidth;
            i = iMin2;
            iMin = i4;
        }
        LogUtil.a("OverlayAnimateDialog", "getImageSize imgWidth=", Integer.valueOf(i), " imgHeight=", Integer.valueOf(iMin));
        ViewGroup.LayoutParams layoutParams2 = this.aa.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = iMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void e(Drawable drawable) {
        if (drawable == null) {
            LogUtil.j("OverlayAnimateDialog", "showShareLayout drawable is null");
            return;
        }
        if (g()) {
            LogUtil.j("OverlayAnimateDialog", "showShareLayout activity is destroyed");
            return;
        }
        ReleaseLogUtil.c("R_OverlayAnimateDialog", "showShareLayout");
        this.aa.setImageDrawable(drawable);
        this.x.setVisibility(8);
        this.t.setVisibility(8);
        this.s.setVisibility(8);
        this.ac.setVisibility(0);
        this.v.setVisibility(0);
        c(1, "", null, -1);
        Window window = getWindow();
        if (window == null) {
            ReleaseLogUtil.d("R_OverlayAnimateDialog", "window is null");
        } else {
            window.setBackgroundDrawableResource(R.color.common_black_80alpha);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        Context context = this.h;
        if (context == null) {
            return true;
        }
        if (context instanceof Activity) {
            return ((Activity) context).isFinishing() || ((Activity) this.h).isDestroyed();
        }
        return false;
    }

    static class b implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<gbo> f34871a;

        public b(gbo gboVar) {
            this.f34871a = new WeakReference<>(gboVar);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            ReleaseLogUtil.c("OverlayAnimateDialog", "audio focus changed, status: " + i);
            gbo gboVar = this.f34871a.get();
            if (gboVar == null || gboVar.g()) {
                LogUtil.j("OverlayAnimateDialog", "dialog is not alive ");
                return;
            }
            if (i == -2) {
                gboVar.o();
                return;
            }
            if (i == -1) {
                gboVar.o();
                gboVar.b();
            } else {
                if (i != 1) {
                    return;
                }
                gboVar.k();
            }
        }
    }

    static class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<gbo> f34872c;

        d(gbo gboVar) {
            this.f34872c = new WeakReference<>(gboVar);
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            gbo gboVar = this.f34872c.get();
            if (gboVar == null) {
                ReleaseLogUtil.d("OverlayAnimateDialog", "onTouchExplorationStateChanged overlayLayout is null");
                return;
            }
            LogUtil.a("OverlayAnimateDialog", "onTouchExplorationStateChanged enabled ", Boolean.valueOf(z));
            if (z) {
                gboVar.dismiss();
            }
        }
    }
}
