package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
final class c<T> {
    private final T a;

    @Nullable
    private final Annotations b;

    public c(T t, @Nullable Annotations annotations) {
        this.a = t;
        this.b = annotations;
    }

    public final T a() {
        return this.a;
    }

    @Nullable
    public final Annotations b() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b);
    }

    public int hashCode() {
        T t = this.a;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        Annotations annotations = this.b;
        return iHashCode + (annotations != null ? annotations.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EnhancementResult(result=" + this.a + ", enhancementAnnotations=" + this.b + ')';
    }
}
