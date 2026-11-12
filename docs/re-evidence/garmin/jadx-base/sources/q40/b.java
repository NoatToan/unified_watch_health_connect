package q40;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import com.garmin.android.apps.connectmobile.courses.model.f;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import j20.x;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lq40/b;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", "name", "distance", "distanceUnit", "elevation", "elevationUnit", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", NotificationConstants.KEY_DATA_MIME_TYPE, "notes", "", "restDuration", "cutoffDuration", "", "allowDelete", "showRestDuration", "showCutoffTime", "", "lat", "lon", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/courses/model/f;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZZDD)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f142574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f142576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f142577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f142578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f142579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f142580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f142581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f142582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f142583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f142584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f142585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f142586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final double f142587n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final double f142588o;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer num;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                num = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                num = null;
            }
            String string = parcel.readString();
            Integer num2 = num;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            f fVarValueOf = f.valueOf(parcel.readString());
            Integer numValueOf = num2;
            String string6 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? numValueOf : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            boolean z14 = false;
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            return new b(lValueOf, string, string2, string3, string4, string5, fVarValueOf, string6, numValueOf2, numValueOf, z15, z14, parcel.readInt() != 0, parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(Long l14, String str, String str2, String str3, String str4, String str5, f fVar, String str6, Integer num, Integer num2, boolean z14, boolean z15, boolean z16, double d14, double d15, int i14, j jVar) {
        this(l14, str, str2, str3, str4, str5, fVar, (i14 & 128) != 0 ? null : str6, (i14 & 256) != 0 ? null : num, (i14 & 512) != 0 ? null : num2, z14, z15, z16, d14, d15);
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
        return s.g(this.f142574a, bVar.f142574a) && s.g(this.f142575b, bVar.f142575b) && s.g(this.f142576c, bVar.f142576c) && s.g(this.f142577d, bVar.f142577d) && s.g(this.f142578e, bVar.f142578e) && s.g(this.f142579f, bVar.f142579f) && this.f142580g == bVar.f142580g && s.g(this.f142581h, bVar.f142581h) && s.g(this.f142582i, bVar.f142582i) && s.g(this.f142583j, bVar.f142583j) && this.f142584k == bVar.f142584k && this.f142585l == bVar.f142585l && this.f142586m == bVar.f142586m && Double.compare(this.f142587n, bVar.f142587n) == 0 && Double.compare(this.f142588o, bVar.f142588o) == 0;
    }

    public final int hashCode() {
        Long l14 = this.f142574a;
        int iHashCode = (this.f142580g.hashCode() + g.j(g.j(g.j(g.j(g.j((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.f142575b), 31, this.f142576c), 31, this.f142577d), 31, this.f142578e), 31, this.f142579f)) * 31;
        String str = this.f142581h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f142582i;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f142583j;
        return Double.hashCode(this.f142588o) + e.b(q6.f.g(q6.f.g(q6.f.g((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f142584k), 31, this.f142585l), 31, this.f142586m), 31, this.f142587n);
    }

    public final String toString() {
        StringBuilder sbJ = i.j("CoursePointDetailUiState(id=", ", name=", this.f142575b, this.f142574a, ", distance=");
        sn.a.t(sbJ, this.f142576c, ", distanceUnit=", this.f142577d, ", elevation=");
        sn.a.t(sbJ, this.f142578e, ", elevationUnit=", this.f142579f, ", type=");
        sbJ.append(this.f142580g);
        sbJ.append(", notes=");
        sbJ.append(this.f142581h);
        sbJ.append(", restDuration=");
        x.m(sbJ, this.f142582i, ", cutoffDuration=", this.f142583j, ", allowDelete=");
        kg.f.q(", showRestDuration=", ", showCutoffTime=", sbJ, this.f142584k, this.f142585l);
        sbJ.append(this.f142586m);
        sbJ.append(", lat=");
        sbJ.append(this.f142587n);
        return am.j.r(sbJ, ", lon=", this.f142588o, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f142574a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f142575b);
        parcel.writeString(this.f142576c);
        parcel.writeString(this.f142577d);
        parcel.writeString(this.f142578e);
        parcel.writeString(this.f142579f);
        parcel.writeString(this.f142580g.name());
        parcel.writeString(this.f142581h);
        Integer num = this.f142582i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.f142583j;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeInt(this.f142584k ? 1 : 0);
        parcel.writeInt(this.f142585l ? 1 : 0);
        parcel.writeInt(this.f142586m ? 1 : 0);
        parcel.writeDouble(this.f142587n);
        parcel.writeDouble(this.f142588o);
    }

    public b(Long l14, String str, String str2, String str3, String str4, String str5, f fVar, String str6, Integer num, Integer num2, boolean z14, boolean z15, boolean z16, double d14, double d15) {
        hb.a.p(str, str2, str3, str4, str5);
        fVar.getClass();
        this.f142574a = l14;
        this.f142575b = str;
        this.f142576c = str2;
        this.f142577d = str3;
        this.f142578e = str4;
        this.f142579f = str5;
        this.f142580g = fVar;
        this.f142581h = str6;
        this.f142582i = num;
        this.f142583j = num2;
        this.f142584k = z14;
        this.f142585l = z15;
        this.f142586m = z16;
        this.f142587n = d14;
        this.f142588o = d15;
    }
}
