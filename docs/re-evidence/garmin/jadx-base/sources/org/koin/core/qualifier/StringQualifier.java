package org.koin.core.qualifier;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\u0003H\u0016J\r\u0010\n\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\u000b\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lorg/koin/core/qualifier/StringQualifier;", "Lorg/koin/core/qualifier/Qualifier;", "value", "", "Lorg/koin/core/qualifier/QualifierValue;", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "component1", "copy", "equals", "", "other", "", "hashCode", "", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StringQualifier implements Qualifier {
    private final String value;

    public StringQualifier(String str) {
        str.getClass();
        this.value = str;
    }

    public static /* synthetic */ StringQualifier copy$default(StringQualifier stringQualifier, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = stringQualifier.value;
        }
        return stringQualifier.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final StringQualifier copy(String value) {
        value.getClass();
        return new StringQualifier(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StringQualifier) && s.g(this.value, ((StringQualifier) other).value);
    }

    @Override // org.koin.core.qualifier.Qualifier
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return getValue();
    }
}
