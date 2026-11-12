package ze;

import e23.p;
import java.util.Objects;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import ue.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lye/b;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {63}, m = "invokeSuspend")
public final class a extends v13.i implements p<t<? super ye.b>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b<Object> f204249c;

    /* JADX INFO: renamed from: ze.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"ze/a$a", "Lye/a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3810a implements ye.a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<Object> f204250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t<ye.b> f204251b;

        /* JADX WARN: Multi-variable type inference failed */
        public C3810a(b<Object> bVar, t<? super ye.b> tVar) {
            this.f204250a = bVar;
            this.f204251b = tVar;
        }

        @Override // ye.a
        public final void a(Object obj) {
            b<Object> bVar = this.f204250a;
            this.f204251b.getChannel().i(bVar.d(obj) ? new ye.b.C3684b(bVar.getF204259b()) : ye.b.a.f196778a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b<Object> bVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f204249c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a aVar = new a(this.f204249c, dVar);
        aVar.f204248b = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super ye.b> tVar, t13.d<? super Unit> dVar) {
        return ((a) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.Object] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204247a;
        if (i14 == 0) {
            r.b(obj);
            t tVar = (t) this.f204248b;
            C3810a c3810a = new C3810a(this.f204249c, tVar);
            af.g<Object> gVar = this.f204249c.f204252a;
            synchronized (gVar.f3020c) {
                try {
                    if (gVar.f3021d.add(c3810a)) {
                        if (gVar.f3021d.size() == 1) {
                            gVar.f3022e = gVar.a();
                            u uVarA = u.a();
                            int i15 = af.h.f3023a;
                            Objects.toString(gVar.f3022e);
                            uVarA.getClass();
                            gVar.c();
                        }
                        c3810a.a(gVar.f3022e);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            z10.d dVar = new z10.d(12, this.f204249c, c3810a);
            this.f204247a = 1;
            if (q53.r.a(tVar, dVar, this) == aVar) {
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
