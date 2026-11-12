package wj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f185735a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f185736b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f185737c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f185738d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f185739e = new b();

    public static class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            int i14 = parcel.readInt();
            boolean[] zArr = new boolean[parcel.readInt()];
            parcel.readBooleanArray(zArr);
            f fVar = new f();
            fVar.f185735a = zArr[c.RX_MESSAGE_TIMESTAMP.ordinal()];
            fVar.f185736b = zArr[c.BACKGROUND_SCANNING.ordinal()];
            fVar.f185737c = zArr[c.FREQUENCY_AGILITY.ordinal()];
            fVar.f185738d = parcel.readInt();
            if (i14 > 1) {
                Bundle bundle = parcel.readBundle();
                bundle.setClassLoader(b.class.getClassLoader());
                fVar.f185739e = (b) bundle.getParcelable("com.dsi.ant.channel.capabilities.bundledata");
            }
            return fVar;
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f185740a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f185741b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f185742c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f185743d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f185744e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f185745f = 80;

        public static class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                int i14 = parcel.readInt();
                boolean[] zArr = new boolean[parcel.readInt()];
                parcel.readBooleanArray(zArr);
                b bVar = new b();
                if (i14 != 1) {
                    bVar.f185743d = zArr[EnumC3453b.SEARCH_PRIORITY.ordinal()];
                }
                bVar.f185740a = zArr[EnumC3453b.RSSI.ordinal()];
                bVar.f185741b = zArr[EnumC3453b.WILDCARD_ID_LIST.ordinal()];
                bVar.f185742c = zArr[EnumC3453b.EVENT_BUFFERING.ordinal()];
                bVar.f185744e = parcel.readInt();
                bVar.f185745f = parcel.readInt();
                return bVar;
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ b[] newArray(int i14) {
                return null;
            }
        }

        /* JADX INFO: renamed from: wj.f$b$b, reason: collision with other inner class name */
        public enum EnumC3453b {
            RSSI,
            WILDCARD_ID_LIST,
            EVENT_BUFFERING,
            SEARCH_PRIORITY,
            NUMBER_OF_BUNDLE_CAPABILITIES
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            EnumC3453b enumC3453b = EnumC3453b.NUMBER_OF_BUNDLE_CAPABILITIES;
            boolean[] zArr = new boolean[enumC3453b.ordinal()];
            zArr[EnumC3453b.RSSI.ordinal()] = this.f185740a;
            zArr[EnumC3453b.WILDCARD_ID_LIST.ordinal()] = this.f185741b;
            zArr[EnumC3453b.EVENT_BUFFERING.ordinal()] = this.f185742c;
            zArr[EnumC3453b.SEARCH_PRIORITY.ordinal()] = this.f185742c;
            parcel.writeInt(2);
            parcel.writeInt(enumC3453b.ordinal());
            parcel.writeBooleanArray(zArr);
            parcel.writeInt(this.f185744e);
            parcel.writeInt(this.f185745f);
        }
    }

    public enum c {
        RX_MESSAGE_TIMESTAMP,
        EXTENDED_ASSIGN,
        BACKGROUND_SCANNING,
        FREQUENCY_AGILITY,
        NUMBER_OF_CAPABILITIES
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (fVar.f185735a == this.f185735a && fVar.f185736b == this.f185736b && fVar.f185737c == this.f185737c) {
            b bVar = fVar.f185739e;
            boolean z14 = bVar.f185740a;
            b bVar2 = this.f185739e;
            if (z14 == bVar2.f185740a && bVar.f185741b == bVar2.f185741b && bVar.f185742c == bVar2.f185742c && bVar.f185744e == bVar2.f185744e && bVar.f185745f == bVar2.f185745f && fVar.f185738d == this.f185738d && bVar.f185743d == bVar2.f185743d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i14 = (((((217 + (this.f185735a ? 1 : 0)) * 31) + (this.f185736b ? 1 : 0)) * 31) + (this.f185737c ? 1 : 0)) * 31;
        b bVar = this.f185739e;
        return ((((((((((i14 + (bVar.f185740a ? 1 : 0)) * 31) + (bVar.f185741b ? 1 : 0)) * 31) + (bVar.f185742c ? 1 : 0)) * 31) + bVar.f185744e) * 31) + bVar.f185745f) * 31) + (bVar.f185743d ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Capabilities:");
        if (this.f185735a) {
            sb3.append(" -Rx Message Timestamp");
        }
        if (this.f185736b) {
            sb3.append(" -Background Scanning");
        }
        if (this.f185737c) {
            sb3.append(" -Frequency Agility");
        }
        if (this.f185739e.f185740a) {
            sb3.append(" -RSSI");
        }
        if (this.f185739e.f185741b) {
            sb3.append(" -Wildcards in ID Lists");
        }
        if (this.f185739e.f185742c) {
            sb3.append(" -Event Buffering");
        }
        if (3 != this.f185738d) {
            sb3.append("  Max Transmit Power Level: ");
            sb3.append(this.f185738d);
        }
        sb3.append(" -RF Frequency Range: ");
        sb3.append(this.f185739e.f185744e);
        sb3.append(" to ");
        sb3.append(this.f185739e.f185745f);
        sb3.append(" MHz offset of 2400 MHz");
        if (this.f185739e.f185743d) {
            sb3.append(" -Search Priority");
        }
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(2);
        c cVar = c.NUMBER_OF_CAPABILITIES;
        boolean[] zArr = new boolean[cVar.ordinal()];
        zArr[c.RX_MESSAGE_TIMESTAMP.ordinal()] = this.f185735a;
        zArr[c.EXTENDED_ASSIGN.ordinal()] = this.f185736b || this.f185737c;
        zArr[c.BACKGROUND_SCANNING.ordinal()] = this.f185736b;
        zArr[c.FREQUENCY_AGILITY.ordinal()] = this.f185737c;
        parcel.writeInt(cVar.ordinal());
        parcel.writeBooleanArray(zArr);
        parcel.writeInt(this.f185738d);
        if (vj.a.b()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.dsi.ant.channel.capabilities.bundledata", this.f185739e);
            parcel.writeBundle(bundle);
        }
    }
}
