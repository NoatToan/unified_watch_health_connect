package com.huawei.android.hicloud.sync.logic;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.android.hicloud.sync.service.aidl.FileDownloadProgress;
import com.huawei.android.hicloud.sync.service.aidl.ISyncServiceCallback;
import com.huawei.android.hicloud.sync.service.aidl.UnstructData;
import com.huawei.operation.utils.Constants;
import defpackage.bcl;
import defpackage.bcp;
import defpackage.bcq;
import defpackage.bcs;
import defpackage.bcw;
import defpackage.bda;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final bcs f5101a;
    SyncDownloadInterface d;
    private final String e;
    private final String f;
    private final String g;
    private Context h;
    final ISyncServiceCallback j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HandlerThread f5102b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f5103c = null;
    StringBuffer i = new StringBuffer();

    class b extends ISyncServiceCallback.Stub {
        b() {
        }

        @Override // com.huawei.android.hicloud.sync.service.aidl.ISyncServiceCallback
        public void handlerEventMsg(int i, int i2, int i3, Bundle bundle) throws RemoteException {
            StringBuilder sb = new StringBuilder("handler download EventMsg, mHandler is null: ");
            sb.append(n.this.f5103c == null);
            bcw.c("DownloadSyncBase", sb.toString());
            if (n.this.f5103c != null) {
                n.this.f5103c.sendMessage(n.this.f5103c.obtainMessage(i, i2, i3, bundle));
            }
        }
    }

    class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String string;
            try {
                bcw.c("DownloadSyncBase", "Begin handle download Message msg.what = " + message.what);
                Bundle bundle = (Bundle) message.obj;
                if (bundle == null) {
                    bcw.e("DownloadSyncBase", "Receive download bundle is null");
                    return;
                }
                bundle.setClassLoader(n.class.getClassLoader());
                String string2 = bundle.getString("callbackUuid");
                string = bundle.getString("session_id");
                try {
                    if (TextUtils.equals(string2, n.this.f5101a.c())) {
                        boolean z = bundle.getBoolean("is_in_batches", false);
                        if (!z || n.this.a(bundle)) {
                            n.this.a(message, bundle, z);
                            return;
                        }
                        return;
                    }
                    bcw.e("DownloadSyncBase", "download msg not equal: targetUuid = " + string2 + ", thisUuid = " + n.this.f5101a.c());
                } catch (Exception e) {
                    e = e;
                    bcw.e("DownloadSyncBase", "handle download msg error: " + e.toString());
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    n.this.b(string, "handle download msg error");
                }
            } catch (Exception e2) {
                e = e2;
                string = null;
            }
        }
    }

    n(Context context, String str, String str2, String str3, SyncDownloadInterface syncDownloadInterface) {
        b bVar = new b();
        this.j = bVar;
        this.h = context;
        this.e = str;
        this.f = str2;
        this.d = syncDownloadInterface;
        this.g = str3;
        this.f5101a = new bcs(context, str, str2, str3, bVar);
        b();
        bcw.c("DownloadSyncBase", "new DownloadSyncBase, syncType = " + str + ", dataType = " + str2 + ", sessionId = " + str3);
    }

    private void b() {
        if (this.f5103c == null) {
            HandlerThread handlerThread = new HandlerThread("DownloadSyncBase" + this.f5101a.c());
            this.f5102b = handlerThread;
            handlerThread.start();
            this.f5103c = new c(this.f5102b.getLooper());
        }
    }

    private void d(Bundle bundle, boolean z) {
        FileDownloadProgress fileDownloadProgress;
        try {
            if (z) {
                try {
                    JSONObject jSONObject = new JSONObject(this.i.toString());
                    fileDownloadProgress = (FileDownloadProgress) jSONObject.get("down_file_progress_data");
                    this.i = new StringBuffer();
                } catch (JSONException e) {
                    bcw.d("DownloadSyncBase", "downLoadFileProgress batch error : " + e.getMessage());
                    return;
                }
            } else {
                try {
                    bundle.getString("syncType");
                    bundle.getString("dataType");
                    fileDownloadProgress = (FileDownloadProgress) bundle.getParcelable("down_file_progress_data");
                } catch (ClassCastException e2) {
                    bcw.d("DownloadSyncBase", "downLoadFileProgress error:" + e2.toString());
                    fileDownloadProgress = null;
                }
            }
            a(fileDownloadProgress);
        } catch (Exception e3) {
            bcw.d("DownloadSyncBase", "downLoadFileProgress error " + e3.getMessage());
        }
    }

    private void e(Bundle bundle, boolean z) {
        UnstructData unstructData;
        try {
            if (z) {
                try {
                    JSONObject jSONObject = new JSONObject(this.i.toString());
                    unstructData = (UnstructData) jSONObject.get("down_file_data");
                    this.i = new StringBuffer();
                } catch (JSONException e) {
                    bcw.d("DownloadSyncBase", "downLoadFileSuccess batch error : " + e.getMessage());
                    return;
                }
            } else {
                try {
                    unstructData = (UnstructData) bundle.getParcelable("down_file_data");
                    try {
                        bundle.getString("syncType");
                        bundle.getString("dataType");
                    } catch (ClassCastException e2) {
                        e = e2;
                        bcw.d("DownloadSyncBase", "downLoadFileSuccess error:" + e.toString());
                    }
                } catch (ClassCastException e3) {
                    e = e3;
                    unstructData = null;
                }
            }
            b(unstructData);
        } catch (Exception e4) {
            bcw.d("DownloadSyncBase", "downLoadFileSuccess error " + e4.getMessage());
        }
    }

    protected void c(String str, String str2, List<UnstructData> list, String str3) {
        this.f5101a.c(str, str2, list, str3);
    }

    private void c(Bundle bundle, boolean z) {
        UnstructData unstructData;
        int i;
        try {
            if (z) {
                try {
                    JSONObject jSONObject = new JSONObject(this.i.toString());
                    unstructData = (UnstructData) jSONObject.get("down_file_data");
                    i = jSONObject.getInt("down_file_error_code");
                    this.i = new StringBuffer();
                } catch (JSONException e) {
                    bcw.d("DownloadSyncBase", "downLoadFileFail batch error : " + e.getMessage());
                    return;
                }
            } else {
                try {
                    bundle.getString("syncType");
                    bundle.getString("dataType");
                    unstructData = (UnstructData) bundle.getParcelable("down_file_data");
                    try {
                        i = bundle.getInt("down_file_error_code");
                    } catch (ClassCastException e2) {
                        e = e2;
                        bcw.d("DownloadSyncBase", "downLoadFileFail error:" + e.toString());
                        i = -1;
                    }
                } catch (ClassCastException e3) {
                    e = e3;
                    unstructData = null;
                }
            }
            a(unstructData, i);
        } catch (Exception e4) {
            bcw.d("DownloadSyncBase", "downLoadFileFail error " + e4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message, Bundle bundle, boolean z) throws JSONException {
        bcw.c("DownloadSyncBase", "Begin process download Message = " + message.what);
        switch (message.what) {
            case 10018:
                d(bundle, z);
                break;
            case 10019:
                e(bundle, z);
                break;
            case 10020:
                c(bundle, z);
                break;
            case 10021:
                b(bundle, z);
                break;
            case 10022:
            default:
                bcw.d("DownloadSyncBase", "Receive error download msg, msg.what = " + message.what);
                String string = bundle.getString("session_id");
                if (!TextUtils.isEmpty(string)) {
                    b(string, "Receive error download msg");
                }
                break;
            case 10023:
                b(bundle);
                break;
            case 10024:
                a();
                break;
            case 10025:
                a(bundle, z);
                break;
        }
    }

    protected void b(String str, String str2, List<UnstructData> list, String str3) {
        this.f5101a.e(str, str2, list, str3);
    }

    protected void b(String str, String str2) {
        this.f5101a.a(str, str2);
    }

    private void b(Bundle bundle, boolean z) throws JSONException {
        String string;
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            bcq<Integer, List<String>> bcqVar = new bcq<>();
            if (z) {
                try {
                    JSONObject jSONObject = new JSONObject(this.i.toString());
                    string = jSONObject.getString("session_id");
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("down_file_success_list");
                        JSONArray jSONArrayC = bda.c(jSONObject, "down_file_fail_map");
                        arrayList = bcl.a(jSONArray);
                        bcqVar = bcl.c(jSONArrayC);
                    } catch (JSONException e) {
                        e = e;
                        bcw.d("DownloadSyncBase", "downLoadFileComplete batch error : " + e.getMessage());
                    }
                } catch (JSONException e2) {
                    e = e2;
                    string = "";
                }
                this.i = new StringBuffer();
            } else {
                string = bundle.getString("session_id");
                arrayList = bundle.getStringArrayList("down_file_success_list");
                bundle.getString("syncType");
                bundle.getString("dataType");
                try {
                    bcqVar = (bcq) bundle.getSerializable("down_file_fail_map");
                } catch (ClassCastException e3) {
                    bcw.d("DownloadSyncBase", "downLoadFileComplete error:" + e3.toString());
                }
            }
            Map<Integer, List<String>> map = new HashMap<>();
            if (bcqVar != null) {
                map = bcqVar.d();
            }
            a(string, arrayList, map);
        } catch (Exception e4) {
            bcw.d("DownloadSyncBase", "downLoadFileComplete error " + e4.getMessage());
        } finally {
            a();
            bda.b(this.f5102b);
        }
    }

    protected void a(String str, String str2, List<UnstructData> list, boolean z, boolean z2, String str3) {
        this.f5101a.c(str, str2, list, z, z2, str3);
    }

    protected void a(String str, String str2, List<UnstructData> list, String str3) {
        this.f5101a.b(str, str2, list, str3);
    }

    protected void a() {
        this.f5101a.b();
        bda.b(this.f5102b);
    }

    private void a(Bundle bundle, boolean z) {
        UnstructData unstructData;
        try {
            if (z) {
                try {
                    JSONObject jSONObject = new JSONObject(this.i.toString());
                    unstructData = (UnstructData) jSONObject.get("down_file_data");
                    this.i = new StringBuffer();
                } catch (JSONException e) {
                    bcw.d("DownloadSyncBase", "downLoadFileAbort batch error : " + e.getMessage());
                    return;
                }
            } else {
                try {
                    bundle.getString("syncType");
                    bundle.getString("dataType");
                    unstructData = (UnstructData) bundle.getParcelable("down_file_data");
                } catch (ClassCastException e2) {
                    bcw.d("DownloadSyncBase", "downLoadFileAbort error:" + e2.toString());
                    unstructData = null;
                }
            }
            a(unstructData);
        } catch (Exception e3) {
            bcw.d("DownloadSyncBase", "downLoadFileAbort error " + e3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Bundle bundle) {
        boolean z = bundle.getBoolean("is_send_over", false);
        bcw.c("DownloadSyncBase", "download sendOverFlag: " + z);
        if (z) {
            return true;
        }
        try {
            byte[] byteArray = bundle.getByteArray("batches_data_bytes_key");
            if (byteArray != null) {
                this.i.append(new String(byteArray, "UTF-8"));
            }
            return false;
        } catch (UnsupportedEncodingException e) {
            bcw.e("DownloadSyncBase", "download isAllBatchesReceiveOver: " + e.toString());
            this.i = new StringBuffer();
            return true;
        }
    }

    private void b(Bundle bundle) {
        String string;
        String string2 = "";
        try {
            try {
                string = bundle.getString("errorMsg");
                try {
                    bundle.getString("syncType");
                    bundle.getString("dataType");
                    string2 = bundle.getString("session_id");
                } catch (ClassCastException e) {
                    e = e;
                    bcw.d("DownloadSyncBase", "downLoadFileError error:" + e.toString());
                }
            } catch (Exception e2) {
                bcw.d("DownloadSyncBase", "downLoadFileError " + e2.getMessage());
                return;
            } finally {
                a();
                bda.b(this.f5102b);
            }
        } catch (ClassCastException e3) {
            e = e3;
            string = "";
        }
        a(string2, string);
    }

    boolean a(String str, List<String> list, Map<Integer, List<String>> map) {
        try {
            bcw.c("DownloadSyncBase", "Call app appDownloadFilesComplete start: dataType = " + this.f + ", sessionId = " + str + ", successList = " + list.toString() + ", failErrorCodeMap = " + map.toString());
            this.d.onDownloadFilesComplete(this.e, this.f, list, map, str);
            StringBuilder sb = new StringBuilder("Call app appDownloadFilesComplete end: dataType = ");
            sb.append(this.f);
            bcw.c("DownloadSyncBase", sb.toString());
            return true;
        } catch (bcp e) {
            bcw.e("DownloadSyncBase", "Call app aplicationException: code = " + e.b() + ", msg = " + e.getMessage());
            return false;
        }
    }

    boolean a(FileDownloadProgress fileDownloadProgress) {
        try {
            StringBuilder sb = new StringBuilder("Call app appOnDownloadFileProgress start: dataType = ");
            sb.append(this.f);
            sb.append(fileDownloadProgress == null ? Constants.NULL : fileDownloadProgress.toString());
            bcw.c("DownloadSyncBase", sb.toString());
            this.d.onDownloadFileProgress(this.e, this.f, fileDownloadProgress);
            bcw.c("DownloadSyncBase", "Call app appOnDownloadFileProgress end: dataType = " + this.f);
            return true;
        } catch (bcp e) {
            bcw.e("DownloadSyncBase", "Call app aplicationException: code = " + e.b() + ", msg = " + e.getMessage());
            return false;
        }
    }

    boolean a(UnstructData unstructData, int i) {
        try {
            StringBuilder sb = new StringBuilder("Call app appOnDownloadFileFail start: dataType = ");
            sb.append(this.f);
            sb.append(", errorCode = ");
            sb.append(i);
            sb.append(", unstructData = ");
            sb.append(unstructData == null ? Constants.NULL : unstructData.toString());
            bcw.c("DownloadSyncBase", sb.toString());
            this.d.onDownloadFileFail(this.e, this.f, unstructData, i);
            bcw.c("DownloadSyncBase", "Call app appOnDownloadFileFail end: dataType = " + this.f);
            return true;
        } catch (bcp e) {
            bcw.e("DownloadSyncBase", "Call app aplicationException: code = " + e.b() + ", msg = " + e.getMessage());
            return false;
        }
    }

    boolean b(UnstructData unstructData) {
        try {
            StringBuilder sb = new StringBuilder("Call app appOnDownloadFileSuccess start: dataType = ");
            sb.append(this.f);
            sb.append(", unstructData = ");
            sb.append(unstructData == null ? Constants.NULL : unstructData.toString());
            bcw.c("DownloadSyncBase", sb.toString());
            this.d.onDownloadFileSuccess(this.e, this.f, unstructData);
            bcw.c("DownloadSyncBase", "Call app appOnDownloadFileSuccess end: dataType = " + this.f);
            return true;
        } catch (bcp e) {
            bcw.e("DownloadSyncBase", "Call app aplicationException: code = " + e.b() + ", msg = " + e.getMessage());
            return false;
        }
    }

    boolean a(UnstructData unstructData) {
        try {
            StringBuilder sb = new StringBuilder("Call app appOnDownloadFileAbort start: dataType = ");
            sb.append(this.f);
            sb.append(", unstructData = ");
            sb.append(unstructData == null ? Constants.NULL : unstructData.toString());
            bcw.c("DownloadSyncBase", sb.toString());
            this.d.onDownloadFileAbort(this.e, this.f, unstructData);
            bcw.c("DownloadSyncBase", "Call app appOnDownloadFileAbort end: dataType = " + this.f);
            return true;
        } catch (bcp e) {
            bcw.e("DownloadSyncBase", "Call app aplicationException: code = " + e.b() + ", msg = " + e.getMessage());
            return false;
        }
    }

    boolean a(String str, String str2) {
        try {
            bcw.c("DownloadSyncBase", "Call app appOnDownloadFileError start: dataType = " + this.f + ", errorMsg = " + str2);
            this.d.onDownloadFilesError(this.e, this.f, str2, str);
            StringBuilder sb = new StringBuilder("Call app appOnDownloadFileError end: dataType = ");
            sb.append(this.f);
            bcw.c("DownloadSyncBase", sb.toString());
            return true;
        } catch (bcp e) {
            bcw.e("DownloadSyncBase", "Call app processAplicationException: code = " + e.b() + ", msg = " + e.getMessage());
            return false;
        }
    }
}
