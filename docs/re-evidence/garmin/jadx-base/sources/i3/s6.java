package i3;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", l = {651}, m = "invokeSuspend")
public final class s6 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.i f89619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w6 f89620d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<a2.h> f89621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f89622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w6 f89623c;

        public a(List<a2.h> list, o53.b0 b0Var, w6 w6Var) {
            this.f89621a = list;
            this.f89622b = b0Var;
            this.f89623c = w6Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            a2.h hVar = (a2.h) obj;
            boolean z14 = hVar instanceof a2.e;
            List<a2.h> list = this.f89621a;
            if (z14) {
                list.add(hVar);
            } else if (hVar instanceof a2.f) {
                list.remove(((a2.f) hVar).f489a);
            } else if (hVar instanceof a2.b) {
                list.add(hVar);
            } else if (hVar instanceof a2.c) {
                list.remove(((a2.c) hVar).f483a);
            } else if (hVar instanceof a2.l.b) {
                list.add(hVar);
            } else if (hVar instanceof a2.l.c) {
                list.remove(((a2.l.c) hVar).f498a);
            } else if (hVar instanceof a2.l.a) {
                list.remove(((a2.l.a) hVar).f496a);
            }
            ge1.b.T(this.f89622b, null, null, new r6(this.f89623c, (a2.h) p13.h0.n0(list), null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(a2.i iVar, w6 w6Var, t13.d<? super s6> dVar) {
        super(2, dVar);
        this.f89619c = iVar;
        this.f89620d = w6Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s6 s6Var = new s6(this.f89619c, this.f89620d, dVar);
        s6Var.f89618b = obj;
        return s6Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s6) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f89617a;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.b0 b0Var = (o53.b0) this.f89618b;
            ArrayList arrayList = new ArrayList();
            r53.i<a2.h> iVarC = this.f89619c.c();
            a aVar2 = new a(arrayList, b0Var, this.f89620d);
            this.f89617a = 1;
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
