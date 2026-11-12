package com.xiaomi.hm.health.databases.invalidation;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/databases/invalidation/ObserverWrapper;", "", "", "", "invalidatedTablesIds", "", "notifyByTableInvalidStatus", "Lcom/xiaomi/hm/health/databases/invalidation/Observer;", "a", "Lcom/xiaomi/hm/health/databases/invalidation/Observer;", "mObserver", "", "b", "[I", "getMTableIds", "()[I", "mTableIds", "", "", "c", "[Ljava/lang/String;", "mTableNames", "", GoogleApiAvailabilityLight.a, "Ljava/util/Set;", "mSingleTableSet", "<init>", "(Lcom/xiaomi/hm/health/databases/invalidation/Observer;[I[Ljava/lang/String;)V", "database_release"}, k = 1, mv = {1, 5, 1})
public final class ObserverWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Observer mObserver;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final int[] mTableIds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String[] mTableNames;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Set<String> mSingleTableSet;

    public ObserverWrapper(@NotNull Observer observer, @NotNull int[] iArr, @NotNull String[] strArr) {
        Set<String> setUnmodifiableSet;
        this.mObserver = observer;
        this.mTableIds = iArr;
        this.mTableNames = strArr;
        if (iArr.length == 1) {
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        } else {
            setUnmodifiableSet = null;
        }
        this.mSingleTableSet = setUnmodifiableSet;
    }

    @NotNull
    public final int[] getMTableIds() {
        return this.mTableIds;
    }

    public final void notifyByTableInvalidStatus(@NotNull Set<Integer> invalidatedTablesIds) {
        int length = this.mTableIds.length;
        Set<String> hashSet = null;
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (invalidatedTablesIds.contains(Integer.valueOf(this.mTableIds[i]))) {
                    if (length == 1) {
                        hashSet = this.mSingleTableSet;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>(length);
                        }
                        hashSet.add(this.mTableNames[i]);
                    }
                }
                if (i2 >= length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (hashSet != null) {
            this.mObserver.onInvalidated(hashSet);
        }
    }
}
