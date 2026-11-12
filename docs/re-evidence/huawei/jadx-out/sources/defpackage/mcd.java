package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mcd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile mcd f41397b;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<IAppTransferFileResultAIDLCallback, List<Integer>> f41398a = new HashMap(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback f41399c = new com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback.Stub() { // from class: mcd.3
        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileTransferState(int i, String str) {
            LogUtil.a("AarTransferFileRequest", "mWatchFaceResultAidlCallback, onFileTransferState percentage:", Integer.valueOf(i), ",des：", str);
            if (mcd.this.f41398a.size() > 0) {
                mcd.this.d(i, str, "transferstate");
            }
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onUpgradeFailed(int i, String str) {
            LogUtil.a("AarTransferFileRequest", "mWatchFaceResultAidlCallback, onUpgradeFailed errorCode:", Integer.valueOf(i), ",des:", str);
            if (mcd.this.f41398a.size() > 0) {
                mcd.this.d(i, str, "FAILED");
            }
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileRespond(int i, String str) {
            LogUtil.a("AarTransferFileRequest", "mWatchFaceResultAidlCallback, checkResult:", Integer.valueOf(i), ",des：", str);
            if (mcd.this.f41398a.size() > 0) {
                mcd.this.d(i, str, "RESPOND");
            }
        }
    };

    private mcd() {
        LogUtil.a("AarTransferFileRequest", "create AarTransferFileRequest");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str, String str2) {
        int iA = a(str);
        for (Map.Entry<IAppTransferFileResultAIDLCallback, List<Integer>> entry : this.f41398a.entrySet()) {
            for (Integer num : entry.getValue()) {
                LogUtil.a("AarTransferFileRequest", "entry type is:", num, ",fileType is:", Integer.valueOf(iA));
                b(i, str, str2, num.intValue(), entry.getKey());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    private void b(int i, String str, String str2, int i2, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        byte b2;
        if (i2 == a(str)) {
            str2.hashCode();
            int iHashCode = str2.hashCode();
            if (iHashCode != -1995487354) {
                if (iHashCode != 1815383157) {
                    if (iHashCode == 2066319421 && str2.equals("FAILED")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals("RESPOND")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals("transferstate")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                LogUtil.a("AarTransferFileRequest", "deviceStartTransfer onFileTransferState percentage: ", Integer.valueOf(i));
                iAppTransferFileResultAIDLCallback.onFileTransferState(i, str);
            } else if (b2 == 1) {
                LogUtil.a("AarTransferFileRequest", "deviceStartTransfer onFileRespond checkResult: ", Integer.valueOf(i));
                iAppTransferFileResultAIDLCallback.onFileRespond(i, str);
            } else if (b2 != 2) {
                LogUtil.j("AarTransferFileRequest", "call back error");
            } else {
                LogUtil.a("AarTransferFileRequest", "deviceStartTransfer onUpgradeFailed errorCode: ", Integer.valueOf(i));
                iAppTransferFileResultAIDLCallback.onUpgradeFailed(i, str);
            }
        }
    }

    public static mcd d() {
        mcd mcdVar;
        synchronized (d) {
            if (f41397b == null) {
                f41397b = new mcd();
            }
            mcdVar = f41397b;
        }
        return mcdVar;
    }

    public com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback c() {
        LogUtil.j("AarTransferFileRequest", "getCallback");
        return this.f41399c;
    }

    public com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback c(final IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        LogUtil.j("AarTransferFileRequest", "getDefaultCallback");
        return new com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback.Stub() { // from class: mcd.4
            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onFileTransferState(int i, String str) {
                iAppTransferFileResultAIDLCallback.onFileTransferState(i, str);
            }

            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onUpgradeFailed(int i, String str) {
                LogUtil.a("AarTransferFileRequest", "mWatchFaceResultAidlCallback, onUpgradeFailed:", Integer.valueOf(i));
                iAppTransferFileResultAIDLCallback.onUpgradeFailed(i, str);
            }

            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onFileRespond(int i, String str) {
                LogUtil.a("AarTransferFileRequest", "mWatchFaceResultAidlCallback, checkResult:", Integer.valueOf(i));
                iAppTransferFileResultAIDLCallback.onFileRespond(i, str);
            }
        };
    }

    public void b(List<Integer> list, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        LogUtil.a("AarTransferFileRequest", "registToDevicesCallback put");
        this.f41398a.put(iAppTransferFileResultAIDLCallback, list);
        LogUtil.a("AarTransferFileRequest", "mAarCallbackMap size :", Integer.valueOf(this.f41398a.size()));
    }

    public void e(List<Integer> list, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        LogUtil.a("AarTransferFileRequest", "unregisterCallback remove");
        this.f41398a.remove(iAppTransferFileResultAIDLCallback);
        LogUtil.a("AarTransferFileRequest", "mAarCallbackMap size :", Integer.valueOf(this.f41398a.size()));
    }

    private int a(String str) {
        try {
            return new JSONObject(str).getInt("fileType");
        } catch (JSONException unused) {
            LogUtil.e("AarTransferFileRequest", "JSONObject is eror");
            return 0;
        }
    }
}
