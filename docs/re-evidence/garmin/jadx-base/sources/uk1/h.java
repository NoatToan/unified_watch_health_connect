package uk1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luk1/h;", "Lew/a;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f171899j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.biz.GetPowerZonesConfigOperation$addTasks$powerZonesTask$1", f = "GetPowerZonesConfigOperation.kt", l = {37, 39}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f171900a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f171902c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f171900a = obj;
            this.f171902c |= Integer.MIN_VALUE;
            return h.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar) {
        super(gVar);
        this.f171899j = gVar;
        gVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r10 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r10 == r2) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        v2 v2Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f171902c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f171902c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objC = aVar.f171900a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f171902c;
        g gVar = this.f171899j;
        if (i15 == 0) {
            r.b(objC);
            String str = gVar.f171897m;
            if (str == null) {
                str = "";
            }
            if (gVar.f171896l) {
                wk1.a aVarA = wk1.a.C3455a.a(wk1.a.f185807b);
                aVar.f171902c = 1;
                objC = aVarA.C(new wk1.f(aVarA, str, null), aVar);
            } else {
                wk1.a aVarA2 = wk1.a.C3455a.a(wk1.a.f185807b);
                aVar.f171902c = 2;
                objC = aVarA2.C(new wk1.e(aVarA2, str, null), aVar);
            }
            return aVar2;
        }
        if (i15 == 1) {
            r.b(objC);
            v2Var = (v2) objC;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objC);
            v2Var = (v2) objC;
        }
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            String str2 = "getPowerZonesTask.onError: " + ((v2.a) v2Var).f47383a;
            aVar3.getClass();
            i2.a.f(a2Var, "GetPowerZonesConfigOperation", str2);
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        T t7 = ((v2.b) v2Var).f47386a;
        if (t7 == 0) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.SETTINGS;
            aVar4.getClass();
            i2.a.f(a2Var2, "GetPowerZonesConfigOperation", "getPowerZonesTask: GCApiCaller.GCResponse data null.");
            boolean z14 = gVar.f171896l;
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        String str3 = (String) t7;
        try {
            JSONObject jSONObject = new JSONObject(str3 != null ? str3 : "");
            PowerZonesDTO powerZonesDTO = new PowerZonesDTO();
            boolean z15 = gVar.f171896l;
            ok1.b bVar = gVar.f171898n;
            if (z15) {
                powerZonesDTO.k(jSONObject);
                i2.a aVar5 = i2.f36769a;
                a2 a2Var3 = a2.SETTINGS;
                String str4 = "Created " + powerZonesDTO.f43986a + " dto from JSON.";
                aVar5.getClass();
                i2.a.b(a2Var3, "GetPowerZonesConfigOperation", str4);
                bVar.f132582a = powerZonesDTO;
            } else {
                bVar.f132582a = powerZonesDTO;
            }
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        } catch (JSONException e4) {
            i2.a aVar6 = i2.f36769a;
            a2 a2Var4 = a2.SETTINGS;
            aVar6.getClass();
            i2.a.g(a2Var4, "GetPowerZonesConfigOperation", e4);
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
    }
}
