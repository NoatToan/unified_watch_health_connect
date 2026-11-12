package com.huami.heartrate.repository.local;

import com.huami.heartrate.repository.entity.HeartRateData;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0086\u0002J)\u0010\t\u001a\u00020\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0086\u0002R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/heartrate/repository/local/HeartRateDataDelegate;", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "Lcom/huami/heartrate/repository/entity/HeartRateData;", "getValue", "value", "", "setValue", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kvKit", "", "b", "Ljava/lang/String;", "userId", "<init>", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Ljava/lang/String;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateDataDelegate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence kvKit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    public HeartRateDataDelegate(@NotNull KvPersistence kvPersistence, @NotNull String str) {
        this.kvKit = kvPersistence;
        this.userId = str;
    }

    @Nullable
    public final HeartRateData getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        return (HeartRateData) KvHelperKt.c(this.kvKit, property.getName() + this.userId, HeartRateData.class, KvHelper.INSTANCE.getDEFAULT_HEART_RATE_DATA());
    }

    public final void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable HeartRateData value) {
        KvHelperKt.a(this.kvKit, property.getName() + this.userId, value);
    }
}
