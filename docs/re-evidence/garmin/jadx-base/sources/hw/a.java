package hw;

import com.garmin.android.apps.connectmobile.segments.model.StravaStatusDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhw/a;", "Lew/a;", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f85920j;

    /* JADX INFO: renamed from: hw.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.operations.strava.GetStravaConnectionStatusTask$addTasks$stravaConnectionStatus$1", f = "GetStravaConnectionStatusTask.kt", l = {24}, m = "executeBackgroundWork", v = 2)
    public static final class C1707a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f85921a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f85923c;

        public C1707a(t13.d<? super C1707a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f85921a = obj;
            this.f85923c |= Integer.MIN_VALUE;
            return a.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(cVar);
        this.f85920j = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        C1707a c1707a;
        if (dVar instanceof C1707a) {
            c1707a = (C1707a) dVar;
            int i14 = c1707a.f85923c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c1707a.f85923c = i14 - Integer.MIN_VALUE;
            } else {
                c1707a = new C1707a(dVar);
            }
        } else {
            c1707a = new C1707a(dVar);
        }
        Object objA = c1707a.f85921a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c1707a.f85923c;
        if (i15 == 0) {
            r.b(objA);
            gr1.b.f78550d.getClass();
            gr1.b bVarA = gr1.b.a.a();
            c1707a.f85923c = 1;
            objA = bVarA.a(c1707a);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            u0.r();
            return null;
        }
        fr1.h hVar = new fr1.h();
        c cVar = this.f85920j;
        cVar.f85930m = hVar;
        StravaStatusDTO stravaStatusDTO = (StravaStatusDTO) ((v2.b) v2Var).f47386a;
        hVar.f73307b = stravaStatusDTO;
        if (cVar.f85929l) {
            cVar.b(new b(cVar, stravaStatusDTO.f41330b && stravaStatusDTO.f41331c));
        } else {
            cVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, hVar);
        }
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }
}
