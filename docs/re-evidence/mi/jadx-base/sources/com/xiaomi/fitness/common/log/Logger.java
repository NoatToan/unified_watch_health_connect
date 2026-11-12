package com.xiaomi.fitness.common.log;

import android.os.Process;
import android.util.Log;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import defpackage.ape;
import defpackage.b9i;
import defpackage.bm9;
import defpackage.et3;
import defpackage.fdd;
import defpackage.ix9;
import defpackage.oa1;
import defpackage.prr;
import defpackage.spe;
import defpackage.wl9;
import defpackage.yoe;
import defpackage.zoe;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UnknownFormatConversionException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bQ\u0010,J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJE\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0010JE\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0010J#\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0012\u0010\u001aJE\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0010J)\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0016\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000f\u0010(J!\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010)J/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0011\u0010(J!\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010)J/\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0012\u0010(J!\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010)J1\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0016\u0010(J!\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010)J!\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u0016\u0010*J\r\u0010+\u001a\u00020\u000e¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u001b¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b0\u0010)J\r\u00101\u001a\u00020\u001b¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u001b¢\u0006\u0004\b3\u00102J\r\u00104\u001a\u00020\u001b¢\u0006\u0004\b4\u00102J-\u00100\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b0\u0010(J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0019¢\u0006\u0004\b\u0012\u0010*J\u0017\u00105\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0019¢\u0006\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b;\u00108R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010:R\u0014\u0010@\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010:R\u0014\u0010J\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010P\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bO\u0010I¨\u0006R"}, d2 = {"Lcom/xiaomi/fitness/common/log/Logger;", "", "", "fileName", "Lb9i;", "filePrinter", "(Ljava/lang/String;)Lb9i;", "tag", "Lspe;", "getLogger", "(Ljava/lang/String;Ljava/lang/String;)Lspe;", "msg", "", "args", "", PluginDeviceInfo.FICONOFF, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "i", Constants.DEVICE_TYPE_WEAR, "log", "Ljava/lang/Exception;", "Lkotlin/Exception;", PluginDeviceInfo.FICONOFFLINE, "handleLogException", "(Lspe;Ljava/lang/Exception;)V", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "isPriorityTag", "(Ljava/lang/String;)Z", "appTag", "isDebug", "setup", "(Ljava/lang/Object;Z)V", "parseTag", "(Ljava/lang/Object;)Ljava/lang/String;", "", "level", "loggable", "(I)Z", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Logger", "()V", "isDevelopment", "init", "(Z)V", "v", "verboseLoggable", "()Z", "debugLoggable", "infoLoggable", "getThrowableString", "(Ljava/lang/Throwable;)Ljava/lang/String;", "sAppTag", "Ljava/lang/String;", "sIsDebug", "Z", "mTag", "Ljava/util/HashMap;", "printerMap", "Ljava/util/HashMap;", "sIsDevelopment", "androidPrinter", "Lb9i;", "Ljava/text/SimpleDateFormat;", "dataFormat$delegate", "Lkotlin/Lazy;", "getDataFormat", "()Ljava/text/SimpleDateFormat;", "dataFormat", "getProcessName", "()Ljava/lang/String;", "processName", "", "getLogFileSize", "()J", "logFileSize", "getLogFilePath", "logFilePath", "<init>", "common_release"}, k = 1, mv = {2, 0, 0})
public final class Logger {
    private static final boolean isDebug = false;
    private static boolean sIsDebug;
    private static boolean sIsDevelopment;

    @NotNull
    public static final Logger INSTANCE = new Logger();

    @NotNull
    private static String sAppTag = "Logger";

    @NotNull
    private static final String mTag = "XiaomiFit";

    @NotNull
    private static final HashMap<String, spe> printerMap = new HashMap<>();

    @NotNull
    private static final b9i androidPrinter = new oa1();

