package com.huawei.hwlogsmodel.impl.writer.common;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogContext;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FlushTickFileHandler extends Handler {
    private static final int LOGFILE_DELAY = 30000;
    private static final int MSG_FLUSH_LOG_FILE_WATCH_DOG = 1002;
    private static final int MSG_SAVE_LOG_FILE = 1000;
    private static final int MSG_SAVE_LOG_FILE_NO_DETAIL = 1001;
    private static final String TAG = "LogUtil_FlushTickFileHandler";

    protected abstract void dataTicker(Object obj, String str);

    protected abstract void onFlushLog();

    public FlushTickFileHandler(Looper looper) {
        super(looper);
        sendEmptyMessageDelayed(1002, 30000L);
    }

    public void saveLogObj(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            saveLogObj(obj);
            return;
        }
        Message messageObtainMessage = obtainMessage(1000);
        LogContext logContext = new LogContext();
        logContext.a(obj);
        logContext.d(str);
        messageObtainMessage.obj = logContext;
        sendMessage(messageObtainMessage);
    }

    public void saveLogObj(Object obj) {
        Message messageObtainMessage = obtainMessage(1001);
        messageObtainMessage.obj = obj;
        sendMessage(messageObtainMessage);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        switch (message.what) {
            case 1000:
                removeMessages(1002);
                sendEmptyMessageDelayed(1002, 30000L);
                if (message.obj instanceof LogContext) {
                    LogContext logContext = (LogContext) message.obj;
                    dataTicker(logContext.e(), logContext.c());
                } else {
                    LogUtil.e(TAG, "handleMessage instanceof error");
                }
                break;
            case 1001:
                removeMessages(1002);
                sendEmptyMessageDelayed(1002, 30000L);
                dataTicker(message.obj, null);
                break;
            case 1002:
                removeMessages(1002);
                sendEmptyMessageDelayed(1002, 30000L);
                onFlushLog();
                break;
        }
    }
}
