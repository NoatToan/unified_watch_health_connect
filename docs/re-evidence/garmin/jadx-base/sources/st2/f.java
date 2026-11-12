package st2;

import c22.t;
import i63.h;
import java.util.List;
import m63.e0;
import m63.m1;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import sk0.i0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lst2/f;", "", "", "Ltt2/a;", "activeSessionPrivacyLevels", "profilePrivacyLevels", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@h
public final /* data */ class f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f160929c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<tt2.a> f160930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<tt2.a> f160931b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/livetrack/settings/dto/ProfileSettings.$serializer", "Lm63/e0;", "Lst2/f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f160932a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f160932a = aVar;
            m1 m1Var = new m1("com.garmin.livetrack.settings.dto.ProfileSettings", aVar, 2);
            m1Var.j("activeSessionPrivacyLevels", true);
            m1Var.j("profilePrivacyLevels", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = f.f160929c;
            return new i63.c[]{j63.a.d(lVarArr[0].getValue()), j63.a.d(lVarArr[1].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = f.f160929c;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            List list = null;
            List list2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    list = (List) cVarC.v(eVar2, 0, lVarArr[0].getValue(), list);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    list2 = (List) cVarC.v(eVar2, 1, lVarArr[1].getValue(), list2);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new f(i15, list, list2, u1Var);
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
            List<tt2.a> list = fVar2.f160931b;
            List<tt2.a> list2 = fVar2.f160930a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = f.f160929c;
            if (dVarC.C(eVar) || list2 != null) {
                dVarC.d(eVar, 0, lVarArr[0].getValue(), list2);
            }
            if (dVarC.C(eVar) || list != null) {
                dVarC.d(eVar, 1, lVarArr[1].getValue(), list);
            }
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f160929c = new l[]{m.a(nVar, new i0(17)), m.a(nVar, new i0(18))};
    }

    public /* synthetic */ f(int i14, List list, List list2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f160930a = null;
        } else {
            this.f160930a = list;
        }
        if ((i14 & 2) == 0) {
            this.f160931b = null;
        } else {
            this.f160931b = list2;
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
        return s.g(this.f160930a, fVar.f160930a) && s.g(this.f160931b, fVar.f160931b);
    }

    public final int hashCode() {
        List<tt2.a> list = this.f160930a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<tt2.a> list2 = this.f160931b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return t.f("ProfileSettings(activeSessionPrivacyLevels=", ", profilePrivacyLevels=", ")", this.f160930a, this.f160931b);
    }

    /* JADX INFO: renamed from: st2.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lst2/f$b;", "", "<init>", "()V", "Li63/c;", "Lst2/f;", "serializer", "()Li63/c;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<f> serializer() {
            return a.f160932a;
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (j) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends tt2.a> list, List<? extends tt2.a> list2) {
        this.f160930a = list;
        this.f160931b = list2;
    }

    public /* synthetic */ f(List list, List list2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2);
    }
}
