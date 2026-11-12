package com.ingenic.iwds.os;

import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class SafeParcelUuid implements SafeParcelable {
    public static final SafeParcelable.Creator<SafeParcelUuid> CREATOR = new a();
    private UUID a;

    public static class a implements SafeParcelable.Creator<SafeParcelUuid> {
        @Override // com.ingenic.iwds.os.SafeParcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SafeParcelUuid createFromParcel(SafeParcel safeParcel) {
            return new SafeParcelUuid(new UUID(safeParcel.readLong(), safeParcel.readLong()));
        }

        @Override // com.ingenic.iwds.os.SafeParcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SafeParcelUuid[] newArray(int i) {
            return new SafeParcelUuid[i];
        }
    }

    public SafeParcelUuid(UUID uuid) {
        this.a = uuid;
    }

    public static SafeParcelUuid fromString(String str) {
        return new SafeParcelUuid(UUID.fromString(str));
    }

    @Override // com.ingenic.iwds.os.SafeParcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof SafeParcelUuid) {
            return this.a.equals(((SafeParcelUuid) obj).a);
        }
        return false;
    }

    public UUID getUuid() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    @Override // com.ingenic.iwds.os.SafeParcelable
    public void writeToParcel(SafeParcel safeParcel, int i) {
        safeParcel.writeLong(this.a.getMostSignificantBits());
        safeParcel.writeLong(this.a.getLeastSignificantBits());
    }
}
