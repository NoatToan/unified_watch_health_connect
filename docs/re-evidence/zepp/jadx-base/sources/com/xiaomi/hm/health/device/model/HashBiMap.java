package com.xiaomi.hm.health.device.model;

import com.huami.moving.ui.utils.SportAnalytics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \t*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/model/HashBiMap;", "", "K", "V", "Lcom/xiaomi/hm/health/device/model/AbstractBiMap;", "", "capacity", "<init>", "(I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HashBiMap<K, V> extends AbstractBiMap<K, V> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ:\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\b\b\u0002\u0010\u0002*\u00020\u0001\"\b\b\u0003\u0010\u0003*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/model/HashBiMap$Companion;", "", "K", "V", "", SportAnalytics.ParamValue.MapButtonType.MAP, "Lcom/xiaomi/hm/health/device/model/HashBiMap;", "create", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <K, V> HashBiMap<K, V> create(@NotNull Map<K, ? extends V> map) {
            HashBiMap<K, V> hashBiMap = new HashBiMap<>(0, 1, null);
            hashBiMap.putAll(map);
            return hashBiMap;
        }
    }

    public HashBiMap() {
        this(0, 1, null);
    }

    public HashBiMap(int i) {
        super(new HashMap(i), new HashMap(i));
    }

    @Override // com.xiaomi.hm.health.device.model.AbstractBiMap, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return getValues();
    }

    public /* synthetic */ HashBiMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
