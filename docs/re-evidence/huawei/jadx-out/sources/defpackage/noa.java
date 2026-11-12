package defpackage;

import android.content.Context;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hwidauth.g.f;
import com.huawei.secure.android.common.intent.SafeBundle;

/* JADX INFO: loaded from: classes3.dex */
public class noa extends f<nmx> {
    public noa(nmx nmxVar, Context context, String str, f.a aVar) {
        this.f17584a = nmxVar;
        this.f17585b = context;
        this.f17586c = str;
        this.d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwidauth.g.f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(nmx nmxVar, Response<ResponseBody> response) {
        int code = response.getCode();
        nox.b("GetConfigurationCase", "code:" + code, true);
        if (code == 200) {
            try {
                String str = new String(response.getBody().bytes(), "UTF-8");
                nox.b("GetConfigurationCase", "handleRequestNet data:".concat(str), false);
                nmxVar.e(str);
                if (nmxVar.j() == 0) {
                    SafeBundle safeBundle = new SafeBundle();
                    safeBundle.putString("response", nmxVar.d());
                    a(safeBundle);
                    return;
                }
                nox.b("GetConfigurationCase", "getErrorCode ==" + nmxVar.g(), true);
                nox.b("GetConfigurationCase", "getErrorDesc ==" + nmxVar.h(), false);
                a(nmxVar.g(), nmxVar.h());
                return;
            } catch (Exception e) {
                nox.b("GetConfigurationCase", "Exception:" + e.getClass().getSimpleName(), true);
                a(2015, "Request Error:" + e.getClass().getSimpleName());
                return;
            }
        }
        a(2005, "Request Error:code is " + code);
    }
}
