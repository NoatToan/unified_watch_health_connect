package com.airoha.android.lib.logdump;

import com.airoha.liblogger.AirohaLogger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractLogParser {
    public static final String c = "AbstractLogParser";
    public AirohaLogger mLogger = AirohaLogger.getInstance();
    private BlockingQueue<byte[]> a = new LinkedBlockingQueue();
    private BlockingQueue<String> b = new LinkedBlockingQueue();

    public enum Type {
        Mimidump,
        Offlinedump,
        Onlinedump,
        AncDump
    }

    public boolean addLogToQueue(byte[] bArr) {
        synchronized (this.a) {
            try {
                try {
                    this.a.add(bArr);
                } catch (Exception e) {
                    this.mLogger.e(c, e.getMessage());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public boolean addLogToTextureQueue(String str) {
        synchronized (this.b) {
            try {
                try {
                    this.b.add(str);
                } catch (Exception e) {
                    this.mLogger.e(c, e.getMessage());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public abstract void createLogFile(String str, String str2);

    public byte[] getLogQueueFront() {
        byte[] bArrPoll;
        synchronized (this.a) {
            bArrPoll = null;
            try {
                if (this.a.size() > 0) {
                    bArrPoll = this.a.poll();
                }
            } catch (Exception e) {
                this.mLogger.e(c, e.getMessage());
            }
        }
        return bArrPoll;
    }

    public String getTextureQueueFront() {
        String strPoll = "";
        synchronized (this.b) {
            try {
                if (this.b.size() > 0) {
                    strPoll = this.b.poll();
                }
            } catch (Exception e) {
                this.mLogger.e(c, e.getMessage());
            }
        }
        return strPoll;
    }

    public int getTextureQueueSize() {
        int size;
        synchronized (this.b) {
            size = this.b.size();
        }
        return size;
    }

    public abstract void logToFile(byte[] bArr);

    public abstract boolean parseRxDataToQueue(byte[] bArr);
}
