package b22;

import com.garmin.android.apps.connectmobile.f3;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"Lb22/a;", "", "", "goal", "moderate", "vigorous", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f15458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f15459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f15460c;

    /* JADX INFO: renamed from: b22.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/usersummary/IntensityMinutes.$serializer", "Lm63/e0;", "Lb22/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class C0216a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0216a f15461a;
        private static final k63.e descriptor;

        static {
            C0216a c0216a = new C0216a();
            f15461a = c0216a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.usersummary.IntensityMinutes", c0216a, 3);
            m1Var.j("goal", true);
            m1Var.j("moderate", true);
            m1Var.j("vigorous", true);
            descriptor = m1Var;
        }

        private C0216a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            return new i63.c[]{j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(m0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                    i15 |= 1;
                } else if (iE == 1) {
                    num2 = (Integer) cVarC.v(eVar2, 1, m0.f116981a, num2);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    num3 = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num3);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, num, num2, num3, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            Integer num = aVar.f15460c;
            Integer num2 = aVar.f15459b;
            Integer num3 = aVar.f15458a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || num3 != null) {
                dVarC.d(eVar, 0, m0.f116981a, num3);
            }
            if (dVarC.C(eVar) || num2 != null) {
                dVarC.d(eVar, 1, m0.f116981a, num2);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 2, m0.f116981a, num);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ a(int i14, Integer num, Integer num2, Integer num3, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f15458a = null;
        } else {
            this.f15458a = num;
        }
        if ((i14 & 2) == 0) {
            this.f15459b = null;
        } else {
            this.f15459b = num2;
        }
        if ((i14 & 4) == 0) {
            this.f15460c = null;
        } else {
            this.f15460c = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f15458a, aVar.f15458a) && s.g(this.f15459b, aVar.f15459b) && s.g(this.f15460c, aVar.f15460c);
    }

    public final int hashCode() {
        Integer num = this.f15458a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f15459b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f15460c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return f3.i(com.airbnb.lottie.animation.keyframe.a.l(this.f15458a, "IntensityMinutes(goal=", ", moderate=", ", vigorous=", this.f15459b), this.f15460c, ")");
    }

    /* JADX INFO: renamed from: b22.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb22/a$b;", "", "<init>", "()V", "Li63/c;", "Lb22/a;", "serializer", "()Li63/c;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C0216a.f15461a;
        }

        private Companion() {
        }
    }

    public a() {
        this((Integer) null, (Integer) null, (Integer) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public a(Integer num, Integer num2, Integer num3) {
        this.f15458a = num;
        this.f15459b = num2;
        this.f15460c = num3;
    }

    public /* synthetic */ a(Integer num, Integer num2, Integer num3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3);
    }
}
