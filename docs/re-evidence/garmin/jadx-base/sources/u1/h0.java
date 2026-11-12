package u1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lu1/h0;", "Lu1/f1;", "<init>", "()V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h0 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f167520a = new h0();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu1/h0$a;", "Lh4/r$c;", "Lh5/s;", "La2/i;", "interactionSource", "<init>", "(La2/i;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends h4.r.c implements h5.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a2.i f167521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f167522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f167523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f167524d;

        /* JADX INFO: renamed from: u1.h0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {228}, m = "invokeSuspend", v = 1)
        public static final class C3148a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f167525a;

            /* JADX INFO: renamed from: u1.h0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C3149a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ p005kotlin.jvm.internal.p0 f167527a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p005kotlin.jvm.internal.p0 f167528b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ p005kotlin.jvm.internal.p0 f167529c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a f167530d;

                public C3149a(p005kotlin.jvm.internal.p0 p0Var, p005kotlin.jvm.internal.p0 p0Var2, p005kotlin.jvm.internal.p0 p0Var3, a aVar) {
                    this.f167527a = p0Var;
                    this.f167528b = p0Var2;
                    this.f167529c = p0Var3;
                    this.f167530d = aVar;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    a2.h hVar = (a2.h) obj;
                    boolean z14 = hVar instanceof a2.l.b;
                    p005kotlin.jvm.internal.p0 p0Var = this.f167529c;
                    p005kotlin.jvm.internal.p0 p0Var2 = this.f167528b;
                    p005kotlin.jvm.internal.p0 p0Var3 = this.f167527a;
                    boolean z15 = true;
                    if (z14) {
                        p0Var3.f105807a++;
                    } else if ((hVar instanceof a2.l.c) || (hVar instanceof a2.l.a)) {
                        p0Var3.f105807a--;
                    } else if (hVar instanceof a2.e) {
                        p0Var2.f105807a++;
                    } else if (hVar instanceof a2.f) {
                        p0Var2.f105807a--;
                    } else if (hVar instanceof a2.b) {
                        p0Var.f105807a++;
                    } else if (hVar instanceof a2.c) {
                        p0Var.f105807a--;
                    }
                    boolean z16 = false;
                    boolean z17 = p0Var3.f105807a > 0;
                    boolean z18 = p0Var2.f105807a > 0;
                    boolean z19 = p0Var.f105807a > 0;
                    a aVar = this.f167530d;
                    if (aVar.f167522b != z17) {
                        aVar.f167522b = z17;
                        z16 = true;
                    }
                    if (aVar.f167523c != z18) {
                        aVar.f167523c = z18;
                        z16 = true;
                    }
                    if (aVar.f167524d != z19) {
                        aVar.f167524d = z19;
                    } else {
                        z15 = z16;
                    }
                    if (z15) {
                        h5.t.a(aVar);
                    }
                    return Unit.INSTANCE;
                }
            }

            public C3148a(t13.d<? super C3148a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return a.this.new C3148a(dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3148a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f167525a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
                    p005kotlin.jvm.internal.p0 p0Var2 = new p005kotlin.jvm.internal.p0();
                    p005kotlin.jvm.internal.p0 p0Var3 = new p005kotlin.jvm.internal.p0();
                    a aVar2 = a.this;
                    r53.i<a2.h> iVarC = aVar2.f167521a.c();
                    C3149a c3149a = new C3149a(p0Var, p0Var2, p0Var3, aVar2);
                    this.f167525a = 1;
                    if (iVarC.collect(c3149a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public a(a2.i iVar) {
            this.f167521a = iVar;
        }

        @Override // h4.r.c
        public final void onAttach() {
            ge1.b.T(getCoroutineScope(), null, null, new C3148a(null), 3);
        }

        @Override // h5.s
        public final void p(h5.h0 h0Var) {
            q4.a aVar = h0Var.f81825a;
            h0Var.m1();
            if (this.f167522b) {
                o4.d0.f128823b.getClass();
                q4.f.A0(h0Var, o4.d0.c(0.3f, o4.d0.f128824c, 14), 0L, aVar.b(), 0.0f, null, null, 122);
            } else if (this.f167523c || this.f167524d) {
                o4.d0.f128823b.getClass();
                q4.f.A0(h0Var, o4.d0.c(0.1f, o4.d0.f128824c, 14), 0L, aVar.b(), 0.0f, null, null, 122);
            }
        }
    }

    private h0() {
    }

    @Override // u1.f1
    public final h5.j a(a2.i iVar) {
        return new a(iVar);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // u1.f1
    public final int hashCode() {
        return -1;
    }
}
