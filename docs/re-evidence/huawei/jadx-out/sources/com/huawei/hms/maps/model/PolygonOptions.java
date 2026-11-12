package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class PolygonOptions implements Parcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new maa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f14272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f14273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f14274c;
    private int d;
    private int e;
    private float f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private List k;

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PolygonOptions createFromParcel(Parcel parcel) {
            return new PolygonOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PolygonOptions[] newArray(int i) {
            return new PolygonOptions[i];
        }

        maa() {
        }
    }

    public PolygonOptions() {
        this.f14274c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.f14272a = new ArrayList();
        this.f14273b = new ArrayList();
        this.k = new ArrayList();
    }

    public PolygonOptions add(LatLng latLng) {
        this.f14272a.add(latLng);
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected PolygonOptions(Parcel parcel) {
        this.f14274c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f14272a = parcelReader.createTypedList(2, LatLng.CREATOR, new ArrayList());
        ArrayList arrayList = new ArrayList();
        parcelReader.readList(3, arrayList, LatLng.class.getClassLoader());
        this.f14273b = arrayList;
        this.f14274c = parcelReader.readFloat(4, 0.0f);
        this.d = parcelReader.readInt(5, 0);
        this.e = parcelReader.readInt(6, 0);
        this.f = parcelReader.readFloat(7, 0.0f);
        this.g = parcelReader.readBoolean(8, true);
        this.h = parcelReader.readBoolean(9, true);
        this.i = parcelReader.readBoolean(10, true);
        this.j = parcelReader.readInt(11, 0);
        this.k = parcelReader.createTypedList(12, PatternItem.CREATOR, null);
    }

    public PolygonOptions add(LatLng... latLngArr) {
        this.f14272a.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolygonOptions zIndex(float f) {
        this.f = f;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeTypedList(2, this.f14272a, false);
        parcelWrite.writeList(3, this.f14273b, false);
        parcelWrite.writeFloat(4, this.f14274c);
        parcelWrite.writeInt(5, this.d);
        parcelWrite.writeInt(6, this.e);
        parcelWrite.writeFloat(7, this.f);
        parcelWrite.writeBoolean(8, this.g);
        parcelWrite.writeBoolean(9, this.h);
        parcelWrite.writeBoolean(10, this.i);
        parcelWrite.writeInt(11, this.j);
        parcelWrite.writeTypedList(12, this.k, false);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    public PolygonOptions visible(boolean z) {
        this.g = z;
        return this;
    }

    public PolygonOptions strokeWidth(float f) {
        this.f14274c = f;
        return this;
    }

    public PolygonOptions strokePattern(List<PatternItem> list) {
        this.k = list;
        return this;
    }

    public PolygonOptions strokeJointType(int i) {
        this.j = i;
        return this;
    }

    public PolygonOptions strokeColor(int i) {
        this.d = i;
        return this;
    }

    public boolean isVisible() {
        return this.g;
    }

    public boolean isGeodesic() {
        return this.h;
    }

    public boolean isClickable() {
        return this.i;
    }

    public float getZIndex() {
        return this.f;
    }

    public float getStrokeWidth() {
        return this.f14274c;
    }

    public List<PatternItem> getStrokePattern() {
        return this.k;
    }

    public int getStrokeJointType() {
        return this.j;
    }

    public int getStrokeColor() {
        return this.d;
    }

    public List<LatLng> getPoints() {
        return this.f14272a;
    }

    public List<List<LatLng>> getHoles() {
        return this.f14273b;
    }

    public int getFillColor() {
        return this.e;
    }

    public PolygonOptions geodesic(boolean z) {
        this.h = z;
        return this;
    }

    public PolygonOptions fillColor(int i) {
        this.e = i;
        return this;
    }

    public PolygonOptions clickable(boolean z) {
        this.i = z;
        return this;
    }

    public PolygonOptions addHole(Iterable<LatLng> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f14273b.add(arrayList);
        return this;
    }

    public PolygonOptions addAll(Iterable<LatLng> iterable) {
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.f14272a.add(it.next());
        }
        return this;
    }
}
