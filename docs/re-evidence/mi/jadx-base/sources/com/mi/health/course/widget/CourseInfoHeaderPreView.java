package com.mi.health.course.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.Disposable;
import coil.request.ImageRequest;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.upstream.d;
import com.google.android.exoplayer2.v;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.StopWatch;
import com.mi.health.course.widget.CourseInfoHeaderPreView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.view.RatioImageView;
import defpackage.aop;
import defpackage.bli;
import defpackage.czi;
import defpackage.kyi;
import defpackage.n0i;
import defpackage.nm1;
import defpackage.oqi;
import defpackage.sti;
import defpackage.u56;
import defpackage.wlq;
import defpackage.wrq;
import defpackage.xmi;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u00ad\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001d\b\u0007\u0018\u0000 m2\u00020\u0001:\u0001mB\u0019\b\u0007\u0012\u0006\u0010h\u001a\u00020g\u0012\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u001d\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0002¢\u0006\u0004\b \u0010\u0004J\u001f\u0010$\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0002H\u0014¢\u0006\u0004\b'\u0010\u0004R\u0014\u0010(\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010.R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u0010.R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010:\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010.R\u0016\u0010;\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010.R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010.R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR*\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010MR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010X\u001a\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010]R\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006n"}, d2 = {"Lcom/mi/health/course/widget/CourseInfoHeaderPreView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "findViews", "()V", "", "unit", "value", "Landroid/widget/TextView;", "view", "setDataView", "(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;)V", "videoUri", "initVideo", "(Ljava/lang/String;)V", "startOverlay", "", "cancelOverlay", "()Z", "addObserver", "", "seconds", "showVideoTime", "(J)Ljava/lang/String;", "timerPause", "timerStart", "timerCancel", "Lcom/mi/health/course/export/data/CourseAllInfo;", "allInfo", "vipActive", "bindData", "(Lcom/mi/health/course/export/data/CourseAllInfo;Z)V", LifecycleConstantKt.ON_STOP, "", "uiType", "force", "showCoutrolUI", "(IZ)V", "disposeImageRequestIfNeed", "onDetachedFromWindow", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fitness/widget/view/RatioImageView;", "thumbnail", "Lcom/xiaomi/fitness/widget/view/RatioImageView;", "diffValueTv", "Landroid/widget/TextView;", "consumeValueTv", "durationValueTv", "desTv", "Lcoil/request/Disposable;", "imageRequestDis", "Lcoil/request/Disposable;", "tvTag", "Landroid/widget/ImageView;", "ivPrePlay", "Landroid/widget/ImageView;", "ivPreStop", "tvPrePlayHint", "tvCoursePreCurrentTime", "Landroid/widget/ProgressBar;", "pbCoursePre", "Landroid/widget/ProgressBar;", "tvCoursePreTotalTime", "Landroid/view/View;", "viewMask", "Landroid/view/View;", "Lcom/google/android/exoplayer2/t;", "player", "Lcom/google/android/exoplayer2/t;", "Landroid/view/SurfaceView;", "playerView", "Landroid/view/SurfaceView;", "Landroidx/cardview/widget/CardView;", "cardVideo", "Landroidx/cardview/widget/CardView;", "preTime", "I", "Lkotlin/Function0;", "showOpenVipAction", "Lkotlin/jvm/functions/Function0;", "getShowOpenVipAction", "()Lkotlin/jvm/functions/Function0;", "setShowOpenVipAction", "(Lkotlin/jvm/functions/Function0;)V", "mCurrentPreType", "Lcom/mi/health/course/util/StopWatch;", "progressTimer$delegate", "Lkotlin/Lazy;", "getProgressTimer", "()Lcom/mi/health/course/util/StopWatch;", "progressTimer", "hasInitVideo", "Z", "Ljava/lang/Runnable;", "goneOverlay$delegate", "getGoneOverlay", "()Ljava/lang/Runnable;", "goneOverlay", "playHasPrePare", "com/mi/health/course/widget/CourseInfoHeaderPreView$playerListener$1", "playerListener", "Lcom/mi/health/course/widget/CourseInfoHeaderPreView$playerListener$1;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseInfoHeaderPreView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseInfoHeaderPreView.kt\ncom/mi/health/course/widget/CourseInfoHeaderPreView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,438:1\n54#2,3:439\n24#2:442\n57#2,6:443\n63#2,2:450\n57#3:449\n*S KotlinDebug\n*F\n+ 1 CourseInfoHeaderPreView.kt\ncom/mi/health/course/widget/CourseInfoHeaderPreView\n*L\n154#1:439,3\n154#1:442\n154#1:443,6\n154#1:450,2\n154#1:449\n*E\n"})
public final class CourseInfoHeaderPreView extends Hilt_CourseInfoHeaderPreView {
    public static final int UI_TYPE_HIDE = 0;
    public static final int UI_TYPE_PAUSE = 2;
    public static final int UI_TYPE_PLAY = 5;
    public static final int UI_TYPE_PRE_PLAY = 1;
    public static final int UI_TYPE_STOP = 3;

