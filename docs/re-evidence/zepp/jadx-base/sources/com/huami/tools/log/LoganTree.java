package com.huami.tools.log;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.dianping.logan.Logan;
import com.dianping.logan.LoganConfig;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB;\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J6\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/huami/tools/log/LoganTree;", "Lcom/huami/tools/log/Tree;", "", "tag", "", "priority", "", "isLoggable", "message", "code", "", "t", "", "log", "b", LogUtil.I, "loggableLevel", "cachePath", "logDirPath", "", "encryptKey", "encryptIV", "", "maxFileSize", "<init>", "(ILjava/lang/String;Ljava/lang/String;[B[BJ)V", "Companion", "log_release"}, k = 1, mv = {1, 4, 0})
public final class LoganTree extends Tree {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int loggableLevel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\n\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/tools/log/LoganTree$Companion;", "", "", "tag", "message", "code", "", "t", "makeLoganContent$log_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;", "makeLoganContent", "<init>", "()V", "log_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final String makeLoganContent$log_release(@Nullable String tag, @NotNull String message, @Nullable String code, @Nullable Throwable t) {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            StackTraceElement invokeTraceElement = StackTraceHelper.INSTANCE.getInvokeTraceElement();
            if (invokeTraceElement != null) {
                sb.append("\"fc\":\"" + invokeTraceElement.getClassName() + "\",");
                sb.append("\"l\":\"" + invokeTraceElement.getMethodName() + '-' + invokeTraceElement.getLineNumber() + "\",");
            }
            if (tag != null) {
                sb.append("\"t\":\"" + tag + "\",");
            }
            if (code != null) {
                sb.append("\"cd\":\"" + code + "\",");
            }
            String currentTimeZone = UtilsKt.getCurrentTimeZone();
            if (currentTimeZone != null) {
                sb.append("\"tz\":\"" + currentTimeZone + "\",");
            }
            if (t != null) {
                message = message + '\n' + StackTraceHelperKt.getStackTraceString(t);
            }
            sb.append("\"m\":\"" + message + "\"}");
            return sb.toString();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LoganTree(int i, String str, String str2, byte[] bArr, byte[] bArr2, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 5 : i, str, str2, bArr, bArr2, (i2 & 32) != 0 ? 30L : j);
    }

    @Override // com.huami.tools.log.Tree
    public boolean isLoggable(@Nullable String tag, int priority) {
        return priority >= this.loggableLevel;
    }

    @Override // com.huami.tools.log.Tree
    public void log(int priority, @Nullable String tag, @NotNull String message, @Nullable String code, @Nullable Throwable t) {
        Logan.w(INSTANCE.makeLoganContent$log_release(tag, message, code, t), priority - 2);
    }

    public LoganTree(int i, @NotNull String str, @NotNull String str2, @NotNull byte[] bArr, @NotNull byte[] bArr2, long j) {
        this.loggableLevel = i;
        File parentFile = new File(str).getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        new File(str2).mkdirs();
        Logan.init(new LoganConfig.Builder().setCachePath(str).setPath(str2).setEncryptKey16(bArr).setEncryptIV16(bArr2).setMaxFile(j).build());
    }
}
