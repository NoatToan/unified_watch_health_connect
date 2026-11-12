package du2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Ldu2/j;", "Landroid/os/Parcelable;", "", "format", "", "latitude", "longitude", "hoursOfForecast", "<init>", "(BJJB)V", "", "payload", "([B)V", "a", "weather-gdi_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f61313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f61314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f61316d;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readByte(), parcel.readLong(), parcel.readLong(), parcel.readByte());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(byte[] bArr) {
        this(bArr[0], jg.b.L(1, bArr), jg.b.L(5, bArr), bArr[9]);
        bArr.getClass();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeByte(this.f61313a);
        parcel.writeLong(this.f61314b);
        parcel.writeLong(this.f61315c);
        parcel.writeByte(this.f61316d);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Ldu2/j$a;", "", "<init>", "()V", "", "CURRENT_CONDITIONS_TOTAL_DATA_MESSAGES", "B", "", "DATA_AVAILABLE", "I", "DEFAULT_TIMEOUT", "FORMAT_FIT_PROTOCOL", "FORMAT_GOOGLE_PROTOCOL_BUFFER", "HOURLY_FORECAST_TOTAL_DATA_MESSAGES", "MESSAGE_ID", "weather-gdi_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public j(byte b14, long j8, long j14, byte b15) {
        this.f61313a = b14;
        this.f61314b = j8;
        this.f61315c = j14;
        this.f61316d = b15;
    }
}
