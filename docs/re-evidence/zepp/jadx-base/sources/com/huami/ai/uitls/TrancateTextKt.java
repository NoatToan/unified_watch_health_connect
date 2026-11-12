package com.huami.ai.uitls;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0016\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\"\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"", "text", "", "characterMaxLength", "truncateSpeechChatCharacters", "MAX_ASR_SIZE", LogUtil.I, "MAX_WEATHER_DES", "speech-skill_release"}, k = 2, mv = {1, 5, 1})
public final class TrancateTextKt {
    public static final int MAX_ASR_SIZE = 50;
    public static final int MAX_WEATHER_DES = 100;

    @NotNull
    public static final String truncateSpeechChatCharacters(@NotNull String str, int i) {
        if (str.length() >= i) {
            return ((str.length() == 0) || i <= 3) ? str : Intrinsics.stringPlus(str.substring(0, i - 3), "...");
        }
        return str;
    }
}
