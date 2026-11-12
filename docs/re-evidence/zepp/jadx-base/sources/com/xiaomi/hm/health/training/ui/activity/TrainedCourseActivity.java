package com.xiaomi.hm.health.training.ui.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
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
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.lib.view.ViewUtils;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceSpanUtils;
import com.xiaomi.hm.health.baseutil.GlobalKeeper;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.calendar.ExpandableCalendar;
import com.xiaomi.hm.health.calendar.utils.CalendarDateUtils;
import com.xiaomi.hm.health.calendar.utils.DateBeanWrapper;
import com.xiaomi.hm.health.calendar.utils.DateSingleInstance;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.NewTrainingDb;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.ui.activity.TrainedCourseActivity;
import com.xiaomi.hm.health.training.ui.activity.trainplay.TrainingPlayActivity;
import com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter;
import com.xiaomi.hm.health.training.ui.adapter.CommonViewHolder;
import com.xiaomi.hm.health.training.ui.fragment.CourseDownLoadAllDialogFragment;
import com.xiaomi.hm.health.training.ui.fragment.TrainingHRTipFragment;
import com.xiaomi.hm.health.training.ui.fragment.TrainingMoreDialogFragment;
import com.xiaomi.hm.health.training.ui.helper.LoadingDialogHelper;
import com.xiaomi.hm.health.training.ui.listener.BlockMultiClickListener;
import com.xiaomi.hm.health.training.ui.widget.LinearLayoutDecoration;
import com.xiaomi.hm.health.training.ui.widget.UpDownTextItem;
import com.xiaomi.hm.health.training.utils.OtherUtils;
import com.xiaomi.hm.health.training.utils.TrainingCourseUtils;
import com.xiaomi.hm.health.training.utils.WebBrowserUtils;
import com.xiaomi.hm.health.traininglib.event.EventReqTrainingData;
import com.xiaomi.hm.health.traininglib.media.MediaDownloaderManager;
import com.xiaomi.hm.health.traininglib.media.StorageUtils;
import com.xiaomi.hm.health.traininglib.model.DownloadInfo;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.util.MediaFileUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import com.xiaomi.hm.health.traininglib.util.TrainingConfigManager;
import com.xiaomi.hm.health.traininglib.util.TrainingDBUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import com.xiaomi.hm.health.traininglib.webapi.RequestTrainingAPI;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
public class TrainedCourseActivity extends BaseTitleActivity implements View.OnClickListener, MediaDownloaderManager.DownloadListener {
    public static final String TRAINING_COURSE = "TRAINING_COURSE";
    private static final String q0 = "TrainedCourseActivity";
    private static final int r0 = 100;
    private static final double s0 = 1048576.0d;
    private static TrainingCourse t0 = null;
    private static final int u0 = 0;
    private static final int v0 = 1;
    private static final int w0 = 2;
    private UpDownTextItem A;
    private TextView B;
    private TextView C;
    private TextView D;
    private ExpandableCalendar E;
    private LinearLayout F;
    private TextView G;
    private TextView H;
    private RelativeLayout I;
    private TextView J;
    private View K;
    private LinearLayout L;
    private LinearLayout M;
    private ProgressBar N;
    private TextView O;
    private RecyclerView P;
    private ImageView Q;
    private TextView R;
    private LinearLayout S;
    private boolean T;
    private boolean U;
    private TrainingCourseItem V;
    private TrainingDetail W;
    private MediaDownloaderManager X;
    private List<DateBeanWrapper<TrainingCourseItem>> Y;
    private LoadingDialogHelper Z;
    private int m0 = 0;
    private List<TrainingDetail> n0 = new ArrayList();
    private Set<DownloadInfo> o0 = new HashSet();
    private boolean p0;
    private ImageView x;
    private UpDownTextItem y;
    private UpDownTextItem z;

