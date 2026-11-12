package com.huami.ai.speech.alexa.uitls;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0016\u0010\u0006\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "CODE_400", LogUtil.I, "CODE_403", "CODE_500", "CODE_204", "MAX_RETRY_LATENCY", "", "BEGIN_RETRY_LATENCY", "J", "", "DOWN_CHANNEL_INVALID_TOKEN", "Ljava/lang/String;", "speech-alexa_release"}, k = 2, mv = {1, 5, 1})
public final class ConstantsKt {
    public static final long BEGIN_RETRY_LATENCY = 1000;
    public static final int CODE_204 = 204;
    public static final int CODE_400 = 400;
    public static final int CODE_403 = 403;
    public static final int CODE_500 = 500;

    @NotNull
    public static final String DOWN_CHANNEL_INVALID_TOKEN = "Unable to authenticate the request. Please provide a valid authorization token";
    public static final int MAX_RETRY_LATENCY = 256000;
}
