package com.huami.watch.transport.httpsupport.transporter.server;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
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
import com.huami.watch.transport.httpsupport.AlarmDriver;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.StageFright.Command;
import com.huami.watch.transport.httpsupport.autotrigger.AutoTransTriggerTransporter;
import com.huami.watch.transport.httpsupport.autotrigger.WifiTransAutomaticAlarm;
import com.huami.watch.transport.httpsupport.autotrigger.baseautoalarm.AutoAlarmManager;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.huami.watch.transport.httpsupport.client.Constants;
import com.huami.watch.transport.httpsupport.control.service.HttpTransportManager;
import com.huami.watch.transport.httpsupport.global.ConnectionReceiver;
import com.huami.watch.transport.httpsupport.global.GlobalDataSyncKicker;
import com.huami.watch.transport.httpsupport.global.SyncNodeSwitcher;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.huami.watch.transport.httpsupport.model.DataUtils;
import com.huami.watch.transport.httpsupport.translogutils.DataParser;
import com.huami.watch.transport.httpsupport.translogutils.TransLogs;
import com.huami.watch.transport.httpsupport.transporter.file.Const;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class DuplexDataExchangeService extends Service {
    private static Exchangee n;
    private static ConcurrentHashMap<String, Messenger> o;
    private int f;
    private PendingIntent h;
    private HandlerThread j;
    private long m = 0;
    private int l = 0;
    private int k = 0;
    private int d = 0;
    private int c = 0;
    private int a = 0;
    private int b = 0;
    private Handler i = null;
    private Messenger g = null;
    private Context e = null;

    public static abstract class Exchangee {
        private Context a;

        public Exchangee(Context context) {
            this.a = context;
        }

        private void a(Context context, DataItem dataItem) {
            if (this.a == null) {
                return;
            }
            if (GlobalDefine.DEBUG_BLT) {
                Log.i(GlobalDefine.TAG_BLT, "[SRV]----> 助手触发数据上传 ====> " + dataItem);
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "[SRV]----> 助手触发数据上传 ====> " + dataItem);
            context.sendBroadcast(new Intent(ConnectionReceiver.ACTION_CALL_OF_DUTY));
            GlobalDataSyncKicker.getInstance().kick(context, 125);
        }

        private void b(DataItem dataItem, String str) {
            if (TextUtils.isEmpty(str)) {
                if (GlobalDefine.DEBUG_SERVER) {
                    Log.i(GlobalDefine.TAG_SRV, "扔掉了 ！Drop for : " + str);
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "扔掉了 ！Drop for : " + str);
                return;
            }
            dataItem.setOwner(str);
            sendToClient(dataItem);
            if (GlobalDefine.DEBUG_SERVER) {
                Log.i(GlobalDefine.TAG_SRV, "Duplex exchange 继续下报 ---> " + dataItem.getOwner() + " , " + dataItem.getAction());
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "Duplex exchange 继续下报 ---> " + dataItem.getOwner() + " , " + dataItem.getAction());
        }

        public boolean dispatchToAllClient(DataItem dataItem) {
            if (!Command.isInternal(dataItem.getAction())) {
                if (GlobalDefine.DEBUG_SERVER) {
                    Log.i(GlobalDefine.TAG_SRV, "NOT internal action for : " + dataItem);
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "NOT internal action for : " + dataItem);
                return false;
            }
            if (DuplexDataExchangeService.o == null) {
                if (GlobalDefine.DEBUG_SERVER) {
                    Log.i(GlobalDefine.TAG_SRV, "Service 内部map是空的。。。。！");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "Service 内部map是空的。。。。！");
                return false;
            }
            String owner = dataItem.getOwner();
            if (TextUtils.isEmpty(dataItem.getExtraValByKey("target"))) {
                owner = "*";
            }
            if (TextUtils.isEmpty(owner)) {
                owner = "*";
            }
            if (TextUtils.equals("*", owner)) {
                try {
                    Iterator it2 = DuplexDataExchangeService.o.keySet().iterator();
                    while (it2.hasNext()) {
                        b(dataItem, (String) it2.next());
                    }
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    if (GlobalDefine.DEBUG_SERVER) {
                        Log.i(GlobalDefine.TAG_SRV, "Failed to dispatch for : " + dataItem, e);
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "Failed to dispatch for : " + dataItem, e);
                    return false;
                }
            }
            Set setKeySet = DuplexDataExchangeService.o.keySet();
            if (setKeySet != null && setKeySet.contains(owner)) {
                try {
                    b(dataItem, owner);
                    return true;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return false;
                }
            }
            if (GlobalDefine.DEBUG_SERVER) {
                Log.i(GlobalDefine.TAG_SRV, "Failed to dispatch for : " + owner + " , NOT FOUND PKG. ACTION IS: " + dataItem.getExtraValByKey("who"));
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "Failed to dispatch for : " + owner + " , NOT FOUND PKG. ACTION IS: " + dataItem.getExtraValByKey("who"));
            return false;
        }

        public boolean hasClient() {
            boolean z;
            synchronized (this) {
                z = (DuplexDataExchangeService.o == null || DuplexDataExchangeService.o.isEmpty()) ? false : true;
            }
            return z;
        }

        public abstract void onDataFromClient(String str);

        public abstract void query(String str);

        public boolean sendToClient(DataItem dataItem) {
            if (dataItem == null) {
                return true;
            }
            Messenger messenger = (Messenger) DuplexDataExchangeService.o.get(dataItem.getOwner());
            TransLogs.i(new DataParser(dataItem, 2).getImportanceInfo());
            if (messenger == null) {
                if (GlobalDefine.DEBUG_BLT) {
                    Log.i(GlobalDefine.TAG_BLT, "sendToClient ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , 发现: 客户端不存在...通知并缓存到下次处理！");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "sendToClient ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , 发现客户端不存在...通知并####缓存####到下次处理！");
                return false;
            }
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putString(Constants.INNER_DATA_KEY_DATA, dataItem.toString());
            bundle.putString(Constants.INNER_DATA_KEY_UUID, dataItem.getIdentifier());
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            try {
                messenger.send(messageObtain);
                return true;
            } catch (Exception e) {
                if (!(e instanceof TransactionTooLargeException)) {
                    e.printStackTrace();
                    return false;
                }
                File file = new File(Const.FILE_PATH + File.separator + dataItem.getIdentifier());
                if (file.exists()) {
                    file.delete();
                }
                String strSaveToFileAndManage = DataUtils.saveToFileAndManage(dataItem.getIdentifier(), dataItem.getData());
                dataItem.setData(null);
                dataItem.addFlags(32768);
                dataItem.addExtraPair("d-path", strSaveToFileAndManage);
                bundle.putString(Constants.INNER_DATA_KEY_DATA, dataItem.toString());
                try {
                    messenger.send(messageObtain);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
                return true;
            }
        }
    }

    public interface OnTransStateChangeListener {
        void onStateChange(DataItem dataItem, int i);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GlobalDefine.DEBUG_SERVER) {
                Log.i(GlobalDefine.TAG_SRV, "<><><><><>发出 Service Ready..<><><><><>");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "<><><><><>Host Ready notify Service Ready..<><><><><>");
            DuplexDataExchangeService.this.e.sendBroadcast(new Intent(Constants.ON_WEAR_SERVICE_AVALIBLE));
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 2147483628) {
                String strL = DuplexDataExchangeService.this.l(message);
                DuplexDataExchangeService.this.k(strL);
                DuplexDataExchangeService.this.n(strL, 2000L);
                return;
            }
            Bundle data = message.getData();
            String string = data.getString(Constants.INNER_KEY_PKG);
            boolean z = GlobalDefine.DEBUG_SERVER;
            if (z) {
                Log.i(GlobalDefine.TAG_SRV, "===WearService 收到一个从: '" + string + "' 发来的请求<<<<<<<<");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "===WearService 收到一个从: '" + string + "' 发来的请求<<<<<<<<");
            if (!TextUtils.isEmpty(string)) {
                if (((Messenger) DuplexDataExchangeService.o.get(string)) == null) {
                    DuplexDataExchangeService.o.put(string, message.replyTo);
                }
                DuplexDataExchangeService.this.i(string, data);
                return;
            }
            if (z) {
                Log.i(GlobalDefine.TAG_SRV, "[DataService] ==> NO PKG !! IGNORE. " + message.getData());
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "[DataService] ==> NO PKG !! IGNORE. " + message.getData());
        }
    }

    public class c implements IBinder.DeathRecipient {
        public final /* synthetic */ String b;

        public c(String str) {
            this.b = str;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            if (GlobalDefine.DEBUG_SRV) {
                Log.i(GlobalDefine.TAG_SRV, "@@@@@@ 客户端  ' " + this.b + "' 挂掉了..Mapping...");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "@@@@@@ 客户端  ' " + this.b + "' 挂掉了..整理Mapp...");
            if (DuplexDataExchangeService.o != null) {
                DuplexDataExchangeService.o.remove(this.b);
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ String b;

        public d(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = GlobalDefine.DEBUG_SERVER;
            if (z) {
                Log.i(GlobalDefine.TAG_SRV, "===握手完毕，尝试检查client: '" + this.b + "' 是否有暂存在service端的请求...");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "====____===握手完毕，尝试检查client: '" + this.b + "' 是否有暂存在service端的请求...");
            DataCacher dataCacher = DataCacher.getInstance(DuplexDataExchangeService.this.e);
            if (dataCacher == null) {
                if (z) {
                    Log.i(GlobalDefine.TAG_SRV, "Cacher 竟然是 NULL？？？");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "Cacher 竟然是 NULL？？？");
                return;
            }
            List<DataItem> listQuery = dataCacher.query(2, 0);
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("该client: '");
                sb.append(this.b);
                sb.append("' 有 [ ");
                sb.append(listQuery == null ? 0 : listQuery.size());
                sb.append(" ] 个请求需要回传....");
                Log.i(GlobalDefine.TAG_SRV, sb.toString());
            }
            SolidLogger solidLogger = SolidLogger.getInstance();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("该client: '");
            sb2.append(this.b);
            sb2.append("' 有 [ ");
            sb2.append(listQuery == null ? 0 : listQuery.size());
            sb2.append(" ] 个请求需要回传....");
            solidLogger.with(GlobalDefine.TAG_SRV, sb2.toString());
            if (listQuery == null) {
                return;
            }
            for (DataItem dataItem : listQuery) {
                if (dataItem != null) {
                    boolean z2 = GlobalDefine.DEBUG_SERVER;
                    if (z2) {
                        Log.i(GlobalDefine.TAG_SRV, "尝试回传曾经缓存 的client: '" + this.b + "' 的请求返回 ： " + dataItem.getIdentifier() + " , " + dataItem.getAction());
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "尝试回传曾经缓存 的client: '" + this.b + "' 的请求返回 ： " + dataItem.getIdentifier() + " , " + dataItem.getAction());
                    if (DuplexDataExchangeService.n != null) {
                        dataItem.setState(0);
                        if (DuplexDataExchangeService.n.sendToClient(dataItem)) {
                            if (z2) {
                                Log.i(GlobalDefine.TAG_SRV, "client: '" + this.b + "' 的请求  " + dataItem.getIdentifier() + " , " + dataItem.getAction() + " , 尝试从数据库移除...");
                            }
                            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "client: '" + this.b + "' 的请求  " + dataItem.getIdentifier() + " , " + dataItem.getAction() + " , 尝试从数据库移除...");
                            boolean zDelete = dataCacher.delete(dataItem.getIdentifier());
                            if (z2) {
                                Log.i(GlobalDefine.TAG_SRV, "client: '" + this.b + "' 的请求  " + dataItem.getIdentifier() + " , " + dataItem.getAction() + " , 移除完毕 , 结果" + zDelete);
                            }
                            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "client: '" + this.b + "' 的请求  " + dataItem.getIdentifier() + " , " + dataItem.getAction() + " , 移除完毕 , 结果" + zDelete);
                        }
                    }
                }
            }
        }
    }

    private void h(int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str, Bundle bundle) {
        int i = bundle.getInt(Constants.INNER_KEY_SCHEDULE, -1);
        if (i == -1 || i != -101) {
            Exchangee exchangee = n;
            if (exchangee != null) {
                exchangee.onDataFromClient(bundle.getString(Constants.INNER_DATA_KEY_DATA));
                return;
            }
            return;
        }
        if (n != null) {
            n.query(bundle.getString(Constants.INNER_DATA_KEY_UUID));
        }
    }

    private void j() {
        synchronized (this) {
            ConcurrentHashMap<String, Messenger> concurrentHashMap = o;
            if (concurrentHashMap == null) {
                o = new ConcurrentHashMap<>();
            } else {
                concurrentHashMap.clear();
            }
            if (this.j == null) {
                HandlerThread handlerThread = new HandlerThread("wear-http-host-service");
                this.j = handlerThread;
                handlerThread.start();
                this.j.setPriority(10);
            }
            this.i = new b(this.j.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Messenger messenger = o.get(str);
        if (messenger != null) {
            try {
                messenger.getBinder().linkToDeath(new c(str), 0);
                return;
            } catch (RemoteException e) {
                e.printStackTrace();
                return;
            }
        }
        if (GlobalDefine.DEBUG_SERVER) {
            Log.i(GlobalDefine.TAG_SRV, "===没有信使于link death with: '" + str + "' .");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "===没有信使于link death with: '" + str + "' .");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String l(Message message) {
        String string = message.getData().getString(Constants.INNER_KEY_PKG);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        boolean z = GlobalDefine.DEBUG_SERVER;
        if (z) {
            Log.i(GlobalDefine.TAG_SRV, "client: '" + string + "' 请求握手...");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "client: '" + string + "' 请求握手...");
        Messenger messenger = message.replyTo;
        if (messenger == null || o.contains(messenger)) {
            return null;
        }
        o.put(string, messenger);
        if (z) {
            Log.i(GlobalDefine.TAG_SRV, "client: '" + string + "' >>>>> 握手成功.");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "client: '" + string + "' >>>>> 握手成功.");
        return string;
    }

    private void m() {
        this.m = System.currentTimeMillis();
        onDestroy();
        SyncNodeSwitcher.self().changeTo(0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.i.postDelayed(new d(str), j);
    }

    public static void setExchangee(Exchangee exchangee) {
        if (exchangee == null) {
            return;
        }
        n = exchangee;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.i == null) {
            j();
        }
        if (this.g == null) {
            this.g = new Messenger(this.i);
        }
        return this.g.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m();
        Context applicationContext = getApplicationContext();
        this.e = applicationContext;
        SolidLogger.withContext(applicationContext);
        HttpTransportManager.doInit(this.e);
        this.h = AlarmDriver.startAlarmDriver(this, GlobalDefine.INTERNAL_ALARM_FOR_WEAR_SERVICE);
        Log.i(GlobalDefine.TAG_SRV, "-------------- Init Http-Support API -------ver 1.09.4 ---------");
        SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "-------------- Init Http-Support API -------ver 1.10 ---------");
        WifiTransAutomaticAlarm wifiTransAutomaticAlarm = new WifiTransAutomaticAlarm(this);
        AutoAlarmManager.getInstance(this).addAutoAlarms(wifiTransAutomaticAlarm.getName(), wifiTransAutomaticAlarm.getAutoAlarmList());
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        AlarmDriver.cancelAlarmDriver(this, this.h);
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(0);
            this.i = null;
        }
        HandlerThread handlerThread = this.j;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.j = null;
        }
        ConcurrentHashMap<String, Messenger> concurrentHashMap = o;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
            o = null;
        }
        DataCacher.cleanUp();
        SyncNodeSwitcher.self().destory();
        AutoTransTriggerTransporter.getInstance(this).clear();
        AutoAlarmManager.getInstance(this).clearAll();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        if (this.i == null) {
            j();
        }
        this.i.postDelayed(new a(), 388L);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
