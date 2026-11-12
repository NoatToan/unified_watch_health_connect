package i02;

import b5.a0;
import b82.r0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.m0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.ReorderableKt$detectDrag$4", f = "Reorderable.kt", l = {59}, m = "invokeSuspend", v = 2)
public final class i extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f86857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f86858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f86859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f86860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.p<a0, n4.c, Unit> f86861f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(long j8, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.p<? super a0, ? super n4.c, Unit> pVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f86858c = j8;
        this.f86859d = aVar;
        this.f86860e = aVar2;
        this.f86861f = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f86858c, this.f86859d, this.f86860e, this.f86861f, dVar);
        iVar.f86857b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
        return ((i) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b5.c cVar = (b5.c) this.f86857b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86856a;
        if (i14 == 0) {
            o13.r.b(obj);
            r0 r0Var = new r0(this.f86861f, 2);
            this.f86857b = cVar;
            this.f86856a = 1;
            obj = m0.i(cVar, this.f86858c, r0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            for (a0 a0Var : cVar.k0().f15870a) {
                if (b5.r.c(a0Var)) {
                    a0Var.a();
                }
            }
            this.f86859d.invoke();
        } else {
            this.f86860e.invoke();
        }
        return Unit.INSTANCE;
    }
}
