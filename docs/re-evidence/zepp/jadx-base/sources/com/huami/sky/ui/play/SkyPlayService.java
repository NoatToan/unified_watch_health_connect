package com.huami.sky.ui.play;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media.MediaBrowserServiceCompat;
import com.amap.api.mapcore.util.hl;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.sky.lib.api.DeviceDataApi;
import com.huami.sky.lib.assist.ISkyDeviceStatusAssistant;
import com.huami.sky.lib.assist.SkyDeviceStatus;
import com.huami.sky.lib.constant.MusicPauseFrom;
import com.huami.sky.lib.entity.MusicPlayRecord;
import com.huami.sky.lib.repo.DeviceDataRepository;
import com.huami.sky.service.PlayState;
import com.huami.sky.ui.R;
import com.huami.sky.ui.analytic.SkyPlayEventKt;
import com.huami.sky.ui.bean.MusicInfo;
import com.huami.sky.ui.bean.SkyUserAction;
import com.huami.sky.ui.koin.SkyServiceKoinScopeKt;
import com.huami.sky.ui.koin.SkyServiceScopeName;
import com.huami.sky.ui.play.control.IPlayback;
import com.huami.sky.ui.play.control.PlaybackManager;
import com.huami.sky.ui.play.notification.SkyPlayNotification;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.loc.z;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ë\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\b*\u0003gjs\b\u0000\u0018\u0000 x2\u00020\u0001:\u0002xyB\u0007¢\u0006\u0004\bv\u0010wJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0002J\u0012\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016J\"\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010&H\u0016J$\u0010/\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\f2\u0012\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0+H\u0016J\"\u00102\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u0011H\u0016J\b\u00103\u001a\u00020\u0002H\u0016J\b\u00104\u001a\u00020\u0002H\u0016R\u001d\u0010:\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010<\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b;\u00109R\u001d\u0010@\u001a\u00020=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u00107\u001a\u0004\b>\u0010?R\u001d\u0010D\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\bB\u0010CR\u001d\u0010I\u001a\u00020E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010VR\u0018\u0010Z\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010YR\u001d\u0010]\u001a\u00020[8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b6\u0010\\R\u001d\u0010`\u001a\u00020^8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\bK\u0010_R\u001d\u0010c\u001a\u00020a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\bF\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010eR\u0016\u0010i\u001a\u00020g8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010hR\u0016\u0010l\u001a\u00020j8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010kR\u001d\u0010o\u001a\u00020m8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\bO\u0010nR\u0016\u0010q\u001a\u00020\f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010pR\u0016\u0010r\u001a\u00020\f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010pR\u0016\u0010u\u001a\u00020s8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010t¨\u0006z"}, d2 = {"Lcom/huami/sky/ui/play/SkyPlayService;", "Landroidx/media/MediaBrowserServiceCompat;", "", "o", "Lcom/huami/sky/service/PlayState;", "playState", "B", DTransferConstants.SEARCH_KEY, com.google.android.exoplayer2.text.ttml.b.r, "Landroid/os/Message;", "msg", GoogleApiAvailabilityLight.b, "", "clickEvent", "m", "t", "z", "", "playAction", SOAP.XMLNS, "v", "u", "w", "", "r", "c", "Lcom/huami/sky/ui/bean/MusicInfo;", "b", GoogleApiAvailabilityLight.a, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "y", "x", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "clientPackageName", "clientUid", "Landroid/os/Bundle;", "rootHints", "Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;", "onGetRoot", "parentId", "Landroidx/media/MediaBrowserServiceCompat$Result;", "", "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", "result", "onLoadChildren", DataCacher.j, "startId", "onStartCommand", "onCreate", "onDestroy", "Lcom/huami/sky/ui/play/control/IPlayback;", "a", "Lkotlin/Lazy;", z.j, "()Lcom/huami/sky/ui/play/control/IPlayback;", "playback1", hl.k, "playback2", "Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "l", "()Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "serviceHelper", "Lcom/huami/sky/ui/play/SkyPlayRecordManager;", "i", "()Lcom/huami/sky/ui/play/SkyPlayRecordManager;", "playRecordManager", "Lcom/huami/sky/ui/play/SkyPlayContinuousManager;", "e", "h", "()Lcom/huami/sky/ui/play/SkyPlayContinuousManager;", "playContinuousManager", "Lkotlinx/coroutines/CoroutineScope;", "f", "Lkotlinx/coroutines/CoroutineScope;", "serviceIOScope", "Landroid/support/v4/media/session/MediaSessionCompat;", "g", "Landroid/support/v4/media/session/MediaSessionCompat;", "mediaSession", "Lcom/huami/sky/ui/play/notification/SkyPlayNotification;", "Lcom/huami/sky/ui/play/notification/SkyPlayNotification;", "skyPlayNotification", "Landroid/media/AudioFocusRequest;", "Landroid/media/AudioFocusRequest;", "audioFocusRequest", "Landroid/media/AudioManager;", "Landroid/media/AudioManager;", "audioManager", "Lcom/huami/sky/ui/play/SkyPlayAudioFocusChange;", "()Lcom/huami/sky/ui/play/SkyPlayAudioFocusChange;", "audioFocusChangeListener", "Lcom/huami/sky/lib/repo/DeviceDataRepository;", "()Lcom/huami/sky/lib/repo/DeviceDataRepository;", "deviceDataRepository", "Lcom/huami/sky/lib/api/DeviceDataApi;", "()Lcom/huami/sky/lib/api/DeviceDataApi;", "deviceDataApi", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "deviceJob", "com/huami/sky/ui/play/SkyPlayService$playReceiver$1", "Lcom/huami/sky/ui/play/SkyPlayService$playReceiver$1;", "playReceiver", "com/huami/sky/ui/play/SkyPlayService$mainHandler$1", "Lcom/huami/sky/ui/play/SkyPlayService$mainHandler$1;", "mainHandler", "Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;", "()Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;", "deviceStatusAssist", "Ljava/lang/String;", "volumeChangeAction", TrainingWebConst.QueryParam.STREAM_TYPE, "com/huami/sky/ui/play/SkyPlayService$volumeChangeReceiver$1", "Lcom/huami/sky/ui/play/SkyPlayService$volumeChangeReceiver$1;", "volumeChangeReceiver", "<init>", "()V", "Companion", "SkyPlayBinder", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlayService extends MediaBrowserServiceCompat {
    private static final int A = 9;
    private static final int B = 7;
    private static final int C = 8;
    private static final int D = 10;
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 3;
    private static final int x = 4;
    private static final int y = 5;
    private static final int z = 6;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy playback1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy playback2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy serviceHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy playRecordManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy playContinuousManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope serviceIOScope;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private MediaSessionCompat mediaSession;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private SkyPlayNotification skyPlayNotification;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private AudioFocusRequest audioFocusRequest;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private AudioManager audioManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy audioFocusChangeListener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceDataRepository;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceDataApi;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private Job deviceJob;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final SkyPlayService$playReceiver$1 playReceiver;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final SkyPlayService$mainHandler$1 mainHandler;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStatusAssist;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final String volumeChangeAction;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final String streamType;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final SkyPlayService$volumeChangeReceiver$1 volumeChangeReceiver;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002R\u001d\u0010\u0012\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/sky/ui/play/SkyPlayService$SkyPlayBinder;", "Landroid/os/Binder;", "", "startPlay", "playOrPause", "", "isPlaying", "getCurrentMusicLiked", "", "getCurrentAnimPosition", "Lcom/huami/sky/ui/bean/MusicInfo;", "getCurrentAnimMusic", "updateMusicLike", "playNextMusic", "Lcom/huami/sky/ui/play/SkyPlayService;", "a", "Lkotlin/Lazy;", "()Lcom/huami/sky/ui/play/SkyPlayService;", "mService", "<init>", "(Lcom/huami/sky/ui/play/SkyPlayService;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public final class SkyPlayBinder extends Binder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Lazy mService;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/play/SkyPlayService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<SkyPlayService> {
            public final /* synthetic */ SkyPlayService a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SkyPlayService skyPlayService) {
                super(0);
                this.a = skyPlayService;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyPlayService invoke() {
                return this.a;
            }
        }

        public SkyPlayBinder() {
            this.mService = LazyKt__LazyJVMKt.lazy(new a(SkyPlayService.this));
        }

        private final SkyPlayService a() {
            return (SkyPlayService) this.mService.getValue();
        }

        @Nullable
        public final MusicInfo getCurrentAnimMusic() {
            return a().b();
        }

        public final int getCurrentAnimPosition() {
            return a().c();
        }

        public final boolean getCurrentMusicLiked() {
            return a().d();
        }

        public final boolean isPlaying() {
            return a().r();
        }

        public final void playNextMusic() {
            a().v();
        }

        public final void playOrPause() {
            a().w();
        }

        public final void startPlay() {
            a().z();
        }

        public final void updateMusicLike() {
            a().A();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayState.values().length];
            iArr[PlayState.PLAY.ordinal()] = 1;
            iArr[PlayState.PROGRESSING.ordinal()] = 2;
            iArr[PlayState.PAUSE.ordinal()] = 3;
            iArr[PlayState.PLAYING.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/play/SkyPlayAudioFocusChange;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SkyPlayAudioFocusChange> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SkyPlayAudioFocusChange invoke() {
            return new SkyPlayAudioFocusChange();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayService$initObserve$1", f = "SkyPlayService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ int b;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Nullable
        public final Object a(int i, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = SkyPlayService.this.new b(continuation);
            bVar.b = ((Number) obj).intValue();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return a(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SkyPlayService.this.s(this.b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/service/PlayState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayService$initObserve$2", f = "SkyPlayService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<PlayState, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull PlayState playState, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(playState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = SkyPlayService.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SkyPlayService.this.t((PlayState) this.b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayService$initObserve$3", f = "SkyPlayService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Nullable
        public final Object a(boolean z, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlayService.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obtainMessage(7, 10, 0).sendToTarget();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/lib/entity/MusicPlayRecord;", "record", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayService$initObserve$4", f = "SkyPlayService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<MusicPlayRecord, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull MusicPlayRecord musicPlayRecord, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(musicPlayRecord, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = SkyPlayService.this.new e(continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MusicPlayRecord musicPlayRecord = (MusicPlayRecord) this.b;
            SkyPlayService.this.l().updatePlayRecord(musicPlayRecord.getId(), musicPlayRecord.getStatus(), musicPlayRecord.getPauseType());
            SkyPlayService.this.l().uploadUserEvent();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/ui/bean/SkyUserAction;", "action", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayService$initObserve$5", f = "SkyPlayService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<SkyUserAction, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull SkyUserAction skyUserAction, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(skyUserAction, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = SkyPlayService.this.new f(continuation);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SkyUserAction skyUserAction = (SkyUserAction) this.b;
            SkyPlayService.this.l().updateUserAction(skyUserAction.getClipId(), skyUserAction.getUserAction());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/lib/assist/SkyDeviceStatus;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayService$initObserve$6", f = "SkyPlayService.kt", i = {0}, l = {312, TypedValues.AttributesType.TYPE_EASING}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    public static final class g extends SuspendLambda implements Function2<SkyDeviceStatus, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayService$initObserve$6$1", f = "SkyPlayService.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SkyPlayService b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SkyPlayService skyPlayService, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = skyPlayService;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DeviceDataRepository deviceDataRepositoryF = this.b.f();
                    this.a = 1;
                    if (deviceDataRepositoryF.receivedDeviceDataForUpload(this) == coroutine_suspended) {
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayService$initObserve$6$clipId$1", f = "SkyPlayService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
            public int a;

            public b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PlaybackManager companion = PlaybackManager.INSTANCE.getInstance();
                MusicInfo secondPlayingMusic = companion.getSecondPlayingMusic();
                String clipId = secondPlayingMusic == null ? null : secondPlayingMusic.getClipId();
                return clipId == null ? companion.getPlayingMusicId() : clipId;
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull SkyDeviceStatus skyDeviceStatus, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(skyDeviceStatus, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g gVar = SkyPlayService.this.new g(continuation);
            gVar.b = obj;
            return gVar;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0090 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            SkyDeviceStatus skyDeviceStatus;
            DeviceDataRepository deviceDataRepositoryF;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                skyDeviceStatus = (SkyDeviceStatus) this.b;
                if (skyDeviceStatus == SkyDeviceStatus.CONNECT_SUCCESS && PlaybackManager.INSTANCE.getInstance().isPlaying() && SkyPlayService.this.deviceJob == null) {
                    SkyPlayService skyPlayService = SkyPlayService.this;
                    skyPlayService.deviceJob = kotlinx.coroutines.e.f(skyPlayService.serviceIOScope, null, null, new a(SkyPlayService.this, null), 3, null);
                }
                if (PlaybackManager.INSTANCE.getInstance().getPlayState() != PlayState.IDLE) {
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    b bVar = new b(null);
                    this.b = skyDeviceStatus;
                    this.a = 1;
                    obj = BuildersKt.withContext(main, bVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    deviceDataRepositoryF = SkyPlayService.this.f();
                    this.b = null;
                    this.a = 2;
                    if (deviceDataRepositoryF.uploadDeviceStatus((String) obj, skyDeviceStatus, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                skyDeviceStatus = (SkyDeviceStatus) this.b;
                ResultKt.throwOnFailure(obj);
                deviceDataRepositoryF = SkyPlayService.this.f();
                this.b = null;
                this.a = 2;
                if (deviceDataRepositoryF.uploadDeviceStatus((String) obj, skyDeviceStatus, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayService$initObserve$7", f = "SkyPlayService.kt", i = {}, l = {336, SportDeviceUtils.SOURCE_PROVENCE}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ long b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayService$initObserve$7$1", f = "SkyPlayService.kt", i = {}, l = {AMapEngineUtils.ARROW_LINE_SHADOW_TEXTURE_ID}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SkyPlayService b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SkyPlayService skyPlayService, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = skyPlayService;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DeviceDataRepository deviceDataRepositoryF = this.b.f();
                    this.a = 1;
                    if (deviceDataRepositoryF.receivedDeviceDataForUpload(this) == coroutine_suspended) {
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayService$initObserve$7$clipId$1", f = "SkyPlayService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
            public int a;

            public b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PlaybackManager companion = PlaybackManager.INSTANCE.getInstance();
                MusicInfo secondPlayingMusic = companion.getSecondPlayingMusic();
                String clipId = secondPlayingMusic == null ? null : secondPlayingMusic.getClipId();
                return clipId == null ? companion.getPlayingMusicId() : clipId;
            }
        }

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Nullable
        public final Object a(long j, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            h hVar = SkyPlayService.this.new h(continuation);
            hVar.b = ((Number) obj).longValue();
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l, Continuation<? super Unit> continuation) {
            return a(l.longValue(), continuation);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x006b  */
        /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:43:0x00bc A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String str;
            SkyDeviceStatus deviceConnectStatus;
            DeviceDataRepository deviceDataRepositoryF;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = false;
                if (this.b == -1) {
                    Job job = SkyPlayService.this.deviceJob;
                    if (job != null && !job.isCancelled()) {
                        z = true;
                    }
                    if (z) {
                        Job job2 = SkyPlayService.this.deviceJob;
                        if (job2 != null) {
                            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                        }
                        SkyPlayService.this.deviceJob = null;
                    }
                } else {
                    if (SkyPlayService.this.deviceJob == null) {
                        SkyPlayService skyPlayService = SkyPlayService.this;
                        skyPlayService.deviceJob = kotlinx.coroutines.e.f(skyPlayService.serviceIOScope, null, null, new a(SkyPlayService.this, null), 3, null);
                    } else {
                        Job job3 = SkyPlayService.this.deviceJob;
                        if (job3 != null && !job3.isActive()) {
                            z = true;
                        }
                        if (z) {
                            SkyPlayService skyPlayService2 = SkyPlayService.this;
                            skyPlayService2.deviceJob = kotlinx.coroutines.e.f(skyPlayService2.serviceIOScope, null, null, new a(SkyPlayService.this, null), 3, null);
                        }
                    }
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    b bVar = new b(null);
                    this.a = 1;
                    obj = BuildersKt.withContext(main, bVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = (String) obj;
                    if (SkyPlayService.this.e().isSupportSkyFeature()) {
                    }
                    deviceDataRepositoryF = SkyPlayService.this.f();
                    this.a = 2;
                    if (deviceDataRepositoryF.uploadDeviceStatus(str, deviceConnectStatus, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                str = (String) obj;
                deviceConnectStatus = SkyPlayService.this.e().isSupportSkyFeature() ? SkyPlayService.this.g().getDeviceConnectStatus() : null;
                deviceDataRepositoryF = SkyPlayService.this.f();
                this.a = 2;
                if (deviceDataRepositoryF.uploadDeviceStatus(str, deviceConnectStatus, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayService$initPlayback$1", f = "SkyPlayService.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(continuation);
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
                PlaybackParamManager companion = PlaybackParamManager.INSTANCE.getInstance();
                this.a = 1;
                if (companion.getPlaybackParam(this) == coroutine_suspended) {
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
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onGetRoot";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onLoadChildren: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            PlaybackManager.Companion companion = PlaybackManager.INSTANCE;
            return "开始播放：" + companion.getInstance().hasNotPlayEndMusic() + ", " + companion.getInstance().musicListNotEmpty();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.sky.ui.play.SkyPlayService$volumeChangeReceiver$1] */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.huami.sky.ui.play.SkyPlayService$playReceiver$1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.huami.sky.ui.play.SkyPlayService$mainHandler$1] */
    public SkyPlayService() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.playback1 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<IPlayback>() { // from class: com.huami.sky.ui.play.SkyPlayService$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.ui.play.control.IPlayback, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IPlayback invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(IPlayback.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.playback2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<IPlayback>() { // from class: com.huami.sky.ui.play.SkyPlayService$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.ui.play.control.IPlayback, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IPlayback invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(IPlayback.class), objArr2, objArr3);
            }
        });
        final Scope scopeSkyServiceScope = SkyServiceKoinScopeKt.skyServiceScope(ComponentCallbackExtKt.getKoin(this));
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.serviceHelper = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SkyPlayServiceHelper>() { // from class: com.huami.sky.ui.play.SkyPlayService$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.sky.ui.play.SkyPlayServiceHelper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyPlayServiceHelper invoke() {
                return scopeSkyServiceScope.get(Reflection.getOrCreateKotlinClass(SkyPlayServiceHelper.class), objArr4, objArr5);
            }
        });
        final Scope scopeSkyServiceScope2 = SkyServiceKoinScopeKt.skyServiceScope(ComponentCallbackExtKt.getKoin(this));
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.playRecordManager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SkyPlayRecordManager>() { // from class: com.huami.sky.ui.play.SkyPlayService$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.sky.ui.play.SkyPlayRecordManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyPlayRecordManager invoke() {
                return scopeSkyServiceScope2.get(Reflection.getOrCreateKotlinClass(SkyPlayRecordManager.class), objArr6, objArr7);
            }
        });
        final Scope scopeSkyServiceScope3 = SkyServiceKoinScopeKt.skyServiceScope(ComponentCallbackExtKt.getKoin(this));
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.playContinuousManager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SkyPlayContinuousManager>() { // from class: com.huami.sky.ui.play.SkyPlayService$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.sky.ui.play.SkyPlayContinuousManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyPlayContinuousManager invoke() {
                return scopeSkyServiceScope3.get(Reflection.getOrCreateKotlinClass(SkyPlayContinuousManager.class), objArr8, objArr9);
            }
        });
        this.serviceIOScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        this.audioFocusChangeListener = LazyKt__LazyJVMKt.lazy(a.a);
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.deviceDataRepository = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceDataRepository>() { // from class: com.huami.sky.ui.play.SkyPlayService$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.lib.repo.DeviceDataRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceDataRepository invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceDataRepository.class), objArr10, objArr11);
            }
        });
        final Object[] objArr12 = 0 == true ? 1 : 0;
        final Object[] objArr13 = 0 == true ? 1 : 0;
        this.deviceDataApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceDataApi>() { // from class: com.huami.sky.ui.play.SkyPlayService$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.lib.api.DeviceDataApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceDataApi invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceDataApi.class), objArr12, objArr13);
            }
        });
        this.playReceiver = new BroadcastReceiver() { // from class: com.huami.sky.ui.play.SkyPlayService$playReceiver$1
            /* JADX WARN: Code duplicated, block: B:39:0x0088  */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // android.content.BroadcastReceiver
            public void onReceive(@Nullable Context context, @Nullable Intent intent) {
                if (intent == null) {
                    return;
                }
                Message messageObtainMessage = obtainMessage();
                String action = intent.getAction();
                if (action != null) {
                    switch (action.hashCode()) {
                        case -1313928997:
                            if (action.equals(SkyPlayConstant.SKY_PAUSE_ACTION)) {
                                messageObtainMessage.what = 2;
                            }
                            break;
                        case -549244379:
                            if (action.equals("android.media.AUDIO_BECOMING_NOISY")) {
                                messageObtainMessage.what = 2;
                            }
                            break;
                        case 112711456:
                            if (action.equals(SkyPlayConstant.SKY_LIKE_ACTION)) {
                                messageObtainMessage.what = 4;
                            }
                            break;
                        case 686568524:
                            if (action.equals(SkyPlayNotification.SKY_NOTIFICATION_ACTION)) {
                                messageObtainMessage.what = 9;
                                messageObtainMessage.obj = intent.getStringExtra(SkyPlayNotification.SKY_NOTIFICATION_CLICK_KEY);
                            }
                            break;
                        case 934198114:
                            if (action.equals(SkyPlayConstant.SKY_RESTART_ACTION)) {
                                messageObtainMessage.what = 3;
                            }
                            break;
                        case 1334487579:
                            if (action.equals(SkyPlayConstant.SKY_PLAY_PAUSE_ACTION)) {
                                messageObtainMessage.what = 1;
                            }
                            break;
                        case 1499071237:
                            if (action.equals(SkyPlayConstant.SKY_NOT_LIKE_ACTION)) {
                                messageObtainMessage.what = 5;
                            }
                            break;
                        case 1574734093:
                            if (action.equals(SkyPlayConstant.SKY_LOGOUT_ACTION)) {
                                messageObtainMessage.what = 6;
                            }
                            break;
                    }
                }
                messageObtainMessage.sendToTarget();
            }
        };
        final Looper mainLooper = Looper.getMainLooper();
        this.mainHandler = new Handler(mainLooper) { // from class: com.huami.sky.ui.play.SkyPlayService$mainHandler$1
            @Override // android.os.Handler
            public void handleMessage(@NotNull Message msg) {
                super.handleMessage(msg);
                this.a.n(msg);
            }
        };
        final Object[] objArr14 = 0 == true ? 1 : 0;
        final Object[] objArr15 = 0 == true ? 1 : 0;
        this.deviceStatusAssist = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ISkyDeviceStatusAssistant>() { // from class: com.huami.sky.ui.play.SkyPlayService$special$$inlined$inject$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.lib.assist.ISkyDeviceStatusAssistant, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ISkyDeviceStatusAssistant invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(ISkyDeviceStatusAssistant.class), objArr14, objArr15);
            }
        });
        this.volumeChangeAction = "android.media.VOLUME_CHANGED_ACTION";
        this.streamType = "android.media.EXTRA_VOLUME_STREAM_TYPE";
        this.volumeChangeReceiver = new BroadcastReceiver() { // from class: com.huami.sky.ui.play.SkyPlayService$volumeChangeReceiver$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private int lastVolume;

            {
                AudioManager audioManager = this.b.audioManager;
                this.lastVolume = audioManager == null ? 0 : audioManager.getStreamVolume(3);
            }

            public final int getLastVolume() {
                return this.lastVolume;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(@Nullable Context context, @Nullable Intent intent) {
                boolean z2 = false;
                if (intent != null && intent.getIntExtra(this.b.streamType, -1) == 3) {
                    z2 = true;
                }
                if (z2) {
                    AudioManager audioManager = this.b.audioManager;
                    Integer numValueOf = audioManager == null ? null : Integer.valueOf(audioManager.getStreamVolume(3));
                    PlaybackManager.Companion companion = PlaybackManager.INSTANCE;
                    if (companion.getInstance().getPlayState() == PlayState.PLAYING) {
                        String playingMusicId = companion.getInstance().getPlayingMusicId();
                        AudioManager audioManager2 = this.b.audioManager;
                        Integer numValueOf2 = audioManager2 != null ? Integer.valueOf(audioManager2.getStreamMaxVolume(3)) : null;
                        if (numValueOf != null && numValueOf2 != null && numValueOf2.intValue() != 0) {
                            float fIntValue = numValueOf.intValue() / numValueOf2.intValue();
                            if (numValueOf.intValue() > this.lastVolume) {
                                CountEventBuilder countEventBuilder = new CountEventBuilder(SkyPlayEventKt.AIMUSIC_VOLUME_PLUS_C);
                                countEventBuilder.addExtra("id", playingMusicId);
                                countEventBuilder.addExtra("size", String.valueOf(fIntValue));
                                Analytics.recordEvent(countEventBuilder);
                            } else if (numValueOf.intValue() < this.lastVolume) {
                                CountEventBuilder countEventBuilder2 = new CountEventBuilder(SkyPlayEventKt.AIMUSIC_VOLUME_REDUCTION_C);
                                countEventBuilder2.addExtra("id", playingMusicId);
                                countEventBuilder2.addExtra("size", String.valueOf(fIntValue));
                                Analytics.recordEvent(countEventBuilder2);
                            }
                        }
                    }
                    if (numValueOf == null) {
                        return;
                    }
                    setLastVolume(numValueOf.intValue());
                }
            }

            public final void setLastVolume(int i2) {
                this.lastVolume = i2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        PlaybackManager.INSTANCE.getInstance().updateMusicLike();
    }

    private final void B(PlayState playState) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[playState.ordinal()];
        int i3 = 3;
        if (i2 == 1 || i2 == 2) {
            i3 = 6;
        } else if (i2 == 3) {
            i3 = 2;
        } else if (i2 != 4) {
            i3 = 0;
        }
        MediaMetadataCompat mediaMetadataCompatBuild = new MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_TITLE, getResources().getString(R.string.sky_play_title)).putString(MediaMetadataCompat.METADATA_KEY_ARTIST, "").putLong(MediaMetadataCompat.METADATA_KEY_DURATION, 0L).build();
        MediaSessionCompat mediaSessionCompat = this.mediaSession;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.setMetadata(mediaMetadataCompatBuild);
        }
        MediaSessionCompat mediaSessionCompat2 = this.mediaSession;
        if (mediaSessionCompat2 == null) {
            return;
        }
        mediaSessionCompat2.setPlaybackState(new PlaybackStateCompat.Builder().setState(i3, 0L, 1.0f).build());
    }

    private final SkyPlayAudioFocusChange a() {
        return (SkyPlayAudioFocusChange) this.audioFocusChangeListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MusicInfo b() {
        return PlaybackManager.INSTANCE.getInstance().getCurrentAnimMusic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c() {
        return PlaybackManager.INSTANCE.getInstance().getCurrentAnimPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d() {
        return PlaybackManager.INSTANCE.getInstance().getCurrentMusicLiked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceDataApi e() {
        return (DeviceDataApi) this.deviceDataApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceDataRepository f() {
        return (DeviceDataRepository) this.deviceDataRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISkyDeviceStatusAssistant g() {
        return (ISkyDeviceStatusAssistant) this.deviceStatusAssist.getValue();
    }

    private final SkyPlayContinuousManager h() {
        return (SkyPlayContinuousManager) this.playContinuousManager.getValue();
    }

    private final SkyPlayRecordManager i() {
        return (SkyPlayRecordManager) this.playRecordManager.getValue();
    }

    private final IPlayback j() {
        return (IPlayback) this.playback1.getValue();
    }

    private final IPlayback k() {
        return (IPlayback) this.playback2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SkyPlayServiceHelper l() {
        return (SkyPlayServiceHelper) this.serviceHelper.getValue();
    }

    private final void m(String clickEvent) {
        int iHashCode = clickEvent.hashCode();
        if (iHashCode == 3321751) {
            if (clickEvent.equals(SkyPlayNotification.SKY_NOTIFICATION_LIKE)) {
                PlaybackManager.Companion companion = PlaybackManager.INSTANCE;
                companion.getInstance().updateMusicLike();
                SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_PLAYER_LIKE_C, "2", companion.getInstance().getPlayingMusicId(), companion.getInstance().getCurrentMusicLiked() ? "0" : "1", l().getEventSessionId().getValue());
                return;
            }
            return;
        }
        if (iHashCode != 200190885) {
            if (iHashCode == 1531054546 && clickEvent.equals(SkyPlayNotification.SKY_NOTIFICATION_NOT_LIKE)) {
                SkyPlayEventKt.recordEvent$default(SkyPlayEventKt.AIMUSIC_PLAYER_DISLIKE_C, "2", PlaybackManager.INSTANCE.getInstance().getPlayingMusicId(), null, l().getEventSessionId().getValue(), 8, null);
                v();
                return;
            }
            return;
        }
        if (clickEvent.equals(SkyPlayNotification.SKY_NOTIFICATION_PLAY_PAUSE)) {
            if (PlaybackManager.INSTANCE.getInstance().isPlaying()) {
                SkyPlayEventKt.recordEvent$default(SkyPlayEventKt.AIMUSIC_PLAYER_PAUSE_C, "2", null, null, l().getEventSessionId().getValue(), 12, null);
            } else {
                SkyPlayEventKt.recordEvent$default(SkyPlayEventKt.AIMUSIC_PLAYER_PLAY_C, "2", null, null, null, 28, null);
            }
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(Message msg) {
        switch (msg.what) {
            case 1:
                w();
                break;
            case 2:
                PlaybackManager.pause$default(PlaybackManager.INSTANCE.getInstance(), null, 1, null);
                break;
            case 3:
                PlaybackManager.INSTANCE.getInstance().restart();
                break;
            case 4:
                PlaybackManager.INSTANCE.getInstance().updateMusicLike();
                break;
            case 5:
                v();
                break;
            case 6:
                stopSelf();
                break;
            case 7:
                if (msg.arg1 != 10) {
                    SkyPlayNotification skyPlayNotification = this.skyPlayNotification;
                    if (skyPlayNotification != null) {
                        skyPlayNotification.notifyPlayNotification();
                        break;
                    }
                } else {
                    SkyPlayNotification skyPlayNotification2 = this.skyPlayNotification;
                    if (skyPlayNotification2 != null) {
                        skyPlayNotification2.notifyNotification();
                        break;
                    }
                }
                break;
            case 8:
                SkyPlayNotification skyPlayNotification3 = this.skyPlayNotification;
                if (skyPlayNotification3 != null) {
                    skyPlayNotification3.cancelNotification();
                    break;
                }
                break;
            case 9:
                m(msg.obj.toString());
                break;
        }
    }

    private final void o() {
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(getApplicationContext(), SkyServiceScopeName.SKY_SERVICE);
        this.mediaSession = mediaSessionCompat;
        mediaSessionCompat.setCallback(new SkyMediaSessionCallback());
        MediaSessionCompat mediaSessionCompat2 = this.mediaSession;
        if (mediaSessionCompat2 != null) {
            mediaSessionCompat2.setActive(true);
        }
        MediaSessionCompat mediaSessionCompat3 = this.mediaSession;
        setSessionToken(mediaSessionCompat3 == null ? null : mediaSessionCompat3.getSessionToken());
    }

    private final void p() {
        PlaybackManager.Companion companion = PlaybackManager.INSTANCE;
        FlowKt.launchIn(FlowKt.onEach(companion.getInstance().getPlayActionCallbackFlow(), new b(null)), this.serviceIOScope);
        FlowKt.launchIn(FlowKt.onEach(companion.getInstance().getPlayStateChangeFlow(), new c(null)), this.serviceIOScope);
        FlowKt.launchIn(FlowKt.onEach(companion.getInstance().getLikeChangeFlow(), new d(null)), this.serviceIOScope);
        FlowKt.launchIn(FlowKt.onEach(companion.getInstance().getMusicClipRecordChangeFlow(), new e(null)), this.serviceIOScope);
        FlowKt.launchIn(FlowKt.onEach(companion.getInstance().getUserActionChangeFlow(), new f(null)), this.serviceIOScope);
        l().observeMusicStop();
        FlowKt.launchIn(FlowKt.onEach(g().deviceConnectNotifiers(), new g(null)), this.serviceIOScope);
        i().deviceStatusObserve();
        h().startObservePlayDone();
        FlowKt.launchIn(FlowKt.onEach(l().getPlayStartTimeFlow(), new h(null)), this.serviceIOScope);
    }

    private final void q() {
        PlaybackManager.INSTANCE.getInstance().createPlayback(j(), k());
        kotlinx.coroutines.e.f(this.serviceIOScope, null, null, new i(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r() {
        return PlaybackManager.INSTANCE.getInstance().isPlaying();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(int playAction) {
        if (playAction == 25) {
            SkyPlayServiceHelper.requestMusic$default(l(), 0, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(PlayState playState) {
        if (playState == PlayState.PLAY) {
            y();
        } else if (playState == PlayState.PLAYING) {
            l().setPlayStart();
            sendEmptyMessage(7);
        } else if (playState == PlayState.PAUSE || playState == PlayState.ERROR) {
            sendEmptyMessage(7);
        } else if (playState == PlayState.IDLE) {
            sendEmptyMessage(8);
        }
        B(playState);
        l().playStopTiming(playState);
        l().updateSkyStartTime(playState);
    }

    private final void u() {
        HMLog.info(SkyServiceScopeName.SKY_SERVICE, l.a);
        PlaybackManager.Companion companion = PlaybackManager.INSTANCE;
        if (companion.getInstance().hasNotPlayEndMusic()) {
            companion.getInstance().play();
        } else {
            companion.getInstance().updatePlayState(PlayState.PROGRESSING);
            l().requestMusic(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        PlaybackManager.Companion companion = PlaybackManager.INSTANCE;
        if (companion.getInstance().hasNextMusic()) {
            companion.getInstance().playNextMusic();
            return;
        }
        companion.getInstance().pauseFromPlayNextMusic();
        companion.getInstance().updatePlayState(PlayState.PROGRESSING);
        l().requestMusic(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        PlaybackManager.Companion companion = PlaybackManager.INSTANCE;
        if (companion.getInstance().isPlaying()) {
            companion.getInstance().pause(MusicPauseFrom.MANUAL);
        } else {
            u();
        }
    }

    private final void x() {
        AudioManager audioManager;
        if (Build.VERSION.SDK_INT < 26) {
            AudioManager audioManager2 = this.audioManager;
            if (audioManager2 == null) {
                return;
            }
            audioManager2.abandonAudioFocus(a());
            return;
        }
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest == null || (audioManager = this.audioManager) == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    private final void y() {
        AudioManager audioManager;
        if (Build.VERSION.SDK_INT < 26) {
            AudioManager audioManager2 = this.audioManager;
            if (audioManager2 == null) {
                return;
            }
            audioManager2.requestAudioFocus(a(), 3, 1);
            return;
        }
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(a()).build();
        this.audioFocusRequest = audioFocusRequestBuild;
        if (audioFocusRequestBuild == null || (audioManager = this.audioManager) == null) {
            return;
        }
        audioManager.requestAudioFocus(audioFocusRequestBuild);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        PlayState playState = PlaybackManager.INSTANCE.getInstance().getPlayState();
        if (playState == PlayState.IDLE || playState == PlayState.ERROR) {
            u();
        }
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    @NotNull
    public IBinder onBind(@Nullable Intent intent) {
        return new SkyPlayBinder();
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public void onCreate() {
        super.onCreate();
        q();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        intentFilter.addAction(SkyPlayNotification.SKY_NOTIFICATION_ACTION);
        registerReceiver(this.playReceiver, intentFilter);
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
        SkyPlayService$playReceiver$1 skyPlayService$playReceiver$1 = this.playReceiver;
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(SkyPlayConstant.SKY_PLAY_PAUSE_ACTION);
        intentFilter2.addAction(SkyPlayConstant.SKY_PAUSE_ACTION);
        intentFilter2.addAction(SkyPlayConstant.SKY_RESTART_ACTION);
        intentFilter2.addAction(SkyPlayConstant.SKY_LIKE_ACTION);
        intentFilter2.addAction(SkyPlayConstant.SKY_NOT_LIKE_ACTION);
        intentFilter2.addAction(SkyPlayConstant.SKY_LOGOUT_ACTION);
        Unit unit = Unit.INSTANCE;
        localBroadcastManager.registerReceiver(skyPlayService$playReceiver$1, intentFilter2);
        registerReceiver(this.volumeChangeReceiver, new IntentFilter(this.volumeChangeAction));
        Object systemService = getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
        this.skyPlayNotification = new SkyPlayNotification(this);
        p();
        o();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        PlaybackManager.INSTANCE.getInstance().clearData();
        unregisterReceiver(this.playReceiver);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.playReceiver);
        unregisterReceiver(this.volumeChangeReceiver);
        x();
        l().clear();
        h().clear();
        i().clear();
        CoroutineScopeKt.cancel$default(this.serviceIOScope, null, 1, null);
        removeCallbacksAndMessages(null);
        MediaSessionCompat mediaSessionCompat = this.mediaSession;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.setActive(false);
            mediaSessionCompat.release();
        }
        SkyServiceKoinScopeKt.skyServiceScope(ComponentCallbackExtKt.getKoin(this)).close();
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    @NotNull
    public MediaBrowserServiceCompat.BrowserRoot onGetRoot(@NotNull String clientPackageName, int clientUid, @Nullable Bundle rootHints) {
        HMLog.info("SkyMediaSessionCallback", j.a);
        return new MediaBrowserServiceCompat.BrowserRoot("media_root_id", null);
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public void onLoadChildren(@NotNull String parentId, @NotNull MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>> result) {
        HMLog.info("SkyMediaSessionCallback", new k(parentId));
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        if (intent != null && Intrinsics.areEqual(intent.getStringExtra(SkyPlayConstant.SKY_SERVICE_ACTION), SkyPlayConstant.SKY_PLAY_PAUSE_ACTION)) {
            w();
        }
        return super.onStartCommand(intent, flags, startId);
    }
}
