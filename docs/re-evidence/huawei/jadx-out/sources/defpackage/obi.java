package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.multisimsdk.attacheddevicemanager.common.IAttachedDeviceManagerCallback;
import com.huawei.multisimsdk.attacheddevicemanager.common.IServiceChangedListener;
import com.huawei.multisimsdk.multidevicemanager.R;
import com.huawei.multisimservice.IAttachedDeviceMultiSim;
import com.huawei.multisimservice.IServiceBinder;
import com.huawei.multisimservice.model.IAttachedDeviceMultiSimCallback;
import com.huawei.multisimservice.model.MultiSimDeviceInfo;
import com.huawei.multisimservice.model.SimInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class obi {
    private static final HashMap<obc, a> d = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayList<obc> f44044a = new ArrayList<>();
    private static final ArrayList<IServiceChangedListener> e = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f44045b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f44046c = new Object();
    private Context h = null;
    private HandlerThread i = null;
    private e l = null;
    private IServiceBinder f = null;
    private IAttachedDeviceMultiSim k = null;
    private String o = null;
    private boolean m = false;
    private IAttachedDeviceMultiSimCallback.Stub j = new IAttachedDeviceMultiSimCallback.Stub() { // from class: obi.2
        @Override // com.huawei.multisimservice.model.IAttachedDeviceMultiSimCallback
        public void getAttachedDeviceMultiSimInfo(MultiSimDeviceInfo multiSimDeviceInfo) throws RemoteException {
            ocq.e("AttachedDeviceManager", "Wear Service start to callback manager, getAttachDeviceMultiSimInfo.");
            Bundle bundle = new Bundle();
            if (multiSimDeviceInfo != null) {
                bundle.putParcelable("deviceSimInfo", multiSimDeviceInfo);
                ocq.a("AttachedDeviceManager", "Get attached device result code: " + multiSimDeviceInfo.getResultCode());
            } else {
                ocq.c("AttachedDeviceManager", "Wear service support device sim info with unknown type.");
                MultiSimDeviceInfo multiSimDeviceInfo2 = new MultiSimDeviceInfo();
                multiSimDeviceInfo2.setResultCode(-8);
                bundle.putParcelable("deviceSimInfo", multiSimDeviceInfo2);
            }
            obi obiVar = obi.this;
            obiVar.a(obiVar.l, 7, null, bundle);
        }

        @Override // com.huawei.multisimservice.model.IAttachedDeviceMultiSimCallback
        public void downloadESimProfile(int i, List<SimInfo> list) throws RemoteException {
            ocq.e("AttachedDeviceManager", "WearService start to callback AttachedDeviceManager, downloadESimProfile.");
            if (ocq.f44154c.booleanValue()) {
                ocq.e("AttachedDeviceManager", "Download result code=" + i + ", profileInfoList=" + list);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("resultCode", i);
            obi obiVar = obi.this;
            obiVar.a(obiVar.l, 5, list, bundle);
        }

        @Override // com.huawei.multisimservice.model.IAttachedDeviceMultiSimCallback
        public void deleteESimProfileNotify(int i) throws RemoteException {
            ocq.e("AttachedDeviceManager", "WearService start to callback AttachedDeviceManager, deleteESimProfileNotify.");
            Bundle bundle = new Bundle();
            bundle.putInt("resultCode", i);
            obi obiVar = obi.this;
            obiVar.a(obiVar.l, 1, null, bundle);
        }
    };
    private ServiceConnection n = new ServiceConnection() { // from class: obi.4
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ocq.e("AttachedDeviceManager", "Service is connected");
            if (!obi.this.e(componentName)) {
                ocq.c("AttachedDeviceManager", "Check service identity failed, unbind service.");
                obi.this.f();
                return;
            }
            obi.this.f = IServiceBinder.Stub.asInterface(iBinder);
            try {
                iBinder.linkToDeath(obi.this.g, 0);
                if (obi.this.f != null) {
                    obi obiVar = obi.this;
                    obiVar.k = IAttachedDeviceMultiSim.Stub.asInterface(obiVar.f.getServiceBinder("com.huawei.hwmultisim"));
                }
                if (obi.this.k != null) {
                    obi.this.k.registerCallback(obi.this.j);
                    int unused = obi.f44045b = 0;
                } else {
                    ocq.c("AttachedDeviceManager", "Service is null");
                }
            } catch (RemoteException unused2) {
                int unused3 = obi.f44045b = 1;
                ocq.c("AttachedDeviceManager", "ServiceConnected RemoteException occurred.");
            }
            obi.this.b(obi.f44045b);
            ocq.a("AttachedDeviceManager", "MultiSimService connected status is: " + obi.f44045b);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ocq.e("AttachedDeviceManager", "MultiSim Service disconnected.");
            if (obi.this.k != null) {
                try {
                    obi.this.k.unRegisterCallback(obi.this.j);
                } catch (RemoteException unused) {
                    ocq.c("AttachedDeviceManager", "UnRegisterCallback failed, remote exception occurred.");
                }
            } else {
                ocq.c("AttachedDeviceManager", "Service is null");
            }
            obi.this.k = null;
            int unused2 = obi.f44045b = 1;
            obi.this.b(obi.f44045b);
        }
    };
    private IBinder.DeathRecipient g = new IBinder.DeathRecipient() { // from class: obi.5
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            int unused = obi.f44045b = 1;
            ocq.c("AttachedDeviceManager", "MultiSimService binderDied.");
            if (obi.this.f != null) {
                obi.this.f.asBinder().unlinkToDeath(obi.this.g, 0);
                obi.this.k = null;
                obi.this.d();
            } else {
                ocq.c("AttachedDeviceManager", "Binder is null.");
                int unused2 = obi.f44045b = 2;
                obi.this.b(obi.f44045b);
            }
        }
    };

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final obi f44049a = new obi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Handler handler, int i, Object obj, Bundle bundle) {
        if (handler == null) {
            ocq.c("AttachedDeviceManager", "Send message failed, handler is null.");
            return;
        }
        Looper looper = handler.getLooper();
        if (looper == null) {
            ocq.c("AttachedDeviceManager", "Send message failed, looper is null.");
            return;
        }
        Thread thread = looper.getThread();
        if (thread == null) {
            ocq.c("AttachedDeviceManager", "Send message failed, thread is null.");
            return;
        }
        if (!thread.isAlive()) {
            ocq.c("AttachedDeviceManager", "Send message failed, the state of the thread is not alive.");
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i;
        messageObtainMessage.setData(bundle);
        if (obj != null) {
            messageObtainMessage.obj = obj;
        }
        handler.sendMessage(messageObtainMessage);
    }

    public static obi c() {
        obi obiVar;
        synchronized (f44046c) {
            obiVar = c.f44049a;
        }
        return obiVar;
    }

    public int b(Context context) {
        ocq.e("AttachedDeviceManager", "AttachedDeviceManager init");
        if (context == null) {
            ocq.c("AttachedDeviceManager", "AttachedDeviceManager init failed, context is null.");
            return -1;
        }
        this.h = context.getApplicationContext();
        this.o = context.getPackageName();
        if (this.i == null) {
            HandlerThread handlerThread = new HandlerThread("AttachedDeviceManager");
            this.i = handlerThread;
            handlerThread.start();
        }
        if (this.l == null) {
            this.l = new e(this.i.getLooper());
        }
        return d();
    }

    public void j() {
        ocq.e("AttachedDeviceManager", "AttachedDeviceManager is finished");
        f();
        this.h = null;
        this.o = null;
        this.l = null;
        HandlerThread handlerThread = this.i;
        if (handlerThread != null) {
            handlerThread.quit();
            this.i = null;
        }
        HashMap<obc, a> map = d;
        synchronized (map) {
            map.clear();
        }
        ArrayList<obc> arrayList = f44044a;
        synchronized (arrayList) {
            arrayList.clear();
        }
        ArrayList<IServiceChangedListener> arrayList2 = e;
        synchronized (arrayList2) {
            arrayList2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        HashMap map;
        if (message == null) {
            ocq.c("AttachedDeviceManager", "Handle download profile callback failed, msg is null");
            return;
        }
        Bundle data = message.getData();
        ArrayList arrayList = (ArrayList) message.obj;
        HashMap<obc, a> map2 = d;
        synchronized (map2) {
            map = (HashMap) map2.clone();
        }
        if (map == null) {
            ocq.a("AttachedDeviceManager", "Handle download profile callback failed, CommonCallbacks is null.");
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getValue();
            if (2 == ((obc) entry.getKey()).c()) {
                ocq.a("AttachedDeviceManager", "Handle download profile callback, MSG_DOWNLOAD_PROFILE: get attached device multi-sim info.");
                a(aVar, 5, arrayList, data);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        HashMap map;
        if (message == null) {
            ocq.c("AttachedDeviceManager", "Handle delete profile callback, msg is null");
            return;
        }
        Bundle data = message.getData();
        HashMap<obc, a> map2 = d;
        synchronized (map2) {
            map = (HashMap) map2.clone();
        }
        if (map == null) {
            ocq.a("AttachedDeviceManager", "Handle delete profile callback, CommonCallbacks is null.");
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getValue();
            if (3 == ((obc) entry.getKey()).c()) {
                ocq.a("AttachedDeviceManager", "Handle delete profile callback, MSG_DELETE_PROFILE_CALLBACK: get attached device multi-sim info.");
                a(aVar, 1, null, data);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        HashMap map;
        if (message == null) {
            ocq.c("AttachedDeviceManager", "Handle get attached device multi-sim info failed, msg is null");
            return;
        }
        Bundle data = message.getData();
        HashMap<obc, a> map2 = d;
        synchronized (map2) {
            map = (HashMap) map2.clone();
        }
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getValue();
            if (((obc) entry.getKey()).c() == 0) {
                ocq.a("AttachedDeviceManager", "Handle get attached device multi-sim info, MSG_GET_DEVICE_INFO_CALLBACK: get attached device multi-sim info.");
                a(aVar, 7, null, data);
            } else if (1 == ((obc) entry.getKey()).c()) {
                ocq.a("AttachedDeviceManager", "Handle get attached device multi-sim info, MSG_IS_NEED_DOWNLOAD_PROFILE_CALLBACK: whether need download profile.");
                a(aVar, 3, null, data);
            }
        }
    }

    class e extends Handler {
        private e(Looper looper) {
            super(looper);
        }

        private void e(int i) {
            Message messageObtainMessage = obtainMessage();
            if (i == 0) {
                messageObtainMessage.what = 9;
                messageObtainMessage.arg1 = i;
                sendMessageDelayed(messageObtainMessage, 35000L);
            } else if (i == 4) {
                messageObtainMessage.what = 9;
                messageObtainMessage.arg1 = i;
                sendMessageDelayed(messageObtainMessage, 35000L);
            } else {
                if (i == 6) {
                    messageObtainMessage.what = 9;
                    messageObtainMessage.arg1 = i;
                    sendMessageDelayed(messageObtainMessage, 35000L);
                    return;
                }
                ocq.c("AttachedDeviceManager", "Can not find type to send over time message.");
            }
        }

        private void d(int i) {
            ocq.e("AttachedDeviceManager", "AttachedDeviceMgrHandler start to handle over time." + i + ", 6, intTime" + obi.this.m);
            if (i == 0) {
                b();
                return;
            }
            if (i == 4) {
                c();
            } else if (i != 6) {
                ocq.c("AttachedDeviceManager", "Handle Over Time ERROR.");
            } else {
                d();
            }
        }

        private void d() {
            if (obi.this.m) {
                return;
            }
            try {
                MultiSimDeviceInfo multiSimDeviceInfo = new MultiSimDeviceInfo();
                multiSimDeviceInfo.setResultCode(-4);
                obi.this.j.getAttachedDeviceMultiSimInfo(multiSimDeviceInfo);
            } catch (RemoteException unused) {
                ocq.c("AttachedDeviceManager", "Handle get multisim device info, remote exception occurred.");
            }
        }

        private void c() {
            try {
                obi.this.j.downloadESimProfile(-4, new ArrayList());
            } catch (RemoteException unused) {
                ocq.c("AttachedDeviceManager", "Handle download profile overtime, remote exception occurred.");
            }
        }

        private void b() {
            try {
                obi.this.j.deleteESimProfileNotify(-4);
            } catch (RemoteException unused) {
                ocq.c("AttachedDeviceManager", "Handle delete profile over time, remote exception has occurred.");
            }
        }

        private void a() {
            obi.this.m = false;
            if (!obi.this.l.hasMessages(6)) {
                e(6);
            }
            if (obi.this.k != null) {
                try {
                    obi.this.k.getAttachedDeviceMultiSimInfo();
                    return;
                } catch (RemoteException unused) {
                    ocq.c("AttachedDeviceManager", "Handle get multi-sim device info failed, remote exception has occurred.");
                    return;
                }
            }
            ocq.c("AttachedDeviceManager", "Handle get multi-sim device info failed, mService is null");
        }

        private void d(String str) {
            if (!obi.this.l.hasMessages(4)) {
                e(4);
            }
            if (obi.this.k != null) {
                try {
                    obi.this.k.downloadESimProfile(str);
                    return;
                } catch (RemoteException unused) {
                    ocq.c("AttachedDeviceManager", "Handle download profile failed, remote exception has occurred.");
                    return;
                }
            }
            ocq.c("AttachedDeviceManager", "Handle download profile failed, mService is null");
        }

        private void e(ArrayList<SimInfo> arrayList) {
            if (!obi.this.l.hasMessages(0)) {
                e(0);
            }
            if (obi.this.k != null) {
                try {
                    obi.this.k.deleteESimProfile(arrayList);
                    return;
                } catch (RemoteException unused) {
                    ocq.c("AttachedDeviceManager", "Handle delete profile failed, remote exception has occurred.");
                    return;
                }
            }
            ocq.c("AttachedDeviceManager", "Handle delete profile failed, mService is null");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ocq.e("AttachedDeviceManager", "Handle message msg.what: " + message.what);
            Bundle data = message.getData();
            if (data == null) {
                ocq.c("AttachedDeviceManager", "Handle message error, bundle is null");
                return;
            }
            int i = message.what;
            if (i == 0) {
                try {
                    ArrayList<SimInfo> parcelableArrayList = data.getParcelableArrayList("profileInfoList");
                    if (ocq.f44154c.booleanValue()) {
                        ocq.c("AttachedDeviceManager", "Delete profile info list: " + parcelableArrayList);
                    }
                    e(parcelableArrayList);
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    ocq.c("AttachedDeviceManager", "profileInfoList IndexOutOfBoundsException");
                    return;
                }
            }
            if (i == 1) {
                obi.this.b(message);
                return;
            }
            if (i == 4) {
                d(data.getString("activationCode"));
                return;
            }
            if (i == 5) {
                obi.this.d(message);
                return;
            }
            if (i == 6) {
                a();
                return;
            }
            if (i != 7) {
                if (i != 9) {
                    return;
                }
                d(message.arg1);
            } else {
                obi.this.m = true;
                removeMessages(9);
                obi.this.c(message);
            }
        }
    }

    class a extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            obh obhVarD;
            int i;
            ocq.e("AttachedDeviceManager", "AttachedDeviceMgrCallbackHandler handle message msg.what: " + message.what);
            Bundle data = message.getData();
            Object obj = message.obj;
            ArrayList<SimInfo> arrayList = new ArrayList<>();
            int i2 = message.what;
            if (i2 != 1) {
                i = 0;
                if (i2 == 5) {
                    if (obj instanceof ArrayList) {
                        ArrayList<SimInfo> arrayList2 = (ArrayList) obj;
                        if (arrayList2.size() > 0 && (arrayList2.get(0) instanceof SimInfo)) {
                            arrayList = arrayList2;
                        }
                    }
                    ocq.a("AttachedDeviceManager", "Manager handle MSG, download profile callback.");
                    obhVarD = d(data, arrayList);
                    i = 2;
                } else if (i2 == 7) {
                    ocq.a("AttachedDeviceManager", "Manager handle MSG, get device sim info callback.");
                    obhVarD = c(data);
                } else {
                    ocq.c("AttachedDeviceManager", "AttachedDeviceMgrCallbackHandler handle message error occurred.");
                    return;
                }
            } else {
                ocq.a("AttachedDeviceManager", "Manager handle MSG, delete profile callback.");
                obhVarD = d(data);
                i = 3;
            }
            ocq.a("AttachedDeviceManager", "AttachedDeviceMgrCallbackHandler type = " + i);
            synchronized (obi.d) {
                ocq.e("AttachedDeviceManager", "start to do onInfoBack, return the result to the caller.");
                for (Object obj2 : obi.d.keySet()) {
                    if (obj2 instanceof obc) {
                        obc obcVar = (obc) obj2;
                        if (i == obcVar.c()) {
                            d(obcVar, obhVarD);
                        }
                    }
                }
                ocq.e("AttachedDeviceManager", "handle complete, remove callback.");
                synchronized (obi.f44044a) {
                    for (obc obcVar2 : obi.f44044a) {
                        if (obi.d.containsKey(obcVar2)) {
                            obi.d.remove(obcVar2);
                        }
                    }
                    obi.f44044a.clear();
                }
            }
        }

        private void d(obc obcVar, obh obhVar) {
            ocq.e("AttachedDeviceManager", "Start to excute doCallback() function");
            if (obcVar == null || obhVar == null) {
                ocq.c("AttachedDeviceManager", "doCallback() excute failed, callback or commonResult is null.");
                return;
            }
            IAttachedDeviceManagerCallback iAttachedDeviceManagerCallbackE = obcVar.e();
            if (iAttachedDeviceManagerCallbackE == null) {
                ocq.c("AttachedDeviceManager", "doCallback() excute failed, attachedDeviceManagerCallback is null.");
                return;
            }
            iAttachedDeviceManagerCallbackE.onInfoBack(obcVar.c(), obhVar);
            synchronized (obi.f44044a) {
                obi.f44044a.add(obcVar);
            }
        }

        private obh c(Bundle bundle) {
            ocq.e("AttachedDeviceManager", "Start to get the commonResult for get device sim info");
            if (bundle == null) {
                ocq.c("AttachedDeviceManager", "GetCommonResultForGetAttachedDeviceSimInfo failed, bundle is null, RESULT_CODE_ERROR");
                bundle = new Bundle();
            }
            Parcelable parcelable = bundle.getParcelable("deviceSimInfo");
            if (parcelable instanceof MultiSimDeviceInfo) {
                return new obh(0, (MultiSimDeviceInfo) parcelable);
            }
            ocq.c("AttachedDeviceManager", "GetCommonResultForGetAttachedDeviceSimInfo error, can not change to MultiSimDeviceInfo.");
            MultiSimDeviceInfo multiSimDeviceInfo = new MultiSimDeviceInfo();
            multiSimDeviceInfo.setResultCode(-8);
            return new obh(0, multiSimDeviceInfo);
        }

        private obh d(Bundle bundle, ArrayList<SimInfo> arrayList) {
            ocq.e("AttachedDeviceManager", "Get commonResult for download profile");
            if (bundle == null) {
                ocq.c("AttachedDeviceManager", "GetCommonResultForDownloadProfile failed, bundle is null, RESULT_CODE_ERROR");
                bundle = new Bundle();
            }
            return new obh(2, bundle.getInt("resultCode"), arrayList);
        }

        private obh d(Bundle bundle) {
            ocq.e("AttachedDeviceManager", "Get commonResult for delete profile");
            if (bundle == null) {
                ocq.c("AttachedDeviceManager", "GetCommonResultForDeleteProfile failed, bundle is null, RESULT_CODE_ERROR");
                bundle = new Bundle();
            }
            return new obh(3, bundle.getInt("resultCode"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        ArrayList arrayList;
        ocq.a("AttachedDeviceManager", "Notify service connected status changed, service status = " + i);
        ArrayList<IServiceChangedListener> arrayList2 = e;
        synchronized (arrayList2) {
            arrayList = (ArrayList) arrayList2.clone();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            IServiceChangedListener iServiceChangedListener = (IServiceChangedListener) arrayList.get(i2);
            if (iServiceChangedListener != null) {
                iServiceChangedListener.onStatusChanged(i);
            }
        }
    }

    public int d() {
        ocq.e("AttachedDeviceManager", "Attempt to bindService: " + f44045b);
        if (this.h == null) {
            ocq.c("AttachedDeviceManager", "Attempt to bindService failed, context is null, can't bind service.");
            return -1;
        }
        if (f44045b != 0) {
            ocq.a("AttachedDeviceManager", "Service is not connected yet, re-bind service.");
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.huawei.health", "com.huawei.multisimservice.MultiSimService"));
            try {
                this.h.bindService(intent, this.n, 1);
            } catch (SecurityException unused) {
                ocq.c("AttachedDeviceManager", "Bind service exception occurred.");
                return -1;
            }
        }
        ocq.a("AttachedDeviceManager", "Bind service succeed.");
        return 0;
    }

    public int f() {
        ocq.e("AttachedDeviceManager", "Unbind service: " + f44045b);
        Context context = this.h;
        if (context == null) {
            ocq.c("AttachedDeviceManager", "Unbind service failed, can't unbind service.");
            return -1;
        }
        if (f44045b == 0) {
            try {
                context.unbindService(this.n);
                this.k = null;
                f44045b = 1;
            } catch (IllegalArgumentException unused) {
                ocq.c("AttachedDeviceManager", "Unbind service, IllegalArgumentException");
                return -1;
            }
        }
        b(f44045b);
        ocq.a("AttachedDeviceManager", "Unbind service succeed.");
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(ComponentName componentName) {
        if (componentName == null) {
            ocq.c("AttachedDeviceManager", "Check service identity failed, component name is null.");
            return false;
        }
        String packageName = componentName.getPackageName();
        boolean zEquals = "com.huawei.hwmultisim".equals(this.o);
        boolean zEquals2 = "com.huawei.bone".equals(packageName);
        boolean zEquals3 = "com.huawei.health".equals(packageName);
        ocq.a("AttachedDeviceManager", "SdkInHwMultiSim = " + zEquals + ", sdkPkgName = " + this.o + ", servicePkgName = " + packageName);
        if (!zEquals) {
            return c(packageName);
        }
        if (!zEquals2 && !zEquals3) {
            ocq.h("AttachedDeviceManager", "Check service identity failed: service Package name is not the same with hw wear app");
            return false;
        }
        Context context = this.h;
        if (context == null) {
            ocq.c("AttachedDeviceManager", "Check service identity failed: context is null");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        String string = this.h.getString(R.string.info_string_part_two);
        String string2 = this.h.getString(R.string.info_string_part_three);
        String strE = ocw.e("1310403;132b3b330313231313760115605033g353:1b;57;;5e43g32323636330353023a033:35306637352031707f02210323353066373;203:7446525f54575e5f54022103233530663734203:605;565f544b5;565f023e033g353066373b20357;465244565:022;0325353066373a203e6756415g5:5f525`705e5g43525f4:032f243g0207030002070301020203016b243g0707030003050301020203016b0353023a033:35306637352031707f02210323353066373;203:7446525f54575e5f54022103233530663734203:605;565f544b5;565f023e033g353066373b20357;465244565:022;0325353066373a203e6756415g5:5f525`705e5g43525f4:03;2:e033g353:1b;57;;5e43g323232363330;2;g3303;2;:31;2;233;`eea3a0a6707342`7:f25f21g14410gb;5:236g3g75:03b1a153:5ag6e;:e72`a1g;a0e`a2g34a;;eb6g0ef655g671g5gb0516:e43725b37b`5ff7g3125;`07f2gb;4ff07f2:1e27422;fe7ff43f1;7fe5:6g701ab40e16ff4;1ee4::14a7031e14:4f:3:f4e320fg750`17b07g;a:65f76gf41f`eef0gb:b4a23554e2fgb`43130323332033g353:1b;57;;5e43g323236363330;2;2337;a`:33f31176;b`11;012:4g;febae;0g6g:4f3:6;2:efeefe5:45624b35g655;75fa;ba67a2:;e7:02:6:356f`:f3;7a03bg6b5b76a5gfggbb34`13bg3b4`g:a14361:04e3f:a0042:02e:e7::;5506f6;42;eg`g:7:72f3fa6;1g1;2`ae7bg7eg;`2a:;5`715:e11534g44:ff`e;f466567;:2e7a57456b:56f1067:53;6003;", string, string2);
        if (zEquals3) {
            strE = ocw.e("137a603;130:gb330313231313:33e13765ba:57eb3e3033g353:1b;57;;5e43g323236363303;2:;023a033:35306637352031707f02210323353066373;203:7446525f54575e5f54022103233530663734203:605;565f544b5;565f023e033g353066373b20357;465244565:022;0325353066373a203e6756415g5:5f525`705e5g43525f4:022703213530663730203a725f57415e5:576756525g0213032f353:1b;57;;5e43g323:3225225g5e515:5`56735;465244565:1f505e5g032f243g02020306010603050203070:6b243g00050306020;03050203070:6b03;2:;023a033:35306637352031707f02210323353066373;203:7446525f54575e5f54022103233530663734203:605;565f544b5;565f023e033g353066373b20357;465244565:022;0325353066373a203e6756415g5:5f525`705e5g43525f4:022703213530663730203a725f57415e5:576756525g0213032f353:1b;57;;5e43g323:3225225g5e515:5`56735;465244565:1f505e5g03;13213033g353:1b;57;;5e43g323232363330;1323g3303;1323;31;1323233f31`6ba:4b1a0b;b6::5110`gf35a;1a1g7ee6a26`be56a;53g6`4b0g5;::6ba3;513aa46b11ef4540b;b2bab30f24a562g2e`7g6`agabf:f40fffbe6b2g7g1ea40f4333102f3ga1255g3e`6gg:4f436eg55675`:gb0;fg7feb1```gg10;bg01f0:;12171a32:6ge32g:a:4171gae13:fgb;f775f370177a;7f5ae`b4:g4aa0`2:17`gg17;fgag533fee;e40332b;:b7`550ga;:43f01;;a:702617`052f;60a;eb1:f37f52faf5eagag;4`gag0ffa74a314a6;62agfbb20b10e70:54b303f474fb701561`aa07eggf5237:ae6353`;20ea3f:0e5abg:g05e7g76622:6fb0aa7:f:132bb5ge:46bf25:f127:36gf164:g4``0`0fb`76:7a27b`2:g4f0:`6`154313230b0;1323303;2eg032g3530662g3f372537270f`5:3gf;22a`0:f62b03032bg10`e0335g54gf303;2`g3530662g1037;2`603;2`1;3270f`5:3gf;22a`0:f62b03032bg10`e0335g54gf3b2;2:fb7;2:a03;2:;023a033:35306637352031707f02210323353066373;203:7446525f54575e5f54022103233530663734203:605;565f544b5;565f023e033g353066373b20357;465244565:022;0325353066373a203e6756415g5:5f525`705e5g43525f4:022703213530663730203a725f57415e5:576756525g0213032f353:1b;57;;5e43g323:3225225g5e515:5`56735;465244565:1f505e5g;13:33e13765ba:57eb3e3033`3530662g20373603303232ee033g353:1b;57;;5e43g323236363330;13232335gbg1e`6:3`e334:b`7`f3;56b;;7022g`25bg;0146b1a3031736445gg2g2e437b1:::0`;b207b;gegg67`6:262b35266521gag033575fb`e`:e57eb`1f06143:a306:e465be:5`2e657:6037f411;4af74:;b3700065`a``gg;g64`gf2e4ee2`337`a:51bg6:6a2gb11fe137gf277:3;;52aab:5;f3`470;2f22:`441a1`e11`0g3`;016b:e02`:4;4a265`:7442be55e7eea2bg::5`0eaf457e0a`63a4b1570`10041521e163::75b30abgeaefb52e;f0g1;:100;6aa`33;46b`f`::a5g:1b`75;e3g`63`3::4ee73:f0b16g`;g:55`13g6;;b:420ee124f1gf7:764b01`e10ge2be6;e7a`gg:7b;e15a`2`:3`6b62;0ga57g75060gg752374;`44e1`;::;;03;", string, string2);
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 64);
            if (packageInfo.signatures == null) {
                ocq.h("AttachedDeviceManager", "check service identity failed: signature is null");
                return false;
            }
            for (Signature signature : packageInfo.signatures) {
                if (signature != null && signature.toCharsString().equals(strE)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            ocq.c("AttachedDeviceManager", "Get package info exception: NameNotFoundException.");
            return false;
        }
    }

    private boolean c(String str) {
        if (TextUtils.isEmpty(this.o)) {
            ocq.c("AttachedDeviceManager", "isSameSoftware mSdkPackageName is null");
            return false;
        }
        boolean zEquals = this.o.equals(str);
        ocq.e("AttachedDeviceManager", "isSameSoftware sdkServiceInSameApp：" + zEquals + ",mSdkPackageName：" + this.o + ",servicePkgName：" + str);
        return zEquals;
    }
}
