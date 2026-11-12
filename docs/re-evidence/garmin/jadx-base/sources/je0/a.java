package je0;

import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lje0/a;", "", "", "animalProfileId", "", "numberOfActivities", "", "recentActivityStartTimeGmt", "Lje0/r;", "duration", "distance", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lje0/r;Lje0/r;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lje0/r;Lje0/r;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f98470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f98471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f98473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f98474e;

    /* JADX INFO: renamed from: je0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/domaindogs/data/model/AnimalProfileGroupDTO.$serializer", "Lm63/e0;", "Lje0/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class C1888a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1888a f98475a;
        private static final k63.e descriptor;

        static {
            C1888a c1888a = new C1888a();
            f98475a = c1888a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.domaindogs.data.model.AnimalProfileGroupDTO", c1888a, 5);
            m1Var.j("animalProfileId", true);
            m1Var.j("numberOfActivities", true);
            m1Var.j("recentActivityStartTimeGmt", true);
            m1Var.j("duration", true);
            m1Var.j("distance", true);
            descriptor = m1Var;
        }

        private C1888a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?> cVarD = j63.a.d(v0.f117027a);
            i63.c<?> cVarD2 = j63.a.d(m0.f116981a);
            i63.c<?> cVarD3 = j63.a.d(y1.f117048a);
            r.a aVar = r.a.f98571a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, j63.a.d(aVar), j63.a.d(aVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Long l14 = null;
            Integer num = null;
            String str = null;
            r rVar = null;
            r rVar2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    l14 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l14);
                    i15 |= 1;
                } else if (iE == 1) {
                    num = (Integer) cVarC.v(eVar2, 1, m0.f116981a, num);
                    i15 |= 2;
                } else if (iE == 2) {
                    str = (String) cVarC.v(eVar2, 2, y1.f117048a, str);
                    i15 |= 4;
                } else if (iE == 3) {
                    rVar = (r) cVarC.v(eVar2, 3, r.a.f98571a, rVar);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    rVar2 = (r) cVarC.v(eVar2, 4, r.a.f98571a, rVar2);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, l14, num, str, rVar, rVar2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            r rVar = aVar.f98474e;
            r rVar2 = aVar.f98473d;
            String str = aVar.f98472c;
            Integer num = aVar.f98471b;
            Long l14 = aVar.f98470a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 0, v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 1, m0.f116981a, num);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 2, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || rVar2 != null) {
                dVarC.d(eVar, 3, r.a.f98571a, rVar2);
            }
            if (dVarC.C(eVar) || rVar != null) {
                dVarC.d(eVar, 4, r.a.f98571a, rVar);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ a(int i14, Long l14, Integer num, String str, r rVar, r rVar2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f98470a = null;
        } else {
            this.f98470a = l14;
        }
        if ((i14 & 2) == 0) {
            this.f98471b = null;
        } else {
            this.f98471b = num;
        }
        if ((i14 & 4) == 0) {
            this.f98472c = null;
        } else {
            this.f98472c = str;
        }
        if ((i14 & 8) == 0) {
            this.f98473d = null;
        } else {
            this.f98473d = rVar;
        }
        if ((i14 & 16) == 0) {
            this.f98474e = null;
        } else {
            this.f98474e = rVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f98470a, aVar.f98470a) && p005kotlin.jvm.internal.s.g(this.f98471b, aVar.f98471b) && p005kotlin.jvm.internal.s.g(this.f98472c, aVar.f98472c) && p005kotlin.jvm.internal.s.g(this.f98473d, aVar.f98473d) && p005kotlin.jvm.internal.s.g(this.f98474e, aVar.f98474e);
    }

    public final int hashCode() {
        Long l14 = this.f98470a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Integer num = this.f98471b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f98472c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        r rVar = this.f98473d;
        int iHashCode4 = (iHashCode3 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        r rVar2 = this.f98474e;
        return iHashCode4 + (rVar2 != null ? rVar2.hashCode() : 0);
    }

    public final String toString() {
        return "AnimalProfileGroupDTO(animalProfileId=" + this.f98470a + ", numberOfActivities=" + this.f98471b + ", recentActivityStartTimeGmt=" + this.f98472c + ", duration=" + this.f98473d + ", distance=" + this.f98474e + ")";
    }

    /* JADX INFO: renamed from: je0.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lje0/a$b;", "", "<init>", "()V", "Li63/c;", "Lje0/a;", "serializer", "()Li63/c;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C1888a.f98475a;
        }

        private Companion() {
        }
    }

    public a() {
        this((Long) null, (Integer) null, (String) null, (r) null, (r) null, 31, (p005kotlin.jvm.internal.j) null);
    }

    public a(Long l14, Integer num, String str, r rVar, r rVar2) {
        this.f98470a = l14;
        this.f98471b = num;
        this.f98472c = str;
        this.f98473d = rVar;
        this.f98474e = rVar2;
    }

    public /* synthetic */ a(Long l14, Integer num, String str, r rVar, r rVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : rVar, (i14 & 16) != 0 ? null : rVar2);
    }
}
