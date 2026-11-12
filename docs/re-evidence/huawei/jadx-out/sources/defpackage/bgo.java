package defpackage;

import android.content.Context;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import com.huawei.appgallery.coreservice.api.ApiClient;
import com.huawei.appgallery.coreservice.c;
import com.huawei.appgallery.coreservice.f;
import com.huawei.appgallery.coreservice.internal.framework.ipc.transport.data.BaseIPCRequest;
import com.huawei.appgallery.coreservice.internal.framework.ipc.transport.data.RequestHeader;
import com.huawei.appgallery.coreservice.internal.framework.ipc.transport.data.RequireVersion;
import com.huawei.appmarket.framework.coreservice.DataHolder;
import com.huawei.appmarket.framework.coreservice.Status;
import com.huawei.appmarket.framework.coreservice.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bgo<C extends BaseIPCRequest> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f1100b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f1101a;
    private final Context e;

    @Override // com.huawei.appgallery.coreservice.f
    public final void a(ApiClient apiClient, a.AbstractBinderC0060a abstractBinderC0060a) {
        if (this.f1101a == null) {
            e(abstractBinderC0060a, 14);
            return;
        }
        c cVarB = b(apiClient);
        if (cVarB == null) {
            bhn.a(NotificationCompat.CATEGORY_TRANSPORT, "can not find client");
            e(abstractBinderC0060a, 8);
            return;
        }
        DataHolder dataHolder = new DataHolder();
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.b(this.e.getPackageName());
        requestHeader.a(this.f1101a.getMediaPkg());
        RequireVersion requireVersion = (RequireVersion) this.f1101a.getClass().getAnnotation(RequireVersion.class);
        if (requireVersion != null) {
            requestHeader.a(requireVersion.value());
        }
        dataHolder.a(requestHeader);
        dataHolder.a(this.f1101a.getMethod());
        dataHolder.a(this.f1101a);
        try {
            cVarB.a(dataHolder, abstractBinderC0060a);
        } catch (Exception e) {
            bhn.a(NotificationCompat.CATEGORY_TRANSPORT, "sync call ex:" + e.getMessage());
            e(abstractBinderC0060a, 8);
        }
    }

    private void e(a aVar, int i) {
        if (aVar != null) {
            try {
                aVar.call(new Status(i));
            } catch (RemoteException e) {
                bhn.a(NotificationCompat.CATEGORY_TRANSPORT, "default failed call failed", e);
            }
        }
    }

    private c b(ApiClient apiClient) {
        if (!(apiClient instanceof bgm)) {
            apiClient = apiClient.getDelegate();
            if (!(apiClient instanceof bgm)) {
                return null;
            }
        }
        return ((bgm) apiClient).c();
    }

    public bgo(Context context, C c2) {
        this.e = context;
        this.f1101a = c2;
    }

    static {
        ArrayList arrayList = new ArrayList();
        f1100b = arrayList;
        arrayList.add("method.cancelTask");
        arrayList.add("method.pauseTask");
        arrayList.add("method.queryTasks");
        arrayList.add("method.registerDownloadCallback");
        arrayList.add("method.resumeTask");
        arrayList.add("method.startDownloadTask");
        arrayList.add("method.unregisterDownloadCallback");
    }
}
