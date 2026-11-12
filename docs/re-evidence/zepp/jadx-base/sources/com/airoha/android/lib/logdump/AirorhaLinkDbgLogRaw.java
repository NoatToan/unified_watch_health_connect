package com.airoha.android.lib.logdump;

import android.util.Log;
import com.airoha.android.lib.logdump.ancdump.AncDumpParser;
import com.airoha.android.lib.logdump.minidump.LogDumpParser;
import com.airoha.android.lib.logdump.onlinedump.OnlineLogParser;
import com.airoha.liblogger.AirohaLogger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class AirorhaLinkDbgLogRaw {
    private static String l = "AirorhaLinkDbgLogRaw";
    private BlockingQueue<byte[]> c;
    private b e;
    private boolean f;
    private AbstractLogParser g;
    private AbstractLogParser.Type h;
    private String i;
    private String j;
    private File a = null;
    private FileOutputStream b = null;
    private LogDumpMgr.OnStatusUiListener d = null;
    private AirohaLogger k = AirohaLogger.getInstance();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractLogParser.Type.values().length];
            a = iArr;
            try {
                iArr[AbstractLogParser.Type.Mimidump.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AbstractLogParser.Type.Offlinedump.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AbstractLogParser.Type.Onlinedump.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AbstractLogParser.Type.AncDump.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class b extends Thread {
        public b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (AirorhaLinkDbgLogRaw.this.f) {
                synchronized (AirorhaLinkDbgLogRaw.this) {
                    if (AirorhaLinkDbgLogRaw.this.c != null && AirorhaLinkDbgLogRaw.this.c.size() > 0) {
                        byte[] bArr = (byte[]) AirorhaLinkDbgLogRaw.this.c.poll();
                        AirorhaLinkDbgLogRaw.this.g.parseRxDataToQueue(bArr);
                        if (bArr != null) {
                            AirorhaLinkDbgLogRaw airorhaLinkDbgLogRaw = AirorhaLinkDbgLogRaw.this;
                            airorhaLinkDbgLogRaw.logToFile(airorhaLinkDbgLogRaw.g.getLogQueueFront());
                            if (AirorhaLinkDbgLogRaw.this.g.getTextureQueueSize() > 0 && AirorhaLinkDbgLogRaw.this.d != null) {
                                AirorhaLinkDbgLogRaw.this.d.OnUpdateLog(AirorhaLinkDbgLogRaw.this.g.getTextureQueueFront().trim());
                            }
                            if (AirorhaLinkDbgLogRaw.this.h == AbstractLogParser.Type.Onlinedump && AirorhaLinkDbgLogRaw.this.d != null) {
                                AirorhaLinkDbgLogRaw.this.d.OnUpdateLogCount();
                            }
                        }
                    }
                }
            }
        }
    }

    public AirorhaLinkDbgLogRaw(String str, String str2) {
        this.i = str;
        this.j = str2;
    }

    public synchronized void addRawBytesToQueue(byte[] bArr) {
        BlockingQueue<byte[]> blockingQueue = this.c;
        if (blockingQueue != null) {
            blockingQueue.add(bArr);
        }
    }

    public void cancel() {
        synchronized (this.c) {
            BlockingQueue<byte[]> blockingQueue = this.c;
            if (blockingQueue != null) {
                blockingQueue.clear();
            }
            if (this.e != null) {
                this.e = null;
            }
            if (this.a != null) {
                this.a = null;
            }
            try {
                FileOutputStream fileOutputStream = this.b;
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                    this.b.close();
                }
            } catch (IOException e) {
                Log.d("OnlineDumpLogger", "close FileOutputStream fail");
                e.printStackTrace();
            }
            this.f = false;
        }
    }

    public void changeParser(AbstractLogParser.Type type) {
        this.h = type;
        int i = a.a[type.ordinal()];
        if (i == 1 || i == 2) {
            this.g = new LogDumpParser();
        } else if (i == 3) {
            this.g = new OnlineLogParser();
        } else if (i == 4) {
            this.g = new AncDumpParser();
        }
        this.g.createLogFile(this.i, this.j);
    }

    public void continueLogger() {
        synchronized (this.c) {
            this.f = true;
        }
    }

    public synchronized void logToFile(byte[] bArr) {
        try {
            this.g.logToFile(bArr);
        } catch (Exception e) {
            this.k.d(l, e.getMessage());
            stop();
        }
    }

    public void setListener(LogDumpMgr.OnStatusUiListener onStatusUiListener) {
        this.d = onStatusUiListener;
    }

    public void startLogger() {
        this.f = true;
        this.c = new LinkedBlockingQueue();
        b bVar = new b();
        this.e = bVar;
        bVar.start();
    }

    public void stop() {
        synchronized (this.c) {
            this.f = false;
        }
    }
}
