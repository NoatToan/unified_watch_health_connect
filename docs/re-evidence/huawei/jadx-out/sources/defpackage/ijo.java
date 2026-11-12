package defpackage;

import android.text.TextUtils;
import com.huawei.health.themecloud.ThemeCloudApi;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class ijo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ijo f37719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThemeCloudApi f37720b = (ThemeCloudApi) oet.d().e(ThemeCloudApi.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ijl f37721c = new ijl();

    private ijo() {
    }

    public static ijo a() {
        if (f37719a == null) {
            f37719a = new ijo();
        }
        return f37719a;
    }

    public void a(ijr ijrVar, Map<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("ThemeCloudManager", "enter productQueryByType");
        Map<String, String> headers = this.f37721c.getHeaders();
        if (!ijrVar.d().isEmpty()) {
            headers.putAll(ijrVar.d());
        }
        String strE = e(ijrVar.d());
        if (!TextUtils.isEmpty(strE)) {
            headers.put(WatchFaceConstant.X_SIGN, strE);
        }
        this.f37720b.productQueryByType(ijrVar.getUrl(), headers, map).enqueue(new c(iBaseResponseCallback));
    }

    private String e(Map<String, String> map) {
        String strA;
        ijs ijsVar = new ijs();
        Map<String, String> headers = this.f37721c.getHeaders();
        if (!map.isEmpty()) {
            headers.putAll(map);
        }
        HashMap map2 = new HashMap();
        if (map.containsKey("deviceid")) {
            map2.put(JsbMapKeyNames.H5_USER_ID, map.get("deviceid"));
        }
        if (map.containsKey("x-devicemodel")) {
            map2.put("phoneType", map.get("x-devicemodel"));
        }
        try {
            Response<iju> responseExecute = this.f37720b.getSign(ijsVar.getUrl(), headers, ijsVar.c(map2)).execute();
            if (responseExecute.isOK() && responseExecute.getBody() != null) {
                strA = responseExecute.getBody().a();
            } else {
                strA = "";
            }
        } catch (IOException e) {
            LogUtil.e("ThemeCloudManager", "getWatchSign IOException:", e.getMessage());
        }
        LogUtil.a("ThemeCloudManager", "getWatchSign sign:", strA);
        return strA;
    }

    static class c implements ResultCallback {
        private IBaseResponseCallback d;

        c(IBaseResponseCallback iBaseResponseCallback) {
            this.d = iBaseResponseCallback;
        }

        @Override // com.huawei.hms.framework.network.restclient.ResultCallback
        public void onResponse(Response response) {
            if (response == null || !(response.getBody() instanceof ijw)) {
                LogUtil.e("ThemeCloudManager", "ThemeCloudCallBack rsp is null");
                IBaseResponseCallback iBaseResponseCallback = this.d;
                if (iBaseResponseCallback == null) {
                    return;
                }
                iBaseResponseCallback.a(-1, null);
                return;
            }
            ijw ijwVar = (ijw) response.getBody();
            String strB = ijwVar.b();
            LogUtil.a("ThemeCloudManager", "ThemeCloudCallBack resultCode= ", strB, ",resultInfo=", ijwVar.d());
            if (this.d == null) {
                return;
            }
            if (!"00000".equals(strB)) {
                this.d.a(-1, null);
            } else {
                this.d.a(0, ijwVar);
            }
        }

        @Override // com.huawei.hms.framework.network.restclient.ResultCallback
        public void onFailure(Throwable th) {
            LogUtil.e("ThemeCloudManager", "ThemeCloudCallBack IOException ", th.getMessage());
            IBaseResponseCallback iBaseResponseCallback = this.d;
            if (iBaseResponseCallback == null) {
                return;
            }
            iBaseResponseCallback.a(-1, null);
        }
    }
}
