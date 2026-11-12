package com.huami.eid.ui.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huami/eid/ui/exception/EidNormalException;", "Lcom/huami/eid/ui/exception/EidException;", "", "code", "msgForUi", "msgForLog", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "eid_release"}, k = 1, mv = {1, 5, 1})
public final class EidNormalException extends EidException {
    public /* synthetic */ EidNormalException(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "获取不到数据" : str2, (i & 4) != 0 ? "获取不到数据" : str3);
    }

    public EidNormalException(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        super(str, str2, str3);
    }
}
