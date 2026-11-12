package n61;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import mz1.d0;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.x;
import p13.y;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0013\u0010\u0014B\u009f\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018¨\u0006\u001c"}, d2 = {"Ln61/i;", "Landroid/os/Parcelable;", "", "userProfilePk", "deviceId", "", "calendarDate", "", "sportId", "timestampGmt", "", "primaryTrainingDevice", "", "", "maxSustainableTime", "maxSustainableDistance", "zonesErrorUpper", "zonesErrorLower", "zoneValues", "<init>", "(JJLjava/lang/String;ILjava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJJLjava/lang/String;ILjava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i implements Parcelable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f123865l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f123866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f123867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f123868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f123869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f123870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f123871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<Float> f123872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Float> f123873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<Float> f123874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<Float> f123875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<Float> f123876k;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<i> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/performance/endurancescore/model/StaminaCurveDTO.$serializer", "Lm63/e0;", "Ln61/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f123877a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f123877a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.performance.endurancescore.model.StaminaCurveDTO", aVar, 11);
            m1Var.j("userProfilePk", false);
            m1Var.j("deviceId", false);
            m1Var.j("calendarDate", false);
            m1Var.j("sportId", false);
            m1Var.j("timestampGmt", false);
            m1Var.j("primaryTrainingDevice", false);
            m1Var.j("maxSustainableTime", false);
            m1Var.j("maxSustainableDistance", false);
            m1Var.j("staminaCurveZonesErrorUpper", false);
            m1Var.j("staminaCurveZonesErrorLower", false);
            m1Var.j("staminaCurveZones", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = i.f123865l;
            v0 v0Var = v0.f117027a;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{v0Var, v0Var, y1Var, m0.f116981a, y1Var, m63.g.f116948a, lVarArr[6].getValue(), lVarArr[7].getValue(), lVarArr[8].getValue(), lVarArr[9].getValue(), lVarArr[10].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            l<i63.c<Object>>[] lVarArr;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr2 = i.f123865l;
            int i14 = l63.c.f110557a;
            long jW = 0;
            long jW2 = 0;
            List list = null;
            List list2 = null;
            boolean z14 = true;
            List list3 = null;
            List list4 = null;
            List list5 = null;
            int i15 = 0;
            String strR = null;
            int iA = 0;
            String strR2 = null;
            boolean zG = false;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        lVarArr = lVarArr2;
                        jW = cVarC.w(eVar2, 0);
                        i15 |= 1;
                        lVarArr2 = lVarArr;
                        z14 = z14;
                        break;
                    case 1:
                        jW2 = cVarC.w(eVar2, 1);
                        i15 |= 2;
                        lVarArr2 = lVarArr2;
                        break;
                    case 2:
                        strR = cVarC.r(eVar2, 2);
                        i15 |= 4;
                        lVarArr2 = lVarArr2;
                        break;
                    case 3:
                        iA = cVarC.A(eVar2, 3);
                        i15 |= 8;
                        lVarArr2 = lVarArr2;
                        break;
                    case 4:
                        strR2 = cVarC.r(eVar2, 4);
                        i15 |= 16;
                        lVarArr2 = lVarArr2;
                        break;
                    case 5:
                        zG = cVarC.g(eVar2, 5);
                        i15 |= 32;
                        lVarArr2 = lVarArr2;
                        break;
                    case 6:
                        lVarArr = lVarArr2;
                        list3 = (List) cVarC.l(eVar2, 6, lVarArr[6].getValue(), list3);
                        i15 |= 64;
                        lVarArr2 = lVarArr;
                        z14 = z14;
                        break;
                    case 7:
                        lVarArr = lVarArr2;
                        list5 = (List) cVarC.l(eVar2, 7, lVarArr[7].getValue(), list5);
                        i15 |= 128;
                        lVarArr2 = lVarArr;
                        z14 = z14;
                        break;
                    case 8:
                        lVarArr = lVarArr2;
                        list4 = (List) cVarC.l(eVar2, 8, lVarArr[8].getValue(), list4);
                        i15 |= 256;
                        lVarArr2 = lVarArr;
                        z14 = z14;
                        break;
                    case 9:
                        lVarArr = lVarArr2;
                        list2 = (List) cVarC.l(eVar2, 9, lVarArr[9].getValue(), list2);
                        i15 |= 512;
                        lVarArr2 = lVarArr;
                        z14 = z14;
                        break;
                    case 10:
                        lVarArr = lVarArr2;
                        list = (List) cVarC.l(eVar2, 10, lVarArr[10].getValue(), list);
                        i15 |= 1024;
                        lVarArr2 = lVarArr;
                        z14 = z14;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new i(i15, jW, jW2, strR, iA, strR2, zG, list3, list5, list4, list2, list, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            i iVar = (i) obj;
            iVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = i.f123865l;
            dVarC.z(eVar, 0, iVar.f123866a);
            dVarC.z(eVar, 1, iVar.f123867b);
            dVarC.k(eVar, 2, iVar.f123868c);
            dVarC.v(3, iVar.f123869d, eVar);
            dVarC.k(eVar, 4, iVar.f123870e);
            dVarC.n(eVar, 5, iVar.f123871f);
            dVarC.e(eVar, 6, lVarArr[6].getValue(), iVar.f123872g);
            dVarC.e(eVar, 7, lVarArr[7].getValue(), iVar.f123873h);
            dVarC.e(eVar, 8, lVarArr[8].getValue(), iVar.f123874i);
            dVarC.e(eVar, 9, lVarArr[9].getValue(), iVar.f123875j);
            dVarC.e(eVar, 10, lVarArr[10].getValue(), iVar.f123876k);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            long j8 = parcel.readLong();
            long j14 = parcel.readLong();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            String string2 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
            }
            int i17 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList2.add(Float.valueOf(parcel.readFloat()));
            }
            int i19 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i19);
            for (int i24 = 0; i24 != i19; i24++) {
                arrayList3.add(Float.valueOf(parcel.readFloat()));
            }
            int i25 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i25);
            for (int i26 = 0; i26 != i25; i26++) {
                arrayList4.add(Float.valueOf(parcel.readFloat()));
            }
            int i27 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i27);
            for (int i28 = 0; i28 != i27; i28++) {
                arrayList5.add(Float.valueOf(parcel.readFloat()));
            }
            return new i(j8, j14, string, i14, string2, z14, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f123865l = new l[]{null, null, null, null, null, null, m.a(nVar, new d0(29)), m.a(nVar, new h(0)), m.a(nVar, new h(1)), m.a(nVar, new h(2)), m.a(nVar, new h(3))};
    }

    public i(long j8, long j14, String str, int i14, String str2, boolean z14, List<Float> list, List<Float> list2, List<Float> list3, List<Float> list4, List<Float> list5) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        this.f123866a = j8;
        this.f123867b = j14;
        this.f123868c = str;
        this.f123869d = i14;
        this.f123870e = str2;
        this.f123871f = z14;
        this.f123872g = list;
        this.f123873h = list2;
        this.f123874i = list3;
        this.f123875j = list4;
        this.f123876k = list5;
    }

    public final List<Float> b() {
        int i14 = this.f123869d;
        List<Float> list = this.f123873h;
        if (i14 != 1 || !list.isEmpty()) {
            return list;
        }
        List<Float> list2 = this.f123872g;
        ArrayList arrayList = new ArrayList(y.r(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            arrayList.add(Float.valueOf(this.f123876k.get(i15).floatValue() * ((Number) obj).floatValue()));
            i15 = i16;
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f123866a == iVar.f123866a && this.f123867b == iVar.f123867b && s.g(this.f123868c, iVar.f123868c) && this.f123869d == iVar.f123869d && s.g(this.f123870e, iVar.f123870e) && this.f123871f == iVar.f123871f && s.g(this.f123872g, iVar.f123872g) && s.g(this.f123873h, iVar.f123873h) && s.g(this.f123874i, iVar.f123874i) && s.g(this.f123875j, iVar.f123875j) && s.g(this.f123876k, iVar.f123876k);
    }

    public final int hashCode() {
        return this.f123876k.hashCode() + u0.b(u0.b(u0.b(u0.b(q6.f.g(wr.g.j(q2.d(this.f123869d, wr.g.j(q6.f.e(Long.hashCode(this.f123866a) * 31, 31, this.f123867b), 31, this.f123868c), 31), 31, this.f123870e), 31, this.f123871f), 31, this.f123872g), 31, this.f123873h), 31, this.f123874i), 31, this.f123875j);
    }

    public final String toString() {
        StringBuilder sbK = ds.e0.k(this.f123866a, "StaminaCurveDTO(userProfilePk=", ", deviceId=");
        p6.b.k(this.f123867b, ", calendarDate=", this.f123868c, sbK);
        sbK.append(", sportId=");
        sbK.append(this.f123869d);
        sbK.append(", timestampGmt=");
        sbK.append(this.f123870e);
        sbK.append(", primaryTrainingDevice=");
        sbK.append(this.f123871f);
        sbK.append(", maxSustainableTime=");
        sbK.append(this.f123872g);
        sbK.append(", maxSustainableDistance=");
        sbK.append(this.f123873h);
        sbK.append(", zonesErrorUpper=");
        sbK.append(this.f123874i);
        sbK.append(", zonesErrorLower=");
        sbK.append(this.f123875j);
        sbK.append(", zoneValues=");
        sbK.append(this.f123876k);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f123866a);
        parcel.writeLong(this.f123867b);
        parcel.writeString(this.f123868c);
        parcel.writeInt(this.f123869d);
        parcel.writeString(this.f123870e);
        parcel.writeInt(this.f123871f ? 1 : 0);
        Iterator itE = kg.f.e(this.f123872g, parcel);
        while (itE.hasNext()) {
            parcel.writeFloat(((Number) itE.next()).floatValue());
        }
        Iterator itE2 = kg.f.e(this.f123873h, parcel);
        while (itE2.hasNext()) {
            parcel.writeFloat(((Number) itE2.next()).floatValue());
        }
        Iterator itE3 = kg.f.e(this.f123874i, parcel);
        while (itE3.hasNext()) {
            parcel.writeFloat(((Number) itE3.next()).floatValue());
        }
        Iterator itE4 = kg.f.e(this.f123875j, parcel);
        while (itE4.hasNext()) {
            parcel.writeFloat(((Number) itE4.next()).floatValue());
        }
        Iterator itE5 = kg.f.e(this.f123876k, parcel);
        while (itE5.hasNext()) {
            parcel.writeFloat(((Number) itE5.next()).floatValue());
        }
    }

    /* JADX INFO: renamed from: n61.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln61/i$b;", "", "<init>", "()V", "Li63/c;", "Ln61/i;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f123877a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ i(int i14, long j8, long j14, String str, int i15, String str2, boolean z14, List list, List list2, List list3, List list4, List list5, u1 u1Var) {
        if (2047 != (i14 & 2047)) {
            k1.h(i14, 2047, a.f123877a.getF94809a());
            throw null;
        }
        this.f123866a = j8;
        this.f123867b = j14;
        this.f123868c = str;
        this.f123869d = i15;
        this.f123870e = str2;
        this.f123871f = z14;
        this.f123872g = list;
        this.f123873h = list2;
        this.f123874i = list3;
        this.f123875j = list4;
        this.f123876k = list5;
    }
}
