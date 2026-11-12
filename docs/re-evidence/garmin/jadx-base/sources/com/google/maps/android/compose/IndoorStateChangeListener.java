package com.google.maps.android.compose;

import com.google.android.gms.maps.model.IndoorBuilding;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/maps/android/compose/IndoorStateChangeListener;", "", "onIndoorBuildingFocused", "", "onIndoorLevelActivated", "building", "Lcom/google/android/gms/maps/model/IndoorBuilding;", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IndoorStateChangeListener {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onIndoorBuildingFocused(IndoorStateChangeListener indoorStateChangeListener) {
        }

        public static void onIndoorLevelActivated(IndoorStateChangeListener indoorStateChangeListener, IndoorBuilding indoorBuilding) {
            indoorBuilding.getClass();
        }
    }

    void onIndoorBuildingFocused();

    void onIndoorLevelActivated(IndoorBuilding building);
}
