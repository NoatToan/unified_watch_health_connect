package com.dsi.ant.plugins.internal.pluginsipc;

/* JADX INFO: loaded from: classes7.dex */
public class AntPluginDeviceDbProvider$AntPluginDeviceDbException extends Exception {
    private static final long serialVersionUID = 8657725579688499890L;
    public int deviceDbQueryResult;

    public AntPluginDeviceDbProvider$AntPluginDeviceDbException(String str, int i14) {
        super(str);
        this.deviceDbQueryResult = i14;
    }
}
