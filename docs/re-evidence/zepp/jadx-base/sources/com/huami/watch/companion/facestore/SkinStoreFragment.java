package com.huami.watch.companion.facestore;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.alipay.sdk.m.u.i;
import com.google.gson.Gson;
import com.huami.midong.webview.jsbridge.JsBridgeStatusWebView;
import com.huami.midong.webview.nativejsapi.IJsBridgeSyncWatchSkinCallback;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPI;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.R;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DeviceUnboundEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.companion.facestore.SkinStoreFragment;
import com.huami.watch.companion.facestore.database.TrackModel;
import com.huami.watch.companion.facestore.database.WactchFacesProvider;
import com.huami.watch.companion.facestore.database.WatchFacesDBContract;
import com.huami.watch.companion.facestore.database.WatchFacesDBHelper;
import com.huami.watch.companion.facestore.utils.DownloadTaskManager;
import com.huami.watch.companion.facestore.utils.DownloadTaskModel;
import com.huami.watch.companion.facestore.widgets.FaceDialogFragment;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.companion.watchface.WatchFace;
import com.huami.watch.companion.watchface.WatchFaceManager;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Log;
import com.huami.watch.util.NetworkUtil;
import com.huami.watch.util.RxBus;
import com.huami.watch.wififtp.CheckLocationServiceUtil;
import com.huami.watch.wififtp.PhoneWifiFtpUtil;
import com.huami.watch.wififtp.WatchWifiFtpUtil;
import com.huami.watch.wififtp.WifiFtpModule;
import com.liulishuo.filedownloader.BaseDownloadTask;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class SkinStoreFragment extends Fragment implements IJsBridgeSyncWatchSkinCallback, FaceDialogFragment.OnDialogCancelListener {
    public static final int TYPE_RECOM = 0;
    public static final int TYPE_THIRD = 1;
    private static final String s0 = "JsWeb-SkinStoreFragment";
    private static FaceDialogFragment t0 = null;
    private static final String u0 = "param1";
    private static final int v0 = 60000;
    private static final String w0 = "face_manager_configs";
    private static final String x0 = "warning_connect_ap";
    private PhoneWifiFtpUtil T;
    private Transporter c;
    private DeviceManager d;
    private Context e;
    private JsBridgeStatusWebView f;
    private int g;
    private List<DownloadTaskModel> h;
    private DownloadTaskManager i;
    private String j;
    private f k;
    private SQLiteDatabase m;
    private HandlerThread n;
    private Disposable n0;
    private WorkHandler o;
    public boolean r0;
    private boolean a = true;
    private boolean b = false;
    private HashMap<String, TrackModel> l = new HashMap<>();
    private final int p = 11;
    private final int q = 101;
    private final int r = 102;
    private final int s = 103;
    private final int t = 104;
    private final int u = 105;
    private final int v = 106;
    private final int w = 107;
    private final int x = 108;
    private final int y = 109;
    private final int z = 110;
    private final int A = 50;
    private final int B = 51;
    private final int C = 1001;
    private final int D = 1002;
    private final int E = 123;
    private final int F = 124;
    private final int G = 125;
    private int H = -1;
    private int I = -1;
    private boolean J = false;
    private boolean K = false;
    private final int L = -1;
    private final int M = 0;
    private final int N = 1;
    private final int O = 2;
    private final int P = 3;
    private int Q = -1;
    private boolean R = true;
    private final ArrayList<File> S = new ArrayList<>();
    private final String U = ".wfz";
    private final String V = "WatchFace/";
    private ArrayList<File> W = new ArrayList<>();
    private PhoneWifiFtpUtil.FTPCallback X = new a();
    private WatchWifiFtpUtil.WatchAPStateListener Y = new b();
    private WatchWifiFtpUtil.WatchFTPListener Z = new c();
    private PhoneWifiFtpUtil.APConnectCallback m0 = new d();
    private final String o0 = "com.huami.watch.watchface.analogyellow";
    private final String p0 = "com.huami.watch.watchface.ExternalWatchFace:";
    private Handler q0 = new e();

    public static class ConnectAPWarningFragment extends android.app.Fragment {
        private CheckBox a;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            CheckBox checkBox = this.a;
            return checkBox != null && checkBox.isChecked();
        }

        @Override // android.app.Fragment
        @Nullable
        public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.fragment_ftp_connect_ap_warning, viewGroup, false);
            this.a = (CheckBox) viewInflate.findViewById(R.id.chkbox_block);
            return viewInflate;
        }
    }

    public class WorkHandler extends Handler {
        public WorkHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ArrayList<File> arrayList;
            int i = message.what;
            if (i == 11) {
                SkinStoreFragment.this.q0.removeMessages(125);
                SkinStoreFragment.this.q0.sendEmptyMessageDelayed(125, 60000L);
                SkinStoreFragment.this.l0(true);
                SkinStoreFragment.this.O((TrackModel) message.obj);
                return;
            }
            if (i == 1001) {
                int i2 = message.arg2;
                if (i2 == 13) {
                    if (SkinStoreFragment.this.R) {
                        SkinStoreFragment.this.f0("onFTPServerStateChanged: WIFI_AP_STATE_ENABLED");
                    }
                    SkinStoreFragment.this.H = i2;
                    SkinStoreFragment.this.t0();
                    sendEmptyMessage(102);
                    return;
                }
                if (i2 == 11) {
                    if (SkinStoreFragment.this.R) {
                        SkinStoreFragment.this.f0("onFTPServerStateChanged: WIFI_AP_STATE_DISABLED");
                    }
                    SkinStoreFragment.this.H = i2;
                    SkinStoreFragment.this.t0();
                    sendEmptyMessage(103);
                    if (SkinStoreFragment.this.b) {
                        SkinStoreFragment.this.f0("force to close wifi");
                        SkinStoreFragment.this.q0.sendEmptyMessage(124);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 1002) {
                int i3 = message.arg2;
                SkinStoreFragment.this.I = i3;
                SkinStoreFragment.this.t0();
                if (i3 == 2) {
                    if (SkinStoreFragment.this.R) {
                        SkinStoreFragment.this.f0("onFTPServerStateChanged: FTP_STATE_ENABLE");
                    }
                    sendEmptyMessage(104);
                    return;
                } else {
                    if (SkinStoreFragment.this.R) {
                        SkinStoreFragment.this.f0("onFTPServerStateChanged: FTP_STATE_DISABLE");
                        return;
                    }
                    return;
                }
            }
            switch (i) {
                case 101:
                    SkinStoreFragment.this.f0("do MSG_WATCH_ENABLE_AP");
                    SkinStoreFragment.this.q0.removeMessages(125);
                    SkinStoreFragment.this.q0.sendEmptyMessageDelayed(125, 60000L);
                    WatchWifiFtpUtil.get().setWatchAPStateListener(SkinStoreFragment.this.Y);
                    WatchWifiFtpUtil.get().setWatchFTPListener(SkinStoreFragment.this.Z);
                    WatchWifiFtpUtil.updatePassWord();
                    WatchWifiFtpUtil.get().enableWifiAP(WatchWifiFtpUtil.SSID, 4, WatchWifiFtpUtil.PSWD);
                    return;
                case 102:
                    SkinStoreFragment.this.f0("do MSG_WATCH_ENABLE_FTP");
                    SkinStoreFragment.this.q0.removeMessages(125);
                    SkinStoreFragment.this.q0.sendEmptyMessageDelayed(125, 60000L);
                    WifiFtpModule.sendEnableFtp();
                    return;
                case 103:
                    SkinStoreFragment.this.f0("do MSG_WATCH_DISABLE_FTP");
                    WifiFtpModule.sendDisableFtp();
                    return;
                case 104:
                    SkinStoreFragment.this.f0("do MSG_PHONE_CONNECT_AP");
                    SkinStoreFragment.this.q0.removeMessages(125);
                    SkinStoreFragment.this.q0.sendEmptyMessageDelayed(125, 60000L);
                    SkinStoreFragment.this.T.setAPConnectCallback(SkinStoreFragment.this.m0);
                    SkinStoreFragment.this.T.connectAP(WatchWifiFtpUtil.SSID, 4, WatchWifiFtpUtil.PSWD);
                    return;
                case 105:
                    SkinStoreFragment.this.f0("do MSG_PHONE_CONNECT_FTP");
                    SkinStoreFragment.this.q0.removeMessages(125);
                    SkinStoreFragment.this.q0.sendEmptyMessageDelayed(125, 60000L);
                    SkinStoreFragment.this.T.connectFTP();
                    return;
                case 106:
                    SkinStoreFragment.this.f0("do MSG_PHONE_DISCONNECT_FTP");
                    SkinStoreFragment.this.T.disconnectFTP();
                    return;
                case 107:
                    SkinStoreFragment.this.f0("do MSG_UPLOAD_FILES");
                    SkinStoreFragment.this.q0.removeMessages(125);
                    SkinStoreFragment.this.q0.sendEmptyMessageDelayed(125, 60000L);
                    synchronized (SkinStoreFragment.this.S) {
                        arrayList = new ArrayList(SkinStoreFragment.this.S);
                        SkinStoreFragment.this.S.clear();
                        break;
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    for (File file : arrayList) {
                        String strP = SkinStoreFragment.this.P(file);
                        SkinStoreFragment.this.f0("MSG_UPLOAD_FILES upload " + file.getName() + " to " + strP);
                        if (strP != null) {
                            SkinStoreFragment.this.T.uploadFile(file, strP + file.getName());
                        }
                    }
                    return;
                case 108:
                    SkinStoreFragment.this.f0("do MSG_RETRY_FILES");
                    SkinStoreFragment.this.j0((PhoneWifiFtpUtil.TransferTask[]) message.obj);
                    return;
                case 109:
                    SkinStoreFragment.this.f0("do MSG_UPLOAD_FACE");
                    SkinStoreFragment.this.q0.removeMessages(125);
                    SkinStoreFragment.this.q0.sendEmptyMessageDelayed(125, 60000L);
                    SkinStoreFragment.this.W.add(new File((String) message.obj));
                    SkinStoreFragment.this.u0();
                    return;
                case 110:
                    SkinStoreFragment.this.f0("do MSG_DISCONNECT_AP");
                    SkinStoreFragment.this.T.disconnectAP();
                    return;
                default:
                    return;
            }
        }
    }

    public class a implements PhoneWifiFtpUtil.FTPCallback {
        public a() {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onConnected() {
            SkinStoreFragment.this.f0("Phone FTP onConnected");
            SkinStoreFragment.this.K = true;
            SkinStoreFragment.this.t0();
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onDisconnected() {
            SkinStoreFragment.this.f0("Phone FTP onDisconnected");
            SkinStoreFragment.this.K = false;
            SkinStoreFragment.this.l0(false);
            if (SkinStoreFragment.this.Q != -1) {
                SkinStoreFragment.this.h0();
            }
            SkinStoreFragment.this.t0();
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileDelete(PhoneWifiFtpUtil.TransferTask transferTask, boolean z) {
            SkinStoreFragment skinStoreFragment = SkinStoreFragment.this;
            StringBuilder sb = new StringBuilder();
            sb.append("onFileDelete ");
            sb.append(transferTask.getLocalPath());
            sb.append(z ? " success." : " fail");
            skinStoreFragment.f0(sb.toString());
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileDownload(PhoneWifiFtpUtil.TransferTask transferTask, boolean z) {
            SkinStoreFragment skinStoreFragment = SkinStoreFragment.this;
            StringBuilder sb = new StringBuilder();
            sb.append("onFileDownload ");
            sb.append(transferTask.getRemotePath());
            sb.append(z ? " success." : " fail");
            skinStoreFragment.f0(sb.toString());
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileUpload(PhoneWifiFtpUtil.TransferTask transferTask, boolean z) {
            boolean zW = SkinStoreFragment.this.W(transferTask);
            SkinStoreFragment skinStoreFragment = SkinStoreFragment.this;
            StringBuilder sb = new StringBuilder();
            sb.append("onFileUpload ");
            sb.append(transferTask.getLocalPath());
            sb.append(z ? " success." : " fail");
            sb.append(" , isWfzFile : ");
            sb.append(zW);
            skinStoreFragment.f0(sb.toString());
            if (zW) {
                if (z) {
                    SkinStoreFragment.this.q0.obtainMessage(123, 100).sendToTarget();
                    SkinStoreFragment.this.n0(transferTask);
                    SkinStoreFragment skinStoreFragment2 = SkinStoreFragment.this;
                    skinStoreFragment2.s0(skinStoreFragment2.c);
                } else {
                    SkinStoreFragment.this.q0.sendEmptyMessage(124);
                    SkinStoreFragment.this.q0();
                }
                SkinStoreFragment.this.q0.removeMessages(125);
                SkinStoreFragment.this.l0(false);
                SkinStoreFragment.this.h0();
            }
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileUploadProgress(PhoneWifiFtpUtil.TransferTask transferTask, int i) {
            boolean zW = SkinStoreFragment.this.W(transferTask);
            SkinStoreFragment.this.f0("onFileUploadProgress ==== isWfzFile : " + zW);
            if (zW) {
                SkinStoreFragment.this.q0.obtainMessage(50, transferTask).sendToTarget();
            }
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onNeedRetryTask(PhoneWifiFtpUtil.TransferTask... transferTaskArr) {
            SkinStoreFragment.this.f0("onNeedRetryTask ");
            SkinStoreFragment.this.o.obtainMessage(108, transferTaskArr).sendToTarget();
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskAdd(PhoneWifiFtpUtil.TransferTask transferTask) {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskRemove(PhoneWifiFtpUtil.TransferTask transferTask) {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskStateChanged(PhoneWifiFtpUtil.TransferTask transferTask) {
            boolean zW = SkinStoreFragment.this.W(transferTask);
            SkinStoreFragment.this.f0("onTaskStateChanged " + transferTask + " , isWfzFile : " + zW);
            if (zW && transferTask.getState() == 3) {
                SkinStoreFragment.this.q0.sendEmptyMessage(124);
            }
        }
    }

    public class b implements WatchWifiFtpUtil.WatchAPStateListener {
        public b() {
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchAPStateListener
        public void onAPEnableResult(int i, String str) {
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchAPStateListener
        public void onAPStateChanged(int i, int i2) {
            SkinStoreFragment.this.o.obtainMessage(1001, i, i2).sendToTarget();
        }
    }

    public class c implements WatchWifiFtpUtil.WatchFTPListener {
        public c() {
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFTPServerStateChanged(int i, int i2) {
            SkinStoreFragment.this.o.obtainMessage(1002, i, i2).sendToTarget();
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFileDelete(String str) {
            SkinStoreFragment.this.f0("report from watch onFileDelete " + str);
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFileDownload(String str) {
            SkinStoreFragment.this.f0("report from watch onFileDownload " + str);
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFileUpload(String str) {
            SkinStoreFragment.this.f0("report from watch onFileUpload " + str);
        }
    }

    public class d implements PhoneWifiFtpUtil.APConnectCallback {
        public d() {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.APConnectCallback
        public void onConnected() {
            SkinStoreFragment.this.f0("Phone AP onConnected.");
            SkinStoreFragment.this.J = true;
            SkinStoreFragment.this.t0();
            SkinStoreFragment.this.o.sendEmptyMessageDelayed(105, 2000L);
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.APConnectCallback
        public void onDisconnected() {
            SkinStoreFragment.this.f0("Phone AP onDisconnected." + SkinStoreFragment.this.T.getTaskCount() + "isLoading: " + SkinStoreFragment.this.b);
            SkinStoreFragment.this.J = false;
            if (SkinStoreFragment.this.T.getTaskCount() > 0 || SkinStoreFragment.this.b) {
                SkinStoreFragment.this.q0.sendEmptyMessage(124);
                SkinStoreFragment skinStoreFragment = SkinStoreFragment.this;
                skinStoreFragment.p0(skinStoreFragment.getString(R.string.facestore_install_fail_title), SkinStoreFragment.this.getString(R.string.facestore_install_error_watchap));
            }
            SkinStoreFragment.this.l0(false);
            if (SkinStoreFragment.this.Q != -1) {
                SkinStoreFragment.this.h0();
            }
            SkinStoreFragment.this.t0();
            SkinStoreFragment.this.o.sendEmptyMessage(106);
        }
    }

    public class e extends Handler {
        public e() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 50) {
                PhoneWifiFtpUtil.TransferTask transferTask = (PhoneWifiFtpUtil.TransferTask) message.obj;
                if (SkinStoreFragment.t0 != null) {
                    SkinStoreFragment.t0.updateProgressing(((transferTask.getProgress() * 3) / 10) + 70);
                }
                SkinStoreFragment.this.f0(transferTask.getLocalName() + " progress: " + transferTask.getProgress() + "%");
            }
            if (i == 51) {
                SkinStoreFragment.this.l0(true);
                return;
            }
            switch (i) {
                case 123:
                    int iIntValue = ((Integer) message.obj).intValue();
                    SkinStoreFragment.this.f0(SkinStoreFragment.t0 + "MSG_UPDATE_PROGRESS:" + iIntValue);
                    if (SkinStoreFragment.t0 != null) {
                        SkinStoreFragment.t0.updateProgressing(iIntValue);
                    }
                    break;
                case 124:
                    SkinStoreFragment.this.f0("do MSG_RESET_FACEDIALOG");
                    SkinStoreFragment.this.q0.removeMessages(125);
                    ArrayList<PhoneWifiFtpUtil.TransferTask> transferTaskList = SkinStoreFragment.this.T.getTransferTaskList();
                    if (transferTaskList != null && transferTaskList.size() > 0) {
                        Iterator<PhoneWifiFtpUtil.TransferTask> it2 = transferTaskList.iterator();
                        while (it2.hasNext()) {
                            SkinStoreFragment.this.T.removeTransferTask(it2.next().getID());
                        }
                    }
                    if (SkinStoreFragment.this.b) {
                        SkinStoreFragment.this.resetDialogStatus();
                    }
                    Log.e(SkinStoreFragment.s0, "do MSG_RESET_FACEDIALOG" + SkinStoreFragment.this.T.getTaskCount(), new Object[0]);
                    break;
                case 125:
                    SkinStoreFragment.this.f0("do MSG_TIME_OUT");
                    if (SkinStoreFragment.this.b) {
                        SkinStoreFragment.this.resetDialogStatus();
                    }
                    SkinStoreFragment.this.l0(false);
                    SkinStoreFragment.this.q0.sendEmptyMessage(124);
                    break;
            }
        }
    }

    public class f extends DownloadTaskManager.DownloadListener {
        private f() {
        }

        @Override // com.huami.watch.companion.facestore.utils.DownloadTaskManager.DownloadListener, com.liulishuo.filedownloader.FileDownloadListener
        public void completed(BaseDownloadTask baseDownloadTask) {
            SkinStoreFragment.this.f0("insert face/skin completed");
            DownloadTaskModel modelTask = SkinStoreFragment.this.i.getModelTask(baseDownloadTask.getId());
            if (modelTask == null) {
                return;
            }
            SkinStoreFragment.this.q0.obtainMessage(123, 30).sendToTarget();
            SkinStoreFragment.this.o.sendMessage(SkinStoreFragment.this.o.obtainMessage(109, modelTask.getFilePath()));
            SkinStoreFragment.this.i.deleteTaskFromTaskManager(baseDownloadTask.getId());
            SkinStoreFragment.this.V(modelTask);
        }

        @Override // com.huami.watch.companion.facestore.utils.DownloadTaskManager.DownloadListener, com.liulishuo.filedownloader.FileDownloadListener
        public void error(BaseDownloadTask baseDownloadTask, Throwable th) {
            SkinStoreFragment.this.f0("download face/skin error");
            SkinStoreFragment.this.q0.sendEmptyMessage(124);
            if (SkinStoreFragment.this.b) {
                SkinStoreFragment skinStoreFragment = SkinStoreFragment.this;
                skinStoreFragment.p0(skinStoreFragment.getString(R.string.facestore_install_error_title), SkinStoreFragment.this.getString(R.string.facestore_install_error_network));
            }
            SkinStoreFragment.this.l0(false);
        }

        @Override // com.huami.watch.companion.facestore.utils.DownloadTaskManager.DownloadListener, com.liulishuo.filedownloader.FileDownloadListener
        public void paused(BaseDownloadTask baseDownloadTask, int i, int i2) {
        }

        @Override // com.huami.watch.companion.facestore.utils.DownloadTaskManager.DownloadListener, com.liulishuo.filedownloader.FileDownloadListener
        public void pending(BaseDownloadTask baseDownloadTask, int i, int i2) {
        }

        @Override // com.huami.watch.companion.facestore.utils.DownloadTaskManager.DownloadListener, com.liulishuo.filedownloader.FileDownloadListener
        public void progress(BaseDownloadTask baseDownloadTask, int i, int i2) {
            if (i2 != 0) {
                int i3 = (i / i2) * 100;
                SkinStoreFragment.this.f0(i + "insert face/skin progress" + i2 + "progress: " + i3);
                SkinStoreFragment.this.q0.obtainMessage(123, Integer.valueOf(i3)).sendToTarget();
            }
        }

        @Override // com.huami.watch.companion.facestore.utils.DownloadTaskManager.DownloadListener, com.liulishuo.filedownloader.FileDownloadListener
        public void warn(BaseDownloadTask baseDownloadTask) {
            SkinStoreFragment.this.f0("download face/skin warn");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(TrackModel trackModel) {
        if (trackModel == null) {
            return;
        }
        this.h = new ArrayList();
        DownloadTaskModel downloadTaskModelCreateDownloadTask = trackModel.createDownloadTask(this.j);
        if (downloadTaskModelCreateDownloadTask != null) {
            f0("tack info " + downloadTaskModelCreateDownloadTask.toString());
        }
        boolean zAddTask = this.i.addTask(downloadTaskModelCreateDownloadTask);
        if (zAddTask) {
            f0("sucessfully add task { file name :" + trackModel.name + i.d);
            this.l.put(trackModel.skin_bin, trackModel);
            this.h.add(downloadTaskModelCreateDownloadTask);
        } else {
            f0("can't add task { file name :" + trackModel.name + i.d);
            if (this.i.couldUpLoadFace(downloadTaskModelCreateDownloadTask)) {
                f0("couldUpLoadFace");
                this.q0.obtainMessage(123, 30).sendToTarget();
                this.o.obtainMessage(109, downloadTaskModelCreateDownloadTask.getFilePath()).sendToTarget();
            } else {
                f0("could not UpLoadFace");
                if (this.l.get(trackModel.skin_bin) == null) {
                    this.l.put(trackModel.skin_bin, trackModel);
                }
                this.h.add(downloadTaskModelCreateDownloadTask);
            }
        }
        if (NetworkUtil.isOnline(this.e)) {
            f0("NetWork is available while starting downloadtasks and addTask is " + zAddTask);
            this.i.startAllTasks(this.h);
            return;
        }
        f0("NetWork is not available while starting downloadtasks and addTask is " + zAddTask);
        this.q0.sendEmptyMessage(124);
        if (this.b) {
            p0(getString(R.string.facestore_install_error_title), getString(R.string.facestore_install_error_network));
        }
        l0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String P(File file) {
        if (file != null) {
            return "WatchFace/";
        }
        return null;
    }

    private void Q() {
        this.n0 = RxBus.get().toObservable().subscribe(new Consumer() { // from class: uw6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.X(obj);
            }
        }, new Consumer() { // from class: vw6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                SkinStoreFragment.Z((Throwable) obj);
            }
        });
    }

    private void R() {
        HandlerThread handlerThread = new HandlerThread("FaceStoreActivity-work-thread");
        this.n = handlerThread;
        handlerThread.start();
        this.o = new WorkHandler(this.n.getLooper());
        this.k = new f();
        DownloadTaskManager downloadTaskManager = DownloadTaskManager.getInstance(this.e);
        this.i = downloadTaskManager;
        downloadTaskManager.registerDownloadListener(this.k);
        this.j = S();
        this.m = new WatchFacesDBHelper(this.e).getWritableDatabase();
    }

    private String S() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        return FileDownloadUtils.getDefaultSaveRootPath() + "/watchfaces";
    }

    private void T() {
        PhoneWifiFtpUtil.init(this.e);
        this.T = PhoneWifiFtpUtil.get();
        WatchWifiFtpUtil.get().startWatchService();
        this.T.registerFTPCallback(this.X);
    }

    private void U(View view) {
        JsBridgeStatusWebView jsBridgeStatusWebView = (JsBridgeStatusWebView) view.findViewById(R.id.skin_store_web);
        this.f = jsBridgeStatusWebView;
        JsBridgeNativeAPI jsBridgeNativeAPI = new JsBridgeNativeAPI(this.e, jsBridgeStatusWebView.getWeb());
        jsBridgeNativeAPI.setVerifyHost(Cloud.get().getHost());
        jsBridgeNativeAPI.setSyncWatchSkinCallback(this);
        this.f.setActivity(getActivity());
        jsBridgeNativeAPI.registerAllNativeApi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(DownloadTaskModel downloadTaskModel) {
        f0("insert face/skin provider");
        ContentResolver contentResolver = this.e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("downloads", downloadTaskModel.getFileId());
        contentValues.put("name", downloadTaskModel.getName());
        contentValues.put("skin_bin", downloadTaskModel.getUrl());
        contentValues.put("device_type", downloadTaskModel.getDeviceType());
        contentValues.put("skin_size", downloadTaskModel.getSkinSize());
        contentValues.put("file_path", downloadTaskModel.getFilePath());
        contentValues.put("thumbnails", downloadTaskModel.getThumbnails());
        contentResolver.insert(WactchFacesProvider.CONTENT_URI, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean W(PhoneWifiFtpUtil.TransferTask transferTask) {
        boolean zEndsWith = (transferTask == null || TextUtils.isEmpty(transferTask.getLocalName())) ? false : transferTask.getLocalName().endsWith("wfz");
        f0(" isWfzFile callback : " + zEndsWith);
        return zEndsWith;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(Object obj) throws Exception {
        if (obj instanceof DisconnectedEvent) {
            if (DeviceManager.getManager(this.e).getCurrentDevice() == null) {
                return;
            }
            onDisconnected();
        } else if (obj instanceof ConnectedEvent) {
            onConnected();
        } else if (obj instanceof DeviceUnboundEvent) {
            onUnbound();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Y() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z(Throwable th) throws Exception {
        HMLog.warn(s0, th, new Function0() { // from class: ww6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return SkinStoreFragment.Y();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(ConnectAPWarningFragment connectAPWarningFragment, TrackModel trackModel, DialogInterface dialogInterface, int i) {
        if (connectAPWarningFragment.b()) {
            m0();
        }
        t0.updateAllState(1);
        this.o.obtainMessage(11, trackModel).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(TrackModel trackModel, DialogInterface dialogInterface, int i) {
        t0.updateAllState(1);
        this.o.obtainMessage(11, trackModel).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(DialogInterface dialogInterface, int i) {
        resetDialogStatus();
        this.q0.sendEmptyMessage(124);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(Device device, TrackModel trackModel, View view) {
        if (!device.isConnected()) {
            p0(getString(R.string.facestore_install_error_title), getString(R.string.facestore_install_error_ble));
            f0("No device connected.");
            return;
        }
        if (!DeviceUtil.isRomSupportFTP(device)) {
            p0(getString(R.string.facestore_install_error_title), getString(R.string.facestore_install_error_ftp));
            f0("Not support ftp.");
        } else if (NetworkUtil.isOffline(this.e)) {
            p0(getString(R.string.facestore_install_error_title), getString(R.string.facestore_install_error_network));
            f0("Not network available");
        } else if (g0()) {
            o0(trackModel);
        } else {
            t0.updateAllState(1);
            this.o.obtainMessage(11, trackModel).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(DataTransportResult dataTransportResult) {
        if (dataTransportResult.getResultCode() != 0) {
            f0(" syncWatchFaces callback    " + dataTransportResult.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(String str) {
        Log.d(s0, str, new Object[0]);
    }

    private boolean g0() {
        return getActivity().getSharedPreferences(w0, 0).getBoolean("warning_connect_ap", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        f0("reset.");
        WifiFtpModule.sendDisableFtp();
        this.o.sendEmptyMessage(110);
        WatchWifiFtpUtil.get().disableWifiAP();
        WatchWifiFtpUtil.get().setWatchAPStateListener(null);
        WatchWifiFtpUtil.get().setWatchFTPListener(null);
        this.T.setAPConnectCallback(this.m0);
        i0();
    }

    private void i0() {
        f0("resetState.");
        this.Q = -1;
        this.J = false;
        this.H = 11;
        this.K = false;
        this.I = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(PhoneWifiFtpUtil.TransferTask... transferTaskArr) {
        f0("retryFiles.");
        if (transferTaskArr != null) {
            LinkedList<File> linkedList = new LinkedList();
            for (PhoneWifiFtpUtil.TransferTask transferTask : transferTaskArr) {
                File file = new File(transferTask.getLocalPath());
                if (file.exists()) {
                    linkedList.add(file);
                }
            }
            if (linkedList.size() > 0) {
                synchronized (this.S) {
                    for (File file2 : linkedList) {
                        if (!this.S.contains(file2)) {
                            this.S.add(file2);
                        }
                    }
                }
                v0();
            }
        }
    }

    private boolean k0(TrackModel trackModel) {
        return this.m.insert(WatchFacesDBContract.FacesTrackColumns.TABLE_NAME, null, trackModel.toContentValues()) != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(boolean z) {
        this.b = z;
    }

    private void m0() {
        getActivity().getSharedPreferences(w0, 0).edit().putBoolean("warning_connect_ap", false).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(PhoneWifiFtpUtil.TransferTask transferTask) {
        f0(" setRemoteWatchFace");
        SyncUtil.syncWatchFaceToWatch(this.e, "com.huami.watch.watchface.analogyellow", "com.huami.watch.watchface.ExternalWatchFace:" + transferTask.getLocalName());
    }

    public static SkinStoreFragment newInstance(int i) {
        SkinStoreFragment skinStoreFragment = new SkinStoreFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("param1", i);
        skinStoreFragment.setArguments(bundle);
        return skinStoreFragment;
    }

    private void o0(final TrackModel trackModel) {
        final ConnectAPWarningFragment connectAPWarningFragment = new ConnectAPWarningFragment();
        AlertDialog.setTitle(getString(R.string.file_manager_connect_ap_warning_title)).setContent(connectAPWarningFragment).setPositiveBtn(getString(R.string.btn_enter), new DialogInterface.OnClickListener() { // from class: pw6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a0(connectAPWarningFragment, trackModel, dialogInterface, i);
            }
        }).setNegativeBtn(getString(R.string.btn_cancel), new DialogInterface.OnClickListener() { // from class: rw6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.b0(trackModel, dialogInterface, i);
            }
        }).show(getActivity().getFragmentManager(), "Connect ap warning");
    }

    private void onConnected() {
        if (this.R) {
            f0("onConnected");
        }
    }

    private void onDisconnected() {
        if (this.R) {
            f0("onDisconnected");
        }
        this.q0.sendEmptyMessage(124);
        if (this.b) {
            p0(getString(R.string.facestore_install_error_title), getString(R.string.facestore_install_error_ble));
        }
        l0(false);
        i0();
    }

    private void onUnbound() {
        if (this.R) {
            f0("onUnbound");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(String str, String str2) {
        if (!isVisible() || this.r0 || getActivity() == null || getActivity().isDestroyed()) {
            return;
        }
        AlertDialog.setTitle(str).setMessage(str2).setNeutralBtn(getString(R.string.btn_enter), new DialogInterface.OnClickListener() { // from class: ew6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.c0(dialogInterface, i);
            }
        }).show(getActivity().getFragmentManager(), "install error warning");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        if (!isVisible() || this.r0 || getActivity() == null || getActivity().isDestroyed()) {
            return;
        }
        AlertDialog.setMessage(getString(R.string.facestore_install_fail)).setNeutralBtn(getString(R.string.btn_enter)).show(getActivity().getFragmentManager(), "install fail warning");
    }

    private void r0(String str) {
        LoadingDialog.dismiss(t0);
        FaceDialogFragment faceDialogFragmentNewInstance = FaceDialogFragment.newInstance(this.g);
        t0 = faceDialogFragmentNewInstance;
        faceDialogFragmentNewInstance.setDialogCancelListener(this);
        final Device currentDevice = this.d.getCurrentDevice();
        final TrackModel trackModel = (TrackModel) new Gson().fromJson(str, TrackModel.class);
        t0.setFaceName(trackModel.name);
        t0.setFaceSize(trackModel.skin_size);
        t0.setFaceTime(getString(R.string.facestore_install_time_title, trackModel.downloads));
        t0.setFaceImage(trackModel.thumbnails[0]);
        if (DeviceSource.isModelHuanghe(currentDevice)) {
            t0.setWatchBg(R.drawable.pop_img_watch_huanghe);
        } else if (DeviceSource.isModelEverestS(currentDevice)) {
            t0.setWatchBg(R.drawable.pop_img_watch_everest2s);
        } else if (DeviceSource.isModelEverest(currentDevice)) {
            t0.setWatchBg(R.drawable.pop_img_watch_everest2);
        } else if (DeviceSource.isModelQogir(currentDevice)) {
            t0.setWatchBg(R.drawable.pop_img_watch_qoqir);
        }
        t0.setConfirm(getString(R.string.facestore_install_button_confirm), new View.OnClickListener() { // from class: sw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d0(currentDevice, trackModel, view);
            }
        });
        t0.setCancelable(false);
        WatchWifiFtpUtil.get().startWatchService();
        if (getActivity() == null || getActivity().isDestroyed()) {
            return;
        }
        try {
            t0.show(getActivity().getFragmentManager(), "skin install");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(Transporter transporter) {
        f0("Sync WatchFaces With Watch!!");
        Device currentDevice = DeviceManager.getManager(CompanionApplication.getContext()).getCurrentDevice();
        if (currentDevice == null || TextUtils.isEmpty(currentDevice.getCpuId())) {
            f0("Sync watchFaces abort:device error!");
            return;
        }
        f0("Sync WatchFaces Device:" + currentDevice.info().getHuamiModel());
        List<WatchFace> all = WatchFaceManager.getManager().getAll(currentDevice.getCpuId());
        JSONArray jSONArray = new JSONArray();
        try {
            for (WatchFace watchFace : all) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pkgName", watchFace.packageName);
                jSONObject.put("serviceName", watchFace.serviceName);
                jSONObject.put("label", watchFace.label);
                jSONObject.put("hasSlpt", Boolean.toString(watchFace.hasSlpt));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("watchfaces", jSONArray.toString());
        transporter.send(CompanionModule.ACTION_SYNC_WATCH_FACE, dataBundle, new Transporter.DataSendResultCallback() { // from class: tw6
            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public final void onResultBack(DataTransportResult dataTransportResult) {
                this.a.e0(dataTransportResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        f0("checkAllState...");
        if (this.H != 13) {
            this.Q = -1;
            f0("  watch ap not work");
            return;
        }
        this.Q = 0;
        f0("  watch ap ready");
        this.q0.obtainMessage(123, 40).sendToTarget();
        if (this.I != 2) {
            f0("  watch ftp not work");
            return;
        }
        this.Q = 1;
        f0("  watch ftp ready");
        this.q0.obtainMessage(123, 50).sendToTarget();
        if (!this.J) {
            f0("  phone ap not work");
            return;
        }
        this.Q = 2;
        f0("  phone ap ready");
        this.q0.obtainMessage(123, 60).sendToTarget();
        if (!this.K) {
            f0("  phone ftp not work");
            return;
        }
        this.q0.obtainMessage(123, 70).sendToTarget();
        f0("  phone ftp ready");
        this.Q = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        f0("uploadFiles.");
        if (this.W.isEmpty()) {
            return;
        }
        synchronized (this.S) {
            for (File file : this.W) {
                if (!this.S.contains(file)) {
                    this.S.add(file);
                }
            }
            this.W.clear();
        }
        v0();
    }

    private void v0() {
        f0("uploadFilesInternal.");
        if (this.S.isEmpty()) {
            return;
        }
        Device currentDevice = this.d.getCurrentDevice();
        if (currentDevice == null) {
            f0("No device bound.");
            return;
        }
        if (!currentDevice.isConnected()) {
            f0("No device connected.");
            this.q0.sendEmptyMessage(124);
            p0(getString(R.string.facestore_install_error_title), getString(R.string.facestore_install_error_ble));
            return;
        }
        String huamiModel = currentDevice.info().getHuamiModel();
        if (huamiModel != null) {
            huamiModel.toLowerCase();
        }
        currentDevice.addressShort();
        f0("  upload list ready. size:" + this.S.size() + "\n  current state:" + this.Q);
        int i = this.Q;
        if (i == -1) {
            f0("  continue MSG_WATCH_ENABLE_AP");
            this.o.sendEmptyMessage(101);
        } else if (i == 0) {
            f0("  continue MSG_WATCH_ENABLE_FTP");
            this.o.sendEmptyMessage(102);
        } else if (i == 1) {
            f0("  continue MSG_PHONE_CONNECT_AP");
            this.o.sendEmptyMessage(104);
        } else if (i == 2) {
            f0("  continue MSG_PHONE_CONNECT_FTP");
            this.o.sendEmptyMessage(105);
        }
        f0("  send MSG_UPLOAD_FILES");
        this.o.sendEmptyMessage(107);
    }

    @Override // com.huami.watch.companion.facestore.widgets.FaceDialogFragment.OnDialogCancelListener
    public void cancelDialog() {
        this.r0 = true;
        if (this.b) {
            l0(false);
            this.q0.removeMessages(125);
            this.i.deleteTask(this.h);
            this.T.cancelRetryConnect();
            h0();
        }
    }

    public void initInCreateView() {
        R();
        T();
        Q();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.e = context;
        this.d = DeviceManager.getManager(context);
        this.c = Transporter.get(context, "com.huami.watch.companion");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.g = getArguments().getInt("param1");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.companion_fragment_skin_store, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        l0(false);
        WatchWifiFtpUtil.get().disableWifiAP();
        WifiFtpModule.sendDisableFtp();
        PhoneWifiFtpUtil.release();
        this.n0.dispose();
        WatchWifiFtpUtil.get().setWatchAPStateListener(null);
        WatchWifiFtpUtil.get().setWatchFTPListener(null);
        this.i.unregisterDownloadListener(this.k);
        this.q0.removeCallbacksAndMessages(null);
        this.n.getLooper().quitSafely();
        this.o.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CheckLocationServiceUtil.INSTANCE.checkLocationServiceReady(requireActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        U(view);
        initInCreateView();
        this.f.loadPage(this.g == 0 ? Cloud.urlFaceStore() : Cloud.getUrlThirdWatchface(String.valueOf(DeviceSource.getCurrentDeviceSource(getContext()))));
    }

    public TrackModel queryAndDeleteSong(String str) {
        String str2 = "downloads=" + str;
        Cursor cursorQuery = this.m.query(WatchFacesDBContract.FacesTrackColumns.TABLE_NAME, null, str2, null, null, null, null);
        TrackModel trackModel = (cursorQuery == null || !cursorQuery.moveToFirst()) ? null : new TrackModel(cursorQuery);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        if (trackModel != null) {
            this.m.delete(WatchFacesDBContract.FacesTrackColumns.TABLE_NAME, str2, null);
        }
        return trackModel;
    }

    public void resetDialogStatus() {
        FaceDialogFragment faceDialogFragment = t0;
        if (faceDialogFragment == null || !faceDialogFragment.isVisible()) {
            return;
        }
        t0.updateProgressing(0);
        t0.updateAllState(0);
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeSyncWatchSkinCallback
    public void syncWatchSkin(String str) {
        f0("JsBridgeNativeAPI====syncWatchSkin  " + str);
        Device currentDevice = this.d.getCurrentDevice();
        this.r0 = false;
        if (currentDevice == null) {
            f0("No device bound.");
            return;
        }
        if (!currentDevice.isConnected()) {
            f0("No device connected.");
            Toast.makeText(this.e, R.string.install_watch_face_disconnected, 0).show();
        } else if (NetworkUtil.isOffline(this.e)) {
            p0(getString(R.string.facestore_install_error_title), getString(R.string.facestore_install_error_network));
        } else {
            r0(str);
        }
    }
}
