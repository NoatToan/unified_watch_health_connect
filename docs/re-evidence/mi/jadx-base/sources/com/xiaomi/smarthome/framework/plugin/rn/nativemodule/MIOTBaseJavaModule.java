package com.xiaomi.smarthome.framework.plugin.rn.nativemodule;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.common.api.ICameraApiProvider;
import com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnCommonProvider;
import com.xiaomi.smarthome.framework.plugin.rn.common.api.IRnReportProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IMRnAppProxyProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IPermissionProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnApplicationProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnConnectionProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnEventProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnScreenProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IStandPluginProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IUIProvider;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.library.util.GlobalHandlerManager;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MIOTBaseJavaModule extends ReactContextBaseJavaModule {
    public MIOTBaseJavaModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public IRnApplicationProvider getApplicationProvider() {
        return (IRnApplicationProvider) getProvider(IRnApplicationProvider.class);
    }

    public ICameraApiProvider getCameraApiProvider() {
        return (ICameraApiProvider) getProvider(ICameraApiProvider.class);
    }

    public IRnConnectionProvider getConnectionProvider() {
        return (IRnConnectionProvider) getProvider(IRnConnectionProvider.class);
    }

    public Context getContext() {
        return getReactApplicationContext().getApplicationContext();
    }

    public DeviceStat getDevice() {
        return getRnRuntimeProvider().getDeviceStat();
    }

    public IRnEventProvider getEventProvider() {
        return (IRnEventProvider) getProvider(IRnEventProvider.class);
    }

    public File getFilesPath() {
        return getRnRuntimeProvider().getPluginFilesPath(getReactApplicationContext(), getPluginRecord(), getDevice());
    }

    public IPermissionProvider getPermissionProvider() {
        return (IPermissionProvider) getProvider(IPermissionProvider.class);
    }

    public RnPluginDeviceInfo getPluginInfo() {
        return getRnRuntimeProvider().getPluginInfo();
    }

    public PluginPackageInfo getPluginRecord() {
        return getRnRuntimeProvider().getPluginRecord();
    }

    public <T> T getProvider(Class<T> cls) {
        return (T) RnModuleProvider.as(cls);
    }

    public IMRnAppProxyProvider getRnAppProxyProvider() {
        return (IMRnAppProxyProvider) getProvider(IMRnAppProxyProvider.class);
    }

    public IRnBluetoothProvider getRnBluetoothProvider() {
        return (IRnBluetoothProvider) getProvider(IRnBluetoothProvider.class);
    }

    public IRnCommonProvider getRnCommonProvider() {
        return (IRnCommonProvider) getProvider(IRnCommonProvider.class);
    }

    public IRnPluginHostApiProvider getRnPluginHostApiProvider() {
        return (IRnPluginHostApiProvider) getProvider(IRnPluginHostApiProvider.class);
    }

    public IRnReportProvider getRnReportProvider() {
        return (IRnReportProvider) getProvider(IRnReportProvider.class);
    }

    public IRnRuntimeProvider getRnRuntimeProvider() {
        return (IRnRuntimeProvider) getProvider(IRnRuntimeProvider.class);
    }

    public IRnScreenProvider getScreenInfoProvider() {
        return (IRnScreenProvider) getProvider(IRnScreenProvider.class);
    }

    public SharedPreferences getSharedPreferences() {
        return getRnRuntimeProvider().getSharedPreferences();
    }

    public SharedPreferences getSharedPreferencesV2() {
        return getRnRuntimeProvider().getSharedPreferencesV2();
    }

    public IStandPluginProvider getStandPluginProvider() {
        return (IStandPluginProvider) getProvider(IStandPluginProvider.class);
    }

    public String getStatDevloperLabel() {
        PluginPackageInfo pluginRecord = getPluginRecord();
        if (pluginRecord == null) {
            return null;
        }
        return getRnCommonProvider().getDeveloperName(pluginRecord.getPluginId(), pluginRecord.getPackageId());
    }

    public File getTempFilesPath() {
        return getRnRuntimeProvider().getTempFilesPath();
    }

    public IUIProvider getUIProvider() {
        return (IUIProvider) getProvider(IUIProvider.class);
    }

    public void onMethodNotImplamente(String str) {
        RnPluginLog.w("onMethodNotImplamente : " + str);
    }

    public void runOnMain(Runnable runnable) {
        GlobalHandlerManager.getInstance().getGlobalHandler().post(runnable);
    }
}
