package defpackage;

import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.ReadOnlySecureRequest;
import com.miui.tsmclient.entity.ConfigInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.DeviceUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class zus extends ReadOnlySecureRequest<ConfigInfo> {
    public zus(String str, ResponseListener<ConfigInfo> responseListener) {
        super("POST", TSMAuthContants.URL_QUERY_CONFIG, ConfigInfo.class, responseListener);
        addParams("deviceModel", DeviceUtils.getDeviceModel(null)).addParams("cardName", str).addParams(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().toString()).addParams(TSMAuthContants.PARAM_MIUI_ROM_TYPE, DeviceUtils.getMIUIRomType(null)).addParams(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, DeviceUtils.getRomVersion());
    }
}
