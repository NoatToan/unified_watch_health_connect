package i2;

import e23.p;
import f5.c0;
import o13.r;
import o53.b0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import v13.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lo53/l1;", "<anonymous>", "(Lo53/b0;)Lo53/l1;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend", v = 1)
public final class g extends i implements p<b0, t13.d<? super l1>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f87126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f87127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f87128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<n4.d> f87129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<n4.d> f87130e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f87132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0 f87133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<n4.d> f87134d;

        /* JADX INFO: renamed from: i2.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class C1729a extends q implements e23.a<n4.d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f87135a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f87136b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e23.a<n4.d> f87137c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1729a(h hVar, c0 c0Var, e23.a<n4.d> aVar) {
                super(0, s.a.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.f87135a = hVar;
                this.f87136b = c0Var;
                this.f87137c = aVar;
            }

            @Override // e23.a
            public final n4.d invoke() {
                return h.U1(this.f87135a, this.f87136b, this.f87137c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, c0 c0Var, e23.a<n4.d> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f87132b = hVar;
            this.f87133c = c0Var;
            this.f87134d = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f87132b, this.f87133c, this.f87134d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f87131a;
            if (i14 == 0) {
                r.b(obj);
                h hVar = this.f87132b;
                f fVar = hVar.f87141a;
                C1729a c1729a = new C1729a(hVar, this.f87133c, this.f87134d);
                this.f87131a = 1;
                if (fVar.J1(c1729a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend", v = 1)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f87139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<n4.d> f87140c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, e23.a<n4.d> aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f87139b = hVar;
            this.f87140c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f87139b, this.f87140c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f87138a;
            if (i14 == 0) {
                r.b(obj);
                this.f87138a = 1;
                if (m5.c.a(this.f87139b, this.f87140c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, c0 c0Var, e23.a<n4.d> aVar, e23.a<n4.d> aVar2, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f87127b = hVar;
        this.f87128c = c0Var;
        this.f87129d = aVar;
        this.f87130e = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f87127b, this.f87128c, this.f87129d, this.f87130e, dVar);
        gVar.f87126a = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super l1> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        b0 b0Var = (b0) this.f87126a;
        c0 c0Var = this.f87128c;
        e23.a<n4.d> aVar2 = this.f87129d;
        h hVar = this.f87127b;
        ge1.b.T(b0Var, null, null, new a(hVar, c0Var, aVar2, null), 3);
        return ge1.b.T(b0Var, null, null, new b(hVar, this.f87130e, null), 3);
    }
}
