package com.huawei.hms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.common.util.Objects;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class Cap implements Parcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new maa();
    public static final int TYPE_BUTT_CAP = 0;
    public static final int TYPE_CUSTOM_CAP = 3;
    public static final int TYPE_ROUND_CAP = 2;
    public static final int TYPE_SQUARE_CAP = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BitmapDescriptor f14235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f14236c;

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cap createFromParcel(Parcel parcel) {
            return Cap.a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cap[] newArray(int i) {
            return new Cap[i];
        }

        maa() {
        }
    }

    protected Cap(int i) {
        this(i, (IBinder) null, Float.valueOf(0.0f));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    Cap(int i, IBinder iBinder, Float f) {
        this(i, iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder)), f);
    }

    private Cap(int i, BitmapDescriptor bitmapDescriptor, Float f) {
        boolean z = false;
        boolean z2 = f != null && f.floatValue() > 0.0f;
        if (i != 3 || (bitmapDescriptor != null && z2)) {
            z = true;
        }
        Preconditions.checkArgument(z, String.format(Locale.ENGLISH, "Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), bitmapDescriptor, f));
        this.f14234a = i;
        this.f14235b = bitmapDescriptor;
        if (f != null) {
            this.f14236c = f.floatValue();
        }
    }

    protected Cap(BitmapDescriptor bitmapDescriptor, float f) {
        this(3, bitmapDescriptor, Float.valueOf(f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.f14234a);
        BitmapDescriptor bitmapDescriptor = this.f14235b;
        parcelWrite.writeIBinder(3, bitmapDescriptor != null ? bitmapDescriptor.getObject().asBinder() : null, true);
        parcelWrite.writeFloat(4, this.f14236c);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    public String toString() {
        return "Cap: type=" + this.f14234a;
    }

    public int hashCode() {
        int i = this.f14234a;
        return Objects.hashCode(Integer.valueOf(i), this.f14235b, Float.valueOf(this.f14236c));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return super.equals(obj);
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f14234a == cap.f14234a && Objects.equal(this.f14235b, cap.f14235b) && Objects.equal(Float.valueOf(this.f14236c), Float.valueOf(cap.f14236c));
    }

    protected static Cap a(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        int i = parcelReader.readInt(2, 3);
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i == 3) {
            IBinder iBinder = parcelReader.readIBinder(3, null);
            float f = parcelReader.readFloat(4, 0.0f);
            if (iBinder != null) {
                BitmapDescriptor bitmapDescriptor = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
                return f != 0.0f ? new CustomCap(bitmapDescriptor, f) : new CustomCap(bitmapDescriptor);
            }
        }
        return null;
    }
}
