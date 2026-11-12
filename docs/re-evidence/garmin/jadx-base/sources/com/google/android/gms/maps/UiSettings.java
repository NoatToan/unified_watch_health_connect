package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;

/* JADX INFO: loaded from: classes14.dex */
public final class UiSettings {
    private final IUiSettingsDelegate zza;

    public UiSettings(IUiSettingsDelegate iUiSettingsDelegate) {
        this.zza = iUiSettingsDelegate;
    }

    public boolean isCompassEnabled() {
        try {
            return this.zza.isCompassEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isIndoorLevelPickerEnabled() {
        try {
            return this.zza.isIndoorLevelPickerEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isMapToolbarEnabled() {
        try {
            return this.zza.isMapToolbarEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isMyLocationButtonEnabled() {
        try {
            return this.zza.isMyLocationButtonEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isRotateGesturesEnabled() {
        try {
            return this.zza.isRotateGesturesEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isScrollGesturesEnabled() {
        try {
            return this.zza.isScrollGesturesEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isScrollGesturesEnabledDuringRotateOrZoom() {
        try {
            return this.zza.isScrollGesturesEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isTiltGesturesEnabled() {
        try {
            return this.zza.isTiltGesturesEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isZoomControlsEnabled() {
        try {
            return this.zza.isZoomControlsEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isZoomGesturesEnabled() {
        try {
            return this.zza.isZoomGesturesEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public void setAllGesturesEnabled(boolean z14) {
        try {
            this.zza.setAllGesturesEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setCompassEnabled(boolean z14) {
        try {
            this.zza.setCompassEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setIndoorLevelPickerEnabled(boolean z14) {
        try {
            this.zza.setIndoorLevelPickerEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setMapToolbarEnabled(boolean z14) {
        try {
            this.zza.setMapToolbarEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setMyLocationButtonEnabled(boolean z14) {
        try {
            this.zza.setMyLocationButtonEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setRotateGesturesEnabled(boolean z14) {
        try {
            this.zza.setRotateGesturesEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setScrollGesturesEnabled(boolean z14) {
        try {
            this.zza.setScrollGesturesEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setScrollGesturesEnabledDuringRotateOrZoom(boolean z14) {
        try {
            this.zza.setScrollGesturesEnabledDuringRotateOrZoom(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setTiltGesturesEnabled(boolean z14) {
        try {
            this.zza.setTiltGesturesEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setZoomControlsEnabled(boolean z14) {
        try {
            this.zza.setZoomControlsEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setZoomGesturesEnabled(boolean z14) {
        try {
            this.zza.setZoomGesturesEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }
}