    @NotNull
    private final String TAG;
    private CardView cardVideo;
    private TextView consumeValueTv;
    private TextView desTv;
    private TextView diffValueTv;
    private TextView durationValueTv;

    /* JADX INFO: renamed from: goneOverlay$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy goneOverlay;
    private boolean hasInitVideo;

    @Nullable
    private Disposable imageRequestDis;
    private ImageView ivPrePlay;
    private ImageView ivPreStop;
    private int mCurrentPreType;
    private ProgressBar pbCoursePre;
    private boolean playHasPrePare;
    private t player;

    @NotNull
    private final CourseInfoHeaderPreView$playerListener$1 playerListener;
    private SurfaceView playerView;
    private int preTime;

    /* JADX INFO: renamed from: progressTimer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressTimer;

    @Nullable
    private Function0<Unit> showOpenVipAction;
    private RatioImageView thumbnail;
    private TextView tvCoursePreCurrentTime;
    private TextView tvCoursePreTotalTime;
    private TextView tvPrePlayHint;
    private TextView tvTag;
    private View viewMask;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.mi.health.course.widget.CourseInfoHeaderPreView$playerListener$1] */
    public CourseInfoHeaderPreView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.TAG = "CourseInfoHeaderPreView";
        this.mCurrentPreType = -1;
        this.progressTimer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mt4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CourseInfoHeaderPreView.progressTimer_delegate$lambda$1(this.f27174a);
            }
        });
        int screenState = UIUtils.INSTANCE.getScreenState();
        LayoutInflater.from(context).inflate(screenState != 0 ? screenState != 1 ? sti.course_info_detail_header_portrait : sti.course_info_detail_header_foldable_expand : sti.course_info_detail_header_tablet_landscape, this);
        findViews();
        this.goneOverlay = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nt4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CourseInfoHeaderPreView.goneOverlay_delegate$lambda$5(this.f28348a);
            }
        });
        this.playerListener = new q.e() { // from class: com.mi.health.course.widget.CourseInfoHeaderPreView$playerListener$1
            @Override // defpackage.jn1
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(nm1 nm1Var) {
                super.onAudioAttributesChanged(nm1Var);
            }

            @Override // defpackage.jn1
            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
                super.onAudioSessionIdChanged(i);
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(q.b bVar) {
                super.onAvailableCommandsChanged(bVar);
            }

            @Override // com.google.android.exoplayer2.q.e
            public /* bridge */ /* synthetic */ void onCues(List list) {
                super.onCues(list);
            }

            @Override // defpackage.d96
            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(u56 u56Var) {
                super.onDeviceInfoChanged(u56Var);
            }

            @Override // defpackage.d96
            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
                super.onDeviceVolumeChanged(i, z);
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onEvents(q qVar, q.d dVar) {
                super.onEvents(qVar, dVar);
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
                super.onIsLoadingChanged(z);
            }

            @Override // com.google.android.exoplayer2.q.c
            public void onIsPlayingChanged(boolean isPlaying) {
                if (isPlaying) {
                    this.this$0.timerStart();
                } else {
                    this.this$0.timerPause();
                }
            }

            @Override // com.google.android.exoplayer2.q.c
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
                super.onLoadingChanged(z);
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onMediaItemTransition(m mVar, int i) {
                super.onMediaItemTransition(mVar, i);
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(n nVar) {
                super.onMediaMetadataChanged(nVar);
            }

            @Override // com.google.android.exoplayer2.q.e, defpackage.stf
            public /* bridge */ /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
                super.onMetadata(metadata);
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
                super.onPlayWhenReadyChanged(z, i);
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(n0i n0iVar) {
                super.onPlaybackParametersChanged(n0iVar);
            }

            @Override // com.google.android.exoplayer2.q.c
            public void onPlaybackStateChanged(int state) {
                Logger.i(this.this$0.TAG, "onPlaybackStateChanged: state = " + state);
                if (state != 3) {
                    return;
                }
                long j = this.this$0.preTime;
                t tVar = this.this$0.player;
                ProgressBar progressBar = null;
                if (tVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("player");
                    tVar = null;
                }
                long jMin = Math.min(j, tVar.q() / ((long) 1000));
                TextView textView = this.this$0.tvCoursePreTotalTime;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvCoursePreTotalTime");
                    textView = null;
                }
                textView.setText(this.this$0.showVideoTime(jMin));
                ProgressBar progressBar2 = this.this$0.pbCoursePre;
                if (progressBar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pbCoursePre");
                } else {
                    progressBar = progressBar2;
                }
                progressBar.setMax((int) jMin);
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
                super.onPlaybackSuppressionReasonChanged(i);
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onPlayerError(ExoPlaybackException exoPlaybackException) {
                super.onPlayerError(exoPlaybackException);
            }

            @Override // com.google.android.exoplayer2.q.c
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
                super.onPlayerStateChanged(z, i);
            }

            @Override // com.google.android.exoplayer2.q.c
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
                super.onPositionDiscontinuity(i);
            }

            @Override // defpackage.erq
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
                super.onRenderedFirstFrame();
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
                super.onRepeatModeChanged(i);
            }

            @Override // com.google.android.exoplayer2.q.c
            @Deprecated
            public /* bridge */ /* synthetic */ void onSeekProcessed() {
                super.onSeekProcessed();
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
                super.onShuffleModeEnabledChanged(z);
            }

            @Override // defpackage.jn1
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
                super.onSkipSilenceEnabledChanged(z);
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
                super.onStaticMetadataChanged(list);
            }

            @Override // defpackage.erq
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
                super.onSurfaceSizeChanged(i, i2);
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onTimelineChanged(v vVar, int i) {
                super.onTimelineChanged(vVar, i);
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, aop aopVar) {
                super.onTracksChanged(trackGroupArray, aopVar);
            }

            @Override // defpackage.erq
            @Deprecated
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
                super.onVideoSizeChanged(i, i2, i3, f);
            }

            @Override // defpackage.jn1
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
                super.onVolumeChanged(f);
            }

            @Override // com.google.android.exoplayer2.q.c
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(q.f fVar, q.f fVar2, int i) {
                super.onPositionDiscontinuity(fVar, fVar2, i);
            }

            @Override // com.google.android.exoplayer2.q.c
            @Deprecated
            public /* bridge */ /* synthetic */ void onTimelineChanged(v vVar, Object obj, int i) {
                super.onTimelineChanged(vVar, obj, i);
            }

            @Override // defpackage.erq
            public void onVideoSizeChanged(wrq videoSize) {
                Intrinsics.checkNotNullParameter(videoSize, "videoSize");
            }
        };
    }

    private final void addObserver() {
        ImageView imageView;
        SurfaceView surfaceView;
        ImageView imageView2;
        t tVar = this.player;
        if (tVar != null) {
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                tVar = null;
            }
            tVar.K(this.playerListener);
        }
        ImageView imageView3 = this.ivPrePlay;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivPrePlay");
            imageView = null;
        } else {
            imageView = imageView3;
        }
        ViewExtKt.clickWithTrigger$default(imageView, 0L, new Function1() { // from class: gt4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseInfoHeaderPreView.addObserver$lambda$6(this.f19311a, (ImageView) obj);
            }
        }, 1, null);
        SurfaceView surfaceView2 = this.playerView;
        if (surfaceView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            surfaceView = null;
        } else {
            surfaceView = surfaceView2;
        }
        ViewExtKt.clickWithTrigger$default(surfaceView, 0L, new Function1() { // from class: ht4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseInfoHeaderPreView.addObserver$lambda$7(this.f20423a, (SurfaceView) obj);
            }
        }, 1, null);
        ImageView imageView4 = this.ivPreStop;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivPreStop");
            imageView2 = null;
        } else {
            imageView2 = imageView4;
        }
        ViewExtKt.clickWithTrigger$default(imageView2, 0L, new Function1() { // from class: it4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseInfoHeaderPreView.addObserver$lambda$8(this.f22068a, (ImageView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$6(CourseInfoHeaderPreView this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        t tVar = this$0.player;
        if (tVar != null) {
            CardView cardView = null;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                tVar = null;
            }
            if (tVar.isPlaying()) {
                t tVar2 = this$0.player;
                if (tVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("player");
                    tVar2 = null;
                }
                tVar2.pause();
                this$0.cancelOverlay();
                showCoutrolUI$default(this$0, 5, false, 2, null);
            } else {
                if (this$0.playHasPrePare) {
                    t tVar3 = this$0.player;
                    if (tVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("player");
                        tVar3 = null;
                    }
                    tVar3.play();
                } else {
                    t tVar4 = this$0.player;
                    if (tVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("player");
                        tVar4 = null;
                    }
                    tVar4.prepare();
                    t tVar5 = this$0.player;
                    if (tVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("player");
                        tVar5 = null;
                    }
                    tVar5.z(true);
                    this$0.playHasPrePare = true;
                }
                this$0.cancelOverlay();
                showCoutrolUI$default(this$0, 0, false, 2, null);
                CardView cardView2 = this$0.cardVideo;
                if (cardView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cardVideo");
                } else {
                    cardView = cardView2;
                }
                ViewExtKt.visible(cardView);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$7(CourseInfoHeaderPreView this$0, SurfaceView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        t tVar = this$0.player;
        if (tVar != null) {
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                tVar = null;
            }
            if (tVar.isPlaying()) {
                showCoutrolUI$default(this$0, 2, false, 2, null);
                this$0.startOverlay();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$8(CourseInfoHeaderPreView this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        t tVar = this$0.player;
        TextView textView = null;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            tVar = null;
        }
        tVar.seekTo(0L);
        showCoutrolUI$default(this$0, 1, false, 2, null);
        this$0.cancelOverlay();
        CardView cardView = this$0.cardVideo;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardVideo");
            cardView = null;
        }
        ViewExtKt.invisible(cardView);
        TextView textView2 = this$0.tvPrePlayHint;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPrePlayHint");
        } else {
            textView = textView2;
        }
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = kyi.course_pre_time;
        int i2 = this$0.preTime;
        textView.setText(ResourceExtKt.getQuantityString(context, i, i2, Integer.valueOf(i2)));
        return Unit.INSTANCE;
    }

    private final boolean cancelOverlay() {
        ProgressBar progressBar = this.pbCoursePre;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pbCoursePre");
            progressBar = null;
        }
        return progressBar.removeCallbacks(getGoneOverlay());
    }

    private final void findViews() {
        this.thumbnail = (RatioImageView) findViewById(oqi.T0);
        this.viewMask = findViewById(oqi.l2);
        this.diffValueTv = (TextView) findViewById(oqi.X);
        this.consumeValueTv = (TextView) findViewById(oqi.A);
        this.durationValueTv = (TextView) findViewById(oqi.x1);
        this.desTv = (TextView) findViewById(oqi.R);
        this.tvTag = (TextView) findViewById(oqi.O1);
        this.ivPrePlay = (ImageView) findViewById(oqi.q0);
        this.ivPreStop = (ImageView) findViewById(oqi.r0);
        TextView textView = (TextView) findViewById(oqi.b2);
        this.tvPrePlayHint = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPrePlayHint");
            textView = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ViewExtKt.getColor(this, bli.f));
        gradientDrawable.setCornerRadius(ExtUtilsKt.getDp(4));
        textView.setBackground(gradientDrawable);
        this.tvCoursePreCurrentTime = (TextView) findViewById(oqi.L1);
        this.pbCoursePre = (ProgressBar) findViewById(oqi.R0);
        this.tvCoursePreTotalTime = (TextView) findViewById(oqi.M1);
        this.playerView = (SurfaceView) findViewById(oqi.S0);
        this.cardVideo = (CardView) findViewById(oqi.p);
    }

    private final Runnable getGoneOverlay() {
        return (Runnable) this.goneOverlay.getValue();
    }

    private final StopWatch getProgressTimer() {
        return (StopWatch) this.progressTimer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable goneOverlay_delegate$lambda$5(final CourseInfoHeaderPreView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Runnable() { // from class: lt4
            @Override // java.lang.Runnable
            public final void run() {
                CourseInfoHeaderPreView.goneOverlay_delegate$lambda$5$lambda$4(this.f25411a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void goneOverlay_delegate$lambda$5$lambda$4(CourseInfoHeaderPreView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        showCoutrolUI$default(this$0, 0, false, 2, null);
    }

    private final void initVideo(String videoUri) {
        Logger.d(this.TAG, "initvideo:" + videoUri);
        TextView textView = null;
        SurfaceView surfaceView = null;
        if (videoUri == null || videoUri.length() == 0) {
            showCoutrolUI$default(this, 0, false, 2, null);
            TextView textView2 = this.tvPrePlayHint;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPrePlayHint");
            } else {
                textView = textView2;
            }
            ExtUtilsKt.setVisible(textView, false);
            return;
        }
        if (videoUri != null) {
            if (this.player == null) {
                this.player = new t.b(getContext()).x();
            }
            m mVarB = m.b(Uri.parse(videoUri));
            Intrinsics.checkNotNullExpressionValue(mVarB, "fromUri(...)");
            HlsMediaSource hlsMediaSourceC = new HlsMediaSource.Factory(new d(getContext(), wlq.h0(getContext(), getContext().getPackageName()))).a(mVarB);
            Intrinsics.checkNotNullExpressionValue(hlsMediaSourceC, "createMediaSource(...)");
            t tVar = this.player;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                tVar = null;
            }
            tVar.b1(hlsMediaSourceC);
            t tVar2 = this.player;
            if (tVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                tVar2 = null;
            }
            SurfaceView surfaceView2 = this.playerView;
            if (surfaceView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerView");
            } else {
                surfaceView = surfaceView2;
            }
            tVar2.h(surfaceView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StopWatch progressTimer_delegate$lambda$1(final CourseInfoHeaderPreView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new StopWatch(500L, new Function1() { // from class: jt4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseInfoHeaderPreView.progressTimer_delegate$lambda$1$lambda$0(this.f23108a, ((Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit progressTimer_delegate$lambda$1$lambda$0(CourseInfoHeaderPreView this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        t tVar = this$0.player;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
            tVar = null;
        }
        long currentPosition = tVar.getCurrentPosition() / ((long) 1000);
        TextView textView = this$0.tvCoursePreCurrentTime;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvCoursePreCurrentTime");
            textView = null;
        }
        textView.setText(this$0.showVideoTime(currentPosition));
        ProgressBar progressBar = this$0.pbCoursePre;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pbCoursePre");
            progressBar = null;
        }
        int i = (int) currentPosition;
        progressBar.setProgress(i);
        if (i >= this$0.preTime) {
            t tVar2 = this$0.player;
            if (tVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                tVar2 = null;
            }
            tVar2.pause();
            t tVar3 = this$0.player;
            if (tVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                tVar3 = null;
            }
            tVar3.seekTo(0L);
            showCoutrolUI$default(this$0, 3, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    private final void setDataView(String unit, String value, TextView view) {
        int length = value.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(value + unit);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, length, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getColor(bli.course_black)), 0, length, 17);
        view.setText(spannableStringBuilder);
    }

    public static /* synthetic */ void showCoutrolUI$default(CourseInfoHeaderPreView courseInfoHeaderPreView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        courseInfoHeaderPreView.showCoutrolUI(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCoutrolUI$lambda$9(CourseInfoHeaderPreView this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Function0<Unit> function0 = this$0.showOpenVipAction;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String showVideoTime(long seconds) {
        long j = 3600;
        long j2 = seconds / j;
        long j3 = seconds % j;
        long j4 = 60;
        long j5 = j3 / j4;
        long j6 = j3 % j4;
        if (j2 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j5), Long.valueOf(j6)}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j6)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    private final void startOverlay() {
        cancelOverlay();
        ProgressBar progressBar = this.pbCoursePre;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pbCoursePre");
            progressBar = null;
        }
        progressBar.postDelayed(getGoneOverlay(), 5000L);
    }

    private final void timerCancel() {
        getProgressTimer().cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void timerPause() {
        getProgressTimer().pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void timerStart() {
        getProgressTimer().start();
    }

    public final void bindData(@NotNull CourseAllInfo allInfo, boolean vipActive) {
        Intrinsics.checkNotNullParameter(allInfo, "allInfo");
        CourseModel.CourseData basicInfo = allInfo.getBasicInfo();
        if (basicInfo == null) {
            return;
        }
        Pair<String, String> difficult = CourseExtKt.getDifficult(basicInfo);
        int calorie = CourseExtKt.getCalorie(basicInfo);
        int i = basicInfo.duration;
        String str = " " + ((Object) difficult.getFirst());
        String second = difficult.getSecond();
        TextView textView = this.diffValueTv;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("diffValueTv");
            textView = null;
        }
        setDataView(str, second, textView);
        String str2 = " " + ResourceExtKt.getString(czi.course_calorie_label);
        String strValueOf = String.valueOf(calorie);
        TextView textView3 = this.consumeValueTv;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consumeValueTv");
            textView3 = null;
        }
        setDataView(str2, strValueOf, textView3);
        String str3 = " " + ResourceExtKt.getString(czi.i);
        String strValueOf2 = String.valueOf(i);
        TextView textView4 = this.durationValueTv;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("durationValueTv");
            textView4 = null;
        }
        setDataView(str3, strValueOf2, textView4);
        RatioImageView ratioImageView = this.thumbnail;
        if (ratioImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thumbnail");
            ratioImageView = null;
        }
        CourseConfigModel.PreviewImg img = allInfo.getImg();
        String str4 = img != null ? img.large : null;
        ImageLoader imageLoader = Coil.imageLoader(ratioImageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(ratioImageView.getContext()).data(str4).target(ratioImageView);
        Unit unit = Unit.INSTANCE;
        this.imageRequestDis = imageLoader.enqueue(builderTarget.build());
        CourseConfigModel.ConfigDetail detailInfo = allInfo.getDetailInfo();
        if (detailInfo == null) {
            return;
        }
        String str5 = detailInfo.course_intro;
        if (str5 == null || str5.length() == 0) {
            TextView textView5 = this.desTv;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("desTv");
                textView5 = null;
            }
            ViewExtKt.gone(textView5);
        } else {
            TextView textView6 = this.desTv;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("desTv");
                textView6 = null;
            }
            ViewExtKt.visible(textView6);
            TextView textView7 = this.desTv;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("desTv");
                textView7 = null;
            }
            textView7.setText(str5);
        }
        TextView textView8 = this.diffValueTv;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("diffValueTv");
            textView8 = null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(ResourceExtKt.getString(czi.course_difficult));
        stringBuffer.append(",");
        TextView textView9 = this.diffValueTv;
        if (textView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("diffValueTv");
            textView9 = null;
        }
        stringBuffer.append(textView9.getText());
        textView8.setContentDescription(stringBuffer.toString());
        TextView textView10 = this.consumeValueTv;
        if (textView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consumeValueTv");
            textView10 = null;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(ResourceExtKt.getString(czi.course_share_calorie_desc));
        stringBuffer2.append(",");
        TextView textView11 = this.consumeValueTv;
        if (textView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consumeValueTv");
            textView11 = null;
        }
        stringBuffer2.append(textView11.getText());
        textView10.setContentDescription(stringBuffer2.toString());
        TextView textView12 = this.durationValueTv;
        if (textView12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("durationValueTv");
            textView12 = null;
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(ResourceExtKt.getString(czi.course_time));
        stringBuffer3.append(",");
        TextView textView13 = this.durationValueTv;
        if (textView13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("durationValueTv");
            textView13 = null;
        }
        stringBuffer3.append(textView13.getText());
        textView12.setContentDescription(stringBuffer3.toString());
        TextView textView14 = this.tvTag;
        if (textView14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvTag");
            textView14 = null;
        }
        CourseModel.CourseData basicInfo2 = allInfo.getBasicInfo();
        CourseExtKt.showCourseTag(textView14, basicInfo2 != null ? basicInfo2.pricingStatus : 0);
        CourseModel.CourseData basicInfo3 = allInfo.getBasicInfo();
        this.preTime = basicInfo3 != null ? basicInfo3.previewSeconds : 0;
        CourseModel.CourseData basicInfo4 = allInfo.getBasicInfo();
        if (basicInfo4 == null || basicInfo4.pricingStatus != 2 || vipActive || this.preTime <= 0) {
            showCoutrolUI(0, true);
            TextView textView15 = this.tvPrePlayHint;
            if (textView15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPrePlayHint");
            } else {
                textView2 = textView15;
            }
            ViewExtKt.gone(textView2);
            return;
        }
        showCoutrolUI(1, true);
        TextView textView16 = this.tvPrePlayHint;
        if (textView16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPrePlayHint");
            textView16 = null;
        }
        ViewExtKt.visible(textView16);
        if (this.hasInitVideo) {
            return;
        }
        TextView textView17 = this.tvPrePlayHint;
        if (textView17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPrePlayHint");
            textView17 = null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i2 = kyi.course_pre_time;
        int i3 = this.preTime;
        textView17.setText(ResourceExtKt.getQuantityString(context, i2, i3, Integer.valueOf(i3)));
        CourseConfigModel.VideoInfo videoInfo = allInfo.getVideoInfo();
        initVideo(videoInfo != null ? videoInfo.previewVideoUrl : null);
        addObserver();
        this.hasInitVideo = true;
    }

    public final void disposeImageRequestIfNeed() {
        Disposable disposable = this.imageRequestDis;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Nullable
    public final Function0<Unit> getShowOpenVipAction() {
        return this.showOpenVipAction;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t tVar = this.player;
        if (tVar != null) {
            t tVar2 = null;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                tVar = null;
            }
            tVar.f(this.playerListener);
            t tVar3 = this.player;
            if (tVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
            } else {
                tVar2 = tVar3;
            }
            tVar2.release();
        }
        timerCancel();
    }

    public final void onStop() {
        t tVar = this.player;
        if (tVar != null) {
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("player");
                tVar = null;
            }
            if (tVar.isPlaying()) {
                t tVar2 = this.player;
                if (tVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("player");
                    tVar2 = null;
                }
                tVar2.pause();
                if (this.mCurrentPreType == 2) {
                    cancelOverlay();
                }
                showCoutrolUI$default(this, 5, false, 2, null);
            }
        }
    }

    public final void setShowOpenVipAction(@Nullable Function0<Unit> function0) {
        this.showOpenVipAction = function0;
    }

    public final void showCoutrolUI(int uiType, boolean force) {
        TextView textView;
        if (this.mCurrentPreType != uiType || force) {
            this.mCurrentPreType = uiType;
            View view = null;
            if (uiType == 0) {
                ImageView imageView = this.ivPrePlay;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivPrePlay");
                    imageView = null;
                }
                ExtUtilsKt.setVisible(imageView, false);
                ImageView imageView2 = this.ivPreStop;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivPreStop");
                    imageView2 = null;
                }
                ExtUtilsKt.setVisible(imageView2, false);
                TextView textView2 = this.tvCoursePreCurrentTime;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvCoursePreCurrentTime");
                    textView2 = null;
                }
                ExtUtilsKt.setVisible(textView2, false);
                ProgressBar progressBar = this.pbCoursePre;
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pbCoursePre");
                    progressBar = null;
                }
                ExtUtilsKt.setVisible(progressBar, false);
                TextView textView3 = this.tvCoursePreTotalTime;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvCoursePreTotalTime");
                    textView3 = null;
                }
                ExtUtilsKt.setVisible(textView3, false);
                View view2 = this.viewMask;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewMask");
                } else {
                    view = view2;
                }
                ExtUtilsKt.setVisible(view, false);
                return;
            }
            if (uiType == 1) {
                ImageView imageView3 = this.ivPrePlay;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivPrePlay");
                    imageView3 = null;
                }
                ExtUtilsKt.setVisible(imageView3, true);
                ImageView imageView4 = this.ivPrePlay;
                if (imageView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivPrePlay");
                    imageView4 = null;
                }
                imageView4.setImageResource(xmi.course_icon_pre_play);
                ImageView imageView5 = this.ivPreStop;
                if (imageView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivPreStop");
                    imageView5 = null;
                }
                ExtUtilsKt.setVisible(imageView5, false);
                TextView textView4 = this.tvCoursePreCurrentTime;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvCoursePreCurrentTime");
                    textView4 = null;
                }
                ExtUtilsKt.setVisible(textView4, false);
                ProgressBar progressBar2 = this.pbCoursePre;
                if (progressBar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pbCoursePre");
                    progressBar2 = null;
                }
                ExtUtilsKt.setVisible(progressBar2, false);
                TextView textView5 = this.tvCoursePreTotalTime;
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvCoursePreTotalTime");
                    textView5 = null;
                }
                ExtUtilsKt.setVisible(textView5, false);
                View view3 = this.viewMask;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewMask");
                } else {
                    view = view3;
                }
                ExtUtilsKt.setVisible(view, false);
                return;
            }
            if (uiType == 2) {
                ImageView imageView6 = this.ivPrePlay;
                if (imageView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivPrePlay");
                    imageView6 = null;
                }
                ExtUtilsKt.setVisible(imageView6, true);
                ImageView imageView7 = this.ivPrePlay;
                if (imageView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivPrePlay");
                    imageView7 = null;
                }
                imageView7.setImageResource(xmi.course_icon_pre_pause);
                ImageView imageView8 = this.ivPreStop;
                if (imageView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivPreStop");
                    imageView8 = null;
                }
                ExtUtilsKt.setVisible(imageView8, false);
                TextView textView6 = this.tvCoursePreCurrentTime;
                if (textView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvCoursePreCurrentTime");
                    textView6 = null;
                }
                ExtUtilsKt.setVisible(textView6, true);
                ProgressBar progressBar3 = this.pbCoursePre;
                if (progressBar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pbCoursePre");
                    progressBar3 = null;
                }
                ExtUtilsKt.setVisible(progressBar3, true);
                TextView textView7 = this.tvCoursePreTotalTime;
                if (textView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvCoursePreTotalTime");
                    textView7 = null;
                }
                ExtUtilsKt.setVisible(textView7, true);
                View view4 = this.viewMask;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewMask");
                } else {
                    view = view4;
                }
                ExtUtilsKt.setVisible(view, true);
                return;
            }
            if (uiType != 3) {
                if (uiType != 5) {
                    return;
                }
                ImageView imageView9 = this.ivPrePlay;
                if (imageView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivPrePlay");
                    imageView9 = null;
                }
                ExtUtilsKt.setVisible(imageView9, true);
                ImageView imageView10 = this.ivPrePlay;
                if (imageView10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivPrePlay");
                    imageView10 = null;
                }
                imageView10.setImageResource(xmi.course_icon_pre_play);
                ImageView imageView11 = this.ivPreStop;
                if (imageView11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivPreStop");
                    imageView11 = null;
                }
                ExtUtilsKt.setVisible(imageView11, false);
                TextView textView8 = this.tvCoursePreCurrentTime;
                if (textView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvCoursePreCurrentTime");
                    textView8 = null;
                }
                ExtUtilsKt.setVisible(textView8, true);
                ProgressBar progressBar4 = this.pbCoursePre;
                if (progressBar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pbCoursePre");
                    progressBar4 = null;
                }
                ExtUtilsKt.setVisible(progressBar4, true);
                TextView textView9 = this.tvCoursePreTotalTime;
                if (textView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvCoursePreTotalTime");
                    textView9 = null;
                }
                ExtUtilsKt.setVisible(textView9, true);
                View view5 = this.viewMask;
                if (view5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewMask");
                } else {
                    view = view5;
                }
                ExtUtilsKt.setVisible(view, false);
                return;
            }
            ImageView imageView12 = this.ivPrePlay;
            if (imageView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivPrePlay");
                imageView12 = null;
            }
            ExtUtilsKt.setVisible(imageView12, false);
            ImageView imageView13 = this.ivPreStop;
            if (imageView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivPreStop");
                imageView13 = null;
            }
            ExtUtilsKt.setVisible(imageView13, true);
            TextView textView10 = this.tvCoursePreCurrentTime;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvCoursePreCurrentTime");
                textView10 = null;
            }
            ExtUtilsKt.setVisible(textView10, true);
            ProgressBar progressBar5 = this.pbCoursePre;
            if (progressBar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pbCoursePre");
                progressBar5 = null;
            }
            ExtUtilsKt.setVisible(progressBar5, true);
            TextView textView11 = this.tvCoursePreTotalTime;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvCoursePreTotalTime");
                textView11 = null;
            }
            ExtUtilsKt.setVisible(textView11, true);
            View view6 = this.viewMask;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewMask");
                view6 = null;
            }
            ExtUtilsKt.setVisible(view6, true);
            TextView textView12 = this.tvPrePlayHint;
            if (textView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPrePlayHint");
                textView12 = null;
            }
            textView12.setText(czi.course_pre_vip);
            TextView textView13 = this.tvPrePlayHint;
            if (textView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPrePlayHint");
                textView = null;
            } else {
                textView = textView13;
            }
            ViewExtKt.clickWithTrigger$default(textView, 0L, new Function1() { // from class: kt4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CourseInfoHeaderPreView.showCoutrolUI$lambda$9(this.f24274a, (TextView) obj);
                }
            }, 1, null);
        }
    }
}
