package com.huami.applet.jsengine.exception;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/huami/applet/jsengine/exception/AppletException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "a", LogUtil.I, "getErrorCode", "()I", "errorCode", "", "errorMessage", "<init>", "(Ljava/lang/String;I)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public class AppletException extends Exception {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int errorCode;

    public AppletException(@NotNull String str, int i) {
        super(str);
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public /* synthetic */ AppletException(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? -1 : i);
    }
}
