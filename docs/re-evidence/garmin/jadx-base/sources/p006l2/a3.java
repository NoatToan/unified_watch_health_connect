package p006l2;

import a2.j;
import a2.l;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h0;
import e23.p;
import e23.q;
import i3.i5;
import n4.c;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.c2;
import p008y1.k3;
import p3.p1;
import p3.x3;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class a3 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f108349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<l.b> f108350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f108351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3<e23.l<c, Unit>> f108352d;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly1/c2;", "Ln4/c;", "it", "", "<anonymous>", "(Ly1/c2;Ln4/c;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements q<c2, c, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f108353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ c2 f108354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ long f108355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b0 f108356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<l.b> f108357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j f108358f;

        /* JADX INFO: renamed from: l2.a3$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, 64}, m = "invokeSuspend", v = 1)
        public static final class C2083a extends i implements p<b0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f108359a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f108360b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p1<l.b> f108361c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f108362d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f108363e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2083a(p1<l.b> p1Var, long j8, j jVar, d<? super C2083a> dVar) {
                super(2, dVar);
                this.f108361c = p1Var;
                this.f108362d = j8;
                this.f108363e = jVar;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C2083a(this.f108361c, this.f108362d, this.f108363e, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((C2083a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0052  */
            /* JADX WARN: Code duplicated, block: B:24:0x005d  */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
            
                if (r3.b(r1, r9) == r0) goto L23;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                p1<l.b> p1Var;
                l.b bVar;
                l.b bVar2;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f108360b;
                j jVar = this.f108363e;
                p1<l.b> p1Var2 = this.f108361c;
                if (i14 != 0) {
                    if (i14 == 1) {
                        p1Var = (p1) this.f108359a;
                        r.b(obj);
                    } else {
                        if (i14 != 2) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar2 = (l.b) this.f108359a;
                        r.b(obj);
                    }
                    bVar = bVar2;
                    p1Var2.setValue(bVar);
                    return Unit.INSTANCE;
                }
                r.b(obj);
                l.b f182175a = p1Var2.getF182175a();
                if (f182175a == null) {
                    bVar = new l.b(this.f108362d, null);
                    if (jVar != null) {
                        this.f108359a = bVar;
                        this.f108360b = 2;
                        if (jVar.b(bVar, this) != aVar) {
                            bVar2 = bVar;
                            bVar = bVar2;
                        }
                    }
                    p1Var2.setValue(bVar);
                    return Unit.INSTANCE;
                }
                l.a aVar2 = new l.a(f182175a);
                if (jVar != null) {
                    this.f108359a = p1Var2;
                    this.f108360b = 1;
                }
                p1Var = p1Var2;
                return aVar;
                p1Var.setValue(null);
                bVar = new l.b(this.f108362d, null);
                if (jVar != null) {
                    this.f108359a = bVar;
                    this.f108360b = 2;
                    if (jVar.b(bVar, this) != aVar) {
                        bVar2 = bVar;
                        bVar = bVar2;
                    }
                    return aVar;
                }
                p1Var2.setValue(bVar);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend", v = 1)
        public static final class b extends i implements p<b0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public p1 f108364a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f108365b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p1<l.b> f108366c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f108367d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f108368e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(p1<l.b> p1Var, boolean z14, j jVar, d<? super b> dVar) {
                super(2, dVar);
                this.f108366c = p1Var;
                this.f108367d = z14;
                this.f108368e = jVar;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new b(this.f108366c, this.f108367d, this.f108368e, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                p1<l.b> p1Var;
                p1<l.b> p1Var2;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f108365b;
                if (i14 == 0) {
                    r.b(obj);
                    p1Var = this.f108366c;
                    l.b f182175a = p1Var.getF182175a();
                    if (f182175a != null) {
                        a2.h cVar = this.f108367d ? new l.c(f182175a) : new l.a(f182175a);
                        j jVar = this.f108368e;
                        if (jVar != null) {
                            this.f108364a = p1Var;
                            this.f108365b = 1;
                            if (jVar.b(cVar, this) == aVar) {
                                return aVar;
                            }
                            p1Var2 = p1Var;
                        }
                        p1Var.setValue(null);
                    }
                    return Unit.INSTANCE;
                }
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p1Var2 = this.f108364a;
                r.b(obj);
                p1Var = p1Var2;
                p1Var.setValue(null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, p1<l.b> p1Var, j jVar, d<? super a> dVar) {
            super(3, dVar);
            this.f108356d = b0Var;
            this.f108357e = p1Var;
            this.f108358f = jVar;
        }

        @Override // e23.q
        public final Object invoke(c2 c2Var, c cVar, d<? super Unit> dVar) {
            long j8 = cVar.f123544a;
            p1<l.b> p1Var = this.f108357e;
            j jVar = this.f108358f;
            a aVar = new a(this.f108356d, p1Var, jVar, dVar);
            aVar.f108354b = c2Var;
            aVar.f108355c = j8;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f108353a;
            b0 b0Var = this.f108356d;
            if (i14 == 0) {
                r.b(obj);
                c2 c2Var = this.f108354b;
                ge1.b.T(b0Var, null, null, new C2083a(this.f108357e, this.f108355c, this.f108358f, null), 3);
                this.f108353a = 1;
                obj = c2Var.C(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            ge1.b.T(b0Var, null, null, new b(this.f108357e, ((Boolean) obj).booleanValue(), this.f108358f, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a3(b0 b0Var, p1<l.b> p1Var, j jVar, x3<? extends e23.l<? super c, Unit>> x3Var) {
        this.f108349a = b0Var;
        this.f108350b = p1Var;
        this.f108351c = jVar;
        this.f108352d = x3Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, d<? super Unit> dVar) {
        Object objE = k3.e(h0Var, new a(this.f108349a, this.f108350b, this.f108351c, null), new i5(this.f108352d, 4), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }
}
