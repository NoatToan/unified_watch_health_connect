package l52;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl$getMyWorkouts$3", f = "WorkoutsRepositoryImpl.kt", l = {107}, m = "invokeSuspend", v = 2)
public final class i1 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends WorkoutDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f110281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<m52.k> f110282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f110283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f110284e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i1(z zVar, List<? extends m52.k> list, int i14, int i15, t13.d<? super i1> dVar) {
        super(1, dVar);
        this.f110281b = zVar;
        this.f110282c = list;
        this.f110283d = i14;
        this.f110284e = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i1(this.f110281b, this.f110282c, this.f110283d, this.f110284e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends WorkoutDTO>>> dVar) {
        return ((i1) create(dVar)).invokeSuspend(Unit.INSTANCE);
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
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110280a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        x xVar = this.f110281b.f110390a;
        List<m52.k> list = this.f110282c;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((m52.k) it.next()).f116765a);
        }
        o53.i0<c83.a0<List<WorkoutDTO>>> i0VarE = xVar.E(arrayList, this.f110283d, this.f110284e);
        this.f110280a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
