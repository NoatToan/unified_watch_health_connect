package pv0;

import i3.e5;
import java.util.List;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fBq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014¨\u0006\u0018"}, d2 = {"Lpv0/h;", "", "", "behaviourId", "", "measurementType", "calendarDate", "category", "", "Lpv0/o;", "details", "logStatus", "name", "updateTimestamp", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f141372i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f141373j = {null, null, null, null, o13.m.a(o13.n.PUBLICATION, new pk0.m(8)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f141374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f141377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<o> f141378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f141379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f141380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f141381h;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/logging/data/model/BehaviourLogDTO.$serializer", "Lm63/e0;", "Lpv0/h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f141382a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f141382a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.logging.data.model.BehaviourLogDTO", aVar, 8);
            m1Var.j("behaviourId", true);
            m1Var.j("measurementType", true);
            m1Var.j("calendarDate", true);
            m1Var.j("category", true);
            m1Var.j("details", true);
            m1Var.j("logStatus", true);
            m1Var.j("name", true);
            m1Var.j("updateTimestamp", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = h.f141373j;
            i63.c<?> cVarD = j63.a.d(v0.f117027a);
            y1 y1Var = y1.f117048a;
            return new i63.c[]{cVarD, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(lVarArr[4].getValue()), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = h.f141373j;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            String str = null;
            Long l14 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            List list = null;
            String str5 = null;
            String str6 = null;
            int i15 = 0;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        l14 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l14);
                        i15 |= 1;
                        break;
                    case 1:
                        str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                        i15 |= 2;
                        break;
                    case 2:
                        str3 = (String) cVarC.v(eVar2, 2, y1.f117048a, str3);
                        i15 |= 4;
                        break;
                    case 3:
                        str4 = (String) cVarC.v(eVar2, 3, y1.f117048a, str4);
                        i15 |= 8;
                        break;
                    case 4:
                        list = (List) cVarC.v(eVar2, 4, lVarArr[4].getValue(), list);
                        i15 |= 16;
                        break;
                    case 5:
                        str5 = (String) cVarC.v(eVar2, 5, y1.f117048a, str5);
                        i15 |= 32;
                        break;
                    case 6:
                        str6 = (String) cVarC.v(eVar2, 6, y1.f117048a, str6);
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
            return new h(i15, l14, str2, str3, str4, list, str5, str6, str, (u1) null);
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
            String str = hVar.f141381h;
            String str2 = hVar.f141380g;
            String str3 = hVar.f141379f;
            List<o> list = hVar.f141378e;
            String str4 = hVar.f141377d;
            String str5 = hVar.f141376c;
            String str6 = hVar.f141375b;
            Long l14 = hVar.f141374a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = h.f141373j;
            if (dVarC.C(eVar) || l14 == null || l14.longValue() != -1) {
                dVarC.d(eVar, 0, v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || str6 != null) {
                dVarC.d(eVar, 1, y1.f117048a, str6);
            }
            if (dVarC.C(eVar) || str5 != null) {
                dVarC.d(eVar, 2, y1.f117048a, str5);
            }
            if (dVarC.C(eVar) || str4 != null) {
                dVarC.d(eVar, 3, y1.f117048a, str4);
            }
            if (dVarC.C(eVar) || list != null) {
                dVarC.d(eVar, 4, lVarArr[4].getValue(), list);
            }
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 5, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 6, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 7, y1.f117048a, str);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ h(int i14, Long l14, String str, String str2, String str3, List list, String str4, String str5, String str6, u1 u1Var) {
        this.f141374a = (i14 & 1) == 0 ? -1L : l14;
        if ((i14 & 2) == 0) {
            this.f141375b = null;
        } else {
            this.f141375b = str;
        }
        if ((i14 & 4) == 0) {
            this.f141376c = null;
        } else {
            this.f141376c = str2;
        }
        if ((i14 & 8) == 0) {
            this.f141377d = null;
        } else {
            this.f141377d = str3;
        }
        if ((i14 & 16) == 0) {
            this.f141378e = null;
        } else {
            this.f141378e = list;
        }
        if ((i14 & 32) == 0) {
            this.f141379f = null;
        } else {
            this.f141379f = str4;
        }
        if ((i14 & 64) == 0) {
            this.f141380g = null;
        } else {
            this.f141380g = str5;
        }
        if ((i14 & 128) == 0) {
            this.f141381h = null;
        } else {
            this.f141381h = str6;
        }
    }

    public static h a(h hVar, List list, String str, String str2, int i14) {
        Long l14 = hVar.f141374a;
        String str3 = hVar.f141375b;
        String str4 = hVar.f141376c;
        String str5 = hVar.f141377d;
        if ((i14 & 16) != 0) {
            list = hVar.f141378e;
        }
        List list2 = list;
        if ((i14 & 32) != 0) {
            str = hVar.f141379f;
        }
        String str6 = str;
        String str7 = hVar.f141380g;
        if ((i14 & 128) != 0) {
            str2 = hVar.f141381h;
        }
        hVar.getClass();
        return new h(l14, str3, str4, str5, list2, str6, str7, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.f141374a, hVar.f141374a) && p005kotlin.jvm.internal.s.g(this.f141375b, hVar.f141375b) && p005kotlin.jvm.internal.s.g(this.f141376c, hVar.f141376c) && p005kotlin.jvm.internal.s.g(this.f141377d, hVar.f141377d) && p005kotlin.jvm.internal.s.g(this.f141378e, hVar.f141378e) && p005kotlin.jvm.internal.s.g(this.f141379f, hVar.f141379f) && p005kotlin.jvm.internal.s.g(this.f141380g, hVar.f141380g) && p005kotlin.jvm.internal.s.g(this.f141381h, hVar.f141381h);
    }

    public final int hashCode() {
        Long l14 = this.f141374a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f141375b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f141376c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f141377d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<o> list = this.f141378e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f141379f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f141380g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f141381h;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = b71.i.j("BehaviourLogDTO(behaviourId=", ", measurementType=", this.f141375b, this.f141374a, ", calendarDate=");
        sn.a.t(sbJ, this.f141376c, ", category=", this.f141377d, ", details=");
        o2.c.n(", logStatus=", this.f141379f, ", name=", sbJ, this.f141378e);
        return e5.h(sbJ, this.f141380g, ", updateTimestamp=", this.f141381h, ")");
    }

    /* JADX INFO: renamed from: pv0.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpv0/h$b;", "", "<init>", "()V", "Li63/c;", "Lpv0/h;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<h> serializer() {
            return a.f141382a;
        }

        private Companion() {
        }
    }

    public h() {
        this((Long) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null);
    }

    public h(Long l14, String str, String str2, String str3, List<o> list, String str4, String str5, String str6) {
        this.f141374a = l14;
        this.f141375b = str;
        this.f141376c = str2;
        this.f141377d = str3;
        this.f141378e = list;
        this.f141379f = str4;
        this.f141380g = str5;
        this.f141381h = str6;
    }

    public /* synthetic */ h(Long l14, String str, String str2, String str3, List list, String str4, String str5, String str6, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? -1L : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : list, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : str6);
    }
}
