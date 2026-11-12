package com.huami.bloodoxygen.bluetooth.synctime.local;

import androidx.annotation.Keep;
import com.huami.bloodoxygen.bluetooth.synctime.remote.api.property.BloodOxygenSyncTime;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002R/\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/synctime/local/BloodOxygenSyncTimeKey;", "", "", "clear", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "<set-?>", "bleSyncTime$delegate", "Lcom/huami/bloodoxygen/bluetooth/synctime/local/BloodOxygenSyncTimeKey$a;", "getBleSyncTime", "()Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "setBleSyncTime", "(Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;)V", "bleSyncTime", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kvKit", "", "userId", "<init>", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Ljava/lang/String;)V", "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygenSyncTimeKey {
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodOxygenSyncTimeKey.class), "bleSyncTime", "getBleSyncTime()Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;"))};

    /* JADX INFO: renamed from: bleSyncTime$delegate, reason: from kotlin metadata */
    @NotNull
    private final a bleSyncTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0086\u0002J)\u0010\t\u001a\u00020\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0086\u0002R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0012"}, d2 = {"com/huami/bloodoxygen/bluetooth/synctime/local/BloodOxygenSyncTimeKey$a", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "a", "value", "", "b", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kvKit", "", "Ljava/lang/String;", "userId", "<init>", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final KvPersistence kvKit;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String userId;

        public a(@NotNull KvPersistence kvPersistence, @NotNull String str) {
            this.kvKit = kvPersistence;
            this.userId = str;
        }

        @Nullable
        public final BloodOxygenSyncTime a(@Nullable Object thisRef, @NotNull KProperty<?> property) {
            return (BloodOxygenSyncTime) BloodOxygenSyncTimeKeyKt.b(this.kvKit, property.getName() + this.userId, BloodOxygenSyncTime.class, BloodOxygenSyncTime.INSTANCE.getDefault());
        }

        public final void b(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable BloodOxygenSyncTime value) {
            BloodOxygenSyncTimeKeyKt.a(this.kvKit, property.getName() + this.userId, value);
        }
    }

    public BloodOxygenSyncTimeKey(@NotNull KvPersistence kvPersistence, @NotNull String str) {
        this.bleSyncTime = new a(kvPersistence, str);
    }

    public final void clear() {
        setBleSyncTime(null);
    }

    @Nullable
    public final BloodOxygenSyncTime getBleSyncTime() {
        return this.bleSyncTime.a(this, $$delegatedProperties[0]);
    }

    public final void setBleSyncTime(@Nullable BloodOxygenSyncTime bloodOxygenSyncTime) {
        this.bleSyncTime.b(this, $$delegatedProperties[0], bloodOxygenSyncTime);
    }
}
