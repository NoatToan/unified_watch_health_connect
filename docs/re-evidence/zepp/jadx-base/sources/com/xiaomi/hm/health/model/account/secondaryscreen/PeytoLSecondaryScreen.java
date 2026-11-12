package com.xiaomi.hm.health.model.account.secondaryscreen;

import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.network.hmnetwork.properties.Property;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class PeytoLSecondaryScreen extends SecondaryScreen {
    private static final String TAG = "PeytoLSecondaryScreen";
    private static final Lazy<PropertyStoreApi> propertyStoreApiLazy = KoinJavaComponent.inject(PropertyStoreApi.class);
    private static volatile PeytoLSecondaryScreen sInstance;
    private boolean sync = false;

    private PeytoLSecondaryScreen() {
        if (HMAppSortDataManager.shouldShowAlipay()) {
            SecondaryModel secondaryModel = new SecondaryModel(1, true, 0);
            secondaryModel.setUpdated(true);
            this.mSecondaryModelList.add(secondaryModel);
            this.mSecondaryModelList.add(new SecondaryModel(2, true, 1));
            return;
        }
        this.mSecondaryModelList.add(new SecondaryModel(2, true, 0));
        SecondaryModel secondaryModel2 = new SecondaryModel(1, false, 1);
        secondaryModel2.setUpdated(true);
        this.mSecondaryModelList.add(secondaryModel2);
    }

    public static PeytoLSecondaryScreen get() {
        if (sInstance == null) {
            synchronized (PeytoLSecondaryScreen.class) {
                if (sInstance == null) {
                    sInstance = new PeytoLSecondaryScreen();
                }
            }
        }
        SecondaryScreen.sInstances.add(sInstance);
        return sInstance;
    }

    @Override // com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryScreen
    public void clear() {
        sInstance = null;
    }

    public boolean getSync() {
        return this.sync;
    }

    @Override // com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryScreen
    public void save(boolean z) {
        propertyStoreApiLazy.getValue().setProperty(Property.PROPERTY_SECONDARY_SCREEN_CHAOHU, get().toString());
        this.sync = z;
    }

    public PeytoLSecondaryScreen setSync(boolean z) {
        this.sync = z;
        return this;
    }
}
