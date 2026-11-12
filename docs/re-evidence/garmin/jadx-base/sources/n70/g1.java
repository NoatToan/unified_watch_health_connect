package n70;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lo70/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardQuickActionsUseCase$invoke$1", f = "GetDashboardQuickActionsUseCase.kt", l = {26, 38}, m = "invokeSuspend", v = 2)
public final class g1 extends v13.i implements e23.p<r53.j<? super List<? extends o70.e>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f124223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f124224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f124225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f124226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f124227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h1 f124228f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(boolean z14, boolean z15, h1 h1Var, t13.d<? super g1> dVar) {
        super(2, dVar);
        this.f124226d = z14;
        this.f124227e = z15;
        this.f124228f = h1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g1 g1Var = new g1(this.f124226d, this.f124227e, this.f124228f, dVar);
        g1Var.f124225c = obj;
        return g1Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends o70.e>> jVar, t13.d<? super Unit> dVar) {
        return ((g1) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (r0.emit(r2, r6) == r1) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayListX;
        r53.j jVar = (r53.j) this.f124225c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124224b;
        h1 h1Var = this.f124228f;
        if (i14 != 0) {
            if (i14 == 1) {
                arrayListX = this.f124223a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        arrayListX = v.h.x(obj);
        if (this.f124226d) {
            arrayListX.add(o70.e.f129952f);
        } else if (this.f124227e) {
            arrayListX.add(o70.e.f129951e);
        }
        arrayListX.add(o70.e.f129953g);
        arrayListX.add(o70.e.f129954h);
        if (h1Var.f124252a.w0()) {
            g gVar = h1Var.f124253b;
            this.f124225c = jVar;
            this.f124223a = arrayListX;
            this.f124224b = 1;
            obj = gVar.d(this);
        } else {
            if (h1Var.f124252a.k() && h1Var.f124252a.d()) {
                arrayListX.add(o70.e.f129956j);
            }
            arrayListX.add(o70.e.f129957k);
            arrayListX.add(o70.e.f129958l);
            this.f124225c = null;
            this.f124223a = null;
            this.f124224b = 2;
        }
        return aVar;
        if (((Boolean) obj).booleanValue()) {
            arrayListX.add(o70.e.f129955i);
        }
        if (h1Var.f124252a.k()) {
            arrayListX.add(o70.e.f129956j);
        }
        arrayListX.add(o70.e.f129957k);
        arrayListX.add(o70.e.f129958l);
        this.f124225c = null;
        this.f124223a = null;
        this.f124224b = 2;
    }
}
