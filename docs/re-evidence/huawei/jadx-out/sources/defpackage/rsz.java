package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import health.compact.a.GRSManager;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class rsz extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        SimpleChain.b("WatchFaceDetailStrategy").e(new SimpleChain.INext() { // from class: rte
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter2, Object[] objArr) {
                this.f47632a.e(emitter2, objArr);
            }
        }).d(new SimpleChain.Emitter() { // from class: rti
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                rsz.e(objArr);
            }
        }, new Object[0]);
        return true;
    }

    /* synthetic */ void e(final SimpleChain.Emitter emitter, Object[] objArr) {
        Executors.newCachedThreadPool().execute(new Runnable() { // from class: rtb
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(emitter);
            }
        });
    }

    /* synthetic */ void c(SimpleChain.Emitter emitter) {
        mca.a(BaseApplication.getContext());
        String str = mca.e(GRSManager.c(BaseApplication.getContext()).d()).get("watchFaceH5");
        Map<String, String> mapB = b("");
        emitter.onSuccess(String.format("%ssandbox/cch5/health/watchFace/index.html#/dial-detail?version=%s&fromHitopId=&hitopId=%s&from_sub=%s&contentType=600000&from=%s&isRefresh=false", str, mapB.get("watchfaceVersion"), mapB.get("watchFaceId"), mapB.get("from_sub"), mapB.get("from")));
    }

    static /* synthetic */ void e(final Object[] objArr) {
        Activity activityJ = com.huawei.haf.application.BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e("WatchFaceDetailStrategy", "startActivity fail for activity is null");
        } else {
            activityJ.runOnUiThread(new Runnable() { // from class: rtc
                @Override // java.lang.Runnable
                public final void run() {
                    rsz.a(objArr);
                }
            });
        }
    }

    static /* synthetic */ void a(Object[] objArr) {
        if (objArr.length > 0) {
            String string = objArr[0].toString();
            Intent intent = new Intent();
            intent.setClassName(dmz.y, "com.huawei.watchface.api.WebViewActivity");
            intent.putExtra("url", string);
            iov.d(BaseApplication.getContext(), intent);
        }
    }

    public Map<String, String> b(String str) {
        try {
            URI uri = new URI(str);
            HashMap map = new HashMap();
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null && !rawQuery.isEmpty()) {
                for (String str2 : rawQuery.split("&")) {
                    String[] strArrSplit = str2.split("=", 2);
                    if (strArrSplit.length > 0) {
                        map.put(strArrSplit[0], strArrSplit.length > 1 ? strArrSplit[1] : "");
                    }
                }
            }
            return map;
        } catch (URISyntaxException unused) {
            return new HashMap();
        }
    }
}
