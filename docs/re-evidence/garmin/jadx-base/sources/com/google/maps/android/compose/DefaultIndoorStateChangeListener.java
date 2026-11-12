package com.google.maps.android.compose;

import com.google.android.gms.maps.model.IndoorBuilding;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/maps/android/compose/DefaultIndoorStateChangeListener;", "Lcom/google/maps/android/compose/IndoorStateChangeListener;", "<init>", "()V", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultIndoorStateChangeListener implements IndoorStateChangeListener {
    public static final int $stable = 0;
    public static final DefaultIndoorStateChangeListener INSTANCE = new DefaultIndoorStateChangeListener();

    private DefaultIndoorStateChangeListener() {
    }

    @Override // com.google.maps.android.compose.IndoorStateChangeListener
    public void onIndoorBuildingFocused() {
        IndoorStateChangeListener.DefaultImpls.onIndoorBuildingFocused(this);
    }

    @Override // com.google.maps.android.compose.IndoorStateChangeListener
    public void onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
        IndoorStateChangeListener.DefaultImpls.onIndoorLevelActivated(this, indoorBuilding);
    }
}
