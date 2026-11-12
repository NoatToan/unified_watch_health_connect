package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.support.v4.media.session.PlaybackStateCompat;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.android.hicloud.sync.logic.SyncProcessInterface;
import com.huawei.android.hicloud.sync.service.IServiceProtocol;
import com.huawei.android.hicloud.sync.service.aidl.ISyncService;
import com.huawei.android.hicloud.sync.service.aidl.ISyncServiceCallback;
import com.huawei.android.hicloud.sync.service.aidl.SyncData;
import com.huawei.android.hicloud.sync.service.aidl.UnstructData;
import com.huawei.android.hicloud.sync.service.aidl.UnstructDataV107;
import com.huawei.android.hicloud.sync.service.w;
import com.huawei.common.Constant;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class bcr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f982c;
    private ISyncService d;
    private ServiceConnection e;
    private boolean f;
    private final SyncProcessInterface g;
    private boolean h;
    private int i;
    private boolean j;
    private List<ServiceConnection> o;

    class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f985c;
        final /* synthetic */ String d;

        a(String str, String str2, String str3, String str4) {
            this.f984b = str;
            this.f985c = str2;
            this.d = str3;
            this.f983a = str4;
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void execute() throws RemoteException {
            bcr.this.d.reportSyncRsn(this.f984b, this.f985c, this.d, this.f983a);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void executeBatches(byte[] bArr) throws RemoteException {
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void handleTranDataTooLarge() {
        }
    }

    class b extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f986a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f988c;
        final /* synthetic */ String e;

        b(String str, String str2, List list) {
            this.f988c = str;
            this.e = str2;
            this.f986a = list;
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void execute() throws RemoteException {
            bcw.c("SyncServiceProtocol", "downUnstructFile");
            int iA = bcn.a();
            if (iA == 0) {
                iA = 2;
            }
            bcr.this.d.reportSDKVersionCode(iA);
            bcr.this.d.downUnstructFile(this.f988c, this.e, this.f986a);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void executeBatches(byte[] bArr) throws RemoteException {
            if (bcr.this.d != null) {
                bcr.this.d.downUnstructFileForTransTooLarge(this.f988c, this.e, bArr, false);
            } else {
                bcw.d("SyncServiceProtocol", "syncService is null");
            }
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void handleTranDataTooLarge() {
            try {
                a(bcr.this.e((List<UnstructData>) this.f986a).toString().getBytes("UTF-8"));
                bcr.this.d.downUnstructFileForTransTooLarge(this.f988c, this.e, new byte[0], true);
            } catch (RemoteException e) {
                e = e;
                bcw.d("SyncServiceProtocol", "downUnstructFile:" + e.toString());
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                bcw.d("SyncServiceProtocol", "downUnstructFile:" + e.toString());
            } catch (JSONException unused) {
                bcw.d("SyncServiceProtocol", "downUnstructFile error : JSONException");
            }
        }
    }

    class c extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISyncServiceCallback f991c;
        final /* synthetic */ List d;

        c(ISyncServiceCallback iSyncServiceCallback, String str, List list, List list2) {
            this.f991c = iSyncServiceCallback;
            this.f989a = str;
            this.d = list;
            this.f990b = list2;
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void execute() throws RemoteException {
            bcw.c("SyncServiceProtocol", "endSync");
            bcr.d(this.f991c, 300000L, "endSync");
            bcr.this.d.endSync(this.f989a, this.d, this.f990b);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void executeBatches(byte[] bArr) throws RemoteException {
            if (bcr.this.d != null) {
                bcr.this.d.endSyncForTransTooLarge(this.f989a, bArr, false);
            } else {
                bcw.d("SyncServiceProtocol", "endSync syncService is null");
            }
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void handleTranDataTooLarge() {
            try {
                a(bcr.this.a(this.d, this.f990b));
                bcr.this.d.endSyncForTransTooLarge(this.f989a, new byte[0], true);
            } catch (RemoteException e) {
                e = e;
                bcw.d("SyncServiceProtocol", "endSync error :" + e.toString());
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                bcw.d("SyncServiceProtocol", "endSync error :" + e.toString());
            } catch (JSONException unused) {
                bcw.d("SyncServiceProtocol", "endSync error : JSONException");
            }
        }
    }

    class d implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IServiceProtocol f993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f994c;
        final /* synthetic */ ISyncServiceCallback e;

        class a extends TimerTask {
            a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                bcr.this.a(Constant.SERVICE_CONNECT_MESSAGE);
            }
        }

        d(IServiceProtocol iServiceProtocol, boolean z, ISyncServiceCallback iSyncServiceCallback) {
            this.f993b = iServiceProtocol;
            this.f994c = z;
            this.e = iSyncServiceCallback;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            bcw.c("SyncServiceProtocol", "service connected");
            if (bcr.this.d == null) {
                bcw.c("SyncServiceProtocol", "bindCloudService onServiceConnected new syncService");
                bcr.this.d = ISyncService.Stub.asInterface(iBinder);
            }
            bcr.this.h = true;
            try {
                bcr.this.a(this.f993b, this.f994c, this.e);
            } catch (RemoteException unused) {
                bcw.d("SyncServiceProtocol", "onServiceConnected error : RemoteException");
                new Timer().schedule(new a(), 1000L);
            } catch (Exception e) {
                bcw.d("SyncServiceProtocol", "bindCloudService onServiceConnected error: Exception: " + e.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            bcw.c("SyncServiceProtocol", "cloud service disconnected isNeedEndSync = " + bcr.this.f);
            bcr.this.f980a = false;
            bcr.this.h = false;
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("resultCode", 0);
                this.e.handlerEventMsg(10013, 0, 0, bundle);
            } catch (RemoteException e) {
                bcw.d("SyncServiceProtocol", "cloud service disconnected RemoteException = " + e.toString());
            }
            bcr.this.a("onServiceDisconnected");
        }
    }

    class e extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f997c;
        final /* synthetic */ String e;

        e(String str, String str2) {
            this.f997c = str;
            this.e = str2;
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void execute() throws RemoteException {
            bcr.this.d.reportInfo(this.f997c, this.e);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void executeBatches(byte[] bArr) throws RemoteException {
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void handleTranDataTooLarge() {
        }
    }

    class g extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f1000c;
        final /* synthetic */ String d;
        final /* synthetic */ List e;
        final /* synthetic */ boolean h;

        g(List list, List list2, List list3, String str, String str2, boolean z) {
            this.f1000c = list;
            this.f999b = list2;
            this.e = list3;
            this.f998a = str;
            this.d = str2;
            this.h = z;
        }

        private void d(boolean z) {
            bcw.c("SyncServiceProtocol", "uploadData resolveTooLarge");
            try {
                a(bcr.this.b((List<SyncData>) this.f1000c, (List<SyncData>) this.f999b, (List<String>) this.e), bda.a(z));
                bcr.this.d.uploadDataForTransTooLarge(this.f998a, this.d, new byte[0], this.h, true);
            } catch (RemoteException e) {
                e = e;
                bcw.d("SyncServiceProtocol", "uploadData resolveTooLarge error :" + e.toString());
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                bcw.d("SyncServiceProtocol", "uploadData resolveTooLarge error :" + e.toString());
            } catch (JSONException unused) {
                bcw.d("SyncServiceProtocol", "uploadData resolveTooLarge error : JSONException");
            }
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void execute() throws RemoteException {
            bcw.c("SyncServiceProtocol", "uploadData");
            try {
                byte[] bArrB = bcr.this.b((List<SyncData>) this.f1000c, (List<SyncData>) this.f999b, (List<String>) this.e);
                bcw.c("SyncServiceProtocol", "uploadData parcelData size = " + bArrB.length);
                if (bArrB.length >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    d(true);
                } else {
                    bcr.this.d.uploadData(this.f998a, this.d, this.f1000c, this.f999b, this.e, this.h);
                }
            } catch (Exception e) {
                bcw.c("SyncServiceProtocol", "uploadData Exception :" + e.getMessage());
                bcr.this.d.uploadData(this.f998a, this.d, this.f1000c, this.f999b, this.e, this.h);
            }
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void executeBatches(byte[] bArr) throws RemoteException {
            if (bcr.this.d != null) {
                bcr.this.d.uploadDataForTransTooLarge(this.f998a, this.d, bArr, this.h, false);
            } else {
                bcw.d("SyncServiceProtocol", "syncService is null");
            }
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void handleTranDataTooLarge() {
            bcw.c("SyncServiceProtocol", "uploadData handleTranDataTooLarge");
            d(false);
        }
    }

    class h extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1001a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f1003c;
        final /* synthetic */ ISyncServiceCallback d;
        final /* synthetic */ String e;

        h(ISyncServiceCallback iSyncServiceCallback, String str, String str2, List list) {
            this.d = iSyncServiceCallback;
            this.f1001a = str;
            this.e = str2;
            this.f1003c = list;
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void execute() throws RemoteException {
            bcr.d(this.d, 300000L, "getStructData");
            bcr.this.d.getStructData(this.f1001a, this.e, this.f1003c);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void executeBatches(byte[] bArr) throws RemoteException {
            if (bcr.this.d != null) {
                bcr.this.d.getStructDataForTransTooLarge(this.f1001a, this.e, bArr, false);
            } else {
                bcw.d("SyncServiceProtocol", "syncService is null");
            }
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void handleTranDataTooLarge() {
            try {
                a(this.f1003c.toString().getBytes("UTF-8"));
                bcr.this.d.getStructDataForTransTooLarge(this.f1001a, this.e, new byte[0], true);
            } catch (RemoteException | UnsupportedEncodingException e) {
                bcw.d("SyncServiceProtocol", "getStructData:" + e.toString());
            }
        }
    }

    class i extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f1006c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        i(String str, String str2, String str3, String str4, String str5) {
            this.d = str;
            this.f1005b = str2;
            this.e = str3;
            this.f1006c = str4;
            this.f1004a = str5;
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void execute() throws RemoteException {
            bcr.this.d.reportSyncInfo(this.d, this.f1005b, this.e, this.f1006c, this.f1004a);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void executeBatches(byte[] bArr) throws RemoteException {
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void handleTranDataTooLarge() {
        }
    }

    class j extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f1007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1008b;

        j(String str, List list) {
            this.f1008b = str;
            this.f1007a = list;
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void execute() throws RemoteException {
            bcw.c("SyncServiceProtocol", "getExceedLimitNum from server");
            bcr.this.d.getExceedLimitNum(this.f1008b, this.f1007a);
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void executeBatches(byte[] bArr) throws RemoteException {
        }

        @Override // com.huawei.android.hicloud.sync.service.IServiceProtocol
        public void handleTranDataTooLarge() {
        }
    }

    private JSONArray d(List<UnstructDataV107> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                UnstructDataV107 unstructDataV107 = list.get(i2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", unstructDataV107.getId());
                jSONObject.put("unstruct_uuid", unstructDataV107.getUnstructUuid());
                jSONObject.put("name", unstructDataV107.getName());
                jSONObject.put("hash", unstructDataV107.getHash());
                jSONObject.put("version", unstructDataV107.getVersion());
                jSONObject.put("optType", unstructDataV107.getOptType());
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    private void b(IServiceProtocol iServiceProtocol, boolean z, ISyncServiceCallback iSyncServiceCallback) {
        bcw.c("SyncServiceProtocol", "serviceConnection: isServiceConnected = " + this.h);
        if (this.h) {
            try {
                a(iServiceProtocol, z, iSyncServiceCallback);
                return;
            } catch (RemoteException e2) {
                bcw.e("SyncServiceProtocol", "serviceConnection exception : " + e2.toString());
                e(iServiceProtocol, z, iSyncServiceCallback);
                return;
            } catch (Exception e3) {
                bcw.d("SyncServiceProtocol", "serviceConnection error: Exception: " + e3.getMessage());
                return;
            }
        }
        e(iServiceProtocol, z, iSyncServiceCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IServiceProtocol iServiceProtocol, boolean z, ISyncServiceCallback iSyncServiceCallback) throws RemoteException {
        bcw.c("SyncServiceProtocol", "onCloudServiceConnected: mCallbackRegistered = " + this.j);
        try {
            ISyncService iSyncService = this.d;
            if (iSyncService != null) {
                if (!this.j) {
                    this.j = iSyncService.registerCallback(iSyncServiceCallback, this.f982c);
                }
                bcw.c("SyncServiceProtocol", "register callback, mCallbackRegistered:" + this.j);
                iServiceProtocol.execute();
            }
        } catch (TransactionTooLargeException e2) {
            bcw.e("SyncServiceProtocol", "TransactionTooLargeException: " + e2.getMessage());
            iServiceProtocol.handleTranDataTooLarge();
        }
        if (z) {
            return;
        }
        c(iSyncServiceCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONArray e(List<UnstructData> list) throws JSONException {
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

    private void e(IServiceProtocol iServiceProtocol, boolean z, ISyncServiceCallback iSyncServiceCallback) {
        bcw.c("SyncServiceProtocol", "bindCloudService");
        d dVar = new d(iServiceProtocol, z, iSyncServiceCallback);
        this.e = dVar;
        this.o.add(dVar);
        c();
    }

    private void c() {
        bcw.a("SyncServiceProtocol", "doBindService");
        try {
            Intent intent = new Intent();
            intent.setAction("com.huawei.android.hicloud.sync.synclogicservice");
            intent.setClassName("com.huawei.hidisk", "com.huawei.android.hicloud.sync.service.aidl.SyncLogicService");
            this.f980a = this.f981b.bindService(intent, this.e, 1);
        } catch (Exception e2) {
            bcw.d("SyncServiceProtocol", "doBindService exception: Call app SyncEnd, " + e2.getMessage());
            if (this.g != null) {
                a("doBindService exception");
            }
        }
    }

    public void c(String str, String str2, List<String> list, ISyncServiceCallback iSyncServiceCallback) {
        bcw.c("SyncServiceProtocol", "Get struct data, type = " + str + ", dataType = " + str2 + ", list size = " + list.size());
        b((IServiceProtocol) new h(iSyncServiceCallback, str, str2, list), true, iSyncServiceCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] b(List<SyncData> list, List<SyncData> list2, List<String> list3) throws JSONException, UnsupportedEncodingException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("add", c(list));
        jSONObject.put("modify", c(list2));
        jSONObject.put("delete", list3.toString());
        return jSONObject.toString().getBytes("UTF-8");
    }

    public void c(ISyncServiceCallback iSyncServiceCallback) {
        bcw.c("SyncServiceProtocol", "doUnbindService, mIsBound: " + this.f980a);
        try {
            if (this.f980a) {
                if (this.j && this.d != null) {
                    try {
                        bcw.c("SyncServiceProtocol", "unregisterCallback");
                        this.d.unregisterCallback(iSyncServiceCallback, this.f982c);
                    } catch (RemoteException unused) {
                        bcw.d("SyncServiceProtocol", "unregisterCallback error");
                    }
                    this.j = false;
                }
                bcw.c("SyncServiceProtocol", "all serviceConnection list size = " + this.o.size());
                if (!this.o.isEmpty()) {
                    bcw.c("SyncServiceProtocol", "doUnbindServiceList");
                    for (ServiceConnection serviceConnection : this.o) {
                        if (serviceConnection != null) {
                            bcw.c("SyncServiceProtocol", "doUnbindService item");
                            Context context = this.f981b;
                            if (context != null) {
                                context.unbindService(serviceConnection);
                            } else {
                                bcw.c("SyncServiceProtocol", "doUnbindServiceList mcontext is null");
                            }
                        } else {
                            bcw.a("SyncServiceProtocol", "doUnbindServiceList->connection item is null");
                        }
                    }
                    this.f = false;
                    this.h = false;
                    this.f980a = false;
                    this.d = null;
                    this.o.clear();
                    return;
                }
                bcw.a("SyncServiceProtocol", "doUnbindServiceList->connection list is empty");
            }
        } catch (Exception e2) {
            bcw.d("SyncServiceProtocol", "doUnbindService failed , e = " + e2.toString());
        }
    }

    private JSONArray c(List<? extends SyncData> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                SyncData syncData = list.get(i2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("luid", syncData.getLuid());
                jSONObject.put("guid", syncData.getGuid());
                jSONObject.put("unstruct_uuid", syncData.getUnstruct_uuid());
                jSONObject.put("etag", syncData.getEtag());
                jSONObject.put("data", syncData.getData());
                jSONObject.put("uuid", syncData.getUuid());
                jSONObject.put("status", syncData.getStatus());
                jSONObject.put("hash", syncData.getHash());
                List<UnstructData> fileList = syncData.getFileList();
                List<UnstructData> downFileList = syncData.getDownFileList();
                List<UnstructData> deleteFileList = syncData.getDeleteFileList();
                JSONArray jSONArrayE = e(fileList);
                JSONArray jSONArrayE2 = e(downFileList);
                JSONArray jSONArrayE3 = e(deleteFileList);
                jSONObject.put("downFileList", jSONArrayE2);
                jSONObject.put("deleteFileList", jSONArrayE3);
                jSONObject.put("filelist", jSONArrayE);
                if (this.i >= 104) {
                    jSONObject.put("recycleStatus", syncData.getRecycleStatus());
                    jSONObject.put("recycleTime", syncData.getRecycleTime());
                    jSONObject.put("version", syncData.getVersion());
                }
                if (this.i >= 107) {
                    jSONObject.put("extensionData", syncData.getExtensionData());
                    jSONObject.put("extraParam", syncData.getExtraParam());
                    List<UnstructDataV107> newFileList = syncData.getNewFileList();
                    List<UnstructDataV107> newDownFileList = syncData.getNewDownFileList();
                    List<UnstructDataV107> newDeleteFileList = syncData.getNewDeleteFileList();
                    JSONArray jSONArrayD = d(newFileList);
                    JSONArray jSONArrayD2 = d(newDownFileList);
                    JSONArray jSONArrayD3 = d(newDeleteFileList);
                    jSONObject.put("newDownFileList", jSONArrayD2);
                    jSONObject.put("newDeleteFileList", jSONArrayD3);
                    jSONObject.put("newFileList", jSONArrayD);
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public void b(String str, List<String> list, ISyncServiceCallback iSyncServiceCallback) {
        bcw.c("SyncServiceProtocol", "getExceedLimitNum");
        this.f = false;
        b((IServiceProtocol) new j(str, list), true, iSyncServiceCallback);
    }

    public void a(String str, String str2, List<SyncData> list, List<SyncData> list2, List<String> list3, boolean z, ISyncServiceCallback iSyncServiceCallback) {
        bcw.c("SyncServiceProtocol", "uploadData");
        b((IServiceProtocol) new g(list, list2, list3, str, str2, z), true, iSyncServiceCallback);
    }

    public void d(String str, List<String> list, List<String> list2, ISyncServiceCallback iSyncServiceCallback) {
        bcw.c("SyncServiceProtocol", "endSync, syncTpe = " + str + ", dataTypeList = " + list.toString() + ", dataTypeResultList = " + list2.toString());
        b((IServiceProtocol) new c(iSyncServiceCallback, str, list, list2), true, iSyncServiceCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] a(List<String> list, List<String> list2) throws JSONException, UnsupportedEncodingException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("dataTypeList", list.toString());
        jSONObject.put("dataTypeResultList", list2.toString());
        return jSONObject.toString().getBytes("UTF-8");
    }

    public void b(String str, String str2, List<UnstructData> list, ISyncServiceCallback iSyncServiceCallback) {
        bcw.c("SyncServiceProtocol", "downUnstructFile");
        this.f = true;
        b((IServiceProtocol) new b(str, str2, list), true, iSyncServiceCallback);
    }

    public void d(String str, String str2, boolean z, ISyncServiceCallback iSyncServiceCallback) {
        bcw.c("SyncServiceProtocol", "report: syncType = " + str + ", reportJson = " + str2);
        b(new e(str, str2), z, iSyncServiceCallback);
    }

    public void b(String str, String str2, String str3, String str4, ISyncServiceCallback iSyncServiceCallback) {
        bcw.c("SyncServiceProtocol", "reportSyncRsn: syncType = " + str + ", packageName = " + str2 + ", versionName = " + str3 + ", reportJson = " + str4);
        b((IServiceProtocol) new a(str, str2, str3, str4), true, iSyncServiceCallback);
    }

    public void c(String str, String str2, String str3, String str4, String str5, ISyncServiceCallback iSyncServiceCallback) {
        bcw.c("SyncServiceProtocol", "reportSyncInfo syncType: " + str + " appId: " + str2 + " packageName: " + str3 + " versionName: " + str4);
        b((IServiceProtocol) new i(str, str2, str3, str4, str5), true, iSyncServiceCallback);
    }

    public static void d(ISyncServiceCallback iSyncServiceCallback, long j2, String str) {
        try {
            bcw.c("SyncServiceProtocol", "sendTimeOutMessage");
            Bundle bundle = new Bundle();
            bundle.putLong("timeOut", j2);
            bundle.putString("timeOutMethod", str);
            iSyncServiceCallback.handlerEventMsg(PrebakedEffectId.RT_CALENDAR_DATE, 0, 0, bundle);
        } catch (RemoteException e2) {
            bcw.d("SyncServiceProtocol", "sendTimeOutMessage error: " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f) {
            bcw.c("SyncServiceProtocol", str + ": Call app SyncEnd");
            bda.b(this.g);
            return;
        }
        bcw.c("SyncServiceProtocol", str + ": no need EndSync");
        this.f = true;
    }
}
