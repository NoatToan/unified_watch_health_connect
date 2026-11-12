package iy0;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Liy0/f;", "Landroid/os/Parcelable;", "Li53/c;", "Liy0/i;", "activityTimeEntries", "Lam/x0;", "activityTypeOrder", "Liy0/h;", "colorMapping", "Lb63/o;", "startDate", "endDate", "<init>", "(Li53/c;Li53/c;Li53/c;Lb63/o;Lb63/o;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<i> f95790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<x0> f95791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<h> f95792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.o f95793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b63.o f95794e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i14) {
                iA2 = kg.f.a(i.CREATOR, parcel, arrayList, iA2, 1);
            }
            i53.f fVarJ = i53.a.j(arrayList);
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int iD = 0;
            while (iD != i15) {
                iD = u0.d(f.class, parcel, arrayList2, iD, 1);
            }
            i53.f fVarJ2 = i53.a.j(arrayList2);
            int i16 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i16);
            while (iA != i16) {
                iA = kg.f.a(h.CREATOR, parcel, arrayList3, iA, 1);
            }
            return new f(fVarJ, fVarJ2, i53.a.j(arrayList3), (b63.o) parcel.readSerializable(), (b63.o) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(i53.c<i> cVar, i53.c<? extends x0> cVar2, i53.c<h> cVar3, b63.o oVar, b63.o oVar2) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f95790a = cVar;
        this.f95791b = cVar2;
        this.f95792c = cVar3;
        this.f95793d = oVar;
        this.f95794e = oVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f95790a.equals(fVar.f95790a) && this.f95791b.equals(fVar.f95791b) && this.f95792c.equals(fVar.f95792c) && s.g(this.f95793d, fVar.f95793d) && s.g(this.f95794e, fVar.f95794e);
    }

    public final int hashCode() {
        int iA = l2.a(this.f95792c, l2.a(this.f95791b, this.f95790a.hashCode() * 31, 31), 31);
        b63.o oVar = this.f95793d;
        int iHashCode = (iA + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31;
        b63.o oVar2 = this.f95794e;
        return iHashCode + (oVar2 != null ? oVar2.f16206a.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityTimeChartUiModel(activityTimeEntries=" + this.f95790a + ", activityTypeOrder=" + this.f95791b + ", colorMapping=" + this.f95792c + ", startDate=" + this.f95793d + ", endDate=" + this.f95794e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itG = x.g(this.f95790a, parcel);
        while (itG.hasNext()) {
            ((i) itG.next()).writeToParcel(parcel, i14);
        }
        Iterator itG2 = x.g(this.f95791b, parcel);
        while (itG2.hasNext()) {
            parcel.writeParcelable((Parcelable) itG2.next(), i14);
        }
        Iterator itG3 = x.g(this.f95792c, parcel);
        while (itG3.hasNext()) {
            ((h) itG3.next()).writeToParcel(parcel, i14);
        }
        parcel.writeSerializable(this.f95793d);
        parcel.writeSerializable(this.f95794e);
    }
}
