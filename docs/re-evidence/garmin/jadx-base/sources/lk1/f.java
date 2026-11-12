package lk1;

import android.os.Bundle;
import hk1.a0;
import i63.h;
import java.util.Map;
import k23.p;
import lc.q0;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.t0;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Llk1/f;", "Llk1/d;", "Lhk1/a0;", "userPartnerConnectionDTO", "<init>", "(Lhk1/a0;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILhk1/a0;Lm63/u1;)V", "Companion", "b", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class f extends d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<p, q0<a0>> f113148c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f113149b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/settings/thirdparty/presentation/navigation/PartnerAppDetails.$serializer", "Lm63/e0;", "Llk1/f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f113150a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f113150a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.navigation.PartnerAppDetails", aVar, 1);
            m1Var.j("userPartnerConnectionDTO", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{a0.a.f84112a};
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
            a0 a0Var = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else {
                    if (iE != 0) {
                        hb.a.o(iE);
                        return null;
                    }
                    a0Var = (a0) cVarC.l(eVar2, 0, a0.a.f84112a, a0Var);
                    i15 = 1;
                }
            }
            cVarC.b(eVar2);
            return new f(i15, a0Var, u1Var);
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
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.e(eVar, 0, a0.a.f84112a, fVar2.f113149b);
            dVarC.b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"lk1/f$c", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends q0<a0> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f113151s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n63.b bVar) {
            super(true);
            this.f113151s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [hk1.a0, java.lang.Object] */
        @Override // lc.q0
        public final a0 a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f113151s;
            bVar.getClass();
            return bVar.c(a0.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [hk1.a0, java.lang.Object] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final a0 h(String str) {
            str.getClass();
            n63.b bVar = this.f113151s;
            bVar.getClass();
            return bVar.c(a0.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, a0 a0Var) {
            str.getClass();
            n63.b bVar = this.f113151s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(a0.INSTANCE.serializer()), a0Var));
        }

        @Override // lc.q0
        public final String f(a0 a0Var) {
            n63.b bVar = this.f113151s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(a0.INSTANCE.serializer()), a0Var);
        }
    }

    static {
        a0.Companion companion = a0.INSTANCE;
        f113148c = t0.b(new o13.p(s0.c(a0.class), new c(n63.b.f123892d)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i14, a0 a0Var, u1 u1Var) {
        super(i14, u1Var);
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f113150a.getF158591b());
            throw null;
        }
        this.f113149b = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && s.g(this.f113149b, ((f) obj).f113149b);
    }

    public final int hashCode() {
        return this.f113149b.hashCode();
    }

    public final String toString() {
        return "PartnerAppDetails(userPartnerConnectionDTO=" + this.f113149b + ")";
    }

    /* JADX INFO: renamed from: lk1.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llk1/f$b;", "", "<init>", "()V", "Li63/c;", "Llk1/f;", "serializer", "()Li63/c;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f113150a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a0 a0Var) {
        super(null);
        a0Var.getClass();
        this.f113149b = a0Var;
    }
}
