package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.huawei.android.hicloud.sync.service.IServiceProtocol;
import com.huawei.android.hicloud.sync.service.aidl.IRequireDownService;
import com.huawei.android.hicloud.sync.service.aidl.ISyncServiceCallback;
import com.huawei.android.hicloud.sync.service.aidl.UnstructData;
import com.huawei.android.hicloud.sync.service.w;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class bcs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ServiceConnection f1011c;
    private IRequireDownService d;
    private final Context e;
    private final ISyncServiceCallback g;
    private final String n;
    private boolean h = false;
    private boolean i = false;
    private final List<ServiceConnection> f = new ArrayList();
    private final String j = bda.b();

    class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f1012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f1014c;
        final /* synthetic */ String d;

        a(String str, String str2, List list, String str3) {
            this.f1014c = str;
            this.f1013b = str2;
            this.f1012a = list;
            this.d = str3;
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void execute() throws RemoteException {
            bcw.c("DownloadServiceProtocol", "pauseDownloadFile execute");
            bcs.this.d.pauseDownloadFile(this.f1014c, this.f1013b, this.f1012a, this.d, bcs.this.j);
            bcs.this.d(this.d);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void executeBatches(byte[] bArr) throws RemoteException {
            bcs.this.d.pauseDownloadFileForTransTooLarge(this.f1014c, this.f1013b, this.d, bArr, false, bcs.this.j);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void handleTranDataTooLarge() {
            try {
                a(bcs.this.a((List<UnstructData>) this.f1012a));
                bcs.this.d.pauseDownloadFileForTransTooLarge(this.f1014c, this.f1013b, this.d, new byte[0], true, bcs.this.j);
            } catch (RemoteException e) {
                e = e;
                bcw.d("DownloadServiceProtocol", "pauseDownloadFile error :" + e.toString());
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                bcw.d("DownloadServiceProtocol", "pauseDownloadFile error :" + e.toString());
            } catch (JSONException unused) {
                bcw.d("DownloadServiceProtocol", "pauseDownloadFile error : JSONException");
            }
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            bcs bcsVar = bcs.this;
            bcsVar.a(bcsVar.n, "onCloudServiceConnected RemoteException");
        }
    }

    class c implements ServiceConnection {
        final /* synthetic */ IServiceProtocol e;

        c(IServiceProtocol iServiceProtocol) {
            this.e = iServiceProtocol;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            bcw.e("DownloadServiceProtocol", "onBindingDied pkgName is：" + componentName.getPackageName());
            bcs.this.h = false;
            bcs bcsVar = bcs.this;
            bcsVar.a(bcsVar.n, "serviceBindingDied");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            bcw.c("DownloadServiceProtocol", "service connected");
            if (bcs.this.d == null) {
                bcw.c("DownloadServiceProtocol", "onServiceConnected new downloadService");
                bcs.this.d = IRequireDownService.Stub.asInterface(iBinder);
            }
            bcs.this.e();
            bcs.this.h = true;
            bcs.this.c(this.e);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            bcw.e("DownloadServiceProtocol", "onServiceDisconnected pkgName is：" + componentName.getPackageName());
            bcs.this.h = false;
            bcs bcsVar = bcs.this;
            bcsVar.a(bcsVar.n, "ServiceDisconnected");
        }
    }

    class d extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f1019c;
        final /* synthetic */ List e;

        d(String str, String str2, List list, String str3) {
            this.f1019c = str;
            this.f1017a = str2;
            this.e = list;
            this.f1018b = str3;
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void execute() throws RemoteException {
            bcw.c("DownloadServiceProtocol", "startDownloadFile execute");
            bcs.this.d.startDownloadFile(this.f1019c, this.f1017a, this.e, this.f1018b, bcs.this.j);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void executeBatches(byte[] bArr) throws RemoteException {
            bcs.this.d.startDownloadFileForTransTooLarge(this.f1019c, this.f1017a, this.f1018b, bArr, false, bcs.this.j);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void handleTranDataTooLarge() {
            try {
                a(bcs.this.a((List<UnstructData>) this.e));
                bcs.this.d.startDownloadFileForTransTooLarge(this.f1019c, this.f1017a, this.f1018b, new byte[0], true, bcs.this.j);
            } catch (RemoteException e) {
                e = e;
                bcw.d("DownloadServiceProtocol", "startDownloadFile error :" + e.toString());
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                bcw.d("DownloadServiceProtocol", "startDownloadFile error :" + e.toString());
            } catch (JSONException unused) {
                bcw.d("DownloadServiceProtocol", "startDownloadFile error : JSONException");
            }
        }
    }

    class e extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f1022c;
        final /* synthetic */ String d;
        final /* synthetic */ boolean e;
        final /* synthetic */ String i;

        e(String str, String str2, List list, boolean z, boolean z2, String str3) {
            this.f1020a = str;
            this.d = str2;
            this.f1022c = list;
            this.f1021b = z;
            this.e = z2;
            this.i = str3;
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void execute() throws RemoteException {
            bcw.c("DownloadServiceProtocol", "downLoadFile execute");
            bcs.this.d.downLoadFile(this.f1020a, this.d, this.f1022c, this.f1021b, this.e, this.i, bcs.this.j);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void executeBatches(byte[] bArr) throws RemoteException {
            bcs.this.d.downLoadFileForTransTooLarge(this.f1020a, this.d, this.f1021b, this.e, this.i, bArr, false, bcs.this.j);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void handleTranDataTooLarge() {
            try {
                a(bcs.this.a((List<UnstructData>) this.f1022c));
                bcs.this.d.downLoadFileForTransTooLarge(this.f1020a, this.d, this.f1021b, this.e, this.i, new byte[0], true, bcs.this.j);
            } catch (RemoteException e) {
                e = e;
                bcw.d("DownloadServiceProtocol", "downLoadFile error :" + e.toString());
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                bcw.d("DownloadServiceProtocol", "downLoadFile error :" + e.toString());
            } catch (JSONException unused) {
                bcw.d("DownloadServiceProtocol", "downLoadFile error : JSONException");
            }
        }
    }

    class i extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f1025c;
        final /* synthetic */ List d;

        i(String str, String str2, List list, String str3) {
            this.f1023a = str;
            this.f1024b = str2;
            this.d = list;
            this.f1025c = str3;
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void execute() throws RemoteException {
            bcw.c("DownloadServiceProtocol", "cancelDownloadFile execute");
            bcs.this.d.cancelDownloadFile(this.f1023a, this.f1024b, this.d, this.f1025c, bcs.this.j);
            bcs.this.d(this.f1025c);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void executeBatches(byte[] bArr) throws RemoteException {
            bcs.this.d.cancelDownloadFileForTransTooLarge(this.f1023a, this.f1024b, this.f1025c, bArr, false, bcs.this.j);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void handleTranDataTooLarge() {
            try {
                a(bcs.this.a((List<UnstructData>) this.d));
                bcs.this.d.cancelDownloadFileForTransTooLarge(this.f1023a, this.f1024b, this.f1025c, new byte[0], true, bcs.this.j);
            } catch (RemoteException e) {
                e = e;
                bcw.d("DownloadServiceProtocol", "cancelDownloadFile error :" + e.toString());
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                bcw.d("DownloadServiceProtocol", "cancelDownloadFile error :" + e.toString());
            } catch (JSONException unused) {
                bcw.d("DownloadServiceProtocol", "cancelDownloadFile error : JSONException");
            }
        }
    }

    public bcs(Context context, String str, String str2, String str3, ISyncServiceCallback iSyncServiceCallback) {
        this.e = context;
        this.f1009a = str;
        this.f1010b = str2;
        this.g = iSyncServiceCallback;
        this.n = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            bcw.c("DownloadServiceProtocol", "registerCallBack mCallbackRegisted = " + this.i);
            IRequireDownService iRequireDownService = this.d;
            if (iRequireDownService == null || this.i) {
                return;
            }
            this.i = iRequireDownService.registerSingleCallback(this.g, this.f1009a, this.j);
            bcw.c("DownloadServiceProtocol", "new registerCallBack mCallbackRegisted = " + this.i);
        } catch (RemoteException e2) {
            bcw.d("DownloadServiceProtocol", " register callback Exception." + e2.getMessage());
        }
    }

    private void g() {
        if (!this.i || this.d == null) {
            return;
        }
        try {
            bcw.c("DownloadServiceProtocol", "unregisterSingleCallback");
            this.d.unregisterSingleCallback(this.g, this.f1009a, this.j);
        } catch (RemoteException unused) {
            bcw.d("DownloadServiceProtocol", "unregisterSingleCallback error");
        }
        this.i = false;
    }

    private void i() {
        bcw.c("DownloadServiceProtocol", "all serviceConnection list size = " + this.f.size());
        if (this.f.isEmpty()) {
            bcw.a("DownloadServiceProtocol", "unbindAllConnection->connection list is empty");
            return;
        }
        bcw.c("DownloadServiceProtocol", "unbindAllConnection");
        for (ServiceConnection serviceConnection : this.f) {
            if (serviceConnection != null) {
                bcw.c("DownloadServiceProtocol", "unbindAllConnection item");
                Context context = this.e;
                if (context != null) {
                    context.unbindService(serviceConnection);
                } else {
                    bcw.c("DownloadServiceProtocol", "unbindAllConnection mcontext is null");
                }
            } else {
                bcw.a("DownloadServiceProtocol", "unbindAllConnection->connection item is null");
            }
        }
        this.h = false;
        this.d = null;
        this.f.clear();
    }

    private void d(IServiceProtocol iServiceProtocol) {
        if (d()) {
            c(iServiceProtocol);
        } else {
            b(iServiceProtocol);
        }
    }

    private boolean d() {
        IRequireDownService iRequireDownService = this.d;
        boolean z = iRequireDownService != null && iRequireDownService.asBinder().isBinderAlive();
        bcw.c("DownloadServiceProtocol", "isServiceConnected = " + z);
        return z;
    }

    public String c() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(IServiceProtocol iServiceProtocol) {
        try {
            iServiceProtocol.execute();
        } catch (TransactionTooLargeException e2) {
            bcw.e("DownloadServiceProtocol", "TransactionTooLargeException: " + e2.getMessage());
            iServiceProtocol.handleTranDataTooLarge();
        } catch (Exception e3) {
            bcw.d("DownloadServiceProtocol", "onCloudServiceConnected bindCloudService error: Exception: " + e3.getMessage());
            new Timer().schedule(new b(), 1000L);
        }
    }

    private void a() {
        bcw.a("DownloadServiceProtocol", "doBindService");
        try {
            Intent intent = new Intent();
            intent.setAction("com.huawei.android.hicloud.sync.requireDownlogicservice");
            intent.setClassName("com.huawei.hidisk", "com.huawei.android.hicloud.sync.service.aidl.RequireDownLogicService");
            this.h = this.e.bindService(intent, this.f1011c, 1);
        } catch (Exception e2) {
            bcw.d("DownloadServiceProtocol", "doBindService exception:" + e2.getMessage());
            a(this.n, "doBindService exception");
        }
    }

    private void b(IServiceProtocol iServiceProtocol) {
        bcw.c("DownloadServiceProtocol", "bindCloudService");
        c cVar = new c(iServiceProtocol);
        this.f1011c = cVar;
        this.f.add(cVar);
        a();
    }

    public void e(String str, String str2, List<UnstructData> list, String str3) {
        StringBuilder sb = new StringBuilder("pauseDownloadFile dataType = ");
        sb.append(str2);
        sb.append(", sessionId = ");
        sb.append(str3);
        sb.append(", files = ");
        sb.append(list == null ? "0" : Integer.valueOf(list.size()));
        bcw.c("DownloadServiceProtocol", sb.toString());
        d(new a(str, str2, list, str3));
    }

    public void b() {
        bcw.c("DownloadServiceProtocol", "doUnbindService, mIsBind: " + this.h);
        try {
            if (this.h) {
                g();
                i();
            }
        } catch (Exception e2) {
            bcw.d("DownloadServiceProtocol", "doUnbindService failed , e = " + e2.toString());
        }
    }

    private JSONArray d(List<UnstructData> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                UnstructData unstructData = list.get(i2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", unstructData.getId());
                jSONObject.put("unstruct_uuid", unstructData.getUnstruct_uuid());
                jSONObject.put("name", unstructData.getName());
                jSONObject.put("hash", unstructData.getHash());
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public void c(String str, String str2, List<UnstructData> list, String str3) {
        StringBuilder sb = new StringBuilder("startDownloadFile dataType = ");
        sb.append(str2);
        sb.append(", sessionId = ");
        sb.append(str3);
        sb.append(", files = ");
        sb.append(list == null ? "0" : Integer.valueOf(list.size()));
        bcw.c("DownloadServiceProtocol", sb.toString());
        d(new d(str, str2, list, str3));
    }

    public void c(String str, String str2, List<UnstructData> list, boolean z, boolean z2, String str3) {
        StringBuilder sb = new StringBuilder("downLoadFile dataType = ");
        sb.append(str2);
        sb.append(", needProgress = ");
        sb.append(z);
        sb.append(", forceDownload = ");
        sb.append(z2);
        sb.append(", sessionId = ");
        sb.append(str3);
        sb.append(", files = ");
        sb.append(list == null ? "0" : Integer.valueOf(list.size()));
        bcw.c("DownloadServiceProtocol", sb.toString());
        d(new e(str, str2, list, z, z2, str3));
    }

    public void b(String str, String str2, List<UnstructData> list, String str3) {
        StringBuilder sb = new StringBuilder("cancelDownloadFile dataType = ");
        sb.append(str2);
        sb.append(", sessionId = ");
        sb.append(str3);
        sb.append(", files = ");
        sb.append(list == null ? "0" : Integer.valueOf(list.size()));
        bcw.c("DownloadServiceProtocol", sb.toString());
        d(new i(str, str2, list, str3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] a(List<UnstructData> list) throws JSONException, UnsupportedEncodingException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("download_file", d(list));
        return jSONObject.toString().getBytes("UTF-8");
    }

    public void a(String str, String str2) {
        try {
            bcw.c("DownloadServiceProtocol", "sendDownloadErrorMessage sessionId = " + str + ", errorMsg = " + str2);
            Bundle bundle = new Bundle();
            bundle.putString("session_id", str);
            bundle.putString("syncType", this.f1009a);
            bundle.putString("dataType", this.f1010b);
            bundle.putString("callbackUuid", this.j);
            bundle.putString("errorMsg", str2);
            this.g.handlerEventMsg(10023, 0, 0, bundle);
        } catch (RemoteException e2) {
            bcw.d("DownloadServiceProtocol", "sendDownloadErrorMessage error: " + e2.getMessage());
        }
    }

    public void d(String str) {
        try {
            bcw.c("DownloadServiceProtocol", "sendFinishMessage sessionId = " + str);
            Bundle bundle = new Bundle();
            bundle.putString("session_id", str);
            bundle.putString("syncType", this.f1009a);
            bundle.putString("dataType", this.f1010b);
            bundle.putString("callbackUuid", this.j);
            this.g.handlerEventMsg(10024, 0, 0, bundle);
        } catch (RemoteException e2) {
            bcw.d("DownloadServiceProtocol", "sendFinishMessage error: " + e2.getMessage());
        }
    }
}
