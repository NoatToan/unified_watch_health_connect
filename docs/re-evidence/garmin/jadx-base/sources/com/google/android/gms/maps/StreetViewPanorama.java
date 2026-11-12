package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;

/* JADX INFO: loaded from: classes14.dex */
public class StreetViewPanorama {
    private final IStreetViewPanoramaDelegate zza;

    public interface OnStreetViewPanoramaCameraChangeListener {
        void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    public interface OnStreetViewPanoramaChangeListener {
        void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    public interface OnStreetViewPanoramaClickListener {
        void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public interface OnStreetViewPanoramaLongClickListener {
        void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public StreetViewPanorama(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.zza = (IStreetViewPanoramaDelegate) Preconditions.checkNotNull(iStreetViewPanoramaDelegate, "delegate");
    }

    public void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j8) {
        Preconditions.checkNotNull(streetViewPanoramaCamera);
        try {
            this.zza.animateTo(streetViewPanoramaCamera, j8);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public StreetViewPanoramaLocation getLocation() {
        try {
            return this.zza.getStreetViewPanoramaLocation();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public StreetViewPanoramaCamera getPanoramaCamera() {
        try {
            return this.zza.getPanoramaCamera();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public boolean isPanningGesturesEnabled() {
        try {
            return this.zza.isPanningGesturesEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isStreetNamesEnabled() {
        try {
            return this.zza.isStreetNamesEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isUserNavigationEnabled() {
        try {
            return this.zza.isUserNavigationEnabled();
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

    public Point orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        try {
            IObjectWrapper iObjectWrapperOrientationToPoint = this.zza.orientationToPoint(streetViewPanoramaOrientation);
            if (iObjectWrapperOrientationToPoint == null) {
                return null;
            }
            return (Point) ObjectWrapper.unwrap(iObjectWrapperOrientationToPoint);
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public StreetViewPanoramaOrientation pointToOrientation(Point point) {
        try {
            return this.zza.pointToOrientation(ObjectWrapper.wrap(point));
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate = this.zza;
        try {
            if (onStreetViewPanoramaCameraChangeListener == null) {
                iStreetViewPanoramaDelegate.setOnStreetViewPanoramaCameraChangeListener(null);
            } else {
                iStreetViewPanoramaDelegate.setOnStreetViewPanoramaCameraChangeListener(new zzak(this, onStreetViewPanoramaCameraChangeListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnStreetViewPanoramaChangeListener(OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate = this.zza;
        try {
            if (onStreetViewPanoramaChangeListener == null) {
                iStreetViewPanoramaDelegate.setOnStreetViewPanoramaChangeListener(null);
            } else {
                iStreetViewPanoramaDelegate.setOnStreetViewPanoramaChangeListener(new zzaj(this, onStreetViewPanoramaChangeListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnStreetViewPanoramaClickListener(OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate = this.zza;
        try {
            if (onStreetViewPanoramaClickListener == null) {
                iStreetViewPanoramaDelegate.setOnStreetViewPanoramaClickListener(null);
            } else {
                iStreetViewPanoramaDelegate.setOnStreetViewPanoramaClickListener(new zzal(this, onStreetViewPanoramaClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnStreetViewPanoramaLongClickListener(OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener) {
        IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate = this.zza;
        try {
            if (onStreetViewPanoramaLongClickListener == null) {
                iStreetViewPanoramaDelegate.setOnStreetViewPanoramaLongClickListener(null);
            } else {
                iStreetViewPanoramaDelegate.setOnStreetViewPanoramaLongClickListener(new zzam(this, onStreetViewPanoramaLongClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setPanningGesturesEnabled(boolean z14) {
        try {
            this.zza.enablePanning(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setPosition(LatLng latLng) {
        try {
            this.zza.setPosition(latLng);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setStreetNamesEnabled(boolean z14) {
        try {
            this.zza.enableStreetNames(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setUserNavigationEnabled(boolean z14) {
        try {
            this.zza.enableUserNavigation(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setZoomGesturesEnabled(boolean z14) {
        try {
            this.zza.enableZoom(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setPosition(LatLng latLng, int i14) {
        try {
            this.zza.setPositionWithRadius(latLng, i14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setPosition(LatLng latLng, int i14, StreetViewSource streetViewSource) {
        try {
            this.zza.setPositionWithRadiusAndSource(latLng, i14, streetViewSource);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setPosition(LatLng latLng, StreetViewSource streetViewSource) {
        try {
            this.zza.setPositionWithSource(latLng, streetViewSource);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setPosition(String str) {
        try {
            this.zza.setPositionWithID(str);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }
}
