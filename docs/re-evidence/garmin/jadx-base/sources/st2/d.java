package st2;

import i63.h;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lst2/d;", "", "", "host", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@h
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160923b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/livetrack/settings/dto/PersonalUrl.$serializer", "Lm63/e0;", "Lst2/d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f160924a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f160924a = aVar;
            m1 m1Var = new m1("com.garmin.livetrack.settings.dto.PersonalUrl", aVar, 2);
            m1Var.j("origin", false);
            m1Var.j("path", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, y1Var};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            String strR2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    strR = cVarC.r(eVar2, 0);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    strR2 = cVarC.r(eVar2, 1);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new d(i15, strR, strR2, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            d dVar = (d) obj;
            dVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.k(eVar, 0, dVar.f160922a);
            dVarC.k(eVar, 1, dVar.f160923b);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ d(int i14, String str, String str2, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f160924a.getF158591b());
            throw null;
        }
        this.f160922a = str;
        this.f160923b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f160922a, dVar.f160922a) && s.g(this.f160923b, dVar.f160923b);
    }

    public final int hashCode() {
        return this.f160923b.hashCode() + (this.f160922a.hashCode() * 31);
    }

    public final String toString() {
        return v.e0.g("PersonalUrl(host=", this.f160922a, ", path=", this.f160923b, ")");
    }

    /* JADX INFO: renamed from: st2.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lst2/d$b;", "", "<init>", "()V", "Li63/c;", "Lst2/d;", "serializer", "()Li63/c;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<d> serializer() {
            return a.f160924a;
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public d(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f160922a = str;
        this.f160923b = str2;
    }
}
