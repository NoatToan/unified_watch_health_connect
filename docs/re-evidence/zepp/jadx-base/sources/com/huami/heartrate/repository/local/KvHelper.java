package com.huami.heartrate.repository.local;

import com.huami.heartrate.repository.entity.HeartRateData;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR/\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/huami/heartrate/repository/local/KvHelper;", "", "Lcom/huami/heartrate/repository/entity/HeartRateData;", "<set-?>", "a", "Lcom/huami/heartrate/repository/local/HeartRateDataDelegate;", "getRemoteLatestHr", "()Lcom/huami/heartrate/repository/entity/HeartRateData;", "setRemoteLatestHr", "(Lcom/huami/heartrate/repository/entity/HeartRateData;)V", "remoteLatestHr", "", "b", "Lcom/huami/heartrate/repository/local/LongDelegate;", "getLastSyncSeconds", "()Ljava/lang/Long;", "setLastSyncSeconds", "(Ljava/lang/Long;)V", "lastSyncSeconds", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kvKit", "", "userId", "<init>", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Ljava/lang/String;)V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class KvHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HeartRateDataDelegate remoteLatestHr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LongDelegate lastSyncSeconds;
    public static final /* synthetic */ KProperty<Object>[] c = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(KvHelper.class), "remoteLatestHr", "getRemoteLatestHr()Lcom/huami/heartrate/repository/entity/HeartRateData;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(KvHelper.class), "lastSyncSeconds", "getLastSyncSeconds()Ljava/lang/Long;"))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HeartRateData d = new HeartRateData(-1, 0, null, null, 12, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/heartrate/repository/local/KvHelper$Companion;", "", "Lcom/huami/heartrate/repository/entity/HeartRateData;", "DEFAULT_HEART_RATE_DATA", "Lcom/huami/heartrate/repository/entity/HeartRateData;", "getDEFAULT_HEART_RATE_DATA", "()Lcom/huami/heartrate/repository/entity/HeartRateData;", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HeartRateData getDEFAULT_HEART_RATE_DATA() {
            return KvHelper.d;
        }
    }

    public KvHelper(@NotNull KvPersistence kvPersistence, @NotNull String str) {
        this.remoteLatestHr = new HeartRateDataDelegate(kvPersistence, str);
        this.lastSyncSeconds = new LongDelegate(kvPersistence, str, -1L);
    }

    @Nullable
    public final Long getLastSyncSeconds() {
        return this.lastSyncSeconds.getValue(this, c[1]);
    }

    @Nullable
    public final HeartRateData getRemoteLatestHr() {
        return this.remoteLatestHr.getValue(this, c[0]);
    }

    public final void setLastSyncSeconds(@Nullable Long l) {
        this.lastSyncSeconds.setValue(this, c[1], l);
    }

    public final void setRemoteLatestHr(@Nullable HeartRateData heartRateData) {
        this.remoteLatestHr.setValue(this, c[0], heartRateData);
    }
}
