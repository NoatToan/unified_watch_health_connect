package clc.utils.debug.slog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class SolidLogger {
    private static SolidLogger g;
    private static SolidLoggerCallback h;
    private static SlogFile i;
    private static SimpleDateFormat e = new SimpleDateFormat("yy.MM.dd HH:mm:ss.SSS");
    private static AtomicBoolean f = new AtomicBoolean(false);
    private static String b = "";
    private static String a = "";
    private static boolean c = false;
    private static BroadcastReceiver d = new a();

    public interface SolidLoggerCallback {
        void onNewRecord(String str);
    }

    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: clc.utils.debug.slog.SolidLogger$a$a, reason: collision with other inner class name */
        public class RunnableC0076a implements Runnable {
            public final /* synthetic */ Context b;

            public RunnableC0076a(Context context) {
                this.b = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                Context context = this.b;
                if (context != null) {
                    context.sendBroadcast(new Intent(SlogConfig.FORCE_FLUSH_FINISH));
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Log.i("Slog", "Force flush Slog...");
            if (SolidLogger.c) {
                Log.i("Slog", "Force flush Slog Refused for muting .");
            } else if (SolidLogger.i != null) {
                SolidLogger.i.i(new RunnableC0076a(context));
            }
        }
    }

    private SolidLogger() {
    }

    private static void c(String str) {
        String string;
        StringBuilder sb;
        String str2;
        if (!TextUtils.isEmpty(a)) {
            String str3 = a + "/slog";
            if (TextUtils.isEmpty(str)) {
                string = str3;
            } else {
                sb = new StringBuilder();
                sb.append(a);
                str2 = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
                sb.append(str2);
                sb.append(str);
                string = sb.toString();
            }
        } else if (TextUtils.isEmpty(str)) {
            string = SlogConfig.STORAGE_PATH;
        } else {
            sb = new StringBuilder();
            str2 = SlogConfig.STORAGE_DIR;
            sb.append(str2);
            sb.append(str);
            string = sb.toString();
        }
        if (i == null) {
            i = new SlogFile(string);
        }
    }

    public static SolidLogger getInstance() {
        if (!f.get() && !c) {
            throw new IllegalArgumentException("please call withContext() firstly !");
        }
        if (g == null) {
            synchronized (SolidLogger.class) {
                if (g == null) {
                    g = new SolidLogger();
                    if (!c) {
                        c(b);
                    }
                }
            }
        }
        return g;
    }

    public static SolidLogger getInstance(boolean z) {
        c = z;
        return getInstance();
    }

    public static void setFileDir(String str) {
        synchronized (SolidLogger.class) {
            a = str;
        }
    }

    public static void setMute(boolean z) {
        synchronized (SolidLogger.class) {
            c = z;
        }
    }

    public static void setSolidLoggerCallback(SolidLoggerCallback solidLoggerCallback) {
        h = solidLoggerCallback;
    }

    public static void withContext(Context context) {
        synchronized (SolidLogger.class) {
            withContext(context, null);
        }
    }

    public static void withContext(Context context, String str) {
        AtomicBoolean atomicBoolean;
        synchronized (SolidLogger.class) {
            if (c) {
                atomicBoolean = f;
            } else {
                if (context == null) {
                    throw new IllegalArgumentException("Context is null !");
                }
                if (TextUtils.isEmpty(str)) {
                    str = context.getPackageName();
                }
                b = str;
                c(str);
                try {
                    context.getApplicationContext().unregisterReceiver(d);
                } catch (Exception unused) {
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(SlogConfig.FORCE_FLUSH);
                context.getApplicationContext().registerReceiver(d, intentFilter);
                atomicBoolean = f;
            }
            atomicBoolean.set(true);
        }
    }

    public void flush() {
        SlogFile slogFile = i;
        if (slogFile != null) {
            slogFile.i(null);
        }
    }

    public void flush(Runnable runnable) {
        SlogFile slogFile = i;
        if (slogFile != null) {
            slogFile.i(runnable);
        }
    }

    public void with(String str, String str2) {
        if (c) {
            return;
        }
        with(str, str2, null);
    }

    public void with(String str, String str2, Throwable th) {
        if (c || i == null) {
            return;
        }
        String str3 = e.format(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
        Record record = new Record();
        record.timeStamp = str3;
        record.tag = str;
        record.content = str2;
        SolidLoggerCallback solidLoggerCallback = h;
        if (solidLoggerCallback != null) {
            solidLoggerCallback.onNewRecord(record.toString());
        }
        i.d(record);
    }

    public void with2(String str, String str2) {
        if (c) {
            return;
        }
        Log.i(str, str2);
        if (f.get()) {
            with(str, str2);
        }
    }
}
