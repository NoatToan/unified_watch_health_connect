package androidx.work;

import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.ppe;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\bø\u0001\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\bø\u0001\u0000\u001a\"\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\bø\u0001\u0000\u001a*\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\bø\u0001\u0000\u001a\"\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\bø\u0001\u0000\u001a*\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"logd", "", "tag", "", "block", "Lkotlin/Function0;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "loge", "logi", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LoggerExtKt {
    public static final void logd(@NotNull String tag, @NotNull Function0<String> block) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        ppe.e().a(tag, block.invoke());
    }

    public static final void loge(@NotNull String tag, @NotNull Function0<String> block) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        ppe.e().c(tag, block.invoke());
    }

    public static final void logi(@NotNull String tag, @NotNull Function0<String> block) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        ppe.e().f(tag, block.invoke());
    }

    public static final void logd(@NotNull String tag, @NotNull Throwable t, @NotNull Function0<String> block) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(block, "block");
        ppe.e().b(tag, block.invoke(), t);
    }

    public static final void loge(@NotNull String tag, @NotNull Throwable t, @NotNull Function0<String> block) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(block, "block");
        ppe.e().d(tag, block.invoke(), t);
    }

    public static final void logi(@NotNull String tag, @NotNull Throwable t, @NotNull Function0<String> block) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(block, "block");
        ppe.e().g(tag, block.invoke(), t);
    }
}
