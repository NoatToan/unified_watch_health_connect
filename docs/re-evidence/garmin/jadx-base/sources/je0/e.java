package je0;

import i3.e5;
import java.util.List;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015¨\u0006\u0019"}, d2 = {"Lje0/e;", "", "", "name", "", "primaryBreedId", "", "secondaryBreedIds", "gender", "", "isNeutered", "", "weight", "birthdate", "birthdatePrecision", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f98490i = {null, null, o13.m.a(o13.n.PUBLICATION, new j21.f(22)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f98492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Long> f98493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f98494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f98495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f98496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f98497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f98498h;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/domaindogs/data/model/CreatePetProfileRequest.$serializer", "Lm63/e0;", "Lje0/e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f98499a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f98499a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.domaindogs.data.model.CreatePetProfileRequest", aVar, 8);
            m1Var.j("name", false);
            m1Var.j("primaryBreedId", true);
            m1Var.j("secondaryBreedIds", true);
            m1Var.j("gender", true);
            m1Var.j("isNeutered", true);
            m1Var.j("weight", true);
            m1Var.j("birthdate", true);
            m1Var.j("birthdatePrecision", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = e.f98490i;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, j63.a.d(v0.f117027a), j63.a.d(lVarArr[2].getValue()), j63.a.d(y1Var), j63.a.d(m63.g.f116948a), j63.a.d(x.f117036a), j63.a.d(y1Var), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = e.f98490i;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            String str = null;
            String strR = null;
            Long l14 = null;
            List list = null;
            String str2 = null;
            Boolean bool = null;
            Double d14 = null;
            String str3 = null;
            int i15 = 0;
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
                        l14 = (Long) cVarC.v(eVar2, 1, v0.f117027a, l14);
                        i15 |= 2;
                        break;
                    case 2:
                        list = (List) cVarC.v(eVar2, 2, lVarArr[2].getValue(), list);
                        i15 |= 4;
                        break;
                    case 3:
                        str2 = (String) cVarC.v(eVar2, 3, y1.f117048a, str2);
                        i15 |= 8;
                        break;
                    case 4:
                        bool = (Boolean) cVarC.v(eVar2, 4, m63.g.f116948a, bool);
                        i15 |= 16;
                        break;
                    case 5:
                        d14 = (Double) cVarC.v(eVar2, 5, x.f117036a, d14);
                        i15 |= 32;
                        break;
                    case 6:
                        str3 = (String) cVarC.v(eVar2, 6, y1.f117048a, str3);
                        i15 |= 64;
                        break;
                    case 7:
                        str = (String) cVarC.v(eVar2, 7, y1.f117048a, str);
                        i15 |= 128;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new e(i15, strR, l14, list, str2, bool, d14, str3, str, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            e eVar = (e) obj;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.d dVarC = fVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = e.f98490i;
            String str = eVar.f98491a;
            String str2 = eVar.f98498h;
            String str3 = eVar.f98497g;
            Double d14 = eVar.f98496f;
            Boolean bool = eVar.f98495e;
            String str4 = eVar.f98494d;
            List<Long> list = eVar.f98493c;
            Long l14 = eVar.f98492b;
            dVarC.k(eVar2, 0, str);
            if (dVarC.C(eVar2) || l14 != null) {
                dVarC.d(eVar2, 1, v0.f117027a, l14);
            }
            if (dVarC.C(eVar2) || list != null) {
                dVarC.d(eVar2, 2, lVarArr[2].getValue(), list);
            }
            if (dVarC.C(eVar2) || str4 != null) {
                dVarC.d(eVar2, 3, y1.f117048a, str4);
            }
            if (dVarC.C(eVar2) || bool != null) {
                dVarC.d(eVar2, 4, m63.g.f116948a, bool);
            }
            if (dVarC.C(eVar2) || d14 != null) {
                dVarC.d(eVar2, 5, x.f117036a, d14);
            }
            if (dVarC.C(eVar2) || str3 != null) {
                dVarC.d(eVar2, 6, y1.f117048a, str3);
            }
            if (dVarC.C(eVar2) || str2 != null) {
                dVarC.d(eVar2, 7, y1.f117048a, str2);
            }
            dVarC.b(eVar2);
        }
    }

    public /* synthetic */ e(int i14, String str, Long l14, List list, String str2, Boolean bool, Double d14, String str3, String str4, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f98499a.getF158591b());
            throw null;
        }
        this.f98491a = str;
        if ((i14 & 2) == 0) {
            this.f98492b = null;
        } else {
            this.f98492b = l14;
        }
        if ((i14 & 4) == 0) {
            this.f98493c = null;
        } else {
            this.f98493c = list;
        }
        if ((i14 & 8) == 0) {
            this.f98494d = null;
        } else {
            this.f98494d = str2;
        }
        if ((i14 & 16) == 0) {
            this.f98495e = null;
        } else {
            this.f98495e = bool;
        }
        if ((i14 & 32) == 0) {
            this.f98496f = null;
        } else {
            this.f98496f = d14;
        }
        if ((i14 & 64) == 0) {
            this.f98497g = null;
        } else {
            this.f98497g = str3;
        }
        if ((i14 & 128) == 0) {
            this.f98498h = null;
        } else {
            this.f98498h = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f98491a, eVar.f98491a) && p005kotlin.jvm.internal.s.g(this.f98492b, eVar.f98492b) && p005kotlin.jvm.internal.s.g(this.f98493c, eVar.f98493c) && p005kotlin.jvm.internal.s.g(this.f98494d, eVar.f98494d) && p005kotlin.jvm.internal.s.g(this.f98495e, eVar.f98495e) && p005kotlin.jvm.internal.s.g(this.f98496f, eVar.f98496f) && p005kotlin.jvm.internal.s.g(this.f98497g, eVar.f98497g) && p005kotlin.jvm.internal.s.g(this.f98498h, eVar.f98498h);
    }

    public final int hashCode() {
        int iHashCode = this.f98491a.hashCode() * 31;
        Long l14 = this.f98492b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        List<Long> list = this.f98493c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f98494d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f98495e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d14 = this.f98496f;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str2 = this.f98497g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f98498h;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CreatePetProfileRequest(name=");
        sb3.append(this.f98491a);
        sb3.append(", primaryBreedId=");
        sb3.append(this.f98492b);
        sb3.append(", secondaryBreedIds=");
        o2.c.n(", gender=", this.f98494d, ", isNeutered=", sb3, this.f98493c);
        sb3.append(this.f98495e);
        sb3.append(", weight=");
        sb3.append(this.f98496f);
        sb3.append(", birthdate=");
        return e5.h(sb3, this.f98497g, ", birthdatePrecision=", this.f98498h, ")");
    }

    /* JADX INFO: renamed from: je0.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lje0/e$b;", "", "<init>", "()V", "Li63/c;", "Lje0/e;", "serializer", "()Li63/c;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<e> serializer() {
            return a.f98499a;
        }

        private Companion() {
        }
    }

    public e(String str, Long l14, List<Long> list, String str2, Boolean bool, Double d14, String str3, String str4) {
        str.getClass();
        this.f98491a = str;
        this.f98492b = l14;
        this.f98493c = list;
        this.f98494d = str2;
        this.f98495e = bool;
        this.f98496f = d14;
        this.f98497g = str3;
        this.f98498h = str4;
    }

    public /* synthetic */ e(String str, Long l14, List list, String str2, Boolean bool, Double d14, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : bool, (i14 & 32) != 0 ? null : d14, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? null : str4);
    }
}
