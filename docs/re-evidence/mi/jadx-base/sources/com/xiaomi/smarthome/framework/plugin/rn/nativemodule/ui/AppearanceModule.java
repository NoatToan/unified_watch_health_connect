package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTBaseJavaModule;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTAppearance;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import defpackage.ndj;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
@ndj(name = AppearanceModule.NAME)
public class AppearanceModule extends MIOTBaseJavaModule implements ReactModuleWithSpec, IMIOTAppearance {
    public static final String APPEARANCE_CHANGED_ACTION = "android.intent.action.CONFIGURATION_CHANGED";
    public static final String NAME = "Appearance";
    private String mColorScheme;
    private final BroadcastReceiver mReceiver;
    private final ReactApplicationContext reactContext;
    private AtomicBoolean sRegistered;

    public AppearanceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.sRegistered = new AtomicBoolean(false);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.AppearanceModule.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AppearanceModule.this.notifyForChange();
            }
        };
        this.mReceiver = broadcastReceiver;
        this.reactContext = reactApplicationContext;
        this.mColorScheme = ColorSchemeHelper.colorSchemeForCurrentConfiguration(reactApplicationContext);
        if (this.sRegistered.getAndSet(true)) {
            return;
        }
        reactApplicationContext.registerReceiver(broadcastReceiver, new IntentFilter(APPEARANCE_CHANGED_ACTION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyForChange() {
        if (this.reactContext.hasActiveCatalystInstance()) {
            String strColorSchemeForCurrentConfiguration = ColorSchemeHelper.colorSchemeForCurrentConfiguration(this.reactContext);
            if (this.mColorScheme.equals(strColorSchemeForCurrentConfiguration)) {
                return;
            }
            this.mColorScheme = strColorSchemeForCurrentConfiguration;
            getEventProvider().sendColorSchemeChangedEvent(this.mColorScheme);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTAppearance
    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTAppearance
    @ReactMethod(isBlockingSynchronousMethod = true)
    public void disableActivityDarkMode() {
        StringBuilder sb = new StringBuilder();
        sb.append("disableActivityDarkMode: ");
        sb.append(getCurrentActivity() != null ? getCurrentActivity().getLocalClassName() : AbstractJsonLexerKt.NULL);
        RnPluginLog.i(sb.toString());
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTAppearance
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getColorScheme() {
        String strColorSchemeForCurrentConfiguration = ColorSchemeHelper.colorSchemeForCurrentConfiguration(getReactApplicationContext());
        this.mColorScheme = strColorSchemeForCurrentConfiguration;
        return strColorSchemeForCurrentConfiguration;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        if (this.reactContext == null || !this.sRegistered.getAndSet(false)) {
            return;
        }
        try {
            this.reactContext.unregisterReceiver(this.mReceiver);
        } catch (Exception unused) {
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTAppearance
    @ReactMethod
    public void removeListeners(double d) {
    }
}
