package com.xiaomi.hm.health.training.repository;

import androidx.p008lifecycle.MutableLiveData;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.training.api.TrainingDataSource;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.repository.FeaturedCoursePlayRepo;
import com.xiaomi.hm.health.training.ui.widget.RealTimeHrView;
import com.xiaomi.hm.health.training.utils.RealTimeHrHandler;
import com.xiaomi.hm.health.traininglib.util.TrainingConfig;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 32\u00020\u0001:\u00063\u0011\u0017\u001b4\u0007B\u0019\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b1\u00102J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006R\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo;", "", "", Constants.DATA_KEY_HR, "Lcom/xiaomi/hm/health/training/ui/widget/RealTimeHrView$HrDetectState;", "state", "", GoogleApiAvailabilityLight.a, "", "timestamp", "i", "e", "start", Command.RESUME, "pause", Command.STOP, "Lcom/xiaomi/hm/health/training/api/TrainingDataSource;", "a", "Lcom/xiaomi/hm/health/training/api/TrainingDataSource;", "getDataSource", "()Lcom/xiaomi/hm/health/training/api/TrainingDataSource;", ParamKey.dataSource, "Lcom/xiaomi/hm/health/training/utils/RealTimeHrHandler;", "b", "Lcom/xiaomi/hm/health/training/utils/RealTimeHrHandler;", "hrHandler", "Lcom/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo$RealTimeHr;", "c", "Lcom/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo$RealTimeHr;", "realTimeHr", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getHrLiveData", "()Landroidx/lifecycle/MutableLiveData;", "hrLiveData", "", "Z", "enableMaxHrRemind", "f", LogUtil.I, "maxRemindHr", "g", "J", "firstMaxHrReachedTime", "h", "lastVibrateTime", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "dateTimeFormat", "<init>", "(Lcom/xiaomi/hm/health/training/api/TrainingDataSource;Lcom/xiaomi/hm/health/training/utils/RealTimeHrHandler;)V", "Companion", "RealTimeHr", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class FeaturedCoursePlayRepo {

    @NotNull
    private static final String j = "Train-FeaturedCoursePlayRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TrainingDataSource dataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RealTimeHrHandler hrHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean enableMaxHrRemind;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int maxRemindHr;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long firstMaxHrReachedTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long lastVibrateTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final RealTimeHr realTimeHr = new RealTimeHr();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<RealTimeHr> hrLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final SimpleDateFormat dateTimeFormat = new SimpleDateFormat(TrainingDateUtils.PATTERN_YMD_HMSS, Locale.getDefault());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo$RealTimeHr;", "", "", "a", LogUtil.I, "getHr", "()I", "setHr", "(I)V", Constants.DATA_KEY_HR, "Lcom/xiaomi/hm/health/training/ui/widget/RealTimeHrView$HrDetectState;", "b", "Lcom/xiaomi/hm/health/training/ui/widget/RealTimeHrView$HrDetectState;", "getState", "()Lcom/xiaomi/hm/health/training/ui/widget/RealTimeHrView$HrDetectState;", "setState", "(Lcom/xiaomi/hm/health/training/ui/widget/RealTimeHrView$HrDetectState;)V", "state", "<init>", "()V", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class RealTimeHr {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int hr;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private RealTimeHrView.HrDetectState state;

        public final int getHr() {
            return this.hr;
        }

        @Nullable
        public final RealTimeHrView.HrDetectState getState() {
            return this.state;
        }

        public final void setHr(int i) {
            this.hr = i;
        }

        public final void setState(@Nullable RealTimeHrView.HrDetectState hrDetectState) {
            this.state = hrDetectState;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo$a", "Lcom/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo$b;", "", Constants.DATA_KEY_HR, "", "timestamp", "", "a", "<init>", "()V", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a implements b {
        @Override // com.xiaomi.hm.health.training.repository.FeaturedCoursePlayRepo.b
        public void a(int hr, long timestamp) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"com/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo$b", "", "", Constants.DATA_KEY_HR, "", "timestamp", "", "a", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public interface b {
        void a(int hr, long timestamp);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo$c", "Lcom/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo$b;", "", Constants.DATA_KEY_HR, "", "timestamp", "", "a", "<init>", "()V", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class c implements b {
        @Override // com.xiaomi.hm.health.training.repository.FeaturedCoursePlayRepo.b
        public void a(int hr, long timestamp) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo$d", "Lcom/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo$b;", "", Constants.DATA_KEY_HR, "", "timestamp", "", "a", "<init>", "()V", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class d implements b {
        @Override // com.xiaomi.hm.health.training.repository.FeaturedCoursePlayRepo.b
        public void a(int hr, long timestamp) {
        }
    }

    @Inject
    public FeaturedCoursePlayRepo(@NotNull TrainingDataSource trainingDataSource, @NotNull RealTimeHrHandler realTimeHrHandler) {
        this.dataSource = trainingDataSource;
        this.hrHandler = realTimeHrHandler;
        realTimeHrHandler.setHrReceiveListener(new RealTimeHrHandler.OnHeartRateReceiveListener() { // from class: com.xiaomi.hm.health.training.repository.FeaturedCoursePlayRepo.1
            @Override // com.xiaomi.hm.health.training.utils.RealTimeHrHandler.OnHeartRateReceiveListener
            public void onHrReceive(int hr, @Nullable RealTimeHrView.HrDetectState state) {
                FeaturedCoursePlayRepo.this.d(hr, state);
                long jCurrentTimeMillis = System.currentTimeMillis();
                FeaturedCoursePlayRepo.this.e(hr, jCurrentTimeMillis);
                if (state == RealTimeHrView.HrDetectState.SUCCESS) {
                    FeaturedCoursePlayRepo.this.i(hr, jCurrentTimeMillis);
                }
            }
        });
        this.enableMaxHrRemind = TrainingConfig.getHrWarningEnbale();
        this.maxRemindHr = TrainingConfig.getMaxHeartRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int hr, RealTimeHrView.HrDetectState state) {
        this.realTimeHr.setHr(hr);
        this.realTimeHr.setState(state);
        this.hrLiveData.postValue(this.realTimeHr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(final int hr, long timestamp) {
        int i;
        if (!this.enableMaxHrRemind || (i = this.maxRemindHr) <= 0 || hr < i) {
            this.firstMaxHrReachedTime = 0L;
            return;
        }
        long j2 = this.firstMaxHrReachedTime;
        if (j2 <= 0) {
            this.firstMaxHrReachedTime = timestamp;
            Loggers.getLogger().d(j, new Supplier() { // from class: y32
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayRepo.h(this.a);
                }
            });
            return;
        }
        long j3 = 1000;
        final long j4 = (timestamp - j2) / j3;
        long j5 = this.lastVibrateTime;
        long j6 = j5 <= 0 ? 0L : (timestamp - j5) / j3;
        boolean z = true;
        boolean z2 = j4 >= 15;
        if (j5 > 0 && j6 < 40) {
            z = false;
        }
        if (!z2 || !z) {
            final long j7 = j6;
            Loggers.getLogger().v(j, new Supplier() { // from class: x32
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayRepo.g(hr, this, j4, j7);
                }
            });
            return;
        }
        final long j8 = j6;
        Loggers.getLogger().i(j, new Supplier() { // from class: w32
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCoursePlayRepo.f(hr, this, j4, j8);
            }
        });
        this.hrHandler.vibrateHr(hr, this.maxRemindHr);
        this.firstMaxHrReachedTime = 0L;
        this.lastVibrateTime = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(int i, FeaturedCoursePlayRepo featuredCoursePlayRepo, long j2, long j3) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "震动设备以提醒达到了最大心率，当前实时心率: %d, 设置的最大提醒心率: %d, 超过最大提醒心率维持的秒数: %d, 距离上次震动的秒数: %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(featuredCoursePlayRepo.maxRemindHr), Long.valueOf(j2), Long.valueOf(j3)}, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(int i, FeaturedCoursePlayRepo featuredCoursePlayRepo, long j2, long j3) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "未达到震动条件，当前实时心率: %d, 设置的最大提醒心率: %d, 超过最大提醒心率维持的秒数: %d, 距离上次震动的秒数: %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(featuredCoursePlayRepo.maxRemindHr), Long.valueOf(j2), Long.valueOf(j3)}, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(FeaturedCoursePlayRepo featuredCoursePlayRepo) {
        return Intrinsics.stringPlus("刚刚超过了最大心率的时刻：", featuredCoursePlayRepo.dateTimeFormat.format(new Date(featuredCoursePlayRepo.firstMaxHrReachedTime)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(int hr, long timestamp) {
    }

    @NotNull
    public final TrainingDataSource getDataSource() {
        return this.dataSource;
    }

    @NotNull
    public final MutableLiveData<RealTimeHr> getHrLiveData() {
        return this.hrLiveData;
    }

    public final void pause() {
        this.hrHandler.pause();
    }

    public final void resume() {
        this.hrHandler.resume();
    }

    public final void start() {
        this.hrHandler.start();
    }

    public final void stop() {
        this.hrHandler.stop();
    }
}
