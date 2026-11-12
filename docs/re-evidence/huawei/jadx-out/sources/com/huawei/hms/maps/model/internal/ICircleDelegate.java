package com.huawei.hms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.internal.IAnimationListener;
import com.huawei.hms.maps.mae;
import com.huawei.hms.maps.mai;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.PatternItem;
import com.huawei.hms.maps.model.animation.Animation;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public interface ICircleDelegate extends mae {
    boolean clearAnimation();

    boolean equalsRemote(ICircleDelegate iCircleDelegate);

    LatLng getCenter();

    int getFillColor();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ String getId();

    double getRadius();

    int getStrokeColor();

    List<PatternItem> getStrokePattern();

    float getStrokeWidth();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ IObjectWrapper getTag();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ float getZIndex();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ int hashCodeRemote();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ boolean isClickable();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ boolean isVisible();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void remove();

    void setAnimation(Animation animation);

    void setAnimationListener(IAnimationListener iAnimationListener);

    void setCenter(LatLng latLng);

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void setClickable(boolean z);

    void setFillColor(int i);

    void setRadius(double d);

    void setStrokeColor(int i);

    void setStrokePattern(List<PatternItem> list);

    void setStrokeWidth(float f);

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void setTag(IObjectWrapper iObjectWrapper);

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void setVisible(boolean z);

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void setZIndex(float f);

    void startAnimation();

    public static abstract class Stub extends Binder implements ICircleDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements ICircleDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14293a;

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public void startAnimation() {
                mai.a(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 26, new Parcelable[0]);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate, com.huawei.hms.maps.mae
            public void setZIndex(float f) {
                mai.a(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 23, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate, com.huawei.hms.maps.mae
            public void setVisible(boolean z) {
                mai.a(z, this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 22);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate, com.huawei.hms.maps.mae
            public void setTag(IObjectWrapper iObjectWrapper) {
                mai.a(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 21, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public void setStrokeWidth(float f) {
                mai.a(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 20, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public void setStrokePattern(List<PatternItem> list) {
                mai.b(list, this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 19);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public void setStrokeColor(int i) {
                mai.a(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 18, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public void setRadius(double d) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.ICircleDelegate");
                    parcelObtain.writeDouble(d);
                    this.f14293a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public void setFillColor(int i) {
                mai.a(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 16, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate, com.huawei.hms.maps.mae
            public void setClickable(boolean z) {
                mai.a(z, this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 15);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public void setCenter(LatLng latLng) {
                mai.a(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 14, latLng);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public void setAnimationListener(IAnimationListener iAnimationListener) {
                mai.a(iAnimationListener != null ? iAnimationListener.asBinder() : null, this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 27);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public void setAnimation(Animation animation) {
                mai.a(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 25, animation);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate, com.huawei.hms.maps.mae
            public void remove() {
                mai.j(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 13);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate, com.huawei.hms.maps.mae
            public boolean isVisible() {
                return mai.a(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 12);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate, com.huawei.hms.maps.mae
            public boolean isClickable() {
                return mai.a(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 11);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate, com.huawei.hms.maps.mae
            public int hashCodeRemote() {
                return mai.c(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 10);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate, com.huawei.hms.maps.mae
            public float getZIndex() {
                return mai.b(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 9);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate, com.huawei.hms.maps.mae
            public IObjectWrapper getTag() {
                return IObjectWrapper.Stub.asInterface(mai.i(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 8));
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public float getStrokeWidth() {
                return mai.b(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 7);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public List<PatternItem> getStrokePattern() {
                return mai.g(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 6);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public int getStrokeColor() {
                return mai.c(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 5);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public double getRadius() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.ICircleDelegate");
                    this.f14293a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readDouble();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.model.internal.ICircleDelegate";
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate, com.huawei.hms.maps.mae
            public String getId() {
                return mai.h(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 3);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public int getFillColor() {
                return mai.c(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 2);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public LatLng getCenter() {
                return mai.d(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 1);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public boolean equalsRemote(ICircleDelegate iCircleDelegate) {
                return mai.a(iCircleDelegate, this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 24);
            }

            @Override // com.huawei.hms.maps.model.internal.ICircleDelegate
            public boolean clearAnimation() {
                return mai.a(this.f14293a, "com.huawei.hms.maps.model.internal.ICircleDelegate", 28);
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14293a;
            }

            Proxy(IBinder iBinder) {
                this.f14293a = iBinder;
            }
        }

        public static ICircleDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.ICircleDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICircleDelegate)) ? new Proxy(iBinder) : (ICircleDelegate) iInterfaceQueryLocalInterface;
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.maps.model.internal.ICircleDelegate");
        }
    }
}
