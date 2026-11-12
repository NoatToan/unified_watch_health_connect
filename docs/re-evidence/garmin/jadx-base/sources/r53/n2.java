package r53;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr53/n2;", "Lr53/k2;", "", "stopTimeout", "replayExpiration", "<init>", "(JJ)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n2 implements k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f150766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f150767c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lr53/i2;", "", "count", "", "<anonymous>", "(Lr53/j;I)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, SyslogConstants.LOG_LOCAL6, 178, 179, 181}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.q<j<? super i2>, Integer, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f150768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ j f150769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ int f150770c;

        public a(t13.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(j<? super i2> jVar, Integer num, t13.d<? super Unit> dVar) {
            int iIntValue = num.intValue();
            a aVar = n2.this.new a(dVar);
            aVar.f150769b = jVar;
            aVar.f150770c = iIntValue;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x006b A[PHI: r1
          0x006b: PHI (r1v3 r53.j) = (r1v2 r53.j), (r1v6 r53.j) binds: [B:27:0x0068, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x0078 A[PHI: r1
          0x0078: PHI (r1v4 r53.j) = (r1v2 r53.j), (r1v3 r53.j), (r1v7 r53.j) binds: [B:25:0x005c, B:30:0x0075, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L34;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            j jVar;
            i2 i2Var;
            long j8;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f150768a;
            n2 n2Var = n2.this;
            if (i14 == 0) {
                o13.r.b(obj);
                jVar = this.f150769b;
                if (this.f150770c > 0) {
                    i2 i2Var2 = i2.START;
                    this.f150768a = 1;
                } else {
                    long j14 = n2Var.f150766b;
                    this.f150769b = jVar;
                    this.f150768a = 2;
                    if (o53.m0.b(j14, this) != aVar) {
                        if (n2Var.f150767c > 0) {
                            i2Var = i2.STOP;
                            this.f150769b = jVar;
                            this.f150768a = 3;
                            if (jVar.emit(i2Var, this) != aVar) {
                                j8 = n2Var.f150767c;
                                this.f150769b = jVar;
                                this.f150768a = 4;
                                if (o53.m0.b(j8, this) != aVar) {
                                    i2 i2Var3 = i2.STOP_AND_RESET_REPLAY_CACHE;
                                    this.f150769b = null;
                                    this.f150768a = 5;
                                }
                            }
                        } else {
                            i2 i2Var4 = i2.STOP_AND_RESET_REPLAY_CACHE;
                            this.f150769b = null;
                            this.f150768a = 5;
                        }
                    }
                }
                return aVar;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    jVar = this.f150769b;
                    o13.r.b(obj);
                    if (n2Var.f150767c > 0) {
                        i2Var = i2.STOP;
                        this.f150769b = jVar;
                        this.f150768a = 3;
                        if (jVar.emit(i2Var, this) != aVar) {
                            j8 = n2Var.f150767c;
                            this.f150769b = jVar;
                            this.f150768a = 4;
                            if (o53.m0.b(j8, this) != aVar) {
                            }
                        }
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    jVar = this.f150769b;
                    o13.r.b(obj);
                    j8 = n2Var.f150767c;
                    this.f150769b = jVar;
                    this.f150768a = 4;
                    if (o53.m0.b(j8, this) != aVar) {
                    }
                    return aVar;
                }
                if (i14 == 4) {
                    jVar = this.f150769b;
                    o13.r.b(obj);
                } else if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 i2Var5 = i2.STOP_AND_RESET_REPLAY_CACHE;
                this.f150769b = null;
                this.f150768a = 5;
            }
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/i2;", "it", "", "<anonymous>", "(Lr53/i2;)Z"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<i2, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150772a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f150772a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(i2 i2Var, t13.d<? super Boolean> dVar) {
            return ((b) create(i2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return Boolean.valueOf(((i2) this.f150772a) != i2.START);
        }
    }

    public n2(long j8, long j14) {
        this.f150766b = j8;
        this.f150767c = j14;
        if (j8 < 0) {
            vb.h.x(androidx.room.a0.f(j8, "stopTimeout(", " ms) cannot be negative"));
            throw null;
        }
        if (j14 >= 0) {
            return;
        }
        vb.h.x(androidx.room.a0.f(j14, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    @Override // r53.k2
    public final i<i2> a(o2<Integer> o2Var) {
        return s.s(new c0(s.N(o2Var, new a(null)), new b(null)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.f150766b == n2Var.f150766b && this.f150767c == n2Var.f150767c;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Long.hashCode(this.f150767c) + (Long.hashCode(this.f150766b) * 31);
    }

    public final String toString() {
        q13.b bVar = new q13.b(2);
        long j8 = this.f150766b;
        if (j8 > 0) {
            bVar.add("stopTimeout=" + j8 + "ms");
        }
        long j14 = this.f150767c;
        if (j14 < Long.MAX_VALUE) {
            bVar.add("replayExpiration=" + j14 + "ms");
        }
        return androidx.room.a0.m(new StringBuilder("SharingStarted.WhileSubscribed("), p13.h0.k0(p13.w.a(bVar), null, null, null, null, 63), CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
