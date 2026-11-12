package com.huawei.hms.network.inner;

import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.EmuiUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;

/* JADX INFO: loaded from: classes34.dex */
public class DomainManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15787a = "DomainManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile DomainManager f15788b;

    public boolean isHwPhoneAndInChina() {
        if (!EmuiUtil.isHuaweiDevice() || !GrsApp.getInstance().getIssueCountryCode(ContextHolder.getAppContext()).equals("CN")) {
            return false;
        }
        Logger.v(f15787a, "huawei device and in china");
        return true;
    }

    public boolean isHaDomain(String str) {
        if (str == null) {
            return false;
        }
        if ((!str.contains("metrics") || !str.contains("dbankcloud")) && (!str.contains("metrics") || !str.contains("hicloud"))) {
            return false;
        }
        Logger.v(f15787a, "ha domain");
        return true;
    }

    public boolean isExcludePrefetch(String str) {
        return !isHwPhoneAndInChina() || isHaDomain(str);
    }

    public static DomainManager getInstance() {
        if (f15788b == null) {
            synchronized (DomainManager.class) {
                if (f15788b == null) {
                    f15788b = new DomainManager();
                }
            }
        }
        return f15788b;
    }
}
