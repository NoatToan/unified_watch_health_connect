package defpackage;

import com.miui.tsmclient.net.AuthRequest;
import com.miui.tsmclient.net.IAuthClient;
import com.miui.tsmclient.util.LogUtils;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.SimpleRequest;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class x3s {
    public Object a(AuthRequest authRequest) throws AccessDeniedException, IOException, AuthenticationFailureException {
        SimpleRequest.StringContent stringContentPostAsString = SimpleRequest.postAsString(authRequest.getRequestFullUrl(), authRequest.getParams(), authRequest.getCookies(), true);
        return authRequest.getRespContentType() == AuthRequest.RespContentType.json ? b(stringContentPostAsString) : stringContentPostAsString.getBody();
    }

    public final Object b(SimpleRequest.StringContent stringContent) throws IOException {
        if (stringContent == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(stringContent.getBody());
            if (jSONObject.optInt(IAuthClient.KEY_ERR_CODE) == 200) {
                return jSONObject.opt("data");
            }
            throw new IOException(jSONObject.optString("errDesc"));
        } catch (JSONException e) {
            LogUtils.e("failed to parse tsm api response", e);
            return null;
        }
    }
}
