package p008y1;

import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.p0;
import t13.d;
import u1.k1;
import u1.l1;
import u1.m1;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly1/c0;", "Ly1/e3;", "Lkotlin/Function1;", "", "onDelta", "<init>", "(Le23/l;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 implements e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<Float, Float> f193119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f193120b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1 f193121c = new l1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f193122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f193123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f193124f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {208}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193125a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k1 f193127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p<o2, d<? super Unit>, Object> f193128d;

        /* JADX INFO: renamed from: y1.c0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/o2;", "", "<anonymous>", "(Ly1/o2;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {211}, m = "invokeSuspend", v = 1)
        public static final class C3606a extends i implements p<o2, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f193129a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f193130b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c0 f193131c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p<o2, d<? super Unit>, Object> f193132d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3606a(c0 c0Var, p<? super o2, ? super d<? super Unit>, ? extends Object> pVar, d<? super C3606a> dVar) {
                super(2, dVar);
                this.f193131c = c0Var;
                this.f193132d = pVar;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C3606a c3606a = new C3606a(this.f193131c, this.f193132d, dVar);
                c3606a.f193130b = obj;
                return c3606a;
            }

            @Override // e23.p
            public final Object invoke(o2 o2Var, d<? super Unit> dVar) {
                return ((C3606a) create(o2Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f193129a;
                c0 c0Var = this.f193131c;
                try {
                    if (i14 == 0) {
                        r.b(obj);
                        o2 o2Var = (o2) this.f193130b;
                        c0Var.f193122d.setValue(Boolean.TRUE);
                        p<o2, d<? super Unit>, Object> pVar = this.f193132d;
                        this.f193129a = 1;
                        if (pVar.invoke(o2Var, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    c0Var.f193122d.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    c0Var.f193122d.setValue(Boolean.FALSE);
                    throw th3;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(k1 k1Var, p<? super o2, ? super d<? super Unit>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f193127c = k1Var;
            this.f193128d = pVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return c0.this.new a(this.f193127c, this.f193128d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193125a;
            if (i14 == 0) {
                r.b(obj);
                c0 c0Var = c0.this;
                l1 l1Var = c0Var.f193121c;
                b bVar = c0Var.f193120b;
                C3606a c3606a = new C3606a(c0Var, this.f193128d, null);
                this.f193125a = 1;
                l1Var.getClass();
                if (o53.c0.e(new m1(this.f193127c, l1Var, c3606a, bVar, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y1/c0$b", "Ly1/o2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements o2 {
        public b() {
        }

        @Override // p008y1.o2
        public final float f(float f14) {
            if (Float.isNaN(f14)) {
                return 0.0f;
            }
            c0 c0Var = c0.this;
            float fFloatValue = c0Var.f193119a.invoke(Float.valueOf(f14)).floatValue();
            c0Var.f193123e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            c0Var.f193124f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(l<? super Float, Float> lVar) {
        this.f193119a = lVar;
        Boolean bool = Boolean.FALSE;
        this.f193122d = p0.n(bool);
        this.f193123e = p0.n(bool);
        this.f193124f = p0.n(bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p008y1.e3
    public final boolean a() {
        return ((Boolean) this.f193122d.getF182175a()).booleanValue();
    }

    @Override // p008y1.e3
    public final Object b(k1 k1Var, p<? super o2, ? super d<? super Unit>, ? extends Object> pVar, d<? super Unit> dVar) {
        Object objE = o53.c0.e(new a(k1Var, pVar, null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    @Override // p008y1.e3
    public final float d(float f14) {
        return this.f193119a.invoke(Float.valueOf(f14)).floatValue();
    }
}
