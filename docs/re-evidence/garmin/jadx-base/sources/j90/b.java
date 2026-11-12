package j90;

import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lj90/b;", "", "Lj90/a;", "activityOption", "", "isRequired", "isSelected", "<init>", "(Lj90/a;ZZ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILj90/a;ZZLm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f97787d = {o13.m.a(o13.n.PUBLICATION, new j21.f(14)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j90.a f97788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97790c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/customization/model/ActivityOptionsItem.$serializer", "Lm63/e0;", "Lj90/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f97791a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f97791a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.customization.model.ActivityOptionsItem", aVar, 3);
            m1Var.j("activityOption", false);
            m1Var.j("isRequired", false);
            m1Var.j("isSelected", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{b.f97787d[0].getValue(), gVar, gVar};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = b.f97787d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            boolean zG2 = false;
            j90.a aVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    aVar = (j90.a) cVarC.l(eVar2, 0, lVarArr[0].getValue(), aVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    zG = cVarC.g(eVar2, 1);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    zG2 = cVarC.g(eVar2, 2);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, aVar, zG, zG2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            i63.c<Object> value = b.f97787d[0].getValue();
            j90.a aVar = bVar.f97788a;
            boolean z14 = bVar.f97790c;
            dVarC.e(eVar, 0, value, aVar);
            dVarC.n(eVar, 1, bVar.f97789b);
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 2, z14);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, j90.a aVar, boolean z14, boolean z15, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f97791a.getF158591b());
            throw null;
        }
        this.f97788a = aVar;
        this.f97789b = z14;
        if ((i14 & 4) == 0) {
            this.f97790c = false;
        } else {
            this.f97790c = z15;
        }
    }

    public static b a(b bVar, boolean z14) {
        j90.a aVar = bVar.f97788a;
        boolean z15 = bVar.f97789b;
        bVar.getClass();
        aVar.getClass();
        return new b(aVar, z15, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f97788a == bVar.f97788a && this.f97789b == bVar.f97789b && this.f97790c == bVar.f97790c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97790c) + q6.f.g(this.f97788a.hashCode() * 31, 31, this.f97789b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityOptionsItem(activityOption=");
        sb3.append(this.f97788a);
        sb3.append(", isRequired=");
        sb3.append(this.f97789b);
        sb3.append(", isSelected=");
        return hb.a.k(sb3, this.f97790c, ")");
    }

    /* JADX INFO: renamed from: j90.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj90/b$b;", "", "<init>", "()V", "Li63/c;", "Lj90/b;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f97791a;
        }

        private Companion() {
        }
    }

    public b(j90.a aVar, boolean z14, boolean z15) {
        aVar.getClass();
        this.f97788a = aVar;
        this.f97789b = z14;
        this.f97790c = z15;
    }

    public /* synthetic */ b(j90.a aVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, z14, (i14 & 4) != 0 ? false : z15);
    }
}
