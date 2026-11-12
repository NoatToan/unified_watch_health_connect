package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.material.timepicker.TimeModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.android.app.ActivityManagerEx;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.constant.TransferBusinessType;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.SyncMusicBinder;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicFolderItem;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicFolderStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicHistoryCallbackInterface;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicIndexCallbackInterface;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationCallbackInterface;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationData;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.HwMusicMgrCallback;
import com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class maa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41237a = new Object();
    private static maa d;
    private SyncMusicBinder g;
    private String k;
    private Notification r;
    private String u;
    private NotificationManager v;
    private RemoteViews x;
    private ArrayList<MusicSong> l = new ArrayList<>(16);
    private ArrayList<MusicSong> o = new ArrayList<>(16);
    private boolean p = true;
    private int w = 10000;
    private CopyOnWriteArrayList<MusicSong> ab = new CopyOnWriteArrayList<>();
    private ArrayList<MusicSong> y = new ArrayList<>(16);
    private MusicSong n = new MusicSong();
    private int h = 0;
    private boolean t = true;
    private Map<String, IBaseCallback> j = new HashMap(16);
    private boolean s = false;
    private String q = "";
    private boolean e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41239c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41238b = false;
    private IAppTransferFileResultAIDLCallback z = new IAppTransferFileResultAIDLCallback.Stub() { // from class: maa.3
        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileTransferState(int i, String str) {
            maa.this.f41239c = true;
            LogUtil.a("SyncMusicManager", "onFileTransferState percentage:", Integer.valueOf(i));
            if (maa.this.e) {
                if (!maa.this.f41238b) {
                    ReleaseLogUtil.d("R_Music_SyncMusicManager", "onFileTransferState:", Integer.valueOf(i), ";isCancelSyncMusic:true isSendStopFileCmd false");
                    maa.this.c();
                    return;
                } else {
                    LogUtil.a("R_Music_SyncMusicManager", "onFileTransferState:", Integer.valueOf(i), ";isCancelSyncMusic:true isSendStopFileCmd true");
                    return;
                }
            }
            maa.this.d(i);
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onUpgradeFailed(int i, String str) throws Throwable {
            if (maa.this.n != null) {
                ReleaseLogUtil.d("R_Music_SyncMusicManager", "sync the music UpgradeFailed, songName:", maa.this.n.getSongName(), ";errorCode:", Integer.valueOf(i));
            }
            maa.this.b(i, str);
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileRespond(int i, String str) {
            ReleaseLogUtil.d("R_Music_SyncMusicManager", "onFileRespond: checkResult:", Integer.valueOf(i), ";songName:", maa.this.n.getSongName());
            if (i == 1) {
                maa.this.l.add(maa.this.n);
                maa.this.am();
                maa.this.d(0, "success");
            } else {
                maa.this.o.add(maa.this.n);
                maa.this.d(1, "on file respond sync fail.");
            }
            maa.this.aw();
        }
    };
    private IAppTransferFileResultAIDLCallback i = new IAppTransferFileResultAIDLCallback.Stub() { // from class: maa.5
        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileTransferState(int i, String str) {
            LogUtil.a("SyncMusicManager", "cancelAllTask, onFileTransferState ", Integer.valueOf(i));
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onUpgradeFailed(int i, String str) {
            LogUtil.a("SyncMusicManager", "cancelAllTask, onUpgradeFailed errorCode:", Integer.valueOf(i));
            maa.this.e = false;
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileRespond(int i, String str) throws Throwable {
            LogUtil.a("SyncMusicManager", "cancelTransferMusic response checkResult:" + i);
            maa.this.s();
        }
    };
    private HwMusicMgrCallback m = new HwMusicMgrCallback.Stub() { // from class: maa.1
        @Override // com.huawei.hwservicesmgr.HwMusicMgrCallback
        public void executeCommand(String str, IBaseCallback iBaseCallback) throws RemoteException {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString(ParsedFieldTag.ACTION_TYPE);
                ReleaseLogUtil.d("R_Music_SyncMusicManager", "executeCommand actionType:", strOptString);
                maa.this.a(strOptString, str, iBaseCallback, jSONObject);
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("R_Music_SyncMusicManager", "executeCommand RemoteException");
                iBaseCallback.onResponse(1, "RemoteException");
            } catch (JSONException unused2) {
                ReleaseLogUtil.a("R_Music_SyncMusicManager", "executeCommand JSONException");
                iBaseCallback.onResponse(1, "JSONException");
            }
        }
    };
    private IBaseCallback.Stub ad = new IBaseCallback.Stub() { // from class: maa.4
        @Override // com.huawei.hwservicesmgr.IBaseCallback
        public void onResponse(int i, String str) {
            LogUtil.a("SyncMusicManager", "mXiMaLaYaManagerCallback, errorCode: ", Integer.valueOf(i), " reason: ", str);
            if (maa.this.s) {
                maa.this.t();
            } else {
                LogUtil.a("SyncMusicManager", "mXiMaLaYaManagerCallback mIsSyncMusicTaskRunning is false ");
            }
        }
    };
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: maa.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            DeviceInfo deviceInfo;
            if (intent == null) {
                LogUtil.j("SyncMusicManager", "mConnectStateChangedReceiver, intent is null");
                return;
            }
            LogUtil.a("SyncMusicManager", "mConnectStateChangedReceiver intent : " + intent.getAction());
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                try {
                    if ((intent.getParcelableExtra("deviceinfo") instanceof DeviceInfo) && (deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo")) != null) {
                        if (deviceInfo.getRelationship() == null || !"followed_relationship".equals(deviceInfo.getRelationship())) {
                            maa.this.c(deviceInfo);
                        } else {
                            LogUtil.a("SyncMusicManager", "This device does not have the correspond capability.");
                        }
                    }
                } catch (BadParcelableException e) {
                    LogUtil.e("SyncMusicManager", "BadParcelableException:", ExceptionUtils.c(e));
                } catch (ClassCastException e2) {
                    LogUtil.e("SyncMusicManager", "ClassCastException:", ExceptionUtils.c(e2));
                }
            }
        }
    };

    private maa() {
        ao();
        lug.d(new IBaseResponseCallback() { // from class: lzz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f41236b.b(i, obj);
            }
        });
    }

    /* synthetic */ void b(int i, Object obj) {
        if (this.g != null) {
            ReleaseLogUtil.d("R_Music_SyncMusicManager", "SyncMusicManager PhoneServiceDiedCallBack");
            this.g.notifyServiceCancel();
            this.g.notifyUiAllMusicsFinish();
        }
        e();
        lvb.e().c(40);
    }

    public static maa b() {
        maa maaVar;
        synchronized (f41237a) {
            if (d == null) {
                d = new maa();
            }
            maaVar = d;
        }
        return maaVar;
    }

    private void ao() {
        LogUtil.a("SyncMusicManager", "Enter registerConnectStateBroadcast");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f, intentFilter, LocalBroadcast.f36595c, null);
    }

    public boolean m() {
        return this.s;
    }

    public boolean l() {
        return this.e;
    }

    public void b(SyncMusicBinder syncMusicBinder, String str) {
        this.g = syncMusicBinder;
        this.q = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    public void a(String str, String str2, IBaseCallback iBaseCallback, JSONObject jSONObject) throws RemoteException {
        str.hashCode();
        switch (str) {
            case "deleteAudio":
                f(str2, iBaseCallback);
                break;
            case "getAppState":
                d(str2, iBaseCallback);
                break;
            case "accountNotify":
                c(str2, iBaseCallback);
                break;
            case "sendBatchInfo":
                e(str2, iBaseCallback);
                break;
            case "getPlayedRecords":
                a(str2, iBaseCallback);
                break;
            case "getAppFolders":
                b(str2, iBaseCallback);
                break;
            case "isSyncMusicTaskRunning":
                e(iBaseCallback);
                break;
            case "utilityNegotiate":
                a(iBaseCallback);
                break;
            case "getDeviceConnectState":
                c(iBaseCallback);
                break;
            case "sendSongFile":
                e(jSONObject);
                this.j.put(jSONObject.optString("musicId"), iBaseCallback);
                break;
            case "cancleTransfer":
                c();
                break;
            case "getDevicesInfo":
                d(iBaseCallback);
                break;
            default:
                iBaseCallback.onResponse(500001, "");
                break;
        }
    }

    private void c(IBaseCallback iBaseCallback) {
        try {
            if (ad() == 0) {
                iBaseCallback.onResponse(0, "device connected");
            } else {
                iBaseCallback.onResponse(1, "device disconnect");
            }
        } catch (RemoteException unused) {
            LogUtil.e("SyncMusicManager", "setDeviceConnectState RemoteException");
        }
    }

    private String aa() {
        DeviceInfo deviceInfoC = mgg.c("SyncMusicManager");
        if (deviceInfoC != null) {
            return deviceInfoC.getDeviceIdentify();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo) throws Throwable {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_Music_SyncMusicManager", "deviceInfo is null when dealNewConnectState.");
            return;
        }
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        if (deviceConnectState == 1) {
            LogUtil.a("SyncMusicManager", "DEVICE_CONNECTING");
            return;
        }
        if (deviceConnectState != 2) {
            if (deviceConnectState != 3) {
                LogUtil.j("SyncMusicManager", "DEVICE_CONNECT_STATUS_OTHER");
                return;
            } else {
                LogUtil.a("SyncMusicManager", "DEVICE_DISCONNECTED. device: ", cpl.a(deviceInfo.getDeviceIdentify()));
                this.q = deviceInfo.getDeviceIdentify();
                return;
            }
        }
        ReleaseLogUtil.d("R_Music_SyncMusicManager", "DEVICE_CONNECTED, mFailedTransferMusicList size:", Integer.valueOf(this.o.size()));
        String strAa = aa();
        if (strAa != null && !strAa.equals(deviceInfo.getDeviceIdentify())) {
            LogUtil.a("SyncMusicManager", "onReceive cancelMusicFileTransferTask");
            c();
            return;
        }
        if (!TextUtils.isEmpty(this.q) && !TextUtils.equals(deviceInfo.getDeviceIdentify(), this.q)) {
            LogUtil.a("SyncMusicManager", "not the same device. Cancel Transfer. LastDeviceIdentify = ", cpl.a(this.q), ", now device = ", cpl.a(deviceInfo.getDeviceIdentify()));
            c();
            this.q = deviceInfo.getDeviceIdentify();
            return;
        }
        this.q = deviceInfo.getDeviceIdentify();
        if (njy.e(this.o)) {
            ReleaseLogUtil.e("R_Music_SyncMusicManager", "DEVICE_CONNECTED. mFailedTransferMusicList is empty");
            s();
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.addAll(this.o);
        ah();
        ap();
        SyncMusicBinder syncMusicBinder = this.g;
        if (syncMusicBinder != null) {
            syncMusicBinder.notifyUiIsSyncMusicTaskRunning();
        }
        this.ab.addAll(arrayList);
        this.y.addAll(arrayList);
        ThreadPoolManager.c().execute(new Runnable() { // from class: lzy
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.e.k();
            }
        });
    }

    /* synthetic */ void k() throws Throwable {
        b(this.ab);
    }

    private int ad() {
        DeviceInfo deviceInfoC = mgg.c("SyncMusicManager");
        return (deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2) ? 0 : 1;
    }

    private void e(IBaseCallback iBaseCallback) {
        try {
            LogUtil.a("SyncMusicManager", "sendIsTaskRunningToDevice mIsSyncMusicTaskRunning:", this.s + ",isCancelSyncMusic:", Boolean.valueOf(this.e));
            if (this.s) {
                ReleaseLogUtil.d("R_Music_SyncMusicManager", "MUSIC_TASK_RUNNING");
                iBaseCallback.onResponse(1, "music task running");
            } else {
                ReleaseLogUtil.d("R_Music_SyncMusicManager", "MUSIC_TASK_STOP");
                iBaseCallback.onResponse(0, "music task stop");
            }
        } catch (RemoteException unused) {
            LogUtil.e("SyncMusicManager", "sendIsTaskRunningToDevice RemoteException");
        }
    }

    private void f(String str, IBaseCallback iBaseCallback) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(Integer.valueOf(jSONObject.optInt("operation_type")));
            arrayList.add(Integer.valueOf(jSONObject.optInt("folder_index")));
            LogUtil.a("SyncMusicManager", "operation type is:", arrayList.get(0), "folder index is:", arrayList.get(1));
            if (arrayList.isEmpty()) {
                LogUtil.j("SyncMusicManager", "audioInfo is null");
                iBaseCallback.onResponse(2, "");
            } else {
                lzl.a(BaseApplication.getContext()).e(arrayList);
                iBaseCallback.onResponse(0, "");
            }
        } catch (RemoteException unused) {
            LogUtil.e("SyncMusicManager", "sendMusicDeleteAudioInfo RemoteException");
        } catch (JSONException unused2) {
            LogUtil.e("SyncMusicManager", "sendMusicDeleteAudioInfo JSONException");
        }
    }

    private void d(final String str, final IBaseCallback iBaseCallback) {
        lyy.b().e(new IBaseResponseCallback() { // from class: lzw
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f41235c.e(str, iBaseCallback, i, obj);
            }
        });
    }

    /* synthetic */ void e(String str, IBaseCallback iBaseCallback, int i, Object obj) {
        lzc lzcVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            String strOptString = jSONObject.optString("package");
            if (obj != null && !"[]".equals(obj) && !TextUtils.isEmpty(strOptString)) {
                List list = (List) HiJsonUtil.d(HiJsonUtil.d(obj), new TypeToken<List<lzc>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.SyncMusicManager$6
                }.getType());
                if (list == null) {
                    LogUtil.j("SyncMusicManager", "getAppInstallInfo installAppList is null");
                    e(jSONObject2, 0, "");
                    iBaseCallback.onResponse(0, jSONObject2.toString());
                    return;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        lzcVar = null;
                        break;
                    }
                    lzcVar = (lzc) it.next();
                    if (lzcVar == null) {
                        LogUtil.j("SyncMusicManager", "getAppInstallInfo, installAppInfo is null");
                    } else if (lzcVar.d() != null && lzcVar.d().contains(strOptString)) {
                        LogUtil.d("SyncMusicManager", "getAppInstallInfo, break");
                        break;
                    }
                }
                if (lzcVar == null) {
                    LogUtil.j("SyncMusicManager", "getAppInstallInfo, installAppItem is null");
                    e(jSONObject2, 0, "");
                } else {
                    e(jSONObject2, 1, lzcVar.d());
                }
                iBaseCallback.onResponse(0, jSONObject2.toString());
                return;
            }
            LogUtil.j("SyncMusicManager", "getAppInstallInfo result data error");
            e(jSONObject2, 0, "");
            iBaseCallback.onResponse(0, jSONObject2.toString());
        } catch (RemoteException | JSONException unused) {
            LogUtil.e("SyncMusicManager", "getAppInstallInfo JSONException or RemoteException");
        }
    }

    private void e(JSONObject jSONObject, int i, String str) throws JSONException {
        jSONObject.putOpt("packageInstall", Integer.valueOf(i));
        jSONObject.putOpt("version", str);
    }

    public void c() {
        synchronized (this) {
            DeviceInfo deviceInfoC = mgg.c("SyncMusicManager");
            if (deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2) {
                if (!this.s) {
                    ReleaseLogUtil.d("R_Music_SyncMusicManager", "cancelCurrentTransferTask false");
                    return;
                }
                LogUtil.a("SyncMusicManager", "TESTMUSIC cancelCurrentTransferTask fileName:", Boolean.valueOf(TextUtils.isEmpty(this.n.getFileName())));
                this.e = true;
                LogUtil.a("SyncMusicManager", "cancelCurrentTransferTask set isCancelSyncMusic true");
                if (!this.f41239c) {
                    ReleaseLogUtil.d("R_Music_SyncMusicManager", "isFileTransfer. false");
                    as();
                    return;
                }
                if (this.f41238b) {
                    ReleaseLogUtil.d("R_Music_SyncMusicManager", "isSendStopFileCmd true");
                    return;
                }
                mhp mhpVar = new mhp();
                mhpVar.a(this.n.getFileName());
                mhpVar.c(2);
                mhpVar.e(TransferFileReqType.APP_STOP);
                mhpVar.d(null);
                lvb.e().b(TransferBusinessType.FIVE_FORTY, mhpVar, this.i);
                LogUtil.a("SyncMusicManager", "TransferFileReqType.APP_STOP");
                this.f41238b = true;
                as();
                return;
            }
            ReleaseLogUtil.d("R_Music_SyncMusicManager", "cancelCurrentTransferTask deviceInfo is null or not connected ");
            s();
        }
    }

    private void as() throws Throwable {
        LogUtil.a("SyncMusicManager", "removeNotification enter.");
        SyncMusicBinder syncMusicBinder = this.g;
        if (syncMusicBinder != null) {
            syncMusicBinder.notifyUiCancelSyncMusicTask();
        }
        e();
        ab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() throws Throwable {
        this.e = false;
        this.f41238b = false;
        LogUtil.a("SyncMusicManager", "afterCancelTransferProcess set isCancelSyncMusic false");
        ax();
        ab();
        e(false);
    }

    private void d(IBaseCallback iBaseCallback) {
        DeviceCapability deviceCapabilityA;
        List<DeviceInfo> listE = mgg.e("SyncMusicManager");
        try {
            if (listE == null) {
                if (iBaseCallback != null) {
                    iBaseCallback.onResponse(1, "no connected devices");
                    return;
                }
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (DeviceInfo deviceInfo : listE) {
                if (deviceInfo != null && (deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify())) != null && deviceCapabilityA.isSupportMusicInfoList() && !lzq.c()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("deviceid", "");
                    jSONObject.put("devicename", deviceInfo.getDeviceName());
                    jSONObject.put("expandCapability", deviceInfo.getExpandCapability());
                    jSONArray.put(jSONObject);
                }
            }
            if (jSONArray.length() > 0) {
                iBaseCallback.onResponse(0, jSONArray.toString());
            } else {
                iBaseCallback.onResponse(1, "no connected devices");
            }
        } catch (RemoteException unused) {
            LogUtil.e("SyncMusicManager", "getDevicesInfo RemoteException");
        } catch (JSONException unused2) {
            LogUtil.e("SyncMusicManager", "getDevicesInfo JSONException");
        }
    }

    private void e(String str, IBaseCallback iBaseCallback) {
        LogUtil.a("SyncMusicManager", "saveListMusicInfo enter");
        e(true);
        try {
            JSONObject jSONObject = new JSONObject(str);
            ArrayList<MusicSong> arrayList = new ArrayList<>(16);
            int iOptInt = jSONObject.optInt("musicAppType");
            String strOptString = jSONObject.optString("package");
            JSONArray jSONArray = jSONObject.getJSONArray("inputDescription");
            for (int i = 0; i < jSONArray.length(); i++) {
                MusicSong musicSong = new MusicSong();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    String strOptString2 = jSONObject2.optString("musicId");
                    try {
                        musicSong.setSongFilePath(BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + strOptString2);
                    } catch (IOException unused) {
                        LogUtil.e("SyncMusicManager", "setSongPath IOException");
                    }
                    musicSong.setMusicId(strOptString2);
                    musicSong.setFileName(strOptString2);
                    musicSong.setSongName(jSONObject2.optString("musicName"));
                    musicSong.setSongSingerName(jSONObject2.optString("musicSinger"));
                    musicSong.setAlbumName(jSONObject2.optString("musicAlbum"));
                    musicSong.setAccountName(jSONObject2.optString("accountName"));
                    musicSong.setMusicType(jSONObject2.optInt("musicType"));
                    musicSong.setMusicAppType(iOptInt);
                    musicSong.setMusicCopyRight(jSONObject2.optInt("musicCopyright"));
                    musicSong.setMusicDuration(jSONObject2.optInt("musicDuration"));
                    a(musicSong, jSONObject2, strOptString);
                    arrayList.add(musicSong);
                    LogUtil.a("SyncMusicManager", "musicSong type:", Integer.valueOf(musicSong.getMusicType()));
                }
            }
            this.e = false;
            LogUtil.a("SyncMusicManager", "saveListMusicInfo set isCancelSyncMusic false");
            d(arrayList, iBaseCallback);
        } catch (JSONException unused2) {
            LogUtil.e("SyncMusicManager", "sendDeviceCommand JSONException");
        }
    }

    private void e(boolean z) {
        if (!cop.c()) {
            LogUtil.a("SyncMusicManager", "The device is not provided by Harmony.");
            return;
        }
        int iMyPid = Process.myPid();
        if (iMyPid != 0) {
            ReleaseLogUtil.d("SyncMusicManager", "PhoneService set Processing ：", Boolean.valueOf(z));
            try {
                ActivityManagerEx.setProcessForeground(new Binder(), iMyPid, z);
                LogUtil.a("SyncMusicManager", "setProcessForeground end.");
            } catch (Exception e) {
                LogUtil.e("SyncMusicManager", "setProcessForeground fail ", e.getMessage());
            }
        }
    }

    private void a(final IBaseCallback iBaseCallback) {
        LogUtil.a("SyncMusicManager", "getDeviceAndMusicType enter");
        lzl.a(BaseApplication.getContext()).e((NegotiationData) null, new NegotiationCallbackInterface() { // from class: mae
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationCallbackInterface
            public final void onGetNegotiationData(NegotiationData negotiationData, int i) {
                maa.e(iBaseCallback, negotiationData, i);
            }
        });
    }

    static /* synthetic */ void e(IBaseCallback iBaseCallback, NegotiationData negotiationData, int i) {
        LogUtil.a("SyncMusicManager", "onGetNegotiationData rsp,errorCode:", Integer.valueOf(i));
        try {
            if (negotiationData == null) {
                iBaseCallback.onResponse(1, "");
                LogUtil.j("SyncMusicManager", "negotiationData is empty");
                return;
            }
            if (i == 100000) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("storageSpace", negotiationData.getStorageSpace());
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = negotiationData.getMusicFormatList().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("musicFormat", jSONArray);
                jSONObject.put("musicQuality", negotiationData.getMusicQuality());
                jSONObject.put("typeStruct", new Gson().toJson(negotiationData.getTypeStructList()));
                String string = jSONObject.toString();
                LogUtil.a("SyncMusicManager", "onGetNegotiationData, jsonString :", string);
                iBaseCallback.onResponse(0, string);
                return;
            }
            iBaseCallback.onResponse(1, "");
        } catch (RemoteException unused) {
            LogUtil.e("SyncMusicManager", "getDeviceAndMusicType RemoteException");
        } catch (JSONException unused2) {
            LogUtil.e("SyncMusicManager", "getDeviceAndMusicType JSONException");
        }
    }

    private void ab() throws Throwable {
        boolean z = Looper.myLooper() == Looper.getMainLooper();
        LogUtil.a("SyncMusicManager", "getBundleFromHwMusic isMainThread:", Boolean.valueOf(z));
        if (z) {
            ThreadPoolManager.c().a("SEND_CANCEL_MSG_MUSIC", new Runnable() { // from class: mac
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f41247b.aq();
                }
            });
        } else {
            aq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() throws Throwable {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        LogUtil.a("SyncMusicManager", "sendCancelMsgToHwMusic enter");
        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
        ContentProviderClient contentProviderClient = null;
        try {
            try {
                if (contentResolver != null) {
                    contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(Uri.parse("content://com.android.mediacenter.healthprovider/InfoForWatch"));
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            ReleaseLogUtil.d("R_Music_SyncMusicManager", "SEND_CANCLE_MSG_TO_HW_MUSIC_KEY.");
                            contentResolver.call(Uri.parse("content://com.android.mediacenter.healthprovider/InfoForWatch"), "cancleTransfer", (String) null, (Bundle) null);
                        } else {
                            LogUtil.j("SyncMusicManager", "getBundleFromHwMusic, client is null.");
                        }
                        contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    } catch (RuntimeException unused) {
                        contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                        LogUtil.e("SyncMusicManager", "getBundleFromHwMusic DeadObjectException");
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        throw th;
                    }
                } else {
                    LogUtil.a("SyncMusicManager", "getBundleFromHwMusic: resolver is null");
                }
                if (contentProviderClient != null) {
                    contentProviderClient.close();
                }
            } catch (Throwable th2) {
                th = th2;
                contentProviderClientAcquireUnstableContentProviderClient = null;
            }
        } catch (RuntimeException unused2) {
        }
    }

    private void b(String str, final IBaseCallback iBaseCallback) {
        LogUtil.a("SyncMusicManager", "getMusicFolderList enter");
        try {
            lzl.a(BaseApplication.getContext()).e(new JSONObject(str).getString("package"), new IBaseResponseCallback() { // from class: maf
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f41250b.b(iBaseCallback, i, obj);
                }
            });
        } catch (JSONException unused) {
            LogUtil.e("SyncMusicManager", "getMusicFolderList JSONException");
        }
    }

    /* synthetic */ void b(IBaseCallback iBaseCallback, int i, Object obj) {
        LogUtil.a("SyncMusicManager", "getMusicFolderList errorCode:", Integer.valueOf(i));
        if (njy.b(obj, MusicFolderStruct.class)) {
            try {
                iBaseCallback.onResponse(0, new Gson().toJson(e((List<MusicFolderStruct>) obj), new TypeToken<List<MusicFolderItem>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.SyncMusicManager$7
                }.getType()));
            } catch (RemoteException unused) {
                LogUtil.e("SyncMusicManager", "getMusicFolderList RemoteException");
            }
        }
    }

    private void a(String str, final IBaseCallback iBaseCallback) {
        LogUtil.a("SyncMusicManager", "getPlayedRecords enter");
        try {
            JSONObject jSONObject = new JSONObject(str);
            lzl.a(BaseApplication.getContext()).b(new MusicHistoryCallbackInterface() { // from class: maa.10
                @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicHistoryCallbackInterface
                public void onGetHistoryRecords(int i, String str2, List<man> list) {
                    LogUtil.a("SyncMusicManager", "onGetHistoryRecords req");
                    maa.this.a(i, str2, list, iBaseCallback);
                }

                @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicHistoryCallbackInterface
                public void getHistoryRecordsBusy(int i, String str2, int i2) {
                    LogUtil.a("SyncMusicManager", "getHIstoryRecordsBusy response");
                    try {
                        IBaseCallback iBaseCallback2 = iBaseCallback;
                        if (iBaseCallback2 != null) {
                            iBaseCallback2.onResponse(1, null);
                        }
                    } catch (RemoteException unused) {
                        LogUtil.e("SyncMusicManager", "getHIstoryRecordsBusy IWearAIDL registerCallback exception.");
                    }
                }
            }, jSONObject.optInt("musicAppType"), jSONObject.optString("accountInfo"));
        } catch (JSONException unused) {
            LogUtil.e("SyncMusicManager", "JSONException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, List<man> list, IBaseCallback iBaseCallback) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("musicAppType", i);
            jSONObject.put("accountInfo", str);
            JSONArray jSONArray = new JSONArray();
            for (man manVar : list) {
                if (manVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("hitoryMusicId", manVar.a());
                    jSONObject2.put("historyPlayTime", manVar.d());
                    jSONObject2.put("historyPlayedTime", manVar.c());
                    jSONObject2.put("musicDuration", manVar.b());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("historyList", jSONArray);
            String string = jSONObject.toString();
            LogUtil.a("SyncMusicManager", "onGetHistoryRecords, accountInfo:", str);
            if (iBaseCallback != null) {
                iBaseCallback.onResponse(0, string);
            }
        } catch (RemoteException unused) {
            LogUtil.e("SyncMusicManager", "IWearAIDL registerCallback RemoteException");
        } catch (JSONException unused2) {
            LogUtil.e("SyncMusicManager", "JSONException");
        }
    }

    private void c(String str, IBaseCallback iBaseCallback) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            mak makVar = new mak();
            makVar.a(jSONObject.optInt("accountDeadline"));
            makVar.e(jSONObject.optString("accountInfo"));
            makVar.c(jSONObject.optInt("accountNotifyType"));
            makVar.e(jSONObject.optInt("musicAppType"));
            LogUtil.a("SyncMusicManager", "sendMusicAccountInfo by bluetooth, appType:", Integer.valueOf(makVar.a()));
            lzl.a(BaseApplication.getContext()).e(makVar);
            iBaseCallback.onResponse(0, "");
        } catch (RemoteException unused) {
            LogUtil.e("SyncMusicManager", "sendMusicAccountInfo RemoteException");
        } catch (JSONException unused2) {
            LogUtil.e("SyncMusicManager", "sendMusicAccountInfo JSONException");
        }
    }

    private List<MusicFolderItem> e(List<MusicFolderStruct> list) {
        ArrayList arrayList = new ArrayList(16);
        for (MusicFolderStruct musicFolderStruct : list) {
            if (musicFolderStruct != null) {
                MusicFolderItem musicFolderItem = new MusicFolderItem();
                musicFolderItem.setFolderName(musicFolderStruct.getFolderName());
                musicFolderItem.setNumber(String.valueOf(musicFolderStruct.getFolderMusicAssociationFrameCount()));
                arrayList.add(musicFolderItem);
            }
        }
        return arrayList;
    }

    private void e(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("musicId");
        for (MusicSong musicSong : this.y) {
            if (musicSong != null && musicSong.getMusicId().equals(strOptString)) {
                musicSong.setMusicEncryption(jSONObject.optInt("musicEncryption"));
                musicSong.setMusicKey(jSONObject.optString("musicKey"));
                musicSong.setMusicIv(jSONObject.optString("musicIV"));
                musicSong.setAccountName(jSONObject.optString("accountName"));
                musicSong.setOnLineMusicCompletedFlag(1);
                LogUtil.a("SyncMusicManager", "saveMusicEncryptionInfo and complete info");
                return;
            }
        }
    }

    private void a(MusicSong musicSong, JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString(MusicSong.SORT_TYPE_FOLDER);
        if (!TextUtils.isEmpty(strOptString)) {
            musicSong.setMusicFolder(strOptString);
        }
        String strOptString2 = jSONObject.optString("albumId");
        if (!TextUtils.isEmpty(strOptString2)) {
            musicSong.setMusicAlbumId(strOptString2);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        musicSong.setPackageName(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        if (this.g == null || this.n.getMusicAppType() == 2) {
            return;
        }
        this.g.notifyUiCurrentMusicFinish();
    }

    private void ak() {
        if (this.g == null || this.n.getMusicAppType() == 2) {
            return;
        }
        this.g.notifyUiAllMusicsFinish();
    }

    private void an() {
        if (this.g == null || this.n.getMusicAppType() == 2) {
            return;
        }
        this.g.notifyUiWhenNoSpace();
    }

    private void al() {
        if (this.g == null || this.n.getMusicAppType() == 2) {
            return;
        }
        this.g.notifyUiBlueToothDisconnect();
    }

    public void c(ArrayList<MusicSong> arrayList) {
        this.ab.removeAll(arrayList);
        this.ab.addAll(arrayList);
        this.y.removeAll(arrayList);
        this.y.addAll(arrayList);
        a(this.n.getSongName());
    }

    private void at() {
        lzl.a(BaseApplication.getContext()).c(new MusicIndexCallbackInterface() { // from class: lzx
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicIndexCallbackInterface
            public final void onGetMusicFileInfo(int i, String str, int i2) {
                this.d.b(i, str, i2);
            }
        });
    }

    /* synthetic */ void b(int i, String str, int i2) {
        LogUtil.a("SyncMusicManager", "receive device's getMusicFileInfo request! musicIndex:", Integer.valueOf(i), "; fileName:", str);
        e(i, str);
    }

    private void e(int i, String str) {
        for (MusicSong musicSong : this.y) {
            try {
                if (!musicSong.getFileName().equals(str)) {
                    LogUtil.j("SyncMusicManager", "dealOnGetMusicFileInfoRspSuccess return.");
                } else {
                    MusicStruct musicStruct = new MusicStruct();
                    LogUtil.a("SyncMusicManager", "receive device's getMusicFileInfo request and sendMusicInfo to device!songName:", musicSong.getSongName(), "; singerName: ", musicSong.getSongSingerName(), ",index:", Integer.valueOf(i));
                    musicSong.setSongIndex(String.valueOf(i));
                    musicStruct.setMusicName(musicSong.getSongName());
                    musicStruct.setMusicSinger(musicSong.getSongSingerName());
                    musicStruct.setMusicIndex(i);
                    if (musicSong.getMusicAppType() != 0) {
                        LogUtil.a("SyncMusicManager", "Not local music!");
                        musicStruct.setMusicIv(musicSong.getMusicIv());
                        musicStruct.setMusicType(musicSong.getMusicType());
                        musicStruct.setMusicCopyright(musicSong.getMusicCopyRight());
                        musicStruct.setMusicEncryption(musicSong.getMusicEncryption());
                        musicStruct.setAccountName(musicSong.getAccountName());
                        musicStruct.setMusicAppType(musicSong.getMusicAppType());
                        musicStruct.setMusicDuration(musicSong.getMusicDuration());
                        musicStruct.setMusicId(musicSong.getMusicId());
                        musicStruct.setFileName(musicSong.getFileName());
                        musicStruct.setMusicKey(musicSong.getMusicKey());
                        musicStruct.setMusicDuration(musicSong.getMusicDuration());
                        musicStruct.setMusicAlbum(musicSong.getAlbumName());
                        musicStruct.setMusicFolder(musicSong.getMusicFolder());
                        musicStruct.setMusicAlbumId(musicSong.getMusicAlbumId());
                        musicStruct.setPackageName(musicSong.getPackageName());
                    }
                    lzl.a(BaseApplication.getContext()).e(musicStruct);
                    return;
                }
            } catch (NumberFormatException unused) {
                ReleaseLogUtil.a("R_Music_SyncMusicManager", "onGetMusicFileInfo error, NumberFormatException");
            }
        }
        LogUtil.a("SyncMusicManager", "receive device's getMusicFileInfo request, but can't match any file！");
    }

    private void ap() {
        LogUtil.a("SyncMusicManager", "sendNotifyMsgByRemoteView");
        this.x = new RemoteViews(BaseApplication.getContext().getPackageName(), R.layout.add_music_to_device_notify_layout);
        if (Build.VERSION.SDK_INT < 31 || ae()) {
            this.x = new RemoteViews(BaseApplication.getContext().getPackageName(), R.layout.add_music_to_device_notify_less_android13_layout);
        }
        Notification.Builder builderC = lsb.d().c();
        builderC.setContentIntent(ac());
        builderC.setSmallIcon(R.mipmap.healthlogo_hw_show_app);
        builderC.setShowWhen(true);
        builderC.setWhen(System.currentTimeMillis());
        builderC.setOngoing(true);
        builderC.setOnlyAlertOnce(true);
        builderC.setCustomContentView(this.x);
        builderC.setCustomBigContentView(this.x);
        this.r = builderC.build();
        if (this.g != null && af()) {
            try {
                this.g.startForeground(this.w, this.r);
                return;
            } catch (Exception e) {
                ReleaseLogUtil.d("R_Music_SyncMusicManager", "startForeground Exception = ", ExceptionUtils.c(e));
                return;
            }
        }
        LogUtil.j("SyncMusicManager", "mBinder is null.");
    }

    private PendingIntent ac() {
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getContext().getPackageName(), "com.huawei.ui.device.activity.music.MusicMainActivity").setFlags(268435456);
        return PendingIntent.getActivity(BaseApplication.getContext(), 0, intent, 201326592);
    }

    private void ar() {
        String str;
        LogUtil.a("SyncMusicManager", "showLocalTransferResult. mSyncTaskInitialMusicList.size() = ", Integer.valueOf(this.y.size()), "; mFailedTransferMusicList.size() = ", Integer.valueOf(this.o.size()));
        if (this.y.size() == 0 || this.o.size() > this.y.size()) {
            LogUtil.j("SyncMusicManager", "List nums is wrong.");
            return;
        }
        String quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_music_songs_num, this.o.size(), Integer.valueOf(this.o.size()));
        String quantityString2 = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_music_songs_num, this.y.size() - this.o.size(), Integer.valueOf(this.y.size() - this.o.size()));
        String quantityString3 = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_settings_music_songs_num, this.o.size(), Integer.valueOf(this.o.size()));
        String quantityString4 = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_settings_music_songs_num, this.y.size() - this.o.size(), Integer.valueOf(this.y.size() - this.o.size()));
        if (this.o.size() == 0) {
            str = String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_music_add_success_to_watch), quantityString2);
        } else if (this.o.size() == this.y.size()) {
            str = String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_music_add_fail_to_watch), quantityString);
        } else {
            str = String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_music_add_success_and_fail_to_watch), quantityString4, quantityString3);
        }
        c(str);
    }

    private void c(String str) {
        Notification.Builder builderC = lsb.d().c();
        lsb.d().c(builderC);
        if (Build.VERSION.SDK_INT == 36) {
            builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        } else {
            builderC.setSmallIcon(R.mipmap.healthlogo_hw_show_app);
        }
        builderC.setWhen(System.currentTimeMillis());
        builderC.setShowWhen(false);
        builderC.setOnlyAlertOnce(true);
        builderC.setAutoCancel(true);
        builderC.setContentIntent(ac());
        builderC.setPriority(0);
        builderC.setGroup("SyncMusicManager");
        builderC.setContentText(str);
        try {
            lsb.d().c(10001, builderC.build());
        } catch (SecurityException e) {
            LogUtil.j("SyncMusicManager", "createCommonNotification SecurityException", LogAnonymous.b(e));
        }
    }

    public int a() {
        return this.h;
    }

    public String j() {
        return this.k;
    }

    public MusicSong d() {
        return this.n;
    }

    public List<MusicSong> i() {
        return this.o;
    }

    public List<MusicSong> f() {
        LogUtil.a("SyncMusicManager", "getHasTransferMusicList, mHasTransferMusicList size :", Integer.valueOf(this.l.size()));
        return this.l;
    }

    public boolean h() {
        return this.s;
    }

    public HwMusicMgrCallback g() {
        return this.m;
    }

    public IBaseCallback.Stub o() {
        return this.ad;
    }

    private void a(String str) {
        this.h = 0;
        this.u = str;
        int size = this.l.size() + this.o.size() + 1;
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            String str2 = String.format(Locale.ENGLISH, TimeModel.NUMBER_FORMAT, Integer.valueOf(size));
            this.k = String.format(Locale.ENGLISH, TimeModel.NUMBER_FORMAT, Integer.valueOf(this.y.size())) + "/" + str2;
        } else {
            this.k = String.format(Locale.ENGLISH, size + "/" + this.y.size(), new Object[0]);
        }
        if (EnvironmentInfo.g()) {
            b(this.u);
        } else if (CommonUtil.bm()) {
            LogUtil.a("SyncMusicManager", "Notification IS_UP_MIUI_10");
            e(this.u, this.k);
        } else {
            RemoteViews remoteViews = this.x;
            if (remoteViews != null) {
                remoteViews.setTextViewText(R.id.adding_to_watch_tv, String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_music_adding_to_watch), str));
                this.x.setTextViewText(R.id.total_progress_tv, this.k);
                this.x.setProgressBar(R.id.transfer_music_progress_bar, 100, this.h, false);
                aj();
            } else {
                LogUtil.a("SyncMusicManager", "mRemoteView is null");
            }
        }
        if (this.g != null) {
            if (this.n.getMusicAppType() != 2) {
                this.g.notifyUiCurrentMusicNameAndTotalProgress();
                this.g.notifyUiCurrentMusicProgress();
            }
            this.g.notifyUiIsSyncMusicTaskRunning();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (i - this.h >= 1) {
            LogUtil.a("SyncMusicManager", "refreshProgressByResult percentage=", Integer.valueOf(i));
            this.h = i;
            this.x.setProgressBar(R.id.transfer_music_progress_bar, 100, i, false);
            if (EnvironmentInfo.g()) {
                b(this.u);
            } else if (CommonUtil.bm()) {
                LogUtil.a("SyncMusicManager", "Notification IS_UP_MIUI_10,percentage:", Integer.valueOf(i));
                e(this.u, this.k);
            } else {
                aj();
            }
            if (this.g != null && this.n.getMusicAppType() != 2) {
                this.g.notifyUiCurrentMusicProgress();
            }
            d(200, String.valueOf(i));
        }
    }

    private void b(String str) {
        String str2 = String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_music_adding_to_watch), str);
        Notification.Builder builderC = lsb.d().c();
        builderC.setContentIntent(ac());
        builderC.setWhen(System.currentTimeMillis());
        builderC.setShowWhen(true);
        builderC.setOnlyAlertOnce(true);
        builderC.setOngoing(true);
        builderC.setProgress(100, this.h, false);
        builderC.setContentTitle(str2);
        builderC.setSmallIcon(R.mipmap.healthlogo_hw_show_app);
        builderC.setContentText(BaseApplication.getContext().getString(R.string.IDS_settings_firmware_upgrade_band_transfer_finish) + " " + UnitUtil.e(this.h, 2, 0));
        this.r = builderC.build();
        lsb.d().c(this.w, this.r);
    }

    private void e(String str, String str2) {
        LogUtil.a("SyncMusicManager", "notifyXiaomiMessage subText:", str2);
        String str3 = String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_music_adding_to_watch), str);
        Notification.Builder builderC = lsb.d().c();
        builderC.setContentIntent(ac());
        builderC.setWhen(System.currentTimeMillis());
        builderC.setShowWhen(true);
        builderC.setOnlyAlertOnce(true);
        builderC.setOngoing(true);
        String strE = UnitUtil.e(this.h, 2, 0);
        builderC.setContentTitle(str3);
        builderC.setContentText(strE);
        builderC.setSubText(str2);
        builderC.setSmallIcon(R.mipmap.healthlogo_hw_show_app);
        builderC.setProgress(100, this.h, false);
        this.r = builderC.build();
        lsb.d().c(this.w, this.r);
    }

    private void aj() {
        if (af()) {
            Notification.Builder builderC = lsb.d().c();
            builderC.setContentIntent(ac());
            if (Build.VERSION.SDK_INT == 36) {
                builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
            } else {
                builderC.setSmallIcon(R.mipmap.healthlogo_hw_show_app);
            }
            builderC.setOngoing(true);
            builderC.setCustomContentView(this.x);
            builderC.setCustomBigContentView(this.x);
            this.r = builderC.build();
            lsb.d().c(this.w, this.r);
            return;
        }
        if (this.v == null || !af()) {
            return;
        }
        this.v.notify(this.w, this.r);
    }

    private void x() {
        LogUtil.a("SyncMusicManager", "mToBeTransferMusicList size:", Integer.valueOf(this.ab.size()), " , mFailedTransferMusicList size:", Integer.valueOf(this.o.size()));
        this.o.removeAll(this.ab);
        this.o.addAll(this.ab);
        LogUtil.a("SyncMusicManager", "mFailedTransferMusicList size:", Integer.valueOf(this.o.size()));
        w();
        al();
        e(false);
    }

    private void y() {
        LogUtil.a("SyncMusicManager", "endSyncMusicTaskWhenDeviceTimeout enter, the sync music task is end!");
        x();
        if (this.p) {
            ar();
        }
        this.p = true;
    }

    private void v() throws Throwable {
        LogUtil.a("SyncMusicManager", "endSyncMusicTaskNoSpace enter!");
        w();
        ab();
        an();
        e(false);
        if (this.p) {
            ar();
        }
        this.p = true;
    }

    private void d(ArrayList<MusicSong> arrayList, IBaseCallback iBaseCallback) {
        LogUtil.a("SyncMusicManager", "readyToStartSyncTask enter:");
        if (arrayList == null || iBaseCallback == null) {
            LogUtil.a("SyncMusicManager", "readyToStartSyncTask params error!");
            return;
        }
        try {
            if (this.s) {
                iBaseCallback.onResponse(1, "has sync task already,please wait!");
                LogUtil.a("SyncMusicManager", "saveListMusicInfo failed!");
            } else {
                LogUtil.a("SyncMusicManager", "saveListMusicInfo succeed");
                iBaseCallback.onResponse(0, "");
                a(arrayList);
            }
        } catch (RemoteException unused) {
            LogUtil.a("SyncMusicManager", "saveListMusicInfo RemoteException");
        }
        this.p = false;
    }

    public void a(ArrayList<MusicSong> arrayList) {
        LogUtil.a("SyncMusicManager", "dealNewTransferTask enter");
        ah();
        this.ab.addAll(arrayList);
        this.y.addAll(arrayList);
        at();
        ThreadPoolManager.c().execute(new Runnable() { // from class: mah
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f41252c.r();
            }
        });
    }

    /* synthetic */ void r() throws Throwable {
        b(this.ab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        LogUtil.a("SyncMusicManager", "enter cancelXiMaLaYaTransferTask");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(ParsedFieldTag.ACTION_TYPE, "healthCancleTransfer");
            jSONObject.putOpt("deviceid", aa());
            IBaseCallback iBaseCallback = this.j.get(this.n.getFileName());
            if (iBaseCallback != null) {
                iBaseCallback.onResponse(204, jSONObject.toString());
            } else {
                LogUtil.j("SyncMusicManager", "cancelXiMaLaYaTransferTask, mAckToHwMusicCallback is null");
            }
        } catch (RemoteException | JSONException unused) {
            LogUtil.e("SyncMusicManager", "cancelXiMaLaYaTransferTask JSONException or RemoteException");
        }
        mhp mhpVar = new mhp();
        mhpVar.a(this.n.getFileName());
        mhpVar.c(2);
        mhpVar.e(TransferFileReqType.APP_STOP);
        mhpVar.d(null);
        lvb.e().b(TransferBusinessType.FIVE_FORTY, mhpVar, this.i);
        ax();
    }

    private void w() {
        this.s = false;
        SyncMusicBinder syncMusicBinder = this.g;
        if (syncMusicBinder != null) {
            syncMusicBinder.notifyUiIsSyncMusicTaskRunning();
        }
        e();
    }

    public void e() {
        SyncMusicBinder syncMusicBinder = this.g;
        if (syncMusicBinder != null) {
            syncMusicBinder.stopForeground();
        }
        boolean z = Looper.myLooper() == Looper.getMainLooper();
        LogUtil.a("SyncMusicManager", "cancelNotification. isOnUiThread:", Boolean.valueOf(z));
        if (z) {
            n();
        } else {
            HandlerExecutor.b(new Runnable() { // from class: mad
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41248a.n();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void n() {
        try {
            lsb.d().e(this.w);
        } catch (IllegalStateException unused) {
            LogUtil.e("SyncMusicManager", "delete health notification exception");
        }
    }

    private void ax() {
        for (MusicSong musicSong : this.ab) {
            if (musicSong.getMusicAppType() != 0) {
                d(musicSong);
            }
        }
        e();
        ah();
        this.s = false;
        LogUtil.a("SyncMusicManager", "updateAllStatusForCancel enter, mIsSyncMusicTaskRunning is false.");
        this.t = false;
        SyncMusicBinder syncMusicBinder = this.g;
        if (syncMusicBinder != null) {
            syncMusicBinder.notifyUiIsSyncMusicTaskRunning();
        }
        this.p = true;
    }

    private void ah() {
        this.y.clear();
        this.ab.clear();
        this.o.clear();
        this.l.clear();
        this.h = 0;
        this.n = new MusicSong();
        this.s = true;
        this.k = "1/1";
    }

    private void u() throws Throwable {
        String fileName;
        IBaseCallback iBaseCallback;
        LogUtil.a("SyncMusicManager", "dealTimeOutTask enter");
        try {
            for (MusicSong musicSong : this.ab) {
                if (musicSong.getMusicAppType() != 0 && (iBaseCallback = this.j.get((fileName = musicSong.getFileName()))) != null) {
                    iBaseCallback.onResponse(203, "");
                    LogUtil.a("SyncMusicManager", "sync task timeout, song:", fileName);
                }
            }
        } catch (RemoteException unused) {
            LogUtil.e("SyncMusicManager", "sync task timeout, RemoteException");
        }
        ab();
        this.o.addAll(this.ab);
        z();
    }

    private void au() {
        e(true);
        ap();
        String songName = this.n.getSongName();
        LogUtil.a("SyncMusicManager", "syncMusicsToDevice start, songName:", songName, ";size:", Long.valueOf(this.n.getSongSize()));
        a(songName);
        long sourceId = this.n.getMusicAppType() == 0 ? this.n.getSourceId() : -1L;
        mhp mhpVar = new mhp();
        mhpVar.a(this.n.getFileName());
        mhpVar.h(this.n.getSongFilePath());
        mhpVar.b(sourceId);
        mhpVar.c(2);
        mhpVar.e(TransferFileReqType.APP_DELIVERY);
        mhpVar.d(null);
        if (!TextUtils.isEmpty(this.n.getPackageName())) {
            mhpVar.j(this.n.getPackageName());
        }
        this.f41239c = false;
        this.f41238b = false;
        lvb.e().b(TransferBusinessType.FIVE_FORTY, mhpVar, this.z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str) {
        try {
            if (this.n.getMusicAppType() != 0) {
                ReleaseLogUtil.d("R_Music_SyncMusicManager", "responseToHwMusicSyncStatus enter. code:", Integer.valueOf(i), "; msg:", str);
                IBaseCallback iBaseCallback = this.j.get(this.n.getFileName());
                if (iBaseCallback == null) {
                    ReleaseLogUtil.d("R_Music_SyncMusicManager", "onFileTransferState, mAckToHwMusicCallback is null");
                } else {
                    iBaseCallback.onResponse(i, str);
                }
            }
        } catch (RemoteException unused) {
            ReleaseLogUtil.a("R_Music_SyncMusicManager", "refreshProgressByResult to hwmusic RemoteException");
        }
    }

    private boolean ai() throws Throwable {
        this.t = true;
        boolean z = true;
        int i = 0;
        while (this.t) {
            boolean zAg = ag();
            if (i >= 60 || (!zAg && this.t)) {
                this.t = false;
                LogUtil.a("SyncMusicManager", "find available file timeout!findTimes:", Integer.valueOf(i));
                z = false;
            }
            i++;
            if (this.t) {
                try {
                    Thread.sleep(1000L);
                    LogUtil.a("SyncMusicManager", "sleep times:", Integer.valueOf(i));
                } catch (InterruptedException unused) {
                    LogUtil.a("SyncMusicManager", "waitting failed");
                    z = false;
                }
                LogUtil.a("SyncMusicManager", "waitting for next find file");
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[PHI: r2
      0x0053: PHI (r2v6 boolean) = (r2v1 boolean), (r2v8 boolean) binds: [B:17:0x0051, B:12:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[PHI: r2
      0x0055: PHI (r2v4 boolean) = (r2v1 boolean), (r2v1 boolean), (r2v8 boolean), (r2v8 boolean) binds: [B:15:0x004b, B:17:0x0051, B:11:0x0042, B:12:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    private boolean ag() throws Throwable {
        boolean z;
        boolean zE = true;
        for (MusicSong musicSong : this.ab) {
            if (musicSong.getSongFilePath() == null) {
                LogUtil.j("SyncMusicManager", "isSupportSync, song file path is null.");
            } else {
                File file = new File(musicSong.getSongFilePath());
                if (musicSong.getMusicAppType() == 0) {
                    zE = lzt.d().e(musicSong);
                    if (file.exists() && zE) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (!file.exists() || musicSong.getOnLineMusicCompletedFlag() == 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.n = musicSong;
                    this.t = false;
                    LogUtil.a("SyncMusicManager", "find available file succeed");
                    break;
                }
            }
        }
        return zE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str) throws Throwable {
        this.n.setSyncFailedErrorCode(i);
        switch (i) {
            case 109022:
                if (str != null && str.equals(this.q)) {
                    y();
                    LogUtil.a("SyncMusicManager", "OTA is running, stop sync music to device");
                    break;
                }
                break;
            case 140004:
                d(i, "songs nums limit");
                this.o.addAll(this.ab);
                v();
                break;
            case 140008:
                d(0, "device has same song");
                this.l.add(this.n);
                aw();
                break;
            case 141000:
                y();
                d(202, "");
                xjt.w("transfer file timeout");
                break;
            case 141001:
                x();
                d(201, "");
                break;
            default:
                this.o.add(this.n);
                d(1, "");
                aw();
                xjt.w("music transfer file failed, error: " + i);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aw() {
        this.ab.remove(this.n);
        if (this.n.getMusicAppType() != 0) {
            d(this.n);
        }
        if (this.ab.size() != 0) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mab
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f41246b.p();
                }
            });
            return;
        }
        LogUtil.a("SyncMusicManager", "sync all musics finished! mFailedTransferedMusicList size:", Integer.valueOf(this.o.size()));
        z();
        this.r = null;
        this.v = null;
    }

    /* synthetic */ void p() throws Throwable {
        b(this.ab);
    }

    private void z() {
        LogUtil.a("SyncMusicManager", "endSyncMusicTaskWhenNormalFinish enter, the sync music task is end!");
        w();
        ak();
        if (this.p) {
            ar();
        }
        this.p = true;
        e(false);
    }

    private void b(CopyOnWriteArrayList<MusicSong> copyOnWriteArrayList) throws Throwable {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            LogUtil.a("SyncMusicManager", "syncMusicsToDevice musicList is null");
            return;
        }
        LogUtil.a("SyncMusicManager", "totalMusicFile: ", Integer.valueOf(copyOnWriteArrayList.size()), ",currentMusicFileSize: ", Long.valueOf(copyOnWriteArrayList.get(0).getSongSize()));
        if (copyOnWriteArrayList.get(0).getMusicAppType() == 2) {
            this.n = copyOnWriteArrayList.get(0);
        }
        SyncMusicBinder syncMusicBinder = this.g;
        if (syncMusicBinder != null) {
            syncMusicBinder.notifyUiIsSyncMusicTaskRunning();
        }
        LogUtil.a("SyncMusicManager", "mToBeTransferedMusicList size is ", Integer.valueOf(this.ab.size()));
        if (ai()) {
            if (this.e) {
                s();
                ReleaseLogUtil.d("R_Music_SyncMusicManager", "syncMusicsToDevice stop SyncCurrentMusicToDevice ");
                return;
            } else {
                au();
                return;
            }
        }
        LogUtil.a("SyncMusicManager", "find available file timeout! Task end, mToBeTransferedMusicList size:", Integer.valueOf(this.ab.size()));
        u();
    }

    private void d(MusicSong musicSong) {
        if (musicSong == null) {
            return;
        }
        String songFilePath = musicSong.getSongFilePath();
        LogUtil.a("SyncMusicManager", "deleteTempMusicFile:", songFilePath);
        File file = new File(songFilePath);
        if (!file.exists()) {
            LogUtil.a("SyncMusicManager", "no delete file:");
            return;
        }
        try {
            if (file.delete()) {
                LogUtil.a("SyncMusicManager", "delete success");
            } else {
                LogUtil.a("SyncMusicManager", "delete fail");
            }
            LogUtil.a("SyncMusicManager", "delete temp music file:", musicSong.getFileName());
        } catch (SecurityException unused) {
            LogUtil.e("SyncMusicManager", "SecurityException");
        }
    }

    private boolean af() {
        if (CommonUtil.bg() || NotificationManagerCompat.from(BaseApplication.getContext()).areNotificationsEnabled()) {
            return true;
        }
        LogUtil.j("SyncMusicManager", "notifyMsg notification bar permission is not enabled.");
        return false;
    }

    private boolean ae() {
        String lowerCase = Build.BRAND.toLowerCase(Locale.ENGLISH);
        String lowerCase2 = Build.MODEL.toLowerCase(Locale.ENGLISH);
        String lowerCase3 = Build.PRODUCT.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.contains("redmi")) {
            return false;
        }
        if (!"22081212c".equals(lowerCase2) && !"diting".equals(lowerCase3)) {
            return false;
        }
        LogUtil.a("SyncMusicManager", "redmi k5");
        return true;
    }
}
