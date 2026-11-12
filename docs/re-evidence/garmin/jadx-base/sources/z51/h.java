package z51;

import android.os.Parcel;
import android.os.Parcelable;
import b63.o;
import b63.u;
import b71.i;
import h63.k;
import java.util.ArrayList;
import java.util.List;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import z41.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017B\u0095\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001c¨\u0006 "}, d2 = {"Lz51/h;", "Landroid/os/Parcelable;", "", "pendingActivityId", "Lb63/o;", "calendarDate", "", "deviceId", "Lz51/e;", "status", "", "duration", "averageHR", "calories", "Lb63/u;", "startTimeGMT", "endTimeGMT", "", "activityTypePredictionKeys", "", "hasLocationData", "shouldShowPolyline", "<init>", "(Ljava/lang/String;Lb63/o;Ljava/lang/Long;Lz51/e;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lb63/u;Lb63/u;Ljava/util/List;ZZ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lb63/o;Ljava/lang/Long;Lz51/e;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lb63/u;Lb63/u;Ljava/util/List;ZZLm63/u1;)V", "Companion", "a", "b", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class h implements Parcelable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f202504n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f202506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f202507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f202508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f202509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f202510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f202511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f202512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f202513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<String> f202514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f202515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f202516l;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<h> CREATOR = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f202503m = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/pendingactivity/model/PendingActivitySummaryDTO.$serializer", "Lm63/e0;", "Lz51/h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f202517a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f202517a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.pendingactivity.model.PendingActivitySummaryDTO", aVar, 12);
            m1Var.j("pendingActivityUUID", false);
            m1Var.j("calendarDate", true);
            m1Var.j("deviceId", true);
            m1Var.j("status", true);
            m1Var.j("duration", true);
            m1Var.j("averageHR", true);
            m1Var.j("calories", true);
            m1Var.j("startTimeGMT", true);
            m1Var.j("endTimeGMT", true);
            m1Var.j("activityTypePredictionKeys", true);
            m1Var.j("hasLocationData", true);
            m1Var.j("shouldShowPolyline", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = h.f202504n;
            x xVar = x.f117036a;
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{y1.f117048a, j63.a.d(k.f82304a), j63.a.d(v0.f117027a), lVarArr[3].getValue(), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(lVarArr[7].getValue()), j63.a.d(lVarArr[8].getValue()), j63.a.d(lVarArr[9].getValue()), gVar, gVar};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            l<i63.c<Object>>[] lVarArr;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr2 = h.f202504n;
            int i14 = l63.c.f110557a;
            List list = null;
            u uVar = null;
            boolean z14 = true;
            u uVar2 = null;
            int i15 = 0;
            String strR = null;
            o oVar = null;
            Long l14 = null;
            e eVar3 = null;
            Double d14 = null;
            Double d15 = null;
            Double d16 = null;
            boolean zG = false;
            boolean zG2 = false;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        lVarArr = lVarArr2;
                        z14 = false;
                        break;
                    case 0:
                        lVarArr = lVarArr2;
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        lVarArr = lVarArr2;
                        oVar = (o) cVarC.v(eVar2, 1, k.f82304a, oVar);
                        i15 |= 2;
                        break;
                    case 2:
                        lVarArr = lVarArr2;
                        l14 = (Long) cVarC.v(eVar2, 2, v0.f117027a, l14);
                        i15 |= 4;
                        break;
                    case 3:
                        lVarArr = lVarArr2;
                        eVar3 = (e) cVarC.l(eVar2, 3, lVarArr[3].getValue(), eVar3);
                        i15 |= 8;
                        break;
                    case 4:
                        lVarArr = lVarArr2;
                        d14 = (Double) cVarC.v(eVar2, 4, x.f117036a, d14);
                        i15 |= 16;
                        break;
                    case 5:
                        lVarArr = lVarArr2;
                        d15 = (Double) cVarC.v(eVar2, 5, x.f117036a, d15);
                        i15 |= 32;
                        break;
                    case 6:
                        lVarArr = lVarArr2;
                        d16 = (Double) cVarC.v(eVar2, 6, x.f117036a, d16);
                        i15 |= 64;
                        break;
                    case 7:
                        lVarArr = lVarArr2;
                        uVar2 = (u) cVarC.v(eVar2, 7, lVarArr[7].getValue(), uVar2);
                        i15 |= 128;
                        break;
                    case 8:
                        lVarArr = lVarArr2;
                        uVar = (u) cVarC.v(eVar2, 8, lVarArr[8].getValue(), uVar);
                        i15 |= 256;
                        break;
                    case 9:
                        lVarArr = lVarArr2;
                        list = (List) cVarC.v(eVar2, 9, lVarArr2[9].getValue(), list);
                        i15 |= 512;
                        break;
                    case 10:
                        zG = cVarC.g(eVar2, 10);
                        i15 |= 1024;
                        continue;
                    case 11:
                        zG2 = cVarC.g(eVar2, 11);
                        i15 |= 2048;
                        continue;
                    default:
                        hb.a.o(iE);
                        return null;
                }
                lVarArr2 = lVarArr;
            }
            cVarC.b(eVar2);
            return new h(i15, strR, oVar, l14, eVar3, d14, d15, d16, uVar2, uVar, list, zG, zG2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            h hVar = (h) obj;
            hVar.getClass();
            boolean z14 = hVar.f202516l;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            Double dValueOf = Double.valueOf(Double.NaN);
            l<i63.c<Object>>[] lVarArr = h.f202504n;
            String str = hVar.f202505a;
            boolean z15 = hVar.f202515k;
            List<String> list = hVar.f202514j;
            u uVar = hVar.f202513i;
            u uVar2 = hVar.f202512h;
            Double d14 = hVar.f202511g;
            Double d15 = hVar.f202510f;
            Double d16 = hVar.f202509e;
            e eVar2 = hVar.f202508d;
            Long l14 = hVar.f202507c;
            o oVar = hVar.f202506b;
            dVarC.k(eVar, 0, str);
            if (dVarC.C(eVar) || oVar != null) {
                dVarC.d(eVar, 1, k.f82304a, oVar);
            }
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 2, v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || eVar2 != e.PENDING) {
                dVarC.e(eVar, 3, lVarArr[3].getValue(), eVar2);
            }
            if (dVarC.C(eVar) || !s.g(d16, dValueOf)) {
                dVarC.d(eVar, 4, x.f117036a, d16);
            }
            if (dVarC.C(eVar) || !s.g(d15, dValueOf)) {
                dVarC.d(eVar, 5, x.f117036a, d15);
            }
            if (dVarC.C(eVar) || !s.g(d14, dValueOf)) {
                dVarC.d(eVar, 6, x.f117036a, d14);
            }
            if (dVarC.C(eVar) || uVar2 != null) {
                dVarC.d(eVar, 7, lVarArr[7].getValue(), uVar2);
            }
            if (dVarC.C(eVar) || uVar != null) {
                dVarC.d(eVar, 8, lVarArr[8].getValue(), uVar);
            }
            if (dVarC.C(eVar) || !s.g(list, j0.f134944a)) {
                dVarC.d(eVar, 9, lVarArr[9].getValue(), list);
            }
            if (dVarC.C(eVar) || z15) {
                dVarC.n(eVar, 10, z15);
            }
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 11, z14);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            Double d14;
            parcel.getClass();
            String string = parcel.readString();
            o oVar = (o) parcel.readSerializable();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            e eVarValueOf = e.valueOf(parcel.readString());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
            u uVar = (u) parcel.readSerializable();
            u uVar2 = (u) parcel.readSerializable();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            boolean z14 = false;
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                d14 = dValueOf2;
                z14 = true;
            } else {
                d14 = dValueOf2;
            }
            return new h(string, oVar, lValueOf, eVarValueOf, dValueOf, d14, dValueOf3, uVar, uVar2, arrayListCreateStringArrayList, z15, z14);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f202504n = new l[]{null, null, null, m.a(nVar, new j(10)), null, null, null, m.a(nVar, new j(11)), m.a(nVar, new j(12)), m.a(nVar, new j(13)), null, null};
    }

    public h(int i14, String str, o oVar, Long l14, e eVar, Double d14, Double d15, Double d16, u uVar, u uVar2, List list, boolean z14, boolean z15, u1 u1Var) {
        Double dValueOf = Double.valueOf(Double.NaN);
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f202517a.getF116202c());
            throw null;
        }
        this.f202505a = str;
        if ((i14 & 2) == 0) {
            this.f202506b = null;
        } else {
            this.f202506b = oVar;
        }
        if ((i14 & 4) == 0) {
            this.f202507c = null;
        } else {
            this.f202507c = l14;
        }
        if ((i14 & 8) == 0) {
            this.f202508d = e.PENDING;
        } else {
            this.f202508d = eVar;
        }
        if ((i14 & 16) == 0) {
            this.f202509e = dValueOf;
        } else {
            this.f202509e = d14;
        }
        if ((i14 & 32) == 0) {
            this.f202510f = dValueOf;
        } else {
            this.f202510f = d15;
        }
        if ((i14 & 64) == 0) {
            this.f202511g = dValueOf;
        } else {
            this.f202511g = d16;
        }
        if ((i14 & 128) == 0) {
            this.f202512h = null;
        } else {
            this.f202512h = uVar;
        }
        if ((i14 & 256) == 0) {
            this.f202513i = null;
        } else {
            this.f202513i = uVar2;
        }
        if ((i14 & 512) == 0) {
            this.f202514j = j0.f134944a;
        } else {
            this.f202514j = list;
        }
        if ((i14 & 1024) == 0) {
            this.f202515k = false;
        } else {
            this.f202515k = z14;
        }
        if ((i14 & 2048) == 0) {
            this.f202516l = false;
        } else {
            this.f202516l = z15;
        }
    }

    public final u b() {
        u uVar = this.f202513i;
        return uVar != null ? g22.l.j(uVar) : g22.l.e(u.INSTANCE);
    }

    public final u d() {
        u uVar = this.f202512h;
        return uVar != null ? g22.l.j(uVar) : g22.l.e(u.INSTANCE);
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
        return s.g(this.f202505a, hVar.f202505a) && s.g(this.f202506b, hVar.f202506b) && s.g(this.f202507c, hVar.f202507c) && this.f202508d == hVar.f202508d && s.g(this.f202509e, hVar.f202509e) && s.g(this.f202510f, hVar.f202510f) && s.g(this.f202511g, hVar.f202511g) && s.g(this.f202512h, hVar.f202512h) && s.g(this.f202513i, hVar.f202513i) && s.g(this.f202514j, hVar.f202514j) && this.f202515k == hVar.f202515k && this.f202516l == hVar.f202516l;
    }

    public final int hashCode() {
        int iHashCode = this.f202505a.hashCode() * 31;
        o oVar = this.f202506b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31;
        Long l14 = this.f202507c;
        int iHashCode3 = (this.f202508d.hashCode() + ((iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31)) * 31;
        Double d14 = this.f202509e;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f202510f;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f202511g;
        int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
        u uVar = this.f202512h;
        int iHashCode7 = (iHashCode6 + (uVar == null ? 0 : uVar.f16216a.hashCode())) * 31;
        u uVar2 = this.f202513i;
        int iHashCode8 = (iHashCode7 + (uVar2 == null ? 0 : uVar2.f16216a.hashCode())) * 31;
        List<String> list = this.f202514j;
        return Boolean.hashCode(this.f202516l) + q6.f.g((iHashCode8 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f202515k);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PendingActivitySummaryDTO(pendingActivityId=");
        sb3.append(this.f202505a);
        sb3.append(", calendarDate=");
        sb3.append(this.f202506b);
        sb3.append(", deviceId=");
        sb3.append(this.f202507c);
        sb3.append(", status=");
        sb3.append(this.f202508d);
        sb3.append(", duration=");
        i.p(this.f202509e, this.f202510f, ", averageHR=", ", calories=", sb3);
        sb3.append(this.f202511g);
        sb3.append(", startTimeGMT=");
        sb3.append(this.f202512h);
        sb3.append(", endTimeGMT=");
        sb3.append(this.f202513i);
        sb3.append(", activityTypePredictionKeys=");
        sb3.append(this.f202514j);
        sb3.append(", hasLocationData=");
        return com.airbnb.lottie.animation.keyframe.a.f(", shouldShowPolyline=", ")", sb3, this.f202515k, this.f202516l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f202505a);
        parcel.writeSerializable(this.f202506b);
        Long l14 = this.f202507c;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f202508d.name());
        Double d14 = this.f202509e;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f202510f;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.f202511g;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        parcel.writeSerializable(this.f202512h);
        parcel.writeSerializable(this.f202513i);
        parcel.writeStringList(this.f202514j);
        parcel.writeInt(this.f202515k ? 1 : 0);
        parcel.writeInt(this.f202516l ? 1 : 0);
    }

    /* JADX INFO: renamed from: z51.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz51/h$b;", "", "<init>", "()V", "Li63/c;", "Lz51/h;", "serializer", "()Li63/c;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<h> serializer() {
            return a.f202517a;
        }

        private Companion() {
        }
    }

    public h(String str, o oVar, Long l14, e eVar, Double d14, Double d15, Double d16, u uVar, u uVar2, List<String> list, boolean z14, boolean z15) {
        str.getClass();
        eVar.getClass();
        this.f202505a = str;
        this.f202506b = oVar;
        this.f202507c = l14;
        this.f202508d = eVar;
        this.f202509e = d14;
        this.f202510f = d15;
        this.f202511g = d16;
        this.f202512h = uVar;
        this.f202513i = uVar2;
        this.f202514j = list;
        this.f202515k = z14;
        this.f202516l = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(String str, o oVar, Long l14, e eVar, Double d14, Double d15, Double d16, u uVar, u uVar2, List list, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        Double dValueOf = Double.valueOf(Double.NaN);
        this(str, (i14 & 2) != 0 ? null : oVar, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? e.PENDING : eVar, (i14 & 16) != 0 ? dValueOf : d14, (i14 & 32) != 0 ? dValueOf : d15, (i14 & 64) == 0 ? d16 : dValueOf, (i14 & 128) != 0 ? null : uVar, (i14 & 256) == 0 ? uVar2 : null, (i14 & 512) != 0 ? j0.f134944a : list, (i14 & 1024) != 0 ? false : z14, (i14 & 2048) != 0 ? false : z15);
    }
}
