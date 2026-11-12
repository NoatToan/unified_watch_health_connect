package com.google.maps.android.compose.streetview;

import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.maps.android.compose.clustering.d;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003RC\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rRC\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "", "<set-?>", "onClick$delegate", "Lp3/p1;", "getOnClick", "()Le23/l;", "setOnClick", "(Le23/l;)V", "onClick", "onLongClick$delegate", "getOnLongClick", "setOnLongClick", "onLongClick", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StreetViewPanoramaEventListeners {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: onClick$delegate, reason: from kotlin metadata */
    private final p1 onClick = p0.n(new d(4));

    /* JADX INFO: renamed from: onLongClick$delegate, reason: from kotlin metadata */
    private final p1 onLongClick = p0.n(new d(5));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick_delegate$lambda$0(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        streetViewPanoramaOrientation.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLongClick_delegate$lambda$1(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        streetViewPanoramaOrientation.getClass();
        return Unit.INSTANCE;
    }

    public final l<StreetViewPanoramaOrientation, Unit> getOnClick() {
        return (l) this.onClick.getF182175a();
    }

    public final l<StreetViewPanoramaOrientation, Unit> getOnLongClick() {
        return (l) this.onLongClick.getF182175a();
    }

    public final void setOnClick(l<? super StreetViewPanoramaOrientation, Unit> lVar) {
        lVar.getClass();
        this.onClick.setValue(lVar);
    }

    public final void setOnLongClick(l<? super StreetViewPanoramaOrientation, Unit> lVar) {
        lVar.getClass();
        this.onLongClick.setValue(lVar);
    }
}
