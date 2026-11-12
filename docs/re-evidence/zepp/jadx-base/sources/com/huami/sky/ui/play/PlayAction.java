package com.huami.sky.ui.play;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/sky/ui/play/PlayAction;", "", "", "SKY_PLAY_NEXT_MUSIC", LogUtil.I, "SKY_FADE_OUT_ANIM", "SKY_PLAY_NEXT_MUSIC_ANIM", "SKY_PLAY_MUSIC_END", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class PlayAction {

    @NotNull
    public static final PlayAction INSTANCE = new PlayAction();
    public static final int SKY_FADE_OUT_ANIM = 5;
    public static final int SKY_PLAY_MUSIC_END = 8;
    public static final int SKY_PLAY_NEXT_MUSIC = 25;
    public static final int SKY_PLAY_NEXT_MUSIC_ANIM = 7;

    private PlayAction() {
    }
}
