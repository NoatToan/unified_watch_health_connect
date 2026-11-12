package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lrn2/g;", "Lpn2/d;", "", "apduName", "apduId", "apdu", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "d", "c", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements pn2.d {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apduName")
    private final String apduName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apduId")
    private final String apduId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apdu")
    private final String apdu;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(String str, String str2, String str3) {
        int length;
        str2.getClass();
        str3.getClass();
        this.apduName = str;
        this.apduId = str2;
        this.apdu = str3;
        if (str != null && (1 > (length = str.length()) || length >= 101)) {
            vb.h.x(am.j.h(str.length(), "apduName length(1-100): "));
            throw null;
        }
        if (str2.length() != 32) {
            vb.h.x(am.j.h(str2.length(), "apduId length(1-100): "));
            throw null;
        }
        int length2 = str3.length();
        if (2 > length2 || length2 >= 523) {
            vb.h.x(am.j.h(str3.length(), "apdu length(2-522): "));
            throw null;
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getApdu() {
        return this.apdu;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getApduId() {
        return this.apduId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.apduName, gVar.apduName) && p005kotlin.jvm.internal.s.g(this.apduId, gVar.apduId) && p005kotlin.jvm.internal.s.g(this.apdu, gVar.apdu);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getApduName() {
        return this.apduName;
    }

    public final int hashCode() {
        String str = this.apduName;
        return this.apdu.hashCode() + wr.g.j((str == null ? 0 : str.hashCode()) * 31, 31, this.apduId);
    }

    public final String toString() {
        return am.j.o(this.apdu, "')", p6.b.i("FNCApduCommandDto(apduName=", this.apduName, ", apduId='", this.apduId, "', apdu='"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.apduName);
        parcel.writeString(this.apduId);
        parcel.writeString(this.apdu);
    }
}
