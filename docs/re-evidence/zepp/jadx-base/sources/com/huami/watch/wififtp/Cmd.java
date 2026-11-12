package com.huami.watch.wififtp;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.share.internal.MessengerShareContentUtility;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/watch/wififtp/Cmd;", "", "", MessengerShareContentUtility.PREVIEW_DEFAULT, LogUtil.I, "CODE_RUN_OUT_OF_STORAGE", "CODE_TRANS_SOCKET_CLOSE", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class Cmd {
    public static final int CODE_RUN_OUT_OF_STORAGE = 452;
    public static final int CODE_TRANS_SOCKET_CLOSE = 451;
    public static final int DEFAULT = 0;

    @NotNull
    public static final Cmd INSTANCE = new Cmd();

    private Cmd() {
    }
}
