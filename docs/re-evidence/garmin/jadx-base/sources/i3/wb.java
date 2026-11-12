package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.SegmentedButtonKt$interactionCountAsState$1$1", f = "SegmentedButton.kt", l = {463}, m = "invokeSuspend")
public final class wb extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.i f90118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f90119c;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p3.n1 f90120a;

        public a(p3.n1 n1Var) {
            this.f90120a = n1Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            a2.h hVar = (a2.h) obj;
            boolean z14 = hVar instanceof a2.l.b;
            p3.n1 n1Var = this.f90120a;
            if (z14 || (hVar instanceof a2.b)) {
                n1Var.t(n1Var.getIntValue() + 1);
            } else if ((hVar instanceof a2.l.c) || (hVar instanceof a2.c) || (hVar instanceof a2.l.a)) {
                n1Var.t(n1Var.getIntValue() - 1);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(a2.i iVar, p3.n1 n1Var, t13.d<? super wb> dVar) {
        super(2, dVar);
        this.f90118b = iVar;
        this.f90119c = n1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new wb(this.f90118b, this.f90119c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((wb) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f90117a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.i<a2.h> iVarC = this.f90118b.c();
            a aVar2 = new a(this.f90119c);
            this.f90117a = 1;
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
