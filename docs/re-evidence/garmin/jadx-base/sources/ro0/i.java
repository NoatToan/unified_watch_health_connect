package ro0;

import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lro0/i;", "", "Lro0/l;", "feature", "", "action", "<init>", "(Lro0/l;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILro0/l;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f153767c = {o13.m.a(o13.n.PUBLICATION, new h(0)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f153768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153769b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/help/HelpActivity.Navigation.Extras.$serializer", "Lm63/e0;", "Lro0/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f153770a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f153770a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.help.HelpActivity.Navigation.Extras", aVar, 2);
            m1Var.j("feature", false);
            m1Var.j("action", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{i.f153767c[0].getValue(), j63.a.d(y1.f117048a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = i.f153767c;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            l lVar = null;
            String str = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    lVar = (l) cVarC.l(eVar2, 0, lVarArr[0].getValue(), lVar);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new i(i15, lVar, str, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            i iVar = (i) obj;
            iVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            i63.c<Object> value = i.f153767c[0].getValue();
            l lVar = iVar.f153768a;
            String str = iVar.f153769b;
            dVarC.e(eVar, 0, value, lVar);
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 1, y1.f117048a, str);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ i(int i14, l lVar, String str, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f153770a.getF158591b());
            throw null;
        }
        this.f153768a = lVar;
        if ((i14 & 2) == 0) {
            this.f153769b = null;
        } else {
            this.f153769b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f153768a == iVar.f153768a && p005kotlin.jvm.internal.s.g(this.f153769b, iVar.f153769b);
    }

    public final int hashCode() {
        int iHashCode = this.f153768a.hashCode() * 31;
        String str = this.f153769b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Extras(feature=" + this.f153768a + ", action=" + this.f153769b + ")";
    }

    /* JADX INFO: renamed from: ro0.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lro0/i$b;", "", "<init>", "()V", "Li63/c;", "Lro0/i;", "serializer", "()Li63/c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f153770a;
        }

        private Companion() {
        }
    }

    public i(l lVar, String str) {
        lVar.getClass();
        this.f153768a = lVar;
        this.f153769b = str;
    }

    public /* synthetic */ i(l lVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(lVar, (i14 & 2) != 0 ? null : str);
    }
}
