package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes3.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    void setAllowContentAccess(boolean z14);

    void setAllowFileAccess(boolean z14);

    void setBlockNetworkLoads(boolean z14);

    void setCacheMode(int i14);

    void setIncludeCookiesOnIntercept(boolean z14);
}
