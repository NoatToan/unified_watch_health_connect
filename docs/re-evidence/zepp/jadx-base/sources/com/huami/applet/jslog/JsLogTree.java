package com.huami.applet.jslog;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.tools.log.StackTraceHelperKt;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0019\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0004R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/huami/applet/jslog/JsLogTree;", "Ltimber/log/Timber$Tree;", "", "messageContent", "", "c", "", "priority", "tag", "message", "", "t", "log", "", "isLoggable", "getLogFileDir", "clearLogFile", "b", LogUtil.I, "loggableLevel", "Ljava/lang/String;", "logDirPath", "Ljava/io/BufferedOutputStream;", GoogleApiAvailabilityLight.a, "Ljava/io/BufferedOutputStream;", "bufferedOutputStream", "Ljava/io/File;", "e", "Ljava/io/File;", "jsLogFile", "<init>", "(ILjava/lang/String;)V", "Companion", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class JsLogTree extends Timber.Tree {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "JsLogTree";

    @NotNull
    private static final String g = "js_log.txt";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int loggableLevel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private String logDirPath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private BufferedOutputStream bufferedOutputStream;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final File jsLogFile;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\t\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/applet/jslog/JsLogTree$Companion;", "", "", "tag", "message", "", "t", "makeLogContent$applet_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;", "makeLogContent", "JS_LOG_NAME", "Ljava/lang/String;", "TAG", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String makeLogContent$applet_release(@Nullable String tag, @NotNull String message, @Nullable Throwable t) {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append(Intrinsics.stringPlus(new SimpleDateFormat(TrainingDateUtils.PATTERN_YMD_HMSS, Locale.getDefault()).format(Long.valueOf(new Date().getTime())), " "));
            if (tag != null) {
                if (tag.length() > 0) {
                    sb.append("\"t\":\"" + ((Object) tag) + "\",");
                }
            }
            if (t != null) {
                message = message + '\n' + StackTraceHelperKt.getStackTraceString(t);
            }
            sb.append("\"msg\":\"" + message + "\"}\r\n");
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Js log: Start clear log from file.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Js log: Clear log file exception : ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ IOException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(IOException iOException) {
            super(0);
            this.a = iOException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Js log: Save log to file exception: ", this.a);
        }
    }

    public /* synthetic */ JsLogTree(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, str);
    }

    private final void c(String messageContent) {
        try {
            Charset charsetForName = Charset.forName("utf-8");
            if (messageContent == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = messageContent.getBytes(charsetForName);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.jsLogFile, true));
            this.bufferedOutputStream = bufferedOutputStream;
            bufferedOutputStream.write(bytes);
            BufferedOutputStream bufferedOutputStream2 = this.bufferedOutputStream;
            if (bufferedOutputStream2 == null) {
                throw null;
            }
            bufferedOutputStream2.flush();
        } catch (IOException e) {
            HMLog.error$default(f, null, null, new c(e), 6, null);
        }
    }

    public final void clearLogFile() {
        try {
            HMLog.info(f, a.a);
            FileWriter fileWriter = new FileWriter(this.jsLogFile);
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            HMLog.error$default(f, null, null, new b(e), 6, null);
        }
    }

    @NotNull
    public final String getLogFileDir() {
        return this.logDirPath + ((Object) File.separator) + g;
    }

    @Override // timber.log.Timber.Tree
    public boolean isLoggable(@Nullable String tag, int priority) {
        return priority >= this.loggableLevel;
    }

    @Override // timber.log.Timber.Tree
    public void log(int priority, @Nullable String tag, @NotNull String message, @Nullable Throwable t) {
        if (priority < 2) {
            return;
        }
        c(INSTANCE.makeLogContent$applet_release(tag, message, t));
    }

    public JsLogTree(int i, @NotNull String str) throws IOException {
        this.loggableLevel = i;
        this.logDirPath = str;
        File file = new File(this.logDirPath);
        file.mkdirs();
        File file2 = new File(((Object) file.getAbsolutePath()) + ((Object) File.separator) + g);
        this.jsLogFile = file2;
        file2.createNewFile();
    }
}
