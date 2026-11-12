package com.huami.watch.transport.httpsupport.client;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.StageFright.Command;
import com.huami.watch.transport.httpsupport.StageFright.EnumCollector;
import com.huami.watch.transport.httpsupport.StageFright.ReportListInfo;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.huami.watch.transport.httpsupport.model.DataUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
class WearHttpClient {
    private Context c;
    public EnumCollector d;
    private OnServiceStateChangeListener f;
    private Messenger h;
    private Messenger i;
    private Handler j;
    private HandlerThread k;
    private OnCustomCommandListener l;
    private OnQueryCommandListener m;
    private AtomicBoolean a = new AtomicBoolean(false);
    private ServiceConnection g = null;
    private ComponentName b = null;
    private BroadcastReceiver e = new a();

    public interface OnCustomCommandListener {
        void onCustomCommand(DataItem dataItem);
    }

    public interface OnQueryCommandListener {
        void onQueryCommand(DataItem dataItem);
    }

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (Constants.ON_WEAR_SERVICE_AVALIBLE.equalsIgnoreCase(intent.getAction())) {
                WearHttpClient.this.C();
            }
        }
    }

    public class b extends EnumCollector {
        public b() {
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void data2Lower(DataItem dataItem, EnumCollector.OnReportResultListener onReportResultListener) {
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void data2Upper(DataItem dataItem, EnumCollector.OnReportResultListener onReportResultListener) {
            String packageName = WearHttpClient.this.c.getPackageName();
            dataItem.setOwner(packageName);
            onReportResultListener.onReportResult(WearHttpClient.this.p(packageName, dataItem));
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void dataLocal2Upper(DataItem dataItem) {
            DataCacher dataCacher = DataCacher.getInstance(WearHttpClient.this.c);
            ReportListInfo reportListInfo = new ReportListInfo();
            List<DataItem> listQuery = dataCacher.query(8, 0);
            if (listQuery != null) {
                Iterator<DataItem> it2 = listQuery.iterator();
                while (it2.hasNext()) {
                    reportListInfo.addItem(0, it2.next());
                }
            }
            dataItem.addExtraPair("report-list", reportListInfo.flatten());
            dataItem.setOwner(WearHttpClient.this.c.getPackageName());
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void onCustomCommand(DataItem dataItem) {
            boolean z;
            if (TextUtils.equals(dataItem.getAction(), Command.DATA_SYNC_TRIGGER)) {
                if (TextUtils.isEmpty(dataItem.getExtraValByKey("new-sync"))) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "-------------感觉对方是个“旧的”助手");
                    z = false;
                } else {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "-------------感觉对方是个“新的”助手");
                    z = true;
                }
                GlobalDefine.saveSyncSupport(z);
            }
            if (WearHttpClient.this.l != null) {
                WearHttpClient.this.l.onCustomCommand(dataItem);
            }
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void onQueryCommandArrival(DataItem dataItem) {
            super.onQueryCommandArrival(dataItem);
            if (WearHttpClient.this.m != null) {
                WearHttpClient.this.m.onQueryCommand(dataItem);
            }
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void triggerPoorEnergy(DataItem dataItem) {
            super.triggerPoorEnergy(dataItem);
            WearHttpClient.this.D();
            WearHttpClient.this.B(dataItem);
        }
    }

    public class c implements ServiceConnection {

        public class a implements IBinder.DeathRecipient {
            public a() {
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                if (GlobalDefine.DEBUG_CLIENT) {
                    Log.i(GlobalDefine.TAG_CLIENT, "[CLIENT] ==>  HOST DEAD!");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_CLIENT, "[CLIENT] ==>  HOST DEAD!");
                if (WearHttpClient.this.f != null) {
                    WearHttpClient.this.f.onServiceOffline();
                }
                WearHttpClient.this.x();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                WearHttpClient.this.x();
            }
        }

        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            WearHttpClient.this.g = this;
            WearHttpClient.this.h = new Messenger(iBinder);
            try {
                WearHttpClient.this.h.getBinder().linkToDeath(new a(), 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            if (WearHttpClient.this.f != null) {
                WearHttpClient.this.f.onServiceOnline();
            }
            WearHttpClient.this.a.set(true);
            WearHttpClient.this.t();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (GlobalDefine.DEBUG_CLIENT) {
                Log.i(GlobalDefine.TAG_CLIENT, "[CLIENT] ==> CLIENT onServiceDisconnected : [" + WearHttpClient.this.c.getPackageName() + "] DISCONNECT with host.");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_CLIENT, "[CLIENT] ==> CLIENT onServiceDisconnected : [" + WearHttpClient.this.c.getPackageName() + "] DISCONNECT with host.");
            WearHttpClient.this.a.set(false);
            WearHttpClient.this.j.post(new b());
        }
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (GlobalDefine.DEBUG_CLIENT) {
                Log.i(GlobalDefine.TAG_CLIENT, "client '" + WearHttpClient.this.c.getPackageName() + "' received msg !" + message);
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_CLIENT, "client '" + WearHttpClient.this.c.getPackageName() + "' received msg !" + message);
            WearHttpClient.this.w(message);
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ DataItem b;

        public e(DataItem dataItem) {
            this.b = dataItem;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GlobalDefine.DEBUG_CLIENT) {
                Log.i(GlobalDefine.TAG_CLIENT, "CACHED in Client :" + this.b.getIdentifier());
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_CLIENT, "CACHED in Client :" + this.b.getIdentifier());
            DataCacher dataCacher = DataCacher.getInstance(WearHttpClient.this.c);
            this.b.setState(8);
            dataCacher.save(this.b);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            List<DataItem> listQuery = DataCacher.getInstance(WearHttpClient.this.c).query(8, 0);
            if (GlobalDefine.DEBUG_CLIENT) {
                StringBuilder sb = new StringBuilder();
                sb.append("\t\t>>>>>cached client things will launch : ");
                sb.append(listQuery == null ? null : Integer.valueOf(listQuery.size()));
                Log.i(GlobalDefine.TAG_CLIENT, sb.toString());
            }
            SolidLogger solidLogger = SolidLogger.getInstance();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\t\t>>>>>cached client things will launch : ");
            sb2.append(listQuery != null ? Integer.valueOf(listQuery.size()) : null);
            solidLogger.with(GlobalDefine.TAG_CLIENT, sb2.toString());
            if (listQuery != null) {
                for (DataItem dataItem : listQuery) {
                    dataItem.setState(5);
                    WearHttpClient.this.p(dataItem.getOwner(), dataItem);
                }
                DataCacher.getInstance(WearHttpClient.this.c).deleteByState(8);
            }
        }
    }

    public WearHttpClient(Context context) {
        this.c = context;
        u();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constants.ON_WEAR_SERVICE_AVALIBLE);
        this.c.registerReceiver(this.e, intentFilter);
        r();
        C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        SolidLogger solidLogger;
        String str;
        boolean z = GlobalDefine.DEBUG_CLIENT;
        if (z) {
            Log.i(GlobalDefine.TAG_CLIENT, this.c.getPackageName() + " try to rebind host data service <><><><>");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_CLIENT, this.c.getPackageName() + " try to rebind host data service <><><><>");
        try {
            Intent intent = new Intent("com.huami.watch.transport.exchangee.HOST_SERVICE");
            intent.setPackage("com.huami.watch.wearservices");
            intent.putExtra(Constants.INNER_DATA_KEY_PREFIX, this.c.getPackageName());
            ComponentName componentNameStartService = this.c.startService(intent);
            this.b = componentNameStartService;
            if (componentNameStartService == null) {
                if (z) {
                    Log.i(GlobalDefine.TAG_CLIENT, "[CLIENT] ==>" + this.c.getPackageName() + "start service 失败");
                }
                solidLogger = SolidLogger.getInstance();
                str = "[CLIENT] ==>" + this.c.getPackageName() + "start service 失败";
            } else {
                if (z) {
                    Log.i(GlobalDefine.TAG_CLIENT, "[CLIENT] ==>" + this.c.getPackageName() + "start service 成功");
                }
                solidLogger = SolidLogger.getInstance();
                str = "[CLIENT] ==>" + this.c.getPackageName() + "start service 成功";
            }
            solidLogger.with(GlobalDefine.TAG_CLIENT, str);
            boolean zBindService = this.c.bindService(intent, s(), 8);
            if (z) {
                Log.i(GlobalDefine.TAG_CLIENT, "[CLIENT] ==> [" + this.c.getPackageName() + "] client bind service res================> : " + zBindService);
            }
            SolidLogger solidLogger2 = SolidLogger.getInstance();
            StringBuilder sb = new StringBuilder();
            sb.append("[CLIENT] ==> [");
            sb.append(this.c.getPackageName());
            sb.append("] client bind service res================> : ");
            sb.append(zBindService ? com.alipay.sdk.m.f0.c.p : "FAILED");
            solidLogger2.with(GlobalDefine.TAG_CLIENT, sb.toString());
        } catch (Exception e2) {
            if (GlobalDefine.DEBUG_CLIENT) {
                Log.i(GlobalDefine.TAG_CLIENT, "[CLIENT] ==> bind service failed : ", e2);
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_CLIENT, "[CLIENT]" + this.c.getPackageName() + " ==> bind service failed ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        synchronized (this) {
            Handler handler = this.j;
            if (handler == null) {
                return;
            }
            handler.post(new f());
        }
    }

    private void r() {
        b bVar = new b();
        this.d = bVar;
        bVar.setName("EC-WearHttpClient");
    }

    private ServiceConnection s() {
        c cVar;
        synchronized (this) {
            cVar = new c();
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        synchronized (this) {
            String packageName = this.c.getPackageName();
            if (GlobalDefine.DEBUG_CLIENT) {
                Log.i(GlobalDefine.TAG_CLIENT, "\t\t>>>>>> [client] '" + packageName + "' req hand shake ...");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_CLIENT, ">>>>>> [client] '" + packageName + "' req hand shake ...");
            Message messageObtain = Message.obtain();
            messageObtain.what = Constants.INNER_ACTION_HANDSHAKE;
            Bundle bundle = new Bundle();
            bundle.putString(Constants.INNER_KEY_PKG, packageName);
            messageObtain.setData(bundle);
            messageObtain.replyTo = this.i;
            try {
                this.h.send(messageObtain);
                D();
            } catch (RemoteException e2) {
                e2.printStackTrace();
                C();
            }
        }
    }

    private void u() {
        if (this.k == null) {
            HandlerThread handlerThread = new HandlerThread("wear-http-client-handler");
            this.k = handlerThread;
            handlerThread.start();
        }
        if (this.j == null) {
            this.j = new d(this.k.getLooper());
        }
        if (this.i == null) {
            this.i = new Messenger(this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Message message) {
        Bundle data = message.getData();
        if (data != null) {
            q(data.getString(Constants.INNER_DATA_KEY_DATA));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (GlobalDefine.DEBUG_CLIENT) {
            Log.i(GlobalDefine.TAG_CLIENT, "[CLIENT] ==> ##########REZYGOTE REMOTE############ :" + this.b);
        }
        try {
            if (this.b != null) {
                Intent intent = new Intent();
                intent.setComponent(this.b);
                this.c.stopService(intent);
            }
            this.c.unbindService(this.g);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        C();
    }

    public void A(OnServiceStateChangeListener onServiceStateChangeListener) {
        this.f = onServiceStateChangeListener;
    }

    public void B(DataItem dataItem) {
    }

    public void o() {
        Context context = this.c;
        if (context != null) {
            context.unregisterReceiver(this.e);
        }
    }

    public int p(String str, DataItem dataItem) {
        Message messageObtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.INNER_DATA_KEY_DATA, dataItem.toString());
        bundle.putString(Constants.INNER_KEY_PKG, str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.i;
        try {
            this.h.send(messageObtain);
            return 0;
        } catch (Exception e2) {
            if (!(e2 instanceof TransactionTooLargeException)) {
                e2.printStackTrace();
                C();
                this.j.post(new e(dataItem));
                return 0;
            }
            dataItem.addFlags(32768);
            dataItem.addExtraPair("d-path", DataUtils.saveToFileAndManage(dataItem.getIdentifier(), dataItem.getData()));
            dataItem.setData(null);
            bundle.putString(Constants.INNER_DATA_KEY_DATA, dataItem.toString());
            try {
                this.h.send(messageObtain);
                return 0;
            } catch (RemoteException e3) {
                e3.printStackTrace();
                return 0;
            }
        }
    }

    public void q(String str) {
        if (GlobalDefine.DEBUG_CLIENT) {
            Log.i(GlobalDefine.TAG_CLIENT, "'" + this.c.getPackageName() + "' received data from host! " + DataItem.from(str).toShortString());
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_CLIENT, "'" + this.c.getPackageName() + "' received data from host! " + DataItem.from(str).toShortString());
    }

    public int v(String str) {
        Message messageObtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.INNER_DATA_KEY_UUID, str);
        bundle.putInt(Constants.INNER_KEY_SCHEDULE, -101);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.i;
        try {
            this.h.send(messageObtain);
            return 0;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public void y(OnCustomCommandListener onCustomCommandListener) {
        this.l = onCustomCommandListener;
    }

    public void z(OnQueryCommandListener onQueryCommandListener) {
        this.m = onQueryCommandListener;
    }
}
