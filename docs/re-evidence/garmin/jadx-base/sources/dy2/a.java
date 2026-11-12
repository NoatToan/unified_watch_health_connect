package dy2;

import dh0.j;
import i63.c;
import i63.h;
import java.util.List;
import l63.d;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Ldy2/a;", "", "", "Lyx2/c;", "activeSubscriptions", "Lyx2/j;", "purchasableSubscriptions", "<init>", "(Ljava/util/List;Lyx2/j;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Lyx2/j;Lm63/u1;)V", "Companion", "a", "b", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l<c<Object>>[] f61646c = {m.a(n.PUBLICATION, new j(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<yx2.c> f61647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yx2.j f61648b;

    /* JADX INFO: renamed from: dy2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/subscriptions/repository/CustomerSubscriptionCacheEntry.$serializer", "Lm63/e0;", "Ldy2/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @e
    public /* synthetic */ class C1306a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1306a f61649a;
        private static final k63.e descriptor;

        static {
            C1306a c1306a = new C1306a();
            f61649a = c1306a;
            m1 m1Var = new m1("com.garmin.subscriptions.repository.CustomerSubscriptionCacheEntry", c1306a, 2);
            m1Var.j("activeSubscriptions", false);
            m1Var.j("purchasableSubscriptions", false);
            descriptor = m1Var;
        }

        private C1306a() {
        }

        @Override // m63.e0
        public final c<?>[] childSerializers() {
            return new c[]{j63.a.d(a.f61646c[0].getValue()), j63.a.d(yx2.j.a.f200109a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<c<Object>>[] lVarArr = a.f61646c;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            List list = null;
            yx2.j jVar = null;
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
                    jVar = (yx2.j) cVarC.v(eVar2, 1, yx2.j.a.f200109a, jVar);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, list, jVar, u1Var);
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
            dVarC.d(eVar, 0, a.f61646c[0].getValue(), aVar.f61647a);
            dVarC.d(eVar, 1, yx2.j.a.f200109a, aVar.f61648b);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ a(int i14, List list, yx2.j jVar, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, C1306a.f61649a.getF158591b());
            throw null;
        }
        this.f61647a = list;
        this.f61648b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f61647a, aVar.f61647a) && s.g(this.f61648b, aVar.f61648b);
    }

    public final int hashCode() {
        List<yx2.c> list = this.f61647a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        yx2.j jVar = this.f61648b;
        return iHashCode + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "CustomerSubscriptionCacheEntry(activeSubscriptions=" + this.f61647a + ", purchasableSubscriptions=" + this.f61648b + ")";
    }

    /* JADX INFO: renamed from: dy2.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldy2/a$b;", "", "<init>", "()V", "Li63/c;", "Ldy2/a;", "serializer", "()Li63/c;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final c<a> serializer() {
            return C1306a.f61649a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public a(List<yx2.c> list, yx2.j jVar) {
        this.f61647a = list;
        this.f61648b = jVar;
    }
}
