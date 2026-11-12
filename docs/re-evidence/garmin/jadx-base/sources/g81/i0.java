package g81;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg81/i0;", "Landroid/os/Parcelable;", "", "zoneName", "", "zoneColorResId", "staminaValue", "timeOrDistanceValue", "Li53/c;", "Lg81/j0;", "comparisonRows", "comparisonSign", "comparisonSignTintResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Li53/c;II)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<j0> f76341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f76342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f76343g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i0> {
        @Override // android.os.Parcelable.Creator
        public final i0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            int iA = 0;
            while (iA != i15) {
                iA = kg.f.a(j0.CREATOR, parcel, arrayList, iA, 1);
            }
            return new i0(string, i14, string2, string3, i53.a.j(arrayList), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final i0[] newArray(int i14) {
            return new i0[i14];
        }
    }

    public i0(String str, int i14, String str2, String str3, i53.c<j0> cVar, int i15, int i16) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        cVar.getClass();
        this.f76337a = str;
        this.f76338b = i14;
        this.f76339c = str2;
        this.f76340d = str3;
        this.f76341e = cVar;
        this.f76342f = i15;
        this.f76343g = i16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f76337a.equals(i0Var.f76337a) && this.f76338b == i0Var.f76338b && this.f76339c.equals(i0Var.f76339c) && this.f76340d.equals(i0Var.f76340d) && this.f76341e.equals(i0Var.f76341e) && this.f76342f == i0Var.f76342f && this.f76343g == i0Var.f76343g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76343g) + q2.d(this.f76342f, l2.a(this.f76341e, wr.g.j(wr.g.j(q2.d(this.f76338b, this.f76337a.hashCode() * 31, 31), 31, this.f76339c), 31, this.f76340d), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = androidx.core.view.j.k(this.f76338b, "StaminaComparisonCellState(zoneName=", this.f76337a, ", zoneColorResId=", ", staminaValue=");
        sn.a.t(sbK, this.f76339c, ", timeOrDistanceValue=", this.f76340d, ", comparisonRows=");
        sbK.append(this.f76341e);
        sbK.append(", comparisonSign=");
        sbK.append(this.f76342f);
        sbK.append(", comparisonSignTintResId=");
        return am.j.q(sbK, this.f76343g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f76337a);
        parcel.writeInt(this.f76338b);
        parcel.writeString(this.f76339c);
        parcel.writeString(this.f76340d);
        Iterator itG = j20.x.g(this.f76341e, parcel);
        while (itG.hasNext()) {
            ((j0) itG.next()).writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.f76342f);
        parcel.writeInt(this.f76343g);
    }
}
