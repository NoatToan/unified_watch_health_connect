package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class p implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f53515b;

    public /* synthetic */ p(Comparator comparator, int i14) {
        this.f53514a = i14;
        this.f53515b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f53514a) {
            case 0:
                return Iterators.MergingIterator.lambda$new$0(this.f53515b, (PeekingIterator) obj, (PeekingIterator) obj2);
            default:
                return ImmutableSortedMap.lambda$fromEntries$0(this.f53515b, (Map.Entry) obj, (Map.Entry) obj2);
        }
    }
}
