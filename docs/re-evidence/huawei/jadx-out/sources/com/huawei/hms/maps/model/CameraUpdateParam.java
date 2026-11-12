package com.huawei.hms.maps.model;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.utils.LogM;

/* JADX INFO: loaded from: classes10.dex */
public class CameraUpdateParam implements Parcelable {
    public static final Parcelable.Creator<CameraUpdateParam> CREATOR = new Parcelable.Creator<CameraUpdateParam>() { // from class: com.huawei.hms.maps.model.CameraUpdateParam.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CameraUpdateParam createFromParcel(Parcel parcel) {
            return new CameraUpdateParam(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CameraUpdateParam[] newArray(int i) {
            return new CameraUpdateParam[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CameraPosition f14218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLng f14219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NewLatLngBounds f14220c;
    private NewLatLngBoundsWidthHeight d;
    private NewLatLngZoom e;
    private ScrollBy f;
    private ZoomByWithFocus g;
    private ZoomBy h;
    private ZoomTo i;

    public static class NewLatLngBounds implements Parcelable {
        public static final Parcelable.Creator<NewLatLngBounds> CREATOR = new Parcelable.Creator<NewLatLngBounds>() { // from class: com.huawei.hms.maps.model.CameraUpdateParam.NewLatLngBounds.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public NewLatLngBounds createFromParcel(Parcel parcel) {
                return new NewLatLngBounds(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public NewLatLngBounds[] newArray(int i) {
                return new NewLatLngBounds[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLngBounds f14221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14222b;

        public NewLatLngBounds() {
            this.f14221a = null;
            this.f14222b = Integer.MAX_VALUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        protected NewLatLngBounds(Parcel parcel) {
            this.f14221a = null;
            this.f14222b = Integer.MAX_VALUE;
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.f14221a = (LatLngBounds) parcelReader.readParcelable(2, LatLngBounds.CREATOR, null);
            this.f14222b = parcelReader.readInt(3, this.f14222b);
        }

        public NewLatLngBounds(LatLngBounds latLngBounds, int i) {
            this.f14221a = latLngBounds;
            this.f14222b = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int iBeginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeParcelable(2, this.f14221a, i, false);
            parcelWrite.writeInt(3, this.f14222b);
            parcelWrite.finishObjectHeader(iBeginObjectHeader);
        }

        public void setPadding(int i) {
            this.f14222b = i;
        }

        public void setBounds(LatLngBounds latLngBounds) {
            this.f14221a = latLngBounds;
        }

        public int getPadding() {
            return this.f14222b;
        }

        public LatLngBounds getBounds() {
            return this.f14221a;
        }
    }

    public static class NewLatLngBoundsWidthHeight implements Parcelable {
        public static final Parcelable.Creator<NewLatLngBoundsWidthHeight> CREATOR = new Parcelable.Creator<NewLatLngBoundsWidthHeight>() { // from class: com.huawei.hms.maps.model.CameraUpdateParam.NewLatLngBoundsWidthHeight.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public NewLatLngBoundsWidthHeight createFromParcel(Parcel parcel) {
                return new NewLatLngBoundsWidthHeight(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public NewLatLngBoundsWidthHeight[] newArray(int i) {
                return new NewLatLngBoundsWidthHeight[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLngBounds f14223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14225c;
        private int d;

        public NewLatLngBoundsWidthHeight() {
            this.f14223a = null;
            this.f14224b = Integer.MAX_VALUE;
            this.f14225c = Integer.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        protected NewLatLngBoundsWidthHeight(Parcel parcel) {
            this.f14223a = null;
            this.f14224b = Integer.MAX_VALUE;
            this.f14225c = Integer.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.f14223a = (LatLngBounds) parcelReader.readParcelable(2, LatLngBounds.CREATOR, null);
            this.f14224b = parcelReader.readInt(3, this.f14224b);
            this.f14225c = parcelReader.readInt(4, this.f14225c);
            this.d = parcelReader.readInt(5, this.d);
        }

        public NewLatLngBoundsWidthHeight(LatLngBounds latLngBounds, int i, int i2, int i3) {
            this.f14223a = latLngBounds;
            this.f14225c = i;
            this.d = i2;
            this.f14224b = i3;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int iBeginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeParcelable(2, this.f14223a, i, false);
            parcelWrite.writeInt(3, this.f14224b);
            parcelWrite.writeInt(4, this.f14225c);
            parcelWrite.writeInt(5, this.d);
            parcelWrite.finishObjectHeader(iBeginObjectHeader);
        }

        public void setWidth(int i) {
            this.f14225c = i;
        }

        public void setPadding(int i) {
            this.f14224b = i;
        }

        public void setHeight(int i) {
            this.d = i;
        }

        public void setBounds(LatLngBounds latLngBounds) {
            this.f14223a = latLngBounds;
        }

        public int getWidth() {
            return this.f14225c;
        }

        public int getPadding() {
            return this.f14224b;
        }

        public int getHeight() {
            return this.d;
        }

        public LatLngBounds getBounds() {
            return this.f14223a;
        }
    }

    public static class NewLatLngZoom implements Parcelable {
        public static final Parcelable.Creator<NewLatLngZoom> CREATOR = new Parcelable.Creator<NewLatLngZoom>() { // from class: com.huawei.hms.maps.model.CameraUpdateParam.NewLatLngZoom.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public NewLatLngZoom createFromParcel(Parcel parcel) {
                return new NewLatLngZoom(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public NewLatLngZoom[] newArray(int i) {
                return new NewLatLngZoom[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLng f14226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f14227b;

        public NewLatLngZoom() {
            this.f14226a = null;
            this.f14227b = -1.0f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        protected NewLatLngZoom(Parcel parcel) {
            this.f14226a = null;
            this.f14227b = -1.0f;
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.f14226a = (LatLng) parcelReader.readParcelable(2, LatLng.CREATOR, null);
            this.f14227b = parcelReader.readFloat(3, this.f14227b);
        }

        public NewLatLngZoom(LatLng latLng, float f) {
            this.f14226a = latLng;
            this.f14227b = f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int iBeginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeParcelable(2, this.f14226a, i, false);
            parcelWrite.writeFloat(3, this.f14227b);
            parcelWrite.finishObjectHeader(iBeginObjectHeader);
        }

        public void setZoom(float f) {
            this.f14227b = f;
        }

        public void setLatLng(LatLng latLng) {
            this.f14226a = latLng;
        }

        public float getZoom() {
            return this.f14227b;
        }

        public LatLng getLatLng() {
            return this.f14226a;
        }
    }

    public static class ScrollBy implements Parcelable {
        public static final Parcelable.Creator<ScrollBy> CREATOR = new Parcelable.Creator<ScrollBy>() { // from class: com.huawei.hms.maps.model.CameraUpdateParam.ScrollBy.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ScrollBy createFromParcel(Parcel parcel) {
                return new ScrollBy(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ScrollBy[] newArray(int i) {
                return new ScrollBy[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f14228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f14229b;

        public ScrollBy() {
            this.f14228a = Float.MAX_VALUE;
            this.f14229b = Float.MAX_VALUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ScrollBy(float f, float f2) {
            this.f14228a = f;
            this.f14229b = f2;
        }

        protected ScrollBy(Parcel parcel) {
            this.f14228a = Float.MAX_VALUE;
            this.f14229b = Float.MAX_VALUE;
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.f14228a = parcelReader.readFloat(2, this.f14228a);
            this.f14229b = parcelReader.readFloat(3, this.f14229b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int iBeginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeFloat(2, this.f14228a);
            parcelWrite.writeFloat(3, this.f14229b);
            parcelWrite.finishObjectHeader(iBeginObjectHeader);
        }

        public void setyPixel(float f) {
            this.f14229b = f;
        }

        public void setxPixel(float f) {
            this.f14228a = f;
        }

        public float getyPixel() {
            return this.f14229b;
        }

        public float getxPixel() {
            return this.f14228a;
        }
    }

    public static class ZoomBy implements Parcelable {
        public static final Parcelable.Creator<ZoomBy> CREATOR = new Parcelable.Creator<ZoomBy>() { // from class: com.huawei.hms.maps.model.CameraUpdateParam.ZoomBy.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ZoomBy createFromParcel(Parcel parcel) {
                return new ZoomBy(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ZoomBy[] newArray(int i) {
                return new ZoomBy[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f14230a;

        public ZoomBy(float f) {
            this.f14230a = f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        protected ZoomBy(Parcel parcel) {
            this.f14230a = new ParcelReader(parcel).readFloat(2, 0.0f);
            LogM.d("zoomby", "zoomBy: constructor ReadDone " + this.f14230a);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            LogM.d("zoomby", "zoomBy: writeToParcel " + this.f14230a);
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int iBeginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeFloat(2, this.f14230a);
            parcelWrite.finishObjectHeader(iBeginObjectHeader);
        }

        public void setAmount(float f) {
            this.f14230a = f;
        }

        public float getAmount() {
            return this.f14230a;
        }
    }

    public static class ZoomByWithFocus implements Parcelable {
        public static final Parcelable.Creator<ZoomByWithFocus> CREATOR = new Parcelable.Creator<ZoomByWithFocus>() { // from class: com.huawei.hms.maps.model.CameraUpdateParam.ZoomByWithFocus.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ZoomByWithFocus createFromParcel(Parcel parcel) {
                return new ZoomByWithFocus(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ZoomByWithFocus[] newArray(int i) {
                return new ZoomByWithFocus[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f14231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Point f14232b;

        public ZoomByWithFocus() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ZoomByWithFocus(float f, Point point) {
            this.f14231a = f;
            this.f14232b = point;
        }

        protected ZoomByWithFocus(Parcel parcel) {
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.f14231a = parcelReader.readFloat(2, 1.0f);
            this.f14232b = (Point) parcelReader.readParcelable(3, Point.CREATOR, null);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int iBeginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeFloat(2, this.f14231a);
            parcelWrite.writeParcelable(3, this.f14232b, i, false);
            parcelWrite.finishObjectHeader(iBeginObjectHeader);
        }

        public void setFocus(Point point) {
            this.f14232b = point;
        }

        public void setAmount(float f) {
            this.f14231a = f;
        }

        public Point getFocus() {
            return this.f14232b;
        }

        public float getAmount() {
            return this.f14231a;
        }
    }

    public static class ZoomTo implements Parcelable {
        public static final Parcelable.Creator<ZoomTo> CREATOR = new Parcelable.Creator<ZoomTo>() { // from class: com.huawei.hms.maps.model.CameraUpdateParam.ZoomTo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ZoomTo createFromParcel(Parcel parcel) {
                return new ZoomTo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ZoomTo[] newArray(int i) {
                return new ZoomTo[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f14233a;

        public ZoomTo(float f) {
            this.f14233a = f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        protected ZoomTo(Parcel parcel) {
            this.f14233a = Float.MAX_VALUE;
            this.f14233a = new ParcelReader(parcel).readFloat(2, this.f14233a);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int iBeginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeFloat(2, this.f14233a);
            parcelWrite.finishObjectHeader(iBeginObjectHeader);
        }

        public void setZoom(float f) {
            this.f14233a = f;
        }

        public float getZoom() {
            return this.f14233a;
        }
    }

    public CameraUpdateParam() {
        this.f14218a = null;
        this.f14219b = null;
        this.f14220c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected CameraUpdateParam(Parcel parcel) {
        this.f14218a = null;
        this.f14219b = null;
        this.f14220c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        LogM.d("ContentValues", "CameraUpdateParam: zoomBy");
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f14218a = (CameraPosition) parcelReader.readParcelable(2, CameraPosition.CREATOR, null);
        this.f14219b = (LatLng) parcelReader.readParcelable(3, LatLng.CREATOR, null);
        this.f14220c = (NewLatLngBounds) parcelReader.readParcelable(4, NewLatLngBounds.CREATOR, null);
        this.e = (NewLatLngZoom) parcelReader.readParcelable(5, NewLatLngZoom.CREATOR, null);
        this.f = (ScrollBy) parcelReader.readParcelable(6, ScrollBy.CREATOR, null);
        this.g = (ZoomByWithFocus) parcelReader.readParcelable(7, ZoomByWithFocus.CREATOR, null);
        this.h = (ZoomBy) parcelReader.readParcelable(8, ZoomBy.CREATOR, null);
        this.i = (ZoomTo) parcelReader.readParcelable(9, ZoomTo.CREATOR, null);
        this.d = (NewLatLngBoundsWidthHeight) parcelReader.readParcelable(10, NewLatLngBoundsWidthHeight.CREATOR, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, getCameraPosition(), i, false);
        parcelWrite.writeParcelable(3, getLatLng(), i, false);
        parcelWrite.writeParcelable(4, getNewLatLngBounds(), i, false);
        parcelWrite.writeParcelable(5, getNewLatLngZoom(), i, false);
        parcelWrite.writeParcelable(6, getScrollBy(), i, false);
        parcelWrite.writeParcelable(7, getZoomByWithFocus(), i, false);
        parcelWrite.writeParcelable(8, getZoomBy(), i, false);
        parcelWrite.writeParcelable(9, getZoomTo(), i, false);
        parcelWrite.writeParcelable(10, getNewLatLngBoundsWidthHeight(), i, false);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    public String toString() {
        return getClass().getSimpleName() + ":{cameraPosition=" + this.f14218a + ",latLng=" + this.f14219b + ",scrollBy=" + this.f + ",zoomByWithFocus=" + this.g + ",newLatLngBounds=" + this.f14220c + ",newLatLngZoom=" + this.e + ",zoomBy=" + this.h + ",zoomTo=" + this.i + "}";
    }

    public void setZoomTo(ZoomTo zoomTo) {
        this.i = zoomTo;
    }

    public void setZoomByWithFocus(ZoomByWithFocus zoomByWithFocus) {
        this.g = zoomByWithFocus;
    }

    public void setZoomBy(ZoomBy zoomBy) {
        this.h = zoomBy;
    }

    public void setScrollBy(ScrollBy scrollBy) {
        this.f = scrollBy;
    }

    public void setNewLatLngZoom(NewLatLngZoom newLatLngZoom) {
        this.e = newLatLngZoom;
    }

    public void setNewLatLngBoundsWidthHeight(NewLatLngBoundsWidthHeight newLatLngBoundsWidthHeight) {
        this.d = newLatLngBoundsWidthHeight;
    }

    public void setNewLatLngBounds(NewLatLngBounds newLatLngBounds) {
        this.f14220c = newLatLngBounds;
    }

    public void setLatLng(LatLng latLng) {
        this.f14219b = latLng;
    }

    public void setCameraPosition(CameraPosition cameraPosition) {
        this.f14218a = cameraPosition;
    }

    public ZoomTo getZoomTo() {
        return this.i;
    }

    public ZoomByWithFocus getZoomByWithFocus() {
        return this.g;
    }

    public ZoomBy getZoomBy() {
        return this.h;
    }

    public ScrollBy getScrollBy() {
        return this.f;
    }

    public NewLatLngZoom getNewLatLngZoom() {
        return this.e;
    }

    public NewLatLngBoundsWidthHeight getNewLatLngBoundsWidthHeight() {
        return this.d;
    }

    public NewLatLngBounds getNewLatLngBounds() {
        return this.f14220c;
    }

    public LatLng getLatLng() {
        return this.f14219b;
    }

    public CameraPosition getCameraPosition() {
        return this.f14218a;
    }
}
