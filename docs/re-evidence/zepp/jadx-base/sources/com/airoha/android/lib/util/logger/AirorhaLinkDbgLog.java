package com.airoha.android.lib.util.logger;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class AirorhaLinkDbgLog {
    private String a;
    private File b;
    private FileOutputStream c;
    private BlockingQueue<String> d;
    private a e;
    private boolean f;
    private boolean g;
    private boolean h;

    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (AirorhaLinkDbgLog.this.d == null) {
                return;
            }
            while (AirorhaLinkDbgLog.this.f) {
                if (AirorhaLinkDbgLog.this.d.size() > 0) {
                    while (AirorhaLinkDbgLog.this.f && AirorhaLinkDbgLog.this.d.size() > 0) {
                        String str = (String) AirorhaLinkDbgLog.this.d.poll();
                        if (str != null) {
                            AirorhaLinkDbgLog.this.logToFile(str);
                        }
                    }
                }
                SystemClock.sleep(5L);
            }
        }
    }

    public AirorhaLinkDbgLog(String str, boolean z, boolean z2) {
        this.b = null;
        this.c = null;
        this.g = true;
        this.h = true;
        this.a = str;
        this.g = z;
        this.h = z2;
        if (str != null && z2) {
            this.b = new File(Environment.getExternalStorageDirectory(), this.a + "AirohaLink.txt");
            try {
                this.c = new FileOutputStream(this.b, true);
            } catch (IOException e) {
                Log.d("AirDumpLogger", "create FileOutputStream fail");
                e.printStackTrace();
            }
            try {
                if (!this.b.exists()) {
                    this.b.createNewFile();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.d = new LinkedBlockingQueue();
            this.f = true;
            a aVar = new a();
            this.e = aVar;
            aVar.start();
        }
    }

    public synchronized void addStringToQueue(String str, String str2) {
        if (this.d != null) {
            this.d.add(new SimpleDateFormat("yyyyMMdd_HH:mm:ss.SSS").format(Calendar.getInstance().getTime()) + "--" + str + ":" + str2 + "\n");
        }
    }

    public synchronized void logToFile(String str) {
        if (this.b == null) {
            return;
        }
        FileOutputStream fileOutputStream = this.c;
        if (fileOutputStream == null) {
            return;
        }
        try {
            try {
                fileOutputStream.write(str.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public void outputLogI(String str, String str2) {
        if (this.g) {
            Log.i(str, str2);
        }
    }

    public synchronized void stop() {
        synchronized (this.d) {
            BlockingQueue<String> blockingQueue = this.d;
            if (blockingQueue != null) {
                blockingQueue.clear();
            }
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
