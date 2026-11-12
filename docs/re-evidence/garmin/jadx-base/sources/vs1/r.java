package vs1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.SavedTrailsUseCase$fetchSavedTrails$1", f = "SavedTrailsUseCase.kt", l = {50, 62}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f179886b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f179886b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f179886b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e7, code lost:
    
        if (r14.a(r5, r13) == r0) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        ArrayList arrayList;
        p2 p2Var;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179885a;
        t tVar = this.f179886b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var2 = tVar.f179900i;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, pt1.h.a((pt1.h) value, true, false, null, null, false, null, 62)));
            ss1.a aVar2 = tVar.f179894c;
            this.f179885a = 1;
            obj = aVar2.g1(this);
            if (obj != aVar) {
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
        p2Var = tVar.f179900i;
        do {
            value3 = p2Var.getValue();
        } while (!p2Var.b(value3, pt1.h.a((pt1.h) value3, false, false, null, null, false, null, 62)));
        return Unit.INSTANCE;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            tVar.f179901j = true;
            p2 p2Var3 = tVar.f179899h;
            do {
                value2 = p2Var3.getValue();
                Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
                arrayList = new ArrayList(p13.y.r(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(lt1.j.c(lt1.j.f114865a, (qs1.d) it.next(), tVar.f179892a, false, null, tVar.f179898g.invoke(), 14));
                }
            } while (!p2Var3.b(value2, i53.a.e(arrayList)));
            tVar.b();
        } else if (v2Var instanceof v2.a) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GARMIN_TRAILS;
            v2.a aVar4 = (v2.a) v2Var;
            String str = "Error fetching saved trails: status " + aVar4.f47384b + ", message " + aVar4.f47385c;
            aVar3.getClass();
            i2.a.e(a2Var, str);
            h hVar = tVar.f179896e;
            pt1.k kVar = new pt1.k(tVar.f179892a.getString(R.string.txt_error_occurred), null, null, 6, null);
            this.f179885a = 2;
        }
        p2Var = tVar.f179900i;
        do {
            value3 = p2Var.getValue();
        } while (!p2Var.b(value3, pt1.h.a((pt1.h) value3, false, false, null, null, false, null, 62)));
        return Unit.INSTANCE;
    }
}
