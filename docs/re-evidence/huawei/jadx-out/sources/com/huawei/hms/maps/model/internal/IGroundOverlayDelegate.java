package com.huawei.hms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.mai;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes10.dex */
public interface IGroundOverlayDelegate extends IInterface {
    boolean equalsRemote(IGroundOverlayDelegate iGroundOverlayDelegate);

    float getBearing();

    LatLngBounds getBounds();

    float getHeight();

    String getId();

    LatLng getPosition();

    IObjectWrapper getTag();

    float getTransparency();

    float getWidth();

    float getZIndex();

    int hashCodeRemote();

    boolean isClickable();

    boolean isVisible();

    void remove();

    void setBearing(float f);

    void setClickable(boolean z);

    void setDimension(float f);

    void setDimensions(float f, float f2);

    void setImage(IObjectWrapper iObjectWrapper);

    void setPosition(LatLng latLng);

    void setPositionFromBounds(LatLngBounds latLngBounds);

    void setTag(IObjectWrapper iObjectWrapper);

    void setTransparency(float f);

    void setVisible(boolean z);

    void setZIndex(float f);

    public static abstract class Stub extends Binder implements IGroundOverlayDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IGroundOverlayDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14295a;

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public void setZIndex(float f) {
                mai.a(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 24, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public void setVisible(boolean z) {
                mai.a(z, this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 23);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public void setTransparency(float f) {
                mai.a(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 22, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public void setTag(IObjectWrapper iObjectWrapper) {
                mai.a(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 21, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public void setPositionFromBounds(LatLngBounds latLngBounds) {
                mai.a(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 20, latLngBounds);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public void setPosition(LatLng latLng) {
                mai.a(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 18, latLng);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public void setImage(IObjectWrapper iObjectWrapper) {
                mai.a(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 19, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public void setDimensions(float f, float f2) {
                mai.a(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 17, Float.valueOf(f), Float.valueOf(f2));
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public void setDimension(float f) {
                mai.a(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 16, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public void setClickable(boolean z) {
                mai.a(z, this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 15);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public void setBearing(float f) {
                mai.a(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 14, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public void remove() {
                mai.j(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 13);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public boolean isVisible() {
                return mai.a(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 12);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public boolean isClickable() {
                return mai.a(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 11);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public int hashCodeRemote() {
                return mai.c(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 10);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public float getZIndex() {
                return mai.b(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 9);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public float getWidth() {
                return mai.b(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 8);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public float getTransparency() {
                return mai.b(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 7);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public IObjectWrapper getTag() {
                return IObjectWrapper.Stub.asInterface(mai.i(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 6));
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public LatLng getPosition() {
                return mai.d(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 5);
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate";
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public String getId() {
                return mai.h(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 4);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public float getHeight() {
                return mai.b(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 3);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public LatLngBounds getBounds() {
                return mai.e(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 2);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public float getBearing() {
                return mai.b(this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 1);
            }

            @Override // com.huawei.hms.maps.model.internal.IGroundOverlayDelegate
            public boolean equalsRemote(IGroundOverlayDelegate iGroundOverlayDelegate) {
                return mai.a(iGroundOverlayDelegate, this.f14295a, "com.huawei.hms.maps.model.internal.IGroundOverlayDelegate", 25);
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14295a;
            }

            Proxy(IBinder iBinder) {
                this.f14295a = iBinder;
            }
        }

        public static IGroundOverlayDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.IGroundOverlayDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGroundOverlayDelegate)) ? new Proxy(iBinder) : (IGroundOverlayDelegate) iInterfaceQueryLocalInterface;
        }
    }
}
