package yt0;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/c0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.ChallengesRepository$getLimitedChallengesForLeaderBoard$result$1", f = "ChallengesRepository.kt", l = {89, 98}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.c0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTime f199553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DateTime f199554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f199555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f199556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f199557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f199558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0(j0 j0Var, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list, t13.d<? super n0> dVar) {
        super(1, dVar);
        this.f199557e = j0Var;
        this.f199558f = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n0(this.f199557e, this.f199558f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.c0>> dVar) {
        return ((n0) create(dVar)).invokeSuspend(Unit.INSTANCE);
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
        DateTime dateTimePlusDays;
        DateTime dateTimePlusDays2;
        boolean zV;
        Object objJ;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199556d;
        if (i14 == 0) {
            o13.r.b(obj);
            dateTimePlusDays = DateTime.now().plusDays(2 - Calendar.getInstance().get(7));
            dateTimePlusDays2 = dateTimePlusDays.plusDays(6);
            zV = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.v();
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            c80.q qVar = c80.q.SOCIAL;
            this.f199553a = dateTimePlusDays;
            this.f199554b = dateTimePlusDays2;
            this.f199555c = zV;
            this.f199556d = 1;
            objJ = j1Var.j(qVar, this);
            if (objJ != aVar) {
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z14 = this.f199555c;
        dateTimePlusDays2 = this.f199554b;
        dateTimePlusDays = this.f199553a;
        o13.r.b(obj);
        zV = z14;
        objJ = obj;
        lt0.d dVar = this.f199557e.f199515a;
        String string = dateTimePlusDays.toString("yyyy-MM-dd");
        string.getClass();
        String string2 = dateTimePlusDays2.toString("yyyy-MM-dd");
        string2.getClass();
        boolean z15 = !zV;
        boolean z16 = !(((c80.p) objJ) instanceof c80.p.c);
        int i15 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.x.v() ? vt0.b.PUSH : vt0.b.STEPS).f180060b;
        List<com.garmin.android.apps.connectmobile.userprofile.model.k> list = this.f199558f;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.garmin.android.apps.connectmobile.userprofile.model.k) it.next()).name());
        }
        o53.i0<c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.c0>> i0VarD = dVar.d(string, string2, z15, z15, z16, i15, arrayList);
        this.f199553a = null;
        this.f199554b = null;
        this.f199555c = zV;
        this.f199556d = 2;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
