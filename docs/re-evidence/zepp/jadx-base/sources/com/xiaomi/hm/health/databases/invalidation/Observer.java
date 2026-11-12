package com.xiaomi.hm.health.databases.invalidation;

import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B%\b\u0014\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u0013\u0010\u0015J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&R\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/databases/invalidation/Observer;", "", "", "", "tables", "", "onInvalidated", "", "a", "[Ljava/lang/String;", "getMTables$database_release", "()[Ljava/lang/String;", "mTables", "", "isRemote$database_release", "()Z", "isRemote", "firstTable", "rest", "<init>", "(Ljava/lang/String;[Ljava/lang/String;)V", "([Ljava/lang/String;)V", "database_release"}, k = 1, mv = {1, 5, 1})
public abstract class Observer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String[] mTables;

    public Observer(@NotNull String str, @NotNull String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        this.mTables = strArr2;
        strArr2[strArr.length] = str;
    }

    @NotNull
    /* JADX INFO: renamed from: getMTables$database_release, reason: from getter */
    public final String[] getMTables() {
        return this.mTables;
    }

    public final boolean isRemote$database_release() {
        return false;
    }

    public abstract void onInvalidated(@NotNull Set<String> tables);

    public Observer(@NotNull String[] strArr) {
        this.mTables = (String[]) Arrays.copyOf(strArr, strArr.length);
    }
}
