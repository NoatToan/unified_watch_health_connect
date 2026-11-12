package com.huami.bluetooth.profile.channel.module.notification;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.notification.entity.ContactItemModify;
import com.huami.bluetooth.profile.channel.module.notification.entity.ContactSettingItem;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J4\u0010\n\u001a\u00020\b2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&J,\u0010\u000b\u001a\u00020\b2\"\u0010\t\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0004\u0012\u00020\b0\u0006H&J4\u0010\u000e\u001a\u00020\b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0002j\b\u0012\u0004\u0012\u00020\f`\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&J4\u0010\u000f\u001a\u00020\b2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&J$\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiV4;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiV3;", "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "Lkotlin/collections/ArrayList;", "items", "Lkotlin/Function1;", "", "", "result", "addContactSettingItems", "queryContactSettingItems", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactItemModify;", "modifiedItems", "modifyContactSettingItems", "deleteContactSettingItems", "", ContactSettingItemActivity.KEY_VIBRATION, "vibrate", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface NotificationApiV4 extends NotificationApiV3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int VERSION_4 = 4;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiV4$Companion;", "", "", "VERSION_4", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int VERSION_4 = 4;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    void addContactSettingItems(@NotNull ArrayList<ContactSettingItem> items, @NotNull Function1<? super Boolean, Unit> result);

    void deleteContactSettingItems(@NotNull ArrayList<ContactSettingItem> items, @NotNull Function1<? super Boolean, Unit> result);

    void modifyContactSettingItems(@NotNull ArrayList<ContactItemModify> modifiedItems, @NotNull Function1<? super Boolean, Unit> result);

    void queryContactSettingItems(@NotNull Function1<? super ArrayList<ContactSettingItem>, Unit> result);

    void vibrate(int vibration, @NotNull Function1<? super Boolean, Unit> result);
}
