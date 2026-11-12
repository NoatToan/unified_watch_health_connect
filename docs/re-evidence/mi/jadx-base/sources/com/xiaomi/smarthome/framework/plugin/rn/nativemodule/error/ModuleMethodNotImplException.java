package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.error;

import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleMethodNotImplException extends RuntimeException {
    public ModuleMethodNotImplException(String str) {
        super(str);
        RnPluginLog.w(str);
    }
}
