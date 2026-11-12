package org.koin.core.qualifier;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\r\u0010\u0005\u001a\u00060\u0002j\u0002`\u0004HÆ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0006\u001a\u00060\u0002j\u0002`\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R \u0010\u0006\u001a\u00060\u0002j\u0002`\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lorg/koin/core/qualifier/StringQualifier;", "Lorg/koin/core/qualifier/Qualifier;", "", "toString", "Lorg/koin/core/qualifier/QualifierValue;", "component1", "value", "copy", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StringQualifier implements Qualifier {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String value;

    public StringQualifier(@NotNull String str) {
        this.value = str;
    }

    public static /* synthetic */ StringQualifier copy$default(StringQualifier stringQualifier, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringQualifier.getValue();
        }
        return stringQualifier.copy(str);
    }

    @NotNull
    public final String component1() {
        return getValue();
    }

    @NotNull
    public final StringQualifier copy(@NotNull String value) {
        return new StringQualifier(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StringQualifier) && Intrinsics.areEqual(getValue(), ((StringQualifier) other).getValue());
    }

    @Override // org.koin.core.qualifier.Qualifier
    @NotNull
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    @NotNull
    public String toString() {
        return getValue();
    }
}
