package com.mapbox.maps;

import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import java.util.Iterator;
import ne2.d0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Style.OnStyleLoaded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54406b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f54405a = i14;
        this.f54406b = obj;
    }

    @Override // com.mapbox.maps.Style.OnStyleLoaded
    public final void onStyleLoaded(Style style) {
        int i14 = this.f54405a;
        Object obj = this.f54406b;
        switch (i14) {
            case 0:
                MapController._init_$lambda$2$lambda$1((MapController) obj, style);
                break;
            case 1:
                MapboxMap._init_$lambda$3((MapboxMap) obj, style);
                break;
            case 2:
                MapDelegateProviderImpl.getStyle$lambda$0((e23.l) obj, style);
                break;
            default:
                d0 d0Var = (d0) obj;
                int i15 = d0.f125576h;
                style.getClass();
                Iterator it = d0Var.f125580d.iterator();
                while (it.hasNext()) {
                    style.removeStyleLayer(((LineLayer) it.next()).getLayerId());
                }
                Iterator it3 = d0Var.f125579c.iterator();
                while (it3.hasNext()) {
                    style.removeStyleSource(((GeoJsonSource) it3.next()).getSourceId());
                }
                break;
        }
    }
}
