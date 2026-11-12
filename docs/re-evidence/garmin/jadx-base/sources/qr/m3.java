package qr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lnr/m0;", "personalRecordsData", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getPersonalRecordsState$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m3 extends v13.i implements e23.p<List<? extends nr.m0>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ am.x0 f146346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f146347d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(t tVar, am.x0 x0Var, boolean z14, t13.d<? super m3> dVar) {
        super(2, dVar);
        this.f146345b = tVar;
        this.f146346c = x0Var;
        this.f146347d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m3 m3Var = new m3(this.f146345b, this.f146346c, this.f146347d, dVar);
        m3Var.f146344a = obj;
        return m3Var;
    }

    @Override // e23.p
    public final Object invoke(List<? extends nr.m0> list, t13.d<? super Unit> dVar) {
        return ((m3) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14;
        boolean z15;
        nr.p value;
        List list = (List) this.f146344a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        t tVar = this.f146345b;
        if (list != null && list.isEmpty()) {
            z14 = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((nr.m0) it.next()).f127260c) {
                    f12.l lVar = tVar.f146547p;
                    long j8 = tVar.f146575z;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((nr.m0) obj2).f127260c) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        q6.f.s(((nr.m0) it3.next()).f127258a, arrayList2);
                    }
                    if (!lVar.I0(j8, arrayList2)) {
                        z14 = true;
                        break;
                    }
                }
            }
            z14 = false;
            break;
        }
        am.x0 x0Var = this.f146346c;
        x0Var.getClass();
        String str = x0Var.f4358a;
        if (!(am.z0.W(str) || am.z0.b(am.x0.U0, str)) && (list == null || !list.isEmpty())) {
            Iterator it4 = list.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (((nr.m0) it4.next()).f127259b) {
                        f12.l lVar2 = tVar.f146547p;
                        long j14 = tVar.f146575z;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list) {
                            if (((nr.m0) obj3).f127259b) {
                                arrayList3.add(obj3);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                        Iterator it5 = arrayList3.iterator();
                        while (it5.hasNext()) {
                            q6.f.s(((nr.m0) it5.next()).f127258a, arrayList4);
                        }
                        if (!lVar2.I0(j14, arrayList4)) {
                            z15 = true;
                            break;
                        }
                    }
                }
                z15 = false;
                break;
            }
        }
        z15 = false;
        break;
        int i14 = t.A2;
        r53.z1<nr.p> z1VarA5 = tVar.a5();
        do {
            value = z1VarA5.getValue();
        } while (!z1VarA5.b(value, nr.p.a(value, list, tVar.C && this.f146347d && (z14 || z15), false, 28)));
        return Unit.INSTANCE;
    }
}
