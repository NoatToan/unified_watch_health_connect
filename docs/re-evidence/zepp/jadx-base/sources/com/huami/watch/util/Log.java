package com.huami.watch.util;

import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class Log {
    private static final Settings a = new Settings();
    private static final Printer b = new a();

    public static class FileLogPrinter extends LogPrinter {
        private static final String[] k = {" D(", " D(", " V(", " D(", " I(", " W(", " E(", " A(", " D(", " D("};
        private final DateFormat j = new SimpleDateFormat("yyyyMMdd HH:mm:ss.SSS", Locale.US);

        @Override // com.huami.watch.util.Log.LogPrinter, com.huami.watch.util.Log.Printer
        public boolean isLogNeed() {
            return Log.a.i();
        }

        @Override // com.huami.watch.util.Log.LogPrinter
        public boolean isLogToFile() {
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:53:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // com.huami.watch.util.Log.LogPrinter
        public void logChunk(int i, String str, String str2) {
            Throwable th;
            FileWriter fileWriter;
            IOException e;
            File fileB = Log.a.b();
            if (fileB == null) {
                return;
            }
            if (fileB.exists() && fileB.length() > Log.a.c()) {
                fileB.delete();
            }
            if (!fileB.exists()) {
                try {
                    fileB.createNewFile();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            synchronized (this.j) {
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.j.format(new Date()));
                sb.append(k[i]);
                sb.append(Process.myPid());
                sb.append(')');
                sb.append(str2);
                sb.append('\n');
                try {
                    try {
                        fileWriter = new FileWriter(fileB, true);
                        try {
                            fileWriter.write(sb.toString());
                            fileWriter.flush();
                            try {
                                fileWriter.close();
                                str2 = fileWriter;
                            } catch (Exception e3) {
                                e = e3;
                                e.printStackTrace();
                            }
                        } catch (IOException e4) {
                            e = e4;
                            e.printStackTrace();
                            str2 = fileWriter;
                            if (fileWriter != null) {
                                try {
                                    fileWriter.close();
                                    str2 = fileWriter;
                                } catch (Exception e5) {
                                    e = e5;
                                    e.printStackTrace();
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (str2 != 0) {
                            try {
                                str2.close();
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e7) {
                    fileWriter = null;
                    e = e7;
                } catch (Throwable th3) {
                    str2 = 0;
                    th = th3;
                    if (str2 != 0) {
                        str2.close();
                    }
                    throw th;
                }
            }
        }

        public void resetFormatTimeZone() {
            this.j.setTimeZone(TimeZone.getDefault());
        }
    }

    public enum LogLevel {
        NONE,
        CONSOLE_ONLY,
        FILE_ONLY,
        FULL
    }

    public static class LogPrinter implements Printer {
        private static final int a = 4000;
        private static final int b = 4;
        private static final int c = 4;
        private static final String d = "────────────────────────────────────────\n";
        private static final String e = "────────────────────────────────────────\n";
        private static final String f = " ───────────────────────────────────────\n";
        private static final char g = '\n';
        private static ThreadLocal<String> h = new ThreadLocal<>();
        private static ThreadLocal<Integer> i = new ThreadLocal<>();

        private String c(String name) {
            return name.substring(name.lastIndexOf(".") + 1);
        }

        private int f(StackTraceElement[] trace) {
            for (int i2 = 4; i2 < trace.length; i2++) {
                String className = trace[i2].getClassName();
                if (!className.equals(LogPrinter.class.getName()) && !className.equals(Log.class.getName()) && !className.equals(a.class.getName())) {
                    return i2 - 1;
                }
            }
            return -1;
        }

        private void j(int logType, Throwable throwable, String messageTag, String message, Object[] args) {
            if (throwable != null && message != null) {
                message = message + '\n' + android.util.Log.getStackTraceString(throwable);
            }
            if (throwable != null && message == null) {
                message = android.util.Log.getStackTraceString(throwable);
            }
            if (message == null) {
                message = "No message/exception is set";
            }
            log(logType, messageTag, message, args);
        }

        public String a(String message, Object... args) {
            return args.length == 0 ? message : String.format(message, args);
        }

        public int b() {
            Integer num = i.get();
            int iD = Log.a.d();
            if (num != null) {
                i.remove();
                iD = num.intValue();
            }
            if (iD >= 0) {
                return iD;
            }
            throw new IllegalStateException("MethodCount cannot be Negative!!");
        }

        @Override // com.huami.watch.util.Log.Printer
        public void d(String tag, String message, Object... args) {
            log(3, tag, message, args);
        }

        @Override // com.huami.watch.util.Log.Printer
        public void e(String tag, String message, Object... args) {
            e(tag, message, null, args);
        }

        public String g() {
            String str = h.get();
            if (str == null) {
                return Log.a.f();
            }
            h.remove();
            return str;
        }

        public String h(int logType, String tag, int methodCount) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int iF = f(stackTrace) + Log.a.e();
            if (methodCount + iF > stackTrace.length) {
                methodCount = (stackTrace.length - iF) - 1;
            }
            StringBuilder sb = new StringBuilder();
            String str = "";
            for (int i2 = methodCount; i2 > 0; i2--) {
                if (Log.a.j() && i2 == methodCount) {
                    sb.append('(');
                    sb.append(Thread.currentThread().getName());
                    sb.append(") ");
                }
                int i3 = i2 + iF;
                if (i3 < stackTrace.length) {
                    String strC = c(stackTrace[i3].getClassName());
                    sb.append(str);
                    sb.append(strC);
                    sb.append('.');
                    sb.append(stackTrace[i3].getMethodName());
                    sb.append(JsonLexerKt.COLON);
                    sb.append(stackTrace[i3].getLineNumber());
                    str = " -> ";
                }
            }
            return sb.toString();
        }

        @Override // com.huami.watch.util.Log.Printer
        public void i(String tag, String message, Object... args) {
            log(4, tag, message, args);
        }

        @Override // com.huami.watch.util.Log.Printer
        public boolean isLogNeed() {
            return Log.a.g();
        }

        public boolean isLogToFile() {
            return false;
        }

        @Override // com.huami.watch.util.Log.Printer
        public void json(String tag, String message, String json) {
            if (TextUtils.isEmpty(json)) {
                d(tag, "Empty/Null json content", new Object[0]);
                return;
            }
            String string = null;
            try {
                if (json.startsWith("{")) {
                    string = new JSONObject(json).toString(4);
                } else if (json.startsWith("[")) {
                    string = new JSONArray(json).toString(4);
                }
                d(tag, message + '\n' + string, new Object[0]);
            } catch (JSONException e2) {
                e(tag, e2.getCause().getMessage() + '\n' + json, new Object[0]);
            }
        }

        public void log(int logType, String messageTag, String msg, Object... args) {
            String strG = g();
            String strA = a(msg, args);
            int iB = b();
            log(logType, iB, h(logType, strG, iB), strG, messageTag, strA);
        }

        public void logChunk(int logType, String tag, String chunk) {
            if (logType == 2) {
                android.util.Log.v(tag, chunk);
                return;
            }
            if (logType == 4) {
                android.util.Log.i(tag, chunk);
                return;
            }
            if (logType == 5) {
                android.util.Log.w(tag, chunk);
                return;
            }
            if (logType == 6) {
                android.util.Log.e(tag, chunk);
            } else if (logType != 7) {
                android.util.Log.d(tag, chunk);
            } else {
                android.util.Log.wtf(tag, chunk);
            }
        }

        @Override // com.huami.watch.util.Log.Printer
        public Printer t(String tag, int methodCount) {
            if (tag != null) {
                h.set(tag);
            }
            i.set(Integer.valueOf(methodCount));
            return this;
        }

        @Override // com.huami.watch.util.Log.Printer
        public void v(String tag, String message, Object... args) {
            log(2, tag, message, args);
        }

        @Override // com.huami.watch.util.Log.Printer
        public void w(String tag, String message, Object... args) {
            w(tag, message, null, args);
        }

        @Override // com.huami.watch.util.Log.Printer
        public void wtf(String tag, String message, Object... args) {
            log(7, tag, message, args);
        }

        @Override // com.huami.watch.util.Log.Printer
        public void xml(String tag, String message, String xml) {
            if (TextUtils.isEmpty(xml)) {
                d(tag, "Empty/Null xml content", new Object[0]);
                return;
            }
            try {
                StreamSource streamSource = new StreamSource(new StringReader(xml));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
                transformerNewTransformer.setOutputProperty("indent", "yes");
                transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                transformerNewTransformer.transform(streamSource, streamResult);
                d(tag, message + '\n' + streamResult.getWriter().toString().replaceFirst(SearchCriteria.GT, ">\n"), new Object[0]);
            } catch (TransformerException e2) {
                e(tag, e2.getCause().getMessage() + '\n' + xml, new Object[0]);
            }
        }

        @Override // com.huami.watch.util.Log.Printer
        public void e(String tag, String message, Throwable throwable, Object... args) {
            j(6, throwable, tag, message, args);
        }

        @Override // com.huami.watch.util.Log.Printer
        public void w(String tag, String message, Throwable throwable, Object... args) {
            j(5, throwable, tag, message, args);
        }

        @Override // com.huami.watch.util.Log.Printer
        public void log(int logType, int methodCount, String headerContent, String tag, String messageTag, String message) {
            StringBuilder sb = new StringBuilder();
            sb.append("────────────────────────────────────────\n");
            sb.append(headerContent);
            sb.append('\n');
            byte[] bytes = message.getBytes();
            int length = bytes.length;
            if ((length <= 4000) || isLogToFile()) {
                if (methodCount > 0 && !isLogToFile()) {
                    sb.append(f);
                }
                sb.append(JsonLexerKt.BEGIN_LIST);
                sb.append(messageTag);
                sb.append("] ");
                sb.append(message);
                if (isLogToFile()) {
                    sb.append('\n');
                }
                logChunk(logType, tag, sb.toString());
                return;
            }
            if (methodCount > 0) {
                sb.append(f);
            }
            for (int i2 = 0; i2 < length; i2 += 4000) {
                int iMin = Math.min(length - i2, 4000);
                sb.append(JsonLexerKt.BEGIN_LIST);
                sb.append(messageTag);
                sb.append("] ");
                sb.append(new String(bytes, i2, iMin));
                logChunk(logType, tag, sb.toString());
                sb.setLength(0);
            }
        }
    }

    public interface Printer {
        void d(String tag, String message, Object... args);

        void e(String tag, String message, Throwable throwable, Object... args);

        void e(String tag, String message, Object... args);

        void i(String tag, String message, Object... args);

        boolean isLogNeed();

        void json(String tag, String message, String json);

        void log(int logType, int methodCount, String headerContent, String tag, String messageTag, String message);

        Printer t(String tag, int methodCount);

        void v(String tag, String message, Object... args);

        void w(String tag, String message, Throwable throwable, Object... args);

        void w(String tag, String message, Object... args);

        void wtf(String tag, String message, Object... args);

        void xml(String tag, String message, String xml);
    }

    public static class Settings {
        private static final String h = "LOG";
        private static final long i = 25165824;
        private File f;
        private String a = "LOG";
        private boolean b = true;
        private int c = 2;
        private int d = 0;
        private LogLevel e = LogLevel.CONSOLE_ONLY;
        private long g = i;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
            Log.e(this.a, "Crash(" + thread + ")", th, new Object[0]);
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }

        public File b() {
            return this.f;
        }

        public long c() {
            return this.g;
        }

        public int d() {
            return this.c;
        }

        public int e() {
            return this.d;
        }

        public String f() {
            return this.a;
        }

        public boolean g() {
            LogLevel logLevel = this.e;
            return logLevel == LogLevel.CONSOLE_ONLY || logLevel == LogLevel.FULL;
        }

        public LogLevel getLogLevel() {
            return this.e;
        }

        public boolean h() {
            return this.e != LogLevel.NONE;
        }

        public Settings hideThreadInfo() {
            this.b = false;
            return this;
        }

        public boolean i() {
            LogLevel logLevel = this.e;
            return logLevel == LogLevel.FILE_ONLY || logLevel == LogLevel.FULL;
        }

        public boolean j() {
            return this.b;
        }

        public Settings setEnableCatchCrash() {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: qr4
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    this.a.k(defaultUncaughtExceptionHandler, thread, th);
                }
            });
            return this;
        }

        public Settings setLogFile(File file) {
            this.f = file;
            return this;
        }

        public Settings setLogFileMaxSize(int sizeMB) {
            this.g = sizeMB * 1024 * 1024;
            return this;
        }

        public Settings setLogLevel(LogLevel logLevel) {
            this.e = logLevel;
            return this;
        }

        public Settings setMethodCount(int methodCount) {
            this.c = methodCount;
            return this;
        }

        public Settings setMethodOffset(int offset) {
            this.d = offset;
            return this;
        }

        public Settings setTag(String tag) {
            this.a = tag;
            return this;
        }
    }

    public static class a extends LogPrinter {
        private List<Printer> j = new ArrayList();
        private Printer k = new LogPrinter();
        private Printer l = new FileLogPrinter();

        public a() {
            this.j.add(this.k);
            this.j.add(this.l);
        }

        @Override // com.huami.watch.util.Log.LogPrinter, com.huami.watch.util.Log.Printer
        public boolean isLogNeed() {
            return Log.a.h();
        }

        @Override // com.huami.watch.util.Log.LogPrinter
        public void log(int logType, String messageTag, String msg, Object... args) {
            if (isLogNeed()) {
                String strG = g();
                String strA = a(msg, args);
                int iB = b();
                String strH = h(logType, strG, iB);
                if (logType == 2) {
                    if (this.k.isLogNeed()) {
                        this.k.log(logType, iB, strH, strG, messageTag, strA);
                    }
                } else {
                    for (Printer printer : this.j) {
                        if (printer.isLogNeed()) {
                            printer.log(logType, iB, strH, strG, messageTag, strA);
                        }
                    }
                }
            }
        }
    }

    private Log() {
    }

    public static Printer c() {
        return ((a) b).k;
    }

    public static void d(String tag, String message, Object... args) {
        b.d(tag, message, args);
    }

    public static void e(String tag, String message, Object... args) {
        b.e(tag, message, args);
    }

    public static Printer f() {
        return ((a) b).l;
    }

    public static void i(String tag, String message, Object... args) {
        b.i(tag, message, args);
    }

    public static void json(String tag, String message, String json) {
        b.json(tag, message, json);
    }

    public static Settings settings() {
        return a;
    }

    public static Printer t(String tag) {
        return b.t(tag, a.d());
    }

    public static void v(String tag, String message, Object... args) {
        b.v(tag, message, args);
    }

    public static void w(String tag, String message, Object... args) {
        b.w(tag, message, args);
    }

    public static void wtf(String tag, String message, Object... args) {
        b.wtf(tag, message, args);
    }

    public static void xml(String tag, String message, String xml) {
        b.xml(tag, message, xml);
    }

    public static void e(String tag, String message, Throwable throwable, Object... args) {
        b.e(tag, message, throwable, args);
    }

    public static Printer t(int methodCount) {
        return b.t(null, methodCount);
    }

    public static void w(String tag, String message, Throwable throwable, Object... args) {
        b.w(tag, message, throwable, args);
    }

    public static Printer t(String tag, int methodCount) {
        return b.t(tag, methodCount);
    }
}
