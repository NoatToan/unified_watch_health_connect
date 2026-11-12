package com.xiaomi.fitness.common.extensions;

import android.content.Context;
import com.xiaomi.fitness.common.utils.ToastCompat;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0005\u001a4\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001a2\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r"}, d2 = {"toastLong", "", "Landroid/content/Context;", "text", "", "", "toastShort", "toast", "duration", "mode", "dupDelay", "", "show", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ToastExtKt {
    @JvmOverloads
    public static final void show(@NotNull Context context, @NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        show$default(context, text, 0, 0, 0L, 14, null);
    }

    public static /* synthetic */ void show$default(Context context, CharSequence charSequence, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 3500;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = 2;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            j = 0;
        }
        show(context, charSequence, i4, i5, j);
    }

    @JvmOverloads
    public static final void toast(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        toast$default(context, i, 0, 0, 0L, 14, null);
    }

    public static /* synthetic */ void toast$default(Context context, int i, int i2, int i3, long j, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 3500;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = 2;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            j = 0;
        }
        toast(context, i, i5, i6, j);
    }

    public static final void toastLong(@NotNull Context context, @NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        ToastCompat.INSTANCE.showLong(context, text);
    }

    public static final void toastShort(@NotNull Context context, @NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        ToastCompat.INSTANCE.showShort(context, text);
    }

    @JvmOverloads
    public static final void show(@NotNull Context context, @NotNull CharSequence text, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        show$default(context, text, i, 0, 0L, 12, null);
    }

    @JvmOverloads
    public static final void toast(@NotNull Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        toast$default(context, i, i2, 0, 0L, 12, null);
    }

    public static final void toastLong(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ToastCompat.INSTANCE.showLong(context, i);
    }

    public static final void toastShort(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ToastCompat.INSTANCE.showShort(context, i);
    }

    @JvmOverloads
    public static final void show(@NotNull Context context, @NotNull CharSequence text, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        show$default(context, text, i, i2, 0L, 8, null);
    }

    @JvmOverloads
    public static final void toast(@NotNull Context context, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        toast$default(context, i, i2, i3, 0L, 8, null);
    }

    @JvmOverloads
    public static final void show(@NotNull Context context, @NotNull CharSequence text, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        ToastCompat.INSTANCE.show(context, text, i, i2, j);
    }

    @JvmOverloads
    public static final void toast(@NotNull Context context, int i, int i2, int i3, long j) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ToastCompat.INSTANCE.show(context, i, i2, i3, j);
    }
}
