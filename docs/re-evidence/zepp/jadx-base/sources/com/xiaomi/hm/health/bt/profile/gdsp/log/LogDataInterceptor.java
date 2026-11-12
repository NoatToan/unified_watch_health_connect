package com.xiaomi.hm.health.bt.profile.gdsp.log;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.gdsp.base.IDataInterceptor;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/log/LogDataInterceptor;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/IDataInterceptor;", "", "byteArray", "", "onInterceptor", "Ljava/io/File;", "a", "Ljava/io/File;", "file", "Ljava/io/FileWriter;", "b", "Ljava/io/FileWriter;", "fileWriter", "<init>", "(Ljava/io/File;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class LogDataInterceptor implements IDataInterceptor {

    @NotNull
    private static final String c = "LogDataInterceptor";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final File file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FileWriter fileWriter;

    public LogDataInterceptor(@NotNull File file) {
        this.file = file;
        this.fileWriter = new FileWriter(file);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.IDataInterceptor
    public boolean onInterceptor(@NotNull byte[] byteArray) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            this.fileWriter.write(new String(byteArray, Charset.defaultCharset()));
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl == null) {
            return true;
        }
        Debug.fi(c, Intrinsics.stringPlus("Write log to file failed:", thM3848exceptionOrNullimpl));
        return true;
    }
}
