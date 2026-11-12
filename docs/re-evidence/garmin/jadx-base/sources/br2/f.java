package br2;

import android.os.Parcel;
import android.os.Parcelable;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lbr2/f;", "Landroid/os/Parcelable;", "", "deviceUnitId", "", "deviceName", "deviceImageUrl", "Lbr2/d;", "deviceConnectionStatus", "currentFirmwareVersion", "requiredFirmwareVersion", "", "isOrphanedItem", "isChecked", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lbr2/d;Ljava/lang/String;Ljava/lang/String;ZZ)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f19602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f19607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f19598j = new a(null);
    public static final Parcelable.Creator<f> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readLong(), parcel.readString(), parcel.readString(), d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(long j8, String str, String str2, d dVar, String str3, String str4, boolean z14, boolean z15) {
        str.getClass();
        str2.getClass();
        dVar.getClass();
        str3.getClass();
        str4.getClass();
        this.f19599a = j8;
        this.f19600b = str;
        this.f19601c = str2;
        this.f19602d = dVar;
        this.f19603e = str3;
        this.f19604f = str4;
        this.f19605g = z14;
        this.f19606h = z15;
    }

    public final int b(f fVar) {
        fVar.getClass();
        return (!s.g(this.f19601c, fVar.f19601c) ? 1 : 0) | (s.g(this.f19600b, fVar.f19600b) ? 0 : 2) | (this.f19602d == fVar.f19602d ? 0 : 4) | (s.g(this.f19603e, fVar.f19603e) ? 0 : 8) | (s.g(this.f19604f, fVar.f19604f) ? 0 : 16) | (this.f19607i != fVar.f19607i ? 32 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f19599a == fVar.f19599a && s.g(this.f19600b, fVar.f19600b) && s.g(this.f19601c, fVar.f19601c) && this.f19602d == fVar.f19602d && s.g(this.f19603e, fVar.f19603e) && s.g(this.f19604f, fVar.f19604f) && this.f19605g == fVar.f19605g && this.f19606h == fVar.f19606h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19606h) + q6.f.g(wr.g.j(wr.g.j((this.f19602d.hashCode() + wr.g.j(wr.g.j(Long.hashCode(this.f19599a) * 31, 31, this.f19600b), 31, this.f19601c)) * 31, 31, this.f19603e), 31, this.f19604f), 31, this.f19605g);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f19599a, "DeviceItemModel(deviceUnitId=", ", deviceName=", this.f19600b);
        sbK.append(", deviceImageUrl=");
        sbK.append(this.f19601c);
        sbK.append(", deviceConnectionStatus=");
        sbK.append(this.f19602d);
        sn.a.t(sbK, ", currentFirmwareVersion=", this.f19603e, ", requiredFirmwareVersion=", this.f19604f);
        com.airbnb.lottie.animation.keyframe.a.v(", isOrphanedItem=", ", isChecked=", sbK, this.f19605g, this.f19606h);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f19599a);
        parcel.writeString(this.f19600b);
        parcel.writeString(this.f19601c);
        parcel.writeString(this.f19602d.name());
        parcel.writeString(this.f19603e);
        parcel.writeString(this.f19604f);
        parcel.writeInt(this.f19605g ? 1 : 0);
        parcel.writeInt(this.f19606h ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lbr2/f$a;", "", "<init>", "()V", "", "PAYLOAD_DEVICE_IMAGE_URL", "I", "PAYLOAD_DEVICE_NAME", "PAYLOAD_DEVICE_CONNECTION_STATUS", "PAYLOAD_CURRENT_FW_VERSION", "PAYLOAD_REQUIRED_FW_VERSION", "PAYLOAD_WALLET_ITEM_ASSOCIATION_STATE", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: br2.f$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0294a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19608a;

            static {
                int[] iArr = new int[hs2.b.values().length];
                try {
                    iArr[hs2.b.READY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[hs2.b.CONNECTING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f19608a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static d a(long j8, boolean z14, hs2.b bVar) {
            bVar.getClass();
            if (!z14) {
                return d.NOT_PAIRED;
            }
            int i14 = C0294a.f19608a[bVar.ordinal()];
            if (i14 == 1) {
                return d.CONNECTED;
            }
            if (i14 != 2) {
                return !((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).a(j8) ? d.NOT_CONNECTED : d.NFC_NOT_CONNECTED;
            }
            return d.CONNECTING;
        }

        private a() {
        }
    }

    public /* synthetic */ f(long j8, String str, String str2, d dVar, String str3, String str4, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, str2, dVar, str3, str4, (i14 & 64) != 0 ? false : z14, (i14 & 128) != 0 ? false : z15);
    }
}
