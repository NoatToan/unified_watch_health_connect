package org.apache.commons.text.lookup;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface BiStringLookup<U> extends StringLookup {
    default String lookup(String str, U u8) {
        return lookup(str);
    }
}
