package gw;

import com.garmin.android.apps.connectmobile.settings.model.Office365SettingDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgw/s;", "Lew/a;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f79539j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.operations.Office365ConnectOperation$addTasks$task$1", f = "Office365ConnectOperation.kt", l = {31}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f79540a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f79542c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f79540a = obj;
            this.f79542c |= Integer.MIN_VALUE;
            return s.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar) {
        super(tVar);
        this.f79539j = tVar;
        tVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f79542c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f79542c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f79540a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f79542c;
        t tVar = this.f79539j;
        if (i15 == 0) {
            o13.r.b(objJ);
            Office365SettingDTO office365SettingDTO = tVar.f79543l;
            hk1.m mVar = new hk1.m(office365SettingDTO.f43511a, office365SettingDTO.f43512b, office365SettingDTO.f43513c, office365SettingDTO.f43514d);
            nk1.a aVarA = nk1.a.C2431a.a(nk1.a.f126407b);
            aVar.f79542c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(aVarA, new nk1.b(aVarA, mVar, null), aVar);
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
            tVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, ((v2.b) v2Var).f47386a);
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }
}
