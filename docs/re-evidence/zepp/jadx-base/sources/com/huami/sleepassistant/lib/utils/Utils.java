package com.huami.sleepassistant.lib.utils;

import android.content.Context;
import android.util.TypedValue;
import android.view.inputmethod.InputMethodManager;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/Utils;", "", "", "c", "", "b", "Ljava/util/regex/Pattern;", "a", "", "text", "", "calculateLength", "str", "maxLength", "substring", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "closeSoftInput", "", "dpValue", "dp2px", "Ljava/lang/String;", "TAG", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class Utils {

    @NotNull
    public static final Utils INSTANCE = new Utils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "Utils";

    private Utils() {
    }

    private final Pattern a() {
        return Pattern.compile("[^\\x00-\\xff]");
    }

    private final boolean b(char c) {
        return a().matcher(String.valueOf(c)).matches();
    }

    public final int calculateLength(@NotNull String text) {
        int length = text.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char cCharAt = text.charAt(i);
            i++;
            i2 = b(cCharAt) ? i2 + 2 : i2 + 1;
        }
        return i2;
    }

    public final void closeSoftInput(@NotNull Context context) {
        Objects.requireNonNull(context);
        Object systemService = context.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).toggleSoftInput(0, 2);
    }

    public final float dp2px(@NotNull Context context, float dpValue) {
        return TypedValue.applyDimension(1, dpValue, context.getResources().getDisplayMetrics());
    }

    @NotNull
    public final String substring(@NotNull String str, int maxLength) {
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            i2 = b(str.charAt(i)) ? i2 + 2 : i2 + 1;
            if (i2 > maxLength) {
                break;
            }
            i++;
        }
        return str.substring(0, i);
    }
}
