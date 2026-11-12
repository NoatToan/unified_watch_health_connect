package uk1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import lc.u0;
import o13.r;
import org.json.JSONArray;
import org.json.JSONException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luk1/f;", "Lew/a;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f171892j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.biz.GetHRZonesConfigOperation$getZonesForAllSports$1", f = "GetHRZonesConfigOperation.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3, 137}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f171893a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f171895c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f171893a = obj;
            this.f171895c |= Integer.MIN_VALUE;
            return f.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar) {
        super(cVar);
        this.f171892j = cVar;
        cVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r8 == r1) goto L24;
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
            int i14 = aVar.f171895c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f171895c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objC = aVar.f171893a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f171895c;
        c cVar = this.f171892j;
        if (i15 == 0) {
            r.b(objC);
            if (cVar.f171879m) {
                wk1.a aVarA = wk1.a.C3455a.a(wk1.a.f185807b);
                aVar.f171895c = 1;
                objC = aVarA.C(new wk1.b(aVarA, null), aVar);
            } else {
                wk1.a aVarA2 = wk1.a.C3455a.a(wk1.a.f185807b);
                aVar.f171895c = 2;
                objC = aVarA2.C(new wk1.c(aVarA2, null), aVar);
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
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            u0.r();
            return null;
        }
        T t7 = ((v2.b) v2Var).f47386a;
        if (t7 == 0) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            aVar3.getClass();
            i2.a.f(a2Var, "GetHRZonesConfigOperation", "getZonesForAllSports: GCApiCaller.GCResponse data null.");
            vk1.b bVar = cVar.f171880n;
            bVar.f178581a = false;
            bVar.f178583c = false;
            bVar.f178582b = false;
            bVar.f178584d = false;
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        String str = (String) t7;
        if (str == null) {
            str = "";
        }
        try {
            c.m(cVar, new JSONArray(str));
            c.l(cVar);
            c.k(cVar);
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        } catch (JSONException e4) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.SETTINGS;
            aVar4.getClass();
            i2.a.g(a2Var2, "GetHRZonesConfigOperation", e4);
            vk1.b bVar2 = cVar.f171880n;
            bVar2.f178581a = false;
            bVar2.f178583c = false;
            bVar2.f178582b = false;
            bVar2.f178584d = false;
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
    }
}
