package com.xiaomi.hm.health.model.account.secondaryscreen;

import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import kotlin.Lazy;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class PeytoSecondaryScreen extends SecondaryScreen {
    private static final String TAG = "PeytoSecondaryScreen";
    private static final Lazy<PropertyStoreApi> propertyStoreApiLazy = KoinJavaComponent.inject(PropertyStoreApi.class);
    private static volatile PeytoSecondaryScreen sInstance;
    private boolean sync = false;

    private PeytoSecondaryScreen() {
        String property = propertyStoreApiLazy.getValue().getProperty(Property.PROPERTY_SECONDARY_SCREEN_CHAOHU, "");
        HMLog.d(TAG, "json " + property, new Object[0]);
        if (property.contains("enable")) {
            try {
                JSONArray jSONArray = new JSONArray(property);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int iOptInt = jSONObject.optInt("type", 0);
                    boolean zOptBoolean = jSONObject.optBoolean("enable", false);
                    int iOptInt2 = jSONObject.optInt("index", 0);
                    boolean zOptBoolean2 = jSONObject.optBoolean(SecondaryScreen.KEY_UPDATED, false);
                    SecondaryModel secondaryModel = new SecondaryModel(iOptInt, zOptBoolean, iOptInt2);
                    if (!zOptBoolean2 && iOptInt == 1) {
                        secondaryModel.setEnable(HMAppSortDataManager.shouldShowAlipay());
                        secondaryModel.setUpdated(true);
                    }
                    this.mSecondaryModelList.add(secondaryModel);
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (property.contains("type")) {
            try {
                if (new JSONObject(property).optInt("type", 0) == 0) {
                    this.mSecondaryModelList.add(new SecondaryModel(1, false, 1));
                    this.mSecondaryModelList.add(new SecondaryModel(2, true, 0));
                } else {
                    this.mSecondaryModelList.add(new SecondaryModel(1, true, 0));
                    this.mSecondaryModelList.add(new SecondaryModel(2, true, 1));
                }
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (property.equals("0")) {
            this.mSecondaryModelList.add(new SecondaryModel(1, false, 1));
            this.mSecondaryModelList.add(new SecondaryModel(2, true, 0));
            return;
        }
        if (property.equals("1")) {
            this.mSecondaryModelList.add(new SecondaryModel(1, true, 0));
            this.mSecondaryModelList.add(new SecondaryModel(2, true, 1));
        } else {
            if (HMAppSortDataManager.shouldShowAlipay()) {
                SecondaryModel secondaryModel2 = new SecondaryModel(1, true, 0);
                secondaryModel2.setUpdated(true);
                this.mSecondaryModelList.add(secondaryModel2);
                this.mSecondaryModelList.add(new SecondaryModel(2, true, 1));
                return;
            }
            this.mSecondaryModelList.add(new SecondaryModel(2, true, 0));
            SecondaryModel secondaryModel3 = new SecondaryModel(1, false, 1);
            secondaryModel3.setUpdated(true);
            this.mSecondaryModelList.add(secondaryModel3);
        }
    }

    public static PeytoSecondaryScreen get() {
        if (sInstance == null) {
            synchronized (PeytoSecondaryScreen.class) {
                if (sInstance == null) {
                    sInstance = new PeytoSecondaryScreen();
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

    public PeytoSecondaryScreen setSync(boolean z) {
        this.sync = z;
        return this;
    }
}
