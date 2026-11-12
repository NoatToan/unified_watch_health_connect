package com.xiaomi.hm.health.training.ui.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.Formatter;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.view.ViewUtils;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceSpanUtils;
import com.xiaomi.hm.health.baseutil.GlobalKeeper;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.Coach;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.databases.model.trainning.TrainingItem;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.NewTrainingDb;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.ui.activity.FreeTrainingDetailActivity;
import com.xiaomi.hm.health.training.ui.activity.trainplay.TrainingPlayActivity;
import com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter;
import com.xiaomi.hm.health.training.ui.adapter.CommonViewHolder;
import com.xiaomi.hm.health.training.ui.fragment.TrainingHRTipFragment;
import com.xiaomi.hm.health.training.ui.fragment.TrainingMoreDialogFragment;
import com.xiaomi.hm.health.training.ui.helper.DataConverter;
import com.xiaomi.hm.health.training.ui.listener.BlockMultiClickListener;
import com.xiaomi.hm.health.training.ui.widget.LinearLayoutDecoration;
import com.xiaomi.hm.health.training.ui.widget.ReadMoreTextView;
import com.xiaomi.hm.health.training.ui.widget.TrainingRoundExpandableLayout;
import com.xiaomi.hm.health.training.ui.widget.UpDownTextItem;
import com.xiaomi.hm.health.training.utils.OtherUtils;
import com.xiaomi.hm.health.training.utils.WebBrowserUtils;
import com.xiaomi.hm.health.traininglib.event.EventReqTrainingData;
import com.xiaomi.hm.health.traininglib.media.MediaDownloaderManager;
import com.xiaomi.hm.health.traininglib.media.StorageUtils;
import com.xiaomi.hm.health.traininglib.model.DownloadInfo;
import com.xiaomi.hm.health.traininglib.model.RunCirclePosts;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.util.MediaFileUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import com.xiaomi.hm.health.traininglib.util.TrainingConfigManager;
import com.xiaomi.hm.health.traininglib.util.TrainingDBUtils;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import com.xiaomi.hm.health.traininglib.webapi.RequestTrainingAPI;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
public class FreeTrainingDetailActivity extends BaseTitleActivity implements View.OnClickListener, MediaDownloaderManager.DownloadListener {
    public static final String EXTRA_TRAINING_ID = "EXTRA_TRAINING_ID";
    private static final String Z = "FreeTrainingDetailActivity";
    private static final int m0 = 100;
    private static final double n0 = 1048576.0d;
    private UpDownTextItem A;
    private UpDownTextItem B;
    private UpDownTextItem C;
    private TextView D;
    private ReadMoreTextView E;
    private LinearLayout F;
    private View G;
    private View H;
    private ReadMoreTextView I;
    private TextView J;
    private ImageView K;
    private TextView L;
    private LinearLayout M;
    private ProgressBar N;
    private TextView O;
    private TrainingDetail P;
    private RecyclerView Q;
    private RelativeLayout R;
    private MediaDownloaderManager S;
    private boolean T;
    private boolean U;
    private boolean V;
    private long W;
    private SparseBooleanArray X = new SparseBooleanArray();
    private LoadingDialog Y;
    private ImageView x;
    private ImageView y;
    private TextView z;

