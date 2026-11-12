package com.huami.sky.ui.play;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/huami/sky/ui/play/SkyPlayConstant;", "", "", "SKY_PLAY_PAUSE_ACTION", "Ljava/lang/String;", "SKY_PAUSE_ACTION", "SKY_RESTART_ACTION", "SKY_LIKE_ACTION", "SKY_NOT_LIKE_ACTION", "SKY_LOGOUT_ACTION", "SKY_SERVICE_ACTION", "", "SKY_NOT_PLAY_END", LogUtil.I, "SKY_PLAY_END", "REQUEST_MUSIC_FIRST", "REQUEST_MUSIC_NEXT", "REQUEST_MUSIC_BY_TURNS", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlayConstant {

    @NotNull
    public static final SkyPlayConstant INSTANCE = new SkyPlayConstant();
    public static final int REQUEST_MUSIC_BY_TURNS = 0;
    public static final int REQUEST_MUSIC_FIRST = 1;
    public static final int REQUEST_MUSIC_NEXT = 2;

    @NotNull
    public static final String SKY_LIKE_ACTION = "sky.like.action";

    @NotNull
    public static final String SKY_LOGOUT_ACTION = "sky.logout.action";

    @NotNull
    public static final String SKY_NOT_LIKE_ACTION = "sky.not.like.action";
    public static final int SKY_NOT_PLAY_END = 0;

    @NotNull
    public static final String SKY_PAUSE_ACTION = "sky.pause.action";
    public static final int SKY_PLAY_END = 2;

    @NotNull
    public static final String SKY_PLAY_PAUSE_ACTION = "sky.play.pause.action";

    @NotNull
    public static final String SKY_RESTART_ACTION = "sky.restart.action";

    @NotNull
    public static final String SKY_SERVICE_ACTION = "sky.service.action";

    private SkyPlayConstant() {
    }
}
