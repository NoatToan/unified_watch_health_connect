package qr;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lms1/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getCandidateTrails$1", f = "ActivityDetailsViewModel.kt", l = {2051, 2065}, m = "invokeSuspend", v = 2)
public final class c2 extends v13.i implements e23.p<r53.j<? super List<ms1.d>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f146128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f146129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f146130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f146131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f146132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<Long> f146133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f146134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f146135h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(List<Long> list, t tVar, long j8, t13.d<? super c2> dVar) {
        super(2, dVar);
        this.f146133f = list;
        this.f146134g = tVar;
        this.f146135h = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c2 c2Var = new c2(this.f146133f, this.f146134g, this.f146135h, dVar);
        c2Var.f146132e = obj;
        return c2Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<ms1.d>> jVar, t13.d<? super Unit> dVar) {
        return ((c2) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e7  */
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a9 -> B:30:0x00aa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qr.c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
