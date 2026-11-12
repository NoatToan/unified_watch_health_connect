package cd0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class m implements bd0.x.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f26828a;

    public m(l lVar) {
        this.f26828a = lVar;
    }

    @Override // bd0.x.c
    public final void a() {
        bd0.h0 h0Var = this.f26828a.f26816d;
        if (h0Var != null) {
            h0Var.u();
        }
    }

    @Override // bd0.x.c
    public final void b(yl2.e eVar) {
        bd0.h0 h0Var = this.f26828a.f26816d;
        if (h0Var != null) {
            h0Var.p(eVar);
        }
    }

    @Override // bd0.x.c
    public final void c(boolean z14, boolean z15, boolean z16, JSONObject jSONObject) {
        l lVar = this.f26828a;
        bd0.h0 h0Var = lVar.f26816d;
        if (h0Var != null) {
            h0Var.a0();
        }
        i2.a(a2.DEVICES, "BaseHybridDeviceSetupStrategy", ".evaluateDeviceRegistrationStatus()");
        lVar.f26825y = false;
        boolean zOptBoolean = jSONObject.optBoolean("aatOnThisAccount");
        boolean zOptBoolean2 = jSONObject.optBoolean("otherDeviceActiveWithCurrentUser");
        lVar.f26826z = jSONObject.optBoolean("thisDeviceAATOnOtherAccount");
        String strOptString = jSONObject.optString("deviceId");
        String strOptString2 = jSONObject.optString("currentAATDeviceId");
        if (zOptBoolean && !strOptString.equals(strOptString2)) {
            if (zOptBoolean2) {
                jSONObject.optString("currentAATName", lVar.f26813a.getString(R.string.no_value));
                bd0.h0 h0Var2 = lVar.f26816d;
                if (h0Var2 != null) {
                    h0Var2.M();
                    return;
                }
                return;
            }
            return;
        }
        lVar.f26825y = true;
        if (lVar.f26764j || !lVar.f26826z) {
            lVar.K();
        } else if (lVar.f26824x) {
            lVar.I();
        } else {
            lVar.K();
        }
    }
}
