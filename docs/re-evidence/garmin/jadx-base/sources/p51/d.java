package p51;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.Iterator;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.presentation.viewmodel.PaceProListViewModel$deletePaceband$1", f = "PaceProListViewModel.kt", l = {129}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f136169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f136170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f136171c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, long j8, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f136170b = cVar;
        this.f136171c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f136170b, this.f136171c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        o51.d dVar;
        Iterable iterableY0;
        o51.c cVar;
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f136169a;
        long j8 = this.f136171c;
        c cVar2 = this.f136170b;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = cVar2.f136155d;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, o51.d.b((o51.d) value, true, false, false, null, null, 30)));
            r41.a aVar2 = cVar2.f136152a;
            this.f136169a = 1;
            aVar2.getClass();
            obj = f0.J(aVar2, new r41.c(aVar2, j8, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        if (((v2) obj) instanceof v2.b) {
            p2 p2Var2 = cVar2.f136155d;
            do {
                value3 = p2Var2.getValue();
                dVar = (o51.d) value3;
                iterableY0 = dVar.f129226d;
                if (iterableY0 != null) {
                    Iterator it = iterableY0.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((o51.c) next).f129221c != j8);
                    cVar = (o51.c) next;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    iterableY0 = h0.y0(iterableY0, cVar);
                }
            } while (!p2Var2.b(value3, o51.d.b(dVar, false, false, false, iterableY0 != null ? i53.a.j(iterableY0) : null, null, 23)));
        }
        p2 p2Var3 = cVar2.f136155d;
        do {
            value2 = p2Var3.getValue();
        } while (!p2Var3.b(value2, o51.d.b((o51.d) value2, false, false, false, null, null, 30)));
        return Unit.INSTANCE;
    }
}
