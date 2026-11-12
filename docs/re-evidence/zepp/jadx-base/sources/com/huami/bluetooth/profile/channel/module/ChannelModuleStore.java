package com.huami.bluetooth.profile.channel.module;

import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0006R\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStore;", "", "", "key", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "viewModel", "", "put$bluetooth_release", "(Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/BaseModule;)V", DataItem.HTTP_METHOD_PUT, "get", "", "keys", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelApi", "updateChannel", "clear", "Ljava/util/HashMap;", "a", "Ljava/util/HashMap;", "mMap", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ChannelModuleStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, ChannelModuleStore> b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HashMap<String, BaseModule> mMap = new HashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStore$Companion;", "", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStore;", "getModuleStore", "Ljava/util/concurrent/ConcurrentHashMap;", "stores", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ChannelModuleStore getModuleStore(@NotNull String address) {
            ChannelModuleStore channelModuleStore;
            ChannelModuleStore channelModuleStore2 = (ChannelModuleStore) ChannelModuleStore.b.get(address);
            if (channelModuleStore2 != null) {
                return channelModuleStore2;
            }
            synchronized (ChannelModuleStore.b) {
                channelModuleStore = (ChannelModuleStore) ChannelModuleStore.b.get(address);
                if (channelModuleStore == null) {
                    channelModuleStore = new ChannelModuleStore();
                }
                ChannelModuleStore.b.put(address, channelModuleStore);
            }
            return channelModuleStore;
        }
    }

    public final void clear() {
        this.mMap.clear();
    }

    @Nullable
    public final BaseModule get(@NotNull String key) {
        return this.mMap.get(key);
    }

    @NotNull
    public final Set<String> keys() {
        return new HashSet(this.mMap.keySet());
    }

    public final void put$bluetooth_release(@NotNull String key, @NotNull BaseModule viewModel) {
        this.mMap.put(key, viewModel);
    }

    public final void updateChannel(@NotNull ChannelApi channelApi) {
        Iterator<T> it2 = this.mMap.values().iterator();
        while (it2.hasNext()) {
            ((BaseModule) it2.next()).setChannelApi(channelApi);
        }
    }
}
