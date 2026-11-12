package com.huami.watch.transport.httpsupport.StageFright;

import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import clc.utils.taskmanager.Task;
import clc.utils.taskmanager.TaskManager;
import clc.utils.taskmanager.TaskOperation;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.global.GlobalDataSyncKicker;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public abstract class EnumCollector {
    public static final String KEY_ENUM_COLLECT_ITEM_ACTION = "item_action";
    private static ConcurrentLinkedQueue<DataItem> d;
    private static TaskManager e;
    private OnReportResultListener a;
    private OnReportResultListener b;
    private String c = "def";

    public interface OnReportResultListener {
        void onReportResult(int i);
    }

    public class a extends Task {
        public final /* synthetic */ DataItem g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Task.RunningStatus runningStatus, DataItem dataItem) {
            super(runningStatus);
            this.g = dataItem;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            if (GlobalDefine.DEBUG_SERIAL_MODE) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "'" + EnumCollector.this.c + "' ==> CMD report upload: " + this.g + " ---> dataFromLower");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "'" + EnumCollector.this.c + "' ==> CMD report upload: " + this.g + " ---> dataFromLower");
            EnumCollector.this.dataFromLower(this.g);
            return null;
        }
    }

    public class b extends Task {
        public final /* synthetic */ DataItem g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Task.RunningStatus runningStatus, DataItem dataItem) {
            super(runningStatus);
            this.g = dataItem;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            EnumCollector.this.onQueryCommandArrival(this.g);
            String extraValByKey = this.g.getExtraValByKey("ver");
            if (TextUtils.isEmpty(extraValByKey)) {
                extraValByKey = "0";
            }
            GlobalDefine.CURR_REPORT_LIST_VER = Integer.valueOf(extraValByKey).intValue();
            EnumCollector.this.dataFromUpper(this.g);
            return null;
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
            if (GlobalDefine.DEBUG_SERIAL_MODE) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "'" + EnumCollector.this.c + "' ==> CMD TRIGGER POOR: " + this.g + " --ENERGY -- !");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "'" + EnumCollector.this.c + "' ==> CMD TRIGGER POOR: " + this.g + " --ENERGY -- !");
            EnumCollector.this.triggerPoorEnergy(this.g);
            return null;
        }
    }

    public class d implements OnReportResultListener {
        public final /* synthetic */ DataItem b;

        public d(DataItem dataItem) {
            this.b = dataItem;
        }

        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector.OnReportResultListener
        public void onReportResult(int i) {
            String str;
            SolidLogger solidLogger;
            StringBuilder sb;
            if (i == 0) {
                str = "' report to upper succeed ! ";
                if (GlobalDefine.DEBUG_SERIAL_MODE) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "EnumCollector-" + EnumCollector.this.c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.b.getIdentifier() + "' report to upper succeed ! " + this.b);
                }
                solidLogger = SolidLogger.getInstance();
                sb = new StringBuilder();
            } else {
                str = "' report to upper FAILED ! ";
                if (GlobalDefine.DEBUG_SERIAL_MODE) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "EnumCollector-" + EnumCollector.this.c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.b.getIdentifier() + "' report to upper FAILED ! " + this.b);
                }
                solidLogger = SolidLogger.getInstance();
                sb = new StringBuilder();
            }
            sb.append("EnumCollector-");
            sb.append(EnumCollector.this.c);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            sb.append(this.b.getIdentifier());
            sb.append(str);
            sb.append(this.b);
            solidLogger.with(GlobalDefine.TAG_SERIAL_MODE, sb.toString());
        }
    }

    public class e implements OnReportResultListener {
        public e() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0013 A[PHI: r1
          0x0013: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:10:0x0011, B:7:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector.OnReportResultListener
        public void onReportResult(int i) {
            String str;
            if (i == 0) {
                boolean z = GlobalDefine.DEBUG_SERIAL_MODE;
                if (!z) {
                    return;
                }
                str = "onMessageDispatchResult succeed ! ";
                if (z) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, str);
                }
            } else {
                str = "onMessageDispatchResult FAILED ! ";
                if (GlobalDefine.DEBUG_SERIAL_MODE) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, str);
                }
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, str);
        }
    }

    public class f implements OnReportResultListener {
        public f() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0013 A[PHI: r1
          0x0013: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:10:0x0011, B:7:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.huami.watch.transport.httpsupport.StageFright.EnumCollector.OnReportResultListener
        public void onReportResult(int i) {
            String str;
            if (i == 0) {
                boolean z = GlobalDefine.DEBUG_SERIAL_MODE;
                if (!z) {
                    return;
                }
                str = "mData2UpperResultListener succeed ! ";
                if (z) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, str);
                }
            } else {
                str = "mData2UpperResultListener FAILED ! ";
                if (GlobalDefine.DEBUG_SERIAL_MODE) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, str);
                }
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, str);
        }
    }

    public EnumCollector() {
        if (d == null) {
            d = new ConcurrentLinkedQueue<>();
        }
        if (e == null) {
            e = new TaskManager("enum-collector");
        }
    }

    private void b() {
        synchronized (this) {
            for (DataItem dataItem : d) {
                if (dataItem != null) {
                    d.remove(dataItem);
                    if (GlobalDefine.DEBUG_SERIAL_MODE) {
                        Log.i(GlobalDefine.TAG_SERIAL_MODE, "'" + this.c + "' ==> handleActionQueue " + dataItem.getIdentifier() + " --> to handleSingleAction");
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "'" + this.c + "' ==> handleActionQueue " + dataItem.getIdentifier() + " --> to handleSingleAction");
                    c(dataItem);
                }
            }
            e.execute();
        }
    }

    private void c(DataItem dataItem) {
        Task cVar;
        String action = dataItem.getAction();
        if (TextUtils.equals(action, Command.CMD_REPORT_UPLOAD_LIST)) {
            cVar = new a(Task.RunningStatus.WORK_THREAD, dataItem);
        } else if (TextUtils.equals(action, Command.CMD_QUERY_UPLOAD_LIST)) {
            cVar = new b(Task.RunningStatus.WORK_THREAD, dataItem);
        } else {
            if (!TextUtils.equals(action, Command.CMD_TRIGGER_POOR_MAN_UPLOAD_LIST)) {
                onCustomCommand(dataItem);
                return;
            }
            cVar = new c(Task.RunningStatus.WORK_THREAD, dataItem);
        }
        e.next(cVar);
    }

    public void addActionAndExecute(DataItem dataItem) {
        if (dataItem == null) {
            if (GlobalDefine.DEBUG_SERVER) {
                Log.i(GlobalDefine.TAG_SRV, "add action ：NULL !!!!!!! IGNORE");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "add action ：NULL !!!!!!! IGNORE");
            return;
        }
        if (GlobalDefine.DEBUG_SERVER) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "add action ： " + dataItem.getAction() + " , AT: ", new Throwable());
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "==> list is : \" + sActionList.toString()");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "add action ： " + dataItem.getAction() + " , AT: ", new Throwable());
        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "==> list is : \" + sActionList.toString()");
        if (!d.contains(dataItem)) {
            d.add(dataItem);
        }
        b();
    }

    public abstract void data2Lower(DataItem dataItem, OnReportResultListener onReportResultListener);

    public abstract void data2Upper(DataItem dataItem, OnReportResultListener onReportResultListener);

    public void dataFromLower(DataItem dataItem) {
        if (GlobalDefine.DEBUG_SERIAL_MODE) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "'" + this.c + "' ==> dataFromLower " + dataItem.getIdentifier() + " --> to data2Upper");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "'" + this.c + "' ==> dataFromLower " + dataItem.getIdentifier() + " --> to data2Upper");
        OnReportResultListener dVar = this.b;
        if (dVar == null) {
            dVar = new d(dataItem);
        }
        data2Upper(dataItem, dVar);
    }

    public void dataFromUpper(DataItem dataItem) {
        boolean z = GlobalDefine.DEBUG_SERIAL_MODE;
        if (z) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "'" + this.c + "' ==> dataFromUpper " + dataItem.getIdentifier() + " --> to data2Lower");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "'" + this.c + "' ==> dataFromUpper " + dataItem.getIdentifier() + " --> to data2Lower");
        OnReportResultListener eVar = this.a;
        if (eVar == null) {
            eVar = new e();
        }
        data2Lower(dataItem, eVar);
        if (z) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "'" + this.c + "' ==> data2Lower " + dataItem.getIdentifier() + " --> to dataLocal2Upper");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "'" + this.c + "' ==> data2Lower " + dataItem.getIdentifier() + " --> to dataLocal2Upper");
        String[] strArrTrackTargetPackageAndAction = dataItem.trackTargetPackageAndAction();
        DataItem dataItemGenInternalEnumCollectAction = GlobalDataSyncKicker.getInstance().genInternalEnumCollectAction(strArrTrackTargetPackageAndAction[0], strArrTrackTargetPackageAndAction[1], Command.CMD_REPORT_UPLOAD_LIST);
        dataItemGenInternalEnumCollectAction.setIdentifier(dataItem.getIdentifier());
        dataItemGenInternalEnumCollectAction.setExtraData(dataItem.getExtraData().toString());
        dataLocal2Upper(dataItemGenInternalEnumCollectAction);
        if (z) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "'" + this.c + "' ==> dataLocal2Upper " + dataItem.getIdentifier() + " --> to data2Upper");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "'" + this.c + "' ==> dataLocal2Upper " + dataItem.getIdentifier() + " --> to data2Upper");
        OnReportResultListener fVar = this.b;
        if (fVar == null) {
            fVar = new f();
        }
        data2Upper(dataItemGenInternalEnumCollectAction, fVar);
    }

    public abstract void dataLocal2Upper(DataItem dataItem);

    public String name() {
        return this.c;
    }

    public void onCustomCommand(DataItem dataItem) {
    }

    public void onQueryCommandArrival(DataItem dataItem) {
    }

    public void setName(String str) {
        this.c = str;
    }

    public void setOnReportData2LowerResultListener(OnReportResultListener onReportResultListener) {
        this.a = onReportResultListener;
    }

    public void setOnReportData2UpperResultListener(OnReportResultListener onReportResultListener) {
        this.b = onReportResultListener;
    }

    public void triggerPoorEnergy(DataItem dataItem) {
        data2Lower(dataItem, null);
    }
}
