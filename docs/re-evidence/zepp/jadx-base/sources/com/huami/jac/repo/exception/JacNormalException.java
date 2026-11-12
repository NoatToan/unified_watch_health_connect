package com.huami.jac.repo.exception;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huami/jac/repo/exception/JacNormalException;", "Lcom/huami/jac/repo/exception/JacException;", "", "code", "msgForUi", "msgForLog", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public final class JacNormalException extends JacException {
    public JacNormalException(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        super(str, str2, str3);
    }
}
