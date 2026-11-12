package pb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import fa.z;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f136816d;

    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(Parcel parcel) {
        super(InternalFrame.ID);
        String string = parcel.readString();
        int i14 = z.f70071a;
        this.f136814b = string;
        this.f136815c = parcel.readString();
        this.f136816d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            String str = jVar.f136815c;
            int i14 = z.f70071a;
            if (Objects.equals(this.f136815c, str) && Objects.equals(this.f136814b, jVar.f136814b) && Objects.equals(this.f136816d, jVar.f136816d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f136814b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f136815c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f136816d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // pb.h
    public final String toString() {
        return this.f136812a + ": domain=" + this.f136814b + ", description=" + this.f136815c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f136812a);
        parcel.writeString(this.f136814b);
        parcel.writeString(this.f136816d);
    }

    public j(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.f136814b = str;
        this.f136815c = str2;
        this.f136816d = str3;
    }
}
