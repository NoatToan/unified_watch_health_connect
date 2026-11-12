package sd2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class g implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f158650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f158651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f158652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f158653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f158654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f158655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f158656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f158657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f158649i = LoggerFactory.getLogger("GolfCourseImgDBRecord");
    public static final Parcelable.Creator<g> CREATOR = new a();

    public class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(Parcel parcel) {
        this.f158654e = null;
        this.f158655f = null;
        this.f158656g = null;
        this.f158657h = null;
        this.f158650a = parcel.readLong();
        this.f158651b = parcel.readInt();
        this.f158654e = parcel.readString();
        this.f158652c = parcel.readInt();
        if (parcel.readByte() == 1) {
            this.f158655f = parcel.createByteArray();
        }
        if (parcel.readByte() == 1) {
            this.f158656g = parcel.createByteArray();
        }
        if (parcel.readByte() == 1) {
            this.f158657h = parcel.createByteArray();
        }
        this.f158653d = parcel.readInt();
    }

    public static int b(String str) {
        if (str != null && str.length() >= 11) {
            try {
                return Integer.parseInt(str.substring(10));
            } catch (NumberFormatException e4) {
                f158649i.error("determinePartNbrSuffix: ".concat(str), (Throwable) e4);
            }
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "GolfCourseImageDataDatabaseRecord{deviceID=" + this.f158650a + ", globalID=" + this.f158651b + ", version=" + this.f158652c + ", mapType='" + this.f158653d + ", partNbr='" + this.f158654e + "', imageData=" + Arrays.toString(this.f158655f) + ", gmaData=" + Arrays.toString(this.f158656g) + ", unlData=" + Arrays.toString(this.f158657h) + CoreConstants.CURLY_RIGHT;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f158650a);
        parcel.writeInt(this.f158651b);
        parcel.writeString(this.f158654e);
        parcel.writeInt(this.f158652c);
        if (this.f158655f != null) {
            parcel.writeByte((byte) 1);
            parcel.writeByteArray(this.f158655f);
        } else {
            parcel.writeByte((byte) 0);
        }
        if (this.f158656g != null) {
            parcel.writeByte((byte) 1);
            parcel.writeByteArray(this.f158656g);
        } else {
            parcel.writeByte((byte) 0);
        }
        if (this.f158657h != null) {
            parcel.writeByte((byte) 1);
            parcel.writeByteArray(this.f158657h);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeInt(this.f158653d);
    }

    public g() {
        this.f158654e = null;
        this.f158655f = null;
        this.f158656g = null;
        this.f158657h = null;
    }
}
