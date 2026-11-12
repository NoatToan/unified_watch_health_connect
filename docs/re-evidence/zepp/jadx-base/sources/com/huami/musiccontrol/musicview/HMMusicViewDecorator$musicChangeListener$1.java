package com.huami.musiccontrol.musicview;

import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.musiccontrol.bean.VolumeInfo;
import com.huami.musiccontrol.musiccenter.IMusicListener;
import com.huami.musiccontrol.utils.MusicDiff;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R$\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"com/huami/musiccontrol/musicview/HMMusicViewDecorator$musicChangeListener$1", "Lcom/huami/musiccontrol/musiccenter/IMusicListener;", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "state", "", "force", "", "a", "Lcom/huami/musiccontrol/bean/MusicInfo;", "musicInfo", "onPlayerChanged", "onMusicChanged", "onPlayStateChanged", "onNoPermission", "Lcom/huami/musiccontrol/bean/VolumeInfo;", "volume", "onVolumeChanged", "Lcom/huami/musiccontrol/bean/MusicInfo;", "getPreMusic", "()Lcom/huami/musiccontrol/bean/MusicInfo;", "setPreMusic", "(Lcom/huami/musiccontrol/bean/MusicInfo;)V", "preMusic", "b", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "getPrePlayInfo", "()Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "setPrePlayInfo", "(Lcom/huami/musiccontrol/bean/MusicPlayInfo;)V", "prePlayInfo", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final class HMMusicViewDecorator$musicChangeListener$1 implements IMusicListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private MusicInfo preMusic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private MusicPlayInfo prePlayInfo;
    public final /* synthetic */ HMMusicViewDecorator c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ MusicPlayInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MusicPlayInfo musicPlayInfo) {
            super(0);
            this.b = musicPlayInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "drop state: " + this.b + "; pre: " + HMMusicViewDecorator$musicChangeListener$1.this.getPrePlayInfo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ MusicInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MusicInfo musicInfo) {
            super(0);
            this.b = musicInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "drop music info: " + this.b + "; pre: " + HMMusicViewDecorator$musicChangeListener$1.this.getPreMusic();
        }
    }

    public HMMusicViewDecorator$musicChangeListener$1(HMMusicViewDecorator hMMusicViewDecorator) {
        this.c = hMMusicViewDecorator;
    }

    private final void a(MusicPlayInfo state, boolean force) {
        MusicDiff musicDiff = MusicDiff.INSTANCE;
        state.setState(musicDiff.parseState(state.getState()));
        if (musicDiff.diff(this.prePlayInfo, state) || force) {
            this.prePlayInfo = state;
            this.c.showPlayState(state);
        } else {
            HMLog.info("MusicCtrl_MusicView", new a(state));
        }
        MusicPlayInfo musicPlayInfo = this.prePlayInfo;
        if (musicPlayInfo != null) {
            musicPlayInfo.setPosition(state.getPosition());
        }
    }

    @Nullable
    public final MusicInfo getPreMusic() {
        return this.preMusic;
    }

    @Nullable
    public final MusicPlayInfo getPrePlayInfo() {
        return this.prePlayInfo;
    }

    @Override // com.huami.musiccontrol.musiccenter.IMusicListener
    public void onMusicChanged(@NotNull MusicInfo musicInfo) {
        if (!MusicDiff.INSTANCE.diff(this.preMusic, musicInfo)) {
            HMLog.info("MusicCtrl_MusicView", new b(musicInfo));
        } else {
            this.preMusic = musicInfo;
            this.c.showMusic(musicInfo);
        }
    }

    @Override // com.huami.musiccontrol.musiccenter.IMusicListener
    public void onNoPermission() {
        this.c.showNoPermission();
    }

    @Override // com.huami.musiccontrol.musiccenter.IMusicListener
    public void onPlayStateChanged(@NotNull MusicPlayInfo state) {
        a(state, false);
    }

    @Override // com.huami.musiccontrol.musiccenter.IMusicListener
    public void onPlayerChanged(@NotNull MusicInfo musicInfo, @NotNull MusicPlayInfo state) {
        MusicDiff musicDiff = MusicDiff.INSTANCE;
        boolean zDiff = musicDiff.diff(this.preMusic, musicInfo);
        boolean zDiff2 = musicDiff.diff(this.prePlayInfo, state);
        if (zDiff || zDiff2) {
            this.preMusic = musicInfo;
            this.prePlayInfo = state;
            this.c.showMusicAndState(musicInfo, state);
        }
    }

    @Override // com.huami.musiccontrol.musiccenter.IMusicListener
    public void onVolumeChanged(@NotNull VolumeInfo volume) {
        this.c.showVolume(volume);
    }

    public final void setPreMusic(@Nullable MusicInfo musicInfo) {
        this.preMusic = musicInfo;
    }

    public final void setPrePlayInfo(@Nullable MusicPlayInfo musicPlayInfo) {
        this.prePlayInfo = musicPlayInfo;
    }
}
