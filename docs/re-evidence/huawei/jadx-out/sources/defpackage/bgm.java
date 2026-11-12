package defpackage;

import android.content.Context;
import com.huawei.appgallery.coreservice.api.ApiClient;
import com.huawei.appgallery.coreservice.api.ConnectConfig;
import com.huawei.appgallery.coreservice.c;
import com.huawei.appgallery.coreservice.e;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class bgm implements ApiClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1094a;
    private final Set<ApiClient.ConnectionCallback> d;
    private e e;

    @Override // com.huawei.appgallery.coreservice.api.ApiClient
    public ApiClient getDelegate() {
        return null;
    }

    @Override // com.huawei.appgallery.coreservice.api.ApiClient
    public boolean isConnecting() {
        return this.e.c();
    }

    @Override // com.huawei.appgallery.coreservice.api.ApiClient
    public boolean isConnected() {
        return this.e.d();
    }

    @Override // com.huawei.appgallery.coreservice.api.ApiClient
    public Context getContext() {
        return this.f1094a;
    }

    @Override // com.huawei.appgallery.coreservice.api.ApiClient
    public void disconnect() {
        this.e.e();
    }

    @Override // com.huawei.appgallery.coreservice.api.ApiClient
    public void connect() {
        this.e.c(this.d);
    }

    public c c() {
        return this.e;
    }

    public bgm(Context context, Set<ApiClient.ConnectionCallback> set, ConnectConfig connectConfig) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.f1094a = context.getApplicationContext();
        hashSet.addAll(set);
        e eVar = new e(context);
        this.e = eVar;
        eVar.e(connectConfig);
    }
}
