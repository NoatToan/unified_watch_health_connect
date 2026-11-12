package com.huami.musiccontrol.controller;

import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.service.notification.NotificationListenerService;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.musiccontrol.MusicControllerModule;
import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.musiccontrol.bean.MusicState;
import com.huami.musiccontrol.player.IPlayer;
import com.huami.musiccontrol.player.IPlayerListener;
import com.huami.musiccontrol.player.OuterPlayer;
import com.huami.musiccontrol.utils.ControlUtils;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(21)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 02\u00020\u0001:\u000201B\u0007¢\u0006\u0004\b.\u0010/J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002H\u0016J\u0012\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\"\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR!\u0010\"\u001a\u00060\u001fR\u00020\u00008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\u0017\u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00062"}, d2 = {"Lcom/huami/musiccontrol/controller/RemoteMediaController;", "Lcom/huami/musiccontrol/controller/IPhoneMusicController;", "", "Landroid/media/session/MediaController;", "controllers", "", GoogleApiAvailabilityLight.a, "", "c", "b", "", PointCategory.INIT, "deInit", "nextMusic", "preMusic", "pause", "play", "Lcom/huami/musiccontrol/player/IPlayer;", "getPlayers", "Lcom/huami/musiccontrol/player/IPlayerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMusicListener", "Landroid/media/session/MediaSessionManager;", "a", "Landroid/media/session/MediaSessionManager;", "mediaSessionManager", "Lcom/huami/musiccontrol/player/IPlayerListener;", "", "Lcom/huami/musiccontrol/player/OuterPlayer;", "Ljava/util/Map;", "playerMap", "Lcom/huami/musiccontrol/controller/RemoteMediaController$ControllerCallback;", "Lkotlin/Lazy;", "()Lcom/huami/musiccontrol/controller/RemoteMediaController$ControllerCallback;", "mediaCallback", "Ljava/util/concurrent/locks/ReentrantLock;", "e", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "f", "Z", "hasInit", "Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;", "g", "Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;", "activeSessionChangeListener", "<init>", "()V", "Companion", "ControllerCallback", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final class RemoteMediaController implements IPhoneMusicController {
    private static final String h = "MusicCtrl_RemoteMediaController";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private MediaSessionManager mediaSessionManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private IPlayerListener listener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean hasInit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<String, OuterPlayer> playerMap = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy mediaCallback = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ReentrantLock lock = new ReentrantLock();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final MediaSessionManager.OnActiveSessionsChangedListener activeSessionChangeListener = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/huami/musiccontrol/controller/RemoteMediaController$ControllerCallback;", "Lcom/huami/musiccontrol/player/IPlayerListener;", "Lcom/huami/musiccontrol/player/IPlayer;", "outerPlayer", "Lcom/huami/musiccontrol/bean/MusicInfo;", WebConstant.QueryParam.TYPE_MUSIC, "", "onMusicChanged", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "state", "onPlayStatusChanged", "onSessionDestroyed", "<init>", "(Lcom/huami/musiccontrol/controller/RemoteMediaController;)V", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public final class ControllerCallback implements IPlayerListener {
        public ControllerCallback() {
        }

        @Override // com.huami.musiccontrol.player.IPlayerListener
        public void onMusicChanged(@NotNull IPlayer outerPlayer, @NotNull MusicInfo music) {
            IPlayerListener iPlayerListener = RemoteMediaController.this.listener;
            if (iPlayerListener != null) {
                iPlayerListener.onMusicChanged(outerPlayer, music);
            }
        }

        @Override // com.huami.musiccontrol.player.IPlayerListener
        public void onPlayStatusChanged(@NotNull IPlayer outerPlayer, @NotNull MusicPlayInfo state) {
            IPlayerListener iPlayerListener = RemoteMediaController.this.listener;
            if (iPlayerListener != null) {
                iPlayerListener.onPlayStatusChanged(outerPlayer, state);
            }
        }

        @Override // com.huami.musiccontrol.player.IPlayerListener
        public void onSessionDestroyed(@NotNull IPlayer outerPlayer) {
            RemoteMediaController.this.playerMap.remove(outerPlayer.getPlayerPkgName());
            IPlayerListener iPlayerListener = RemoteMediaController.this.listener;
            if (iPlayerListener != null) {
                iPlayerListener.onSessionDestroyed(outerPlayer);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052,\u0010\u0004\u001a(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Landroid/media/session/MediaController;", "kotlin.jvm.PlatformType", "", "controllers", "", "onActiveSessionsChanged", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a implements MediaSessionManager.OnActiveSessionsChangedListener {

        /* JADX INFO: renamed from: com.huami.musiccontrol.controller.RemoteMediaController$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class C0499a extends Lambda implements Function0<String> {
            public static final C0499a a = new C0499a();

            public C0499a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "activeSessionChangeListener triggerd and controllers is null";
            }
        }

        public a() {
        }

        @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
        public final void onActiveSessionsChanged(@Nullable List<MediaController> list) {
            if (list == null) {
                HMLog.info(RemoteMediaController.h, C0499a.a);
                return;
            }
            ReentrantLock reentrantLock = RemoteMediaController.this.lock;
            reentrantLock.lock();
            try {
                RemoteMediaController.this.d(list);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "RemoteMediaController init failed as context is " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "RemoteMediaController init failed as media session manager is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "RemoteMediaController init failed as service class is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/huami/musiccontrol/controller/RemoteMediaController$ControllerCallback;", "Lcom/huami/musiccontrol/controller/RemoteMediaController;", "a", "()Lcom/huami/musiccontrol/controller/RemoteMediaController$ControllerCallback;"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<ControllerCallback> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ControllerCallback invoke() {
            return RemoteMediaController.this.new ControllerCallback();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "skip to next music;";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pause music;";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "play music;";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "skip to pre music;";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "update current controllers " + RemoteMediaController.this.c(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "updateCurrentController return as destroyed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class l extends Lambda implements Function0<String> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "current controller is: " + RemoteMediaController.this.b();
        }
    }

    private final ControllerCallback a() {
        return (ControllerCallback) this.mediaCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b() {
        String string;
        MusicState state;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Controllers: ");
        for (Map.Entry<String, OuterPlayer> entry : this.playerMap.entrySet()) {
            OuterPlayer value = entry.getValue();
            String key = entry.getKey();
            MusicPlayInfo currentStateInfo = value.getCurrentStateInfo();
            if (currentStateInfo == null || (state = currentStateInfo.getState()) == null || (string = state.toString()) == null) {
                string = "NullPlaybackState";
            }
            stringBuffer.append("[pkgName: " + key + ", state: " + string + JsonLexerKt.END_LIST);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(List<MediaController> controllers) {
        String strValueOf;
        if (controllers == null || controllers.isEmpty()) {
            return "NullControllers";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (MediaController mediaController : controllers) {
            String packageName = mediaController.getPackageName();
            if (packageName == null) {
                packageName = "NullPackageName";
            }
            PlaybackState playbackState = mediaController.getPlaybackState();
            if (playbackState == null || (strValueOf = String.valueOf(playbackState.getState())) == null) {
                strValueOf = "NullPlaybackState";
            }
            sb.append("[pkg: ");
            sb.append(packageName);
            sb.append(", state: ");
            sb.append(strValueOf);
            sb.append("]");
        }
        sb.append(com.alipay.sdk.m.u.i.d);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void d(List<MediaController> controllers) {
        Object next;
        HMLog.info(h, new j(controllers));
        if (!this.hasInit) {
            HMLog.info(h, k.a);
            return;
        }
        Iterator<Map.Entry<String, OuterPlayer>> it2 = this.playerMap.entrySet().iterator();
        while (it2.hasNext()) {
            String key = it2.next().getKey();
            Iterator<T> it3 = controllers.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!Intrinsics.areEqual(((MediaController) next).getPackageName(), key));
            if (((MediaController) next) == null) {
                it2.remove();
            }
        }
        for (MediaController mediaController : controllers) {
            String packageName = mediaController.getPackageName();
            if (packageName != null && this.playerMap.get(packageName) == null) {
                OuterPlayer outerPlayer = new OuterPlayer(mediaController.getSessionToken());
                outerPlayer.init();
                outerPlayer.setMusicListener(a());
                this.playerMap.put(packageName, outerPlayer);
            }
        }
        HMLog.info(h, new l());
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public boolean deInit() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.hasInit) {
                Context appContext = MusicControllerModule.INSTANCE.getInstance().getAppContext();
                MediaSessionManager mediaSessionManager = (MediaSessionManager) (appContext != null ? appContext.getSystemService("media_session") : null);
                if (mediaSessionManager != null) {
                    mediaSessionManager.removeOnActiveSessionsChangedListener(this.activeSessionChangeListener);
                }
                Iterator<Map.Entry<String, OuterPlayer>> it2 = this.playerMap.entrySet().iterator();
                while (it2.hasNext()) {
                    OuterPlayer value = it2.next().getValue();
                    value.setMusicListener(null);
                    value.destroy();
                }
                this.playerMap.clear();
                this.hasInit = false;
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    @NotNull
    public List<IPlayer> getPlayers() {
        return CollectionsKt___CollectionsKt.toList(this.playerMap.values());
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public synchronized boolean init() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.hasInit) {
                reentrantLock.unlock();
                return true;
            }
            MusicControllerModule.Companion companion = MusicControllerModule.INSTANCE;
            Context appContext = companion.getInstance().getAppContext();
            if (appContext == null) {
                HMLog.info(h, new b(appContext));
                reentrantLock.unlock();
                return false;
            }
            MediaSessionManager mediaSessionManager = (MediaSessionManager) appContext.getSystemService("media_session");
            this.mediaSessionManager = mediaSessionManager;
            if (mediaSessionManager == null) {
                HMLog.info(h, c.a);
                reentrantLock.unlock();
                return false;
            }
            Class<NotificationListenerService> notificationServiceClass$music_control_release = companion.getInstance().getNotificationServiceClass$music_control_release();
            if (notificationServiceClass$music_control_release == null) {
                HMLog.info(h, d.a);
                reentrantLock.unlock();
                return false;
            }
            ComponentName componentName = new ComponentName(appContext, notificationServiceClass$music_control_release);
            mediaSessionManager.addOnActiveSessionsChangedListener(this.activeSessionChangeListener, componentName);
            this.hasInit = true;
            d(mediaSessionManager.getActiveSessions(componentName));
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public boolean nextMusic() {
        HMLog.info(h, f.a);
        return ControlUtils.INSTANCE.nextMusic();
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public boolean pause() {
        HMLog.info(h, g.a);
        return ControlUtils.INSTANCE.pause();
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public boolean play() {
        HMLog.info(h, h.a);
        return ControlUtils.INSTANCE.play();
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public boolean preMusic() {
        HMLog.info(h, i.a);
        return ControlUtils.INSTANCE.preMusic();
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public void setMusicListener(@Nullable IPlayerListener listener) {
        this.listener = listener;
    }
}
