package com.huami.watch.transport.httpsupport.control.assist;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import clc.utils.taskmanager.Task;
import clc.utils.taskmanager.TaskManager;
import clc.utils.taskmanager.TaskOperation;
import com.huami.watch.ota.UpdateUtils;
import com.huami.watch.transport.httpsupport.AlarmDriver;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.StageFright.AnalysisStage;
import com.huami.watch.transport.httpsupport.StageFright.Command;
import com.huami.watch.transport.httpsupport.StageFright.EnumCollector;
import com.huami.watch.transport.httpsupport.StageFright.ProcessStateMonitor;
import com.huami.watch.transport.httpsupport.StageFright.ReportListInfo;
import com.huami.watch.transport.httpsupport.StageFright.Serializer;
import com.huami.watch.transport.httpsupport.StageFright.SyncProcessManager;
import com.huami.watch.transport.httpsupport.Utils;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.huami.watch.transport.httpsupport.global.ManualDataSyncMonitor;
import com.huami.watch.transport.httpsupport.global.PublicParamsBuilder;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.huami.watch.transport.httpsupport.model.DataUtils;
import com.huami.watch.transport.httpsupport.transporter.blt.BltTransporter;
import com.huami.watch.transport.httpsupport.transporter.http.HttpTransporter;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class WearHttpCompanion {
    public static final String ACTION_BLUETOOTH_CONNECTION_CHANGED = "com.huami.watch.action.DEVICE_CONNECTION_CHANGED";
    private static AtomicBoolean l = new AtomicBoolean(false);
    private static WearHttpCompanion m;
    private AtomicBoolean a = new AtomicBoolean(false);
    private BltTransporter b;
    private Context c;
    private TaskManager d;
    private TaskManager e;
    private DataCacher f;
    private ManualDataSyncMonitor g;
    private EnumCollector h;
    private HttpTransporter i;
    private ConcurrentHashMap<String, TrafficMonitor> j;
    private TokenArrivalListener k;

    public interface TokenArrivalListener {
        String callBack(String str);
    }

    public interface TrafficMonitor {
        void onFeed(DataItem dataItem);

        String targetAtAction();

        String targetAtPackage();
    }

    public class a extends EnumCollector {

        /* JADX INFO: renamed from: com.huami.watch.transport.httpsupport.control.assist.WearHttpCompanion$a$a, reason: collision with other inner class name */
        public class C0675a extends ProcessStateMonitor {
            public C0675a() {
            }

            @Override // com.huami.watch.transport.httpsupport.StageFright.ProcessStateMonitor
            public boolean isAuto() {
                return true;
            }
        }

        public class b implements ProcessStateMonitor.Jack {
            public final /* synthetic */ ProcessStateMonitor b;
            public final /* synthetic */ String[] c;

            public b(String[] strArr, ProcessStateMonitor processStateMonitor) {
                this.c = strArr;
                this.b = processStateMonitor;
            }

            @Override // com.huami.watch.transport.httpsupport.StageFright.ProcessStateMonitor.Jack
            public void onFinish(int i, boolean z, long j) {
                AnalysisStage.getInstance().removeReportArrivalListener(this.b);
            }

            @Override // com.huami.watch.transport.httpsupport.StageFright.ProcessStateMonitor.Jack
            public void onUpdate(int i, int i2, int i3) {
            }

            @Override // com.huami.watch.transport.httpsupport.StageFright.ProcessStateMonitor.Jack
            public String targetAtAction() {
                return this.c[1];
            }

            @Override // com.huami.watch.transport.httpsupport.StageFright.ProcessStateMonitor.Jack
            public String targetAtPackage() {
                return this.c[0];
            }
        }

        public class c extends Task {
            public final /* synthetic */ DataItem g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Task.RunningStatus runningStatus, DataItem dataItem) {
                super(runningStatus);
                this.g = dataItem;
            }

            @Override // clc.utils.taskmanager.Task
            public TaskOperation onExecute(TaskOperation taskOperation) {
                String strCallBack = WearHttpCompanion.this.k.callBack(Command.CMD_QUERY_TOKEN);
                DataItem dataItem = new DataItem();
                dataItem.setAction(Command.CMD_ARRIVAL_TOKEN);
                dataItem.setOwner(this.g.getOwner());
                dataItem.addExtraPair("target", this.g.getExtraValByKey("target"));
                dataItem.setData(strCallBack);
                Log.i("wifi_trans", "trans---sendToRom--" + dataItem.toString());
                a.this.data2Lower(dataItem, null);
                return null;
            }
        }

        public a() {
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void data2Lower(DataItem dataItem, EnumCollector.OnReportResultListener onReportResultListener) {
            WearHttpCompanion.this.m(dataItem);
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void data2Upper(DataItem dataItem, EnumCollector.OnReportResultListener onReportResultListener) {
            boolean zEquals = TextUtils.equals(dataItem.getExtraValByKey("self"), "1");
            boolean zEquals2 = TextUtils.equals(dataItem.getExtraValByKey("keyf"), "1");
            if (zEquals && zEquals2) {
                if (AnalysisStage.getInstance().findProcessStateMonitor(dataItem.trackWho()) != null) {
                    if (GlobalDefine.DEBUG_SERIAL_MODE) {
                        Log.i(GlobalDefine.TAG_COMPANION, "已经在同步了，所以此次忽略" + dataItem.toShortString());
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "已经在同步了，所以此次忽略 " + dataItem.toShortString());
                    return;
                }
                C0675a c0675a = new C0675a();
                AnalysisStage.getInstance().addReportArrivalListener(c0675a);
                c0675a.setReportId(dataItem.getIdentifier());
                c0675a.inJack(new b(dataItem.trackTargetPackageAndAction(), c0675a));
                AnalysisStage.getInstance().addReportArrivalListener(c0675a);
                DataItem dataItem2 = new DataItem();
                dataItem2.setAction(Command.CMD_REPORT_UPLOAD_LIST);
                dataItem2.setOwner(WearHttpCompanion.this.c.getPackageName());
                dataItem2.setExtraData(dataItem.getExtraData().toString());
                dataLocal2Upper(dataItem2);
                dataItem2.removeExtraPairByKey("keyf");
                dataItem2.removeExtraPairByKey("report-list");
                dataItem2.setIdentifier(dataItem.getIdentifier());
                AnalysisStage.getInstance().handleReportHub(WearHttpCompanion.this.c, dataItem2);
                if (GlobalDefine.DEBUG_SERIAL_MODE) {
                    Log.i(GlobalDefine.TAG_COMPANION, " AUTO MODE 添加了local data report ");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "AUTO MODE 添加了local data report ");
            }
            AnalysisStage.getInstance().handleReportHub(WearHttpCompanion.this.c, dataItem);
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void dataFromLower(DataItem dataItem) {
            if (TextUtils.equals(dataItem.getAction(), Command.CMD_REPORT_UPLOAD_LIST)) {
                ReportListInfo reportListInfoFrom = ReportListInfo.from(dataItem.getExtraValByKey("report-list"), !TextUtils.isEmpty(dataItem.getExtraValByKey("keyf")));
                if (ReportListInfo.getVersion() == 0) {
                    dataItem.addExtraPair("report-list", ReportListInfo.translateV0TOV1(reportListInfoFrom, Integer.valueOf("1").intValue()).flatten());
                }
            }
            super.dataFromLower(dataItem);
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void dataLocal2Upper(DataItem dataItem) {
            DataCacher dataCacher = DataCacher.getInstance(WearHttpCompanion.this.c);
            ReportListInfo reportListInfo = new ReportListInfo();
            List<DataItem> listQuery = dataCacher.query(4, 0);
            if (listQuery != null) {
                String str = dataItem.trackTargetPackageAndAction()[0];
                for (DataItem dataItem2 : listQuery) {
                    if (TextUtils.equals(str, dataItem2.getOwner())) {
                        reportListInfo.addItem(2, dataItem2);
                    } else if (GlobalDefine.DEBUG_SERIAL_MODE) {
                        Log.i(GlobalDefine.TAG_COMPANION, "需要: " + str + " , 忽略了这个家伙： " + dataItem2.toShortString());
                    }
                }
            }
            dataItem.addExtraPair("report-list", reportListInfo.flatten());
            dataItem.setOwner(WearHttpCompanion.this.c.getPackageName());
            dataItem.setAction(Command.CMD_REPORT_UPLOAD_LIST);
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector
        public void onCustomCommand(DataItem dataItem) {
            super.onCustomCommand(dataItem);
            String action = dataItem.getAction();
            if (TextUtils.equals(action, Command.DATA_SYNC_TRIGGER)) {
                data2Lower(dataItem, null);
                return;
            }
            if (TextUtils.equals(action, Command.CMD_TRIGGER_REPORT_FROM_CLIENT)) {
                dataLocal2Upper(dataItem);
                return;
            }
            if (TextUtils.equals(action, Command.CMD_QUERY_TOKEN)) {
                Log.i("wifi_trans", "rom--cmd" + action + "--customCommand--" + dataItem.toString());
                if (WearHttpCompanion.this.k != null) {
                    c cVar = new c(Task.RunningStatus.WORK_THREAD, dataItem);
                    if (WearHttpCompanion.this.d != null) {
                        WearHttpCompanion.this.d.next(cVar).execute();
                    }
                }
            }
        }
    }

    public class b extends BltTransporter {
        public b() {
        }

        @Override // com.huami.watch.transport.httpsupport.transporter.blt.BltTransporter
        public void handleInnerCommand(DataItem dataItem) {
            super.handleInnerCommand(dataItem);
            if (Command.isInternal(dataItem.getAction())) {
                if (!TextUtils.equals(dataItem.getAction(), Command.DATA_SYNC_TELL_RESULT)) {
                    WearHttpCompanion.this.h.addActionAndExecute(dataItem);
                    if (GlobalDefine.DEBUG_COMPANION) {
                        Log.i(GlobalDefine.TAG_COMPANION, "2 rev internal CMD : " + dataItem.toShortString());
                        return;
                    }
                    return;
                }
                if (GlobalDefine.DEBUG_COMPANION) {
                    Log.i(GlobalDefine.TAG_COMPANION, "rev internal CMD : " + dataItem.toShortString());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "rev internal CMD : " + dataItem.toShortString());
                WearHttpCompanion.this.r(dataItem);
            }
        }

        @Override // com.huami.watch.transport.httpsupport.transporter.blt.BltTransporter
        public void plainItemDataIn(DataItem dataItem) {
            lookSideBlt();
            ProcessStateMonitor processStateMonitorFindProcessStateMonitor = AnalysisStage.getInstance().findProcessStateMonitor(dataItem.trackWho());
            if (processStateMonitorFindProcessStateMonitor != null) {
                processStateMonitorFindProcessStateMonitor.onFeedSingleLazyGirl(WearHttpCompanion.this.c, dataItem);
            }
            WearHttpCompanion.this.v(dataItem);
        }
    }

    public class c extends Task {
        public final /* synthetic */ DataItem g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Task.RunningStatus runningStatus, DataItem dataItem) {
            super(runningStatus);
            this.g = dataItem;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            this.g.hasFlag(512);
            if (this.g.hasFlag(4)) {
                boolean z = GlobalDefine.DEBUG_COMPANION;
                if (z) {
                    Log.i(GlobalDefine.TAG_COMPANION, "===> 将从数据库删除: " + this.g.toShortString());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "===> 将从数据库删除: " + this.g.toShortString());
                boolean zDelete = DataCacher.getInstance(WearHttpCompanion.this.c.getApplicationContext()).delete(this.g.getIdentifier());
                if (z) {
                    Log.i(GlobalDefine.TAG_COMPANION, "===> 删除结果: " + this.g.getIdentifier() + " : " + zDelete);
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "===> 删除结果: " + this.g.getIdentifier() + " : " + zDelete);
                if (z) {
                    Log.i(GlobalDefine.TAG_COMPANION, "===> LOOK SIDE OR NET <=====");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "===> LOOK SIDE OR NET <=====");
                WearHttpCompanion.this.tryProcessCachedRequestWhileNetWorkAvalible();
            }
            boolean z2 = GlobalDefine.DEBUG_COMPANION;
            if (z2) {
                Log.i(GlobalDefine.TAG_COMPANION, "now  TRY  send back to client, will to wear service " + this.g.toShortString());
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "Now TRY send back to client, will to wear service " + this.g.toShortString());
            if (!this.g.hasFlag(128)) {
                WearHttpCompanion.this.m(this.g);
                return null;
            }
            if (z2) {
                boolean z3 = 200 < this.g.getCode() || this.g.getCode() > 299;
                StringBuilder sb = new StringBuilder();
                sb.append("IS ONE SHOT REQ : ");
                sb.append(this.g.toShortString());
                sb.append(" , 结果： ");
                sb.append(!z3);
                sb.append(" , code: ");
                sb.append(this.g.getCode());
                Log.i(GlobalDefine.TAG_COMPANION, sb.toString());
            }
            boolean z4 = 200 < this.g.getCode() || this.g.getCode() > 299;
            SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "IS ONE SHOT REQ : " + this.g.toShortString() + " , 结果：" + z4 + " , code: " + this.g.getCode());
            return null;
        }
    }

    public class d implements BltTransporter.IResultReceiver {
        public final /* synthetic */ DataItem b;

        public d(DataItem dataItem) {
            this.b = dataItem;
        }

        @Override // com.huami.watch.transport.httpsupport.transporter.blt.BltTransporter.IResultReceiver
        public void onResult(int i) {
            if (i != 0) {
                if (GlobalDefine.DEBUG_COMPANION) {
                    Log.i(GlobalDefine.TAG_COMPANION, "手表暂时不通，缓存Item: " + this.b.toShortString());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "手表暂时不通，缓存Item: " + this.b.toShortString());
                if (WearHttpCompanion.this.f == null) {
                    WearHttpCompanion wearHttpCompanion = WearHttpCompanion.this;
                    wearHttpCompanion.f = DataCacher.getInstance(wearHttpCompanion.c);
                }
                this.b.setState(3);
                WearHttpCompanion.this.f.save(this.b);
                return;
            }
            if ((this.b.getFlags() & 4) != 0) {
                boolean zDelete = WearHttpCompanion.this.f.delete(this.b.getIdentifier());
                if (GlobalDefine.DEBUG_COMPANION) {
                    Log.i(GlobalDefine.TAG_COMPANION, ">>>传输成功后，删除本条Item: " + this.b.toShortString() + " , 结果： " + zDelete);
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, ">>>传输成功后，删除本条Item: " + this.b.getIdentifier() + " , 结果： " + zDelete);
            }
        }
    }

    public class e extends Task {
        public final /* synthetic */ DataItem g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Task.RunningStatus runningStatus, DataItem dataItem) {
            super(runningStatus);
            this.g = dataItem;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) throws Throwable {
            WearHttpCompanion.this.sendDataToServer(this.g);
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
            if (TextUtils.isEmpty(this.g.getAction())) {
                if (GlobalDefine.DEBUG_COMPANION) {
                    Log.i(GlobalDefine.TAG_COMPANION, "sendDataToApp WARNNING: NO ACTION FOUND FOR: " + this.g.toShortString());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "sendDataToApp WARNNING: NO ACTION FOUND FOR: " + this.g.toShortString());
            }
            WearHttpCompanion.this.m(this.g);
            return null;
        }
    }

    public class g extends Task {
        public g(Task.RunningStatus runningStatus) {
            super(runningStatus);
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) throws Throwable {
            if (WearHttpCompanion.this.a.get()) {
                return null;
            }
            WearHttpCompanion.this.a.set(true);
            List<DataItem> listQuery = WearHttpCompanion.this.f.query(4);
            if (GlobalDefine.DEBUG_COMPANION) {
                StringBuilder sb = new StringBuilder();
                sb.append("------> 尝试处理缓存在“手助”的请求 有 ==> [ ");
                sb.append(listQuery == null ? 0 : listQuery.size());
                sb.append(" ] 个请求需要重新发起....");
                Log.i(GlobalDefine.TAG_COMPANION, sb.toString());
            }
            SolidLogger solidLogger = SolidLogger.getInstance();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("------> 尝试处理缓存在“手助”的请求 有 ==> [ ");
            sb2.append(listQuery == null ? 0 : listQuery.size());
            sb2.append(" ] 个请求需要重新发起....");
            solidLogger.with(GlobalDefine.TAG_COMPANION, sb2.toString());
            if (listQuery != null) {
                for (DataItem dataItem : listQuery) {
                    if (dataItem != null) {
                        dataItem.setState(5);
                        dataItem.addFlags(4);
                        WearHttpCompanion.this.sendDataToServer(dataItem);
                    }
                }
            }
            WearHttpCompanion.this.a.set(false);
            return null;
        }
    }

    public class h extends Task {
        public h(Task.RunningStatus runningStatus) {
            super(runningStatus);
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            List<DataItem> listQuery = WearHttpCompanion.this.f.query(3, 0);
            if (GlobalDefine.DEBUG_COMPANION) {
                StringBuilder sb = new StringBuilder();
                sb.append("------> 尝试处理缓存在“手助”的 \"SERVER返回结果\" 有 ==> [ ");
                sb.append(listQuery == null ? 0 : listQuery.size());
                sb.append(" ] 个SERVER 返回结果需要回传....");
                Log.i(GlobalDefine.TAG_COMPANION, sb.toString());
            }
            SolidLogger solidLogger = SolidLogger.getInstance();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("------> 尝试处理缓存在“手助”的 \"SERVER返回结果\" 有 ==> [ ");
            sb2.append(listQuery == null ? 0 : listQuery.size());
            sb2.append(" ] 个SERVER 返回结果需要回传....");
            solidLogger.with(GlobalDefine.TAG_COMPANION, sb2.toString());
            if (listQuery == null) {
                return null;
            }
            for (DataItem dataItem : listQuery) {
                if (dataItem != null) {
                    dataItem.setState(0);
                    dataItem.addFlags(4);
                    Task taskSendDataToApp = WearHttpCompanion.this.sendDataToApp(dataItem);
                    if (taskSendDataToApp != null) {
                        try {
                            WearHttpCompanion.this.e.next(taskSendDataToApp);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            WearHttpCompanion.this.e.execute();
            return null;
        }
    }

    private WearHttpCompanion(Context context) {
        this.c = context;
        o(context);
        p();
    }

    public static WearHttpCompanion getInstance() {
        if (l.get()) {
            return m;
        }
        throw new IllegalStateException("## Call doInit firstly !");
    }

    public static void init(Context context) {
        init(context, null);
    }

    public static void init(Context context, SolidLogger.SolidLoggerCallback solidLoggerCallback) {
        SolidLogger.setMute(false);
        SolidLogger.setFileDir(context.getFilesDir().getPath() + "/springchannel");
        SolidLogger.withContext(context);
        SolidLogger.setSolidLoggerCallback(solidLoggerCallback);
        if (m == null) {
            synchronized (WearHttpCompanion.class) {
                if (m == null) {
                    m = new WearHttpCompanion(context);
                }
            }
        }
        Serializer.getInstance(context);
        AlarmDriver.startAlarmDriver(context, GlobalDefine.INTERNAL_ALARM_FOR_WEAR_ASSIST);
    }

    public static void init(Context context, SolidLogger.SolidLoggerCallback solidLoggerCallback, TokenArrivalListener tokenArrivalListener) {
        init(context, solidLoggerCallback);
        m.setTokenArrivalListener(tokenArrivalListener);
    }

    private void l(Context context, String str) {
        try {
            DataCacher.getInstance(context).deleteAll();
            boolean z = GlobalDefine.DEBUG_COMPANION;
            Log.i(GlobalDefine.TAG_COMPANION, "Clear all cached data for uid ::: " + str);
            SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "Clear all cached data for uid ::: " + str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(DataItem dataItem) {
        boolean z = GlobalDefine.DEBUG_COMPANION;
        if (z) {
            Log.i(GlobalDefine.TAG_COMPANION, "send data to client from Wear Componion By BLT. owner: " + dataItem.getOwner() + " , targetWho: " + dataItem.getIdentifier() + " , action" + dataItem.getAction());
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "send data to client from Wear Componion By BLT. owner: " + dataItem.getOwner() + " , targetWho: " + dataItem.getIdentifier() + " , action" + dataItem.getAction());
        if (this.b.check()) {
            this.b.dataOut(dataItem, new d(dataItem));
            return;
        }
        if (z) {
            Log.i(GlobalDefine.TAG_COMPANION, "1 手表暂时不通，缓存Item: " + dataItem.toShortString());
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "1 手表暂时不通，缓存Item: " + dataItem.toShortString());
        if (this.f == null) {
            this.f = DataCacher.getInstance(this.c);
        }
        dataItem.setState(3);
        this.f.save(dataItem);
    }

    private void n(DataItem dataItem) throws Throwable {
        SolidLogger solidLogger;
        String str;
        SolidLogger solidLogger2;
        String str2;
        if (dataItem.hasFlag(4096)) {
            String extraValByKey = dataItem.getExtraValByKey(DataUtils.DataItemKey.EXTRA.KEY_EXTRA_EXTENSION_SLOT_POINT);
            if (!TextUtils.isEmpty(extraValByKey)) {
                try {
                    JSONObject jSONObject = new JSONObject(dataItem.getExtraValByKey(DataUtils.DataItemKey.EXTRA.KEY_EXTRA_EXTENSION_SLOT_FRAME));
                    jSONObject.put(extraValByKey, dataItem.getData());
                    dataItem.setData(jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        }
        boolean z = GlobalDefine.DEBUG_COMPANION;
        if (z) {
            Log.i(GlobalDefine.TAG_COMPANION, "Before send data to server from Wear Componion By HTTP : " + dataItem.toShortString());
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "Before send data to server from Wear Componion By HTTP : " + dataItem.toShortString());
        if (dataItem.hasFlag(256)) {
            q(dataItem);
        }
        DataItem dataItemRequest = this.i.request(this.c, dataItem, new HashMap());
        if (dataItemRequest != null) {
            if (z) {
                Log.i(GlobalDefine.TAG_COMPANION, "r已返回， Wear Componion By HTTP : " + dataItemRequest.toShortString());
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "r已返回，After send data to server from Wear Componion By HTTP : " + dataItemRequest.toShortString());
            if (dataItemRequest.getCode() != 200) {
                dataItemRequest.setState(4);
                if (z) {
                    Log.i(GlobalDefine.TAG_COMPANION, "\n\n未能-成功-发送 : " + dataItem.getIdentifier() + " , 数据： " + DataUtils.drillUnzipData(dataItem) + "\n\n");
                }
                solidLogger = SolidLogger.getInstance();
                str = "\n\n未能-成功-发送 : " + dataItem.getIdentifier() + " , 数据： " + DataUtils.drillUnzipData(dataItem) + "\n\n";
            } else {
                SyncProcessManager.getInstance().tellWith(dataItem.trackWho(), (byte) 9, new int[0]);
                dataItemRequest.setState(0);
                if (z) {
                    Log.i(GlobalDefine.TAG_COMPANION, "\n\n已經成功-发送 : " + dataItem.getIdentifier() + " , 数据： " + DataUtils.drillUnzipData(dataItem) + "\n\n");
                }
                solidLogger = SolidLogger.getInstance();
                str = "\n\n已經-成功-发送 : " + dataItem.getIdentifier() + " , 数据： " + DataUtils.drillUnzipData(dataItem) + "\n\n";
            }
            solidLogger.with(GlobalDefine.TAG_COMPANION, str);
            t(dataItemRequest);
            return;
        }
        if (z) {
            Log.i(GlobalDefine.TAG_COMPANION, "创建请求的时候发生错误，请检查。该次请求将被忽略！%%%%%%%%%%%%%% : targetWho : " + dataItem.getIdentifier() + " , owner: " + dataItem.getOwner() + " , action: " + dataItem.getAction());
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "创建请求的时候发生错误，请检查。该次请求将被忽略！%%%%%%%%%%%%%% : targetWho : " + dataItem.getIdentifier() + " , owner: " + dataItem.getOwner() + " , action: " + dataItem.getAction());
        if (this.f.delete(dataItem.getIdentifier())) {
            if (z) {
                Log.i(GlobalDefine.TAG_COMPANION, "从数据库中移除了如下请求item : targetWho : " + dataItem.getIdentifier() + " , owner: " + dataItem.getOwner() + " , action: " + dataItem.getAction());
            }
            solidLogger2 = SolidLogger.getInstance();
            str2 = "从数据库中移除了如下请求item : targetWho : " + dataItem.getIdentifier() + " , owner: " + dataItem.getOwner() + " , action: " + dataItem.getAction();
        } else {
            if (z) {
                Log.i(GlobalDefine.TAG_COMPANION, "从数据库中移除了如下请求item : targetWho : " + dataItem.getIdentifier() + " , owner: " + dataItem.getOwner() + " , action: " + dataItem.getAction() + "失败！！！！！！！");
            }
            solidLogger2 = SolidLogger.getInstance();
            str2 = "从数据库中移除了如下请求item : targetWho : " + dataItem.getIdentifier() + " , owner: " + dataItem.getOwner() + " , action: " + dataItem.getAction() + "失败！！！！！！！";
        }
        solidLogger2.with(GlobalDefine.TAG_COMPANION, str2);
    }

    private void o(Context context) {
        this.f = DataCacher.getInstance(context.getApplicationContext());
        if (this.b == null) {
            b bVar = new b();
            this.b = bVar;
            bVar.start(context);
        }
        if (this.i == null) {
            this.i = new HttpTransporter();
        }
        if (this.d == null) {
            this.d = new TaskManager("Data2SrvOverNetworkTaskManager");
        }
        if (this.e == null) {
            this.e = new TaskManager("Data2WatchOverBltTaskManager");
        }
        l.set(true);
    }

    private void p() {
        a aVar = new a();
        this.h = aVar;
        aVar.setName("EC-WearHttpCompanion");
    }

    private boolean q(DataItem dataItem) throws Throwable {
        if (dataItem.hasFlag(1024)) {
            String extraValByKey = dataItem.getExtraValByKey(DataUtils.DataItemKey.EXTRA.KEY_DUMPED_EXTRA_PATH);
            if (!TextUtils.isEmpty(extraValByKey)) {
                File file = new File(extraValByKey);
                boolean z = file.exists() && file.isFile();
                if (GlobalDefine.DEBUG_COMPANION) {
                    Log.i(GlobalDefine.TAG_COMPANION, "已经存在了etf文件 : " + dataItem.toShortString() + " , 有效吗： " + z);
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "已经存在了etf文件 : " + dataItem.toShortString() + " , 有效吗： " + z);
                if (z) {
                    return true;
                }
            }
        }
        String extraValByKey2 = dataItem.getExtraValByKey(DataUtils.DataItemKey.EXTRA.KEY_EXTRA_FILE_DATA);
        if (TextUtils.isEmpty(extraValByKey2)) {
            if (GlobalDefine.DEBUG_COMPANION) {
                Log.i(GlobalDefine.TAG_COMPANION, "No Extra Exf for : " + dataItem.toShortString() + " , but with THE FLAG!");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "No Extra Exf for : " + dataItem.toShortString() + " , but with THE FLAG!");
            return false;
        }
        String str = this.c.getFilesDir() + File.separator + (dataItem.getIdentifier() + System.currentTimeMillis());
        try {
            Utils.writeStringToFile(new File(str), extraValByKey2, "UTF-8");
            dataItem.removeExtraPairByKey(DataUtils.DataItemKey.EXTRA.KEY_EXTRA_FILE_DATA);
            dataItem.addFlags(1024);
            dataItem.addExtraPair(DataUtils.DataItemKey.EXTRA.KEY_DUMPED_EXTRA_PATH, str);
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(DataItem dataItem) {
        if (Boolean.valueOf(dataItem.getExtraValByKey("res")).booleanValue()) {
            notifyDataSyncSucceed(dataItem);
        } else {
            notifyDataSyncFailed(dataItem);
        }
    }

    private void s(DataItem dataItem) {
        if (GlobalDefine.DEBUG_COMPANION) {
            Log.i(GlobalDefine.TAG_COMPANION, "handlePlainDataItemToServer : " + dataItem.toShortString());
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "Handle Data From WearService : " + dataItem.toShortString());
        this.d.next(new e(Task.RunningStatus.WORK_THREAD, dataItem)).execute();
    }

    private void t(DataItem dataItem) throws Throwable {
        String str;
        SolidLogger solidLogger;
        boolean z = GlobalDefine.DEBUG_COMPANION;
        if (z) {
            Log.i(GlobalDefine.TAG_COMPANION, "process in wear companion for : " + dataItem.getOwner());
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "process in wear companion for : " + dataItem.getOwner());
        int state = dataItem.getState();
        if (state == 0) {
            this.e.next(new c(Task.RunningStatus.WORK_THREAD, dataItem)).execute();
            return;
        }
        if (state != 4) {
            if (state == 5) {
                n(dataItem);
                return;
            }
            Utils.log("Unimplemented state:" + state);
            return;
        }
        if (z) {
            Log.i(GlobalDefine.TAG_COMPANION, "send : " + dataItem.getOwner() + " , targetWho : " + dataItem.getIdentifier() + " , action: " + dataItem.getAction() + " , FAILED ! Will ###CACHE### it.");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "send : " + dataItem.getOwner() + " , targetWho : " + dataItem.getIdentifier() + " , action: " + dataItem.getAction() + " , FAILED ! Will ###CACHE### it.");
        if (this.f == null) {
            this.f = DataCacher.getInstance(this.c.getApplicationContext());
        }
        DataCacher dataCacher = this.f;
        if (dataCacher != null) {
            boolean zSave = dataCacher.save(dataItem);
            if (z) {
                Log.i(GlobalDefine.TAG_COMPANION, "Cached : " + dataItem.getOwner() + " , targetWho : " + dataItem.getIdentifier() + " , action: " + dataItem.getAction() + "--> result: " + zSave);
            }
            solidLogger = SolidLogger.getInstance();
            str = "Cached : " + dataItem.getOwner() + " , targetWho : " + dataItem.getIdentifier() + " , action: " + dataItem.getAction() + "--> result: " + zSave;
        } else {
            str = "Cacher is NULLL!LL!L!L!L!L";
            if (z) {
                Log.i(GlobalDefine.TAG_COMPANION, "Cacher is NULLL!LL!L!L!L!L");
            }
            solidLogger = SolidLogger.getInstance();
        }
        solidLogger.with(GlobalDefine.TAG_COMPANION, str);
    }

    private DataItem u(String str) {
        return this.f.query(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(DataItem dataItem) {
        if (!dataItem.hasFlag(16384)) {
            s(dataItem);
            return;
        }
        dataItem.setState(4);
        DataCacher.getInstance(this.c).save(dataItem);
        if (GlobalDefine.DEBUG_SERIAL_MODE) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "Immediately(直接就) ==> Saved Serial Item : " + dataItem.getIdentifier());
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "Immediately(直接就) ==> Saved Serial Item : " + dataItem.getIdentifier());
    }

    public void addTrafficMonitor(TrafficMonitor trafficMonitor) {
        if (this.j == null) {
            this.j = new ConcurrentHashMap<>();
        }
        synchronized (this.j) {
            if (!this.j.contains(trafficMonitor)) {
                this.j.put(trafficMonitor.targetAtPackage() + UpdateUtils.CMD_FILTER + trafficMonitor.targetAtAction(), trafficMonitor);
            }
        }
    }

    public EnumCollector getCollector() {
        if (this.h == null) {
            p();
        }
        return this.h;
    }

    public HttpTransporter getHttpTransporter() {
        return this.i;
    }

    public void manageCurrUserId(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("http_uid_storage", 0);
        if (!TextUtils.equals(sharedPreferences.getString("_uid", ""), str)) {
            l(context, str);
        }
        sharedPreferences.edit().putString("_uid", str).commit();
    }

    public void notifyDataSyncFailed(DataItem dataItem) {
        ManualDataSyncMonitor manualDataSyncMonitor = this.g;
        if (manualDataSyncMonitor != null) {
            manualDataSyncMonitor.notifyStateChangeFor(dataItem, -1);
        }
    }

    public void notifyDataSyncSucceed(DataItem dataItem) {
        ManualDataSyncMonitor manualDataSyncMonitor = this.g;
        if (manualDataSyncMonitor != null) {
            manualDataSyncMonitor.notifyStateChangeFor(dataItem, 0);
        }
    }

    public void removeTrafficMonitor(TrafficMonitor trafficMonitor) {
        ConcurrentHashMap<String, TrafficMonitor> concurrentHashMap = this.j;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        synchronized (this.j) {
            this.j.remove(trafficMonitor.targetAtPackage() + UpdateUtils.CMD_FILTER + trafficMonitor.targetAtAction());
        }
    }

    public Task sendDataToApp(DataItem dataItem) {
        if (dataItem == null) {
            return null;
        }
        if (!TextUtils.isEmpty(dataItem.getOwner())) {
            return new f(Task.RunningStatus.WORK_THREAD, dataItem);
        }
        throw new IllegalArgumentException("No Owner ! " + dataItem);
    }

    public void sendDataToServer(DataItem dataItem) throws Throwable {
        if (dataItem == null) {
            return;
        }
        if (TextUtils.isEmpty(dataItem.getOwner())) {
            throw new IllegalArgumentException("No Owner ! " + dataItem);
        }
        if (TextUtils.isEmpty(dataItem.getAction())) {
            if (GlobalDefine.DEBUG_COMPANION) {
                Log.i(GlobalDefine.TAG_COMPANION, "sendDataToServer WARNNING: NO ACTION FOUND FOR: " + dataItem.toShortString());
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "sendDataToServer WARNNING: NO ACTION FOUND FOR: " + dataItem.toShortString());
        }
        n(dataItem);
    }

    public void setDataSyncMonitor(ManualDataSyncMonitor manualDataSyncMonitor) {
        this.g = manualDataSyncMonitor;
    }

    public void setPublicParamsBuilder(PublicParamsBuilder publicParamsBuilder) {
        this.i.setPublicParamsBuilder(publicParamsBuilder);
    }

    public void setTokenArrivalListener(TokenArrivalListener tokenArrivalListener) {
        this.k = tokenArrivalListener;
    }

    public void tryProcessCachedRequestWhileNetWorkAvalible() {
        synchronized (this) {
            if (this.f != null && !this.a.get()) {
                this.d.next(new g(Task.RunningStatus.WORK_THREAD)).execute();
            }
        }
    }

    public void tryProcessCachedResponseWhileChannelAvalible() {
        if (this.f == null) {
            return;
        }
        this.d.next(new h(Task.RunningStatus.WORK_THREAD)).execute();
    }
}
