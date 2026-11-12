package com.huawei.hms.maps;

import android.os.RemoteException;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.internal.IUiSettingsDelegate;
import com.huawei.hms.maps.model.BitmapDescriptor;
import com.huawei.hms.maps.utils.LogM;

/* JADX INFO: loaded from: classes10.dex */
public class UiSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IUiSettingsDelegate f14158a;

    public void setZoomGesturesEnabled(boolean z) {
        try {
            this.f14158a.setZoomGesturesEnabled(z);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setZoomGesturesEnabled RemoteException: " + e.toString());
        }
    }

    public void setZoomControlsEnabled(boolean z) {
        try {
            this.f14158a.setZoomControlsEnabled(z);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setZoomControlsEnabled RemoteException: " + e.toString());
        }
    }

    public void setTiltGesturesEnabled(boolean z) {
        try {
            this.f14158a.setTiltGesturesEnabled(z);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setTiltGesturesEnabled RemoteException: " + e.toString());
        }
    }

    public void setScrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        try {
            this.f14158a.setScrollGesturesEnabledDuringRotateOrZoom(z);
        } catch (RemoteException e) {
            LogM.e("UISettings", "setScrollGesturesEnabledDuringRotateOrZoom RemoteException: " + e.toString());
        }
    }

    public void setScrollGesturesEnabled(boolean z) {
        try {
            this.f14158a.setScrollGesturesEnabled(z);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setScrollGesturesEnabled RemoteException: " + e.toString());
        }
    }

    public void setScaleVisible(boolean z) {
        try {
            this.f14158a.setScaleVisible(z);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setScaleVisible RemoteException: " + e.toString());
        }
    }

    public void setRotateGesturesEnabled(boolean z) {
        try {
            this.f14158a.setRotateGesturesEnabled(z);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setRotateGesturesEnabled RemoteException: " + e.toString());
        }
    }

    public void setMyLocationButtonEnabled(boolean z) {
        try {
            this.f14158a.setMyLocationButtonEnabled(z);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setMyLocationButtonEnabled RemoteException: " + e.toString());
        }
    }

    public void setMarkerClusterTextColor(int i) {
        try {
            this.f14158a.setMarkerClusterTextColor(i);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setMarkerClusterColor RemoteException: " + e.toString());
        }
    }

    public void setMarkerClusterIcon(BitmapDescriptor bitmapDescriptor) {
        IObjectWrapper object;
        IUiSettingsDelegate iUiSettingsDelegate;
        try {
            if (bitmapDescriptor == null) {
                iUiSettingsDelegate = this.f14158a;
                object = ObjectWrapper.wrap(null);
            } else {
                IUiSettingsDelegate iUiSettingsDelegate2 = this.f14158a;
                object = bitmapDescriptor.getObject();
                iUiSettingsDelegate = iUiSettingsDelegate2;
            }
            iUiSettingsDelegate.setMarkerClusterIcon(object);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setMarkerClusterIcon RemoteException: " + e.toString());
        }
    }

    public void setMarkerClusterColor(int i) {
        try {
            this.f14158a.setMarkerClusterColor(i);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setMarkerClusterColor RemoteException: " + e.toString());
        }
    }

    public void setMapToolbarEnabled(boolean z) {
        try {
            this.f14158a.setMapToolbarEnabled(z);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setMyLocationButtonEnabled RemoteException: " + e.toString());
        }
    }

    public void setLogoPosition(int i) {
        switch (i) {
            case ExerciseSessionRecord.EXERCISE_TYPE_WEIGHTLIFTING /* 81 */:
            case 8388659:
            case 8388661:
            case 8388691:
            case 8388693:
                try {
                    this.f14158a.setLogoPosition(i);
                } catch (RemoteException e) {
                    LogM.d("UISettings", "setLogoPosition RemoteException: " + e.toString());
                }
                break;
        }
    }

    public void setLogoPadding(int i, int i2, int i3, int i4) {
        try {
            this.f14158a.setLogoPadding(i, i2, i3, i4);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setLogoPadding RemoteException: " + e.toString());
        }
    }

    public void setIndoorLevelPickerPadding(int i, int i2, int i3, int i4) {
        try {
            this.f14158a.setIndoorLevelPickerPadding(i, i2, i3, i4);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setIndoorLevelPickerPadding RemoteException: " + e.toString());
        }
    }

    public void setIndoorLevelPickerEnabled(boolean z) {
        try {
            this.f14158a.setIndoorLevelPickerEnabled(z);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setIndoorLevelPickerEnabled RemoteException: " + e.toString());
        }
    }

    public void setGestureScaleByMapCenter(boolean z) {
        try {
            this.f14158a.setGestureScaleByMapCenter(z);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setGestureScaleByMapCenter RemoteException: " + e.toString());
        }
    }

    public void setCompassEnabled(boolean z) {
        try {
            this.f14158a.setCompassEnabled(z);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setCompassEnabled RemoteException: " + e.toString());
        }
    }

    public void setAllGesturesEnabled(boolean z) {
        try {
            this.f14158a.setAllGesturesEnabled(z);
        } catch (RemoteException e) {
            LogM.d("UISettings", "setAllGesturesEnabled RemoteException: " + e.toString());
        }
    }

    public boolean isZoomGesturesEnabled() {
        try {
            return this.f14158a.isZoomGesturesEnabled();
        } catch (RemoteException e) {
            LogM.d("UISettings", "isZoomGesturesEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isZoomControlsEnabled() {
        try {
            return this.f14158a.isZoomControlsEnabled();
        } catch (RemoteException e) {
            LogM.d("UISettings", "isZoomControlsEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isTiltGesturesEnabled() {
        try {
            return this.f14158a.isTiltGesturesEnabled();
        } catch (RemoteException e) {
            LogM.d("UISettings", "isTiltGesturesEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isScrollGesturesEnabledDuringRotateOrZoom() {
        try {
            return this.f14158a.isScrollGesturesEnabledDuringRotateOrZoom();
        } catch (RemoteException e) {
            LogM.e("UISettings", "isScrollGesturesEnabledDuringRotateOrZoom RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isScrollGesturesEnabled() {
        try {
            return this.f14158a.isScrollGesturesEnabled();
        } catch (RemoteException e) {
            LogM.d("UISettings", "isScrollGesturesEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isRotateGesturesEnabled() {
        try {
            return this.f14158a.isRotateGesturesEnabled();
        } catch (RemoteException e) {
            LogM.d("UISettings", "isRotateGesturesEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isMyLocationButtonEnabled() {
        try {
            return this.f14158a.isMyLocationButtonEnabled();
        } catch (RemoteException e) {
            LogM.d("UISettings", "isMyLocationButtonEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isMapToolbarEnabled() {
        try {
            return this.f14158a.isMapToolbarEnabled();
        } catch (RemoteException e) {
            LogM.d("UISettings", "isMapToolbarEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isIndoorLevelPickerEnabled() {
        try {
            return this.f14158a.isIndoorLevelPickerEnabled();
        } catch (RemoteException e) {
            LogM.d("UISettings", "isIndoorLevelPickerEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isCompassEnabled() {
        try {
            return this.f14158a.isCompassEnabled();
        } catch (RemoteException e) {
            LogM.d("UISettings", "isCompassEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public UiSettings(IUiSettingsDelegate iUiSettingsDelegate) {
        LogM.d("UISettings", "UISettings: ");
        this.f14158a = iUiSettingsDelegate;
    }
}
