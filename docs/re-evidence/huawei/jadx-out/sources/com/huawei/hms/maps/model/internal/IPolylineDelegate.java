package com.huawei.hms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.mae;
import com.huawei.hms.maps.mai;
import com.huawei.hms.maps.model.Cap;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.PatternItem;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IPolylineDelegate extends mae {
    boolean equalsRemote(IPolylineDelegate iPolylineDelegate);

    int getColor();

    List getColorValues();

    Cap getEndCap();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ String getId();

    int getJointType();

    List<PatternItem> getPattern();

    List<LatLng> getPoints();

    Cap getStartCap();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ IObjectWrapper getTag();

    float getWidth();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ float getZIndex();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ int hashCodeRemote();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ boolean isClickable();

    boolean isGeodesic();

    boolean isGradient();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ boolean isVisible();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void remove();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void setClickable(boolean z);

    void setColor(int i);

    void setColorValues(List list);

    void setEndCap(Cap cap);

    void setGeodesic(boolean z);

    void setGradient(boolean z);

    void setJointType(int i);

    void setPattern(List<PatternItem> list);

    void setPoints(List<LatLng> list);

    void setStartCap(Cap cap);

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void setTag(IObjectWrapper iObjectWrapper);

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void setVisible(boolean z);

    void setWidth(float f);

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void setZIndex(float f);

    public static abstract class Stub extends Binder implements IPolylineDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IPolylineDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14301a;

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate, com.huawei.hms.maps.mae
            public void setZIndex(float f) {
                mai.a(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 28, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public void setWidth(float f) {
                mai.a(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 27, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate, com.huawei.hms.maps.mae
            public void setVisible(boolean z) {
                mai.a(z, this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 26);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate, com.huawei.hms.maps.mae
            public void setTag(IObjectWrapper iObjectWrapper) {
                mai.a(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 25, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public void setStartCap(Cap cap) {
                mai.a(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 24, cap);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public void setPoints(List<LatLng> list) {
                mai.a(list, this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 23);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public void setPattern(List<PatternItem> list) {
                mai.b(list, this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 22);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public void setJointType(int i) {
                mai.a(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 21, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public void setGradient(boolean z) {
                mai.a(z, this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 31);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public void setGeodesic(boolean z) {
                mai.a(z, this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 20);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public void setEndCap(Cap cap) {
                mai.a(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 19, cap);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public void setColorValues(List list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.IPolylineDelegate");
                    parcelObtain.writeList(list);
                    this.f14301a.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public void setColor(int i) {
                mai.a(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 18, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate, com.huawei.hms.maps.mae
            public void setClickable(boolean z) {
                mai.a(z, this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 17);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate, com.huawei.hms.maps.mae
            public void remove() {
                mai.j(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 16);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate, com.huawei.hms.maps.mae
            public boolean isVisible() {
                return mai.a(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 15);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public boolean isGradient() {
                return mai.a(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 32);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public boolean isGeodesic() {
                return mai.a(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 14);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate, com.huawei.hms.maps.mae
            public boolean isClickable() {
                return mai.a(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 13);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate, com.huawei.hms.maps.mae
            public int hashCodeRemote() {
                return mai.c(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 12);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate, com.huawei.hms.maps.mae
            public float getZIndex() {
                return mai.b(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 11);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public float getWidth() {
                return mai.b(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 10);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate, com.huawei.hms.maps.mae
            public IObjectWrapper getTag() {
                return IObjectWrapper.Stub.asInterface(mai.i(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 9));
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public Cap getStartCap() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.IPolylineDelegate");
                    this.f14301a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? Cap.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public List<LatLng> getPoints() {
                return mai.f(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 7);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public List<PatternItem> getPattern() {
                return mai.g(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 6);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public int getJointType() {
                return mai.c(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 5);
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.model.internal.IPolylineDelegate";
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate, com.huawei.hms.maps.mae
            public String getId() {
                return mai.h(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 4);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public Cap getEndCap() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.IPolylineDelegate");
                    this.f14301a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? Cap.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public List getColorValues() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.IPolylineDelegate");
                    this.f14301a.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public int getColor() {
                return mai.c(this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 2);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolylineDelegate
            public boolean equalsRemote(IPolylineDelegate iPolylineDelegate) {
                return mai.a(iPolylineDelegate, this.f14301a, "com.huawei.hms.maps.model.internal.IPolylineDelegate", 1);
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14301a;
            }

            Proxy(IBinder iBinder) {
                this.f14301a = iBinder;
            }
        }

        public static IPolylineDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.IPolylineDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPolylineDelegate)) ? new Proxy(iBinder) : (IPolylineDelegate) iInterfaceQueryLocalInterface;
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.maps.model.internal.IPolylineDelegate");
        }
    }
}
