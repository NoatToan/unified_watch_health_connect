package com.mapbox.maps.extension.compose.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.PropertyTypesKt;
import com.mapbox.maps.extension.compose.style.StringListValue;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.layers.Filter;
import com.mapbox.maps.extension.compose.style.layers.LayerInteractionsState;
import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import e23.p;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b1\b\u0007\u0018\u00002\u00020\u0001BI\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\t\b\u0016¢\u0006\u0004\b\u0011\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R1\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\u0013\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001cR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001cR+\u00101\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.*\u0004\b/\u00100R+\u00107\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b2\u00103\"\u0004\b4\u00105*\u0004\b6\u00100R+\u0010=\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b8\u00109\"\u0004\b:\u0010;*\u0004\b<\u00100R+\u0010C\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A*\u0004\bB\u00100R+\u0010G\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bD\u0010?\"\u0004\bE\u0010A*\u0004\bF\u00100R+\u0010M\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K*\u0004\bL\u00100R+\u0010S\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q*\u0004\bR\u00100¨\u0006T"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/layers/generated/ClipLayerState;", "", "Lcom/mapbox/maps/extension/compose/style/StringListValue;", "initialClipLayerScope", "Lcom/mapbox/maps/extension/compose/style/layers/generated/ClipLayerTypesListValue;", "initialClipLayerTypes", "Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "initialVisibility", "Lcom/mapbox/maps/extension/compose/style/LongValue;", "initialMinZoom", "initialMaxZoom", "Lcom/mapbox/maps/extension/compose/style/StringValue;", "initialSourceLayer", "Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "initialFilter", "Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "initialInteractionsState", "<init>", "(Lcom/mapbox/maps/extension/compose/style/StringListValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/ClipLayerTypesListValue;Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/LongValue;Lcom/mapbox/maps/extension/compose/style/StringValue;Lcom/mapbox/maps/extension/compose/style/layers/Filter;Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "()V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "", "UpdateProperties$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/m;I)V", "UpdateProperties", "<set-?>", "interactionsState$delegate", "Lp3/p1;", "getInteractionsState", "()Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;", "setInteractionsState", "(Lcom/mapbox/maps/extension/compose/style/layers/LayerInteractionsState;)V", "getInteractionsState$annotations", "interactionsState", "Lp3/p1;", "clipLayerScopeState", "clipLayerTypesState", "visibilityState", "minZoomState", "maxZoomState", "sourceLayerState", "filterState", "getClipLayerScope", "()Lcom/mapbox/maps/extension/compose/style/StringListValue;", "setClipLayerScope", "(Lcom/mapbox/maps/extension/compose/style/StringListValue;)V", "getClipLayerScope$delegate", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/ClipLayerState;)Ljava/lang/Object;", "clipLayerScope", "getClipLayerTypes", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/ClipLayerTypesListValue;", "setClipLayerTypes", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/ClipLayerTypesListValue;)V", "getClipLayerTypes$delegate", "clipLayerTypes", "getVisibility", "()Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;", "setVisibility", "(Lcom/mapbox/maps/extension/compose/style/layers/generated/VisibilityValue;)V", "getVisibility$delegate", "visibility", "getMinZoom", "()Lcom/mapbox/maps/extension/compose/style/LongValue;", "setMinZoom", "(Lcom/mapbox/maps/extension/compose/style/LongValue;)V", "getMinZoom$delegate", "minZoom", "getMaxZoom", "setMaxZoom", "getMaxZoom$delegate", "maxZoom", "getSourceLayer", "()Lcom/mapbox/maps/extension/compose/style/StringValue;", "setSourceLayer", "(Lcom/mapbox/maps/extension/compose/style/StringValue;)V", "getSourceLayer$delegate", "sourceLayer", "getFilter", "()Lcom/mapbox/maps/extension/compose/style/layers/Filter;", "setFilter", "(Lcom/mapbox/maps/extension/compose/style/layers/Filter;)V", "getFilter$delegate", "filter", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ClipLayerState {
    private final p1<StringListValue> clipLayerScopeState;
    private final p1<ClipLayerTypesListValue> clipLayerTypesState;
    private final p1<Filter> filterState;

    /* JADX INFO: renamed from: interactionsState$delegate, reason: from kotlin metadata */
    private final p1 interactionsState;
    private final p1<LongValue> maxZoomState;
    private final p1<LongValue> minZoomState;
    private final p1<StringValue> sourceLayerState;
    private final p1<VisibilityValue> visibilityState;

    private ClipLayerState(StringListValue stringListValue, ClipLayerTypesListValue clipLayerTypesListValue, VisibilityValue visibilityValue, LongValue longValue, LongValue longValue2, StringValue stringValue, Filter filter, LayerInteractionsState layerInteractionsState) {
        this.interactionsState = p0.n(layerInteractionsState);
        this.clipLayerScopeState = p0.n(stringListValue);
        this.clipLayerTypesState = p0.n(clipLayerTypesListValue);
        this.visibilityState = p0.n(visibilityValue);
        this.minZoomState = p0.n(longValue);
        this.maxZoomState = p0.n(longValue2);
        this.sourceLayerState = p0.n(stringValue);
        this.filterState = p0.n(filter);
    }

    @MapboxExperimental
    public static /* synthetic */ void getInteractionsState$annotations() {
    }

    public final void UpdateProperties$extension_compose_release(LayerNode layerNode, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        o0 o0VarE = mVar.E(1409064545);
        if ((i14 & 14) == 0) {
            i15 = (o0VarE.B(layerNode) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            i15 |= o0VarE.B(this) ? 32 : 16;
        }
        if ((i15 & 91) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.clipLayerScopeState, "clip-layer-scope", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.clipLayerTypesState, "clip-layer-types", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.visibilityState, "visibility", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.minZoomState, "minzoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.maxZoomState, "maxzoom", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.sourceLayerState, "source-layer", o0VarE, 384);
            PropertyTypesKt.ActionWhenNotInitial((p) layerNode.getSetPropertyAction$extension_compose_release(), this.filterState, "filter", o0VarE, 384);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new ClipLayerState$UpdateProperties$1(this, layerNode, i14);
    }

    public final StringListValue getClipLayerScope() {
        return this.clipLayerScopeState.getF182175a();
    }

    public final ClipLayerTypesListValue getClipLayerTypes() {
        return this.clipLayerTypesState.getF182175a();
    }

    public final Filter getFilter() {
        return this.filterState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LayerInteractionsState getInteractionsState() {
        return (LayerInteractionsState) this.interactionsState.getF182175a();
    }

    public final LongValue getMaxZoom() {
        return this.maxZoomState.getF182175a();
    }

    public final LongValue getMinZoom() {
        return this.minZoomState.getF182175a();
    }

    public final StringValue getSourceLayer() {
        return this.sourceLayerState.getF182175a();
    }

    public final VisibilityValue getVisibility() {
        return this.visibilityState.getF182175a();
    }

    public final void setClipLayerScope(StringListValue stringListValue) {
        stringListValue.getClass();
        this.clipLayerScopeState.setValue(stringListValue);
    }

    public final void setClipLayerTypes(ClipLayerTypesListValue clipLayerTypesListValue) {
        clipLayerTypesListValue.getClass();
        this.clipLayerTypesState.setValue(clipLayerTypesListValue);
    }

    public final void setFilter(Filter filter) {
        filter.getClass();
        this.filterState.setValue(filter);
    }

    public final void setInteractionsState(LayerInteractionsState layerInteractionsState) {
        layerInteractionsState.getClass();
        this.interactionsState.setValue(layerInteractionsState);
    }

    public final void setMaxZoom(LongValue longValue) {
        longValue.getClass();
        this.maxZoomState.setValue(longValue);
    }

    public final void setMinZoom(LongValue longValue) {
        longValue.getClass();
        this.minZoomState.setValue(longValue);
    }

    public final void setSourceLayer(StringValue stringValue) {
        stringValue.getClass();
        this.sourceLayerState.setValue(stringValue);
    }

    public final void setVisibility(VisibilityValue visibilityValue) {
        visibilityValue.getClass();
        this.visibilityState.setValue(visibilityValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ClipLayerState() {
        StringListValue stringListValue = StringListValue.INITIAL;
        ClipLayerTypesListValue clipLayerTypesListValue = ClipLayerTypesListValue.INITIAL;
        VisibilityValue visibilityValue = VisibilityValue.INITIAL;
        LongValue longValue = LongValue.INITIAL;
        this(stringListValue, clipLayerTypesListValue, visibilityValue, longValue, longValue, StringValue.INITIAL, Filter.INITIAL, new LayerInteractionsState());
    }
}
