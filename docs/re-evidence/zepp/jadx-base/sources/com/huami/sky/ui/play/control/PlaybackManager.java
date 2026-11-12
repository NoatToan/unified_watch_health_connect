package com.huami.sky.ui.play.control;

import android.os.Handler;
import android.os.Looper;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.sky.lib.constant.MusicPauseFrom;
import com.huami.sky.lib.constant.MusicPlayRecordEnum;
import com.huami.sky.lib.entity.MusicPlayRecord;
import com.huami.sky.service.PlayState;
import com.huami.sky.ui.analytic.SkyPlayEventKt;
import com.huami.sky.ui.bean.MusicInfo;
import com.huami.sky.ui.bean.SkyUserAction;
import com.huami.sky.ui.play.PlaybackParamManager;
import com.huami.sky.ui.play.SkyPlaybackParam;
import com.huami.sky.ui.play.control.PlaybackManager;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.watch.companion.mediac.Command;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 x2\u00020\u0001:\u0002xGB\u0007¢\u0006\u0004\bv\u0010wJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J&\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0002J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0002H\u0002J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0017H\u0002J\u0016\u0010*\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005J\u000e\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+J\u0006\u0010.\u001a\u00020\u0007J\u0010\u0010/\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0015J\u0006\u00100\u001a\u00020\u0007J\u000e\u00101\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u00102\u001a\u00020\u0007J\u0006\u00103\u001a\u00020\u0017J\u0006\u00104\u001a\u00020!J\u000e\u00105\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!J\u0006\u00107\u001a\u000206J\b\u00108\u001a\u0004\u0018\u00010+J\b\u00109\u001a\u0004\u0018\u00010+J\u0006\u0010:\u001a\u00020\u0017J\b\u0010;\u001a\u0004\u0018\u00010+J\u0006\u0010<\u001a\u00020\u0002J\u0006\u0010=\u001a\u00020\u0007J\u0006\u0010>\u001a\u00020\u0017J\u0006\u0010?\u001a\u00020\u0017J\u0006\u0010@\u001a\u00020\u0017J\u0006\u0010A\u001a\u00020\u0017J\u0006\u0010B\u001a\u00020\u0007J\u0006\u0010C\u001a\u00020\u0007J\b\u0010D\u001a\u00020\u0007H\u0016J\b\u0010E\u001a\u00020\u0007H\u0016J\b\u0010F\u001a\u00020\u0007H\u0016R\u0018\u0010(\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010)\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0016\u0010K\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010JR\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020+0L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010MR\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010PR\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020!0R8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010SR\u001f\u0010Y\u001a\b\u0012\u0004\u0012\u00020!0U8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010V\u001a\u0004\bW\u0010XR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00020R8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010SR\u001f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00020U8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010V\u001a\u0004\b[\u0010XR\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00170R8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010SR\u001f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00170U8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010V\u001a\u0004\b^\u0010XR\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001b0R8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010SR\u001f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u001b0U8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\ba\u0010XR\u001c\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001e0R8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010SR\u001f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u001e0U8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010V\u001a\u0004\bd\u0010XR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010fR\u0016\u0010h\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010JR\u0016\u0010i\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010JR\u0016\u0010j\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010JR\u0016\u0010k\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010JR\u0016\u0010n\u001a\u00020l8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010mR\u0016\u0010q\u001a\u00020o8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010pR\u0016\u0010u\u001a\u00020r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010t¨\u0006y"}, d2 = {"Lcom/huami/sky/ui/play/control/PlaybackManager;", "Lcom/huami/sky/ui/play/control/IPlayback$ICallback;", "", "e", GoogleApiAvailabilityLight.a, "Lcom/huami/sky/ui/play/control/IPlayback;", "playback", "", "m", SOAP.XMLNS, "r", "leftTime", "f", "g", "executeTime", "c", "v", "o", GoogleApiAvailabilityLight.b, "record", "t", "Lcom/huami/sky/lib/constant/MusicPauseFrom;", "from", "", "notStartPlay", com.google.android.exoplayer2.text.ttml.b.r, "u", "Lcom/huami/sky/lib/entity/MusicPlayRecord;", "musicPlayRecord", "i", "Lcom/huami/sky/ui/bean/SkyUserAction;", "userAction", "l", "Lcom/huami/sky/service/PlayState;", "playState", hl.k, "playAction", z.j, "isLiked", "h", "playback1", "playback2", "createPlayback", "Lcom/huami/sky/ui/bean/MusicInfo;", "musicInfo", "updateMusicList", "play", "pause", "pauseFromPlayNextMusic", Command.STOP, "restart", "isPlaying", "getPlayState", "updatePlayState", "", "getPlayingMusicId", "getFirstPlayingMusic", "getSecondPlayingMusic", "getCurrentMusicLiked", "getCurrentAnimMusic", "getCurrentAnimPosition", "updateMusicLike", "musicListNotEmpty", "hasNotPlayEndMusic", "hasPlayableMusic", "hasNextMusic", "playNextMusic", "clearData", "onPlayStart", "onPlayEnd", "onPlayError", "a", "Lcom/huami/sky/ui/play/control/IPlayback;", "b", "Z", "shouldVolumeFadeIn", "", "Ljava/util/List;", "musicList", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "playbackMainScope", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_playStateChangeFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "getPlayStateChangeFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "playStateChangeFlow", "_playActionCallbackFlow", "getPlayActionCallbackFlow", "playActionCallbackFlow", "_likeChangeFlow", "getLikeChangeFlow", "likeChangeFlow", "_musicClipRecordChangeFlow", "getMusicClipRecordChangeFlow", "musicClipRecordChangeFlow", "_userActionChangeFlow", "getUserActionChangeFlow", "userActionChangeFlow", "Lcom/huami/sky/service/PlayState;", DTransferConstants.SEARCH_KEY, "playRecordStartPause", "alreadyExecute", "requestNextMusicExecute", "playNextAnimExecute", "Lcom/huami/sky/ui/play/SkyPlaybackParam;", "Lcom/huami/sky/ui/play/SkyPlaybackParam;", "playbackParam", "Landroid/os/Handler;", "Landroid/os/Handler;", "mainHandler", "Ljava/lang/Runnable;", "w", "Ljava/lang/Runnable;", "updateProgressRunnable", "<init>", "()V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class PlaybackManager implements IPlayback.ICallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long x = 1000;

    @NotNull
    private static final String y = "PlaybackManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private IPlayback playback1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private IPlayback playback2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean shouldVolumeFadeIn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private List<MusicInfo> musicList = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private CoroutineScope playbackMainScope = CoroutineScopeKt.MainScope();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<PlayState> _playStateChangeFlow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final SharedFlow<PlayState> playStateChangeFlow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<Integer> _playActionCallbackFlow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final SharedFlow<Integer> playActionCallbackFlow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<Boolean> _likeChangeFlow;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final SharedFlow<Boolean> likeChangeFlow;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<MusicPlayRecord> _musicClipRecordChangeFlow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final SharedFlow<MusicPlayRecord> musicClipRecordChangeFlow;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<SkyUserAction> _userActionChangeFlow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final SharedFlow<SkyUserAction> userActionChangeFlow;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private PlayState playState;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean playRecordStartPause;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean alreadyExecute;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean requestNextMusicExecute;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean playNextAnimExecute;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private SkyPlaybackParam playbackParam;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final Handler mainHandler;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private Runnable updateProgressRunnable;

    /* JADX INFO: renamed from: com.huami.sky.ui.play.control.PlaybackManager$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.control.PlaybackManager$2", f = "PlaybackManager.kt", i = {}, l = {761}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.sky.ui.play.control.PlaybackManager$2$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SkyPlaybackParam a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SkyPlaybackParam skyPlaybackParam) {
                super(0);
                this.a = skyPlaybackParam;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "播放控制参数接口返回：" + this.a.getRequestNextMusicTime() + "======";
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PlaybackManager.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<SkyPlaybackParam> playbackParamFlow = PlaybackParamManager.INSTANCE.getInstance().getPlaybackParamFlow();
                final PlaybackManager playbackManager = PlaybackManager.this;
                FlowCollector<SkyPlaybackParam> flowCollector = new FlowCollector<SkyPlaybackParam>() { // from class: com.huami.sky.ui.play.control.PlaybackManager$2$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(SkyPlaybackParam skyPlaybackParam, @NotNull Continuation<? super Unit> continuation) {
                        SkyPlaybackParam skyPlaybackParam2 = skyPlaybackParam;
                        HMLog.info("PlaybackManager", new PlaybackManager.AnonymousClass2.a(skyPlaybackParam2));
                        playbackManager.playbackParam = skyPlaybackParam2;
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (playbackParamFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/sky/ui/play/control/PlaybackManager$Companion;", "", "Lcom/huami/sky/ui/play/control/PlaybackManager;", "getInstance", "", "PROGRESS_UPDATE_INTERVAL", "J", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlaybackManager getInstance() {
            return a.a.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/huami/sky/ui/play/control/PlaybackManager$a", "", "Lcom/huami/sky/ui/play/control/PlaybackManager;", "b", "Lcom/huami/sky/ui/play/control/PlaybackManager;", "a", "()Lcom/huami/sky/ui/play/control/PlaybackManager;", DefaultSettingsSpiCall.n, "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final PlaybackManager instance = new PlaybackManager();

        private a() {
        }

        @NotNull
        public final PlaybackManager a() {
            return instance;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, int i3) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "当前播放动画位置time计算: " + this.a + ", " + this.b + ", " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放器，正在播放的音频计数：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放器111，更新进度======播放下一个音乐";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放器111，更新进度======列表中是否还有可播放的音乐: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放器111，更新进度======下一个动画准备切换";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, int i2, int i3) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放下一首歌，是否有下一首音乐: " + (this.a + this.b) + "，" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.control.PlaybackManager$onLikedChange$1", f = "PlaybackManager.kt", i = {}, l = {743}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PlaybackManager.this.new h(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = PlaybackManager.this._likeChangeFlow;
                Boolean boolBoxBoolean = Boxing.boxBoolean(this.c);
                this.a = 1;
                if (mutableSharedFlow.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.control.PlaybackManager$onMusicClipRecordChange$1", f = "PlaybackManager.kt", i = {}, l = {719}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MusicPlayRecord c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(MusicPlayRecord musicPlayRecord, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = musicPlayRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PlaybackManager.this.new i(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = PlaybackManager.this._musicClipRecordChangeFlow;
                MusicPlayRecord musicPlayRecord = this.c;
                this.a = 1;
                if (mutableSharedFlow.emit(musicPlayRecord, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.control.PlaybackManager$onPlayActionCallback$1", f = "PlaybackManager.kt", i = {}, l = {737}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i, Continuation<? super j> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PlaybackManager.this.new j(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = PlaybackManager.this._playActionCallbackFlow;
                Integer numBoxInt = Boxing.boxInt(this.c);
                this.a = 1;
                if (mutableSharedFlow.emit(numBoxInt, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放器：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.control.PlaybackManager$onPlayStateChange$1", f = "PlaybackManager.kt", i = {}, l = {731}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PlayState c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(PlayState playState, Continuation<? super l> continuation) {
            super(2, continuation);
            this.c = playState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PlaybackManager.this.new l(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = PlaybackManager.this._playStateChangeFlow;
                PlayState playState = this.c;
                this.a = 1;
                if (mutableSharedFlow.emit(playState, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.control.PlaybackManager$onUserActionChange$1", f = "PlaybackManager.kt", i = {}, l = {725}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SkyUserAction c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(SkyUserAction skyUserAction, Continuation<? super m> continuation) {
            super(2, continuation);
            this.c = skyUserAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PlaybackManager.this.new m(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = PlaybackManager.this._userActionChangeFlow;
                SkyUserAction skyUserAction = this.c;
                this.a = 1;
                if (mutableSharedFlow.emit(skyUserAction, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ MusicInfo a;
        public final /* synthetic */ PlaybackManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(MusicInfo musicInfo, PlaybackManager playbackManager) {
            super(0);
            this.a = musicInfo;
            this.b = playbackManager;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放器222，播放下一首歌：" + this.a.getMusicUrl() + ", " + this.b.musicList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "更新了喜欢: " + PlaybackManager.this.musicList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "首次播放开启计时";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放器222，更新了播放列表： " + PlaybackManager.this.musicList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "更新了列表播放状态： " + PlaybackManager.this.musicList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "切歌时更新正在播放的音乐为播放完成：" + PlaybackManager.this.musicList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ IPlayback b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(int i, IPlayback iPlayback) {
            super(0);
            this.a = i;
            this.b = iPlayback;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放器111，更新进度======" + this.a + ", " + (this.b.getDuration() - this.b.getCurrentPosition()) + ", " + this.b.getDuration() + ", " + this.b.getCurrentPosition();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "更新用户行为播放记录====" + this.a;
        }
    }

    public PlaybackManager() {
        MutableSharedFlow<PlayState> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._playStateChangeFlow = mutableSharedFlowMutableSharedFlow$default;
        this.playStateChangeFlow = mutableSharedFlowMutableSharedFlow$default;
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._playActionCallbackFlow = mutableSharedFlowMutableSharedFlow$default2;
        this.playActionCallbackFlow = mutableSharedFlowMutableSharedFlow$default2;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._likeChangeFlow = mutableSharedFlowMutableSharedFlow$default3;
        this.likeChangeFlow = mutableSharedFlowMutableSharedFlow$default3;
        MutableSharedFlow<MusicPlayRecord> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._musicClipRecordChangeFlow = mutableSharedFlowMutableSharedFlow$default4;
        this.musicClipRecordChangeFlow = mutableSharedFlowMutableSharedFlow$default4;
        MutableSharedFlow<SkyUserAction> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._userActionChangeFlow = mutableSharedFlowMutableSharedFlow$default5;
        this.userActionChangeFlow = mutableSharedFlowMutableSharedFlow$default5;
        this.playState = PlayState.IDLE;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.updateProgressRunnable = new Runnable() { // from class: e16
            @Override // java.lang.Runnable
            public final void run() {
                PlaybackManager.b(this.a);
            }
        };
        kotlinx.coroutines.e.f(this.playbackMainScope, null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(PlaybackManager playbackManager) {
        playbackManager.s();
    }

    private final int c(int executeTime) {
        int i2 = executeTime - 2;
        if (i2 > 0) {
            return i2;
        }
        return 1;
    }

    private final int d() {
        MusicInfo musicInfoPrevious;
        List<MusicInfo> list = this.musicList;
        ListIterator<MusicInfo> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            musicInfoPrevious = listIterator.previous();
            if (musicInfoPrevious.getPlayStatus() == 2) {
                return CollectionsKt___CollectionsKt.lastIndexOf((List<? extends Object>) ((List) list), (Object) musicInfoPrevious);
            }
        }
        musicInfoPrevious = null;
        return CollectionsKt___CollectionsKt.lastIndexOf((List<? extends Object>) ((List) list), (Object) musicInfoPrevious);
    }

    private final int e() {
        IPlayback iPlayback = this.playback1;
        int i2 = 0;
        int i3 = (iPlayback != null && iPlayback.isPlayerPlaying()) ? 1 : 0;
        IPlayback iPlayback2 = this.playback2;
        if (iPlayback2 != null && iPlayback2.isPlayerPlaying()) {
            i2 = 1;
        }
        int i4 = i3 + i2;
        HMLog.info(y, new c(i4));
        return i4;
    }

    private final void f(IPlayback playback, int leftTime) {
        SkyPlaybackParam skyPlaybackParam = this.playbackParam;
        Objects.requireNonNull(skyPlaybackParam);
        int size = skyPlaybackParam.getVolumeFadeInOut().size();
        boolean z = false;
        if ((c(size) <= leftTime && leftTime <= size) && !this.alreadyExecute) {
            HMLog.info(y, d.a);
            if (Intrinsics.areEqual(playback, this.playback1)) {
                m(this.playback2);
            } else {
                m(this.playback1);
            }
            this.alreadyExecute = true;
        }
        SkyPlaybackParam skyPlaybackParam2 = this.playbackParam;
        Objects.requireNonNull(skyPlaybackParam2);
        int requestNextMusicTime = skyPlaybackParam2.getRequestNextMusicTime();
        if (c(requestNextMusicTime) <= leftTime && leftTime <= requestNextMusicTime) {
            z = true;
        }
        if (!z || this.requestNextMusicExecute) {
            return;
        }
        boolean zHasPlayableMusic = hasPlayableMusic();
        HMLog.info(y, new e(zHasPlayableMusic));
        if (!zHasPlayableMusic) {
            j(25);
        }
        this.requestNextMusicExecute = true;
    }

    private final void g(int leftTime) {
        SkyPlaybackParam skyPlaybackParam = this.playbackParam;
        Objects.requireNonNull(skyPlaybackParam);
        int playNextMusicAnimTime = skyPlaybackParam.getPlayNextMusicAnimTime();
        boolean z = false;
        if (c(playNextMusicAnimTime) <= leftTime && leftTime <= playNextMusicAnimTime) {
            z = true;
        }
        if (!z || this.playNextAnimExecute) {
            return;
        }
        HMLog.info(y, f.a);
        j(5);
        this.playNextAnimExecute = true;
    }

    private final void h(boolean isLiked) {
        kotlinx.coroutines.e.f(this.playbackMainScope, null, null, new h(isLiked, null), 3, null);
    }

    private final void i(MusicPlayRecord musicPlayRecord) {
        kotlinx.coroutines.e.f(this.playbackMainScope, null, null, new i(musicPlayRecord, null), 3, null);
    }

    private final void j(int playAction) {
        kotlinx.coroutines.e.f(this.playbackMainScope, null, null, new j(playAction, null), 3, null);
    }

    private final void k(PlayState playState) {
        kotlinx.coroutines.e.f(this.playbackMainScope, null, null, new l(playState, null), 3, null);
    }

    private final void l(SkyUserAction userAction) {
        kotlinx.coroutines.e.f(this.playbackMainScope, null, null, new m(userAction, null), 3, null);
    }

    private final void m(IPlayback playback) {
        MusicInfo musicInfo;
        if (!this.musicList.isEmpty()) {
            int iD = d();
            int i2 = e() == 0 ? iD + 1 : iD + 2;
            if (i2 > this.musicList.size() - 1) {
                List<MusicInfo> list = this.musicList;
                musicInfo = list.get(list.size() - 1);
                updateMusicList(new MusicInfo(musicInfo.getClipId(), musicInfo.getMusicUrl(), musicInfo.getAnimUrl(), false, 0, 0, musicInfo.getTags(), 56, null));
            } else {
                musicInfo = this.musicList.get(i2);
            }
            HMLog.info(y, new n(musicInfo, this));
            SkyPlayEventKt.recordPlayLoaded(musicInfo.getClipId());
            if (playback == null) {
                return;
            }
            playback.play(musicInfo.getMusicUrl());
        }
    }

    private final void n() {
        int iD = d() + 1;
        int size = this.musicList.size() - 1;
        if (iD >= 0 && iD <= size) {
            this.musicList.get(iD).setPlayStatus(2);
            if (iD == size) {
                this.musicList.get(iD).setPlayStatus(0);
            }
        }
        HMLog.info(y, new r());
    }

    private final void o() {
        int iD = d();
        int size = this.musicList.size();
        int iE = iD + e();
        int i2 = -1;
        if (-1 <= iE) {
            while (true) {
                int i3 = i2 + 1;
                boolean z = false;
                if (i2 >= 0 && i2 < size) {
                    z = true;
                }
                if (z) {
                    this.musicList.get(i2).setPlayStatus(2);
                }
                if (i2 == iE) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        HMLog.info(y, new s());
    }

    private final void p(int record, MusicPauseFrom from, boolean notStartPlay) {
        MusicInfo secondPlayingMusic;
        String clipId;
        String clipId2;
        this.playRecordStartPause = record != 6;
        MusicPlayRecordEnum musicPlayRecordEnum = record == 6 ? MusicPlayRecordEnum.ENDPAUSE : MusicPlayRecordEnum.STARTPAUSE;
        MusicInfo firstPlayingMusic = getFirstPlayingMusic();
        if (firstPlayingMusic != null && (clipId2 = firstPlayingMusic.getClipId()) != null) {
            i(new MusicPlayRecord(clipId2, musicPlayRecordEnum, 0L, from));
        }
        if (e() < 2 || !notStartPlay || (secondPlayingMusic = getSecondPlayingMusic()) == null || (clipId = secondPlayingMusic.getClipId()) == null) {
            return;
        }
        i(new MusicPlayRecord(clipId, musicPlayRecordEnum, 0L, from));
    }

    public static /* synthetic */ void pause$default(PlaybackManager playbackManager, MusicPauseFrom musicPauseFrom, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            musicPauseFrom = MusicPauseFrom.OTHER;
        }
        playbackManager.pause(musicPauseFrom);
    }

    public static /* synthetic */ void q(PlaybackManager playbackManager, int i2, MusicPauseFrom musicPauseFrom, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            musicPauseFrom = null;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        playbackManager.p(i2, musicPauseFrom, z);
    }

    private final void r(IPlayback playback) {
        if (this.playState != PlayState.PLAYING) {
            return;
        }
        v(playback);
        int leftTime = playback.getLeftTime();
        HMLog.info(y, new t(leftTime, playback));
        f(playback, leftTime);
        g(leftTime);
    }

    private final void s() {
        IPlayback iPlayback = this.playback1;
        if (iPlayback != null) {
            r(iPlayback);
        }
        IPlayback iPlayback2 = this.playback2;
        if (iPlayback2 != null) {
            r(iPlayback2);
        }
        this.mainHandler.postDelayed(this.updateProgressRunnable, 1000L);
    }

    private final void t(int record) {
        MusicInfo firstPlayingMusic;
        String clipId;
        MusicInfo secondPlayingMusic;
        boolean z;
        MusicInfo musicInfoPrevious;
        String clipId2;
        HMLog.info(y, new u(record));
        String str = "";
        if (record == 3) {
            i(new MusicPlayRecord((e() < 2 ? !((firstPlayingMusic = getFirstPlayingMusic()) == null || (clipId = firstPlayingMusic.getClipId()) == null) : !((secondPlayingMusic = getSecondPlayingMusic()) == null || (clipId = secondPlayingMusic.getClipId()) == null)) ? clipId : "", MusicPlayRecordEnum.START, 0L, null, 8, null));
            return;
        }
        if (record != 5) {
            return;
        }
        MusicPlayRecordEnum musicPlayRecordEnum = MusicPlayRecordEnum.END;
        List<MusicInfo> list = this.musicList;
        ListIterator<MusicInfo> listIterator = list.listIterator(list.size());
        do {
            z = false;
            if (!listIterator.hasPrevious()) {
                musicInfoPrevious = null;
                break;
            }
            musicInfoPrevious = listIterator.previous();
        } while (!(musicInfoPrevious.getPlayStatus() == 2));
        MusicInfo musicInfo = musicInfoPrevious;
        if (musicInfo != null && (clipId2 = musicInfo.getClipId()) != null) {
            str = clipId2;
        }
        if (e() >= 2) {
            int iD = d();
            int size = this.musicList.size() - 1;
            int i2 = iD - 1;
            if (i2 >= 0 && i2 <= size) {
                z = true;
            }
            if (z) {
                i(new MusicPlayRecord(this.musicList.get(i2).getClipId(), musicPlayRecordEnum, 0L, null, 8, null));
            }
        }
        i(new MusicPlayRecord(str, musicPlayRecordEnum, 0L, null, 8, null));
    }

    private final void u() {
        MusicInfo secondPlayingMusic;
        if (e() >= 2 && (secondPlayingMusic = getSecondPlayingMusic()) != null) {
            l(new SkyUserAction(secondPlayingMusic.getClipId(), 2));
        }
        MusicInfo firstPlayingMusic = getFirstPlayingMusic();
        if (firstPlayingMusic == null) {
            return;
        }
        l(new SkyUserAction(firstPlayingMusic.getClipId(), 2));
    }

    private final void v(IPlayback playback) {
        SkyPlaybackParam skyPlaybackParam = this.playbackParam;
        Objects.requireNonNull(skyPlaybackParam);
        List<Float> volumeFadeInOut = skyPlaybackParam.getVolumeFadeInOut();
        int size = volumeFadeInOut.size();
        int leftTime = playback.getLeftTime();
        boolean z = false;
        if (1 <= leftTime && leftTime <= size) {
            if (leftTime > 0) {
                this.shouldVolumeFadeIn = true;
            }
            playback.setVolume(volumeFadeInOut.get(leftTime - 1).floatValue());
        }
        int currentPositions = playback.getCurrentPositions();
        if (1 <= currentPositions && currentPositions <= size) {
            z = true;
        }
        if (z && this.shouldVolumeFadeIn) {
            playback.setVolume(volumeFadeInOut.get(currentPositions - 1).floatValue());
        }
        if (playback.getVolume() >= 1.0f) {
            playback.setVolume(1.0f);
        }
        if (playback.getVolume() <= 0.0f) {
            playback.setVolume(0.0f);
        }
    }

    public final void clearData() {
        IPlayback iPlayback = this.playback1;
        if (iPlayback != null) {
            iPlayback.release();
        }
        IPlayback iPlayback2 = this.playback2;
        if (iPlayback2 != null) {
            iPlayback2.release();
        }
        this.mainHandler.removeCallbacksAndMessages(null);
        PlayState playState = PlayState.IDLE;
        this.playState = playState;
        k(playState);
        h(false);
        this.musicList.clear();
        this.shouldVolumeFadeIn = false;
        this.playRecordStartPause = false;
        this.alreadyExecute = false;
        this.playNextAnimExecute = false;
        this.requestNextMusicExecute = false;
    }

    public final void createPlayback(@NotNull IPlayback playback1, @NotNull IPlayback playback2) {
        this.playback1 = playback1;
        this.playback2 = playback2;
        if (playback1 != null) {
            playback1.setCallback(this);
        }
        IPlayback iPlayback = this.playback2;
        if (iPlayback == null) {
            return;
        }
        iPlayback.setCallback(this);
    }

    @Nullable
    public final MusicInfo getCurrentAnimMusic() {
        IPlayback iPlayback = this.playback1;
        IPlayback iPlayback2 = this.playback2;
        if (iPlayback == null || iPlayback2 == null) {
            return null;
        }
        int durations = iPlayback.getDurations() - iPlayback.getCurrentPositions();
        int durations2 = iPlayback2.getDurations() - iPlayback2.getCurrentPositions();
        int iE = e();
        SkyPlaybackParam skyPlaybackParam = this.playbackParam;
        Objects.requireNonNull(skyPlaybackParam);
        int playNextMusicAnimTime = skyPlaybackParam.getPlayNextMusicAnimTime();
        return (iE != 2 || (durations > playNextMusicAnimTime && durations2 > playNextMusicAnimTime)) ? getFirstPlayingMusic() : getSecondPlayingMusic();
    }

    public final int getCurrentAnimPosition() {
        int currentPositions;
        int durations;
        IPlayback iPlayback = this.playback1;
        IPlayback iPlayback2 = this.playback2;
        if (iPlayback == null || iPlayback2 == null) {
            return 0;
        }
        if (iPlayback.getCurrentPositions() > 0) {
            currentPositions = iPlayback.getCurrentPositions();
            durations = iPlayback.getDurations() - iPlayback.getCurrentPositions();
        } else {
            currentPositions = 0;
            durations = 0;
        }
        int currentPositions2 = iPlayback2.getCurrentPositions() > 0 ? iPlayback2.getCurrentPositions() : 0;
        HMLog.info(y, new b(currentPositions, durations, currentPositions2));
        SkyPlaybackParam skyPlaybackParam = this.playbackParam;
        Objects.requireNonNull(skyPlaybackParam);
        int playNextMusicAnimTime = skyPlaybackParam.getPlayNextMusicAnimTime();
        if (durations == playNextMusicAnimTime) {
            return 0;
        }
        return durations < playNextMusicAnimTime ? currentPositions2 : currentPositions;
    }

    public final boolean getCurrentMusicLiked() {
        MusicInfo firstPlayingMusic = getFirstPlayingMusic();
        return firstPlayingMusic != null && firstPlayingMusic.isLiked();
    }

    @Nullable
    public final MusicInfo getFirstPlayingMusic() {
        Object obj = null;
        if (e() <= 0) {
            return null;
        }
        for (Object obj2 : this.musicList) {
            if (((MusicInfo) obj2).getPlayStatus() != 2) {
                obj = obj2;
                break;
            }
        }
        return (MusicInfo) obj;
    }

    @NotNull
    public final SharedFlow<Boolean> getLikeChangeFlow() {
        return this.likeChangeFlow;
    }

    @NotNull
    public final SharedFlow<MusicPlayRecord> getMusicClipRecordChangeFlow() {
        return this.musicClipRecordChangeFlow;
    }

    @NotNull
    public final SharedFlow<Integer> getPlayActionCallbackFlow() {
        return this.playActionCallbackFlow;
    }

    @NotNull
    public final PlayState getPlayState() {
        return this.playState;
    }

    @NotNull
    public final SharedFlow<PlayState> getPlayStateChangeFlow() {
        return this.playStateChangeFlow;
    }

    @NotNull
    public final String getPlayingMusicId() {
        StringBuilder sb = new StringBuilder();
        MusicInfo firstPlayingMusic = getFirstPlayingMusic();
        if (firstPlayingMusic != null) {
            sb.append(firstPlayingMusic.getClipId());
        }
        MusicInfo secondPlayingMusic = getSecondPlayingMusic();
        if (secondPlayingMusic != null) {
            sb.append("," + secondPlayingMusic.getClipId());
        }
        return sb.toString();
    }

    @Nullable
    public final MusicInfo getSecondPlayingMusic() {
        if (e() < 2) {
            return null;
        }
        Iterator<MusicInfo> it2 = this.musicList.iterator();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            if (it2.next().getPlayStatus() != 2) {
                break;
            }
            i2++;
        }
        int size = this.musicList.size() - 1;
        if (i2 >= 0 && i2 < size) {
            z = true;
        }
        if (z) {
            return this.musicList.get(i2 + 1);
        }
        if (i2 == size) {
            return this.musicList.get(i2);
        }
        return null;
    }

    @NotNull
    public final SharedFlow<SkyUserAction> getUserActionChangeFlow() {
        return this.userActionChangeFlow;
    }

    public final boolean hasNextMusic() {
        if (!(!this.musicList.isEmpty())) {
            return false;
        }
        int iD = d();
        int size = this.musicList.size() - 1;
        int iE = e();
        HMLog.info(y, new g(iD, iE, size));
        return iD + iE < size;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public final boolean hasNotPlayEndMusic() {
        for (Object obj : this.musicList) {
            if (((MusicInfo) obj).getPlayStatus() == 0) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final boolean hasPlayableMusic() {
        int i2;
        List<MusicInfo> list = this.musicList;
        if ((list instanceof Collection) && list.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<T> it2 = list.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if ((((MusicInfo) it2.next()).getPlayStatus() == 0) && (i2 = i2 + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i2 > e();
    }

    public final boolean isPlaying() {
        return this.playState == PlayState.PLAYING;
    }

    public final boolean musicListNotEmpty() {
        return !this.musicList.isEmpty();
    }

    @Override // com.huami.sky.ui.play.control.IPlayback.ICallback
    public void onPlayEnd() {
        n();
        h(false);
        t(5);
        j(8);
        this.alreadyExecute = false;
        this.playNextAnimExecute = false;
        this.requestNextMusicExecute = false;
    }

    @Override // com.huami.sky.ui.play.control.IPlayback.ICallback
    public void onPlayError() {
        boolean zIsNetworkConnect = NetUtil.INSTANCE.networkInfo().isNetworkConnect();
        HMLog.info(y, new k(zIsNetworkConnect));
        if (zIsNetworkConnect) {
            IPlayback iPlayback = this.playback1;
            boolean zIsPlayerPlaying = iPlayback == null ? false : iPlayback.isPlayerPlaying();
            IPlayback iPlayback2 = this.playback2;
            boolean zIsPlayerPlaying2 = iPlayback2 == null ? false : iPlayback2.isPlayerPlaying();
            if (zIsPlayerPlaying && !zIsPlayerPlaying2) {
                IPlayback iPlayback3 = this.playback2;
                if (iPlayback3 != null) {
                    iPlayback3.release();
                }
                m(this.playback2);
                return;
            }
            if (!zIsPlayerPlaying && zIsPlayerPlaying2) {
                IPlayback iPlayback4 = this.playback1;
                if (iPlayback4 != null) {
                    iPlayback4.release();
                }
                m(this.playback1);
                return;
            }
        }
        IPlayback iPlayback5 = this.playback1;
        if (iPlayback5 != null) {
            iPlayback5.release();
        }
        IPlayback iPlayback6 = this.playback2;
        if (iPlayback6 != null) {
            iPlayback6.release();
        }
        this.playState = PlayState.ERROR;
        SkyPlayEventKt.recordPlayError("2");
        k(this.playState);
        this.alreadyExecute = false;
        this.playNextAnimExecute = false;
        this.requestNextMusicExecute = false;
    }

    @Override // com.huami.sky.ui.play.control.IPlayback.ICallback
    public void onPlayStart() {
        PlayState playState = this.playState;
        PlayState playState2 = PlayState.PLAYING;
        if (playState != playState2) {
            this.playState = playState2;
            k(playState2);
        }
        IPlayback iPlayback = this.playback1;
        IPlayback iPlayback2 = this.playback2;
        if (iPlayback != null && iPlayback2 != null) {
            int leftTime = iPlayback.getLeftTime();
            int leftTime2 = iPlayback2.getLeftTime();
            if ((iPlayback.getDurations() == leftTime && leftTime > 0) || (iPlayback2.getDurations() == leftTime2 && leftTime2 > 0)) {
                t(3);
                if (this.playRecordStartPause) {
                    q(this, 6, null, false, 2, null);
                }
            } else if (this.playRecordStartPause) {
                q(this, 6, null, false, 6, null);
            }
        }
        MusicInfo secondPlayingMusic = getSecondPlayingMusic();
        String clipId = null;
        String clipId2 = secondPlayingMusic == null ? null : secondPlayingMusic.getClipId();
        if (clipId2 == null) {
            MusicInfo firstPlayingMusic = getFirstPlayingMusic();
            if (firstPlayingMusic != null) {
                clipId = firstPlayingMusic.getClipId();
            }
        } else {
            clipId = clipId2;
        }
        if (clipId == null) {
            return;
        }
        SkyPlayEventKt.recordPlayStarted(clipId);
    }

    public final void pause(@NotNull MusicPauseFrom from) {
        IPlayback iPlayback = this.playback1;
        if (iPlayback != null) {
            iPlayback.pause();
        }
        IPlayback iPlayback2 = this.playback2;
        if (iPlayback2 != null) {
            iPlayback2.pause();
        }
        PlayState playState = PlayState.PAUSE;
        this.playState = playState;
        k(playState);
        q(this, 4, from, false, 4, null);
    }

    public final void pauseFromPlayNextMusic() {
        IPlayback iPlayback = this.playback1;
        if (iPlayback != null) {
            iPlayback.pause();
        }
        IPlayback iPlayback2 = this.playback2;
        if (iPlayback2 == null) {
            return;
        }
        iPlayback2.pause();
    }

    public final void play() {
        Object next;
        IPlayback iPlayback = this.playback1;
        IPlayback iPlayback2 = this.playback2;
        if (iPlayback == null || iPlayback2 == null || !(!this.musicList.isEmpty())) {
            return;
        }
        if (this.playState == PlayState.PAUSE) {
            restart();
            return;
        }
        Iterator<T> it2 = this.musicList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(((MusicInfo) next).getPlayStatus() != 2));
        MusicInfo musicInfo = (MusicInfo) next;
        if (musicInfo == null) {
            return;
        }
        iPlayback.release();
        iPlayback2.release();
        PlayState playState = PlayState.PLAY;
        this.playState = playState;
        k(playState);
        SkyPlayEventKt.recordPlayLoaded(musicInfo.getClipId());
        iPlayback.play(musicInfo.getMusicUrl());
    }

    public final void playNextMusic() {
        this.shouldVolumeFadeIn = false;
        this.playRecordStartPause = false;
        this.alreadyExecute = false;
        this.requestNextMusicExecute = false;
        this.playNextAnimExecute = false;
        u();
        o();
        t(5);
        h(false);
        j(7);
        IPlayback iPlayback = this.playback1;
        if (iPlayback != null) {
            iPlayback.release();
        }
        IPlayback iPlayback2 = this.playback2;
        if (iPlayback2 != null) {
            iPlayback2.release();
        }
        IPlayback iPlayback3 = this.playback1;
        if (iPlayback3 == null) {
            return;
        }
        PlayState playState = PlayState.PLAY;
        this.playState = playState;
        k(playState);
        m(iPlayback3);
    }

    public final void restart() {
        PlayState playState = PlayState.PLAY;
        this.playState = playState;
        k(playState);
        IPlayback iPlayback = this.playback1;
        boolean z = false;
        if (!(iPlayback != null && iPlayback.playerRestartEnable())) {
            IPlayback iPlayback2 = this.playback2;
            if (iPlayback2 != null && iPlayback2.playerRestartEnable()) {
                z = true;
            }
            if (!z) {
                play();
                return;
            }
        }
        IPlayback iPlayback3 = this.playback1;
        if (iPlayback3 != null) {
            iPlayback3.restart();
        }
        IPlayback iPlayback4 = this.playback2;
        if (iPlayback4 == null) {
            return;
        }
        iPlayback4.restart();
    }

    public final void stop(@NotNull MusicPauseFrom from) {
        q(this, 4, from, false, 4, null);
        clearData();
    }

    public final void updateMusicLike() {
        MusicInfo firstPlayingMusic = getFirstPlayingMusic();
        if (firstPlayingMusic == null) {
            return;
        }
        int iIndexOf = this.musicList.indexOf(firstPlayingMusic);
        if (iIndexOf >= 0) {
            firstPlayingMusic.setLiked(!firstPlayingMusic.isLiked());
            this.musicList.set(iIndexOf, firstPlayingMusic);
            h(firstPlayingMusic.isLiked());
            l(new SkyUserAction(firstPlayingMusic.getClipId(), firstPlayingMusic.isLiked() ? 1 : 0));
        }
        HMLog.info(y, new o());
    }

    public final void updateMusicList(@NotNull MusicInfo musicInfo) {
        if (!musicListNotEmpty()) {
            HMLog.info(y, p.a);
            s();
        }
        List<MusicInfo> list = this.musicList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((MusicInfo) obj).getPlayStatus() != 2) {
                arrayList.add(obj);
            }
        }
        List<MusicInfo> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        this.musicList = mutableList;
        mutableList.add(musicInfo);
        HMLog.info(y, new q());
    }

    public final void updatePlayState(@NotNull PlayState playState) {
        this.playState = playState;
        k(playState);
    }
}
