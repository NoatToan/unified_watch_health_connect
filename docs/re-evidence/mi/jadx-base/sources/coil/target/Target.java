package coil.target;

import android.graphics.drawable.Drawable;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0017J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0017J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0017¨\u0006\n"}, d2 = {"Lcoil/target/Target;", "", "onError", "", "error", "Landroid/graphics/drawable/Drawable;", LifecycleConstantKt.ON_START, "placeholder", "onSuccess", "result", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface Target {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onError(@NotNull Target target, @Nullable Drawable drawable) {
        }

        public static void onStart(@NotNull Target target, @Nullable Drawable drawable) {
        }

        public static void onSuccess(@NotNull Target target, @NotNull Drawable drawable) {
        }
    }

    void onError(@Nullable Drawable error);

    void onStart(@Nullable Drawable placeholder);

    void onSuccess(@NotNull Drawable result);
}
