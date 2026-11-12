package defpackage;

import android.content.Context;
import com.huawei.appgallery.agd.api.AgdApiClient;
import com.huawei.appgallery.agd.api.ConnectionResult;
import com.huawei.appgallery.agd.internal.support.log.AgdLog;
import com.huawei.appgallery.agd.internalapi.CrossClientApi;
import com.huawei.appgallery.coreservice.api.ApiClient;
import com.huawei.appgallery.coreservice.api.CoreServiceApi;
import com.huawei.appgallery.coreservice.api.IConnectionResult;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class bgn implements AgdApiClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ApiClient f1095a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<AgdApiClient.ConnectionCallbacks> f1097c;
    private final Context d;
    private Runnable f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1096b = false;
    private boolean e = false;
    private boolean h = false;

    @Override // com.huawei.appgallery.agd.api.AgdApiClient, com.huawei.appgallery.coreservice.api.ApiClient
    public boolean isConnecting() {
        return b() && this.h;
    }

    @Override // com.huawei.appgallery.agd.api.AgdApiClient, com.huawei.appgallery.coreservice.api.ApiClient
    public boolean isConnected() {
        return this.e || this.f1096b;
    }

    @Override // com.huawei.appgallery.coreservice.api.ApiClient
    public ApiClient getDelegate() {
        return this.f1095a;
    }

    @Override // com.huawei.appgallery.agd.api.AgdApiClient, com.huawei.appgallery.coreservice.api.ApiClient
    public Context getContext() {
        return this.d;
    }

    @Override // com.huawei.appgallery.agd.api.AgdApiClient, com.huawei.appgallery.coreservice.api.ApiClient
    public void disconnect() {
        if (this.f1096b) {
            Iterator<AgdApiClient.ConnectionCallbacks> it = this.f1097c.iterator();
            while (it.hasNext()) {
                it.next().onConnectionSuspended(0);
            }
        }
        this.f1096b = false;
        this.f1095a.disconnect();
        this.e = false;
        this.h = false;
    }

    @Override // com.huawei.appgallery.agd.api.AgdApiClient, com.huawei.appgallery.coreservice.api.ApiClient
    public void connect() {
        if (!CrossClientApi.needCrossClient(this.d)) {
            AgdLog.LOG.i("AgdApiClientImpl", "[AG connect]start to connect");
            this.h = true;
            this.f1095a.connect();
            return;
        }
        this.f1096b = true;
        Set<AgdApiClient.ConnectionCallbacks> set = this.f1097c;
        if (set != null) {
            Iterator<AgdApiClient.ConnectionCallbacks> it = set.iterator();
            while (it.hasNext()) {
                it.next().onConnected();
            }
        }
        AgdLog.LOG.i("AgdApiClientImpl", "AG not exist, connect by cross client");
    }

    class a implements ApiClient.ConnectionCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f1098a;

        @Override // com.huawei.appgallery.coreservice.api.ApiClient.ConnectionCallback
        public void onConnectionSuspended(int i) {
            bgn.this.e(false);
            if (bgn.this.f1096b) {
                return;
            }
            Iterator it = this.f1098a.iterator();
            while (it.hasNext()) {
                ((AgdApiClient.ConnectionCallbacks) it.next()).onConnectionSuspended(i);
            }
        }

        @Override // com.huawei.appgallery.coreservice.api.ApiClient.ConnectionCallback
        public void onConnectionFailed(IConnectionResult iConnectionResult) {
            bgn.this.e(false);
            if (bgn.this.f1096b) {
                return;
            }
            Iterator it = this.f1098a.iterator();
            while (it.hasNext()) {
                ((AgdApiClient.ConnectionCallbacks) it.next()).onConnectionFailed(new ConnectionResult(iConnectionResult));
            }
        }

        @Override // com.huawei.appgallery.coreservice.api.ApiClient.ConnectionCallback
        public void onConnected() {
            bgn.this.e(true);
            if (bgn.this.f1096b) {
                return;
            }
            Iterator it = this.f1098a.iterator();
            while (it.hasNext()) {
                ((AgdApiClient.ConnectionCallbacks) it.next()).onConnected();
            }
        }

        a(Set set) {
            this.f1098a = set;
        }
    }

    private boolean b() {
        return CoreServiceApi.getAppGalleryPkg(this.d) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        this.e = z;
        this.h = false;
        Runnable runnable = this.f;
        if (runnable == null || !z) {
            return;
        }
        runnable.run();
        this.f = null;
    }

    public bgn(ApiClient.Builder builder, Context context, Set<AgdApiClient.ConnectionCallbacks> set) {
        builder.addConnectionCallbacks(new a(set));
        this.f1095a = builder.build();
        this.d = context;
        this.f1097c = set;
        if (CrossClientApi.needCrossClient(context)) {
            CrossClientApi.init(context);
        }
    }
}
