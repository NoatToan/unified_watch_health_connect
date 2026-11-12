package zq2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lzq2/g;", "Lms2/e;", "Lms2/f;", "Lis2/b;", "serviceProviderType", "", "Lqs2/e;", "categories", "", "displayName", "Lms2/a;", "cardIcon", "hint", "", "Lqs2/b;", "restrictions", "", "displayOrder", "Lqs2/a;", "businessOperator", "firstCardEstimatedSize", "nextCardEstimatedSize", "<init>", "(Lis2/b;[Lqs2/e;Ljava/lang/String;Lms2/a;Ljava/lang/String;Ljava/util/List;ILqs2/a;II)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements ms2.e, ms2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is2.b f206680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs2.e[] f206681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f206682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ms2.a f206683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f206684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<qs2.b> f206685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f206686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qs2.a f206687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f206688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f206689j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f206679k = new a(null);
    public static final Parcelable.Creator<g> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            is2.b bVarValueOf = is2.b.valueOf(parcel.readString());
            int i14 = parcel.readInt();
            qs2.e[] eVarArr = new qs2.e[i14];
            for (int i15 = 0; i15 != i14; i15++) {
                eVarArr[i15] = qs2.e.valueOf(parcel.readString());
            }
            String string = parcel.readString();
            ms2.a aVar = (ms2.a) parcel.readParcelable(g.class.getClassLoader());
            String string2 = parcel.readString();
            int i16 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList.add(qs2.b.valueOf(parcel.readString()));
            }
            return new g(bVarValueOf, eVarArr, string, aVar, string2, arrayList, parcel.readInt(), qs2.a.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(is2.b bVar, qs2.e[] eVarArr, String str, ms2.a aVar, String str2, List<? extends qs2.b> list, int i14, qs2.a aVar2, int i15, int i16) {
        bVar.getClass();
        eVarArr.getClass();
        str.getClass();
        aVar.getClass();
        list.getClass();
        aVar2.getClass();
        this.f206680a = bVar;
        this.f206681b = eVarArr;
        this.f206682c = str;
        this.f206683d = aVar;
        this.f206684e = str2;
        this.f206685f = list;
        this.f206686g = i14;
        this.f206687h = aVar2;
        this.f206688i = i15;
        this.f206689j = i16;
    }

    @Override // ms2.e
    /* JADX INFO: renamed from: B, reason: from getter */
    public final qs2.e[] getF205852c() {
        return this.f206681b;
    }

    @Override // ms2.e
    /* JADX INFO: renamed from: L3, reason: from getter */
    public final int getF205856g() {
        return this.f206686g;
    }

    @Override // ms2.f
    public final Integer R2() {
        return Integer.valueOf(this.f206688i);
    }

    @Override // ms2.e
    public final List<qs2.b> Z3() {
        return this.f206685f;
    }

    @Override // ms2.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final is2.b getF205851b() {
        return this.f206680a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ms2.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF205855f() {
        return this.f206684e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f206680a == gVar.f206680a && this.f206681b.equals(gVar.f206681b) && this.f206682c.equals(gVar.f206682c) && this.f206683d.equals(gVar.f206683d) && s.g(this.f206684e, gVar.f206684e) && this.f206685f.equals(gVar.f206685f) && this.f206686g == gVar.f206686g && this.f206687h == gVar.f206687h && this.f206688i == gVar.f206688i && this.f206689j == gVar.f206689j;
    }

    @Override // ms2.e
    /* JADX INFO: renamed from: getDisplayName, reason: from getter */
    public final String getF205853d() {
        return this.f206682c;
    }

    public final int hashCode() {
        int iHashCode = (this.f206683d.hashCode() + wr.g.j(((this.f206680a.hashCode() * 31) + Arrays.hashCode(this.f206681b)) * 31, 31, this.f206682c)) * 31;
        String str = this.f206684e;
        return Integer.hashCode(this.f206689j) + q2.d(this.f206688i, (this.f206687h.hashCode() + q2.d(this.f206686g, u0.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f206685f), 31)) * 31, 31);
    }

    @Override // ms2.f
    public final Integer i2() {
        return Integer.valueOf(this.f206689j);
    }

    @Override // ms2.f
    /* JADX INFO: renamed from: n, reason: from getter */
    public final qs2.a getF205881b() {
        return this.f206687h;
    }

    @Override // ms2.e
    /* JADX INFO: renamed from: p, reason: from getter */
    public final ms2.a getF205854e() {
        return this.f206683d;
    }

    public final String toString() {
        String string = Arrays.toString(this.f206681b);
        StringBuilder sb3 = new StringBuilder("HardCodeCatalogItem(serviceProviderType=");
        sb3.append(this.f206680a);
        sb3.append(", categories=");
        sb3.append(string);
        sb3.append(", displayName=");
        sb3.append(this.f206682c);
        sb3.append(", cardIcon=");
        sb3.append(this.f206683d);
        sb3.append(", hint=");
        e0.o(this.f206684e, ", restrictions=", ", displayOrder=", sb3, this.f206685f);
        sb3.append(this.f206686g);
        sb3.append(", businessOperator=");
        sb3.append(this.f206687h);
        sb3.append(", firstCardEstimatedSize=");
        return androidx.core.view.j.e(this.f206688i, this.f206689j, ", nextCardEstimatedSize=", ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f206680a.name());
        qs2.e[] eVarArr = this.f206681b;
        int length = eVarArr.length;
        parcel.writeInt(length);
        for (int i15 = 0; i15 != length; i15++) {
            parcel.writeString(eVarArr[i15].name());
        }
        parcel.writeString(this.f206682c);
        parcel.writeParcelable(this.f206683d, i14);
        parcel.writeString(this.f206684e);
        Iterator itE = kg.f.e(this.f206685f, parcel);
        while (itE.hasNext()) {
            parcel.writeString(((qs2.b) itE.next()).name());
        }
        parcel.writeInt(this.f206686g);
        parcel.writeString(this.f206687h.name());
        parcel.writeInt(this.f206688i);
        parcel.writeInt(this.f206689j);
    }

    @Override // ms2.e
    public final boolean x3() {
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzq2/g$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static g a(qs2.a aVar, String str, ArrayList arrayList) {
            int i14;
            aVar.getClass();
            arrayList.getClass();
            is2.b bVar = aVar.f147396a;
            qs2.e[] eVarArr = aVar.f147397b;
            or2.a.f133422a.getClass();
            ms2.a.C2286a c2286a = new ms2.a.C2286a(or2.a.a(aVar));
            int iA = aVar.a();
            int iB = or2.a.b(aVar);
            int i15 = 13000;
            switch (or2.a.C2536a.f133423a[aVar.ordinal()]) {
                case 1:
                    i15 = 7000;
                    i14 = i15;
                    return new g(bVar, eVarArr, str, c2286a, null, arrayList, iA, aVar, iB, i14);
                case 2:
                case 5:
                    i14 = i15;
                    return new g(bVar, eVarArr, str, c2286a, null, arrayList, iA, aVar, iB, i14);
                case 3:
                case 4:
                case 11:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    i14 = 0;
                    return new g(bVar, eVarArr, str, c2286a, null, arrayList, iA, aVar, iB, i14);
                case 6:
                    i15 = 4000;
                    i14 = i15;
                    return new g(bVar, eVarArr, str, c2286a, null, arrayList, iA, aVar, iB, i14);
                case 7:
                case 8:
                case 9:
                    vb.h.z("Preload cards already reside in device");
                    return null;
                case 10:
                    i15 = 23000;
                    i14 = i15;
                    return new g(bVar, eVarArr, str, c2286a, null, arrayList, iA, aVar, iB, i14);
                case 12:
                    o2.c.m("Not yet implemented");
                    return null;
                default:
                    u0.r();
                    return null;
            }
        }

        private a() {
        }
    }
}
