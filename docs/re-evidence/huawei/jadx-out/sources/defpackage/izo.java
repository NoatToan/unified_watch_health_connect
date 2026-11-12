package defpackage;

import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwmap.callback.ReverseGeocodeResultCallback;
import com.huawei.hwmap.model.ReverseGeocodeResponse;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes33.dex */
public class izo {
    public static void c(final UiCallback<ReverseGeocodeResponse.Address> uiCallback, String str) {
        RunningRouteUtils.c(new GolfGetLocation.GetLocationCallback() { // from class: izo.2
            @Override // com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation.GetLocationCallback
            public void onSuccess(jpg jpgVar) {
                if (uiCallback == null) {
                    ReleaseLogUtil.a("Track_CommonMapUtils", "callback is null");
                    return;
                }
                LogUtil.a("Track_CommonMapUtils", "location is ", Double.valueOf(jpgVar.d), Double.valueOf(jpgVar.f38787a));
                izo.a(uiCallback, jpgVar);
            }

            @Override // com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation.GetLocationCallback
            public void onFailure(int i, String str2) {
                uiCallback.onFailure(-1, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final UiCallback<ReverseGeocodeResponse.Address> uiCallback, jpg jpgVar) {
        npx.a("getAddressInfo", jpgVar.f38787a, jpgVar.d, null, null, new ReverseGeocodeResultCallback() { // from class: izo.4
            @Override // com.huawei.hwmap.callback.ReverseGeocodeResultCallback
            public void onSuccess(ReverseGeocodeResponse reverseGeocodeResponse) {
                if (reverseGeocodeResponse == null) {
                    uiCallback.onFailure(-1, "onHWMapSearched response is null");
                    return;
                }
                LogUtil.a("Track_CommonMapUtils", "onHWMapSearched code ", reverseGeocodeResponse);
                if (reverseGeocodeResponse.getSites() == null || reverseGeocodeResponse.getSites().isEmpty()) {
                    uiCallback.onFailure(-1, "hwMapRequestLocation hwMapResult == null");
                    return;
                }
                ReverseGeocodeResponse.Site site = reverseGeocodeResponse.getSites().get(0);
                if (site == null || site.getAddress() == null) {
                    uiCallback.onFailure(-1, "hwMapRequestLocation siteResult or address == null");
                } else {
                    uiCallback.onSuccess(site.getAddress());
                }
            }

            @Override // com.huawei.hwmap.callback.ReverseGeocodeResultCallback
            public void onFailure(Throwable th) {
                uiCallback.onFailure(-1, ExceptionUtils.c(th));
            }
        });
    }
}
