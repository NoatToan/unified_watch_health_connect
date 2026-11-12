package com.huami.watch.transport;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class TransportDataItem implements Parcelable {
    public static final Parcelable.Creator<TransportDataItem> CREATOR = new a();
    private static final String d = "TransportDataItem";
    private static final String e = "Transport";
    private Uri a;
    private long b;
    private DataBundle c;

    public class a implements Parcelable.Creator<TransportDataItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TransportDataItem createFromParcel(Parcel parcel) {
            return new TransportDataItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TransportDataItem[] newArray(int i) {
            return new TransportDataItem[i];
        }
    }

    public TransportDataItem() {
    }

    public void addAction(String str) {
        Uri.Builder builderBuildUpon = this.a.buildUpon();
        builderBuildUpon.appendEncodedPath(str);
        this.a = builderBuildUpon.build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.a.getLastPathSegment();
    }

    public long getCreateTime() {
        return this.b;
    }

    public DataBundle getData() {
        return this.c;
    }

    public String getModuleName() {
        return this.a.getAuthority();
    }

    public Uri getUri() {
        return this.a;
    }

    public void setData(DataBundle dataBundle) {
        this.c = dataBundle;
    }

    public String toString() {
        return "[" + this.a + ", Time: " + this.b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.toString());
        parcel.writeLong(this.b);
        this.c.writeToParcel(parcel, 0);
    }

    public TransportDataItem(String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("Transport");
        builder.authority(str.trim());
        this.a = builder.build();
        this.b = System.currentTimeMillis();
    }

    public TransportDataItem(Uri uri, long j) {
        this.a = uri;
        this.b = j;
        this.c = new DataBundle();
    }

    public TransportDataItem(Parcel parcel) {
        String string = parcel.readString();
        if (string != null) {
            this.a = Uri.parse(string);
        } else {
            this.a = Uri.parse("");
        }
        this.b = parcel.readLong();
        try {
            this.c = new DataBundle(parcel, parcel.readInt());
        } catch (Exception e2) {
            Log.w(d, "ParseDataBundleErr", e2, new Object[0]);
            this.c = new DataBundle();
        }
    }
}
