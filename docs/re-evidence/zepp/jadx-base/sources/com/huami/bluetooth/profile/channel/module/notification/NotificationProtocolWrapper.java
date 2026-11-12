package com.huami.bluetooth.profile.channel.module.notification;

import com.huami.bluetooth.profile.channel.module.notification.entity.ContactItemModify;
import com.huami.bluetooth.profile.channel.module.notification.entity.ContactSettingItem;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J2\u0010\f\u001a\u00020\n2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ*\u0010\r\u001a\u00020\n2\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0004\u0012\u00020\n0\bJ2\u0010\u0010\u001a\u00020\n2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0004j\b\u0012\u0004\u0012\u00020\u000e`\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ2\u0010\u0011\u001a\u00020\n2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ\"\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0006R\u0019\u0010\u001a\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationProtocolWrapper;", "", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApi;", "a", "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "Lkotlin/collections/ArrayList;", "items", "Lkotlin/Function1;", "", "", "result", "addContactSettingItem", "queryContactSettingItems", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactItemModify;", "modifiedItems", "modifyContactSettingItem", "deleteContactSettingItems", "", ContactSettingItemActivity.KEY_VIBRATION, "vibrate", "getVibrationList", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "getBaseProfile", "()Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "baseProfile", "b", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApi;", "notificationApi", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationProtocolWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BaseProfile baseProfile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private NotificationApi notificationApi = a();

    public NotificationProtocolWrapper(@NotNull BaseProfile baseProfile) {
        this.baseProfile = baseProfile;
    }

    private final NotificationApi a() {
        NotificationModule notificationModule;
        if (!this.baseProfile.supportModule(NotificationModule.class) || (notificationModule = (NotificationModule) this.baseProfile.getChannelModule(NotificationModule.class)) == null) {
            return null;
        }
        return notificationModule.loadApi();
    }

    public final void addContactSettingItem(@NotNull ArrayList<ContactSettingItem> items, @NotNull Function1<? super Boolean, Unit> result) {
        NotificationApi notificationApi = this.notificationApi;
        NotificationApiV4 notificationApiV4 = notificationApi instanceof NotificationApiV4 ? (NotificationApiV4) notificationApi : null;
        if (notificationApiV4 == null) {
            return;
        }
        notificationApiV4.addContactSettingItems(items, result);
    }

    public final void deleteContactSettingItems(@NotNull ArrayList<ContactSettingItem> items, @NotNull Function1<? super Boolean, Unit> result) {
        NotificationApi notificationApi = this.notificationApi;
        NotificationApiV4 notificationApiV4 = notificationApi instanceof NotificationApiV4 ? (NotificationApiV4) notificationApi : null;
        if (notificationApiV4 == null) {
            return;
        }
        notificationApiV4.deleteContactSettingItems(items, result);
    }

    @NotNull
    public final BaseProfile getBaseProfile() {
        return this.baseProfile;
    }

    @Nullable
    public final ArrayList<Integer> getVibrationList() {
        NotificationVersion version;
        NotificationApi notificationApi = this.notificationApi;
        NotificationApiV4 notificationApiV4 = notificationApi instanceof NotificationApiV4 ? (NotificationApiV4) notificationApi : null;
        if (notificationApiV4 == null || (version = notificationApiV4.getVersion()) == null) {
            return null;
        }
        return version.getVibrationList();
    }

    public final void modifyContactSettingItem(@NotNull ArrayList<ContactItemModify> modifiedItems, @NotNull Function1<? super Boolean, Unit> result) {
        NotificationApi notificationApi = this.notificationApi;
        NotificationApiV4 notificationApiV4 = notificationApi instanceof NotificationApiV4 ? (NotificationApiV4) notificationApi : null;
        if (notificationApiV4 == null) {
            return;
        }
        notificationApiV4.modifyContactSettingItems(modifiedItems, result);
    }

    public final void queryContactSettingItems(@NotNull Function1<? super ArrayList<ContactSettingItem>, Unit> result) {
        NotificationApi notificationApi = this.notificationApi;
        NotificationApiV4 notificationApiV4 = notificationApi instanceof NotificationApiV4 ? (NotificationApiV4) notificationApi : null;
        if (notificationApiV4 == null) {
            return;
        }
        notificationApiV4.queryContactSettingItems(result);
    }

    public final void vibrate(int vibration, @NotNull Function1<? super Boolean, Unit> result) {
        NotificationApi notificationApi = this.notificationApi;
        NotificationApiV4 notificationApiV4 = notificationApi instanceof NotificationApiV4 ? (NotificationApiV4) notificationApi : null;
        if (notificationApiV4 == null) {
            return;
        }
        notificationApiV4.vibrate(vibration, result);
    }
}
