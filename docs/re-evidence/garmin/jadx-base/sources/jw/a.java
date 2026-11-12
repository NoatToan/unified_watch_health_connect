package jw;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljw/a;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "", "useCache", "Lkotlin/Function1;", "Lhv/h;", "", "onSuccess", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;ZLe23/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f101215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e23.l<hv.h, Unit> f101216k;

    /* JADX INFO: renamed from: jw.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.tasks.AllGarminDevicesTask", f = "AllGarminDevicesTask.kt", l = {18}, m = "executeBackgroundWork", v = 2)
    public static final class C1946a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f101217a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101219c;

        public C1946a(t13.d<? super C1946a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f101217a = obj;
            this.f101219c |= Integer.MIN_VALUE;
            return a.this.d(this);
        }
    }

    public /* synthetic */ a(com.garmin.android.library.backgroundtaskmanagement.b bVar, boolean z14, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? null : lVar);
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
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        C1946a c1946a;
        if (dVar instanceof C1946a) {
            c1946a = (C1946a) dVar;
            int i14 = c1946a.f101219c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c1946a.f101219c = i14 - Integer.MIN_VALUE;
            } else {
                c1946a = new C1946a(dVar);
            }
        } else {
            c1946a = new C1946a(dVar);
        }
        Object objD = c1946a.f101217a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c1946a.f101219c;
        if (i15 == 0) {
            o13.r.b(objD);
            pc0.j jVarA = pc0.j.a.a(pc0.j.f137223i);
            c1946a.f101219c = 1;
            objD = pc0.j.d(jVarA, this.f101215j, c1946a);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        v2 v2Var = (v2) objD;
        if (v2Var instanceof v2.b) {
            e23.l<hv.h, Unit> lVar = this.f101216k;
            if (lVar != null) {
                lVar.invoke(((v2.b) v2Var).f47386a);
            }
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, boolean z14) {
        this(bVar, z14, null, 4, null);
        bVar.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, boolean z14, e23.l<? super hv.h, Unit> lVar) {
        super(bVar);
        bVar.getClass();
        this.f101215j = z14;
        this.f101216k = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar) {
        this(bVar, false, null, 6, null);
        bVar.getClass();
    }
}
