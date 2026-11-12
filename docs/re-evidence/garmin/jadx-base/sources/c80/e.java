package c80;

import i3.e5;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lc80/e;", "", "", "currentUsage", "maxUsage", "Lb63/l;", "nextCouponGenerationDate", "timePeriodInDays", "<init>", "(IILb63/l;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIILb63/l;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.l f25356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f25357d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/data/model/CouponRestrictionGroupUsageDTO.$serializer", "Lm63/e0;", "Lc80/e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25358a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f25358a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.data.model.CouponRestrictionGroupUsageDTO", aVar, 4);
            m1Var.j("currentUsage", false);
            m1Var.j("maxUsage", false);
            m1Var.j("nextCouponGenerationDate", false);
            m1Var.j("timePeriodInDays", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m63.m0 m0Var = m63.m0.f116981a;
            return new i63.c[]{m0Var, m0Var, j63.a.d(h63.j.f82302a), j63.a.d(m0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            int iA = 0;
            int iA2 = 0;
            b63.l lVar = null;
            Integer num = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    iA = cVarC.A(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    iA2 = cVarC.A(eVar2, 1);
                    i15 |= 2;
                } else if (iE == 2) {
                    lVar = (b63.l) cVarC.v(eVar2, 2, h63.j.f82302a, lVar);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    num = (Integer) cVarC.v(eVar2, 3, m63.m0.f116981a, num);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new e(i15, iA, iA2, lVar, num, null);
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
            dVarC.v(0, eVar.f25354a, eVar2);
            dVarC.v(1, eVar.f25355b, eVar2);
            dVarC.d(eVar2, 2, h63.j.f82302a, eVar.f25356c);
            dVarC.d(eVar2, 3, m63.m0.f116981a, eVar.f25357d);
            dVarC.b(eVar2);
        }
    }

    public /* synthetic */ e(int i14, int i15, int i16, b63.l lVar, Integer num, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f25358a.getF158591b());
            throw null;
        }
        this.f25354a = i15;
        this.f25355b = i16;
        this.f25356c = lVar;
        this.f25357d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f25354a == eVar.f25354a && this.f25355b == eVar.f25355b && p005kotlin.jvm.internal.s.g(this.f25356c, eVar.f25356c) && p005kotlin.jvm.internal.s.g(this.f25357d, eVar.f25357d);
    }

    public final int hashCode() {
        int iD = q2.d(this.f25355b, Integer.hashCode(this.f25354a) * 31, 31);
        b63.l lVar = this.f25356c;
        int iHashCode = (iD + (lVar == null ? 0 : lVar.f16204a.hashCode())) * 31;
        Integer num = this.f25357d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f25354a, this.f25355b, "CouponRestrictionGroupUsageDTO(currentUsage=", ", maxUsage=", ", nextCouponGenerationDate=");
        sbJ.append(this.f25356c);
        sbJ.append(", timePeriodInDays=");
        sbJ.append(this.f25357d);
        sbJ.append(")");
        return sbJ.toString();
    }

    /* JADX INFO: renamed from: c80.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc80/e$b;", "", "<init>", "()V", "Li63/c;", "Lc80/e;", "serializer", "()Li63/c;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<e> serializer() {
            return a.f25358a;
        }

        private Companion() {
        }
    }

    public e(int i14, int i15, b63.l lVar, Integer num) {
        this.f25354a = i14;
        this.f25355b = i15;
        this.f25356c = lVar;
        this.f25357d = num;
    }
}
