package com.huami.watch.wififtp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.PatternMatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.ArraySet;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.google.gson.Gson;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.tools.pay.ali.AliPayResponseKt;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.FilesUtil;
import com.huami.watch.util.MediaMetadataUtil;
import com.huami.watch.util.StorageUtil;
import com.huami.watch.wififtp.PhoneWifiFtpUtil;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPDataTransferListener;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPFile;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class PhoneWifiFtpUtil {
    public static final int WPA2_PSK = 4;
    private static final String Y = "PhoneWifiFtpUtil";
    private static final int Z = 0;
    private static final int a0 = 1;
    private static final int b0 = 4;
    private static final int c0 = 30000;
    private static final int d0 = 130;
    private static final int e0 = 131;
    private static PhoneWifiFtpUtil f0 = null;
    private static final String g0 = "192.168.43.1";
    private static final int h0 = 5210;
    private static final String i0 = "anonymous";
    private static final String j0 = "";
    private static final int k0 = 3;
    private static final int l0 = 1000;
    private static final String m0 = "file_manager_configs";
    private static final String n0 = "task_list_save";
    private static final String o0 = ".mp3";
    private static final String p0 = ".wav";
    private static final String q0 = ".gpx";
    private FTPClient M;
    private HandlerThread N;
    private j O;
    private HandlerThread P;
    private i Q;
    private Context a;
    private WifiManager b;
    private ConnectivityManager c;
    private String g;
    private String h;
    private String i;
    private int j;
    private APConnectCallback m;
    public boolean n;
    public boolean o;
    private ConnectivityManager.NetworkCallback u;
    private NetworkRequest v;
    private boolean d = false;
    private int e = -1;
    private int f = -1;
    private Handler k = new a();
    private boolean l = false;
    private final int p = 30;
    private final int q = 2000;
    private int r = 0;
    private BroadcastReceiver s = new b();
    private boolean t = false;
    private final int w = 150;
    private final int x = 151;
    private final int y = 152;
    private final int z = 153;
    private final int A = 154;
    private final int B = 155;
    private final int C = 156;
    private final int D = 157;
    private final int E = 158;
    private final int F = 159;
    private final int G = 160;
    private final int H = 161;
    private final int I = 162;
    private final int J = 163;
    private final int K = 500;
    private final int L = 164;
    private Handler R = new d();
    private int S = 0;
    private FTPCallback T = new e();
    private ArrayList<FTPCallback> U = new ArrayList<>(5);
    private final boolean V = false;
    private final Object W = new Object();
    private ArrayList<TransferTask> X = new ArrayList<>(10);

    public interface APConnectCallback {
        void onConnected();

        void onDisconnected();
    }

    public interface FTPCallback {
        void onConnected();

        void onDisconnected();

        void onFileDelete(TransferTask transferTask, boolean z);

        void onFileDownload(TransferTask transferTask, boolean z);

        void onFileUpload(TransferTask transferTask, boolean z);

        void onFileUploadProgress(TransferTask transferTask, int i);

        void onNeedRetryTask(TransferTask... transferTaskArr);

        void onTaskAdd(TransferTask transferTask);

        void onTaskRemove(TransferTask transferTask);

        void onTaskStateChanged(TransferTask transferTask);
    }

    public static class TransferTask {
        public static final int STATE_CANCELED = 4;
        public static final int STATE_FAILED = 3;
        public static final int STATE_FINISHED = 2;
        public static final int STATE_PENDING = 0;
        public static final int STATE_TRANSFERRING = 1;
        public static final int TYPE_DOWNLOAD = 2;
        public static final int TYPE_UPLOAD = 1;
        private static int j;
        private int a;
        private String b;
        private String c;
        private String d;
        private String e;
        private int f;
        private long g;
        private int h;
        private int i;

        public /* synthetic */ TransferTask(String str, String str2, int i, a aVar) {
            this(str, str2, i);
        }

        public static TransferTask decode(String str) {
            String[] strArrSplit;
            if (str == null || (strArrSplit = str.split("\\|")) == null || strArrSplit.length <= 0 || !new File(strArrSplit[0]).exists()) {
                return null;
            }
            try {
                TransferTask transferTask = new TransferTask(strArrSplit[0], strArrSplit[1], Integer.parseInt(strArrSplit[2]));
                if (strArrSplit.length > 3) {
                    transferTask.g(Integer.parseInt(strArrSplit[3]));
                }
                return transferTask;
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            int i = j;
            j = i + 1;
            this.a = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i) {
            this.f = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(int i) {
            this.h = i;
        }

        public String encode() {
            return this.b + AESEncryptionHelper.SEPARATOR + this.d + AESEncryptionHelper.SEPARATOR + this.i + AESEncryptionHelper.SEPARATOR + this.f;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof TransferTask)) {
                return false;
            }
            TransferTask transferTask = (TransferTask) obj;
            return this.i == transferTask.getType() && this.b.equals(transferTask.getLocalPath()) && this.d.equals(transferTask.getRemotePath());
        }

        public long getFileLength() {
            return this.g;
        }

        public int getID() {
            return this.a;
        }

        public String getLocalName() {
            return this.c;
        }

        public String getLocalPath() {
            return this.b;
        }

        public int getProgress() {
            return this.f;
        }

        public String getRemoteName() {
            return this.e;
        }

        public String getRemotePath() {
            return this.d;
        }

        public int getState() {
            return this.h;
        }

        public int getType() {
            return this.i;
        }

        public String toString() {
            return "TransferTask " + this.a + " {localPath='" + this.b + "', remotePath='" + this.d + "', fileLength=" + this.g + ", state=" + this.h + ", type=" + this.i + ", progress=" + this.f + '}';
        }

        private TransferTask(String str, String str2, int i) {
            int i2 = j;
            j = i2 + 1;
            this.a = i2;
            this.h = 0;
            this.i = 1;
            this.b = str;
            this.c = PhoneWifiFtpUtil.getFileName(str);
            this.d = str2;
            this.e = PhoneWifiFtpUtil.getFileName(str2);
            this.i = i;
            this.g = new File(this.b).length();
        }
    }

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 130) {
                if (i != 131) {
                    return;
                }
                PhoneWifiFtpUtil.this.T();
            } else {
                PhoneWifiFtpUtil.this.Z("openWifi fial.");
                PhoneWifiFtpUtil.this.t = false;
                PhoneWifiFtpUtil.this.v0();
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Parcelable parcelableExtra;
            if (PhoneWifiFtpUtil.this.g == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("previous_wifi_state", 4);
                int intExtra2 = intent.getIntExtra("wifi_state", 4);
                PhoneWifiFtpUtil.this.Z("Wifi state: " + intExtra + "->" + intExtra2);
                if (3 == intExtra2) {
                    if (PhoneWifiFtpUtil.this.t) {
                        PhoneWifiFtpUtil.this.k.removeMessages(130);
                        if (PhoneWifiFtpUtil.this.g0()) {
                            return;
                        }
                        PhoneWifiFtpUtil.this.b.startScan();
                        return;
                    }
                    return;
                }
                if (1 == intExtra2 && PhoneWifiFtpUtil.this.d) {
                    PhoneWifiFtpUtil.this.d = false;
                    PhoneWifiFtpUtil.this.Q.removeMessages(150);
                    if (PhoneWifiFtpUtil.this.m != null) {
                        PhoneWifiFtpUtil.this.m.onDisconnected();
                    }
                    PhoneWifiFtpUtil.this.v0();
                    return;
                }
                return;
            }
            if ("android.net.wifi.SCAN_RESULTS".equals(action)) {
                PhoneWifiFtpUtil.this.Z("SCAN_RESULTS_AVAILABLE_ACTION mWaitingForScanResult: " + PhoneWifiFtpUtil.this.t + "; mAPConnected" + PhoneWifiFtpUtil.this.d);
                if (!PhoneWifiFtpUtil.this.t || PhoneWifiFtpUtil.this.d) {
                    return;
                }
                PhoneWifiFtpUtil.this.t = false;
                PhoneWifiFtpUtil phoneWifiFtpUtil = PhoneWifiFtpUtil.this;
                phoneWifiFtpUtil.connectAP(phoneWifiFtpUtil.h, PhoneWifiFtpUtil.this.j, PhoneWifiFtpUtil.this.i);
                return;
            }
            if (!"android.net.wifi.STATE_CHANGE".equals(action) || (parcelableExtra = intent.getParcelableExtra("networkInfo")) == null) {
                return;
            }
            NetworkInfo networkInfo = (NetworkInfo) parcelableExtra;
            PhoneWifiFtpUtil.this.Z("NETWORK_STATE_CHANGED_ACTION Type:" + networkInfo.getType() + " State:" + networkInfo.getState() + "; mAPConnected: " + PhoneWifiFtpUtil.this.d);
            if (networkInfo.getType() == 1) {
                int i = h.a[networkInfo.getState().ordinal()];
                if (i != 1) {
                    if (i == 2 && !PhoneWifiFtpUtil.this.g0() && PhoneWifiFtpUtil.this.d) {
                        PhoneWifiFtpUtil.this.Z("  disconnect from NETWORK_STATE_CHANGED_ACTION.");
                        PhoneWifiFtpUtil.this.d = false;
                        if (PhoneWifiFtpUtil.this.m != null) {
                            PhoneWifiFtpUtil.this.m.onDisconnected();
                        }
                        PhoneWifiFtpUtil.this.v0();
                        return;
                    }
                    return;
                }
                if (PhoneWifiFtpUtil.this.g0()) {
                    if (PhoneWifiFtpUtil.this.d) {
                        return;
                    }
                    PhoneWifiFtpUtil.this.Z("  connect ap success from NETWORK_STATE_CHANGED_ACTION.");
                    PhoneWifiFtpUtil.this.d = true;
                    if (PhoneWifiFtpUtil.this.m != null) {
                        PhoneWifiFtpUtil.this.m.onConnected();
                        return;
                    }
                    return;
                }
                if (!PhoneWifiFtpUtil.this.d) {
                    if (PhoneWifiFtpUtil.this.t) {
                        PhoneWifiFtpUtil.this.Z("not current AP, startScan.");
                        PhoneWifiFtpUtil.this.b.startScan();
                        return;
                    }
                    return;
                }
                PhoneWifiFtpUtil.this.Z("  connect other ap from NETWORK_STATE_CHANGED_ACTION.");
                PhoneWifiFtpUtil.this.d = false;
                PhoneWifiFtpUtil.this.Q.removeMessages(150);
                if (PhoneWifiFtpUtil.this.m != null) {
                    PhoneWifiFtpUtil.this.m.onDisconnected();
                }
                PhoneWifiFtpUtil.this.v0();
            }
        }
    }

    public class c extends ConnectivityManager.NetworkCallback {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c(Network network) {
            return "ConnectAP, OnAvailable: " + network;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d() {
            return "ConnectAP, OnUnavailable...";
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull final Network network) {
            HMLog.info(PhoneWifiFtpUtil.Y, new Function0() { // from class: com.huami.watch.wififtp.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneWifiFtpUtil.c.c(network);
                }
            });
            try {
                if (PhoneWifiFtpUtil.this.g0()) {
                    PhoneWifiFtpUtil.this.Z("bind process to AP Network " + network);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23) {
                        PhoneWifiFtpUtil.this.c.bindProcessToNetwork(network);
                    } else if (i >= 21) {
                        ConnectivityManager.setProcessDefaultNetwork(network);
                    }
                } else {
                    PhoneWifiFtpUtil.this.Z("current not AP. release bind process to AP Network.");
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 23) {
                        PhoneWifiFtpUtil.this.c.bindProcessToNetwork(null);
                    } else if (i2 >= 21) {
                        ConnectivityManager.setProcessDefaultNetwork(null);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            HMLog.info(PhoneWifiFtpUtil.Y, new Function0() { // from class: com.huami.watch.wififtp.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneWifiFtpUtil.c.d();
                }
            });
        }
    }

    public class d extends Handler {
        public d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 153:
                    TransferTask transferTask = (TransferTask) message.obj;
                    if (PhoneWifiFtpUtil.this.T != null) {
                        PhoneWifiFtpUtil.this.T.onTaskAdd(transferTask);
                    }
                    break;
                case 154:
                    TransferTask transferTask2 = (TransferTask) message.obj;
                    if (PhoneWifiFtpUtil.this.T != null) {
                        PhoneWifiFtpUtil.this.T.onTaskStateChanged(transferTask2);
                    }
                    break;
                case 155:
                    TransferTask transferTask3 = (TransferTask) message.obj;
                    if (PhoneWifiFtpUtil.this.T != null) {
                        PhoneWifiFtpUtil.this.T.onTaskRemove(transferTask3);
                    }
                    break;
                case 156:
                    TransferTask transferTask4 = (TransferTask) message.obj;
                    if (PhoneWifiFtpUtil.this.T != null) {
                        PhoneWifiFtpUtil.this.T.onFileUploadProgress(transferTask4, transferTask4.getProgress());
                    }
                    break;
                case 157:
                    TransferTask transferTask5 = (TransferTask) message.obj;
                    if (PhoneWifiFtpUtil.this.T != null) {
                        PhoneWifiFtpUtil.this.T.onFileUpload(transferTask5, message.arg1 == 1);
                    }
                    break;
                case 158:
                    TransferTask transferTask6 = (TransferTask) message.obj;
                    if (PhoneWifiFtpUtil.this.T != null) {
                        PhoneWifiFtpUtil.this.T.onFileDownload(transferTask6, message.arg1 == 1);
                    }
                    break;
                case 159:
                    TransferTask transferTask7 = (TransferTask) message.obj;
                    if (PhoneWifiFtpUtil.this.T != null) {
                        PhoneWifiFtpUtil.this.T.onFileDelete(transferTask7, message.arg1 == 1);
                    }
                    break;
                case 160:
                    if (PhoneWifiFtpUtil.this.T != null) {
                        PhoneWifiFtpUtil.this.T.onConnected();
                    }
                    break;
                case 161:
                    if (PhoneWifiFtpUtil.this.T != null) {
                        PhoneWifiFtpUtil.this.T.onDisconnected();
                    }
                    break;
                case 163:
                    TransferTask[] transferTaskArr = (TransferTask[]) message.obj;
                    if (PhoneWifiFtpUtil.this.T != null) {
                        PhoneWifiFtpUtil.this.T.onNeedRetryTask(transferTaskArr);
                    }
                    break;
            }
        }
    }

    public class e implements FTPCallback {
        public e() {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onConnected() {
            Iterator it2 = PhoneWifiFtpUtil.this.U.iterator();
            while (it2.hasNext()) {
                try {
                    ((FTPCallback) it2.next()).onConnected();
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onDisconnected() {
            Iterator it2 = PhoneWifiFtpUtil.this.U.iterator();
            while (it2.hasNext()) {
                try {
                    ((FTPCallback) it2.next()).onDisconnected();
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileDelete(TransferTask transferTask, boolean z) {
            Iterator it2 = PhoneWifiFtpUtil.this.U.iterator();
            while (it2.hasNext()) {
                try {
                    ((FTPCallback) it2.next()).onFileDelete(transferTask, z);
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileDownload(TransferTask transferTask, boolean z) {
            Iterator it2 = PhoneWifiFtpUtil.this.U.iterator();
            while (it2.hasNext()) {
                try {
                    ((FTPCallback) it2.next()).onFileDownload(transferTask, z);
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileUpload(TransferTask transferTask, boolean z) {
            Iterator it2 = PhoneWifiFtpUtil.this.U.iterator();
            while (it2.hasNext()) {
                try {
                    ((FTPCallback) it2.next()).onFileUpload(transferTask, z);
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileUploadProgress(TransferTask transferTask, int i) {
            Iterator it2 = PhoneWifiFtpUtil.this.U.iterator();
            while (it2.hasNext()) {
                try {
                    ((FTPCallback) it2.next()).onFileUploadProgress(transferTask, i);
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onNeedRetryTask(TransferTask... transferTaskArr) {
            Iterator it2 = PhoneWifiFtpUtil.this.U.iterator();
            while (it2.hasNext()) {
                try {
                    ((FTPCallback) it2.next()).onNeedRetryTask(transferTaskArr);
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskAdd(TransferTask transferTask) {
            Iterator it2 = PhoneWifiFtpUtil.this.U.iterator();
            while (it2.hasNext()) {
                try {
                    ((FTPCallback) it2.next()).onTaskAdd(transferTask);
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskRemove(TransferTask transferTask) {
            Iterator it2 = PhoneWifiFtpUtil.this.U.iterator();
            while (it2.hasNext()) {
                try {
                    ((FTPCallback) it2.next()).onTaskRemove(transferTask);
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskStateChanged(TransferTask transferTask) {
            Iterator it2 = PhoneWifiFtpUtil.this.U.iterator();
            while (it2.hasNext()) {
                try {
                    ((FTPCallback) it2.next()).onTaskStateChanged(transferTask);
                } catch (Exception unused) {
                }
            }
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ FTPCallback a;

        public f(FTPCallback fTPCallback) {
            this.a = fTPCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PhoneWifiFtpUtil.this.U.contains(this.a)) {
                return;
            }
            PhoneWifiFtpUtil.this.U.add(this.a);
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ FTPCallback a;

        public g(FTPCallback fTPCallback) {
            this.a = fTPCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            PhoneWifiFtpUtil.this.U.remove(this.a);
        }
    }

    public static /* synthetic */ class h {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[m.values().length];
            b = iArr;
            try {
                iArr[m.File_Exits.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[m.Upload_From_Break_Success.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[m.Upload_New_File_Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[m.Create_Directory_Fail.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[m.Remote_Bigger_Local.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[m.Delete_Remote_Faild.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[m.Upload_New_File_Failed.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[NetworkInfo.State.values().length];
            a = iArr2;
            try {
                iArr2[NetworkInfo.State.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[NetworkInfo.State.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public class i extends Handler {
        public i(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 150) {
                if (i != 151) {
                    if (i == 162) {
                        PhoneWifiFtpUtil.this.removeTransferTaskInternal(message.arg1);
                        return;
                    } else {
                        if (i != 164) {
                            return;
                        }
                        PhoneWifiFtpUtil.this.A0();
                        return;
                    }
                }
                PhoneWifiFtpUtil.this.Z("do MSG_FTP_DISABLE");
                try {
                    PhoneWifiFtpUtil.this.M.abortCurrentDataTransfer(false);
                    PhoneWifiFtpUtil.this.Z("  abort current FTP transfe.");
                    PhoneWifiFtpUtil.this.M.abruptlyCloseCommunication();
                    PhoneWifiFtpUtil.this.Z("  disconnect FTP.");
                    PhoneWifiFtpUtil.this.R.sendEmptyMessage(161);
                } catch (Exception e) {
                    PhoneWifiFtpUtil.this.Z("MSG_FTP_DISABLE fail." + e.getMessage());
                }
                removeMessages(152);
                PhoneWifiFtpUtil.this.v0();
                return;
            }
            boolean zU = PhoneWifiFtpUtil.this.U();
            PhoneWifiFtpUtil.this.Z("connectFTP " + zU);
            if (zU) {
                PhoneWifiFtpUtil.this.R.sendEmptyMessage(160);
                PhoneWifiFtpUtil.this.c0();
                PhoneWifiFtpUtil.this.S = 0;
                return;
            }
            PhoneWifiFtpUtil phoneWifiFtpUtil = PhoneWifiFtpUtil.this;
            if (!phoneWifiFtpUtil.o && phoneWifiFtpUtil.S < 3) {
                PhoneWifiFtpUtil.this.Z("  retry connectFTP after 1000ms");
                PhoneWifiFtpUtil.G(PhoneWifiFtpUtil.this);
                sendEmptyMessageDelayed(150, 1000L);
            } else {
                PhoneWifiFtpUtil.this.Z("  retry connectFTP 3 times, Abandon.");
                PhoneWifiFtpUtil.this.R.sendEmptyMessage(161);
                PhoneWifiFtpUtil.this.v0();
                PhoneWifiFtpUtil.this.S = 0;
            }
        }
    }

    public class j extends Handler {
        public j(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 152) {
                return;
            }
            PhoneWifiFtpUtil.this.Z("MSG_FTP_FIRE_TASK");
            if (!PhoneWifiFtpUtil.this.M.isConnected()) {
                PhoneWifiFtpUtil.this.Z("fire task failed as ftp not connected");
                return;
            }
            TransferTask transferTask = null;
            synchronized (PhoneWifiFtpUtil.this.W) {
                for (int i = 0; i < PhoneWifiFtpUtil.this.X.size(); i++) {
                    TransferTask transferTask2 = (TransferTask) PhoneWifiFtpUtil.this.X.get(i);
                    if (transferTask2.getState() == 0) {
                        transferTask = transferTask2;
                        break;
                    }
                }
            }
            PhoneWifiFtpUtil.this.Z("filter will upload file: " + transferTask);
            if (transferTask != null) {
                PhoneWifiFtpUtil.this.D0(transferTask);
            }
        }
    }

    public class k implements FTPDataTransferListener {
        public int a;
        public long b;
        public TransferTask c;

        public /* synthetic */ k(PhoneWifiFtpUtil phoneWifiFtpUtil, TransferTask transferTask, a aVar) {
            this(transferTask);
        }

        @Override // it.sauronsoftware.ftp4j.FTPDataTransferListener
        public void aborted() {
            this.c.h(3);
        }

        @Override // it.sauronsoftware.ftp4j.FTPDataTransferListener
        public void completed() {
            this.c.h(2);
        }

        @Override // it.sauronsoftware.ftp4j.FTPDataTransferListener
        public void failed() {
            this.c.h(3);
        }

        @Override // it.sauronsoftware.ftp4j.FTPDataTransferListener
        public void started() {
        }

        @Override // it.sauronsoftware.ftp4j.FTPDataTransferListener
        public void transferred(int i) {
            long j = this.b + ((long) i);
            this.b = j;
            int fileLength = (int) ((j * 100.0d) / this.c.getFileLength());
            if (fileLength != this.a) {
                this.a = fileLength;
                this.c.g(fileLength);
                PhoneWifiFtpUtil.this.R.obtainMessage(156, this.c).sendToTarget();
            }
        }

        private k(TransferTask transferTask) {
            this.a = 0;
            this.b = 0L;
            this.c = transferTask;
        }
    }

    public final class l implements Comparator<TransferTask> {
        private l() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TransferTask transferTask, TransferTask transferTask2) {
            return transferTask.f != transferTask2.f ? transferTask2.f - transferTask.f : transferTask.getID() - transferTask2.getID();
        }

        public /* synthetic */ l(PhoneWifiFtpUtil phoneWifiFtpUtil, a aVar) {
            this();
        }
    }

    public enum m {
        File_Exits,
        Remote_Bigger_Local,
        Upload_From_Break_Failed,
        Delete_Remote_Faild,
        Upload_From_Break_Success,
        Upload_New_File_Success,
        Upload_New_File_Failed,
        Create_Directory_Success,
        Create_Directory_Fail
    }

    private PhoneWifiFtpUtil(Context context) {
        this.a = context;
        e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0() {
        Z("saveTaskListInternal");
        ArraySet arraySet = new ArraySet();
        synchronized (this.W) {
            for (TransferTask transferTask : this.X) {
                if (isSupportFileType(transferTask.getLocalName())) {
                    arraySet.add(transferTask.encode());
                }
            }
        }
        this.a.getSharedPreferences("file_manager_configs", 0).edit().putStringSet("task_list_save", arraySet).apply();
    }

    private void B0() {
        Z("showWifiCanNotOpenDialog");
        this.t = true;
        try {
            new AlertDialogFragment.Builder(this.a).setTitle(R.string.file_manager_dialog_open_wifi_error_title).setMessage(R.string.file_manager_dialog_open_wifi_error_content).setPositiveButton(R.string.file_manager_dialog_open_wifi_btn, new DialogInterface.OnClickListener() { // from class: vy5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.a.p0(dialogInterface, i2);
                }
            }).setNegativeButton(R.string.btn_cancel, new DialogInterface.OnClickListener() { // from class: sy5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.a.q0(dialogInterface, i2);
                }
            }).setCancelable(false).show(((AppCompatActivity) this.a).getSupportFragmentManager(), "Connect Wi-Fi");
        } catch (Exception unused) {
        }
    }

    private void C0() {
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
        intent.addFlags(268435456);
        try {
            this.a.startActivity(intent);
        } catch (Exception unused) {
            Z("showWifiSetting Fail.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(TransferTask transferTask) {
        Z("uploadFile " + transferTask.getLocalPath() + " to " + transferTask.getRemotePath());
        transferTask.h(1);
        this.R.obtainMessage(154, transferTask).sendToTarget();
        if (this.M.isConnected()) {
            try {
                m mVarE0 = E0(transferTask);
                Z("uploadFile result: " + mVarE0);
                switch (h.b[mVarE0.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        transferTask.g(100);
                        transferTask.h(2);
                        this.R.obtainMessage(154, transferTask).sendToTarget();
                        this.R.obtainMessage(157, 1, 0, transferTask).sendToTarget();
                        synchronized (this.W) {
                            this.X.remove(transferTask);
                            Y();
                            break;
                        }
                        z0();
                        c0();
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        transferTask.h(3);
                        c0();
                        break;
                    default:
                        break;
                }
            } catch (Exception e2) {
                a0("uploadFile fail. " + e2.getLocalizedMessage(), e2);
                transferTask.h(3);
                disconnectFTP();
            }
        } else {
            Z("uploadFile fail. FTP unAvailable");
            transferTask.h(3);
        }
        this.R.obtainMessage(154, transferTask).sendToTarget();
        this.R.obtainMessage(157, 0, 0, transferTask).sendToTarget();
    }

    private m E0(TransferTask transferTask) throws IOException {
        Exception e2;
        try {
            this.M.changeDirectory(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        } catch (FTPException e3) {
            a0("uploadFileInternal changeDirectory(\"/\") on start fail.", e3);
        } catch (FTPIllegalReplyException e4) {
            a0("uploadFileInternal changeDirectory(\"/\") on start fail.", e4);
        }
        String remotePath = transferTask.getRemotePath();
        if (remotePath.contains(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            String strSubstring = remotePath.substring(remotePath.lastIndexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) + 1);
            m mVarM = m(remotePath);
            m mVar = m.Create_Directory_Fail;
            if (mVarM == mVar) {
                return mVar;
            }
            remotePath = strSubstring;
        }
        FTPFile fTPFile = null;
        try {
            FTPFile[] list = this.M.list();
            if (list != null) {
                for (FTPFile fTPFile2 : list) {
                    if (fTPFile2 != null && remotePath.equals(fTPFile2.getName())) {
                        try {
                            Z("found exist file.");
                        } catch (Exception e5) {
                            e2 = e5;
                            a0("uploadFileInternal list file fail. path:" + remotePath, e2);
                        }
                        fTPFile = fTPFile2;
                        break;
                    }
                }
            }
        } catch (Exception e6) {
            fTPFile2 = null;
            e2 = e6;
        }
        if (fTPFile == null) {
            return F0(transferTask, 0L);
        }
        long size = fTPFile.getSize();
        long fileLength = transferTask.getFileLength();
        if (size == fileLength) {
            return m.File_Exits;
        }
        if (size > fileLength) {
            return m.Remote_Bigger_Local;
        }
        m mVarF0 = F0(transferTask, size);
        if (mVarF0 != m.Upload_From_Break_Failed) {
            return mVarF0;
        }
        try {
            this.M.deleteFile(remotePath);
        } catch (Exception e7) {
            HMLog.info(Y, new Function0() { // from class: xy5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneWifiFtpUtil.t0(e7);
                }
            });
        }
        return F0(transferTask, 0L);
    }

    private m F0(TransferTask transferTask, long j2) throws IOException {
        Z("uploadFileInternal upload " + transferTask.getLocalName() + " to " + transferTask.getRemotePath() + " continue from " + j2);
        try {
            File file = new File(transferTask.getLocalPath());
            String name = file.getName();
            long length = file.length();
            String strSubstring = name.substring(name.lastIndexOf(".") + 1);
            MediaMetadataUtil.MediaMetadataInfo mediaMetadataInfo = new MediaMetadataUtil.MediaMetadataInfo();
            mediaMetadataInfo.setFileSize(length);
            if ("mp3".equals(strSubstring)) {
                MediaMetadataUtil.MediaMetadataInfo mediaMetadataInfoRetrieve = MediaMetadataUtil.retrieve(file);
                mediaMetadataInfo.setTitle(MediaMetadataUtil.truncateString(mediaMetadataInfoRetrieve.getTitle(), 31));
                mediaMetadataInfo.setAlbum(MediaMetadataUtil.truncateString(mediaMetadataInfoRetrieve.getAlbum(), 31));
                mediaMetadataInfo.setArtist(MediaMetadataUtil.truncateString(mediaMetadataInfoRetrieve.getArtist(), 31));
            }
            final File externalDataFile = StorageUtil.getExternalDataFile(this.a, name + HMServerDef.RESPONSE_FORMAT);
            final String json = new Gson().toJson(mediaMetadataInfo);
            FilesUtil.saveSafe(json.getBytes(), externalDataFile);
            HMLog.info(Y, new Function0() { // from class: wy5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneWifiFtpUtil.r0(externalDataFile, json);
                }
            });
            this.M.upload(externalDataFile);
            this.M.upload(new File(transferTask.getLocalPath()), new k(this, transferTask, null));
        } catch (Exception e2) {
            transferTask.h(3);
            HMLog.info(Y, new Function0() { // from class: zy5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneWifiFtpUtil.s0(e2);
                }
            });
        }
        Z("upload finish, task: " + transferTask + "; remoteSize: " + j2);
        if (j2 > 0) {
            return transferTask.getState() == 2 ? m.Upload_From_Break_Success : m.Upload_From_Break_Failed;
        }
        return transferTask.getState() == 2 ? m.Upload_New_File_Success : m.Upload_New_File_Failed;
    }

    public static /* synthetic */ int G(PhoneWifiFtpUtil phoneWifiFtpUtil) {
        int i2 = phoneWifiFtpUtil.S;
        phoneWifiFtpUtil.S = i2 + 1;
        return i2;
    }

    private boolean R(String str) {
        try {
            this.M.changeDirectory(str);
            Z("changeDirectory to: " + str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void S() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && !inetAddressNextElement.isLinkLocalAddress()) {
                        Z("check ip " + inetAddressNextElement.getHostAddress().toString());
                    }
                }
            }
        } catch (Exception e2) {
            a0("check local ip fail.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        Z("CheckNetWorkState...ConnectFTPRetry:" + this.o + "ConnectFTPRetry:" + this.n);
        if (this.n) {
            return;
        }
        if (!this.b.isWifiEnabled()) {
            Z("  Wifi disabled. cancel check.");
            this.r = 0;
            disconnectAP();
            v0();
            return;
        }
        NetworkInfo activeNetworkInfo = this.c.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED && activeNetworkInfo.getType() == 1 && g0()) {
            Z("  ap connect success from CheckNetWorkState");
            if (!this.d) {
                this.d = true;
                APConnectCallback aPConnectCallback = this.m;
                if (aPConnectCallback != null) {
                    aPConnectCallback.onConnected();
                }
            }
        }
        int i2 = this.r;
        if (i2 <= 30) {
            if (this.d) {
                return;
            }
            this.r = i2 + 1;
            this.k.sendEmptyMessageDelayed(131, 2000L);
            return;
        }
        Z("CheckNetWorkState failed, disconnectAP and startScan.");
        this.r = 0;
        disconnectAP();
        this.t = true;
        this.b.startScan();
        v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean U() {
        Z("connectFTPInternal");
        if (this.M.isConnected()) {
            Z("FTP client is already available.");
            return true;
        }
        S();
        int i2 = 0;
        try {
            Z("Connected to 192.168.43.1 on " + ((Object) 5210));
            this.M.connect("192.168.43.1", 5210);
            this.M.setType(2);
            boolean z = false;
            while (i2 < 3 && !z) {
                i2++;
                try {
                    this.M.login("anonymous", "");
                    z = true;
                } catch (Exception e2) {
                    a0("connectFTPInternal login fail.", e2);
                    if (this.M.isConnected()) {
                        try {
                            this.M.abruptlyCloseCommunication();
                            this.R.sendEmptyMessage(161);
                        } catch (Exception unused) {
                            a0("connectFTPInternal login fail. disconnect fail.", e2);
                        }
                    }
                }
            }
            try {
                this.M.changeDirectory(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            } catch (Exception e3) {
                a0("connectFTPInternal changeDirectory fail.", e3);
            }
            Z("login success " + z);
            return z;
        } catch (Exception e4) {
            Z("Could not connect to server. " + e4.getLocalizedMessage());
            if (this.M.isConnected()) {
                try {
                    this.M.abruptlyCloseCommunication();
                    this.R.sendEmptyMessage(161);
                } catch (Exception e5) {
                    a0("connectFTPInternal fail, disconnect fail", e5);
                }
            }
            return false;
        }
    }

    private boolean V(String str) {
        try {
            this.M.createDirectory(str);
            Z("createDirectory: " + str);
            return true;
        } catch (Exception e2) {
            a0("createDirectory fail. path:" + str, e2);
            return false;
        }
    }

    private WifiConfiguration W(String str, String str2, int i2) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = "\"" + str + "\"";
        if (i2 == 0) {
            wifiConfiguration.allowedKeyManagement.set(0);
        } else if (i2 == 4) {
            wifiConfiguration.allowedKeyManagement.set(1);
            wifiConfiguration.preSharedKey = "\"" + str2 + "\"";
        }
        return wifiConfiguration;
    }

    private void X() {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                ConnectivityManager.NetworkCallback networkCallback = this.u;
                if (networkCallback != null) {
                    this.c.unregisterNetworkCallback(networkCallback);
                }
            } catch (Exception unused) {
            }
            try {
                Z("disableAPNetworkHolder");
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    this.c.bindProcessToNetwork(null);
                } else if (i2 >= 21) {
                    ConnectivityManager.setProcessDefaultNetwork(null);
                }
            } catch (Exception unused2) {
            }
        }
    }

    private void Y() {
        if (d0()) {
            return;
        }
        HMLog.info(Y, new Function0() { // from class: ty5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneWifiFtpUtil.j0();
            }
        });
        try {
            this.M.abruptlyCloseCommunication();
            this.R.sendEmptyMessage(161);
        } catch (Exception e2) {
            HMLog.info(Y, new Function0() { // from class: yy5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneWifiFtpUtil.k0(e2);
                }
            });
        }
        WifiFtpModule.sendDisableFtp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(final String str) {
        HMLog.info(Y, new Function0() { // from class: az5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneWifiFtpUtil.l0(str);
            }
        });
    }

    private void a0(final String str, final Throwable th) {
        HMLog.info(Y, new Function0() { // from class: cz5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneWifiFtpUtil.m0(str, th);
            }
        });
    }

    private void b0() {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                ConnectivityManager.NetworkCallback networkCallback = this.u;
                if (networkCallback != null) {
                    this.c.unregisterNetworkCallback(networkCallback);
                }
            } catch (Exception unused) {
            }
            try {
                Z("enableAPNetworkHolder");
                this.c.requestNetwork(this.v, this.u);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        if (this.l || this.O.hasMessages(152)) {
            return;
        }
        this.O.sendEmptyMessageDelayed(152, 500L);
    }

    public static void cleanUnSupportFileType(ArrayList<TransferTask> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            TransferTask transferTask = arrayList.get(size);
            if (transferTask == null || !isSupportFileType(transferTask.getLocalName())) {
                arrayList.remove(size);
            }
        }
    }

    private boolean d0() {
        if (!this.X.isEmpty()) {
            for (TransferTask transferTask : this.X) {
                if (transferTask.h == 1 || transferTask.h == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private void e0() {
        this.b = (WifiManager) this.a.getSystemService("wifi");
        this.c = (ConnectivityManager) this.a.getSystemService("connectivity");
        f0();
        HandlerThread handlerThread = new HandlerThread("FTPThread");
        this.N = handlerThread;
        handlerThread.start();
        this.O = new j(this.N.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("FTPControlThread");
        this.P = handlerThread2;
        handlerThread2.start();
        this.Q = new i(this.P.getLooper());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        this.a.registerReceiver(this.s, intentFilter);
        System.setProperty(it.sauronsoftware.ftp4j.c.c, AliPayResponseKt.CODE_ALI_REPEAT);
        FTPClient fTPClient = new FTPClient();
        this.M = fTPClient;
        fTPClient.setAutoNoopTimeout(20000L);
        this.M.getConnector().setCloseTimeout(15);
        this.M.getConnector().setConnectionTimeout(15);
        this.M.getConnector().setReadTimeout(15);
        HMLog.info(Y, new Function0() { // from class: uy5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneWifiFtpUtil.n0();
            }
        });
        u0();
    }

    private void f0() {
        if (Build.VERSION.SDK_INT >= 21) {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addTransportType(1);
            this.v = builder.build();
            this.u = new c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g0() {
        String str;
        String str2;
        WifiInfo connectionInfo = this.b.getConnectionInfo();
        NetworkInfo networkInfo = this.c.getNetworkInfo(1);
        StringBuilder sb = new StringBuilder();
        sb.append("isCurrentAP WifiInfo:");
        sb.append(connectionInfo != null ? connectionInfo.getSSID() : null);
        sb.append(" NetworkInfo:");
        sb.append(networkInfo != null ? networkInfo.getExtraInfo() : null);
        sb.append(" AP_SSID: ");
        sb.append(this.g);
        Z(sb.toString());
        return (networkInfo != null && (str2 = this.g) != null && str2.equals(networkInfo.getExtraInfo())) || (connectionInfo != null && (str = this.g) != null && str.equals(connectionInfo.getSSID()));
    }

    public static PhoneWifiFtpUtil get() {
        return f0;
    }

    public static String getFileName(String str) {
        int iLastIndexOf = str.lastIndexOf(File.separatorChar);
        int i2 = 0;
        if (str.length() != 0 && str.charAt(0) == '/') {
            i2 = 1;
        }
        return iLastIndexOf < i2 ? str.substring(i2) : str.substring(iLastIndexOf + 1);
    }

    private WifiConfiguration h0(String str) {
        try {
            List<WifiConfiguration> configuredNetworks = this.b.getConfiguredNetworks();
            if (configuredNetworks == null || configuredNetworks.size() <= 0) {
                return null;
            }
            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                String str2 = wifiConfiguration.SSID;
                if (str2 != null && str2.equals(str)) {
                    return wifiConfiguration;
                }
            }
            return null;
        } catch (Exception e2) {
            HMLog.error(Y, "Handle PhoneWifiFtpUtil Error", e2, new Function0() { // from class: dz5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneWifiFtpUtil.o0();
                }
            });
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i0(String str) {
        return "ConnectAP, RequestNetwork: " + str;
    }

    public static void init(Context context) {
        if (f0 == null) {
            f0 = new PhoneWifiFtpUtil(context);
        }
    }

    public static boolean isSupportFileType(String str) {
        if (str != null) {
            return str.endsWith(".mp3") || str.endsWith(".gpx") || str.endsWith(p0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j0() {
        return "Disconnect&Disable FTP...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k0(Exception exc) {
        return "DisconnectFtpErr" + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l0(String str) {
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    private m m(String str) throws IOException {
        m mVar = m.Create_Directory_Success;
        String strSubstring = str.substring(0, str.lastIndexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) + 1);
        if (!strSubstring.equalsIgnoreCase(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) && !R(strSubstring)) {
            int iStartsWith = strSubstring.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            int iIndexOf = strSubstring.indexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, (int) iStartsWith);
            do {
                String strSubstring2 = str.substring(iStartsWith, iIndexOf);
                if (!R(strSubstring2)) {
                    if (!V(strSubstring2)) {
                        Z("创建目录失败");
                        return m.Create_Directory_Fail;
                    }
                    R(strSubstring2);
                }
                iStartsWith = iIndexOf + 1;
                iIndexOf = strSubstring.indexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, (int) iStartsWith);
            } while (iIndexOf > iStartsWith);
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m0(String str, Throwable th) {
        return str + th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n0() {
        return "AutoNoop: 20s, Timeout Close: 15s, Connection: 15s, Read: 15s";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o0() {
        return "Zepp catch  exception";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(DialogInterface dialogInterface, int i2) {
        Z("showWifiSetting");
        this.k.sendEmptyMessageDelayed(130, 30000L);
        C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(DialogInterface dialogInterface, int i2) {
        this.t = false;
        this.k.sendEmptyMessage(130);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r0(File file, String str) {
        return "Start Upload FileInfo Json to Watch [" + file + "]: " + str;
    }

    public static void release() {
        PhoneWifiFtpUtil phoneWifiFtpUtil = f0;
        if (phoneWifiFtpUtil != null) {
            phoneWifiFtpUtil.w0();
        }
        f0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s0(Exception exc) {
        return "UploadFileErr" + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t0(Exception exc) {
        return "DeleteRemoteErr" + exc;
    }

    private void u0() {
        Z("loadTaskList");
        a aVar = null;
        Set<String> stringSet = this.a.getSharedPreferences("file_manager_configs", 0).getStringSet("task_list_save", null);
        if (stringSet == null || stringSet.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = stringSet.iterator();
        while (it2.hasNext()) {
            TransferTask transferTaskDecode = TransferTask.decode(it2.next());
            if (transferTaskDecode != null) {
                transferTaskDecode.h(3);
                Z("  load unfinished task: " + transferTaskDecode);
                arrayList.add(transferTaskDecode);
            }
        }
        Collections.sort(arrayList, new l(this, aVar));
        synchronized (this.W) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TransferTask transferTask = (TransferTask) arrayList.get(i2);
                transferTask.f();
                this.X.add(transferTask);
                this.R.obtainMessage(153, transferTask).sendToTarget();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        Z("markAllTaskFailedInternal");
        synchronized (this.W) {
            for (TransferTask transferTask : this.X) {
                transferTask.h(3);
                this.R.obtainMessage(154, transferTask).sendToTarget();
            }
            Y();
        }
    }

    private void w0() {
        this.l = true;
        this.U.clear();
        this.R.removeCallbacksAndMessages(null);
        setAPConnectCallback(null);
        try {
            this.a.unregisterReceiver(this.s);
        } catch (Exception unused) {
        }
        this.k.removeCallbacksAndMessages(null);
        this.N.getLooper().quitSafely();
        this.O.removeCallbacksAndMessages(null);
        this.P.getLooper().quitSafely();
        this.Q.removeCallbacksAndMessages(null);
        X();
        A0();
        Z("onDestroy");
    }

    private void x0() {
        Z("openWifi");
        this.k.removeMessages(130);
        int wifiState = this.b.getWifiState();
        if (wifiState != 1) {
            Z("  wifi state not WIFI_STATE_DISABLED. state:" + wifiState);
            this.t = false;
            this.k.sendEmptyMessage(130);
            return;
        }
        boolean wifiEnabled = this.b.setWifiEnabled(true);
        Z("  open result " + wifiEnabled);
        if (!wifiEnabled) {
            B0();
        } else {
            this.t = true;
            this.k.sendEmptyMessageDelayed(130, 30000L);
        }
    }

    private void y0() {
        WifiInfo connectionInfo = this.b.getConnectionInfo();
        if (connectionInfo != null) {
            this.e = connectionInfo.getNetworkId();
            Z("  savedNetId: " + this.e);
        }
    }

    private void z0() {
        this.Q.removeMessages(164);
        this.Q.sendEmptyMessageDelayed(164, 500L);
    }

    public void cancelRetryConnect() {
        this.n = true;
        this.o = true;
    }

    public void connectAP(final String str, int i2, String str2) {
        boolean zEnableNetwork;
        Z("connectAP");
        this.h = str;
        this.g = "\"" + str + "\"";
        this.i = str2;
        this.j = i2;
        this.n = false;
        this.o = false;
        if (!this.b.isWifiEnabled()) {
            x0();
            return;
        }
        if (this.k.hasMessages(131)) {
            return;
        }
        y0();
        this.d = false;
        WifiConfiguration wifiConfigurationH0 = h0(this.g);
        if (wifiConfigurationH0 != null) {
            boolean zRemoveNetwork = this.b.removeNetwork(wifiConfigurationH0.networkId);
            Z("  removeNetwork exist NetId:" + wifiConfigurationH0.networkId + " " + zRemoveNetwork);
            if (zRemoveNetwork) {
                this.f = this.b.addNetwork(W(str, str2, i2));
                Z("  addNetwork netId " + this.f);
            } else {
                this.f = wifiConfigurationH0.networkId;
            }
        } else {
            this.f = this.b.addNetwork(W(str, str2, i2));
            Z("  addNetwork netId " + this.f);
        }
        if (this.f > -1) {
            b0();
            zEnableNetwork = this.b.enableNetwork(this.f, true);
            if (zEnableNetwork) {
                this.b.saveConfiguration();
            } else {
                this.b.removeNetwork(this.f);
            }
            Z("  connecting ap " + this.f + " " + zEnableNetwork);
        } else {
            zEnableNetwork = false;
        }
        if (!zEnableNetwork && Build.VERSION.SDK_INT >= 29) {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(1).removeCapability(12).setNetworkSpecifier(new WifiNetworkSpecifier.Builder().setSsidPattern(new PatternMatcher(str, 0)).setWpa2Passphrase(str2).build()).build();
            HMLog.info(Y, new Function0() { // from class: bz5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhoneWifiFtpUtil.i0(str);
                }
            });
            this.c.requestNetwork(networkRequestBuild, this.u);
        }
        this.r = 0;
        this.k.sendEmptyMessageDelayed(131, 2000L);
    }

    public void connectFTP() {
        Z("connectFTP");
        this.Q.sendEmptyMessage(150);
    }

    public void disconnectAP() {
        Z("disconnectAP");
        if (this.b.isWifiEnabled()) {
            Z(" wifi enabled.");
            int i2 = this.e;
            if (i2 > -1 && i2 != this.f) {
                Z("  connect saved " + this.e + " " + this.b.enableNetwork(i2, true));
            }
        } else {
            Z("  Wifi disabled. Do not connect to the saved network.");
        }
        this.h = null;
        this.g = null;
        this.i = null;
        this.j = -1;
        this.d = false;
        this.Q.removeMessages(150);
        APConnectCallback aPConnectCallback = this.m;
        if (aPConnectCallback != null) {
            aPConnectCallback.onDisconnected();
        }
    }

    public void disconnectFTP() {
        Z("disconnectFTP");
        this.Q.removeMessages(150);
        this.Q.sendEmptyMessage(151);
    }

    public int getTaskCount() {
        return this.X.size();
    }

    public ArrayList<TransferTask> getTransferTaskList() {
        ArrayList<TransferTask> arrayList;
        synchronized (this.W) {
            arrayList = (ArrayList) this.X.clone();
        }
        return arrayList;
    }

    public void registerFTPCallback(FTPCallback fTPCallback) {
        this.R.post(new f(fTPCallback));
    }

    public void removeTransferTask(int i2) {
        this.Q.obtainMessage(162, i2, 0).sendToTarget();
    }

    public void removeTransferTaskInternal(int i2) {
        Z("removeTransferTask: " + i2);
        synchronized (this.W) {
            TransferTask transferTask = null;
            for (TransferTask transferTask2 : this.X) {
                if (transferTask2.getID() == i2) {
                    Z("  found task: " + transferTask2);
                    transferTask = transferTask2;
                    break;
                }
            }
            if (transferTask != null) {
                if (transferTask.getState() != 1) {
                    transferTask.h(4);
                } else {
                    try {
                        try {
                            this.M.abortCurrentDataTransfer(true);
                        } catch (IOException e2) {
                            a0("  abortCurrentDataTransfer IOException. ", e2);
                        }
                    } catch (FTPIllegalReplyException e3) {
                        a0("  abortCurrentDataTransfer FTPIllegalReplyException. ", e3);
                    }
                }
                this.X.remove(transferTask);
                Y();
                z0();
                this.R.obtainMessage(155, transferTask).sendToTarget();
                Z("  remove done. " + i2);
            }
        }
    }

    public void retryTransferTask(TransferTask... transferTaskArr) {
        this.R.obtainMessage(163, transferTaskArr).sendToTarget();
    }

    public void setAPConnectCallback(APConnectCallback aPConnectCallback) {
        this.m = aPConnectCallback;
    }

    public void unregisterFTPCallback(FTPCallback fTPCallback) {
        this.R.post(new g(fTPCallback));
    }

    public int uploadFile(File file, String str) {
        if (file == null || str == null) {
            return -1;
        }
        TransferTask transferTask = new TransferTask(file.getPath(), str, 1, null);
        synchronized (this.W) {
            int iIndexOf = this.X.indexOf(transferTask);
            if (iIndexOf < 0) {
                this.X.add(transferTask);
                this.R.obtainMessage(153, transferTask).sendToTarget();
                z0();
                if (this.d || this.t) {
                    c0();
                } else {
                    Z("  wifi not work.");
                }
            } else {
                transferTask = this.X.get(iIndexOf);
                if (this.d || this.t) {
                    if (transferTask.getState() == 3) {
                        transferTask.h(0);
                        this.R.obtainMessage(154, transferTask).sendToTarget();
                    }
                    c0();
                } else {
                    Z("  wifi not work.");
                    if (transferTask.getState() == 3) {
                        transferTask.h(0);
                        this.R.obtainMessage(154, transferTask).sendToTarget();
                    }
                }
            }
        }
        return transferTask.getID();
    }
}
