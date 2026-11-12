package com.huawei.hms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.mae;
import com.huawei.hms.maps.mai;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.PatternItem;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IPolygonDelegate extends mae {
    boolean equalsRemote(IPolygonDelegate iPolygonDelegate);

    int getFillColor();

    List getHoles();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ String getId();

    List<LatLng> getPoints();

    int getStrokeColor();

    int getStrokeJointType();

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

    boolean isGeodesic();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ boolean isVisible();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void remove();

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void setClickable(boolean z);

    void setFillColor(int i);

    void setGeodesic(boolean z);

    void setHoles(List list);

    void setPoints(List<LatLng> list);

    void setStrokeColor(int i);

    void setStrokeJointType(int i);

    void setStrokePattern(List<PatternItem> list);

    void setStrokeWidth(float f);

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void setTag(IObjectWrapper iObjectWrapper);

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void setVisible(boolean z);

    @Override // com.huawei.hms.maps.mae
    /* synthetic */ void setZIndex(float f);

    public static abstract class Stub extends Binder implements IPolygonDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IPolygonDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14300a;

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate, com.huawei.hms.maps.mae
            public void setZIndex(float f) {
                mai.a(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 27, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate, com.huawei.hms.maps.mae
            public void setVisible(boolean z) {
                mai.a(z, this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 26);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate, com.huawei.hms.maps.mae
            public void setTag(IObjectWrapper iObjectWrapper) {
                mai.a(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 25, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public void setStrokeWidth(float f) {
                mai.a(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 24, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public void setStrokePattern(List<PatternItem> list) {
                mai.b(list, this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 23);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public void setStrokeJointType(int i) {
                mai.a(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 22, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public void setStrokeColor(int i) {
                mai.a(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 21, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public void setPoints(List<LatLng> list) {
                mai.a(list, this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 20);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public void setHoles(List list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.IPolygonDelegate");
                    parcelObtain.writeList(list);
                    this.f14300a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public void setGeodesic(boolean z) {
                mai.a(z, this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 18);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public void setFillColor(int i) {
                mai.a(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 17, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate, com.huawei.hms.maps.mae
            public void setClickable(boolean z) {
                mai.a(z, this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 16);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate, com.huawei.hms.maps.mae
            public void remove() {
                mai.j(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 15);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate, com.huawei.hms.maps.mae
            public boolean isVisible() {
                return mai.a(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 14);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public boolean isGeodesic() {
                return mai.a(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 13);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate, com.huawei.hms.maps.mae
            public boolean isClickable() {
                return mai.a(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 12);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate, com.huawei.hms.maps.mae
            public int hashCodeRemote() {
                return mai.c(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 11);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate, com.huawei.hms.maps.mae
            public float getZIndex() {
                return mai.b(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 10);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate, com.huawei.hms.maps.mae
            public IObjectWrapper getTag() {
                return IObjectWrapper.Stub.asInterface(mai.i(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 9));
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public float getStrokeWidth() {
                return mai.b(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 8);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public List<PatternItem> getStrokePattern() {
                return mai.g(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 7);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public int getStrokeJointType() {
                return mai.c(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 6);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public int getStrokeColor() {
                return mai.c(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 5);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public List<LatLng> getPoints() {
                return mai.f(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 4);
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.model.internal.IPolygonDelegate";
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate, com.huawei.hms.maps.mae
            public String getId() {
                return mai.h(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 3);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public List getHoles() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.IPolygonDelegate");
                    this.f14300a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public int getFillColor() {
                return mai.c(this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 1);
            }

            @Override // com.huawei.hms.maps.model.internal.IPolygonDelegate
            public boolean equalsRemote(IPolygonDelegate iPolygonDelegate) {
                return mai.a(iPolygonDelegate, this.f14300a, "com.huawei.hms.maps.model.internal.IPolygonDelegate", 28);
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14300a;
            }

            Proxy(IBinder iBinder) {
                this.f14300a = iBinder;
            }
        }

        public static IPolygonDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.IPolygonDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPolygonDelegate)) ? new Proxy(iBinder) : (IPolygonDelegate) iInterfaceQueryLocalInterface;
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.maps.model.internal.IPolygonDelegate");
        }
    }
}
