package com.huami.ai.speech.xiaoai.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\"\u0016\u0010\u0005\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0007\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"", "", "toHexadecimalString", "a", LogUtil.I, "RADIX_16", "b", "RADIX_16_SIZE", "speech-xiaoai_release"}, k = 2, mv = {1, 5, 1})
public final class BaseTypeUtilKt {
    private static final int a = 16;
    private static final int b = 6;

    @NotNull
    public static final String toHexadecimalString(int i) {
        String string = Integer.toString(i, a.checkRadix(16));
        Locale locale = Locale.ROOT;
        Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
        String upperCase = string.toUpperCase(locale);
        StringBuilder sb = new StringBuilder();
        int length = (6 - upperCase.length()) - 2;
        if (1 <= length) {
            do {
                length--;
                sb.append("0");
            } while (1 <= length);
        }
        sb.append(upperCase);
        return Intrinsics.stringPlus("0x", sb);
    }
}
