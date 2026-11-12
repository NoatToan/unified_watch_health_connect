package yn1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyn1/a;", "Lew/a;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f198169j;

    /* JADX INFO: renamed from: yn1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.operations.GetAllRegisteredShortNamesOperation$addTasks$1", f = "GetAllRegisteredShortNamesOperation.kt", l = {21}, m = "executeBackgroundWork", v = 2)
    public static final class C3711a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f198170a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f198172c;

        public C3711a(t13.d<? super C3711a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f198170a = obj;
            this.f198172c |= Integer.MIN_VALUE;
            return a.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(bVar);
        this.f198169j = bVar;
        bVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        C3711a c3711a;
        if (dVar instanceof C3711a) {
            c3711a = (C3711a) dVar;
            int i14 = c3711a.f198172c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c3711a.f198172c = i14 - Integer.MIN_VALUE;
            } else {
                c3711a = new C3711a(dVar);
            }
        } else {
            c3711a = new C3711a(dVar);
        }
        Object objJ = c3711a.f198170a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c3711a.f198172c;
        b bVar = this.f198169j;
        if (i15 == 0) {
            r.b(objJ);
            zn1.a aVarA = zn1.a.C3840a.a(zn1.a.f205392b);
            long j8 = bVar.f198173l;
            c3711a.f198172c = 1;
            objJ = f0.J(aVarA, new zn1.b(aVarA, j8, null), c3711a);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            bVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, ((v2.b) v2Var).f47386a);
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }
}
