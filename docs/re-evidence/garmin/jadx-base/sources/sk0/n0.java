package sk0;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.roomorama.caldroid.CaldroidFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsk0/n0;", "Landroid/os/Parcelable;", "Lc80/u;", "gearType", "", "brand", ModelSourceWrapper.TYPE, "nickname", "Lb63/o;", "firstUseDate", "Lc80/w;", "usageType", "", "maxDistanceMeters", "", "maxDurationSeconds", CaldroidFragment.MAX_DATE, "Li53/c;", "Lam/x0;", "defaultActivities", "", "addToExistingActivities", "notes", "Ly22/x;", "photos", "<init>", "(Lc80/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb63/o;Lc80/w;Ljava/lang/Double;Ljava/lang/Long;Lb63/o;Li53/c;ZLjava/lang/String;Li53/c;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n0 implements Parcelable {
    public static final Parcelable.Creator<n0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c80.u f159762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f159765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b63.o f159766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c80.w f159767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f159768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f159769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b63.o f159770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i53.c<am.x0> f159771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f159772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f159773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i53.c<y22.x> f159774m;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n0> {
        @Override // android.os.Parcelable.Creator
        public final n0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            c80.u uVarValueOf = c80.u.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            b63.o oVarA = vk0.g.f178573a.a(parcel);
            c80.w wVarValueOf = c80.w.valueOf(parcel.readString());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Long lValueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            b63.o oVarA2 = vk0.i.f178575a.a(parcel);
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iD = 0;
            while (iD != i14) {
                iD = lc.u0.d(n0.class, parcel, arrayList, iD, 1);
            }
            i53.f fVarJ = i53.a.j(arrayList);
            boolean z14 = parcel.readInt() != 0;
            String string4 = parcel.readString();
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int iD2 = 0;
            while (true) {
                String str = string4;
                if (iD2 == i15) {
                    return new n0(uVarValueOf, string, string2, string3, oVarA, wVarValueOf, dValueOf, lValueOf, oVarA2, fVarJ, z14, str, i53.a.j(arrayList2));
                }
                iD2 = lc.u0.d(n0.class, parcel, arrayList2, iD2, 1);
                string4 = str;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final n0[] newArray(int i14) {
            return new n0[i14];
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159775a;

        static {
            int[] iArr = new int[c80.w.values().length];
            try {
                iArr[c80.w.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c80.w.Distance.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c80.w.Duration.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c80.w.Date.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f159775a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0(c80.u uVar, String str, String str2, String str3, b63.o oVar, c80.w wVar, Double d14, Long l14, b63.o oVar2, i53.c<? extends am.x0> cVar, boolean z14, String str4, i53.c<y22.x> cVar2) {
        uVar.getClass();
        oVar.getClass();
        wVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        this.f159762a = uVar;
        this.f159763b = str;
        this.f159764c = str2;
        this.f159765d = str3;
        this.f159766e = oVar;
        this.f159767f = wVar;
        this.f159768g = d14;
        this.f159769h = l14;
        this.f159770i = oVar2;
        this.f159771j = cVar;
        this.f159772k = z14;
        this.f159773l = str4;
        this.f159774m = cVar2;
    }

    public static n0 b(n0 n0Var, c80.u uVar, String str, String str2, String str3, b63.o oVar, c80.w wVar, Double d14, Long l14, b63.o oVar2, i53.c cVar, boolean z14, String str4, i53.c cVar2, int i14) {
        if ((i14 & 1) != 0) {
            uVar = n0Var.f159762a;
        }
        c80.u uVar2 = uVar;
        String str5 = (i14 & 2) != 0 ? n0Var.f159763b : str;
        String str6 = (i14 & 4) != 0 ? n0Var.f159764c : str2;
        String str7 = (i14 & 8) != 0 ? n0Var.f159765d : str3;
        b63.o oVar3 = (i14 & 16) != 0 ? n0Var.f159766e : oVar;
        c80.w wVar2 = (i14 & 32) != 0 ? n0Var.f159767f : wVar;
        Double d15 = (i14 & 64) != 0 ? n0Var.f159768g : d14;
        Long l15 = (i14 & 128) != 0 ? n0Var.f159769h : l14;
        b63.o oVar4 = (i14 & 256) != 0 ? n0Var.f159770i : oVar2;
        i53.c cVar3 = (i14 & 512) != 0 ? n0Var.f159771j : cVar;
        boolean z15 = (i14 & 1024) != 0 ? n0Var.f159772k : z14;
        String str8 = (i14 & 2048) != 0 ? n0Var.f159773l : str4;
        i53.c cVar4 = (i14 & 4096) != 0 ? n0Var.f159774m : cVar2;
        n0Var.getClass();
        oVar3.getClass();
        wVar2.getClass();
        cVar3.getClass();
        cVar4.getClass();
        return new n0(uVar2, str5, str6, str7, oVar3, wVar2, d15, l15, oVar4, cVar3, z15, str8, cVar4);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    public final jk0.x d() {
        String string;
        String string2;
        String string3;
        c80.w wVar = this.f159767f;
        String string4 = null;
        Double d14 = this.f159768g;
        Double d15 = (d14 == null || wVar != c80.w.Distance) ? null : d14;
        b63.o oVar = this.f159770i;
        b63.o oVar2 = (oVar == null || wVar != c80.w.Date) ? null : oVar;
        Long l14 = this.f159769h;
        Long l15 = (l14 == null || wVar != c80.w.Duration) ? null : l14;
        i53.c<am.x0> cVar = this.f159771j;
        ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
        Iterator<am.x0> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(new jk0.g(it.next().f4358a, Boolean.TRUE, (Boolean) null, 4, (p005kotlin.jvm.internal.j) null));
        }
        String str = this.f159765d;
        if (str == null) {
            string = null;
        } else {
            if (d53.w.J(str)) {
                str = null;
            }
            if (str != null) {
                string = d53.w.i0(str).toString();
            } else {
                string = null;
            }
        }
        String str2 = this.f159763b;
        if (str2 == null) {
            string2 = null;
        } else {
            if (d53.w.J(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                string2 = d53.w.i0(str2).toString();
            } else {
                string2 = null;
            }
        }
        String str3 = this.f159764c;
        if (str3 == null) {
            string3 = null;
        } else {
            if (d53.w.J(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                string3 = d53.w.i0(str3).toString();
            } else {
                string3 = null;
            }
        }
        String str4 = this.f159773l;
        if (str4 != null) {
            if (d53.w.J(str4)) {
                str4 = null;
            }
            if (str4 != null) {
                string4 = d53.w.i0(str4).toString();
            }
        }
        return new jk0.x(this.f159762a, this.f159766e, wVar, arrayList, (jk0.p) null, (String) null, (Long) null, string, string2, string3, string4, (b63.o) null, oVar2, d15, l15, (Integer) null, (Long) null, (Double) null, (Long) null, (List) null, (List) null, (Boolean) null, (List) null, 4194304, (p005kotlin.jvm.internal.j) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f159762a == n0Var.f159762a && p005kotlin.jvm.internal.s.g(this.f159763b, n0Var.f159763b) && p005kotlin.jvm.internal.s.g(this.f159764c, n0Var.f159764c) && p005kotlin.jvm.internal.s.g(this.f159765d, n0Var.f159765d) && this.f159766e.equals(n0Var.f159766e) && this.f159767f == n0Var.f159767f && p005kotlin.jvm.internal.s.g(this.f159768g, n0Var.f159768g) && p005kotlin.jvm.internal.s.g(this.f159769h, n0Var.f159769h) && p005kotlin.jvm.internal.s.g(this.f159770i, n0Var.f159770i) && this.f159771j.equals(n0Var.f159771j) && this.f159772k == n0Var.f159772k && p005kotlin.jvm.internal.s.g(this.f159773l, n0Var.f159773l) && this.f159774m.equals(n0Var.f159774m);
    }

    public final int hashCode() {
        int iHashCode = this.f159762a.hashCode() * 31;
        String str = this.f159763b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f159764c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f159765d;
        int iHashCode4 = (this.f159767f.hashCode() + n23.j.a(this.f159766e.f16206a, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31)) * 31;
        Double d14 = this.f159768g;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l14 = this.f159769h;
        int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        b63.o oVar = this.f159770i;
        int iG = q6.f.g(l2.a(this.f159771j, (iHashCode6 + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31, 31), 31, this.f159772k);
        String str4 = this.f159773l;
        return this.f159774m.hashCode() + ((iG + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CreateGearData(gearType=");
        sb3.append(this.f159762a);
        sb3.append(", brand=");
        sb3.append(this.f159763b);
        sb3.append(", model=");
        sn.a.t(sb3, this.f159764c, ", nickname=", this.f159765d, ", firstUseDate=");
        sb3.append(this.f159766e);
        sb3.append(", usageType=");
        sb3.append(this.f159767f);
        sb3.append(", maxDistanceMeters=");
        sb3.append(this.f159768g);
        sb3.append(", maxDurationSeconds=");
        sb3.append(this.f159769h);
        sb3.append(", maxDate=");
        sb3.append(this.f159770i);
        sb3.append(", defaultActivities=");
        sb3.append(this.f159771j);
        sb3.append(", addToExistingActivities=");
        fb1.c.w(", notes=", this.f159773l, ", photos=", sb3, this.f159772k);
        return l2.e(sb3, this.f159774m, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f159762a.name());
        parcel.writeString(this.f159763b);
        parcel.writeString(this.f159764c);
        parcel.writeString(this.f159765d);
        vk0.g.f178573a.b(this.f159766e, parcel);
        parcel.writeString(this.f159767f.name());
        Double d14 = this.f159768g;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Long l14 = this.f159769h;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        vk0.i.f178575a.b(this.f159770i, parcel);
        Iterator itG = j20.x.g(this.f159771j, parcel);
        while (itG.hasNext()) {
            parcel.writeParcelable((Parcelable) itG.next(), i14);
        }
        parcel.writeInt(this.f159772k ? 1 : 0);
        parcel.writeString(this.f159773l);
        Iterator itG2 = j20.x.g(this.f159774m, parcel);
        while (itG2.hasNext()) {
            parcel.writeParcelable((Parcelable) itG2.next(), i14);
        }
    }
}
