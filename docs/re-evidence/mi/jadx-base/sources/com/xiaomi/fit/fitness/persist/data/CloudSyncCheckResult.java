package com.xiaomi.fit.fitness.persist.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/data/CloudSyncCheckResult;", "", "code", "", "msg", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "SUCCESS", "NO_ACCOUNT_LOGIN", "CLOUD_SWITCH_CLOSE", "NO_NETWORK", "BACKGROUND_RUNNING", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum CloudSyncCheckResult {
    SUCCESS(0, "success"),
    NO_ACCOUNT_LOGIN(5, "no account login"),
    CLOUD_SWITCH_CLOSE(3, "cloud switch close"),
    NO_NETWORK(4, "no network"),
    BACKGROUND_RUNNING(6, "app running in background");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int code;

    @NotNull
    private final String msg;

    CloudSyncCheckResult(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    @NotNull
    public static EnumEntries<CloudSyncCheckResult> getEntries() {
        return $ENTRIES;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }
}
