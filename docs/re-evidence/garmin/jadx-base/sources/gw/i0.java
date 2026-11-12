package gw;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgw/i0;", "Lew/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h0 f79507j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.operations.SaveAutoActivityDetectOperation$setAutoActivityTask$1", f = "SaveAutoActivityDetectOperation.kt", l = {19}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f79508a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f79510c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f79508a = obj;
            this.f79510c |= Integer.MIN_VALUE;
            return i0.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h0 h0Var) {
        super(h0Var);
        this.f79507j = h0Var;
        h0Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) throws JSONException {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f79510c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f79510c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f79508a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f79510c;
        if (i15 == 0) {
            o13.r.b(objJ);
            iw.e.f95262b.getClass();
            iw.e eVarA = iw.e.a.a();
            int i16 = h0.f79505m;
            h0 h0Var = this.f79507j;
            h0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Action.KEY_ATTRIBUTE, "WellnessAutoActivity.createNonHrActivity");
            jSONObject.put("value", String.valueOf(h0Var.f79506l));
            String string = jSONObject.toString();
            string.getClass();
            aVar.f79510c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(eVarA, new iw.j(eVarA, string, null), aVar);
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
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }
}
