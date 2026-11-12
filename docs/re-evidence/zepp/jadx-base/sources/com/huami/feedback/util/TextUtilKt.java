package com.huami.feedback.util;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000¨\u0006\u0007"}, d2 = {"", "issueDesc", "formatIssueDescription", "value", "", "isPhoneNumFormat", "isWeChatIdFormat", "feedback-impl_release"}, k = 2, mv = {1, 5, 1})
public final class TextUtilKt {
    @NotNull
    public static final String formatIssueDescription(@NotNull String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        str.subSequence(i, length + 1).toString();
        new Regex("\"").replace(str, "'");
        return str;
    }

    public static final boolean isPhoneNumFormat(@NotNull String str) {
        return Pattern.compile("^((\\+86)|(86))?[1]([3-9])[0-9]{9}$").matcher(str).matches();
    }

    public static final boolean isWeChatIdFormat(@NotNull String str) {
        return Pattern.compile("^[a-zA-Z][a-zA-Z\\d_-]{5,19}$").matcher(str).matches();
    }
}
