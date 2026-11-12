package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", f = "Button.kt", l = {951}, m = "invokeSuspend")
public final class d1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.i f87814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f4.s<a2.h> f87815c;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f4.s<a2.h> f87816a;

        public a(f4.s<a2.h> sVar) {
            this.f87816a = sVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            a2.h hVar = (a2.h) obj;
            boolean z14 = hVar instanceof a2.e;
            f4.s<a2.h> sVar = this.f87816a;
            if (z14) {
                sVar.add(hVar);
            } else if (hVar instanceof a2.f) {
                sVar.remove(((a2.f) hVar).f489a);
            } else if (hVar instanceof a2.b) {
                sVar.add(hVar);
            } else if (hVar instanceof a2.c) {
                sVar.remove(((a2.c) hVar).f483a);
            } else if (hVar instanceof a2.l.b) {
                sVar.add(hVar);
            } else if (hVar instanceof a2.l.c) {
                sVar.remove(((a2.l.c) hVar).f498a);
            } else if (hVar instanceof a2.l.a) {
                sVar.remove(((a2.l.a) hVar).f496a);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(a2.i iVar, f4.s<a2.h> sVar, t13.d<? super d1> dVar) {
        super(2, dVar);
        this.f87814b = iVar;
        this.f87815c = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d1(this.f87814b, this.f87815c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87813a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.i<a2.h> iVarC = this.f87814b.c();
            a aVar2 = new a(this.f87815c);
            this.f87813a = 1;
            if (iVarC.collect(aVar2, this) == aVar) {
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
