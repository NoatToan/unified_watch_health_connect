package com.google.maps.android.compose.streetview;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.maps.android.compose.MapNode;
import e23.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewPanoramaApplier;", "Lp3/a;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/StreetViewPanorama;", "streetViewPanorama", "<init>", "(Lcom/google/android/gms/maps/StreetViewPanorama;)V", "", "onClear", "()V", "", FirebaseAnalytics.Param.INDEX, "instance", "insertBottomUp", "(ILcom/google/maps/android/compose/MapNode;)V", "insertTopDown", Constants.MessagePayloadKeys.FROM, "to", "count", "move", "(III)V", "remove", "(II)V", "Lcom/google/android/gms/maps/StreetViewPanorama;", "getStreetViewPanorama", "()Lcom/google/android/gms/maps/StreetViewPanorama;", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StreetViewPanoramaApplier extends p3.a<MapNode> {
    public static final int $stable = 8;
    private final StreetViewPanorama streetViewPanorama;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreetViewPanoramaApplier(StreetViewPanorama streetViewPanorama) {
        super(StreetViewPanoramaNodeRoot.INSTANCE);
        streetViewPanorama.getClass();
        this.streetViewPanorama = streetViewPanorama;
    }

    @Override // p3.c
    public /* bridge */ /* synthetic */ void apply(p pVar, Object obj) {
        super.apply(pVar, obj);
    }

    public final StreetViewPanorama getStreetViewPanorama() {
        return this.streetViewPanorama;
    }

    @Override // p3.c
    public void insertBottomUp(int index, MapNode instance) {
        instance.getClass();
        instance.onAttached();
    }

    @Override // p3.c
    public void move(int from, int to3, int count) {
    }

    @Override // p3.c
    public /* bridge */ /* synthetic */ void onBeginChanges() {
    }

    @Override // p3.a
    public void onClear() {
    }

    @Override // p3.c
    public /* bridge */ /* synthetic */ void onEndChanges() {
    }

    @Override // p3.c
    public void remove(int index, int count) {
    }

    @Override // p3.c
    public /* bridge */ /* synthetic */ void reuse() {
        super.reuse();
    }

    @Override // p3.c
    public void insertTopDown(int index, MapNode instance) {
        instance.getClass();
    }
}
