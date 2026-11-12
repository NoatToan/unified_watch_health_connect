package ti2;

import com.garmin.android.gncs.NotificationConstants;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lti2/e;", "", "Lti2/a;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "message", "confirmationText", "<init>", "(Lti2/a;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILti2/a;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f164616d = {m.a(n.PUBLICATION, new ta0.g(12)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ti2.a f164617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f164618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f164619c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/auth/cmc/data/model/CommunicationDTO.$serializer", "Lm63/e0;", "Lti2/e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f164620a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f164620a = aVar;
            m1 m1Var = new m1("com.garmin.auth.cmc.data.model.CommunicationDTO", aVar, 3);
            m1Var.j(NotificationConstants.KEY_DATA_MIME_TYPE, false);
            m1Var.j("message", false);
            m1Var.j("confirmationText", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{e.f164616d[0].getValue(), y1Var, j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = e.f164616d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            ti2.a aVar = null;
            String strR = null;
            String str = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    aVar = (ti2.a) cVarC.l(eVar2, 0, lVarArr[0].getValue(), aVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    strR = cVarC.r(eVar2, 1);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    str = (String) cVarC.v(eVar2, 2, y1.f117048a, str);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new e(i15, aVar, strR, str, null);
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
            dVarC.e(eVar2, 0, e.f164616d[0].getValue(), eVar.f164617a);
            dVarC.k(eVar2, 1, eVar.f164618b);
            dVarC.d(eVar2, 2, y1.f117048a, eVar.f164619c);
            dVarC.b(eVar2);
        }
    }

    public /* synthetic */ e(int i14, ti2.a aVar, String str, String str2, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f164620a.getF158591b());
            throw null;
        }
        this.f164617a = aVar;
        this.f164618b = str;
        this.f164619c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f164617a == eVar.f164617a && s.g(this.f164618b, eVar.f164618b) && s.g(this.f164619c, eVar.f164619c);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f164617a.hashCode() * 31, 31, this.f164618b);
        String str = this.f164619c;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CommunicationDTO(type=");
        sb3.append(this.f164617a);
        sb3.append(", message=");
        sb3.append(this.f164618b);
        sb3.append(", confirmationText=");
        return am.j.o(this.f164619c, ")", sb3);
    }

    /* JADX INFO: renamed from: ti2.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lti2/e$b;", "", "<init>", "()V", "Li63/c;", "Lti2/e;", "serializer", "()Li63/c;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<e> serializer() {
            return a.f164620a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public e(ti2.a aVar, String str, String str2) {
        aVar.getClass();
        str.getClass();
        this.f164617a = aVar;
        this.f164618b = str;
        this.f164619c = str2;
    }
}
