package je0;

import j20.x;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lje0/b;", "", "", "excludePhysio", "", "animalProfileId", "userId", "", "animalType", "<init>", "(ZJJLjava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZJJLjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f98476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f98477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f98478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f98479d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/domaindogs/data/model/AnimalProfileRequest.$serializer", "Lm63/e0;", "Lje0/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f98480a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f98480a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.domaindogs.data.model.AnimalProfileRequest", aVar, 4);
            m1Var.j("excludePhysio", false);
            m1Var.j("animalProfileId", false);
            m1Var.j("userId", false);
            m1Var.j("animalType", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            v0 v0Var = v0.f117027a;
            return new i63.c[]{m63.g.f116948a, v0Var, v0Var, y1.f117048a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            boolean zG = false;
            long jW = 0;
            long jW2 = 0;
            String strR = null;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    zG = cVarC.g(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    jW = cVarC.w(eVar2, 1);
                    i15 |= 2;
                } else if (iE == 2) {
                    jW2 = cVarC.w(eVar2, 2);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    strR = cVarC.r(eVar2, 3);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, zG, jW, jW2, strR, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.n(eVar, 0, bVar.f98476a);
            dVarC.z(eVar, 1, bVar.f98477b);
            dVarC.z(eVar, 2, bVar.f98478c);
            dVarC.k(eVar, 3, bVar.f98479d);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, boolean z14, long j8, long j14, String str, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f98480a.getF94809a());
            throw null;
        }
        this.f98476a = z14;
        this.f98477b = j8;
        this.f98478c = j14;
        this.f98479d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f98476a == bVar.f98476a && this.f98477b == bVar.f98477b && this.f98478c == bVar.f98478c && p005kotlin.jvm.internal.s.g(this.f98479d, bVar.f98479d);
    }

    public final int hashCode() {
        return this.f98479d.hashCode() + q6.f.e(q6.f.e(Boolean.hashCode(this.f98476a) * 31, 31, this.f98477b), 31, this.f98478c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AnimalProfileRequest(excludePhysio=");
        sb3.append(this.f98476a);
        sb3.append(", animalProfileId=");
        sb3.append(this.f98477b);
        x.j(this.f98478c, ", userId=", ", animalType=", sb3);
        return am.j.o(this.f98479d, ")", sb3);
    }

    /* JADX INFO: renamed from: je0.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lje0/b$b;", "", "<init>", "()V", "Li63/c;", "Lje0/b;", "serializer", "()Li63/c;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f98480a;
        }

        private Companion() {
        }
    }

    public b(boolean z14, long j8, long j14, String str) {
        str.getClass();
        this.f98476a = z14;
        this.f98477b = j8;
        this.f98478c = j14;
        this.f98479d = str;
    }
}
