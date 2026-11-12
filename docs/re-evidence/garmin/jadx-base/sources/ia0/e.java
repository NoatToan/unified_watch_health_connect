package ia0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import r53.p2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.activityoptions.ActivityOptionsViewModel$fetchActivityOptions$1", f = "ActivityOptionsViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f92418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f92419b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f92419b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f92419b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        b bVar;
        ArrayList arrayList;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f92418a;
        g gVar = this.f92419b;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = gVar.f92427e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, b.a((b) value, null, false, false, false, true, false, 191)));
            y80.d dVar = gVar.f92425c;
            long j8 = gVar.f92423a;
            this.f92418a = 1;
            dVar.getClass();
            obj = f0.J(dVar, new y80.b(dVar, j8, null), this);
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
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            gVar.f92426d = (List) ((v2.b) v2Var).f47386a;
            p2 p2Var2 = gVar.f92427e;
            do {
                value3 = p2Var2.getValue();
                bVar = (b) value3;
                List<z80.g> listN0 = h0.N0(gVar.f92426d, new d(new c(), gVar));
                arrayList = new ArrayList();
                for (z80.g gVar2 : listN0) {
                    j90.a.f97780d.getClass();
                    j90.a aVarA = j90.a.C1867a.a(gVar2);
                    j90.b bVar2 = aVarA == null ? null : new j90.b(aVarA, gVar.f92424b.f82511a.contains(aVarA), s.g(gVar2.getEnabled(), Boolean.TRUE));
                    if (bVar2 != null) {
                        arrayList.add(bVar2);
                    }
                }
            } while (!p2Var2.b(value3, b.a(bVar, arrayList, false, false, false, false, false, 158)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            p2 p2Var3 = gVar.f92427e;
            do {
                value2 = p2Var3.getValue();
            } while (!p2Var3.b(value2, b.a((b) value2, null, false, false, true, false, false, 159)));
        }
        return Unit.INSTANCE;
    }
}
