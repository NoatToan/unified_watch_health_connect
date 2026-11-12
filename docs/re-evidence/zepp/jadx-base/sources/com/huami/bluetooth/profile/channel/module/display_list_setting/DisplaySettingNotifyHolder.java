package com.huami.bluetooth.profile.channel.module.display_list_setting;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\n*\u0001\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplaySettingNotifyHolder;", "", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/IDisplayListSettingNotify;", "callback", "", "registerCallback", "unregisterCallback", "", "type", "onNotify", "com/huami/bluetooth/profile/channel/module/display_list_setting/DisplaySettingNotifyHolder$defaultCallback$1", "a", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplaySettingNotifyHolder$defaultCallback$1;", "defaultCallback", "b", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/IDisplayListSettingNotify;", "notifyCallback", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DisplaySettingNotifyHolder {

    @NotNull
    public static final DisplaySettingNotifyHolder INSTANCE = new DisplaySettingNotifyHolder();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final DisplaySettingNotifyHolder$defaultCallback$1 defaultCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static IDisplayListSettingNotify notifyCallback;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.bluetooth.profile.channel.module.display_list_setting.DisplaySettingNotifyHolder$defaultCallback$1, com.huami.bluetooth.profile.channel.module.display_list_setting.IDisplayListSettingNotify] */
    static {
        ?? r0 = new IDisplayListSettingNotify() { // from class: com.huami.bluetooth.profile.channel.module.display_list_setting.DisplaySettingNotifyHolder$defaultCallback$1
            @Override // com.huami.bluetooth.profile.channel.module.display_list_setting.IDisplayListSettingNotify
            public void onNotify(int type) {
                Debug.fi(MenstruationHelperKt.TAG, Intrinsics.stringPlus("Default display setting callback: ", Integer.valueOf(type)));
            }
        };
        defaultCallback = r0;
        notifyCallback = r0;
    }

    private DisplaySettingNotifyHolder() {
    }

    public final void onNotify(int type) {
        notifyCallback.onNotify(type);
    }

    public final void registerCallback(@NotNull IDisplayListSettingNotify callback) {
        notifyCallback = callback;
    }

    public final void unregisterCallback() {
        notifyCallback = defaultCallback;
    }
}
