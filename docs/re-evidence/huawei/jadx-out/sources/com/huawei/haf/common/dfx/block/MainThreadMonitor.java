package com.huawei.haf.common.dfx.block;

import android.os.Looper;
import android.text.TextUtils;
import android.util.PrintWriterPrinter;
import android.util.Printer;
import com.huawei.haf.common.dfx.DfxUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class MainThreadMonitor implements Printer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadMonitorTask f5862b;

    private MainThreadMonitor(MonitorCallback monitorCallback) {
        this.f5862b = new ThreadMonitorTask(Looper.getMainLooper().getThread(), monitorCallback == null ? new UiThreadMonitorHandler("HAF_UIBlockMonitor") : monitorCallback);
    }

    public static void e(MonitorCallback monitorCallback) {
        Looper.getMainLooper().setMessageLogging(new MainThreadMonitor(monitorCallback));
    }

    public static void e() {
        Looper.getMainLooper().setMessageLogging(null);
    }

    @Override // android.util.Printer
    public void println(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '>') {
            this.f5862b.b(str);
        } else if (cCharAt == '<') {
            this.f5862b.c();
        }
    }

    public static class UiThreadMonitorHandler extends AbstractMonitorHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MessageHistory f5869b;

        public UiThreadMonitorHandler(String str) {
            super(str, "_blockLog_%d");
        }

        @Override // com.huawei.haf.common.dfx.block.AbstractMonitorHandler, com.huawei.haf.common.dfx.block.MonitorCallback
        public void begin(Thread thread, String str, long j) {
            super.begin(thread, str, j);
            if (this.f5869b == null) {
                this.f5869b = new MessageHistory(j);
            }
        }

        @Override // com.huawei.haf.common.dfx.block.MonitorCallback
        public boolean check(Thread thread, long j, long j2) {
            if (j2 <= 0) {
                return false;
            }
            int beginTime = (int) ((j - getBeginTime()) / j2);
            if (beginTime <= 0) {
                return true;
            }
            if (beginTime > 10) {
                return false;
            }
            if (beginTime % 5 == 0) {
                saveDumpStackTraceInfo(thread, true, true, true);
                return true;
            }
            if (!LogUtil.c()) {
                saveDumpStackTraceInfo(thread, false, true, false);
            }
            return true;
        }

        @Override // com.huawei.haf.common.dfx.block.MonitorCallback
        public void end(Thread thread, Throwable th, long j, long j2) {
            if (j2 <= 0) {
                return;
            }
            long beginTime = j - getBeginTime();
            if (beginTime <= 60) {
                this.f5869b.c(j);
                return;
            }
            this.f5869b.a(new Message(this.f5869b.c(j), getMessageInfo(), getBeginTime(), (int) beginTime));
            if (beginTime > 300) {
                ReleaseLogUtil.d(this.mTag, "Suspected block msg:", Long.valueOf(beginTime), ", ", getMessageInfo());
            } else if (beginTime > 120) {
                ReleaseLogUtil.c(this.mTag, "Suspected block msg:", Long.valueOf(beginTime), ", ", getMessageInfo());
            } else {
                LogUtil.c(this.mTag, "Suspected block msg:", Long.valueOf(beginTime), ", ", getMessageInfo());
            }
        }

        @Override // com.huawei.haf.common.dfx.block.AbstractMonitorHandler
        protected void dumpMessagesInfo(PrintWriter printWriter, long j, boolean z, boolean z2) {
            if (z) {
                printWriter.println("--------------------------------");
                this.f5869b.d(printWriter, j);
            }
            if (!z2 || LogUtil.c()) {
                return;
            }
            printWriter.println("--------------------------------");
            printWriter.print("TODO: ");
            Looper.getMainLooper().dump(new PrintWriterPrinter(printWriter), "");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class Message {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f5863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f5864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f5865c;
        private final long d;
        Message e;

        Message(int i, String str, long j, int i2) {
            this.f5863a = i;
            this.f5864b = str;
            this.d = j;
            this.f5865c = i2;
        }

        void e(PrintWriter printWriter, long j, int i, String str) {
            printWriter.append((CharSequence) str).append("Message ").append((CharSequence) String.valueOf(this.f5863a - i)).append(": when=").append((CharSequence) String.valueOf(this.d - j)).append("ms, cost=").append((CharSequence) String.valueOf(this.f5865c)).append("ms, info=").append((CharSequence) this.f5864b).println();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class MessageHistory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f5866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f5867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Message f5868c;
        private Message d;
        private int e;
        private int g;

        MessageHistory(long j) {
            this.f5866a = j;
        }

        int c(long j) {
            int i;
            synchronized (this) {
                if (this.d != null) {
                    while (j - 60000 > this.d.d) {
                        Message message = this.d.e;
                        this.d = message;
                        this.e--;
                        if (message == null) {
                            this.f5868c = null;
                            break;
                        }
                    }
                }
                i = this.g;
                this.g = i + 1;
            }
            return i;
        }

        void a(Message message) {
            synchronized (this) {
                this.f5867b++;
                if (this.d == null) {
                    this.d = message;
                    this.f5868c = message;
                    this.e = 1;
                } else {
                    this.f5868c.e = message;
                    this.f5868c = message;
                    int i = this.e;
                    if (i >= 20) {
                        this.d = this.d.e;
                    } else {
                        this.e = i + 1;
                    }
                }
            }
        }

        void d(PrintWriter printWriter, long j) {
            synchronized (this) {
                printWriter.append("HISTORY: From ").append((CharSequence) DfxUtils.e(this.f5866a)).append(", Total=").append((CharSequence) String.valueOf(this.g)).append(", Count(>60ms)=").append((CharSequence) String.valueOf(this.f5867b)).append(", Last one minute list").println();
                for (Message message = this.d; message != null; message = message.e) {
                    message.e(printWriter, j, this.g, "  ");
                }
            }
        }
    }
}
