package com.xiaomi.hm.health.training.ui.viewmodel;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.loc.z;
import com.squareup.picasso.u;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xiaomi.hm.health.training.api.TrainingDataSource;
import com.xiaomi.hm.health.training.api.bus.TrainingBus;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseForPlay;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseVideo;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.SimpleFeaturedCourse;
import com.xiaomi.hm.health.training.api.entity.StartEndVideoPost;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.api.entity.TrainingRecord;
import com.xiaomi.hm.health.training.api.entity.User;
import com.xiaomi.hm.health.training.api.entity.VideoPost;
import com.xiaomi.hm.health.training.api.entity.VideoRecord;
import com.xiaomi.hm.health.training.api.entity.VideoUrl;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.entity.FeaturedCourseVideoWithUrl;
import com.xiaomi.hm.health.training.helper.Delayer;
import com.xiaomi.hm.health.training.repository.FeaturedCoursePlayRepo;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCoursePlayViewModel;
import com.xiaomi.hm.health.training.utils.Clock;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u009c\u00012\u00020\u0001:\u0007\u009c\u0001(\u009d\u0001\u009e\u0001B\u001b\b\u0007\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0014J\u0016\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\rJ\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0018J\u0006\u0010 \u001a\u00020\u0004J\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\u0004J\u0006\u0010$\u001a\u00020\u0004J\u0006\u0010%\u001a\u00020\u0004J\u0006\u0010&\u001a\u00020\rR\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020504038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020:098\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00101R%\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b04038\u0006@\u0006¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\bC\u0010DR\u001f\u0010I\u001a\b\u0012\u0004\u0012\u00020F098\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\bH\u0010>R\u001f\u0010M\u001a\b\u0012\u0004\u0012\u00020J098\u0006@\u0006¢\u0006\f\n\u0004\bK\u0010<\u001a\u0004\bL\u0010>R\u001f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00020/8\u0006@\u0006¢\u0006\f\n\u0004\bN\u00101\u001a\u0004\bO\u0010PR\u001f\u0010U\u001a\b\u0012\u0004\u0012\u00020R0/8\u0006@\u0006¢\u0006\f\n\u0004\bS\u00101\u001a\u0004\bT\u0010PR\u001f\u0010X\u001a\b\u0012\u0004\u0012\u00020R0/8\u0006@\u0006¢\u0006\f\n\u0004\bV\u00101\u001a\u0004\bW\u0010PR\u001f\u0010[\u001a\b\u0012\u0004\u0012\u00020R0/8\u0006@\u0006¢\u0006\f\n\u0004\bY\u00101\u001a\u0004\bZ\u0010PR\u001f\u0010^\u001a\b\u0012\u0004\u0012\u00020R0/8\u0006@\u0006¢\u0006\f\n\u0004\b\\\u00101\u001a\u0004\b]\u0010PR\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020_0/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u00101R%\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020b04038\u0006@\u0006¢\u0006\f\n\u0004\bc\u00107\u001a\u0004\bd\u0010DR\u001f\u0010h\u001a\b\u0012\u0004\u0012\u00020\r098\u0006@\u0006¢\u0006\f\n\u0004\bf\u0010<\u001a\u0004\bg\u0010>R\u001f\u0010k\u001a\b\u0012\u0004\u0012\u00020\r0/8\u0006@\u0006¢\u0006\f\n\u0004\bi\u00101\u001a\u0004\bj\u0010PR\u001c\u0010n\u001a\b\u0012\u0004\u0012\u00020l0/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u00101R\u001f\u0010r\u001a\b\u0012\u0004\u0012\u00020o038\u0006@\u0006¢\u0006\f\n\u0004\bp\u00107\u001a\u0004\bq\u0010DR\u0016\u0010v\u001a\u00020s8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010y\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010}\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010\u007f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u000eR \u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020:0\u0080\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u0084\u00018B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\r8B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R,\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0095\u0001\u001a\u00020\u00188G@\u0006¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0096\u0001\u001a\u00020\r8F@\u0006¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u008d\u0001R\u001c\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u0001038F@\u0006¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010D¨\u0006\u009f\u0001"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/viewmodel/FeaturedCoursePlayViewModel;", "Landroidx/lifecycle/ViewModel;", "", "courseId", "", "O", "b0", "W", "videoId", "Lcom/xiaomi/hm/health/training/api/entity/FeaturedCourseVideo;", LogUtil.I, "Lcom/xiaomi/hm/health/training/api/entity/VideoUrl;", "videoUrl", "", "J", "N", u.z, "g0", "video", "Q", "H", "U", "onCleared", "setInitialVideo", "", "duration", "setPlayedVideoDuration", "replay", "doNext", "purchase", "increment", "increasePlayedDuration", "onVideoPaused", "onVideoEnded", "startRealTimeHr", "resumeRealTimeHr", "pauseRealTimeHr", "stopRealTimeHr", "hasVideoToPlay", "Lcom/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo;", "a", "Lcom/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/xiaomi/hm/health/training/helper/Delayer;", "b", "Lcom/xiaomi/hm/health/training/helper/Delayer;", "delayer", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "courseIdLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/training/api/entity/Resource;", "Lcom/xiaomi/hm/health/training/api/entity/FeaturedCourseForPlay;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "courseDetailLiveData", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/xiaomi/hm/health/training/entity/FeaturedCourseVideoWithUrl;", "e", "Landroidx/lifecycle/MediatorLiveData;", "getPlayedVideoLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "playedVideoLiveData", "f", "videoUrlLoadCommandLiveData", "g", "getVideoUrlLoadResultLiveData", "()Landroidx/lifecycle/LiveData;", "videoUrlLoadResultLiveData", "Lcom/xiaomi/hm/health/training/ui/viewmodel/FeaturedCoursePlayViewModel$ReplayButtonState;", "h", "getReplayButtonStateLiveData", "replayButtonStateLiveData", "Lcom/xiaomi/hm/health/training/ui/viewmodel/FeaturedCoursePlayViewModel$NextButtonState;", "i", "getNextButtonStateLiveData", "nextButtonStateLiveData", z.j, "getPurchaseCommandLiveData", "()Landroidx/lifecycle/MutableLiveData;", "purchaseCommandLiveData", "Ljava/lang/Void;", hl.k, "getExitCommandLiveData", "exitCommandLiveData", "l", "getReplayCommandLiveData", "replayCommandLiveData", "m", "getContinuePlayCommandLiveData", "continuePlayCommandLiveData", GoogleApiAvailabilityLight.b, "getShowPurchaseGuideCommandLiveData", "showPurchaseGuideCommandLiveData", "Lcom/xiaomi/hm/health/training/ui/viewmodel/FeaturedCoursePlayViewModel$a;", "o", "joinTrainingCommandLiveData", "Lcom/xiaomi/hm/health/training/api/entity/SimpleFeaturedCourse;", com.google.android.exoplayer2.text.ttml.b.r, "getJoinTrainingResultLiveData", "joinTrainingResultLiveData", DTransferConstants.SEARCH_KEY, "getShowPurchaseGuideBarLiveData", "showPurchaseGuideBarLiveData", "r", "getShowEndButtonsCommandLiveData", "showEndButtonsCommandLiveData", "Lcom/xiaomi/hm/health/training/api/entity/VideoPost;", SOAP.XMLNS, "videoPostLiveData", "Lcom/xiaomi/hm/health/training/api/entity/User;", "t", "getUserLiveData", "userLiveData", "Lcom/xiaomi/hm/health/training/api/TrainingDataSource;", "u", "Lcom/xiaomi/hm/health/training/api/TrainingDataSource;", ParamKey.dataSource, "v", "Lcom/xiaomi/hm/health/training/api/entity/VideoUrl;", "initialVideo", "Lcom/xiaomi/hm/health/training/api/entity/TrainingRecord;", "w", "Lcom/xiaomi/hm/health/training/api/entity/TrainingRecord;", "historyRecord", "x", "playedDuration", "Landroidx/lifecycle/Observer;", "y", "Landroidx/lifecycle/Observer;", "resetPlayedDurationObserver", "", "M", "()Ljava/util/List;", "videos", "Lcom/xiaomi/hm/health/training/api/entity/StartEndVideoPost;", "L", "()Lcom/xiaomi/hm/health/training/api/entity/StartEndVideoPost;", "videoPosts", "P", "()Z", "isFreeCourse", "getCourseId", "()Ljava/lang/String;", "setCourseId", "(Ljava/lang/String;)V", "getDisplayedDuration", "()J", "displayedDuration", "isDemo", "Lcom/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo$RealTimeHr;", "getRealTimeHr", "realTimeHr", "<init>", "(Lcom/xiaomi/hm/health/training/repository/FeaturedCoursePlayRepo;Lcom/xiaomi/hm/health/training/helper/Delayer;)V", "Companion", "NextButtonState", "ReplayButtonState", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class FeaturedCoursePlayViewModel extends ViewModel {
    private static final int A = 1000;

    @NotNull
    private static final String z = "Train-FeaturedCoursePlayViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FeaturedCoursePlayRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Delayer delayer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> courseIdLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<FeaturedCourseForPlay>> courseDetailLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<FeaturedCourseVideoWithUrl> playedVideoLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> videoUrlLoadCommandLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<VideoUrl>> videoUrlLoadResultLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<ReplayButtonState> replayButtonStateLiveData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<NextButtonState> nextButtonStateLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> purchaseCommandLiveData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Void> exitCommandLiveData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Void> replayCommandLiveData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Void> continuePlayCommandLiveData;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Void> showPurchaseGuideCommandLiveData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<a> joinTrainingCommandLiveData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<SimpleFeaturedCourse>> joinTrainingResultLiveData;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Boolean> showPurchaseGuideBarLiveData;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showEndButtonsCommandLiveData;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<VideoPost> videoPostLiveData;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final LiveData<User> userLiveData;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final TrainingDataSource dataSource;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    private VideoUrl initialVideo;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    private TrainingRecord historyRecord;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private long playedDuration;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Observer<FeaturedCourseVideoWithUrl> resetPlayedDurationObserver;
    private static final long B = TimeUnit.SECONDS.toMillis(5);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/viewmodel/FeaturedCoursePlayViewModel$NextButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "STUDY_COMPLETE", "BUY", "PLAY_NEXT", "FINISH", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public enum NextButtonState {
        STUDY_COMPLETE,
        BUY,
        PLAY_NEXT,
        FINISH
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/viewmodel/FeaturedCoursePlayViewModel$ReplayButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "CONTINUE", "CONTINUE_DEMO", "REPLAY_DEMO", "REPLAY", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public enum ReplayButtonState {
        CONTINUE,
        CONTINUE_DEMO,
        REPLAY_DEMO,
        REPLAY
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ReplayButtonState.values().length];
            iArr[ReplayButtonState.CONTINUE.ordinal()] = 1;
            iArr[ReplayButtonState.CONTINUE_DEMO.ordinal()] = 2;
            iArr[ReplayButtonState.REPLAY_DEMO.ordinal()] = 3;
            iArr[ReplayButtonState.REPLAY.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NextButtonState.values().length];
            iArr2[NextButtonState.STUDY_COMPLETE.ordinal()] = 1;
            iArr2[NextButtonState.BUY.ordinal()] = 2;
            iArr2[NextButtonState.PLAY_NEXT.ordinal()] = 3;
            iArr2[NextButtonState.FINISH.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"com/xiaomi/hm/health/training/ui/viewmodel/FeaturedCoursePlayViewModel$a", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "(Ljava/lang/String;)V", "trainingId", "c", TrainingWebConst.QueryParam.SKUID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private String trainingId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private String skuId;

        public a(@NotNull String str, @NotNull String str2) {
            this.trainingId = str;
            this.skuId = str2;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSkuId() {
            return this.skuId;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTrainingId() {
            return this.trainingId;
        }

        public final void c(@NotNull String str) {
            this.skuId = str;
        }

        public final void d(@NotNull String str) {
            this.trainingId = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ FeaturedCourseVideoWithUrl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FeaturedCourseVideoWithUrl featuredCourseVideoWithUrl) {
            super(0);
            this.b = featuredCourseVideoWithUrl;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FeaturedCoursePlayViewModel.this.getPlayedVideoLiveData().setValue(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FeaturedCoursePlayViewModel.this.getShowEndButtonsCommandLiveData().setValue(Boolean.TRUE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FeaturedCoursePlayViewModel.this.getReplayCommandLiveData().setValue(null);
        }
    }

    @Inject
    public FeaturedCoursePlayViewModel(@NotNull FeaturedCoursePlayRepo featuredCoursePlayRepo, @NotNull Delayer delayer) {
        this.repo = featuredCoursePlayRepo;
        this.delayer = delayer;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.courseIdLiveData = mutableLiveData;
        MediatorLiveData<FeaturedCourseVideoWithUrl> mediatorLiveData = new MediatorLiveData<>();
        this.playedVideoLiveData = mediatorLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.videoUrlLoadCommandLiveData = mutableLiveData2;
        MediatorLiveData<ReplayButtonState> mediatorLiveData2 = new MediatorLiveData<>();
        this.replayButtonStateLiveData = mediatorLiveData2;
        MediatorLiveData<NextButtonState> mediatorLiveData3 = new MediatorLiveData<>();
        this.nextButtonStateLiveData = mediatorLiveData3;
        this.purchaseCommandLiveData = new MutableLiveData<>();
        this.exitCommandLiveData = new MutableLiveData<>();
        this.replayCommandLiveData = new MutableLiveData<>();
        this.continuePlayCommandLiveData = new MutableLiveData<>();
        this.showPurchaseGuideCommandLiveData = new MutableLiveData<>();
        MutableLiveData<a> mutableLiveData3 = new MutableLiveData<>();
        this.joinTrainingCommandLiveData = mutableLiveData3;
        MediatorLiveData<Boolean> mediatorLiveData4 = new MediatorLiveData<>();
        this.showPurchaseGuideBarLiveData = mediatorLiveData4;
        this.showEndButtonsCommandLiveData = new MutableLiveData<>();
        this.videoPostLiveData = new MutableLiveData<>();
        TrainingDataSource trainingDataSource = featuredCoursePlayRepo.getCom.xiaomi.hm.health.bodyfat.utils.ParamKey.dataSource java.lang.String();
        this.dataSource = trainingDataSource;
        Observer<FeaturedCourseVideoWithUrl> observer = new Observer() { // from class: s42
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayViewModel.V(this.a, (FeaturedCourseVideoWithUrl) obj);
            }
        };
        this.resetPlayedDurationObserver = observer;
        LiveData<Resource<FeaturedCourseForPlay>> liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function() { // from class: k42
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return FeaturedCoursePlayViewModel.A(this.a, (String) obj);
            }
        });
        this.courseDetailLiveData = liveDataSwitchMap;
        mediatorLiveData.addSource(liveDataSwitchMap, new Observer() { // from class: o42
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayViewModel.B(this.a, (Resource) obj);
            }
        });
        LiveData<Resource<VideoUrl>> liveDataSwitchMap2 = Transformations.switchMap(mutableLiveData2, new Function() { // from class: z32
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return FeaturedCoursePlayViewModel.C(this.a, (String) obj);
            }
        });
        this.videoUrlLoadResultLiveData = liveDataSwitchMap2;
        mediatorLiveData.addSource(liveDataSwitchMap2, new Observer() { // from class: m42
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayViewModel.D(this.a, (Resource) obj);
            }
        });
        mediatorLiveData2.addSource(mediatorLiveData, new Observer() { // from class: p42
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayViewModel.E(this.a, (FeaturedCourseVideoWithUrl) obj);
            }
        });
        mediatorLiveData3.addSource(mediatorLiveData, new Observer() { // from class: q42
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayViewModel.F(this.a, (FeaturedCourseVideoWithUrl) obj);
            }
        });
        mediatorLiveData4.addSource(mediatorLiveData, new Observer() { // from class: r42
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayViewModel.G(this.a, (FeaturedCourseVideoWithUrl) obj);
            }
        });
        LiveData<Resource<SimpleFeaturedCourse>> liveDataSwitchMap3 = Transformations.switchMap(mutableLiveData3, new Function() { // from class: com.xiaomi.hm.health.training.ui.viewmodel.d
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return FeaturedCoursePlayViewModel.y(this.a, (FeaturedCoursePlayViewModel.a) obj);
            }
        });
        this.joinTrainingResultLiveData = liveDataSwitchMap3;
        mediatorLiveData.addSource(liveDataSwitchMap3, new Observer() { // from class: n42
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayViewModel.z(this.a, (Resource) obj);
            }
        });
        mediatorLiveData.observeForever(observer);
        this.userLiveData = trainingDataSource.loadUser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData A(FeaturedCoursePlayViewModel featuredCoursePlayViewModel, String str) {
        return featuredCoursePlayViewModel.dataSource.loadFeaturedCoursesForPlay(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(FeaturedCoursePlayViewModel featuredCoursePlayViewModel, Resource resource) {
        if (featuredCoursePlayViewModel.J(featuredCoursePlayViewModel.initialVideo)) {
            return;
        }
        Loggers.getLogger().w(z, new Supplier() { // from class: c42
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCoursePlayViewModel.R();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData C(FeaturedCoursePlayViewModel featuredCoursePlayViewModel, String str) {
        String value = featuredCoursePlayViewModel.courseIdLiveData.getValue();
        if (value == null || str == null) {
            return null;
        }
        return featuredCoursePlayViewModel.dataSource.loadFeaturedCoursesVideoUrl(value, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(FeaturedCoursePlayViewModel featuredCoursePlayViewModel, Resource resource) {
        if (resource == null || resource.getStatus() != Status.SUCCESS || resource.getData() == null) {
            return;
        }
        featuredCoursePlayViewModel.J((VideoUrl) resource.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(FeaturedCoursePlayViewModel featuredCoursePlayViewModel, FeaturedCourseVideoWithUrl featuredCourseVideoWithUrl) {
        if (featuredCourseVideoWithUrl == null) {
            featuredCoursePlayViewModel.getReplayButtonStateLiveData().setValue(null);
        } else if (featuredCourseVideoWithUrl.isDemo) {
            featuredCoursePlayViewModel.getReplayButtonStateLiveData().setValue(ReplayButtonState.REPLAY_DEMO);
        } else {
            featuredCoursePlayViewModel.getReplayButtonStateLiveData().setValue(ReplayButtonState.REPLAY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(FeaturedCoursePlayViewModel featuredCoursePlayViewModel, FeaturedCourseVideoWithUrl featuredCourseVideoWithUrl) {
        if (featuredCourseVideoWithUrl == null) {
            featuredCoursePlayViewModel.getNextButtonStateLiveData().setValue(null);
            return;
        }
        if (featuredCoursePlayViewModel.P() && !featuredCoursePlayViewModel.N() && !featuredCoursePlayViewModel.Q(featuredCourseVideoWithUrl)) {
            featuredCoursePlayViewModel.getNextButtonStateLiveData().setValue(NextButtonState.STUDY_COMPLETE);
            return;
        }
        if (featuredCourseVideoWithUrl.isDemo) {
            featuredCoursePlayViewModel.getNextButtonStateLiveData().setValue(NextButtonState.BUY);
        } else if (featuredCoursePlayViewModel.Q(featuredCourseVideoWithUrl)) {
            featuredCoursePlayViewModel.getNextButtonStateLiveData().setValue(NextButtonState.FINISH);
        } else {
            featuredCoursePlayViewModel.getNextButtonStateLiveData().setValue(NextButtonState.PLAY_NEXT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(FeaturedCoursePlayViewModel featuredCoursePlayViewModel, FeaturedCourseVideoWithUrl featuredCourseVideoWithUrl) {
        if (featuredCourseVideoWithUrl == null) {
            featuredCoursePlayViewModel.getShowPurchaseGuideBarLiveData().setValue(null);
            return;
        }
        boolean z2 = featuredCourseVideoWithUrl.isDemo && !featuredCoursePlayViewModel.P();
        featuredCoursePlayViewModel.getShowPurchaseGuideBarLiveData().setValue(Boolean.valueOf(z2));
        if (z2) {
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.PURCHASE_COURSE_VIEW_NUM).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, featuredCoursePlayViewModel.courseIdLiveData.getValue()).addExtra("Source", TrainingAnalytics.ParamValue.PurchaseSource.DEMO_GUIDE));
        }
    }

    private final FeaturedCourseVideo H() {
        List<FeaturedCourseVideo> listM;
        int iIndexOf;
        FeaturedCourseVideoWithUrl value = this.playedVideoLiveData.getValue();
        if (value == null || (iIndexOf = (listM = M()).indexOf(value)) < 0 || iIndexOf >= listM.size() - 1) {
            return null;
        }
        return listM.get(iIndexOf + 1);
    }

    private final FeaturedCourseVideo I(String videoId) {
        if (videoId == null) {
            return null;
        }
        for (FeaturedCourseVideo featuredCourseVideo : M()) {
            if (Intrinsics.areEqual(videoId, featuredCourseVideo.id)) {
                return featuredCourseVideo;
            }
        }
        return null;
    }

    private final boolean J(VideoUrl videoUrl) {
        FeaturedCourseVideo featuredCourseVideoI;
        if (videoUrl == null || (featuredCourseVideoI = I(videoUrl.videoId)) == null) {
            return false;
        }
        StartEndVideoPost startEndVideoPostL = L();
        FeaturedCourseVideoWithUrl featuredCourseVideoWithUrlCopy = FeaturedCourseVideoWithUrl.copy(featuredCourseVideoI);
        featuredCourseVideoWithUrlCopy.url = videoUrl.playUrl;
        final b bVar = new b(featuredCourseVideoWithUrlCopy);
        if ((startEndVideoPostL == null ? null : startEndVideoPostL.startPost) != null) {
            VideoPost videoPost = startEndVideoPostL.startPost;
            if (videoPost.duration > 0) {
                this.videoPostLiveData.setValue(videoPost);
                this.showEndButtonsCommandLiveData.setValue(Boolean.FALSE);
                this.delayer.postDelay(new Runnable() { // from class: j42
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeaturedCoursePlayViewModel.K(bVar);
                    }
                }, startEndVideoPostL.startPost.duration);
                return true;
            }
        }
        bVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(Function0 function0) {
        function0.invoke();
    }

    private final StartEndVideoPost L() {
        return null;
    }

    private final List<FeaturedCourseVideo> M() {
        Resource<FeaturedCourseForPlay> value = this.courseDetailLiveData.getValue();
        return (!(value != null && value.getStatus() == Status.SUCCESS) || value.getData() == null || value.getData().videos == null) ? new ArrayList() : value.getData().videos;
    }

    private final boolean N() {
        Resource<FeaturedCourseForPlay> value = this.courseDetailLiveData.getValue();
        if (value == null || value.getData() == null) {
            return false;
        }
        return value.getData().isParticipate;
    }

    private final void O(String courseId) {
        TrainingRecord trainingRecord = new TrainingRecord();
        trainingRecord.trainingId = courseId;
        trainingRecord.startTime = Clock.INSTANCE.getDefault().currentTimeMillis();
        this.historyRecord = trainingRecord;
    }

    private final boolean P() {
        Resource<FeaturedCourseForPlay> value = this.courseDetailLiveData.getValue();
        if (value == null || value.getData() == null) {
            return false;
        }
        return value.getData().isFree;
    }

    private final boolean Q(FeaturedCourseVideo video) {
        if (video == null) {
            return false;
        }
        List<FeaturedCourseVideo> listM = M();
        return listM.indexOf(video) == listM.size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object R() {
        return "视频列表加载完毕，但没找到要播放的初始视频，无法进行播放";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(Function0 function0) {
        function0.invoke();
    }

    private final void U() {
        this.playedDuration = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(FeaturedCoursePlayViewModel featuredCoursePlayViewModel, FeaturedCourseVideoWithUrl featuredCourseVideoWithUrl) {
        if (featuredCourseVideoWithUrl != null) {
            featuredCoursePlayViewModel.U();
        }
    }

    private final void W() {
        FeaturedCourseVideoWithUrl value = this.playedVideoLiveData.getValue();
        if (value == null) {
            Loggers.getLogger().w(z, new Supplier() { // from class: b42
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayViewModel.X();
                }
            });
            return;
        }
        final TrainingRecord trainingRecord = this.historyRecord;
        long j = trainingRecord.duration + this.playedDuration;
        trainingRecord.duration = j;
        if (j <= B) {
            Loggers.getLogger().d(z, new Supplier() { // from class: a42
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayViewModel.a0(trainingRecord);
                }
            });
            return;
        }
        boolean zN = N();
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.TRAINING_FINISHED_OPERAT).addExtra("ID", this.courseIdLiveData.getValue()).addExtra(TrainingAnalytics.ParamKey.STATE, zN ? TrainingAnalytics.ParamValue.JoinState.JOIN : TrainingAnalytics.ParamValue.JoinState.NOT_JOIN));
        if (value.isDemo) {
            Loggers.getLogger().v(z, new Supplier() { // from class: f42
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayViewModel.Y();
                }
            });
            return;
        }
        if (!zN) {
            Loggers.getLogger().v(z, new Supplier() { // from class: e42
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayViewModel.Z();
                }
            });
            return;
        }
        this.dataSource.saveTrainingRecord(trainingRecord);
        List<VideoRecord> list = trainingRecord.watchedVideos;
        if (list != null) {
            for (VideoRecord videoRecord : list) {
                Analytics.recordEvent(new CalculationEventBuilder(TrainingAnalytics.EventId.VIDEO_PLAY_DURATION, videoRecord.watchedDuration).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, this.courseIdLiveData.getValue()).addExtra(TrainingAnalytics.ParamKey.VIDEO_ID, videoRecord.id));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object X() {
        return "保存品课程历史记录失败，获取不到当前播放的视频信息";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object Y() {
        return "试看视频无需记录训练历史";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object Z() {
        return "未参加的课程无需记录训练历史";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object a0(TrainingRecord trainingRecord) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.CHINA, "训练时长过短（%d秒），此次训练不算一次有效的训练历史记录", Arrays.copyOf(new Object[]{Long.valueOf(trainingRecord.duration / ((long) 1000))}, 1));
    }

    private final void b0() {
        Object next;
        FeaturedCourseVideoWithUrl value = this.playedVideoLiveData.getValue();
        final TrainingRecord trainingRecord = this.historyRecord;
        long j = this.playedDuration;
        if (value == null || trainingRecord == null) {
            Loggers.getLogger().w(z, new Supplier() { // from class: g42
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayViewModel.c0();
                }
            });
            return;
        }
        if (value.isDemo) {
            Loggers.getLogger().v(z, new Supplier() { // from class: h42
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayViewModel.d0();
                }
            });
            return;
        }
        if (j <= 0) {
            Loggers.getLogger().v(z, new Supplier() { // from class: d42
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayViewModel.e0();
                }
            });
            return;
        }
        trainingRecord.duration += j;
        long j2 = value.duration;
        if (j2 > 0) {
            trainingRecord.consumption += (long) (value.consumption * Math.min(1.0f, Math.max((j * 1.0f) / j2, 0.0f)));
        }
        if (trainingRecord.watchedVideos == null) {
            trainingRecord.watchedVideos = new ArrayList();
        }
        Iterator<T> it2 = trainingRecord.watchedVideos.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!TextUtils.equals(((VideoRecord) next).id, value.id));
        VideoRecord videoRecord = (VideoRecord) next;
        if (videoRecord == null) {
            videoRecord = new VideoRecord();
            videoRecord.id = value.id;
            trainingRecord.watchedVideos.add(videoRecord);
        }
        videoRecord.watchedCount++;
        videoRecord.watchedDuration += j;
        trainingRecord.endTime = Clock.INSTANCE.getDefault().currentTimeMillis();
        U();
        Loggers.getLogger().v(z, new Supplier() { // from class: t42
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return FeaturedCoursePlayViewModel.f0(trainingRecord);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c0() {
        return "更新精品课程历史记录失败，无视频信息或历史记录未初始化";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d0() {
        return "试看视频无需更新训练历史";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e0() {
        return "尚无累计播放时长，无需更新训练历史记录";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f0(TrainingRecord trainingRecord) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.CHINA, "更新训练历史记录, %s", Arrays.copyOf(new Object[]{trainingRecord}, 1));
    }

    private final void g0(boolean joined) {
        Resource<FeaturedCourseForPlay> value = this.courseDetailLiveData.getValue();
        if (value == null || value.getData() == null) {
            return;
        }
        value.getData().isParticipate = joined;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData y(FeaturedCoursePlayViewModel featuredCoursePlayViewModel, a aVar) {
        return featuredCoursePlayViewModel.dataSource.joinTrainings(aVar.getTrainingId(), aVar.getSkuId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(FeaturedCoursePlayViewModel featuredCoursePlayViewModel, Resource resource) {
        if (resource != null) {
            Status status = resource.getStatus();
            Status status2 = Status.SUCCESS;
            if (status != status2 || resource.getData() == null) {
                return;
            }
            FeaturedCourseVideoWithUrl value = featuredCoursePlayViewModel.getPlayedVideoLiveData().getValue();
            if (value != null) {
                value.isDemo = false;
                featuredCoursePlayViewModel.getPlayedVideoLiveData().setValue(value);
            }
            featuredCoursePlayViewModel.g0(resource.getStatus() == status2);
        }
    }

    public final boolean doNext() {
        String str;
        NextButtonState value = this.nextButtonStateLiveData.getValue();
        if (value == null) {
            return false;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[value.ordinal()];
        if (i == 1) {
            Resource<FeaturedCourseForPlay> value2 = this.courseDetailLiveData.getValue();
            FeaturedCourseForPlay data = value2 != null ? value2.getData() : null;
            if (data != null && (str = data.skuId) != null) {
                this.joinTrainingCommandLiveData.setValue(new a(data.id, str));
            }
        } else {
            if (i == 2) {
                purchase();
                Boolean value3 = this.showEndButtonsCommandLiveData.getValue();
                Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.PURCHASE_COURSE_CLICK).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.courseIdLiveData.getValue())).addExtra("Source", (value3 == null || !value3.booleanValue()) ? TrainingAnalytics.ParamValue.PurchaseSource.PAUSE_GUIDE : TrainingAnalytics.ParamValue.PurchaseSource.END_GUIDE));
                return true;
            }
            if (i == 3) {
                Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.VIDEO_PLAY_OPERATE).setValue(TrainingAnalytics.ParamValue.VideoPlayOp.PLAY_NEXT));
                FeaturedCourseVideo featuredCourseVideoH = H();
                if (featuredCourseVideoH != null) {
                    this.videoUrlLoadCommandLiveData.setValue(featuredCourseVideoH.id);
                }
            } else if (i == 4) {
                this.exitCommandLiveData.setValue(null);
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final MutableLiveData<Void> getContinuePlayCommandLiveData() {
        return this.continuePlayCommandLiveData;
    }

    @Nullable
    public final String getCourseId() {
        return this.courseIdLiveData.getValue();
    }

    @IntRange(from = -1)
    public final long getDisplayedDuration() {
        FeaturedCourseVideoWithUrl value = this.playedVideoLiveData.getValue();
        if (value == null) {
            return -1L;
        }
        long j = value.duration;
        if (j <= 0) {
            return -1L;
        }
        if (value.isDemo) {
            Float f = value.demoPercent;
            if (f != null) {
                return Math.max(0L, Math.min(value.duration, (long) (j * f.floatValue())));
            }
            Long l = value.demoDuration;
            if (l != null) {
                return Math.min(l.longValue(), value.duration);
            }
        }
        return j;
    }

    @NotNull
    public final MutableLiveData<Void> getExitCommandLiveData() {
        return this.exitCommandLiveData;
    }

    @NotNull
    public final LiveData<Resource<SimpleFeaturedCourse>> getJoinTrainingResultLiveData() {
        return this.joinTrainingResultLiveData;
    }

    @NotNull
    public final MediatorLiveData<NextButtonState> getNextButtonStateLiveData() {
        return this.nextButtonStateLiveData;
    }

    @NotNull
    public final MediatorLiveData<FeaturedCourseVideoWithUrl> getPlayedVideoLiveData() {
        return this.playedVideoLiveData;
    }

    @NotNull
    public final MutableLiveData<String> getPurchaseCommandLiveData() {
        return this.purchaseCommandLiveData;
    }

    @NotNull
    public final LiveData<FeaturedCoursePlayRepo.RealTimeHr> getRealTimeHr() {
        return this.repo.getHrLiveData();
    }

    @NotNull
    public final MediatorLiveData<ReplayButtonState> getReplayButtonStateLiveData() {
        return this.replayButtonStateLiveData;
    }

    @NotNull
    public final MutableLiveData<Void> getReplayCommandLiveData() {
        return this.replayCommandLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowEndButtonsCommandLiveData() {
        return this.showEndButtonsCommandLiveData;
    }

    @NotNull
    public final MediatorLiveData<Boolean> getShowPurchaseGuideBarLiveData() {
        return this.showPurchaseGuideBarLiveData;
    }

    @NotNull
    public final MutableLiveData<Void> getShowPurchaseGuideCommandLiveData() {
        return this.showPurchaseGuideCommandLiveData;
    }

    @NotNull
    public final LiveData<User> getUserLiveData() {
        return this.userLiveData;
    }

    @NotNull
    public final LiveData<Resource<VideoUrl>> getVideoUrlLoadResultLiveData() {
        return this.videoUrlLoadResultLiveData;
    }

    public final boolean hasVideoToPlay() {
        return this.playedVideoLiveData.getValue() != null;
    }

    public final void increasePlayedDuration(long increment) {
        if (this.playedVideoLiveData.getValue() == null) {
            return;
        }
        this.playedDuration += increment;
    }

    public final boolean isDemo() {
        FeaturedCourseVideoWithUrl value = this.playedVideoLiveData.getValue();
        return value != null && value.isDemo;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        this.playedVideoLiveData.removeObserver(this.resetPlayedDurationObserver);
        b0();
        W();
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.TRAINING_QUIT_OPERAT).addExtra("ID", this.courseIdLiveData.getValue()).addExtra(TrainingAnalytics.ParamKey.STATE, N() ? TrainingAnalytics.ParamValue.JoinState.JOIN : TrainingAnalytics.ParamValue.JoinState.NOT_JOIN));
    }

    public final void onVideoEnded() {
        if (isDemo()) {
            this.replayButtonStateLiveData.setValue(ReplayButtonState.REPLAY_DEMO);
        }
        NextButtonState value = this.nextButtonStateLiveData.getValue();
        if (value != null && value == NextButtonState.BUY) {
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.PURCHASE_COURSE_VIEW_NUM).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, this.courseIdLiveData.getValue()).addExtra("Source", TrainingAnalytics.ParamValue.PurchaseSource.END_GUIDE));
        }
        final c cVar = new c();
        StartEndVideoPost startEndVideoPostL = L();
        if ((startEndVideoPostL == null ? null : startEndVideoPostL.endPost) == null || startEndVideoPostL.startPost.duration <= 0) {
            cVar.invoke();
        } else {
            this.videoPostLiveData.setValue(startEndVideoPostL.endPost);
            this.delayer.postDelay(new Runnable() { // from class: l42
                @Override // java.lang.Runnable
                public final void run() {
                    FeaturedCoursePlayViewModel.S(cVar);
                }
            }, startEndVideoPostL.endPost.duration);
        }
        b0();
        TrainingBus.watchedFeaturedCourse().setValue(null);
    }

    public final void onVideoPaused() {
        boolean zIsDemo = isDemo();
        boolean zP = P();
        if (zIsDemo || zP) {
            this.showPurchaseGuideCommandLiveData.setValue(null);
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.PURCHASE_COURSE_VIEW_NUM).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, this.courseIdLiveData.getValue()).addExtra("Source", TrainingAnalytics.ParamValue.PurchaseSource.PAUSE_GUIDE));
            if (zP) {
                this.replayButtonStateLiveData.setValue(ReplayButtonState.CONTINUE);
            } else {
                this.replayButtonStateLiveData.setValue(ReplayButtonState.CONTINUE_DEMO);
            }
        }
    }

    public final void pauseRealTimeHr() {
        this.repo.pause();
    }

    public final void purchase() {
        this.purchaseCommandLiveData.setValue(this.courseIdLiveData.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    public final void replay() {
        ReplayButtonState value = this.replayButtonStateLiveData.getValue();
        if (value == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
        if (i == 1 || i == 2) {
            this.continuePlayCommandLiveData.setValue(null);
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.VIDEO_PLAY_OPERATE).setValue("Resume"));
            return;
        }
        if (i == 3 || i == 4) {
            final d dVar = new d();
            StartEndVideoPost startEndVideoPostL = L();
            if ((startEndVideoPostL != null ? startEndVideoPostL.endPost : null) != null) {
                VideoPost videoPost = startEndVideoPostL.startPost;
                if (videoPost.duration > 0) {
                    this.videoPostLiveData.setValue(videoPost);
                    this.showEndButtonsCommandLiveData.setValue(Boolean.FALSE);
                    this.delayer.postDelay(new Runnable() { // from class: i42
                        @Override // java.lang.Runnable
                        public final void run() {
                            FeaturedCoursePlayViewModel.T(dVar);
                        }
                    }, startEndVideoPostL.startPost.duration);
                } else {
                    dVar.invoke();
                }
            } else {
                dVar.invoke();
            }
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.VIDEO_PLAY_OPERATE).setValue(TrainingAnalytics.ParamValue.VideoPlayOp.REPLAY));
        }
    }

    public final void resumeRealTimeHr() {
        this.repo.resume();
    }

    public final void setCourseId(@Nullable String str) {
        String value = this.courseIdLiveData.getValue();
        if ((value == null || !Intrinsics.areEqual(value, str)) && str != null) {
            this.courseIdLiveData.setValue(str);
            O(str);
        }
    }

    public final void setInitialVideo(@NotNull String videoId, @NotNull String videoUrl) {
        VideoUrl videoUrl2 = new VideoUrl();
        videoUrl2.videoId = videoId;
        videoUrl2.playUrl = videoUrl;
        this.initialVideo = videoUrl2;
    }

    public final void setPlayedVideoDuration(@IntRange(from = 0) long duration) {
        FeaturedCourseVideoWithUrl value = this.playedVideoLiveData.getValue();
        if (value != null) {
            value.duration = duration;
        }
    }

    public final void startRealTimeHr() {
        this.repo.start();
    }

    public final void stopRealTimeHr() {
        this.repo.stop();
    }
}
