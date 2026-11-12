package hz0;

import am.x0;
import am.z0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedRepo$fetchNewsFeed$2", f = "NewsFeedRepo.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.l<t13.d<? super c83.a0<ActivityListDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f86468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f86469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f86470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, int i14, String str, t13.d<? super p> dVar) {
        super(1, dVar);
        this.f86468b = mVar;
        this.f86469c = i14;
        this.f86470d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p(this.f86468b, this.f86469c, this.f86470d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ActivityListDTO>> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.INSTANCE);
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
        int i14 = this.f86467a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        mz0.a.f121640a.getClass();
        nz0.b bVarA = mz0.a.a();
        Set<nz0.a> set = bVarA.f128379a;
        ArrayList arrayList = new ArrayList(p13.y.r(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((nz0.a) it.next()).f128376a);
        }
        Set<x0> set2 = bVarA.f128380b;
        ArrayList arrayList2 = new ArrayList(p13.y.r(set2, 10));
        Iterator<T> it3 = set2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new Integer(z0.n((x0) it3.next())));
        }
        pz0.c cVar = this.f86468b.f86459a;
        String str = (String) p13.h0.d0(arrayList);
        w13.c cVar2 = com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k;
        ArrayList arrayList3 = new ArrayList(p13.y.r(cVar2, 10));
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            arrayList3.add(((com.garmin.android.apps.connectmobile.userprofile.model.k) bVar.next()).name());
        }
        o53.i0<c83.a0<ActivityListDTO>> i0VarB = cVar.b(this.f86469c, this.f86470d, str, arrayList2, arrayList3);
        this.f86467a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
