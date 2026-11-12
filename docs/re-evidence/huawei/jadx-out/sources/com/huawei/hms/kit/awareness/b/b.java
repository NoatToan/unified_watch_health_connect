package com.huawei.hms.kit.awareness.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.status.BeaconStatus;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
public class b implements Parcelable, BeaconStatus.BeaconData {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.huawei.hms.kit.awareness.b.b.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i) {
            return new b[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }
    };
    public static final String d = "";
    private static final int e = 2048;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f13895c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13893a);
        parcel.writeString(this.f13894b);
        parcel.writeInt(this.f13895c.length);
        parcel.writeByteArray(this.f13895c);
    }

    public int hashCode() {
        return this.f13893a.hashCode() + this.f13894b.hashCode();
    }

    @Override // com.huawei.hms.kit.awareness.status.BeaconStatus.BeaconData
    public String getType() {
        return this.f13894b;
    }

    @Override // com.huawei.hms.kit.awareness.status.BeaconStatus.BeaconData
    public String getNamespace() {
        return this.f13893a;
    }

    @Override // com.huawei.hms.kit.awareness.status.BeaconStatus.BeaconData
    public byte[] getContent() {
        return a() ? new byte[0] : (byte[]) this.f13895c.clone();
    }

    @Override // com.huawei.hms.kit.awareness.status.BeaconStatus.BeaconData
    public String getBeaconId() {
        return !a() ? "" : new String(this.f13895c, StandardCharsets.UTF_8);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.hashCode() != hashCode() || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13893a.equals(bVar.f13893a) && Arrays.equals(this.f13895c, bVar.f13895c) && this.f13894b.equals(bVar.f13894b);
    }

    private boolean a() {
        return this.f13893a.isEmpty() && this.f13894b.isEmpty();
    }

    public b(byte[] bArr) {
        this.f13893a = "";
        this.f13894b = "";
        this.f13895c = Arrays.copyOf(bArr, bArr.length);
    }

    public b(String str, String str2, byte[] bArr) {
        this.f13893a = str;
        this.f13894b = str2;
        this.f13895c = Arrays.copyOf(bArr, bArr.length);
    }

    public b(String str) {
        this.f13893a = "";
        this.f13894b = "";
        this.f13895c = str.getBytes(StandardCharsets.UTF_8);
    }

    private b(Parcel parcel) {
        this.f13893a = parcel.readString();
        this.f13894b = parcel.readString();
        int i = parcel.readInt();
        if (i <= 0 || i > 2048) {
            this.f13895c = new byte[0];
            return;
        }
        byte[] bArr = new byte[i];
        this.f13895c = bArr;
        parcel.readByteArray(bArr);
    }
}
