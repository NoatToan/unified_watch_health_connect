package org.koin.core.qualifier;

import com.garmin.android.gncs.NotificationConstants;
import k23.d;
import org.koin.ext.KClassExtKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u00060\u0006j\u0002`\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lorg/koin/core/qualifier/TypeQualifier;", "Lorg/koin/core/qualifier/Qualifier;", "Lk23/d;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lk23/d;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lk23/d;", "getType", "()Lk23/d;", "Lorg/koin/core/qualifier/QualifierValue;", "value", "Ljava/lang/String;", "getValue", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TypeQualifier implements Qualifier {
    private final d<?> type;
    private final String value;

    public TypeQualifier(d<?> dVar) {
        dVar.getClass();
        this.type = dVar;
        this.value = KClassExtKt.getFullName(dVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return other != null && TypeQualifier.class == other.getClass() && s.g(getValue(), ((TypeQualifier) other).getValue());
    }

    public final d<?> getType() {
        return this.type;
    }

    @Override // org.koin.core.qualifier.Qualifier
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue();
    }
}
