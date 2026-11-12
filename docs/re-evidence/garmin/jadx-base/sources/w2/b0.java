package w2;

import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.c2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly1/c2;", "Ln4/c;", MapboxMap.QFE_OFFSET, "", "<anonymous>", "(Ly1/c2;Ln4/c;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2", f = "TextFieldSelectionState.kt", l = {1795}, m = "invokeSuspend", v = 1)
public final class b0 extends v13.i implements e23.q<c2, n4.c, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f181286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ c2 f181287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f181288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.j f181289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f181290e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1", f = "TextFieldSelectionState.kt", l = {1808, 1816}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f181291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f181292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c2 f181293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f181294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f181295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a2.j f181296f;

        /* JADX INFO: renamed from: w2.b0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1$1", f = "TextFieldSelectionState.kt", l = {1800, 1805}, m = "invokeSuspend", v = 1)
        public static final class C3381a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f181297a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f181298b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f181299c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f181300d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a2.j f181301e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3381a(n nVar, long j8, a2.j jVar, t13.d<? super C3381a> dVar) {
                super(2, dVar);
                this.f181299c = nVar;
                this.f181300d = j8;
                this.f181301e = jVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3381a(this.f181299c, this.f181300d, this.f181301e, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3381a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0054  */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                n nVar;
                a2.l.b bVar;
                a2.l.b bVar2;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f181298b;
                a2.j jVar = this.f181301e;
                n nVar2 = this.f181299c;
                if (i14 != 0) {
                    if (i14 == 1) {
                        nVar = (n) this.f181297a;
                        o13.r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar2 = (a2.l.b) this.f181297a;
                        o13.r.b(obj);
                    }
                    nVar2.f181390z = bVar2;
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                a2.l.b bVar3 = nVar2.f181390z;
                if (bVar3 != null) {
                    a2.l.a aVar2 = new a2.l.a(bVar3);
                    this.f181297a = nVar2;
                    this.f181298b = 1;
                    if (jVar.b(aVar2, this) != aVar) {
                        nVar = nVar2;
                    }
                } else {
                    bVar = new a2.l.b(this.f181300d, null);
                    this.f181297a = bVar;
                    this.f181298b = 2;
                    if (jVar.b(bVar, this) != aVar) {
                        bVar2 = bVar;
                        nVar2.f181390z = bVar2;
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
                nVar.f181390z = null;
                bVar = new a2.l.b(this.f181300d, null);
                this.f181297a = bVar;
                this.f181298b = 2;
                if (jVar.b(bVar, this) != aVar) {
                    bVar2 = bVar;
                    nVar2.f181390z = bVar2;
                    return Unit.INSTANCE;
                }
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c2 c2Var, n nVar, long j8, a2.j jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f181293c = c2Var;
            this.f181294d = nVar;
            this.f181295e = j8;
            this.f181296f = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f181293c, this.f181294d, this.f181295e, this.f181296f, dVar);
            aVar.f181292b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            if (r12.f181296f.b(r13, r12) == r0) goto L20;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f181291a;
            n nVar = this.f181294d;
            if (i14 == 0) {
                o13.r.b(obj);
                ge1.b.T((o53.b0) this.f181292b, null, null, new C3381a(this.f181294d, this.f181295e, this.f181296f, null), 3);
                this.f181291a = 1;
                obj = this.f181293c.C(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            nVar.f181390z = null;
            return Unit.INSTANCE;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            a2.l.b bVar = nVar.f181390z;
            if (bVar != null) {
                a2.h cVar = zBooleanValue ? new a2.l.c(bVar) : new a2.l.a(bVar);
                this.f181291a = 2;
            }
            nVar.f181390z = null;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a2.j jVar, n nVar, t13.d<? super b0> dVar) {
        super(3, dVar);
        this.f181289d = jVar;
        this.f181290e = nVar;
    }

    @Override // e23.q
    public final Object invoke(c2 c2Var, n4.c cVar, t13.d<? super Unit> dVar) {
        long j8 = cVar.f123544a;
        b0 b0Var = new b0(this.f181289d, this.f181290e, dVar);
        b0Var.f181287b = c2Var;
        b0Var.f181288c = j8;
        return b0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f181286a;
        if (i14 == 0) {
            o13.r.b(obj);
            c2 c2Var = this.f181287b;
            long j8 = this.f181288c;
            a2.j jVar = this.f181289d;
            if (jVar != null) {
                a aVar2 = new a(c2Var, this.f181290e, j8, jVar, null);
                this.f181286a = 1;
                if (o53.c0.e(aVar2, this) == aVar) {
                    return aVar;
                }
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
