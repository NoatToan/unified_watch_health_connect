package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectApp;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.CustomAuthProvider;
import com.huawei.agconnect.CustomCredentialsProvider;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.core.impl.AGConnectInstanceImpl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class AGConnectAppImpl extends AGConnectApp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, AGConnectApp> f4923b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f4924c = new Object();
    private static String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AGConnectServicesConfig f4925a;

    @Override // com.huawei.agconnect.AGConnectApp
    public void setProductId(String str) {
        this.f4925a.setParam("/client/product_id", str);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setParam(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("path can not be empty");
        }
        this.f4925a.setParam(str, str2);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setCustomCredentialsProvider(CustomCredentialsProvider customCredentialsProvider) {
        ((AGConnectInstanceImpl) AGConnectInstance.getInstance()).a(customCredentialsProvider);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setCustomAuthProvider(CustomAuthProvider customAuthProvider) {
        ((AGConnectInstanceImpl) AGConnectInstance.getInstance()).a(customAuthProvider);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setCpId(String str) {
        this.f4925a.setParam("/client/cp_id", str);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setClientSecret(String str) {
        this.f4925a.setParam("/client/client_secret", str);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setClientId(String str) {
        this.f4925a.setParam("/client/client_id", str);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setAppId(String str) {
        this.f4925a.setParam("/client/app_id", str);
    }

    @Override // com.huawei.agconnect.AGConnectApp
    public void setApiKey(String str) {
        this.f4925a.setParam("/client/api_key", str);
    }

    public static AGConnectApp initialize(Context context, String str) {
        AGConnectApp aGConnectApp;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName can not be empty");
        }
        synchronized (f4924c) {
            Map<String, AGConnectApp> map = f4923b;
            aGConnectApp = map.get(str);
            if (aGConnectApp == null) {
                map.put(str, new AGConnectAppImpl(context, str));
            }
        }
        return aGConnectApp;
    }

    public static AGConnectApp initialize(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String packageName = context.getPackageName();
        d = packageName;
        return initialize(context, packageName);
    }

    public static AGConnectApp getInstance(String str) {
        AGConnectApp aGConnectApp;
        synchronized (f4924c) {
            aGConnectApp = f4923b.get(str);
            if (aGConnectApp == null) {
                throw new IllegalStateException("you should call AGConnectApp.initialize first");
            }
        }
        return aGConnectApp;
    }

    public static AGConnectApp getInstance() {
        return getInstance(d);
    }

    private AGConnectAppImpl(Context context, String str) {
        this.f4925a = AGConnectServicesConfig.fromContext(context, str);
    }
}
