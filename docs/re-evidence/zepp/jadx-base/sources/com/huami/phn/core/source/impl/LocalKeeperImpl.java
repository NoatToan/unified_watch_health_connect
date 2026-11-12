package com.huami.phn.core.source.impl;

import com.huami.phn.core.source.LocalKeeper;
import com.huami.utils.persistence.kvkit.KvPersistence;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/phn/core/source/impl/LocalKeeperImpl;", "Lcom/huami/phn/core/source/LocalKeeper;", "", "updateDailySyncTime", "", "isDailySynced", "", "url", "setPHNSupportDeviceUrl", "getPHNSupportDeviceUrl", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kv", "<init>", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;)V", "b", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class LocalKeeperImpl implements LocalKeeper {

    @Deprecated
    @NotNull
    public static final String KEY_DAILY_SYNC_TIME = "daily_sync_time";

    @Deprecated
    @NotNull
    public static final String KEY_PHN_SUPPORT_URL = "phn_support_url";

    @NotNull
    private static final a b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence kv;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"com/huami/phn/core/source/impl/LocalKeeperImpl$a", "", "", "KEY_DAILY_SYNC_TIME", "Ljava/lang/String;", "KEY_PHN_SUPPORT_URL", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LocalKeeperImpl(@NotNull KvPersistence kvPersistence) {
        this.kv = kvPersistence;
    }

    @Override // com.huami.phn.core.source.LocalKeeper
    @NotNull
    public String getPHNSupportDeviceUrl() {
        return (String) this.kv.getValue(KEY_PHN_SUPPORT_URL, "");
    }

    @Override // com.huami.phn.core.source.LocalKeeper
    public boolean isDailySynced() {
        Calendar calendar;
        long jLongValue = ((Number) this.kv.getValue(KEY_DAILY_SYNC_TIME, -1L)).longValue();
        if (jLongValue < 0) {
            calendar = null;
        } else {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(jLongValue);
            calendar = calendar2;
        }
        if (calendar == null) {
            return false;
        }
        Calendar calendar3 = Calendar.getInstance();
        return calendar.get(1) == calendar3.get(1) && calendar.get(2) == calendar3.get(2) && calendar.get(5) == calendar3.get(5);
    }

    @Override // com.huami.phn.core.source.LocalKeeper
    public void setPHNSupportDeviceUrl(@NotNull String url) {
        this.kv.setValue(KEY_PHN_SUPPORT_URL, url);
    }

    @Override // com.huami.phn.core.source.LocalKeeper
    public void updateDailySyncTime() {
        this.kv.setValue(KEY_DAILY_SYNC_TIME, Long.valueOf(System.currentTimeMillis()));
    }
}