    public class a extends CommonRecycleAdapter<RunCirclePosts> {
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, List list, int i3) {
            super(i, i2, list);
            this.d = i3;
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bindViewHolder(CommonViewHolder commonViewHolder, RunCirclePosts runCirclePosts) {
            if (this.d <= 0 || commonViewHolder.getAdapterPosition() >= this.d) {
                return;
            }
            commonViewHolder.setImageByUrlWithPressedDrawable(R.id.imv_bg, runCirclePosts.picture).setCircleImageByUrl(R.id.imv_user_avatar, runCirclePosts.picture).setText(R.id.tx_user_name, runCirclePosts.nickName);
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onItemClick(RunCirclePosts runCirclePosts, int i) {
            WebBrowserUtils.jump2WebBrowser(FreeTrainingDetailActivity.this, runCirclePosts.url, runCirclePosts.nickName);
        }
    }

    public class b implements TrainingRoundExpandableLayout.OnItemOperatorListener {
        public b() {
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.TrainingRoundExpandableLayout.OnItemOperatorListener
        public void onActionItemClick(ActionContent actionContent) {
            FreeTrainingDetailActivity.this.Y("MovementDetail");
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.TrainingRoundExpandableLayout.OnItemOperatorListener
        public void onAllActionClick() {
            FreeTrainingDetailActivity.this.Y(TrainingAnalytics.ParamValue.JoinedTrainingOperate.MOVEMENT_LIST);
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.TrainingRoundExpandableLayout.OnItemOperatorListener
        public void onItemClosed(int i) {
            FreeTrainingDetailActivity.this.X.put(i, false);
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.TrainingRoundExpandableLayout.OnItemOperatorListener
        public void onItemOpened(int i) {
            TrainingRoundExpandableLayout trainingRoundExpandableLayout;
            FreeTrainingDetailActivity.this.X.put(i, true);
            for (int i2 = 0; i2 < FreeTrainingDetailActivity.this.X.size(); i2++) {
                if (FreeTrainingDetailActivity.this.X.valueAt(i2) && i2 != i && (trainingRoundExpandableLayout = (TrainingRoundExpandableLayout) FreeTrainingDetailActivity.this.F.getChildAt(FreeTrainingDetailActivity.this.X.keyAt(i2))) != null) {
                    trainingRoundExpandableLayout.collapseItem();
                }
            }
        }
    }

    public class c implements TrainingHRTipFragment.DialogButtonListener {
        public final /* synthetic */ TrainingHRTipFragment a;

        public c(TrainingHRTipFragment trainingHRTipFragment) {
            this.a = trainingHRTipFragment;
        }

        @Override // com.xiaomi.hm.health.training.ui.fragment.TrainingHRTipFragment.DialogButtonListener
        public void onDismiss() {
        }

        @Override // com.xiaomi.hm.health.training.ui.fragment.TrainingHRTipFragment.DialogButtonListener
        public void onNotTips() {
            GlobalKeeper.setHrNeedTip(false);
            FreeTrainingDetailActivity freeTrainingDetailActivity = FreeTrainingDetailActivity.this;
            if (!TrainingPlayActivity.startTrainingPlayActivity(freeTrainingDetailActivity, freeTrainingDetailActivity.P, 0L, null, null)) {
                this.a.dismissAllowingStateLoss();
            } else {
                FreeTrainingDetailActivity.this.L.setEnabled(false);
                FreeTrainingDetailActivity.this.finish();
            }
        }
    }

    public class d extends Subscriber<Long> {
        public d() {
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Long l) {
            FreeTrainingDetailActivity.this.Y.dismiss();
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            th.printStackTrace();
        }
    }

    private void A0() {
        if (this.Y != null) {
            Observable.timer(100L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Subscriber<? super Long>) new d());
        }
    }

    private void B0(List<RunCirclePosts> list, int i) {
        this.Q.setAdapter(new a(R.layout.item_joined_tranner, R.id.view_bg, list, i));
    }

    private void C0(TrainingDetail trainingDetail) {
        if (trainingDetail == null) {
            return;
        }
        HMLog.d(Z, trainingDetail.toString(), new Object[0]);
        this.D.setText(trainingDetail.name);
        OtherUtils.loadWithGlide(this, this.y, ParseJsonUtil.getStringByGender(trainingDetail.detailsPageIllustrated, TrainerInfo.get()));
        this.A.setDownText(String.valueOf(trainingDetail.consumption));
        this.C.setDownText(getResources().getStringArray(R.array.difficulty_title)[trainingDetail.difficultyDegree.intValue() - 1]);
        this.B.setDownText(String.format(Locale.getDefault(), "%.0f", Double.valueOf(Math.ceil(ParseJsonUtil.getLongByGender(trainingDetail.time, TrainerInfo.get()) / 60000.0d))));
        this.E.setTextDelay(trainingDetail.introduction);
        if (this.T) {
            D0(trainingDetail);
        }
        Coach coach = trainingDetail.coach;
        if (coach != null) {
            this.I.setTextDelay(coach.introduction);
            this.J.setText(coach.name);
            ImageView imageView = this.K;
            String str = coach.portrait;
            int i = R.drawable.icon_error_circle_avatar;
            OtherUtils.loadWithGlideCircle(this, imageView, str, i, i);
        } else {
            findViewById(R.id.ll_coach_info).setVisibility(8);
            findViewById(R.id.divider_coach).setVisibility(8);
        }
        this.F.removeAllViews();
        if (!"SINGLE_TRAINING".equals(trainingDetail.trainingType)) {
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.H.setVisibility(8);
            this.E.expandText();
            return;
        }
        this.F.setVisibility(0);
        this.G.setVisibility(0);
        this.H.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        List<ActionContent> list = trainingDetail.content;
        if (list != null) {
            int iIntValue = 0;
            for (ActionContent actionContent : list) {
                if (iIntValue != actionContent.round.intValue()) {
                    if (iIntValue != 0) {
                        Q(arrayList, false);
                    }
                    arrayList = new ArrayList();
                    iIntValue = actionContent.round.intValue();
                }
                arrayList.add(actionContent);
            }
        }
        Q(arrayList, true);
    }

    private void D0(TrainingDetail trainingDetail) {
        if (trainingDetail.finishNumber.intValue() > 0) {
            this.z.setVisibility(0);
            int color = ContextCompat.getColor(this, R.color.white100);
            this.z.setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(getResources().getQuantityString(R.plurals.have_finish_x_times_training, trainingDetail.finishNumber.intValue(), trainingDetail.finishNumber), this, Font.KM, Integer.valueOf((int) ViewUtils.sp2px(this, 24.0f)), Integer.valueOf(color)));
        } else {
            this.z.setVisibility(4);
        }
        this.L.setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(getString(R.string.start_training_right_now, new Object[]{Integer.valueOf(trainingDetail.finishNumber.intValue() + 1)}), this, Font.KM, Integer.valueOf((int) ViewUtils.sp2px(this, 24.0f)), null));
    }

    private void E0(final long j) {
        new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(R.string.confirm_exit_free_training).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: fa2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RequestTrainingAPI.reqJoinTraining(j, false);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: ya2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FreeTrainingDetailActivity.s0(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void F0(int i) {
        if (this.Y == null) {
            this.Y = LoadingDialog.showDialog(this, getString(i));
        }
        this.Y.setCancelable(false);
        this.Y.setMessage(getString(i));
        this.Y.show();
    }

    private void G0() {
        Y("More");
        TrainingMoreDialogFragment trainingMoreDialogFragment = new TrainingMoreDialogFragment();
        trainingMoreDialogFragment.setHasBoundHrDevice(TrainerInfo.get().hasHrDevice);
        trainingMoreDialogFragment.setShowDownloadButton("SINGLE_TRAINING".equals(this.P.trainingType));
        trainingMoreDialogFragment.setOnViewClickListener(new TrainingMoreDialogFragment.OnViewClickListener() { // from class: cb2
            @Override // com.xiaomi.hm.health.training.ui.fragment.TrainingMoreDialogFragment.OnViewClickListener
            public final void onViewClick(int i) {
                this.a.t0(i);
            }
        });
        trainingMoreDialogFragment.show(getSupportFragmentManager(), (String) null);
    }

    private void H0(Set<DownloadInfo> set) {
        int totalMediaSize = MediaFileUtils.getTotalMediaSize(set);
        double d2 = ((double) totalMediaSize) / n0;
        if (StorageUtils.checkSdcardStorage(this, totalMediaSize)) {
            I0(set, d2);
        } else {
            J0();
        }
    }

    private void I0(final Set<DownloadInfo> set, double d2) {
        new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(getString(R.string.not_wifi_download_warning, new Object[]{Double.valueOf(d2)})).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: va2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.u0(set, dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: xa2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FreeTrainingDetailActivity.v0(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void J0() {
        new AlertDialogFragment.Builder(this).setCancelable(false).setTitle(R.string.storage_space_not_enough).setNeutralButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: wa2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show(getSupportFragmentManager());
    }

    private void K0() {
        if (this.U) {
            if (GlobalKeeper.getHrNeedTip() && TrainerInfo.get().hasHrDevice) {
                R();
            } else if (TrainingPlayActivity.startTrainingPlayActivity(this, this.P, 0L, null, null)) {
                this.L.setEnabled(false);
            }
        }
    }

    private void P() {
        if (this.P == null) {
            return;
        }
        Observable.fromCallable(new Callable() { // from class: ka2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b0();
            }
        }).subscribeOn(Schedulers.io()).subscribe(new Action1() { // from class: ta2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                FreeTrainingDetailActivity.c0(obj);
            }
        }, new Action1() { // from class: pa2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                FreeTrainingDetailActivity.a0((Throwable) obj);
            }
        });
    }

    private void Q(List<ActionContent> list, boolean z) {
        TrainingRoundExpandableLayout trainingRoundExpandableLayout = new TrainingRoundExpandableLayout(this);
        trainingRoundExpandableLayout.setTrainingDetailContent(this.P, list, z);
        trainingRoundExpandableLayout.setPosition(this.F.getChildCount());
        this.X.put(this.F.getChildCount(), false);
        this.F.addView(trainingRoundExpandableLayout);
        trainingRoundExpandableLayout.setOnItemOperatorListener(new b());
    }

    private void R() {
        TrainingHRTipFragment trainingHRTipFragment = new TrainingHRTipFragment();
        trainingHRTipFragment.setDialogButtonListener(new c(trainingHRTipFragment));
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(trainingHRTipFragment, "TrainingHRTipFragment");
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    private void S(Set<DownloadInfo> set) {
        if (this.S.startDownload(this.P.trainingId.longValue(), set)) {
            this.V = true;
            this.L.setVisibility(8);
            this.M.setVisibility(0);
            this.O.setText(getString(R.string.download_progress, new Object[]{Double.valueOf(0.0d), Double.valueOf(((double) MediaFileUtils.getTotalMediaSize(set)) / n0)}));
        }
    }

    private void T(boolean z) {
        this.L.setEnabled(z);
        this.x.setEnabled(z);
    }

    private void U() {
        this.V = false;
        this.N.setProgress(0);
        this.O.setText("");
        this.L.setVisibility(0);
        this.M.setVisibility(8);
        this.S.shutdownDownloader();
    }

    private boolean V() {
        TrainingDetail trainingDetail = this.P;
        if (trainingDetail == null) {
            return false;
        }
        return MediaFileUtils.getUnDownloadContent(trainingDetail).isEmpty();
    }

    private void W() {
        this.W = getIntent().getLongExtra("EXTRA_TRAINING_ID", -1L);
        HMLog.i(Z, "跳转到课程训练页面id：：" + this.W, new Object[0]);
        Observable.fromCallable(new Callable() { // from class: ja2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.i0();
            }
        }).subscribeOn(Schedulers.io()).map(new Func1() { // from class: ua2
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.j0((Boolean) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: na2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.l0((Pair) obj);
            }
        }, new Action1() { // from class: sa2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                FreeTrainingDetailActivity.n0((Throwable) obj);
            }
        });
    }

    private boolean X() {
        return NetUtil.isConnectedBy2G(this) || NetUtil.isConnectedBy3G(this) || NetUtil.isConnectedBy4G(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(String str) {
        if (this.T) {
            TrainingAnalytics.event(this, TrainingAnalytics.EventId.JOINEDTRAINING_OPERATE, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object Z() {
        return "参加或退出训练更新数据库失败";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a0(Throwable th) {
        Loggers.getLogger().w(Z, th, new Supplier() { // from class: ab2
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FreeTrainingDetailActivity.Z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object b0() throws Exception {
        TrainingItem trainingItem = DataConverter.toTrainingItem(this.P, this.T);
        TrainingDBUtils.addIntoJoinedTraining(trainingItem);
        if (this.T) {
            NewTrainingDb.INSTANCE.insertOrUpdateJoinedTraining(this.P, V());
            return null;
        }
        NewTrainingDb.INSTANCE.exitJoinedTraining(trainingItem.trainingId.longValue());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c0(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer d0() throws Exception {
        return NewTrainingDb.INSTANCE.updateParticipationDownloadState(this.P.trainingId.longValue(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object e0(Integer num) {
        return "成功更新数据库中已参与的动作训练已下载, 影响的行数: " + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f0(final Integer num) {
        Loggers.getLogger().v(Z, new Supplier() { // from class: za2
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FreeTrainingDetailActivity.e0(num);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g0() {
        return "更新数据库中已参与的动作训练的下载状态失败";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h0(Throwable th) {
        Loggers.getLogger().w(Z, th, new Supplier() { // from class: bb2
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FreeTrainingDetailActivity.g0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean i0() throws Exception {
        return Boolean.valueOf(TrainingDBUtils.isJoinedTraining(this.W) || NewTrainingDb.INSTANCE.hasJoinedTraining(this.W));
    }

    private void initView() {
        setTitleBarVisible(false);
        this.x = (ImageView) findViewById(R.id.imv_more);
        this.y = (ImageView) findViewById(R.id.imv_header);
        this.A = (UpDownTextItem) findViewById(R.id.udti_kcalorie);
        this.B = (UpDownTextItem) findViewById(R.id.udti_time);
        this.C = (UpDownTextItem) findViewById(R.id.udti_difficulity);
        this.D = (TextView) findViewById(R.id.tx_training_name);
        this.E = (ReadMoreTextView) findViewById(R.id.tx_introduction);
        this.F = (LinearLayout) findViewById(R.id.ll_training_list);
        this.L = (TextView) findViewById(R.id.tx_join);
        this.M = (LinearLayout) findViewById(R.id.ll_download_progress);
        this.N = (ProgressBar) findViewById(R.id.cpv_download_progress);
        this.I = (ReadMoreTextView) findViewById(R.id.tx_coach_introduce);
        this.J = (TextView) findViewById(R.id.tx_coach_name);
        this.K = (ImageView) findViewById(R.id.imv_coach_header);
        this.O = (TextView) findViewById(R.id.tx_download_progress);
        this.R = (RelativeLayout) findViewById(R.id.rl_bottom);
        this.z = (TextView) findViewById(R.id.tx_subtitle_one);
        this.G = findViewById(R.id.action_list_top_divider);
        this.H = findViewById(R.id.action_list_bottom_divider);
        this.N.setMax(100);
        findViewById(R.id.imv_back).setOnClickListener(this);
        findViewById(R.id.imv_share).setOnClickListener(this);
        ImageView imageView = (ImageView) findViewById(R.id.imv_close_download);
        imageView.setOnClickListener(this);
        int i = R.color.white100;
        TintUtils.tintDrawable(imageView, ContextCompat.getColor(this, i));
        this.x.setOnClickListener(this);
        this.L.setOnClickListener(this);
        this.K.setOnClickListener(this);
        this.E.setOnSpanTextClickListener(new ReadMoreTextView.OnSpanTextClickListener() { // from class: ga2
            @Override // com.xiaomi.hm.health.training.ui.widget.ReadMoreTextView.OnSpanTextClickListener
            public final void onSpanTextClick(boolean z) {
                this.a.o0(z);
            }
        });
        this.I.setOnSpanTextClickListener(new ReadMoreTextView.OnSpanTextClickListener() { // from class: ha2
            @Override // com.xiaomi.hm.health.training.ui.widget.ReadMoreTextView.OnSpanTextClickListener
            public final void onSpanTextClick(boolean z) {
                this.a.p0(z);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcv_joined_tranner);
        this.Q = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 0, false);
        linearLayoutManager.setSmoothScrollbarEnabled(false);
        this.Q.setLayoutManager(linearLayoutManager);
        this.Q.addItemDecoration(new LinearLayoutDecoration(this, 0, R.dimen.divider_size_dp8, i));
        this.Q.setHasFixedSize(true);
        T(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Pair j0(Boolean bool) {
        return new Pair(bool, bool.booleanValue() ? TrainingDBUtils.queryTrainingDetail(this.W) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(boolean z) {
        if (!z) {
            F0(R.string.loading);
        }
        RequestTrainingAPI.reqTrainingDetail(this.W, new boolean[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(Pair pair) {
        final boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        this.T = zBooleanValue;
        Runnable runnable = new Runnable() { // from class: ia2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.k0(zBooleanValue);
            }
        };
        this.x.setVisibility(zBooleanValue ? 0 : 8);
        if (zBooleanValue) {
            TrainingDetail trainingDetail = (TrainingDetail) pair.second;
            T(trainingDetail != null);
            if (trainingDetail != null) {
                C0(trainingDetail);
            } else {
                runnable.run();
            }
            this.P = trainingDetail;
        }
        if (this.W > 0) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n0(Throwable th) {
        HMLog.error(Z, "", th, new Function0() { // from class: ma2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return FreeTrainingDetailActivity.m0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(boolean z) {
        Y(TrainingAnalytics.ParamValue.JoinedTrainingOperate.TRAINING_DESCRIPTION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(boolean z) {
        Y(TrainingAnalytics.ParamValue.JoinedTrainingOperate.COACH_DESCRIPTION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(DialogInterface dialogInterface, int i) {
        K0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s0(DialogInterface dialogInterface, int i) {
    }

    public static void startActivity(Context context, long j, String str) {
        TrainingAnalytics.event(context, TrainingAnalytics.EventId.SEETRAINING_SOURCE, str);
        Intent intent = new Intent(context, (Class<?>) FreeTrainingDetailActivity.class);
        intent.putExtra("EXTRA_TRAINING_ID", j);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(int i) {
        if (i == R.id.item_setting) {
            Y("Settings");
            TrainingSettingActivity.startForResult(this);
            return;
        }
        if (i == R.id.item_download_video) {
            Y("Download");
            if (!this.V) {
                this.U = false;
            }
            x0();
            return;
        }
        if (i == R.id.item_exit_training) {
            Y("Quit");
            E0(this.P.trainingId.longValue());
        } else if (i == R.id.btn_cancel) {
            Y("Cancel");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(Set set, DialogInterface dialogInterface, int i) {
        S(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v0(DialogInterface dialogInterface, int i) {
    }

    private boolean x0() {
        if (this.V) {
            IconToast.showError(this, R.string.indownloading);
            return false;
        }
        Set<DownloadInfo> unDownloadContent = MediaFileUtils.getUnDownloadContent(this.P);
        if (unDownloadContent.isEmpty()) {
            if (this.U) {
                return false;
            }
            IconToast.showSuccess(this, R.string.medias_all_downloaded);
            return false;
        }
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, R.string.no_network_connection);
            return true;
        }
        if (NetUtil.isWifiConnected(this)) {
            S(unDownloadContent);
            return true;
        }
        H0(unDownloadContent);
        return true;
    }

    private void y0(TrainingDetail trainingDetail) {
        TrainingDBUtils.saveTrainingDatasInTxAsync(trainingDetail);
    }

    private void z0(int i) {
        LoadingDialog loadingDialog = this.Y;
        if (loadingDialog != null) {
            loadingDialog.setFailed(getString(i), 1000, null);
        }
    }

    @Override // com.xiaomi.hm.health.traininglib.media.MediaDownloaderManager.DownloadListener
    public void downloadFinish(int i) {
        this.V = false;
        U();
        if (i != 0) {
            IconToast.showError(this, R.string.download_medias_failed);
            return;
        }
        K0();
        if (this.P != null) {
            Observable.fromCallable(new Callable() { // from class: la2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.d0();
                }
            }).subscribeOn(Schedulers.io()).subscribe(new Action1() { // from class: oa2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    FreeTrainingDetailActivity.f0((Integer) obj);
                }
            }, new Action1() { // from class: ra2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    FreeTrainingDetailActivity.h0((Throwable) obj);
                }
            });
        }
    }

    @Override // com.xiaomi.hm.health.traininglib.media.MediaDownloaderManager.DownloadListener
    public void downloadProgress(long j, long j2, long j3) {
        if (this.P.trainingId.longValue() == j) {
            double d2 = j3 / n0;
            double d3 = j2 / n0;
            double d4 = (100.0d * d2) / d3;
            HMLog.d(Z, "totalDownloadProgress: " + d4, new Object[0]);
            this.N.setProgress((int) d4);
            this.O.setText(getString(R.string.download_progress, new Object[]{Double.valueOf(d2), Double.valueOf(d3)}));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1901) {
            TrainingConfigManager.syncAlarmConfig();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        U();
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.tx_join) {
            if (id == R.id.imv_close_download) {
                U();
                return;
            }
            if (id == R.id.imv_back) {
                U();
                finish();
                return;
            }
            if (id == R.id.imv_more) {
                G0();
                return;
            }
            if (id != R.id.imv_coach_header || this.P == null) {
                return;
            }
            Y(TrainingAnalytics.ParamValue.JoinedTrainingOperate.COACH_HOMEPAGE);
            Coach coach = this.P.coach;
            if (coach != null) {
                WebBrowserUtils.jump2WebBrowser(this, coach.getHomePageUrl(), getString(R.string.share_mifit_circle_label));
                return;
            }
            return;
        }
        if (!this.T && !PolicyTipUtil.isNeedIntercept()) {
            TrainingDetail trainingDetail = this.P;
            if (trainingDetail != null) {
                RequestTrainingAPI.reqJoinTraining(trainingDetail.trainingId.longValue(), true);
                return;
            }
            return;
        }
        this.U = true;
        Y("Start");
        if ("YOGA".equals(this.P.trainingType)) {
            if (!X()) {
                K0();
                return;
            } else {
                new AlertDialogFragment.Builder(this).setMessage(getString(R.string.consume_mobile_traffic_format, new Object[]{Formatter.formatFileSize(this, this.P.videoSize)})).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: qa2
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.a.q0(dialogInterface, i);
                    }
                }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show(getSupportFragmentManager());
                return;
            }
        }
        if (x0()) {
            return;
        }
        HMLog.d(Z, "当前节已经下载完成", new Object[0]);
        BlockMultiClickListener.conflictClick(view, new long[0]);
        K0();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_free_training_detail);
        EventBus.getDefault().register(this);
        initView();
        W();
        MediaDownloaderManager mediaDownloaderManager = new MediaDownloaderManager(this);
        this.S = mediaDownloaderManager;
        mediaDownloaderManager.setDownloadListener(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.S.setDownloadListener(null);
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(EventReqTrainingData eventReqTrainingData) {
        Object obj;
        int i = eventReqTrainingData.method;
        if (i != EventReqTrainingData.DATA_TRAIN_DETAIL.method) {
            if (i != EventReqTrainingData.DATA_JOIN_TRAININGS.method) {
                if (i != EventReqTrainingData.DATA_TRAINING_RUNCIRCLEPOSTS.method || (obj = eventReqTrainingData.respData) == null) {
                    return;
                }
                B0((List) obj, 6);
                return;
            }
            Object obj2 = eventReqTrainingData.respData;
            if (obj2 == null || eventReqTrainingData.resultFlag != 0) {
                if (eventReqTrainingData.resultFlag == 2 && eventReqTrainingData.httpCancleType == 4) {
                    IconToast.showError(this, R.string.net_not_work);
                    return;
                } else {
                    if (this.T) {
                        IconToast.showError(this, R.string.exit_fail);
                        return;
                    }
                    return;
                }
            }
            boolean z = Boolean.parseBoolean(((HMHttpResponseData) obj2).getTag());
            this.T = z;
            this.x.setVisibility(z ? 0 : 8);
            if (this.T) {
                D0(this.P);
                y0(this.P);
            } else {
                this.L.setText(R.string.join_training);
                TrainingDBUtils.deleteFreeTrainingDatas(this.P.trainingId.longValue());
            }
            P();
            return;
        }
        Object obj3 = eventReqTrainingData.respData;
        if (obj3 != null && eventReqTrainingData.resultFlag == 0) {
            TrainingDetail trainingDetail = (TrainingDetail) obj3;
            boolean z2 = "SINGLE_TRAINING".equals(trainingDetail.trainingType) && trainingDetail.content != null;
            boolean zEquals = "YOGA".equals(trainingDetail.trainingType);
            if (z2 || zEquals) {
                if (this.P != null) {
                    boolean z3 = trainingDetail.getUpdateTime().longValue() > this.P.getUpdateTime().longValue();
                    boolean z4 = trainingDetail.bgMusic != null && this.P.bgMusic == null;
                    boolean z5 = trainingDetail.trainingType != null && this.P.trainingType == null;
                    boolean z6 = trainingDetail.yogaUrl != null && this.P.yogaUrl == null;
                    if (z3 || z4 || z5 || z6) {
                        C0(trainingDetail);
                        if (this.P.finishNumber.intValue() > trainingDetail.finishNumber.intValue()) {
                            trainingDetail.finishNumber = this.P.finishNumber;
                        }
                        this.P = trainingDetail;
                        y0(trainingDetail);
                    }
                } else {
                    this.P = trainingDetail;
                    C0(trainingDetail);
                    y0(trainingDetail);
                }
            }
            if (!this.T) {
                A0();
            }
            T(this.P != null);
        } else if (eventReqTrainingData.resultFlag == 2 && eventReqTrainingData.httpCancleType == 4) {
            if (this.T) {
                IconToast.showError(this, R.string.net_not_work);
            } else {
                z0(R.string.net_not_work);
            }
        } else if (this.P == null) {
            if (this.T) {
                IconToast.showError(this, R.string.loading_error);
            } else {
                z0(R.string.loading_error);
            }
            this.R.setVisibility(8);
        }
        LoadingDialog loadingDialog = this.Y;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.Y.dismiss();
    }
}
