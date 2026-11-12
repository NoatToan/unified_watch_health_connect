package org.koin.core.qualifier;

import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a$\u0010\u0002\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0007\u001a\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a$\u0010\t\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0007\u001a\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0011\u0010\u0002\u001a\u00020\u000b\"\u0006\b\u0000\u0010\f\u0018\u0001H\u0086\b\u001a\u0011\u0010\t\u001a\u00020\u000b\"\u0006\b\u0000\u0010\f\u0018\u0001H\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u000b\"\u0006\b\u0000\u0010\f\u0018\u0001H\u0086\b\"+\u0010\t\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0007*\b\u0012\u0004\u0012\u0002H\u00060\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u000f"}, d2 = {"QualifierValue", "", "named", "Lorg/koin/core/qualifier/StringQualifier;", "name", "Lorg/koin/core/qualifier/Qualifier;", "E", "", "enum", "qualifier", "_q", "Lorg/koin/core/qualifier/TypeQualifier;", "T", "getQualifier", "(Ljava/lang/Enum;)Lorg/koin/core/qualifier/Qualifier;", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QualifierKt {
    public static final StringQualifier _q(String str) {
        str.getClass();
        return new StringQualifier(str);
    }

    public static final <E extends Enum<E>> Qualifier getQualifier(Enum<E> r14) {
        r14.getClass();
        String lowerCase = r14.toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return new StringQualifier(lowerCase);
    }

    public static final StringQualifier named(String str) {
        str.getClass();
        return new StringQualifier(str);
    }

    public static final StringQualifier qualifier(String str) {
        str.getClass();
        return new StringQualifier(str);
    }

    public static final <T> TypeQualifier _q() {
        s.l();
        throw null;
    }

    public static final <E extends Enum<E>> Qualifier named(Enum<E> r14) {
        r14.getClass();
        return getQualifier(r14);
    }

    public static final <E extends Enum<E>> Qualifier qualifier(Enum<E> r14) {
        r14.getClass();
        return getQualifier(r14);
    }

    public static final <T> TypeQualifier named() {
        s.l();
        throw null;
    }

    public static final <T> TypeQualifier qualifier() {
        s.l();
        throw null;
    }
}
