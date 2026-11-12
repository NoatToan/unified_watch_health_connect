package l30;

import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo13/p;", "Lw20/a;", "Lr30/a;", "<destruct>", "", "<anonymous>", "(Lo13/p;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$clearChartOverlayWhenUnavailable$2", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o13.p<? extends w20.a, ? extends r30.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f109604b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z zVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f109604b = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f109604b, dVar);
        mVar.f109603a = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(o13.p<? extends w20.a, ? extends r30.a> pVar, t13.d<? super Unit> dVar) {
        return ((m) create(pVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p2 p2Var;
        Object value;
        i53.f fVarO;
        o13.p pVar = (o13.p) this.f109603a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        w20.a aVar2 = (w20.a) pVar.f128594a;
        r30.a aVar3 = (r30.a) pVar.f128595b;
        if (aVar3 != null) {
            if (aVar2 == null || ((fVarO = jg.b.o(aVar2)) != null && fVarO.isEmpty())) {
                p2Var = this.f109604b.f109668w;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, n30.f.a((n30.f) value, false, null, false, null, null, null, 0, false, null, null, 1023)));
            } else {
                Iterator<E> it = fVarO.iterator();
                while (it.hasNext()) {
                    if (((r30.b) it.next()).f149981a == aVar3) {
                    }
                }
                p2Var = this.f109604b.f109668w;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, n30.f.a((n30.f) value, false, null, false, null, null, null, 0, false, null, null, 1023)));
            }
        }
        return Unit.INSTANCE;
    }
}
