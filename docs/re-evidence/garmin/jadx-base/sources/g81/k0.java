package g81;

import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lg81/k0;", "Landroid/os/Parcelable;", "Lc22/c3;", "tabTitle", "", "tabSubtitle", "tabDisclaimerText", "zoneHeaderText", "rangeHeaderText", "rangeHeaderUnit", "xAxisMeasurementText", "xAxisMeasurementUnit", "Lg81/b;", "chartState", "Li53/c;", "Lg81/i0;", "cellStates", "<init>", "(Lc22/c3;Ljava/lang/String;Lc22/c3;Lc22/c3;Lc22/c3;Lc22/c3;Lc22/c3;Lc22/c3;Lg81/b;Li53/c;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k0 implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f76351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3 f76353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3 f76354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c3 f76355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c3 f76356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c3 f76357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c3 f76358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f76359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i53.c<i0> f76360j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k0> {
        @Override // android.os.Parcelable.Creator
        public final k0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            c3 c3Var = (c3) parcel.readParcelable(k0.class.getClassLoader());
            String string = parcel.readString();
            c3 c3Var2 = (c3) parcel.readParcelable(k0.class.getClassLoader());
            c3 c3Var3 = (c3) parcel.readParcelable(k0.class.getClassLoader());
            c3 c3Var4 = (c3) parcel.readParcelable(k0.class.getClassLoader());
            c3 c3Var5 = (c3) parcel.readParcelable(k0.class.getClassLoader());
            c3 c3Var6 = (c3) parcel.readParcelable(k0.class.getClassLoader());
            c3 c3Var7 = (c3) parcel.readParcelable(k0.class.getClassLoader());
            b bVarCreateFromParcel = parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel);
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(i0.CREATOR, parcel, arrayList, iA, 1);
            }
            return new k0(c3Var, string, c3Var2, c3Var3, c3Var4, c3Var5, c3Var6, c3Var7, bVarCreateFromParcel, i53.a.j(arrayList));
        }

        @Override // android.os.Parcelable.Creator
        public final k0[] newArray(int i14) {
            return new k0[i14];
        }
    }

    public k0(c3 c3Var, String str, c3 c3Var2, c3 c3Var3, c3 c3Var4, c3 c3Var5, c3 c3Var6, c3 c3Var7, b bVar, i53.c<i0> cVar) {
        c3Var.getClass();
        c3Var3.getClass();
        c3Var4.getClass();
        c3Var5.getClass();
        c3Var6.getClass();
        c3Var7.getClass();
        cVar.getClass();
        this.f76351a = c3Var;
        this.f76352b = str;
        this.f76353c = c3Var2;
        this.f76354d = c3Var3;
        this.f76355e = c3Var4;
        this.f76356f = c3Var5;
        this.f76357g = c3Var6;
        this.f76358h = c3Var7;
        this.f76359i = bVar;
        this.f76360j = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return p005kotlin.jvm.internal.s.g(this.f76351a, k0Var.f76351a) && p005kotlin.jvm.internal.s.g(this.f76352b, k0Var.f76352b) && p005kotlin.jvm.internal.s.g(this.f76353c, k0Var.f76353c) && p005kotlin.jvm.internal.s.g(this.f76354d, k0Var.f76354d) && p005kotlin.jvm.internal.s.g(this.f76355e, k0Var.f76355e) && p005kotlin.jvm.internal.s.g(this.f76356f, k0Var.f76356f) && p005kotlin.jvm.internal.s.g(this.f76357g, k0Var.f76357g) && p005kotlin.jvm.internal.s.g(this.f76358h, k0Var.f76358h) && p005kotlin.jvm.internal.s.g(this.f76359i, k0Var.f76359i) && p005kotlin.jvm.internal.s.g(this.f76360j, k0Var.f76360j);
    }

    public final int hashCode() {
        int iHashCode = this.f76351a.hashCode() * 31;
        String str = this.f76352b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        c3 c3Var = this.f76353c;
        int iHashCode3 = (this.f76358h.hashCode() + ((this.f76357g.hashCode() + ((this.f76356f.hashCode() + ((this.f76355e.hashCode() + ((this.f76354d.hashCode() + ((iHashCode2 + (c3Var == null ? 0 : c3Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        b bVar = this.f76359i;
        return this.f76360j.hashCode() + ((iHashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "StaminaComparisonTableUiState(tabTitle=" + this.f76351a + ", tabSubtitle=" + this.f76352b + ", tabDisclaimerText=" + this.f76353c + ", zoneHeaderText=" + this.f76354d + ", rangeHeaderText=" + this.f76355e + ", rangeHeaderUnit=" + this.f76356f + ", xAxisMeasurementText=" + this.f76357g + ", xAxisMeasurementUnit=" + this.f76358h + ", chartState=" + this.f76359i + ", cellStates=" + this.f76360j + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f76351a, i14);
        parcel.writeString(this.f76352b);
        parcel.writeParcelable(this.f76353c, i14);
        parcel.writeParcelable(this.f76354d, i14);
        parcel.writeParcelable(this.f76355e, i14);
        parcel.writeParcelable(this.f76356f, i14);
        parcel.writeParcelable(this.f76357g, i14);
        parcel.writeParcelable(this.f76358h, i14);
        b bVar = this.f76359i;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        Iterator itG = j20.x.g(this.f76360j, parcel);
        while (itG.hasNext()) {
            ((i0) itG.next()).writeToParcel(parcel, i14);
        }
    }

    public /* synthetic */ k0(c3 c3Var, String str, c3 c3Var2, c3 c3Var3, c3 c3Var4, c3 c3Var5, c3 c3Var6, c3 c3Var7, b bVar, i53.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(c3Var, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : c3Var2, c3Var3, c3Var4, c3Var5, c3Var6, c3Var7, (i14 & 256) != 0 ? null : bVar, cVar);
    }
}
