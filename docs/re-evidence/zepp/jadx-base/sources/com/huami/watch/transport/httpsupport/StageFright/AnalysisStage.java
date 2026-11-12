package com.huami.watch.transport.httpsupport.StageFright;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import clc.utils.taskmanager.TaskManager;
import com.huami.watch.companion.ecg.media.MediaRecorderHelper;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.control.assist.WearHttpCompanion;
import com.huami.watch.transport.httpsupport.global.GlobalDataSyncKicker;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.huami.watch.transport.httpsupport.model.DataUtils;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class AnalysisStage {
    private static boolean c = false;
    private static final long e = 10000;
    private static volatile AnalysisStage h;
    public EnumCollector a;
    private ConcurrentHashMap<String, ProcessStateMonitor> b;
    public static final Long INTERVAL_OF_TWICE_TRIGGER = Long.valueOf(MediaRecorderHelper.MAX_RECORD_TIME);
    private static TaskManager g = new TaskManager("analysis-stage");
    private static Handler f = new Handler(Looper.getMainLooper());
    private static final HashSet<String> d = new HashSet<>();

    private AnalysisStage() {
    }

    private void a() {
        WearHttpCompanion wearHttpCompanion = WearHttpCompanion.getInstance();
        if (this.a == null) {
            this.a = wearHttpCompanion.getCollector();
        }
    }

    private boolean b(String str) {
        HashSet<String> hashSet = d;
        if (hashSet.contains(str)) {
            return false;
        }
        hashSet.add(str);
        return true;
    }

    private void c(ProcessStateMonitor processStateMonitor) {
        d(processStateMonitor, null);
    }

    private void d(ProcessStateMonitor processStateMonitor, String str) {
        if (this.a == null) {
            SyncProcessManager.getInstance().tellWith(processStateMonitor.trackWho(), (byte) 4, new int[0]);
            return;
        }
        SyncProcessManager.getInstance().tellWith(processStateMonitor.trackWho(), (byte) 1, new int[0]);
        DataItem dataItemGenInternalEnumCollectAction = GlobalDataSyncKicker.getInstance().genInternalEnumCollectAction(processStateMonitor.targetAtPackage(), processStateMonitor.targetAtAction(), Command.CMD_QUERY_UPLOAD_LIST);
        dataItemGenInternalEnumCollectAction.addExtraPair("ver", "1");
        dataItemGenInternalEnumCollectAction.addExtraPair(Command.EXTRA_ASSIST_CLEAR_DATA, String.valueOf(b(processStateMonitor.targetAtPackage()) ? c : false));
        if (str != null) {
            dataItemGenInternalEnumCollectAction.addExtraPair(Command.EXTRA_ASSIST_HEALTH_TIME_FRAME, str);
        }
        this.a.addActionAndExecute(dataItemGenInternalEnumCollectAction);
        processStateMonitor.setReportId(dataItemGenInternalEnumCollectAction.getIdentifier());
    }

    public static AnalysisStage getInstance() {
        if (h == null) {
            synchronized (AnalysisStage.class) {
                if (h == null) {
                    h = new AnalysisStage();
                }
            }
        }
        return h;
    }

    public void addReportArrivalListener(ProcessStateMonitor processStateMonitor) {
        if (this.b == null) {
            this.b = new ConcurrentHashMap<>();
        }
        this.b.put(processStateMonitor.trackWho(), processStateMonitor);
    }

    public void beginNewSync(Context context, ProcessStateMonitor processStateMonitor) {
        synchronized (this) {
            beginNewSync(context, processStateMonitor, null);
        }
    }

    public void beginNewSync(Context context, ProcessStateMonitor processStateMonitor, String str) {
        synchronized (this) {
            c = DataUtils.isFirstBoot(context);
            Serializer.getInstance(context);
            SyncProcessManager.getInstance().tellWith(processStateMonitor.trackWho(), (byte) 0, new int[0]);
            a();
            addReportArrivalListener(processStateMonitor);
            d(processStateMonitor, str);
        }
    }

    public ProcessStateMonitor findProcessStateMonitor(String str) {
        if (this.b == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.b.get(str);
    }

    public void handleReportHub(Context context, DataItem dataItem) {
        String identifier = dataItem.getIdentifier();
        String strTrackWho = dataItem.trackWho();
        boolean z = GlobalDefine.DEBUG_SERIAL_MODE;
        if (z) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "Touch handle report hub for : " + identifier);
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "Touch handle report hub for : " + identifier);
        if (z) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "Real handle report hub for : " + dataItem.getIdentifier());
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "Real handle report hub for : " + dataItem.getIdentifier());
        ConcurrentHashMap<String, ProcessStateMonitor> concurrentHashMap = this.b;
        if (concurrentHashMap != null) {
            ProcessStateMonitor processStateMonitor = concurrentHashMap.get(strTrackWho);
            if (processStateMonitor == null) {
                if (z) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "未能找到Report 处理器 for : " + dataItem.getIdentifier());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "未能找到Report 处理器 for : " + dataItem.getIdentifier());
                return;
            }
            if (z) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "找到Report 处理器 : " + processStateMonitor.targetWho() + " for : " + dataItem.getIdentifier());
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "找到Report 处理器 : " + processStateMonitor.targetWho() + " for : " + dataItem.getIdentifier());
            processStateMonitor.onReportArrival(context, processStateMonitor, dataItem);
        }
    }

    public void removeReportArrivalListener(ProcessStateMonitor processStateMonitor) {
        if (processStateMonitor == null) {
            return;
        }
        this.b.remove(processStateMonitor.trackWho());
    }

    public void removeReportArrivalListener(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.remove(str);
    }
}
