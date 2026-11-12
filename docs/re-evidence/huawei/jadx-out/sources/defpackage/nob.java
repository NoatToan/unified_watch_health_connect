package defpackage;

import android.content.Context;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hwidauth.g.f;
import com.huawei.secure.android.common.intent.SafeBundle;

/* JADX INFO: loaded from: classes3.dex */
public class nob extends f<nna> {
    public nob(nna nnaVar, Context context, String str, f.a aVar) {
        this.f17584a = nnaVar;
        this.f17585b = context;
        this.f17586c = str;
        this.d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwidauth.g.f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(nna nnaVar, Response<ResponseBody> response) {
        nox.b("GetDevAuthCodeCase", "handleRequestGetDevAuthCode ==", true);
        int code = response.getCode();
        nox.b("GetDevAuthCodeCase", "code:" + code, true);
        if (code == 200) {
            try {
                nnaVar.e(new String(response.getBody().bytes(), "UTF-8"));
                if (nnaVar.j() == 0) {
                    SafeBundle safeBundle = new SafeBundle();
                    safeBundle.putString("devAuthCode", nnaVar.e());
                    safeBundle.putString("devSecretKey", nnaVar.d());
                    safeBundle.putString("randomID", nnaVar.f());
                    a(safeBundle);
                    return;
                }
                nox.b("GetDevAuthCodeCase", "getErrorCode ==" + nnaVar.g(), true);
                nox.b("GetDevAuthCodeCase", "getErrorDesc ==" + nnaVar.h(), false);
                a(nnaVar.g(), nnaVar.h());
                return;
            } catch (Exception e) {
                nox.b("GetDevAuthCodeCase", "Exception:" + e.getClass().getSimpleName(), true);
                a(2015, "Request Error:" + e.getClass().getSimpleName());
                return;
            }
        }
        a(2005, "Request Error:code is " + code);
    }
}
