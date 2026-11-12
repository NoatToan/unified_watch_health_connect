package com.huami.watch.transport.httpsupport.transporter.http;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import clc.utils.debug.slog.SolidLogger;
import clc.utils.taskmanager.Task;
import clc.utils.taskmanager.TaskManager;
import clc.utils.taskmanager.TaskOperation;
import com.huami.watch.transport.httpsupport.AlarmDriver;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class TrafficStasis {
    public static final String CLEAR_ACTION = "clear_traffic_data";
    public static final String TAG = "Traffic";
    private static final String h = "traffic_stat.xml";
    private static Handler i;
    private static TrafficStasis j;
    private ConcurrentHashMap<String, Long> a;
    private Context b;
    private BroadcastReceiver c;
    private OnTrafficListener d;
    private TaskManager f = new TaskManager("task-of-traffic-print");
    private Task e = new c(Task.RunningStatus.WORK_THREAD);
    private Runnable g = new d();

    public interface OnTrafficListener {
        void onTrafficExtract(String str, long j, long j2);
    }

    public class a extends Task {
        public final /* synthetic */ String g;
        public final /* synthetic */ long h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Task.RunningStatus runningStatus, String str, long j) {
            super(runningStatus);
            this.g = str;
            this.h = j;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            String str;
            long j;
            SharedPreferences sharedPreferences = TrafficStasis.this.b.getSharedPreferences(TrafficStasis.h, 0);
            long j2 = sharedPreferences.getLong(this.g, -1L);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (j2 == -1) {
                str = this.g;
                j = this.h;
            } else {
                str = this.g;
                j = this.h + j2;
            }
            editorEdit.putLong(str, j).commit();
            SolidLogger.getInstance().with2(TrafficStasis.TAG, ">>> upload Channel [" + this.g + "] will increase from : " + TrafficStasis.format(j2) + " to : " + TrafficStasis.format(this.h + j2) + " by: " + TrafficStasis.format(this.h));
            return null;
        }
    }

    public class b extends Task {
        public final /* synthetic */ String g;
        public final /* synthetic */ long h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Task.RunningStatus runningStatus, String str, long j) {
            super(runningStatus);
            this.g = str;
            this.h = j;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            String str;
            long j;
            SharedPreferences sharedPreferences = TrafficStasis.this.b.getSharedPreferences(TrafficStasis.h, 0);
            long j2 = sharedPreferences.getLong(this.g, -1L);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (j2 == -1) {
                str = this.g;
                j = this.h;
            } else {
                str = this.g;
                j = this.h + j2;
            }
            editorEdit.putLong(str, j).commit();
            SolidLogger.getInstance().with2(TrafficStasis.TAG, "<<< download Channel [" + this.g + "] will increase from : " + TrafficStasis.format(j2) + " to : " + TrafficStasis.format(this.h + j2) + " by: " + TrafficStasis.format(this.h));
            return null;
        }
    }

    public class c extends Task {
        public c(Task.RunningStatus runningStatus) {
            super(runningStatus);
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            TrafficStasis.this.logAllChannels();
            return null;
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TrafficStasis.this.f.next(TrafficStasis.this.e).execute();
        }
    }

    public class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TrafficStasis.this.d != null) {
                SolidLogger.getInstance().with2(TrafficStasis.TAG, "=======ClEAR--FOR--TIMING---======");
                SharedPreferences sharedPreferences = TrafficStasis.this.b.getSharedPreferences(TrafficStasis.h, 0);
                for (String str : sharedPreferences.getAll().keySet()) {
                    TrafficStasis.this.d.onTrafficExtract(str, sharedPreferences.getLong(str, -1L), -2L);
                }
            }
            TrafficStasis.this.resetAll();
            AlarmDriver.inject(context, 0, 23, 59, 59, 86400000L, intent, 0);
        }
    }

    private TrafficStasis(Context context) {
        this.b = context;
        i = new Handler(Looper.getMainLooper());
        e();
        f(context);
    }

    private void e() {
        ConcurrentHashMap<String, Long> concurrentHashMap = this.a;
        if (concurrentHashMap == null) {
            this.a = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap.clear();
        }
        Map<String, ?> all = this.b.getSharedPreferences(h, 0).getAll();
        for (String str : all.keySet()) {
            this.a.put(str, (Long) all.get(str));
        }
    }

    private void f(Context context) {
        AlarmDriver.inject(context, 0, 23, 59, 59, 86400000L, new Intent(CLEAR_ACTION), 0);
        BroadcastReceiver broadcastReceiver = this.c;
        if (broadcastReceiver != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused) {
            }
        } else {
            this.c = new e();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(CLEAR_ACTION);
        context.registerReceiver(this.c, intentFilter);
    }

    public static String format(long j2) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        float f = j2 / 1024.0f;
        StringBuilder sb = new StringBuilder();
        sb.append(f < 1.0f ? "0" : "");
        sb.append(decimalFormat.format(f));
        sb.append(" KB");
        return sb.toString();
    }

    public static TrafficStasis getInstance(Context context) {
        TrafficStasis trafficStasis;
        synchronized (TrafficStasis.class) {
            if (j == null) {
                j = new TrafficStasis(context);
            }
            trafficStasis = j;
        }
        return trafficStasis;
    }

    public void appendChannelDownload(String str, byte[]... bArr) {
        synchronized (this) {
            if (bArr == null) {
                return;
            }
            long length = 0;
            try {
                for (byte[] bArr2 : bArr) {
                    if (bArr2 != null) {
                        length += (long) bArr2.length;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.f.next(new b(Task.RunningStatus.WORK_THREAD, str, length)).execute();
            Handler handler = i;
            if (handler == null) {
                return;
            }
            handler.removeCallbacks(this.g);
            i.postDelayed(this.g, 2300L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:24:0x0036 A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:10:0x000d, B:15:0x0017, B:16:0x0022, B:20:0x0030, B:24:0x0036, B:19:0x002d, B:14:0x0014), top: B:32:0x0003, inners: #0, #2 }] */
    public void appendChannelUpload(String str, byte[]... bArr) {
        Handler handler;
        synchronized (this) {
            long length = 0;
            if (bArr == null) {
                this.f.next(new a(Task.RunningStatus.WORK_THREAD, str, length)).execute();
                handler = i;
                if (handler == null) {
                    return;
                }
                handler.removeCallbacks(this.g);
                i.postDelayed(this.g, 2300L);
                return;
            }
            try {
                for (byte[] bArr2 : bArr) {
                    if (bArr2 != null) {
                        length += (long) bArr2.length;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                this.f.next(new a(Task.RunningStatus.WORK_THREAD, str, length)).execute();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            handler = i;
            if (handler == null) {
                return;
            }
            handler.removeCallbacks(this.g);
            i.postDelayed(this.g, 2300L);
            return;
            throw th;
        }
    }

    public void logAllChannels() {
        synchronized (this) {
            SharedPreferences sharedPreferences = this.b.getSharedPreferences(h, 0);
            Map<String, ?> all = sharedPreferences.getAll();
            SolidLogger.getInstance().with2(TAG, "--- print all now --- start\n");
            for (String str : all.keySet()) {
                SolidLogger.getInstance().with2(TAG, "--- [" + str + "] ------------ now at : \t" + format(sharedPreferences.getLong(str, -1L)));
                this.d.onTrafficExtract(str, sharedPreferences.getLong(str, -1L), 0L);
            }
            SolidLogger.getInstance().with2(TAG, "--- print all now --- end\n");
        }
    }

    public void logChannelCurrStatistic(String str) {
        synchronized (this) {
            SharedPreferences sharedPreferences = this.b.getSharedPreferences(h, 0);
            SolidLogger.getInstance().with2(TAG, "-- Channel [" + str + "] ------------ now at : \t" + format(sharedPreferences.getLong(str, -1L)));
        }
    }

    public void release() {
        synchronized (this) {
            resetAll();
            i.removeCallbacksAndMessages(null);
            i = null;
            ConcurrentHashMap<String, Long> concurrentHashMap = this.a;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        }
    }

    public void resetAll() {
        synchronized (this) {
            this.b.getSharedPreferences(h, 0).edit().clear().commit();
        }
    }

    public void setTrafficListener(OnTrafficListener onTrafficListener) {
        this.d = onTrafficListener;
    }
}
