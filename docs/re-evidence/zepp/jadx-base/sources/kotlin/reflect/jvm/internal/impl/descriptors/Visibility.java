package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Visibility {

    @NotNull
    private final String a;
    private final boolean b;

    public Visibility(@NotNull String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Nullable
    public Integer compareTo(@NotNull Visibility visibility) {
        return Visibilities.INSTANCE.compareLocal$compiler_common(this, visibility);
    }

    @NotNull
    public String getInternalDisplayName() {
        return this.a;
    }

    public final boolean isPublicAPI() {
        return this.b;
    }

    @NotNull
    public Visibility normalize() {
        return this;
    }

    @NotNull
    public final String toString() {
        return getInternalDisplayName();
    }
}
