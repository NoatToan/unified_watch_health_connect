package com.huami.watch.transport.httpsupport.StageFright;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import clc.utils.taskmanager.Task;
import clc.utils.taskmanager.TaskManager;
import clc.utils.taskmanager.TaskOperation;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.huami.watch.transport.httpsupport.control.assist.WearHttpCompanion;
import com.huami.watch.transport.httpsupport.global.GlobalDataSyncKicker;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public class Serializer {
    private static volatile Serializer c;
    private static final HashSet<String> d;
    private static ConcurrentHashMap<String, HashSet<ReportListInfo>> e;
    private static TaskManager f;
    private static TaskManager g;
    private boolean a = false;
    private Context b;

    public class a extends Task {
        public final /* synthetic */ ProcessStateMonitor g;
        public final /* synthetic */ DataItem h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Task.RunningStatus runningStatus, DataItem dataItem, ProcessStateMonitor processStateMonitor) {
            super(runningStatus);
            this.h = dataItem;
            this.g = processStateMonitor;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            Serializer.this.a = true;
            ReportListInfo reportListInfoK = Serializer.this.k(this.h);
            if (reportListInfoK == null) {
                Serializer.this.a = false;
                return null;
            }
            if (Serializer.e == null) {
                ConcurrentHashMap unused = Serializer.e = new ConcurrentHashMap();
            }
            HashSet hashSet = (HashSet) Serializer.e.get(this.h.getIdentifier());
            if (hashSet == null) {
                ConcurrentHashMap concurrentHashMap = Serializer.e;
                String identifier = this.h.getIdentifier();
                HashSet hashSet2 = new HashSet();
                concurrentHashMap.put(identifier, hashSet2);
                hashSet = hashSet2;
            }
            hashSet.add(reportListInfoK);
            if (TextUtils.isEmpty(this.h.getExtraValByKey("keyf"))) {
                if (GlobalDefine.DEBUG_SERVER) {
                    Log.i(GlobalDefine.TAG_SRV, "arrival ，收到了非主键 ： " + this.h);
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "arrival ，收到了非主键 ： " + this.h);
            } else {
                SyncProcessManager.getInstance().tellWith(this.h.trackWho(), (byte) 2, new int[0]);
                boolean z = GlobalDefine.DEBUG_SERVER;
                if (z) {
                    Log.i(GlobalDefine.TAG_SRV, "arrival ，收到了\"主键\" ： " + this.h);
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "arrival ，收到了\"主键\" ： " + this.h);
                if (Serializer.this.j(hashSet)) {
                    SyncProcessManager.getInstance().tellWith(this.h.trackWho(), (byte) 6, new int[0]);
                    if (z) {
                        Log.i(GlobalDefine.TAG_SRV, "KEYF说#####需要触发数据上报的action，因为有数据存在");
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "KEYF说#####需要触发数据上报的action，因为有数据存在");
                    Serializer.this.m(this.g, hashSet);
                    Serializer.this.a = true;
                } else {
                    Serializer.this.r(this.g, this.h.trackWho());
                }
            }
            return null;
        }
    }

    public class b extends Task {
        public final /* synthetic */ ProcessStateMonitor g;
        public final /* synthetic */ ConcurrentHashMap h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Task.RunningStatus runningStatus, ProcessStateMonitor processStateMonitor, ConcurrentHashMap concurrentHashMap) {
            super(runningStatus);
            this.g = processStateMonitor;
            this.h = concurrentHashMap;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            HashSet<HolyBaby> hashSetZygoteAddAndFillHomeWorkAndKickToFly = HolyBaby.zygoteAddAndFillHomeWorkAndKickToFly(Serializer.this.b, this.g, this.h, Serializer.g);
            if (hashSetZygoteAddAndFillHomeWorkAndKickToFly != null) {
                hashSetZygoteAddAndFillHomeWorkAndKickToFly.isEmpty();
            }
            this.g.onUpdateAssist2CloudState((byte) 2);
            this.h.clear();
            return null;
        }
    }

    public class c extends Task {
        public final /* synthetic */ String g;
        public final /* synthetic */ ConcurrentLinkedQueue h;
        public final /* synthetic */ ProcessStateMonitor i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Task.RunningStatus runningStatus, String str, String str2, ProcessStateMonitor processStateMonitor, ConcurrentLinkedQueue concurrentLinkedQueue) {
            super(runningStatus);
            this.g = str;
            this.j = str2;
            this.i = processStateMonitor;
            this.h = concurrentLinkedQueue;
        }

        private void a(DataItem dataItem) throws Throwable {
            this.h.poll();
            dataItem.addFlags(4);
            WearHttpCompanion.getInstance().sendDataToServer(dataItem);
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) throws Throwable {
            StringBuilder sb;
            DataItem dataItemQuery = DataCacher.getInstance(Serializer.this.b).query(this.g);
            if (dataItemQuery == null) {
                sb = new StringBuilder();
                sb.append("并没有找到 ==> REAL ITEM 并没有：\u3000");
                sb.append(this.g);
                sb.append(" , 问题严重但还好是并发传....");
                Log.i(GlobalDefine.TAG_SERIAL_MODE, sb.toString());
                SyncProcessManager.getInstance().tellWith(this.j, (byte) 9, new int[0]);
            } else {
                sb = new StringBuilder();
                sb.append("REAL ITEM 找到了：\u3000");
                sb.append(dataItemQuery);
                Log.i(GlobalDefine.TAG_SERIAL_MODE, sb.toString());
                a(dataItemQuery);
            }
            this.i.finishOneAssist2Cloud(dataItemQuery);
            return null;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        d = hashSet;
        hashSet.add("com.huami.watch.wearservices");
        hashSet.add("com.huami.watch.hmwatchmanager");
        hashSet.add("com.huami.watch.test");
        g = new TaskManager("s-machine");
        f = new TaskManager("p-machine");
    }

    private Serializer(Context context) {
        this.b = null;
        this.b = context;
    }

    public static Serializer getInstance(Context context) {
        Serializer serializer;
        synchronized (Serializer.class) {
            if (c == null) {
                synchronized (Serializer.class) {
                    if (c == null) {
                        c = new Serializer(context);
                    }
                }
            }
            serializer = c;
        }
        return serializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j(HashSet<ReportListInfo> hashSet) {
        for (ReportListInfo reportListInfo : hashSet) {
            if (reportListInfo.isKey && ReportListInfo.hasData(reportListInfo)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReportListInfo k(DataItem dataItem) {
        if (dataItem == null) {
            return null;
        }
        return ReportListInfo.from(dataItem.getExtraValByKey("report-list"), !TextUtils.isEmpty(dataItem.getExtraValByKey("keyf")));
    }

    private void l(ProcessStateMonitor processStateMonitor, ConcurrentHashMap<String, ConcurrentLinkedQueue<String>> concurrentHashMap) {
        for (String str : concurrentHashMap.keySet()) {
            ConcurrentLinkedQueue<String> concurrentLinkedQueue = concurrentHashMap.get(str);
            processStateMonitor.appendSumOfNeedAssist2Cloud(concurrentLinkedQueue.size());
            Iterator<String> it2 = concurrentLinkedQueue.iterator();
            while (it2.hasNext()) {
                f.next(new c(Task.RunningStatus.WORK_THREAD, it2.next(), str, processStateMonitor, concurrentLinkedQueue));
            }
        }
        f.execute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(ProcessStateMonitor processStateMonitor, HashSet<ReportListInfo> hashSet) {
        ConcurrentHashMap<String, HashSet<String>> concurrentHashMapS = s(hashSet);
        if (concurrentHashMapS == null || concurrentHashMapS.isEmpty()) {
            r(processStateMonitor, processStateMonitor.trackWho());
            return;
        }
        Set<String> setKeySet = concurrentHashMapS.keySet();
        HashSet<String> hashSet2 = new HashSet<>();
        for (String str : setKeySet) {
            if (GlobalDefine.DEBUG_SERIAL_MODE) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "kickUploadPoorMachine ：" + processStateMonitor.trackWho() + " hash:" + processStateMonitor.hashCode());
            }
            hashSet2.addAll(concurrentHashMapS.get(str));
        }
        int size = hashSet2.size();
        if (processStateMonitor != null) {
            processStateMonitor.appendSumOfNeedRom2Assist(size);
            processStateMonitor.startWaitForDataItems(hashSet2);
            processStateMonitor.onUpdateRom2AssistState((byte) 1);
        }
        WearHttpCompanion.getInstance().getCollector().addActionAndExecute(GlobalDataSyncKicker.getInstance().genInternalSyncAction(null, Command.CMD_TRIGGER_POOR_MAN_UPLOAD_LIST));
    }

    private void n(ProcessStateMonitor processStateMonitor, ConcurrentHashMap<String, ConcurrentLinkedQueue<String>> concurrentHashMap) {
        g.next(new b(Task.RunningStatus.WORK_THREAD, processStateMonitor, concurrentHashMap)).execute();
    }

    private int o(ProcessStateMonitor processStateMonitor, ConcurrentLinkedQueue<ConcurrentHashMap<String, List<DataItem>>> concurrentLinkedQueue) {
        ConcurrentLinkedQueue<String> concurrentLinkedQueue2;
        String identifier;
        ConcurrentHashMap<String, ConcurrentLinkedQueue<String>> concurrentHashMap = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, ConcurrentLinkedQueue<String>> concurrentHashMap2 = new ConcurrentHashMap<>();
        int i = 0;
        if (concurrentLinkedQueue != null) {
            for (ConcurrentHashMap<String, List<DataItem>> concurrentHashMap3 : concurrentLinkedQueue) {
                if (concurrentHashMap3 != null) {
                    Set<String> setKeySet = concurrentHashMap3.keySet();
                    String strTargetAtPackage = processStateMonitor.targetAtPackage();
                    processStateMonitor.extractTargetActions();
                    boolean zEquals = TextUtils.equals(strTargetAtPackage, "*");
                    for (String str : setKeySet) {
                        Log.i(GlobalDefine.TAG_SERIAL_MODE, "===> 这个item action的list: " + str + " , 即将被处理.");
                        for (DataItem dataItem : concurrentHashMap3.get(str)) {
                            if (dataItem != null) {
                                if (TextUtils.equals(dataItem.getOwner(), strTargetAtPackage) || zEquals) {
                                    if (ReportListInfo.isItemNeedSerial(dataItem)) {
                                        identifier = dataItem.getIdentifier().replace(".", "");
                                        i++;
                                        concurrentLinkedQueue2 = concurrentHashMap.get(str);
                                        if (concurrentLinkedQueue2 == null) {
                                            concurrentLinkedQueue2 = new ConcurrentLinkedQueue<>();
                                            concurrentHashMap.put(str, concurrentLinkedQueue2);
                                        }
                                    } else {
                                        i++;
                                        concurrentLinkedQueue2 = concurrentHashMap2.get(str);
                                        if (concurrentLinkedQueue2 == null) {
                                            concurrentLinkedQueue2 = new ConcurrentLinkedQueue<>();
                                            concurrentHashMap2.put(str, concurrentLinkedQueue2);
                                        }
                                        identifier = dataItem.getIdentifier();
                                    }
                                    concurrentLinkedQueue2.add(identifier);
                                } else {
                                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "letsDance ===> 扔掉：" + dataItem.toShortString() + " , for ： " + processStateMonitor.trackWho());
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!concurrentHashMap.isEmpty() && !concurrentHashMap.keySet().isEmpty()) {
            n(processStateMonitor, concurrentHashMap);
        }
        if (!concurrentHashMap2.isEmpty() && !concurrentHashMap2.keySet().isEmpty()) {
            l(processStateMonitor, concurrentHashMap2);
        }
        return i;
    }

    private static void p() {
    }

    private static void q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(ProcessStateMonitor processStateMonitor, String str) {
        if (e == null) {
            e = new ConcurrentHashMap<>();
        }
        if (processStateMonitor.getReportId() == null) {
            return;
        }
        int iO = o(processStateMonitor, wholeFuseAndSort(e.get(processStateMonitor.getReportId())));
        if (iO > 0) {
            SyncProcessManager.getInstance().tellWith(str, (byte) 8, iO);
            SyncProcessManager.getInstance().tellWith(str, (byte) 3, iO);
            processStateMonitor.setSumOfNeedAssist2Cloud(iO);
            processStateMonitor.onUpdateAssist2CloudState((byte) 5);
        } else if (iO == 0) {
            SyncProcessManager.getInstance().tellWith(str, (byte) 5, new int[0]);
            processStateMonitor.onFinish(str, 0);
            AnalysisStage.getInstance().removeReportArrivalListener(processStateMonitor);
        }
        e.remove(processStateMonitor.getReportId());
    }

    private ConcurrentHashMap<String, HashSet<String>> s(HashSet<ReportListInfo> hashSet) {
        ConcurrentHashMap<String, HashSet<String>> concurrentHashMap = new ConcurrentHashMap<>();
        int i = 0;
        for (ReportListInfo reportListInfo : hashSet) {
            for (Integer num : reportListInfo.getWhomMapThings().keySet()) {
                if (num.intValue() != 2) {
                    for (String str : reportListInfo.getWhomMapThings().get(num)) {
                        HashSet<String> hashSet2 = concurrentHashMap.get(str);
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet<>();
                            concurrentHashMap.put(str, hashSet2);
                        }
                        Iterator<DataItem> it2 = reportListInfo.getThings().get(str).iterator();
                        while (it2.hasNext()) {
                            String strReplace = it2.next().getIdentifier().replace(".", "");
                            if (!hashSet2.contains(strReplace)) {
                                i++;
                                if (GlobalDefine.DEBUG_SERIAL_MODE) {
                                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "arrival --> add targetWho to WAIT: " + str + " : " + strReplace + " 当前数目：" + i);
                                }
                            }
                            hashSet2.add(strReplace);
                        }
                    }
                }
            }
        }
        if (GlobalDefine.DEBUG_SERIAL_MODE) {
            if (GlobalDefine.DEBUG_SERVER) {
                Log.i(GlobalDefine.TAG_SRV, "toItemIdSet : " + concurrentHashMap);
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "toItemIdSet : " + concurrentHashMap);
        }
        return concurrentHashMap;
    }

    public void beginRecord(String str) {
        synchronized (this) {
            ConcurrentHashMap<String, HashSet<ReportListInfo>> concurrentHashMap = e;
            if (concurrentHashMap != null) {
                HashSet<ReportListInfo> hashSet = concurrentHashMap.get(str);
                if (hashSet != null) {
                    hashSet.clear();
                }
            } else {
                e = new ConcurrentHashMap<>();
            }
        }
    }

    public void feedRecord() {
        synchronized (this) {
        }
    }

    public boolean isBusy() {
        return this.a;
    }

    public void onEventOfDanceWith(ProcessStateMonitor processStateMonitor) {
        synchronized (this) {
            r(processStateMonitor, processStateMonitor.trackWho());
        }
    }

    public void onEventProcessReportItem(ProcessStateMonitor processStateMonitor, DataItem dataItem) {
        synchronized (this) {
            g.next(new a(Task.RunningStatus.WORK_THREAD, dataItem, processStateMonitor)).execute();
        }
    }

    public ConcurrentLinkedQueue<ConcurrentHashMap<String, List<DataItem>>> wholeFuseAndSort(HashSet<ReportListInfo> hashSet) {
        synchronized (this) {
            if (hashSet == null) {
                return null;
            }
            ConcurrentLinkedQueue<ConcurrentHashMap<String, List<DataItem>>> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
            for (ReportListInfo reportListInfo : hashSet) {
                if (reportListInfo != null) {
                    for (ConcurrentLinkedQueue<DataItem> concurrentLinkedQueue2 : reportListInfo.getThings().values()) {
                        if (concurrentLinkedQueue2 != null) {
                            ConcurrentHashMap<String, List<DataItem>> concurrentHashMap = new ConcurrentHashMap<>();
                            for (DataItem dataItem : concurrentLinkedQueue2) {
                                if (dataItem != null) {
                                    String owner = dataItem.getOwner();
                                    if (concurrentHashMap.get(owner) == null) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(dataItem);
                                        concurrentHashMap.put(owner, arrayList);
                                    } else {
                                        concurrentHashMap.get(owner).add(dataItem);
                                    }
                                }
                            }
                            concurrentLinkedQueue.add(concurrentHashMap);
                        }
                    }
                }
            }
            return concurrentLinkedQueue;
        }
    }
}
