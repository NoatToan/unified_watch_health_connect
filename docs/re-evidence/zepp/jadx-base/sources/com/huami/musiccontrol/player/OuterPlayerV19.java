package com.huami.musiccontrol.player;

import android.media.AudioManager;
import android.media.RemoteController;
import android.service.notification.NotificationListenerService;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.musiccontrol.MusicControllerModule;
import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.musiccontrol.bean.MusicState;
import com.huami.musiccontrol.utils.MediaExtKt;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0002*+B\u000f\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00060\u0013R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/huami/musiccontrol/player/OuterPlayerV19;", "Lcom/huami/musiccontrol/player/IPlayer;", "", PointCategory.INIT, "", "destroy", "Lcom/huami/musiccontrol/player/IPlayerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMusicListener", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "getPlaybackState", "Lcom/huami/musiccontrol/bean/MusicInfo;", "getMetadata", "", "getPackageName", "Landroid/media/RemoteController;", "a", "Landroid/media/RemoteController;", "remoteController", "Lcom/huami/musiccontrol/player/OuterPlayerV19$InnerCallback;", "b", "Lcom/huami/musiccontrol/player/OuterPlayerV19$InnerCallback;", "innerCallback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "prepared", GoogleApiAvailabilityLight.a, "Lcom/huami/musiccontrol/player/IPlayerListener;", "outerListener", "e", "Lcom/huami/musiccontrol/bean/MusicInfo;", "currentMusicInfo", "f", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "currentStateInfo", "Lcom/huami/musiccontrol/MusicControllerModule$IMusicListenerService;", "g", "Lcom/huami/musiccontrol/MusicControllerModule$IMusicListenerService;", "service", "<init>", "(Lcom/huami/musiccontrol/MusicControllerModule$IMusicListenerService;)V", "Companion", "InnerCallback", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final class OuterPlayerV19 implements IPlayer {
    private static final String h = "MusicCtrl_OuterPlayer19";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private RemoteController remoteController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InnerCallback innerCallback = new InnerCallback();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private AtomicBoolean prepared = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private IPlayerListener outerListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private MusicInfo currentMusicInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private MusicPlayInfo currentStateInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final MusicControllerModule.IMusicListenerService service;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "init failed as service is not running";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "init failed as audio manager is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.BooleanRef booleanRef) {
            super(0);
            this.a = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "init finish, and registered: " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "init error: " + this.a.getMessage();
        }
    }

    public OuterPlayerV19(@NotNull MusicControllerModule.IMusicListenerService iMusicListenerService) {
        this.service = iMusicListenerService;
    }

    @Override // com.huami.musiccontrol.player.IPlayer
    public void destroy() {
        if (this.prepared.compareAndSet(true, false)) {
            this.currentMusicInfo = null;
            MusicPlayInfo musicPlayInfo = this.currentStateInfo;
            if (musicPlayInfo != null) {
                musicPlayInfo.setState(MusicState.STOPPED);
            }
            MusicPlayInfo musicPlayInfo2 = this.currentStateInfo;
            if (musicPlayInfo2 != null) {
                musicPlayInfo2.setPosition(-1L);
            }
            NotificationListenerService service = this.service.getService();
            AudioManager audioManager = (AudioManager) (service != null ? service.getSystemService("audio") : null);
            if (audioManager != null) {
                audioManager.unregisterRemoteController(this.remoteController);
            }
        }
    }

    @Override // com.huami.musiccontrol.player.IPlayer
    @Nullable
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public MusicInfo getCurrentMusicInfo() {
        return this.currentMusicInfo;
    }

    @Override // com.huami.musiccontrol.player.IPlayer
    @NotNull
    public String getPackageName() {
        return "unknown";
    }

    @Override // com.huami.musiccontrol.player.IPlayer
    @Nullable
    /* JADX INFO: renamed from: getPlaybackState, reason: from getter */
    public MusicPlayInfo getCurrentStateInfo() {
        return this.currentStateInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.musiccontrol.player.IPlayer
    public boolean init() {
        if (this.prepared.compareAndSet(false, true)) {
            NotificationListenerService service = this.service.getService();
            if (service == 0) {
                HMLog.info(h, a.a);
                this.prepared.set(false);
                return false;
            }
            this.remoteController = new RemoteController(service, (RemoteController.OnClientUpdateListener) service);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = false;
            try {
                AudioManager audioManager = (AudioManager) service.getSystemService("audio");
                if (audioManager == null) {
                    this.prepared.set(false);
                    HMLog.info(h, b.a);
                    return false;
                }
                boolean zRegisterRemoteController = audioManager.registerRemoteController(this.remoteController);
                booleanRef.element = zRegisterRemoteController;
                if (zRegisterRemoteController) {
                    this.remoteController.setArtworkConfiguration(100, 100);
                    this.remoteController.setSynchronizationMode(1);
                    this.service.setClientUpdateListener(this.innerCallback);
                    this.prepared.set(true);
                }
                HMLog.info(h, new c(booleanRef));
            } catch (Exception e) {
                HMLog.info(h, new d(e));
                this.prepared.set(false);
            }
        }
        return this.prepared.get();
    }

    @Override // com.huami.musiccontrol.player.IPlayer
    public void setMusicListener(@Nullable IPlayerListener listener) {
        this.outerListener = listener;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J(\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\nH\u0016¨\u0006\u0016"}, d2 = {"Lcom/huami/musiccontrol/player/OuterPlayerV19$InnerCallback;", "Landroid/media/RemoteController$OnClientUpdateListener;", "", "clearing", "", "onClientChange", "Landroid/media/RemoteController$MetadataEditor;", "Landroid/media/RemoteController;", "metadataEditor", "onClientMetadataUpdate", "", "state", "onClientPlaybackStateUpdate", "", "stateChangeTimeMs", "currentPosMs", "", "speed", "transportControlFlags", "onClientTransportControlUpdate", "<init>", "(Lcom/huami/musiccontrol/player/OuterPlayerV19;)V", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public final class InnerCallback implements RemoteController.OnClientUpdateListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onClientChange: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ RemoteController.MetadataEditor a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(RemoteController.MetadataEditor metadataEditor) {
                super(0);
                this.a = metadataEditor;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onClientMetadataUpdate: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
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
                return "onClientPlaybackStateUpdate, state: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(int i, long j) {
                super(0);
                this.a = i;
                this.b = j;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onClientPlaybackStateUpdate, state: " + this.a + "; currentPosMs: " + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class e extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onClientTransportControlUpdate transportControlFlags: " + this.a;
            }
        }

        public InnerCallback() {
        }

        @Override // android.media.RemoteController.OnClientUpdateListener
        public void onClientChange(boolean clearing) {
            HMLog.info(OuterPlayerV19.h, new a(clearing));
        }

        @Override // android.media.RemoteController.OnClientUpdateListener
        public void onClientMetadataUpdate(@Nullable RemoteController.MetadataEditor metadataEditor) {
            MusicInfo musicInfo;
            IPlayerListener iPlayerListener;
            HMLog.info(OuterPlayerV19.h, new b(metadataEditor));
            if (metadataEditor == null || (musicInfo = MediaExtKt.getMusicInfo(metadataEditor)) == null || (iPlayerListener = OuterPlayerV19.this.outerListener) == null) {
                return;
            }
            iPlayerListener.onMusicChanged(OuterPlayerV19.this, musicInfo);
        }

        @Override // android.media.RemoteController.OnClientUpdateListener
        public void onClientPlaybackStateUpdate(int state) {
            HMLog.info(OuterPlayerV19.h, new c(state));
            MusicPlayInfo musicPlayInfoFromState = MediaExtKt.fromState(state, OuterPlayerV19.this.remoteController.getEstimatedMediaPosition());
            IPlayerListener iPlayerListener = OuterPlayerV19.this.outerListener;
            if (iPlayerListener != null) {
                iPlayerListener.onPlayStatusChanged(OuterPlayerV19.this, musicPlayInfoFromState);
            }
        }

        @Override // android.media.RemoteController.OnClientUpdateListener
        public void onClientTransportControlUpdate(int transportControlFlags) {
            HMLog.info(OuterPlayerV19.h, new e(transportControlFlags));
        }

        @Override // android.media.RemoteController.OnClientUpdateListener
        public void onClientPlaybackStateUpdate(int state, long stateChangeTimeMs, long currentPosMs, float speed) {
            HMLog.info(OuterPlayerV19.h, new d(state, currentPosMs));
            MusicPlayInfo musicPlayInfoFromState = MediaExtKt.fromState(state, currentPosMs);
            IPlayerListener iPlayerListener = OuterPlayerV19.this.outerListener;
            if (iPlayerListener != null) {
                iPlayerListener.onPlayStatusChanged(OuterPlayerV19.this, musicPlayInfoFromState);
            }
        }
    }
}
