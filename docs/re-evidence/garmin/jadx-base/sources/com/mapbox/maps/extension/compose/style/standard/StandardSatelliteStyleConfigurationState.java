package com.mapbox.maps.extension.compose.style.standard;

import com.mapbox.maps.extension.compose.style.BooleanValue;
import p005kotlin.Metadata;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007R+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/standard/StandardSatelliteStyleConfigurationState;", "Lcom/mapbox/maps/extension/compose/style/standard/BaseStyleConfigurationState;", "Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "initialShowRoadsAndTransit", "initialShowPedestrianRoads", "<init>", "(Lcom/mapbox/maps/extension/compose/style/BooleanValue;Lcom/mapbox/maps/extension/compose/style/BooleanValue;)V", "()V", "<set-?>", "showRoadsAndTransit$delegate", "Lp3/p1;", "getShowRoadsAndTransit", "()Lcom/mapbox/maps/extension/compose/style/BooleanValue;", "setShowRoadsAndTransit", "(Lcom/mapbox/maps/extension/compose/style/BooleanValue;)V", StandardSatelliteStyleConfigurationState.CONFIG_SHOW_ROADS_AND_TRANSIT, "showPedestrianRoads$delegate", "getShowPedestrianRoads", "setShowPedestrianRoads", StandardSatelliteStyleConfigurationState.CONFIG_SHOW_PEDESTRIAN_ROADS, "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StandardSatelliteStyleConfigurationState extends BaseStyleConfigurationState {
    public static final String CONFIG_SHOW_PEDESTRIAN_ROADS = "showPedestrianRoads";
    public static final String CONFIG_SHOW_ROADS_AND_TRANSIT = "showRoadsAndTransit";

    /* JADX INFO: renamed from: showPedestrianRoads$delegate, reason: from kotlin metadata */
    private final p1 showPedestrianRoads;

    /* JADX INFO: renamed from: showRoadsAndTransit$delegate, reason: from kotlin metadata */
    private final p1 showRoadsAndTransit;

    private StandardSatelliteStyleConfigurationState(BooleanValue booleanValue, BooleanValue booleanValue2) {
        super(null, null, null, null, null, null, 63, null);
        this.showRoadsAndTransit = p0.n(booleanValue);
        this.showPedestrianRoads = p0.n(booleanValue2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BooleanValue getShowPedestrianRoads() {
        return (BooleanValue) this.showPedestrianRoads.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BooleanValue getShowRoadsAndTransit() {
        return (BooleanValue) this.showRoadsAndTransit.getF182175a();
    }

    public final void setShowPedestrianRoads(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.showPedestrianRoads.setValue(booleanValue);
    }

    public final void setShowRoadsAndTransit(BooleanValue booleanValue) {
        booleanValue.getClass();
        this.showRoadsAndTransit.setValue(booleanValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StandardSatelliteStyleConfigurationState() {
        BooleanValue booleanValue = BooleanValue.INITIAL;
        this(booleanValue, booleanValue);
    }
}
