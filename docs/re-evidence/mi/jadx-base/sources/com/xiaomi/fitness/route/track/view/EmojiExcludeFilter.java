package com.xiaomi.fitness.route.track.view;

import android.text.InputFilter;
import android.text.Spanned;
import com.xiaomi.fitness.statistics.StatConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/EmojiExcludeFilter;", "Landroid/text/InputFilter;", "<init>", "()V", "filter", "", "source", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "dest", "Landroid/text/Spanned;", "dstart", "dend", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmojiExcludeFilter implements InputFilter {
    @Override // android.text.InputFilter
    @Nullable
    public CharSequence filter(@NotNull CharSequence source, int start, int end, @NotNull Spanned dest, int dstart, int dend) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        while (start < end) {
            int type = Character.getType(source.charAt(start));
            if (type == 19 || type == 28) {
                return "";
            }
            start++;
        }
        return null;
    }
}
