package com.huawei.hms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.internal.IAnimationListener;
import com.huawei.hms.maps.mai;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.animation.Animation;

/* JADX INFO: loaded from: classes10.dex */
public interface IMarkerDelegate extends IInterface {
    boolean equalsRemote(IMarkerDelegate iMarkerDelegate);

    float getAlpha();

    String getId();

    LatLng getPosition();

    float getRotation();

    String getSnippet();

    IObjectWrapper getTag();

    String getTitle();

    float getZIndex();

    int hashCodeRemote();

    void hideInfoWindow();

    boolean isClickable();

    boolean isClusterable();

    boolean isDraggable();

    boolean isFlat();

    boolean isInfoWindowShown();

    boolean isVisible();

    void remove();

    void setAlpha(float f);

    void setAnchor(float f, float f2);

    void setAnimation(Animation animation);

    void setAnimationListener(IAnimationListener iAnimationListener);

    void setClickable(boolean z);

    void setDraggable(boolean z);

    void setFlat(boolean z);

    void setIcon(IObjectWrapper iObjectWrapper);

    void setInfoWindowAnchor(float f, float f2);

    void setMarkerAnchor(float f, float f2);

    void setPosition(LatLng latLng);

    void setRotation(float f);

    void setSnippet(String str);

    void setTag(IObjectWrapper iObjectWrapper);

    void setTitle(String str);

    void setVisible(boolean z);

    void setZIndex(float f);

    void showInfoWindow();

    void startAnimation();

    public static abstract class Stub extends Binder implements IMarkerDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IMarkerDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14299a;

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void startAnimation() {
                mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 34, new Parcelable[0]);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void showInfoWindow() {
                mai.j(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 11);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setZIndex(float f) {
                mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 27, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setVisible(boolean z) {
                mai.a(z, this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 14);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setTitle(String str) {
                mai.a(str, this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 5);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setTag(IObjectWrapper iObjectWrapper) {
                mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 29, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setSnippet(String str) {
                mai.a(str, this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 7);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setRotation(float f) {
                mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 22, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setPosition(LatLng latLng) {
                mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 3, latLng);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setMarkerAnchor(float f, float f2) {
                mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 32, Float.valueOf(f), Float.valueOf(f2));
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setInfoWindowAnchor(float f, float f2) {
                mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 24, Float.valueOf(f), Float.valueOf(f2));
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setIcon(IObjectWrapper iObjectWrapper) {
                mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 18, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setFlat(boolean z) {
                mai.a(z, this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 20);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setDraggable(boolean z) {
                mai.a(z, this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 9);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setClickable(boolean z) {
                mai.a(z, this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 36);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setAnimationListener(IAnimationListener iAnimationListener) {
                mai.a(iAnimationListener != null ? iAnimationListener.asBinder() : null, this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 35);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setAnimation(Animation animation) {
                mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 33, animation);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setAnchor(float f, float f2) {
                mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 19, Float.valueOf(f), Float.valueOf(f2));
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void setAlpha(float f) {
                mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 25, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void remove() {
                mai.j(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 1);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public boolean isVisible() {
                return mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 15);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public boolean isInfoWindowShown() {
                return mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 13);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public boolean isFlat() {
                return mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 21);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public boolean isDraggable() {
                return mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 10);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public boolean isClusterable() {
                return mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 31);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public boolean isClickable() {
                return mai.a(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 37);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public void hideInfoWindow() {
                mai.j(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 12);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public int hashCodeRemote() {
                return mai.c(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 17);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public float getZIndex() {
                return mai.b(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 28);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public String getTitle() {
                return mai.h(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 6);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public IObjectWrapper getTag() {
                return IObjectWrapper.Stub.asInterface(mai.i(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 30));
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public String getSnippet() {
                return mai.h(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 8);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public float getRotation() {
                return mai.b(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 23);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public LatLng getPosition() {
                return mai.d(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 4);
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.model.internal.IMarkerDelegate";
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public String getId() {
                return mai.h(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 2);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public float getAlpha() {
                return mai.b(this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 26);
            }

            @Override // com.huawei.hms.maps.model.internal.IMarkerDelegate
            public boolean equalsRemote(IMarkerDelegate iMarkerDelegate) {
                return mai.a(iMarkerDelegate, this.f14299a, "com.huawei.hms.maps.model.internal.IMarkerDelegate", 16);
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14299a;
            }

            Proxy(IBinder iBinder) {
                this.f14299a = iBinder;
            }
        }

        public static IMarkerDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.IMarkerDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMarkerDelegate)) ? new Proxy(iBinder) : (IMarkerDelegate) iInterfaceQueryLocalInterface;
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.maps.model.internal.IMarkerDelegate");
        }
    }
}
