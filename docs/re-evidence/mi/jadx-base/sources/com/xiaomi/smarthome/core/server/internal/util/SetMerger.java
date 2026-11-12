package com.xiaomi.smarthome.core.server.internal.util;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: loaded from: classes10.dex */
public class SetMerger extends DefMerger {
    @Override // com.xiaomi.smarthome.core.server.internal.util.DefMerger
    public Collection<?> mergeCollection(Collection<?> collection, Collection<?> collection2) {
        if (collection == null) {
            return collection2;
        }
        if (collection2 == null) {
            return collection;
        }
        if (collection.size() == 0) {
            return collection2;
        }
        if (collection2.size() == 0) {
            return collection;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(collection);
        hashSet.addAll(collection2);
        return hashSet;
    }
}