    public class a extends CommonRecycleAdapter<ActionContent> {
        public final /* synthetic */ TrainerInfo d;
        public final /* synthetic */ ArrayList e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, List list, TrainerInfo trainerInfo, ArrayList arrayList) {
            super(i, i2, list);
            this.d = trainerInfo;
            this.e = arrayList;
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bindViewHolder(CommonViewHolder commonViewHolder, ActionContent actionContent) {
            ActionVideo actionVideo;
            List<ActionVideo> list = actionContent.videos;
            if (list == null || list.size() <= 0) {
                return;
            }
            if (actionContent.videos.size() == 2) {
                actionVideo = actionContent.videos.get(0).gender.intValue() == this.d.gender ? actionContent.videos.get(0) : actionContent.videos.get(1);
            } else {
                actionVideo = actionContent.videos.get(0);
            }
            commonViewHolder.setImageByUrl(R.id.imv_background_item, actionVideo.thumbnail).setText(R.id.tx_video_name, actionVideo.name);
            if ("COUNT".equals(actionContent.type)) {
                commonViewHolder.setText(R.id.tx_repeat_times, TrainedCourseActivity.this.getResources().getQuantityString(R.plurals.with_unit_times, actionContent.repeatNumber.intValue(), actionContent.repeatNumber));
            } else {
                int longByGender = (int) (ParseJsonUtil.getLongByGender(actionContent.duration, this.d) / 1000);
                commonViewHolder.setText(R.id.tx_repeat_times, TrainedCourseActivity.this.getResources().getQuantityString(R.plurals.next_rest_time, longByGender, Integer.valueOf(longByGender)));
            }
            if (actionContent.nextRestTime.longValue() > 0) {
                int iLongValue = (int) (actionContent.nextRestTime.longValue() / 1000);
                commonViewHolder.setText(R.id.tx_rest_time, TrainedCourseActivity.this.getResources().getQuantityString(R.plurals.next_rest_time_seconds, iLongValue, Integer.valueOf(iLongValue)));
            } else {
                commonViewHolder.setVisibility(R.id.divider_line, 8);
                commonViewHolder.setVisibility(R.id.ll_rest, 8);
            }
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onItemClick(ActionContent actionContent, int i) {
            Intent intent = new Intent(TrainedCourseActivity.this, (Class<?>) ActionDetailActivity.class);
            intent.putExtra(ActionDetailActivity.TRAINING_ACTION_CONTENT, this.e);
            intent.putExtra(ActionDetailActivity.TRAINING_ACTION_CONTENT_POSITION, i);
            TrainedCourseActivity.this.startActivity(intent);
        }
    }

    public class b implements TrainingHRTipFragment.DialogButtonListener {
        public final /* synthetic */ TrainingHRTipFragment a;

        public b(TrainingHRTipFragment trainingHRTipFragment) {
            this.a = trainingHRTipFragment;
        }

        @Override // com.xiaomi.hm.health.training.ui.fragment.TrainingHRTipFragment.DialogButtonListener
        public void onDismiss() {
        }

        @Override // com.xiaomi.hm.health.training.ui.fragment.TrainingHRTipFragment.DialogButtonListener
        public void onNotTips() {
            GlobalKeeper.setHrNeedTip(false);
            this.a.dismissAllowingStateLoss();
            TrainedCourseActivity trainedCourseActivity = TrainedCourseActivity.this;
            if (!TrainingPlayActivity.startTrainingPlayActivity(trainedCourseActivity, trainedCourseActivity.W, TrainedCourseActivity.t0.trainingPlanId.longValue(), TrainedCourseActivity.this.V, null)) {
                TrainedCourseActivity.this.o0.clear();
            } else {
                TrainedCourseActivity.this.G.setEnabled(false);
                TrainedCourseActivity.this.finish();
            }
        }
    }

    private void A0(double d) {
        CourseDownLoadAllDialogFragment courseDownLoadAllDialogFragment = new CourseDownLoadAllDialogFragment();
        courseDownLoadAllDialogFragment.setSuggestTitle(getString(R.string.suggest_download_all_training, new Object[]{Double.valueOf(d / s0)}));
        courseDownLoadAllDialogFragment.setOnViewClickListener(new CourseDownLoadAllDialogFragment.OnViewClickListener() { // from class: xs7
            @Override // com.xiaomi.hm.health.training.ui.fragment.CourseDownLoadAllDialogFragment.OnViewClickListener
            public final void onViewClick(int i) {
                this.a.k0(i);
            }
        });
        courseDownLoadAllDialogFragment.show(getSupportFragmentManager(), (String) null);
    }

    private void B0(final long j) {
        new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(R.string.confirm_exit_training_course).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: ws7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RequestTrainingAPI.reqExitTrainingPlans(j);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: mt7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TrainedCourseActivity.m0(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void C0() {
        J0("More");
        TrainingMoreDialogFragment trainingMoreDialogFragment = new TrainingMoreDialogFragment();
        trainingMoreDialogFragment.setHasBoundHrDevice(TrainerInfo.get().hasHrDevice);
        trainingMoreDialogFragment.setShowDownloadButton(true);
        trainingMoreDialogFragment.setOnViewClickListener(new TrainingMoreDialogFragment.OnViewClickListener() { // from class: ys7
            @Override // com.xiaomi.hm.health.training.ui.fragment.TrainingMoreDialogFragment.OnViewClickListener
            public final void onViewClick(int i) {
                this.a.n0(i);
            }
        });
        trainingMoreDialogFragment.setOnViewCreateListener(new TrainingMoreDialogFragment.OnViewCreateListener() { // from class: zs7
            @Override // com.xiaomi.hm.health.training.ui.fragment.TrainingMoreDialogFragment.OnViewCreateListener
            public final void onViewCreate(TextView textView, TextView textView2) {
                TrainedCourseActivity.o0(textView, textView2);
            }
        });
        trainingMoreDialogFragment.show(getSupportFragmentManager(), (String) null);
    }

    private void D0(final Set<DownloadInfo> set, double d) {
        new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(getString(R.string.not_wifi_download_warning, new Object[]{Double.valueOf(d / s0)})).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: ht7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.p0(set, dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: nt7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TrainedCourseActivity.q0(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void E0(final DateBeanWrapper<TrainingCourseItem> dateBeanWrapper) {
        final TrainingCourseItem extraData = dateBeanWrapper.getExtraData();
        this.P.setVisibility(8);
        this.F.setVisibility(0);
        if (dateBeanWrapper.isWaitingDay()) {
            this.D.setVisibility(4);
        } else {
            this.D.setVisibility(0);
            this.D.setText(R.string.training_rest_day);
        }
        if (extraData.articleTitle == null) {
            this.S.setVisibility(8);
            return;
        }
        this.S.setVisibility(0);
        ImageView imageView = this.Q;
        String str = extraData.articleImgUrl;
        int i = R.drawable.icon_default_item_head;
        OtherUtils.loadWithGlide(this, imageView, str, i, i);
        this.R.setText(extraData.articleTitle);
        this.S.setOnClickListener(new View.OnClickListener() { // from class: ot7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.r0(dateBeanWrapper, extraData, view);
            }
        });
    }

    private void F0() {
        new AlertDialogFragment.Builder(this).setCancelable(false).setTitle(R.string.storage_space_not_enough).setNeutralButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: lt7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show(getSupportFragmentManager());
    }

    private void G0(TrainingDetail trainingDetail) {
        List<ActionContent> list = trainingDetail.content;
        if (list == null || list.size() <= 0) {
            return;
        }
        w0((ArrayList) trainingDetail.content);
    }

    private void H0(TrainingCourseItem trainingCourseItem) {
        this.F.setVisibility(8);
        this.P.setVisibility(0);
        this.V = trainingCourseItem;
        TrainingDetail trainingDetail = trainingCourseItem.trainingDetail;
        this.W = trainingDetail;
        if (trainingDetail != null) {
            G0(trainingDetail);
        }
    }

    private void I0() {
        if (this.U) {
            if (GlobalKeeper.getHrNeedTip() && TrainerInfo.get().hasHrDevice) {
                O();
            } else if (!TrainingPlayActivity.startTrainingPlayActivity(this, this.W, t0.trainingPlanId.longValue(), this.V, null)) {
                this.o0.clear();
            } else {
                this.G.setEnabled(false);
                finish();
            }
        }
    }

    private void J0(String str) {
        TrainingAnalytics.event(this, TrainingAnalytics.EventId.TRAININGCOURSES_OUT, str);
    }

    private void N(DateBeanWrapper<TrainingCourseItem> dateBeanWrapper) {
        TrainingCourseItem extraData = dateBeanWrapper.getExtraData();
        if (RainbowUtils.isDarkMode(this)) {
            this.J.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, ContextCompat.getDrawable(getApplicationContext(), R.drawable.img_rest_day_dark), (Drawable) null, (Drawable) null);
        } else {
            this.J.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, ContextCompat.getDrawable(getApplicationContext(), R.drawable.img_rest_day), (Drawable) null, (Drawable) null);
        }
        if (this.m0 == 0) {
            if (dateBeanWrapper.isWaitingDay()) {
                y0(getResources().getQuantityString(R.plurals.course_will_start_xdays_after, dateBeanWrapper.getWaitDays(), Integer.valueOf(dateBeanWrapper.getWaitDays())));
            } else {
                x0(getString(R.string.day_index_of_total, new Object[]{Integer.valueOf(extraData.dayIndex.intValue() + 1), Integer.valueOf(t0.totalDays)}));
            }
            this.D.setVisibility(0);
            this.D.setText(extraData.name);
        }
        if (this.m0 == 2) {
            this.I.setVisibility(0);
            this.H.setVisibility(0);
            this.K.setVisibility(0);
            this.G.setVisibility(0);
            this.H.setText(R.string.re_join_course);
            this.G.setText(R.string.re_do_course);
            return;
        }
        if (extraData.trainingId.longValue() == 0) {
            this.I.setVisibility(8);
            this.J.setText(dateBeanWrapper.isWaitingDay() ? R.string.training_course_will_start : R.string.training_rest_day);
            return;
        }
        this.I.setVisibility(0);
        if (TrainingDateUtils.isSameDay(dateBeanWrapper.getDate(), TrainingDateUtils.getNow())) {
            this.H.setVisibility(8);
            this.K.setVisibility(8);
            this.G.setVisibility(0);
            if (extraData.isFinished.booleanValue()) {
                this.G.setText(R.string.training_again);
                return;
            } else {
                this.G.setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(getResources().getString(R.string.start_xday_training, Integer.valueOf(extraData.getDayIndex().intValue() + 1)), this, Font.KM, Integer.valueOf((int) ViewUtils.sp2px(this, 24.0f)), null));
                return;
            }
        }
        if (!TrainingDateUtils.isBeforeDay(dateBeanWrapper.getDate(), TrainingDateUtils.getNow())) {
            this.H.setVisibility(0);
            this.K.setVisibility(0);
            this.G.setVisibility(0);
            this.H.setText(R.string.go_back_today);
            this.G.setText(getResources().getString(R.string.early_start_xday_training, Integer.valueOf(extraData.getDayIndex().intValue() + 1)));
            return;
        }
        this.H.setVisibility(8);
        this.K.setVisibility(8);
        this.G.setVisibility(0);
        if (extraData.isFinished.booleanValue()) {
            this.G.setText(R.string.training_again);
        } else {
            this.G.setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(getResources().getString(R.string.makeup_xday_training, Integer.valueOf(extraData.getDayIndex().intValue() + 1)), this, Font.KM, Integer.valueOf((int) ViewUtils.sp2px(this, 24.0f)), null));
        }
    }

    private void O() {
        TrainingHRTipFragment trainingHRTipFragment = new TrainingHRTipFragment();
        trainingHRTipFragment.setDialogButtonListener(new b(trainingHRTipFragment));
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(trainingHRTipFragment, "TrainingHRTipFragment");
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    private void P(Set<DownloadInfo> set) {
        int totalMediaSize = MediaFileUtils.getTotalMediaSize(set);
        if (!StorageUtils.checkSdcardStorage(this, totalMediaSize)) {
            F0();
            return;
        }
        boolean zIsWifiConnected = NetUtil.isWifiConnected(this);
        boolean zIsNetworkConnected = NetUtil.isNetworkConnected(this);
        if (zIsWifiConnected) {
            Q(set);
        } else if (zIsNetworkConnected) {
            D0(set, totalMediaSize);
        } else {
            IconToast.showError(this, R.string.no_network_connection);
        }
    }

    private void Q(Set<DownloadInfo> set) {
        if (this.X.startDownload(t0.trainingPlanId.longValue(), set)) {
            this.T = true;
            this.I.setVisibility(0);
            this.M.setVisibility(8);
            this.L.setVisibility(0);
            this.O.setText(getString(R.string.download_progress, new Object[]{Double.valueOf(0.0d), Double.valueOf(((double) MediaFileUtils.getTotalMediaSize(set)) / s0)}));
        }
    }

    private void R() {
        this.o0.clear();
        this.T = false;
        this.N.setProgress(0);
        this.O.setText("");
        this.M.setVisibility(0);
        this.L.setVisibility(8);
        this.X.shutdownDownloader();
        if (this.F.getVisibility() == 0) {
            this.I.setVisibility(8);
        }
    }

    private Set<DownloadInfo> S() {
        List<TrainingCourseItem> list;
        TrainingCourse trainingCourse = t0;
        if (trainingCourse != null && (list = trainingCourse.dayTrainingItems) != null && list.size() > 0) {
            if (this.n0 == null) {
                this.n0 = new ArrayList();
            }
            if (this.n0.size() == 0) {
                Iterator<TrainingCourseItem> it2 = t0.dayTrainingItems.iterator();
                while (it2.hasNext()) {
                    TrainingDetail trainingDetail = it2.next().trainingDetail;
                    if (trainingDetail != null && trainingDetail.content != null) {
                        this.n0.add(trainingDetail);
                    }
                }
            }
            if (this.o0.isEmpty() && !this.p0) {
                Iterator<TrainingDetail> it3 = this.n0.iterator();
                while (it3.hasNext()) {
                    this.o0.addAll(MediaFileUtils.getUnDownloadContent(it3.next()));
                }
                this.p0 = this.o0.isEmpty();
            }
        }
        return new HashSet(this.o0);
    }

    private Set<DownloadInfo> T() {
        HashSet hashSet = new HashSet();
        TrainingDetail trainingDetail = this.W;
        return trainingDetail != null ? MediaFileUtils.getUnDownloadContent(trainingDetail) : hashSet;
    }

    private void U() {
        ExpandableCalendar expandableCalendar = (ExpandableCalendar) findViewById(R.id.ecl_calendar);
        this.E = expandableCalendar;
        expandableCalendar.setEnableDraggerWhenMonthMode(false);
        V(t0);
        v0(t0);
        u0();
    }

    private void V(TrainingCourse trainingCourse) {
        OtherUtils.loadWithGlide(this, this.x, trainingCourse.detailsPageIllustrated);
        this.y.setDownText(String.valueOf(trainingCourse.totalDays));
        this.A.setDownText(TrainingCourseUtils.getDifficulityDegree(this, trainingCourse.difficultyDegree));
        int i = trainingCourse.trainingDays;
        this.z.setDownText(String.format(Locale.getDefault(), "%.0f", Double.valueOf(i > 0 ? Math.ceil((trainingCourse.time / ((double) i)) / 60000.0d) : 0.0d)));
        this.B.setText(trainingCourse.name);
        this.C.setText(trainingCourse.introduction);
    }

    private void W(Date date) {
        DateBeanWrapper<TrainingCourseItem> dateTraining = TrainingCourseUtils.getDateTraining(this.Y, date);
        if (dateTraining != null) {
            z0(dateTraining);
        }
        DateSingleInstance.getInstance().setChooseDate(date);
        this.E.gotoToday(TrainingCourseUtils.getTodayWeekIndex(this.Y, date));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrainingCourse X(TrainingCourse trainingCourse) {
        if (trainingCourse != null) {
            return TrainingDBUtils.queryTrainedCourse(trainingCourse);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(TrainingCourse trainingCourse) {
        if (trainingCourse != null) {
            t0 = trainingCourse;
        }
        U();
        this.Z.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object Z() {
        return "查询训练计划详细信息失败";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(Throwable th) {
        U();
        this.Z.setFail(R.string.load_error);
        Loggers.getLogger().w(q0, th, new Supplier() { // from class: st7
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return TrainedCourseActivity.Z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean b0() throws Exception {
        TrainingDBUtils.deleteTrainedCourse();
        NewTrainingDb.INSTANCE.deleteTrainingPlan();
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(Boolean bool) {
        EventBus.getDefault().post(t0);
        t0.status = TrainingCourse.NOT_CUSTOM;
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d0() {
        return "退出训练计划发生错误";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e0(Throwable th) {
        Loggers.getLogger().w(q0, th, new Supplier() { // from class: rt7
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return TrainedCourseActivity.d0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean f0(Long l) {
        S();
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g0(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i0(Throwable th) {
        HMLog.error("", "", th, new Function0() { // from class: bt7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainedCourseActivity.h0();
            }
        });
    }

    private void initView() {
        setTitleBarVisible(false);
        ImageView imageView = (ImageView) findViewById(R.id.imv_back);
        ImageView imageView2 = (ImageView) findViewById(R.id.imv_share);
        ImageView imageView3 = (ImageView) findViewById(R.id.imv_more);
        imageView3.setVisibility(0);
        this.P = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        linearLayoutManager.setSmoothScrollbarEnabled(false);
        this.P.setLayoutManager(linearLayoutManager);
        LinearLayoutDecoration linearLayoutDecoration = new LinearLayoutDecoration(this, 1, R.dimen.divider, R.color.black20);
        int i = R.dimen.item_horizontal_margin;
        linearLayoutDecoration.setExtraPaddingStart(i);
        linearLayoutDecoration.setExtraPaddingEnd(i);
        int i2 = R.color.white100;
        linearLayoutDecoration.setExtraColor(i2);
        this.P.addItemDecoration(linearLayoutDecoration);
        this.P.setNestedScrollingEnabled(false);
        this.x = (ImageView) findViewById(R.id.imv_header);
        this.y = (UpDownTextItem) findViewById(R.id.udti_kcalorie);
        this.z = (UpDownTextItem) findViewById(R.id.udti_time);
        this.A = (UpDownTextItem) findViewById(R.id.udti_difficulity);
        this.y.setUpText(R.string.total_days);
        this.z.setUpText(R.string.day_average);
        this.A.setUpText(R.string.difficulity);
        this.B = (TextView) findViewById(R.id.tx_training_name);
        this.C = (TextView) findViewById(R.id.tx_subtitle_one);
        this.D = (TextView) findViewById(R.id.tx_subtitle_two);
        this.C.setVisibility(0);
        this.D.setVisibility(0);
        this.F = (LinearLayout) findViewById(R.id.ll_rest);
        this.G = (TextView) findViewById(R.id.tx_start_training);
        this.H = (TextView) findViewById(R.id.tx_go_today);
        this.I = (RelativeLayout) findViewById(R.id.rl_bottom_btns);
        this.K = findViewById(R.id.bottom_vdivider);
        this.J = (TextView) findViewById(R.id.tx_rest_more);
        this.L = (LinearLayout) findViewById(R.id.ll_download_progress);
        this.M = (LinearLayout) findViewById(R.id.ll_btns);
        this.N = (ProgressBar) findViewById(R.id.cpv_download_progress);
        ImageView imageView4 = (ImageView) findViewById(R.id.imv_close_download);
        this.O = (TextView) findViewById(R.id.tx_download_progress);
        this.N.setMax(100);
        this.S = (LinearLayout) findViewById(R.id.rl_item);
        this.Q = (ImageView) findViewById(R.id.imv_item);
        this.R = (TextView) findViewById(R.id.tx_knowledge_title);
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        this.G.setOnClickListener(this);
        this.H.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        TintUtils.tintDrawable(imageView4, ContextCompat.getColor(this, i2));
        LoadingDialogHelper loadingDialogHelper = new LoadingDialogHelper(this);
        this.Z = loadingDialogHelper;
        loadingDialogHelper.showLoading();
        Observable.just((TrainingCourse) getIntent().getSerializableExtra("TRAINING_COURSE")).map(new Func1() { // from class: kt7
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return TrainedCourseActivity.X((TrainingCourse) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: ct7
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.Y((TrainingCourse) obj);
            }
        }, new Action1() { // from class: et7
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.a0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0() {
        J0(TrainingAnalytics.ParamValue.TrainingCoursesOut.TRAINING_REMIND);
        TrainingNotifyActivity.startForResult(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(int i) {
        if (i == R.id.item_download_all) {
            t0(S());
        } else if (i == R.id.item_download_current) {
            t0(T());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m0(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(int i) {
        if (i == R.id.item_setting) {
            TrainingSettingActivity.startForResult(this);
            J0("Settings");
        } else if (i == R.id.item_download_video) {
            if (!this.T) {
                this.U = false;
            }
            t0(S());
        } else if (i == R.id.item_exit_training) {
            J0(TrainingAnalytics.ParamValue.TrainingCoursesOut.QUIT_COURSES);
            B0(t0.trainingPlanId.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o0(TextView textView, TextView textView2) {
        textView.setText(R.string.download_all_training_videos);
        textView2.setText(R.string.exit_training_course);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(Set set, DialogInterface dialogInterface, int i) {
        Q(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q0(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(DateBeanWrapper dateBeanWrapper, TrainingCourseItem trainingCourseItem, View view) {
        J0(dateBeanWrapper.isWaitingDay() ? TrainingAnalytics.ParamValue.TrainingCoursesOut.NOT_STARTED_ARTICLES : TrainingAnalytics.ParamValue.TrainingCoursesOut.REST_ARTICLES);
        WebBrowserUtils.jump2WebBrowser(this, trainingCourseItem.articleLink, trainingCourseItem.articleTitle);
    }

    public static void startActvity(Context context, TrainingCourse trainingCourse) {
        if (trainingCourse != null) {
            Intent intent = new Intent(context, (Class<?>) TrainedCourseActivity.class);
            t0 = trainingCourse;
            for (TrainingCourseItem trainingCourseItem : trainingCourse.dayTrainingItems) {
                if (trainingCourseItem.trainingDetail != null) {
                    trainingCourseItem.trainingDetail = null;
                }
            }
            intent.putExtra("TRAINING_COURSE", trainingCourse);
            context.startActivity(intent);
        }
    }

    private boolean t0(Set<DownloadInfo> set) {
        if (this.T) {
            return false;
        }
        if (set != null && set.size() > 0) {
            P(set);
            return true;
        }
        if (this.U) {
            return false;
        }
        IconToast.showSuccess(this, R.string.medias_all_downloaded);
        return false;
    }

    private void u0() {
        Observable.timer(10L, TimeUnit.MILLISECONDS).map(new Func1() { // from class: jt7
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.f0((Long) obj);
            }
        }).subscribeOn(Schedulers.io()).subscribe(new Action1() { // from class: ft7
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                TrainedCourseActivity.g0((Boolean) obj);
            }
        }, new Action1() { // from class: it7
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                TrainedCourseActivity.i0((Throwable) obj);
            }
        });
    }

    private void v0(TrainingCourse trainingCourse) {
        DateBeanWrapper<TrainingCourseItem> today;
        List<DateBeanWrapper<TrainingCourseItem>> allCalenderDates = CalendarDateUtils.getAllCalenderDates(trainingCourse);
        this.Y = allCalenderDates;
        if (allCalenderDates != null) {
            DateBeanWrapper<TrainingCourseItem> dateBeanWrapper = TrainingCourseUtils.getlastDay(allCalenderDates);
            if (dateBeanWrapper != null) {
                if (TrainingDateUtils.isAfterDay(TrainingDateUtils.getNow(), TrainingDateUtils.nextWeek(dateBeanWrapper.getDate()))) {
                    this.m0 = 2;
                    this.C.setText(getString(R.string.training_out_date));
                    today = TrainingCourseUtils.getFirstDay(this.Y);
                } else if (TrainingDateUtils.isAfterDay(TrainingDateUtils.getNow(), dateBeanWrapper.getDate())) {
                    this.m0 = 1;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(TrainingDateUtils.nextWeek(dateBeanWrapper.getDate()));
                    this.C.setText(getString(R.string.course_out_date_cannot_training, new Object[]{TimeUtils.formatDate_no_y(getApplicationContext(), calendar.getTime(), false)}));
                    today = TrainingCourseUtils.getFirstDay(this.Y);
                } else {
                    today = TrainingCourseUtils.getToday(this.Y);
                }
                if (today != null) {
                    DateSingleInstance.getInstance().setChooseDate(today.getDate());
                    z0(today);
                }
            }
            this.E.setCreateValue(this.Y, true);
        }
        this.E.setOnDayChangeListener(new DateSingleInstance.OnDayChangeListener() { // from class: qt7
            @Override // com.xiaomi.hm.health.calendar.utils.DateSingleInstance.OnDayChangeListener
            public final void onDayChange(DateBeanWrapper dateBeanWrapper2) {
                this.a.z0(dateBeanWrapper2);
            }
        });
        this.E.setOnReminderClickListener(new ExpandableCalendar.OnReminderClickListener() { // from class: pt7
            @Override // com.xiaomi.hm.health.calendar.ExpandableCalendar.OnReminderClickListener
            public final void onReminderClick() {
                this.a.j0();
            }
        });
    }

    private void w0(ArrayList<ActionContent> arrayList) {
        this.P.setAdapter(new a(R.layout.item_train_action, R.id.ll_item, arrayList, TrainerInfo.get(), arrayList));
    }

    private void x0(String str) {
        int iSp2px = (int) ViewUtils.sp2px(this, 24.0f);
        int color = ContextCompat.getColor(this, R.color.white100);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Matcher matcher = Pattern.compile("\\d+\\/\\d+").matcher(str);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            Iterator<CharacterStyle> it2 = TypefaceSpanUtils.getCharacterStyles(this, Font.KM, Integer.valueOf(iSp2px), Integer.valueOf(color)).iterator();
            while (it2.hasNext()) {
                spannableStringBuilder.setSpan(it2.next(), iStart, iEnd, 18);
            }
        }
        this.C.setText(spannableStringBuilder);
    }

    private void y0(String str) {
        this.C.setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(str, this, Font.KM, Integer.valueOf((int) ViewUtils.sp2px(this, 24.0f)), Integer.valueOf(ContextCompat.getColor(this, R.color.white100))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(DateBeanWrapper<TrainingCourseItem> dateBeanWrapper) {
        TrainingCourseItem extraData = dateBeanWrapper.getExtraData();
        N(dateBeanWrapper);
        if (extraData.trainingId.longValue() > 0) {
            H0(extraData);
        } else {
            E0(dateBeanWrapper);
        }
    }

    @Override // com.xiaomi.hm.health.traininglib.media.MediaDownloaderManager.DownloadListener
    public void downloadFinish(int i) {
        this.T = false;
        R();
        if (i == 0) {
            I0();
        } else {
            IconToast.showError(this, R.string.download_medias_failed);
        }
    }

    @Override // com.xiaomi.hm.health.traininglib.media.MediaDownloaderManager.DownloadListener
    public void downloadProgress(long j, long j2, long j3) {
        if (t0.trainingPlanId.equals(Long.valueOf(j))) {
            double d = j3 / s0;
            double d2 = j2 / s0;
            double d3 = (100.0d * d) / d2;
            HMLog.d(q0, "totalDownloadProgress: " + d3, new Object[0]);
            this.N.setProgress((int) d3);
            this.O.setText(getString(R.string.download_progress, new Object[]{Double.valueOf(d), Double.valueOf(d2)}));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1900 || i == 1901) {
            TrainingConfigManager.syncAlarmConfig();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        R();
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.tx_start_training) {
            if (id == R.id.imv_close_download) {
                R();
                return;
            }
            if (id == R.id.imv_back) {
                R();
                finish();
                return;
            }
            if (id == R.id.imv_more) {
                C0();
                return;
            }
            if (id == R.id.tx_go_today) {
                if (this.m0 != 2) {
                    W(TrainingDateUtils.getNow());
                    return;
                }
                Intent intent = new Intent(this, (Class<?>) FormulateCurriculumActivity.class);
                intent.putExtra(FormulateCurriculumActivity.IS_REDO_COURSE, false);
                startActivity(intent);
                finish();
                return;
            }
            return;
        }
        if (this.m0 == 2) {
            FormulateCurriculumActivity.startRedoCourse(this, t0);
            finish();
            return;
        }
        this.U = true;
        Set<DownloadInfo> setT = T();
        if (setT == null || setT.size() <= 0) {
            HMLog.d(q0, "当前节已经下载完成", new Object[0]);
            BlockMultiClickListener.conflictClick(view, new long[0]);
            I0();
            return;
        }
        Set<DownloadInfo> setS = S();
        if (setS == null || setS.size() <= 0) {
            HMLog.d(q0, "当天已经下载完成", new Object[0]);
            BlockMultiClickListener.conflictClick(view, new long[0]);
            I0();
            return;
        }
        int totalMediaSize = MediaFileUtils.getTotalMediaSize(setS);
        boolean zIsWifiConnected = NetUtil.isWifiConnected(this);
        boolean zIsNetworkConnected = NetUtil.isNetworkConnected(this);
        if (zIsWifiConnected) {
            A0(totalMediaSize);
        } else if (zIsNetworkConnected) {
            t0(setT);
        } else {
            IconToast.showError(this, R.string.no_network_connection);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_trained_course);
        EventBus.getDefault().register(this);
        initView();
        MediaDownloaderManager mediaDownloaderManager = new MediaDownloaderManager(this);
        this.X = mediaDownloaderManager;
        mediaDownloaderManager.setDownloadListener(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.X.setDownloadListener(null);
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        this.E.setOnDayChangeListener(null);
        this.E.setOnReminderClickListener(null);
    }

    public void onEventMainThread(EventReqTrainingData eventReqTrainingData) {
        if (eventReqTrainingData.method == EventReqTrainingData.DATA_TRAINING_PLANS_EXIT.method) {
            Object obj = eventReqTrainingData.respData;
            if (obj == null || eventReqTrainingData.resultFlag != 0) {
                if (eventReqTrainingData.resultFlag == 2 && eventReqTrainingData.httpCancleType == 4) {
                    IconToast.showError(this, R.string.net_not_work);
                    return;
                } else {
                    IconToast.showError(this, R.string.exit_fail);
                    return;
                }
            }
            HMHttpResponseData hMHttpResponseData = (HMHttpResponseData) obj;
            boolean z = Boolean.parseBoolean(hMHttpResponseData.getTag());
            if (!hMHttpResponseData.isSuccess() || z) {
                return;
            }
            Observable.fromCallable(new Callable() { // from class: at7
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TrainedCourseActivity.b0();
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: dt7
                @Override // rx.functions.Action1
                public final void call(Object obj2) {
                    this.a.c0((Boolean) obj2);
                }
            }, new Action1() { // from class: gt7
                @Override // rx.functions.Action1
                public final void call(Object obj2) {
                    TrainedCourseActivity.e0((Throwable) obj2);
                }
            });
        }
    }
}
