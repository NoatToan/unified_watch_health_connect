package ohos.stage.ability.adapter;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import ohos.ace.adapter.ALog;

/* JADX INFO: loaded from: classes46.dex */
public class StageApplication extends Application {
    private static final String LOG_TAG = "StageApplication";
    private StageApplicationDelegate appDelegate = null;

    public boolean onShouldLoadUI() {
        return true;
    }

    @Override // android.app.Application
    public void onCreate() {
        ALog.i(LOG_TAG, "StageApplication onCreate called");
        super.onCreate();
        StageApplicationDelegate stageApplicationDelegate = new StageApplicationDelegate();
        this.appDelegate = stageApplicationDelegate;
        stageApplicationDelegate.initApplication(this);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        ALog.i(LOG_TAG, "StageApplication onConfigurationChanged called");
        super.onConfigurationChanged(configuration);
        StageApplicationDelegate stageApplicationDelegate = this.appDelegate;
        if (stageApplicationDelegate == null) {
            ALog.e(LOG_TAG, "appDelegate is null");
        } else {
            stageApplicationDelegate.onConfigurationChanged(configuration);
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        ALog.i(LOG_TAG, "StageApplication attachBaseContext called");
        if (context == null) {
            ALog.e(LOG_TAG, "context is null");
        } else {
            super.attachBaseContext(StageApplicationDelegate.attachLanguageContext(context));
        }
    }

    public static void preloadEtsModule(String str, String str2) {
        if (str == null || str.isEmpty()) {
            ALog.e(LOG_TAG, "moduleName is null");
        } else if (str2 == null || str2.isEmpty()) {
            ALog.e(LOG_TAG, "abilityName is null");
        } else {
            StageApplicationDelegate.nativePreloadModule(str, str2);
        }
    }
}
