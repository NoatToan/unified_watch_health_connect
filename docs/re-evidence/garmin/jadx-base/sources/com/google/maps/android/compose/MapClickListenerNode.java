package com.google.maps.android.compose;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.GoogleMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\t\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/maps/android/compose/MapClickListenerNode;", "", "L", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lkotlin/Function2;", "", "setter", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/google/android/gms/maps/GoogleMap;Le23/p;Ljava/lang/Object;)V", "listenerOrNull", "setListener", "(Ljava/lang/Object;)V", "onAttached", "()V", "onRemoved", "onCleared", "Lcom/google/android/gms/maps/GoogleMap;", "Le23/p;", "Ljava/lang/Object;", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapClickListenerNode<L> implements MapNode {
    public static final int $stable = 8;
    private final L listener;
    private final GoogleMap map;
    private final e23.p<GoogleMap, L, Unit> setter;

    /* JADX WARN: Multi-variable type inference failed */
    public MapClickListenerNode(GoogleMap googleMap, e23.p<? super GoogleMap, ? super L, Unit> pVar, L l14) {
        googleMap.getClass();
        pVar.getClass();
        l14.getClass();
        this.map = googleMap;
        this.setter = pVar;
        this.listener = l14;
    }

    private final void setListener(L listenerOrNull) {
        this.setter.invoke(this.map, listenerOrNull);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onAttached() {
        setListener(this.listener);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onCleared() {
        setListener(null);
    }

    @Override // com.google.maps.android.compose.MapNode
    public void onRemoved() {
        setListener(null);
    }
}
