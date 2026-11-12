package kotlin.reflect.jvm.internal.impl.types.model;

import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public enum TypeVariance {
    IN(Argument.IN),
    OUT(Argument.OUT),
    INV("");


    @NotNull
    private final String presentation;

    TypeVariance(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.presentation;
    }
}
