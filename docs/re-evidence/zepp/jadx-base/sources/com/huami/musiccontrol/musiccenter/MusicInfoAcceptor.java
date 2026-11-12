package com.huami.musiccontrol.musiccenter;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.musiccontrol.player.IPlayer;
import com.huami.musiccontrol.utils.MusicDiff;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 &2\u00020\u0001:\u0003&'(B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010#\u001a\u00020\u001e¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0017\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u000b\u0010\u0016R\u0019\u0010\u001d\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010#\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006)"}, d2 = {"Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor;", "", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "state", "", "c", "Lcom/huami/musiccontrol/bean/MusicInfo;", "metaData", "b", "accept", "<set-?>", "a", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "getCurState", "()Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "curState", "Lcom/huami/musiccontrol/bean/MusicInfo;", "getCurMusicInfo", "()Lcom/huami/musiccontrol/bean/MusicInfo;", "curMusicInfo", "Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor$MusicInfoHandler;", "Lkotlin/Lazy;", "()Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor$MusicInfoHandler;", "handler", "Lcom/huami/musiccontrol/player/IPlayer;", GoogleApiAvailabilityLight.a, "Lcom/huami/musiccontrol/player/IPlayer;", "getPlayer", "()Lcom/huami/musiccontrol/player/IPlayer;", "player", "Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor$IAcceptorListener;", "e", "Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor$IAcceptorListener;", "getListener", "()Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor$IAcceptorListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/huami/musiccontrol/player/IPlayer;Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor$IAcceptorListener;)V", "Companion", "IAcceptorListener", "MusicInfoHandler", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final class MusicInfoAcceptor {
    private static final int f = 1;
    private static final int g = 2;
    private static final long h = 200;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private MusicPlayInfo curState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private MusicInfo curMusicInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy handler = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final IPlayer player;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final IAcceptorListener listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&J$\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&¨\u0006\r"}, d2 = {"Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor$IAcceptorListener;", "", "Lcom/huami/musiccontrol/player/IPlayer;", "player", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "preState", "curState", "", "onPlayStateChanged", "Lcom/huami/musiccontrol/bean/MusicInfo;", "preMusic", "curMusic", "onMusicChanged", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public interface IAcceptorListener {
        void onMusicChanged(@NotNull IPlayer player, @Nullable MusicInfo preMusic, @Nullable MusicInfo curMusic);

        void onPlayStateChanged(@NotNull IPlayer player, @Nullable MusicPlayInfo preState, @Nullable MusicPlayInfo curState);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor$MusicInfoHandler;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor;", "a", "Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor;", "getAcceptor", "()Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor;", "acceptor", "<init>", "(Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor;)V", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public static final class MusicInfoHandler extends Handler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final MusicInfoAcceptor acceptor;

        public MusicInfoHandler(@NotNull MusicInfoAcceptor musicInfoAcceptor) {
            this.acceptor = musicInfoAcceptor;
        }

        @NotNull
        public final MusicInfoAcceptor getAcceptor() {
            return this.acceptor;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            int i = msg.what;
            if (i == MusicInfoAcceptor.g) {
                MusicInfoAcceptor musicInfoAcceptor = this.acceptor;
                Object obj = msg.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.huami.musiccontrol.bean.MusicPlayInfo");
                musicInfoAcceptor.c((MusicPlayInfo) obj);
                return;
            }
            if (i == MusicInfoAcceptor.f) {
                MusicInfoAcceptor musicInfoAcceptor2 = this.acceptor;
                Object obj2 = msg.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.huami.musiccontrol.bean.MusicInfo");
                musicInfoAcceptor2.b((MusicInfo) obj2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor$MusicInfoHandler;", "a", "()Lcom/huami/musiccontrol/musiccenter/MusicInfoAcceptor$MusicInfoHandler;"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<MusicInfoHandler> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MusicInfoHandler invoke() {
            return new MusicInfoHandler(MusicInfoAcceptor.this);
        }
    }

    public MusicInfoAcceptor(@NotNull IPlayer iPlayer, @NotNull IAcceptorListener iAcceptorListener) {
        this.player = iPlayer;
        this.listener = iAcceptorListener;
    }

    private final MusicInfoHandler a() {
        return (MusicInfoHandler) this.handler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(MusicInfo metaData) {
        MusicInfo musicInfo = this.curMusicInfo;
        if (MusicDiff.INSTANCE.diff(musicInfo, metaData)) {
            this.curMusicInfo = metaData;
            this.listener.onMusicChanged(this.player, musicInfo, metaData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(MusicPlayInfo state) {
        MusicPlayInfo musicPlayInfo = this.curState;
        if (MusicDiff.INSTANCE.diff(musicPlayInfo, state)) {
            this.curState = state;
            this.listener.onPlayStateChanged(this.player, musicPlayInfo, state);
        }
    }

    public final void accept(@NotNull MusicInfo metaData) {
        MusicInfoHandler musicInfoHandlerA = a();
        int i = f;
        Message messageObtainMessage = musicInfoHandlerA.obtainMessage(i, metaData);
        a().removeMessages(i);
        a().sendMessageDelayed(messageObtainMessage, h);
    }

    @Nullable
    public final MusicInfo getCurMusicInfo() {
        return this.curMusicInfo;
    }

    @Nullable
    public final MusicPlayInfo getCurState() {
        return this.curState;
    }

    @NotNull
    public final IAcceptorListener getListener() {
        return this.listener;
    }

    @NotNull
    public final IPlayer getPlayer() {
        return this.player;
    }

    public final void accept(@NotNull MusicPlayInfo state) {
        MusicInfoHandler musicInfoHandlerA = a();
        int i = g;
        Message messageObtainMessage = musicInfoHandlerA.obtainMessage(i, state);
        a().removeMessages(i);
        a().sendMessageDelayed(messageObtainMessage, h);
    }
}
