package gw;

import com.garmin.android.apps.connectmobile.settings.model.AutoActivityDetectDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgw/c;", "Lew/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f79488j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.operations.AutoActivityDetectOperation$addTasks$defaultAutoActivityDetect$1", f = "AutoActivityDetectOperation.kt", l = {33}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f79489a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f79491c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f79489a = obj;
            this.f79491c |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(dVar);
        this.f79488j = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f79491c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f79491c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f79489a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f79491c;
        if (i15 == 0) {
            o13.r.b(objJ);
            iw.e.f95262b.getClass();
            iw.e eVarA = iw.e.a.a();
            aVar.f79491c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(eVarA, new iw.g(eVarA, null), aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            ((AutoActivityDetectDTO) this.f79488j.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f43510c = ((AutoActivityDetectDTO) ((v2.b) v2Var).f47386a).f43510c;
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }
}
