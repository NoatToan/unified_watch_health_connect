package com.huami.musiccontrol.musiccenter;

import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.musiccontrol.MusicControllerModule;
import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.musiccontrol.bean.MusicState;
import com.huami.musiccontrol.bean.VolumeInfo;
import com.huami.musiccontrol.controller.IPhoneMusicController;
import com.huami.musiccontrol.controller.IVolumeController;
import com.huami.musiccontrol.controller.RemoteMediaController;
import com.huami.musiccontrol.controller.RemoteMediaControllerV19;
import com.huami.musiccontrol.controller.VolumeController;
import com.huami.musiccontrol.player.IPlayer;
import com.huami.musiccontrol.player.IPlayerListener;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 32\u00020\u0001:\u0003435B\t\b\u0002¢\u0006\u0004\b1\u00102J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0017\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u001bR!\u0010 \u001a\u00060\u001dR\u00020\u00008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u0019\u0010\u001fR)\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001e\u0010$R!\u0010)\u001a\u00060&R\u00020\u00008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\b\u0011\u0010(R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00066"}, d2 = {"Lcom/huami/musiccontrol/musiccenter/MusicCenter;", "", "", PointCategory.INIT, "", "deInit", "Lcom/huami/musiccontrol/musiccenter/IMusicListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMusicListener", "nextMusic", "preMusic", "pause", "play", "increaseVolume", "decreaseVolume", "Lcom/huami/musiccontrol/controller/IPhoneMusicController;", "getMusicController", "a", "Lcom/huami/musiccontrol/musiccenter/IMusicListener;", "musicListener", "b", "Lkotlin/Lazy;", "()Lcom/huami/musiccontrol/controller/IPhoneMusicController;", "musicControl", "Lcom/huami/musiccontrol/controller/VolumeController;", "c", "e", "()Lcom/huami/musiccontrol/controller/VolumeController;", "volumeController", "Lcom/huami/musiccontrol/musiccenter/MusicCenter$MusicControllerListener;", GoogleApiAvailabilityLight.a, "()Lcom/huami/musiccontrol/musiccenter/MusicCenter$MusicControllerListener;", "musicControlListener", "", "Lcom/huami/musiccontrol/player/IPlayer;", "Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor;", "()Ljava/util/Map;", "playerAcceptorMap", "Lcom/huami/musiccontrol/musiccenter/MusicCenter$AcceptorListener;", "f", "()Lcom/huami/musiccontrol/musiccenter/MusicCenter$AcceptorListener;", "acceptorListener", "g", "Z", "hasInit", "Ljava/util/concurrent/locks/ReentrantLock;", "h", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "<init>", "()V", "Companion", "AcceptorListener", "MusicControllerListener", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final class MusicCenter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static MusicCenter i = null;
    private static final String j = "MusicCtrl_MusicCenter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private IMusicListener musicListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy musicControl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy volumeController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy musicControlListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy playerAcceptorMap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy acceptorListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean hasInit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final ReentrantLock lock;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016J\u0006\u0010\r\u001a\u00020\u0007R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/musiccontrol/musiccenter/MusicCenter$AcceptorListener;", "Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor$IAcceptorListener;", "Lcom/huami/musiccontrol/player/IPlayer;", "player", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "preState", "curState", "", "onPlayStateChanged", "Lcom/huami/musiccontrol/bean/MusicInfo;", "preMusic", "curMusic", "onMusicChanged", "notifyPlayerChanged", "a", "Lcom/huami/musiccontrol/player/IPlayer;", "getCurPlayer", "()Lcom/huami/musiccontrol/player/IPlayer;", "setCurPlayer", "(Lcom/huami/musiccontrol/player/IPlayer;)V", "curPlayer", "b", "Lcom/huami/musiccontrol/bean/MusicInfo;", "defaultMusic", "c", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "defaultState", "<init>", "(Lcom/huami/musiccontrol/musiccenter/MusicCenter;)V", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public final class AcceptorListener implements MusicInfoAcceptor.IAcceptorListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private IPlayer curPlayer;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final MusicInfo defaultMusic = new MusicInfo(null, null, null, 0, 8, null);

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final MusicPlayInfo defaultState = new MusicPlayInfo(MusicState.STOPPED, 0, 2, null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ IPlayer a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(IPlayer iPlayer) {
                super(0);
                this.a = iPlayer;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "notifyPlayerChanged pkg: " + this.a.getPlayerPkgName();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ MusicPlayInfo a;
            public final /* synthetic */ MusicPlayInfo b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MusicPlayInfo musicPlayInfo, MusicPlayInfo musicPlayInfo2) {
                super(0);
                this.a = musicPlayInfo;
                this.b = musicPlayInfo2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onPlayStateChanged preState: " + this.a + "; curState: " + this.b;
            }
        }

        public AcceptorListener() {
        }

        @Nullable
        public final IPlayer getCurPlayer() {
            return this.curPlayer;
        }

        public final void notifyPlayerChanged() {
            Object next;
            MusicPlayInfo currentStateInfo;
            List<IPlayer> players = MusicCenter.this.b().getPlayers();
            Iterator<T> it2 = players.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                IPlayer iPlayer = (IPlayer) next;
                HMLog.info(MusicCenter.j, new a(iPlayer));
                currentStateInfo = iPlayer.getCurrentStateInfo();
            } while (!((currentStateInfo != null ? currentStateInfo.getState() : null) == MusicState.PLAYING));
            IPlayer iPlayer2 = (IPlayer) next;
            if (iPlayer2 == null && players.size() == 1) {
                iPlayer2 = (IPlayer) CollectionsKt.first((List) players);
            }
            if (iPlayer2 == null) {
                this.curPlayer = null;
                IMusicListener iMusicListener = MusicCenter.this.musicListener;
                if (iMusicListener != null) {
                    iMusicListener.onPlayStateChanged(new MusicPlayInfo(MusicState.STOPPED, 0L, 2, null));
                    return;
                }
                return;
            }
            if (!Intrinsics.areEqual(this.curPlayer, iPlayer2)) {
                this.curPlayer = iPlayer2;
                MusicInfo currentMusicInfo = iPlayer2.getCurrentMusicInfo();
                MusicPlayInfo currentStateInfo2 = iPlayer2.getCurrentStateInfo();
                if (currentMusicInfo == null || currentStateInfo2 == null) {
                    IMusicListener iMusicListener2 = MusicCenter.this.musicListener;
                    if (iMusicListener2 != null) {
                        iMusicListener2.onPlayStateChanged(new MusicPlayInfo(MusicState.STOPPED, 0L, 2, null));
                        return;
                    }
                    return;
                }
                IMusicListener iMusicListener3 = MusicCenter.this.musicListener;
                if (iMusicListener3 != null) {
                    iMusicListener3.onPlayerChanged(currentMusicInfo, currentStateInfo2);
                }
            }
        }

        @Override // com.huami.musiccontrol.musiccenter.MusicInfoAcceptor.IAcceptorListener
        public void onMusicChanged(@NotNull IPlayer player, @Nullable MusicInfo preMusic, @Nullable MusicInfo curMusic) {
            if (!Intrinsics.areEqual(this.curPlayer, player)) {
                notifyPlayerChanged();
                return;
            }
            if (curMusic == null) {
                curMusic = this.defaultMusic;
            }
            IMusicListener iMusicListener = MusicCenter.this.musicListener;
            if (iMusicListener != null) {
                iMusicListener.onMusicChanged(curMusic);
            }
        }

        @Override // com.huami.musiccontrol.musiccenter.MusicInfoAcceptor.IAcceptorListener
        public void onPlayStateChanged(@NotNull IPlayer player, @Nullable MusicPlayInfo preState, @Nullable MusicPlayInfo curState) {
            HMLog.info("AcceptorListener", new b(preState, curState));
            if (!Intrinsics.areEqual(this.curPlayer, player)) {
                notifyPlayerChanged();
                return;
            }
            if (curState == null) {
                curState = this.defaultState;
            }
            IMusicListener iMusicListener = MusicCenter.this.musicListener;
            if (iMusicListener != null) {
                iMusicListener.onPlayStateChanged(curState);
            }
        }

        public final void setCurPlayer(@Nullable IPlayer iPlayer) {
            this.curPlayer = iPlayer;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/musiccontrol/musiccenter/MusicCenter$Companion;", "", "Lcom/huami/musiccontrol/musiccenter/MusicCenter;", "get", DefaultSettingsSpiCall.n, "Lcom/huami/musiccontrol/musiccenter/MusicCenter;", "a", "()Lcom/huami/musiccontrol/musiccenter/MusicCenter;", "b", "(Lcom/huami/musiccontrol/musiccenter/MusicCenter;)V", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        private final MusicCenter a() {
            if (MusicCenter.i == null) {
                MusicCenter.i = new MusicCenter(null);
            }
            return MusicCenter.i;
        }

        private final void b(MusicCenter musicCenter) {
            MusicCenter.i = musicCenter;
        }

        @JvmStatic
        @NotNull
        public final synchronized MusicCenter get() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/musiccontrol/musiccenter/MusicCenter$MusicControllerListener;", "Lcom/huami/musiccontrol/player/IPlayerListener;", "Lcom/huami/musiccontrol/controller/IVolumeController$IVolumeListener;", "Lcom/huami/musiccontrol/player/IPlayer;", "outerPlayer", "Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor;", "a", "Lcom/huami/musiccontrol/bean/MusicInfo;", WebConstant.QueryParam.TYPE_MUSIC, "", "onMusicChanged", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "state", "onPlayStatusChanged", "onSessionDestroyed", "Lcom/huami/musiccontrol/bean/VolumeInfo;", "volumeInfo", "onVolumeChanged", "Lcom/huami/musiccontrol/bean/VolumeInfo;", "preVolume", "<init>", "(Lcom/huami/musiccontrol/musiccenter/MusicCenter;)V", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public final class MusicControllerListener implements IPlayerListener, IVolumeController.IVolumeListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private VolumeInfo preVolume;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ IPlayer a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(IPlayer iPlayer) {
                super(0);
                this.a = iPlayer;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onSessionDestroyed: " + this.a.getPlayerPkgName();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ VolumeInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(VolumeInfo volumeInfo) {
                super(0);
                this.a = volumeInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onVolumeChanged volume is same: " + this.a;
            }
        }

        public MusicControllerListener() {
        }

        private final MusicInfoAcceptor a(IPlayer outerPlayer) {
            MusicInfoAcceptor musicInfoAcceptor = (MusicInfoAcceptor) MusicCenter.this.d().get(outerPlayer);
            if (musicInfoAcceptor != null) {
                return musicInfoAcceptor;
            }
            MusicInfoAcceptor musicInfoAcceptor2 = new MusicInfoAcceptor(outerPlayer, MusicCenter.this.a());
            MusicCenter.this.d().put(outerPlayer, musicInfoAcceptor2);
            return musicInfoAcceptor2;
        }

        @Override // com.huami.musiccontrol.player.IPlayerListener
        public void onMusicChanged(@NotNull IPlayer outerPlayer, @NotNull MusicInfo music) {
            a(outerPlayer).accept(music);
        }

        @Override // com.huami.musiccontrol.player.IPlayerListener
        public void onPlayStatusChanged(@NotNull IPlayer outerPlayer, @NotNull MusicPlayInfo state) {
            a(outerPlayer).accept(state);
        }

        @Override // com.huami.musiccontrol.player.IPlayerListener
        public void onSessionDestroyed(@NotNull IPlayer outerPlayer) {
            HMLog.info(MusicCenter.j, new a(outerPlayer));
            MusicCenter.this.d().remove(outerPlayer);
            MusicCenter.this.a().notifyPlayerChanged();
        }

        @Override // com.huami.musiccontrol.controller.IVolumeController.IVolumeListener
        public void onVolumeChanged(@NotNull VolumeInfo volumeInfo) {
            if (Intrinsics.areEqual(volumeInfo, this.preVolume)) {
                HMLog.info(MusicCenter.j, new b(volumeInfo));
                return;
            }
            IMusicListener iMusicListener = MusicCenter.this.musicListener;
            if (iMusicListener != null) {
                iMusicListener.onVolumeChanged(volumeInfo);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/huami/musiccontrol/musiccenter/MusicCenter$AcceptorListener;", "Lcom/huami/musiccontrol/musiccenter/MusicCenter;", "a", "()Lcom/huami/musiccontrol/musiccenter/MusicCenter$AcceptorListener;"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<AcceptorListener> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AcceptorListener invoke() {
            return MusicCenter.this.new AcceptorListener();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.BooleanRef booleanRef) {
            super(0);
            this.a = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deInit result: " + this.a.element;
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
            return "decreaseVolume failed as has not init";
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
            return "increaseVolume failed as has not init";
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
            return "init return as has init";
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
            return "return as do not has permission";
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
            return "init music control failed!!";
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
            return "init volume control failed!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z, boolean z2) {
            super(0);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "init result controller: " + this.a + " and volume init: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/musiccontrol/controller/IPhoneMusicController;", "a", "()Lcom/huami/musiccontrol/controller/IPhoneMusicController;"}, k = 3, mv = {1, 4, 1})
    public static final class j extends Lambda implements Function0<IPhoneMusicController> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IPhoneMusicController invoke() {
            return Build.VERSION.SDK_INT >= 21 ? new RemoteMediaController() : new RemoteMediaControllerV19();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/huami/musiccontrol/musiccenter/MusicCenter$MusicControllerListener;", "Lcom/huami/musiccontrol/musiccenter/MusicCenter;", "a", "()Lcom/huami/musiccontrol/musiccenter/MusicCenter$MusicControllerListener;"}, k = 3, mv = {1, 4, 1})
    public static final class k extends Lambda implements Function0<MusicControllerListener> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MusicControllerListener invoke() {
            return MusicCenter.this.new MusicControllerListener();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "next music failed as has not init";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pause music failed as has not init";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "play music failed as has not init";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/huami/musiccontrol/player/IPlayer;", "Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class o extends Lambda implements Function0<Map<IPlayer, MusicInfoAcceptor>> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<IPlayer, MusicInfoAcceptor> invoke() {
            return new LinkedHashMap();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pre music failed as has not init";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/musiccontrol/controller/VolumeController;", "a", "()Lcom/huami/musiccontrol/controller/VolumeController;"}, k = 3, mv = {1, 4, 1})
    public static final class q extends Lambda implements Function0<VolumeController> {
        public static final q a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VolumeController invoke() {
            return new VolumeController();
        }
    }

    private MusicCenter() {
        this.musicControl = LazyKt__LazyJVMKt.lazy(j.a);
        this.volumeController = LazyKt__LazyJVMKt.lazy(q.a);
        this.musicControlListener = LazyKt__LazyJVMKt.lazy(new k());
        this.playerAcceptorMap = LazyKt__LazyJVMKt.lazy(o.a);
        this.acceptorListener = LazyKt__LazyJVMKt.lazy(new a());
        this.lock = new ReentrantLock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcceptorListener a() {
        return (AcceptorListener) this.acceptorListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IPhoneMusicController b() {
        return (IPhoneMusicController) this.musicControl.getValue();
    }

    private final MusicControllerListener c() {
        return (MusicControllerListener) this.musicControlListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<IPlayer, MusicInfoAcceptor> d() {
        return (Map) this.playerAcceptorMap.getValue();
    }

    private final VolumeController e() {
        return (VolumeController) this.volumeController.getValue();
    }

    @JvmStatic
    @NotNull
    public static final synchronized MusicCenter get() {
        return INSTANCE.get();
    }

    public final void deInit() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            b().setMusicListener(null);
            e().setVolumeListener(null);
            boolean zDeInit = booleanRef.element & b().deInit();
            booleanRef.element = zDeInit;
            booleanRef.element = zDeInit & e().deInit();
            d().clear();
            a().setCurPlayer(null);
            HMLog.info(j, new b(booleanRef));
            this.hasInit = false;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean decreaseVolume() {
        if (this.hasInit) {
            return e().volumeDown();
        }
        HMLog.info(j, c.a);
        return false;
    }

    @NotNull
    public final IPhoneMusicController getMusicController() {
        return b();
    }

    public final boolean increaseVolume() {
        if (this.hasInit) {
            return e().volumeUp();
        }
        HMLog.info(j, d.a);
        return false;
    }

    public final boolean init() {
        IMusicListener iMusicListener;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.hasInit) {
                HMLog.info(j, e.a);
                return this.hasInit;
            }
            boolean z = false;
            if (!MusicControllerModule.INSTANCE.getInstance().hasPermission$music_control_release()) {
                HMLog.info(j, f.a);
                IMusicListener iMusicListener2 = this.musicListener;
                if (iMusicListener2 != null) {
                    iMusicListener2.onNoPermission();
                }
                return false;
            }
            boolean zInit = b().init();
            if (zInit) {
                b().setMusicListener(c());
                a().notifyPlayerChanged();
            } else {
                HMLog.info(j, g.a);
            }
            boolean zInit2 = e().init();
            if (zInit2) {
                e().setVolumeListener(c());
            } else {
                HMLog.info(j, h.a);
            }
            HMLog.info(j, new i(zInit, zInit2));
            if (zInit2 && zInit) {
                z = true;
            }
            this.hasInit = z;
            if (!z && (iMusicListener = this.musicListener) != null) {
                iMusicListener.onPlayerChanged(new MusicInfo("", "", "", 0L, 8, null), new MusicPlayInfo(MusicState.STOPPED, 0L, 2, null));
            }
            return this.hasInit;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean nextMusic() {
        if (this.hasInit) {
            return b().nextMusic();
        }
        HMLog.info(j, l.a);
        return false;
    }

    public final boolean pause() {
        if (this.hasInit) {
            return b().pause();
        }
        HMLog.info(j, m.a);
        return false;
    }

    public final boolean play() {
        if (this.hasInit) {
            return b().play();
        }
        HMLog.info(j, n.a);
        return false;
    }

    public final boolean preMusic() {
        if (this.hasInit) {
            return b().preMusic();
        }
        HMLog.info(j, p.a);
        return false;
    }

    public final void setMusicListener(@Nullable IMusicListener listener) {
        this.musicListener = listener;
    }

    public /* synthetic */ MusicCenter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
