package com.huami.healthlabel.entry;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/huami/healthlabel/entry/MasterData;", "", "", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "userId", "b", "getHost", "host", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class MasterData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String host;

    public MasterData(@NotNull String str, @NotNull String str2) {
        this.userId = str;
        this.host = str2;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }
}
