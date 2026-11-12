package b11;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import g01.w;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb11/d;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "name", "Lg01/w;", NotificationConstants.KEY_DATA_MIME_TYPE, "brandName", "Lg01/u;", "source", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "imageUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lg01/w;Ljava/lang/String;Lg01/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f14255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g01.u f14257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14260h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readString(), parcel.readString(), w.CREATOR.createFromParcel(parcel), parcel.readString(), g01.u.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(String str, String str2, w wVar, String str3, g01.u uVar, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        wVar.getClass();
        uVar.getClass();
        str4.getClass();
        str5.getClass();
        this.f14253a = str;
        this.f14254b = str2;
        this.f14255c = wVar;
        this.f14256d = str3;
        this.f14257e = uVar;
        this.f14258f = str4;
        this.f14259g = str5;
        this.f14260h = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.f14253a, dVar.f14253a) && p005kotlin.jvm.internal.s.g(this.f14254b, dVar.f14254b) && this.f14255c == dVar.f14255c && p005kotlin.jvm.internal.s.g(this.f14256d, dVar.f14256d) && this.f14257e == dVar.f14257e && p005kotlin.jvm.internal.s.g(this.f14258f, dVar.f14258f) && p005kotlin.jvm.internal.s.g(this.f14259g, dVar.f14259g) && p005kotlin.jvm.internal.s.g(this.f14260h, dVar.f14260h);
    }

    public final int hashCode() {
        int iHashCode = (this.f14255c.hashCode() + wr.g.j(this.f14253a.hashCode() * 31, 31, this.f14254b)) * 31;
        String str = this.f14256d;
        int iJ = wr.g.j(wr.g.j((this.f14257e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f14258f), 31, this.f14259g);
        String str2 = this.f14260h;
        return iJ + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FoodMetadataUIModel(id=", this.f14253a, ", name=", this.f14254b, ", type=");
        sbI.append(this.f14255c);
        sbI.append(", brandName=");
        sbI.append(this.f14256d);
        sbI.append(", source=");
        sbI.append(this.f14257e);
        sbI.append(", regionCode=");
        sbI.append(this.f14258f);
        sbI.append(", languageCode=");
        return e5.h(sbI, this.f14259g, ", imageUuid=", this.f14260h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f14253a);
        parcel.writeString(this.f14254b);
        this.f14255c.writeToParcel(parcel, i14);
        parcel.writeString(this.f14256d);
        parcel.writeString(this.f14257e.name());
        parcel.writeString(this.f14258f);
        parcel.writeString(this.f14259g);
        parcel.writeString(this.f14260h);
    }

    public /* synthetic */ d(String str, String str2, w wVar, String str3, g01.u uVar, String str4, String str5, String str6, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, wVar, str3, uVar, str4, str5, (i14 & 128) != 0 ? null : str6);
    }
}
