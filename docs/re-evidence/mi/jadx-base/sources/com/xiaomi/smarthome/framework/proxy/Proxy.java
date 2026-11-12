package com.xiaomi.smarthome.framework.proxy;

import android.text.TextUtils;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Proxy<T, C> implements IProxy<T, C> {
    private static final String TAG = "Proxy";
    private volatile Module<T, C> mProxy;

    public abstract String getModuleClassName();

    public Module<T, C> getProxy() {
        if (this.mProxy == null) {
            synchronized (this) {
                try {
                    if (this.mProxy == null) {
                        String moduleClassName = getModuleClassName();
                        if (!TextUtils.isEmpty(moduleClassName)) {
                            try {
                                this.mProxy = (Module) loadModule(moduleClassName);
                            } catch (Throwable th) {
                                MRnLog.e(TAG, "getProxy error,", th);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.mProxy;
    }

    @Override // com.xiaomi.smarthome.framework.proxy.IProxy
    public C getServiceInterface() {
        return getProxy().getServiceInterface();
    }

    @Override // com.xiaomi.smarthome.framework.proxy.IProxy
    public T getUiInterface() {
        return getProxy().getUiInterface();
    }

    public Object loadModule(String str) {
        try {
            Class<?> cls = Class.forName(str, false, getClass().getClassLoader());
            if (cls != null) {
                return cls.newInstance();
            }
            return null;
        } catch (Throwable th) {
            MRnLog.e(TAG, "loadModule: load " + str + " failed,", th);
            return null;
        }
    }
}
