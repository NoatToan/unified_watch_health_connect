package com.huawei.appgallery.marketinstallerservice.api;

/* JADX INFO: loaded from: classes23.dex */
public class InstallParamSpec extends BaseParamSpec {
    public static final int FAIL_RESULT_DIALOG = 2;
    public static final int FAIL_RESULT_NOTHING = 1;
    public static final int FAIL_RESULT_TOAST = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5229a = false;
    private int d = 0;
    private MarketInfo e;

    public void setSilentDownload(boolean z) {
        this.f5229a = z;
    }

    public void setMarketInfo(MarketInfo marketInfo) {
        this.e = marketInfo;
    }

    public void setFailResultPromptType(int i) {
        this.d = i;
    }

    public boolean isSilentDownload() {
        return this.f5229a;
    }

    public MarketInfo getMarketInfo() {
        return this.e;
    }

    public int getFailResultPromptType() {
        return this.d;
    }
}
