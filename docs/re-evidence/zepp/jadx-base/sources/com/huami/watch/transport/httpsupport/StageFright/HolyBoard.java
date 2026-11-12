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
import com.huami.watch.transport.httpsupport.client.Constants;
import com.huami.watch.transport.httpsupport.control.assist.WearHttpCompanion;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class HolyBoard {
    private static volatile HolyBoard c;
    private Context a;
    private ConcurrentHashMap<String, WeakReference<ConcurrentLinkedQueue<HolyBaby>>> b = new ConcurrentHashMap<>();

    public class a implements Comparator<DataItem> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(DataItem dataItem, DataItem dataItem2) {
            Long lValueOf;
            Long lValueOf2 = null;
            try {
                String identifier = dataItem.getIdentifier();
                String identifier2 = dataItem2.getIdentifier();
                lValueOf = Long.valueOf(identifier);
                try {
                    lValueOf2 = Long.valueOf(identifier2);
                    if (lValueOf == null) {
                        lValueOf = 0L;
                    }
                    if (lValueOf2 == null) {
                        lValueOf2 = 0L;
                    }
                    if (lValueOf == lValueOf2) {
                        return 0;
                    }
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e = e2;
                lValueOf = null;
            }
            return lValueOf.longValue() - lValueOf2.longValue() < 0 ? -1 : 1;
        }
    }

    public class b extends Task {
        public final /* synthetic */ HolyBaby g;
        public final /* synthetic */ ProcessStateMonitor h;
        public final /* synthetic */ String i;
        public final /* synthetic */ TaskManager j;

        public class a extends Task {
            public final /* synthetic */ HolyBaby g;
            public final /* synthetic */ ProcessStateMonitor h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Task.RunningStatus runningStatus, ProcessStateMonitor processStateMonitor, HolyBaby holyBaby) {
                super(runningStatus);
                this.h = processStateMonitor;
                this.g = holyBaby;
            }

            @Override // clc.utils.taskmanager.Task
            public TaskOperation onExecute(TaskOperation taskOperation) {
                this.h.onFinish(this.g.parent(), -1);
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Task.RunningStatus runningStatus, String str, HolyBaby holyBaby, ProcessStateMonitor processStateMonitor, TaskManager taskManager) {
            super(runningStatus);
            this.i = str;
            this.g = holyBaby;
            this.h = processStateMonitor;
            this.j = taskManager;
        }

        private void a(TaskManager taskManager, DataItem dataItem) {
            if (dataItem != null) {
                boolean z = GlobalDefine.DEBUG_SERIAL_MODE;
                if (z) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "r已返回， Wear Componion By HTTP : " + dataItem.toShortString());
                }
                if (z) {
                    SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "r已返回，After send data to server from Wear Componion By HTTP : " + dataItem.toShortString());
                }
                b(taskManager, dataItem, this.g, this.h);
                return;
            }
            boolean z2 = GlobalDefine.DEBUG_SERIAL_MODE;
            if (z2) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "创建请求的时候发生错误，请检查。该次请求将被忽略！%%%%%%%%%%%%%% : targetWho : " + dataItem.getIdentifier() + " , owner: " + dataItem.getOwner() + " , action: " + dataItem.getAction());
            }
            if (z2) {
                SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "创建请求的时候发生错误，请检查。该次请求将被忽略！%%%%%%%%%%%%%% : targetWho : " + dataItem.getIdentifier() + " , owner: " + dataItem.getOwner() + " , action: " + dataItem.getAction());
            }
            if (DataCacher.getInstance(HolyBoard.this.a).delete(dataItem.getIdentifier())) {
                if (z2) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "从数据库中移除了如下请求item : targetWho : " + dataItem.getIdentifier() + " , owner: " + dataItem.getOwner() + " , action: " + dataItem.getAction());
                }
                if (z2) {
                    SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "从数据库中移除了如下请求item : targetWho : " + dataItem.getIdentifier() + " , owner: " + dataItem.getOwner() + " , action: " + dataItem.getAction());
                }
            } else {
                if (z2) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "从数据库中移除了如下请求item : targetWho : " + dataItem.getIdentifier() + " , owner: " + dataItem.getOwner() + " , action: " + dataItem.getAction() + "失败！！！！！！！");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_COMPANION, "从数据库中移除了如下请求item : targetWho : " + dataItem.getIdentifier() + " , owner: " + dataItem.getOwner() + " , action: " + dataItem.getAction() + "失败！！！！！！！");
            }
            SyncProcessManager.getInstance().tellWith(dataItem.trackWho(), (byte) 9, new int[0]);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0160  */
        /* JADX WARN: Instruction removed from duplicated block: B:37:0x0160, please report this as an issue */
        private void b(TaskManager taskManager, DataItem dataItem, HolyBaby holyBaby, ProcessStateMonitor processStateMonitor) {
            String str;
            SolidLogger solidLogger;
            StringBuilder sb;
            if (dataItem.getCode() == 200) {
                boolean z = GlobalDefine.DEBUG_SERIAL_MODE;
                if (z) {
                    if (z) {
                        Log.i(GlobalDefine.TAG_SERIAL_MODE, "HTTP 请求  成功了 : " + dataItem.toShortString());
                        Log.i(GlobalDefine.TAG_SERIAL_MODE, "HTTP 请求  成功x: " + dataItem.getIdentifier() + "  who: " + dataItem.trackWho());
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "HTTP 请求  成功了 : " + dataItem.toShortString());
                }
                SyncProcessManager.getInstance().tellWith(holyBaby.parent(), (byte) 9, new int[0]);
                dataItem.setState(0);
                dataItem.addFlags(4);
                this.j.next(WearHttpCompanion.getInstance().sendDataToApp(dataItem));
                HolyBoard.this.h(taskManager, holyBaby, processStateMonitor, this.i);
                return;
            }
            HolyBoard.this.n(holyBaby);
            if (GlobalDefine.isOverSea()) {
                String url = dataItem.getUrl();
                if (url != null && !url.contains(Constants.STR_MATCH_US.toLowerCase()) && !url.contains(Constants.STR_MATCH_US.toUpperCase())) {
                    str = "DROPPED !账号是海外的，但这个数据是国内的，但是url是 ";
                    if (GlobalDefine.DEBUG_SERIAL_MODE) {
                        Log.i(GlobalDefine.TAG_SERIAL_MODE, "DROPPED !账号是海外的，但这个数据是国内的，但是url是 " + dataItem.getUrl() + " , " + dataItem.toShortString());
                    }
                    solidLogger = SolidLogger.getInstance();
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(dataItem.getUrl());
                    sb.append(" , ");
                    sb.append(dataItem.toShortString());
                    solidLogger.with(GlobalDefine.TAG_SERIAL_MODE, sb.toString());
                    HolyBoard.this.h(taskManager, holyBaby, processStateMonitor, this.i);
                    return;
                }
                if (GlobalDefine.DEBUG_SERIAL_MODE) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "HTTP 请求并没有成功，需要重试 : " + dataItem.toShortString() + " code : " + dataItem.getCode());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "HTTP 请求并没有成功，需要重试 : " + dataItem.toShortString() + " code : " + dataItem.getCode());
                this.j.next(new a(Task.RunningStatus.WORK_THREAD, processStateMonitor, holyBaby)).execute();
            }
            String url2 = dataItem.getUrl();
            if (url2 != null && (url2.contains(Constants.STR_MATCH_US.toLowerCase()) || url2.contains(Constants.STR_MATCH_US.toUpperCase()))) {
                str = "DROPPED !账号是国内的，但这个数据是海外的，但是url是 ";
                if (GlobalDefine.DEBUG_SERIAL_MODE) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "DROPPED !账号是国内的，但这个数据是海外的，但是url是 " + dataItem.getUrl() + " , " + dataItem.toShortString());
                }
                solidLogger = SolidLogger.getInstance();
                sb = new StringBuilder();
                sb.append(str);
                sb.append(dataItem.getUrl());
                sb.append(" , ");
                sb.append(dataItem.toShortString());
                solidLogger.with(GlobalDefine.TAG_SERIAL_MODE, sb.toString());
                HolyBoard.this.h(taskManager, holyBaby, processStateMonitor, this.i);
                return;
            }
            if (GlobalDefine.DEBUG_SERIAL_MODE) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "HTTP 请求并没有成功，需要重试 : " + dataItem.toShortString() + " code : " + dataItem.getCode());
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "HTTP 请求并没有成功，需要重试 : " + dataItem.toShortString() + " code : " + dataItem.getCode());
            this.j.next(new a(Task.RunningStatus.WORK_THREAD, processStateMonitor, holyBaby)).execute();
        }

        private boolean c() {
            boolean zNextBoolean = new Random().nextBoolean();
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "结果random  成功x : " + zNextBoolean);
            return zNextBoolean;
        }

        private void d(TaskManager taskManager, DataItem dataItem) {
            boolean z = GlobalDefine.DEBUG_SERIAL_MODE;
            if (z) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "上传 : " + dataItem.getIdentifier());
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "上传 : " + dataItem.getIdentifier());
            if (z) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "Before send data to server from Wear Componion By HTTP : " + dataItem.toShortString());
            }
            if (z) {
                SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "Before send data to server from Wear Componion By HTTP : " + dataItem.toShortString());
            }
            a(taskManager, WearHttpCompanion.getInstance().getHttpTransporter().request(HolyBoard.this.a, dataItem, new HashMap()));
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            DataItem dataItemQuery = DataCacher.getInstance(HolyBoard.this.a).query(this.i, 2);
            if (dataItemQuery == null) {
                if (GlobalDefine.DEBUG_SERIAL_MODE) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "BABE CRY~~~~ 并没有找到 ==> REAL ITEM 并没有：\u3000" + this.i + " , 问题严重了....");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "BABE CRY~~~~ 并没有找到 ==> REAL ITEM 并没有：\u3000" + this.i + " , 问题严重了....");
                this.g.finishHomeWork(HolyBoard.this.a, this.i);
                String strNextHomeWork = this.g.nextHomeWork();
                if (TextUtils.isEmpty(strNextHomeWork)) {
                    HolyBoard.this.k(this.g);
                    if (TextUtils.isEmpty(this.g.parent())) {
                        Log.i(GlobalDefine.TAG_SERIAL_MODE, "PARENT is NULL !!!!!!!!!!!!!!!!!!!!!!!!! === IGNORE " + this.g);
                        return null;
                    }
                    String strPollHolyParentTarget = this.h.pollHolyParentTarget();
                    if (!TextUtils.isEmpty(strPollHolyParentTarget)) {
                        HolyBoard.this.kickToFly(this.j, this.h, strPollHolyParentTarget);
                    }
                } else {
                    HolyBoard.this.f(this.j, this.g, strNextHomeWork, this.h);
                }
                return null;
            }
            dataItemQuery.addFlags(16384);
            if (GlobalDefine.DEBUG_SERIAL_MODE) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "REAL ITEM 找到了：\u3000" + dataItemQuery);
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "REAL ITEM 找到了：\u3000" + dataItemQuery);
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "顺序： " + dataItemQuery.getIdentifier() + " , for : " + this.g.parent() + ":" + this.g.getIdentifier() + ":" + this.h.name + ":" + this.h.hashCode());
            d(this.j, dataItemQuery);
            this.h.finishOneAssist2Cloud(dataItemQuery);
            return null;
        }
    }

    public class c extends Task {
        public final /* synthetic */ ProcessStateMonitor g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Task.RunningStatus runningStatus, ProcessStateMonitor processStateMonitor) {
            super(runningStatus);
            this.g = processStateMonitor;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            if (!this.g.isAllHolyFinished()) {
                return null;
            }
            ProcessStateMonitor processStateMonitor = this.g;
            processStateMonitor.onFinish(processStateMonitor.targetWho(), 0);
            return null;
        }
    }

    private HolyBoard(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(TaskManager taskManager, HolyBaby holyBaby, String str, ProcessStateMonitor processStateMonitor) {
        taskManager.next(new b(Task.RunningStatus.WORK_THREAD, str, holyBaby, processStateMonitor, taskManager)).execute();
    }

    private ConcurrentLinkedQueue<HolyBaby> g(String str) {
        ConcurrentLinkedQueue<HolyBaby> concurrentLinkedQueue;
        synchronized (this) {
            List<DataItem> listQueryAllHolyBaby = DataCacher.getInstance(this.a).queryAllHolyBaby(str);
            ArrayList arrayList = new ArrayList();
            for (DataItem dataItem : listQueryAllHolyBaby) {
                try {
                    Long.valueOf(dataItem.getIdentifier());
                } catch (Exception unused) {
                    arrayList.add(dataItem);
                    DataCacher.getInstance(this.a).delete(dataItem.getIdentifier());
                }
            }
            listQueryAllHolyBaby.removeAll(arrayList);
            m(str, listQueryAllHolyBaby);
            concurrentLinkedQueue = this.b.get(str).get();
        }
        return concurrentLinkedQueue;
    }

    public static HolyBoard getInstance(Context context) {
        if (c == null) {
            synchronized (HolyBoard.class) {
                if (c == null) {
                    c = new HolyBoard(context);
                }
            }
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(TaskManager taskManager, HolyBaby holyBaby, ProcessStateMonitor processStateMonitor, String str) {
        holyBaby.finishHomeWork(this.a, str);
        if (holyBaby.hasMoreHomeWork()) {
            f(taskManager, holyBaby, holyBaby.nextHomeWork(), processStateMonitor);
            return;
        }
        k(holyBaby);
        processStateMonitor.finishHolyWho(holyBaby.parent());
        String strPollHolyParentTarget = processStateMonitor.pollHolyParentTarget();
        if (TextUtils.isEmpty(strPollHolyParentTarget)) {
            taskManager.next(new c(Task.RunningStatus.WORK_THREAD, processStateMonitor)).execute();
        } else {
            kickToFly(taskManager, processStateMonitor, strPollHolyParentTarget);
        }
    }

    private ConcurrentLinkedQueue<HolyBaby> i(String str) {
        ConcurrentLinkedQueue<HolyBaby> concurrentLinkedQueueJ;
        synchronized (this) {
            concurrentLinkedQueueJ = j(str, false);
        }
        return concurrentLinkedQueueJ;
    }

    private ConcurrentLinkedQueue<HolyBaby> j(String str, boolean z) {
        ConcurrentLinkedQueue<HolyBaby> concurrentLinkedQueue;
        synchronized (this) {
            WeakReference<ConcurrentLinkedQueue<HolyBaby>> weakReference = this.b.get(str);
            if (weakReference == null || weakReference.get() == null || z) {
                weakReference = new WeakReference<>(new ConcurrentLinkedQueue());
                this.b.put(str, weakReference);
                g(str);
            }
            concurrentLinkedQueue = weakReference.get();
        }
        return concurrentLinkedQueue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(HolyBaby holyBaby) {
        SolidLogger solidLogger;
        String str;
        boolean z = GlobalDefine.DEBUG_SERIAL_MODE;
        if (z) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "************ Congratulate graduation for : " + holyBaby + "  *********** ");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "************ Congratulate graduation for : " + holyBaby + "  *********** ");
        if (DataCacher.getInstance(this.a).delete(holyBaby.getIdentifier())) {
            str = "************WOWOWOWO*********** ";
            if (z) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "************WOWOWOWO*********** ");
            }
            solidLogger = SolidLogger.getInstance();
        } else {
            if (z) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "*WARNING ==>>> 但是这个child并没有在数据库... : " + holyBaby + "  *********** ");
            }
            solidLogger = SolidLogger.getInstance();
            str = "*WARNING ==>>> 但是这个child并没有在数据库... : " + holyBaby + "  *********** ";
        }
        solidLogger.with(GlobalDefine.TAG_SERIAL_MODE, str);
    }

    private HolyBaby l(String str) {
        HolyBaby holyBabyPoll;
        synchronized (this) {
            holyBabyPoll = j(str, false).poll();
        }
        return holyBabyPoll;
    }

    private void m(String str, List<DataItem> list) {
        Collections.sort(list, new a());
        Iterator<DataItem> it2 = list.iterator();
        while (it2.hasNext()) {
            i(str).add(HolyBaby.from(it2.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(HolyBaby holyBaby) {
        synchronized (this) {
            j(holyBaby.parent(), true);
        }
    }

    public void addBaby(HolyBaby holyBaby) {
        synchronized (this) {
            if (GlobalDefine.DEBUG_SERIAL_MODE) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "增加了新的HOLY BABY : " + holyBaby.getIdentifier() + "  , parent : " + holyBaby.parent());
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "增加了新的HOLY BABY : " + holyBaby.getIdentifier() + "  , parent : " + holyBaby.parent());
            j(holyBaby.parent(), false).add(holyBaby);
            j(holyBaby.parent(), true);
            DataCacher.getInstance(this.a).save(holyBaby);
        }
    }

    public void kickToFly(TaskManager taskManager, ProcessStateMonitor processStateMonitor, String str) {
        synchronized (this) {
            HolyBaby holyBabyPollNextBabyAndSendToStage = pollNextBabyAndSendToStage(str);
            if (GlobalDefine.DEBUG_SERIAL_MODE) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "BABE 下一个 ===> 下一个BABE 是： " + holyBabyPollNextBabyAndSendToStage + " , for: " + str);
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "BABE 下一个 ===> 下一个BABE 是： " + holyBabyPollNextBabyAndSendToStage + " , for: " + str);
            if (holyBabyPollNextBabyAndSendToStage == null) {
                while (i(str).peek() != null && (holyBabyPollNextBabyAndSendToStage = l(str)) == null) {
                }
                if (holyBabyPollNextBabyAndSendToStage == null) {
                    processStateMonitor.finishHolyWho(str);
                    SyncProcessManager.getInstance().tellWith(str, (byte) 5, new int[0]);
                    boolean z = GlobalDefine.DEBUG_SERIAL_MODE;
                    if (z) {
                        Log.i(GlobalDefine.TAG_SERIAL_MODE, "================看上去已经没有任务了######！ , for: " + str);
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "================看上去已经没有任务了######！ , for: " + str);
                    if (processStateMonitor.isAllHolyFinished()) {
                        processStateMonitor.onFinish(str, 0);
                        if (z) {
                            Log.i(GlobalDefine.TAG_SERIAL_MODE, "================所有已经完成了任务######！ , for: " + processStateMonitor.targetWho());
                        }
                        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "================所有已经完成了任务######！ , for: " + processStateMonitor.targetWho());
                    } else {
                        String strPollHolyParentTarget = processStateMonitor.pollHolyParentTarget();
                        if (!TextUtils.isEmpty(strPollHolyParentTarget)) {
                            kickToFly(taskManager, processStateMonitor, strPollHolyParentTarget);
                        }
                    }
                    return;
                }
                if (GlobalDefine.DEBUG_SERIAL_MODE) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "BABE 下一个 ===> 经过查询后，找到 下一个BABE 是： " + holyBabyPollNextBabyAndSendToStage + " , for: " + str);
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "BABE 下一个 ===> 经过查询后，找到 下一个BABE 是： " + holyBabyPollNextBabyAndSendToStage + " , for: " + str);
            }
            f(taskManager, holyBabyPollNextBabyAndSendToStage, holyBabyPollNextBabyAndSendToStage.nextHomeWork(), processStateMonitor);
        }
    }

    public HolyBaby pollNextBabyAndSendToStage(String str) {
        ConcurrentLinkedQueue<HolyBaby> concurrentLinkedQueueJ = j(str, true);
        if (concurrentLinkedQueueJ == null) {
            return null;
        }
        return concurrentLinkedQueueJ.poll();
    }
}
