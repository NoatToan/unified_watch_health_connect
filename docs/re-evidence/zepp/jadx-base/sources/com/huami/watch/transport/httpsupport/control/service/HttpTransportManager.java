package com.huami.watch.transport.httpsupport.control.service;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import clc.utils.taskmanager.Task;
import clc.utils.taskmanager.TaskManager;
import clc.utils.taskmanager.TaskOperation;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.StageFright.Command;
import com.huami.watch.transport.httpsupport.StageFright.EnumCollector;
import com.huami.watch.transport.httpsupport.StageFright.ReportListInfo;
import com.huami.watch.transport.httpsupport.Utils;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.huami.watch.transport.httpsupport.global.GlobalDataSyncKicker;
import com.huami.watch.transport.httpsupport.global.SyncNodeSwitcher;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.huami.watch.transport.httpsupport.model.DataUtils;
import com.huami.watch.transport.httpsupport.translogutils.DataParser;
import com.huami.watch.transport.httpsupport.translogutils.TransLogs;
import com.huami.watch.transport.httpsupport.transporter.blt.BltORMM;
import com.huami.watch.transport.httpsupport.transporter.blt.BltTransporter;
import com.huami.watch.transport.httpsupport.transporter.server.DuplexDataExchangeService;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public class HttpTransportManager {
    public static final String ACTION_BLUETOOTH_CONNECTION_CHANGED = "com.huami.watch.action.DEVICE_CONNECTION_CHANGED";
    private static final long j = 10000;
    private static Method k;
    private static Handler l = new Handler(Looper.getMainLooper());
    private static HttpTransportManager m = null;
    private Task a = null;
    private BltTransporter b;
    private Context c;
    private TaskManager d;
    private TaskManager e;
    private DataCacher f;
    private EnumCollector g;
    private DuplexDataExchangeService.Exchangee h;
    private ConcurrentLinkedQueue<String> i;

    public class a extends DuplexDataExchangeService.Exchangee {

        /* JADX INFO: renamed from: com.huami.watch.transport.httpsupport.control.service.HttpTransportManager$a$a, reason: collision with other inner class name */
        public class C0676a extends Task {
            public final /* synthetic */ DataItem g;
            public final /* synthetic */ boolean h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0676a(Task.RunningStatus runningStatus, DataItem dataItem, boolean z) {
                super(runningStatus);
                this.g = dataItem;
                this.h = z;
            }

            @Override // clc.utils.taskmanager.Task
            public TaskOperation onExecute(TaskOperation taskOperation) {
                HttpTransportManager.this.x(this.g, this.h);
                return null;
            }
        }

        public a(Context context) {
            super(context);
        }

        public void c(DataItem dataItem, boolean z) {
            HttpTransportManager.this.e.next(new C0676a(Task.RunningStatus.WORK_THREAD, dataItem, z)).execute();
        }

        @Override // com.huami.watch.transport.httpsupport.transporter.server.DuplexDataExchangeService.Exchangee
        public void onDataFromClient(String str) {
            String strDrillUnzipData;
            boolean z = GlobalDefine.DEBUG_SERVER;
            if (z) {
                Log.i(GlobalDefine.TAG_SRV, "\n这次请求的数据是onDataFromClient ---> " + str + " \n=========\n");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "\n这次请求的数据是onDataFromClient ---> " + str + " \n=========\n");
            if (z) {
                try {
                    strDrillUnzipData = DataUtils.drillUnzipData(DataItem.from(str));
                } catch (Exception e) {
                    e.printStackTrace();
                    strDrillUnzipData = str;
                }
                Log.i(GlobalDefine.TAG_SRV, "数据 ==> Data 区域: " + strDrillUnzipData);
            }
            DataItem dataItemFrom = DataItem.from(str);
            if (!SyncNodeSwitcher.self().mayGo(0)) {
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "##$@@@@@@@@@@@@@@@@@ WIFI TRANS 正在进行，透传回避！！ for : " + dataItemFrom.toShortString());
                if (GlobalDefine.DEBUG_SERVER) {
                    Log.w(GlobalDefine.TAG_SRV, "##$@@@@@@@@@@@@@@@@@ WIFI TRANS 正在进行，透传回避！！ for : " + dataItemFrom.toShortString());
                }
                dataItemFrom.setState(9);
                DataCacher.getInstance(HttpTransportManager.this.c).save(dataItemFrom);
                return;
            }
            if (Command.isInternal(dataItemFrom.getAction())) {
                if (GlobalDefine.DEBUG_SERIAL_MODE) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "onDataFromClient --> " + dataItemFrom.getAction());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "onDataFromClient --> " + dataItemFrom.getAction());
                HttpTransportManager.this.g.addActionAndExecute(dataItemFrom);
                return;
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "NEW Send To Assist === > " + dataItemFrom.toShortString() + " ， 助手支持串行情况：" + GlobalDefine.supportNewSync());
            SolidLogger solidLogger = SolidLogger.getInstance();
            StringBuilder sb = new StringBuilder();
            sb.append("数据 ==> Data 区域: ");
            sb.append(DataUtils.drillUnzipData(DataItem.from(str)));
            solidLogger.with(GlobalDefine.TAG_SRV, sb.toString());
            if (!TextUtils.isEmpty(dataItemFrom.getExtraValByKey("d-path"))) {
                String extraValByKey = dataItemFrom.getExtraValByKey("d-path");
                boolean z2 = GlobalDefine.DEBUG_LD;
                if (z2) {
                    SolidLogger.getInstance().with(GlobalDefine.TAG_LD, "@@@@  需要填充 data : " + dataItemFrom.getIdentifier() + " <> " + extraValByKey);
                }
                if (z2) {
                    Log.i(GlobalDefine.TAG_LD, "@@@@@  需要填充 data : " + dataItemFrom.getIdentifier() + " <> " + extraValByKey);
                }
                HttpTransportManager.this.o(extraValByKey, dataItemFrom);
            }
            dataItemFrom.setState(1);
            DataCacher.getInstance(HttpTransportManager.this.c).save(dataItemFrom);
            if (TextUtils.equals(dataItemFrom.getExtraValByKey("test"), "1")) {
                if (GlobalDefine.DEBUG_LD) {
                    Log.i(GlobalDefine.TAG_LD, "@@@@@  收到测试数据 ： " + dataItemFrom.toShortString() + " 只缓存！");
                }
                c(dataItemFrom, true);
            }
        }

        @Override // com.huami.watch.transport.httpsupport.transporter.server.DuplexDataExchangeService.Exchangee
        public void query(String str) {
        }
    }

    public class b extends BltTransporter {
        public b() {
        }

        @Override // com.huami.watch.transport.httpsupport.transporter.blt.BltTransporter
        public void handleInnerCommand(DataItem dataItem) {
            super.handleInnerCommand(dataItem);
            if (HttpTransportManager.this.g != null) {
                HttpTransportManager.this.g.addActionAndExecute(dataItem);
            }
        }

        @Override // com.huami.watch.transport.httpsupport.transporter.blt.BltTransporter
        public void plainItemDataIn(DataItem dataItem) {
            if (HttpTransportManager.this.b.hasMark(dataItem)) {
                HttpTransportManager.this.b.removeMark(dataItem);
                TransLogs.i(new DataParser(dataItem, 2).bleReceiveResText());
                if (GlobalDefine.DEBUG_SERVER) {
                    Log.i(GlobalDefine.TAG_SRV, "===>>> 助手传来了数据: " + dataItem.getIdentifier());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "===>>> 助手传来了数据: " + dataItem.getIdentifier());
                Log.i(GlobalDefine.TAG_SRV, "===>>> 助手传来了数据: " + dataItem.toShortString());
                HttpTransportManager.this.q(dataItem);
            }
        }
    }

    public class c extends Task {
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Task.RunningStatus runningStatus, String str) {
            super(runningStatus);
            this.g = str;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            new File(this.g).delete();
            return null;
        }
    }

    public class d extends EnumCollector {
        private ConcurrentHashMap<String, c> f = new ConcurrentHashMap<>();

        public class a implements BltTransporter.IResultReceiver {
            public final /* synthetic */ EnumCollector.OnReportResultListener b;

            public a(EnumCollector.OnReportResultListener onReportResultListener) {
                this.b = onReportResultListener;
            }

            @Override // com.huami.watch.transport.httpsupport.transporter.blt.BltTransporter.IResultReceiver
            public void onResult(int i) {
                EnumCollector.OnReportResultListener onReportResultListener = this.b;
                if (onReportResultListener != null) {
                    onReportResultListener.onReportResult(i);
                }
            }
        }

        public class b implements BltTransporter.IResultReceiver {
            public final /* synthetic */ EnumCollector.OnReportResultListener b;

            public b(EnumCollector.OnReportResultListener onReportResultListener) {
                this.b = onReportResultListener;
            }

            @Override // com.huami.watch.transport.httpsupport.transporter.blt.BltTransporter.IResultReceiver
            public void onResult(int i) {
                EnumCollector.OnReportResultListener onReportResultListener = this.b;
                if (onReportResultListener != null) {
                    onReportResultListener.onReportResult(i);
                }
            }
        }

        public class c implements Runnable {
            public DataItem a;

            public class a extends Task {
                public a(Task.RunningStatus runningStatus) {
                    super(runningStatus);
                }

                @Override // clc.utils.taskmanager.Task
                public TaskOperation onExecute(TaskOperation taskOperation) {
                    d.this.f.remove(c.this.a.getIdentifier());
                    c cVar = c.this;
                    d.this.g(cVar.a);
                    return null;
                }
            }

            public c(DataItem dataItem) {
                this.a = dataItem;
            }

            @Override // java.lang.Runnable
            public void run() {
                HttpTransportManager.this.e.next(new a(Task.RunningStatus.WORK_THREAD)).execute();
            }
        }

        public d() {
        }

        private void f(DataItem dataItem, EnumCollector.OnReportResultListener onReportResultListener) {
            if (HttpTransportManager.this.b != null || dataItem == null) {
                HttpTransportManager.this.b.dataOut(dataItem, new b(onReportResultListener));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(DataItem dataItem) {
            DataCacher dataCacher = DataCacher.getInstance(HttpTransportManager.this.c);
            ReportListInfo reportListInfo = new ReportListInfo(GlobalDefine.CURR_REPORT_LIST_VER);
            List<DataItem> listQuery = dataCacher.query(1, 0);
            if (listQuery != null) {
                String str = dataItem.trackTargetPackageAndAction()[0];
                HashSet<String> hashSetTrackTargetActionSet = dataItem.trackTargetActionSet();
                for (DataItem dataItem2 : listQuery) {
                    if (TextUtils.equals("*", str) || GlobalDefine.CURR_REPORT_LIST_VER == 0 || (TextUtils.equals(str, dataItem2.getOwner()) && (hashSetTrackTargetActionSet.contains(dataItem2.getAction()) || hashSetTrackTargetActionSet.contains("*")))) {
                        reportListInfo.addItem(1, dataItem2);
                    }
                }
            }
            dataItem.setOwner(HttpTransportManager.this.c.getPackageName());
            dataItem.addExtraPair("report-list", reportListInfo.flatten());
            dataItem.addExtraPair("keyf", "1");
            f(dataItem, null);
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void data2Lower(DataItem dataItem, EnumCollector.OnReportResultListener onReportResultListener) {
            if (HttpTransportManager.this.h.hasClient()) {
                boolean zDispatchToAllClient = HttpTransportManager.this.h.dispatchToAllClient(dataItem);
                if (onReportResultListener != null) {
                    onReportResultListener.onReportResult(zDispatchToAllClient ? 0 : -1);
                    return;
                }
                return;
            }
            if (GlobalDefine.DEBUG_SERVER) {
                Log.i(GlobalDefine.TAG_SRV, "没有client ---> " + dataItem.getOwner() + " , " + dataItem.getAction());
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "没有client ---> " + dataItem.getOwner() + " , " + dataItem.getAction());
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void data2Upper(DataItem dataItem, EnumCollector.OnReportResultListener onReportResultListener) {
            if (HttpTransportManager.this.b != null || dataItem == null) {
                if (HttpTransportManager.this.c == null || !TextUtils.equals(dataItem.getOwner(), HttpTransportManager.this.c.getPackageName())) {
                    HttpTransportManager.this.b.dataOut(dataItem, new a(onReportResultListener));
                    return;
                }
                if (GlobalDefine.DEBUG_SERVER) {
                    Log.i(GlobalDefine.TAG_SRV, "自己不再这里上传: " + dataItem.getOwner() + " , id: " + dataItem.getIdentifier());
                }
            }
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void dataFromUpper(DataItem dataItem) {
            if (GlobalDefine.CURR_REPORT_LIST_VER == 1) {
                addActionAndExecute(GlobalDataSyncKicker.getInstance().genInternalSyncAction("*", Command.DATA_SYNC_TRIGGER));
            }
            super.dataFromUpper(dataItem);
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void dataLocal2Upper(DataItem dataItem) {
            String identifier = dataItem.getIdentifier();
            c cVar = this.f.get(identifier);
            if (cVar == null) {
                ConcurrentHashMap<String, c> concurrentHashMap = this.f;
                c cVar2 = new c(dataItem);
                concurrentHashMap.put(identifier, cVar2);
                cVar = cVar2;
            }
            HttpTransportManager.l.removeCallbacks(cVar);
            HttpTransportManager.l.postDelayed(cVar, 3280L);
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void onCustomCommand(DataItem dataItem) {
            String action = dataItem.getAction();
            if (!TextUtils.equals(action, Command.DATA_SYNC_TRIGGER)) {
                if (!TextUtils.equals(action, Command.DATA_SYNC_TELL_RESULT)) {
                    if (TextUtils.equals(action, Command.CMD_TRIGGER_REPORT_FROM_CLIENT)) {
                        String[] strArrTrackTargetPackageAndAction = dataItem.trackTargetPackageAndAction();
                        HttpTransportManager.this.triggerOnceReportTypedUploadCache(strArrTrackTargetPackageAndAction[0] == null ? "没有target" : strArrTrackTargetPackageAndAction[0], strArrTrackTargetPackageAndAction[1] != null ? strArrTrackTargetPackageAndAction[1] : "没有target");
                        return;
                    } else if (!TextUtils.equals(action, Command.CMD_QUERY_TOKEN)) {
                        if (!TextUtils.equals(action, Command.CMD_ARRIVAL_TOKEN)) {
                            return;
                        }
                    }
                }
                data2Upper(dataItem, null);
                return;
            }
            if (TextUtils.isEmpty(dataItem.getExtraValByKey("new-sync"))) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "---xx----------感觉对方是个“旧的”助手");
                GlobalDefine.saveSyncSupport(false);
            } else {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "---xx----------感觉对方是个“新的”助手");
                GlobalDefine.saveSyncSupport(true);
            }
            data2Lower(dataItem, null);
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void triggerPoorEnergy(DataItem dataItem) {
            HttpTransportManager httpTransportManager = HttpTransportManager.this;
            httpTransportManager.tryProcessCachedRequestWhilePhoneAvalible(httpTransportManager.c);
            HttpTransportManager.this.h.dispatchToAllClient(dataItem);
        }
    }

    public class e extends Task {
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Task.RunningStatus runningStatus, String str, String str2) {
            super(runningStatus);
            this.g = str;
            this.h = str2;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            HttpTransportManager.this.new i(this.g, this.h).run();
            return null;
        }
    }

    public class f extends Task {
        public final /* synthetic */ DataItem g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Task.RunningStatus runningStatus, DataItem dataItem) {
            super(runningStatus);
            this.g = dataItem;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            HttpTransportManager.this.t(this.g);
            return null;
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ DataItem b;
        public final /* synthetic */ boolean c;

        public class a implements BltTransporter.IResultReceiver {
            public final /* synthetic */ DataParser b;

            public a(DataParser dataParser) {
                this.b = dataParser;
            }

            @Override // com.huami.watch.transport.httpsupport.transporter.blt.BltTransporter.IResultReceiver
            public void onResult(int i) {
                g gVar = g.this;
                HttpTransportManager.this.v(gVar.b.getIdentifier());
                if (i != 0) {
                    if (GlobalDefine.DEBUG_SERVER) {
                        Log.i(GlobalDefine.TAG_SRV, "\n上传到手助失败，即将缓存: ---> " + g.this.b + " \n=========\n\n\n");
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "\n上传到手助失败@@@，即将缓存: ---> " + g.this.b + " \n");
                    g.this.b.setState(1);
                    HttpTransportManager.this.f.save(g.this.b);
                    TransLogs.i(this.b.getCachaThisText());
                    return;
                }
                BltORMM.getInstance(HttpTransportManager.this.c).mark(g.this.b);
                boolean z = GlobalDefine.DEBUG_SERVER;
                if (z) {
                    Log.i(GlobalDefine.TAG_SRV, "蓝牙传输成功 SUCCESS ---> " + g.this.b + " \n=========\n\n\n");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "蓝牙传输成功 SUCCESS ---> " + g.this.b + " \n");
                g gVar2 = g.this;
                if (gVar2.c) {
                    boolean zDelete = HttpTransportManager.this.f.delete(g.this.b.getIdentifier());
                    if (z) {
                        Log.i(GlobalDefine.TAG_SRV, "从数据库删除完成 ---> " + g.this.b.getIdentifier() + " , " + g.this.b.getOwner() + " , 删除结果: " + zDelete + " \n=========\n\n\n");
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "从数据库删除完成 ---> " + g.this.b.getIdentifier() + " , " + g.this.b.getOwner() + " , 删除结果: " + zDelete + " \n=========\n\n\n");
                    TransLogs.i(this.b.getCacheDeleteStateText(zDelete));
                }
                if (HttpTransportManager.this.b != null) {
                    if (!BltTransporter.IS_BLE || Settings.System.getInt(HttpTransportManager.this.c.getContentResolver(), "free_num", 0) > 0) {
                        HttpTransportManager.this.b.lookSideBlt();
                    }
                }
            }
        }

        public g(DataItem dataItem, boolean z) {
            this.b = dataItem;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            DataParser dataParser = new DataParser(this.b, 1);
            TransLogs.i(dataParser.getImportanceInfo());
            if (GlobalDefine.DEBUG_SERVER) {
                String string = this.b.toString();
                StringBuilder sb = new StringBuilder();
                sb.append("尝试将下面数据发送到手助端>>>>> ");
                if (string.length() > 1000) {
                    string = string.substring(0, 1000);
                }
                sb.append(string);
                sb.append(" ,是否大数据: ");
                sb.append(this.b.hasFlag(32768));
                Log.i(GlobalDefine.TAG_SRV, sb.toString());
            }
            String string2 = this.b.toString();
            SolidLogger solidLogger = SolidLogger.getInstance();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("尝试将下面数据发送到手助端>>>>> ");
            if (string2.length() > 1000) {
                string2 = string2.substring(0, 1000);
            }
            sb2.append(string2);
            solidLogger.with(GlobalDefine.TAG_SRV, sb2.toString());
            TransLogs.ii("***ble发送****" + this.b.getIdentifier());
            HttpTransportManager.this.w(this.b, new a(dataParser));
        }
    }

    public class h extends Task {
        public h(Task.RunningStatus runningStatus) {
            super(runningStatus);
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            List<DataItem> listQuery = HttpTransportManager.this.f.query(1, 0);
            if (GlobalDefine.DEBUG_SERVER) {
                StringBuilder sb = new StringBuilder();
                sb.append("尝试处理缓存在service的请求 有 ==> [ ");
                sb.append(listQuery == null ? 0 : listQuery.size());
                sb.append(" ] 个请求需要重新发起....");
                Log.i(GlobalDefine.TAG_SRV, sb.toString());
            }
            SolidLogger solidLogger = SolidLogger.getInstance();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("尝试处理缓存在service的请求 有 ==> [ ");
            sb2.append(listQuery == null ? 0 : listQuery.size());
            sb2.append(" ] 个请求需要重新发起....");
            solidLogger.with(GlobalDefine.TAG_SRV, sb2.toString());
            if (listQuery == null) {
                return null;
            }
            for (DataItem dataItem : listQuery) {
                if (dataItem != null) {
                    dataItem.setState(5);
                    if (!BltTransporter.IS_BLE || Settings.System.getInt(HttpTransportManager.this.c.getContentResolver(), "free_num", 0) > 0) {
                        HttpTransportManager.this.x(dataItem, true);
                    }
                }
            }
            return null;
        }
    }

    public class i implements Runnable {
        public String a;
        public String b;

        public i(String str, String str2) {
            this.b = str;
            this.a = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HttpTransportManager.this.c == null || HttpTransportManager.this.g == null) {
                return;
            }
            DataItem dataItemGenInternalEnumCollectAction = GlobalDataSyncKicker.getInstance().genInternalEnumCollectAction(this.b, this.a, Command.CMD_QUERY_UPLOAD_LIST);
            dataItemGenInternalEnumCollectAction.addExtraPair("ver", "1");
            dataItemGenInternalEnumCollectAction.addExtraPair("self", "1");
            HttpTransportManager.this.g.addActionAndExecute(dataItemGenInternalEnumCollectAction);
        }
    }

    private HttpTransportManager(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.h = new a(applicationContext);
        this.f = DataCacher.getInstance(context);
        this.d = new TaskManager("Data2AppClientOverMSGTaskManager");
        this.e = new TaskManager("Data2AssistOverBltTaskManager");
        DuplexDataExchangeService.setExchangee(this.h);
        if (this.b == null) {
            b bVar = new b();
            this.b = bVar;
            bVar.start(this.c);
        }
        r();
        y(this.c);
    }

    public static void doInit(Context context) {
        if (m == null) {
            synchronized (HttpTransportManager.class) {
                if (m == null) {
                    m = new HttpTransportManager(context);
                }
            }
        }
    }

    public static HttpTransportManager getInstance(Context context) {
        doInit(context);
        return m;
    }

    private void n(String str) {
        StringBuilder sb;
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.i;
        if (concurrentLinkedQueue == null || str == null) {
            sb = new StringBuilder();
            sb.append("***未能加入列表中****itemId:");
            sb.append(str);
            sb.append("sendingItemalreadyList is null?:");
            sb.append(this.i == null);
        } else {
            concurrentLinkedQueue.add(str);
            sb = new StringBuilder();
            sb.append("***加入列表中****");
            sb.append(str);
        }
        TransLogs.ii(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str, DataItem dataItem) {
        String fileToString = Utils.readFileToString(str);
        dataItem.removeExtraPairByKey("d-path");
        dataItem.setData(fileToString);
        this.e.next(new c(Task.RunningStatus.WORK_THREAD, str));
    }

    private static boolean p(String str) {
        try {
            if (k == null) {
                k = Class.forName("com.huami.watch.ble.trasnfer.BLEDataTransfor").getMethod("containsKeyId", String.class);
            }
            Object objInvoke = k.invoke(null, str);
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(DataItem dataItem) {
        synchronized (this) {
            if (Command.isInternal(dataItem.getAction())) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "Data from Service WITH ");
            }
            if (GlobalDefine.DEBUG_SERVER) {
                StringBuilder sb = new StringBuilder();
                sb.append("Will handleDataFromRemote ---> ");
                sb.append(dataItem.getOwner());
                sb.append(" , ");
                sb.append(dataItem.getAction());
                sb.append(" , state : ");
                sb.append(dataItem.getState() == 0 ? "已经助手处理" : "未经助手处理过");
                Log.i(GlobalDefine.TAG_SRV, sb.toString());
            }
            SolidLogger solidLogger = SolidLogger.getInstance();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Will handleDataFromRemote ---> ");
            sb2.append(dataItem.getOwner());
            sb2.append(" , ");
            sb2.append(dataItem.getAction());
            sb2.append(" , state : ");
            sb2.append(dataItem.getState() == 0 ? "已经助手处理" : "未经助手处理过");
            solidLogger.with(GlobalDefine.TAG_SRV, sb2.toString());
            this.d.next(new f(Task.RunningStatus.WORK_THREAD, dataItem)).execute();
        }
    }

    private void r() {
        if (this.g == null) {
            d dVar = new d();
            this.g = dVar;
            dVar.setName("EC-HttpTransportManager");
        }
    }

    private boolean s(String str) {
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.i;
        if (concurrentLinkedQueue != null && str != null && concurrentLinkedQueue.contains(str)) {
            if (p(str)) {
                TransLogs.ii("***BLE过滤了****" + str);
                return true;
            }
            TransLogs.ii("***BLE中不存在****" + str);
        }
        TransLogs.ii("***isSendingNow false");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(DataItem dataItem) {
        SolidLogger solidLogger;
        String str;
        String str2;
        synchronized (this) {
            boolean z = GlobalDefine.DEBUG_SERVER;
            if (z) {
                Log.i(GlobalDefine.TAG_SRV, "PROCESS DATA NOW ---> " + dataItem.getOwner() + " , " + dataItem.getAction());
                String data = dataItem.getData();
                int length = data.length();
                if (!TextUtils.isEmpty(data)) {
                    data = data.substring(0, Math.min(200, length));
                }
                Log.i(GlobalDefine.TAG_SRV, "SHOW SOME DATA ? ------> \n" + data + " , " + dataItem.getExtraData() + " \n ==============\n\n");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "PROCESS DATA NOW ---> " + dataItem.getOwner() + " , " + dataItem.getAction());
            if (dataItem.getState() != 0) {
                if (z) {
                    Log.i(GlobalDefine.TAG_SRV, "不认识的STATE ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , state: " + dataItem.getState());
                }
                solidLogger = SolidLogger.getInstance();
                str = GlobalDefine.TAG_SRV;
                str2 = "不认识的STATE ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , state: " + dataItem.getState();
            } else if (this.c != null) {
                if (z) {
                    Log.i(GlobalDefine.TAG_SRV, "尝试将数据返回给client ---> " + dataItem.getIdentifier() + " , " + dataItem.getAction());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "尝试将数据返回给client ---> " + dataItem.getIdentifier() + " , " + dataItem.getAction());
                if (this.h.sendToClient(dataItem)) {
                    if (z) {
                        Log.i(GlobalDefine.TAG_SRV, "回传成功 ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , state: " + dataItem.getState());
                    }
                    solidLogger = SolidLogger.getInstance();
                    str = GlobalDefine.TAG_SRV;
                    str2 = "回传成功 ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , state: " + dataItem.getState();
                } else {
                    if (z) {
                        Log.i(GlobalDefine.TAG_SRV, "客户端不存在，将缓存 ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , state: " + dataItem.getState());
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "客户端不存在，将缓存 ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , state: " + dataItem.getState());
                    dataItem.setState(2);
                    this.f.save(dataItem);
                    if (z) {
                        Log.i(GlobalDefine.TAG_SRV, "缓存完成 ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , state: " + dataItem.getState());
                    }
                    solidLogger = SolidLogger.getInstance();
                    str = GlobalDefine.TAG_SRV;
                    str2 = "缓存完成 ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , state: " + dataItem.getState();
                }
            }
            solidLogger.with(str, str2);
        }
    }

    private DataItem u(String str) {
        return this.f.query(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.i;
        if (concurrentLinkedQueue == null || str == null || !concurrentLinkedQueue.contains(str)) {
            return;
        }
        this.i.remove(str);
        TransLogs.ii("***从列表中删除****" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(DataItem dataItem, BltTransporter.IResultReceiver iResultReceiver) {
        boolean z = GlobalDefine.DEBUG_SERVER;
        if (z) {
            Log.i(GlobalDefine.TAG_SRV, "Will send ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , to 助手.");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "Will send ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , to 助手.");
        if (!this.b.check()) {
            if (z) {
                Log.i(GlobalDefine.TAG_SRV, "手表未连接，数据将被缓存 , will CACHE ---> " + dataItem + " \n\n=========\n\n\n");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "手表未连接，数据将被缓存 , will ######CACHE######  ---> " + dataItem + " \n");
            dataItem.setState(1);
            this.f.save(dataItem);
            return;
        }
        this.b.dataOut(dataItem, iResultReceiver);
        if (z) {
            Log.i(GlobalDefine.TAG_SRV, "Data Sent Result Code ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , to Assistant. ");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "Data Sent Result Code ---> " + dataItem.getOwner() + " , " + dataItem.getAction() + " , to Assistant. ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(DataItem dataItem, boolean z) {
        StringBuilder sb;
        String str;
        if (this.i == null) {
            this.i = new ConcurrentLinkedQueue<>();
        }
        String identifier = dataItem.getIdentifier();
        if (identifier == null || s(identifier)) {
            sb = new StringBuilder();
            str = "***在列表中忽略了****";
        } else {
            z(dataItem, z).run();
            if (!Command.isInternal(dataItem.getAction())) {
                n(identifier);
            }
            sb = new StringBuilder();
            str = "***不在列表中并且发送了****";
        }
        sb.append(str);
        sb.append(identifier);
        TransLogs.ii(sb.toString());
    }

    private void y(Context context) {
        if (GlobalDefine.DEBUG_SERVER) {
            Log.i(GlobalDefine.TAG_SRV, "\n\t====================\tWEAR HTTP SERVICE START\t========================\n");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "\n\t====================\tWEAR HTTP SERVICE START\t========================\n");
        try {
            context.startService(new Intent(context, (Class<?>) DuplexDataExchangeService.class));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private Runnable z(DataItem dataItem, boolean z) {
        g gVar;
        synchronized (this) {
            gVar = new g(dataItem, z);
        }
        return gVar;
    }

    public void triggerOnceReportTypedUploadCache(String str, String str2) {
        this.e.next(new e(Task.RunningStatus.WORK_THREAD, str, str2)).execute();
    }

    public void tryProcessCachedRequestWhilePhoneAvalible(Context context) {
        synchronized (this) {
            if (this.f == null) {
                if (GlobalDefine.DEBUG_SERVER) {
                    Log.i(GlobalDefine.TAG_SRV, "DataCacher is 空，重新初始化...");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "DataCacher is 空，重新初始化...");
                Context context2 = this.c;
                if (context2 != null) {
                    context = context2;
                }
                this.c = context;
                DataCacher dataCacher = DataCacher.getInstance(context);
                this.f = dataCacher;
                if (dataCacher == null) {
                    return;
                }
            }
            if (this.a == null) {
                this.a = new h(Task.RunningStatus.WORK_THREAD);
            }
            this.e.removeTask(this.a);
            this.e.next(this.a).execute();
        }
    }
}
