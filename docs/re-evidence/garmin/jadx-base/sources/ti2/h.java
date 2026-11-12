package ti2;

import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lti2/h;", "", "Lti2/i;", "reason", "<init>", "(Lti2/i;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILti2/i;Lm63/u1;)V", "Companion", "a", "b", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h
public final /* data */ class h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f164625b = {m.a(n.PUBLICATION, new ta0.g(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f164626a;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/auth/cmc/data/model/SignOutMessageDataDTO.$serializer", "Lm63/e0;", "Lti2/h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f164627a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f164627a = aVar;
            m1 m1Var = new m1("com.garmin.auth.cmc.data.model.SignOutMessageDataDTO", aVar, 1);
            m1Var.j("reason", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{h.f164625b[0].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = h.f164625b;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            i iVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else {
                    if (iE != 0) {
                        hb.a.o(iE);
                        return null;
                    }
                    iVar = (i) cVarC.l(eVar2, 0, lVarArr[0].getValue(), iVar);
                    i15 = 1;
                }
            }
            cVarC.b(eVar2);
            return new h(i15, iVar, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            h hVar = (h) obj;
            hVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.e(eVar, 0, h.f164625b[0].getValue(), hVar.f164626a);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ h(int i14, i iVar, u1 u1Var) {
        if (1 == (i14 & 1)) {
            this.f164626a = iVar;
        } else {
            k1.h(i14, 1, a.f164627a.getF158591b());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f164626a == ((h) obj).f164626a;
    }

    public final int hashCode() {
        return this.f164626a.hashCode();
    }

    public final String toString() {
        return "SignOutMessageDataDTO(reason=" + this.f164626a + ")";
    }

    /* JADX INFO: renamed from: ti2.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lti2/h$b;", "", "<init>", "()V", "Li63/c;", "Lti2/h;", "serializer", "()Li63/c;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<h> serializer() {
            return a.f164627a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public h(i iVar) {
        iVar.getClass();
        this.f164626a = iVar;
    }
}
