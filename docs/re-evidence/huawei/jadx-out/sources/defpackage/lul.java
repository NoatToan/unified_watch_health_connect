package defpackage;

import android.os.RemoteException;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<IAppTransferFileResultAIDLCallback, List<Integer>> f40846a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IAppTransferFileResultAIDLCallback f40847c;

    private lul() {
        this.f40846a = new HashMap(16);
        this.f40847c = new IAppTransferFileResultAIDLCallback.Stub() { // from class: lul.5
            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onFileTransferState(int i, String str) {
                LogUtil.a("CommonTransferFileRequest", "mWatchFaceResultAidlCallback, onFileTransferState percentage:", Integer.valueOf(i), ",des", str);
                if (lul.this.f40846a.size() > 0) {
                    int iC = lul.this.c(str);
                    for (Map.Entry entry : lul.this.f40846a.entrySet()) {
                        if (entry != null) {
                            for (Integer num : (List) entry.getValue()) {
                                LogUtil.a("CommonTransferFileRequest", "entry type is:", num, ",fileType is:", Integer.valueOf(iC));
                                if (iC != 0 && num.intValue() == iC) {
                                    IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback = (IAppTransferFileResultAIDLCallback) entry.getKey();
                                    try {
                                        LogUtil.a("CommonTransferFileRequest", "deviceStartTransfer onFileTransferState percentage: ", Integer.valueOf(i));
                                        if (iAppTransferFileResultAIDLCallback != null) {
                                            iAppTransferFileResultAIDLCallback.onFileTransferState(i, str);
                                            LogUtil.a("CommonTransferFileRequest", "onFileTransferState success");
                                        }
                                    } catch (RemoteException unused) {
                                        LogUtil.e("CommonTransferFileRequest", "onFileTransferState remoteException");
                                    }
                                }
                            }
                        }
                    }
                }
            }

            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onUpgradeFailed(int i, String str) {
                LogUtil.a("CommonTransferFileRequest", "mWatchFaceResultAidlCallback, onUpgradeFailed errorCode:", Integer.valueOf(i), ",des", str);
                if (lul.this.f40846a.size() > 0) {
                    int iC = lul.this.c(str);
                    for (Map.Entry entry : lul.this.f40846a.entrySet()) {
                        if (entry != null) {
                            for (Integer num : (List) entry.getValue()) {
                                LogUtil.a("CommonTransferFileRequest", "entry type is:", num, ",fileType is:", Integer.valueOf(iC));
                                if (iC != 0 && num.intValue() == iC) {
                                    IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback = (IAppTransferFileResultAIDLCallback) entry.getKey();
                                    try {
                                        LogUtil.a("CommonTransferFileRequest", "deviceStartTransfer onUpgradeFailed errorCode: ", Integer.valueOf(i));
                                        if (iAppTransferFileResultAIDLCallback != null) {
                                            iAppTransferFileResultAIDLCallback.onUpgradeFailed(i, str);
                                            LogUtil.a("CommonTransferFileRequest", "onFileTransferState success");
                                        }
                                    } catch (RemoteException unused) {
                                        LogUtil.e("CommonTransferFileRequest", "onFileTransferState remoteException");
                                    }
                                }
                            }
                        }
                    }
                }
            }

            @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
            public void onFileRespond(int i, String str) {
                LogUtil.a("CommonTransferFileRequest", "mWatchFaceResultAidlCallback, checkResult:", Integer.valueOf(i), ",des", str);
                if (lul.this.f40846a.size() > 0) {
                    int iC = lul.this.c(str);
                    for (Map.Entry entry : lul.this.f40846a.entrySet()) {
                        if (entry != null) {
                            for (Integer num : (List) entry.getValue()) {
                                LogUtil.a("CommonTransferFileRequest", "entry type is:", num, ",fileType is:", Integer.valueOf(iC));
                                if (iC != 0 && num.intValue() == iC) {
                                    IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback = (IAppTransferFileResultAIDLCallback) entry.getKey();
                                    try {
                                        LogUtil.a("CommonTransferFileRequest", "deviceStartTransfer onFileRespond checkResult: ", Integer.valueOf(i));
                                        if (iAppTransferFileResultAIDLCallback != null) {
                                            iAppTransferFileResultAIDLCallback.onFileRespond(i, str);
                                            LogUtil.a("CommonTransferFileRequest", "onFileTransferState success");
                                        }
                                    } catch (RemoteException unused) {
                                        LogUtil.e("CommonTransferFileRequest", "onFileTransferState remoteException");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        };
        LogUtil.a("CommonTransferFileRequest", "create AarCommonTransferFileRequest");
    }

    public static lul e() {
        return b.e;
    }

    public void d(List<Integer> list, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        LogUtil.a("CommonTransferFileRequest", "registToDevicesCallback put");
        if (iAppTransferFileResultAIDLCallback == null) {
            LogUtil.j("CommonTransferFileRequest", "callback is null");
        } else {
            this.f40846a.put(iAppTransferFileResultAIDLCallback, list);
            LogUtil.a("CommonTransferFileRequest", "mCommonCallbackMap size is :", Integer.valueOf(this.f40846a.size()));
        }
    }

    public void a(List<Integer> list, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        LogUtil.a("CommonTransferFileRequest", "unregisterCallback remove");
        if (iAppTransferFileResultAIDLCallback == null) {
            LogUtil.j("CommonTransferFileRequest", "callback is null");
        } else {
            this.f40846a.remove(iAppTransferFileResultAIDLCallback);
            LogUtil.a("CommonTransferFileRequest", "mCommonCallbackMap size is :", Integer.valueOf(this.f40846a.size()));
        }
    }

    public IAppTransferFileResultAIDLCallback b() {
        LogUtil.j("CommonTransferFileRequest", "getCallback");
        return this.f40847c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(String str) {
        try {
            return new JSONObject(str).getInt("fileType");
        } catch (JSONException unused) {
            LogUtil.a("CommonTransferFileRequest", "JSONObject is eror");
            return 0;
        }
    }

    static class b {
        private static lul e = new lul();
    }
}
