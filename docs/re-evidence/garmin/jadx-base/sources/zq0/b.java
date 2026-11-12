package zq0;

import android.os.Bundle;
import c22.t;
import i63.h;
import java.util.List;
import k23.p;
import k23.r;
import lc.q0;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.u0;
import r1.q2;
import zd0.r0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lzq0/b;", "Lzq0/e;", "", "Ltq0/f;", "preferenceList", "Ltq0/a;", "activityMapping", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lm63/u1;)V", "Companion", "b", "a", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b extends e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f206630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f206631d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<tq0.f> f206632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<tq0.a> f206633b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/insights/presentation/navigation/EditRoute.$serializer", "Lm63/e0;", "Lzq0/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f206634a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f206634a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.insights.presentation.navigation.EditRoute", aVar, 2);
            m1Var.j("preferenceList", false);
            m1Var.j("activityMapping", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = b.f206630c;
            return new i63.c[]{lVarArr[0].getValue(), lVarArr[1].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = b.f206630c;
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
                    list = (List) cVarC.l(eVar2, 0, lVarArr[0].getValue(), list);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    list2 = (List) cVarC.l(eVar2, 1, lVarArr[1].getValue(), list2);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, list, list2, u1Var);
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
            l<i63.c<Object>>[] lVarArr = b.f206630c;
            dVarC.e(eVar, 0, lVarArr[0].getValue(), bVar.f206632a);
            dVarC.e(eVar, 1, lVarArr[1].getValue(), bVar.f206633b);
            dVarC.b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"zq0/b$c", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends q0<List<? extends tq0.f>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f206635s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n63.b bVar) {
            super(true);
            this.f206635s = bVar;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List<? extends tq0.f>] */
        @Override // lc.q0
        public final List<? extends tq0.f> a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f206635s;
            bVar.getClass();
            return bVar.c(new m63.e(tq0.f.INSTANCE.serializer()), strI);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List<? extends tq0.f>] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final List<? extends tq0.f> h(String str) {
            str.getClass();
            n63.b bVar = this.f206635s;
            bVar.getClass();
            return bVar.c(new m63.e(tq0.f.INSTANCE.serializer()), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, List<? extends tq0.f> list) {
            str.getClass();
            n63.b bVar = this.f206635s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(new m63.e(tq0.f.INSTANCE.serializer())), list));
        }

        @Override // lc.q0
        public final String f(List<? extends tq0.f> list) {
            n63.b bVar = this.f206635s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(new m63.e(tq0.f.INSTANCE.serializer())), list);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"zq0/b$d", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends q0<List<? extends tq0.a>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f206636s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n63.b bVar) {
            super(true);
            this.f206636s = bVar;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List<? extends tq0.a>] */
        @Override // lc.q0
        public final List<? extends tq0.a> a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f206636s;
            bVar.getClass();
            return bVar.c(new m63.e(tq0.a.INSTANCE.serializer()), strI);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List<? extends tq0.a>] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final List<? extends tq0.a> h(String str) {
            str.getClass();
            n63.b bVar = this.f206636s;
            bVar.getClass();
            return bVar.c(new m63.e(tq0.a.INSTANCE.serializer()), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, List<? extends tq0.a> list) {
            str.getClass();
            n63.b bVar = this.f206636s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(new m63.e(tq0.a.INSTANCE.serializer())), list));
        }

        @Override // lc.q0
        public final String f(List<? extends tq0.a> list) {
            n63.b bVar = this.f206636s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(new m63.e(tq0.a.INSTANCE.serializer())), list);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f206630c = new l[]{m.a(nVar, new r0(25)), m.a(nVar, new r0(26))};
        r.a aVar = r.f102461c;
        p pVarC = s0.c(tq0.f.class);
        aVar.getClass();
        p pVarD = s0.d(List.class, r.a.a(pVarC));
        n63.b.a aVar2 = n63.b.f123892d;
        f206631d = u0.e(new o13.p(pVarD, new c(aVar2)), new o13.p(s0.d(List.class, r.a.a(s0.c(tq0.a.class))), new d(aVar2)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i14, List list, List list2, u1 u1Var) {
        super(null);
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f206634a.getF158591b());
            throw null;
        }
        this.f206632a = list;
        this.f206633b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f206632a, bVar.f206632a) && s.g(this.f206633b, bVar.f206633b);
    }

    public final int hashCode() {
        return this.f206633b.hashCode() + (this.f206632a.hashCode() * 31);
    }

    public final String toString() {
        return t.f("EditRoute(preferenceList=", ", activityMapping=", ")", this.f206632a, this.f206633b);
    }

    /* JADX INFO: renamed from: zq0.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzq0/b$b;", "", "<init>", "()V", "Li63/c;", "Lzq0/b;", "serializer", "()Li63/c;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f206634a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List<tq0.f> list, List<tq0.a> list2) {
        super(null);
        list.getClass();
        list2.getClass();
        this.f206632a = list;
        this.f206633b = list2;
    }
}
