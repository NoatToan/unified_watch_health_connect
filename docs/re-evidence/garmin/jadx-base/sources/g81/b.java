package g81;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f0\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\t\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lg81/b;", "Landroid/os/Parcelable;", "", "chartXAxisTitle", "", "chartMaxY", "chartMinY", "chartMaxX", "chartMinX", "Li53/c;", "Lg81/g0;", "earliestStaminaCurveLine", "Lg81/f0;", "earliestZoneKeyPoints", "latestStaminaCurveLine", "Lo13/p;", "", "latestStaminaCurveGradient", "latestZoneKeyPoints", "Lg81/h0;", "zoneRange", "segmentDelimiters", "xAxisLabels", "Lg81/a;", "markerStates", "earliestDate", "latestDate", "<init>", "(Ljava/lang/String;FFFFLi53/c;Li53/c;Li53/c;Li53/c;Li53/c;Li53/c;Li53/c;Li53/c;Li53/c;Ljava/lang/String;Ljava/lang/String;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f76268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f76269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f76270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f76271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<g0> f76272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<f0> f76273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<g0> f76274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i53.c<o13.p<Float, Integer>> f76275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i53.c<f0> f76276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i53.c<h0> f76277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i53.c<i53.c<g0>> f76278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i53.c<String> f76279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i53.c<g81.a> f76280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f76281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f76282p;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            String str;
            float f14;
            float f15;
            float f16;
            i53.f fVarJ;
            parcel.getClass();
            String string = parcel.readString();
            float f17 = parcel.readFloat();
            float f18 = parcel.readFloat();
            float f19 = parcel.readFloat();
            float f22 = parcel.readFloat();
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
            int iA3 = 0;
            while (iA3 != i16) {
                iA3 = kg.f.a(g0.CREATOR, parcel, arrayList3, iA3, 1);
            }
            i53.f fVarJ4 = i53.a.j(arrayList3);
            int i17 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList4.add(parcel.readSerializable());
            }
            i53.f fVarJ5 = i53.a.j(arrayList4);
            int i19 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i19);
            int iA4 = 0;
            while (iA4 != i19) {
                iA4 = kg.f.a(f0.CREATOR, parcel, arrayList5, iA4, 1);
            }
            i53.f fVarJ6 = i53.a.j(arrayList5);
            int i24 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i24);
            int iA5 = 0;
            while (iA5 != i24) {
                iA5 = kg.f.a(h0.CREATOR, parcel, arrayList6, iA5, 1);
            }
            i53.f fVarJ7 = i53.a.j(arrayList6);
            if (parcel.readInt() == 0) {
                fVarJ = null;
                str = string;
                f14 = f17;
                f15 = f18;
                f16 = f19;
            } else {
                int i25 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i25);
                int i26 = 0;
                while (i26 != i25) {
                    int i27 = parcel.readInt();
                    String str2 = string;
                    ArrayList arrayList8 = new ArrayList(i27);
                    float f24 = f17;
                    int iA6 = 0;
                    while (true) {
                        float f25 = f18;
                        if (iA6 != i27) {
                            iA6 = kg.f.a(g0.CREATOR, parcel, arrayList8, iA6, 1);
                            f18 = f25;
                            f19 = f19;
                        }
                    }
                    arrayList7.add(i53.a.j(arrayList8));
                    i26++;
                    string = str2;
                    f17 = f24;
                }
                str = string;
                f14 = f17;
                f15 = f18;
                f16 = f19;
                fVarJ = i53.a.j(arrayList7);
            }
            i53.f fVarJ8 = i53.a.j(parcel.createStringArrayList());
            int i28 = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(i28);
            int iA7 = 0;
            while (iA7 != i28) {
                iA7 = kg.f.a(g81.a.CREATOR, parcel, arrayList9, iA7, 1);
            }
            return new b(str, f14, f15, f16, f22, fVarJ2, fVarJ3, fVarJ4, fVarJ5, fVarJ6, fVarJ7, fVarJ, fVarJ8, i53.a.j(arrayList9), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, float f14, float f15, float f16, float f17, i53.c<g0> cVar, i53.c<f0> cVar2, i53.c<g0> cVar3, i53.c<o13.p<Float, Integer>> cVar4, i53.c<f0> cVar5, i53.c<h0> cVar6, i53.c<? extends i53.c<g0>> cVar7, i53.c<String> cVar8, i53.c<g81.a> cVar9, String str2, String str3) {
        str.getClass();
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        cVar4.getClass();
        cVar5.getClass();
        cVar6.getClass();
        cVar8.getClass();
        cVar9.getClass();
        str2.getClass();
        str3.getClass();
        this.f76267a = str;
        this.f76268b = f14;
        this.f76269c = f15;
        this.f76270d = f16;
        this.f76271e = f17;
        this.f76272f = cVar;
        this.f76273g = cVar2;
        this.f76274h = cVar3;
        this.f76275i = cVar4;
        this.f76276j = cVar5;
        this.f76277k = cVar6;
        this.f76278l = cVar7;
        this.f76279m = cVar8;
        this.f76280n = cVar9;
        this.f76281o = str2;
        this.f76282p = str3;
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
        return p005kotlin.jvm.internal.s.g(this.f76267a, bVar.f76267a) && Float.compare(this.f76268b, bVar.f76268b) == 0 && Float.compare(this.f76269c, bVar.f76269c) == 0 && Float.compare(this.f76270d, bVar.f76270d) == 0 && Float.compare(this.f76271e, bVar.f76271e) == 0 && p005kotlin.jvm.internal.s.g(this.f76272f, bVar.f76272f) && p005kotlin.jvm.internal.s.g(this.f76273g, bVar.f76273g) && p005kotlin.jvm.internal.s.g(this.f76274h, bVar.f76274h) && p005kotlin.jvm.internal.s.g(this.f76275i, bVar.f76275i) && p005kotlin.jvm.internal.s.g(this.f76276j, bVar.f76276j) && p005kotlin.jvm.internal.s.g(this.f76277k, bVar.f76277k) && p005kotlin.jvm.internal.s.g(this.f76278l, bVar.f76278l) && p005kotlin.jvm.internal.s.g(this.f76279m, bVar.f76279m) && p005kotlin.jvm.internal.s.g(this.f76280n, bVar.f76280n) && p005kotlin.jvm.internal.s.g(this.f76281o, bVar.f76281o) && p005kotlin.jvm.internal.s.g(this.f76282p, bVar.f76282p);
    }

    public final int hashCode() {
        int iA = l2.a(this.f76277k, l2.a(this.f76276j, l2.a(this.f76275i, l2.a(this.f76274h, l2.a(this.f76273g, l2.a(this.f76272f, q6.f.d(this.f76271e, q6.f.d(this.f76270d, q6.f.d(this.f76269c, q6.f.d(this.f76268b, this.f76267a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        i53.c<i53.c<g0>> cVar = this.f76278l;
        return this.f76282p.hashCode() + wr.g.j(l2.a(this.f76280n, l2.a(this.f76279m, (iA + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31), 31, this.f76281o);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ComparisonStaminaChartState(chartXAxisTitle=");
        sb3.append(this.f76267a);
        sb3.append(", chartMaxY=");
        sb3.append(this.f76268b);
        sb3.append(", chartMinY=");
        l2.n(sb3, this.f76269c, ", chartMaxX=", this.f76270d, ", chartMinX=");
        sb3.append(this.f76271e);
        sb3.append(", earliestStaminaCurveLine=");
        sb3.append(this.f76272f);
        sb3.append(", earliestZoneKeyPoints=");
        q6.f.w(sb3, this.f76273g, ", latestStaminaCurveLine=", this.f76274h, ", latestStaminaCurveGradient=");
        q6.f.w(sb3, this.f76275i, ", latestZoneKeyPoints=", this.f76276j, ", zoneRange=");
        q6.f.w(sb3, this.f76277k, ", segmentDelimiters=", this.f76278l, ", xAxisLabels=");
        q6.f.w(sb3, this.f76279m, ", markerStates=", this.f76280n, ", earliestDate=");
        return e5.h(sb3, this.f76281o, ", latestDate=", this.f76282p, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f76267a);
        parcel.writeFloat(this.f76268b);
        parcel.writeFloat(this.f76269c);
        parcel.writeFloat(this.f76270d);
        parcel.writeFloat(this.f76271e);
        Iterator itG = j20.x.g(this.f76272f, parcel);
        while (itG.hasNext()) {
            ((g0) itG.next()).writeToParcel(parcel, i14);
        }
        Iterator itG2 = j20.x.g(this.f76273g, parcel);
        while (itG2.hasNext()) {
            ((f0) itG2.next()).writeToParcel(parcel, i14);
        }
        Iterator itG3 = j20.x.g(this.f76274h, parcel);
        while (itG3.hasNext()) {
            ((g0) itG3.next()).writeToParcel(parcel, i14);
        }
        Iterator itG4 = j20.x.g(this.f76275i, parcel);
        while (itG4.hasNext()) {
            parcel.writeSerializable((Serializable) itG4.next());
        }
        Iterator itG5 = j20.x.g(this.f76276j, parcel);
        while (itG5.hasNext()) {
            ((f0) itG5.next()).writeToParcel(parcel, i14);
        }
        Iterator itG6 = j20.x.g(this.f76277k, parcel);
        while (itG6.hasNext()) {
            ((h0) itG6.next()).writeToParcel(parcel, i14);
        }
        i53.c<i53.c<g0>> cVar = this.f76278l;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(cVar.size());
            Iterator<i53.c<g0>> it = cVar.iterator();
            while (it.hasNext()) {
                Iterator itG7 = j20.x.g(it.next(), parcel);
                while (itG7.hasNext()) {
                    ((g0) itG7.next()).writeToParcel(parcel, i14);
                }
            }
        }
        parcel.writeStringList(this.f76279m);
        Iterator itG8 = j20.x.g(this.f76280n, parcel);
        while (itG8.hasNext()) {
            ((g81.a) itG8.next()).writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f76281o);
        parcel.writeString(this.f76282p);
    }

    public /* synthetic */ b(String str, float f14, float f15, float f16, float f17, i53.c cVar, i53.c cVar2, i53.c cVar3, i53.c cVar4, i53.c cVar5, i53.c cVar6, i53.c cVar7, i53.c cVar8, i53.c cVar9, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, f14, f15, f16, f17, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, (i14 & 2048) != 0 ? null : cVar7, cVar8, cVar9, str2, str3);
    }
}
