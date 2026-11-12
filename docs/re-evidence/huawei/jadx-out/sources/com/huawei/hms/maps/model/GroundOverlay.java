package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.model.internal.IGroundOverlayDelegate;
import com.huawei.hms.maps.utils.LogM;

/* JADX INFO: loaded from: classes10.dex */
public final class GroundOverlay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IGroundOverlayDelegate f14243a;

    public void setDimensions(float f) {
        try {
            this.f14243a.setDimension(f);
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "setDimensions RemoteException: " + e.toString());
        }
    }

    public void setDimensions(float f, float f2) {
        try {
            this.f14243a.setDimensions(f, f2);
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "setDimensions RemoteException: " + e.toString());
        }
    }

    public void setZIndex(float f) {
        try {
            this.f14243a.setZIndex(f);
        } catch (RemoteException e) {
            LogM.e("GroundOverlay", "setZIndex RemoteException: " + e.toString());
        }
    }

    public void setVisible(boolean z) {
        try {
            this.f14243a.setVisible(z);
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "setVisible RemoteException: " + e.toString());
        }
    }

    public void setTransparency(float f) {
        try {
            this.f14243a.setTransparency(f);
        } catch (RemoteException e) {
            LogM.e("GroundOverlay", "setTransparency RemoteException: " + e.toString());
        }
    }

    public void setTag(Object obj) {
        try {
            this.f14243a.setTag(ObjectWrapper.wrap(obj));
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "setTag RemoteException: " + e.toString());
        }
    }

    public void setPositionFromBounds(LatLngBounds latLngBounds) {
        try {
            this.f14243a.setPositionFromBounds(latLngBounds);
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "setPositionFromBounds RemoteException: " + e.toString());
        }
    }

    public void setPosition(LatLng latLng) {
        try {
            this.f14243a.setPosition(latLng);
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "setPosition RemoteException: " + e.toString());
        }
    }

    public void setImage(BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, "you should check image , it can not be null.");
        try {
            this.f14243a.setImage(bitmapDescriptor.getObject());
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "setImage RemoteException: " + e.toString());
        }
    }

    public void setClickable(boolean z) {
        try {
            this.f14243a.setClickable(z);
        } catch (RemoteException e) {
            LogM.e("GroundOverlay", "setClickable RemoteException: " + e.toString());
        }
    }

    public void setBearing(float f) {
        try {
            this.f14243a.setBearing(f);
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "setBearing RemoteException: " + e.toString());
        }
    }

    public void remove() {
        try {
            IGroundOverlayDelegate iGroundOverlayDelegate = this.f14243a;
            if (iGroundOverlayDelegate != null) {
                iGroundOverlayDelegate.remove();
            }
        } catch (RemoteException e) {
            LogM.e("GroundOverlay", "remove RemoteException: " + e.toString());
        }
    }

    public boolean isVisible() {
        try {
            return this.f14243a.isVisible();
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "isVisible RemoteException: " + e.toString());
            return true;
        }
    }

    public boolean isClickable() {
        try {
            return this.f14243a.isClickable();
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "isClickable RemoteException: " + e.toString());
            return false;
        }
    }

    public int hashCode() {
        try {
            return this.f14243a.hashCodeRemote();
        } catch (RemoteException e) {
            LogM.e("GroundOverlay", "hashCode RemoteException: " + e.toString());
            return 0;
        }
    }

    public float getZIndex() {
        try {
            return this.f14243a.getZIndex();
        } catch (RemoteException e) {
            LogM.e("GroundOverlay", "getZIndex RemoteException: " + e.toString());
            return -1.0f;
        }
    }

    public float getWidth() {
        try {
            return this.f14243a.getWidth();
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "getWidth RemoteException: " + e.toString());
            return 0.0f;
        }
    }

    public float getTransparency() {
        try {
            return this.f14243a.getTransparency();
        } catch (RemoteException e) {
            LogM.e("GroundOverlay", "getTransparency RemoteException: " + e.toString());
            return -1.0f;
        }
    }

    public Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.f14243a.getTag());
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "getTag RemoteException: " + e.toString());
            return null;
        }
    }

    public LatLng getPosition() {
        try {
            return this.f14243a.getPosition();
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "getPosition RemoteException: " + e.toString());
            return null;
        }
    }

    public String getId() {
        try {
            return this.f14243a.getId();
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "getId RemoteException: " + e.toString());
            return null;
        }
    }

    public float getHeight() {
        try {
            return this.f14243a.getHeight();
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "getHeight RemoteException: " + e.toString());
            return 0.0f;
        }
    }

    public LatLngBounds getBounds() {
        try {
            return this.f14243a.getBounds();
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "getBounds RemoteException: " + e.toString());
            return null;
        }
    }

    public float getBearing() {
        try {
            return this.f14243a.getBearing();
        } catch (RemoteException e) {
            LogM.d("GroundOverlay", "getBearing RemoteException: " + e.toString());
            return 0.0f;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GroundOverlay)) {
            return false;
        }
        try {
            return this.f14243a.equalsRemote(((GroundOverlay) obj).f14243a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public GroundOverlay(IGroundOverlayDelegate iGroundOverlayDelegate) {
        this.f14243a = iGroundOverlayDelegate;
    }
}
