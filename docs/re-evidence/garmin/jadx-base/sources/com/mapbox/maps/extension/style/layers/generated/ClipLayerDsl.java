package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.LayersDsl;
import java.util.List;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p13.j0;
import p13.w;

/* JADX INFO: loaded from: classes3.dex */
@LayersDsl
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H&J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0004H&J\u0018\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0004H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/ClipLayerDsl;", "", "clipLayerScope", "Lcom/mapbox/maps/extension/style/layers/generated/ClipLayer;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "", "", "clipLayerTypes", "filter", "maxZoom", "", "minZoom", "slot", "sourceLayer", "visibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ClipLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ClipLayer clipLayerScope$default(ClipLayerDsl clipLayerDsl, List list, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: clipLayerScope");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = w.c("");
            }
            return clipLayerDsl.clipLayerScope((List<String>) list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ClipLayer clipLayerTypes$default(ClipLayerDsl clipLayerDsl, List list, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: clipLayerTypes");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = j0.f134944a;
            }
            return clipLayerDsl.clipLayerTypes((List<String>) list);
        }
    }

    ClipLayer clipLayerScope(Expression clipLayerScope);

    ClipLayer clipLayerScope(List<String> clipLayerScope);

    ClipLayer clipLayerTypes(Expression clipLayerTypes);

    ClipLayer clipLayerTypes(List<String> clipLayerTypes);

    ClipLayer filter(Expression filter);

    ClipLayer maxZoom(double maxZoom);

    ClipLayer minZoom(double minZoom);

    ClipLayer slot(String slot);

    ClipLayer sourceLayer(String sourceLayer);

    ClipLayer visibility(Expression visibility);

    ClipLayer visibility(Visibility visibility);
}
