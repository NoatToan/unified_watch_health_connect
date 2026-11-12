package com.huawei.hms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.model.internal.ITileProviderDelegate;

/* JADX INFO: loaded from: classes34.dex */
public class TileOverlayOptions implements Parcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new maa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f14282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f14284c;
    private ITileProviderDelegate d;
    private boolean e;
    private TileProvider f;

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TileOverlayOptions createFromParcel(Parcel parcel) {
            return new TileOverlayOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TileOverlayOptions[] newArray(int i) {
            return new TileOverlayOptions[i];
        }

        maa() {
        }
    }

    public TileOverlayOptions() {
        this.f14283b = true;
        this.f14284c = 0.0f;
        this.d = null;
        this.e = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected TileOverlayOptions(Parcel parcel) {
        this.f14283b = true;
        this.f14284c = 0.0f;
        this.d = null;
        this.e = true;
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f14282a = parcelReader.readFloat(2, 0.0f);
        this.f14283b = parcelReader.readBoolean(3, true);
        this.f14284c = parcelReader.readFloat(4, 0.0f);
        IBinder iBinder = parcelReader.readIBinder(5, null);
        if (iBinder != null) {
            this.d = ITileProviderDelegate.Stub.asInterface(iBinder);
        }
        this.e = parcelReader.readBoolean(6, true);
        this.f = new mab();
    }

    public TileOverlayOptions zIndex(float f) {
        this.f14282a = f;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeFloat(2, this.f14282a);
        parcelWrite.writeBoolean(3, this.f14283b);
        parcelWrite.writeFloat(4, this.f14284c);
        parcelWrite.writeIBinder(5, this.d.asBinder(), false);
        parcelWrite.writeBoolean(6, this.e);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    public TileOverlayOptions visible(boolean z) {
        this.f14283b = z;
        return this;
    }

    public TileOverlayOptions transparency(float f) {
        Preconditions.checkArgument(f >= 0.0f, "Transparency should be equal or more than 0.0");
        Preconditions.checkArgument(f <= 1.0f, "Transparency should be equal or less than 1.0");
        this.f14284c = f;
        return this;
    }

    public TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.f = tileProvider;
        this.d = tileProvider == null ? null : new mac();
        return this;
    }

    public boolean isVisible() {
        return this.f14283b;
    }

    public float getZIndex() {
        return this.f14282a;
    }

    public float getTransparency() {
        return this.f14284c;
    }

    public TileProvider getTileProvider() {
        return this.f;
    }

    public boolean getFadeIn() {
        return this.e;
    }

    public TileOverlayOptions fadeIn(boolean z) {
        this.e = z;
        return this;
    }

    class mab implements TileProvider {
        @Override // com.huawei.hms.maps.model.TileProvider
        public Tile getTile(int i, int i2, int i3) {
            try {
                return TileOverlayOptions.this.d.getTile(i, i2, i3);
            } catch (RemoteException unused) {
                return null;
            }
        }

        mab() {
        }
    }

    class mac extends ITileProviderDelegate.Stub {
        @Override // com.huawei.hms.maps.model.internal.ITileProviderDelegate
        public Tile getTile(int i, int i2, int i3) {
            return TileOverlayOptions.this.f.getTile(i, i2, i3);
        }

        mac() {
        }
    }
}