    /* JADX INFO: renamed from: dataFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy dataFormat = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mpe
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Logger.dataFormat_delegate$lambda$2();
        }
    });

    private Logger() {
    }

    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String msg, @Nullable String fileName, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        spe logger = INSTANCE.getLogger(tag, fileName);
        if (args.length == 0) {
            logger.a(msg);
            return;
        }
        try {
            logger.b(msg, Arrays.copyOf(args, args.length));
        } catch (Exception e) {
            INSTANCE.handleLogException(logger, e);
        }
    }

    public static /* synthetic */ void d$default(String str, String str2, String str3, Object[] objArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mTag;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        d(str, str2, str3, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat dataFormat_delegate$lambda$2() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.CHINA);
    }

    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String msg, @Nullable String fileName, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        spe logger = INSTANCE.getLogger(tag, fileName);
        if (args.length == 0) {
            logger.c(msg);
            return;
        }
        try {
            logger.e(msg, Arrays.copyOf(args, args.length));
        } catch (Exception e) {
            INSTANCE.handleLogException(logger, e);
        }
    }

    public static /* synthetic */ void e$default(String str, String str2, String str3, Object[] objArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mTag;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        e(str, str2, str3, objArr);
    }

    private final b9i filePrinter(String fileName) {
        wl9 wl9VarB = new wl9.b(getLogFilePath()).c(new et3(fileName + "." + getProcessName() + ".log")).a(new bm9(getLogFileSize(), 1)).e(new ix9() { // from class: npe
            @Override // defpackage.ix9
            public final CharSequence a(long j, int i, String str, String str2) {
                return Logger.filePrinter$lambda$1(j, i, str, str2);
            }
        }).b();
        Intrinsics.checkNotNullExpressionValue(wl9VarB, "build(...)");
        return wl9VarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence filePrinter$lambda$1(long j, int i, String str, String str2) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str3 = String.format("%s|%s|%s|%s|%s", Arrays.copyOf(new Object[]{INSTANCE.getDataFormat().format(Long.valueOf(j)), AppUtil.getVersionName(), ape.a(i), str, str2}, 5));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }

    private final SimpleDateFormat getDataFormat() {
        return (SimpleDateFormat) dataFormat.getValue();
    }

    private final long getLogFileSize() {
        return sIsDevelopment ? 16777216L : 8388608L;
    }

    private final spe getLogger(String tag, String fileName) {
        HashMap<String, spe> map = printerMap;
        spe speVar = map.get(tag);
        if (speVar != null) {
            return speVar;
        }
        if (fileName == null) {
            spe speVarT = prr.c(tag).t();
            Intrinsics.checkNotNull(speVarT);
            return speVarT;
        }
        spe speVarT2 = prr.c(tag).u(androidPrinter, filePrinter(fileName)).t();
        map.put(tag, speVarT2);
        Intrinsics.checkNotNull(speVarT2);
        return speVarT2;
    }

    private final String getProcessName() {
        String processName = ApplicationExtKt.getProcessName(ApplicationExtKt.getApplication());
        if (processName == null) {
            processName = "";
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) processName, new String[]{":"}, false, 0, 6, (Object) null);
        return listSplit$default.size() > 1 ? (String) listSplit$default.get(listSplit$default.size() - 1) : FaceSchema.FACE_PAGE_MAIN;
    }

    private final void handleLogException(spe log, Exception e) {
        if ((e instanceof FormatFlagsConversionMismatchException) || (e instanceof UnknownFormatConversionException)) {
            log.d("log format exception", new RuntimeException());
        } else {
            e.printStackTrace();
        }
    }

    @JvmStatic
    public static final void i(@NotNull String tag, @NotNull String msg, @Nullable String fileName, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        spe logger = INSTANCE.getLogger(tag, fileName);
        if (args.length == 0) {
            logger.g(msg);
            return;
        }
        try {
            logger.h(msg, Arrays.copyOf(args, args.length));
        } catch (Exception e) {
            INSTANCE.handleLogException(logger, e);
        }
    }

    public static /* synthetic */ void i$default(String str, String str2, String str3, Object[] objArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mTag;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        i(str, str2, str3, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zoe init$lambda$0(zoe zoeVar) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s_%d_%d", Arrays.copyOf(new Object[]{zoeVar.f41522b, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid())}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        zoeVar.f41522b = str;
        return zoeVar;
    }

    private final boolean isPriorityTag(String tag) {
        return false;
    }

    private final boolean loggable(int level) {
        return sIsDebug || Log.isLoggable(sAppTag, level);
    }

    private final String parseTag(Object tag) {
        if (!(tag instanceof Class)) {
            return tag.toString();
        }
        String simpleName = ((Class) tag).getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    private final void setup(Object appTag, boolean isDebug2) {
        Objects.requireNonNull(appTag);
        sAppTag = parseTag(appTag);
        sIsDebug = isDebug2;
    }

    public static /* synthetic */ void v$default(Logger logger, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mTag;
        }
        logger.v(str, str2);
    }

    @JvmStatic
    public static final void w(@NotNull String tag, @NotNull String msg, @Nullable String fileName, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        spe logger = INSTANCE.getLogger(tag, fileName);
        if (args.length == 0) {
            logger.n(msg);
            return;
        }
        try {
            logger.p(msg, Arrays.copyOf(args, args.length));
        } catch (Exception e) {
            INSTANCE.handleLogException(logger, e);
        }
    }

    public static /* synthetic */ void w$default(String str, String str2, String str3, Object[] objArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mTag;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        w(str, str2, str3, objArr);
    }

    public final void Logger() {
    }

    public final boolean debugLoggable() {
        return loggable(3);
    }

    @NotNull
    public final String getLogFilePath() {
        File externalFilesDir;
        String absolutePath;
        try {
            externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir("log");
        } catch (Exception unused) {
            externalFilesDir = null;
        }
        if (externalFilesDir != null) {
            absolutePath = externalFilesDir.getAbsolutePath();
            Intrinsics.checkNotNull(absolutePath);
        } else {
            absolutePath = ApplicationExtKt.getApplication().getFilesDir().getAbsolutePath() + File.separator + "log";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("logFilePath() returned: ");
        sb.append(absolutePath);
        return absolutePath;
    }

    @Nullable
    public final String getThrowableString(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
            e.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            return stringWriter.toString();
        } catch (Exception e2) {
            return e2.getMessage();
        }
    }

    public final boolean infoLoggable() {
        return loggable(4);
    }

    public final void init(boolean isDevelopment) {
        sIsDevelopment = isDevelopment;
        yoe.a aVarB = new yoe.a().B(isDebug ? Integer.MIN_VALUE : 4);
        String str = mTag;
        prr.b(aVarB.E(str).p(new fdd() { // from class: ope
            @Override // defpackage.fdd
            public final zoe a(zoe zoeVar) {
                return Logger.init$lambda$0(zoeVar);
            }
        }).r(), androidPrinter, filePrinter(str));
    }

    public final void v(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        prr.d("%s %s", tag, msg);
    }

    public final boolean verboseLoggable() {
        return loggable(2);
    }

    public final void v(@NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        String str = mTag;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str2 = String.format(msg, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        v(str, str2);
    }

    public static /* synthetic */ void d$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mTag;
        }
        d(str, str2);
    }

    public static /* synthetic */ void e$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mTag;
        }
        e(str, str2, th);
    }

    public static /* synthetic */ void i$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mTag;
        }
        i(str, str2);
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mTag;
        }
        w(str, str2, th);
    }

    public static /* synthetic */ void e$default(String str, Object[] objArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mTag;
        }
        e(str, objArr);
    }

    public static /* synthetic */ void w$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mTag;
        }
        w(str, str2);
    }

    @JvmStatic
    public static final void d(@NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        d(mTag, msg, null, Arrays.copyOf(args, args.length));
    }

    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String msg, @NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(e, "e");
        prr.c(tag).t().d(msg, e);
    }

    @JvmStatic
    public static final void i(@NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        i(mTag, msg, null, Arrays.copyOf(args, args.length));
    }

    @JvmStatic
    public static final void w(@NotNull String tag, @NotNull String msg, @NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(e, "e");
        prr.c(tag).t().o(msg, e);
    }

    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        d(tag, msg, null, new Object[0]);
    }

    @JvmStatic
    public static final void e(@NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        e(mTag, msg, null, Arrays.copyOf(args, args.length));
    }

    public static /* synthetic */ void e$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mTag;
        }
        e(str, str2);
    }

    @JvmStatic
    public static final void i(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        i(tag, msg, null, new Object[0]);
    }

    @JvmStatic
    public static final void w(@NotNull String msg, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(args, "args");
        w(mTag, msg, null, Arrays.copyOf(args, args.length));
    }

    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        e(tag, msg, null, new Object[0]);
    }

    @JvmStatic
    public static final void w(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        w(mTag, msg, null, new Object[0]);
    }

    @JvmStatic
    public static final void e(@NotNull String msg, @Nullable Throwable e) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        prr.c(mTag).t().d(msg, e);
    }

    public final void w(@NotNull String msg, @NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(e, "e");
        w(mTag, msg, e);
    }
}
