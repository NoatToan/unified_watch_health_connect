package com.xiaomi.hm.health.training.ui.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelProviders;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.danikula.videocache.CacheListener;
import com.danikula.videocache.HttpProxyCacheServer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.mediac.Command;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.SimpleFeaturedCourse;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.api.entity.User;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.entity.FeaturedCourseVideoWithUrl;
import com.xiaomi.hm.health.training.navigation.NavigationController;
import com.xiaomi.hm.health.training.navigation.TrainingNavigationController;
import com.xiaomi.hm.health.training.repository.FeaturedCoursePlayRepo;
import com.xiaomi.hm.health.training.ui.fragment.FeaturedCoursePlayFragment;
import com.xiaomi.hm.health.training.ui.helper.LoadingDialogHelper;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCoursePlayViewModel;
import com.xiaomi.hm.health.training.ui.viewmodel.TrainingViewModelFactory;
import com.xiaomi.hm.health.training.ui.widget.RealTimeHrView;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\f*\u0004\u008e\u0001\u0092\u0001\u0018\u0000 \u009b\u00012\u00020\u0001:\u0004\u009b\u0001\u009c\u0001B\t¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0002J\u0012\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\u0016\u0010\u0015\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0002J\u0012\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u001a\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0002J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u0002H\u0002J\u0019\u0010!\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020\u00022\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0013H\u0002J\b\u0010&\u001a\u00020\u0002H\u0002J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0002J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0002J\b\u0010+\u001a\u00020\u0002H\u0002J\b\u0010,\u001a\u00020\u0002H\u0002J\b\u0010-\u001a\u00020\u0002H\u0002J\u0018\u00100\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\tH\u0002J\b\u00101\u001a\u00020\u0002H\u0002J\b\u00102\u001a\u00020\u0002H\u0002J\b\u00103\u001a\u00020\u0002H\u0002J\b\u00104\u001a\u00020\u0002H\u0002J\b\u00105\u001a\u00020\u0002H\u0002J\b\u00106\u001a\u00020\u0002H\u0002J\b\u00107\u001a\u00020\u0002H\u0002J\b\u00108\u001a\u00020\u0002H\u0002J\b\u00109\u001a\u00020\u0002H\u0002J\u0018\u0010=\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0002J\u0010\u0010?\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020:H\u0002J\u0018\u0010B\u001a\u00020\u00022\u0006\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020'H\u0002J\b\u0010C\u001a\u00020\u0002H\u0002J\u0018\u0010D\u001a\u00020\u00022\u0006\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020'H\u0002J\u0010\u0010G\u001a\u00020\u00022\u0006\u0010F\u001a\u00020EH\u0016J&\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010I\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016J\u001a\u0010Q\u001a\u00020\u00022\u0006\u0010P\u001a\u00020N2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016J\u0012\u0010R\u001a\u00020\u00022\b\u0010M\u001a\u0004\u0018\u00010LH\u0016J\b\u0010S\u001a\u00020\u0002H\u0016J\b\u0010T\u001a\u00020\u0002H\u0016J\b\u0010U\u001a\u00020\u0002H\u0016R\u001c\u0010Z\u001a\u00020\u001d8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001d\u0010`\u001a\u00020[8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001d\u0010e\u001a\u00020a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010]\u001a\u0004\bc\u0010dR\u001f\u0010j\u001a\u0004\u0018\u00010f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010]\u001a\u0004\bh\u0010iR\u0016\u0010n\u001a\u00020k8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bl\u0010mR\u001d\u0010s\u001a\u00020o8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010]\u001a\u0004\bq\u0010rR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010{\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010\u007f\u001a\u00020|8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0085\u0001R\u0018\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0085\u0001R3\u0010\u008d\u0001\u001a\u001c\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00020\u0089\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\t8B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u009d\u0001"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/fragment/FeaturedCoursePlayFragment;", "Landroidx/fragment/app/Fragment;", "", "C0", "initViewModel", "v0", "initViews", "V", "U", "", "showMask", "isLocked", "J0", "shown", "K0", "I0", "Lcom/xiaomi/hm/health/training/entity/FeaturedCourseVideoWithUrl;", "video", "x0", "Lcom/xiaomi/hm/health/training/api/entity/Resource;", "resource", ExifInterface.LATITUDE_SOUTH, "Lcom/xiaomi/hm/health/training/ui/viewmodel/FeaturedCoursePlayViewModel$ReplayButtonState;", "state", "R0", "Lcom/xiaomi/hm/health/training/ui/viewmodel/FeaturedCoursePlayViewModel$NextButtonState;", "Q0", LogUtil.I, "A0", "", "courseId", "F", "M", "L0", "(Ljava/lang/Boolean;)V", "Lcom/xiaomi/hm/health/training/api/entity/SimpleFeaturedCourse;", "r", "R", "W", "", "percent", "G", "H", "N0", "U0", "X", "rawVideoUrl", "isDemo", "D0", "playVideo", "pauseVideo", "J", "K", "y0", ExifInterface.GPS_DIRECTION_TRUE, "S0", "P0", "T0", "", "currentPosition", "duration", "O0", "milliseconds", "w0", "videoWidth", "videoHeight", "M0", "E", LogUtil.D, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "onResume", "onPause", "onDestroy", "a", "Ljava/lang/String;", "getBEATHE_PAUSE_ACTIONS", "()Ljava/lang/String;", "BEATHE_PAUSE_ACTIONS", "Lcom/xiaomi/hm/health/training/navigation/NavigationController;", "b", "Lkotlin/Lazy;", "O", "()Lcom/xiaomi/hm/health/training/navigation/NavigationController;", "navigationController", "Landroidx/lifecycle/ViewModelProvider$Factory;", "c", "Q", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Lcom/danikula/videocache/HttpProxyCacheServer;", GoogleApiAvailabilityLight.a, "N", "()Lcom/danikula/videocache/HttpProxyCacheServer;", "cacheServer", "Lcom/xiaomi/hm/health/training/ui/fragment/ViewHolder;", "e", "Lcom/xiaomi/hm/health/training/ui/fragment/ViewHolder;", "viewHolder", "Lcom/xiaomi/hm/health/training/ui/viewmodel/FeaturedCoursePlayViewModel;", "f", "P", "()Lcom/xiaomi/hm/health/training/ui/viewmodel/FeaturedCoursePlayViewModel;", "viewModel", "Lcom/xiaomi/hm/health/training/ui/helper/LoadingDialogHelper;", "g", "Lcom/xiaomi/hm/health/training/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "h", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "player", "Lcom/xiaomi/hm/health/training/ui/fragment/FeaturedCoursePlayFragment$VideoProgressUpdater;", "i", "Lcom/xiaomi/hm/health/training/ui/fragment/FeaturedCoursePlayFragment$VideoProgressUpdater;", "progressUiUpdater", "Landroid/media/AudioManager;", z.j, "Landroid/media/AudioManager;", "audioManager", hl.k, "Z", "l", "showSettings", "m", "Lkotlin/Function3;", "Ljava/io/File;", GoogleApiAvailabilityLight.b, "Lkotlin/jvm/functions/Function3;", "videoCacheListener", "com/xiaomi/hm/health/training/ui/fragment/FeaturedCoursePlayFragment$videoListener$1", "o", "Lcom/xiaomi/hm/health/training/ui/fragment/FeaturedCoursePlayFragment$videoListener$1;", "videoListener", "com/xiaomi/hm/health/training/ui/fragment/FeaturedCoursePlayFragment$playerEventListener$1", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/xiaomi/hm/health/training/ui/fragment/FeaturedCoursePlayFragment$playerEventListener$1;", "playerEventListener", "u0", "()Z", "isPlayedVideo", "<init>", "()V", "Companion", "VideoProgressUpdater", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class FeaturedCoursePlayFragment extends Fragment {

    @NotNull
    public static final String ARG_FEATURED_COURSE_ID = "ARG_FEATURED_COURSE_ID";

    @NotNull
    public static final String ARG_INITIAL_PLAY_VIDEO_ID = "ARG_INITIAL_PLAY_VIDEO_ID";

    @NotNull
    public static final String ARG_INITIAL_PLAY_VIDEO_URL = "ARG_INITIAL_PLAY_VIDEO_URL";

    @NotNull
    private static final String q = "Train-FeaturedCoursePlayFragment";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ViewHolder viewHolder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper loadingDialogHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private SimpleExoPlayer player;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private AudioManager audioManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean showMask;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean showSettings;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isLocked;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String BEATHE_PAUSE_ACTIONS = "com.huami.sleep.breathonpause";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModelFactory = LazyKt__LazyJVMKt.lazy(h.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy cacheServer = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final VideoProgressUpdater progressUiUpdater = new VideoProgressUpdater(this);

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Function3<File, String, Integer, Unit> videoCacheListener = new f();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final FeaturedCoursePlayFragment$videoListener$1 videoListener = new VideoListener() { // from class: com.xiaomi.hm.health.training.ui.fragment.FeaturedCoursePlayFragment$videoListener$1
        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onRenderedFirstFrame() {
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            com.google.android.exoplayer2.video.b.b(this, i, i2);
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onVideoSizeChanged(int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio) {
            ViewHolder viewHolder = this.a.viewHolder;
            Objects.requireNonNull(viewHolder);
            viewHolder.getAspectRatioFrame().setAspectRatio((width * 1.0f) / height);
            this.a.M0(width, height);
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            com.google.android.exoplayer2.video.b.d(this, videoSize);
        }
    };

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final FeaturedCoursePlayFragment$playerEventListener$1 playerEventListener = new FeaturedCoursePlayFragment$playerEventListener$1(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/fragment/FeaturedCoursePlayFragment$VideoProgressUpdater;", "Landroid/os/Handler;", "", "start", Command.STOP, "Landroid/os/Message;", "msg", "handleMessage", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/hm/health/training/ui/fragment/FeaturedCoursePlayFragment;", "a", "Ljava/lang/ref/WeakReference;", "ref", "", "b", "Z", "allowRun", "f", "<init>", "(Lcom/xiaomi/hm/health/training/ui/fragment/FeaturedCoursePlayFragment;)V", "Companion", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class VideoProgressUpdater extends Handler {
        public static final long DELAY = 1000;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final WeakReference<FeaturedCoursePlayFragment> ref;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private boolean allowRun;

        public VideoProgressUpdater(@NotNull FeaturedCoursePlayFragment featuredCoursePlayFragment) {
            this.ref = new WeakReference<>(featuredCoursePlayFragment);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object c() {
            return "开始每隔一秒更新进度条";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object d() {
            return "停止每隔一秒更新进度条";
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            FeaturedCoursePlayFragment featuredCoursePlayFragment;
            if (!this.allowRun || (featuredCoursePlayFragment = this.ref.get()) == null) {
                return;
            }
            featuredCoursePlayFragment.T();
            featuredCoursePlayFragment.S0();
            featuredCoursePlayFragment.K();
            sendEmptyMessageDelayed(0, 1000L);
        }

        public final void start() {
            this.allowRun = true;
            removeMessages(0);
            sendEmptyMessage(0);
            Loggers.getLogger().v(FeaturedCoursePlayFragment.q, new Supplier() { // from class: u32
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayFragment.VideoProgressUpdater.c();
                }
            });
        }

        public final void stop() {
            this.allowRun = false;
            removeMessages(0);
            Loggers.getLogger().v(FeaturedCoursePlayFragment.q, new Supplier() { // from class: t32
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayFragment.VideoProgressUpdater.d();
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FeaturedCoursePlayViewModel.ReplayButtonState.values().length];
            iArr[FeaturedCoursePlayViewModel.ReplayButtonState.CONTINUE.ordinal()] = 1;
            iArr[FeaturedCoursePlayViewModel.ReplayButtonState.CONTINUE_DEMO.ordinal()] = 2;
            iArr[FeaturedCoursePlayViewModel.ReplayButtonState.REPLAY_DEMO.ordinal()] = 3;
            iArr[FeaturedCoursePlayViewModel.ReplayButtonState.REPLAY.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FeaturedCoursePlayViewModel.NextButtonState.values().length];
            iArr2[FeaturedCoursePlayViewModel.NextButtonState.STUDY_COMPLETE.ordinal()] = 1;
            iArr2[FeaturedCoursePlayViewModel.NextButtonState.BUY.ordinal()] = 2;
            iArr2[FeaturedCoursePlayViewModel.NextButtonState.PLAY_NEXT.ordinal()] = 3;
            iArr2[FeaturedCoursePlayViewModel.NextButtonState.FINISH.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "addListener", "Landroid/animation/AnimatorSet;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<View, Boolean, AnimatorSet> {
        public final /* synthetic */ int a;
        public final /* synthetic */ long b;
        public final /* synthetic */ FeaturedCoursePlayFragment$animateRealTimeHrView$listener$1 c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, long j, FeaturedCoursePlayFragment$animateRealTimeHrView$listener$1 featuredCoursePlayFragment$animateRealTimeHrView$listener$1, int i2, int i3) {
            super(2);
            this.a = i;
            this.b = j;
            this.c = featuredCoursePlayFragment$animateRealTimeHrView$listener$1;
            this.d = i2;
            this.e = i3;
        }

        @NotNull
        public final AnimatorSet a(@NotNull View view, boolean z) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ROTATION_Y, 0.0f, this.a);
            objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat.setDuration(this.b);
            if (z) {
                objectAnimatorOfFloat.addListener(this.c);
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ROTATION_Y, this.d, this.e);
            objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat2.setDuration(this.b);
            animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            return animatorSet;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ AnimatorSet invoke(View view, Boolean bool) {
            return a(view, bool.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/danikula/videocache/HttpProxyCacheServer;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HttpProxyCacheServer> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HttpProxyCacheServer invoke() {
            return TrainingInjection.get().getFeaturedCourseCacheServer();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/training/navigation/TrainingNavigationController;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<TrainingNavigationController> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TrainingNavigationController invoke() {
            return TrainingInjection.get().getNavigationController();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", "stringResId", "drawableResId", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<Integer, Integer, Unit> {
        public d() {
            super(2);
        }

        public final void a(int i, int i2) {
            ViewHolder viewHolder = FeaturedCoursePlayFragment.this.viewHolder;
            Objects.requireNonNull(viewHolder);
            viewHolder.getBtnNextText().setText(i);
            ViewHolder viewHolder2 = FeaturedCoursePlayFragment.this.viewHolder;
            Objects.requireNonNull(viewHolder2);
            viewHolder2.getBtnNextText().setCompoundDrawablesRelativeWithIntrinsicBounds(i2, 0, 0, 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            a(num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "stringResId", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Integer, Unit> {
        public e() {
            super(1);
        }

        public final void a(int i) {
            ViewHolder viewHolder = FeaturedCoursePlayFragment.this.viewHolder;
            Objects.requireNonNull(viewHolder);
            viewHolder.getBtnReplayText().setText(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Ljava/io/File;", "cacheFile", "", "url", "", "percentsAvailable", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function3<File, String, Integer, Unit> {
        public f() {
            super(3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object c(File file, String str, int i) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(Locale.CHINA, "cacheFile: %s\nurl: %s\npercentsAvailable: %s", Arrays.copyOf(new Object[]{file, str, Integer.valueOf(i)}, 3));
        }

        public final void b(@NotNull final File file, @NotNull final String str, final int i) {
            Loggers.getLogger().v(FeaturedCoursePlayFragment.q, new Supplier() { // from class: com.xiaomi.hm.health.training.ui.fragment.a
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayFragment.f.c(file, str, i);
                }
            });
            ViewHolder viewHolder = FeaturedCoursePlayFragment.this.viewHolder;
            Objects.requireNonNull(viewHolder);
            viewHolder.getVideoSeekBar().setSecondaryProgress(i);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(File file, String str, Integer num) {
            b(file, str, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/viewmodel/FeaturedCoursePlayViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<FeaturedCoursePlayViewModel> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FeaturedCoursePlayViewModel invoke() {
            FeaturedCoursePlayFragment featuredCoursePlayFragment = FeaturedCoursePlayFragment.this;
            return (FeaturedCoursePlayViewModel) ViewModelProviders.of(featuredCoursePlayFragment, featuredCoursePlayFragment.Q()).get(FeaturedCoursePlayViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/viewmodel/TrainingViewModelFactory;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<TrainingViewModelFactory> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TrainingViewModelFactory invoke() {
            return TrainingInjection.get().getViewModelFactory();
        }
    }

    private final void A0() {
        this.player.seekTo(0L);
        S0();
        I0(false);
        this.progressUiUpdater.postDelayed(new Runnable() { // from class: k32
            @Override // java.lang.Runnable
            public final void run() {
                FeaturedCoursePlayFragment.B0(this.a);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(FeaturedCoursePlayFragment featuredCoursePlayFragment) {
        featuredCoursePlayFragment.playVideo();
    }

    private final void C0() {
        Intent intent = new Intent();
        intent.setAction(this.BEATHE_PAUSE_ACTIONS);
        Context context = getContext();
        if (context == null) {
            return;
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    private final void D(int videoWidth, int videoHeight) {
        int i;
        if (getContext() == null) {
            return;
        }
        int iDp2px = (int) ViewUtils.dp2px(requireContext(), 33.0f);
        int iDp2px2 = (int) ViewUtils.dp2px(requireContext(), 27.0f);
        float f2 = (videoWidth * 1.0f) / videoHeight;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i2 = displayMetrics.heightPixels;
        float f3 = i2 * f2;
        int i3 = displayMetrics.widthPixels;
        int i4 = 0;
        if (f3 < i3) {
            i4 = (int) (i3 - (i2 * f2));
            i = 0;
        } else {
            i = (int) (i2 - (i3 / f2));
        }
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        ViewGroup.LayoutParams layoutParams = viewHolder.getRealTimeHr().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(iDp2px + i4);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iDp2px2 + i;
        ViewHolder viewHolder2 = this.viewHolder;
        Objects.requireNonNull(viewHolder2);
        viewHolder2.getRealTimeHr().setLayoutParams(layoutParams2);
    }

    private final void D0(String rawVideoUrl, boolean isDemo) {
        if (getContext() == null) {
            return;
        }
        if (isDemo) {
            Loggers.getLogger().v(q, new Supplier() { // from class: j32
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayFragment.H0();
                }
            });
        } else if (N() != null) {
            rawVideoUrl = N().getProxyUrl(rawVideoUrl);
            HttpProxyCacheServer httpProxyCacheServerN = N();
            final Function3<File, String, Integer, Unit> function3 = this.videoCacheListener;
            httpProxyCacheServerN.unregisterCacheListener(new CacheListener() { // from class: f32
                @Override // com.danikula.videocache.CacheListener
                public final void onCacheAvailable(File file, String str, int i) {
                    FeaturedCoursePlayFragment.E0(function3, file, str, i);
                }
            });
            HttpProxyCacheServer httpProxyCacheServerN2 = N();
            final Function3<File, String, Integer, Unit> function4 = this.videoCacheListener;
            httpProxyCacheServerN2.registerCacheListener(new CacheListener() { // from class: g32
                @Override // com.danikula.videocache.CacheListener
                public final void onCacheAvailable(File file, String str, int i) {
                    FeaturedCoursePlayFragment.F0(function4, file, str, i);
                }
            }, rawVideoUrl);
            Loggers.getLogger().v(q, new Supplier() { // from class: i32
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCoursePlayFragment.G0();
                }
            });
        }
        DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory(requireContext(), Util.getUserAgent(requireContext(), requireContext().getPackageName()), DefaultBandwidthMeter.getSingletonInstance(requireContext()));
        this.player.prepare(new ProgressiveMediaSource.Factory(defaultDataSourceFactory).createMediaSource(new MediaItem.Builder().setUri(Uri.parse(rawVideoUrl)).build()));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.xiaomi.hm.health.training.ui.fragment.FeaturedCoursePlayFragment$animateRealTimeHrView$listener$1] */
    private final void E() {
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        final RealTimeHrView realTimeHr = viewHolder.getRealTimeHr();
        ViewHolder viewHolder2 = this.viewHolder;
        Objects.requireNonNull(viewHolder2);
        final View hrInitialDesc = viewHolder2.getHrInitialDesc();
        realTimeHr.setDrawContent(false);
        final int i = 270;
        a aVar = new a(90, 500L, new AnimatorListenerAdapter() { // from class: com.xiaomi.hm.health.training.ui.fragment.FeaturedCoursePlayFragment$animateRealTimeHrView$listener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                realTimeHr.setRotationY(i);
                hrInitialDesc.setRotationY(i);
                hrInitialDesc.setVisibility(8);
                realTimeHr.setDrawContent(true);
            }
        }, 270, 360);
        Boolean bool = Boolean.TRUE;
        AnimatorSet animatorSetInvoke = aVar.invoke(realTimeHr, bool);
        AnimatorSet animatorSetInvoke2 = aVar.invoke(hrInitialDesc, bool);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorSetInvoke, animatorSetInvoke2);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(Function3 function3, File file, String str, int i) {
        function3.invoke(file, str, Integer.valueOf(i));
    }

    private final void F(String courseId) {
        O().navigateToFeaturedCourseDetail(getContext(), courseId);
        O().finish(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(Function3 function3, File file, String str, int i) {
        function3.invoke(file, str, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int percent) {
        if (getActivity() == null) {
            return;
        }
        Window window = requireActivity().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = Math.min(1.0f, Math.max(0.0f, (percent * 1.0f) / 100));
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object G0() {
        return "不是试看视频，可以缓存";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(int percent) {
        this.audioManager.setStreamVolume(3, (int) (this.audioManager.getStreamMaxVolume(3) * ((percent * 1.0f) / 100)), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object H0() {
        return "试看视频不缓存";
    }

    private final void I() {
        I0(false);
        playVideo();
    }

    private final void I0(boolean shown) {
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        viewHolder.getBtnReplay().setVisibility(shown ? 0 : 8);
        ViewHolder viewHolder2 = this.viewHolder;
        Objects.requireNonNull(viewHolder2);
        viewHolder2.getBtnNext().setVisibility(shown ? 0 : 8);
        ViewHolder viewHolder3 = this.viewHolder;
        Objects.requireNonNull(viewHolder3);
        viewHolder3.getMiddleMask().setVisibility(shown ? 0 : 8);
        ViewHolder viewHolder4 = this.viewHolder;
        Objects.requireNonNull(viewHolder4);
        viewHolder4.getInterceptClickMask().setVisibility(shown ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        pauseVideo();
        T0();
        P().onVideoEnded();
    }

    private final void J0(boolean showMask, boolean isLocked) {
        boolean zIsDemo = P().isDemo();
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        viewHolder.getBtnLock().setVisibility(showMask ? 0 : 8);
        Boolean value = P().getShowPurchaseGuideBarLiveData().getValue();
        if (value != null) {
            zIsDemo &= value.booleanValue();
        }
        ViewHolder viewHolder2 = this.viewHolder;
        Objects.requireNonNull(viewHolder2);
        viewHolder2.getBuyPrompt().setVisibility(zIsDemo ? 0 : 8);
        boolean z = showMask && !isLocked;
        ViewHolder viewHolder3 = this.viewHolder;
        Objects.requireNonNull(viewHolder3);
        viewHolder3.getTopMask().setVisibility(z ? 0 : 8);
        ViewHolder viewHolder4 = this.viewHolder;
        Objects.requireNonNull(viewHolder4);
        viewHolder4.getBottomMask().setVisibility(z ? 0 : 8);
        ViewHolder viewHolder5 = this.viewHolder;
        Objects.requireNonNull(viewHolder5);
        viewHolder5.getBottomMask().setVisibility(z ? 0 : 8);
        ViewHolder viewHolder6 = this.viewHolder;
        Objects.requireNonNull(viewHolder6);
        viewHolder6.getTitle().setVisibility(z ? 0 : 4);
        ViewHolder viewHolder7 = this.viewHolder;
        Objects.requireNonNull(viewHolder7);
        viewHolder7.getBtnClose().setVisibility(z ? 0 : 8);
        ViewHolder viewHolder8 = this.viewHolder;
        Objects.requireNonNull(viewHolder8);
        viewHolder8.getBtnSettings().setVisibility(z ? 0 : 4);
        ViewHolder viewHolder9 = this.viewHolder;
        Objects.requireNonNull(viewHolder9);
        viewHolder9.getBtnPlay().setVisibility(z ? 0 : 8);
        ViewHolder viewHolder10 = this.viewHolder;
        Objects.requireNonNull(viewHolder10);
        viewHolder10.getVideoSeekBar().setVisibility(z ? 0 : 8);
        ViewHolder viewHolder11 = this.viewHolder;
        Objects.requireNonNull(viewHolder11);
        viewHolder11.getCurrentTime().setVisibility(z ? 0 : 8);
        if (z) {
            return;
        }
        K0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        if (P().isDemo()) {
            final long currentPosition = this.player.getCurrentPosition();
            final long displayedDuration = P().getDisplayedDuration();
            boolean z = false;
            if (0 <= displayedDuration && displayedDuration <= currentPosition) {
                z = true;
            }
            if (z) {
                J();
                Loggers.getLogger().v(q, new Supplier() { // from class: h32
                    @Override // com.xiaomi.hm.health.training.api.function.Supplier
                    public final Object get() {
                        return FeaturedCoursePlayFragment.L(currentPosition, displayedDuration);
                    }
                });
            }
        }
    }

    private final void K0(boolean shown) {
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        viewHolder.getMiddleMask().setVisibility(shown ? 0 : 8);
        ViewHolder viewHolder2 = this.viewHolder;
        Objects.requireNonNull(viewHolder2);
        viewHolder2.getBrightnessHeader().setVisibility(shown ? 0 : 8);
        ViewHolder viewHolder3 = this.viewHolder;
        Objects.requireNonNull(viewHolder3);
        viewHolder3.getBrightnessMaxIcon().setVisibility(shown ? 0 : 8);
        ViewHolder viewHolder4 = this.viewHolder;
        Objects.requireNonNull(viewHolder4);
        viewHolder4.getBrightnessSeekBar().setVisibility(shown ? 0 : 8);
        ViewHolder viewHolder5 = this.viewHolder;
        Objects.requireNonNull(viewHolder5);
        viewHolder5.getVolumeHeader().setVisibility(shown ? 0 : 8);
        ViewHolder viewHolder6 = this.viewHolder;
        Objects.requireNonNull(viewHolder6);
        viewHolder6.getVolumeMaxIcon().setVisibility(shown ? 0 : 8);
        ViewHolder viewHolder7 = this.viewHolder;
        Objects.requireNonNull(viewHolder7);
        viewHolder7.getVolumeSeekBar().setVisibility(shown ? 0 : 8);
        if (shown) {
            N0();
            U0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object L(long j, long j2) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.CHINA, "已达到试看限制时长，停止播放。 currentPosition: %s, displayedDuration: %s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(j2)}, 2));
    }

    private final void L0(Boolean shown) {
        if (shown != null) {
            ViewHolder viewHolder = this.viewHolder;
            Objects.requireNonNull(viewHolder);
            viewHolder.getBuyPrompt().setVisibility(shown.booleanValue() ? 0 : 8);
        }
    }

    private final void M() {
        O().finish(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M0(int videoWidth, int videoHeight) {
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        if (viewHolder.getRealTimeHr().getVisibility() == 0) {
            return;
        }
        User value = P().getUserLiveData().getValue();
        boolean z = value != null && value.hasBoundHrDevice();
        ViewHolder viewHolder2 = this.viewHolder;
        Objects.requireNonNull(viewHolder2);
        viewHolder2.getRealTimeHr().setVisibility(z ? 0 : 8);
        ViewHolder viewHolder3 = this.viewHolder;
        Objects.requireNonNull(viewHolder3);
        viewHolder3.getHrInitialDesc().setVisibility(z ? 0 : 8);
        if (z) {
            E();
        }
        D(videoWidth, videoHeight);
    }

    private final HttpProxyCacheServer N() {
        return (HttpProxyCacheServer) this.cacheServer.getValue();
    }

    private final void N0() {
        if (getActivity() == null) {
            return;
        }
        float f2 = requireActivity().getWindow().getAttributes().screenBrightness;
        if (f2 == -1.0f) {
            try {
                f2 = (Settings.System.getInt(requireActivity().getContentResolver(), "screen_brightness") * 1.0f) / 255;
            } catch (Settings.SettingNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        int max = (int) (viewHolder.getBrightnessSeekBar().getMax() * f2);
        ViewHolder viewHolder2 = this.viewHolder;
        Objects.requireNonNull(viewHolder2);
        viewHolder2.getBrightnessSeekBar().setProgress(max);
    }

    private final NavigationController O() {
        return (NavigationController) this.navigationController.getValue();
    }

    private final void O0(long currentPosition, long duration) {
        if (currentPosition < 0 || duration < 0) {
            return;
        }
        String strW0 = w0(currentPosition);
        String strW1 = w0(duration);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), "%s/%s", Arrays.copyOf(new Object[]{strW0, strW1}, 2));
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        viewHolder.getCurrentTime().setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeaturedCoursePlayViewModel P() {
        return (FeaturedCoursePlayViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0() {
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        SeekBar videoSeekBar = viewHolder.getVideoSeekBar();
        float progress = (videoSeekBar.getProgress() * 1.0f) / videoSeekBar.getMax();
        long displayedDuration = P().getDisplayedDuration();
        O0((long) (progress * displayedDuration), displayedDuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewModelProvider.Factory Q() {
        return (ViewModelProvider.Factory) this.viewModelFactory.getValue();
    }

    private final void Q0(FeaturedCoursePlayViewModel.NextButtonState state) {
        if (state != null) {
            d dVar = new d();
            int i = WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
            if (i == 1) {
                dVar.invoke(Integer.valueOf(R.string.tr_study_complete_course), Integer.valueOf(R.drawable.tr_fc_next));
                return;
            }
            if (i == 2) {
                dVar.invoke(Integer.valueOf(R.string.tr_buy_course), Integer.valueOf(R.drawable.tr_fc_cart));
            } else if (i == 3) {
                dVar.invoke(Integer.valueOf(R.string.tr_study_next_course), Integer.valueOf(R.drawable.tr_fc_next));
            } else {
                if (i != 4) {
                    return;
                }
                dVar.invoke(Integer.valueOf(R.string.tr_end_course), Integer.valueOf(R.drawable.tr_fc_exit));
            }
        }
    }

    private final void R(Resource<SimpleFeaturedCourse> r) {
        this.loadingDialogHelper.showOrError(r);
        if (r == null || r.getStatus() != Status.SUCCESS || r.getData() == null) {
            return;
        }
        I0(false);
    }

    private final void R0(FeaturedCoursePlayViewModel.ReplayButtonState state) {
        if (state != null) {
            e eVar = new e();
            int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i == 1) {
                eVar.invoke(Integer.valueOf(R.string.tr_continue_play));
                return;
            }
            if (i == 2) {
                eVar.invoke(Integer.valueOf(R.string.tr_continue_play_demo));
            } else if (i == 3) {
                eVar.invoke(Integer.valueOf(R.string.tr_replay_demo));
            } else {
                if (i != 4) {
                    return;
                }
                eVar.invoke(Integer.valueOf(R.string.tr_play_again));
            }
        }
    }

    private final void S(Resource<?> resource) {
        this.loadingDialogHelper.showOrError(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0() {
        long currentPosition = this.player.getCurrentPosition();
        long displayedDuration = P().getDisplayedDuration();
        O0(currentPosition, displayedDuration);
        if (currentPosition < 0 || displayedDuration <= 0) {
            return;
        }
        long j = (currentPosition * ((long) 100)) / displayedDuration;
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        viewHolder.getVideoSeekBar().setProgress((int) j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        P().increasePlayedDuration(1000L);
    }

    private final void T0() {
        long displayedDuration = P().getDisplayedDuration();
        O0(displayedDuration, displayedDuration);
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        int max = viewHolder.getVideoSeekBar().getMax();
        ViewHolder viewHolder2 = this.viewHolder;
        Objects.requireNonNull(viewHolder2);
        viewHolder2.getVideoSeekBar().setProgress(max);
    }

    private final void U() {
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        TextView buyPrompt = viewHolder.getBuyPrompt();
        final int color = ContextCompat.getColor(buyPrompt.getContext(), R.color.tr_buy_featured_course);
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.xiaomi.hm.health.training.ui.fragment.FeaturedCoursePlayFragment$initBuyPromptText$clickableSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(@NotNull View widget) {
                this.a.P().purchase();
                Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.PURCHASE_COURSE_CLICK).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.a.P().getCourseId())).addExtra("Source", this.a.u0() ? TrainingAnalytics.ParamValue.PurchaseSource.DEMO_GUIDE : TrainingAnalytics.ParamValue.PurchaseSource.PAUSE_GUIDE));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NotNull TextPaint ds) {
                ds.setColor(color);
            }
        };
        String string = getString(R.string.tr_preview_demo_buy_prompt);
        Spanned spannedFromHtml = Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(string, 0) : Html.fromHtml(string);
        SpannableStringBuilder spannableStringBuilder = spannedFromHtml instanceof SpannableStringBuilder ? (SpannableStringBuilder) spannedFromHtml : new SpannableStringBuilder(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannedFromHtml.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        int i = 0;
        while (i < length) {
            URLSpan uRLSpan = uRLSpanArr[i];
            i++;
            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
            int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
            if (Intrinsics.areEqual("buy_course", uRLSpan.getURL())) {
                spannableStringBuilder.removeSpan(uRLSpan);
                spannableStringBuilder.setSpan(clickableSpan, spanStart, spanEnd, spanFlags);
            }
        }
        buyPrompt.setText(spannableStringBuilder);
        buyPrompt.setLinksClickable(true);
        buyPrompt.setMovementMethod(LinkMovementMethod.getInstance());
        buyPrompt.setHighlightColor(0);
    }

    private final void U0() {
        if (getActivity() == null) {
            return;
        }
        float streamVolume = (this.audioManager.getStreamVolume(3) * 1.0f) / this.audioManager.getStreamMaxVolume(3);
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        int max = (int) (viewHolder.getVolumeSeekBar().getMax() * streamVolume);
        ViewHolder viewHolder2 = this.viewHolder;
        Objects.requireNonNull(viewHolder2);
        viewHolder2.getVolumeSeekBar().setProgress(max);
    }

    private final void V() {
        RealTimeHrView.DescriptionText descriptionText = new RealTimeHrView.DescriptionText();
        descriptionText.bluetoothOff = getString(R.string.training_playing_hr_exception_bluetooth_off);
        DeviceCenter deviceCenter = DeviceCenter.getInstance();
        if (!deviceCenter.hasBoundHrDevice()) {
            descriptionText.deviceDisconnected = getString(R.string.training_playing_hr_exception_device_disconnect);
            descriptionText.deviceNotTight = getString(R.string.training_playing_hr_exception_device_not_tight);
            descriptionText.lowBattery = getString(R.string.training_playing_hr_exception_low_battery);
        } else if (DeviceCenter.isMiliWatch(deviceCenter.getBoundDevice(HMDeviceType.MILI))) {
            descriptionText.deviceDisconnected = getString(R.string.watch_disconnected);
            descriptionText.deviceNotTight = getString(R.string.training_playing_hr_exception_watch_not_tight);
            descriptionText.lowBattery = getString(R.string.training_playing_hr_exception_low_battery);
        } else {
            descriptionText.deviceDisconnected = getString(R.string.miband_disconnected);
            descriptionText.deviceNotTight = getString(R.string.training_playing_hr_exception_band_not_tight);
            descriptionText.lowBattery = getString(R.string.training_playing_hr_exception_low_battery_for_band);
        }
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        viewHolder.getRealTimeHr().setDescriptionText(descriptionText);
    }

    private final void W() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.getWindow().setFlags(1024, 1024);
        activity.getWindow().addFlags(128);
        activity.setVolumeControlStream(3);
    }

    private final void X() {
        SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(requireContext()).build();
        simpleExoPlayerBuild.addListener(this.playerEventListener);
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        simpleExoPlayerBuild.setVideoSurfaceView(viewHolder.getVideoSurface());
        simpleExoPlayerBuild.addVideoListener(this.videoListener);
        Unit unit = Unit.INSTANCE;
        this.player = simpleExoPlayerBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(FeaturedCoursePlayFragment featuredCoursePlayFragment, FeaturedCourseVideoWithUrl featuredCourseVideoWithUrl) {
        featuredCoursePlayFragment.x0(featuredCourseVideoWithUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(FeaturedCoursePlayFragment featuredCoursePlayFragment, Boolean bool) {
        featuredCoursePlayFragment.L0(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(FeaturedCoursePlayFragment featuredCoursePlayFragment, Resource resource) {
        featuredCoursePlayFragment.R(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(FeaturedCoursePlayFragment featuredCoursePlayFragment, Boolean bool) {
        featuredCoursePlayFragment.I0(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(FeaturedCoursePlayFragment featuredCoursePlayFragment, User user) {
        if (user != null) {
            int age = user.getAge();
            ViewHolder viewHolder = featuredCoursePlayFragment.viewHolder;
            Objects.requireNonNull(viewHolder);
            viewHolder.getRealTimeHr().setUserAge(age);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(FeaturedCoursePlayFragment featuredCoursePlayFragment, FeaturedCoursePlayRepo.RealTimeHr realTimeHr) {
        if (realTimeHr != null) {
            ViewHolder viewHolder = featuredCoursePlayFragment.viewHolder;
            Objects.requireNonNull(viewHolder);
            viewHolder.getRealTimeHr().setHr(realTimeHr.getHr(), realTimeHr.getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(FeaturedCoursePlayFragment featuredCoursePlayFragment, Resource resource) {
        featuredCoursePlayFragment.S(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(FeaturedCoursePlayFragment featuredCoursePlayFragment, FeaturedCoursePlayViewModel.ReplayButtonState replayButtonState) {
        featuredCoursePlayFragment.R0(replayButtonState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(FeaturedCoursePlayFragment featuredCoursePlayFragment, FeaturedCoursePlayViewModel.NextButtonState nextButtonState) {
        featuredCoursePlayFragment.Q0(nextButtonState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(FeaturedCoursePlayFragment featuredCoursePlayFragment, Void r1) {
        featuredCoursePlayFragment.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(FeaturedCoursePlayFragment featuredCoursePlayFragment, Void r1) {
        featuredCoursePlayFragment.A0();
    }

    private final void initViewModel() {
        FeaturedCoursePlayViewModel featuredCoursePlayViewModelP = P();
        featuredCoursePlayViewModelP.getPlayedVideoLiveData().observe(this, new Observer() { // from class: s22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.Y(this.a, (FeaturedCourseVideoWithUrl) obj);
            }
        });
        featuredCoursePlayViewModelP.getVideoUrlLoadResultLiveData().observe(this, new Observer() { // from class: r32
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.e0(this.a, (Resource) obj);
            }
        });
        featuredCoursePlayViewModelP.getReplayButtonStateLiveData().observe(this, new Observer() { // from class: v22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.f0(this.a, (FeaturedCoursePlayViewModel.ReplayButtonState) obj);
            }
        });
        featuredCoursePlayViewModelP.getNextButtonStateLiveData().observe(this, new Observer() { // from class: u22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.g0(this.a, (FeaturedCoursePlayViewModel.NextButtonState) obj);
            }
        });
        featuredCoursePlayViewModelP.getContinuePlayCommandLiveData().observe(this, new Observer() { // from class: z22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.h0(this.a, (Void) obj);
            }
        });
        featuredCoursePlayViewModelP.getReplayCommandLiveData().observe(this, new Observer() { // from class: c32
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.i0(this.a, (Void) obj);
            }
        });
        featuredCoursePlayViewModelP.getPurchaseCommandLiveData().observe(this, new Observer() { // from class: y22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.j0(this.a, (String) obj);
            }
        });
        featuredCoursePlayViewModelP.getExitCommandLiveData().observe(this, new Observer() { // from class: a32
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.k0(this.a, (Void) obj);
            }
        });
        featuredCoursePlayViewModelP.getShowPurchaseGuideCommandLiveData().observe(this, new Observer() { // from class: d32
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.l0(this.a, (Void) obj);
            }
        });
        featuredCoursePlayViewModelP.getShowPurchaseGuideBarLiveData().observe(this, new Observer() { // from class: w22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.Z(this.a, (Boolean) obj);
            }
        });
        featuredCoursePlayViewModelP.getJoinTrainingResultLiveData().observe(this, new Observer() { // from class: s32
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.a0(this.a, (Resource) obj);
            }
        });
        featuredCoursePlayViewModelP.getShowEndButtonsCommandLiveData().observe(this, new Observer() { // from class: x22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.b0(this.a, (Boolean) obj);
            }
        });
        featuredCoursePlayViewModelP.getUserLiveData().observe(this, new Observer() { // from class: r22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.c0(this.a, (User) obj);
            }
        });
        featuredCoursePlayViewModelP.getRealTimeHr().observe(this, new Observer() { // from class: t22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FeaturedCoursePlayFragment.d0(this.a, (FeaturedCoursePlayRepo.RealTimeHr) obj);
            }
        });
    }

    private final void initViews() {
        this.loadingDialogHelper = new LoadingDialogHelper(getActivity());
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        viewHolder.getAspectRatioFrame().setAspectRatio(1.7777778f);
        U();
        ViewHolder viewHolder2 = this.viewHolder;
        Objects.requireNonNull(viewHolder2);
        viewHolder2.getVideoSurface().setOnClickListener(new View.OnClickListener() { // from class: o32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeaturedCoursePlayFragment.m0(this.a, view);
            }
        });
        ViewHolder viewHolder3 = this.viewHolder;
        Objects.requireNonNull(viewHolder3);
        viewHolder3.getBtnClose().setOnClickListener(new View.OnClickListener() { // from class: p32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeaturedCoursePlayFragment.n0(this.a, view);
            }
        });
        ViewHolder viewHolder4 = this.viewHolder;
        Objects.requireNonNull(viewHolder4);
        viewHolder4.getBtnSettings().setOnClickListener(new View.OnClickListener() { // from class: m32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeaturedCoursePlayFragment.o0(this.a, view);
            }
        });
        ViewHolder viewHolder5 = this.viewHolder;
        Objects.requireNonNull(viewHolder5);
        viewHolder5.getBtnPlay().setOnClickListener(new View.OnClickListener() { // from class: b32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeaturedCoursePlayFragment.p0(this.a, view);
            }
        });
        ViewHolder viewHolder6 = this.viewHolder;
        Objects.requireNonNull(viewHolder6);
        viewHolder6.getBtnLock().setOnClickListener(new View.OnClickListener() { // from class: l32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeaturedCoursePlayFragment.q0(this.a, view);
            }
        });
        ViewHolder viewHolder7 = this.viewHolder;
        Objects.requireNonNull(viewHolder7);
        viewHolder7.getVideoSeekBar().setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.xiaomi.hm.health.training.ui.fragment.FeaturedCoursePlayFragment.initViews.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@NotNull SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    FeaturedCoursePlayFragment.this.P0();
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@NotNull SeekBar seekBar) {
                if (FeaturedCoursePlayFragment.this.u0()) {
                    FeaturedCoursePlayFragment.this.progressUiUpdater.stop();
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@NotNull SeekBar seekBar) {
                FeaturedCoursePlayFragment.this.player.seekTo((FeaturedCoursePlayFragment.this.P().getDisplayedDuration() * ((long) seekBar.getProgress())) / ((long) 100));
                FeaturedCoursePlayFragment.this.S0();
                if (FeaturedCoursePlayFragment.this.u0()) {
                    FeaturedCoursePlayFragment.this.progressUiUpdater.start();
                }
            }
        });
        ViewHolder viewHolder8 = this.viewHolder;
        Objects.requireNonNull(viewHolder8);
        viewHolder8.getBrightnessSeekBar().setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.xiaomi.hm.health.training.ui.fragment.FeaturedCoursePlayFragment.initViews.7
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@NotNull SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    FeaturedCoursePlayFragment.this.G(progress);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@NotNull SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@NotNull SeekBar seekBar) {
                FeaturedCoursePlayFragment.this.G(seekBar.getProgress());
                Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.VIDEO_PLAY_OPERATE).setValue("Light"));
            }
        });
        ViewHolder viewHolder9 = this.viewHolder;
        Objects.requireNonNull(viewHolder9);
        viewHolder9.getVolumeSeekBar().setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.xiaomi.hm.health.training.ui.fragment.FeaturedCoursePlayFragment.initViews.8
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@NotNull SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    FeaturedCoursePlayFragment.this.H(progress);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@NotNull SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@NotNull SeekBar seekBar) {
                FeaturedCoursePlayFragment.this.H(seekBar.getProgress());
                Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.VIDEO_PLAY_OPERATE).setValue(TrainingAnalytics.ParamValue.VideoPlayOp.VOLUME));
            }
        });
        ViewHolder viewHolder10 = this.viewHolder;
        Objects.requireNonNull(viewHolder10);
        viewHolder10.getInterceptClickMask().setOnClickListener(new View.OnClickListener() { // from class: q32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeaturedCoursePlayFragment.r0(view);
            }
        });
        ViewHolder viewHolder11 = this.viewHolder;
        Objects.requireNonNull(viewHolder11);
        viewHolder11.getBtnReplay().setOnClickListener(new View.OnClickListener() { // from class: n32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeaturedCoursePlayFragment.s0(this.a, view);
            }
        });
        ViewHolder viewHolder12 = this.viewHolder;
        Objects.requireNonNull(viewHolder12);
        viewHolder12.getBtnNext().setOnClickListener(new View.OnClickListener() { // from class: q22
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeaturedCoursePlayFragment.t0(this.a, view);
            }
        });
        V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(FeaturedCoursePlayFragment featuredCoursePlayFragment, String str) {
        featuredCoursePlayFragment.F(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(FeaturedCoursePlayFragment featuredCoursePlayFragment, Void r1) {
        featuredCoursePlayFragment.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(FeaturedCoursePlayFragment featuredCoursePlayFragment, Void r1) {
        featuredCoursePlayFragment.I0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(FeaturedCoursePlayFragment featuredCoursePlayFragment, View view) {
        boolean z = !featuredCoursePlayFragment.showMask;
        featuredCoursePlayFragment.showMask = z;
        featuredCoursePlayFragment.J0(z, featuredCoursePlayFragment.isLocked);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(FeaturedCoursePlayFragment featuredCoursePlayFragment, View view) {
        featuredCoursePlayFragment.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(FeaturedCoursePlayFragment featuredCoursePlayFragment, View view) {
        boolean z = !featuredCoursePlayFragment.showSettings;
        featuredCoursePlayFragment.showSettings = z;
        featuredCoursePlayFragment.K0(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(FeaturedCoursePlayFragment featuredCoursePlayFragment, View view) {
        if (!featuredCoursePlayFragment.u0()) {
            featuredCoursePlayFragment.playVideo();
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.VIDEO_PLAY_OPERATE).setValue("Resume"));
        } else {
            featuredCoursePlayFragment.pauseVideo();
            featuredCoursePlayFragment.P().onVideoPaused();
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.VIDEO_PLAY_OPERATE).setValue("Pause"));
        }
    }

    private final void pauseVideo() {
        this.player.setPlayWhenReady(false);
        this.progressUiUpdater.stop();
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        viewHolder.getBtnPlay().setImageResource(R.drawable.tr_fc_play);
        ViewHolder viewHolder2 = this.viewHolder;
        Objects.requireNonNull(viewHolder2);
        viewHolder2.getBufferingProgress().setVisibility(8);
    }

    private final void playVideo() {
        this.player.setPlayWhenReady(true);
        this.progressUiUpdater.start();
        ViewHolder viewHolder = this.viewHolder;
        Objects.requireNonNull(viewHolder);
        viewHolder.getBtnPlay().setImageResource(R.drawable.tr_fc_pause);
        boolean z = this.player.getPlaybackState() == 2;
        ViewHolder viewHolder2 = this.viewHolder;
        Objects.requireNonNull(viewHolder2);
        viewHolder2.getBufferingProgress().setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(FeaturedCoursePlayFragment featuredCoursePlayFragment, View view) {
        featuredCoursePlayFragment.isLocked = !featuredCoursePlayFragment.isLocked;
        ViewHolder viewHolder = featuredCoursePlayFragment.viewHolder;
        Objects.requireNonNull(viewHolder);
        viewHolder.getBtnLock().setImageResource(featuredCoursePlayFragment.isLocked ? R.drawable.tr_fc_play_unlock : R.drawable.tr_fc_play_lock);
        featuredCoursePlayFragment.J0(featuredCoursePlayFragment.showMask, featuredCoursePlayFragment.isLocked);
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.VIDEO_PLAY_OPERATE).setValue(featuredCoursePlayFragment.isLocked ? TrainingAnalytics.ParamValue.VideoPlayOp.LOCK : TrainingAnalytics.ParamValue.VideoPlayOp.UNLOCK));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(FeaturedCoursePlayFragment featuredCoursePlayFragment, View view) {
        featuredCoursePlayFragment.P().replay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(FeaturedCoursePlayFragment featuredCoursePlayFragment, View view) {
        if (featuredCoursePlayFragment.P().doNext()) {
            featuredCoursePlayFragment.I0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u0() {
        return this.player.getPlayWhenReady();
    }

    private final void v0() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        String string = arguments.getString("ARG_FEATURED_COURSE_ID");
        String string2 = arguments.getString(ARG_INITIAL_PLAY_VIDEO_ID);
        String string3 = arguments.getString(ARG_INITIAL_PLAY_VIDEO_URL);
        P().setCourseId(string);
        if (string2 == null || string3 == null) {
            return;
        }
        P().setInitialVideo(string2, string3);
    }

    private final String w0(long milliseconds) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(milliseconds);
        long seconds = timeUnit.toSeconds(milliseconds) - (((long) 60) * minutes);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}, 2));
    }

    private final void x0(FeaturedCourseVideoWithUrl video) {
        if (video != null) {
            ViewHolder viewHolder = this.viewHolder;
            Objects.requireNonNull(viewHolder);
            viewHolder.getTitle().setText(video.name);
            boolean z = false;
            I0(false);
            this.player.seekTo(0L);
            S0();
            if (N() != null && N().isCached(video.url)) {
                z = true;
            }
            if (z) {
                ViewHolder viewHolder2 = this.viewHolder;
                Objects.requireNonNull(viewHolder2);
                viewHolder2.getVideoSeekBar().setSecondaryProgress(100);
            }
            D0(video.url, video.isDemo);
            playVideo();
        }
    }

    private final void y0() {
        SimpleExoPlayer simpleExoPlayer = this.player;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.removeVideoListener(this.videoListener);
            simpleExoPlayer.removeListener(this.playerEventListener);
            simpleExoPlayer.release();
        }
        if (N() != null) {
            HttpProxyCacheServer httpProxyCacheServerN = N();
            final Function3<File, String, Integer, Unit> function3 = this.videoCacheListener;
            httpProxyCacheServerN.unregisterCacheListener(new CacheListener() { // from class: e32
                @Override // com.danikula.videocache.CacheListener
                public final void onCacheAvailable(File file, String str, int i) {
                    FeaturedCoursePlayFragment.z0(function3, file, str, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(Function3 function3, File file, String str, int i) {
        function3.invoke(file, str, Integer.valueOf(i));
    }

    @NotNull
    public final String getBEATHE_PAUSE_ACTIONS() {
        return this.BEATHE_PAUSE_ACTIONS;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        W();
        X();
        P().startRealTimeHr();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        initViewModel();
        v0();
        Object systemService = context.getSystemService("audio");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tr_fragment_featured_course_play, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        y0();
        P().stopRealTimeHr();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        pauseVideo();
        P().pauseRealTimeHr();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (P().hasVideoToPlay()) {
            playVideo();
        }
        P().resumeRealTimeHr();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.viewHolder = new ViewHolder(view);
        initViews();
        J0(this.showMask, this.isLocked);
        C0();
    }
}
