package q41;

import i63.c;
import i63.h;
import l63.d;
import l63.f;
import m63.d0;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lq41/a;", "", "", "elevationSegmentationTolerance", "elevationSegmentMinLength", "paceFactor", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f142589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f142590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f142591c;

    /* JADX INFO: renamed from: q41.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/pacepro/data/dto/PacebandParametersDTO.$serializer", "Lm63/e0;", "Lq41/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class C2681a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2681a f142592a;
        private static final k63.e descriptor;

        static {
            C2681a c2681a = new C2681a();
            f142592a = c2681a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.pacepro.data.dto.PacebandParametersDTO", c2681a, 3);
            m1Var.j("elevationSegmentationTolerance", false);
            m1Var.j("elevationSegmentMinLength", false);
            m1Var.j("paceFactor", false);
            descriptor = m1Var;
        }

        private C2681a() {
        }

        @Override // m63.e0
        public final c<?>[] childSerializers() {
            d0 d0Var = d0.f116930a;
            return new c[]{j63.a.d(d0Var), j63.a.d(d0Var), j63.a.d(d0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Float f14 = null;
            Float f15 = null;
            Float f16 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    f14 = (Float) cVarC.v(eVar2, 0, d0.f116930a, f14);
                    i15 |= 1;
                } else if (iE == 1) {
                    f15 = (Float) cVarC.v(eVar2, 1, d0.f116930a, f15);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    f16 = (Float) cVarC.v(eVar2, 2, d0.f116930a, f16);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, f14, f15, f16, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            d0 d0Var = d0.f116930a;
            dVarC.d(eVar, 0, d0Var, aVar.f142589a);
            dVarC.d(eVar, 1, d0Var, aVar.f142590b);
            dVarC.d(eVar, 2, d0Var, aVar.f142591c);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ a(int i14, Float f14, Float f15, Float f16, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, C2681a.f142592a.getF116202c());
            throw null;
        }
        this.f142589a = f14;
        this.f142590b = f15;
        this.f142591c = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f142589a, aVar.f142589a) && s.g(this.f142590b, aVar.f142590b) && s.g(this.f142591c, aVar.f142591c);
    }

    public final int hashCode() {
        Float f14 = this.f142589a;
        int iHashCode = (f14 == null ? 0 : f14.hashCode()) * 31;
        Float f15 = this.f142590b;
        int iHashCode2 = (iHashCode + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.f142591c;
        return iHashCode2 + (f16 != null ? f16.hashCode() : 0);
    }

    public final String toString() {
        return "PacebandParametersDTO(elevationSegmentationTolerance=" + this.f142589a + ", elevationSegmentMinLength=" + this.f142590b + ", paceFactor=" + this.f142591c + ")";
    }

    /* JADX INFO: renamed from: q41.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq41/a$b;", "", "<init>", "()V", "Li63/c;", "Lq41/a;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final c<a> serializer() {
            return C2681a.f142592a;
        }

        private Companion() {
        }
    }

    public a(Float f14, Float f15, Float f16) {
        this.f142589a = f14;
        this.f142590b = f15;
        this.f142591c = f16;
    }
}
