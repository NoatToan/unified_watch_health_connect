package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ModuleCapability<T> {

    @NotNull
    private final String a;

    public ModuleCapability(@NotNull String str) {
        this.a = str;
    }

    @NotNull
    public String toString() {
        return this.a;
    }
}
