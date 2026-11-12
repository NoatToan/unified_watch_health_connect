package sh2;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import kg.f;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsh2/a;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", FirebaseAnalytics.Param.INDEX, "", "required", "displayString", "Landroid/graphics/drawable/Drawable;", "displayDrawable", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3017a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f159308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f159309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f159310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f159311e;

    /* JADX INFO: renamed from: sh2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C3017a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new a(string, numValueOf, boolValueOf, parcel.readString(), (Drawable) parcel.readValue(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(String str, Integer num, Boolean bool, String str2, Drawable drawable, int i14, j jVar) {
        this(str, num, (i14 & 4) != 0 ? Boolean.FALSE : bool, (i14 & 8) != 0 ? "" : str2, (i14 & 16) != 0 ? null : drawable);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f159307a, aVar.f159307a) && s.g(this.f159308b, aVar.f159308b) && s.g(this.f159309c, aVar.f159309c) && s.g(this.f159310d, aVar.f159310d) && s.g(this.f159311e, aVar.f159311e);
    }

    public final int hashCode() {
        int iHashCode = this.f159307a.hashCode() * 31;
        Integer num = this.f159308b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f159309c;
        int iJ = g.j((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f159310d);
        Drawable drawable = this.f159311e;
        return iJ + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = u0.n("ControlsData(id=", this.f159308b, this.f159307a, ", index=", ", required=");
        i.s(sbN, this.f159309c, ", displayString=", this.f159310d, ", displayDrawable=");
        sbN.append(this.f159311e);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f159307a);
        Integer num = this.f159308b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        Boolean bool = this.f159309c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        parcel.writeString(this.f159310d);
        parcel.writeValue(this.f159311e);
    }

    public a(String str, Integer num, Boolean bool, String str2, Drawable drawable) {
        str.getClass();
        str2.getClass();
        this.f159307a = str;
        this.f159308b = num;
        this.f159309c = bool;
        this.f159310d = str2;
        this.f159311e = drawable;
    }
}
