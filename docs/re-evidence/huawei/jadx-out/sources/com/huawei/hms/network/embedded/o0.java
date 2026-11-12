package com.huawei.hms.network.embedded;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.networkkit.embedded.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class o0 {
    public static final String e = "HttpDnsHelper";
    public static final String f = "httpdns_serviceId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15139c;
    public List<String> d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o0 f15140a = new o0();
    }

    public String d() {
        ApplicationInfo applicationInfo;
        if (!TextUtils.isEmpty(this.f15139c)) {
            return this.f15139c;
        }
        try {
            applicationInfo = ContextHolder.getAppContext().getPackageManager().getApplicationInfo(ContextHolder.getAppContext().getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException | RuntimeException e2) {
            Logger.w(e, "NameNotFoundException: ", e2);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            Logger.w(e, "appInfo == null ");
            return "";
        }
        Object obj = applicationInfo.metaData.get(f);
        if (obj == null) {
            return "";
        }
        this.f15139c = obj.toString();
        Logger.v(e, "get serviceId form metaData：" + this.f15139c);
        return this.f15139c;
    }

    public String c() {
        if (TextUtils.isEmpty(this.f15137a)) {
            this.f15137a = ContextHolder.getResourceContext().getString(R.string.networkkit_httpdns_domain);
        }
        return this.f15137a;
    }

    public String b() {
        if (TextUtils.isEmpty(this.f15138b)) {
            this.f15138b = NetworkUtil.getHost(c());
        }
        return this.f15138b;
    }

    public List<String> a() {
        List<String> list;
        synchronized (this) {
            if (this.d == null) {
                this.d = new ArrayList();
                for (String str : ContextHolder.getResourceContext().getResources().getStringArray(R.array.networkkit_httpdns_anycastip_array)) {
                    this.d.add(str);
                }
                if (this.d.isEmpty()) {
                    Logger.w(e, "current anyCastIps have not configured yet!");
                }
            }
            list = this.d;
        }
        return list;
    }

    public static o0 e() {
        return b.f15140a;
    }

    public o0() {
    }
}
