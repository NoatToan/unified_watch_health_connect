package com.google.maps.android.compose;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0092\u0001\u0010\f\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00000\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00050\u00052\u0006\u0010\t\u001a\u00028\u00012 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00050\u0005H\u0082\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/maps/android/compose/MapNode;", "NodeT", "I", "O", "", "Lkotlin/Function1;", "", "nodeMatchPredicate", "nodeInputCallback", "marker", "Lcom/google/maps/android/compose/InputHandlerNode;", "inputHandlerCallback", "findInputCallback", "(Ljava/lang/Iterable;Le23/l;Le23/l;Ljava/lang/Object;Le23/l;)Z", "maps-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MapApplierKt {
    private static final <NodeT extends MapNode, I, O> boolean findInputCallback(Iterable<? extends MapNode> iterable, e23.l<? super NodeT, Boolean> lVar, e23.l<? super NodeT, ? extends e23.l<? super I, ? extends O>> lVar2, I i14, e23.l<? super InputHandlerNode, ? extends e23.l<? super I, ? extends O>> lVar3) {
        Iterator<? extends MapNode> it = iterable.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        p005kotlin.jvm.internal.s.l();
        throw null;
    }
}
