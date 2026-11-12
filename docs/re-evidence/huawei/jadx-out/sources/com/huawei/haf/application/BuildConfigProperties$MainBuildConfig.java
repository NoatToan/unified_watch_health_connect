package com.huawei.haf.application;

import android.text.TextUtils;
import com.huawei.haf.common.base.BuildConfigReader;
import health.compact.a.ReflectionUtils;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes.dex */
public class BuildConfigProperties$MainBuildConfig extends BuildConfigReader {
    private volatile Class d;

    private BuildConfigProperties$MainBuildConfig() {
    }

    @Override // com.huawei.haf.common.base.BuildConfigReader
    public Class getBuildConfigClass() {
        if (this.d == null) {
            e(null);
        }
        return this.d;
    }

    public void e(String str) {
        if (this.d != null) {
            return;
        }
        synchronized (this) {
            if (this.d != null) {
                return;
            }
            Class clsC = !TextUtils.isEmpty(str) ? c(str) : null;
            if (clsC == null) {
                clsC = c(BaseApplication.d());
            }
            if (clsC == null) {
                clsC = c(BaseApplication.b().getClass().getPackage().getName());
            }
            this.d = clsC;
            ReleaseLogUtil.c("HAF_BuildConfig", "main BuildConfig is: ", this.d);
        }
    }

    private static Class c(String str) {
        return ReflectionUtils.b(str + ".BuildConfig");
    }
}
