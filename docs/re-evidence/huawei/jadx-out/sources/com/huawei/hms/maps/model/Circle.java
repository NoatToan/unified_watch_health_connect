package com.huawei.hms.maps.model;

import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.internal.IAnimationListener;
import com.huawei.hms.maps.model.animation.Animation;
import com.huawei.hms.maps.model.animation.AnimationSet;
import com.huawei.hms.maps.model.internal.ICircleDelegate;
import com.huawei.hms.maps.utils.LogM;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class Circle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ICircleDelegate f14237a;

    public void startAnimation() {
        try {
            this.f14237a.startAnimation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setZIndex(float f) {
        try {
            this.f14237a.setZIndex(f);
        } catch (RemoteException e) {
            LogM.e("Circle", "setZIndex RemoteException: " + e.toString());
        }
    }

    public void setVisible(boolean z) {
        try {
            this.f14237a.setVisible(z);
        } catch (RemoteException e) {
            LogM.e("Circle", "setVisible RemoteException: " + e.toString());
        }
    }

    public <T> void setTag(T t) {
        try {
            this.f14237a.setTag(ObjectWrapper.wrap(t));
        } catch (RemoteException e) {
            LogM.d("Circle", "RemoteException: " + e.toString());
        }
    }

    public void setStrokeWidth(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Circle strokeWidth value is illegal ,this value must be non-negative");
        }
        try {
            this.f14237a.setStrokeWidth(f);
        } catch (RemoteException e) {
            LogM.d("Circle", "setStrokeWidth RemoteException: " + e.toString());
        }
    }

    public void setStrokePattern(List<PatternItem> list) {
        try {
            this.f14237a.setStrokePattern(list);
        } catch (RemoteException e) {
            LogM.e("Circle", "setStrokePattern RemoteException: " + e.toString());
        }
    }

    public void setStrokeColor(int i) {
        try {
            this.f14237a.setStrokeColor(i);
        } catch (RemoteException e) {
            LogM.d("Circle", "setStrokeColor RemoteException: " + e.toString());
        }
    }

    public void setRadius(double d) {
        try {
            this.f14237a.setRadius(d);
        } catch (RemoteException e) {
            LogM.d("Circle", "setRadius RemoteException: " + e.toString());
        }
    }

    public void setFillColor(int i) {
        try {
            this.f14237a.setFillColor(i);
        } catch (RemoteException e) {
            LogM.d("Circle", "setFillColor RemoteException: " + e.toString());
        }
    }

    public void setClickable(boolean z) {
        try {
            this.f14237a.setClickable(z);
        } catch (RemoteException e) {
            LogM.d("Circle", "setClickable RemoteException: " + e.toString());
        }
    }

    public void setCenter(LatLng latLng) {
        if (latLng == null) {
            throw new NullPointerException("Circle center cannot be null");
        }
        try {
            this.f14237a.setCenter(latLng);
        } catch (RemoteException e) {
            LogM.d("Circle", "setCenter RemoteException: " + e.toString());
        }
    }

    public void setAnimation(Animation animation) {
        if (animation == null) {
            throw new IllegalArgumentException("animation cannot be null.");
        }
        try {
            a(animation);
            this.f14237a.setAnimation(animation);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void remove() {
        try {
            this.f14237a.remove();
        } catch (RemoteException e) {
            LogM.d("Circle", "remove RemoteException: " + e.toString());
        }
    }

    public boolean isVisible() {
        try {
            return this.f14237a.isVisible();
        } catch (RemoteException e) {
            LogM.e("Circle", "isVisible RemoteException: " + e.toString());
            return true;
        }
    }

    public boolean isClickable() {
        try {
            return this.f14237a.isClickable();
        } catch (RemoteException e) {
            LogM.d("Circle", "RemoteException: " + e.toString());
            return true;
        }
    }

    public int hashCode() {
        try {
            return this.f14237a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public float getZIndex() {
        try {
            return this.f14237a.getZIndex();
        } catch (RemoteException e) {
            LogM.e("Circle", "getZIndex RemoteException: " + e.toString());
            return -1.0f;
        }
    }

    public Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.f14237a.getTag());
        } catch (RemoteException e) {
            LogM.d("Circle", "RemoteException: " + e.toString());
            return null;
        }
    }

    public float getStrokeWidth() {
        try {
            return this.f14237a.getStrokeWidth();
        } catch (RemoteException e) {
            LogM.d("Circle", "getStrokeWidth RemoteException: " + e.toString());
            return 0.0f;
        }
    }

    public List<PatternItem> getStrokePattern() {
        try {
            return this.f14237a.getStrokePattern();
        } catch (RemoteException e) {
            LogM.e("Circle", "getStrokePattern RemoteException: " + e.toString());
            return null;
        }
    }

    public int getStrokeColor() {
        try {
            return this.f14237a.getStrokeColor();
        } catch (RemoteException e) {
            LogM.d("Circle", "getStrokeColor RemoteException: " + e.toString());
            return 0;
        }
    }

    public double getRadius() {
        try {
            return this.f14237a.getRadius();
        } catch (RemoteException e) {
            LogM.d("Circle", "getRadius RemoteException: " + e.toString());
            return 0.0d;
        }
    }

    public String getId() {
        try {
            return this.f14237a.getId();
        } catch (RemoteException e) {
            LogM.d("Circle", "getId RemoteException: " + e.toString());
            return null;
        }
    }

    public int getFillColor() {
        try {
            return this.f14237a.getFillColor();
        } catch (RemoteException e) {
            LogM.d("Circle", "getFillColor RemoteException: " + e.toString());
            return 0;
        }
    }

    public LatLng getCenter() {
        try {
            return this.f14237a.getCenter();
        } catch (RemoteException e) {
            LogM.d("Circle", "getCenter RemoteException: " + e.toString());
            return null;
        }
    }

    class maa extends IAnimationListener.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animation.AnimationListener f14238a;

        @Override // com.huawei.hms.maps.internal.IAnimationListener
        public void onAnimationStart() {
            Animation.AnimationListener animationListener = this.f14238a;
            if (animationListener != null) {
                animationListener.onAnimationStart();
            }
        }

        @Override // com.huawei.hms.maps.internal.IAnimationListener
        public void onAnimationEnd() {
            Animation.AnimationListener animationListener = this.f14238a;
            if (animationListener != null) {
                animationListener.onAnimationEnd();
            }
        }

        maa(Animation.AnimationListener animationListener) {
            this.f14238a = animationListener;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        try {
            return this.f14237a.equalsRemote(((Circle) obj).f14237a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean clearAnimation() {
        try {
            return this.f14237a.clearAnimation();
        } catch (Exception unused) {
            LogM.e("Circle", "clearAnimation Exception:");
            return false;
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
            this.f14237a.setAnimationListener(listener == null ? null : new maa(listener));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public Circle(ICircleDelegate iCircleDelegate) {
        this.f14237a = iCircleDelegate;
    }
}
