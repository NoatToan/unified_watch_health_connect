package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class s implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53518a;

    public /* synthetic */ s(int i14) {
        this.f53518a = i14;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f53518a) {
            case 0:
                return Multimaps.access$100((Collection) obj);
            case 1:
                return Tables.access$000((Table.Cell) obj);
            case 2:
                return ((Iterable) obj).iterator();
            case 3:
                return ((Range) obj).upperBound();
            case 4:
                return ((Range) obj).lowerBound();
            default:
                return TreeBasedTable.lambda$createColumnKeyIterator$0((Map) obj);
        }
    }
}
