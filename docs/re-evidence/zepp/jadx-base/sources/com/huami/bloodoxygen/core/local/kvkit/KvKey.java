package com.huami.bloodoxygen.core.local.kvkit;

import androidx.annotation.Keep;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002R/\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR/\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR/\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "", "", "clear", "", "<set-?>", "ifHistoryExistsInited$delegate", "Lcom/huami/bloodoxygen/core/local/kvkit/BooleanDelegate;", "getIfHistoryExistsInited", "()Ljava/lang/Boolean;", "setIfHistoryExistsInited", "(Ljava/lang/Boolean;)V", "ifHistoryExistsInited", "clickSpo2AllFetched$delegate", "getClickSpo2AllFetched", "setClickSpo2AllFetched", "clickSpo2AllFetched", "migrateSuccess$delegate", "getMigrateSuccess", "setMigrateSuccess", "migrateSuccess", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kvKit", "", "userId", "<init>", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Ljava/lang/String;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class KvKey {
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(KvKey.class), "ifHistoryExistsInited", "getIfHistoryExistsInited()Ljava/lang/Boolean;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(KvKey.class), "clickSpo2AllFetched", "getClickSpo2AllFetched()Ljava/lang/Boolean;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(KvKey.class), "migrateSuccess", "getMigrateSuccess()Ljava/lang/Boolean;"))};

    /* JADX INFO: renamed from: clickSpo2AllFetched$delegate, reason: from kotlin metadata */
    @NotNull
    private final BooleanDelegate clickSpo2AllFetched;

    /* JADX INFO: renamed from: ifHistoryExistsInited$delegate, reason: from kotlin metadata */
    @NotNull
    private final BooleanDelegate ifHistoryExistsInited;

    /* JADX INFO: renamed from: migrateSuccess$delegate, reason: from kotlin metadata */
    @NotNull
    private final BooleanDelegate migrateSuccess;

    public KvKey(@NotNull KvPersistence kvPersistence, @NotNull String str) {
        this.ifHistoryExistsInited = new BooleanDelegate(kvPersistence, str);
        this.clickSpo2AllFetched = new BooleanDelegate(kvPersistence, str);
        this.migrateSuccess = new BooleanDelegate(kvPersistence, str);
    }

    public final void clear() {
        setIfHistoryExistsInited(null);
        setClickSpo2AllFetched(null);
        setMigrateSuccess(null);
    }

    @Nullable
    public final Boolean getClickSpo2AllFetched() {
        return this.clickSpo2AllFetched.getValue(this, $$delegatedProperties[1]);
    }

    @Nullable
    public final Boolean getIfHistoryExistsInited() {
        return this.ifHistoryExistsInited.getValue(this, $$delegatedProperties[0]);
    }

    @Nullable
    public final Boolean getMigrateSuccess() {
        return this.migrateSuccess.getValue(this, $$delegatedProperties[2]);
    }

    public final void setClickSpo2AllFetched(@Nullable Boolean bool) {
        this.clickSpo2AllFetched.setValue(this, $$delegatedProperties[1], bool);
    }

    public final void setIfHistoryExistsInited(@Nullable Boolean bool) {
        this.ifHistoryExistsInited.setValue(this, $$delegatedProperties[0], bool);
    }

    public final void setMigrateSuccess(@Nullable Boolean bool) {
        this.migrateSuccess.setValue(this, $$delegatedProperties[2], bool);
    }
}
