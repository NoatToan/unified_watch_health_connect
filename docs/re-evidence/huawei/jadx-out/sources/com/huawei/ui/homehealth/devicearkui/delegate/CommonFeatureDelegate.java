package com.huawei.ui.homehealth.devicearkui.delegate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.ui.homehealth.devicearkui.feature.BaseFeatureItem;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public abstract class CommonFeatureDelegate extends BaseFeatureDelegate {
    private DeviceInfo currentDeviceInfo;
    private AtomicBoolean doneRequestSupport;
    private View rootView;

    public CommonFeatureDelegate(ComponentActivity componentActivity) {
        super(componentActivity);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseFeatureDelegate, com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup);
        this.rootView = viewOnCreateView;
        return viewOnCreateView;
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public void setUserVisibleHint(boolean z) {
        DeviceInfo deviceInfo;
        if (!z || (deviceInfo = this.currentDeviceInfo) == null) {
            return;
        }
        refreshNeedUpdateItem(deviceInfo);
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate
    public void updateDevice(final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            this.rootView.setVisibility(8);
            this.doneRequestSupport = null;
            this.currentDeviceInfo = null;
            return;
        }
        this.currentDeviceInfo = deviceInfo;
        this.rootView.setVisibility(0);
        this.doneRequestSupport = new AtomicBoolean(false);
        final ArrayList arrayList = new ArrayList();
        this.defaultFeatureItems.forEach(new Consumer() { // from class: rxo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.e.m1674xd62130f6(arrayList, deviceInfo, (BaseFeatureItem) obj);
            }
        });
        refreshAllView(arrayList, deviceInfo);
        this.doneRequestSupport.set(true);
    }

    /* JADX INFO: renamed from: lambda$updateDevice$2$com-huawei-ui-homehealth-devicearkui-delegate-CommonFeatureDelegate, reason: not valid java name */
    public /* synthetic */ void m1674xd62130f6(List list, final DeviceInfo deviceInfo, BaseFeatureItem baseFeatureItem) {
        final AtomicBoolean atomicBoolean = this.doneRequestSupport;
        final AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(baseFeatureItem, false);
        list.add(simpleEntry);
        ((BaseFeatureItem) simpleEntry.getKey()).requestFeatureSupport(deviceInfo, new FeatureSupportCallback() { // from class: rxm
            @Override // com.huawei.devicefeature.FeatureSupportCallback
            public final void success(boolean z) {
                this.e.m1673xe4cfa175(atomicBoolean, simpleEntry, deviceInfo, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updateDevice$1$com-huawei-ui-homehealth-devicearkui-delegate-CommonFeatureDelegate, reason: not valid java name */
    public /* synthetic */ void m1673xe4cfa175(final AtomicBoolean atomicBoolean, final AbstractMap.SimpleEntry simpleEntry, final DeviceInfo deviceInfo, final boolean z) {
        this.activity.runOnUiThread(new Runnable() { // from class: rxk
            @Override // java.lang.Runnable
            public final void run() {
                this.e.m1672xf37e11f4(atomicBoolean, simpleEntry, z, deviceInfo);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updateDevice$0$com-huawei-ui-homehealth-devicearkui-delegate-CommonFeatureDelegate, reason: not valid java name */
    public /* synthetic */ void m1672xf37e11f4(AtomicBoolean atomicBoolean, AbstractMap.SimpleEntry simpleEntry, boolean z, DeviceInfo deviceInfo) {
        if (atomicBoolean != this.doneRequestSupport) {
            return;
        }
        simpleEntry.setValue(Boolean.valueOf(z));
        if (atomicBoolean.get()) {
            refreshItemView(simpleEntry, deviceInfo);
        }
    }
}
