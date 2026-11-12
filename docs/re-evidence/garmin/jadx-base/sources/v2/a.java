package v2;

import android.view.View;
import kotlin.g3;
import p005kotlin.KotlinNothingValueException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li5/g3;", "", "<anonymous>", "(Li5/g3;)Ljava/lang/Void;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend", v = 1)
public final class a extends v13.i implements e23.p<g3, t13.d<?>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f174844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<e1, Unit> f174845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f174846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1.a f174847e;

    /* JADX INFO: renamed from: v2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Void;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend", v = 1)
    public static final class C3256a extends v13.i implements e23.p<o53.b0, t13.d<?>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f174849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g3 f174850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<e1, Unit> f174851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v2.b f174852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b1.a f174853f;

        /* JADX INFO: renamed from: v2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend", v = 1)
        public static final class C3257a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f174854a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v2.b f174855b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ u0 f174856c;

            /* JADX INFO: renamed from: v2.a$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C3258a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ u0 f174857a;

                public C3258a(u0 u0Var) {
                    this.f174857a = u0Var;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    this.f174857a.c();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3257a(v2.b bVar, u0 u0Var, t13.d<? super C3257a> dVar) {
                super(2, dVar);
                this.f174855b = bVar;
                this.f174856c = u0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3257a(this.f174855b, this.f174856c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3257a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
            
                if (r53.e2.m((r53.e2) r5, r1, r4) == r0) goto L18;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f174854a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    uu.o oVar = new uu.o(6);
                    this.f174854a = 1;
                    if (p3.g1.b(oVar, this) != aVar) {
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
                o2.c.f();
                return null;
                r53.y1<Unit> y1VarK = this.f174855b.k();
                if (y1VarK == null) {
                    return Unit.INSTANCE;
                }
                C3258a c3258a = new C3258a(this.f174856c);
                this.f174854a = 2;
            }
        }

        /* JADX INFO: renamed from: v2.a$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<o4.a1, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b1.a f174858a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b1.a aVar) {
                super(1, kotlin.jvm.internal.s.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                this.f174858a = aVar;
            }

            @Override // e23.l
            public final Unit invoke(o4.a1 a1Var) {
                float[] fArr = a1Var.f128808a;
                f5.c0 c0VarZ = this.f174858a.Z();
                if (c0VarZ != null) {
                    if (!c0VarZ.isAttached()) {
                        c0VarZ = null;
                    }
                    if (c0VarZ != null) {
                        c0VarZ.i0(fArr);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3256a(g3 g3Var, e23.l<? super e1, Unit> lVar, v2.b bVar, b1.a aVar, t13.d<? super C3256a> dVar) {
            super(2, dVar);
            this.f174850c = g3Var;
            this.f174851d = lVar;
            this.f174852e = bVar;
            this.f174853f = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C3256a c3256a = new C3256a(this.f174850c, this.f174851d, this.f174852e, this.f174853f, dVar);
            c3256a.f174849b = obj;
            return c3256a;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<?> dVar) {
            return ((C3256a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174848a;
            v2.b bVar = this.f174852e;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    o53.b0 b0Var = (o53.b0) this.f174849b;
                    c1.a aVar2 = c1.f174908a;
                    g3 g3Var = this.f174850c;
                    View f91361a = g3Var.getF91361a();
                    aVar2.getClass();
                    v0 v0Var = new v0(f91361a);
                    e1 e1Var = new e1(g3Var.getF91361a(), new b(this.f174853f), v0Var);
                    if (t2.d.f161762a) {
                        ge1.b.T(b0Var, null, null, new C3257a(bVar, v0Var, null), 3);
                    }
                    e23.l<e1, Unit> lVar = this.f174851d;
                    if (lVar != null) {
                        lVar.invoke(e1Var);
                    }
                    bVar.f174885c = e1Var;
                    this.f174848a = 1;
                    if (g3Var.a(e1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th3) {
                bVar.f174885c = null;
                throw th3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(e23.l<? super e1, Unit> lVar, b bVar, b1.a aVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f174845c = lVar;
        this.f174846d = bVar;
        this.f174847e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a aVar = new a(this.f174845c, this.f174846d, this.f174847e, dVar);
        aVar.f174844b = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(g3 g3Var, t13.d<?> dVar) {
        return ((a) create(g3Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174843a;
        if (i14 == 0) {
            o13.r.b(obj);
            C3256a c3256a = new C3256a((g3) this.f174844b, this.f174845c, this.f174846d, this.f174847e, null);
            this.f174843a = 1;
            if (o53.c0.e(c3256a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
