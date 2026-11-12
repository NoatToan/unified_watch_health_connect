package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.internal.IAnimationListener;
import com.huawei.hms.maps.model.animation.Animation;
import com.huawei.hms.maps.model.animation.AnimationSet;
import com.huawei.hms.maps.model.internal.IMarkerDelegate;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class Marker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IMarkerDelegate f14262a;

    public void startAnimation() {
        try {
            this.f14262a.startAnimation();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void showInfoWindow() {
        try {
            this.f14262a.showInfoWindow();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void setZIndex(float f) {
        try {
            this.f14262a.setZIndex(f);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.f14262a.setVisible(z);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void setTitle(String str) {
        try {
            this.f14262a.setTitle(str);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void setTag(Object obj) {
        try {
            this.f14262a.setTag(ObjectWrapper.wrap(obj));
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void setSnippet(String str) {
        try {
            this.f14262a.setSnippet(str);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void setRotation(float f) {
        try {
            this.f14262a.setRotation(f);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void setPosition(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.f14262a.setPosition(latLng);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void setMarkerAnchor(float f, float f2) {
        try {
            this.f14262a.setMarkerAnchor(f, f2);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void setInfoWindowAnchor(float f, float f2) {
        try {
            this.f14262a.setInfoWindowAnchor(f, f2);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void setIcon(BitmapDescriptor bitmapDescriptor) {
        IObjectWrapper object;
        IMarkerDelegate iMarkerDelegate;
        try {
            if (bitmapDescriptor == null) {
                iMarkerDelegate = this.f14262a;
                object = ObjectWrapper.wrap(null);
            } else {
                IMarkerDelegate iMarkerDelegate2 = this.f14262a;
                object = bitmapDescriptor.getObject();
                iMarkerDelegate = iMarkerDelegate2;
            }
            iMarkerDelegate.setIcon(object);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void setFlat(boolean z) {
        try {
            this.f14262a.setFlat(z);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void setDraggable(boolean z) {
        try {
            this.f14262a.setDraggable(z);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public void setClickable(boolean z) {
        try {
            this.f14262a.setClickable(z);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public void setAnimation(Animation animation) {
        if (animation == null) {
            throw new IllegalArgumentException("animation cannot be null.");
        }
        try {
            a(animation);
            this.f14262a.setAnimation(animation);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    @Deprecated
    public final void setAnchor(float f, float f2) {
        try {
            this.f14262a.setAnchor(f, f2);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void setAlpha(float f) {
        try {
            this.f14262a.setAlpha(f);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void remove() {
        try {
            this.f14262a.remove();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final boolean isVisible() {
        try {
            return this.f14262a.isVisible();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final boolean isInfoWindowShown() {
        try {
            return this.f14262a.isInfoWindowShown();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final boolean isFlat() {
        try {
            return this.f14262a.isFlat();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final boolean isDraggable() {
        try {
            return this.f14262a.isDraggable();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public boolean isClusterable() {
        try {
            return this.f14262a.isClusterable();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public boolean isClickable() {
        try {
            return this.f14262a.isClickable();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final void hideInfoWindow() {
        try {
            this.f14262a.hideInfoWindow();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f14262a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final float getZIndex() {
        try {
            return this.f14262a.getZIndex();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final String getTitle() {
        try {
            return this.f14262a.getTitle();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.f14262a.getTag());
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final String getSnippet() {
        try {
            return this.f14262a.getSnippet();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final float getRotation() {
        try {
            return this.f14262a.getRotation();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final LatLng getPosition() {
        try {
            return this.f14262a.getPosition();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final String getId() {
        try {
            return this.f14262a.getId();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    class maa extends IAnimationListener.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animation.AnimationListener f14263a;

        @Override // com.huawei.hms.maps.internal.IAnimationListener
        public void onAnimationStart() {
            Animation.AnimationListener animationListener = this.f14263a;
            if (animationListener != null) {
                animationListener.onAnimationStart();
            }
        }

        @Override // com.huawei.hms.maps.internal.IAnimationListener
        public void onAnimationEnd() {
            Animation.AnimationListener animationListener = this.f14263a;
            if (animationListener != null) {
                animationListener.onAnimationEnd();
            }
        }

        maa(Animation.AnimationListener animationListener) {
            this.f14263a = animationListener;
        }
    }

    public final float getAlpha() {
        try {
            return this.f14262a.getAlpha();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Marker)) {
            return false;
        }
        try {
            return this.f14262a.equalsRemote(((Marker) obj).f14262a);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    private void a(Animation animation) {
        try {
            if (animation instanceof AnimationSet) {
                Iterator<Animation> it = ((AnimationSet) animation).getAnimations().iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            Animation.AnimationListener listener = animation.getListener();
            this.f14262a.setAnimationListener(listener == null ? null : new maa(listener));
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public Marker(IMarkerDelegate iMarkerDelegate) {
        if (iMarkerDelegate == null) {
            throw new NullPointerException("Object is null");
        }
        this.f14262a = iMarkerDelegate;
    }
}
