package j02;

import am.e1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f96044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<b5.a0, n4.c, Unit> f96045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<n4.c, Unit> f96046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f96047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f96048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2.j f96049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1<a2.a.b> f96050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f96051h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.DraggableKt$longPressDraggable$3$2$1$1$1$1", f = "Draggable.kt", l = {132}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f96052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a2.j f96053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a2.a.b f96054c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a2.j jVar, a2.a.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f96053b = jVar;
            this.f96054c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f96053b, this.f96054c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f96052a;
            if (i14 == 0) {
                o13.r.b(obj);
                a2.j jVar = this.f96053b;
                if (jVar != null) {
                    this.f96052a = 1;
                    if (jVar.b(this.f96054c, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.DraggableKt$longPressDraggable$3$2$1$2$1$1", f = "Draggable.kt", l = {141}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f96055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a2.j f96056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a2.a.b f96057c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a2.j jVar, a2.a.b bVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f96056b = jVar;
            this.f96057c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f96056b, this.f96057c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f96055a;
            if (i14 == 0) {
                o13.r.b(obj);
                a2.j jVar = this.f96056b;
                if (jVar != null) {
                    a2.a.c cVar = new a2.a.c(this.f96057c);
                    this.f96055a = 1;
                    if (jVar.b(cVar, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.DraggableKt$longPressDraggable$3$2$1$3$1$1", f = "Draggable.kt", l = {154}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f96058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a2.j f96059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a2.a.b f96060c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a2.j jVar, a2.a.b bVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f96059b = jVar;
            this.f96060c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f96059b, this.f96060c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f96058a;
            if (i14 == 0) {
                o13.r.b(obj);
                a2.j jVar = this.f96059b;
                if (jVar != null) {
                    a2.a.C0002a c0002a = new a2.a.C0002a(this.f96060c);
                    this.f96058a = 1;
                    if (jVar.b(c0002a, this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public e(boolean z14, e23.p<? super b5.a0, ? super n4.c, Unit> pVar, e23.l<? super n4.c, Unit> lVar, p1<Boolean> p1Var, o53.b0 b0Var, a2.j jVar, p1<a2.a.b> p1Var2, e23.a<Unit> aVar) {
        this.f96044a = z14;
        this.f96045b = pVar;
        this.f96046c = lVar;
        this.f96047d = p1Var;
        this.f96048e = b0Var;
        this.f96049f = jVar;
        this.f96050g = p1Var2;
        this.f96051h = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
        if (!this.f96044a) {
            return Unit.INSTANCE;
        }
        e23.l<n4.c, Unit> lVar = this.f96046c;
        final p1<Boolean> p1Var = this.f96047d;
        final o53.b0 b0Var = this.f96048e;
        final a2.j jVar = this.f96049f;
        final p1<a2.a.b> p1Var2 = this.f96050g;
        e1 e1Var = new e1(lVar, p1Var, b0Var, jVar, p1Var2, 28);
        final int i14 = 0;
        final e23.a<Unit> aVar = this.f96051h;
        e23.a aVar2 = new e23.a() { // from class: j02.d
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        a2.a.b bVar = (a2.a.b) p1Var2.getF182175a();
                        if (bVar != null) {
                            ge1.b.T(b0Var, null, null, new e.b(jVar, bVar, null), 3);
                        }
                        p1 p1Var3 = p1Var;
                        if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                            aVar.invoke();
                        }
                        p1Var3.setValue(Boolean.FALSE);
                        break;
                    default:
                        a2.a.b bVar2 = (a2.a.b) p1Var2.getF182175a();
                        if (bVar2 != null) {
                            ge1.b.T(b0Var, null, null, new e.c(jVar, bVar2, null), 3);
                        }
                        p1 p1Var4 = p1Var;
                        if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                            aVar.invoke();
                        }
                        p1Var4.setValue(Boolean.FALSE);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i15 = 1;
        Object objG = p008y1.m0.g(h0Var, e1Var, aVar2, new e23.a() { // from class: j02.d
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        a2.a.b bVar = (a2.a.b) p1Var2.getF182175a();
                        if (bVar != null) {
                            ge1.b.T(b0Var, null, null, new e.b(jVar, bVar, null), 3);
                        }
                        p1 p1Var3 = p1Var;
                        if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                            aVar.invoke();
                        }
                        p1Var3.setValue(Boolean.FALSE);
                        break;
                    default:
                        a2.a.b bVar2 = (a2.a.b) p1Var2.getF182175a();
                        if (bVar2 != null) {
                            ge1.b.T(b0Var, null, null, new e.c(jVar, bVar2, null), 3);
                        }
                        p1 p1Var4 = p1Var;
                        if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                            aVar.invoke();
                        }
                        p1Var4.setValue(Boolean.FALSE);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, this.f96045b, dVar);
        return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
    }
}
