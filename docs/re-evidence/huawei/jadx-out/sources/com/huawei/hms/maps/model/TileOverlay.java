package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.maps.model.internal.ITileOverlayDelegate;

/* JADX INFO: loaded from: classes34.dex */
public final class TileOverlay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ITileOverlayDelegate f14281a;

    public void setZIndex(float f) {
        try {
            this.f14281a.setZIndex(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setVisible(boolean z) {
        try {
            this.f14281a.setVisible(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setTransparency(float f) {
        try {
            this.f14281a.setTransparency(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setFadeIn(boolean z) {
        try {
            this.f14281a.setFadeIn(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void remove() {
        try {
            this.f14281a.remove();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isVisible() {
        try {
            return this.f14281a.isVisible();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f14281a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getZIndex() {
        try {
            return this.f14281a.getZIndex();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getTransparency() {
        try {
            return this.f14281a.getTransparency();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getId() {
        try {
            return this.f14281a.getId();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean getFadeIn() {
        try {
            return this.f14281a.getFadeIn();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TileOverlay)) {
            return false;
        }
        try {
            return this.f14281a.equalsRemote(((TileOverlay) obj).f14281a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void clearTileCache() {
        try {
            this.f14281a.clearTileCache();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public TileOverlay(ITileOverlayDelegate iTileOverlayDelegate) {
        this.f14281a = iTileOverlayDelegate;
    }
}
