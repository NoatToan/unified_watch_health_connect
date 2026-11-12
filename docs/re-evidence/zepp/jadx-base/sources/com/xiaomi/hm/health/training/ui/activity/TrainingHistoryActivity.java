package com.xiaomi.hm.health.training.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.TimeModel;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.chart.IChartProvider;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.GoalLineStyle;
import com.huami.chart.style.LineStyle;
import com.huami.lib.view.ViewUtils;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.colorbar.ColorBarView;
import com.huami.widget.colorbar.ColorItem;
import com.huami.widget.hrsection.HeartRateSectionItem;
import com.huami.widget.hrsection.HeartRateSectionView;
import com.huami.widget.share.ShareConfig;
import com.huami.widget.share.ShareContent;
import com.huami.widget.share.ShareDialog;
import com.huami.widget.share.ShareListener;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.huami.widget.typeface.TypefaceSpanUtils;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.databases.model.trainning.HaveDoneAction;
import com.xiaomi.hm.health.databases.model.trainning.TrainingHeartRate;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.hm.health.devicelib.UserData;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.model.ExerciseRecord;
import com.xiaomi.hm.health.training.ui.activity.TrainingHistoryActivity;
import com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter;
import com.xiaomi.hm.health.training.ui.adapter.CommonViewHolder;
import com.xiaomi.hm.health.training.ui.widget.StickHeaderLayout;
import com.xiaomi.hm.health.training.ui.widget.UpDownTextItem;
import com.xiaomi.hm.health.training.utils.BitmapUtils;
import com.xiaomi.hm.health.training.utils.OtherUtils;
import com.xiaomi.hm.health.training.utils.ShareTrainingTimesGetter;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import com.xiaomi.hm.health.traininglib.util.TrainingConstant;
import com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper;
import com.xiaomi.hm.health.traininglib.util.TrainingRecordUtils;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;
import rx.Observable;
import rx.SingleSubscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingHistoryActivity extends BaseTitleActivity {
    private static Function2<Long, Integer, ExerciseRecord> E0 = null;
    public static final String EXTRA_DEVICE_NAME = "EXTRA_DEVICE_NAME";
    public static final String EXTRA_DEVICE_SOURCE = "EXTRA_DEVICE_SOURCE";
    public static final String EXTRA_EXERCISE_ID = "EXTRA_EXERCISE_ID";
    public static final String EXTRA_IS_WORKOUT_SPORT_SOURCE = "EXTRA_IS_WORKOUT_SPORT_SOURCE";
    public static final String EXTRA_SPORT_TYPE = "EXTRA_SPORT_TYPE";
    public static final String EXTRA_TRAINING_ID = "EXTRA_TRAINING_ID";
    public static final String EXTRA_TRAINING_START_TIME = "EXTRA_TRAINING_START_TIME";
    private ImageView A;
    private ImageView B;
    private TextView C;
    private ChartDataList C0;
    private UpDownTextItem D;
    private UpDownTextItem E;
    private UpDownTextItem F;
    private View G;
    private View H;
    private View I;
    private View J;
    private TextView K;
    private TextView L;
    private TextView M;
    private View N;
    private FrameLayout O;
    private View P;
    private ColorBarView Q;
    private HeartRateSectionView R;
    private TextView S;
    private TextView T;
    private TextView U;
    private TextView V;
    private TextView W;
    private View X;
    private View Y;
    private View Z;
    private View m0;
    private NestedScrollView n0;
    private StickHeaderLayout o0;
    private LinearLayout p0;
    private CommonRecycleAdapter<HaveDoneAction> q0;
    private ChartProvider r0;
    private long s0;
    private long t0;
    private RecyclerView y;
    private ImageView z;
    private String z0;
    private Context x = this;
    private int u0 = 0;
    private int v0 = 0;
    private TrainerInfo w0 = TrainerInfo.get();
    private long x0 = -1;
    private int y0 = -1;
    private boolean A0 = false;
    private int B0 = 0;
    private IChartProvider D0 = new b();

    public class a extends CommonRecycleAdapter<HaveDoneAction> {
        public a(int i, int i2, List list) {
            super(i, i2, list);
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bindViewHolder(CommonViewHolder commonViewHolder, HaveDoneAction haveDoneAction) {
            long longByGender = ParseJsonUtil.getLongByGender(haveDoneAction.duration, TrainingHistoryActivity.this.w0);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long minutes = timeUnit.toMinutes(longByGender);
            String str = String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(minutes), Long.valueOf(timeUnit.toSeconds(longByGender) - (60 * minutes)));
            boolean zEquals = TextUtils.equals(haveDoneAction.type, "COUNT");
            CommonViewHolder text = commonViewHolder.setText(R.id.action_name, haveDoneAction.name);
            int i = R.id.action_freq;
            text.setVisibility(i, zEquals ? 0 : 8).setVisibility(R.id.action_freq_subtitle, zEquals ? 0 : 8).setText(i, String.valueOf(haveDoneAction.repeatNumber)).setText(R.id.action_time, str);
        }

        @Override // com.xiaomi.hm.health.training.ui.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onItemClick(HaveDoneAction haveDoneAction, int i) {
        }
    }

    public class b extends ChartProvider.StatisChartProvider {
        public b() {
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartContainer */
        public ViewGroup getD() {
            return TrainingHistoryActivity.this.O;
        }

        @Override // com.huami.chart.chart.IChartProvider
        /* JADX INFO: renamed from: getChartDataList */
        public ChartDataList getG() {
            return TrainingHistoryActivity.this.C0;
        }

        @Override // com.huami.chart.chart.IChartProvider
        public DrawConfig getDrawConfig() {
            return TrainingHistoryActivity.this.F();
        }

        @Override // com.huami.chart.chart.IChartProvider
        public RenderConfig getRenderConfig() {
            return TrainingHistoryActivity.this.G();
        }
    }

    public class c extends SingleSubscriber<TrainingRecord> {
        public c() {
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            th.printStackTrace();
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(TrainingRecord trainingRecord) {
            TrainingHistoryActivity.this.m0(trainingRecord);
            TrainingHistoryHelper.getInstance().syncSingleTrainingHistoryRecord(trainingRecord.getTrainingId().longValue(), trainingRecord.getStartTime().longValue());
        }
    }

    public class d implements ShareListener {
        public d() {
        }

        @Override // com.huami.widget.share.ShareListener
        public void onFailed(int i, String str) {
            TrainingHistoryActivity.this.I.setVisibility(0);
            TrainingHistoryActivity.this.J.setVisibility(0);
        }

        @Override // com.huami.widget.share.ShareListener
        public ShareContent onShareContentCreated(int i) {
            return TrainingHistoryActivity.this.K();
        }

        @Override // com.huami.widget.share.ShareListener
        public void onStart(int i) {
            TrainingHistoryActivity.this.I.setVisibility(4);
            TrainingHistoryActivity.this.J.setVisibility(4);
        }

        @Override // com.huami.widget.share.ShareListener
        public void onSuccess(int i) {
            TrainingHistoryActivity.this.I.setVisibility(0);
            TrainingHistoryActivity.this.J.setVisibility(0);
        }
    }

    private TrainingRecord D(ExerciseRecord exerciseRecord) {
        TrainingRecord trainingRecord = new TrainingRecord();
        trainingRecord.duration = Long.valueOf(exerciseRecord.duration);
        trainingRecord.consumption = Integer.valueOf(exerciseRecord.consumption);
        trainingRecord.startTime = Long.valueOf(exerciseRecord.startTime);
        trainingRecord.pause = exerciseRecord.bulkPause;
        trainingRecord.heartRate = exerciseRecord.bulkHr;
        trainingRecord.averageHeartRate = Integer.valueOf(exerciseRecord.avgHr);
        trainingRecord.hasBoundHrDevice = Boolean.TRUE;
        trainingRecord.isExercise = true;
        TrainingRecordUtils.parseHeartRateListFromCsv(trainingRecord);
        return trainingRecord;
    }

    private CommonRecycleAdapter<HaveDoneAction> E() {
        return new a(R.layout.item_training_history_action, R.id.item_view, new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DrawConfig F() {
        int width = this.O.getWidth();
        int height = this.O.getHeight();
        int iDp2px = (int) ViewUtils.dp2px(this, 35.0f);
        int iDp2px2 = (int) ViewUtils.dp2px(this, 18.0f);
        if (width == 0) {
            width = getResources().getDisplayMetrics().widthPixels;
        }
        HMLog.d(I(), "chartWidth:" + width + ",chartHeight:" + height, new Object[0]);
        return new DrawConfig.Builder(this).setCanvasHeight(height).setCanvasWidth(width).setDataMarginTop(iDp2px).setDataMarginBottom(iDp2px2).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RenderConfig G() {
        float fM = 220 - M();
        int i = (int) (fM * 0.5f);
        int i2 = (int) (0.6f * fM);
        int i3 = (int) (0.7f * fM);
        int i4 = (int) (0.8f * fM);
        int i5 = (int) (fM * 0.9f);
        int i6 = 5;
        String[] strArr = {String.valueOf(i), String.valueOf(i2), String.valueOf(i3), String.valueOf(i4), String.valueOf(i5)};
        int i7 = this.u0;
        float[] fArr = {i - i7, i2 - i7, i3 - i7, i4 - i7, i5 - i7};
        int[] iArr = {ContextCompat.getColor(this, R.color.hr_tape_warm_up), ContextCompat.getColor(this, R.color.hr_tape_fat_burn), ContextCompat.getColor(this, R.color.hr_tape_lung_strength), ContextCompat.getColor(this, R.color.hr_tape_stamina_strength), ContextCompat.getColor(this, R.color.hr_tape_anaerobic_limit)};
        int i8 = this.v0;
        if (i8 <= i4) {
            if (i8 > i3) {
                i6 = 4;
            } else if (i8 > i2) {
                i6 = 3;
            } else {
                i6 = i8 > i ? 2 : 1;
            }
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            float f = fArr[i10];
            if (f < 0.0f) {
                i9++;
            }
            if (f > i8 - this.u0) {
                i6--;
            }
        }
        boolean z = i9 < i6;
        RenderConfig.Builder lineStyle = new RenderConfig.Builder().setLineStyle(new LineStyle.Builder(this).setLineStyle(2).setLineColor(ContextCompat.getColor(this, R.color.hr_tape_anaerobic_limit)).setLineWidth(ViewUtils.dp2px(this, 1.0f)).setShadowColors(new int[]{ContextCompat.getColor(this, R.color.training_history_chart_start_color), ContextCompat.getColor(this, R.color.training_history_chart_end_color)}).create());
        if (z) {
            lineStyle.setGoalLineStyle(new GoalLineStyle.Builder(this).setGoalLineWidth(ViewUtils.dp2px(this, 0.5f)).setGoalLineStyle(2).setGoalLabels((String[]) Arrays.copyOfRange(strArr, i9, i6)).setGoals(Arrays.copyOfRange(fArr, i9, i6)).setGoalLineColor(Arrays.copyOfRange(iArr, i9, i6)).setGoalLabelTypeface(TypefaceManager.get().getTypeface(this, Font.KM)).create());
        }
        return lineStyle.create();
    }

    private String H(long j) {
        return TimeUtils.formatDateTime_no_y((Context) this, j, false);
    }

    private String I() {
        return getClass().getSimpleName();
    }

    private Bitmap J() {
        this.H.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.H.getDrawingCache(true));
        this.H.setDrawingCacheEnabled(false);
        this.X.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.X.getDrawingCache(true));
        this.X.setDrawingCacheEnabled(false);
        Bitmap bitmap = null;
        if (this.n0.getVisibility() == 0) {
            int width = this.n0.getWidth();
            int height = 0;
            for (int i = 0; i < this.n0.getChildCount(); i++) {
                height += this.n0.getChildAt(i).getHeight();
            }
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap3);
            this.n0.draw(canvas);
            canvas.setBitmap(null);
            bitmap = bitmapCreateBitmap3;
        }
        Bitmap bitmapConnectBitmap = BitmapUtils.connectBitmap(bitmapCreateBitmap, bitmapCreateBitmap2, true);
        if (bitmap == null) {
            bitmapCreateBitmap.recycle();
            bitmapCreateBitmap2.recycle();
            return bitmapConnectBitmap;
        }
        Bitmap bitmapConnectBitmap2 = BitmapUtils.connectBitmap(bitmapConnectBitmap, bitmap, true);
        bitmapConnectBitmap.recycle();
        bitmapCreateBitmap.recycle();
        bitmapCreateBitmap2.recycle();
        bitmap.recycle();
        return bitmapConnectBitmap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ShareContent K() throws Throwable {
        Bitmap bitmapJ = J();
        String absolutePath = FileUtils.getShareCacheFile(this, "TrainingHistoryShare.jpg").getAbsolutePath();
        BitmapUtils.saveBitmapToFile(absolutePath, bitmapJ, 90);
        bitmapJ.recycle();
        ShareContent shareContent = new ShareContent();
        shareContent.title = "";
        shareContent.url = null;
        shareContent.content = "";
        shareContent.bitmapUrl = absolutePath;
        shareContent.topic = "";
        return shareContent;
    }

    private SpannableStringBuilder L(int i) {
        return TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(getResources().getQuantityString(R.plurals.how_many_times, i, Integer.valueOf(i)), this, Font.KM, Integer.valueOf((int) ViewUtils.sp2px(this, 24.0f)), Integer.valueOf(ContextCompat.getColor(this, R.color.white100)));
    }

    private int M() {
        return this.w0.age;
    }

    private void N() {
        this.y.setLayoutManager(new LinearLayoutManager(this));
        CommonRecycleAdapter<HaveDoneAction> commonRecycleAdapterE = E();
        this.y.setAdapter(commonRecycleAdapterE);
        this.q0 = commonRecycleAdapterE;
        this.y.setNestedScrollingEnabled(false);
        this.y.setHasFixedSize(true);
    }

    private void O() {
        this.r0 = new ChartProvider(this.x);
    }

    private void P() {
        UserData userData = UserData.get();
        this.U.setText(userData.getName());
        String avatarUrl = userData.getAvatarUrl();
        String avatarPath = userData.getAvatarPath();
        File file = !TextUtils.isEmpty(avatarPath) ? new File(avatarPath) : null;
        if (file != null && file.exists()) {
            OtherUtils.loadWithGlideCircle(this, this.A, file);
        } else if (!TextUtils.isEmpty(avatarUrl)) {
            OtherUtils.loadWithGlideCircle(this, this.A, avatarUrl);
        }
        int exerTimesBySportType = ShareTrainingTimesGetter.getInstance().getExerTimesBySportType(this.B0);
        if (Q()) {
            this.V.setText(getResources().getQuantityString(this.A0 ? R.plurals.running_record_workout_times : R.plurals.running_record_free_training_times, exerTimesBySportType, Integer.valueOf(exerTimesBySportType)));
        } else {
            this.V.setText(getResources().getQuantityString(R.plurals.running_record_training_times, exerTimesBySportType, Integer.valueOf(exerTimesBySportType)));
        }
        this.B.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this, Q() ? R.drawable.ic_workout_28 : R.drawable.icon_training_course), ContextCompat.getColor(this, R.color.tangerine)));
        int i = this.A0 ? R.string.exercise : R.string.free_training;
        TextView textView = this.C;
        if (!Q()) {
            i = R.string.sport_type_train;
        }
        textView.setText(i);
    }

    private boolean Q() {
        return this.x0 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ExerciseRecord R() throws Exception {
        return E0.invoke(Long.valueOf(this.x0), Integer.valueOf(this.y0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object S() {
        return "未获取到指定的锻炼数据，trackId:" + this.x0 + ", source:" + this.y0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(ExerciseRecord exerciseRecord) {
        if (exerciseRecord != null) {
            m0(D(exerciseRecord));
        } else {
            Loggers.getLogger().w(I(), new Supplier() { // from class: aw7
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return this.a.S();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object U() {
        return "加载锻炼数据发生异常";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(Throwable th) {
        Loggers.getLogger().e(I(), th, new Supplier() { // from class: bw7
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return TrainingHistoryActivity.U();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object W() {
        return "未设置锻炼数据获取器，无法获取锻炼数据";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(View view) {
        e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(int i, boolean z) {
        f0(i);
    }

    private void a0() {
        this.s0 = getIntent().getLongExtra("EXTRA_TRAINING_ID", 0L);
        this.t0 = getIntent().getLongExtra(EXTRA_TRAINING_START_TIME, 0L);
        this.x0 = getIntent().getLongExtra(EXTRA_EXERCISE_ID, this.x0);
        this.y0 = getIntent().getIntExtra(EXTRA_DEVICE_SOURCE, this.y0);
        this.z0 = getIntent().getStringExtra(EXTRA_DEVICE_NAME);
        this.B0 = getIntent().getIntExtra(EXTRA_SPORT_TYPE, this.B0);
        this.A0 = getIntent().getBooleanExtra(EXTRA_IS_WORKOUT_SPORT_SOURCE, false);
    }

    private List<TrainingHeartRate> b0(long j, List<TrainingHeartRate> list, List<TrainingRecord.PauseRange> list2) {
        int i;
        if (list != null && !list.isEmpty()) {
            int i2 = -1;
            long j2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                TrainingHeartRate trainingHeartRate = list.get(i3);
                long jLongValue = i3 == 0 ? trainingHeartRate.getRecordTime().longValue() - (j / 1000) : trainingHeartRate.getRecordTime().longValue() - list.get(i3 - 1).getRecordTime().longValue();
                if (list2 != null && !list2.isEmpty()) {
                    int i4 = i2 + 1;
                    int i5 = 0;
                    while (true) {
                        int i6 = i4;
                        i = i2;
                        i2 = i6;
                        if (i2 >= list2.size()) {
                            break;
                        }
                        TrainingRecord.PauseRange pauseRange = list2.get(i2);
                        if (pauseRange.pauseStartTimeInSecond >= trainingHeartRate.getRecordTime().longValue()) {
                            break;
                        }
                        i5 = (int) (((long) i5) + pauseRange.pauseDurationInSecond);
                        i4 = i2 + 1;
                    }
                    jLongValue -= (long) i5;
                    i2 = i;
                }
                j2 += jLongValue;
                trainingHeartRate.setDuration(Long.valueOf(jLongValue));
                trainingHeartRate.setSeconds(Long.valueOf(j2));
            }
        }
        return list;
    }

    private long c0(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(j);
        if (timeUnit.toSeconds(j) - (60 * minutes) > 30) {
            minutes++;
        }
        return TimeUnit.MINUTES.toMillis(minutes);
    }

    private void d0() {
        this.I.setOnClickListener(new View.OnClickListener() { // from class: yv7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.X(view);
            }
        });
        this.J.setOnClickListener(new View.OnClickListener() { // from class: xv7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.Y(view);
            }
        });
    }

    private void e0() {
        if (getSupportFragmentManager().findFragmentByTag(SportAnalytics.Params.VALUE_SHARE) != null) {
            return;
        }
        ShareConfig shareConfig = new ShareConfig();
        shareConfig.isOnlyImage = true;
        ShareDialog shareDialogNewInstance = ShareDialog.newInstance(shareConfig);
        shareDialogNewInstance.setShareListener(new d());
        shareDialogNewInstance.setOnShareItemClickedListener(new ShareDialog.OnShareItemClickedListener() { // from class: zv7
            @Override // com.huami.widget.share.ShareDialog.OnShareItemClickedListener
            public final void onShareItemClicked(int i, boolean z) {
                this.a.Z(i, z);
            }
        });
        shareDialogNewInstance.show(getSupportFragmentManager(), SportAnalytics.Params.VALUE_SHARE);
    }

    private void f0(int i) {
        if (i == 1) {
            TrainingAnalytics.event(getApplicationContext(), TrainingAnalytics.EventId.TRAIN_SHARE, "Wechat");
        }
        if (i == 2) {
            TrainingAnalytics.event(getApplicationContext(), TrainingAnalytics.EventId.TRAIN_SHARE, "Moments");
            return;
        }
        if (i == 13) {
            TrainingAnalytics.event(getApplicationContext(), TrainingAnalytics.EventId.TRAIN_SHARE, "Save");
            return;
        }
        if (i == 14) {
            TrainingAnalytics.event(getApplicationContext(), TrainingAnalytics.EventId.TRAIN_SHARE, "MiFit");
            return;
        }
        switch (i) {
            case 4:
                TrainingAnalytics.event(getApplicationContext(), TrainingAnalytics.EventId.TRAIN_SHARE, "Weibo");
                break;
            case 5:
                TrainingAnalytics.event(getApplicationContext(), TrainingAnalytics.EventId.TRAIN_SHARE, "QQZone");
                break;
            case 6:
                TrainingAnalytics.event(getApplicationContext(), TrainingAnalytics.EventId.TRAIN_SHARE, "QQ");
                break;
            case 7:
                TrainingAnalytics.event(getApplicationContext(), TrainingAnalytics.EventId.TRAIN_SHARE, "Line");
                break;
            case 8:
                TrainingAnalytics.event(getApplicationContext(), TrainingAnalytics.EventId.TRAIN_SHARE, "Facebook");
                break;
            case 9:
                TrainingAnalytics.event(getApplicationContext(), TrainingAnalytics.EventId.TRAIN_SHARE, "Twitter");
                break;
        }
    }

    private void findViews() {
        this.Z = $(R.id.no_hr_data);
        this.Y = $(R.id.max_min_hr);
        this.W = (TextView) $(R.id.max_hr);
        this.H = $(R.id.share_header);
        this.X = $(R.id.rl_top);
        this.n0 = (NestedScrollView) $(R.id.nsv_bottom);
        this.o0 = (StickHeaderLayout) $(R.id.stick_layout);
        this.p0 = (LinearLayout) $(R.id.title_area);
        this.y = (RecyclerView) $(R.id.action_list);
        this.z = (ImageView) $(R.id.imv_header);
        this.D = (UpDownTextItem) $(R.id.udti_kcalorie);
        this.E = (UpDownTextItem) $(R.id.udti_time);
        this.G = $(R.id.header_right_divider);
        this.F = (UpDownTextItem) $(R.id.udti_difficulity);
        this.I = $(R.id.imv_back);
        this.J = $(R.id.imv_share);
        this.K = (TextView) $(R.id.tx_training_name);
        this.L = (TextView) $(R.id.tx_subtitle_one);
        this.M = (TextView) $(R.id.tx_subtitle_two);
        this.P = $(R.id.hr_heart_section_ll);
        this.Q = (ColorBarView) $(R.id.hr_color_bar);
        this.R = (HeartRateSectionView) $(R.id.hr_section);
        this.S = (TextView) $(R.id.average_hr);
        this.O = (FrameLayout) $(R.id.chart_container);
        this.N = $(R.id.chart_section);
        this.T = (TextView) $(R.id.chart_end_time);
        this.A = (ImageView) $(R.id.imv_user_avatar);
        this.U = (TextView) $(R.id.tv_user_name);
        this.V = (TextView) $(R.id.tv_exercise_count);
        this.B = (ImageView) $(R.id.icon_training);
        this.C = (TextView) $(R.id.exercise_name);
        this.m0 = $(R.id.action_list_container);
    }

    private void g0(TrainingRecord trainingRecord) {
        List<HaveDoneAction> list = trainingRecord.actions;
        boolean z = (list == null || list.isEmpty()) ? false : true;
        if (z) {
            this.q0.setData(trainingRecord.actions);
        }
        this.m0.setVisibility((Q() || !z) ? 8 : 0);
    }

    private void h0(TrainingRecord trainingRecord) {
        this.S.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(TrainingRecordUtils.parseAverageHeartRate(trainingRecord))));
    }

    private void i0(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(j);
        this.T.setText(String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(minutes), Long.valueOf(timeUnit.toSeconds(j) - (60 * minutes))));
    }

    private void initViews() {
        if (PolicyTipUtil.isNeedIntercept()) {
            this.J.setVisibility(4);
        } else {
            this.J.setVisibility(0);
        }
        this.K.setVisibility(0);
        this.L.setVisibility(0);
        this.M.setVisibility(0);
        this.D.setUpText(R.string.minute_time);
        this.E.setUpText(R.string.action);
        this.F.setUpText(R.string.unit_kcalorie);
        this.F.setDownTextFontfamily(Font.KM.getName());
        this.F.setDownTextSize(R.dimen.training_history_text_size);
        this.F.setTextPadding(R.dimen.training_history_text_padding);
        P();
        N();
        O();
    }

    private void j0(TrainingRecord trainingRecord) {
        if (trainingRecord == null) {
            return;
        }
        this.D.setDownText(String.valueOf(TimeUnit.MILLISECONDS.toMinutes(c0(trainingRecord.duration.longValue()))));
        this.F.setDownText(String.valueOf(trainingRecord.consumption));
        if (Q()) {
            this.L.setVisibility(8);
            this.E.setVisibility(8);
            this.G.setVisibility(8);
            this.K.setText(this.A0 ? R.string.exercise : R.string.free_training);
            this.M.setText(String.format(Locale.getDefault(), "%s %s", this.z0, H(trainingRecord.startTime.longValue())));
            this.z.setImageResource(this.w0.gender == TrainingConstant.GENDER_MALE ? R.drawable.training_history_tempo_man : R.drawable.training_history_tempo_woman);
            return;
        }
        this.K.setText(trainingRecord.name);
        this.L.setVisibility(!trainingRecord.isInCourse() ? 0 : 8);
        this.L.setText(L(trainingRecord.finishNumber.intValue()));
        this.M.setText(getString(R.string.training_time, new Object[]{H(trainingRecord.startTime.longValue())}));
        UpDownTextItem upDownTextItem = this.E;
        List<HaveDoneAction> list = trainingRecord.actions;
        upDownTextItem.setDownText(String.valueOf(list != null ? list.size() : 0));
        boolean zEquals = "YOGA".equals(trainingRecord.trainingType);
        this.E.setVisibility(zEquals ? 8 : 0);
        this.G.setVisibility(zEquals ? 8 : 0);
        if (!zEquals) {
            OtherUtils.loadWithGlide(this, this.z, ParseJsonUtil.getStringByGender(trainingRecord.detailsPageIllustrated, this.w0));
            return;
        }
        if (trainingRecord.getHasBoundHrDevice().booleanValue()) {
            this.z.setImageResource(R.drawable.icon_yoga_bg);
            return;
        }
        this.n0.setVisibility(8);
        this.z.setImageResource(R.drawable.icon_yoga_full_bg);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.X.getLayoutParams();
        layoutParams.height = 0;
        layoutParams.weight = 1.0f;
        this.X.setLayoutParams(layoutParams);
        this.o0.setScrollEnable(false);
        this.p0.setGravity(80);
        this.p0.setPadding(0, 0, 0, (int) ViewUtils.dp2px(this, 42.0f));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0116  */
    /* JADX WARN: Code duplicated, block: B:50:0x0119  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b  */
    private void k0(boolean z, long j, List<TrainingHeartRate> list) {
        boolean z2;
        boolean z3;
        int iIntValue;
        int i;
        if (!z) {
            this.N.setVisibility(8);
            return;
        }
        this.N.setVisibility(0);
        List<TrainingHeartRate> arrayList = list == null ? new ArrayList<>() : list;
        if (arrayList.isEmpty()) {
            this.Z.setVisibility(0);
            this.Y.setVisibility(8);
            this.O.setVisibility(8);
            return;
        }
        this.Z.setVisibility(8);
        this.Y.setVisibility(0);
        this.O.setVisibility(0);
        SparseArray sparseArray = new SparseArray(220);
        if (j > 0) {
            float f = (j * 1.0f) / 220.0f;
            int i2 = 0;
            z2 = false;
            for (int i3 = 220; i2 < i3; i3 = 220) {
                if (arrayList.isEmpty()) {
                    z3 = z2;
                } else {
                    float f2 = ((i2 + 1) * f) / 1000.0f;
                    if (i2 == 0) {
                        TrainingHeartRate trainingHeartRate = arrayList.get(0);
                        if (Math.abs(trainingHeartRate.getSeconds().longValue() - f2) < 60.0f) {
                            iIntValue = trainingHeartRate.getHeartRate().intValue();
                        } else {
                            iIntValue = 0;
                        }
                        z3 = z2;
                    } else if (i2 == 219) {
                        TrainingHeartRate trainingHeartRate2 = arrayList.get(arrayList.size() - 1);
                        if (Math.abs(trainingHeartRate2.getSeconds().longValue() - f2) < 60.0f) {
                            iIntValue = trainingHeartRate2.getHeartRate().intValue();
                        } else {
                            iIntValue = 0;
                        }
                        z3 = z2;
                    } else {
                        TrainingHeartRate trainingHeartRate3 = null;
                        TrainingHeartRate trainingHeartRate4 = null;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList.size()) {
                                z3 = z2;
                                break;
                            }
                            TrainingHeartRate trainingHeartRate5 = arrayList.get(i4);
                            z3 = z2;
                            if (trainingHeartRate5.getSeconds().longValue() > f2) {
                                trainingHeartRate3 = trainingHeartRate5;
                                break;
                            } else {
                                i4++;
                                z2 = z3;
                                trainingHeartRate4 = trainingHeartRate5;
                            }
                        }
                        if (trainingHeartRate4 != null && trainingHeartRate3 != null && trainingHeartRate3.getSeconds().longValue() - trainingHeartRate4.getSeconds().longValue() < 60) {
                            iIntValue = trainingHeartRate4.getHeartRate().intValue();
                        }
                    }
                    i = iIntValue - this.u0;
                    if (i < 0) {
                        i = 0;
                    }
                    if (i > 0) {
                        z2 = true;
                    } else {
                        z2 = z3;
                    }
                    sparseArray.put(i2, new ChartData(i2, i));
                    i2++;
                }
                iIntValue = 0;
                i = iIntValue - this.u0;
                if (i < 0) {
                    i = 0;
                }
                if (i > 0) {
                    z2 = true;
                } else {
                    z2 = z3;
                }
                sparseArray.put(i2, new ChartData(i2, i));
                i2++;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            this.C0 = new ChartDataList(sparseArray, 0, sparseArray.size() - 1);
            this.r0.createChart(this.D0, false, false);
        } else {
            this.Z.setVisibility(0);
            this.Y.setVisibility(8);
            this.O.setVisibility(8);
        }
    }

    private void l0(boolean z, List<TrainingHeartRate> list) {
        if (!z) {
            this.P.setVisibility(8);
            return;
        }
        this.P.setVisibility(0);
        List<TrainingHeartRate> arrayList = list == null ? new ArrayList<>() : list;
        int iM = 220 - M();
        float f = iM;
        float f2 = 0.5f * f;
        float f3 = 0.6f * f;
        float f4 = 0.7f * f;
        float f5 = 0.8f * f;
        float f6 = f * 0.9f;
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TrainingHeartRate trainingHeartRate = arrayList.get(i3);
            int iIntValue = trainingHeartRate.getHeartRate().intValue();
            long jLongValue = trainingHeartRate.getDuration().longValue();
            float f7 = iIntValue;
            if (f7 >= f6 && iIntValue < iM) {
                j2 += jLongValue;
            } else if (f7 >= f5 && f7 < f6) {
                j += jLongValue;
            } else if (f7 >= f4 && f7 < f5) {
                j6 += jLongValue;
            } else if (f7 >= f3 && f7 < f4) {
                j5 += jLongValue;
            } else if (f7 >= f2 && f7 < f3) {
                j4 += jLongValue;
            } else if (iIntValue > 0 && f7 < f2) {
                j3 += jLongValue;
            }
            if (iIntValue > i) {
                i = iIntValue;
            }
            if (iIntValue < i2) {
                i2 = iIntValue;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            i2 = 0;
        }
        this.W.setText(String.valueOf(i));
        this.u0 = i2;
        this.v0 = i;
        int i4 = 6;
        char c2 = 2;
        long[][] jArr = {new long[]{j3, R.color.hr_tape_rest, R.string.hr_section_rest}, new long[]{j4, R.color.hr_tape_warm_up, R.string.hr_section_warm_up}, new long[]{j5, R.color.hr_tape_fat_burn, R.string.hr_section_fat_burn}, new long[]{j6, R.color.hr_tape_lung_strength, R.string.hr_section_heart_lung_strengthen}, new long[]{j, R.color.hr_tape_stamina_strength, R.string.hr_section_stamina_strengthen}, new long[]{j2, R.color.hr_tape_anaerobic_limit, R.string.hr_section_anaerobic_limit}};
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i5 = 0;
        boolean z2 = false;
        while (i5 < i4) {
            long[] jArr2 = jArr[i5];
            String string = getApplicationContext().getString((int) jArr2[c2]);
            int color = ContextCompat.getColor(getApplicationContext(), (int) jArr2[1]);
            long jC0 = c0(jArr2[0] * 1000);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long[][] jArr3 = jArr;
            int hours = (int) timeUnit.toHours(jC0);
            ArrayList arrayList4 = arrayList2;
            int minutes = ((int) timeUnit.toMinutes(jC0)) - (hours * 60);
            boolean z3 = z2;
            String str = jC0 >= TimeUnit.HOURS.toMillis(1L) ? String.format(Locale.getDefault(), "%d %s %02d %s", Integer.valueOf(hours), getString(R.string.unit_hour), Integer.valueOf(minutes), getString(R.string.unit_min)) : String.format(Locale.getDefault(), "%d %s", Integer.valueOf(minutes), getString(R.string.unit_min_long));
            arrayList4.add(ColorItem.create(color, jC0));
            arrayList3.add(HeartRateSectionItem.create(color, string, str));
            z2 = jC0 > 0 ? true : z3;
            i5++;
            arrayList2 = arrayList4;
            jArr = jArr3;
            i4 = 6;
            c2 = 2;
        }
        ArrayList arrayList5 = arrayList2;
        if (!z2) {
            arrayList5.add(ColorItem.create(ContextCompat.getColor(getApplicationContext(), R.color.hr_tape_rest), 1.0f));
        }
        this.Q.setColorList(arrayList5);
        this.R.setSections(arrayList3);
    }

    public static void launch(Activity activity, long j, long j2) {
        activity.startActivity(new Intent(activity, (Class<?>) TrainingHistoryActivity.class).putExtra("EXTRA_TRAINING_ID", j).putExtra(EXTRA_TRAINING_START_TIME, j2));
    }

    private void loadData() {
        HMLog.d(I(), "请求训练历史详情网络数据。mTrainingId：" + this.s0 + ", mTrainingStartTime:" + this.t0, new Object[0]);
        if (!Q()) {
            TrainingHistoryHelper.getInstance().loadTrainingHistoryDetailFromLocal(this.s0, this.t0).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new c());
        } else if (E0 != null) {
            Observable.fromCallable(new Callable() { // from class: dw7
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.R();
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: ew7
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.T((ExerciseRecord) obj);
                }
            }, new Action1() { // from class: fw7
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.V((Throwable) obj);
                }
            });
        } else {
            Loggers.getLogger().w(I(), new Supplier() { // from class: cw7
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return TrainingHistoryActivity.W();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(TrainingRecord trainingRecord) {
        List<TrainingHeartRate> listB0 = trainingRecord != null ? trainingRecord.heartRateList : null;
        List<TrainingRecord.PauseRange> pauseRangeList = trainingRecord != null ? trainingRecord.parsePauseRangeList() : null;
        boolean zBooleanValue = trainingRecord != null ? trainingRecord.getHasBoundHrDevice().booleanValue() : false;
        long jLongValue = trainingRecord != null ? trainingRecord.getDuration().longValue() : 0L;
        long jLongValue2 = trainingRecord != null ? trainingRecord.startTime.longValue() : 0L;
        if (listB0 != null) {
            Collections.sort(listB0);
            listB0 = b0(jLongValue2, listB0, pauseRangeList);
        }
        if (pauseRangeList != null) {
            Collections.sort(pauseRangeList);
        }
        j0(trainingRecord);
        g0(trainingRecord);
        h0(trainingRecord);
        l0(zBooleanValue, listB0);
        k0(zBooleanValue, jLongValue, listB0);
        i0(jLongValue);
    }

    public static void setExerciseRecordSupplier(@NonNull Function2<Long, Integer, ExerciseRecord> function2) {
        E0 = function2;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitleBarVisible(false);
        setContentView(R.layout.activity_training_history);
        a0();
        findViews();
        d0();
        initViews();
        loadData();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        E0 = null;
    }

    public static void launch(Activity activity, long j, int i, int i2, String str, boolean z) {
        activity.startActivity(new Intent(activity, (Class<?>) TrainingHistoryActivity.class).putExtra(EXTRA_EXERCISE_ID, j).putExtra(EXTRA_DEVICE_SOURCE, i).putExtra(EXTRA_DEVICE_NAME, str).putExtra(EXTRA_SPORT_TYPE, i2).putExtra(EXTRA_IS_WORKOUT_SPORT_SOURCE, z));
    }
}
