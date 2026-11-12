package com.xiaomi.hm.health.model.account.secondaryscreen;

import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.page.PageType;
import kotlin.Lazy;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class CincoSecondaryScreen extends SecondaryScreen {
    private static final String TAG = "CincoSecondaryScreen";
    private static final Lazy<PropertyStoreApi> propertyStoreApiLazy = KoinJavaComponent.inject(PropertyStoreApi.class);
    private static volatile CincoSecondaryScreen sInstance;
    private boolean sync = false;

    private CincoSecondaryScreen() {
        String property = propertyStoreApiLazy.getValue().getProperty(Property.PROPERTY_SECONDARY_SCREEN_CINCO, "");
        HMLog.d(TAG, "json " + property, new Object[0]);
        if (property.isEmpty()) {
            createDefault();
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(property);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                this.mSecondaryModelList.add(new SecondaryModel(jSONObject.optInt(SecondaryScreen.KEY_PARENT, 0), jSONObject.optInt("type", 0), jSONObject.optBoolean("enable", false), jSONObject.optInt("index", 0), true));
            }
        } catch (Exception e) {
            HMLog.i(TAG, "exception " + e.getMessage(), new Object[0]);
            createDefault();
        }
    }

    private void createDefault() {
        this.mSecondaryModelList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 16, true, 0, true));
        this.mSecondaryModelList.add(new SecondaryModel(PageType.PAGE_SHORTCUT, 17, true, 1, true));
    }

    public static CincoSecondaryScreen get() {
        if (sInstance == null) {
            synchronized (CincoSecondaryScreen.class) {
                if (sInstance == null) {
                    sInstance = new CincoSecondaryScreen();
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
        propertyStoreApiLazy.getValue().setProperty(Property.PROPERTY_SECONDARY_SCREEN_CINCO, get().toString());
        this.sync = z;
    }

    public CincoSecondaryScreen setSync(boolean z) {
        this.sync = z;
        return this;
    }
}
