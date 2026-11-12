package gt2;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.android.LogcatAppender;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.rolling.FixedWindowRollingPolicy;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import ch.qos.logback.core.util.FileSize;
import d53.u;
import d53.w;
import j20.x;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgt2/b;", "", "<init>", "()V", "a", "glogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f79006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d f79007c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f79005a = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f79008d = {0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final CountDownLatch f79009e = new CountDownLatch(1);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lgt2/b$a;", "", "<init>", "()V", "", "LOGCAT_APPENDER_NAME", "Ljava/lang/String;", "Lgt2/d;", "config", "Lgt2/d;", "", "fileLoggersLock", "[B", "filesDir", "Ljava/util/concurrent/CountDownLatch;", "latch", "Ljava/util/concurrent/CountDownLatch;", "logsSubDirectoryName", "glogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a() throws InterruptedException {
            d dVar = b.f79007c;
            if (dVar == null) {
                break;
            }
            int i14 = dVar.f79016e;
            while (!(LoggerFactory.getILoggerFactory() instanceof LoggerContext)) {
                int i15 = i14 - 1;
                if (i14 <= 0) {
                    break;
                }
                Thread.sleep(100L);
                i14 = i15;
            }
            try {
                b.f79009e.await(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }

        public static /* synthetic */ Logger e(a aVar, gt2.a aVar2, int i14) {
            return aVar.d(aVar2, (i14 & 2) == 0, true);
        }

        public static String f(String str) {
            str.getClass();
            if (w.z(str, "#", false)) {
                String lowerCase = str.substring(0, w.H(str, "#", 0, false, 6)).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return lowerCase;
            }
            String lowerCase2 = str.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            return lowerCase2;
        }

        public static String g(String str) {
            if (str.length() > 0) {
                return u.p(str, "/", false) ? str : str.concat("/");
            }
            if (b.f79007c == null) {
                s.m("config");
                throw null;
            }
            String str2 = b.f79006b;
            if (str2 != null) {
                return str2.concat("/logs/");
            }
            s.m("filesDir");
            throw null;
        }

        public static Logger j(LoggerContext loggerContext) {
            Logger logger = loggerContext == null ? null : loggerContext.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
            if (logger == null) {
                ILoggerFactory iLoggerFactory = LoggerFactory.getILoggerFactory();
                if (iLoggerFactory == null) {
                    x.l("null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext");
                    return null;
                }
                logger = ((LoggerContext) iLoggerFactory).getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
            }
            logger.getClass();
            return logger;
        }

        public static boolean k(String str) throws InterruptedException {
            str.getClass();
            a();
            ILoggerFactory iLoggerFactory = LoggerFactory.getILoggerFactory();
            if (iLoggerFactory != null) {
                return ((LoggerContext) iLoggerFactory).exists(str) != null;
            }
            x.l("null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext");
            return false;
        }

        public static void l(String str, boolean z14) {
            String file;
            str.getClass();
            if (!k(str)) {
                return;
            }
            org.slf4j.Logger logger = LoggerFactory.getLogger(str);
            if (logger == null) {
                x.l("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
                return;
            }
            Logger logger2 = (Logger) logger;
            Appender<ILoggingEvent> appender = logger2.getAppender("file:".concat(str));
            if (appender == null || !(appender instanceof RollingFileAppender)) {
                file = null;
            } else {
                appender.stop();
                logger2.detachAppender("file:".concat(str));
                file = ((RollingFileAppender) appender).getFile();
                d dVar = b.f79007c;
                if (dVar == null) {
                    s.m("config");
                    throw null;
                }
                synchronized (dVar.f79014c) {
                    d dVar2 = b.f79007c;
                    if (dVar2 == null) {
                        s.m("config");
                        throw null;
                    }
                    dVar2.f79014c.remove(new gt2.a(str, file.substring(0, w.L(0, 6, file, "/"))));
                }
            }
            if (!w.z(str, "#", false)) {
                ILoggerFactory iLoggerFactory = LoggerFactory.getILoggerFactory();
                if (iLoggerFactory == null) {
                    x.l("null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext");
                    return;
                }
                for (Logger logger3 : ((LoggerContext) iLoggerFactory).getLoggerList()) {
                    String name = logger3.getName();
                    name.getClass();
                    if (u.y(name, str.concat("#"), false)) {
                        String name2 = logger3.getName();
                        name2.getClass();
                        l(name2, false);
                    }
                }
            }
            if (!z14 || file == null) {
                return;
            }
            File file2 = new File(file);
            if (file2.exists()) {
                file2.delete();
            }
            d dVar3 = b.f79007c;
            if (dVar3 == null) {
                s.m("config");
                throw null;
            }
            int i14 = dVar3.f79015d;
            int i15 = 1;
            if (1 > i14) {
                return;
            }
            while (true) {
                int i16 = i15 + 1;
                String str2 = file.substring(0, w.L(0, 6, file, ".")) + "." + i15 + ".log";
                String str3 = file.substring(0, w.L(0, 6, file, ".")) + "." + i15 + ".gz";
                File file3 = new File(str2);
                if (file3.exists()) {
                    file3.delete();
                }
                File file4 = new File(str3);
                if (file4.exists()) {
                    file4.delete();
                }
                if (i15 == i14) {
                    return;
                } else {
                    i15 = i16;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001e  */
        /* JADX WARN: Code duplicated, block: B:16:0x002a  */
        /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
        public final void b(LoggerContext loggerContext) {
            PatternLayoutEncoder patternLayoutEncoder;
            d dVar;
            LogcatAppender logcatAppender;
            d dVar2 = b.f79007c;
            if (dVar2 == null) {
                s.m("config");
                throw null;
            }
            d.b bVar = dVar2.f79012a;
            d.b bVar2 = d.b.LOG_TYPE_LOGCAT_AND_FILE;
            if (bVar == bVar2) {
                patternLayoutEncoder = new PatternLayoutEncoder();
                patternLayoutEncoder.setContext(loggerContext);
                dVar = b.f79007c;
                if (dVar != null) {
                    s.m("config");
                    throw null;
                }
                patternLayoutEncoder.setPattern(dVar.f79021j);
                patternLayoutEncoder.start();
                PatternLayoutEncoder patternLayoutEncoder2 = new PatternLayoutEncoder();
                patternLayoutEncoder2.setContext(loggerContext);
                patternLayoutEncoder2.setPattern("%logger{32}");
                patternLayoutEncoder2.start();
                logcatAppender = new LogcatAppender();
                logcatAppender.setContext(loggerContext);
                logcatAppender.setEncoder(patternLayoutEncoder);
                logcatAppender.setTagEncoder(patternLayoutEncoder2);
                logcatAppender.setName("logcat");
                logcatAppender.start();
            } else {
                d dVar3 = b.f79007c;
                if (dVar3 == null) {
                    s.m("config");
                    throw null;
                }
                if (dVar3.f79012a == d.b.LOG_TYPE_LOGCAT) {
                    patternLayoutEncoder = new PatternLayoutEncoder();
                    patternLayoutEncoder.setContext(loggerContext);
                    dVar = b.f79007c;
                    if (dVar != null) {
                        s.m("config");
                        throw null;
                    }
                    patternLayoutEncoder.setPattern(dVar.f79021j);
                    patternLayoutEncoder.start();
                    PatternLayoutEncoder patternLayoutEncoder3 = new PatternLayoutEncoder();
                    patternLayoutEncoder3.setContext(loggerContext);
                    patternLayoutEncoder3.setPattern("%logger{32}");
                    patternLayoutEncoder3.start();
                    logcatAppender = new LogcatAppender();
                    logcatAppender.setContext(loggerContext);
                    logcatAppender.setEncoder(patternLayoutEncoder);
                    logcatAppender.setTagEncoder(patternLayoutEncoder3);
                    logcatAppender.setName("logcat");
                    logcatAppender.start();
                } else {
                    logcatAppender = null;
                }
            }
            d dVar4 = b.f79007c;
            if (dVar4 == null) {
                s.m("config");
                throw null;
            }
            d.b bVar3 = dVar4.f79012a;
            e eVarC = (bVar3 == bVar2 || bVar3 == d.b.LOG_TYPE_FILE) ? c(loggerContext, "app", "") : null;
            Logger loggerJ = j(loggerContext);
            d dVar5 = b.f79007c;
            if (dVar5 == null) {
                s.m("config");
                throw null;
            }
            loggerJ.setLevel(dVar5.f79013b);
            if (logcatAppender != null) {
                loggerJ.addAppender(logcatAppender);
            }
            if (eVarC != null) {
                loggerJ.addAppender(eVarC);
            }
            d dVar6 = b.f79007c;
            if (dVar6 == null) {
                s.m("config");
                throw null;
            }
            for (gt2.a aVar : dVar6.f79014c) {
                aVar.getClass();
                e(this, aVar, 4);
            }
        }

        public final synchronized e c(LoggerContext loggerContext, String str, String str2) {
            e eVar;
            String str3;
            try {
                String strF = f(str);
                eVar = new e();
                eVar.setContext(loggerContext);
                if (b.f79007c == null) {
                    s.m("config");
                    throw null;
                }
                eVar.setLazy(false);
                a aVar = b.f79005a;
                aVar.getClass();
                String strG = g(str2);
                String lowerCase = strF.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String str4 = strG + lowerCase + ".log";
                aVar.h(org.slf4j.Logger.ROOT_LOGGER_NAME).debug(String.valueOf(new File(str4).length()));
                eVar.setFile(str4);
                eVar.setName("file:".concat(str));
                PatternLayoutEncoder patternLayoutEncoder = new PatternLayoutEncoder();
                patternLayoutEncoder.setContext(loggerContext);
                d dVar = b.f79007c;
                if (dVar == null) {
                    s.m("config");
                    throw null;
                }
                patternLayoutEncoder.setPattern(dVar.f79020i);
                patternLayoutEncoder.start();
                eVar.setEncoder(patternLayoutEncoder);
                SizeBasedTriggeringPolicy sizeBasedTriggeringPolicy = new SizeBasedTriggeringPolicy();
                d dVar2 = b.f79007c;
                if (dVar2 == null) {
                    s.m("config");
                    throw null;
                }
                sizeBasedTriggeringPolicy.setMaxFileSize(FileSize.valueOf(dVar2.f79017f));
                sizeBasedTriggeringPolicy.setContext(loggerContext);
                sizeBasedTriggeringPolicy.start();
                FixedWindowRollingPolicy fixedWindowRollingPolicy = new FixedWindowRollingPolicy();
                fixedWindowRollingPolicy.setContext(loggerContext);
                fixedWindowRollingPolicy.setParent(eVar);
                d dVar3 = b.f79007c;
                if (dVar3 == null) {
                    s.m("config");
                    throw null;
                }
                if (dVar3.f79018g) {
                    str3 = g(str2) + strF + "%i.gz";
                } else {
                    str3 = g(str2) + strF + "%i";
                }
                fixedWindowRollingPolicy.setFileNamePattern(str3);
                fixedWindowRollingPolicy.setMinIndex(1);
                d dVar4 = b.f79007c;
                if (dVar4 == null) {
                    s.m("config");
                    throw null;
                }
                fixedWindowRollingPolicy.setMaxIndex(dVar4.f79015d);
                fixedWindowRollingPolicy.start();
                eVar.setTriggeringPolicy(sizeBasedTriggeringPolicy);
                eVar.setRollingPolicy(fixedWindowRollingPolicy);
                eVar.start();
            } catch (Throwable th3) {
                throw th3;
            }
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00e5 A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x001e, B:10:0x0034, B:12:0x003e, B:16:0x006c, B:17:0x00c4, B:21:0x00ce, B:29:0x00db, B:30:0x00dc, B:31:0x00dd, B:32:0x00e4, B:33:0x00e5, B:35:0x00e9, B:38:0x00f6, B:40:0x00fc, B:42:0x0104, B:44:0x0113, B:45:0x0115, B:49:0x011f, B:55:0x0129, B:56:0x012a, B:57:0x012b, B:59:0x0134, B:62:0x0141, B:65:0x0146, B:66:0x014d, B:67:0x014e, B:68:0x0155, B:69:0x0156, B:71:0x015c, B:74:0x0163, B:75:0x016a, B:76:0x016b, B:77:0x0170, B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128, B:18:0x00c5, B:20:0x00c9, B:27:0x00d5, B:28:0x00da), top: B:80:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00e9 A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x001e, B:10:0x0034, B:12:0x003e, B:16:0x006c, B:17:0x00c4, B:21:0x00ce, B:29:0x00db, B:30:0x00dc, B:31:0x00dd, B:32:0x00e4, B:33:0x00e5, B:35:0x00e9, B:38:0x00f6, B:40:0x00fc, B:42:0x0104, B:44:0x0113, B:45:0x0115, B:49:0x011f, B:55:0x0129, B:56:0x012a, B:57:0x012b, B:59:0x0134, B:62:0x0141, B:65:0x0146, B:66:0x014d, B:67:0x014e, B:68:0x0155, B:69:0x0156, B:71:0x015c, B:74:0x0163, B:75:0x016a, B:76:0x016b, B:77:0x0170, B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128, B:18:0x00c5, B:20:0x00c9, B:27:0x00d5, B:28:0x00da), top: B:80:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00f6 A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x001e, B:10:0x0034, B:12:0x003e, B:16:0x006c, B:17:0x00c4, B:21:0x00ce, B:29:0x00db, B:30:0x00dc, B:31:0x00dd, B:32:0x00e4, B:33:0x00e5, B:35:0x00e9, B:38:0x00f6, B:40:0x00fc, B:42:0x0104, B:44:0x0113, B:45:0x0115, B:49:0x011f, B:55:0x0129, B:56:0x012a, B:57:0x012b, B:59:0x0134, B:62:0x0141, B:65:0x0146, B:66:0x014d, B:67:0x014e, B:68:0x0155, B:69:0x0156, B:71:0x015c, B:74:0x0163, B:75:0x016a, B:76:0x016b, B:77:0x0170, B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128, B:18:0x00c5, B:20:0x00c9, B:27:0x00d5, B:28:0x00da), top: B:80:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00fc A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x001e, B:10:0x0034, B:12:0x003e, B:16:0x006c, B:17:0x00c4, B:21:0x00ce, B:29:0x00db, B:30:0x00dc, B:31:0x00dd, B:32:0x00e4, B:33:0x00e5, B:35:0x00e9, B:38:0x00f6, B:40:0x00fc, B:42:0x0104, B:44:0x0113, B:45:0x0115, B:49:0x011f, B:55:0x0129, B:56:0x012a, B:57:0x012b, B:59:0x0134, B:62:0x0141, B:65:0x0146, B:66:0x014d, B:67:0x014e, B:68:0x0155, B:69:0x0156, B:71:0x015c, B:74:0x0163, B:75:0x016a, B:76:0x016b, B:77:0x0170, B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128, B:18:0x00c5, B:20:0x00c9, B:27:0x00d5, B:28:0x00da), top: B:80:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0104 A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x001e, B:10:0x0034, B:12:0x003e, B:16:0x006c, B:17:0x00c4, B:21:0x00ce, B:29:0x00db, B:30:0x00dc, B:31:0x00dd, B:32:0x00e4, B:33:0x00e5, B:35:0x00e9, B:38:0x00f6, B:40:0x00fc, B:42:0x0104, B:44:0x0113, B:45:0x0115, B:49:0x011f, B:55:0x0129, B:56:0x012a, B:57:0x012b, B:59:0x0134, B:62:0x0141, B:65:0x0146, B:66:0x014d, B:67:0x014e, B:68:0x0155, B:69:0x0156, B:71:0x015c, B:74:0x0163, B:75:0x016a, B:76:0x016b, B:77:0x0170, B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128, B:18:0x00c5, B:20:0x00c9, B:27:0x00d5, B:28:0x00da), top: B:80:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x0113 A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x001e, B:10:0x0034, B:12:0x003e, B:16:0x006c, B:17:0x00c4, B:21:0x00ce, B:29:0x00db, B:30:0x00dc, B:31:0x00dd, B:32:0x00e4, B:33:0x00e5, B:35:0x00e9, B:38:0x00f6, B:40:0x00fc, B:42:0x0104, B:44:0x0113, B:45:0x0115, B:49:0x011f, B:55:0x0129, B:56:0x012a, B:57:0x012b, B:59:0x0134, B:62:0x0141, B:65:0x0146, B:66:0x014d, B:67:0x014e, B:68:0x0155, B:69:0x0156, B:71:0x015c, B:74:0x0163, B:75:0x016a, B:76:0x016b, B:77:0x0170, B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128, B:18:0x00c5, B:20:0x00c9, B:27:0x00d5, B:28:0x00da), top: B:80:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x011a A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #1 {, blocks: (B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128), top: B:81:0x0116, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0123 A[Catch: all -> 0x0121, TRY_ENTER, TryCatch #1 {, blocks: (B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128), top: B:81:0x0116, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x0134 A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x001e, B:10:0x0034, B:12:0x003e, B:16:0x006c, B:17:0x00c4, B:21:0x00ce, B:29:0x00db, B:30:0x00dc, B:31:0x00dd, B:32:0x00e4, B:33:0x00e5, B:35:0x00e9, B:38:0x00f6, B:40:0x00fc, B:42:0x0104, B:44:0x0113, B:45:0x0115, B:49:0x011f, B:55:0x0129, B:56:0x012a, B:57:0x012b, B:59:0x0134, B:62:0x0141, B:65:0x0146, B:66:0x014d, B:67:0x014e, B:68:0x0155, B:69:0x0156, B:71:0x015c, B:74:0x0163, B:75:0x016a, B:76:0x016b, B:77:0x0170, B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128, B:18:0x00c5, B:20:0x00c9, B:27:0x00d5, B:28:0x00da), top: B:80:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0146 A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x001e, B:10:0x0034, B:12:0x003e, B:16:0x006c, B:17:0x00c4, B:21:0x00ce, B:29:0x00db, B:30:0x00dc, B:31:0x00dd, B:32:0x00e4, B:33:0x00e5, B:35:0x00e9, B:38:0x00f6, B:40:0x00fc, B:42:0x0104, B:44:0x0113, B:45:0x0115, B:49:0x011f, B:55:0x0129, B:56:0x012a, B:57:0x012b, B:59:0x0134, B:62:0x0141, B:65:0x0146, B:66:0x014d, B:67:0x014e, B:68:0x0155, B:69:0x0156, B:71:0x015c, B:74:0x0163, B:75:0x016a, B:76:0x016b, B:77:0x0170, B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128, B:18:0x00c5, B:20:0x00c9, B:27:0x00d5, B:28:0x00da), top: B:80:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x014e A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x001e, B:10:0x0034, B:12:0x003e, B:16:0x006c, B:17:0x00c4, B:21:0x00ce, B:29:0x00db, B:30:0x00dc, B:31:0x00dd, B:32:0x00e4, B:33:0x00e5, B:35:0x00e9, B:38:0x00f6, B:40:0x00fc, B:42:0x0104, B:44:0x0113, B:45:0x0115, B:49:0x011f, B:55:0x0129, B:56:0x012a, B:57:0x012b, B:59:0x0134, B:62:0x0141, B:65:0x0146, B:66:0x014d, B:67:0x014e, B:68:0x0155, B:69:0x0156, B:71:0x015c, B:74:0x0163, B:75:0x016a, B:76:0x016b, B:77:0x0170, B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128, B:18:0x00c5, B:20:0x00c9, B:27:0x00d5, B:28:0x00da), top: B:80:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0156 A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x001e, B:10:0x0034, B:12:0x003e, B:16:0x006c, B:17:0x00c4, B:21:0x00ce, B:29:0x00db, B:30:0x00dc, B:31:0x00dd, B:32:0x00e4, B:33:0x00e5, B:35:0x00e9, B:38:0x00f6, B:40:0x00fc, B:42:0x0104, B:44:0x0113, B:45:0x0115, B:49:0x011f, B:55:0x0129, B:56:0x012a, B:57:0x012b, B:59:0x0134, B:62:0x0141, B:65:0x0146, B:66:0x014d, B:67:0x014e, B:68:0x0155, B:69:0x0156, B:71:0x015c, B:74:0x0163, B:75:0x016a, B:76:0x016b, B:77:0x0170, B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128, B:18:0x00c5, B:20:0x00c9, B:27:0x00d5, B:28:0x00da), top: B:80:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x015c A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x001e, B:10:0x0034, B:12:0x003e, B:16:0x006c, B:17:0x00c4, B:21:0x00ce, B:29:0x00db, B:30:0x00dc, B:31:0x00dd, B:32:0x00e4, B:33:0x00e5, B:35:0x00e9, B:38:0x00f6, B:40:0x00fc, B:42:0x0104, B:44:0x0113, B:45:0x0115, B:49:0x011f, B:55:0x0129, B:56:0x012a, B:57:0x012b, B:59:0x0134, B:62:0x0141, B:65:0x0146, B:66:0x014d, B:67:0x014e, B:68:0x0155, B:69:0x0156, B:71:0x015c, B:74:0x0163, B:75:0x016a, B:76:0x016b, B:77:0x0170, B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128, B:18:0x00c5, B:20:0x00c9, B:27:0x00d5, B:28:0x00da), top: B:80:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x0163 A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x001e, B:10:0x0034, B:12:0x003e, B:16:0x006c, B:17:0x00c4, B:21:0x00ce, B:29:0x00db, B:30:0x00dc, B:31:0x00dd, B:32:0x00e4, B:33:0x00e5, B:35:0x00e9, B:38:0x00f6, B:40:0x00fc, B:42:0x0104, B:44:0x0113, B:45:0x0115, B:49:0x011f, B:55:0x0129, B:56:0x012a, B:57:0x012b, B:59:0x0134, B:62:0x0141, B:65:0x0146, B:66:0x014d, B:67:0x014e, B:68:0x0155, B:69:0x0156, B:71:0x015c, B:74:0x0163, B:75:0x016a, B:76:0x016b, B:77:0x0170, B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128, B:18:0x00c5, B:20:0x00c9, B:27:0x00d5, B:28:0x00da), top: B:80:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x016b A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x001e, B:10:0x0034, B:12:0x003e, B:16:0x006c, B:17:0x00c4, B:21:0x00ce, B:29:0x00db, B:30:0x00dc, B:31:0x00dd, B:32:0x00e4, B:33:0x00e5, B:35:0x00e9, B:38:0x00f6, B:40:0x00fc, B:42:0x0104, B:44:0x0113, B:45:0x0115, B:49:0x011f, B:55:0x0129, B:56:0x012a, B:57:0x012b, B:59:0x0134, B:62:0x0141, B:65:0x0146, B:66:0x014d, B:67:0x014e, B:68:0x0155, B:69:0x0156, B:71:0x015c, B:74:0x0163, B:75:0x016a, B:76:0x016b, B:77:0x0170, B:46:0x0116, B:48:0x011a, B:53:0x0123, B:54:0x0128, B:18:0x00c5, B:20:0x00c9, B:27:0x00d5, B:28:0x00da), top: B:80:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:81:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public final synchronized Logger d(gt2.a aVar, boolean z14, boolean z15) {
            d dVar;
            boolean z16;
            String str;
            org.slf4j.Logger logger;
            org.slf4j.Logger logger2;
            Logger logger3;
            ILoggerFactory iLoggerFactory;
            Appender<ILoggingEvent> appender;
            d dVar2;
            aVar.f79003b = g(aVar.f79003b);
            if (!k(aVar.f79002a)) {
                dVar = b.f79007c;
                if (dVar != null) {
                    s.m("config");
                    throw null;
                }
                z16 = (!dVar.f79014c.contains(aVar)) | z14;
                str = aVar.f79002a;
                if (z16) {
                    logger = LoggerFactory.getLogger(str);
                    if (logger != null) {
                        throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
                    }
                    Logger logger4 = (Logger) logger;
                    logger4.setAdditive(z15);
                    return logger4;
                }
                logger2 = LoggerFactory.getLogger(str);
                if (logger2 != null) {
                    throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
                }
                logger3 = (Logger) logger2;
                iLoggerFactory = LoggerFactory.getILoggerFactory();
                if (iLoggerFactory != null) {
                    throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext");
                }
                e eVarC = c((LoggerContext) iLoggerFactory, aVar.f79002a, aVar.f79003b);
                logger3.setAdditive(z15);
                if (!z14) {
                    synchronized (b.f79008d) {
                        dVar2 = b.f79007c;
                        if (dVar2 != null) {
                            s.m("config");
                            throw null;
                        }
                        dVar2.f79014c.add(aVar);
                    }
                }
                logger3.addAppender(eVarC);
                if (!logger3.isAdditive() && (appender = j(null).getAppender("logcat")) != null) {
                    logger3.addAppender(appender);
                }
                return logger3;
            }
            org.slf4j.Logger logger5 = LoggerFactory.getLogger(aVar.f79002a);
            if (logger5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
            }
            Logger logger6 = (Logger) logger5;
            Appender<ILoggingEvent> appender2 = logger6.getAppender("file:" + aVar.f79002a);
            if (appender2 == null) {
                dVar = b.f79007c;
                if (dVar != null) {
                    s.m("config");
                    throw null;
                }
                z16 = (!dVar.f79014c.contains(aVar)) | z14;
                str = aVar.f79002a;
                if (z16) {
                    logger = LoggerFactory.getLogger(str);
                    if (logger != null) {
                        throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
                    }
                    Logger logger7 = (Logger) logger;
                    logger7.setAdditive(z15);
                    return logger7;
                }
                logger2 = LoggerFactory.getLogger(str);
                if (logger2 != null) {
                    throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
                }
                logger3 = (Logger) logger2;
                iLoggerFactory = LoggerFactory.getILoggerFactory();
                if (iLoggerFactory != null) {
                    throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext");
                }
                e eVarC2 = c((LoggerContext) iLoggerFactory, aVar.f79002a, aVar.f79003b);
                logger3.setAdditive(z15);
                if (!z14) {
                    synchronized (b.f79008d) {
                        dVar2 = b.f79007c;
                        if (dVar2 != null) {
                            s.m("config");
                            throw null;
                        }
                        dVar2.f79014c.add(aVar);
                    }
                }
                logger3.addAppender(eVarC2);
                if (!logger3.isAdditive()) {
                    logger3.addAppender(appender);
                }
                return logger3;
            }
            String strF = f(aVar.f79002a);
            if (!(appender2 instanceof RollingFileAppender)) {
                dVar = b.f79007c;
                if (dVar != null) {
                    s.m("config");
                    throw null;
                }
                z16 = (!dVar.f79014c.contains(aVar)) | z14;
                str = aVar.f79002a;
                if (z16) {
                    logger = LoggerFactory.getLogger(str);
                    if (logger != null) {
                        throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
                    }
                    Logger logger8 = (Logger) logger;
                    logger8.setAdditive(z15);
                    return logger8;
                }
                logger2 = LoggerFactory.getLogger(str);
                if (logger2 != null) {
                    throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
                }
                logger3 = (Logger) logger2;
                iLoggerFactory = LoggerFactory.getILoggerFactory();
                if (iLoggerFactory != null) {
                    throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext");
                }
                e eVarC3 = c((LoggerContext) iLoggerFactory, aVar.f79002a, aVar.f79003b);
                logger3.setAdditive(z15);
                if (!z14) {
                    synchronized (b.f79008d) {
                        dVar2 = b.f79007c;
                        if (dVar2 != null) {
                            s.m("config");
                            throw null;
                        }
                        dVar2.f79014c.add(aVar);
                    }
                }
                logger3.addAppender(eVarC3);
                if (!logger3.isAdditive()) {
                    logger3.addAppender(appender);
                }
                return logger3;
            }
            String file = ((RollingFileAppender) appender2).getFile();
            String str2 = aVar.f79003b;
            Locale locale = Locale.ROOT;
            String lowerCase = strF.toLowerCase(locale);
            lowerCase.getClass();
            if (s.g(file, str2 + lowerCase + ".log")) {
                return logger6;
            }
            String str3 = aVar.f79002a;
            String str4 = aVar.f79003b;
            String lowerCase2 = strF.toLowerCase(locale);
            lowerCase2.getClass();
            logger6.info("File for logger " + str3 + " moved to " + str4 + lowerCase2 + ".log");
            logger6.detachAppender(appender2);
            appender2.stop();
            String str5 = aVar.f79002a;
            String file2 = ((RollingFileAppender) appender2).getFile();
            file2.getClass();
            String file3 = ((RollingFileAppender) appender2).getFile();
            file3.getClass();
            gt2.a aVar2 = new gt2.a(str5, file2.substring(0, w.L(0, 6, file3, "/")));
            synchronized (b.f79008d) {
                d dVar3 = b.f79007c;
                if (dVar3 == null) {
                    s.m("config");
                    throw null;
                }
                dVar3.f79014c.remove(aVar2);
            }
            dVar = b.f79007c;
            if (dVar != null) {
                s.m("config");
                throw null;
            }
            z16 = (!dVar.f79014c.contains(aVar)) | z14;
            str = aVar.f79002a;
            if (z16) {
                logger = LoggerFactory.getLogger(str);
                if (logger != null) {
                    throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
                }
                Logger logger9 = (Logger) logger;
                logger9.setAdditive(z15);
                return logger9;
            }
            logger2 = LoggerFactory.getLogger(str);
            if (logger2 != null) {
                throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
            }
            logger3 = (Logger) logger2;
            iLoggerFactory = LoggerFactory.getILoggerFactory();
            if (iLoggerFactory != null) {
                throw new NullPointerException("null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext");
            }
            e eVarC4 = c((LoggerContext) iLoggerFactory, aVar.f79002a, aVar.f79003b);
            logger3.setAdditive(z15);
            if (!z14) {
                synchronized (b.f79008d) {
                    dVar2 = b.f79007c;
                    if (dVar2 != null) {
                        s.m("config");
                        throw null;
                    }
                    dVar2.f79014c.add(aVar);
                }
            }
            logger3.addAppender(eVarC4);
            if (!logger3.isAdditive()) {
                logger3.addAppender(appender);
            }
            return logger3;
            throw th;
        }

        public final org.slf4j.Logger h(String str) {
            str.getClass();
            a();
            if (w.z(str, "#", false)) {
                String strSubstring = str.substring(0, w.H(str, "#", 0, false, 6));
                if (k(strSubstring)) {
                    org.slf4j.Logger logger = LoggerFactory.getLogger(strSubstring);
                    if (logger == null) {
                        x.l("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
                        return null;
                    }
                    Appender<ILoggingEvent> appender = ((Logger) logger).getAppender("file:".concat(strSubstring));
                    boolean z14 = appender != null && (appender instanceof RollingFileAppender);
                    if (k(str)) {
                        org.slf4j.Logger logger2 = LoggerFactory.getLogger(str);
                        if (logger2 == null) {
                            x.l("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
                            return null;
                        }
                        Logger logger3 = (Logger) logger2;
                        Appender<ILoggingEvent> appender2 = logger3.getAppender("file:".concat(str));
                        if (appender2 != null && (appender2 instanceof RollingFileAppender)) {
                            return logger3;
                        }
                        if (z14) {
                            if (appender == null) {
                                x.l("null cannot be cast to non-null type ch.qos.logback.core.rolling.RollingFileAppender<@[FlexibleNullability] ch.qos.logback.classic.spi.ILoggingEvent?>");
                                return null;
                            }
                            RollingFileAppender rollingFileAppender = (RollingFileAppender) appender;
                            String file = rollingFileAppender.getFile();
                            file.getClass();
                            String file2 = rollingFileAppender.getFile();
                            file2.getClass();
                            return e(this, new gt2.a(str, file.substring(0, w.L(0, 6, file2, "/"))), 6);
                        }
                    } else if (z14) {
                        if (appender == null) {
                            x.l("null cannot be cast to non-null type ch.qos.logback.core.rolling.RollingFileAppender<@[FlexibleNullability] ch.qos.logback.classic.spi.ILoggingEvent?>");
                            return null;
                        }
                        RollingFileAppender rollingFileAppender2 = (RollingFileAppender) appender;
                        String file3 = rollingFileAppender2.getFile();
                        file3.getClass();
                        String file4 = rollingFileAppender2.getFile();
                        file4.getClass();
                        return e(this, new gt2.a(str, file3.substring(0, w.L(0, 6, file4, "/"))), 6);
                    }
                }
            }
            org.slf4j.Logger logger4 = LoggerFactory.getLogger(str);
            logger4.getClass();
            return logger4;
        }

        public final Logger i(String str) {
            str.getClass();
            a();
            if (w.z(str, "#", false)) {
                String strSubstring = str.substring(0, w.H(str, "#", 0, false, 6));
                if (k(strSubstring)) {
                    org.slf4j.Logger logger = LoggerFactory.getLogger(strSubstring);
                    if (logger == null) {
                        x.l("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
                        return null;
                    }
                    Appender<ILoggingEvent> appender = ((Logger) logger).getAppender("file:".concat(strSubstring));
                    boolean z14 = appender != null && (appender instanceof RollingFileAppender);
                    if (k(str)) {
                        org.slf4j.Logger logger2 = LoggerFactory.getLogger(str);
                        if (logger2 == null) {
                            x.l("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
                            return null;
                        }
                        Logger logger3 = (Logger) logger2;
                        Appender<ILoggingEvent> appender2 = logger3.getAppender("file:".concat(str));
                        if (appender2 != null && (appender2 instanceof RollingFileAppender)) {
                            return logger3;
                        }
                        if (z14) {
                            if (appender == null) {
                                x.l("null cannot be cast to non-null type ch.qos.logback.core.rolling.RollingFileAppender<@[FlexibleNullability] ch.qos.logback.classic.spi.ILoggingEvent?>");
                                return null;
                            }
                            RollingFileAppender rollingFileAppender = (RollingFileAppender) appender;
                            String file = rollingFileAppender.getFile();
                            file.getClass();
                            String file2 = rollingFileAppender.getFile();
                            file2.getClass();
                            return e(this, new gt2.a(str, file.substring(0, w.L(0, 6, file2, "/"))), 6);
                        }
                    } else if (z14) {
                        if (appender == null) {
                            x.l("null cannot be cast to non-null type ch.qos.logback.core.rolling.RollingFileAppender<@[FlexibleNullability] ch.qos.logback.classic.spi.ILoggingEvent?>");
                            return null;
                        }
                        RollingFileAppender rollingFileAppender2 = (RollingFileAppender) appender;
                        String file3 = rollingFileAppender2.getFile();
                        file3.getClass();
                        String file4 = rollingFileAppender2.getFile();
                        file4.getClass();
                        return e(this, new gt2.a(str, file3.substring(0, w.L(0, 6, file4, "/"))), 6);
                    }
                }
            }
            org.slf4j.Logger logger4 = LoggerFactory.getLogger(str);
            if (logger4 != null) {
                return (Logger) logger4;
            }
            x.l("null cannot be cast to non-null type ch.qos.logback.classic.Logger");
            return null;
        }

        private a() {
        }
    }
}
