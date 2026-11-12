package com.mapbox.maps.extension.compose.style.internal;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.TileCacheBudgetInMegabytes;
import com.mapbox.maps.TileCacheBudgetInTiles;
import com.mapbox.maps.extension.compose.style.layers.generated.ClipLayerTypes;
import com.mapbox.maps.extension.compose.style.layers.generated.TextVariableAnchor;
import com.mapbox.maps.extension.compose.style.layers.generated.TextWritingMode;
import com.mapbox.maps.extension.style.types.PromoteId;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o13.p;
import o4.d0;
import o4.f0;
import p005kotlin.Metadata;
import p13.u0;
import p13.y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/internal/ComposeTypeUtils;", "", "()V", "wrapToValue", "Lcom/mapbox/bindgen/Value;", "value", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ComposeTypeUtils {
    public static final ComposeTypeUtils INSTANCE = new ComposeTypeUtils();

    private ComposeTypeUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Value wrapToValue$lambda$2$lambda$0(PromoteId promoteId, String str) {
        promoteId.getClass();
        str.getClass();
        return Value.valueOf(promoteId.getPropertyName());
    }

    public final Value wrapToValue(Object value) {
        value.getClass();
        if (value instanceof d0) {
            return new Value(ColorUtils.INSTANCE.colorToRgbaString(f0.j(((d0) value).f128833a)));
        }
        if (value instanceof TileCacheBudgetInMegabytes) {
            return new Value((HashMap<String, Value>) u0.d(new p("megabytes", new Value(((TileCacheBudgetInMegabytes) value).getSize()))));
        }
        if (value instanceof TileCacheBudgetInTiles) {
            return new Value((HashMap<String, Value>) u0.d(new p("tiles", new Value(((TileCacheBudgetInTiles) value).getSize()))));
        }
        if (value instanceof PromoteId) {
            PromoteId promoteId = (PromoteId) value;
            Value valueOrElse = Value.fromJson(promoteId.getPropertyName()).getValueOrElse(new a(promoteId, 2));
            valueOrElse.getClass();
            Value value2 = valueOrElse;
            if (promoteId.getSourceId() != null) {
                new Value((HashMap<String, Value>) u0.d(new p(promoteId.getSourceId(), value2)));
            }
            return value2;
        }
        if (value instanceof TextWritingMode) {
            return ((TextWritingMode) value).getValue();
        }
        if (value instanceof TextVariableAnchor) {
            return ((TextVariableAnchor) value).getValue();
        }
        if (value instanceof ClipLayerTypes) {
            return ((ClipLayerTypes) value).getValue();
        }
        if (!(value instanceof List)) {
            return TypeUtils.INSTANCE.wrapToValue(value);
        }
        Iterable iterable = (Iterable) value;
        ArrayList arrayList = new ArrayList(y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            arrayList.add(next != null ? INSTANCE.wrapToValue(next) : null);
        }
        return new Value((List<Value>) arrayList);
    }
}
