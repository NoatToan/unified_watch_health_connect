package cy2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bu\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fB]\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u0010BI\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcy2/c;", "Landroid/os/Parcelable;", "", "locale", "cssUrl", "upcCssUrl", "upcStylingJsonName", "Lcy2/d;", "lightColors", "darkColors", "clientName", "", "showHeader", "showFooter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcy2/d;Lcy2/d;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "(Ljava/lang/String;Lcy2/d;Lcy2/d;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f56811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f56812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f56813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f56814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f56815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f56816i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            d dVarCreateFromParcel = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            d dVarCreateFromParcel2 = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new c(string, string2, string3, string4, dVarCreateFromParcel, dVarCreateFromParcel2, string5, boolValueOf, boolValueOf2, null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, d dVar, d dVar2, String str5, Boolean bool, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : dVar, (i14 & 32) != 0 ? null : dVar2, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? Boolean.FALSE : bool, (i14 & 256) != 0 ? Boolean.FALSE : bool2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f56808a, cVar.f56808a) && s.g(this.f56809b, cVar.f56809b) && s.g(this.f56810c, cVar.f56810c) && s.g(this.f56811d, cVar.f56811d) && s.g(this.f56812e, cVar.f56812e) && s.g(this.f56813f, cVar.f56813f) && s.g(this.f56814g, cVar.f56814g) && s.g(this.f56815h, cVar.f56815h) && s.g(this.f56816i, cVar.f56816i);
    }

    public final int hashCode() {
        String str = this.f56808a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f56809b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56810c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f56811d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        d dVar = this.f56812e;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f56813f;
        int iHashCode6 = (iHashCode5 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        String str5 = this.f56814g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f56815h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f56816i;
        return iHashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("GarminStoreConfiguration(locale=", this.f56808a, ", cssUrl=", this.f56809b, ", upcCssUrl=");
        sn.a.t(sbI, this.f56810c, ", upcStylingJsonName=", this.f56811d, ", lightColors=");
        sbI.append(this.f56812e);
        sbI.append(", darkColors=");
        sbI.append(this.f56813f);
        sbI.append(", clientName=");
        b71.i.w(sbI, this.f56814g, ", showHeader=", this.f56815h, ", showFooter=");
        return p6.b.f(sbI, this.f56816i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f56808a);
        parcel.writeString(this.f56809b);
        parcel.writeString(this.f56810c);
        parcel.writeString(this.f56811d);
        d dVar = this.f56812e;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        d dVar2 = this.f56813f;
        if (dVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar2.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f56814g);
        Boolean bool = this.f56815h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.f56816i;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool2);
        }
    }

    private c(String str, String str2, String str3, String str4, d dVar, d dVar2, String str5, Boolean bool, Boolean bool2) {
        this.f56808a = str;
        this.f56809b = str2;
        this.f56810c = str3;
        this.f56811d = str4;
        this.f56812e = dVar;
        this.f56813f = dVar2;
        this.f56814g = str5;
        this.f56815h = bool;
        this.f56816i = bool2;
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, d dVar, d dVar2, String str5, Boolean bool, Boolean bool2, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, str4, dVar, dVar2, str5, bool, bool2);
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? Boolean.FALSE : bool, (i14 & 64) != 0 ? Boolean.FALSE : bool2);
    }

    public c(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2) {
        this(str, str2, str3, str4, (d) null, (d) null, str5, bool, bool2);
    }

    public /* synthetic */ c(String str, d dVar, d dVar2, String str2, Boolean bool, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, dVar, dVar2, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? Boolean.FALSE : bool, (i14 & 32) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, d dVar, d dVar2, String str2, Boolean bool, Boolean bool2) {
        this(str, "https://exploreapp.azureedge.net/css/mobile-uac.css", "https://exploreapp.azureedge.net/css/mobile-uac-upc.css", "sharedMobileTheme", dVar, dVar2, str2, bool, bool2);
        dVar.getClass();
        dVar2.getClass();
    }
}
