package com.huawei.health.suggestion.ui.fitness.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.courseplanservice.api.SportServiceApi;
import com.huawei.health.distributedservice.api.DistributedApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.sportservice.SportBleStatus;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.h5pro.AiSportVoiceHelper;
import com.huawei.health.suggestion.h5pro.CourseControlManager;
import com.huawei.health.suggestion.ui.BaseStateActivity;
import com.huawei.health.suggestion.ui.callback.UiPagingCallback;
import com.huawei.health.suggestion.ui.fitness.callback.JumpFinishCallback;
import com.huawei.health.suggestion.ui.fitness.helper.IntPlanPreSportRemind;
import com.huawei.health.suggestion.ui.fitness.helper.JumpConnectHelper;
import com.huawei.health.suggestion.ui.fitness.module.CoachData;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.fitness.module.TrainActionIntro;
import com.huawei.health.suggestion.ui.fitness.mvp.CourseDetailProvider;
import com.huawei.health.suggestion.ui.fitness.mvp.NewViewDetailInfo;
import com.huawei.health.suggestion.ui.fitness.mvp.ScreenController;
import com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract;
import com.huawei.health.suggestion.ui.fitness.mvp.ViewVideoPlayListener;
import com.huawei.health.suggestion.ui.fitness.mvp.VipViewShowProvider;
import com.huawei.health.suggestion.ui.fitness.viewholder.CourseDetailViewHolder;
import com.huawei.health.suggestion.ui.run.activity.fragment.CustomCourseDetailFragment;
import com.huawei.health.suggestion.ui.view.AutoFillColorView;
import com.huawei.health.suggestion.util.CourseEquipmentConnectionTipsUtil;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.pluginfitnessadvice.BelongInfo;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.LayoutTemplateInfo;
import com.huawei.pluginfitnessadvice.LongVideoInfo;
import com.huawei.pluginfitnessadvice.RecommendationBar;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.pricetagbean.PriceTagBean;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.trade.datatype.ProductSummary;
import com.huawei.trade.datatype.TradeViewInfo;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.downloadwidget.HealthDownLoadWidget;
import com.huawei.ui.commonui.errortip.NetworkErrorTipBar;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwsubtab.widget.HwSubTabWidget;
import defpackage.btt;
import defpackage.btw;
import defpackage.btx;
import defpackage.buh;
import defpackage.gzd;
import defpackage.gzl;
import defpackage.gzx;
import defpackage.hcg;
import defpackage.hcu;
import defpackage.hhv;
import defpackage.hih;
import defpackage.him;
import defpackage.hip;
import defpackage.hjd;
import defpackage.hjs;
import defpackage.hkn;
import defpackage.hkt;
import defpackage.hld;
import defpackage.hmf;
import defpackage.hmh;
import defpackage.hmt;
import defpackage.hna;
import defpackage.hnc;
import defpackage.hoy;
import defpackage.hve;
import defpackage.idy;
import defpackage.ied;
import defpackage.iei;
import defpackage.iem;
import defpackage.ien;
import defpackage.iet;
import defpackage.ifz;
import defpackage.igc;
import defpackage.iov;
import defpackage.lsl;
import defpackage.lsy;
import defpackage.lua;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pcs;
import defpackage.pea;
import defpackage.pel;
import defpackage.pqh;
import defpackage.qhu;
import defpackage.qpo;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.xfz;
import defpackage.xkf;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TrainDetail extends BaseStateActivity implements View.OnClickListener, TrainDetailContract.Iview, JumpConnectHelper.JumpActivityHandleInterface, CourseEquipmentConnectionTipsUtil.DevicesConnectDialogCallback, ScreenController, VipViewShowProvider, JumpFinishCallback, CourseDetailProvider, SportBleStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f9135a;
    private qpo ab;
    private NetworkErrorTipBar ac;
    private int ad;
    private IntPlanPreSportRemind ae;
    private RelativeLayout af;
    private HealthButton ai;
    private boolean ap;
    private boolean as;
    private RelativeLayout at;
    private boolean au;
    private HealthTextView av;
    private ImageView aw;
    private int ay;
    private String az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f9136b;
    private String ba;
    private NoTitleCustomAlertDialog bb;
    private ImageView be;
    private hna bf;
    private NewViewDetailInfo bg;
    private String bh;
    private TrainDetailContract.Ipresenter bi;
    private CustomAlertDialog bj;
    private AutoFillColorView bk;
    private PopupWindow bl;
    private FrameLayout bm;
    private ArrayList<WorkoutRecord> bo;
    private HealthViewPager bp;
    private WorkoutRecord bq;
    private hna br;
    private hkn bs;
    private FrameLayout bu;
    private RadioButton bv;
    private CustomViewDialog bw;
    private long bx;
    private int by;
    private HealthButton bz;
    private HealthSubTabWidget ca;
    private String[] cb;
    private View cc;
    private RelativeLayout cd;
    private LinearLayout ce;
    private hmf cg;
    private hhv ch;
    private float ci;
    private WifiReceiver cj;
    private NoTitleCustomAlertDialog ck;
    private RadioButton cl;
    private String cn;
    private CoachData d;
    private AutoFillColorView e;
    private Context f;
    private HealthTextView g;
    private HealthButton h;
    private HealthTextView i;
    private HealthTextView j;
    private hmt k;
    private hnc l;
    private HealthCardView n;
    private CourseApi o;
    private CustomViewDialog p;
    private igc q;
    private CourseDetailViewHolder r;
    private int s;
    private CustomTitleBar t;
    private float u;
    private HealthDownLoadWidget v;
    private int w;
    private HealthColumnRelativeLayout x;
    private a y;
    private FitWorkout z;
    private int aa = 1;
    private NetStateChangeReceiver bc = new NetStateChangeReceiver();
    private int cf = 0;
    private boolean ax = false;
    private boolean aj = false;
    private boolean ah = false;
    private int bd = 0;
    private int bn = 0;
    private boolean ak = false;
    private boolean am = true;
    private boolean al = false;
    private Handler ag = new j(Looper.getMainLooper(), this);
    private boolean ao = true;
    private hjd m = new hjd(this.ag, this);
    private boolean ar = false;
    private boolean aq = false;
    private boolean an = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hld f9137c = new hld();
    private View.OnClickListener bt = new AnonymousClass4();

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public int setLoadingBackgroundColor() {
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("Suggestion_TrainDetail", "onCreate enter");
        qrs.c(this, bundle);
        getWindow().setFlags(16777216, 16777216);
        this.f = this;
        this.m.c();
        if (getIntent() != null) {
            hmf hmfVar = new hmf(getIntent());
            this.cg = hmfVar;
            this.bo = hmfVar.n();
            if ("entrance_custom_course".equals(this.cg.e())) {
                this.z = this.cg.h();
            }
            ReleaseLogUtil.d("Suggestion_TrainDetail", "mTrainDetailIntentData:", this.cg.toString());
        }
        super.onCreate(bundle);
        clearBackgroundDrawable();
        if (aa()) {
            return;
        }
        this.q = igc.a(IntPlan.PlanType.NA_PLAN.getType());
        this.bi = new hmh(this, this.cg);
        this.bx = System.currentTimeMillis();
        this.by = getWindow().getDecorView().getSystemUiVisibility();
    }

    private boolean aa() {
        if (LoginInit.getInstance(BaseApplication.getContext()).getUsetId() != null || LoginInit.getInstance(this.f).isBrowseMode()) {
            return false;
        }
        ReleaseLogUtil.e("Suggestion_TrainDetail", "onCreate enter getAccountInfo() == null");
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName(getPackageName(), "com.huawei.health.MainActivity");
        intent.addFlags(268435456);
        intent.putExtra("isFromTrainDetail", true);
        iov.d(btx.c(), intent);
        finish();
        return true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        hmt hmtVar = this.k;
        if (hmtVar != null) {
            hmtVar.a();
        }
        NewViewDetailInfo newViewDetailInfo = this.bg;
        if (newViewDetailInfo != null) {
            newViewDetailInfo.d();
        }
        if (!bd() || this.ch == null) {
            return;
        }
        LogUtil.a("Suggestion_TrainDetail", "onPause mVipPreview backToPreview");
        this.ch.f();
    }

    public Handler b() {
        return this.ag;
    }

    public WorkoutRecord a() {
        return this.bq;
    }

    public boolean c() {
        return this.m.d();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Iview
    public void addTradeView(View view) {
        LogUtil.a("Suggestion_TrainDetail", "addTradeView.");
        hnc hncVar = this.l;
        if (hncVar != null) {
            hncVar.e(al());
        }
        if (this.cd == null || view == null) {
            return;
        }
        this.v.setClickable(false);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.cd.addView(view, layoutParams);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Iview
    public void recycleTradeView(View view) {
        LogUtil.a("Suggestion_TrainDetail", "recycleTradeView.");
        hnc hncVar = this.l;
        if (hncVar != null) {
            hncVar.b();
        }
        RelativeLayout relativeLayout = this.cd;
        if (relativeLayout != null && view != null) {
            relativeLayout.removeView(view);
        }
        showDownloadView();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Iview
    public void hideDownloadView() {
        LogUtil.a("Suggestion_TrainDetail", "hideDownloadView.");
        this.v.setClickable(false);
        this.v.setVisibility(8);
        this.x.setVisibility(8);
        this.f9136b.setVisibility(8);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Iview
    public void showDownloadView() {
        LogUtil.a("Suggestion_TrainDetail", "showDownloadView.");
        hnc hncVar = this.l;
        if (hncVar != null) {
            hncVar.b();
        }
        this.v.setClickable(true);
        c(this.w);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Iview
    public void bindRecommendationData(List<FitWorkout> list, ArrayMap<String, String> arrayMap) {
        NewViewDetailInfo newViewDetailInfo = this.bg;
        if (newViewDetailInfo != null) {
            newViewDetailInfo.d(list, arrayMap);
        }
    }

    private String al() {
        FitWorkout fitWorkout;
        if (this.bi != null && (fitWorkout = this.z) != null) {
            int iB = hkt.b(fitWorkout);
            if (this.bi.isPayCourses(iB)) {
                return getString(R.string.IDS_sug_purchase_lock_hint);
            }
            if (this.bi.isVipCourses(iB)) {
                return getString(R.string.IDS_sug_member_lock_hint);
            }
            return "";
        }
        return "";
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Iview
    public WeakReference<Activity> acquireActivity() {
        return new WeakReference<>(this);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Iview
    public void setNoticeContent(SpannableString spannableString) {
        CourseDetailViewHolder courseDetailViewHolder = this.r;
        if (courseDetailViewHolder != null) {
            courseDetailViewHolder.a(spannableString);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Iview
    public String acquireWorkoutName() {
        FitWorkout fitWorkout = this.z;
        if (fitWorkout == null) {
            return "";
        }
        return fitWorkout.acquireName();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.ScreenController
    public void setScreenOrientation(int i2) {
        setRequestedOrientation(i2);
        if (i2 == 0) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(this.by);
            initSystemBar();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.callback.JumpFinishCallback
    public void onJumpFinish() {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.callback.JumpFinishCallback
    public void onJumpFail() {
        o();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.CourseDetailProvider
    public boolean isRunModelCourse() {
        return i();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.CourseDetailProvider
    public boolean isLongVideoCourse() {
        FitWorkout fitWorkout = this.z;
        if (fitWorkout != null) {
            return fitWorkout.isLongVideoCourse();
        }
        return false;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.CourseDetailProvider
    public void getLongVideo(int i2, UiCallback<LongVideoInfo> uiCallback) {
        a(false, this.z.getWorkoutActionProperty(), uiCallback);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.CourseDetailProvider
    public int getCourseActionMediaSize(int i2) {
        if (this.o == null || this.bq == null || TextUtils.isEmpty(this.cn)) {
            return 0;
        }
        return this.o.getCourseMediaFileSize(this.cn, this.bq.acquireVersion(), i2);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.CourseDetailProvider
    public boolean isCurActionResourceDownload(int i2) {
        CourseApi courseApi = this.o;
        if (courseApi == null) {
            LogUtil.j("Suggestion_TrainDetail", "isDownloaded: mCourseApi is null.");
            return false;
        }
        if (this.ax) {
            return true;
        }
        return courseApi.isCourseMediaFileDownloaded(this.cn, this.bq.acquireVersion(), i2);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.CourseDetailProvider
    public void downloadCurActionResource(int i2, UiCallback uiCallback) {
        if (this.o == null || this.bq == null || TextUtils.isEmpty(this.cn)) {
            return;
        }
        this.o.downloadCourseMediaFileByPosition(this.cn, this.bq.acquireVersion(), i2, uiCallback);
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class j extends BaseHandler<TrainDetail> {
        public j(Looper looper, TrainDetail trainDetail) {
            super(looper, trainDetail);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(TrainDetail trainDetail, Message message) {
            if (message == null) {
                ReleaseLogUtil.e("Suggestion_TrainDetail", "handleMessage message is null");
                return;
            }
            int i = message.what;
            if (i == 0) {
                if (message.arg1 == 0) {
                    trainDetail.t.setRightTextButtonVisibility(8);
                    trainDetail.t.setPaddingRelative(0, 0, (int) trainDetail.getResources().getDimension(com.huawei.ui.commonui.R.dimen.defaultPaddingEnd), 0);
                    return;
                } else if (trainDetail.isRunModelCourse() && trainDetail.c()) {
                    trainDetail.t.setRightTextButtonVisibility(0);
                    trainDetail.t.setPaddingRelative(0, 0, 0, 0);
                    trainDetail.ac();
                    return;
                } else {
                    trainDetail.t.setPaddingRelative(0, 0, (int) trainDetail.getResources().getDimension(com.huawei.ui.commonui.R.dimen.defaultPaddingEnd), 0);
                    trainDetail.t.setRightTextButtonVisibility(8);
                    return;
                }
            }
            if (i == 1) {
                trainDetail.a(R.string.sug_push_course_to_watch_success, 0);
                return;
            }
            if (i == 4) {
                trainDetail.a(R.string.sug_register_fa_fail, 0);
                return;
            }
            if (i == 102) {
                trainDetail.aj();
            } else if (i == 103) {
                trainDetail.ca();
            } else {
                b(trainDetail, message);
            }
        }

        protected void b(TrainDetail trainDetail, Message message) {
            int i = message.what;
            if (i == 2) {
                trainDetail.n();
                return;
            }
            if (i == 110) {
                trainDetail.cq();
                return;
            }
            if (i == 111) {
                if (trainDetail == null) {
                    LogUtil.j("Suggestion_TrainDetail", "MSG_START_AIMOTIONGUIDANCE activity == null");
                    return;
                } else {
                    CourseControlManager.startAiCourse(trainDetail, trainDetail.z, CourseControlManager.buildCommonParameter(trainDetail.cg, trainDetail.bq.acquirePlanId(), trainDetail.m.e()), trainDetail.aj);
                    return;
                }
            }
            switch (i) {
                case 104:
                    trainDetail.f();
                    break;
                case 105:
                    if (!trainDetail.aq) {
                        trainDetail.ci();
                    } else {
                        CourseEquipmentConnectionTipsUtil.b(CourseEquipmentConnectionTipsUtil.e(trainDetail.z, trainDetail.cg.j()), "Suggestion_TrainDetail", trainDetail);
                    }
                    break;
                case 106:
                    if (!trainDetail.aq) {
                        trainDetail.cp();
                    } else {
                        CourseEquipmentConnectionTipsUtil.b(CourseEquipmentConnectionTipsUtil.e(trainDetail.z, trainDetail.cg.j()), "Suggestion_TrainDetail", trainDetail);
                    }
                    break;
                default:
                    e(trainDetail, message);
                    break;
            }
        }

        protected void e(TrainDetail trainDetail, Message message) {
            int i = message.what;
            if (i == 5) {
                LogUtil.a("Suggestion_TrainDetail", "update Ui");
                if (message.obj instanceof ArrayList) {
                    trainDetail.d((ArrayList) message.obj);
                    return;
                }
                return;
            }
            if (i != 6) {
                switch (i) {
                    case 107:
                        trainDetail.cf();
                        break;
                    case 108:
                        trainDetail.au();
                        break;
                    case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                        LogUtil.a("Suggestion_TrainDetail", "get the show fa button message");
                        trainDetail.t.setRightThirdKeyVisibility(0);
                        trainDetail.bz();
                        break;
                    default:
                        d(trainDetail, message);
                        break;
                }
                return;
            }
            trainDetail.bq();
        }

        protected void d(TrainDetail trainDetail, Message message) {
            switch (message.what) {
                case 7:
                    LogUtil.a("Suggestion_TrainDetail", "showNoCourseListLayout");
                    trainDetail.ce();
                    break;
                case 8:
                    LogUtil.a("Suggestion_TrainDetail", "show detail info");
                    trainDetail.bx();
                    break;
                case 9:
                    trainDetail.cm();
                    break;
                case 10:
                    trainDetail.h(0);
                    break;
                case 11:
                    LogUtil.a("Suggestion_TrainDetail", "show member preview");
                    trainDetail.cl();
                    break;
                default:
                    c(trainDetail, message);
                    break;
            }
        }

        protected void c(TrainDetail trainDetail, Message message) {
            int i = message.what;
            if (i == 12) {
                LogUtil.d("Suggestion_TrainDetail", "show not support preview");
                trainDetail.ch();
            } else if (i == 13) {
                if (message.obj instanceof Integer) {
                    trainDetail.a(((Integer) message.obj).intValue());
                }
            } else if (i == 113) {
                LogUtil.d("Suggestion_TrainDetail", "show toast NetState");
                trainDetail.ai();
            } else {
                LogUtil.j("Suggestion_TrainDetail", "handleMessageWhenReferenceNotNull is default");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        if (i2 == 0) {
            getWindow().clearFlags(8192);
        } else {
            getWindow().addFlags(8192);
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail$4, reason: invalid class name */
    public class AnonymousClass4 implements View.OnClickListener {
        AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArrayList arrayList = new ArrayList(Arrays.asList(TrainDetail.this.getString(R.string.IDS_sug_edit_course), TrainDetail.this.getString(R.string.IDS_sug_copy_course), TrainDetail.this.getString(R.string.IDS_sug_delete_course)));
            TrainDetail trainDetail = TrainDetail.this;
            new PopViewList(trainDetail, trainDetail.t, arrayList).b(new PopViewList.PopViewClickListener() { // from class: hho
                @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
                public final void setOnClick(int i) {
                    this.e.a(i);
                }
            });
        }

        public /* synthetic */ void a(int i) {
            if (i == 0) {
                LogUtil.a("Suggestion_TrainDetail", "mSettingsPointClick, EDIT");
                JumpUtil.c(TrainDetail.this.f, TrainDetail.this.z != null ? TrainDetail.this.z.acquireId() : "", 1);
            } else if (i == 1) {
                JumpUtil.c(TrainDetail.this.f, TrainDetail.this.z != null ? TrainDetail.this.z.acquireId() : "", 2);
            } else if (i != 2) {
                LogUtil.j("Suggestion_TrainDetail", "mSettingsPointClick, position = ", Integer.valueOf(i));
            } else {
                LogUtil.a("Suggestion_TrainDetail", ProfileRequestConstants.DELETE_TYPE);
                TrainDetail.this.cb();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cb() {
        View viewInflate = View.inflate(this.f, R.layout.delete_course_dialog, null);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        builder.d(viewInflate).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: hgv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.m(view);
            }
        }).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: hgx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36732a.n(view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.p = customViewDialogD;
        customViewDialogD.show();
    }

    public /* synthetic */ void m(View view) {
        a(this.p);
    }

    public /* synthetic */ void n(View view) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_TrainDetail", "deleteUserDefinedWorkout copy courseApi == null");
            return;
        }
        final HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put("event", 3);
        courseApi.deleteUserDefinedWorkout(this.z.acquireId(), 1, new UiCallback<String>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.15
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
                LogUtil.e("Suggestion_TrainDetail", "deleteUserDefinedWorkout copy failed.");
                map.put("result", 1);
                idy.b("1130057", map);
                qpx.e(BaseApplication.getContext(), str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                LogUtil.a("Suggestion_TrainDetail", "detail deleteUserDefinedWorkout data:", str);
                map.put("result", 0);
                idy.b("1130057", map);
                TrainDetail.this.finish();
            }
        });
        a(this.p);
    }

    private void a(CustomViewDialog customViewDialog) {
        if (customViewDialog != null) {
            customViewDialog.dismiss();
            LogUtil.a("Suggestion_TrainDetail", "dismissDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i2) {
        d(findViewById(R.id.sug_fitness_rl_2), i2);
        d(this.ca, i2);
        d(this.bp, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        d(findViewById(R.id.non_trial_header), 8);
        h(8);
        d(this.mLoadingView, 8);
        CustomTitleBar customTitleBar = this.t;
        if (customTitleBar != null) {
            customTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this.f, R.color.colorSubBackground));
        }
        d(this.cd, 0);
        d(this.x, 0);
        bn();
        FitWorkout fitWorkout = this.z;
        if (fitWorkout != null && fitWorkout.isCustomCourse()) {
            bw();
        }
        if (this.cg.ae()) {
            bo();
        }
    }

    private void bn() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.sug_traind_outer);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        }
        RelativeLayout relativeLayout = this.at;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        }
        LinearLayout linearLayout = this.ce;
        if (linearLayout != null && (linearLayout.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.ce.getLayoutParams();
            layoutParams.height = -1;
            this.ce.setLayoutParams(layoutParams);
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.sug_custom_course_fragment);
        if (frameLayout2 != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.sug_custom_course_fragment, CustomCourseDetailFragment.c(this.z)).commitAllowingStateLoss();
            frameLayout2.setVisibility(0);
        }
    }

    private void br() {
        d(findViewById(R.id.empty_vip_preview), 0);
        d(findViewById(R.id.member_preview_header), 0);
        d(findViewById(R.id.non_trial_header), 8);
        hna hnaVar = this.br;
        if (hnaVar != null) {
            hnaVar.b(0);
        }
        hna hnaVar2 = this.bf;
        if (hnaVar2 != null) {
            hnaVar2.b(8);
        }
        d(this.bk, 0);
        d(this.g, 8);
        d(this.e, 8);
        d(this.i, 8);
    }

    private void bw() {
        hmf hmfVar = this.cg;
        if (hmfVar != null && "entrance_custom_course".equals(hmfVar.e())) {
            this.t.setRightButtonVisibility(8);
            this.t.setRightSoftkeyVisibility(8);
            return;
        }
        CustomTitleBar customTitleBar = this.t;
        if (customTitleBar != null) {
            customTitleBar.setRightButtonDrawable(getDrawable(R.drawable.ic_appbar_more), qre.f(R.string.accessibility_more_item));
            this.t.setRightButtonOnClickListener(this.bt);
            this.t.setRightButtonVisibility(0);
            if (EnvironmentInfo.m()) {
                this.t.setRightSoftkeyVisibility(8);
                return;
            }
            this.t.setRightSoftkeyBackground(ContextCompat.getDrawable(this.f, R.drawable.sug_push_to_watch), qre.f(R.string.IDS_device_title_use));
            this.t.setRightSoftkeyVisibility(0);
            this.t.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: hhj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f36738a.o(view);
                }
            });
        }
    }

    public /* synthetic */ void o(View view) {
        if (qrs.c(1000)) {
            LogUtil.j("Suggestion_TrainDetail", "watch click is fast");
        } else {
            LogUtil.a("Suggestion_TrainDetail", "onClick : watch");
            bo();
        }
    }

    private void bo() {
        if (!iem.b()) {
            hkt.e(this.f);
            return;
        }
        if (!hve.d()) {
            hkt.c(this.f, getResources().getString(R.string.IDS_fitness_plan_not_connect_device), getResources().getString(R.string.IDS_sug_query_custom_course_devices));
        } else if (!ifz.b()) {
            hkt.b(this.f, getResources().getString(R.string.IDS_custom_course_not_pair), getResources().getString(R.string.IDS_sug_query_custom_course_devices));
        } else {
            if (this.q != null && igc.c(ifz.a())) {
                LogUtil.a("Suggestion_TrainDetail", "watch device connected");
                this.q.b(this.z, true, (IBaseResponseCallback) new e(this));
                return;
            }
            LogUtil.j("Suggestion_TrainDetail", "mDeviceManager is null ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(View view, int i2) {
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<TrainDetail> f9160b;

        public e(TrainDetail trainDetail) {
            this.f9160b = new WeakReference<>(trainDetail);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            StringBuilder sb = new StringBuilder(" ");
            Integer num = (Integer) obj;
            sb.append(num.intValue());
            LogUtil.a("Suggestion_TrainDetail", "mDeviceResponseCallback errorCode = ", Integer.valueOf(i), sb.toString());
            Context context = BaseApplication.getContext();
            if (i == 0) {
                if (num.intValue() == 4) {
                    a(context, context.getString(R.string.IDS_sug_devices_upper_limit));
                } else {
                    a(context, context.getString(R.string.IDS_sug_devices_success));
                }
            } else {
                a(context, context.getString(R.string.IDS_sug_devices_fail));
            }
            HashMap map = new HashMap(10);
            map.put("click", 1);
            map.put("type", 1);
            map.put("workout_name", hkt.a(context));
            map.put("resultCode", obj);
            idy.b("1130024", map);
        }

        private void a(final Context context, final String str) {
            TrainDetail trainDetail = this.f9160b.get();
            if (trainDetail == null) {
                LogUtil.j("Suggestion_TrainDetail", "DeviceResponseCallback showDeviceLinkTips trainDetail is null");
            } else {
                trainDetail.runOnUiThread(new Runnable() { // from class: hhw
                    @Override // java.lang.Runnable
                    public final void run() {
                        qpx.b(context, str);
                    }
                });
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        LogUtil.a("Suggestion_TrainDetail", "onSaveInstanceState enter");
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        cancelAdaptRingRegion();
        this.cj = new WifiReceiver();
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.setPriority(500);
        registerReceiver(this.cj, intentFilter);
        c(this.f);
        setContentView(R.layout.sug_fitness_activity_train_detail);
        aw();
        at();
        ba();
        if (CommonUtil.ca()) {
            this.t.setRightSoftkeyVisibility(8);
        }
        bc();
        this.ab = new qpo(this.bp, this.ca);
        bb();
        ax();
        az();
        ay();
        bs();
        cv();
        h(4);
        cs();
    }

    private void aq() {
        long jB = lsl.b(System.currentTimeMillis(), 2, 0);
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_TrainDetail", "TrainDetail PlanApi is null.");
            b(jB, R.string.IDS_plugin_course_unlock, false);
        } else {
            planApi.getCurrentIntPlan(new AnonymousClass21(jB));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail$21, reason: invalid class name */
    public class AnonymousClass21 extends UiPagingCallback<IntPlan> {
        final /* synthetic */ long d;

        AnonymousClass21(long j) {
            this.d = j;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccessFirst(final IntPlan intPlan) {
            final long j = this.d;
            HandlerExecutor.b(new Runnable() { // from class: hhr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36745b.b(intPlan, j);
                }
            });
        }

        public /* synthetic */ void b(IntPlan intPlan, long j) {
            boolean z = false;
            if (intPlan == null) {
                TrainDetail.this.b(j, R.string.IDS_plugin_course_unlock, false);
                return;
            }
            LogUtil.a("Suggestion_TrainDetail", "week end time:", Long.valueOf(j), "mPlanStartTime:", Long.valueOf(TrainDetail.this.cg.i()), " planType:", Integer.valueOf(intPlan.getPlanType().getType()));
            if (intPlan.getPlanType().equals(IntPlan.PlanType.FIT_PLAN)) {
                TrainDetail.this.w = 0;
                TrainDetail.this.c(0);
                TrainDetail trainDetail = TrainDetail.this;
                trainDetail.d(trainDetail.n, 8);
                return;
            }
            boolean zEquals = IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType());
            if (zEquals) {
                TrainDetail.this.cg.e("weightControlPlan");
            }
            int i = R.string.IDS_plugin_course_unlock;
            if (zEquals && btw.g()) {
                z = true;
            }
            if (z) {
                i = R.string.IDS_plugin_course_unlock_today;
                j = lsl.c(System.currentTimeMillis());
            }
            TrainDetail.this.b(j, i, z);
        }

        public /* synthetic */ void d(long j) {
            TrainDetail.this.b(j, R.string.IDS_plugin_course_unlock, false);
        }

        @Override // com.huawei.health.suggestion.ui.callback.UiPagingCallback
        public void onFailureFirst(int i, String str) {
            final long j = this.d;
            HandlerExecutor.b(new Runnable() { // from class: hhs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36746a.d(j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j2, int i2, boolean z) {
        HealthTextView healthTextView;
        if (isFinishing() || isDestroyed()) {
            LogUtil.j("Suggestion_TrainDetail", "showUnLockView is Destroyed or isFinishing");
            return;
        }
        if (qrs.u() && (healthTextView = this.av) != null) {
            healthTextView.setTextSize(1, 20.0f);
        }
        if (this.cg.i() > j2) {
            d(this.x, 8);
            d(this.v, 8);
            this.w = 8;
            this.av.setText(i2);
            d(this.n, 0);
            return;
        }
        if (this.cg.i() == -1 || this.cg.i() == -2 || this.cg.i() == -3) {
            d(this.x, 8);
            d(this.v, 8);
            this.w = 8;
            d(this.n, 0);
            d(this.aw, 8);
            e(z);
            return;
        }
        if (this.n.getVisibility() == 0) {
            this.w = 0;
            c(0);
            d(this.n, 8);
        }
    }

    private void cs() {
        LogUtil.a("Suggestion_TrainDetail", " mPlanTempId:", this.cg.o());
        if (this.cg.i() != 0) {
            aq();
            return;
        }
        if (!TextUtils.isEmpty(this.cg.o())) {
            this.w = 8;
            d(this.x, 8);
            d(this.v, this.w);
            d(this.n, 8);
            return;
        }
        this.w = 0;
        c(0);
        d(this.n, 8);
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail$25, reason: invalid class name */
    public class AnonymousClass25 implements View.OnClickListener {
        AnonymousClass25() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TrainDetail.this.cg.ab()) {
                TrainDetail.this.bt();
            } else if (TrainDetail.this.cd == null) {
                TrainDetail.this.bg();
            } else {
                qhu.a(TrainDetail.this.cd.getChildAt(TrainDetail.this.cd.getChildCount() - 1), new IBaseResponseCallback() { // from class: hhu
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.f36748a.d(i, obj);
                    }
                });
            }
        }

        public /* synthetic */ void d(int i, Object obj) {
            if (i == 0) {
                TrainDetail.this.bg();
            }
        }
    }

    private void bc() {
        this.t.setLeftButtonOnClickListener(new AnonymousClass25());
        this.mLoadingView = findViewById(R.id.train_detail_loading);
        this.mLoadingView.setTag(false);
        HealthSubTabWidget healthSubTabWidget = (HealthSubTabWidget) findViewById(R.id.sug_detail_tab);
        this.ca = healthSubTabWidget;
        healthSubTabWidget.setVisibility(8);
        setViewSafeRegion(false, this.mLoadingView, this.ca);
        HealthViewPager healthViewPager = (HealthViewPager) findViewById(R.id.sug_detail_vp);
        this.bp = healthViewPager;
        healthViewPager.setDynamicSpringAnimaitionEnabled(false);
        this.cb = new String[]{getString(R.string.IDS_FitnessAdvice_detail_action), getString(R.string.IDS_FitnessAdvice_detail_explain)};
        this.bp.setOffscreenPageLimit(2);
        this.ca.setOnSubTabChangeListener(new HwSubTabWidget.OnSubTabChangeListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.23
            @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget.OnSubTabChangeListener
            public void onSubTabReselected(xfz xfzVar) {
            }

            @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget.OnSubTabChangeListener
            public void onSubTabUnselected(xfz xfzVar) {
            }

            @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabWidget.OnSubTabChangeListener
            public void onSubTabSelected(xfz xfzVar) {
                if (TrainDetail.this.bg == null || xfzVar == null || TextUtils.equals(TrainDetail.this.getString(R.string.IDS_FitnessAdvice_detail_explain), xfzVar.f())) {
                    return;
                }
                TrainDetail.this.bg.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg() {
        if (getIntent() != null && getIntent().getBooleanExtra("moveTaskToBack", false)) {
            moveTaskToBack(true);
        }
        finish();
    }

    private void bs() {
        ReleaseLogUtil.d("Suggestion_TrainDetail", "setTrainViewClick enter");
        this.ac.setOnClickListener(this);
        if (this.l != null) {
            this.r.a();
        }
    }

    private void ba() {
        this.t.setRightThirdKeyBackground(getResources().getDrawable(R.drawable.coach_start_ability), qre.f(R.string.IDS_compatibility_note_open));
        this.t.setRightThirdKeyOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.24
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("onclick the startAbilityButton", new Object[0]);
                if (!qrs.c(500)) {
                    TrainDetail.this.ag.sendMessage(TrainDetail.this.ag.obtainMessage(108));
                } else {
                    LogUtil.j("Suggestion_TrainDetail", "FA Button is fast click");
                }
            }
        });
        this.t.setRightThirdKeyVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void au() {
        LogUtil.a("Suggestion_TrainDetail", "start to initFA");
        CourseControlManager.initFa(this.f, this.z, this.bq.acquirePlanId(), this.cg.i(), new UiCallback<Integer>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.28
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
                ReleaseLogUtil.d("Suggestion_TrainDetail", "initFa errorCode:", Integer.valueOf(i2), " errorInfo:", str);
                TrainDetail.this.ag.sendMessage(TrainDetail.this.ag.obtainMessage(4));
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Integer num) {
                ReleaseLogUtil.d("Suggestion_TrainDetail", "initFa data:", num);
                if (TrainDetail.this.isDestroyed()) {
                    LogUtil.a("Suggestion_TrainDetail", "initFa isDestroyed");
                } else if (num.intValue() == 0) {
                    TrainDetail.this.finish();
                }
            }
        });
    }

    private void az() {
        this.bv = (RadioButton) findViewById(R.id.radio_run);
        this.cl = (RadioButton) findViewById(R.id.radio_treadmill);
        if (lua.b(String.valueOf(1004), "train_detail_sport_type", 0) == 264) {
            this.cl.setChecked(true);
        } else {
            this.bv.setChecked(true);
        }
        this.bv.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail$$ExternalSyntheticLambda20
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                TrainDetail.d(compoundButton, z);
            }
        });
        this.cl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail$$ExternalSyntheticLambda21
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                TrainDetail.a(compoundButton, z);
            }
        });
    }

    static /* synthetic */ void d(CompoundButton compoundButton, boolean z) {
        if (z) {
            lua.c(String.valueOf(1004), "train_detail_sport_type", 258);
        }
    }

    static /* synthetic */ void a(CompoundButton compoundButton, boolean z) {
        if (z) {
            lua.c(String.valueOf(1004), "train_detail_sport_type", 264);
        }
    }

    private void ay() {
        HealthDownLoadWidget healthDownLoadWidget = (HealthDownLoadWidget) findViewById(R.id.health_download_widget);
        this.v = healthDownLoadWidget;
        healthDownLoadWidget.setTag(true);
        this.av = (HealthTextView) findViewById(R.id.locked_course_button_text);
        bu();
        this.f9136b = (LinearLayout) findViewById(R.id.sug_bottom_train_linear);
        HealthButton healthButton = (HealthButton) findViewById(R.id.general_training_btn);
        this.ai = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: hha
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
        this.af = (RelativeLayout) findViewById(R.id.interactive_training_relayout);
        iet.b((HealthTextView) findViewById(R.id.interactive_training_text));
        this.af.setOnClickListener(new View.OnClickListener() { // from class: hhg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(view);
            }
        });
        HealthButton healthButton2 = (HealthButton) findViewById(R.id.connect_device_btn);
        this.h = healthButton2;
        healthButton2.setOnClickListener(new View.OnClickListener() { // from class: hhe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36736c.j(view);
            }
        });
        HealthButton healthButton3 = (HealthButton) findViewById(R.id.start_training_btn);
        this.bz = healthButton3;
        healthButton3.setOnClickListener(new View.OnClickListener() { // from class: hhh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.f(view);
            }
        });
        this.g = (HealthTextView) findViewById(R.id.sug_coach_tv_train_desc);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.sug_coach_train_tv_complete_num);
        this.i = healthTextView;
        setViewSafeRegion(false, this.g, healthTextView);
        this.bf = new hna(findViewById(R.id.normal_header_item));
        this.br = new hna(findViewById(R.id.preview_header_item));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.layout_connect_binding);
        this.at = relativeLayout;
        setViewSafeRegion(false, relativeLayout);
        this.j = (HealthTextView) findViewById(R.id.tv_connect_binding);
        this.f9135a = (HealthButton) findViewById(R.id.but_connect_binding);
        this.ac = (NetworkErrorTipBar) findViewById(R.id.ll_fitness_getdata_error);
        this.bm = (FrameLayout) findViewById(R.id.sfv_parent_preview);
        if (qrs.v()) {
            int iD = qrs.d(this.f, 8.0f);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams.topMargin = iD;
            this.g.setLayoutParams(layoutParams);
            this.g.setLineSpacing(-iD, 1.0f);
            this.bf.a(iD);
        }
        if (qrs.ac()) {
            ar();
        }
    }

    public /* synthetic */ void e(View view) {
        if (qrs.e(view)) {
            LogUtil.a("Suggestion_TrainDetail", "GeneralTraining click too fast");
        } else {
            this.ah = false;
            d(0);
        }
    }

    public /* synthetic */ void a(View view) {
        LogUtil.a("Suggestion_TrainDetail", "InteractiveTraining click");
        if (qrs.e(view)) {
            LogUtil.a("Suggestion_TrainDetail", "InteractiveTraining click too fast");
            return;
        }
        AiSportVoiceHelper.getInstance().setHelperType(FitWorkout.acquireComeFrom(this.d.acquireWorkId()));
        iei.a(1, this.d.acquireWorkId(), this.z.acquireName());
        pel.e().launchActivity(BaseApplication.getContext(), new Intent(), new AppBundleLauncher.InstallCallback() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.26
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public boolean call(Context context, Intent intent) {
                LogUtil.a("Suggestion_TrainDetail", "InteractiveTraining launchActivity");
                if (TrainDetail.this.ax) {
                    TrainDetail.this.aj = false;
                } else {
                    TrainDetail.this.aj = true;
                }
                TrainDetail.this.ah = true;
                TrainDetail.this.d(1);
                return false;
            }
        });
    }

    public /* synthetic */ void j(View view) {
        if (qrs.e(view)) {
            LogUtil.a("Suggestion_TrainDetail", "GeneralTraining click too fast");
            return;
        }
        this.aq = true;
        this.ah = false;
        d(0);
        iei.e(this.z);
    }

    public /* synthetic */ void f(View view) {
        if (qrs.e(view)) {
            LogUtil.a("Suggestion_TrainDetail", "GeneralTraining click too fast");
            return;
        }
        this.aq = false;
        this.ah = false;
        d(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i2) {
        LogUtil.a("Suggestion_TrainDetail", "mIsWorkoutDownloaded: ", Boolean.valueOf(this.ax), "select: ", Integer.valueOf(i2));
        if (bh()) {
            a(R.string.IDS_coach_language_change_hint, 0);
            ReleaseLogUtil.d("Suggestion_TrainDetail", "The current language setting of the mobile phone does not support this course.");
            return;
        }
        if (this.ax) {
            if (i() && i2 != 1) {
                q();
                return;
            } else if (i2 == 0) {
                p();
                return;
            } else {
                u();
                LogUtil.a("Suggestion_TrainDetail", "checkDeviceStatusAndStartTraining");
                return;
            }
        }
        z();
    }

    private boolean bh() {
        return (SportSupportUtil.b() || this.z.isRunModelCourse() || this.z.isLongVideoCourse()) ? false : true;
    }

    private void ar() {
        this.g.setVisibility(8);
        this.j.setTextSize(1, 28.0f);
        if (this.j.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
            layoutParams.removeRule(16);
            layoutParams.rightMargin = qrs.d(this.f, 8.0f);
            this.j.setLayoutParams(layoutParams);
        }
        if (this.f9135a.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f9135a.getLayoutParams();
            layoutParams2.removeRule(21);
            layoutParams2.addRule(14);
            layoutParams2.addRule(3, R.id.tv_connect_binding);
            this.f9135a.setLayoutParams(layoutParams2);
        }
    }

    private void ax() {
        this.be = (ImageView) findViewById(R.id.new_imageView);
        this.x = (HealthColumnRelativeLayout) findViewById(R.id.sug_download_view);
        this.n = (HealthCardView) findViewById(R.id.corresponding_week_unlock_course);
        this.cd = (RelativeLayout) findViewById(R.id.sug_download_rl);
        this.aw = (ImageView) findViewById(R.id.locked_course_img);
    }

    private void bb() {
        this.l = new hnc(this, this);
        this.r = new CourseDetailViewHolder(this);
        TrainActionIntro trainActionIntro = (TrainActionIntro) findViewById(R.id.sug_train_action_intro);
        this.ce = (LinearLayout) findViewById(R.id.ll_train_detail_content);
        hmt hmtVar = new hmt(this, trainActionIntro, this.ce, this);
        this.k = hmtVar;
        this.l.b(hmtVar);
        this.bu = (FrameLayout) findViewById(R.id.sug_traind_outer);
    }

    private void cv() {
        this.ab.b();
        if (isFreeCourse()) {
            d(a(false));
        } else {
            a(d(false));
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.CourseDetailProvider
    public boolean isFreeCourse() {
        FitWorkout fitWorkout;
        TrainDetailContract.Ipresenter ipresenter = this.bi;
        if (ipresenter == null || (fitWorkout = this.z) == null) {
            return true;
        }
        return ipresenter.isFreeCourses(hkt.b(fitWorkout));
    }

    private boolean d(boolean z) {
        CourseDetailViewHolder courseDetailViewHolder;
        xfz xfzVarB = this.ca.b(this.cb[1]);
        if (this.cf == 0 && (courseDetailViewHolder = this.r) != null) {
            boolean z2 = !z;
            this.ab.c(xfzVarB, courseDetailViewHolder.b(), z2);
            return z2;
        }
        if (this.bg == null) {
            NewViewDetailInfo newViewDetailInfo = new NewViewDetailInfo(this.f);
            this.bg = newViewDetailInfo;
            newViewDetailInfo.d(new ViewVideoPlayListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.29
                @Override // com.huawei.health.suggestion.ui.fitness.mvp.ViewVideoPlayListener
                public void startCoachPlay() {
                }

                @Override // com.huawei.health.suggestion.ui.fitness.mvp.ViewVideoPlayListener
                public void onVideoStartPlay() {
                    if (!TrainDetail.this.bd() || TrainDetail.this.ch == null) {
                        return;
                    }
                    TrainDetail.this.ch.g();
                }
            });
        }
        boolean z3 = !z;
        this.ab.c(xfzVarB, this.bg.b(), z3);
        return z3;
    }

    private boolean a(boolean z) {
        hnc hncVar;
        xfz xfzVarB = this.ca.b(this.cb[0]);
        if (!this.ao || (hncVar = this.l) == null) {
            return false;
        }
        boolean z2 = !z;
        this.ab.c(xfzVarB, hncVar.d(), z2);
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bd() {
        FitWorkout fitWorkout = this.z;
        return (fitWorkout == null || TextUtils.isEmpty(fitWorkout.getPreviewVideoUrl()) || this.z.acquireCommodityFlag() == 0) ? false : true;
    }

    public void e() {
        FitWorkout fitWorkout = this.z;
        if (fitWorkout == null) {
            LogUtil.e("Suggestion_TrainDetail", "bindNewDetailInfo mFitWorkout is null.");
            return;
        }
        this.cf = fitWorkout.getTemplateType();
        LayoutTemplateInfo layoutTemplateInfo = this.z.getLayoutTemplateInfo();
        int i2 = this.cf;
        if (i2 == 1 && layoutTemplateInfo != null) {
            cv();
            this.bg.a(layoutTemplateInfo);
            this.ab.notifyDataSetChanged();
            RecommendationBar recommendationBar = layoutTemplateInfo.getRecommendationBar();
            TrainDetailContract.Ipresenter ipresenter = this.bi;
            if (ipresenter == null || recommendationBar == null) {
                return;
            }
            ipresenter.getRecommendationList(recommendationBar.getRecommendationWorkouts());
            return;
        }
        LogUtil.a("Suggestion_TrainDetail", "bindNewDetailInfo templateType:", Integer.valueOf(i2));
    }

    private void aw() {
        ReleaseLogUtil.d("Suggestion_TrainDetail", "initCollectionBehaveView message enter");
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.titlebar_panel);
        this.t = customTitleBar;
        customTitleBar.setTitleText("");
        this.o = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        av();
        this.t.setRightSoftkeyBackground(getResources().getDrawable(R.drawable.ic_collect_normal), qre.f(R.string.IDS_FitnessAdvice_collected_no_toast));
        this.t.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: hhq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36743a.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LoginInit.getInstance(this.f).browsingToLogin(new him(this, 0), "");
        } else {
            d();
        }
    }

    private void av() {
        if (EnvironmentInfo.m()) {
            return;
        }
        this.t.setRightButtonDrawable(getResources().getDrawable(R.drawable.sug_push_to_watch), qre.f(R.string.IDS_device_title_use));
        this.t.setRightTextButtonOnClickListener(new View.OnClickListener() { // from class: hhc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        this.m.j();
    }

    private void at() {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.a("Suggestion_TrainDetail", "isBrowseMode.can not share.");
            return;
        }
        if (LanguageUtil.ba(this)) {
            this.t.setRightFourKeyBackground(qqz.e(this, R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        } else {
            this.t.setRightFourKeyBackground(getResources().getDrawable(R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        }
        this.t.setRightFourKeyOnClickListener(new View.OnClickListener() { // from class: hhb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        if (this.z == null) {
            LogUtil.j("Suggestion_TrainDetail", "on shared click, mFitWorkout is null");
            return;
        }
        if (this.bs == null) {
            this.bs = new hkn();
        }
        this.bs.a(this, !TextUtils.isEmpty(this.z.acquireName()) ? this.z.acquireName() : StringUtils.c((Object) this.bq.acquireWorkoutName()), this.aa, this.z);
    }

    private void bu() {
        this.v.setOnClickListener(new View.OnClickListener() { // from class: hhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36742b.i(view);
            }
        });
    }

    public /* synthetic */ void i(View view) {
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        this.ar = true;
        if (bh()) {
            a(R.string.IDS_coach_language_change_hint, 0);
            LogUtil.j("Suggestion_TrainDetail", "setListener() mDownloadWidget onClick is not open fitness course");
        } else if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LoginInit.getInstance(this.f).browsingToLogin(new him(this, 1), "");
        } else if (qrs.c(500)) {
            LogUtil.j("Suggestion_TrainDetail", "TrainDetail is fast click");
        } else {
            x();
        }
    }

    private void x() {
        CourseControlManager.checkMultilingualAudio(this.f, this.z, new UiCallback<Integer>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Integer num) {
                TrainDetail.this.ad();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j("Suggestion_TrainDetail", "checkUserInfo : userProfileMgrApi is null.");
        } else {
            userProfileMgrApi.checkUserInfo(this, new IBaseResponseCallback() { // from class: hhf
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f36737a.d(i2, obj);
                }
            });
        }
    }

    public /* synthetic */ void d(int i2, Object obj) {
        if (i2 != 0) {
            WorkoutRecord workoutRecord = this.bq;
            if (workoutRecord == null) {
                LogUtil.j("Suggestion_TrainDetail", "checkUserInfo : mRecord is null.");
            } else {
                if (TextUtils.isEmpty(workoutRecord.acquirePlanId())) {
                    if (this.ae == null) {
                        this.ae = new IntPlanPreSportRemind(this);
                    }
                    this.ae.c(this.cn, new IntPlanPreSportRemind.Action() { // from class: hhn
                        @Override // com.huawei.health.suggestion.ui.fitness.helper.IntPlanPreSportRemind.Action
                        public final void execute() {
                            this.f36741b.f();
                        }
                    });
                    return;
                }
                f();
            }
        }
    }

    public boolean i() {
        FitWorkout fitWorkout = this.z;
        if (fitWorkout != null) {
            return fitWorkout.isRunModelCourse();
        }
        return false;
    }

    public boolean g() {
        FitWorkout fitWorkout = this.z;
        if (fitWorkout == null) {
            LogUtil.j("Suggestion_TrainDetail", " mFitWorkout is null");
            return false;
        }
        return ien.d(fitWorkout);
    }

    private boolean bf() {
        return (!g() || this.z.isCustomCourse() || EnvironmentInfo.m()) ? false : true;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        LogUtil.a("Suggestion_TrainDetail", "initViewController()");
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        LogUtil.a("Suggestion_TrainDetail", "initData1:", Long.valueOf(System.currentTimeMillis()));
        ao();
    }

    private void ao() {
        Intent intent = getIntent();
        if (intent == null) {
            ReleaseLogUtil.d("Suggestion_TrainDetail", "havePermissionToGetData from others");
            ak();
        } else {
            c(intent);
        }
    }

    private void c(Intent intent) {
        if (this.cg.z()) {
            ReleaseLogUtil.d("Suggestion_TrainDetail", "havePermissionToGetData from scheme");
            try {
                a(intent);
                return;
            } catch (BadParcelableException e2) {
                LogUtil.e("Suggestion_TrainDetail", "havePermissionToGetData BadParcelableException", LogAnonymous.b(e2));
                return;
            }
        }
        b(intent);
    }

    private void e(boolean z) {
        if (this.cg.i() == -1) {
            this.av.setText(R.string.IDS_plugin_course_unlock_after_plan);
            d(this.aw, 0);
        } else {
            if (this.cg.i() == -2) {
                this.av.setText(R.string.sug_home_overdueplan);
                if (z) {
                    this.n.setAlpha(1.0f);
                    this.n.setOnClickListener(new View.OnClickListener() { // from class: hhl
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f36740b.l(view);
                        }
                    });
                    return;
                }
                return;
            }
            this.av.setText(R.string.IDS_plugin_course_completed);
        }
    }

    public /* synthetic */ void l(View view) {
        WorkoutRecord workoutRecord = this.bq;
        if (workoutRecord != null) {
            workoutRecord.savePlanId("");
        }
        z();
    }

    private void a(Intent intent) {
        String stringExtra = intent.getStringExtra("version");
        String stringExtra2 = intent.getStringExtra("workoutid");
        if (TextUtils.isEmpty(stringExtra)) {
            ReleaseLogUtil.e("Suggestion_TrainDetail", "havePermissionToGetData from scheme and workid is null or empty");
            return;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "";
        }
        CourseApi courseApi = this.o;
        if (courseApi == null) {
            LogUtil.j("Suggestion_TrainDetail", "havePermissionToGetData: mCourseApi is null.");
        } else {
            courseApi.getCourseById(new gzl.a(stringExtra2).d(stringExtra).c(), new g(this));
        }
    }

    private void b(Intent intent) {
        Uri data = intent.getData();
        LogUtil.a("Suggestion_TrainDetail", "uri", data);
        if (data == null) {
            ak();
            return;
        }
        try {
            String queryParameter = data.getQueryParameter("id");
            CourseApi courseApi = this.o;
            if (courseApi == null) {
                LogUtil.j("Suggestion_TrainDetail", "havePermissionToGetData: mCourseApi is null.");
            } else {
                courseApi.getCourseById(new gzl.a(queryParameter).c(), new g(this));
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.e("Suggestion_TrainDetail", "goFitnessPage IllegalArgumentException");
        } catch (UnsupportedOperationException unused2) {
            LogUtil.e("Suggestion_TrainDetail", "goFitnessPage UnsupportedOperationException");
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class g extends UiCallback<Workout> {
        private WeakReference<TrainDetail> d;

        g(TrainDetail trainDetail) {
            this.d = new WeakReference<>(trainDetail);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.e("Suggestion_TrainDetail", "GetWorkoutCallback onFailure ", Integer.valueOf(i));
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Workout workout) {
            if (workout == null) {
                ReleaseLogUtil.e("Suggestion_TrainDetail", "GetWorkoutCallback onSuccess data is null ");
                return;
            }
            FitWorkout fitWorkoutD = pea.d(workout);
            WeakReference<TrainDetail> weakReference = this.d;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if (!hcg.e().d()) {
                ReleaseLogUtil.e("Suggestion_TrainDetail", "PluginSuggestionHelper not isInitComplete");
                return;
            }
            idy.a((String) null);
            WorkoutRecord workoutRecord = new WorkoutRecord();
            workoutRecord.saveVersion(fitWorkoutD.accquireVersion());
            workoutRecord.saveExerciseTime(new Date().getTime());
            workoutRecord.saveWorkoutId(fitWorkoutD.acquireId());
            workoutRecord.saveWorkoutName(fitWorkoutD.acquireName());
            workoutRecord.savePlanId("");
            workoutRecord.saveVersion(fitWorkoutD.accquireVersion());
            workoutRecord.saveCalorie(fitWorkoutD.acquireCalorie());
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(workoutRecord);
            TrainDetail trainDetail = this.d.get();
            if (trainDetail != null) {
                trainDetail.bo = arrayList;
                trainDetail.ak();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, int i2, UiCallback<LongVideoInfo> uiCallback) {
        if (uiCallback == null) {
            uiCallback = new c(this, z, i2);
        }
        CourseApi courseApi = this.o;
        if (courseApi != null) {
            courseApi.getCourseLongVideoInfo(new gzl.a(this.cn).c(1).c(), uiCallback);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class c extends UiCallback<LongVideoInfo> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<TrainDetail> f9157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f9158c;
        private int d;

        c(TrainDetail trainDetail, boolean z, int i) {
            this.f9157b = new WeakReference<>(trainDetail);
            this.f9158c = z;
            this.d = i;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.e("Suggestion_TrainDetail", "getCourseLongVideoInfo:", Integer.valueOf(i), str);
            TrainDetail trainDetail = this.f9157b.get();
            if (trainDetail != null) {
                trainDetail.b(String.valueOf(i));
            } else {
                LogUtil.j("Suggestion_TrainDetail", "GetLongVideoUiCallback onFailure trainDetail is null");
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(LongVideoInfo longVideoInfo) {
            if (longVideoInfo == null) {
                ReleaseLogUtil.e("Suggestion_TrainDetail", "getLongVideo startLongCoachActivity data.getUrl:url is null");
                return;
            }
            boolean z = this.f9158c;
            if (!z) {
                LogUtil.j("Suggestion_TrainDetail", "GetLongVideoUiCallback onSuccess mIsStartLongCoachActivity = ", Boolean.valueOf(z));
                return;
            }
            TrainDetail trainDetail = this.f9157b.get();
            if (trainDetail != null) {
                trainDetail.b(0);
                trainDetail.ba = longVideoInfo.getUrl();
                trainDetail.ay = this.d;
                if (TextUtils.isEmpty(longVideoInfo.getSubtitlesUrl())) {
                    trainDetail.r();
                } else {
                    trainDetail.az = longVideoInfo.getSubtitlesUrl();
                    trainDetail.am();
                }
                ReleaseLogUtil.d("Suggestion_TrainDetail", "getLongVideo startLongCoachActivity URL has been obtained");
                return;
            }
            LogUtil.j("Suggestion_TrainDetail", "GetLongVideoUiCallback onSuccess trainDetail is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        int i2;
        CourseApi courseApi;
        ArrayList<WorkoutRecord> arrayList = this.bo;
        if (arrayList == null || this.s >= arrayList.size() || (i2 = this.s) < 0) {
            ReleaseLogUtil.e("Suggestion_TrainDetail", "intent.getParcelableArrayListExtra(Constants.WORKOUT_RECORD_OLD) is null");
            finish();
            return;
        }
        WorkoutRecord workoutRecord = this.bo.get(i2);
        this.bq = workoutRecord;
        this.m.b(workoutRecord);
        if (w()) {
            return;
        }
        ReleaseLogUtil.d("Suggestion_TrainDetail", "id:", this.bq.acquireWorkoutId(), "-workoutname:", this.bq.acquireWorkoutName());
        CoachData coachData = new CoachData();
        this.d = coachData;
        coachData.saveWorkId(this.cn);
        this.d.savePlanId(this.bq.acquirePlanId());
        be();
        if (this.cg.w() == 1 && (courseApi = this.o) != null) {
            this.al = false;
            courseApi.getCourseById(new gzl.a(this.cn).d(this.bq.acquireVersion()).d(this.cg.w()).c(), new f(this));
            LogUtil.a("Suggestion_TrainDetail", "getCurrentRecord is userDefinedType");
            return;
        }
        lsy.a(new Runnable() { // from class: hgz
            @Override // java.lang.Runnable
            public final void run() {
                this.d.h();
            }
        });
    }

    public /* synthetic */ void h() {
        CourseApi courseApi = this.o;
        if (courseApi != null) {
            courseApi.isCourseCollected(this.cn, new b(this));
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class b extends UiCallback<Boolean> {
        private WeakReference<TrainDetail> e;

        b(TrainDetail trainDetail) {
            this.e = null;
            this.e = new WeakReference<>(trainDetail);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            TrainDetail trainDetail = this.e.get();
            if (trainDetail != null) {
                trainDetail.al = false;
                if (trainDetail.o != null) {
                    trainDetail.o.getCourseById(new gzl.a(trainDetail.cn).d(trainDetail.bq.acquireVersion()).d(trainDetail.cg.w()).c(), new f(trainDetail));
                    return;
                }
                return;
            }
            LogUtil.j("Suggestion_TrainDetail", "CollectUiCallback onFailure mTrainDetail is null ", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            TrainDetail trainDetail = this.e.get();
            if (trainDetail != null) {
                trainDetail.al = bool.booleanValue();
                if (trainDetail.o != null) {
                    trainDetail.o.getCourseById(new gzl.a(trainDetail.cn).d(trainDetail.bq.acquireVersion()).d(trainDetail.cg.w()).c(), new f(trainDetail));
                    return;
                }
                return;
            }
            LogUtil.j("Suggestion_TrainDetail", "CollectUiCallback onSuccess mTrainDetail is null ");
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class f extends UiCallback<Workout> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<TrainDetail> f9161b;

        f(TrainDetail trainDetail) {
            this.f9161b = null;
            this.f9161b = new WeakReference<>(trainDetail);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_TrainDetail", str);
            TrainDetail trainDetail = this.f9161b.get();
            if (trainDetail != null) {
                Handler handler = trainDetail.ag;
                if (handler != null) {
                    if (trainDetail.z != null) {
                        trainDetail.bq.saveVersion(trainDetail.z.accquireVersion());
                        if (trainDetail.z.isNewRunCourse()) {
                            LogUtil.a("Suggestion_TrainDetail", "isNewRunCourse.");
                            c(trainDetail.z, trainDetail);
                            handler.sendEmptyMessage(9);
                        } else {
                            handler.sendEmptyMessage(10);
                            c(trainDetail.z, trainDetail);
                            if (trainDetail.g() && !trainDetail.z.acquireId().equals("R011R")) {
                                Message messageObtainMessage = handler.obtainMessage(0);
                                messageObtainMessage.arg1 = 1;
                                handler.sendMessage(messageObtainMessage);
                            } else {
                                Message messageObtainMessage2 = handler.obtainMessage(0);
                                messageObtainMessage2.arg1 = 0;
                                handler.sendMessage(messageObtainMessage2);
                            }
                        }
                        LogUtil.a("Suggestion_TrainDetail", "have local data");
                        trainDetail.af();
                        return;
                    }
                    LogUtil.a("Suggestion_TrainDetail", "WorkoutUiCallback > onFailure> mFitWorkout is null");
                    handler.sendEmptyMessage(6);
                    Message messageObtainMessage3 = handler.obtainMessage(0);
                    messageObtainMessage3.arg1 = 0;
                    handler.sendMessage(messageObtainMessage3);
                    return;
                }
                LogUtil.j("Suggestion_TrainDetail", "WorkoutUiCallback onFailure handler is null ");
                return;
            }
            ReleaseLogUtil.e("Suggestion_TrainDetail", "WorkoutUiCallback onFailure mTrainDetail is null", str);
        }

        private void c(FitWorkout fitWorkout, TrainDetail trainDetail) {
            if (fitWorkout == null || trainDetail == null) {
                LogUtil.j("Suggestion_TrainDetail", "buildLongVideoAndShowCourseList fitWorkout or trainDetail is null");
                return;
            }
            if (fitWorkout.isLongVideoCourse()) {
                trainDetail.ao = fitWorkout.getWorkoutActionProperty() != 0;
            }
            if (trainDetail.isLongVideoCourse()) {
                trainDetail.f(fitWorkout);
            } else {
                trainDetail.g(fitWorkout);
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Workout workout) {
            TrainDetail trainDetail = this.f9161b.get();
            if (trainDetail != null) {
                Handler handler = trainDetail.ag;
                if (handler == null) {
                    LogUtil.j("Suggestion_TrainDetail", "WorkoutUiCallback onSuccess handler is null ");
                    return;
                }
                FitWorkout fitWorkoutD = pea.d(workout);
                if (gzx.e(fitWorkoutD)) {
                    trainDetail.z = fitWorkoutD;
                    trainDetail.m.b(fitWorkoutD);
                    trainDetail.bq.saveVersion(trainDetail.z.accquireVersion());
                    if (!trainDetail.z.isNewRunCourse()) {
                        trainDetail.d.setPrimaryClassify(fitWorkoutD.getPrimaryClassify());
                        handler.sendEmptyMessage(10);
                        c(fitWorkoutD, trainDetail);
                        e(handler, trainDetail, fitWorkoutD);
                        return;
                    }
                    LogUtil.a("Suggestion_TrainDetail", "isNewRunCourse.");
                    c(fitWorkoutD, trainDetail);
                    handler.sendEmptyMessage(9);
                    if (trainDetail.bi != null) {
                        trainDetail.bi.initTradeView(fitWorkoutD);
                        return;
                    }
                    return;
                }
                LogUtil.e("Suggestion_TrainDetail", "---onSuccess FitWorkout==null");
                handler.sendEmptyMessage(6);
                Message messageObtainMessage = handler.obtainMessage(0);
                messageObtainMessage.arg1 = 0;
                handler.sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.j("Suggestion_TrainDetail", "WorkoutUiCallback onSuccess mTrainDetail is null ");
        }

        private void e(Handler handler, TrainDetail trainDetail, FitWorkout fitWorkout) {
            if (trainDetail.g() && !trainDetail.z.acquireId().equals("R011R")) {
                Message messageObtainMessage = handler.obtainMessage(0);
                messageObtainMessage.arg1 = 1;
                handler.sendMessage(messageObtainMessage);
            } else {
                Message messageObtainMessage2 = handler.obtainMessage(0);
                messageObtainMessage2.arg1 = 0;
                handler.sendMessage(messageObtainMessage2);
            }
            if (trainDetail.bi != null) {
                trainDetail.bi.initTradeView(fitWorkout);
            }
            if (fitWorkout.getLayoutTemplateInfo() != null) {
                handler.sendMessage(handler.obtainMessage(8));
                LogUtil.a("Suggestion_TrainDetail", "getLayoutTemplateInfo() is not null");
            }
            Message messageObtainMessage3 = handler.obtainMessage(13);
            messageObtainMessage3.obj = Integer.valueOf(fitWorkout.getAntiScreenRecording());
            handler.sendMessage(messageObtainMessage3);
            if (trainDetail.bd()) {
                handler.sendMessage(handler.obtainMessage(11));
            } else {
                handler.sendMessage(handler.obtainMessage(12));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2) {
        hmf hmfVar;
        LogUtil.a("Suggestion_TrainDetail", " showStart() downLoadViewVisibility:", Integer.valueOf(i2));
        if (this.z == null || ((hmfVar = this.cg) != null && !TextUtils.isEmpty(hmfVar.o()))) {
            LogUtil.j("Suggestion_TrainDetail", " showStart() mFitWorkout is null", this.cg.o());
            return;
        }
        this.x.setVisibility(i2);
        b(i2, hkt.c(this.z.getIsAi()), CourseEquipmentConnectionTipsUtil.e(this.z, this.cg.j()));
        a(getResources().getString(R.string.sug_start_train));
    }

    private void b(int i2, boolean z, int i3) {
        if (z && this.n.getVisibility() == 8) {
            this.f9136b.setVisibility(0);
            this.v.setVisibility(8);
        } else if (i3 != 0 && this.n.getVisibility() == 8) {
            bv();
        } else {
            this.f9136b.setVisibility(8);
            this.v.setVisibility(i2);
        }
    }

    private void bv() {
        this.f9136b.setVisibility(0);
        this.v.setVisibility(8);
        this.bz.setVisibility(0);
        this.h.setVisibility(0);
        this.ai.setVisibility(8);
        this.af.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bq() {
        if (this.bo.size() > 1) {
            if (gzx.e(this.e, this.l, this.r, this.bk)) {
                AutoFillColorView autoFillColorView = this.e;
                if (autoFillColorView != null) {
                    autoFillColorView.d(new ColorDrawable(-1));
                }
                AutoFillColorView autoFillColorView2 = this.bk;
                if (autoFillColorView2 != null) {
                    autoFillColorView2.d(new ColorDrawable(-1));
                }
                this.g.setText("");
                hna hnaVar = this.bf;
                if (hnaVar != null) {
                    hnaVar.e();
                }
                hna hnaVar2 = this.br;
                if (hnaVar2 != null) {
                    hnaVar2.e();
                }
                this.l.c(4);
                this.r.d(4);
                this.x.setVisibility(4);
            }
            this.ax = false;
        }
        ReleaseLogUtil.d("Suggestion_TrainDetail", "setDataError workoutName:", this.bq.acquireWorkoutName());
        this.t.setTitleText(this.bq.acquireWorkoutName());
        this.mLoadingView.setVisibility(8);
        this.ac.setVisibility(0);
        d(findViewById(R.id.non_trial_header), 0);
        d(findViewById(R.id.sug_fitness_rl_2), 0);
    }

    private void j(FitWorkout fitWorkout) {
        k(fitWorkout);
        n(fitWorkout);
        by();
        e(fitWorkout);
        k();
        s();
        ct();
        l();
        bk();
        ck();
    }

    private void e(FitWorkout fitWorkout) {
        hna hnaVar = this.bf;
        if (hnaVar != null) {
            hnaVar.e(fitWorkout);
        }
        hna hnaVar2 = this.br;
        if (hnaVar2 != null) {
            hnaVar2.e(fitWorkout);
        }
    }

    private void n(FitWorkout fitWorkout) {
        a(fitWorkout);
        c(fitWorkout);
    }

    private void ct() {
        SportServiceApi sportServiceApi;
        if (!i() || (sportServiceApi = (SportServiceApi) Services.d("CoursePlanService", SportServiceApi.class)) == null) {
            return;
        }
        sportServiceApi.setLastUseOrWatchCourse("last_watch_run_course", System.currentTimeMillis(), this.z);
    }

    private void s() {
        if (!TextUtils.isEmpty(this.z.acquireName())) {
            this.t.setTitleText(this.z.acquireName());
        } else {
            this.t.setTitleText(StringUtils.c((Object) this.bq.acquireWorkoutName()));
        }
    }

    private void l() {
        if (!TextUtils.isEmpty(this.z.acquireDescription())) {
            this.g.setText(this.z.acquireDescription().replaceAll(System.lineSeparator(), ""));
        } else {
            this.g.setText("");
        }
    }

    private void k() {
        this.e = (AutoFillColorView) findViewById(R.id.auto_fill_color_view);
        this.bk = (AutoFillColorView) findViewById(R.id.auto_fill_color_view_preview);
        hkt.d(this.z.acquireMidPicture(), this.z.acquirePicture(), this.e);
        hkt.d(this.z.acquireMidPicture(), this.z.acquirePicture(), this.bk);
    }

    private void ck() {
        if (isFinishing() || isDestroyed()) {
            LogUtil.j("Suggestion_TrainDetail", "showSeriesCourseTip is Destroyed");
            return;
        }
        if (CommonUtil.j(this.cg.j()) == 1) {
            LogUtil.j("Suggestion_TrainDetail", "showSeriesCourseTip() series course H5");
            return;
        }
        final BelongInfo courseBelongInfoByType = this.z.getCourseBelongInfoByType(0);
        if (courseBelongInfoByType == null) {
            LogUtil.j("Suggestion_TrainDetail", "showSeriesCourseTip() course is not series");
            return;
        }
        int iB = hkt.b(this.z);
        LogUtil.a("Suggestion_TrainDetail", "showSeriesCourseTip() commodityFlag:", Integer.valueOf(iB));
        if (iB == 0 || iB == 2) {
            LogUtil.j("Suggestion_TrainDetail", "showSeriesCourseTip() FREE_COURSE or MEMBER_COURSE no showSeriesCourseTip");
            return;
        }
        ViewStub viewStub = (ViewStub) findViewById(R.id.viewStub_tip);
        if (viewStub == null) {
            LogUtil.j("Suggestion_TrainDetail", "showSeriesCourseTip() mViewStubTip is null");
            return;
        }
        if (this.cc == null && viewStub.getParent() != null) {
            LogUtil.a("Suggestion_TrainDetail", "showSeriesCourseTip() mTipsView is null");
            this.cc = viewStub.inflate();
        }
        View view = this.cc;
        if (view == null) {
            LogUtil.j("Suggestion_TrainDetail", "showSeriesCourseTip() mTipsView == null");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.sug_series_course_name);
        if (healthTextView != null) {
            healthTextView.setText(getResources().getString(R.string.IDS_sug_series_course_detail_tip, courseBelongInfoByType.getName()));
        }
        LinearLayout linearLayout = (LinearLayout) this.cc.findViewById(R.id.layout_tip);
        if (linearLayout == null) {
            LogUtil.j("Suggestion_TrainDetail", "showSeriesCourseTip() tipsLayout == null");
        } else {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    JumpUtil.a(TrainDetail.this, courseBelongInfoByType.getId());
                }
            });
        }
    }

    private void k(FitWorkout fitWorkout) {
        ab();
        b(fitWorkout);
    }

    private void b(FitWorkout fitWorkout) {
        ImageView imageView = this.be;
        if (imageView == null) {
            LogUtil.j("Suggestion_TrainDetail", "bindNewPicView mNewPic == null");
            return;
        }
        imageView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = this.be.getLayoutParams();
        if (LanguageUtil.o(this.f) || LanguageUtil.q(this.f)) {
            layoutParams.height = -2;
            ien.a(fitWorkout, this.be);
        }
        List<PriceTagBean> listAcquirePriceTagBeanList = fitWorkout.acquirePriceTagBeanList();
        if (fitWorkout.getCornerImgDisplay() == 1 && listAcquirePriceTagBeanList != null) {
            String strE = pea.e(listAcquirePriceTagBeanList);
            if (!TextUtils.isEmpty(strE)) {
                this.be.setVisibility(0);
                layoutParams.height = (int) this.be.getResources().getDimension(R.dimen.health_common_21dp);
                qqf.b(strE, this.be, 0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        this.be.setLayoutParams(layoutParams);
    }

    private void a(FitWorkout fitWorkout) {
        if ((i() && !Utils.j()) || CommonUtil.ca()) {
            this.t.setRightSoftkeyVisibility(8);
            return;
        }
        if (fitWorkout != null && !fitWorkout.isCourseLibraryShow()) {
            this.t.setRightSoftkeyVisibility(8);
            return;
        }
        if (this.al) {
            this.t.setRightSoftkeyBackground(getResources().getDrawable(R.drawable.ic_collect_press), qre.f(R.string.IDS_course_collect_des));
        } else {
            this.t.setRightSoftkeyBackground(getResources().getDrawable(R.drawable.ic_collect_normal), qre.f(R.string.IDS_FitnessAdvice_collected_no_toast));
        }
        this.t.setRightSoftkeyVisibility(0);
    }

    private void c(FitWorkout fitWorkout) {
        if (SportSupportUtil.h() || fitWorkout.isRunModelCourse()) {
            this.t.setRightFourKeyVisibility(8);
        } else if (fitWorkout.isCourseLibraryShow()) {
            this.t.setRightFourKeyVisibility(0);
        }
    }

    private void ab() {
        if (CourseControlManager.isSupportFaController(this.z.getSmartScreeFlag())) {
            this.ag.sendMessage(this.ag.obtainMessage(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bz() {
        LogUtil.a("Suggestion_TrainDetail", "enter showCirculatingBubble");
        if (isFinishing()) {
            LogUtil.a("Suggestion_TrainDetail", "showCirculatingBubble is Finishing");
        } else if (!hih.b()) {
            LogUtil.a("Suggestion_TrainDetail", "no need to show FaRemind");
        } else {
            ((DistributedApi) Services.b("DistributedService", DistributedApi.class)).getAvailableFaDevice(new hih(this));
        }
    }

    private void by() {
        if (bf()) {
            this.m.e(new IBaseResponseCallback() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    ReleaseLogUtil.d("Suggestion_TrainDetail", "showBondDeviceLayout() status = ", obj);
                    if (obj instanceof Integer) {
                        TrainDetail.this.e(((Integer) obj).intValue());
                    }
                }
            });
        } else {
            ReleaseLogUtil.d("Suggestion_TrainDetail", "showBondDeviceLayout()", "isRunWorkoutOfHeartRate() = false");
            this.at.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2) {
        this.at.setVisibility(0);
        if (i2 == 1) {
            this.j.setText(R.string.IDS_plugin_fitnessadvice_connect_msg);
            this.f9135a.setText(R.string.IDS_plugin_fitnessadvice_connect_device);
            this.f9135a.setOnClickListener(new View.OnClickListener() { // from class: hgy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f36733c.g(view);
                }
            });
        } else if (i2 == 2) {
            this.j.setText(R.string.IDS_plugin_fitnessadvice_need_device);
            this.f9135a.setText(R.string.IDS_plugin_fitnessadvice_undestance_device);
            this.f9135a.setOnClickListener(new View.OnClickListener() { // from class: hhi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.h(view);
                }
            });
        } else if (i2 == 3) {
            this.m.f();
            this.at.setVisibility(8);
        } else {
            this.at.setVisibility(8);
        }
    }

    public /* synthetic */ void g(View view) {
        hjd hjdVar = this.m;
        if (hjdVar != null) {
            hjdVar.g();
        }
    }

    public /* synthetic */ void h(View view) {
        hjd hjdVar = this.m;
        if (hjdVar != null) {
            hjdVar.a(this.f);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        hjd hjdVar = this.m;
        if (hjdVar != null) {
            hjdVar.d(i2, i3, intent);
        }
        TrainDetailContract.Ipresenter ipresenter = this.bi;
        if (ipresenter != null) {
            ipresenter.onActivityResult(i2, i3, intent);
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        by();
    }

    private String as() {
        if (this.z == null) {
            ReleaseLogUtil.e("Suggestion_TrainDetail", "getUsers_mFitWorkout_null");
            return "";
        }
        return gzx.d(com.huawei.health.basefitnessadvice.R.plurals.sug_fitness_personjoin, this.z.acquireUsers(), UnitUtil.e(this.z.acquireUsers(), 1, 0));
    }

    private String an() {
        FitWorkout fitWorkout = this.z;
        if (fitWorkout == null) {
            ReleaseLogUtil.e("Suggestion_TrainDetail", "getExerciseTimes_mFitWorkout = null");
            return "";
        }
        int iAcquireExerciseTimes = fitWorkout.acquireExerciseTimes();
        if (iAcquireExerciseTimes == 0) {
            return as();
        }
        return gzx.d(R.plurals.sug_fit_finish, iAcquireExerciseTimes, Integer.valueOf(iAcquireExerciseTimes));
    }

    private void bk() {
        Map<String, pcs> mapE = ien.e(this.z);
        if (!mapE.isEmpty()) {
            this.r.b(mapE);
        }
        this.r.b(this.z.getSupplierLogoUrl());
        TrainDetailContract.Ipresenter ipresenter = this.bi;
        if (ipresenter != null) {
            ipresenter.initNoticeContent(this.z.getBuyNotesTitle(), this.z.getBuyNotesUrl());
        }
        this.r.a(gzx.a(this.z.acquireEquipments()));
        btt.d().c(new h(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ap() {
        List<gzl> listC = pea.c(pea.b(this.z));
        if (listC.size() == 0) {
            ReleaseLogUtil.e("Suggestion_TrainDetail", "no relative courses");
        } else if (this.o == null) {
            LogUtil.j("Suggestion_TrainDetail", "getRelativeCourses: mCourseApi is null.");
        } else {
            this.o.getCourseByIds(listC, false, new i(this));
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class i extends UiCallback<List<FitWorkout>> {
        private WeakReference<TrainDetail> d;

        i(TrainDetail trainDetail) {
            this.d = new WeakReference<>(trainDetail);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.e("Suggestion_TrainDetail", "GetRelativeCoursesUiCallback onFailure ", Integer.valueOf(i));
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<FitWorkout> list) {
            ReleaseLogUtil.d("Suggestion_TrainDetail", "getWorkout onSuccess");
            TrainDetail trainDetail = this.d.get();
            if (trainDetail != null) {
                trainDetail.r.d(list);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(FitWorkout fitWorkout) {
        LogUtil.a("Suggestion_TrainDetail", "newLongWorkout:", Long.valueOf(System.currentTimeMillis()));
        af();
        iei.a(fitWorkout, i(fitWorkout));
        j(fitWorkout);
        this.ac.setVisibility(8);
        m(fitWorkout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(FitWorkout fitWorkout) {
        LogUtil.a("Suggestion_TrainDetail", "-----refreshHeadUi:", Long.valueOf(System.currentTimeMillis()));
        af();
        iei.a(fitWorkout, i(fitWorkout));
        if (!fitWorkout.isNewRunCourse()) {
            j(fitWorkout);
        }
        this.ac.setVisibility(8);
        int iE = ied.e();
        this.aa = iE;
        LogUtil.a("Suggestion_TrainDetail", "newWorkout : mGender: ", Integer.valueOf(iE));
        if (fitWorkout.getCourseAttr() != 2) {
            this.aa = fitWorkout.getCourseAttr();
        }
        btt.d().c(new d(this, fitWorkout, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(FitWorkout fitWorkout) {
        float fD = pea.d(this.cn);
        this.u = fD;
        if (fD == 1.0f) {
            ReleaseLogUtil.e("Suggestion_TrainDetail", "have download progress: mDownloaded == 1 ");
            this.u = 0.0f;
        }
        float f2 = this.u;
        float f3 = 1.0f - f2;
        this.ci = f3;
        ReleaseLogUtil.d("Suggestion_TrainDetail", "have download progress: ", Float.valueOf(f2), " --left: ", Float.valueOf(f3));
        CourseApi courseApi = this.o;
        if (courseApi == null) {
            LogUtil.j("Suggestion_TrainDetail", "downloadWorkout : mCourseApi is null.");
            return;
        }
        try {
            boolean z = courseApi.getCourseMediaFilesLength(this.cn, this.bq.acquireVersion()) == 0;
            this.ax = z;
            ReleaseLogUtil.d("Suggestion_TrainDetail", "-----refreshProgressButton----", Boolean.valueOf(z), "The true is down");
        } catch (Exception e2) {
            ReleaseLogUtil.a("Suggestion_TrainDetail", "newWorkout refreshProgressButton", LogAnonymous.b(e2));
        }
        m(fitWorkout);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                if (intent.getBooleanExtra("IS_START_DOWNLOAD_WORKOUT", false)) {
                    this.ag.sendMessage(this.ag.obtainMessage(104));
                }
            } catch (BadParcelableException e3) {
                LogUtil.e("Suggestion_TrainDetail", "downloadWorkout BadParcelableException", LogAnonymous.b(e3));
            }
        }
    }

    private Map<String, Object> i(FitWorkout fitWorkout) {
        HashMap map = new HashMap(this.cg.a());
        map.put("resourceType", Integer.valueOf(hkt.b(fitWorkout)));
        String strE = this.cg.e();
        if ("entrance_custom_course".equals(strE)) {
            strE = "10";
        }
        map.put("entrance", strE);
        map.put("supportDevice", Integer.valueOf(CourseEquipmentConnectionTipsUtil.a(CourseEquipmentConnectionTipsUtil.e(this.z, this.cg.j()))));
        return map;
    }

    private void m(FitWorkout fitWorkout) {
        ArrayList<Motion> arrayListH = h(fitWorkout);
        TrainDetailContract.Ipresenter ipresenter = this.bi;
        if (ipresenter != null && !ipresenter.isFreeCourses(fitWorkout.acquireCommodityFlag()) && !CommonUtil.ab(this.f)) {
            LogUtil.a("Suggestion_TrainDetail", "setMotionsRun > is not Connected");
            this.ag.sendEmptyMessage(6);
            return;
        }
        if (isLongVideoCourse() && !this.ao) {
            this.ag.sendEmptyMessage(7);
        }
        if (njy.b(arrayListH)) {
            ReleaseLogUtil.d("Suggestion_TrainDetail", "Child thread conversion data:", Long.valueOf(System.currentTimeMillis()));
            this.ag.sendMessage(Message.obtain(this.ag, 5, arrayListH));
            if (this.cg.ah()) {
                if (this.ax) {
                    ReleaseLogUtil.d("Suggestion_TrainDetail", "-----EXCUTE COARSE IMMEDIATE:", Long.valueOf(System.currentTimeMillis()));
                    if (isLongVideoCourse()) {
                        a(true, this.z.getWorkoutActionProperty(), null);
                        return;
                    } else {
                        aj();
                        return;
                    }
                }
                LogUtil.j("Suggestion_TrainDetail", "-----course have not download，pls download first:", Long.valueOf(System.currentTimeMillis()));
                hoy.c().c(this.cg.f());
                return;
            }
            return;
        }
        ReleaseLogUtil.e("Suggestion_TrainDetail", "fitness data error");
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.3
            @Override // java.lang.Runnable
            public void run() {
                TrainDetail.this.a(R.string.sug_haveno_network, 0);
                TrainDetail.this.showErrorLayout();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bx() {
        try {
            e();
        } catch (SecurityException unused) {
            LogUtil.e("Suggestion_TrainDetail", "SecurityException exception showDetailInfo");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cl() {
        if (this.z == null) {
            ReleaseLogUtil.e("Suggestion_TrainDetail", "showVipPreview mFitWorkout = null");
            return;
        }
        try {
            if (bd()) {
                if (this.ch == null) {
                    this.ch = new hhv(this, this.bu, this.bm, (FrameLayout) findViewById(R.id.screen_sfv));
                }
                this.ch.e(this);
                this.ch.c(this);
                this.ch.b(this.z);
                this.ch.c(this.z.acquireName());
                this.ch.b(new ViewVideoPlayListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.6
                    @Override // com.huawei.health.suggestion.ui.fitness.mvp.ViewVideoPlayListener
                    public void onVideoStartPlay() {
                        if (TrainDetail.this.bg != null) {
                            TrainDetail.this.bg.c();
                        }
                    }

                    @Override // com.huawei.health.suggestion.ui.fitness.mvp.ViewVideoPlayListener
                    public void startCoachPlay() {
                        TrainDetail.this.z();
                    }
                });
                this.ch.d(false);
                this.bi.judgeVipState();
            }
        } catch (SecurityException unused) {
            LogUtil.e("Suggestion_TrainDetail", "SecurityException exception showDetailInfo");
        }
        br();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ch() {
        d(findViewById(R.id.empty_vip_preview), 8);
        d(findViewById(R.id.member_preview_header), 8);
        d(findViewById(R.id.non_trial_header), 0);
        d(this.bk, 8);
        d(this.e, 0);
        d(this.g, 0);
        FitWorkout fitWorkout = this.z;
        if (fitWorkout != null && fitWorkout.isLongExplainVideoCourse()) {
            this.i.setVisibility(8);
        } else if (!qrs.u()) {
            d(this.i, 0);
        }
        hna hnaVar = this.br;
        if (hnaVar != null) {
            hnaVar.b(8);
        }
        hna hnaVar2 = this.bf;
        if (hnaVar2 != null) {
            hnaVar2.b(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ce() {
        cv();
        if (this.ab.getCount() > 1) {
            this.ca.setVisibility(0);
        } else {
            this.ca.setVisibility(8);
        }
        this.ab.notifyDataSetChanged();
        TrainDetailContract.Ipresenter ipresenter = this.bi;
        if (ipresenter == null || ipresenter.isFreeCourses(this.z.acquireCommodityFlag())) {
            cs();
        }
        finishLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<Motion> list) {
        TrainDetailContract.Ipresenter ipresenter = this.bi;
        if (ipresenter == null || ipresenter.isFreeCourses(this.z.acquireCommodityFlag())) {
            cs();
        }
        finishLoading();
        updateViewController();
        if (this.z.isNewRunCourse()) {
            LogUtil.a("Suggestion_TrainDetail", "mFitWorkout.isNewRunCourse");
            return;
        }
        if (!isLongVideoCourse()) {
            LogUtil.a("Suggestion_TrainDetail", "updateUi mTabStrip set VISIBLE");
            this.ca.setVisibility(0);
        }
        hnc hncVar = this.l;
        if (hncVar != null) {
            hncVar.e(this.z);
            this.l.d(list);
        }
    }

    private void be() {
        if (TextUtils.isEmpty(this.bq.acquirePlanId())) {
            LogUtil.j("Suggestion_TrainDetail", "acquirePlan action");
        } else {
            LogUtil.a("Suggestion_TrainDetail", "acquirePlan workout actionList");
        }
    }

    private boolean w() {
        WorkoutRecord workoutRecord = this.bq;
        if (workoutRecord != null) {
            String strAcquireWorkoutId = workoutRecord.acquireWorkoutId();
            this.cn = strAcquireWorkoutId;
            hmt hmtVar = this.k;
            if (hmtVar != null) {
                hmtVar.c(strAcquireWorkoutId);
            }
            if (!TextUtils.isEmpty(this.cn)) {
                return false;
            }
            LogUtil.j("Suggestion_TrainDetail", "mWorkId==null");
            finish();
            return true;
        }
        LogUtil.j("Suggestion_TrainDetail", "mRecord==null");
        return true;
    }

    private ArrayList<Motion> h(FitWorkout fitWorkout) {
        this.z = fitWorkout;
        o(fitWorkout);
        hkt.e();
        ArrayList<Motion> arrayList = new ArrayList<>(hkt.c(fitWorkout, this.aa));
        this.d.saveMotions(arrayList);
        this.d.saveDuration(this.z.acquireDuration());
        this.d.setBackgroundMusicUrl(this.z.getBackgroundMusic());
        this.d.setCalorieStartTime(this.z.getCalorieStartTime());
        LogUtil.a("Suggestion_TrainDetail", "setBackgroundMusicUrl:", this.z.getBackgroundMusic());
        return arrayList;
    }

    private void o(FitWorkout fitWorkout) {
        this.bq.saveVersion(fitWorkout.accquireVersion());
        if (TextUtils.isEmpty(this.bq.acquireWorkoutName())) {
            this.bq.saveWorkoutName(StringUtils.c((Object) fitWorkout.acquireName()));
        }
        this.bq.saveCalorie(fitWorkout.acquireCalorie());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hgu
            @Override // java.lang.Runnable
            public final void run() {
                this.e.j();
            }
        });
    }

    public /* synthetic */ void j() {
        HashMap map = new HashMap();
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_TrainDetail", "doViewTrainDetailBi, getCurrentPlan : planApi is null.");
            return;
        }
        IntPlan currentIntPlan = planApi.getCurrentIntPlan();
        if (hkt.c(currentIntPlan, this.bq.acquirePlanId())) {
            map.put("type", Integer.valueOf(iei.c(currentIntPlan)));
        }
        idy.b("1130006", map);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (intent == null) {
            LogUtil.j("Suggestion_TrainDetail", "the intent is null, pls check");
            finish();
            return;
        }
        super.onNewIntent(intent);
        this.cf = 0;
        this.ao = true;
        this.m.c();
        cv();
        this.ca.setVisibility(8);
        hmf hmfVar = new hmf(intent);
        this.cg = hmfVar;
        if (hmfVar.ad()) {
            finish();
            return;
        }
        cs();
        TrainDetailContract.Ipresenter ipresenter = this.bi;
        if (ipresenter != null) {
            ipresenter.onDestroy();
        }
        this.bi = new hmh(this, this.cg);
        this.bo = this.cg.n();
        a aVar = this.y;
        if (aVar != null) {
            aVar.f9155a = true;
        }
        CourseApi courseApi = this.o;
        if (courseApi != null) {
            courseApi.cancelDownloadCourseMediaFiles(new gzd.d().c(this.cn).a(this.cg.w()).b());
        }
        hjs.b().e();
        bm();
        showLoading();
        bl();
        d(findViewById(R.id.non_trial_header), 8);
        d(findViewById(R.id.member_preview_header), 8);
        d(findViewById(R.id.empty_vip_preview), 8);
        this.r.c();
        RelativeLayout relativeLayout = this.at;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            this.at.setVisibility(8);
        }
        c(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bm() {
        if (this.v != null) {
            bp();
            this.v.d();
            o();
            this.v.setProgress(0);
        }
    }

    private void bl() {
        CustomTitleBar customTitleBar = this.t;
        if (customTitleBar != null) {
            customTitleBar.setTitleText("");
            this.t.setRightButtonVisibility(8);
            this.t.setRightSoftkeyVisibility(8);
            this.t.setRightThirdKeyVisibility(8);
            this.t.setRightFourKeyVisibility(8);
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.ap = true;
        hmt hmtVar = this.k;
        if (hmtVar != null) {
            hmtVar.d();
        }
        if (y()) {
            cu();
            bj();
        }
        TrainDetailContract.Ipresenter ipresenter = this.bi;
        if (ipresenter != null) {
            ipresenter.onResume();
        }
    }

    private void cu() {
        WorkoutRecord workoutRecord = this.bq;
        if (workoutRecord != null) {
            CourseApi courseApi = this.o;
            if (courseApi == null) {
                LogUtil.j("Suggestion_TrainDetail", "updateWorkoutDownloadTag: mCourseApi is null.");
                return;
            }
            boolean z = courseApi.getCourseMediaFilesLength(this.cn, workoutRecord.acquireVersion()) == 0;
            this.ax = z;
            ReleaseLogUtil.d("Suggestion_TrainDetail", "refreshProgressButton", Boolean.valueOf(z), "true is down");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.ap = false;
        this.ar = false;
        LogUtil.a("Suggestion_TrainDetail", "TrainDetailOnStop");
    }

    private boolean y() {
        return this.as && (gzx.e(this.z, this.bq, this.v, this.i) && this.v.getVisibility() != 0);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void updateViewController() {
        bj();
        hnc hncVar = this.l;
        if (hncVar != null) {
            hncVar.e();
        }
        hmt hmtVar = this.k;
        if (hmtVar != null) {
            hmtVar.b();
        }
        this.as = true;
        LogUtil.a("Suggestion_TrainDetail", "initData:", Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bj() {
        if (this.ax) {
            if (SportSupportUtil.b()) {
                this.i.setText(an());
                this.i.setVisibility(0);
            } else {
                this.i.setVisibility(8);
            }
        } else {
            if (SportSupportUtil.b()) {
                this.i.setText(as());
                this.i.setVisibility(0);
            } else {
                this.i.setVisibility(8);
            }
            if (!CommonUtil.ab(getApplicationContext())) {
                a(com.huawei.health.servicesui.R.string.IDS_motiontrack_offlinemap_connectting_error, 0);
            }
        }
        a(getResources().getString(R.string.sug_start_train));
        if (qrs.u()) {
            this.i.setVisibility(8);
        }
        cg();
    }

    private void cg() {
        if (isLongVideoCourse()) {
            if (TextUtils.isEmpty(an())) {
                this.i.setText(as());
            } else {
                this.i.setText(an());
            }
            FitWorkout fitWorkout = this.z;
            if (fitWorkout == null || !fitWorkout.isLongExplainVideoCourse()) {
                return;
            }
            this.i.setVisibility(8);
        }
    }

    public void n() {
        LogUtil.a("Suggestion_TrainDetail", "showSendResultDialog()");
        View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.sug_activity_push_fail, (ViewGroup) null);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        builder.b(R.string.sug_push_course_to_watch_fail).d(viewInflate).d(com.huawei.ui.commonui.R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.d().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ci() {
        if (gzx.e(this.d)) {
            if (njy.e(this.d.acquireMotions())) {
                ReleaseLogUtil.d("Suggestion_TrainDetail", "startCoachActivity mCoachData.acquireMotions() empty");
                a(R.string.IDS_coach_language_change_hint, 0);
                return;
            }
            ReleaseLogUtil.d("Suggestion_TrainDetail", "startCoachActivity");
            pcd pcdVarBuildCommonParameter = CourseControlManager.buildCommonParameter(this.cg, this.bq.acquirePlanId(), this.m.e());
            pcdVarBuildCommonParameter.c(this.s != this.bo.size() - 1);
            CourseControlManager.startCoachActivity(this.f, this.z, pcdVarBuildCommonParameter, this.aq);
            cj();
            return;
        }
        ReleaseLogUtil.e("Suggestion_TrainDetail", "startCoachActivity mCoachData is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cp() {
        if (gzx.e(this.d)) {
            ReleaseLogUtil.d("Suggestion_TrainDetail", "startLongCoachActivity is screen recording = ", Integer.valueOf(this.z.getAntiScreenRecording()));
            pcd pcdVarBuildCommonParameter = CourseControlManager.buildCommonParameter(this.cg, this.bq.acquirePlanId(), this.m.e());
            pcdVarBuildCommonParameter.j(this.ba);
            pcdVarBuildCommonParameter.l(this.az);
            pcdVarBuildCommonParameter.c(this.s != this.bo.size() - 1);
            CourseControlManager.startLongCoachActivity(this.f, this.z, pcdVarBuildCommonParameter);
            cj();
            return;
        }
        LogUtil.j("Suggestion_TrainDetail", "startLongCoachActivity mCoachData is null");
    }

    private void cj() {
        if (this.o == null) {
            LogUtil.j("Suggestion_TrainDetail", "startCourseAfterCheck: mCourseApi is null.");
            return;
        }
        if (this.s == this.bo.size() - 1) {
            finish();
        }
        this.s++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2) {
        if (this.o == null) {
            LogUtil.j("Suggestion_TrainDetail", "recordTrainEvent: mCourseApi is null.");
            return;
        }
        if (this.z == null || this.cg == null) {
            LogUtil.j("Suggestion_TrainDetail", "recordTrainEvent: mFitWorkout or mTrainDetailIntentData is null.");
            return;
        }
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveWorkoutId(this.z.acquireId());
        workoutRecord.saveVersion(this.z.accquireVersion());
        workoutRecord.saveCourseBelongType(this.cg.c());
        workoutRecord.saveWorkoutPackageId(this.cg.aa());
        if (i2 == 0) {
            this.o.postUserCourse(workoutRecord, 0);
            return;
        }
        if (!Utils.o()) {
            this.o.postUserCourse(workoutRecord, 4);
        }
        if (this.z.isLongExplainVideoCourse()) {
            this.o.postUserCourse(workoutRecord, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: co, reason: merged with bridge method [inline-methods] */
    public void f() {
        ReleaseLogUtil.d("Suggestion_TrainDetail", "startOrDownload enter");
        if (i()) {
            bi();
        } else if (isLongVideoCourse()) {
            a(true, this.z.getWorkoutActionProperty(), null);
        } else {
            aj();
        }
    }

    private void bi() {
        SportServiceApi sportServiceApi = (SportServiceApi) Services.d("CoursePlanService", SportServiceApi.class);
        if (sportServiceApi != null) {
            sportServiceApi.setLastUseOrWatchCourse("last_use_run_course", System.currentTimeMillis(), this.z);
        }
        LogUtil.a("Suggestion_TrainDetail", "startOrDownload mIsRunWorkout():", "showDeviceDialog(CONNECT_OR_BINDING_TYPE)");
        if (g() && !EnvironmentInfo.m()) {
            ReleaseLogUtil.d("Suggestion_TrainDetail", "startOrDownload is heartRate workout");
            this.m.c(new IBaseResponseCallback() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if ((obj instanceof Integer) && ((Integer) obj).intValue() == 0) {
                        TrainDetail.this.t();
                    }
                }
            });
        } else {
            ReleaseLogUtil.e("Suggestion_TrainDetail", "not treadmill or heartRate workout");
            aj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        ReleaseLogUtil.d("Suggestion_TrainDetail", "downLoadCourseMedias is downloaded ", Boolean.valueOf(this.ax));
        if (this.z == null) {
            LogUtil.j("Suggestion_TrainDetail", "downLoadCourseMedias() mFitWorkout is null");
            return;
        }
        if (this.ax) {
            iei.a();
            if (i()) {
                q();
                return;
            } else {
                p();
                return;
            }
        }
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            a(R.string.IDS_network_connect_error, 0);
            return;
        }
        if (this.f9136b.getVisibility() == 0) {
            LogUtil.a("Suggestion_TrainDetail", "AI Courses: ", Boolean.valueOf(this.ah));
            this.f9136b.setVisibility(8);
            this.v.setVisibility(0);
        }
        FitWorkout fitWorkout = this.z;
        iei.c(fitWorkout, i(fitWorkout), this.ah);
        hip.d(this.z);
        cr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        LogUtil.a("Suggestion_TrainDetail", "downLoadLongSrt start");
        if (new File(xkf.n(this.az)).exists()) {
            r();
            return;
        }
        if (this.o == null) {
            LogUtil.j("Suggestion_TrainDetail", "downLoadLongSrt: mCourseApi is null.");
        } else if (!CommonUtil.ab(BaseApplication.getContext())) {
            a(R.string.IDS_network_connect_error, 0);
        } else {
            a(getResources().getString(R.string.sug_downloading));
            this.o.downloadSubtitles(this.az, new UiCallback<String>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.8
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str) {
                    LogUtil.a("Suggestion_TrainDetail", "downLoadLongSrt, onFailure. errorCode = ", Integer.valueOf(i2), ", errorInfo = ", str);
                    TrainDetail trainDetail = TrainDetail.this;
                    trainDetail.a(trainDetail.getResources().getString(R.string.sug_start_train));
                    TrainDetail.this.r();
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    LogUtil.a("Suggestion_TrainDetail", "downLoadLongSrt, onSuccess. ");
                    TrainDetail trainDetail = TrainDetail.this;
                    trainDetail.a(trainDetail.getResources().getString(R.string.sug_start_train));
                    TrainDetail.this.r();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cq() {
        int iAcquireWorkoutOrder;
        ReleaseLogUtil.d("Suggestion_TrainDetail", "startTrackActivity");
        if (this.z == null) {
            LogUtil.e("Suggestion_TrainDetail", "mFitWorkout is null.");
            return;
        }
        WorkoutRecord workoutRecord = this.bq;
        if (workoutRecord != null) {
            LogUtil.a("Suggestion_TrainDetail", "planId:", workoutRecord.acquirePlanId());
            this.bh = this.bq.acquirePlanId();
            iAcquireWorkoutOrder = this.bq.acquireWorkoutOrder();
        } else {
            iAcquireWorkoutOrder = 1;
        }
        pcd pcdVarBuildCommonParameter = CourseControlManager.buildCommonParameter(this.cg, this.bh, this.m.e());
        pcdVarBuildCommonParameter.g(iAcquireWorkoutOrder);
        if (this.cl.isChecked()) {
            pcdVarBuildCommonParameter.e(264);
        } else {
            pcdVarBuildCommonParameter.e(258);
        }
        CourseControlManager.startTrackActivity(this.f, this.z, pcdVarBuildCommonParameter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cr() {
        if (!NetworkUtil.k()) {
            ah();
        } else {
            cn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (this.m.a()) {
            return;
        }
        aj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.m.b(105);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.m.b(106);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.m.a(110);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.m.b(111);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ca() {
        new CustomTextAlertDialog.Builder(this).e(this.f.getString(R.string.sug_notify)).a(this.f.getString(R.string.IDS_FitnessAdvice_remind_user_to_stop_sport_in_device)).a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).b().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cf() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f);
        builder.b(com.huawei.health.servicesui.R.string.IDS_hwh_motiontrack_ingnore_link_attention);
        builder.c(com.huawei.ui.commonui.R.string.IDS_apphelp_pwindows_continue_button, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Suggestion_TrainDetail", "ignore link and continue");
                if (TrainDetail.this.i()) {
                    TrainDetail.this.ag.sendEmptyMessage(110);
                    return;
                }
                if (TrainDetail.this.isLongVideoCourse()) {
                    TrainDetail.this.ag.sendEmptyMessage(106);
                } else if (!TrainDetail.this.ah || TrainDetail.this.z.getIsAi() != 1) {
                    TrainDetail.this.ag.sendEmptyMessage(105);
                } else {
                    LogUtil.a("Suggestion_TrainDetail", "is ai interactivetraining");
                    TrainDetail.this.ag.sendEmptyMessage(111);
                }
            }
        });
        builder.a(com.huawei.ui.commonui.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Suggestion_TrainDetail", "ignore link and cancel");
                TrainDetail.this.o();
            }
        });
        builder.c().show();
    }

    private void ah() {
        if (CommonUtil.ab(btx.c())) {
            ReleaseLogUtil.d("Suggestion_TrainDetail", "doInWifi download in mobile network");
            if (this.o == null) {
                LogUtil.j("Suggestion_TrainDetail", "doInWifi: mCourseApi is null.");
                return;
            }
            HealthDownLoadWidget healthDownLoadWidget = this.v;
            if (healthDownLoadWidget == null) {
                LogUtil.j("Suggestion_TrainDetail", "doInWifi: mDownloadWidget is null.");
                return;
            }
            Object tag = healthDownLoadWidget.getTag();
            if ((tag instanceof Boolean) && !((Boolean) tag).booleanValue()) {
                LogUtil.a("Suggestion_TrainDetail", "Only one dialog is allowed.");
                return;
            }
            int iRound = Math.round(this.o.getCourseMediaFilesLength(this.cn, this.bq.acquireVersion()) / 1048576.0f);
            String strValueOf = String.valueOf(iRound);
            if (iRound <= 0) {
                strValueOf = getString(R.string.sug_fitness_less1, new Object[]{UnitUtil.e(1, 1, 0)});
                iRound = 1;
            }
            String strC = gzx.c(this, R.string.sug_coach_dialog_new_netmsg, gzx.d(R.plurals.sug_coach_dialog_mediasize, iRound, strValueOf));
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
            builder.a(strC).c(R.string.sug_coach_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TrainDetail.this.ae();
                    TrainDetail.this.cn();
                }
            }).a(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TrainDetail.this.ae();
                    int modelType = pqh.b().getModelType();
                    if (TrainDetail.this.z.getIsAi() != 1 || modelType == -1) {
                        return;
                    }
                    LogUtil.a("Suggestion_TrainDetail", "doInWifi AI Courses: ", Integer.valueOf(TrainDetail.this.z.getIsAi()));
                    TrainDetail.this.f9136b.setVisibility(0);
                    TrainDetail.this.v.setVisibility(8);
                }
            });
            ae();
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            this.ck = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
            if (isFinishing()) {
                return;
            }
            this.ck.show();
            return;
        }
        ReleaseLogUtil.e("Suggestion_TrainDetail", "doInWifi not connect");
        ae();
        cn();
    }

    private void v() {
        float f2 = this.u;
        if (f2 > 0.0f) {
            this.v.setProgress((int) (f2 * 100.0f));
            this.v.a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn() {
        if (this.o == null) {
            LogUtil.j("Suggestion_TrainDetail", "toDownload: mCourseApi is null.");
            return;
        }
        if ((this.v.getTag() instanceof Boolean) && ((Boolean) this.v.getTag()).booleanValue()) {
            this.bd = 0;
            this.v.setTag(false);
            LogUtil.a("Suggestion_TrainDetail", "toDownload:", Integer.valueOf(this.v.getVisibility()), " ", Integer.valueOf(this.x.getVisibility()), " ", Integer.valueOf(this.f9136b.getVisibility()), " ", Integer.valueOf(this.n.getVisibility()));
            d(this.x, 0);
            d(this.v, 0);
            d(this.f9136b, 8);
            d(this.n, 8);
            a(getResources().getString(R.string.sug_downloading));
            v();
            this.y = new a(this);
            this.o.downloadCourseMediaFiles(new gzd.d().c(this.cn).b(this.z.getTimbre()).d(this.bq.acquireVersion()).a(this.cg.w()).b(), this.y);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class a extends UiCallback<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f9155a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<TrainDetail> f9156b;

        a(TrainDetail trainDetail) {
            this.f9156b = null;
            this.f9156b = new WeakReference<>(trainDetail);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_TrainDetail", "down fail-- errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
            TrainDetail trainDetail = this.f9156b.get();
            if (trainDetail == null) {
                LogUtil.j("Suggestion_TrainDetail", "DownloadUiCallback onFailure null mTrainDetail ");
                return;
            }
            trainDetail.o();
            if (!trainDetail.isFinishing() && ((trainDetail.ck == null || !trainDetail.ck.isShowing()) && (trainDetail.bb == null || !trainDetail.bb.isShowing()))) {
                trainDetail.b(str);
            }
            trainDetail.u = trainDetail.v.getProgress() / 100.0f;
            trainDetail.ci = 1.0f - trainDetail.u;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onProgress(long j, long j2) {
            TrainDetail trainDetail = this.f9156b.get();
            if (trainDetail != null) {
                trainDetail.a(trainDetail.getResources().getString(R.string.sug_downloading));
                float f = ((trainDetail.ci * (j / j2)) + trainDetail.u) - 0.001f;
                if (f < 0.0f) {
                    f = 1.0E-5f;
                }
                if (f < 1.0f || f == 1.0f) {
                    f *= 100.0f;
                }
                int i = (int) f;
                trainDetail.bn = trainDetail.v.getProgress();
                if (trainDetail.bn != i && !trainDetail.ak) {
                    trainDetail.ak = true;
                    i = trainDetail.bn;
                    trainDetail.bd = i;
                }
                int iAbs = Math.abs(i - trainDetail.bd);
                trainDetail.bd = i;
                trainDetail.v.a(iAbs);
                return;
            }
            LogUtil.j("Suggestion_TrainDetail", "DownloadUiCallback onProgress null mTrainDetail ");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public boolean isCanceled() {
            if (this.f9156b.get() == null) {
                ReleaseLogUtil.e("Suggestion_TrainDetail", "DownloadUiCallback isCanceled trainDetail == null ");
                return true;
            }
            return this.f9155a;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            LogUtil.d("Suggestion_TrainDetail", "down success--");
            TrainDetail trainDetail = this.f9156b.get();
            if (trainDetail != null) {
                if (trainDetail.o != null) {
                    LogUtil.a("Suggestion_TrainDetail", "DownloadUiCallback mIsForeGround ", Boolean.valueOf(trainDetail.ap));
                    if (trainDetail.ap) {
                        if (trainDetail.i()) {
                            trainDetail.q();
                        } else {
                            if (trainDetail.ah) {
                                trainDetail.u();
                            } else {
                                trainDetail.p();
                            }
                            LogUtil.a("Suggestion_TrainDetail", "onSuccess selectClick: ", Boolean.valueOf(trainDetail.ah));
                        }
                    } else {
                        trainDetail.o();
                    }
                    trainDetail.bn = 0;
                    trainDetail.u = 0.0f;
                    trainDetail.ax = true;
                    trainDetail.v.setTag(true);
                    trainDetail.b(0);
                    hjs.b().e(trainDetail.z);
                    trainDetail.bj();
                    return;
                }
                LogUtil.j("Suggestion_TrainDetail", "DownloadUiCallback, onSuccess: mCourseApi is null.");
                return;
            }
            ReleaseLogUtil.e("Suggestion_TrainDetail", "DownloadUiCallback onSuccess trainDetail == null ");
        }
    }

    public void o() {
        this.v.setTag(true);
        this.v.b();
        a(getResources().getString(R.string.sug_start_train));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.v.setIdleText(str.toUpperCase(Locale.getDefault()));
    }

    private void bp() {
        float f2 = this.bn / 100.0f;
        this.u = f2;
        if (this.ax) {
            this.u = 1.0f;
        } else if (f2 > 0.001f) {
            LogUtil.a("Suggestion_TrainDetail", "save download progress: ", Float.valueOf(f2));
            this.ci = 1.0f - this.u;
        }
        pea.c(this.cn, this.u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (isFinishing()) {
            return;
        }
        String string = getResources().getString(R.string.sug_fitness_dialog_tryagain);
        String string2 = getResources().getString(R.string.sug_fitness_dialog_failmsg);
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f);
        builder.a(string2).a(string, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TrainDetail.this.ae();
                if (!TrainDetail.this.isLongVideoCourse()) {
                    TrainDetail.this.cr();
                } else {
                    TrainDetail trainDetail = TrainDetail.this;
                    trainDetail.a(true, trainDetail.z.getWorkoutActionProperty(), null);
                }
            }
        }).a(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TrainDetail.this.ae();
            }
        });
        ae();
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.ck = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
        this.ck.show();
    }

    public void d() {
        WorkoutRecord workoutRecord = this.bq;
        if (workoutRecord == null) {
            LogUtil.j("Suggestion_TrainDetail", "collect() mRecord is null.");
            return;
        }
        if (this.o == null) {
            LogUtil.j("Suggestion_TrainDetail", "collect() mCourseApi is null.");
            return;
        }
        String strAcquireWorkoutId = workoutRecord.acquireWorkoutId();
        if (this.al) {
            this.o.uncollectCourse(strAcquireWorkoutId);
            this.t.setRightSoftkeyBackground(getDrawable(R.drawable.ic_collect_normal), qre.f(R.string.IDS_FitnessAdvice_collected_no_toast));
            this.al = false;
            a(R.string.IDS_FitnessAdvice_collected_no_toast, 1);
            idy.c("1130023", 2, strAcquireWorkoutId);
            return;
        }
        this.o.collectCourse(strAcquireWorkoutId, this.bq.acquireVersion());
        this.t.setRightSoftkeyBackground(getDrawable(R.drawable.ic_collect_press), qre.f(R.string.IDS_course_collect_des));
        this.al = true;
        a(R.string.IDS_FitnessAdvice_collected_ok_toast2, 1);
        idy.c("1130023", 1, strAcquireWorkoutId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, int i3) {
        Toast.makeText(BaseApplication.getContext(), i2, i3).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        if (isFinishing()) {
            LogUtil.j("Suggestion_TrainDetail", "trainDetail activity isFinishing");
            return;
        }
        if (isDestroyed()) {
            LogUtil.j("Suggestion_TrainDetail", "trainDetail activity isDestroyed");
            return;
        }
        if (this.t.getWindowToken() == null) {
            LogUtil.j("Suggestion_TrainDetail", "trainDetail getWindowToken is null");
            return;
        }
        if ("1".equals(buh.e("COLLECT_FIST_KEY"))) {
            return;
        }
        PopupWindow popupWindow = new PopupWindow(View.inflate(this.f, R.layout.sug_fitness_collecte_toast, null), -2, -2, true);
        this.bl = popupWindow;
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        View contentView = this.bl.getContentView();
        contentView.measure(0, 0);
        try {
            PopupWindow popupWindow2 = this.bl;
            CustomTitleBar customTitleBar = this.t;
            popupWindow2.showAsDropDown(customTitleBar, (customTitleBar.getWidth() - contentView.getMeasuredWidth()) - ((Integer) getSafeRegionWidth().second).intValue(), 0);
        } catch (WindowManager.BadTokenException e2) {
            LogUtil.e("Suggestion_TrainDetail", "showAsDropDown exception", LogAnonymous.b(e2));
        }
        buh.d("COLLECT_FIST_KEY", "1");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.ll_fitness_getdata_error) {
            CommonUtil.t(this);
        } else {
            LogUtil.j("Suggestion_TrainDetail", "onClick not find this id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.ck;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        NewViewDetailInfo newViewDetailInfo = this.bg;
        if (newViewDetailInfo != null) {
            newViewDetailInfo.e();
        }
        a aVar = this.y;
        if (aVar != null) {
            aVar.f9155a = true;
        }
        PopupWindow popupWindow = this.bl;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.bl = null;
        }
        CustomAlertDialog customAlertDialog = this.bj;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
            this.bj = null;
        }
        hhv hhvVar = this.ch;
        if (hhvVar != null) {
            hhvVar.d();
        }
        if (CourseEquipmentConnectionTipsUtil.e(this.z, this.cg.j()) != 0) {
            JumpConnectHelper.c().j();
        }
        unregisterReceiver(this.cj);
        d(this.f);
        CourseApi courseApi = this.o;
        if (courseApi != null) {
            courseApi.cancelDownloadCourseMediaFiles(new gzd.d().c(this.cn).a(this.cg.w()).b());
        }
        hjs.b().e();
        bp();
        Handler handler = this.ag;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        iei.a(this.cg.e(), System.currentTimeMillis() - this.bx);
        if (this.ad > 0) {
            ((DistributedApi) Services.b("DistributedService", DistributedApi.class)).unregister(this.ad);
        }
        TrainDetailContract.Ipresenter ipresenter = this.bi;
        if (ipresenter != null) {
            ipresenter.onDestroy();
        }
        ((DistributedApi) Services.b("DistributedService", DistributedApi.class)).releaseDeviceManager();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        hhv hhvVar = this.ch;
        if (hhvVar != null && hhvVar.a()) {
            this.ch.b();
            return;
        }
        hmt hmtVar = this.k;
        if (hmtVar == null || hmtVar.c()) {
            return;
        }
        if (this.cg.ab()) {
            bt();
        } else {
            m();
        }
    }

    private void m() {
        hmf hmfVar = this.cg;
        if (hmfVar != null && hmfVar.ai()) {
            moveTaskToBack(true);
        }
        RelativeLayout relativeLayout = this.cd;
        qhu.a(relativeLayout.getChildAt(relativeLayout.getChildCount() - 1), new IBaseResponseCallback() { // from class: hhd
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f36735c.e(i2, obj);
            }
        });
    }

    public /* synthetic */ void e(int i2, Object obj) {
        if (i2 == 0) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    public class WifiReceiver extends BroadcastReceiver {
        public WifiReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TrainDetail.this.v == null) {
                return;
            }
            if (!TrainDetail.this.am && !TrainDetail.this.ax && CommonUtil.ab(BaseApplication.getContext())) {
                TrainDetail.this.mLoadingView.setVisibility(8);
                TrainDetail.this.ac.setVisibility(8);
                if (TrainDetail.this.l != null) {
                    TrainDetail.this.l.c(0);
                }
                if (TrainDetail.this.r != null) {
                    TrainDetail.this.r.d(0);
                }
                if (!gzx.e(TrainDetail.this.z)) {
                    LogUtil.a("Suggestion_TrainDetail", "onReceive");
                    TrainDetail.this.showLoading();
                    TrainDetail.this.initData();
                }
            }
            TrainDetail.this.am = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bt() {
        WorkoutRecord workoutRecord;
        View viewInflate = ((LayoutInflater) this.f.getSystemService("layout_inflater")).inflate(R.layout.sug_fitness_after_run_dialog, (ViewGroup) null);
        final HealthCheckBox healthCheckBox = (HealthCheckBox) viewInflate.findViewById(R.id.sug_fitness_not_remind_box);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.sug_fitness_sketch_tip);
        if (this.z == null && ((workoutRecord = this.bq) == null || TextUtils.isEmpty(workoutRecord.acquireWorkoutName()))) {
            hcu.b().c();
            finish();
            return;
        }
        WorkoutRecord workoutRecord2 = this.bq;
        if (workoutRecord2 == null || TextUtils.isEmpty(workoutRecord2.acquireWorkoutName())) {
            healthTextView.setText(String.format(getString(R.string.IDS_FitnessAdvice_afterrun_dialog_tip), this.z.acquireName()));
        } else {
            healthTextView.setText(String.format(getString(R.string.IDS_FitnessAdvice_afterrun_dialog_tip), this.bq.acquireWorkoutName()));
        }
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this.f).a(getString(R.string.sug_notify)).d(viewInflate).a(getString(R.string.IDS_FitnessAdvice_afterrun_dialog_exit).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: hhk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36739a.d(healthCheckBox, view);
            }
        }).c(getString(com.huawei.health.servicesui.R.string.IDS_plugin_fitnessadvice_cancal).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: hhm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.k(view);
            }
        }).d();
        this.bw = customViewDialogD;
        customViewDialogD.show();
    }

    public /* synthetic */ void d(HealthCheckBox healthCheckBox, View view) {
        if (healthCheckBox.isChecked()) {
            LogUtil.a("Suggestion_TrainDetail", "not remind:", Boolean.valueOf(healthCheckBox.isChecked()));
            SharedPreferenceManager.e(this.f, Integer.toString(20002), "show_sketch_after_track", "false", new StorageParams());
        }
        hcu.b().c();
        finish();
        this.bw.dismiss();
    }

    public /* synthetic */ void k(View view) {
        this.bw.dismiss();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        hmt hmtVar = this.k;
        if (hmtVar != null) {
            hmtVar.c(configuration);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class h implements Runnable {
        WeakReference<TrainDetail> d;

        /* synthetic */ h(TrainDetail trainDetail, AnonymousClass4 anonymousClass4) {
            this(trainDetail);
        }

        private h(TrainDetail trainDetail) {
            this.d = new WeakReference<>(trainDetail);
        }

        @Override // java.lang.Runnable
        public void run() {
            TrainDetail trainDetail = this.d.get();
            if (trainDetail != null) {
                trainDetail.ap();
            } else {
                LogUtil.j("Suggestion_TrainDetail", "RequestWorkoutTask activity is null");
            }
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private FitWorkout f9159b;
        private WeakReference<TrainDetail> d;

        /* synthetic */ d(TrainDetail trainDetail, FitWorkout fitWorkout, AnonymousClass4 anonymousClass4) {
            this(trainDetail, fitWorkout);
        }

        private d(TrainDetail trainDetail, FitWorkout fitWorkout) {
            this.d = new WeakReference<>(trainDetail);
            this.f9159b = fitWorkout;
        }

        @Override // java.lang.Runnable
        public void run() {
            TrainDetail trainDetail = this.d.get();
            if (trainDetail != null) {
                trainDetail.d(this.f9159b);
            } else {
                LogUtil.j("Suggestion_TrainDetail", "DownloadWorkoutTask activity is null");
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.JumpConnectHelper.JumpActivityHandleInterface
    public void startLongCoachAfter() {
        CourseControlManager.startLongCoachAfterAction(this.z, CourseControlManager.buildCommonParameter(this.cg, this.bh, this.m.e()));
        cj();
        JumpConnectHelper.c().d().d("Suggestion_TrainDetail");
        JumpConnectHelper.c().j();
    }

    @Override // com.huawei.health.suggestion.util.CourseEquipmentConnectionTipsUtil.DevicesConnectDialogCallback
    public void devicesConnectDialogNavigation() {
        ReleaseLogUtil.d("Suggestion_TrainDetail", "devicesConnectDialogNavigation");
        if (isLongVideoCourse()) {
            cp();
        } else {
            ci();
        }
    }

    @Override // com.huawei.health.suggestion.util.CourseEquipmentConnectionTipsUtil.DevicesConnectDialogCallback
    public void devicesConnectDialogPositive() {
        ReleaseLogUtil.d("Suggestion_TrainDetail", "devicesConnectDialogPositive");
        pcd pcdVarBuildCommonParameter = CourseControlManager.buildCommonParameter(this.cg, this.bq.acquirePlanId(), this.m.e());
        pcdVarBuildCommonParameter.j(this.ba);
        pcdVarBuildCommonParameter.l(this.az);
        CourseControlManager.devicesConnectDialogPositive(this.f, this.z, pcdVarBuildCommonParameter, this.bo);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Iview
    public void changeVipState(boolean z) {
        this.au = z;
        hhv hhvVar = this.ch;
        if (hhvVar != null) {
            hhvVar.i();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Iview
    public void changBuyState(boolean z) {
        this.an = z;
        hhv hhvVar = this.ch;
        if (hhvVar != null) {
            hhvVar.i();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Iview
    public void bindProductCourseSummary(ProductSummary productSummary, ProductSummary productSummary2, TradeViewInfo tradeViewInfo) {
        this.f9137c.c(productSummary);
        this.f9137c.a(productSummary2);
        this.f9137c.e(tradeViewInfo);
        hhv hhvVar = this.ch;
        if (hhvVar != null) {
            hhvVar.i();
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.VipViewShowProvider
    public hld getAuditionCourseData() {
        this.f9137c.d(this.au);
        this.f9137c.b(this.an);
        this.f9137c.c(hkt.b(this.z));
        return this.f9137c;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract.Iview, com.huawei.health.suggestion.ui.fitness.mvp.VipViewShowProvider
    public void notifyActivityResult(int i2, int i3, Intent intent) {
        LogUtil.a("Suggestion_TrainDetail", "notifyActivityResult requestCode", Integer.valueOf(i2), "resultCode:", Integer.valueOf(i3));
        if (this.ch != null && i3 == 0 && i2 == 100001) {
            this.f9137c.b(true);
            this.ch.h();
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    public class NetStateChangeReceiver extends BroadcastReceiver {
        public NetStateChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (NetworkUtil.k()) {
                return;
            }
            TrainDetail.this.ag.sendMessage(TrainDetail.this.ag.obtainMessage(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON));
        }
    }

    private void c(Context context) {
        context.registerReceiver(this.bc, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    private void d(Context context) {
        NetStateChangeReceiver netStateChangeReceiver = this.bc;
        if (netStateChangeReceiver != null) {
            context.unregisterReceiver(netStateChangeReceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        if (!this.ar) {
            LogUtil.a("Suggestion_TrainDetail", "not start download");
            return;
        }
        if (this.o != null) {
            LogUtil.a("Suggestion_TrainDetail", "cancel download");
            this.o.cancelDownloadCourseMediaFiles(new gzd.d().c(this.cn).a(this.cg.w()).b());
        }
        if (bd()) {
            LogUtil.a("Suggestion_TrainDetail", "cancel stopPlayVideo");
            this.ch.g();
        }
        if (!CommonUtil.ab(this)) {
            cd();
        } else {
            cc();
        }
    }

    private void cc() {
        String strReplace;
        int i2;
        ReleaseLogUtil.d("Suggestion_TrainDetail", "showNetStateDownloadDialog enter");
        if (bd()) {
            strReplace = BaseApplication.getContext().getResources().getString(R.string.IDS_FitnessAdvice_use_rate_of_flow);
        } else {
            strReplace = gzx.c(this, R.string.sug_coach_dialog_new_netmsg, "").replace(" ", "");
        }
        if (bd()) {
            i2 = R.string.IDS_bolt_button_playback;
        } else {
            i2 = R.string.sug_coach_dialog_confirm;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(strReplace).c(i2, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TrainDetail.this.ag();
                if (TrainDetail.this.bd()) {
                    TrainDetail.this.cl();
                } else {
                    TrainDetail.this.cn();
                }
            }
        }).a(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TrainDetail.this.ag();
                if (TrainDetail.this.o != null) {
                    LogUtil.a("Suggestion_TrainDetail", "cancel download");
                    TrainDetail.this.o.cancelDownloadCourseMediaFiles(new gzd.d().c(TrainDetail.this.cn).a(TrainDetail.this.cg.w()).b());
                    TrainDetail.this.bm();
                }
                if (TrainDetail.this.bd()) {
                    LogUtil.a("Suggestion_TrainDetail", "cancel stopPlayVideo");
                    TrainDetail.this.ch.g();
                }
            }
        });
        ag();
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.bb = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
        if (isFinishing()) {
            return;
        }
        this.bb.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.bb;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
        }
    }

    private void cd() {
        if (isFinishing()) {
            return;
        }
        String string = getResources().getString(com.huawei.health.servicesui.R.string.IDS_hwh_home_healthshop_setting_net_work);
        String string2 = getResources().getString(R.string.sug_haveno_network);
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f);
        builder.a(string2).a(string, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TrainDetail.this.ag();
                TrainDetail.this.startActivity(new Intent("android.settings.SETTINGS"));
            }
        }).a(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.TrainDetail.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TrainDetail.this.ag();
            }
        });
        ag();
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.bb = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
        this.bb.show();
    }
}
