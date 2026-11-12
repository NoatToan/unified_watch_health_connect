package kotlin;

import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class KotlinVersionCurrentValue {

    @NotNull
    public static final KotlinVersionCurrentValue INSTANCE = new KotlinVersionCurrentValue();

    private KotlinVersionCurrentValue() {
    }

    @JvmStatic
    @NotNull
    public static final KotlinVersion get() {
        return new KotlinVersion(2, 1, 10);
    }
}
