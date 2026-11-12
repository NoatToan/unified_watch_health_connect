package com.google.common.collect;

import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
interface SortedMultisetBridge<E> extends Multiset<E> {
    @Override // 
    SortedSet<E> elementSet();
}
