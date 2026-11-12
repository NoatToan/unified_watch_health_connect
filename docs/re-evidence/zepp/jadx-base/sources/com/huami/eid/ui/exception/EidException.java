package com.huami.eid.ui.exception;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/huami/eid/ui/exception/EidException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "code", "msgForUi", "msgForLog", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "eid_release"}, k = 1, mv = {1, 5, 1})
public abstract class EidException extends Exception {
    public EidException(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        super("code = " + str + " , msgForUi = " + str2 + ", msgForLog = " + str3);
    }
}
