package com.google.firebase.logger;

import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.nimbusds.jose.HeaderParameterNames;
import d53.w;
import e23.l;
import fb1.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import lc.u0;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;
import w13.a;
import w13.b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\b&\u0018\u0000 (2\u00020\u0001:\u0004%&'(B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ9\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0018\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J9\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0018\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J9\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0018\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J9\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0018\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J9\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0018\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001c\u0010 \u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J;\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0012\b\u0002\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u0010#J9\u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0010\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0002\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006)"}, d2 = {"Lcom/google/firebase/logger/Logger;", "", HeaderParameterNames.AUTHENTICATION_TAG, "", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "getTag", "()Ljava/lang/String;", "getEnabled", "()Z", "setEnabled", "(Z)V", "getMinLevel", "()Lcom/google/firebase/logger/Logger$Level;", "setMinLevel", "(Lcom/google/firebase/logger/Logger$Level;)V", "verbose", "", "format", "args", "", "throwable", "", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "msg", "debug", "info", "warn", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "logIfAble", "level", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "log", "AndroidLogger", "FakeLogger", "Level", "Companion", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Logger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConcurrentHashMap<String, Logger> loggers = new ConcurrentHashMap<>();
    private boolean enabled;
    private Level minLevel;
    private final String tag;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ9\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/firebase/logger/Logger$AndroidLogger;", "Lcom/google/firebase/logger/Logger;", HeaderParameterNames.AUTHENTICATION_TAG, "", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "log", "", "level", "format", "args", "", "", "throwable", "", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AndroidLogger extends Logger {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Level.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(String str, boolean z14, Level level) {
            super(str, z14, level, null);
            str.getClass();
            level.getClass();
        }

        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String format, Object[] args, Throwable throwable) {
            level.getClass();
            format.getClass();
            args.getClass();
            if (args.length != 0) {
                x0 x0Var = x0.f105818a;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            int i14 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i14 == 1) {
                String tag = getTag();
                return throwable != null ? Log.v(tag, format, throwable) : Log.v(tag, format);
            }
            if (i14 == 2) {
                String tag2 = getTag();
                return throwable != null ? Log.d(tag2, format, throwable) : Log.d(tag2, format);
            }
            if (i14 == 3) {
                String tag3 = getTag();
                return throwable != null ? Log.i(tag3, format, throwable) : Log.i(tag3, format);
            }
            if (i14 == 4) {
                String tag4 = getTag();
                return throwable != null ? Log.w(tag4, format, throwable) : Log.w(tag4, format);
            }
            if (i14 == 5) {
                String tag5 = getTag();
                return throwable != null ? Log.e(tag5, format, throwable) : Log.e(tag5, format);
            }
            u0.r();
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/google/firebase/logger/Logger$FakeLogger;", "Lcom/google/firebase/logger/Logger;", "", HeaderParameterNames.AUTHENTICATION_TAG, "", "enabled", "Lcom/google/firebase/logger/Logger$Level;", "minLevel", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "level", "format", "", "", "args", "", "throwable", "toLogMessage", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/String;", "", "log", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "", "clearLogMessages", "()V", "message", "hasLogMessage", "(Ljava/lang/String;)Z", "Lkotlin/Function1;", "predicate", "hasLogMessageThat", "(Le23/l;)Z", "", "record", "Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FakeLogger extends Logger {
        private final List<String> record;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(String str, boolean z14, Level level) {
            super(str, z14, level, null);
            str.getClass();
            level.getClass();
            this.record = new ArrayList();
        }

        private final String toLogMessage(Level level, String format, Object[] args, Throwable throwable) {
            if (args.length != 0) {
                x0 x0Var = x0.f105818a;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            if (throwable == null) {
                return level + ' ' + format;
            }
            return level + ' ' + format + ' ' + Log.getStackTraceString(throwable);
        }

        public final void clearLogMessages() {
            this.record.clear();
        }

        public final boolean hasLogMessage(String message) {
            message.getClass();
            List<String> list = this.record;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (w.z((String) it.next(), message, false)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean hasLogMessageThat(l<? super String, Boolean> predicate) {
            predicate.getClass();
            List<String> list = this.record;
            if (list != null && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (predicate.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String format, Object[] args, Throwable throwable) {
            level.getClass();
            format.getClass();
            args.getClass();
            String logMessage = toLogMessage(level, format, args, throwable);
            System.out.println((Object) c.n("Log: ", logMessage));
            this.record.add(logMessage);
            return logMessage.length();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/google/firebase/logger/Logger$Level;", "", "priority", "", "<init>", "(Ljava/lang/String;II)V", "getPriority$com_google_firebase_firebase_common", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Level {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private static final /* synthetic */ a $ENTRIES = b.g(values());
        private final int priority;

        Level(int i14) {
            this.priority = i14;
        }

        public static a<Level> getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getPriority$com_google_firebase_firebase_common, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }
    }

    private Logger(String str, boolean z14, Level level) {
        this.tag = str;
        this.enabled = z14;
        this.minLevel = level;
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Object[] objArr, Throwable th3, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: debug");
            return 0;
        }
        if ((i14 & 4) != 0) {
            th3 = null;
        }
        return logger.debug(str, objArr, th3);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Object[] objArr, Throwable th3, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: error");
            return 0;
        }
        if ((i14 & 4) != 0) {
            th3 = null;
        }
        return logger.error(str, objArr, th3);
    }

    public static final Logger getLogger(String str, boolean z14, Level level) {
        return INSTANCE.getLogger(str, z14, level);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Object[] objArr, Throwable th3, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: info");
            return 0;
        }
        if ((i14 & 4) != 0) {
            th3 = null;
        }
        return logger.info(str, objArr, th3);
    }

    private final int logIfAble(Level level, String format, Object[] args, Throwable throwable) {
        if (!this.enabled) {
            return 0;
        }
        if (this.minLevel.getPriority() <= level.getPriority() || Log.isLoggable(this.tag, level.getPriority())) {
            return log(level, format, args, throwable);
        }
        return 0;
    }

    public static /* synthetic */ int logIfAble$default(Logger logger, Level level, String str, Object[] objArr, Throwable th3, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: logIfAble");
            return 0;
        }
        if ((i14 & 4) != 0) {
            objArr = new Object[0];
        }
        return logger.logIfAble(level, str, objArr, th3);
    }

    public static final FakeLogger setupFakeLogger(String str, boolean z14, Level level) {
        return INSTANCE.setupFakeLogger(str, z14, level);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Object[] objArr, Throwable th3, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: verbose");
            return 0;
        }
        if ((i14 & 4) != 0) {
            th3 = null;
        }
        return logger.verbose(str, objArr, th3);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Object[] objArr, Throwable th3, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: warn");
            return 0;
        }
        if ((i14 & 4) != 0) {
            th3 = null;
        }
        return logger.warn(str, objArr, th3);
    }

    public final int debug(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        return debug$default(this, str, objArr, null, 4, null);
    }

    public final int error(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        return error$default(this, str, objArr, null, 4, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Level getMinLevel() {
        return this.minLevel;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int info(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        return info$default(this, str, objArr, null, 4, null);
    }

    public abstract int log(Level level, String format, Object[] args, Throwable throwable);

    public final void setEnabled(boolean z14) {
        this.enabled = z14;
    }

    public final void setMinLevel(Level level) {
        level.getClass();
        this.minLevel = level;
    }

    public final int verbose(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        return verbose$default(this, str, objArr, null, 4, null);
    }

    public final int warn(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        return warn$default(this, str, objArr, null, 4, null);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/google/firebase/logger/Logger$Companion;", "", "<init>", "()V", "loggers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/google/firebase/logger/Logger;", "getLogger", HeaderParameterNames.AUTHENTICATION_TAG, "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "setupFakeLogger", "Lcom/google/firebase/logger/Logger$FakeLogger;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ Logger getLogger$default(Companion companion, String str, boolean z14, Level level, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                z14 = true;
            }
            if ((i14 & 4) != 0) {
                level = Level.INFO;
            }
            return companion.getLogger(str, z14, level);
        }

        public static /* synthetic */ FakeLogger setupFakeLogger$default(Companion companion, String str, boolean z14, Level level, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                z14 = true;
            }
            if ((i14 & 4) != 0) {
                level = Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z14, level);
        }

        public final Logger getLogger(String tag, boolean enabled, Level minLevel) {
            Object objPutIfAbsent;
            tag.getClass();
            minLevel.getClass();
            ConcurrentHashMap concurrentHashMap = Logger.loggers;
            Object androidLogger = concurrentHashMap.get(tag);
            if (androidLogger == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(tag, (androidLogger = new AndroidLogger(tag, enabled, minLevel)))) != null) {
                androidLogger = objPutIfAbsent;
            }
            return (Logger) androidLogger;
        }

        public final FakeLogger setupFakeLogger(String tag, boolean enabled, Level minLevel) {
            tag.getClass();
            minLevel.getClass();
            FakeLogger fakeLogger = new FakeLogger(tag, enabled, minLevel);
            Logger.loggers.put(tag, fakeLogger);
            return fakeLogger;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Logger(String str, boolean z14, Level level, j jVar) {
        this(str, z14, level);
    }

    public final int debug(String str) {
        str.getClass();
        return debug$default(this, str, null, 2, null);
    }

    public final int error(String str) {
        str.getClass();
        return error$default(this, str, null, 2, null);
    }

    public final int info(String str) {
        str.getClass();
        return info$default(this, str, null, 2, null);
    }

    public final int verbose(String str) {
        str.getClass();
        return verbose$default(this, str, null, 2, null);
    }

    public final int warn(String str) {
        str.getClass();
        return warn$default(this, str, null, 2, null);
    }

    public final int debug(String format, Object[] args, Throwable throwable) {
        format.getClass();
        args.getClass();
        return logIfAble(Level.DEBUG, format, args, throwable);
    }

    public final int error(String format, Object[] args, Throwable throwable) {
        format.getClass();
        args.getClass();
        return logIfAble(Level.ERROR, format, args, throwable);
    }

    public final int info(String format, Object[] args, Throwable throwable) {
        format.getClass();
        args.getClass();
        return logIfAble(Level.INFO, format, args, throwable);
    }

    public final int verbose(String format, Object[] args, Throwable throwable) {
        format.getClass();
        args.getClass();
        return logIfAble(Level.VERBOSE, format, args, throwable);
    }

    public final int warn(String format, Object[] args, Throwable throwable) {
        format.getClass();
        args.getClass();
        return logIfAble(Level.WARN, format, args, throwable);
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Throwable th3, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: debug");
            return 0;
        }
        if ((i14 & 2) != 0) {
            th3 = null;
        }
        return logger.debug(str, th3);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Throwable th3, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: error");
            return 0;
        }
        if ((i14 & 2) != 0) {
            th3 = null;
        }
        return logger.error(str, th3);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Throwable th3, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: info");
            return 0;
        }
        if ((i14 & 2) != 0) {
            th3 = null;
        }
        return logger.info(str, th3);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Throwable th3, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: verbose");
            return 0;
        }
        if ((i14 & 2) != 0) {
            th3 = null;
        }
        return logger.verbose(str, th3);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Throwable th3, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: warn");
            return 0;
        }
        if ((i14 & 2) != 0) {
            th3 = null;
        }
        return logger.warn(str, th3);
    }

    public final int debug(String msg, Throwable throwable) {
        msg.getClass();
        return logIfAble$default(this, Level.DEBUG, msg, null, throwable, 4, null);
    }

    public final int error(String msg, Throwable throwable) {
        msg.getClass();
        return logIfAble$default(this, Level.ERROR, msg, null, throwable, 4, null);
    }

    public final int info(String msg, Throwable throwable) {
        msg.getClass();
        return logIfAble$default(this, Level.INFO, msg, null, throwable, 4, null);
    }

    public final int verbose(String msg, Throwable throwable) {
        msg.getClass();
        return logIfAble$default(this, Level.VERBOSE, msg, null, throwable, 4, null);
    }

    public final int warn(String msg, Throwable throwable) {
        msg.getClass();
        return logIfAble$default(this, Level.WARN, msg, null, throwable, 4, null);
    }
}
