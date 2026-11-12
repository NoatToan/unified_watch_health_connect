package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.interactions.FeatureState;
import java.util.HashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsState;", "Lcom/mapbox/maps/interactions/FeatureState;", "internalState", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "highlight", "", "getHighlight$annotations", "()V", "getHighlight", "()Ljava/lang/Boolean;", "getInternalState", "()Lcom/mapbox/bindgen/Value;", "select", "getSelect$annotations", "getSelect", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StandardBuildingsState extends FeatureState {
    private final Value internalState;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsState$Builder;", "Lcom/mapbox/maps/interactions/FeatureState$Builder;", "()V", "build", "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsState;", "highlight", "", "select", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder extends FeatureState.Builder {
        @Override // com.mapbox.maps.interactions.FeatureState.Builder
        public StandardBuildingsState build() {
            if (getRawStateMap().isEmpty()) {
                MapboxLogger.logW(FeatureState.TAG, "Constructing an empty StandardBuildingsState. Is this intended?");
            }
            return new StandardBuildingsState(new Value(getRawStateMap()));
        }

        public final Builder highlight(boolean highlight) {
            HashMap<String, Value> rawStateMap = getRawStateMap();
            Value valueValueOf = Value.valueOf(highlight);
            valueValueOf.getClass();
            rawStateMap.put("highlight", valueValueOf);
            return this;
        }

        public final Builder select(boolean select) {
            HashMap<String, Value> rawStateMap = getRawStateMap();
            Value valueValueOf = Value.valueOf(select);
            valueValueOf.getClass();
            rawStateMap.put("select", valueValueOf);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardBuildingsState(Value value) {
        super(value);
        value.getClass();
        this.internalState = value;
    }

    public static /* synthetic */ void getHighlight$annotations() {
    }

    public static /* synthetic */ void getSelect$annotations() {
    }

    public final Boolean getHighlight() {
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get("highlight");
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }

    @Override // com.mapbox.maps.interactions.FeatureState
    public Value getInternalState() {
        return this.internalState;
    }

    public final Boolean getSelect() {
        Object contents = getInternalState().getContents();
        contents.getClass();
        Value value = (Value) ((HashMap) contents).get("select");
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }
}
