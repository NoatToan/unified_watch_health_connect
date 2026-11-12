package yw1;

import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lyw1/j;", "", "", "userId", "Lyw1/v;", "generic", "cycling", "<init>", "(JLyw1/v;Lyw1/v;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLyw1/v;Lyw1/v;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f199943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f199944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f199945c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/training/model/progressreport/FBTPersonalRecordsVo2MaxDTO.$serializer", "Lm63/e0;", "Lyw1/j;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f199946a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f199946a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.training.model.progressreport.FBTPersonalRecordsVo2MaxDTO", aVar, 3);
            m1Var.j("userId", false);
            m1Var.j("generic", false);
            m1Var.j("cycling", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            v.a aVar = v.a.f199988a;
            return new i63.c[]{v0.f117027a, j63.a.d(aVar), j63.a.d(aVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            long jW = 0;
            v vVar = null;
            v vVar2 = null;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    jW = cVarC.w(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    vVar = (v) cVarC.v(eVar2, 1, v.a.f199988a, vVar);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    vVar2 = (v) cVarC.v(eVar2, 2, v.a.f199988a, vVar2);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new j(i15, jW, vVar, vVar2, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            j jVar = (j) obj;
            jVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.z(eVar, 0, jVar.f199943a);
            v.a aVar = v.a.f199988a;
            dVarC.d(eVar, 1, aVar, jVar.f199944b);
            dVarC.d(eVar, 2, aVar, jVar.f199945c);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ j(int i14, long j8, v vVar, v vVar2, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f199946a.getF158591b());
            throw null;
        }
        this.f199943a = j8;
        this.f199944b = vVar;
        this.f199945c = vVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f199943a == jVar.f199943a && p005kotlin.jvm.internal.s.g(this.f199944b, jVar.f199944b) && p005kotlin.jvm.internal.s.g(this.f199945c, jVar.f199945c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f199943a) * 31;
        v vVar = this.f199944b;
        int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
        v vVar2 = this.f199945c;
        return iHashCode2 + (vVar2 != null ? vVar2.hashCode() : 0);
    }

    public final String toString() {
        return "FBTPersonalRecordsVo2MaxDTO(userId=" + this.f199943a + ", generic=" + this.f199944b + ", cycling=" + this.f199945c + ")";
    }

    /* JADX INFO: renamed from: yw1.j$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw1/j$b;", "", "<init>", "()V", "Li63/c;", "Lyw1/j;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<j> serializer() {
            return a.f199946a;
        }

        private Companion() {
        }
    }

    public j(long j8, v vVar, v vVar2) {
        this.f199943a = j8;
        this.f199944b = vVar;
        this.f199945c = vVar2;
    }
}
