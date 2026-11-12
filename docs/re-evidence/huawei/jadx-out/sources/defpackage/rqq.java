package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import java.util.HashMap;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class rqq extends FeatureBaseStrategy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<String, String> f47582b = new HashMap<>();

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithOtaTransfering() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        if (this.mDeviceInfo == null) {
            LogUtil.j("DeviceGuideStrategy", "jumpPageToFace deviceInfo == null");
            return false;
        }
        if (f47582b.containsKey(this.mDeviceInfo.getDeviceIdentify())) {
            d(f47582b.get(this.mDeviceInfo.getDeviceIdentify()));
        } else {
            SimpleChain.b("DeviceGuideStrategy").e(new SimpleChain.INext() { // from class: rqn
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
                public final void onNext(SimpleChain.Emitter emitter2, Object[] objArr) {
                    this.e.b(emitter2, objArr);
                }
            }).d(new SimpleChain.Emitter() { // from class: rqm
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public final void onSuccess(Object[] objArr) {
                    this.f47580a.c(objArr);
                }
            }, new Object[0]);
        }
        return true;
    }

    /* synthetic */ void b(SimpleChain.Emitter emitter, Object[] objArr) {
        c(emitter);
    }

    /* synthetic */ void c(Object[] objArr) {
        d(f47582b.get(this.mDeviceInfo.getDeviceIdentify()));
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d(this.mDeviceInfo);
    }

    private void c(final SimpleChain.Emitter emitter) {
        Executors.newCachedThreadPool().execute(new Runnable() { // from class: rqo
            @Override // java.lang.Runnable
            public final void run() {
                this.f47581c.b(emitter);
            }
        });
    }

    /* synthetic */ void b(SimpleChain.Emitter emitter) {
        String strD = tqu.e().d(this.mDeviceInfo);
        f47582b.put(this.mDeviceInfo.getDeviceIdentify(), strD);
        if (!TextUtils.isEmpty(strD)) {
            emitter.onSuccess(new Object[0]);
        } else {
            emitter.onError("jumpPageToHelp errorCode: url is empty");
        }
    }

    public void d(String str) {
        LogUtil.d("DeviceGuideStrategy", "enter openAppHelpActivity");
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", str);
        intent.putExtra(Constants.JUMP_MODE_KEY, 0);
        iov.d(BaseApplication.getContext(), intent);
    }
}
