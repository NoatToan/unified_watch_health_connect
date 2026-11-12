package com.huami.musiccontrol.controller;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.musiccontrol.MusicControllerModule;
import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.musiccontrol.player.IPlayer;
import com.huami.musiccontrol.player.IPlayerListener;
import com.huami.musiccontrol.player.OuterPlayerV19;
import com.huami.musiccontrol.utils.ControlUtils;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR!\u0010\"\u001a\u00060\u001eR\u00020\u00008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0010\u0010!¨\u0006'"}, d2 = {"Lcom/huami/musiccontrol/controller/RemoteMediaControllerV19;", "Lcom/huami/musiccontrol/controller/IPhoneMusicController;", "", PointCategory.INIT, "deInit", "nextMusic", "preMusic", "pause", "play", "", "Lcom/huami/musiccontrol/player/IPlayer;", "getPlayers", "Lcom/huami/musiccontrol/player/IPlayerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setMusicListener", "a", "Z", "hasInit", "Ljava/util/concurrent/locks/ReentrantLock;", "b", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "c", "Ljava/util/List;", "players", GoogleApiAvailabilityLight.a, "Lcom/huami/musiccontrol/player/IPlayerListener;", "outerListener", "Lcom/huami/musiccontrol/controller/RemoteMediaControllerV19$ControllerCallback;", "e", "Lkotlin/Lazy;", "()Lcom/huami/musiccontrol/controller/RemoteMediaControllerV19$ControllerCallback;", "innerListener", "<init>", "()V", "Companion", "ControllerCallback", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final class RemoteMediaControllerV19 implements IPhoneMusicController {
    private static final String f = "MusicCtrl_RemoteMediaControllerV19";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean hasInit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private IPlayerListener outerListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ReentrantLock lock = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<IPlayer> players = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy innerListener = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/huami/musiccontrol/controller/RemoteMediaControllerV19$ControllerCallback;", "Lcom/huami/musiccontrol/player/IPlayerListener;", "Lcom/huami/musiccontrol/player/IPlayer;", "outerPlayer", "Lcom/huami/musiccontrol/bean/MusicInfo;", WebConstant.QueryParam.TYPE_MUSIC, "", "onMusicChanged", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "state", "onPlayStatusChanged", "onSessionDestroyed", "<init>", "(Lcom/huami/musiccontrol/controller/RemoteMediaControllerV19;)V", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public final class ControllerCallback implements IPlayerListener {
        public ControllerCallback() {
        }

        @Override // com.huami.musiccontrol.player.IPlayerListener
        public void onMusicChanged(@NotNull IPlayer outerPlayer, @NotNull MusicInfo music) {
            IPlayerListener iPlayerListener = RemoteMediaControllerV19.this.outerListener;
            if (iPlayerListener != null) {
                iPlayerListener.onMusicChanged(outerPlayer, music);
            }
        }

        @Override // com.huami.musiccontrol.player.IPlayerListener
        public void onPlayStatusChanged(@NotNull IPlayer outerPlayer, @NotNull MusicPlayInfo state) {
            IPlayerListener iPlayerListener = RemoteMediaControllerV19.this.outerListener;
            if (iPlayerListener != null) {
                iPlayerListener.onPlayStatusChanged(outerPlayer, state);
            }
        }

        @Override // com.huami.musiccontrol.player.IPlayerListener
        public void onSessionDestroyed(@NotNull IPlayer outerPlayer) {
            IPlayerListener iPlayerListener = RemoteMediaControllerV19.this.outerListener;
            if (iPlayerListener != null) {
                iPlayerListener.onSessionDestroyed(outerPlayer);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ MusicControllerModule.IMusicListenerService a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MusicControllerModule.IMusicListenerService iMusicListenerService) {
            super(0);
            this.a = iMusicListenerService;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "RemoteMediaController init failed as service is " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/huami/musiccontrol/controller/RemoteMediaControllerV19$ControllerCallback;", "Lcom/huami/musiccontrol/controller/RemoteMediaControllerV19;", "a", "()Lcom/huami/musiccontrol/controller/RemoteMediaControllerV19$ControllerCallback;"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<ControllerCallback> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ControllerCallback invoke() {
            return RemoteMediaControllerV19.this.new ControllerCallback();
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
            return "skip to next music;";
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
            return "pause music;";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "play music;";
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
            return "skip to pre music;";
        }
    }

    private final ControllerCallback a() {
        return (ControllerCallback) this.innerListener.getValue();
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public boolean deInit() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.hasInit) {
                return true;
            }
            Iterator<IPlayer> it2 = this.players.iterator();
            while (it2.hasNext()) {
                it2.next().destroy();
                it2.remove();
            }
            this.hasInit = false;
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    @NotNull
    public List<IPlayer> getPlayers() {
        return this.players;
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public boolean init() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.hasInit) {
                return true;
            }
            MusicControllerModule.Companion companion = MusicControllerModule.INSTANCE;
            MusicControllerModule.IMusicListenerService musicListenerService = companion.getInstance().getMusicListenerService();
            if (musicListenerService == null) {
                HMLog.info(f, new a(musicListenerService));
                companion.getInstance().tryToStartService$music_control_release();
                return false;
            }
            OuterPlayerV19 outerPlayerV19 = new OuterPlayerV19(musicListenerService);
            outerPlayerV19.setMusicListener(a());
            boolean zInit = outerPlayerV19.init();
            this.players.add(outerPlayerV19);
            this.hasInit = true;
            return zInit;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public boolean nextMusic() {
        HMLog.info(f, c.a);
        return ControlUtils.INSTANCE.nextMusic();
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public boolean pause() {
        HMLog.info(f, d.a);
        return ControlUtils.INSTANCE.pause();
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public boolean play() {
        HMLog.info(f, e.a);
        return ControlUtils.INSTANCE.play();
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public boolean preMusic() {
        HMLog.info(f, f.a);
        return ControlUtils.INSTANCE.preMusic();
    }

    @Override // com.huami.musiccontrol.controller.IPhoneMusicController
    public void setMusicListener(@Nullable IPlayerListener listener) {
        this.outerListener = listener;
    }
}
