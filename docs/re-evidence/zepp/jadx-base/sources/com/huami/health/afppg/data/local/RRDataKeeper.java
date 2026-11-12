package com.huami.health.afppg.data.local;

import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/health/afppg/data/local/RRDataKeeper;", "", "<init>", "()V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class RRDataKeeper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "rr_index";

    @NotNull
    private static final String b = "afib_list_sync_flag";

    @NotNull
    private static final String c = "afib_latest_synced";

    @NotNull
    private static final String d = "afppg";

    @Nullable
    private static KvPersistence e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\u0006R\u0016\u0010\u0015\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/health/afppg/data/local/RRDataKeeper$Companion;", "", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "", "index", "", "saveRRIndex", "getRRIndex", "count", "saveAfibListSync", "getAfibListSync", "", "day", "", "isDayCacheAfib", "saveDayCacheAfib", "getAfibLatestSyncDay", "dayStr", "saveAfibLatestSyncDay", "clear", "AFIB_LATEST_SYNCED", "Ljava/lang/String;", "AFIB_LIST_SYNC_FLAG", "FILE_NAME", "KEY_RR_INDEX", DefaultSettingsSpiCall.n, "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final KvPersistence a() {
            KvPersistence kvPersistence = RRDataKeeper.e;
            if (kvPersistence != null) {
                return kvPersistence;
            }
            KvPersistence kvPersistence2 = KvKit.getKvPersistence(RRDataKeeper.d, false);
            Companion companion = RRDataKeeper.INSTANCE;
            RRDataKeeper.e = kvPersistence2;
            return kvPersistence2;
        }

        public final void clear() {
            a().clear();
        }

        @NotNull
        public final String getAfibLatestSyncDay() {
            return (String) a().getValue(RRDataKeeper.c, "");
        }

        public final int getAfibListSync() {
            return ((Number) a().getValue(RRDataKeeper.b, -1)).intValue();
        }

        public final int getRRIndex() {
            return ((Number) a().getValue(RRDataKeeper.a, -1)).intValue();
        }

        public final boolean isDayCacheAfib(@NotNull String day) {
            return ((Boolean) a().getValue(day, Boolean.FALSE)).booleanValue();
        }

        public final void saveAfibLatestSyncDay(@NotNull String dayStr) {
            a().setValue(RRDataKeeper.c, dayStr);
        }

        public final void saveAfibListSync(int count) {
            a().setValue(RRDataKeeper.b, Integer.valueOf(count));
        }

        public final void saveDayCacheAfib(@NotNull String day) {
            a().setValue(day, Boolean.TRUE);
        }

        public final void saveRRIndex(int index) {
            a().setValue(RRDataKeeper.a, Integer.valueOf(index));
        }
    }
}
