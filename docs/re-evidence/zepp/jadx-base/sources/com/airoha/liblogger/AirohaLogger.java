package com.airoha.liblogger;

import android.os.SystemClock;
import android.util.Log;
import com.airoha.liblogger.printer.IPrinter;
import com.airoha.liblogger.utils.ByteHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public class AirohaLogger {
    public static final int LOG_LEVEL_D = 2;
    public static final int LOG_LEVEL_E = 5;
    public static final int LOG_LEVEL_I = 3;
    public static final int LOG_LEVEL_V = 1;
    public static final int LOG_LEVEL_W = 4;
    public static final String f = "AirohaLogger";
    private static AirohaLogger g = new AirohaLogger();
    private boolean a = false;
    private int b = 5;
    private ArrayList<IPrinter> c = new ArrayList<>();
    private ConcurrentLinkedQueue<LogInfo> d = new ConcurrentLinkedQueue<>();
    private a e;

    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (AirohaLogger.this.a) {
                if (AirohaLogger.this.d.isEmpty()) {
                    SystemClock.sleep(1L);
                } else {
                    while (AirohaLogger.this.a && !AirohaLogger.this.d.isEmpty()) {
                        LogInfo logInfo = (LogInfo) AirohaLogger.this.d.poll();
                        if (logInfo != null) {
                            Iterator it2 = AirohaLogger.this.c.iterator();
                            while (it2.hasNext()) {
                                ((IPrinter) it2.next()).print(logInfo);
                            }
                        }
                    }
                }
            }
        }
    }

    private AirohaLogger() {
    }

    public static AirohaLogger getInstance() {
        return g;
    }

    public void addPrinter(IPrinter iPrinter) {
        String printerName = iPrinter.getPrinterName();
        synchronized (this.c) {
            Iterator<IPrinter> it2 = this.c.iterator();
            while (it2.hasNext()) {
                if (it2.next().getPrinterName() == printerName) {
                    Log.e(f, "FileLogger for " + printerName + "is existed");
                    return;
                }
            }
            if (this.c.isEmpty()) {
                h();
            }
            this.c.add(iPrinter);
        }
    }

    public void clearLog() {
        this.d.clear();
    }

    public void d(String str, String str2) {
        if (2 >= this.b) {
            Log.d(str, str2);
            d(2, str, str2);
        }
    }

    public void e(String str, String str2) {
        if (5 >= this.b) {
            Log.e(str, str2);
            d(5, str, str2);
        }
    }

    public void f(String str, String str2) {
        if (this.c.isEmpty()) {
            return;
        }
        this.d.add(new LogInfo(str, str2));
    }

    public void g(String str, byte[] bArr) {
        if (this.c.isEmpty()) {
            return;
        }
        this.d.add(new LogInfo(str, bArr));
    }

    public void h() {
        try {
            a aVar = this.e;
            if (aVar != null) {
                this.a = false;
                aVar.join(1000L);
            }
            clearLog();
            this.a = true;
            a aVar2 = new a();
            this.e = aVar2;
            aVar2.start();
        } catch (Exception e) {
            Log.e(f, e.getMessage());
        }
    }

    public void i(String str, String str2) {
        if (3 >= this.b) {
            Log.i(str, str2);
            d(3, str, str2);
        }
    }

    public void j() {
        this.a = false;
    }

    public void raw(String str, String str2) {
        f(str, str2);
    }

    public void removePrinter(String str) {
        synchronized (this.c) {
            for (IPrinter iPrinter : this.c) {
                if (iPrinter.getPrinterName() == str) {
                    int i = 0;
                    while (!this.d.isEmpty()) {
                        SystemClock.sleep(1L);
                        i++;
                        if (i > 10) {
                            break;
                        }
                    }
                    iPrinter.destroy();
                    this.c.remove(iPrinter);
                    break;
                }
            }
            if (this.c.isEmpty()) {
                j();
            }
        }
    }

    public void setLogLevel(int i) {
        this.b = i;
    }

    public void v(String str, String str2) {
        if (1 >= this.b) {
            Log.v(str, str2);
            d(1, str, str2);
        }
    }

    public void w(String str, String str2) {
        if (4 >= this.b) {
            Log.w(str, str2);
            d(4, str, str2);
        }
    }

    public void raw(String str, byte[] bArr) {
        g(str, bArr);
    }

    public void d(String str, byte[] bArr) {
        if (2 >= this.b) {
            d(str, ByteHelper.bytesToHex(bArr));
        }
    }

    public void e(String str, byte[] bArr) {
        if (5 >= this.b) {
            e(str, ByteHelper.bytesToHex(bArr));
        }
    }

    public void i(String str, byte[] bArr) {
        if (3 >= this.b) {
            i(str, ByteHelper.bytesToHex(bArr));
        }
    }

    public void v(String str, byte[] bArr) {
        if (1 >= this.b) {
            v(str, ByteHelper.bytesToHex(bArr));
        }
    }

    public void w(String str, byte[] bArr) {
        if (4 >= this.b) {
            w(str, ByteHelper.bytesToHex(bArr));
        }
    }

    public void d(int i, String str, String str2) {
        synchronized (this.c) {
            if (this.c.isEmpty()) {
                return;
            }
            this.d.add(new LogInfo(i, str, str2));
        }
    }
}
