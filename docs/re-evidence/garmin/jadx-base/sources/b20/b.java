package b20;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import ju0.e;
import ju0.f;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import t13.d;
import v13.c;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lb20/b;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "", "value", "Lkotlin/Function1;", "", "", "successListener", "Lju0/e;", "liveEventSharingRepo", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;ZLe23/l;Lju0/e;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f14478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l<String, Unit> f14479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f14480l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.biz.ConsentLiveEventSharingTask", f = "ConsentLiveEventSharingOperation.kt", l = {36}, m = "executeBackgroundWork", v = 2)
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f14481a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14483c;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f14481a = obj;
            this.f14483c |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, boolean z14, l<? super String, Unit> lVar, e eVar) {
        super(bVar);
        bVar.getClass();
        lVar.getClass();
        eVar.getClass();
        this.f14478j = z14;
        this.f14479k = lVar;
        this.f14480l = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ew.a
    public final Object d(d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f14483c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f14483c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f14481a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f14483c;
        if (i15 == 0) {
            r.b(objJ);
            f12.l.f68084a.getClass();
            String strQ2 = f12.l.a.a().Q2();
            String strU1 = f12.l.a.a().U1();
            aVar.f14483c = 1;
            e eVar = this.f14480l;
            eVar.getClass();
            objJ = f0.J(eVar, new f(eVar, this.f14478j, strQ2, strU1, null), aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            this.f14479k.invoke(((v2.b) v2Var).f47386a);
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(com.garmin.android.library.backgroundtaskmanagement.b bVar, boolean z14, l lVar, e eVar, int i14, j jVar) {
        if ((i14 & 8) != 0) {
            e.f100881g.getClass();
            eVar = e.a.a();
        }
        this(bVar, z14, lVar, eVar);
    }
}
