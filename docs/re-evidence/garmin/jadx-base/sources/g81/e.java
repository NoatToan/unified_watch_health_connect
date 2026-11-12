package g81;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f0\n\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\n\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\n¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lg81/e;", "Landroid/os/Parcelable;", "", "chartXAxisTitle", "rangeTitle", "", "chartMaxY", "chartMinY", "chartMaxX", "chartMinX", "Li53/c;", "Lg81/g0;", "zoneKeyLine", "Lg81/f0;", "zoneKeyPoints", "Lo13/p;", "", "zoneKeyPointGradient", "Lg81/h0;", "zoneRange", "segmentDelimiters", "xAxisLabels", "Lg81/d;", "markerStates", "<init>", "(Ljava/lang/String;Ljava/lang/String;FFFFLi53/c;Li53/c;Li53/c;Li53/c;Li53/c;Li53/c;Li53/c;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f76305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f76306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f76307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f76308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<g0> f76309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<f0> f76310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i53.c<o13.p<Float, Integer>> f76311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i53.c<h0> f76312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i53.c<i53.c<g0>> f76313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i53.c<String> f76314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i53.c<d> f76315m;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            String str;
            String str2;
            float f14;
            i53.f fVarJ;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            float f15 = parcel.readFloat();
            float f16 = parcel.readFloat();
            float f17 = parcel.readFloat();
            float f18 = parcel.readFloat();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(g0.CREATOR, parcel, arrayList, iA, 1);
            }
            i53.f fVarJ2 = i53.a.j(arrayList);
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int iA2 = 0;
            while (iA2 != i15) {
                iA2 = kg.f.a(f0.CREATOR, parcel, arrayList2, iA2, 1);
            }
            i53.f fVarJ3 = i53.a.j(arrayList2);
            int i16 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList3.add(parcel.readSerializable());
            }
            i53.f fVarJ4 = i53.a.j(arrayList3);
            int i18 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i18);
            int iA3 = 0;
            while (iA3 != i18) {
                iA3 = kg.f.a(h0.CREATOR, parcel, arrayList4, iA3, 1);
            }
            i53.f fVarJ5 = i53.a.j(arrayList4);
            if (parcel.readInt() == 0) {
                fVarJ = null;
                str = string;
                str2 = string2;
                f14 = f15;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i19);
                int i24 = 0;
                while (i24 != i19) {
                    int i25 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(i25);
                    String str3 = string;
                    int iA4 = 0;
                    while (true) {
                        String str4 = string2;
                        if (iA4 != i25) {
                            iA4 = kg.f.a(g0.CREATOR, parcel, arrayList6, iA4, 1);
                            string2 = str4;
                            f15 = f15;
                        }
                    }
                    arrayList5.add(i53.a.j(arrayList6));
                    i24++;
                    string = str3;
                }
                str = string;
                str2 = string2;
                f14 = f15;
                fVarJ = i53.a.j(arrayList5);
            }
            i53.f fVar = fVarJ;
            i53.f fVarJ6 = i53.a.j(parcel.createStringArrayList());
            int i26 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i26);
            int iA5 = 0;
            while (iA5 != i26) {
                iA5 = kg.f.a(d.CREATOR, parcel, arrayList7, iA5, 1);
            }
            return new e(str, str2, f14, f16, f17, f18, fVarJ2, fVarJ3, fVarJ4, fVarJ5, fVar, fVarJ6, i53.a.j(arrayList7));
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, String str2, float f14, float f15, float f16, float f17, i53.c<g0> cVar, i53.c<f0> cVar2, i53.c<o13.p<Float, Integer>> cVar3, i53.c<h0> cVar4, i53.c<? extends i53.c<g0>> cVar5, i53.c<String> cVar6, i53.c<d> cVar7) {
        str.getClass();
        str2.getClass();
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        cVar4.getClass();
        cVar6.getClass();
        cVar7.getClass();
        this.f76303a = str;
        this.f76304b = str2;
        this.f76305c = f14;
        this.f76306d = f15;
        this.f76307e = f16;
        this.f76308f = f17;
        this.f76309g = cVar;
        this.f76310h = cVar2;
        this.f76311i = cVar3;
        this.f76312j = cVar4;
        this.f76313k = cVar5;
        this.f76314l = cVar6;
        this.f76315m = cVar7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f76303a, eVar.f76303a) && p005kotlin.jvm.internal.s.g(this.f76304b, eVar.f76304b) && Float.compare(this.f76305c, eVar.f76305c) == 0 && Float.compare(this.f76306d, eVar.f76306d) == 0 && Float.compare(this.f76307e, eVar.f76307e) == 0 && Float.compare(this.f76308f, eVar.f76308f) == 0 && p005kotlin.jvm.internal.s.g(this.f76309g, eVar.f76309g) && p005kotlin.jvm.internal.s.g(this.f76310h, eVar.f76310h) && p005kotlin.jvm.internal.s.g(this.f76311i, eVar.f76311i) && p005kotlin.jvm.internal.s.g(this.f76312j, eVar.f76312j) && p005kotlin.jvm.internal.s.g(this.f76313k, eVar.f76313k) && p005kotlin.jvm.internal.s.g(this.f76314l, eVar.f76314l) && p005kotlin.jvm.internal.s.g(this.f76315m, eVar.f76315m);
    }

    public final int hashCode() {
        int iA = l2.a(this.f76312j, l2.a(this.f76311i, l2.a(this.f76310h, l2.a(this.f76309g, q6.f.d(this.f76308f, q6.f.d(this.f76307e, q6.f.d(this.f76306d, q6.f.d(this.f76305c, wr.g.j(this.f76303a.hashCode() * 31, 31, this.f76304b), 31), 31), 31), 31), 31), 31), 31), 31);
        i53.c<i53.c<g0>> cVar = this.f76313k;
        return this.f76315m.hashCode() + l2.a(this.f76314l, (iA + (cVar == null ? 0 : cVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("DailyStaminaChartState(chartXAxisTitle=", this.f76303a, ", rangeTitle=", this.f76304b, ", chartMaxY=");
        l2.n(sbI, this.f76305c, ", chartMinY=", this.f76306d, ", chartMaxX=");
        l2.n(sbI, this.f76307e, ", chartMinX=", this.f76308f, ", zoneKeyLine=");
        q6.f.w(sbI, this.f76309g, ", zoneKeyPoints=", this.f76310h, ", zoneKeyPointGradient=");
        q6.f.w(sbI, this.f76311i, ", zoneRange=", this.f76312j, ", segmentDelimiters=");
        q6.f.w(sbI, this.f76313k, ", xAxisLabels=", this.f76314l, ", markerStates=");
        return l2.e(sbI, this.f76315m, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f76303a);
        parcel.writeString(this.f76304b);
        parcel.writeFloat(this.f76305c);
        parcel.writeFloat(this.f76306d);
        parcel.writeFloat(this.f76307e);
        parcel.writeFloat(this.f76308f);
        Iterator itG = j20.x.g(this.f76309g, parcel);
        while (itG.hasNext()) {
            ((g0) itG.next()).writeToParcel(parcel, i14);
        }
        Iterator itG2 = j20.x.g(this.f76310h, parcel);
        while (itG2.hasNext()) {
            ((f0) itG2.next()).writeToParcel(parcel, i14);
        }
        Iterator itG3 = j20.x.g(this.f76311i, parcel);
        while (itG3.hasNext()) {
            parcel.writeSerializable((Serializable) itG3.next());
        }
        Iterator itG4 = j20.x.g(this.f76312j, parcel);
        while (itG4.hasNext()) {
            ((h0) itG4.next()).writeToParcel(parcel, i14);
        }
        i53.c<i53.c<g0>> cVar = this.f76313k;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(cVar.size());
            Iterator<i53.c<g0>> it = cVar.iterator();
            while (it.hasNext()) {
                Iterator itG5 = j20.x.g(it.next(), parcel);
                while (itG5.hasNext()) {
                    ((g0) itG5.next()).writeToParcel(parcel, i14);
                }
            }
        }
        parcel.writeStringList(this.f76314l);
        Iterator itG6 = j20.x.g(this.f76315m, parcel);
        while (itG6.hasNext()) {
            ((d) itG6.next()).writeToParcel(parcel, i14);
        }
    }

    public /* synthetic */ e(String str, String str2, float f14, float f15, float f16, float f17, i53.c cVar, i53.c cVar2, i53.c cVar3, i53.c cVar4, i53.c cVar5, i53.c cVar6, i53.c cVar7, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, f14, f15, f16, f17, cVar, cVar2, cVar3, cVar4, (i14 & 1024) != 0 ? null : cVar5, cVar6, cVar7);
    }
}
