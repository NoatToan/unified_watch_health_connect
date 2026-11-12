package i31;

import i3.bf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m63.m1;
import m63.u1;
import m63.y1;
import o53.s0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Li31/s;", "", "<init>", "()V", "a", "c", "b", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f90747b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n63.o f90748a = n63.p.a(new bf(10));

    static {
        new b(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(long j8, String str, v13.c cVar) throws Throwable {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f90764d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f90764d = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objE0 = uVar.f90762b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f90764d;
        if (i15 == 0) {
            o13.r.b(objE0);
            if (str != null && str.length() != 0) {
                uVar.f90761a = j8;
                uVar.f90764d = 1;
                x53.c cVar2 = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new t(this, str, null), uVar);
                if (objE0 == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = uVar.f90761a;
        o13.r.b(objE0);
        c cVar3 = (c) objE0;
        if (cVar3 != null) {
            rd2.f.a().f152045a.getClass();
            sd2.f fVarI = rd2.j.i(j8, null);
            if (p005kotlin.jvm.internal.s.g(cVar3.f90753a, Boolean.TRUE)) {
                return k31.b.SCALE;
            }
            String str2 = cVar3.f90754b;
            if (str2 != null && d53.w.z(str2, "Index", false)) {
                return k31.b.BLOOD_PRESSURE_MONITOR;
            }
            List<String> list = cVar3.f90755c;
            if (list != null) {
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(g22.n.g((String) it.next()));
                }
                if (arrayList.contains("DEDICATED_BIKE_COMPUTER")) {
                    return k31.b.DEDICATED_BIKE_COMPUTER;
                }
            }
            if (fVarI != null && fVarI.N2()) {
                return k31.b.INREACH_DIRECT_ACTIVATION_CAPABLE;
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0083\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Li31/s$a;", "", "", "Li31/s$c;", "devices", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f90749b = {o13.m.a(o13.n.PUBLICATION, new e(1))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<c> f90750a;

        public a(int i14, List list, u1 u1Var) {
            if ((i14 & 1) == 0) {
                this.f90750a = j0.f134944a;
            } else {
                this.f90750a = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f90750a, ((a) obj).f90750a);
        }

        public final int hashCode() {
            List<c> list = this.f90750a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return tn.k.h("AllOnboardingDevicesDTO(devices=", ")", this.f90750a);
        }

        /* JADX INFO: renamed from: i31.s$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li31/s$a$b;", "", "<init>", "()V", "Li63/c;", "Li31/s$a;", "serializer", "()Li63/c;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<a> serializer() {
                return C1742a.f90751a;
            }

            private Companion() {
            }
        }

        public a() {
            this((List) null, 1, (p005kotlin.jvm.internal.j) null);
        }

        public a(List<c> list) {
            this.f90750a = list;
        }

        public a(List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? j0.f134944a : list);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0083\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Li31/s$c;", "", "", "weightScale", "", "deviceTags", "", "deviceCategories", "partNumber", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f90752e = {null, null, o13.m.a(o13.n.PUBLICATION, new e(2)), null};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f90753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<String> f90755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f90756d;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/onboarding/domain/GetOnboardingDeviceFilterTypeUseCase.OnboardingDeviceDTO.$serializer", "Lm63/e0;", "Li31/s$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements m63.e0<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f90757a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f90757a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.onboarding.domain.GetOnboardingDeviceFilterTypeUseCase.OnboardingDeviceDTO", aVar, 4);
                m1Var.j("weightScale", true);
                m1Var.j("deviceTags", true);
                m1Var.j("deviceCategories", true);
                m1Var.j("partNumber", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                o13.l<i63.c<Object>>[] lVarArr = c.f90752e;
                i63.c<?> cVarD = j63.a.d(m63.g.f116948a);
                y1 y1Var = y1.f117048a;
                return new i63.c[]{cVarD, j63.a.d(y1Var), j63.a.d(lVarArr[2].getValue()), j63.a.d(y1Var)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = c.f90752e;
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                Boolean bool = null;
                String str = null;
                List list = null;
                String str2 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        bool = (Boolean) cVarC.v(eVar2, 0, m63.g.f116948a, bool);
                        i15 |= 1;
                    } else if (iE == 1) {
                        str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                        i15 |= 2;
                    } else if (iE == 2) {
                        list = (List) cVarC.v(eVar2, 2, lVarArr[2].getValue(), list);
                        i15 |= 4;
                    } else {
                        if (iE != 3) {
                            hb.a.o(iE);
                            return null;
                        }
                        str2 = (String) cVarC.v(eVar2, 3, y1.f117048a, str2);
                        i15 |= 8;
                    }
                }
                cVarC.b(eVar2);
                return new c(i15, bool, str, list, str2, (u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF94809a() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                String str = cVar.f90756d;
                List<String> list = cVar.f90755c;
                String str2 = cVar.f90754b;
                Boolean bool = cVar.f90753a;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                o13.l<i63.c<Object>>[] lVarArr = c.f90752e;
                if (dVarC.C(eVar) || bool != null) {
                    dVarC.d(eVar, 0, m63.g.f116948a, bool);
                }
                if (dVarC.C(eVar) || str2 != null) {
                    dVarC.d(eVar, 1, y1.f117048a, str2);
                }
                if (dVarC.C(eVar) || !p005kotlin.jvm.internal.s.g(list, j0.f134944a)) {
                    dVarC.d(eVar, 2, lVarArr[2].getValue(), list);
                }
                if (dVarC.C(eVar) || str != null) {
                    dVarC.d(eVar, 3, y1.f117048a, str);
                }
                dVarC.b(eVar);
            }
        }

        public c(int i14, Boolean bool, String str, List list, String str2, u1 u1Var) {
            if ((i14 & 1) == 0) {
                this.f90753a = null;
            } else {
                this.f90753a = bool;
            }
            if ((i14 & 2) == 0) {
                this.f90754b = null;
            } else {
                this.f90754b = str;
            }
            if ((i14 & 4) == 0) {
                this.f90755c = j0.f134944a;
            } else {
                this.f90755c = list;
            }
            if ((i14 & 8) == 0) {
                this.f90756d = null;
            } else {
                this.f90756d = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f90753a, cVar.f90753a) && p005kotlin.jvm.internal.s.g(this.f90754b, cVar.f90754b) && p005kotlin.jvm.internal.s.g(this.f90755c, cVar.f90755c) && p005kotlin.jvm.internal.s.g(this.f90756d, cVar.f90756d);
        }

        public final int hashCode() {
            Boolean bool = this.f90753a;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.f90754b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.f90755c;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.f90756d;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return "OnboardingDeviceDTO(weightScale=" + this.f90753a + ", deviceTags=" + this.f90754b + ", deviceCategories=" + this.f90755c + ", partNumber=" + this.f90756d + ")";
        }

        /* JADX INFO: renamed from: i31.s$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li31/s$c$b;", "", "<init>", "()V", "Li63/c;", "Li31/s$c;", "serializer", "()Li63/c;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<c> serializer() {
                return a.f90757a;
            }

            private Companion() {
            }
        }

        public c() {
            this((Boolean) null, (String) null, (List) null, (String) null, 15, (p005kotlin.jvm.internal.j) null);
        }

        public c(Boolean bool, String str, List<String> list, String str2) {
            this.f90753a = bool;
            this.f90754b = str;
            this.f90755c = list;
            this.f90756d = str2;
        }

        public c(Boolean bool, String str, List list, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? j0.f134944a : list, (i14 & 8) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Li31/s$b;", "", "<init>", "()V", "", "INDEX_TAG", "Ljava/lang/String;", "DEDICATED_BIKE_COMPUTER", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
