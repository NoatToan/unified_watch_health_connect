package g81;

import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg81/o0;", "Landroid/os/Parcelable;", "Lc22/c3;", "zoneHeaderText", "rangeHeaderText", "rangeHeaderUnit", "xAxisMeasurementText", "xAxisMeasurementUnit", "Li53/c;", "Lg81/m0;", "tableRows", "<init>", "(Lc22/c3;Lc22/c3;Lc22/c3;Lc22/c3;Lc22/c3;Li53/c;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f76383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f76384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3 f76385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3 f76386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c3 f76387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<m0> f76388f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o0> {
        @Override // android.os.Parcelable.Creator
        public final o0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            c3 c3Var = (c3) parcel.readParcelable(o0.class.getClassLoader());
            c3 c3Var2 = (c3) parcel.readParcelable(o0.class.getClassLoader());
            c3 c3Var3 = (c3) parcel.readParcelable(o0.class.getClassLoader());
            c3 c3Var4 = (c3) parcel.readParcelable(o0.class.getClassLoader());
            c3 c3Var5 = (c3) parcel.readParcelable(o0.class.getClassLoader());
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(m0.CREATOR, parcel, arrayList, iA, 1);
            }
            return new o0(c3Var, c3Var2, c3Var3, c3Var4, c3Var5, i53.a.j(arrayList));
        }

        @Override // android.os.Parcelable.Creator
        public final o0[] newArray(int i14) {
            return new o0[i14];
        }
    }

    public o0(c3 c3Var, c3 c3Var2, c3 c3Var3, c3 c3Var4, c3 c3Var5, i53.c<m0> cVar) {
        c3Var.getClass();
        c3Var2.getClass();
        c3Var3.getClass();
        c3Var4.getClass();
        c3Var5.getClass();
        cVar.getClass();
        this.f76383a = c3Var;
        this.f76384b = c3Var2;
        this.f76385c = c3Var3;
        this.f76386d = c3Var4;
        this.f76387e = c3Var5;
        this.f76388f = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f76383a.equals(o0Var.f76383a) && this.f76384b.equals(o0Var.f76384b) && this.f76385c.equals(o0Var.f76385c) && this.f76386d.equals(o0Var.f76386d) && this.f76387e.equals(o0Var.f76387e) && this.f76388f.equals(o0Var.f76388f);
    }

    public final int hashCode() {
        return this.f76388f.hashCode() + ((this.f76387e.hashCode() + ((this.f76386d.hashCode() + ((this.f76385c.hashCode() + ((this.f76384b.hashCode() + (this.f76383a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StaminaZoneTableState(zoneHeaderText=" + this.f76383a + ", rangeHeaderText=" + this.f76384b + ", rangeHeaderUnit=" + this.f76385c + ", xAxisMeasurementText=" + this.f76386d + ", xAxisMeasurementUnit=" + this.f76387e + ", tableRows=" + this.f76388f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f76383a, i14);
        parcel.writeParcelable(this.f76384b, i14);
        parcel.writeParcelable(this.f76385c, i14);
        parcel.writeParcelable(this.f76386d, i14);
        parcel.writeParcelable(this.f76387e, i14);
        Iterator itG = j20.x.g(this.f76388f, parcel);
        while (itG.hasNext()) {
            ((m0) itG.next()).writeToParcel(parcel, i14);
        }
    }
}
