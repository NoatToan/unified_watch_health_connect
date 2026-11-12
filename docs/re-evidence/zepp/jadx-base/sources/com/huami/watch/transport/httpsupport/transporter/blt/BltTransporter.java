package com.huami.watch.transport.httpsupport.transporter.blt;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.StageFright.Command;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.huami.watch.transport.httpsupport.control.assist.WearHttpCompanion;
import com.huami.watch.transport.httpsupport.control.service.HttpTransportManager;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.huami.watch.transport.httpsupport.model.DataUtils;
import com.huami.watch.transport.httpsupport.translogutils.DataParser;
import com.huami.watch.transport.httpsupport.translogutils.TransLogs;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class BltTransporter implements Transporter.DataListener {
    public static final String ACTION_DEVICE_CONNECTION_CHANGED = "com.huami.watch.action.DEVICE_CONNECTION_CHANGED";
    public static final String ACTION_DEVICE_CONNECTION_CHANGED_IOS = "com.huami.watch.action.DEVICE_CONNECTION_CHANGED_IOS";
    public static final String ACTION_WATCH_CONNECT_WITH_COMPANION = "com.huami.watch.WATCH_CONNED_4_COMPANION";
    public static final String CONN_BLE_CTRL = "com.huami.watch.extra.conn.ctrl";
    public static final String EXTRA_DEVICE_CONNECTION_STATUS = "com.huami.watch.extra.DEVICE_CONNECTION_STATUS";
    public static boolean IS_BLE = false;
    public static final String KEY_DEVICE_BOND_TYPE = "com.huami.watch.key.DEVICE_BOND_TYPE";
    public static final int VALUE_DEVICE_BOND_TYPE_ANDROID = 1;
    public static final int VALUE_DEVICE_BOND_TYPE_IOS_BLE = 2;
    public static final int VALUE_DEVICE_BOND_TYPE_NONE = 0;
    private static long e = 15000;
    private static final long f = 40000;
    private static Handler g;
    private static HandlerThread h = new HandlerThread("http-support-timeout-monitor");
    private static ConcurrentHashMap<String, e> i = new ConcurrentHashMap<>();
    private Context c;
    private Transporter d = null;
    private Runnable b = new c();
    private Runnable a = new d();

    public interface IResultReceiver {
        void onResult(int i);
    }

    public class a implements Transporter.ChannelListener {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.ChannelListener
        public void onChannelChanged(boolean z) {
            if (!z || BltTransporter.this.c == null) {
                return;
            }
            Intent intent = new Intent();
            intent.setAction(BltTransporter.ACTION_WATCH_CONNECT_WITH_COMPANION);
            BltTransporter.this.c.sendBroadcast(intent);
        }
    }

    public class b implements Transporter.DataSendResultCallback {
        public final /* synthetic */ e b;
        public final /* synthetic */ DataItem c;
        public final /* synthetic */ IResultReceiver d;

        public b(DataItem dataItem, e eVar, IResultReceiver iResultReceiver) {
            this.c = dataItem;
            this.b = eVar;
            this.d = iResultReceiver;
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
            int resultCode = dataTransportResult.getResultCode();
            TransLogs.i(new DataParser(this.c, 1).bleSendResText(this.c, resultCode));
            if (this.b.b) {
                BltTransporter.g.removeCallbacks(this.b);
                if (GlobalDefine.DEBUG_BLT) {
                    Log.i(GlobalDefine.TAG_BLT, "callbackTrigger.onTheWay ON the way.....SHIT.....:" + this.c.getIdentifier());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "callbackTrigger.onTheWay ON the way.....SHIT.....:" + this.c.getIdentifier());
            } else {
                if (GlobalDefine.DEBUG_BLT) {
                    Log.i(GlobalDefine.TAG_BLT, "callbackTrigger.onTheWay NOT on the way:" + this.c.getIdentifier());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "callbackTrigger.onTheWay NOT on the way:" + this.c.getIdentifier());
                BltTransporter.g.removeCallbacks(this.b);
            }
            BltTransporter.this.e(this.c, resultCode, this.d);
            if (resultCode == 0) {
                BltTransporter.this.lookSideBlt();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GlobalDefine.DEBUG_BLT) {
                Log.i(GlobalDefine.TAG_BLT, "<WATCH>  LOOKSIDE LAUNCH#$%^&*$%^&++++++++++++++++++!");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "<WATCH>  LOOKSIDE LAUNCH#$%^&*$%^&++++++++++++++++++!");
            List<DataItem> listQuery = DataCacher.getInstance(BltTransporter.this.c).query(1, 0);
            if (listQuery == null || listQuery.size() <= 0) {
                return;
            }
            HttpTransportManager.getInstance(BltTransporter.this.c).tryProcessCachedRequestWhilePhoneAvalible(BltTransporter.this.c);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GlobalDefine.DEBUG_BLT) {
                Log.i(GlobalDefine.TAG_BLT, "<PHONE> --> LOOKSIDE LAUNCH#$%^&*$%^&++++++++++++++++++!");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "<PHONE> --> LOOKSIDE LAUNCH#$%^&*$%^&++++++++++++++++++!");
            List<DataItem> listQuery = DataCacher.getInstance(BltTransporter.this.c).query(3, 0);
            if (listQuery == null || listQuery.size() <= 0) {
                return;
            }
            WearHttpCompanion.getInstance().tryProcessCachedResponseWhileChannelAvalible();
        }
    }

    public class e implements Runnable {
        public DataItem a;
        public boolean b = false;
        public IResultReceiver c;

        public e(DataItem dataItem, IResultReceiver iResultReceiver) {
            this.a = dataItem;
            this.c = iResultReceiver;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.getIdentifier() == null) {
                return;
            }
            if (BltTransporter.i == null || BltTransporter.i.get(this.a.getIdentifier()) != null) {
                if (GlobalDefine.DEBUG_BLT) {
                    Log.i(GlobalDefine.TAG_BLT, "callbackTrigger deployed:" + this.a.getIdentifier());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "callbackTrigger deployed:" + this.a.getIdentifier());
                this.b = true;
                BltTransporter.this.e(this.a, -1, this.c);
                return;
            }
            if (GlobalDefine.DEBUG_BLT) {
                Log.i(GlobalDefine.TAG_BLT, "Not Found Time Out Trigger For:" + this.a.getIdentifier() + " . IGNORED.");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "Not Found Time Out Trigger For:" + this.a.getIdentifier() + " . IGNORED.");
        }
    }

    static {
        h.start();
        g = new Handler(h.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DataItem dataItem, int i2, IResultReceiver iResultReceiver) {
        synchronized (this) {
            if (dataItem.getIdentifier() == null) {
                return;
            }
            ConcurrentHashMap<String, e> concurrentHashMap = i;
            boolean z = (concurrentHashMap == null || concurrentHashMap.remove(dataItem.getIdentifier()) == null) ? false : true;
            if (GlobalDefine.DEBUG_BLT) {
                Log.i(GlobalDefine.TAG_BLT, "Data send result code rev ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , CODE： " + i2 + " , targetWho : " + dataItem.getIdentifier() + " , remove trigger res: " + z);
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "Data send result code rev ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , CODE： " + i2 + " , targetWho : " + dataItem.getIdentifier() + " , remove trigger res: " + z);
            if (iResultReceiver != null) {
                iResultReceiver.onResult(i2);
            }
        }
    }

    private boolean f(DataItem dataItem) {
        if (!Command.isInternal(dataItem.getAction())) {
            return false;
        }
        boolean z = GlobalDefine.DEBUG_SERIAL_MODE;
        if (z) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "==> Take as 内部命令: " + dataItem.toShortString());
        }
        if (!z) {
            return true;
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "==> Take as 内部命令: " + dataItem.toShortString());
        return true;
    }

    public boolean check() {
        if (this.d == null) {
            if (GlobalDefine.DEBUG_BLT) {
                Log.i(GlobalDefine.TAG_BLT, "Transporter is NULL!");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "Transporter is NULL!");
            return false;
        }
        Context context = this.c;
        if (context != null && GlobalDefine.IS_WATCH) {
            boolean z = Settings.System.getInt(context.getContentResolver(), "com.huami.watch.extra.DEVICE_CONNECTION_STATUS", 0) > 0 || Settings.System.getInt(this.c.getContentResolver(), "com.huami.watch.extra.conn.ctrl", 0) > 0;
            boolean z2 = GlobalDefine.DEBUG_BLT;
            if (z2) {
                Log.i(GlobalDefine.TAG_BLT, "\n\t\t\tSettings.System.getInt(mContext.getContentResolver(), CONN_BLE_CTRL, 0) = " + Settings.System.getInt(this.c.getContentResolver(), "com.huami.watch.extra.conn.ctrl", 0) + "\n");
            }
            if (!z) {
                if (z2) {
                    Log.i(GlobalDefine.TAG_BLT, "\n\t\t\t******  手表跟手机压根就没连接! ******\n");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "\n\t\t\t******  手表跟手机压根就没连接! ******\n");
                return false;
            }
        }
        if (this.d.isTransportServiceConnected()) {
            return true;
        }
        if (GlobalDefine.DEBUG_BLT) {
            Log.i(GlobalDefine.TAG_BLT, "Transporter service NOT connected!");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "Transporter service NOT connected!");
        return false;
    }

    public final boolean dataOut(DataItem dataItem, IResultReceiver iResultReceiver) {
        int iIntValue = 0;
        if (!check()) {
            if (GlobalDefine.IS_WATCH) {
                dataItem.setState(1);
            } else {
                dataItem.setState(3);
            }
            DataCacher.getInstance(this.c).save(dataItem);
            return false;
        }
        DataBundle dataBundleCreateDataItemToDataBundle = DataUtils.createDataItemToDataBundle(dataItem);
        if (Command.isInternal(dataItem.getAction())) {
            dataBundleCreateDataItemToDataBundle.putInt("priority", 3);
        } else {
            try {
                iIntValue = Integer.valueOf(dataItem.getExtraValByKey(com.google.android.exoplayer2.text.ttml.b.r)).intValue();
            } catch (Exception unused) {
            }
            dataBundleCreateDataItemToDataBundle.putInt("priority", iIntValue);
        }
        boolean z = GlobalDefine.DEBUG_BLT;
        if (z) {
            Log.i(GlobalDefine.TAG_BLT, "Sending ---> " + dataItem.getOwner() + " , " + dataItem.getAction());
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "Sending ---> " + dataItem.getOwner() + " , " + dataItem.getAction());
        e eVar = new e(dataItem, iResultReceiver);
        this.d.send(dataItem.getAction(), dataBundleCreateDataItemToDataBundle, new b(dataItem, eVar, iResultReceiver));
        if (!IS_BLE) {
            if (z) {
                Log.i(GlobalDefine.TAG_BLT, "WITH --- CALL BACK --- DELAY !FOR ANDROID.");
            }
            g.postDelayed(eVar, e);
            i.put(dataItem.getIdentifier(), eVar);
        }
        if (z) {
            Log.i(GlobalDefine.TAG_BLT, "After send ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , targetWho " + dataItem.getIdentifier());
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "After send ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , targetWho " + dataItem.getIdentifier());
        return true;
    }

    public Transporter getTransporter() {
        return this.d;
    }

    public void handleInnerCommand(DataItem dataItem) {
    }

    public boolean hasMark(DataItem dataItem) {
        synchronized (this) {
            if (dataItem.hasFlag(8192)) {
                if (GlobalDefine.DEBUG_BLT) {
                    Log.i(GlobalDefine.TAG_BLT, "FLAG_DATA_SYNC_FLOW 放行 ---> " + dataItem.getOwner() + " , " + dataItem.getIdentifier());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "FLAG_DATA_SYNC_FLOW 放行 ---> " + dataItem.getOwner() + " , " + dataItem.getIdentifier());
                return true;
            }
            if (BltORMM.getInstance(this.c).markLook(dataItem)) {
                if (GlobalDefine.DEBUG_BLT) {
                    Log.i(GlobalDefine.TAG_BLT, "Has mark ---> " + dataItem.getOwner() + " , " + dataItem.getIdentifier());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "Has mark ---> " + dataItem.getOwner() + " , " + dataItem.getIdentifier());
                return true;
            }
            if (GlobalDefine.DEBUG_BLT) {
                Log.i(GlobalDefine.TAG_BLT, "Ignore from mark down ---> " + dataItem.getOwner() + " , " + dataItem.getIdentifier());
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "Ignore from mark down ---> " + dataItem.getOwner() + " , " + dataItem.getIdentifier());
            return false;
        }
    }

    public void lookSideBlt() {
        boolean z = GlobalDefine.IS_WATCH;
        Runnable runnable = z ? this.b : this.a;
        if (GlobalDefine.DEBUG_BLT) {
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "<WATCH> " : "<PHONE> ");
            sb.append("==> LOOKSIDE TOUCH REMOVE & RELAUNCH! ");
            Log.i(GlobalDefine.TAG_BLT, sb.toString());
        }
        SolidLogger solidLogger = SolidLogger.getInstance();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "<WATCH> " : "<PHONE> ");
        sb2.append("==> LOOKSIDE TOUCH REMOVE & RELAUNCH! ");
        solidLogger.with(GlobalDefine.TAG_BLT, sb2.toString());
        g.removeCallbacks(runnable);
        g.postDelayed(runnable, f);
    }

    @Override // com.huami.watch.transport.Transporter.DataListener
    public final void onDataReceived(TransportDataItem transportDataItem) {
        ((PowerManager) this.c.getApplicationContext().getSystemService("power")).newWakeLock(1, "wake-for-http-sync").acquire(5000L);
        DataItem dataItemCreateDataBundleToDataItem = DataUtils.createDataBundleToDataItem(transportDataItem.getData());
        if (GlobalDefine.DEBUG_BLT) {
            Log.i(GlobalDefine.TAG_BLT, "on data received from WearCompanion: " + dataItemCreateDataBundleToDataItem.toShortString());
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "on data received from WearCompanion: " + dataItemCreateDataBundleToDataItem.toShortString());
        if (f(dataItemCreateDataBundleToDataItem)) {
            handleInnerCommand(dataItemCreateDataBundleToDataItem);
        } else {
            plainItemDataIn(dataItemCreateDataBundleToDataItem);
        }
    }

    public void plainItemDataIn(DataItem dataItem) {
    }

    public boolean removeMark(DataItem dataItem) {
        boolean zMarkDown;
        synchronized (this) {
            zMarkDown = BltORMM.getInstance(this.c).markDown(dataItem);
            if (GlobalDefine.DEBUG_BLT) {
                Log.i(GlobalDefine.TAG_BLT, "Remove mark ---> " + dataItem.getOwner() + " , " + dataItem.getIdentifier() + " res : " + zMarkDown);
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_BLT, "Remove mark ---> " + dataItem.getOwner() + " , " + dataItem.getIdentifier() + " res : " + zMarkDown);
        }
        return zMarkDown;
    }

    public final void start(Context context) {
        IS_BLE = Settings.System.getInt(context.getContentResolver(), KEY_DEVICE_BOND_TYPE, 0) == 2;
        this.c = context;
        Transporter transporter = Transporter.get(context, ModuleDef.BLE_TRANS_CHANNEL_MODULE_NAME);
        this.d = transporter;
        transporter.addDataListener(this);
        this.d.connectTransportService();
        this.d.addChannelListener(new a());
        e = Settings.System.getInt(context.getContentResolver(), KEY_DEVICE_BOND_TYPE, 0) == 2 ? 300000L : 15000L;
        boolean z = GlobalDefine.DEBUG_SERIAL_MODE;
        if (z) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "\n\t\t\t*当前callback 保证的time-out时间: " + (e / 1000) + " 秒\n");
        }
        if (z) {
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "\n\t\t\t*当前callback 保证的time-out时间: " + (e / 1000) + " 秒\n");
        }
    }

    public final void stop(Context context) {
        this.d.removeDataListener(this);
        this.d.disconnectTransportService();
        this.c = null;
    }
}
