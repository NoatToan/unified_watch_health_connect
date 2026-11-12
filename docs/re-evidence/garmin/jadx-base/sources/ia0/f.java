package ia0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.p2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.activityoptions.ActivityOptionsViewModel$saveSelectedActivities$1", f = "ActivityOptionsViewModel.kt", l = {111}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f92420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f92421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f92422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f92422c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f92422c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Object next;
        j90.a aVar;
        Object value2;
        Object value3;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f92421b;
        g gVar = this.f92422c;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = gVar.f92427e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, b.a((b) value, null, false, false, false, true, false, 191)));
            List<z80.g> list = gVar.f92426d;
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            for (z80.g gVar2 : list) {
                Iterator<T> it = ((b) gVar.f92427e.getValue()).f92408a.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    aVar = ((j90.b) next).f97788a;
                    j90.a.f97780d.getClass();
                } while (aVar != j90.a.C1867a.a(gVar2));
                j90.b bVar = (j90.b) next;
                arrayList2.add(z80.g.a(gVar2, Boolean.valueOf(bVar != null ? bVar.f97790c : false)));
            }
            y80.d dVar = gVar.f92425c;
            long j8 = gVar.f92423a;
            this.f92420a = arrayList2;
            this.f92421b = 1;
            dVar.getClass();
            obj = f0.J(dVar, new y80.c(dVar, j8, arrayList2, null), this);
            if (obj == aVar2) {
                return aVar2;
            }
            arrayList = arrayList2;
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = this.f92420a;
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            gVar.f92426d = arrayList;
            p2 p2Var2 = gVar.f92427e;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, b.a((b) value3, null, false, false, false, false, true, 31)));
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
