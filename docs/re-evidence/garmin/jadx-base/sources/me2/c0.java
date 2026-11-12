package me2;

import com.google.android.gms.maps.model.TileOverlay;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lme2/c0;", "Lie2/s;", "Lme2/l;", "mapAdapter", "Lie2/t;", "tileOverlayOptions", "Lcom/google/android/gms/maps/model/TileOverlay;", "tileOverlay", "<init>", "(Lme2/l;Lie2/t;Lcom/google/android/gms/maps/model/TileOverlay;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 implements ie2.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f118147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ie2.t f118148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TileOverlay f118149c;

    public c0(l lVar, ie2.t tVar, TileOverlay tileOverlay) {
        lVar.getClass();
        tVar.getClass();
        this.f118147a = lVar;
        this.f118148b = tVar;
        this.f118149c = tileOverlay;
    }

    @Override // ie2.s
    public final void remove() {
        TileOverlay tileOverlay = this.f118149c;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
        this.f118147a.D.remove(this);
    }
}
