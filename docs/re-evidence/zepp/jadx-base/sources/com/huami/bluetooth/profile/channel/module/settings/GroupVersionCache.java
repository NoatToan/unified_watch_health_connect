package com.huami.bluetooth.profile.channel.module.settings;

import com.huami.bluetooth.profile.channel.module.ChannelModuleProvider;
import com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u001f\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eRj\u0010\u0013\u001aV\u0012\u0004\u0012\u00020\n\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000fj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n`\u00100\u000fj*\u0012\u0004\u0012\u00020\n\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000fj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n`\u0010`\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/GroupVersionCache;", "", "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStoreOwner;", DataCacher.o, "", "clearCache", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "module", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "", "version", "setGroupVersion", "getCacheGroupVersion", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;)Ljava/lang/Integer;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "groupVersionCache", "", "b", "Ljava/lang/String;", "TAG", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GroupVersionCache {

    @NotNull
    public static final GroupVersionCache INSTANCE = new GroupVersionCache();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final HashMap<Integer, HashMap<SettingsGroupType, Integer>> groupVersionCache = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "GroupVersionCache";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num) {
            super(0);
            this.a = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("module null: ", Boolean.valueOf(this.a == null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HashMap<SettingsGroupType, Integer> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HashMap<SettingsGroupType, Integer> map) {
            super(0);
            this.a = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("versionMap null: ", Boolean.valueOf(this.a == null));
        }
    }

    private GroupVersionCache() {
    }

    public final void clearCache(@NotNull ChannelModuleStoreOwner owner) {
        SettingsModule settingsModule = (SettingsModule) ChannelModuleProvider.INSTANCE.of(owner).get(SettingsModule.class);
        Integer numValueOf = settingsModule == null ? null : Integer.valueOf(settingsModule.hashCode());
        HMLog.info(TAG, new a(numValueOf));
        if (numValueOf != null) {
            groupVersionCache.remove(numValueOf);
        }
    }

    @Nullable
    public final Integer getCacheGroupVersion(@NotNull SettingsModule module, @NotNull SettingsGroupType groupType) {
        HashMap<SettingsGroupType, Integer> map = groupVersionCache.get(Integer.valueOf(module.hashCode()));
        HMLog.info(TAG, new b(map));
        if (map == null) {
            return null;
        }
        return map.get(groupType);
    }

    public final void setGroupVersion(@NotNull SettingsModule module, @NotNull SettingsGroupType groupType, int version) {
        int iHashCode = module.hashCode();
        HashMap<Integer, HashMap<SettingsGroupType, Integer>> map = groupVersionCache;
        if (map.get(Integer.valueOf(iHashCode)) == null) {
            map.put(Integer.valueOf(iHashCode), new HashMap<>());
        }
        HashMap<SettingsGroupType, Integer> map2 = map.get(Integer.valueOf(iHashCode));
        if (map2 == null) {
            return;
        }
        map2.put(groupType, Integer.valueOf(version));
    }
}
