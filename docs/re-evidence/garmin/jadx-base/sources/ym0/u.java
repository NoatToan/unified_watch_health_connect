package ym0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ljo1/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$getGroupAllFeed$2", f = "GroupRepo.kt", l = {388}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.l<t13.d<? super c83.a0<jo1.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f198058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f198059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f198060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f198061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f198062f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(a aVar, String str, int i14, String str2, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list, t13.d<? super u> dVar) {
        super(1, dVar);
        this.f198058b = aVar;
        this.f198059c = str;
        this.f198060d = i14;
        this.f198061e = str2;
        this.f198062f = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new u(this.f198058b, this.f198059c, this.f198060d, this.f198061e, this.f198062f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<jo1.c>> dVar) {
        return ((u) create(dVar)).invokeSuspend(Unit.INSTANCE);
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
        int i14 = this.f198057a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        zm0.a aVar2 = this.f198058b.f197888b;
        List<com.garmin.android.apps.connectmobile.userprofile.model.k> list = this.f198062f;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.garmin.android.apps.connectmobile.userprofile.model.k) it.next()).name());
        }
        o53.i0<c83.a0<jo1.c>> i0VarA = aVar2.a(this.f198059c, this.f198060d, this.f198061e, arrayList, true, true);
        this.f198057a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
