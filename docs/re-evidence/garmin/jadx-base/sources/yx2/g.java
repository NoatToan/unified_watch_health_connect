package yx2;

import java.util.List;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lyx2/g;", "", "", "Lyx2/c;", "customerSubscriptions", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Lm63/u1;)V", "Companion", "a", "b", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h
public final /* data */ class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f200081b = {o13.m.a(o13.n.PUBLICATION, new b(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f200082a;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/subscriptions/dto/GetSubscriptionsResponseDTO.$serializer", "Lm63/e0;", "Lyx2/g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f200083a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f200083a = aVar;
            m1 m1Var = new m1("com.garmin.subscriptions.dto.GetSubscriptionsResponseDTO", aVar, 1);
            m1Var.j("customerSubscriptions", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{g.f200081b[0].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = g.f200081b;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            List list = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else {
                    if (iE != 0) {
                        hb.a.o(iE);
                        return null;
                    }
                    list = (List) cVarC.l(eVar2, 0, lVarArr[0].getValue(), list);
                    i15 = 1;
                }
            }
            cVarC.b(eVar2);
            return new g(i15, list, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            g gVar = (g) obj;
            gVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.e(eVar, 0, g.f200081b[0].getValue(), gVar.f200082a);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ g(int i14, List list, u1 u1Var) {
        if (1 == (i14 & 1)) {
            this.f200082a = list;
        } else {
            k1.h(i14, 1, a.f200083a.getF158591b());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && s.g(this.f200082a, ((g) obj).f200082a);
    }

    public final int hashCode() {
        return this.f200082a.hashCode();
    }

    public final String toString() {
        return tn.k.h("GetSubscriptionsResponseDTO(customerSubscriptions=", ")", this.f200082a);
    }

    /* JADX INFO: renamed from: yx2.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyx2/g$b;", "", "<init>", "()V", "Li63/c;", "Lyx2/g;", "serializer", "()Li63/c;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<g> serializer() {
            return a.f200083a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public g(List<c> list) {
        list.getClass();
        this.f200082a = list;
    }
}
