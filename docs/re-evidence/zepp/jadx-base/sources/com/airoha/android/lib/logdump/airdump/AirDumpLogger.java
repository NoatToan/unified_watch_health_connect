package com.airoha.android.lib.logdump.airdump;

import android.os.Environment;
import android.util.Log;
import com.airoha.android.lib.util.logger.LogEvent;
import com.huami.feedback.log.utils.ConstantsKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class AirDumpLogger {
    public String a = "AirDumpLogger";
    private File b = null;
    private FileOutputStream c = null;
    private BlockingQueue<LogEvent> d;
    private a e;
    private boolean f;
    private String g;

    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            LogEvent logEvent;
            Log.d(AirDumpLogger.this.a, "LogThread");
            while (AirDumpLogger.this.f) {
                if (AirDumpLogger.this.d != null && AirDumpLogger.this.d.size() > 0 && (logEvent = (LogEvent) AirDumpLogger.this.d.poll()) != null && logEvent.logType == 2) {
                    AirDumpLogger.this.logToFile(logEvent.logStr);
                }
            }
        }
    }

    public AirDumpLogger() {
        c();
    }

    private void c() {
        this.d = new LinkedBlockingQueue();
        this.f = true;
        this.e = new a();
    }

    public void addEventToQueue(LogEvent logEvent) {
        if (this.d == null) {
            Log.d(this.a, "mLogEventQueue null");
        }
        BlockingQueue<LogEvent> blockingQueue = this.d;
        if (blockingQueue != null) {
            blockingQueue.add(logEvent);
            Log.d(this.a, "mLogEventQueue add " + logEvent.logName);
        }
    }

    public synchronized void logToFile(String str) {
        try {
            try {
                this.c.write(str.getBytes());
                Log.d(this.a, "write log: " + str);
            } catch (IOException e) {
                e.printStackTrace();
                Log.d(this.a, "EXCEPTION 2: " + e.getMessage());
                stop();
            }
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            Log.d(this.a, "FileNotFoundException: " + e2.getMessage());
            stop();
        }
    }

    public void startLogger(String str) {
        this.g = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        this.b = new File(Environment.getExternalStorageDirectory(), str + "_" + this.g + ConstantsKt.LOG_FILE_SUFFIX);
        try {
            this.c = new FileOutputStream(this.b, true);
        } catch (IOException e) {
            Log.d("AirDumpLogger", "create FileOutputStream fail");
            e.printStackTrace();
        }
        Log.d(this.a, "startLogger");
        this.f = true;
        if (this.e == null) {
            Log.d(this.a, "mLogThread is null");
            this.e = new a();
        }
        this.e.start();
    }

    public void stop() {
        synchronized (this.d) {
            BlockingQueue<LogEvent> blockingQueue = this.d;
            if (blockingQueue != null) {
                blockingQueue.clear();
            }
            if (this.e != null) {
                this.e = null;
            }
            if (this.b != null) {
                this.b = null;
            }
            try {
                FileOutputStream fileOutputStream = this.c;
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                    this.c.close();
                }
            } catch (IOException e) {
                Log.d("AirDumpLogger", "close FileOutputStream fail");
                e.printStackTrace();
            }
            this.f = false;
        }
    }
}
