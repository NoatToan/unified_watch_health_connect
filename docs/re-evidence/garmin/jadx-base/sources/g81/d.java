package g81;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lg81/d;", "Landroid/os/Parcelable;", "", "x", "", "xAxisValue", "markerValue", "markerUnit", "markerLabel", "", "markerDotColor", "rangeValue", "rangeUnit", "rangeLabel", "<init>", "(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f76291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f76295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f76296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f76297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f76298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f76299i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(float f14, String str, String str2, String str3, String str4, int i14, String str5, String str6, String str7) {
        hb.a.p(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.f76291a = f14;
        this.f76292b = str;
        this.f76293c = str2;
        this.f76294d = str3;
        this.f76295e = str4;
        this.f76296f = i14;
        this.f76297g = str5;
        this.f76298h = str6;
        this.f76299i = str7;
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
        return Float.compare(this.f76291a, dVar.f76291a) == 0 && this.f76292b.equals(dVar.f76292b) && this.f76293c.equals(dVar.f76293c) && this.f76294d.equals(dVar.f76294d) && this.f76295e.equals(dVar.f76295e) && this.f76296f == dVar.f76296f && this.f76297g.equals(dVar.f76297g) && this.f76298h.equals(dVar.f76298h) && this.f76299i.equals(dVar.f76299i);
    }

    public final int hashCode() {
        return this.f76299i.hashCode() + wr.g.j(wr.g.j(q2.d(this.f76296f, wr.g.j(wr.g.j(wr.g.j(wr.g.j(Float.hashCode(this.f76291a) * 31, 31, this.f76292b), 31, this.f76293c), 31, this.f76294d), 31, this.f76295e), 31), 31, this.f76297g), 31, this.f76298h);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DailyStaminaChartMarkerState(x=");
        sb3.append(this.f76291a);
        sb3.append(", xAxisValue=");
        sb3.append(this.f76292b);
        sb3.append(", markerValue=");
        sn.a.t(sb3, this.f76293c, ", markerUnit=", this.f76294d, ", markerLabel=");
        q6.f.q(this.f76296f, this.f76295e, ", markerDotColor=", ", rangeValue=", sb3);
        sn.a.t(sb3, this.f76297g, ", rangeUnit=", this.f76298h, ", rangeLabel=");
        return am.j.o(this.f76299i, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeFloat(this.f76291a);
        parcel.writeString(this.f76292b);
        parcel.writeString(this.f76293c);
        parcel.writeString(this.f76294d);
        parcel.writeString(this.f76295e);
        parcel.writeInt(this.f76296f);
        parcel.writeString(this.f76297g);
        parcel.writeString(this.f76298h);
        parcel.writeString(this.f76299i);
    }
}
