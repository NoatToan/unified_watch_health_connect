package i41;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b)\u0010\u0018R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0014\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b%\u0010\u0016\"\u0004\b,\u0010\u0018R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0014\u001a\u0004\b.\u0010\u0016\"\u0004\b/\u0010\u0018R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0014\u001a\u0004\b-\u0010\u0016\"\u0004\b1\u0010\u0018R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0014\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0014\u001a\u0004\b0\u0010\u0016\"\u0004\b4\u0010\u0018¨\u00065"}, d2 = {"Li41/b;", "Landroid/os/Parcelable;", "", "userProfilePk", "Li41/f;", "hrvSummary", "", "Li41/c;", "hrvReadings", "startTimestampGMT", "endTimestampGMT", "startTimestampLocal", "endTimestampLocal", "sleepStartTimestampGMT", "sleepEndTimestampGMT", "sleepStartTimestampLocal", "sleepEndTimestampLocal", "<init>", "(Ljava/lang/String;Li41/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getUserProfilePk", "()Ljava/lang/String;", "setUserProfilePk", "(Ljava/lang/String;)V", "b", "Li41/f;", "g", "()Li41/f;", "setHrvSummary", "(Li41/f;)V", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "setHrvReadings", "(Ljava/util/List;)V", "d", "m", "setStartTimestampGMT", JWKParameterNames.RSA_EXPONENT, "setEndTimestampGMT", "o", "setStartTimestampLocal", "setEndTimestampLocal", "h", "j", "setSleepStartTimestampGMT", IntegerTokenConverter.CONVERTER_KEY, "setSleepEndTimestampGMT", JWKParameterNames.OCT_KEY_VALUE, "setSleepStartTimestampLocal", "setSleepEndTimestampLocal", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private String userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hrvSummary")
    private f hrvSummary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hrvReadings")
    private List<c> hrvReadings;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimestampGMT")
    private String startTimestampGMT;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimestampGMT")
    private String endTimestampGMT;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimestampLocal")
    private String startTimestampLocal;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimestampLocal")
    private String endTimestampLocal;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepStartTimestampGMT")
    private String sleepStartTimestampGMT;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepEndTimestampGMT")
    private String sleepEndTimestampGMT;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepStartTimestampLocal")
    private String sleepStartTimestampLocal;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepEndTimestampLocal")
    private String sleepEndTimestampLocal;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            f fVarCreateFromParcel = parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel);
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(c.CREATOR, parcel, arrayList, iA, 1);
            }
            return new b(string, fVarCreateFromParcel, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(String str, f fVar, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : fVar, (i14 & 4) != 0 ? new ArrayList() : list, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : str6, (i14 & 256) != 0 ? null : str7, (i14 & 512) != 0 ? null : str8, (i14 & 1024) != 0 ? null : str9);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEndTimestampGMT() {
        return this.endTimestampGMT;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEndTimestampLocal() {
        return this.endTimestampLocal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.userProfilePk, bVar.userProfilePk) && s.g(this.hrvSummary, bVar.hrvSummary) && s.g(this.hrvReadings, bVar.hrvReadings) && s.g(this.startTimestampGMT, bVar.startTimestampGMT) && s.g(this.endTimestampGMT, bVar.endTimestampGMT) && s.g(this.startTimestampLocal, bVar.startTimestampLocal) && s.g(this.endTimestampLocal, bVar.endTimestampLocal) && s.g(this.sleepStartTimestampGMT, bVar.sleepStartTimestampGMT) && s.g(this.sleepEndTimestampGMT, bVar.sleepEndTimestampGMT) && s.g(this.sleepStartTimestampLocal, bVar.sleepStartTimestampLocal) && s.g(this.sleepEndTimestampLocal, bVar.sleepEndTimestampLocal);
    }

    public final List<c> f() {
        return this.hrvReadings;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f getHrvSummary() {
        return this.hrvSummary;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSleepEndTimestampGMT() {
        return this.sleepEndTimestampGMT;
    }

    public final int hashCode() {
        String str = this.userProfilePk;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        f fVar = this.hrvSummary;
        int iB = u0.b((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.hrvReadings);
        String str2 = this.startTimestampGMT;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.endTimestampGMT;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startTimestampLocal;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endTimestampLocal;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sleepStartTimestampGMT;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sleepEndTimestampGMT;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sleepStartTimestampLocal;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.sleepEndTimestampLocal;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSleepEndTimestampLocal() {
        return this.sleepEndTimestampLocal;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSleepStartTimestampGMT() {
        return this.sleepStartTimestampGMT;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSleepStartTimestampLocal() {
        return this.sleepStartTimestampLocal;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getStartTimestampGMT() {
        return this.startTimestampGMT;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getStartTimestampLocal() {
        return this.startTimestampLocal;
    }

    public final String toString() {
        String str = this.userProfilePk;
        f fVar = this.hrvSummary;
        List<c> list = this.hrvReadings;
        String str2 = this.startTimestampGMT;
        String str3 = this.endTimestampGMT;
        String str4 = this.startTimestampLocal;
        String str5 = this.endTimestampLocal;
        String str6 = this.sleepStartTimestampGMT;
        String str7 = this.sleepEndTimestampGMT;
        String str8 = this.sleepStartTimestampLocal;
        String str9 = this.sleepEndTimestampLocal;
        StringBuilder sb3 = new StringBuilder("HrvChartDTO(userProfilePk=");
        sb3.append(str);
        sb3.append(", hrvSummary=");
        sb3.append(fVar);
        sb3.append(", hrvReadings=");
        o2.c.n(", startTimestampGMT=", str2, ", endTimestampGMT=", sb3, list);
        sn.a.t(sb3, str3, ", startTimestampLocal=", str4, ", endTimestampLocal=");
        sn.a.t(sb3, str5, ", sleepStartTimestampGMT=", str6, ", sleepEndTimestampGMT=");
        sn.a.t(sb3, str7, ", sleepStartTimestampLocal=", str8, ", sleepEndTimestampLocal=");
        return am.j.o(str9, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.userProfilePk);
        f fVar = this.hrvSummary;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        Iterator itE = kg.f.e(this.hrvReadings, parcel);
        while (itE.hasNext()) {
            ((c) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeString(this.startTimestampGMT);
        parcel.writeString(this.endTimestampGMT);
        parcel.writeString(this.startTimestampLocal);
        parcel.writeString(this.endTimestampLocal);
        parcel.writeString(this.sleepStartTimestampGMT);
        parcel.writeString(this.sleepEndTimestampGMT);
        parcel.writeString(this.sleepStartTimestampLocal);
        parcel.writeString(this.sleepEndTimestampLocal);
    }

    public b(String str, f fVar, List<c> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        list.getClass();
        this.userProfilePk = str;
        this.hrvSummary = fVar;
        this.hrvReadings = list;
        this.startTimestampGMT = str2;
        this.endTimestampGMT = str3;
        this.startTimestampLocal = str4;
        this.endTimestampLocal = str5;
        this.sleepStartTimestampGMT = str6;
        this.sleepEndTimestampGMT = str7;
        this.sleepStartTimestampLocal = str8;
        this.sleepEndTimestampLocal = str9;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
