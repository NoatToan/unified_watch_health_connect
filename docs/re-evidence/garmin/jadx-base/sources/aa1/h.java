package aa1;

import android.os.Parcel;
import android.os.Parcelable;
import j20.x;
import j53.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Laa1/h;", "Landroid/os/Parcelable;", "", "isLoading", "isError", "onSaveFailedError", "shouldShowUpdateOneRepMaxDialog", "", "oneRepMaxDialogPRValue", "Li53/c;", "Lq91/g;", "personalRecordsSports", "Li53/d;", "Laa1/i;", "personalRecordsTypesPages", "Laa1/f;", "personalRecordsTypesEditPages", "personalRecordsTypesEditInitialSportType", "hasPendingEditChanges", "<init>", "(ZZZZDLi53/c;Li53/d;Li53/d;Lq91/g;Z)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f2293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<q91.g> f2294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.d<q91.g, i> f2295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.d<q91.g, i53.c<f>> f2296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q91.g f2297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2298j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z14 = true;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            double d14 = parcel.readDouble();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iD = 0;
            while (iD != i14) {
                iD = u0.d(h.class, parcel, arrayList, iD, 1);
            }
            i53.f fVarJ = i53.a.j(arrayList);
            int i15 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                linkedHashMap.put(parcel.readParcelable(h.class.getClassLoader()), i.CREATOR.createFromParcel(parcel));
            }
            i53.g gVarK = i53.a.k(linkedHashMap);
            int i17 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i17);
            int i18 = 0;
            while (i18 != i17) {
                Parcelable parcelable = parcel.readParcelable(h.class.getClassLoader());
                int i19 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i19);
                i53.g gVar = gVarK;
                int iA = 0;
                while (iA != i19) {
                    iA = kg.f.a(f.CREATOR, parcel, arrayList2, iA, 1);
                    i19 = i19;
                    i17 = i17;
                }
                linkedHashMap2.put(parcelable, i53.a.j(arrayList2));
                i18++;
                z14 = true;
                gVarK = gVar;
                i17 = i17;
            }
            return new h(z15, z16, z17, z18, d14, fVarJ, gVarK, i53.a.k(linkedHashMap2), (q91.g) parcel.readParcelable(h.class.getClassLoader()), parcel.readInt() != 0 ? z14 : false);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(boolean z14, boolean z15, boolean z16, boolean z17, double d14, i53.c cVar, i53.d dVar, i53.d dVar2, q91.g gVar, boolean z18, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? 0.0d : d14, (i14 & 32) != 0 ? l.b() : cVar, (i14 & 64) != 0 ? i53.a.c() : dVar, (i14 & 128) != 0 ? i53.a.c() : dVar2, (i14 & 256) != 0 ? null : gVar, (i14 & 512) != 0 ? false : z18);
    }

    public static h b(h hVar, boolean z14, boolean z15, boolean z16, boolean z17, double d14, i53.c cVar, i53.d dVar, i53.d dVar2, q91.g gVar, boolean z18, int i14) {
        if ((i14 & 1) != 0) {
            z14 = hVar.f2289a;
        }
        boolean z19 = z14;
        if ((i14 & 2) != 0) {
            z15 = hVar.f2290b;
        }
        boolean z24 = z15;
        if ((i14 & 4) != 0) {
            z16 = hVar.f2291c;
        }
        boolean z25 = z16;
        boolean z26 = (i14 & 8) != 0 ? hVar.f2292d : z17;
        double d15 = (i14 & 16) != 0 ? hVar.f2293e : d14;
        i53.c cVar2 = (i14 & 32) != 0 ? hVar.f2294f : cVar;
        i53.d dVar3 = (i14 & 64) != 0 ? hVar.f2295g : dVar;
        i53.d dVar4 = (i14 & 128) != 0 ? hVar.f2296h : dVar2;
        q91.g gVar2 = (i14 & 256) != 0 ? hVar.f2297i : gVar;
        boolean z27 = (i14 & 512) != 0 ? hVar.f2298j : z18;
        hVar.getClass();
        cVar2.getClass();
        dVar3.getClass();
        dVar4.getClass();
        return new h(z19, z24, z25, z26, d15, cVar2, dVar3, dVar4, gVar2, z27);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2289a == hVar.f2289a && this.f2290b == hVar.f2290b && this.f2291c == hVar.f2291c && this.f2292d == hVar.f2292d && Double.compare(this.f2293e, hVar.f2293e) == 0 && s.g(this.f2294f, hVar.f2294f) && s.g(this.f2295g, hVar.f2295g) && s.g(this.f2296h, hVar.f2296h) && this.f2297i == hVar.f2297i && this.f2298j == hVar.f2298j;
    }

    public final int hashCode() {
        int iB = l2.b(this.f2296h, l2.b(this.f2295g, l2.a(this.f2294f, org.apache.commons.lang3.e.b(q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f2289a) * 31, 31, this.f2290b), 31, this.f2291c), 31, this.f2292d), 31, this.f2293e), 31), 31), 31);
        q91.g gVar = this.f2297i;
        return Boolean.hashCode(this.f2298j) + ((iB + (gVar == null ? 0 : gVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("PersonalRecordsScreenState(isLoading=", ", isError=", ", onSaveFailedError=", this.f2289a, this.f2290b);
        kg.f.q(", shouldShowUpdateOneRepMaxDialog=", ", oneRepMaxDialogPRValue=", sbM, this.f2291c, this.f2292d);
        sbM.append(this.f2293e);
        sbM.append(", personalRecordsSports=");
        sbM.append(this.f2294f);
        sbM.append(", personalRecordsTypesPages=");
        sbM.append(this.f2295g);
        sbM.append(", personalRecordsTypesEditPages=");
        sbM.append(this.f2296h);
        sbM.append(", personalRecordsTypesEditInitialSportType=");
        sbM.append(this.f2297i);
        sbM.append(", hasPendingEditChanges=");
        sbM.append(this.f2298j);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f2289a ? 1 : 0);
        parcel.writeInt(this.f2290b ? 1 : 0);
        parcel.writeInt(this.f2291c ? 1 : 0);
        parcel.writeInt(this.f2292d ? 1 : 0);
        parcel.writeDouble(this.f2293e);
        Iterator itG = x.g(this.f2294f, parcel);
        while (itG.hasNext()) {
            parcel.writeParcelable((Parcelable) itG.next(), i14);
        }
        i53.d<q91.g, i> dVar = this.f2295g;
        parcel.writeInt(dVar.size());
        for (Map.Entry entry : (i53.e) dVar.entrySet()) {
            parcel.writeParcelable((Parcelable) entry.getKey(), i14);
            ((i) entry.getValue()).writeToParcel(parcel, i14);
        }
        i53.d<q91.g, i53.c<f>> dVar2 = this.f2296h;
        parcel.writeInt(dVar2.size());
        for (Map.Entry entry2 : (i53.e) dVar2.entrySet()) {
            parcel.writeParcelable((Parcelable) entry2.getKey(), i14);
            Iterator itG2 = x.g((i53.c) entry2.getValue(), parcel);
            while (itG2.hasNext()) {
                ((f) itG2.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeParcelable(this.f2297i, i14);
        parcel.writeInt(this.f2298j ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(boolean z14, boolean z15, boolean z16, boolean z17, double d14, i53.c<? extends q91.g> cVar, i53.d<q91.g, i> dVar, i53.d<q91.g, ? extends i53.c<f>> dVar2, q91.g gVar, boolean z18) {
        cVar.getClass();
        dVar.getClass();
        dVar2.getClass();
        this.f2289a = z14;
        this.f2290b = z15;
        this.f2291c = z16;
        this.f2292d = z17;
        this.f2293e = d14;
        this.f2294f = cVar;
        this.f2295g = dVar;
        this.f2296h = dVar2;
        this.f2297i = gVar;
        this.f2298j = z18;
    }

    public h() {
        this(false, false, false, false, 0.0d, null, null, null, null, false, 1023, null);
    }
}
