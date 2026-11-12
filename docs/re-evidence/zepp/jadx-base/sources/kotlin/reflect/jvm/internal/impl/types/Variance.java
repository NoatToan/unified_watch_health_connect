package kotlin.reflect.jvm.internal.impl.types;

import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public enum Variance {
    INVARIANT("", true, true, 0),
    IN_VARIANCE(Argument.IN, true, false, -1),
    OUT_VARIANCE(Argument.OUT, false, true, 1);

    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;

    @NotNull
    private final String label;
    private final int superpositionFactor;

    Variance(String str, boolean z, boolean z2, int i) {
        this.label = str;
        this.allowsInPosition = z;
        this.allowsOutPosition = z2;
        this.superpositionFactor = i;
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.label;
    }
}
