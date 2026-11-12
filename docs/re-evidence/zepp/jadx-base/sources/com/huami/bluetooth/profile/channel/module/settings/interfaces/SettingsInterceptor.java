package com.huami.bluetooth.profile.channel.module.settings.interfaces;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/SettingsInterceptor;", "", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "settings", "", "onWrite", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface SettingsInterceptor {
    @Nullable
    Object onWrite(@Nullable SettingsModule settingsModule, @NotNull HashMap<SettingsGroupType, Settings> map, @NotNull Continuation<? super Boolean> continuation);
}
