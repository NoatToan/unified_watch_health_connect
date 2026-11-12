package dm;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.segments.SegmentsFilterDTO;
import com.garmin.android.apps.connectmobile.segments.model.StravaStatusDTO;
import com.garmin.android.apps.connectmobile.v2;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldm/t0;", "Lew/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t0 extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u0 f60414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f60415k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.biz.SegmentsOperation$getStravaSegmentsTasks$1", f = "SegmentsOperation.kt", l = {37}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f60416a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60418c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f60416a = obj;
            this.f60418c |= Integer.MIN_VALUE;
            return t0.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, long j8) {
        super(u0Var);
        this.f60414j = u0Var;
        this.f60415k = j8;
        u0Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        StravaStatusDTO stravaStatusDTO;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f60418c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f60418c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objA0 = aVar.f60416a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f60418c;
        if (i15 == 0) {
            o13.r.b(objA0);
            am.d dVar2 = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
            aVar.f60418c = 1;
            objA0 = dVar2.a0(aVar);
            if (objA0 == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA0);
        }
        v2 v2Var = (v2) objA0;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            lc.u0.r();
            return null;
        }
        fr1.h hVar = new fr1.h();
        hVar.f73307b = (StravaStatusDTO) ((v2.b) v2Var).f47386a;
        if (!hVar.b() || !hVar.f() || !hVar.d() || (stravaStatusDTO = hVar.f73307b) == null || stravaStatusDTO.f41333e != StravaStatusDTO.c.OPT_IN) {
            try {
                SegmentsFilterDTO.c cVar = SegmentsFilterDTO.f41188q;
                String strValueOf = String.valueOf(this.f60415k);
                cVar.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("activityId", strValueOf);
                jSONObject.put("showFavorites", true);
                String string = jSONObject.toString();
                string.getClass();
                u0 u0Var = this.f60414j;
                int i16 = u0.f60420o;
                u0Var.getClass();
                cw.e.a(u0Var, new em.f(u0Var.f60421n, string, new s0(u0Var), true));
            } catch (JSONException e4) {
                a2 a2Var = a2.ACTIVITIES;
                String strN = fb1.c.n("Error creating json: ", e4.getMessage());
                i2.f36769a.getClass();
                i2.a.f(a2Var, "SegmentsOperation", strN);
            }
        }
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }
}
