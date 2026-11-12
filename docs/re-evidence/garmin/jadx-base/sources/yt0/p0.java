package yt0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/c0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.ChallengesRepository$getNonCompletedChallenges$result$1", f = "ChallengesRepository.kt", l = {38, 45}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.l<t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.c0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f199573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f199574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<ot0.g> f199576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f199577f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p0(j0 j0Var, int i14, int i15, List<? extends ot0.g> list, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list2, t13.d<? super p0> dVar) {
        super(1, dVar);
        this.f199573b = j0Var;
        this.f199574c = i14;
        this.f199575d = i15;
        this.f199576e = list;
        this.f199577f = list2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p0(this.f199573b, this.f199574c, this.f199575d, this.f199576e, this.f199577f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.c0>> dVar) {
        return ((p0) create(dVar)).invokeSuspend(Unit.INSTANCE);
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
        int i14 = this.f199572a;
        if (i14 == 0) {
            o13.r.b(obj);
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            c80.q qVar = c80.q.SOCIAL;
            this.f199572a = 1;
            obj = j1Var.j(qVar, this);
            if (obj != aVar) {
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
        o13.r.b(obj);
        lt0.d dVar = this.f199573b.f199515a;
        boolean z14 = !(((c80.p) obj) instanceof c80.p.c);
        List<com.garmin.android.apps.connectmobile.userprofile.model.k> list = this.f199577f;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.garmin.android.apps.connectmobile.userprofile.model.k) it.next()).name());
        }
        o53.i0<c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.c0>> i0VarC = dVar.c(this.f199574c, this.f199575d, this.f199576e, z14, arrayList);
        this.f199572a = 2;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
