package kotlin.internal.jdk7;

import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.internal.PlatformImplementations;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class JDK7PlatformImplementations extends PlatformImplementations {
    @Override // kotlin.internal.PlatformImplementations
    public void addSuppressed(@NotNull Throwable th, @NotNull Throwable th2) {
        th.addSuppressed(th2);
    }

    @Override // kotlin.internal.PlatformImplementations
    @NotNull
    public List<Throwable> getSuppressed(@NotNull Throwable th) {
        return ArraysKt___ArraysJvmKt.asList(th.getSuppressed());
    }
}
