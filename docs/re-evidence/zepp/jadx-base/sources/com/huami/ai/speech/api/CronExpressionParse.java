package com.huami.ai.speech.api;

import java.text.ParseException;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0002R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/ai/speech/api/CronExpressionParse;", "", "", "text", "", "a", "getDayOfWeek", "getDayOfMonth", "getMonthOfYear", "", "[Ljava/lang/String;", "array", "expression", "<init>", "(Ljava/lang/String;)V", "Companion", "speech-api_release"}, k = 1, mv = {1, 5, 1})
public final class CronExpressionParse {
    private static final int b = 3;
    private static final int c = 4;
    private static final int d = 5;
    private static final int e = 5;
    private static final int f = 6;
    private static final int g = 7;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String[] array;

    public CronExpressionParse(@NotNull String str) throws ParseException {
        String[] strArr = {"", "", "", "", "", "", ""};
        this.array = strArr;
        if (str.length() == 0) {
            throw new IllegalArgumentException("空表达式");
        }
        Object[] array = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr2 = (String[]) array;
        if (strArr2.length < 5) {
            throw new ParseException(str, 0);
        }
        if (strArr2.length == 5) {
            System.arraycopy(strArr2, 0, strArr, 1, 5);
            return;
        }
        if (strArr2.length != 6) {
            if (strArr2.length != 7) {
                throw new ParseException(str, 7);
            }
            System.arraycopy(strArr2, 0, strArr, 0, 7);
        } else if (Pattern.compile("(.*)\\d{4}$").matcher(strArr2[5]).matches()) {
            System.arraycopy(strArr2, 0, strArr, 1, 6);
        } else {
            System.arraycopy(strArr2, 0, strArr, 0, 6);
        }
    }

    private final boolean a(String text) {
        if (text.length() == 0) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char cCharAt = text.charAt(i);
            if (!Character.isDigit(cCharAt) && cCharAt != ',') {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final String getDayOfMonth() {
        if (a(this.array[3])) {
            return this.array[3];
        }
        return null;
    }

    @Nullable
    public final String getDayOfWeek() {
        if (a(this.array[5])) {
            return this.array[5];
        }
        return null;
    }

    @Nullable
    public final String getMonthOfYear() {
        if (a(this.array[4])) {
            return this.array[4];
        }
        return null;
    }
}
