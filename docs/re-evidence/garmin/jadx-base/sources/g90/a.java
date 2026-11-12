package g90;

import i63.h;
import java.util.List;
import l63.d;
import l63.f;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fBY\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lg90/a;", "", "", "title", "grantButton", "revokeButton", "", "Lg90/b;", "bodyBlocks", "Lg90/c;", "terms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f76458f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<b> f76462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<c> f76463e;

    /* JADX INFO: renamed from: g90.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/consent/model/ConsentText.$serializer", "Lm63/e0;", "Lg90/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class C1534a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1534a f76464a;
        private static final k63.e descriptor;

        static {
            C1534a c1534a = new C1534a();
            f76464a = c1534a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.consent.model.ConsentText", c1534a, 5);
            m1Var.j("title", false);
            m1Var.j("grantButton", false);
            m1Var.j("revokeButton", false);
            m1Var.j("bodyBlocks", false);
            m1Var.j("terms", false);
            descriptor = m1Var;
        }

        private C1534a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = a.f76458f;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, y1Var, y1Var, lVarArr[3].getValue(), lVarArr[4].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = a.f76458f;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            String strR2 = null;
            String strR3 = null;
            List list = null;
            List list2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    strR = cVarC.r(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    strR2 = cVarC.r(eVar2, 1);
                    i15 |= 2;
                } else if (iE == 2) {
                    strR3 = cVarC.r(eVar2, 2);
                    i15 |= 4;
                } else if (iE == 3) {
                    list = (List) cVarC.l(eVar2, 3, lVarArr[3].getValue(), list);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    list2 = (List) cVarC.l(eVar2, 4, lVarArr[4].getValue(), list2);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, strR, strR2, strR3, list, list2, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = a.f76458f;
            dVarC.k(eVar, 0, aVar.f76459a);
            dVarC.k(eVar, 1, aVar.f76460b);
            dVarC.k(eVar, 2, aVar.f76461c);
            dVarC.e(eVar, 3, lVarArr[3].getValue(), aVar.f76462d);
            dVarC.e(eVar, 4, lVarArr[4].getValue(), aVar.f76463e);
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f76458f = new l[]{null, null, null, m.a(nVar, new g12.m(10)), m.a(nVar, new g12.m(11))};
    }

    public /* synthetic */ a(int i14, String str, String str2, String str3, List list, List list2, u1 u1Var) {
        if (31 != (i14 & 31)) {
            k1.h(i14, 31, C1534a.f76464a.getF158591b());
            throw null;
        }
        this.f76459a = str;
        this.f76460b = str2;
        this.f76461c = str3;
        this.f76462d = list;
        this.f76463e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f76459a, aVar.f76459a) && s.g(this.f76460b, aVar.f76460b) && s.g(this.f76461c, aVar.f76461c) && s.g(this.f76462d, aVar.f76462d) && s.g(this.f76463e, aVar.f76463e);
    }

    public final int hashCode() {
        return this.f76463e.hashCode() + u0.b(g.j(g.j(this.f76459a.hashCode() * 31, 31, this.f76460b), 31, this.f76461c), 31, this.f76462d);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ConsentText(title=", this.f76459a, ", grantButton=", this.f76460b, ", revokeButton=");
        v.e0.o(this.f76461c, ", bodyBlocks=", ", terms=", sbI, this.f76462d);
        return z.c(sbI, this.f76463e, ")");
    }

    /* JADX INFO: renamed from: g90.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg90/a$b;", "", "<init>", "()V", "Li63/c;", "Lg90/a;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C1534a.f76464a;
        }

        private Companion() {
        }
    }

    public a(String str, String str2, String str3, List<b> list, List<c> list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.f76459a = str;
        this.f76460b = str2;
        this.f76461c = str3;
        this.f76462d = list;
        this.f76463e = list2;
    }
}
