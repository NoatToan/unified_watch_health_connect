package vr2;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.UUID;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import w02.b0;
import w3.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lvr2/q;", "Landroid/os/Parcelable;", "", "cardName", "cardImageUrl", "cardNumber", "balanceText", "Lfs2/a;", "deviceWalletItem", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfs2/a;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f179656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f179657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fs2.a f179658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final br2.g f179659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final is2.b f179660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f179661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f179662i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new q(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (fs2.a) parcel.readParcelable(q.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f179663a;

        static {
            int[] iArr = new int[is2.b.values().length];
            try {
                iArr[is2.b.FELICA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[is2.b.FITPAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[is2.b.PRELOAD_EASYCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[is2.b.PRELOAD_IPASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[is2.b.RABBIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[is2.b.UNION_PAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[is2.b.NXP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f179663a = iArr;
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public q(String str, String str2, String str3, String str4, fs2.a aVar) {
        aVar.getClass();
        this.f179654a = str;
        this.f179655b = str2;
        this.f179656c = str3;
        this.f179657d = str4;
        this.f179658e = aVar;
        this.f179659f = yr2.n.a(aVar.f73433h);
        this.f179660g = aVar.f73427b;
        this.f179661h = aVar.f73426a;
        this.f179662i = aVar.f73436k;
    }

    public final int b(q qVar) {
        qVar.getClass();
        return (!s.g(this.f179655b, qVar.f179655b) ? 1 : 0) | (s.g(this.f179654a, qVar.f179654a) ? 0 : 2) | ((s.g(this.f179656c, qVar.f179656c) && this.f179659f == qVar.f179659f && s.g(this.f179657d, qVar.f179657d)) ? 0 : 4);
    }

    public final byte[] d() {
        is2.b bVar = this.f179660g;
        int i14 = bVar == null ? -1 : c.f179663a[bVar.ordinal()];
        String str = this.f179661h;
        fs2.a aVar = this.f179658e;
        switch (i14) {
            case -1:
            case 6:
            case 7:
                return null;
            case 0:
            default:
                u0.r();
                return null;
            case 1:
                byte[] bytes = str.getBytes(d53.c.f57666b);
                bytes.getClass();
                return bytes;
            case 2:
                if (!x.r(aVar)) {
                    return null;
                }
                UUID uuidFromString = UUID.fromString(str);
                uuidFromString.getClass();
                return b0.A(uuidFromString);
            case 3:
            case 4:
            case 5:
                return Base64.decode(aVar.f73434i, 0);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return s.g(this.f179654a, qVar.f179654a) && s.g(this.f179655b, qVar.f179655b) && s.g(this.f179656c, qVar.f179656c) && s.g(this.f179657d, qVar.f179657d) && this.f179658e.equals(qVar.f179658e);
    }

    public final int hashCode() {
        String str = this.f179654a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f179655b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f179656c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f179657d;
        return this.f179658e.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("UserWalletCardItemModel(cardName=", this.f179654a, ", cardImageUrl=", this.f179655b, ", cardNumber=");
        sn.a.t(sbI, this.f179656c, ", balanceText=", this.f179657d, ", deviceWalletItem=");
        sbI.append(this.f179658e);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f179654a);
        parcel.writeString(this.f179655b);
        parcel.writeString(this.f179656c);
        parcel.writeString(this.f179657d);
        parcel.writeParcelable(this.f179658e, i14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lvr2/q$a;", "", "<init>", "()V", "", "PAYLOAD_CARD_IMAGE_URL", "I", "PAYLOAD_CARD_TITLE", "PAYLOAD_ADDITIONAL_CARD_INFO", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
