package defpackage;

import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.common.net.request.ReadOnlySecureRequest;
import com.miui.tsmclient.entity.NfcConfigsResponse;
import com.miui.tsmclient.net.TSMAuthContants;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class w8t extends ReadOnlySecureRequest<NfcConfigsResponse> {
    public w8t(String str) {
        super("GET", TSMAuthContants.URL_FETCH_NFC_CONFIGS, TypeToken.get(NfcConfigsResponse.class));
        addParams("deviceModel", ljs.b(null)).addParams(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().toString()).addParams(TSMAuthContants.PARAM_MIUI_ROM_TYPE, ljs.f(null)).addParams(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, ljs.n()).addParams("cplc", str);
    }
}
