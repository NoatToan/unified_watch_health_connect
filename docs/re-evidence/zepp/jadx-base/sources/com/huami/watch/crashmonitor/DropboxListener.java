package com.huami.watch.crashmonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import clc.utils.taskmanager.Task;
import clc.utils.taskmanager.TaskManager;
import clc.utils.taskmanager.TaskOperation;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import java.util.HashSet;

/* JADX INFO: loaded from: classes16.dex */
public class DropboxListener extends BroadcastReceiver {
    public static final String ACTION_UPLOAD_CRASH = "com.huami.watch.crashmonitor.UPLOAD_CRASH";
    private static final HashSet<String> b;
    private static final boolean c = false;
    private TaskManager a;

    public class a extends Task {
        public final /* synthetic */ Context g;
        public final /* synthetic */ Intent h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Task.RunningStatus runningStatus, Intent intent, Context context) {
            super(runningStatus);
            this.h = intent;
            this.g = context;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            String action = this.h.getAction();
            if (TextUtils.equals(action, "android.intent.action.DROPBOX_ENTRY_ADDED")) {
                String stringExtra = this.h.getStringExtra("tag");
                if (!DropboxListener.b.contains(stringExtra)) {
                    if (GlobalDefine.DEBUG_CRASH_MONITOR) {
                        Log.i(GlobalDefine.TAG_CRASH, "=======tag 错误=====> " + stringExtra);
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_CRASH, "=======tag 错误 =====>" + stringExtra);
                    return null;
                }
                SystemMonitor.inject(this.g, stringExtra, this.h.getLongExtra("time", 0L));
            } else if (TextUtils.equals(action, DropboxListener.ACTION_UPLOAD_CRASH)) {
                SystemMonitor.forceUpload(this.g);
            }
            return null;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        b = hashSet;
        hashSet.add("system_app_crash");
        hashSet.add("data_app_crash");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        SolidLogger.withContext(context);
        boolean z = GlobalDefine.DEBUG_CRASH_MONITOR;
        if (z) {
            Log.i(GlobalDefine.TAG_CRASH, "=======收到dropbox 消息=====>");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_CRASH, "=======收到dropbox 消息 =====>");
        if (z) {
            Log.i(GlobalDefine.TAG_CRASH, "=======CRASH 当前no care=====>");
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_CRASH, "=======CRASH 当前no care=====>");
    }
}
