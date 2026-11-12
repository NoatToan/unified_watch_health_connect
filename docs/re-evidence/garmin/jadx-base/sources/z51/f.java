package z51;

import b63.u;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import z41.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lz51/f;", "", "Lz51/e;", "status", "Lb63/u;", "startTime", "endTime", "", "typeKey", "sportProfileName", "<init>", "(Lz51/e;Lb63/u;Lb63/u;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILz51/e;Lb63/u;Lb63/u;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f202493f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f202494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f202495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f202496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f202497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f202498e;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/pendingactivity/model/PendingActivityStatusRequestDTO.$serializer", "Lm63/e0;", "Lz51/f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f202499a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f202499a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.pendingactivity.model.PendingActivityStatusRequestDTO", aVar, 5);
            m1Var.j("status", false);
            m1Var.j("startTime", true);
            m1Var.j("endTime", true);
            m1Var.j("activityTypeKey", true);
            m1Var.j("sportProfileName", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = f.f202493f;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{lVarArr[0].getValue(), j63.a.d(lVarArr[1].getValue()), j63.a.d(lVarArr[2].getValue()), j63.a.d(y1Var), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = f.f202493f;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            e eVar3 = null;
            u uVar = null;
            u uVar2 = null;
            String str = null;
            String str2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    eVar3 = (e) cVarC.l(eVar2, 0, lVarArr[0].getValue(), eVar3);
                    i15 |= 1;
                } else if (iE == 1) {
                    uVar = (u) cVarC.v(eVar2, 1, lVarArr[1].getValue(), uVar);
                    i15 |= 2;
                } else if (iE == 2) {
                    uVar2 = (u) cVarC.v(eVar2, 2, lVarArr[2].getValue(), uVar2);
                    i15 |= 4;
                } else if (iE == 3) {
                    str = (String) cVarC.v(eVar2, 3, y1.f117048a, str);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    str2 = (String) cVarC.v(eVar2, 4, y1.f117048a, str2);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new f(i15, eVar3, uVar, uVar2, str, str2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            f fVar2 = (f) obj;
            fVar2.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = f.f202493f;
            i63.c<Object> value = lVarArr[0].getValue();
            e eVar2 = fVar2.f202494a;
            String str = fVar2.f202498e;
            String str2 = fVar2.f202497d;
            u uVar = fVar2.f202496c;
            u uVar2 = fVar2.f202495b;
            dVarC.e(eVar, 0, value, eVar2);
            if (dVarC.C(eVar) || uVar2 != null) {
                dVarC.d(eVar, 1, lVarArr[1].getValue(), uVar2);
            }
            if (dVarC.C(eVar) || uVar != null) {
                dVarC.d(eVar, 2, lVarArr[2].getValue(), uVar);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 3, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 4, y1.f117048a, str);
            }
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f202493f = new l[]{m.a(nVar, new j(6)), m.a(nVar, new j(7)), m.a(nVar, new j(8)), null, null};
    }

    public /* synthetic */ f(int i14, e eVar, u uVar, u uVar2, String str, String str2, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f202499a.getF158591b());
            throw null;
        }
        this.f202494a = eVar;
        if ((i14 & 2) == 0) {
            this.f202495b = null;
        } else {
            this.f202495b = uVar;
        }
        if ((i14 & 4) == 0) {
            this.f202496c = null;
        } else {
            this.f202496c = uVar2;
        }
        if ((i14 & 8) == 0) {
            this.f202497d = null;
        } else {
            this.f202497d = str;
        }
        if ((i14 & 16) == 0) {
            this.f202498e = null;
        } else {
            this.f202498e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f202494a == fVar.f202494a && s.g(this.f202495b, fVar.f202495b) && s.g(this.f202496c, fVar.f202496c) && s.g(this.f202497d, fVar.f202497d) && s.g(this.f202498e, fVar.f202498e);
    }

    public final int hashCode() {
        int iHashCode = this.f202494a.hashCode() * 31;
        u uVar = this.f202495b;
        int iHashCode2 = (iHashCode + (uVar == null ? 0 : uVar.f16216a.hashCode())) * 31;
        u uVar2 = this.f202496c;
        int iHashCode3 = (iHashCode2 + (uVar2 == null ? 0 : uVar2.f16216a.hashCode())) * 31;
        String str = this.f202497d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f202498e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PendingActivityStatusRequestDTO(status=");
        sb3.append(this.f202494a);
        sb3.append(", startTime=");
        sb3.append(this.f202495b);
        sb3.append(", endTime=");
        sb3.append(this.f202496c);
        sb3.append(", typeKey=");
        sb3.append(this.f202497d);
        sb3.append(", sportProfileName=");
        return am.j.o(this.f202498e, ")", sb3);
    }

    /* JADX INFO: renamed from: z51.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz51/f$b;", "", "<init>", "()V", "Li63/c;", "Lz51/f;", "serializer", "()Li63/c;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f202499a;
        }

        private Companion() {
        }
    }

    public f(e eVar, u uVar, u uVar2, String str, String str2) {
        eVar.getClass();
        this.f202494a = eVar;
        this.f202495b = uVar;
        this.f202496c = uVar2;
        this.f202497d = str;
        this.f202498e = str2;
    }

    public /* synthetic */ f(e eVar, u uVar, u uVar2, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(eVar, (i14 & 2) != 0 ? null : uVar, (i14 & 4) != 0 ? null : uVar2, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2);
    }
}
