package com.huami.musiccontrol.player;

import android.content.Context;
import android.media.session.MediaSession;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.musiccontrol.MusicControllerModule;
import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.musiccontrol.utils.MediaExtKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00060\u0017R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u000e0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Lcom/huami/musiccontrol/player/OuterPlayer;", "Lcom/huami/musiccontrol/player/IPlayer;", "", "a", "", PointCategory.INIT, "destroy", "Lcom/huami/musiccontrol/player/IPlayerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMusicListener", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "getPlaybackState", "Lcom/huami/musiccontrol/bean/MusicInfo;", "getMetadata", "", "getPackageName", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/support/v4/media/session/MediaControllerCompat;", "b", "Landroid/support/v4/media/session/MediaControllerCompat;", "controller", "Lcom/huami/musiccontrol/player/OuterPlayer$InnerCallback;", "c", "Lcom/huami/musiccontrol/player/OuterPlayer$InnerCallback;", "innerCallback", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "playerPkgName", "e", "Lcom/huami/musiccontrol/player/IPlayerListener;", "Landroid/media/session/MediaSession$Token;", "token", "<init>", "(Landroid/media/session/MediaSession$Token;)V", "Companion", "InnerCallback", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final class OuterPlayer implements IPlayer {
    private static final String f = "MusicCtrl_OuterPlayer";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final MediaControllerCompat controller;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InnerCallback innerCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String playerPkgName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private IPlayerListener listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/huami/musiccontrol/player/OuterPlayer$InnerCallback;", "Landroid/support/v4/media/session/MediaControllerCompat$Callback;", "Landroid/support/v4/media/session/PlaybackStateCompat;", "state", "", "onPlaybackStateChanged", "Landroid/support/v4/media/MediaMetadataCompat;", "metadata", "onMetadataChanged", "onSessionDestroyed", "<init>", "(Lcom/huami/musiccontrol/player/OuterPlayer;)V", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public final class InnerCallback extends MediaControllerCompat.Callback {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ MusicInfo b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MusicInfo musicInfo) {
                super(0);
                this.b = musicInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return OuterPlayer.this.playerPkgName + " onMetadataChanged: " + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ MusicPlayInfo b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MusicPlayInfo musicPlayInfo) {
                super(0);
                this.b = musicPlayInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return OuterPlayer.this.playerPkgName + " onPlaybackStateChanged: " + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class c extends Lambda implements Function0<String> {
            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return OuterPlayer.this.playerPkgName + " onSessionDestroyed";
            }
        }

        public InnerCallback() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(@Nullable MediaMetadataCompat metadata) {
            IPlayerListener iPlayerListener;
            MediaMetadataCompat metadata2 = OuterPlayer.this.controller.getMetadata();
            MusicInfo musicInfo = metadata2 != null ? MediaExtKt.getMusicInfo(metadata2) : null;
            HMLog.info(OuterPlayer.f, new a(musicInfo));
            if (musicInfo == null || (iPlayerListener = OuterPlayer.this.listener) == null) {
                return;
            }
            iPlayerListener.onMusicChanged(OuterPlayer.this, musicInfo);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onPlaybackStateChanged(@Nullable PlaybackStateCompat state) {
            IPlayerListener iPlayerListener;
            MusicPlayInfo playingInfo = state != null ? MediaExtKt.getPlayingInfo(state) : null;
            HMLog.info(OuterPlayer.f, new b(playingInfo));
            if (playingInfo == null || (iPlayerListener = OuterPlayer.this.listener) == null) {
                return;
            }
            iPlayerListener.onPlayStatusChanged(OuterPlayer.this, playingInfo);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            HMLog.info(OuterPlayer.f, new c());
            IPlayerListener iPlayerListener = OuterPlayer.this.listener;
            if (iPlayerListener != null) {
                iPlayerListener.onSessionDestroyed(OuterPlayer.this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ignore this exception!!   " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getPlaybackState catch exception: " + this.a;
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
            return "Catch controller.registerCallback error";
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
            return "catch exception: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "catch exception: " + this.a;
        }
    }

    public OuterPlayer(@NotNull MediaSession.Token token) {
        Context appContext = MusicControllerModule.INSTANCE.getInstance().getAppContext();
        this.context = appContext;
        MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(appContext, MediaSessionCompat.Token.fromToken(token));
        this.controller = mediaControllerCompat;
        this.innerCallback = new InnerCallback();
        this.playerPkgName = mediaControllerCompat.getPackageName();
    }

    private final void a() {
        try {
            if (this.controller.isSessionReady()) {
                this.controller.unregisterCallback(this.innerCallback);
            }
        } catch (Exception e2) {
            HMLog.info(f, new a(e2));
        }
    }

    @Override // com.huami.musiccontrol.player.IPlayer
    public void destroy() {
        a();
    }

    @Override // com.huami.musiccontrol.player.IPlayer
    @Nullable
    /* JADX INFO: renamed from: getMetadata */
    public MusicInfo getCurrentMusicInfo() {
        MediaMetadataCompat metadata = this.controller.getMetadata();
        if (metadata != null) {
            return MediaExtKt.getMusicInfo(metadata);
        }
        return null;
    }

    @Override // com.huami.musiccontrol.player.IPlayer
    @NotNull
    /* JADX INFO: renamed from: getPackageName, reason: from getter */
    public String getPlayerPkgName() {
        return this.playerPkgName;
    }

    @Override // com.huami.musiccontrol.player.IPlayer
    @Nullable
    /* JADX INFO: renamed from: getPlaybackState */
    public MusicPlayInfo getCurrentStateInfo() {
        try {
            PlaybackStateCompat playbackState = this.controller.getPlaybackState();
            if (playbackState != null) {
                return MediaExtKt.getPlayingInfo(playbackState);
            }
            return null;
        } catch (Exception e2) {
            HMLog.info(f, new b(e2));
            return null;
        }
    }

    @Override // com.huami.musiccontrol.player.IPlayer
    public boolean init() {
        PlaybackStateCompat playbackState;
        this.controller.unregisterCallback(this.innerCallback);
        try {
            this.controller.registerCallback(this.innerCallback);
        } catch (Exception e2) {
            HMLog.error$default(f, null, e2, c.a, 2, null);
        }
        this.innerCallback.onMetadataChanged(this.controller.getMetadata());
        try {
            playbackState = this.controller.getPlaybackState();
        } catch (Exception e3) {
            HMLog.info(f, new d(e3));
            playbackState = null;
        }
        this.innerCallback.onPlaybackStateChanged(playbackState);
        return true;
    }

    @Override // com.huami.musiccontrol.player.IPlayer
    public void setMusicListener(@Nullable IPlayerListener listener) {
        PlaybackStateCompat playbackState;
        this.listener = listener;
        if (listener == null) {
            return;
        }
        MediaMetadataCompat metadata = this.controller.getMetadata();
        if (metadata != null) {
            listener.onMusicChanged(this, MediaExtKt.getMusicInfo(metadata));
        }
        try {
            playbackState = this.controller.getPlaybackState();
        } catch (Exception e2) {
            HMLog.info(f, new e(e2));
            playbackState = null;
        }
        if (playbackState != null) {
            listener.onPlayStatusChanged(this, MediaExtKt.getPlayingInfo(playbackState));
        }
    }
}
