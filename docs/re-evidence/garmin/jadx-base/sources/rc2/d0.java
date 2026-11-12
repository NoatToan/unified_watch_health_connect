package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import i3.e5;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrc2/d0;", "Lrc2/i;", "Lve2/i;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "customerGUID", "it2AccessToken", "thisAppITClientIdLoggingOnly", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 extends i<ve2.i> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f151887h = 0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.lib.networking.authentication.itapi.ITMFALoginInfoRequest", f = "ITMFALoginInfoRequest.kt", l = {51}, m = "execute$networking_core_release")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f151888a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f151890c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f151888a = obj;
            this.f151890c |= Integer.MIN_VALUE;
            return d0.this.c(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(Context context, ve2.e eVar, String str, String str2, String str3) {
        context.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        Logger loggerB = nd2.c.b("ITMFALoginInfoRequest");
        loggerB.getClass();
        super(context, loggerB, str2, new URL(e5.g(ve2.f.a(eVar), "/mfaLoginInfo/", str)), str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // rc2.j
    public final Object c(t13.d<? super wc2.a<ve2.i>> dVar) throws JSONException {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f151890c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f151890c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objD = aVar.f151888a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f151890c;
        if (i15 == 0) {
            o13.r.b(objD);
            aVar.f151890c = 1;
            objD = d();
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        wc2.a aVar2 = (wc2.a) objD;
        if (aVar2 instanceof wc2.a.C3415a) {
            return aVar2;
        }
        aVar2.getClass();
        T t7 = ((wc2.a.b) aVar2).f184316a;
        t7.getClass();
        String str = ((sc2.r) t7).f158564a;
        str.getClass();
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("customerGUID", "");
        strOptString.getClass();
        String strOptString2 = jSONObject.optString("mfaMethod");
        strOptString2.getClass();
        ve2.j jVarB0 = oe2.f.b0(strOptString2);
        String strOptString3 = jSONObject.optString("mfaLastUsedMode");
        strOptString3.getClass();
        ve2.i iVar = new ve2.i(strOptString, jVarB0, oe2.f.b0(strOptString3));
        if (nd2.c.f125412a) {
            this.f151915a.debug(jSONObject.toString(4));
        }
        return new wc2.a.b(iVar, 200);
    }
}
