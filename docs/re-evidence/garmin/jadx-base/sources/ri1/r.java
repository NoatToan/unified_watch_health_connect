package ri1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachLTEActivationViewModel$checkPlanActive$1", f = "InReachLTEActivationViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f152881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f152882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f152883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f152884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f152885e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, boolean z14, boolean z15, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f152883c = pVar;
        this.f152884d = z14;
        this.f152885e = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f152883c, this.f152884d, this.f152885e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objE;
        boolean z14;
        boolean z15;
        Object value2;
        long j8;
        yx2.j jVar;
        List<yx2.i> list;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152882b;
        p pVar = this.f152883c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = pVar.f152865h;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, ti1.b.b((ti1.b) value, false, 61)));
            boolean zB = hb2.g.b(pVar.f152859b, hb2.g.a.GARMIN_MESSENGER);
            this.f152881a = zB;
            this.f152882b = 1;
            objE = xx2.b.e(false, null, null, null, this, 63);
            if (objE == aVar) {
                return aVar;
            }
            z14 = zB;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z16 = this.f152881a;
            o13.r.b(obj);
            z14 = z16;
            objE = obj;
        }
        yx2.n nVar = (yx2.n) ((xx2.e) objE).f192598a;
        if (nVar != null && (jVar = nVar.f200129b) != null && (list = jVar.f200105a) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (p005kotlin.jvm.internal.s.g(((yx2.i) obj2).f200089b, "OUT_INRSMP_C_META_P")) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                z15 = false;
                break;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z15 = false;
                    break;
                }
                if (((yx2.i) it.next()).f200098k) {
                    z15 = true;
                    break;
                }
            }
        } else {
            z15 = false;
            break;
        }
        p2 p2Var2 = pVar.f152865h;
        do {
            value2 = p2Var2.getValue();
            j8 = pVar.f152858a;
            ((ti1.b) value2).getClass();
        } while (!p2Var2.b(value2, new ti1.b(j8, false, z14, this.f152884d, this.f152885e, z15)));
        return Unit.INSTANCE;
    }
}
