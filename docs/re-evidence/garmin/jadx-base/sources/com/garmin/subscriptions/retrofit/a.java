package com.garmin.subscriptions.retrofit;

import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/garmin/subscriptions/retrofit/a;", "", "", "serverResponseCode", "", "serverResponseCodeTimestampUTC", "retryAfterSeconds", "retryAfterTimestampUTC", "<init>", "(IJIJ)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIJIJLm63/u1;)V", "Companion", "a", "b", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f52673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f52675d;

    /* JADX INFO: renamed from: com.garmin.subscriptions.retrofit.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/subscriptions/retrofit/RateLimitData.$serializer", "Lm63/e0;", "Lcom/garmin/subscriptions/retrofit/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class C1132a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1132a f52676a;
        private static final k63.e descriptor;

        static {
            C1132a c1132a = new C1132a();
            f52676a = c1132a;
            m1 m1Var = new m1("com.garmin.subscriptions.retrofit.RateLimitData", c1132a, 4);
            m1Var.j("serverResponseCode", false);
            m1Var.j("serverResponseCodeTimestampUTC", false);
            m1Var.j("retryAfterSeconds", false);
            m1Var.j("retryAfterTimestampUTC", false);
            descriptor = m1Var;
        }

        private C1132a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            v0 v0Var = v0.f117027a;
            return new i63.c[]{m0Var, v0Var, m0Var, v0Var};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            int iA = 0;
            int iA2 = 0;
            long jW = 0;
            long jW2 = 0;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    iA = cVarC.A(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    jW = cVarC.w(eVar2, 1);
                    i15 |= 2;
                } else if (iE == 2) {
                    iA2 = cVarC.A(eVar2, 2);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    jW2 = cVarC.w(eVar2, 3);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, iA, jW, iA2, jW2, null);
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
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.v(0, aVar.f52672a, eVar);
            dVarC.z(eVar, 1, aVar.f52673b);
            dVarC.v(2, aVar.f52674c, eVar);
            dVarC.z(eVar, 3, aVar.f52675d);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ a(int i14, int i15, long j8, int i16, long j14, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, C1132a.f52676a.getF158591b());
            throw null;
        }
        this.f52672a = i15;
        this.f52673b = j8;
        this.f52674c = i16;
        this.f52675d = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f52672a == aVar.f52672a && this.f52673b == aVar.f52673b && this.f52674c == aVar.f52674c && this.f52675d == aVar.f52675d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f52675d) + q2.d(this.f52674c, q6.f.e(Integer.hashCode(this.f52672a) * 31, 31, this.f52673b), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RateLimitData(serverResponseCode=");
        sb3.append(this.f52672a);
        sb3.append(", serverResponseCodeTimestampUTC=");
        sb3.append(this.f52673b);
        sb3.append(", retryAfterSeconds=");
        sb3.append(this.f52674c);
        sb3.append(", retryAfterTimestampUTC=");
        return am.j.i(this.f52675d, ")", sb3);
    }

    /* JADX INFO: renamed from: com.garmin.subscriptions.retrofit.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/subscriptions/retrofit/a$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/subscriptions/retrofit/a;", "serializer", "()Li63/c;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<a> serializer() {
            return C1132a.f52676a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public a(int i14, long j8, int i15, long j14) {
        this.f52672a = i14;
        this.f52673b = j8;
        this.f52674c = i15;
        this.f52675d = j14;
    }
}
