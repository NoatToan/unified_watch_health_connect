package mr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.a1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetCompactActivityDetailsUseCase$getChildActivityType$1", f = "GetCompactActivityDetailsUseCase.kt", l = {229, 231}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<r53.j<? super List<? extends String>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f120247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f120248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f120249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f120250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f120251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f120252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f120253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f120254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ps.r f120255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g0 f120256j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ps.r rVar, g0 g0Var, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f120255i = rVar;
        this.f120256j = g0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c0 c0Var = new c0(this.f120255i, this.f120256j, dVar);
        c0Var.f120254h = obj;
        return c0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends String>> jVar, t13.d<? super Unit> dVar) {
        return ((c0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[LOOP:0: B:28:0x0098->B:30:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r14 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007e -> B:21:0x0081). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        int i14;
        Iterator it;
        Collection collection;
        int i15;
        g0 g0Var;
        int i16;
        ?? arrayList;
        Iterator it3;
        r53.j jVar = (r53.j) this.f120254h;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = this.f120253g;
        if (i17 == 0) {
            o13.r.b(obj);
            a1 metadataDTO = this.f120255i.getMetadataDTO();
            List<Long> listM = metadataDTO != null ? metadataDTO.m() : null;
            if (listM != null) {
                ArrayList arrayList2 = new ArrayList();
                i14 = 0;
                it = listM.iterator();
                collection = arrayList2;
                i15 = 0;
                g0Var = this.f120256j;
                i16 = 0;
                if (it.hasNext()) {
                    long jLongValue = ((Number) it.next()).longValue();
                    this.f120254h = jVar;
                    this.f120247a = g0Var;
                    this.f120248b = collection;
                    this.f120249c = it;
                    this.f120250d = i16;
                    this.f120251e = i14;
                    this.f120252f = i15;
                    this.f120253g = 1;
                    obj = g0.c(g0Var, jLongValue, this);
                } else {
                    list = (List) collection;
                }
                return aVar;
            }
            list = null;
            if (list != null) {
                arrayList = new ArrayList();
                it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((ps.r) it3.next()).h().f4358a);
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = p13.j0.f134944a;
            }
            this.f120254h = null;
            this.f120247a = null;
            this.f120248b = null;
            this.f120249c = null;
            this.f120253g = 2;
        } else {
            if (i17 == 1) {
                i15 = this.f120252f;
                i14 = this.f120251e;
                i16 = this.f120250d;
                it = this.f120249c;
                collection = this.f120248b;
                g0Var = this.f120247a;
                o13.r.b(obj);
                ps.r rVar = (ps.r) obj;
                if (rVar != null) {
                    collection.add(rVar);
                }
                if (it.hasNext()) {
                    long jLongValue2 = ((Number) it.next()).longValue();
                    this.f120254h = jVar;
                    this.f120247a = g0Var;
                    this.f120248b = collection;
                    this.f120249c = it;
                    this.f120250d = i16;
                    this.f120251e = i14;
                    this.f120252f = i15;
                    this.f120253g = 1;
                    obj = g0.c(g0Var, jLongValue2, this);
                } else {
                    list = (List) collection;
                    if (list != null) {
                        arrayList = new ArrayList();
                        it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((ps.r) it3.next()).h().f4358a);
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = p13.j0.f134944a;
                    }
                    this.f120254h = null;
                    this.f120247a = null;
                    this.f120248b = null;
                    this.f120249c = null;
                    this.f120253g = 2;
                }
                return aVar;
            }
            if (i17 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
