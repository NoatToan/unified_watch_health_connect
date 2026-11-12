package com.huami.device.core.sync.api.exception;

import com.baidu.ocr.sdk.utils.LogUtil;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/huami/device/core/sync/api/exception/SyncException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "errorCode", LogUtil.I, "getErrorCode", "()I", "", "message", Constants.EXCEPTION, "<init>", "(Ljava/lang/String;Ljava/lang/Exception;I)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class SyncException extends Exception {
    private final int errorCode;

    public /* synthetic */ SyncException(String str, Exception exc, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : exc, (i2 & 4) != 0 ? 0 : i);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public SyncException(@NotNull String str, @Nullable Exception exc, int i) {
        super("Sync error " + str + " --> code " + i, exc);
        this.errorCode = i;
    }
}
