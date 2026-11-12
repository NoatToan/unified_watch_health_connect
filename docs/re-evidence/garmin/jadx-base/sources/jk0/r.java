package jk0;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013¨\u0006\u0017"}, d2 = {"Ljk0/r;", "Landroid/os/Parcelable;", "", "uuid", "", "userProfilePk", "Lc80/u;", "gearType", "Ljk0/p;", "status", "name", "brand", ModelSourceWrapper.TYPE, "<init>", "(Ljava/lang/String;JLc80/u;Ljk0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;JLc80/u;Ljk0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class r implements Parcelable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f99312h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f99314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c80.u f99315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f99316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f99317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f99318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f99319g;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<r> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/data/model/GearSummaryBaseDTO.$serializer", "Lm63/e0;", "Ljk0/r;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f99320a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f99320a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.data.model.GearSummaryBaseDTO", aVar, 7);
            m1Var.j("uuid", false);
            m1Var.j("userProfilePk", false);
            m1Var.j("gearType", false);
            m1Var.j("status", true);
            m1Var.j("name", true);
            m1Var.j("brand", true);
            m1Var.j(ModelSourceWrapper.TYPE, true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = r.f99312h;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, v0.f117027a, lVarArr[2].getValue(), j63.a.d(lVarArr[3].getValue()), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = r.f99312h;
            int i14 = l63.c.f110557a;
            Object obj = null;
            String str = null;
            String strR = null;
            c80.u uVar = null;
            p pVar = null;
            String str2 = null;
            long jW = 0;
            int i15 = 0;
            boolean z14 = true;
            String str3 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        continue;
                    case 0:
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        jW = cVarC.w(eVar2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        uVar = (c80.u) cVarC.l(eVar2, 2, lVarArr[2].getValue(), uVar);
                        i15 |= 4;
                        break;
                    case 3:
                        pVar = (p) cVarC.v(eVar2, 3, lVarArr[3].getValue(), pVar);
                        i15 |= 8;
                        break;
                    case 4:
                        str2 = (String) cVarC.v(eVar2, 4, y1.f117048a, str2);
                        i15 |= 16;
                        break;
                    case 5:
                        str3 = (String) cVarC.v(eVar2, 5, y1.f117048a, str3);
                        i15 |= 32;
                        break;
                    case 6:
                        str = (String) cVarC.v(eVar2, 6, y1.f117048a, str);
                        i15 |= 64;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new r(i15, strR, jW, uVar, pVar, str2, str3, str, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            r rVar = (r) obj;
            rVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = r.f99312h;
            String str = rVar.f99313a;
            String str2 = rVar.f99319g;
            String str3 = rVar.f99318f;
            String str4 = rVar.f99317e;
            p pVar = rVar.f99316d;
            dVarC.k(eVar, 0, str);
            dVarC.z(eVar, 1, rVar.f99314b);
            dVarC.e(eVar, 2, lVarArr[2].getValue(), rVar.f99315c);
            if (dVarC.C(eVar) || pVar != null) {
                dVarC.d(eVar, 3, lVarArr[3].getValue(), pVar);
            }
            if (dVarC.C(eVar) || str4 != null) {
                dVarC.d(eVar, 4, y1.f117048a, str4);
            }
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 5, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 6, y1.f117048a, str2);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new r(parcel.readString(), parcel.readLong(), c80.u.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : p.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f99312h = new o13.l[]{null, null, o13.m.a(nVar, new je0.o(21)), o13.m.a(nVar, new je0.o(22)), null, null, null};
    }

    public /* synthetic */ r(int i14, String str, long j8, c80.u uVar, p pVar, String str2, String str3, String str4, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f99320a.getF158591b());
            throw null;
        }
        this.f99313a = str;
        this.f99314b = j8;
        this.f99315c = uVar;
        if ((i14 & 8) == 0) {
            this.f99316d = null;
        } else {
            this.f99316d = pVar;
        }
        if ((i14 & 16) == 0) {
            this.f99317e = null;
        } else {
            this.f99317e = str2;
        }
        if ((i14 & 32) == 0) {
            this.f99318f = null;
        } else {
            this.f99318f = str3;
        }
        if ((i14 & 64) == 0) {
            this.f99319g = null;
        } else {
            this.f99319g = str4;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.f99313a, rVar.f99313a) && this.f99314b == rVar.f99314b && this.f99315c == rVar.f99315c && this.f99316d == rVar.f99316d && p005kotlin.jvm.internal.s.g(this.f99317e, rVar.f99317e) && p005kotlin.jvm.internal.s.g(this.f99318f, rVar.f99318f) && p005kotlin.jvm.internal.s.g(this.f99319g, rVar.f99319g);
    }

    public final int hashCode() {
        int iHashCode = (this.f99315c.hashCode() + q6.f.e(this.f99313a.hashCode() * 31, 31, this.f99314b)) * 31;
        p pVar = this.f99316d;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str = this.f99317e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f99318f;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f99319g;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.f99314b, "GearSummaryBaseDTO(uuid=", this.f99313a, ", userProfilePk=");
        sbJ.append(", gearType=");
        sbJ.append(this.f99315c);
        sbJ.append(", status=");
        sbJ.append(this.f99316d);
        sn.a.t(sbJ, ", name=", this.f99317e, ", brand=", this.f99318f);
        return v.e0.h(sbJ, ", model=", this.f99319g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f99313a);
        parcel.writeLong(this.f99314b);
        parcel.writeString(this.f99315c.name());
        p pVar = this.f99316d;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(pVar.name());
        }
        parcel.writeString(this.f99317e);
        parcel.writeString(this.f99318f);
        parcel.writeString(this.f99319g);
    }

    /* JADX INFO: renamed from: jk0.r$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljk0/r$b;", "", "<init>", "()V", "Li63/c;", "Ljk0/r;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<r> serializer() {
            return a.f99320a;
        }

        private Companion() {
        }
    }

    public r(String str, long j8, c80.u uVar, p pVar, String str2, String str3, String str4) {
        str.getClass();
        uVar.getClass();
        this.f99313a = str;
        this.f99314b = j8;
        this.f99315c = uVar;
        this.f99316d = pVar;
        this.f99317e = str2;
        this.f99318f = str3;
        this.f99319g = str4;
    }

    public /* synthetic */ r(String str, long j8, c80.u uVar, p pVar, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, j8, uVar, (i14 & 8) != 0 ? null : pVar, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4);
    }
}
