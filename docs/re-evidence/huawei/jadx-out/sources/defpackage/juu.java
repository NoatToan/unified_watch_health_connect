package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.transition.ChangeBounds;
import androidx.transition.Scene;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.bumptech.glide.request.target.CustomTarget;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.basesport.sportui.OnEndCountdownListener;
import com.huawei.health.group.api.GroupApi;
import com.huawei.health.group.constants.GroupActivityBo;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog;
import com.huawei.healthcloud.plugintrack.manager.inteface.ViewHolderInterface;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.CameraUtil;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackGridActivity;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity;
import com.huawei.healthcloud.plugintrack.ui.adapter.SportDataGridViewAdapter;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.healthcloud.plugintrack.ui.view.CircleProgressButton;
import com.huawei.healthcloud.plugintrack.ui.view.MusicControlLayout;
import com.huawei.healthcloud.plugintrack.ui.view.ShowDataPanelLayout;
import com.huawei.healthcloud.plugintrack.ui.view.SportingGpsView;
import com.huawei.healthcloud.plugintrack.ui.view.SportingMiniBarView;
import com.huawei.healthcloud.plugintrack.ui.view.UnlockSliderView;
import com.huawei.healthcloud.plugintrack.ui.viewholder.CountdownDialog;
import com.huawei.healthcloud.plugintrack.ui.viewholder.TrackIntervalViewHolder;
import com.huawei.healthcloud.plugintrack.ui.viewholder.TrackMainFragmentShowType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.illustration.IllustrationView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.interval.IntervalCardData;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.transition.ChangeAlphaTransition;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.zhangyue.iReader.sdk.scheme.ISchemeListener;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes10.dex */
public class juu implements ViewHolderInterface, View.OnClickListener, UnlockSliderView.SliderListener, PopViewList.PopViewClickListener {
    private View aa;
    private int ab;
    private int ac;
    private Scene ae;
    private int af;
    private int ag;
    private CustomTextAlertDialog ai;
    private SportingGpsView aj;
    private CustomTextAlertDialog am;
    private HealthColumnLinearLayout an;
    private boolean ap;
    private boolean aq;
    private View ar;
    private boolean au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private boolean bb;
    private boolean bf;
    private boolean bh;
    private boolean bi;
    private boolean bj;
    private ImageButton bk;
    private ImageView bl;
    private RelativeLayout bm;
    private View bn;
    private ImageView bo;
    private HealthTextView bp;
    private HealthTextView bq;
    private b br;
    private ImageView bs;
    private MusicControlLayout bu;
    private Context bv;
    private RelativeLayout bx;
    private View by;
    private e bz;
    private View ca;
    private SportingMiniBarView cb;
    private View cd;
    private PopupWindow cf;
    private GradientDrawable ch;
    private iwy ci;
    private int cm;
    private int co;
    private int cp;
    private int cq;
    private CustomTextAlertDialog cs;
    private Animator ct;
    private View cu;
    private Scene cv;
    private HealthProgressBar cw;
    private TrackIntervalViewHolder cx;
    private TrackMainMapActivity cy;
    private View cz;
    private SportDataGridViewAdapter d;
    private jup da;
    private HealthImageView dc;
    private HealthTextView dd;
    private HealthTextView de;
    private int df;
    private jvp di;
    private jaq dj;
    private TransitionSet dk;
    private NoTitleCustomAlertDialog dl;
    private List<SportDataGridViewAdapter.e> dm;
    private LinearLayout dn;
    private String dp;
    private ImageView f;
    private juh g;
    private AnimationDrawable h;
    private ImageView i;
    private ImageView k;
    private ImageView l;
    private Bundle m;
    private ShowDataPanelLayout q;
    private Context r;
    private RelativeLayout s;
    private Bundle u;
    private ImageButton v;
    private IntervalCardData x;
    private IntervalCardData y;
    private int z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f39082b = {R.drawable.track_ic_frame_anim_grey_bg, R.drawable.track_ic_frame_anim_grey_bg, R.drawable.track_ic_frame_anim_yellow_bg, R.drawable.track_ic_frame_anim_orange_yellow_bg, R.drawable.track_ic_frame_anim_red_bg};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f39081a = {R.drawable.track_ic_frame_anim_grey_bg, R.drawable.track_ic_frame_anim_grey_bg, R.drawable.track_ic_frame_anim_green_bg, R.drawable.track_ic_frame_anim_yellow_bg, R.drawable.track_ic_frame_anim_orange_yellow_bg, R.drawable.track_ic_frame_anim_orange_bg, R.drawable.track_ic_frame_anim_red_bg};
    private boolean e = false;
    private jvo dh = null;
    private boolean at = false;
    private CountdownDialog p = null;
    private SparseArray<TrackMainFragmentShowType> ck = new SparseArray<>(16);
    private SparseArray<TrackMainFragmentShowType> al = new SparseArray<>(16);
    private int cl = -1;
    private String cc = null;
    private int cn = 0;
    private int cj = 0;
    private float j = 17.0f;
    private ImageButton bw = null;
    private ImageButton t = null;
    private ImageButton dg = null;
    private ImageButton o = null;
    private ImageView ce = null;
    private ImageView ah = null;
    private boolean bd = false;
    private boolean ao = false;
    private int ad = 6;
    private int ak = 0;
    private HealthTextView db = null;
    private Animator.AnimatorListener cr = new Animator.AnimatorListener() { // from class: juu.5
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            juu.this.dh.s().setVisibility(4);
        }
    };
    private int cg = 0;
    private boolean ay = false;
    private boolean be = false;
    private List<ivo.d> n = new ArrayList();
    private Handler bt = new a(this);
    private boolean bg = false;
    private boolean az = false;
    private boolean bc = false;
    private boolean ba = true;
    private Pair<Boolean, Boolean> as = new Pair<>(false, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Transition.TransitionListener f39083c = new Transition.TransitionListener() { // from class: juu.29
        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            juu.this.bi = true;
            LogUtil.a("Track_TrackMainViewHolder", "onTransitionStart");
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            juu.this.bi = false;
            LogUtil.a("Track_TrackMainViewHolder", "onTransitionEnd");
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            juu.this.bi = false;
            LogUtil.a("Track_TrackMainViewHolder", "onTransitionCancel");
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            juu.this.bi = false;
            LogUtil.a("Track_TrackMainViewHolder", "onTransitionPause");
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            juu.this.bi = true;
            LogUtil.a("Track_TrackMainViewHolder", "onTransitionResume");
        }
    };
    private List<TrackMainFragmentShowType> w = new ArrayList();

    public juu(View view, TrackMainMapActivity trackMainMapActivity, Bundle bundle) {
        String str;
        this.cd = null;
        this.r = null;
        this.cy = null;
        this.m = null;
        this.br = null;
        this.ci = null;
        this.bf = false;
        if (view == null || trackMainMapActivity == null) {
            throw new RuntimeException("invalid context or view");
        }
        this.cd = view;
        this.r = BaseApplication.getContext();
        this.cy = trackMainMapActivity;
        this.aw = trackMainMapActivity.a();
        this.av = trackMainMapActivity.c();
        this.m = bundle;
        this.br = new b(this);
        int iB = jxk.b();
        Context contextE = qqs.e(this.cy, iB);
        this.bv = contextE;
        this.ax = qqs.e(contextE);
        bs();
        if (!cb()) {
            iwy iwyVarA = iwy.a(this.r.getApplicationContext());
            this.ci = iwyVarA;
            iwyVarA.ap();
        }
        this.bf = au();
        bt();
        bq();
        bv();
        dr();
        if (!cb()) {
            di();
        }
        if (UnitUtil.f() && this.dh != null) {
            ae();
        }
        if (iB == -1) {
            str = "system";
        } else if (iB == 1) {
            str = CervicalMucusRecord.Sensation.LIGHT;
        } else {
            str = "dark";
        }
        b("m0", str);
        this.bj = lrd.d();
        lrd.c(new d(this));
    }

    private boolean cb() {
        return this.aw;
    }

    public void e(boolean z) {
        this.az = z && this.cn == 259;
        ah();
    }

    public void c(boolean z) {
        this.bc = z && jpq.j(this.cn);
        ah();
    }

    public void ah() {
        this.bg = true;
    }

    static class d implements AccessibilityManager.TouchExplorationStateChangeListener {
        private final WeakReference<juu> d;

        d(juu juuVar) {
            this.d = new WeakReference<>(juuVar);
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            juu juuVar = this.d.get();
            if (juuVar == null) {
                ReleaseLogUtil.e("Track_TrackMainViewHolder", "TouchExplorationStateChangeListener onTouchExplorationStateChanged holder is null");
                return;
            }
            LogUtil.a("Track_TrackMainViewHolder", "TouchExplorationStateChangeListener onTouchExplorationStateChanged enabled ", Boolean.valueOf(z), " mIsTouchExplorationEnabled ", Boolean.valueOf(juuVar.bj));
            juuVar.bj = z;
        }
    }

    static class a extends BaseHandler<juu> {
        a(juu juuVar) {
            super(juuVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(juu juuVar, Message message) {
            if (message == null) {
                LogUtil.e("Track_TrackMainViewHolder", "MsgHandler message == null");
            }
            switch (message.what) {
                case 2:
                    if (juuVar.p != null) {
                        juuVar.p.startCountdown();
                    }
                    break;
                case 4:
                    juuVar.cy();
                    juuVar.o = (ImageButton) juuVar.cd.findViewById(R.id.track_main_page_bolt_icon);
                    LogUtil.a("Track_TrackMainViewHolder", "refreshBoltButton() mBoltDeviceInfos.size: ", Integer.valueOf(juuVar.n.size()));
                    juuVar.h(juuVar.n.size());
                    if (juuVar.o != null) {
                        juuVar.o.setOnClickListener(juuVar);
                    }
                    break;
                case 5:
                    juuVar.at();
                    break;
                case 6:
                    juuVar.aq = false;
                    break;
                case 7:
                    juuVar.db();
                    break;
                case 8:
                    juuVar.dy();
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void db() {
        this.f.setColorFilter(this.ax ? this.r.getColor(R.color.track_anim_grey_bg_color_dark) : this.r.getColor(R.color.track_anim_grey_bg_color), PorterDuff.Mode.SRC_IN);
        jxk.c(this.bv, this.i, R.drawable.track_ic_frame_anim_grey_bg);
        qsp.c(this.ca, 0);
        TrackIntervalViewHolder trackIntervalViewHolder = this.cx;
        if (trackIntervalViewHolder != null) {
            trackIntervalViewHolder.a(this.x == null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dy() {
        AnimationDrawable animationDrawable = this.h;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        TrackIntervalViewHolder trackIntervalViewHolder = this.cx;
        if (trackIntervalViewHolder != null) {
            trackIntervalViewHolder.a();
        }
    }

    public void g() {
        CustomTextAlertDialog customTextAlertDialog = this.ai;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
        }
        CustomTextAlertDialog customTextAlertDialog2 = this.am;
        if (customTextAlertDialog2 != null) {
            customTextAlertDialog2.dismiss();
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.dl;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.dl = null;
        }
    }

    private void di() {
        if (npn.c(this.r) || this.cn == 264) {
            if (!npn.b(this.r) && this.cn != 264) {
                npn.d(this.r);
            }
            if (this.p != null && d(this.cy)) {
                this.bt.sendEmptyMessageDelayed(2, 500L);
            }
            this.cy.b(true);
            return;
        }
        if (qrs.ah(this.r)) {
            LogUtil.a("Track_TrackMainViewHolder", "Pad not support showDialog");
        } else if (!npn.c(this.r)) {
            dh();
        } else {
            dk();
        }
    }

    private void dh() {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.cy).e(this.bv).b(true).a(R.string.IDS_device_replace_dialog_title_notification).b(R.string.IDS_hw_show_sport_dialog_open_gps_content).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: juu.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_TrackMainViewHolder", "showGPSSettingDialog()");
                if (!npn.a(juu.this.r)) {
                    juu.this.cy.d(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1000);
                    return;
                }
                juu.this.cy.b(true);
                if (juu.this.p == null || !juu.d(juu.this.cy)) {
                    LogUtil.j("Track_TrackMainViewHolder", "Unexpected showDialog status");
                } else {
                    juu.this.bt.sendEmptyMessageDelayed(2, 500L);
                }
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: juu.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (juu.this.p == null || !juu.d(juu.this.cy)) {
                    return;
                }
                ive.c().e(0);
                juu.this.cy.b(false);
                juu.this.cy.g();
            }
        }).b();
        this.ai = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        TrackMainMapActivity trackMainMapActivity = this.cy;
        if (trackMainMapActivity == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "showGpsDialog mTrackMainMapActivity is null");
        } else {
            if (trackMainMapActivity.isDestroyed() || this.cy.isFinishing()) {
                return;
            }
            this.ai.show();
        }
    }

    private void du() {
        CustomTextAlertDialog customTextAlertDialog = this.cs;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.show();
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.cy).e(this.bv).b(true).a(R.string.IDS_bicy_link_bt_disconnect).b(R.string.IDS_resume_bike_sporting_on_wear).a(R.string.IDS_settings_button_stop, new View.OnClickListener() { // from class: jvb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.j(view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: jva
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("Track_TrackMainViewHolder", "showStopReverseDialog() click nagtive");
            }
        }).b();
        this.cs = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        TrackMainMapActivity trackMainMapActivity = this.cy;
        if (trackMainMapActivity == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "showStopMirrorLinkDialog mTrackMainMapActivity is null");
        } else {
            if (trackMainMapActivity.isDestroyed() || this.cy.isFinishing()) {
                return;
            }
            this.cs.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        LogUtil.a("Track_TrackMainViewHolder", "showStopReverseDialog() click positive");
        this.cy.finish();
    }

    private void dk() {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.cy).e(this.bv).b(true).a(R.string.IDS_device_replace_dialog_title_notification).b(R.string.IDS_hwh_motiontrack_hms_network_alert).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: juu.24
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_TrackMainViewHolder", "showHmsDialog() click positive");
                juu.this.cy.b(true);
                if (juu.this.p == null || !juu.d(juu.this.cy)) {
                    return;
                }
                juu.this.bt.sendEmptyMessageDelayed(2, 500L);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: juu.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (juu.this.p == null || !juu.d(juu.this.cy)) {
                    return;
                }
                ive.c().e(0);
                juu.this.cy.b(false);
                juu.this.cy.g();
            }
        }).b();
        this.am = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        TrackMainMapActivity trackMainMapActivity = this.cy;
        if (trackMainMapActivity == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "showHmsDialog mTrackMainMapActivity is null");
        } else {
            if (trackMainMapActivity.isDestroyed() || this.cy.isFinishing()) {
                return;
            }
            this.am.show();
        }
    }

    public void a(int i) {
        if (i == 1000) {
            if (npn.c(this.r)) {
                if (this.p != null && d(this.cy)) {
                    this.bt.sendEmptyMessageDelayed(2, 500L);
                }
                this.cy.b(true);
                return;
            }
            this.cy.b(false);
            ive.c().e(0);
            this.cy.g();
        }
    }

    private void bq() {
        SparseArray<TrackMainFragmentShowType> configFromLocal = jtz.b().getConfigFromLocal(this.cn, this.cj);
        this.ck = configFromLocal;
        if (configFromLocal == null || configFromLocal.size() == 0) {
            this.ck = jtz.b().getDefaultConfig(this.cn);
        } else {
            this.at = true;
        }
        this.w.add(this.ck.get(0));
        this.w.add(this.ck.get(1));
        this.w.add(this.ck.get(2));
        this.w.add(this.ck.get(3));
        this.w.add(this.ck.get(4));
        this.w.add(this.ck.get(5));
        this.w.add(this.ck.get(6));
        this.al.put(0, TrackMainFragmentShowType.TOTAL_TIME);
        this.al.put(1, TrackMainFragmentShowType.TOTAL_DISTANCES);
    }

    private void bs() {
        Bundle bundle = this.m;
        if (bundle == null) {
            return;
        }
        int i = bundle.getInt("map_tracking_sport_type_sportting", 0);
        this.cn = i;
        this.bh = i == 259;
        float f = this.m.getFloat("sport_target_value_sportting", -1.0f);
        this.cl = this.m.getInt("sport_target_type_sportting", -1);
        this.cj = this.m.getInt("sport_data_source_sportting", 0);
        ap();
        int i2 = this.cl;
        if (i2 != -1) {
            this.cc = jxk.d(i2, f);
        }
    }

    private void ap() {
        if (this.cl == 4) {
            FitWorkout fitWorkout = (FitWorkout) this.m.getParcelable("runCourseDetail");
            if (fitWorkout == null) {
                LogUtil.j("Track_TrackMainViewHolder", "fitWorkout == null");
                return;
            }
            int iAcquireMeasurementType = fitWorkout.acquireMeasurementType();
            int iA = ifk.a(iAcquireMeasurementType);
            this.cl = iA;
            LogUtil.a("Track_TrackMainViewHolder", "coverCourseType courseType:", Integer.valueOf(iAcquireMeasurementType), "mSportTarget:", Integer.valueOf(iA));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ViewHolderInterface
    public void setEventListener() {
        if (this.cd == null) {
            ReleaseLogUtil.a("Track_TrackMainViewHolder", "setEventListener mRootView is null");
            return;
        }
        jvo jvoVar = this.dh;
        if (jvoVar == null) {
            ReleaseLogUtil.a("Track_TrackMainViewHolder", "setEventListener mTrackMainViewHolderBean is null");
            return;
        }
        jvoVar.b(this);
        this.dh.w().b(new CircleProgressButton.CircleProcessListener() { // from class: juu.21
            @Override // com.huawei.healthcloud.plugintrack.ui.view.CircleProgressButton.CircleProcessListener
            public void onFinished() {
                if (juu.this.da != null) {
                    juu.this.da.b(R.color.map_background);
                }
                juu.this.dz();
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.view.CircleProgressButton.CircleProcessListener
            public void onStarted() {
                iwy.a(juu.this.r).e(4);
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.view.CircleProgressButton.CircleProcessListener
            public void onCancel() {
                juu.this.dm();
                juu.this.br.sendEmptyMessageDelayed(101, 2000L);
                iwy.a(juu.this.r).e(5);
            }
        });
        dd();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ViewHolderInterface
    public jvv<juu> getViewCell() {
        return new jvv<>(this);
    }

    private void bv() {
        if (this.cd == null) {
            return;
        }
        if (qrs.ah(this.r)) {
            bg();
        } else {
            bm();
        }
        if (!bx()) {
            this.bo = (ImageView) this.cd.findViewById(R.id.track_sport_map_anim);
            this.q = (ShowDataPanelLayout) this.cd.findViewById(R.id.fragment_sportdata);
            bn();
            this.ca = this.cd.findViewById(R.id.layout_operation);
            this.by = this.cd.findViewById(R.id.pane_layout);
            this.f = (ImageView) this.cd.findViewById(R.id.pane_anim);
            this.i = (ImageView) this.cd.findViewById(R.id.pane_anim_bg);
            jxk.b(this.bv, this.f, R.drawable.track_ic_frame_anim_grey1);
            jxk.c(this.bv, this.i, R.drawable.track_ic_frame_anim_grey_bg);
            bi();
            jup jupVar = new jup(this.cd, this.cy, this.bv, this.cn, this.q);
            this.da = jupVar;
            if (jupVar.e()) {
                ReleaseLogUtil.a("Track_TrackMainViewHolder", "initMapView failed!");
                this.cy.finish();
                return;
            }
        }
        this.s = (RelativeLayout) this.cd.findViewById(R.id.track_map_anim_button_relative);
        this.k = (ImageView) this.cd.findViewById(R.id.track_map_anim_button_image);
        jvo jvoVar = new jvo(this.cd, this.cn, this.r);
        this.dh = jvoVar;
        this.g = new juh(this, jvoVar);
        this.aa = this.cd.findViewById(R.id.track_disconnect_tip);
        this.aj = (SportingGpsView) this.cd.findViewById(R.id.track_main_page_gps_view);
        this.cb = (SportingMiniBarView) this.cd.findViewById(R.id.sporting_mini_bar_view);
        n();
        az();
        am();
        ba();
        bo();
        bu();
        if (bx()) {
            bc();
        }
        bf();
        av();
        this.cy.runOnUiThread(new Runnable() { // from class: juu.30
            @Override // java.lang.Runnable
            public void run() {
                String strE = UnitUtil.e(CommonUtil.a(juu.this.r.getResources().getString(R.string.IDS_motiontrack_targetvalue_defult)), 1, 2);
                juu.this.db.setText(strE);
                if (juu.this.bx()) {
                    return;
                }
                juu.this.db.setText(strE);
            }
        });
        View viewFindViewById = this.cd.findViewById(R.id.top_round_background_layout);
        this.cu = viewFindViewById;
        jxk.c(this.bv, viewFindViewById, R.drawable.top_round_background);
        this.ar = this.cd.findViewById(R.id.layout_map_tracking);
        if (bx()) {
            jxk.c(this.bv, this.ar, R.drawable.track_sport_indoor);
        }
        bd();
        bh();
        u();
        y();
        bw();
        be();
        if (by()) {
            this.ce.setVisibility(8);
        }
    }

    private void bn() {
        ShowDataPanelLayout showDataPanelLayout = this.q;
        if (showDataPanelLayout == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "initShowDataPanelLayout mControlAnimLinearLayout is null");
            return;
        }
        showDataPanelLayout.setMainViewHolder(this);
        this.q.c(this.bv);
        int i = this.bh ? 6 : 4;
        this.ad = i;
        this.q.setMaxPanelMode(i);
        this.q.setPanelMode(this.ad);
        BaseActivity.cancelLayoutById(this.q);
        ViewGroup.LayoutParams layoutParams = this.q.getLayoutParams();
        if (layoutParams == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "initShowDataPanelLayout layoutParams is null");
        } else {
            layoutParams.height = qre.b(this.bh ? ShowDataPanelLayout.e : ShowDataPanelLayout.f11289a);
            this.q.setLayoutParams(layoutParams);
        }
    }

    private void bd() {
        if (Build.VERSION.SDK_INT <= 28) {
            return;
        }
        ImageButton imageButton = (ImageButton) this.cd.findViewById(R.id.track_main_page_sport_dark);
        this.v = imageButton;
        imageButton.setVisibility(0);
        this.v.setOnClickListener(this);
        da();
    }

    public void n() {
        SportingMiniBarView sportingMiniBarView = this.cb;
        if (sportingMiniBarView == null) {
            LogUtil.a("Track_TrackMainViewHolder", "null view");
            return;
        }
        sportingMiniBarView.d(this.bv);
        aa();
        GroupApi groupApi = (GroupApi) Services.b("FeatureGroup", GroupApi.class);
        e eVar = new e(this);
        this.bz = eVar;
        groupApi.registerLocationSharingListener(eVar);
        if (!groupApi.isSharing() || bx()) {
            return;
        }
        groupApi.setMiniBarStatus(false, null, null);
    }

    static class e extends exf {
        private final WeakReference<juu> d;

        public e(juu juuVar) {
            this.d = new WeakReference<>(juuVar);
        }

        @Override // defpackage.exf
        public void onLocationSharingChanged(String str, String str2, boolean z) {
            final juu juuVar = this.d.get();
            if (juuVar == null || juuVar.cb == null) {
                LogUtil.j("Track_TrackMainViewHolder", "holder is null");
            } else {
                HandlerExecutor.c(new Runnable() { // from class: jvq
                    @Override // java.lang.Runnable
                    public final void run() {
                        juu.e.c(juuVar);
                    }
                });
            }
        }

        static /* synthetic */ void c(juu juuVar) {
            juuVar.cb.d(juuVar.bv);
            juuVar.aa();
        }
    }

    private void j(int i) {
        AnimationDrawable animationDrawable = this.h;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        this.f.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        this.f.setImageResource(R.drawable.track_frame_anim_yellow);
        this.f.post(new Runnable() { // from class: jux
            @Override // java.lang.Runnable
            public final void run() {
                this.f39109b.cl();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cl() {
        Drawable drawable = this.f.getDrawable();
        if (!(drawable instanceof AnimationDrawable)) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "startFrameAnimation drawable ", drawable);
            return;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        this.h = animationDrawable;
        animationDrawable.start();
    }

    private void e(boolean z, int i, int i2) {
        int i3;
        LogUtil.a("Track_TrackMainViewHolder", "initPaneBackground isHeartCard:", Boolean.valueOf(z), " position:", Integer.valueOf(i), " mainColor:", Integer.valueOf(i2));
        if (z) {
            if (i < 0 || i >= f39082b.length) {
                i = 0;
            }
            i3 = f39082b[i];
        } else {
            if (i < 0 || i >= f39081a.length) {
                i = 0;
            }
            i3 = f39081a[i];
        }
        ImageView imageView = this.f;
        if (i <= 1) {
            i2 = qre.e(this.ax ? R.color.track_anim_grey_bg_color_dark : R.color.track_anim_grey_bg_color);
        }
        imageView.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
        jxk.c(this.bv, this.i, i3);
    }

    private void bi() {
        LinearLayout linearLayout = (LinearLayout) this.cd.findViewById(R.id.wholefragment);
        this.dn = linearLayout;
        this.cv = Scene.getSceneForLayout(linearLayout, R.layout.track_sport_real_time_data_layout_scene_start, this.cd.getContext());
        this.ae = Scene.getSceneForLayout(this.dn, R.layout.track_sport_real_time_data_layout_scene_end, this.cd.getContext());
        this.cv.setEnterAction(new Runnable() { // from class: jvk
            @Override // java.lang.Runnable
            public final void run() {
                this.f39114c.ci();
            }
        });
        this.cv.setExitAction(new Runnable() { // from class: jvi
            @Override // java.lang.Runnable
            public final void run() {
                LogUtil.a("Track_TrackMainViewHolder", "startScene ExitAction");
            }
        });
        this.ae.setEnterAction(new Runnable() { // from class: jvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f39115b.ch();
            }
        });
        this.ae.setExitAction(new Runnable() { // from class: jvr
            @Override // java.lang.Runnable
            public final void run() {
                LogUtil.a("Track_TrackMainViewHolder", "endScene ExitAction");
            }
        });
        TransitionSet transitionSet = new TransitionSet();
        this.dk = transitionSet;
        transitionSet.setDuration(800L);
        this.dk.addTransition(new ChangeBounds()).addTransition(new ChangeAlphaTransition());
        this.dk.addListener(this.f39083c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ci() {
        LogUtil.a("Track_TrackMainViewHolder", "startScene EnterAction");
        this.bb = false;
        bk();
        this.dh.b(true);
        this.dh.d().setAdapter((ListAdapter) this.d);
        x();
        this.bt.sendEmptyMessageDelayed(7, 800L);
        this.bt.sendEmptyMessageDelayed(8, 2800L);
        View view = this.by;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ch() {
        LogUtil.a("Track_TrackMainViewHolder", "endScene EnterAction");
        this.bb = true;
        qsp.c(this.ca, 8);
        this.dh.d().setAdapter((ListAdapter) null);
        this.dh.b(false);
        bk();
        TrackIntervalViewHolder trackIntervalViewHolder = this.cx;
        if (trackIntervalViewHolder != null) {
            trackIntervalViewHolder.d(true);
        }
        View view = this.by;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: juw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f39108b.f(view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        at();
    }

    private void bk() {
        this.dh.p();
        am();
        this.cx.d();
        b(this.y, true, true);
        b(this.x, false, true);
    }

    private void az() {
        TrackIntervalViewHolder trackIntervalViewHolder = new TrackIntervalViewHolder(this.cn, this.cd, this.q);
        this.cx = trackIntervalViewHolder;
        trackIntervalViewHolder.e(new TrackIntervalViewHolder.IntervalClickListener() { // from class: jvh
            @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.TrackIntervalViewHolder.IntervalClickListener
            public final void intervalClick(TrackMainFragmentShowType trackMainFragmentShowType) {
                this.e.c(trackMainFragmentShowType);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(TrackMainFragmentShowType trackMainFragmentShowType) {
        if (this.bb && !this.bi) {
            at();
        } else {
            b(trackMainFragmentShowType, true);
        }
    }

    private void am() {
        RelativeLayout relativeLayout = (RelativeLayout) this.cd.findViewById(R.id.track_main_page_tuba_layout);
        if (relativeLayout == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "constructMainViewHolderItem container == null");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) this.cd.findViewById(R.id.text_targetUnit);
        this.bq = healthTextView;
        jxk.e(this.bv, healthTextView, R.color.textColorSecondary);
        HealthTextView healthTextView2 = (HealthTextView) this.cd.findViewById(R.id.track_main_page_text_targetValue);
        this.db = healthTextView2;
        jxk.e(this.bv, healthTextView2, R.color.textColorTrack);
        if (LanguageUtil.aj(this.r)) {
            relativeLayout.setLayoutDirection(1);
        }
        this.di = new jvp(this.db, this.bq, relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: jve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39112b.b(view);
            }
        });
        this.dh.b(this.di);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        ReleaseLogUtil.a("Track_TrackMainViewHolder", "click main page");
        c(0, this.ck.get(0));
    }

    public void d(int i) {
        View view = this.aa;
        if (view == null) {
            return;
        }
        if (i < 0) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        ((HealthTextView) this.aa.findViewById(R.id.track_disconnect_time_tx)).setText(UnitUtil.e(Math.round(i)));
        ((HealthButton) this.aa.findViewById(R.id.track_disconnect_button)).setOnClickListener(new View.OnClickListener() { // from class: jvj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f39113a.h(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        this.cy.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bx() {
        return this.av;
    }

    private void ba() {
        if (bx()) {
            return;
        }
        ImageButton imageButton = (ImageButton) this.cd.findViewById(R.id.track_main_page_sport_camera);
        this.t = imageButton;
        imageButton.setOnClickListener(this);
        this.t.setVisibility(0);
        jxk.b(this.bv, (ImageView) this.t, R.drawable.track_ic_camera);
        jxk.c(this.bv, this.t, R.drawable.sport_button_view_bg);
    }

    public void c(gdm gdmVar) {
        if (Utils.o()) {
            return;
        }
        if (gdmVar == null) {
            LogUtil.a("Track_TrackMainViewHolder", "the hotPathDetailInfo is null");
            return;
        }
        boolean z = gdmVar.r() == 1;
        String strT = gdmVar.t();
        this.dp = strT;
        LogUtil.a("Track_TrackMainViewHolder", "isFromTwoStepsRoad = ", Boolean.valueOf(z), " mTwoStepsRoadDeeplink = ", strT);
        if (!z) {
            LogUtil.a("Track_TrackMainViewHolder", "the HotTrack is not from TwoStepsRoad");
            return;
        }
        ImageButton imageButton = (ImageButton) this.cd.findViewById(R.id.track_main_page_sport_two_steps_road);
        this.dg = imageButton;
        imageButton.setOnClickListener(this);
        this.dg.setVisibility(0);
        jxk.b(this.bv, (ImageView) this.dg, R.drawable.track_ic_two_steps_road);
        jxk.c(this.bv, this.dg, R.drawable.sport_button_view_bg);
    }

    public void y() {
        LogUtil.a("Track_TrackMainViewHolder", "refreshBoltButton() mSportType: ", Integer.valueOf(this.cn));
        lsy.a(new Runnable() { // from class: jvd
            @Override // java.lang.Runnable
            public final void run() {
                this.d.cj();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cj() {
        if (SportSupportUtil.g(this.cn) && ca()) {
            this.bt.sendEmptyMessage(4);
        }
    }

    private boolean ca() {
        List<ivo.d> listB = ivo.a().b(this.cn);
        this.n = listB;
        LogUtil.a("Track_TrackMainViewHolder", "isConnectedBolt() mBoltDeviceInfos.size: ", Integer.valueOf(listB.size()));
        return njy.b(this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cy() {
        ivo.a().b("Track_TrackMainViewHolder", new IBaseResponseCallback() { // from class: juu.26
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                List<ivo.d> listB = ivo.a().b(juu.this.cn);
                LogUtil.a("Track_TrackMainViewHolder", "registerBoltConnectionStatusListener tempBoltDevices.size: ", Integer.valueOf(listB.size()));
                juu.this.h(listB.size());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i) {
        ImageButton imageButton = this.o;
        if (imageButton == null) {
            return;
        }
        if (i == 0) {
            qsp.c((View) imageButton, 8);
            BoltCustomDialog.c().b();
            return;
        }
        if (i == 1) {
            qsp.c((View) imageButton, 0);
            jxk.b(this.bv, (ImageView) this.o, R.drawable.ic_track_bolt_on_one);
            jxk.c(this.bv, this.o, R.drawable.sport_button_view_bg);
            ah();
            return;
        }
        if (i != 2) {
            return;
        }
        qsp.c((View) imageButton, 0);
        jxk.b(this.bv, (ImageView) this.o, R.drawable.ic_track_bolt_on_two);
        jxk.c(this.bv, this.o, R.drawable.sport_button_view_bg);
        ah();
    }

    private void av() {
        this.dh.b().setClickable(true);
        this.dh.m().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: juu.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (juu.this.dh.m().getWidth() == 0) {
                    return;
                }
                juu.this.dh.m().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) juu.this.k.getLayoutParams();
                layoutParams.width = juu.this.dh.m().getWidth();
                layoutParams.height = juu.this.dh.m().getHeight();
                int[] iArr = new int[2];
                juu.this.dh.m().getLocationInWindow(iArr);
                if (LanguageUtil.ba(juu.this.r)) {
                    layoutParams.setMargins(0, iArr[1], iArr[0], 0);
                } else {
                    layoutParams.setMargins(iArr[0], iArr[1], 0, 0);
                }
                double d2 = ((double) layoutParams.width) / 2.0d;
                double d3 = ((double) iArr[0]) + d2;
                double d4 = ((double) iArr[1]) + d2;
                float fSqrt = ((int) (Math.sqrt((d3 * d3) + (d4 * d4)) / d2)) + 1;
                if (fSqrt > juu.this.j) {
                    juu.this.j = fSqrt;
                }
                juu.this.k.setLayoutParams(layoutParams);
            }
        });
    }

    private void br() {
        this.dj = new jaq(this.r, new StorageParams(1), Integer.toString(20002));
    }

    private void bo() {
        ImageView imageView = (ImageView) this.cd.findViewById(R.id.track_main_page_sport_setting);
        this.ce = imageView;
        imageView.setOnClickListener(this);
        this.ce.setVisibility(0);
        jxk.b(this.bv, this.ce, R.drawable.ic_track_setting);
        jxk.c(this.bv, this.ce, R.drawable.sport_button_view_bg);
    }

    private void bh() {
        br();
        this.bw = (ImageButton) this.cd.findViewById(R.id.track_main_page_sport_music);
        this.bu = (MusicControlLayout) this.cd.findViewById(R.id.music_content_layout);
        this.an = (HealthColumnLinearLayout) this.cd.findViewById(R.id.music_column_layout);
        this.bk = (ImageButton) this.cd.findViewById(R.id.track_main_page_btn_lock);
        de();
        this.bu.b(this.bv, false, this.cn);
        this.bu.setMusicButton(this.bw);
        ImageView cancel = this.bu.getCancel();
        this.bs = cancel;
        if (cancel != null) {
            cancel.setImageDrawable(qqf.c(qre.c(R.drawable.cancel), qre.e(this.bv, R.color.healthTintColorPrimary)));
            qsp.c((View) this.bs, 0);
            this.bs.setOnClickListener(new View.OnClickListener() { // from class: juz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f39111b.e(view);
                }
            });
        }
        w();
        if (cg()) {
            dc();
            this.bw.setOnClickListener(this);
        }
        jxk.b(this.bv, (ImageView) this.bw, R.drawable.track_ic_music);
        jxk.c(this.bv, this.bw, R.drawable.sport_button_view_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        this.an.setVisibility(8);
        this.bw.setVisibility(0);
    }

    private void de() {
        jxk.c(this.bv, this.bk, this.av ? R.drawable.sport_button_50_bg : R.drawable.sport_button_outdoor_50_bg);
        jxk.b(this.bv, (ImageView) this.bk, R.drawable.track_main_page_btn_lock_selector);
    }

    private boolean cg() {
        if (!CommonUtil.bh() || iwy.a(this.r).aq() || iwy.a(this.r).au()) {
            return false;
        }
        return jaa.e();
    }

    private void dc() {
        if (jaq.a(this.r) == 0) {
            this.cg = 0;
        } else {
            ai();
        }
    }

    private void bw() {
        LogUtil.a("Track_TrackMainViewHolder", "istahiti ", Boolean.valueOf(qrs.af(this.r)));
        c(jxk.a());
    }

    private void bf() {
        if (LanguageUtil.ba(this.r)) {
            this.dh.r().setImageResource(R.drawable.track_main_page_btn_play_selector_rtl);
        }
    }

    private void bc() {
        if (!cb() && izn.b(this.r)) {
            ImageView imageView = (ImageView) this.cd.findViewById(R.id.track_main_page_free_indoor_running);
            this.ah = imageView;
            imageView.setVisibility(0);
            jxk.c(this.bv, this.ah, R.drawable.sport_button_view_bg);
            jxk.b(this.bv, this.ah, R.drawable.ic_new_laboratory_phone);
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.cd.findViewById(R.id.layout_StopOrResume);
        this.bm = relativeLayout;
        BaseActivity.cancelLayoutById(relativeLayout);
        af();
        LogUtil.a("Track_TrackMainViewHolder", "initIndoorRunningView density ", Float.valueOf(qrs.h()));
        if (qrs.x()) {
            this.ad = 4;
        }
    }

    private void af() {
        int iM;
        if (!CommonUtil.bg() && (iM = qrs.m()) > 0) {
            int iD = qrs.d(BaseApplication.getContext(), 580.0f);
            if (((double) iM) * 0.79d < iD) {
                float fMax = Math.max((iM - iD) / (iM * 1.0f), 0.05f);
                ReleaseLogUtil.d("Track_TrackMainViewHolder", "adjustOther percent with ", Float.valueOf(fMax), " height: ", Integer.valueOf(iM), " min: ", Integer.valueOf(iD));
                Guideline guideline = (Guideline) this.cd.findViewById(R.id.guideline_30);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) guideline.getLayoutParams();
                layoutParams.guidePercent = fMax;
                guideline.setLayoutParams(layoutParams);
            }
        }
    }

    public void ab() {
        jup jupVar = this.da;
        if (jupVar != null) {
            jupVar.c();
        }
    }

    private void bg() {
        RelativeLayout relativeLayout = (RelativeLayout) this.cd.findViewById(R.id.track_main_pad_guide_bg);
        HealthTextView healthTextView = (HealthTextView) this.cd.findViewById(R.id.track_main_pad_guide_txt);
        HealthButton healthButton = (HealthButton) this.cd.findViewById(R.id.track_main_pad_guide_btn);
        IllustrationView illustrationView = (IllustrationView) this.cd.findViewById(R.id.track_main_pad_guide_img);
        illustrationView.setIllustration(R.drawable.track_pad_guide);
        illustrationView.setVisibility(0);
        illustrationView.setSubHeaderVisibility(8);
        relativeLayout.setVisibility(0);
        healthTextView.setVisibility(0);
        healthButton.setVisibility(0);
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: jvl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.cy.finish();
    }

    private void bm() {
        RelativeLayout relativeLayout = (RelativeLayout) this.cd.findViewById(R.id.track_main_page_perm_bg);
        this.bx = relativeLayout;
        if (relativeLayout == null) {
            LogUtil.j("Track_TrackMainViewHolder", "in initPermissionBackground method mPermissionBackground is null");
            return;
        }
        int i = this.cn;
        if (i == 258 || i == 264) {
            bp();
        }
        this.bx.setOnClickListener(new View.OnClickListener(this) { // from class: juu.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.j("Track_TrackMainViewHolder", " the countdown view can't click");
            }
        });
    }

    private void bp() {
        boolean z;
        String str;
        int i;
        if (this.cn == 258) {
            z = true;
            str = "SportAdSportingCountdownBgOutdoor";
            i = 16001;
        } else {
            z = false;
            str = "SportAdSportingCountdownBgIndoor";
            i = 16002;
        }
        jbq jbqVarD = iws.d(str);
        if (jbqVarD == null) {
            LogUtil.j("Track_TrackMainViewHolder", "SportAd background not valid data, isOutdoorRun: ", Boolean.valueOf(z));
            return;
        }
        String strE = jbqVarD.e();
        String strA = jbqVarD.a();
        if (!TextUtils.isEmpty(strA) && qrs.af(this.r)) {
            LogUtil.a("Track_TrackMainViewHolder", "SportAd background is big, isOutdoorRun: ", Boolean.valueOf(z));
            strE = strA;
        }
        c(z, i, strE);
    }

    private void c(final boolean z, final int i, String str) {
        qqf.a(str, new CustomTarget<Bitmap>() { // from class: juu.2
            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
            }

            @Override // com.bumptech.glide.request.target.Target
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onResourceReady(Bitmap bitmap, com.bumptech.glide.request.transition.Transition<? super Bitmap> transition) {
                Drawable drawableD = qqf.d(bitmap);
                if (drawableD != null) {
                    LogUtil.a("Track_TrackMainViewHolder", "SportAd load background success, isOutdoorRun: ", Boolean.valueOf(z));
                    juu.this.bx.setBackground(drawableD);
                    int i2 = i;
                    MarketingBiUtils.e(i2, iws.e(i2));
                }
            }

            @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
            public void onLoadFailed(Drawable drawable) {
                LogUtil.a("Track_TrackMainViewHolder", "SportAd load background onLoadFailed(), isOutdoorRun: ", Boolean.valueOf(z));
            }
        });
    }

    public void aa() {
        ShowDataPanelLayout showDataPanelLayout = this.q;
        if (showDataPanelLayout != null) {
            showDataPanelLayout.post(new Runnable() { // from class: juu.3
                @Override // java.lang.Runnable
                public void run() {
                    if (juu.this.q == null) {
                        LogUtil.j("Track_TrackMainViewHolder", "setLogoPadding mControlAnimLinearLayout is null");
                        return;
                    }
                    int iD = qrs.d(juu.this.r, 16.0f);
                    int iD2 = (juu.this.cb == null || !juu.this.cb.b()) ? 0 : qrs.d(juu.this.r, 52.0f);
                    if (juu.this.da != null) {
                        juu.this.da.a(iD, 0, 0, juu.this.q.getHeight() + iD2);
                    }
                }
            });
        }
    }

    private void ai() {
        yto.a(BaseApplication.getContext(), "huaweisport", "q3@!DF5*&$9MrhCS", "tingshu", new ISchemeListener() { // from class: juu.8
            @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
            public void onSuccess(Object obj) {
                if (obj != null) {
                    LogUtil.a("Track_TrackMainViewHolder", "checkSupportListenBook ok");
                } else {
                    LogUtil.j("Track_TrackMainViewHolder", "checkSupportListenBook  obj  is null");
                }
                juu.this.cy.runOnUiThread(new Runnable() { // from class: juu.8.2
                    @Override // java.lang.Runnable
                    public void run() {
                        juu.this.cg = 1;
                        qsp.e((ImageView) juu.this.bw, R.drawable.track_main_page_sport_listen_book);
                    }
                });
            }

            @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
            public void onError(int i, String str) {
                LogUtil.j("Track_TrackMainViewHolder", "errorMsg is", str, "errorCode is", Integer.valueOf(i));
                juu.this.cy.runOnUiThread(new Runnable() { // from class: juu.8.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (jaa.f(BaseApplication.getContext()) && CommonUtil.bh()) {
                            juu.this.cg = 0;
                        } else {
                            juu.this.bw.setVisibility(8);
                        }
                    }
                });
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z = this.ap;
        if (z || view == null) {
            LogUtil.j("Track_TrackMainViewHolder", "mIsButtonPlayingAnimation=", Boolean.valueOf(z));
            return;
        }
        if (qrs.c(700)) {
            LogUtil.j("Track_TrackMainViewHolder", "view click too fast.");
            return;
        }
        int id = view.getId();
        if (id == R.id.track_main_page_btn_pause) {
            LogUtil.a("Track_TrackMainViewHolder", "click btn_pause button");
            if (cb()) {
                ive.c().e(0);
                this.cy.d();
                return;
            } else {
                cm();
                return;
            }
        }
        if (id == R.id.track_main_page_btn_play) {
            LogUtil.a("Track_TrackMainViewHolder", "click btn_play button");
            if (cb()) {
                ive.c().e(0);
                this.cy.f();
                return;
            } else {
                if (q()) {
                    ac();
                    return;
                }
                return;
            }
        }
        if (id == R.id.track_main_page_btn_lock) {
            LogUtil.a("Track_TrackMainViewHolder", "track_main_page_btn_lock");
            m1950do();
            return;
        }
        if (id == R.id.track_main_page_sport_setting) {
            ce();
            return;
        }
        if (id == R.id.track_main_page_btn_sound) {
            if (cb()) {
                du();
                return;
            }
            LogUtil.a("Track_TrackMainViewHolder", "click voice button isMute ", Boolean.valueOf(this.e));
            iwy.a(com.huawei.haf.application.BaseApplication.b()).f(this.e);
            if (!this.e) {
                this.e = true;
                jxk.b(this.bv, (ImageView) this.dh.q(), R.drawable.track_ic_no_sound);
                return;
            } else {
                this.e = false;
                jxk.b(this.bv, (ImageView) this.dh.q(), R.drawable.track_ic_sound);
                return;
            }
        }
        if (id == R.id.track_main_page_bolt_icon) {
            BoltCustomDialog.c().b(this.cy, this.bv, this.cn, (BoltCustomDialog.OnConfirmCallBack) null, 1);
            return;
        }
        if (id == R.id.track_main_page_sport_music) {
            LogUtil.a("Track_TrackMainViewHolder", "click music or listen book button");
            co();
            return;
        }
        if (id == R.id.track_main_page_sport_camera) {
            dx();
            return;
        }
        if (id == R.id.track_main_page_sport_two_steps_road) {
            cu();
            return;
        }
        if (id == R.id.track_main_page_action_next) {
            cn();
        } else if (id == R.id.track_main_page_sport_dark) {
            if (qrs.e(1000, this.v)) {
                LogUtil.a("Track_TrackMainViewHolder", "onClick isViewFastClick mDarkModeButton ", this.v);
            } else {
                bl();
            }
        }
    }

    private void bl() {
        int i;
        int iB = jxk.b();
        if (iB != -1) {
            i = 1;
            if (iB != 1) {
                i = 0;
            }
        } else {
            i = 2;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(qre.f(R.string.IDS_page_appearance_dark));
        arrayList.add(qre.f(R.string.IDS_page_appearance_light));
        arrayList.add(qre.f(R.string.IDS_page_appearance_by_system));
        Context context = this.bv;
        new PopViewList(context, this.v, (ArrayList<String>) arrayList, qre.d(context, R.drawable.icon_ok), i).b(this);
    }

    @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
    public void setOnClick(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i == 2) {
                i2 = -1;
            }
        }
        this.bv = qqs.e(this.bv, i2);
        jxk.e(i2);
        boolean zE = qqs.e(this.bv);
        ReleaseLogUtil.d("Track_TrackMainViewHolder", "getPopViewList mode ", Integer.valueOf(i2), " isDarkMode ", Boolean.valueOf(zE), " mIsDarkMode ", Boolean.valueOf(this.ax));
        da();
        if (this.ax != zE) {
            this.ax = zE;
            cr();
        }
    }

    private void da() {
        int i;
        int iB = jxk.b();
        if (iB == -1) {
            i = R.drawable.icon_follow_system;
        } else if (iB == 1) {
            i = R.drawable.icon_sun;
        } else {
            i = R.drawable.icon_moon;
        }
        jxk.b(this.bv, (ImageView) this.v, i);
        jxk.c(this.bv, this.v, R.drawable.sport_button_view_bg);
    }

    private void cr() {
        SportingMiniBarView sportingMiniBarView = this.cb;
        if (sportingMiniBarView != null) {
            sportingMiniBarView.d(this.bv);
        }
        aa();
        jxk.b(this.bv, this.cu, R.drawable.top_round_background);
        if (bx()) {
            jxk.b(this.bv, this.ar, R.drawable.track_sport_indoor);
        }
        jxk.a(this.bv, this.db, R.color.textColorTrack);
        jxk.a(this.bv, this.bq, R.color.textColorSecondary);
        cz();
        ct();
        cs();
        cw();
        h(this.n.size());
        be();
        x();
        de();
        dd();
        MusicControlLayout musicControlLayout = this.bu;
        if (musicControlLayout != null) {
            musicControlLayout.b(this.bv, false, this.cn);
        }
        ImageView imageView = this.bs;
        if (imageView != null) {
            imageView.setImageDrawable(qqf.c(qre.c(R.drawable.cancel), qre.e(this.bv, R.color.healthTintColorPrimary)));
        }
        ShowDataPanelLayout showDataPanelLayout = this.q;
        if (showDataPanelLayout != null) {
            showDataPanelLayout.c(this.bv);
        }
        jvo jvoVar = this.dh;
        if (jvoVar != null) {
            jxk.a(this.bv, jvoVar.k(), R.color.textColorPrimary);
            jxk.a(this.bv, this.dh.f(), R.color.textColorPrimary);
            jxk.a(this.bv, this.dh.l(), R.color.textColorSecondary);
            jxk.a(this.bv, this.dh.n(), R.color.textColorSecondary);
        }
        TrackIntervalViewHolder trackIntervalViewHolder = this.cx;
        if (trackIntervalViewHolder != null) {
            trackIntervalViewHolder.c(this.ax, this.bv);
            this.cx.b(this.ax, this.bv);
        }
        jup jupVar = this.da;
        if (jupVar != null) {
            jupVar.c(this.bv);
            this.da.b(R.color.map_background);
        }
        if (this.bb || this.bi) {
            return;
        }
        jxk.d(this.bv, this.f, R.drawable.track_ic_frame_anim_grey1);
        jxk.b(this.bv, (View) this.i, R.drawable.track_ic_frame_anim_grey_bg);
    }

    private void cz() {
        jxk.b(this.bv, this.cz, R.drawable.sport_progress_view_bg);
        jxk.b(this.bv, (View) this.dc, R.drawable.track_music_next);
        jxk.a(this.bv, this.dd, R.color.textColorPrimary);
        jxk.a(this.bv, this.de, this.df);
        HealthProgressBar healthProgressBar = this.cw;
        if (healthProgressBar == null) {
            return;
        }
        healthProgressBar.setProgressDrawable(qre.d(this.bv, R.drawable.track_plan_progressbar_horizontal));
    }

    private void cw() {
        jxk.d(this.bv, this.ah, R.drawable.ic_new_laboratory_phone);
        jxk.b(this.bv, (View) this.ah, R.drawable.sport_button_view_bg);
        jxk.d(this.bv, this.bw, R.drawable.track_ic_music);
        jxk.b(this.bv, (View) this.bw, R.drawable.sport_button_view_bg);
        jxk.d(this.bv, this.t, R.drawable.track_ic_camera);
        jxk.b(this.bv, (View) this.t, R.drawable.sport_button_view_bg);
        jxk.d(this.bv, this.dg, R.drawable.track_ic_two_steps_road);
        jxk.b(this.bv, (View) this.dg, R.drawable.sport_button_view_bg);
        jxk.d(this.bv, this.ce, R.drawable.ic_track_setting);
        jxk.b(this.bv, (View) this.ce, R.drawable.sport_button_view_bg);
    }

    private void cn() {
        if (this.ci != null) {
            if (q()) {
                ac();
            }
            this.ci.r();
        }
    }

    private void co() {
        HashMap map = new HashMap(16);
        if (this.cg == 0) {
            if (cc() && this.bw.getVisibility() == 0) {
                qsp.c((View) this.bw, 8);
                qsp.c((View) this.an, 0);
                return;
            }
            b(map);
        } else {
            qrs.b("com.huawei.hwireader", com.huawei.haf.application.BaseApplication.j(), qre.f(R.string.IDS_reader_app_name), new View.OnClickListener(this) { // from class: juu.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    yto.b(new ISchemeListener(this) { // from class: juu.7.3
                        @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
                        public void onSuccess(Object obj) {
                            LogUtil.a("Track_TrackMainViewHolder", "openTingChannel is onSuccess");
                        }

                        @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
                        public void onError(int i, String str) {
                            LogUtil.a("Track_TrackMainViewHolder", "openTingChannel is onError");
                        }
                    });
                }
            });
            map.put("sportMusicType", 1);
        }
        map.put("click", 1);
        map.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, 1);
        map.put("musicType", Integer.valueOf(jaa.f(this.r) ? 1 : 0));
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.cn));
        lmf.d().c(this.r, AnalyticsValue.MOTION_TRACK_1040014.value(), map, 0);
    }

    private void cm() {
        if (t()) {
            cv();
            if (this.dh.h() != null) {
                MarketingBiUtils.c(this.dh.i(), this.dh.h(), System.currentTimeMillis());
            }
        }
    }

    private void dx() {
        PermissionUtil.PermissionType permissionType = PermissionUtil.PermissionType.CAMERA;
        if (Build.VERSION.SDK_INT <= 28) {
            permissionType = PermissionUtil.PermissionType.CAMERA_IMAGE;
        }
        PermissionUtil.d(this.cy, permissionType, new CustomPermissionAction(this.cy) { // from class: juu.10
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                juu.this.cy.e(new CameraUtil(juu.this.cy).e());
            }
        });
    }

    private void cu() {
        if (Utils.b(com.huawei.haf.application.BaseApplication.b(), "com.lolaage.tbulu.tools")) {
            dt();
        } else {
            qpx.e(this.r, R.string.IDS_uninstall_two_steps_road);
        }
    }

    private void dt() {
        if (this.cy == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "showTwoStepsRoadDialog mTrackMainMapActivity is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.cy).b(this.bv).a(true).b(R.string.IDS_goto_two_steps_road).c(R.string.IDS_goto_two_steps_road_open, new View.OnClickListener() { // from class: jut
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39080a.g(view);
            }
        }).a(R.string.IDS_goto_two_steps_road_cancel, new View.OnClickListener() { // from class: jvc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                health.compact.a.ReleaseLogUtil.c("Track_TrackMainViewHolder", "TwoStepsRoadDialog cancel");
            }
        }).c();
        this.dl = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setWindowGravityParams(17);
        HealthButton healthButton = (HealthButton) this.dl.findViewById(R.id.dialog_btn_positive);
        healthButton.setTextColor(this.r.getResources().getColor(R.color.hwbutton_selector_text_emphasize_emui, null));
        healthButton.setBackgroundResource(R.drawable.button_background_emphasize);
        this.dl.setCancelable(false);
        if (this.cy.isDestroyed() || this.cy.isFinishing()) {
            return;
        }
        this.dl.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        health.compact.a.ReleaseLogUtil.c("Track_TrackMainViewHolder", "go to TwoStepsRoad");
        jxk.b(this.r, this.dp);
    }

    public void w() {
        if (this.bu == null || iwy.a(this.r).aq()) {
            return;
        }
        if (!SportMusicController.c().a()) {
            this.bu.e(this.cn);
        }
        this.bu.b();
        if (cg()) {
            dl();
        } else {
            bb();
        }
    }

    private void bb() {
        this.an.setVisibility(8);
        this.bw.setVisibility(8);
    }

    private void dl() {
        if (cc() && izn.a(this.r) == 0) {
            this.an.setVisibility(0);
            this.bw.setVisibility(8);
        } else {
            this.an.setVisibility(8);
            this.bw.setVisibility(0);
        }
    }

    private boolean cc() {
        return this.dj.h(this.cn) == 1 && jaa.c(this.r);
    }

    public void u() {
        ImageButton imageButton = this.t;
        if (imageButton == null || !(imageButton.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        if (this.bw.getVisibility() == 8) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.t.getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.removeRule(3);
            this.t.setLayoutParams(layoutParams);
            return;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.t.getLayoutParams();
        layoutParams2.topMargin = qrs.d(this.r, 2.0f);
        layoutParams2.removeRule(6);
        layoutParams2.addRule(3, this.bw.getId());
        this.t.setLayoutParams(layoutParams2);
    }

    private void ce() {
        Intent intent = new Intent();
        intent.setClassName(this.r, "com.huawei.ui.homehealth.runcard.SportMetronomeActivity");
        intent.putExtra("jump_source", 2);
        intent.putExtra("is_support_metronome", cf());
        intent.putExtra("jump_from_sport_type", this.cn);
        this.cy.d(intent, 2000);
        this.cy.b();
    }

    private void b(Map<String, Object> map) {
        try {
            SportMusicController.c().d(this.dj.d(this.cn) == null ? 1 : 2, this.cn, true);
        } catch (ActivityNotFoundException e2) {
            LogUtil.a("Track_TrackMainViewHolder", "music running list activity  not found, check ", e2.getMessage());
        } catch (SecurityException e3) {
            LogUtil.a("Track_TrackMainViewHolder", "SE ", e3.getMessage());
        }
        map.put("sportMusicType", 0);
    }

    public void e(int i) {
        jup jupVar = this.da;
        if (jupVar != null) {
            jupVar.e(i);
        }
    }

    public void b() {
        if (!this.be || q()) {
            m();
            l();
        }
        jvo jvoVar = this.dh;
        if (jvoVar == null) {
            ReleaseLogUtil.a("Track_TrackMainViewHolder", "addOnGlobalLayoutListener mTrackMainViewHolderBean is null");
            return;
        }
        if (jvoVar.c() == null || this.dh.c().getViewTreeObserver() == null) {
            ReleaseLogUtil.a("Track_TrackMainViewHolder", "addOnGlobalLayoutListener  mTrackMainViewHolderBean.getLayoutOperation() ", "mTrackMainViewHolderBean.getLayoutOperation().getViewTreeObserver() is null");
        } else if (this.ao) {
            LogUtil.a("Track_TrackMainViewHolder", "onGlobalLayoutListener Already added");
        } else {
            this.ao = true;
            this.dh.c().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: juu.6
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (juu.this.dh == null) {
                        LogUtil.e("Track_TrackMainViewHolder", "onGlobalLayout mTrackMainViewHolderBean is null");
                        return;
                    }
                    if (juu.this.dh.c() == null || juu.this.dh.c().getViewTreeObserver() == null) {
                        LogUtil.e("Track_TrackMainViewHolder", "onGlobalLayout  mTrackMainViewHolderBean.getLayoutOperation() ", "mTrackMainViewHolderBean.getLayoutOperation().getViewTreeObserver() is null");
                        return;
                    }
                    if (!fxk.b(juu.this.dh.c())) {
                        LogUtil.a("Track_TrackMainViewHolder", "LayoutOperation Invisible");
                        return;
                    }
                    juu.this.dh.c().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    juu.this.ao = false;
                    if (juu.this.q()) {
                        juu.this.dg();
                    } else if (!juu.this.be) {
                        LogUtil.a("Track_TrackMainViewHolder", "isn't pause and sportingCommand");
                    } else {
                        juu.this.ax();
                    }
                }
            });
        }
    }

    public void l() {
        jvo jvoVar = this.dh;
        if (jvoVar == null || jvoVar.r() == null || this.dh.w() == null) {
            ReleaseLogUtil.a("Track_TrackMainViewHolder", "initPlayAndStopMargin mTrackMainViewHolderBean is null", "requestTrackMainPageBtnStop is null", "getTrackMainPageButtonPlay is null");
            return;
        }
        if (this.dh.r().getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.dh.r().getLayoutParams();
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(0);
            layoutParams.addRule(14);
        }
        if (this.dh.w().getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.dh.w().getLayoutParams();
            layoutParams2.setMarginStart(0);
            layoutParams2.setMarginEnd(0);
            layoutParams2.addRule(14);
        }
    }

    public void m() {
        jvo jvoVar = this.dh;
        if (jvoVar == null || jvoVar.o() == null || this.dh.q() == null) {
            LogUtil.e("Track_TrackMainViewHolder", "initLockAndMusicMargin mTrackMainViewHolderBean is null", "getTrackMainPageButtonLock is null", "getTrackMainPageButtonSetting is null");
            return;
        }
        int iD = qrs.d(this.r, 20.0f);
        if (this.dh.o().getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.dh.o().getLayoutParams();
            layoutParams.setMarginStart(iD);
            layoutParams.setMarginEnd(0);
            layoutParams.addRule(20);
        }
        if (this.dh.q().getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.dh.q().getLayoutParams();
            layoutParams2.setMarginStart(0);
            layoutParams2.setMarginEnd(iD);
            layoutParams2.addRule(21);
        }
    }

    public void z() {
        jvo jvoVar = this.dh;
        if (jvoVar == null || jvoVar.o() == null || this.dh.q() == null) {
            LogUtil.e("Track_TrackMainViewHolder", "resumeLockAndMusicMargin mTrackMainViewHolderBean is null", "getTrackMainPageButtonLock is null", "getTrackMainPageButtonSetting is null");
            return;
        }
        if (this.dh.o().getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.dh.o().getLayoutParams();
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(0);
            layoutParams.addRule(20);
        }
        if (this.dh.q().getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.dh.q().getLayoutParams();
            layoutParams2.setMarginStart(0);
            layoutParams2.setMarginEnd(0);
            layoutParams2.addRule(21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg() {
        int left;
        int width;
        Context context = this.r;
        if (context == null) {
            LogUtil.j("Track_TrackMainViewHolder", "mContext is null");
            return;
        }
        if (this.ap) {
            LogUtil.j("Track_TrackMainViewHolder", "showBtnStopAndPlay, but IsButtonPlayingAnimation");
            return;
        }
        int iD = qrs.d(context, 20.0f);
        if (LanguageUtil.ba(this.r)) {
            left = this.dh.o().getLeft() - this.dh.q().getRight();
            width = this.dh.m().getWidth();
        } else {
            left = this.dh.q().getLeft() - this.dh.o().getRight();
            width = this.dh.m().getWidth();
        }
        int i = (left - (width * 2)) + iD;
        int width2 = (i / 6) + (this.dh.m().getWidth() / 2);
        this.dh.m().setVisibility(4);
        this.dh.r().setVisibility(0);
        this.dh.w().setVisibility(0);
        LogUtil.a("Track_TrackMainViewHolder", "move: ", Integer.valueOf(width2), " blank: ", Integer.valueOf(i));
        if (LanguageUtil.ba(this.r)) {
            d(0, 0 - width2, 300, (View) this.dh.w(), false);
            d(0, width2, 300, (View) this.dh.r(), false);
        } else {
            d(0, width2, 300, (View) this.dh.w(), false);
            d(0, 0 - width2, 300, (View) this.dh.r(), false);
        }
        dn();
    }

    private void dn() {
        int iD = qrs.d(this.r, 20.0f);
        if (LanguageUtil.ba(this.r)) {
            d(0, iD, 300, (View) this.dh.o(), false);
            if (this.dh.q().getVisibility() == 0) {
                d(0, -iD, 300, (View) this.dh.q(), false);
                return;
            }
            return;
        }
        d(0, -iD, 300, (View) this.dh.o(), false);
        if (this.dh.q().getVisibility() == 0) {
            d(0, iD, 300, (View) this.dh.q(), false);
        }
    }

    private void aw() {
        this.cy.runOnUiThread(new Runnable() { // from class: juu.9
            @Override // java.lang.Runnable
            public void run() {
                if (juu.this.ap) {
                    LogUtil.j("Track_TrackMainViewHolder", "foldBtnStopAndPlay, but IsButtonPlayingAnimation");
                    return;
                }
                juu.this.ds();
                juu.this.dh.s().setVisibility(4);
                juu.this.dh.w().setProgressZero();
                juu.this.dh.w().d(true);
                int left = (juu.this.dh.m().getLeft() + juu.this.dh.m().getRight()) / 2;
                int left2 = (juu.this.dh.w().getLeft() + juu.this.dh.w().getRight()) / 2;
                int i = left - left2;
                LogUtil.a("Track_TrackMainViewHolder", "centerLocation: ", Integer.valueOf(left), " leftLocation: ", Integer.valueOf(left2));
                juu juuVar = juu.this;
                juuVar.d(0, 0 - i, 300, (View) juuVar.dh.r(), true);
                juu juuVar2 = juu.this;
                juuVar2.d(0, i, 300, (View) juuVar2.dh.w(), true);
                juu.this.ao();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ao() {
        int iD = qrs.d(this.r, 20.0f);
        if (LanguageUtil.ba(this.r)) {
            d(0, -iD, 300, (View) this.dh.o(), true);
            if (this.dh.q().getVisibility() == 0) {
                d(0, iD, 300, (View) this.dh.q(), true);
                return;
            }
            return;
        }
        d(0, iD, 300, (View) this.dh.o(), false);
        if (this.dh.q().getVisibility() == 0) {
            d(0, -iD, 300, (View) this.dh.q(), false);
        }
    }

    public void d(final int i, final int i2, int i3, final View view, final boolean z) {
        if (view == null) {
            ReleaseLogUtil.a("Track_TrackMainViewHolder", "slideView view is null");
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(i, i2, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new OvershootInterpolator());
        translateAnimation.setDuration(i3);
        translateAnimation.setStartOffset(0L);
        translateAnimation.setInterpolator(new OvershootInterpolator(0.0f));
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: juu.13
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                juu.this.ap = true;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                juu.this.a(z, view, i2, i);
            }
        });
        view.startAnimation(translateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    public void a(boolean z, View view, int i, int i2) {
        int left;
        int left2;
        int width;
        int width2;
        boolean z2 = view.getId() == R.id.track_main_page_btn_lock || view.getId() == R.id.track_main_page_btn_sound;
        if (z2 && LanguageUtil.ba(this.r)) {
            if (bx()) {
                width = this.bm.getWidth() - view.getLeft();
                width2 = view.getWidth();
            } else {
                width = this.dh.c().getWidth() - view.getLeft();
                width2 = view.getWidth();
            }
            left2 = width - (width2 * 2);
        } else {
            if (LanguageUtil.ba(this.r) && !z) {
                left2 = view.getLeft();
            } else {
                left = view.getLeft() + (i - i2);
            }
            int top = view.getTop();
            view.clearAnimation();
            e(view, left, top);
            if (!z && !z2) {
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                    if (view.getId() == R.id.track_main_page_btn_stop) {
                        this.dh.m().setVisibility(0);
                    }
                }
            } else if (view.getId() == R.id.track_main_page_btn_stop) {
                this.dh.s().setTranslationX(i);
                this.dh.w().d(false);
            }
            view.postInvalidate();
            this.br.postDelayed(new Runnable() { // from class: juu.12
                @Override // java.lang.Runnable
                public void run() {
                    juu.this.ap = false;
                    juu.this.cx();
                }
            }, 50L);
        }
        left = left2 - (i - i2);
        int top2 = view.getTop();
        view.clearAnimation();
        e(view, left, top2);
        if (!z) {
            if (view.getId() == R.id.track_main_page_btn_stop) {
                this.dh.s().setTranslationX(i);
                this.dh.w().d(false);
            }
        } else if (view.getId() == R.id.track_main_page_btn_stop) {
            this.dh.s().setTranslationX(i);
            this.dh.w().d(false);
        }
        view.postInvalidate();
        this.br.postDelayed(new Runnable() { // from class: juu.12
            @Override // java.lang.Runnable
            public void run() {
                juu.this.ap = false;
                juu.this.cx();
            }
        }, 50L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cx() {
        jvo jvoVar = this.dh;
        if (jvoVar == null) {
            ReleaseLogUtil.a("Track_TrackMainViewHolder", "mTrackMainViewHolderBean is null in refreshLastState");
            return;
        }
        ImageView imageViewM = jvoVar.m();
        if (imageViewM == null) {
            ReleaseLogUtil.a("Track_TrackMainViewHolder", "pauseButton is null in refreshLastState");
            return;
        }
        boolean zQ = q();
        boolean z = imageViewM.getVisibility() == 0;
        if (zQ && z) {
            ReleaseLogUtil.d("Track_TrackMainViewHolder", "change to Pause");
            dg();
        } else {
            if (zQ || z) {
                return;
            }
            ReleaseLogUtil.d("Track_TrackMainViewHolder", "change to sporting");
            aw();
        }
    }

    public boolean r() {
        return this.ay;
    }

    public void d(boolean z) {
        this.ay = z;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private void m1950do() {
        jvo jvoVar = this.dh;
        if (jvoVar == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "showLockFragment mTrackMainViewHolderBean is null");
            return;
        }
        LinearLayout linearLayoutB = jvoVar.b();
        if (linearLayoutB == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "showLockFragment layoutLockOperation is null");
            return;
        }
        int i = 1;
        if (this.bj) {
            l(linearLayoutB);
            if (!this.ay) {
                i = 0;
            }
        } else {
            this.ay = true;
            linearLayoutB.setAnimation(cq());
            linearLayoutB.setVisibility(0);
            if (bx()) {
                this.bm.setVisibility(4);
            } else {
                this.dh.c().setVisibility(4);
            }
            CircleProgressButton circleProgressButtonW = this.dh.w();
            if (circleProgressButtonW != null) {
                circleProgressButtonW.setOnTouchListener(null);
            }
            lrd.c(circleProgressButtonW, 1);
            n(this.dh.q());
            n(this.dh.m());
            n(this.dh.r());
        }
        b(false);
        ds();
        HealthImageView healthImageView = this.dc;
        if (healthImageView != null) {
            healthImageView.setClickable(false);
        }
        this.dh.s().setVisibility(4);
        f(i);
    }

    private void n(View view) {
        if (view == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "setImportantForAccessibility view is null");
        } else {
            view.setEnabled(true);
            lrd.c(view, 1);
        }
    }

    private void l(View view) {
        if (view == null || this.bk == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "setAccessibility layoutLockOperation ", view, " mLockButton ", this.bk);
            return;
        }
        this.ay = !this.ay;
        view.setVisibility(8);
        this.bk.setVisibility(0);
        e(this.dh.w(), this.ay);
        c(this.dh.q(), this.ay);
        c(this.dh.m(), this.ay);
        c(this.dh.r(), this.ay);
        de();
        lrd.c(this.bk, qre.f(this.ay ? R.string.accessibility_locked : R.string.accessibility_unlocked));
        lrd.b(this.bk, qre.f(this.ay ? R.string.accessibility_unlock : R.string.accessibility_lock));
    }

    private void e(View view, boolean z) {
        if (view == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "setAccessibilityForStopButton view is null");
        } else if (z) {
            view.setOnTouchListener(new View.OnTouchListener(this) { // from class: juu.15
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
            lrd.c(view, 2);
        } else {
            view.setOnTouchListener(null);
            lrd.c(view, 1);
        }
    }

    private void c(View view, boolean z) {
        if (view == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "setAccessibilityForButton view is null");
            return;
        }
        view.setEnabled(!z);
        if (z) {
            lrd.c(view, 2);
        } else {
            lrd.c(view, 1);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.view.UnlockSliderView.SliderListener
    public void siderRight() {
        this.dh.b().setAnimation(cp());
        this.dh.b().setVisibility(8);
        this.dh.c().setAnimation(cq());
        this.dh.c().setVisibility(0);
        f(0);
    }

    private void f(int i) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(this.r, AnalyticsValue.MOTION_TRACK_1040028.value(), map, 0);
    }

    private TranslateAnimation cq() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, -1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    private TranslateAnimation cp() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    private void dr() {
        if (!d(this.cy) || this.bx == null) {
            return;
        }
        if (cb()) {
            this.cd.post(new Runnable() { // from class: jvf
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.ck();
                }
            });
        } else {
            if (bz()) {
                return;
            }
            this.ci.bo();
            aq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ck() {
        this.bx.setVisibility(8);
        qsp.c((View) this.bo, 8);
        dq();
        this.cd.invalidate();
    }

    private void aq() {
        jup jupVar = this.da;
        if (jupVar != null) {
            jupVar.c(8);
        }
        CountdownDialog countdownDialog = new CountdownDialog(this.cy, this.cd);
        this.p = countdownDialog;
        countdownDialog.setTimeStart(3);
        this.p.addEndCountdown(new OnEndCountdownListener() { // from class: juu.11
            @Override // com.huawei.health.basesport.sportui.OnEndCountdownListener
            public void endCountdown() {
                juu.this.dv();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dv() {
        if (d(this.cy)) {
            jup jupVar = this.da;
            if (jupVar != null) {
                jupVar.c(0);
            }
            View view = this.cd;
            if (view != null) {
                view.setBackgroundResource(R.color.colorBackground);
            }
            this.bx.setVisibility(8);
            a(new Animator.AnimatorListener() { // from class: juu.20
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    juu.this.s.setVisibility(8);
                    qsp.c((View) juu.this.bo, 8);
                    juu.this.br.postDelayed(new Runnable() { // from class: juu.20.3
                        @Override // java.lang.Runnable
                        public void run() {
                            juu.this.dq();
                        }
                    }, 50L);
                }
            });
        }
    }

    private boolean bz() {
        if ((!this.ci.at() || !npn.c(this.r)) && !this.ci.aq()) {
            return false;
        }
        this.bx.setVisibility(8);
        qsp.c((View) this.bo, 8);
        this.cd.post(new Runnable() { // from class: juu.18
            @Override // java.lang.Runnable
            public void run() {
                juu.this.dq();
                juu.this.cd.invalidate();
            }
        });
        return true;
    }

    private void a(Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.k, "scaleX", this.j, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.k, "scaleY", this.j, 1.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(2.0f));
        this.ch = (GradientDrawable) this.k.getBackground();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: juu.16
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator == null || !(valueAnimator.getAnimatedValue() instanceof Float)) {
                    LogUtil.e("Track_TrackMainViewHolder", "valueAnimator is invalid");
                } else {
                    juu.this.ch.setColor(juu.this.e(((Float) valueAnimator.getAnimatedValue()).floatValue()));
                }
            }
        });
        valueAnimatorOfFloat.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorOfFloat);
        ImageView imageView = this.bo;
        if (imageView != null) {
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat3.setStartDelay(100L);
            objectAnimatorOfFloat3.setDuration(400L);
            ShowDataPanelLayout showDataPanelLayout = this.q;
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(showDataPanelLayout, "translationY", showDataPanelLayout.getHeight(), 0.0f);
            objectAnimatorOfFloat4.setStartDelay(100L);
            objectAnimatorOfFloat4.setDuration(400L);
            animatorSet.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        }
        animatorSet.addListener(animatorListener);
        this.s.setVisibility(0);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Context context) {
        if (!(context instanceof Activity)) {
            ReleaseLogUtil.a("Track_TrackMainViewHolder", "context is not instanceof Activity");
            return false;
        }
        Activity activity = (Activity) context;
        if (!activity.isDestroyed() && !activity.isFinishing()) {
            return true;
        }
        ReleaseLogUtil.e("Track_TrackMainViewHolder", "Activity is invalid.isDestoryed", Boolean.valueOf(activity.isDestroyed()), "isFinishing", Boolean.valueOf(activity.isFinishing()));
        return false;
    }

    private void dd() {
        int i;
        ImageButton imageButtonQ = this.dh.q();
        jxk.c(this.bv, imageButtonQ, this.av ? R.drawable.sport_button_50_bg : R.drawable.sport_button_outdoor_50_bg);
        if (cb()) {
            qsp.a(imageButtonQ, qqz.c(this.bv, R.drawable.ic_track_disconnect));
            return;
        }
        Context context = this.bv;
        if (jaq.c() == 1) {
            i = R.drawable.track_ic_sound;
        } else {
            i = R.drawable.track_ic_no_sound;
        }
        jxk.b(context, (ImageView) imageButtonQ, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dq() {
        this.cy.startSport();
        this.bd = true;
    }

    private void cv() {
        if (!this.bd) {
            LogUtil.j("Track_TrackMainViewHolder", "the sport have not started,pls wait...");
            return;
        }
        ive.c().e(0);
        e();
        this.cy.d();
    }

    public void j() {
        TrackMainMapActivity trackMainMapActivity = this.cy;
        if (CommonUtil.i(trackMainMapActivity, trackMainMapActivity.getClass().getName())) {
            e();
        } else {
            df();
        }
    }

    public void h() {
        TrackMainMapActivity trackMainMapActivity = this.cy;
        if (CommonUtil.i(trackMainMapActivity, trackMainMapActivity.getClass().getName())) {
            ac();
        } else {
            this.be = true;
            ax();
        }
    }

    public void e() {
        dg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dz() {
        this.cy.h();
    }

    public void ac() {
        ive.c().e(0);
        aw();
        if (cb()) {
            return;
        }
        this.cy.f();
    }

    public void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.u = bundle;
        d(bundle);
        b(bundle);
        List<SportDataGridViewAdapter.e> listE = e(bundle, this.ck);
        this.dm = listE;
        if (this.dh == null) {
            ReleaseLogUtil.a("Track_TrackMainViewHolder", "mTrackMainViewHolderBean is null or valueHolders size ", Integer.valueOf(listE.size()));
            return;
        }
        x();
        e(bundle);
        if (bundle.containsKey("progreeRate") || cd()) {
            f(bundle);
        }
    }

    private void d(Bundle bundle) {
        if (bundle == null) {
            LogUtil.e("Track_TrackMainViewHolder", "sportData is null");
            return;
        }
        if (!((Boolean) jxk.f39163b.first).booleanValue()) {
            if (bundle.containsKey("power")) {
                jxk.f39163b = new Pair<>(true, true);
            } else {
                int i = this.cn;
                if ((i == 259 || i == 258 || i == 264) && bundle.containsKey(HwExerciseConstants.EXTEND_CYCLE_ANALOG_POWER)) {
                    jxk.f39163b = new Pair<>(true, false);
                }
            }
            ReleaseLogUtil.d("Track_TrackMainViewHolder", "sIsShowPowerType with ", jxk.f39163b);
        }
        if (((Boolean) jxk.f39162a.first).booleanValue() && ((Boolean) jxk.f39162a.second).booleanValue()) {
            return;
        }
        if (bundle.containsKey("cadenceData")) {
            jxk.f39162a = new Pair<>(true, true);
        } else if (this.cn == 259 && bundle.containsKey(HwExerciseConstants.EXTEND_CYCLE_ANALOG_CADENCE)) {
            jxk.f39162a = new Pair<>(true, false);
        }
        ReleaseLogUtil.d("Track_TrackMainViewHolder", "sIsShowCadenceType with ", jxk.f39162a);
    }

    public void x() {
        if (njy.e(this.dm)) {
            ReleaseLogUtil.a("Track_TrackMainViewHolder", "mValueHolders is empty ");
            return;
        }
        int size = this.dm.size() - 1;
        SportDataGridViewAdapter sportDataGridViewAdapter = this.d;
        if (sportDataGridViewAdapter == null) {
            SportDataGridViewAdapter sportDataGridViewAdapter2 = new SportDataGridViewAdapter(this.bv, (List) this.dm.stream().skip(1L).limit(Math.min(this.ad, size)).collect(Collectors.toList()));
            this.d = sportDataGridViewAdapter2;
            sportDataGridViewAdapter2.d(new SportDataGridViewAdapter.ItemClickListener() { // from class: jvg
                @Override // com.huawei.healthcloud.plugintrack.ui.adapter.SportDataGridViewAdapter.ItemClickListener
                public final void itemClick(int i, TrackMainFragmentShowType trackMainFragmentShowType) {
                    this.d.e(i, trackMainFragmentShowType);
                }
            });
            this.dh.d().setAdapter((ListAdapter) this.d);
        } else {
            sportDataGridViewAdapter.a(this.bv, (List) this.dm.stream().skip(1L).limit(Math.min(this.ad, size)).collect(Collectors.toList()));
        }
        this.di.d(this.dm.get(0).e(), this.dm.get(0).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(int i, TrackMainFragmentShowType trackMainFragmentShowType) {
        c(i + 1, trackMainFragmentShowType);
    }

    public void b(boolean z) {
        SportDataGridViewAdapter sportDataGridViewAdapter = this.d;
        if (sportDataGridViewAdapter != null) {
            sportDataGridViewAdapter.e(z);
        }
        jvp jvpVar = this.di;
        if (jvpVar != null) {
            jvpVar.a().setClickable(z);
        }
        TrackIntervalViewHolder trackIntervalViewHolder = this.cx;
        if (trackIntervalViewHolder != null) {
            trackIntervalViewHolder.c(z);
        }
    }

    public void p() {
        jvo jvoVar = this.dh;
        if (jvoVar != null) {
            jvoVar.e();
        }
        TrackIntervalViewHolder trackIntervalViewHolder = this.cx;
        if (trackIntervalViewHolder != null) {
            trackIntervalViewHolder.e();
        }
    }

    private void c(int i, TrackMainFragmentShowType trackMainFragmentShowType) {
        b(trackMainFragmentShowType, false);
        this.ak = i;
    }

    public void b(TrackMainFragmentShowType trackMainFragmentShowType, boolean z) {
        LogUtil.a("Track_TrackMainViewHolder", "jump to select with ", trackMainFragmentShowType);
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) TrackGridActivity.class);
        intent.putExtra("current_show_type", trackMainFragmentShowType.name());
        intent.putExtra("map_tracking_sport_type_sportting", this.cn);
        intent.putExtra("sport_data_source_sportting", this.cj);
        intent.putExtra("sport_with_link", this.bg);
        intent.putExtra("power_zone_exist", this.ba);
        intent.putExtra("jump_select_source", z);
        intent.putExtra("current_sport_data", this.u);
        this.cy.d(intent, 3000);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            jtz.b().saveConfigToLocal(this.ck, this.cn, this.cj);
            return;
        }
        this.ck.put(this.ak, TrackMainFragmentShowType.valueOf(str));
        jtz.b().saveConfigToLocal(this.ck, this.cn, this.cj);
        this.at = true;
    }

    public void v() {
        TrackIntervalViewHolder trackIntervalViewHolder = this.cx;
        if (trackIntervalViewHolder != null) {
            trackIntervalViewHolder.c();
        }
    }

    private void b(Bundle bundle) {
        if (this.at) {
            return;
        }
        List<TrackMainFragmentShowType> priorityConfig = jtz.b().getPriorityConfig(this.cn, this.ba && ((Boolean) jxk.f39164c.second).booleanValue());
        ArrayList arrayList = new ArrayList();
        Iterator<TrackMainFragmentShowType> it = priorityConfig.iterator();
        while (it.hasNext()) {
            TrackMainFragmentShowType next = it.next();
            String strC = jue.c(next);
            if (this.w.contains(next) || bundle.containsKey(strC)) {
                arrayList.add(next);
            } else if (this.az && jxk.e(next)) {
                arrayList.add(next);
            } else if (this.bc && jxk.c(next)) {
                arrayList.add(next);
            }
            if (arrayList.size() == 7) {
                break;
            }
        }
        LogUtil.a("Track_TrackMainViewHolder", "config size ", Integer.valueOf(arrayList.size()), "--", arrayList.toString());
        for (int i = 0; i < arrayList.size(); i++) {
            this.ck.put(i, (TrackMainFragmentShowType) arrayList.get(i));
        }
        this.w = arrayList;
    }

    public void b(IntervalCardData intervalCardData) {
        b(intervalCardData, true, false);
    }

    public void a(IntervalCardData intervalCardData) {
        b(intervalCardData, false, false);
    }

    private void b(IntervalCardData intervalCardData, boolean z, boolean z2) {
        boolean z3;
        if (intervalCardData == null || this.cx == null) {
            return;
        }
        boolean z4 = false;
        boolean z5 = bx() && z;
        if (bx() && !z) {
            z4 = true;
        }
        if (z5) {
            this.cx.d(this.ax, this.bv, intervalCardData);
            return;
        }
        if (z4) {
            this.cx.a(this.ax, this.bv, intervalCardData);
            return;
        }
        if (!this.bi || z2) {
            if (z && ((Boolean) this.as.second).booleanValue()) {
                return;
            }
            if (z || !((Boolean) this.as.first).booleanValue()) {
                if (z) {
                    this.y = intervalCardData;
                } else {
                    this.x = intervalCardData;
                }
                if (((Boolean) this.as.first).booleanValue() || ((Boolean) this.as.second).booleanValue()) {
                    intervalCardData.e(IntervalCardData.CardType.LARGE);
                } else {
                    intervalCardData.e(IntervalCardData.CardType.SMALL);
                }
                if (d(intervalCardData)) {
                    this.as = new Pair<>(Boolean.valueOf(z), Boolean.valueOf(!z));
                    this.aq = true;
                    c(intervalCardData);
                    b("m01", z ? "heart_rate" : "power");
                    return;
                }
                if (z) {
                    this.cx.d(this.ax, this.bv, intervalCardData);
                    z3 = this.bb;
                } else {
                    this.cx.a(this.ax, this.bv, intervalCardData);
                    z3 = this.bb;
                }
                if (z3) {
                    e(z, intervalCardData.h(), intervalCardData.b(this.bv));
                }
            }
        }
    }

    private boolean d(IntervalCardData intervalCardData) {
        if (((Boolean) this.as.first).booleanValue() || ((Boolean) this.as.second).booleanValue() || this.aq) {
            return false;
        }
        ShowDataPanelLayout showDataPanelLayout = this.q;
        if ((showDataPanelLayout == null || showDataPanelLayout.getPanelMode() != 0) && !this.ay) {
            return intervalCardData.j();
        }
        return false;
    }

    private void c(IntervalCardData intervalCardData) {
        this.bt.sendEmptyMessageDelayed(5, 5000L);
        this.bt.sendEmptyMessageDelayed(6, 60000L);
        j(intervalCardData.b(this.bv));
        this.bi = !this.q.getIsPanelMoving();
        TransitionManager.go(this.ae, this.q.getIsPanelMoving() ? null : this.dk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void at() {
        if (this.bb) {
            this.as = new Pair<>(false, false);
            TrackIntervalViewHolder trackIntervalViewHolder = this.cx;
            if (trackIntervalViewHolder != null) {
                trackIntervalViewHolder.d(false);
            }
            this.bi = !this.q.getIsPanelMoving();
            if (!iov.d(this.cy)) {
                ReleaseLogUtil.e("Track_TrackMainViewHolder", "goStartScene mTrackMainMapActivity ", this.cy);
            } else {
                TransitionManager.go(this.cv, this.q.getIsPanelMoving() ? null : this.dk);
            }
        }
    }

    private void b(String str, String str2) {
        lmn lmnVar = new lmn();
        HashMap map = new HashMap(4);
        map.put("event", 0);
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map.put("value", str2);
        map.put("entrance", "e1");
        lmnVar.e(map);
        HashMap map2 = new HashMap(1);
        map2.put("pageId", "Sport_process_" + this.cn);
        lmnVar.d(map2);
        lmf.d().a(this.r, AnalyticsValue.BI_TRACK_SPORT_START_SPORT_KEY.value(), lmnVar, 0);
    }

    public void j(boolean z) {
        this.ba = z;
        ReleaseLogUtil.d("Track_TrackMainViewHolder", "mIsPowerZoneExist is ", Boolean.valueOf(z));
    }

    private void e(Bundle bundle) {
        if (bundle == null) {
            ReleaseLogUtil.a("Track_TrackMainViewHolder", "sport data is null");
            return;
        }
        qsp.b(this.dh.f(), a(bundle));
        qsp.b(this.dh.k(), bundle.getString("duration", "--"));
        jxk.e(this.bv, this.dh.k(), R.color.textColorPrimary);
        jxk.e(this.bv, this.dh.f(), R.color.textColorPrimary);
        jxk.e(this.bv, this.dh.l(), R.color.textColorSecondary);
        jxk.e(this.bv, this.dh.n(), R.color.textColorSecondary);
        if (this.bf && this.dh.a() != null) {
            this.dh.a().setText("3D:" + bundle.getString("climb_3d_dis", "--") + ", 2D:" + bundle.getString("climb_2d_dis", "--") + ", 海拔:" + bundle.getString("climb_3d_pressure", "--"));
        }
        if (this.ah != null) {
            h(bundle);
        }
    }

    private void f(Bundle bundle) {
        String string = bundle.getString("extroInfo");
        if (string == null || string.isEmpty()) {
            string = "";
        }
        String string2 = bundle.getString("planProgress", "");
        float fMin = Math.min(100.0f, Math.max(0.0f, bundle.getFloat("progreeRate", 0.0f)));
        bj();
        HealthProgressBar healthProgressBar = this.cw;
        if (healthProgressBar != null) {
            healthProgressBar.setProgress((int) fMin);
            this.cw.setProgressDrawable(qre.d(this.bv, R.drawable.track_plan_progressbar_horizontal));
            HealthTextView healthTextView = this.de;
            if (TextUtils.isEmpty(string)) {
                string = this.cc;
            }
            healthTextView.setText(string);
            HealthTextView healthTextView2 = this.dd;
            if (TextUtils.isEmpty(string2)) {
                string2 = UnitUtil.e(fMin, 2, 2);
            }
            healthTextView2.setText(string2);
            jxk.e(this.bv, this.dd, R.color.textColorPrimary);
            int i = R.color.textColorSecondary;
            this.df = i;
            jxk.e(this.bv, this.de, i);
        }
        int i2 = bundle.getInt("extroLocationState", -1);
        if (i2 != -1) {
            int i3 = i2 == 1 ? R.color.colorAccent : R.color.textColorSecondary;
            this.df = i3;
            jxk.e(this.bv, this.de, i3);
        }
        if (cb() || this.dc == null || !this.ci.as()) {
            return;
        }
        if (bundle.getBoolean("planIsLastTarget")) {
            qsp.c((View) this.dc, 8);
        } else {
            qsp.c((View) this.dc, 0);
            jxk.c(this.bv, this.dc, R.drawable.track_music_next);
        }
    }

    private void h(Bundle bundle) {
        int i = bundle.getInt("ihealth_free_indoor_running_style", 0);
        if (i == 1 && this.ah.getVisibility() == 4) {
            this.ah.setVisibility(0);
        } else if (i == 2 && this.ah.getVisibility() == 0) {
            this.ah.setVisibility(4);
        } else {
            LogUtil.d("Track_TrackMainViewHolder", "not a special style");
        }
    }

    private void bj() {
        ViewStub viewStub;
        if (this.cw == null && (viewStub = (ViewStub) this.cd.findViewById(R.id.view_stub_main_page_progressBar_new)) != null) {
            View viewInflate = viewStub.inflate();
            View viewFindViewById = viewInflate.findViewById(R.id.track_main_page_progress_layout);
            this.cz = viewFindViewById;
            jxk.c(this.bv, viewFindViewById, R.drawable.sport_progress_view_bg);
            this.cw = (HealthProgressBar) viewInflate.findViewById(R.id.track_main_page_progressBar);
            this.de = (HealthTextView) viewInflate.findViewById(R.id.track_main_page_text_progressStr);
            this.dd = (HealthTextView) viewInflate.findViewById(R.id.track_main_page_text_progressVaule);
            HealthImageView healthImageView = (HealthImageView) viewInflate.findViewById(R.id.track_main_page_action_next);
            this.dc = healthImageView;
            healthImageView.setOnClickListener(this);
        }
    }

    private boolean cd() {
        String str = this.cc;
        return (str == null || str.equals("")) ? false : true;
    }

    private List<SportDataGridViewAdapter.e> e(Bundle bundle, SparseArray<TrackMainFragmentShowType> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (bundle == null) {
            LogUtil.e("Track_TrackMainViewHolder", "sportData is null");
            return arrayList;
        }
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                TrackMainFragmentShowType trackMainFragmentShowType = sparseArray.get(i);
                jvw jvwVarE = jue.e(trackMainFragmentShowType, bundle);
                if (jvwVarE != null) {
                    SportDataGridViewAdapter.e eVar = new SportDataGridViewAdapter.e(jvwVarE.c(), jvwVarE.d());
                    eVar.a(trackMainFragmentShowType);
                    arrayList.add(eVar);
                }
            }
        }
        return arrayList;
    }

    private String a(Bundle bundle) {
        if (bundle == null || bundle.getString("distance") == null) {
            return UnitUtil.e(0.0d, 1, 0);
        }
        try {
            return UnitUtil.e(Double.parseDouble(bundle.getString("distance")), 1, 2);
        } catch (NumberFormatException e2) {
            LogUtil.e("Track_TrackMainViewHolder", LogAnonymous.b(e2));
            return "";
        }
    }

    private jvw e(String str) {
        return new jvw(qre.f(R.string.IDS_main_watch_heart_rate_string), str, qre.f(R.string.IDS_main_watch_heart_rate_unit_string));
    }

    private jvw a(String str) {
        return new jvw(qre.f(R.string.IDS_motiontrack_show_map_remain_calorie), str, qre.f(R.string.IDS_motiontrack_show_kcal));
    }

    public void a(boolean z) {
        jup jupVar = this.da;
        if (jupVar != null) {
            jupVar.c(z);
        }
    }

    public void a(MotionData motionData) {
        jup jupVar = this.da;
        if (jupVar != null) {
            jupVar.b(motionData);
        }
    }

    public InterfaceHiMap k() {
        jup jupVar = this.da;
        if (jupVar != null) {
            return jupVar.a();
        }
        return null;
    }

    public boolean q() {
        if (cb()) {
            return ((SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class)).getStatus() == 2;
        }
        iwy iwyVar = this.ci;
        return iwyVar != null && iwyVar.o() == 2;
    }

    public boolean t() {
        if (cb()) {
            return ((SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class)).getStatus() == 1;
        }
        iwy iwyVar = this.ci;
        return iwyVar != null && iwyVar.o() == 1;
    }

    static class b extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<juu> f39106b;

        b(juu juuVar) {
            this.f39106b = null;
            this.f39106b = new WeakReference<>(juuVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f39106b == null || message == null) {
                return;
            }
            super.handleMessage(message);
            juu juuVar = this.f39106b.get();
            if (juuVar == null) {
                return;
            }
            if (message.what != 101) {
                juuVar.c(message.what, message.arg1);
                return;
            }
            juuVar.ct = AnimatorInflater.loadAnimator(juuVar.r, R.animator.track_history_fade_out);
            juuVar.ct.setTarget(juuVar.dh.s());
            juuVar.ct.addListener(juuVar.cr);
            juuVar.ct.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        int i3 = i2 - 4;
        this.al.put(i3, TrackMainFragmentShowType.values()[i]);
        jvp jvpVar = this.dh.g().get(i3);
        jvw jvwVarD = d(TrackMainFragmentShowType.values()[i]);
        if (jvwVarD == null) {
            return;
        }
        c(jvpVar, jvwVarD);
    }

    private jvw d(TrackMainFragmentShowType trackMainFragmentShowType) {
        if (trackMainFragmentShowType == TrackMainFragmentShowType.TOTAL_DISTANCES) {
            return ar();
        }
        if (trackMainFragmentShowType == TrackMainFragmentShowType.TOTAL_TIME) {
            return new jvw(qre.f(R.string.IDS_workout_data_time), "", "");
        }
        if (trackMainFragmentShowType == TrackMainFragmentShowType.SPEED) {
            return new jvw(UnitUtil.f() ? qre.f(R.string.IDS_hwh_motiontrack_show_speed_mi_hour) : qre.f(R.string.IDS_hwh_motiontrack_show_speed_km_hour), "", "");
        }
        if (trackMainFragmentShowType == TrackMainFragmentShowType.CALORIE) {
            return ak();
        }
        if (trackMainFragmentShowType == TrackMainFragmentShowType.HEART_RATE) {
            return e("");
        }
        if (trackMainFragmentShowType == TrackMainFragmentShowType.STEP_RATE) {
            return aj();
        }
        if (trackMainFragmentShowType == TrackMainFragmentShowType.PACE) {
            return new jvw(qre.f(R.string.IDS_motiontrack_show_map_sport_peisu_1), "", "");
        }
        if (trackMainFragmentShowType == TrackMainFragmentShowType.COUNTDOWN_DISTANCES) {
            return al();
        }
        if (trackMainFragmentShowType == TrackMainFragmentShowType.COUNTDOWN_TIME) {
            return new jvw(qre.f(R.string.IDS_motiontrack_show_map_remain_time), "", "");
        }
        if (trackMainFragmentShowType == TrackMainFragmentShowType.COUNTDOWN_CALORIE) {
            return an();
        }
        LogUtil.d("Track_TrackMainViewHolder", "TrackShowItemValue is not in enumeration");
        return null;
    }

    private jvw ak() {
        return new jvw(qre.f(R.string.IDS_track_total_calories), "", qre.f(R.string.IDS_motiontrack_show_kcal));
    }

    private jvw aj() {
        return new jvw(qre.f(R.string.IDS_motiontrack_detail_fm_heart_bupin), "", qre.f(R.string.IDS_motiontrack_show_sport_unit_km));
    }

    private jvw an() {
        return a("");
    }

    private jvw al() {
        return new jvw(qre.f(R.string.IDS_motiontrack_show_map_remain_distance), "", qre.f(R.string.IDS_motiontrack_show_sport_unit_km));
    }

    private jvw ar() {
        return new jvw(qre.f(R.string.IDS_motiontrack_show_map_sport_distance), "", qre.f(R.string.IDS_workout_data_distance_km));
    }

    private void c(final jvp jvpVar, final jvw jvwVar) {
        this.cy.runOnUiThread(new Runnable(this) { // from class: juu.19
            @Override // java.lang.Runnable
            public void run() {
                jvpVar.b(jvwVar);
            }
        });
    }

    public void c(int i) {
        LogUtil.a("Track_TrackMainViewHolder", "performUpdateStatus, to pause/resume sport ", Integer.valueOf(i));
        if (i == 1) {
            this.be = true;
            ax();
            this.cy.f();
        } else if (i == 2) {
            df();
            this.cy.d();
        } else if (i == 3) {
            this.cy.g();
        } else {
            LogUtil.j("Track_TrackMainViewHolder", "Wrong command");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(view.getLayoutParams());
        marginLayoutParams.setMargins(i, i2, marginLayoutParams.width + i, i2);
        view.setLayoutParams(new RelativeLayout.LayoutParams(marginLayoutParams));
    }

    private void df() {
        jvo jvoVar = this.dh;
        if (jvoVar == null) {
            LogUtil.j("Track_TrackMainViewHolder", "showBtnPlayAndStopWhenLock mTrackMainViewHolderBean is null");
            return;
        }
        ImageView imageViewR = jvoVar.r();
        if (imageViewR == null) {
            LogUtil.j("Track_TrackMainViewHolder", "showBtnPlayAndStopWhenLock btnPlay is null");
        } else {
            imageViewR.post(new Runnable() { // from class: juy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39110a.dp();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dp() {
        int left;
        int i;
        if (this.dh == null) {
            LogUtil.j("Track_TrackMainViewHolder", "showPlayAndStopButtonsWhenLocked mTrackMainViewHolderBean is null");
            return;
        }
        int iD = qrs.d(this.r, 20.0f);
        ImageView imageViewR = this.dh.r();
        ImageView imageViewM = this.dh.m();
        if (LanguageUtil.ba(this.r)) {
            left = ((this.dh.o().getLeft() - this.dh.q().getRight()) - (this.dh.m().getWidth() * 2)) + iD;
            i = 1;
        } else {
            left = ((this.dh.q().getLeft() - this.dh.o().getRight()) - (this.dh.m().getWidth() * 2)) + iD;
            i = -1;
        }
        imageViewM.setVisibility(8);
        imageViewR.setVisibility(0);
        CircleProgressButton circleProgressButtonW = this.dh.w();
        circleProgressButtonW.setVisibility(0);
        int width = (left / 6) + (imageViewM.getWidth() / 2);
        LogUtil.a("Track_TrackMainViewHolder", "showPlayAndStopButtonsWhenLocked move: ", Integer.valueOf(width), " blank: ", Integer.valueOf(left));
        this.dh.s().setTranslationX((-i) * width);
        int top = imageViewM.getTop();
        int left2 = (this.dh.m().getLeft() + this.dh.m().getRight()) / 2;
        e(circleProgressButtonW, (left2 - (imageViewM.getWidth() / 2)) + width, top);
        e(imageViewR, (left2 - (imageViewM.getWidth() / 2)) - width, top);
        circleProgressButtonW.d(false);
        imageViewR.invalidate();
        circleProgressButtonW.invalidate();
        a(left2, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        int width;
        int top = this.dh.o().getTop();
        int visibility = this.dh.q().getVisibility();
        if (bx()) {
            width = this.bm.getWidth();
        } else {
            width = this.dh.c().getWidth();
        }
        d(i, width, i2 == 1 ? qrs.d(this.r, 20.0f) : 0, visibility, top);
        this.dh.o().invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ax() {
        this.cy.runOnUiThread(new Runnable() { // from class: juu.17
            @Override // java.lang.Runnable
            public void run() {
                ImageView imageViewR = juu.this.dh.r();
                CircleProgressButton circleProgressButtonW = juu.this.dh.w();
                ImageView imageViewM = juu.this.dh.m();
                if (imageViewR == null || circleProgressButtonW == null || imageViewM == null) {
                    ReleaseLogUtil.a("Track_TrackMainViewHolder", "button is invalid");
                    return;
                }
                int left = (juu.this.dh.m().getLeft() + juu.this.dh.m().getRight()) / 2;
                int top = imageViewM.getTop();
                juu.e(imageViewR, left - (imageViewM.getWidth() / 2), top);
                juu.e(circleProgressButtonW, left - (imageViewM.getWidth() / 2), top);
                juu.e(imageViewM, left - (imageViewM.getWidth() / 2), top);
                imageViewM.setVisibility(0);
                imageViewR.setVisibility(8);
                circleProgressButtonW.setVisibility(8);
                circleProgressButtonW.d(true);
                juu.this.ds();
                juu.this.dh.s().setVisibility(4);
                imageViewR.invalidate();
                circleProgressButtonW.invalidate();
                imageViewM.invalidate();
                juu.this.a(left, 1);
            }
        });
    }

    private void d(int i, int i2, int i3, int i4, int i5) {
        if (LanguageUtil.ba(this.r)) {
            e(this.dh.o(), ((i - (i2 / 2)) - this.dh.o().getWidth()) + i3, i5);
            if (i4 == 0) {
                e(this.dh.q(), (i2 - (this.dh.q().getWidth() * 2)) - i3, i5);
                this.dh.q().invalidate();
                return;
            }
            return;
        }
        int i6 = i2 / 2;
        e(this.dh.o(), (i - i6) + i3, i5);
        if (i4 == 0) {
            e(this.dh.q(), ((i + i6) - this.dh.q().getWidth()) - i3, i5);
            this.dh.q().invalidate();
        }
    }

    private void ae() {
        int i = this.cl;
        if (i == 0 || i == 2) {
            return;
        }
        this.cy.runOnUiThread(new Runnable() { // from class: juu.23
            @Override // java.lang.Runnable
            public void run() {
                juu.this.bq.setText(R.string.IDS_workout_data_distance_mi);
            }
        });
    }

    private void bt() {
        int i = izw.k;
        this.cp = (i >> 24) & 255;
        this.cq = (i >> 16) & 255;
        this.cm = (i >> 8) & 255;
        this.co = i & 255;
        int i2 = izw.o;
        this.ac = (i2 >> 24) & 255;
        this.af = (i2 >> 16) & 255;
        this.ab = (i2 >> 8) & 255;
        this.z = i2 & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(float f) {
        int i = this.cp;
        return b(f) | ((i + ((int) ((this.ac - i) * f))) << 24);
    }

    private int b(float f) {
        int i = this.cq;
        int i2 = (int) ((this.af - i) * f);
        int i3 = this.cm;
        int i4 = (int) ((this.ab - i3) * f);
        int i5 = this.co;
        return ((i + i2) << 16) | ((i3 + i4) << 8) | (i5 + ((int) (f * (this.z - i5))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ds() {
        this.br.removeMessages(101);
        Animator animator = this.ct;
        if (animator != null) {
            if (animator.isRunning()) {
                this.ct.cancel();
            }
            this.ct = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dm() {
        ds();
        jvo jvoVar = this.dh;
        if (jvoVar == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "showStopContent mTrackMainViewHolderBean is null");
            return;
        }
        HealthTextView healthTextViewS = jvoVar.s();
        if (healthTextViewS == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "showStopContent textView is null");
            return;
        }
        healthTextViewS.setAlpha(1.0f);
        healthTextViewS.setVisibility(0);
        lrd.c(healthTextViewS, qre.i(R.string.IDS_hwh_motiontrack_long_press_stop));
    }

    public void i() {
        iwy iwyVar = this.ci;
        if (iwyVar != null) {
            iwyVar.by();
        }
        if (SportSupportUtil.g(this.cn) && njy.b(this.n)) {
            ivo.a().a("Track_TrackMainViewHolder");
        }
        GroupApi groupApi = (GroupApi) Services.b("FeatureGroup", GroupApi.class);
        e eVar = this.bz;
        if (eVar != null) {
            groupApi.unRegisterLocationSharingListener(eVar);
        }
        if (groupApi.isSharing()) {
            dj();
        }
    }

    private void dj() {
        lsy.a(new Runnable() { // from class: jvm
            @Override // java.lang.Runnable
            public final void run() {
                juu.c();
            }
        });
    }

    static /* synthetic */ void c() {
        GroupApi groupApi = (GroupApi) Services.b("FeatureGroup", GroupApi.class);
        GroupActivityBo groupActivityBoD = SportingMiniBarView.d(groupApi);
        if (groupActivityBoD == null) {
            LogUtil.j("Track_TrackMainViewHolder", "activityBo is empty");
        } else {
            LogUtil.a("Track_TrackMainViewHolder", "TeamId is ", groupActivityBoD.getTeamId(), " ActivityId is ", Integer.valueOf(groupActivityBoD.getActivityId()));
            groupApi.setMiniBarStatus(true, String.format(Locale.US, "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.groups?h5pro=true&path=GroupTeamSharing&teamId=%s&activityId=%d", groupActivityBoD.getTeamId(), Integer.valueOf(groupActivityBoD.getActivityId())), groupActivityBoD.getActivityName());
        }
    }

    private boolean au() {
        if (this.cn == 264) {
            return false;
        }
        return "true".equals(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "dev_3ddis_track"));
    }

    public void a(jpg jpgVar, jpg jpgVar2) {
        jup jupVar = this.da;
        if (jupVar != null) {
            jupVar.drawPauseLine(jpgVar, jpgVar2);
        }
    }

    public void ad() {
        jup jupVar = this.da;
        if (jupVar != null) {
            jupVar.releaseMap();
        }
        Handler handler = this.bt;
        if (handler == null) {
            ReleaseLogUtil.e("Track_TrackMainViewHolder", "release mMsgHandler is null");
        } else {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void s() {
        jup jupVar = this.da;
        if (jupVar != null) {
            jupVar.pauseSportClear();
        }
    }

    public void f() {
        jup jupVar = this.da;
        if (jupVar != null) {
            jupVar.forceDrawLineToMap();
        }
    }

    public void b(int i) {
        this.ag = i;
        SportingGpsView sportingGpsView = this.aj;
        if (sportingGpsView != null) {
            if (sportingGpsView.getVisibility() != 0) {
                ct();
            }
            cs();
            qsp.c((View) this.aj, 0);
        }
    }

    private void ct() {
        SportingGpsView sportingGpsView = this.aj;
        if (sportingGpsView != null) {
            sportingGpsView.b(this.bv);
        }
    }

    private void cs() {
        SportingGpsView sportingGpsView = this.aj;
        if (sportingGpsView == null) {
            return;
        }
        sportingGpsView.c(this.bv, this.ag);
    }

    public void b(List<jpi> list) {
        jup jupVar = this.da;
        if (jupVar != null) {
            jupVar.drawLineToMap(list);
        }
    }

    private void be() {
        if (this.bn == null) {
            this.bn = this.cd.findViewById(R.id.layout_lockoperation);
        }
        if (this.bl == null) {
            this.bl = (ImageView) this.cd.findViewById(R.id.img_lock);
        }
        if (this.bp == null) {
            this.bp = (HealthTextView) this.cd.findViewById(R.id.lock_operation_text);
        }
        if (this.l == null) {
            this.l = (ImageView) this.cd.findViewById(R.id.img_arrows);
        }
        jxk.c(this.bv, this.bn, R.drawable.slide_to_unlock_background_indoor);
        jxk.c(this.bv, this.bl, R.drawable.sport_button_50_bg);
        jxk.b(this.bv, this.bl, R.drawable.track_ic_health_sporting_unlock);
        jxk.e(this.bv, this.bp, R.color.textColorSecondary);
        this.l.setImageDrawable(qqf.c(qqz.c(BaseApplication.getContext(), R.drawable.common_ui_arrow_right_3), qre.e(this.bv, R.color.colorPrimary)));
    }

    private void bu() {
        this.g.b();
    }

    private boolean by() {
        return cb() || this.ci.aq() || (UnitUtil.f() && !cf());
    }

    public void ag() {
        int i;
        if (!this.bh) {
            LogUtil.a("Track_TrackMainViewHolder", "is not bike.");
            return;
        }
        boolean zA = lua.a(Integer.toString(20002), "first_time_enter_bike_auto_pause", true);
        this.au = zA;
        if (zA) {
            View viewInflate = View.inflate(this.r, R.layout.layout_setting_tips_bubble, null);
            if (viewInflate == null || this.cy.isFinishing()) {
                LogUtil.a("Track_TrackMainViewHolder", "settingBubbleLayout is null or Activity is finish", Boolean.valueOf(this.cy.isFinishing()));
                return;
            }
            PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, false);
            this.cf = popupWindow;
            popupWindow.setOutsideTouchable(true);
            viewInflate.measure(0, 0);
            int width = this.ce.getWidth();
            int dimensionPixelSize = this.r.getResources().getDimensionPixelSize(R.dimen.health_common_8dp);
            if (LanguageUtil.ba(this.r) || width <= 0) {
                i = -qrs.d(this.r, 20.0f);
            } else {
                i = (width / 2) - dimensionPixelSize;
            }
            try {
                this.cf.showAsDropDown(this.ce, i, qrs.d(this.r, 4.0f));
                this.cf.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.huawei.healthcloud.plugintrack.ui.viewholder.TrackMainViewHolder$$ExternalSyntheticLambda21
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        this.e.ay();
                    }
                });
                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: juv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f39107a.i(view);
                    }
                });
            } catch (WindowManager.BadTokenException e2) {
                LogUtil.e("Track_TrackMainViewHolder", ExceptionUtils.c(e2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        ay();
    }

    private boolean cf() {
        return !cb() && izn.e(this.cn, this.ci.au()) && jwz.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ay() {
        if (this.au && this.bh && !cb()) {
            as();
            lua.d(Integer.toString(20002), "first_time_enter_bike_auto_pause", false);
            this.au = false;
        }
    }

    private void as() {
        PopupWindow popupWindow = this.cf;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.cf.dismiss();
    }

    public jup o() {
        return this.da;
    }

    public void e(gdm gdmVar) {
        jup jupVar = this.da;
        if (jupVar != null) {
            jupVar.a(gdmVar);
        }
        c(gdmVar);
    }
}
