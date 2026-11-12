package com.huami.musiccontrol.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.musiccontrol.bean.MusicState;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/musiccontrol/utils/MusicDiff;", "", "Lcom/huami/musiccontrol/bean/MusicInfo;", WebConstant.QueryParam.TYPE_MUSIC, "", "a", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "playInfo", "b", "preMusic", "currentMusic", "diff", "prePlayInfo", "currentPlayInfo", "Lcom/huami/musiccontrol/bean/MusicState;", "state", "parseState", "", "Ljava/lang/String;", "TAG", "", LogUtil.I, "MAX_DIFF_POSITION", "<init>", "()V", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final class MusicDiff {

    @NotNull
    public static final MusicDiff INSTANCE = new MusicDiff();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "MusicCtrl_MusicDiff";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int MAX_DIFF_POSITION = 3000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ MusicInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MusicInfo musicInfo) {
            super(0);
            this.a = musicInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "diff failed as other music is invalid, other music: " + this.a;
        }
    }

    private MusicDiff() {
    }

    private final boolean a(MusicInfo music) {
        return music != null && music.getDuration() > 0;
    }

    private final boolean b(MusicPlayInfo playInfo) {
        return playInfo != null && playInfo.getPosition() >= 0;
    }

    public final boolean diff(@Nullable MusicInfo preMusic, @Nullable MusicInfo currentMusic) {
        if (a(currentMusic)) {
            return preMusic == null || (Intrinsics.areEqual(preMusic.getArtist(), currentMusic.getArtist()) ^ true) || (Intrinsics.areEqual(preMusic.getAlbum(), currentMusic.getAlbum()) ^ true) || (Intrinsics.areEqual(preMusic.getTitle(), currentMusic.getTitle()) ^ true) || preMusic.getDuration() != currentMusic.getDuration();
        }
        HMLog.info(TAG, new a(currentMusic));
        return false;
    }

    @NotNull
    public final MusicState parseState(@NotNull MusicState state) {
        return state == MusicState.BUFFERING ? MusicState.PAUSED : state;
    }

    public final boolean diff(@Nullable MusicPlayInfo prePlayInfo, @Nullable MusicPlayInfo currentPlayInfo) {
        return prePlayInfo == null || parseState(prePlayInfo.getState()) != parseState(currentPlayInfo.getState()) || Math.abs(prePlayInfo.getPosition() - currentPlayInfo.getPosition()) >= ((long) 3000);
    }
}
