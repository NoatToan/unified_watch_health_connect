package com.xiaomi.fitness.devicesettings.common.extensions;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayBean;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.huami.shortcut.HuamiShortcutHelper;
import com.xiaomi.fitness.devicesettings.huami.shortcut.ShortcutListItem;
import com.xiaomi.fitness.settingitem.settingitem.SecondaryScreen;
import com.xiaomi.fitness.settingitem.settingitem.SecondaryScreenItem;
import com.xiaomi.hm.health.bt.sdk.data.ShortcutItem;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0003\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u0003\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0002\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0003\u001a\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0003\u001a\u0010\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u000e"}, d2 = {"deepCopy", "", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;", "", "convert2ShortcutListItems", "Lcom/xiaomi/fitness/settingitem/settingitem/SecondaryScreenItem;", "findItem", "item", "convert2ShortcutItems", "Lcom/xiaomi/hm/health/bt/sdk/data/ShortcutItem;", "convert2DisplayBean", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayBean;", "convert2SecondaryScreen", "Lcom/xiaomi/fitness/settingitem/settingitem/SecondaryScreen;", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListExtension.kt\ncom/xiaomi/fitness/devicesettings/common/extensions/ListExtensionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1863#2,2:112\n774#2:114\n865#2,2:115\n1872#2,3:117\n774#2:120\n865#2,2:121\n774#2:123\n865#2,2:124\n1863#2,2:126\n*S KotlinDebug\n*F\n+ 1 ListExtension.kt\ncom/xiaomi/fitness/devicesettings/common/extensions/ListExtensionKt\n*L\n48#1:112,2\n57#1:114\n57#1:115,2\n59#1:117,3\n75#1:120\n75#1:121,2\n95#1:123\n95#1:124,2\n97#1:126,2\n*E\n"})
public final class ListExtensionKt {
    @NotNull
    public static final List<DisplayBean> convert2DisplayBean(@NotNull List<ShortcutListItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            ShortcutListItem shortcutListItem = (ShortcutListItem) obj;
            if (shortcutListItem.getType() == 0 && shortcutListItem.getSubType() != 18) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < size) {
            ShortcutListItem shortcutListItem2 = (ShortcutListItem) arrayList2.get(i);
            int i4 = shortcutListItem2.getEnable() ? 1 : 2;
            i3 = i4 == i2 ? i3 + 1 : 0;
            DisplayBean displayBean = new DisplayBean(i4, shortcutListItem2.isAlwaysShown() ? (byte) 1 : (byte) 0, i3, HuamiShortcutHelper.INSTANCE.convertTypeToAppId(shortcutListItem2.getSubType()), null, null, 48, null);
            arrayList.add(displayBean);
            Logger.i("convert2DisplayBean " + displayBean, new Object[0]);
            i++;
            i2 = i4;
        }
        return arrayList;
    }

    @NotNull
    public static final SecondaryScreen convert2SecondaryScreen(@NotNull List<ShortcutListItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList<ShortcutListItem> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((ShortcutListItem) obj).getType() == 0) {
                arrayList2.add(obj);
            }
        }
        for (ShortcutListItem shortcutListItem : arrayList2) {
            SecondaryScreenItem secondaryScreenItem = new SecondaryScreenItem();
            secondaryScreenItem.setType(shortcutListItem.getSubType());
            secondaryScreenItem.setEnable(shortcutListItem.getEnable());
            secondaryScreenItem.setIndex(shortcutListItem.getTargetIndex());
            arrayList.add(secondaryScreenItem);
        }
        SecondaryScreen secondaryScreen = new SecondaryScreen();
        secondaryScreen.setSecondaryscreen(arrayList);
        return secondaryScreen;
    }

    @NotNull
    public static final List<ShortcutItem> convert2ShortcutItems(@NotNull List<ShortcutListItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((ShortcutListItem) obj).getType() == 0) {
                arrayList2.add(obj);
            }
        }
        int i = 0;
        for (Object obj2 : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ShortcutListItem shortcutListItem = (ShortcutListItem) obj2;
            ShortcutItem shortcutItem = new ShortcutItem();
            shortcutItem.setType(shortcutListItem.getSubType());
            shortcutItem.setHide(!shortcutListItem.getEnable());
            shortcutItem.setIndex(i);
            arrayList.add(shortcutItem);
            i = i2;
        }
        return arrayList;
    }

    @NotNull
    public static final List<ShortcutListItem> convert2ShortcutListItems(@NotNull List<? extends SecondaryScreenItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ShortcutListItem(ResourceExtKt.getString(wzi.h5), -2, true, 1, 0, false, 48, null));
        int i = 0;
        int i2 = -1;
        for (SecondaryScreenItem secondaryScreenItem : list) {
            int i3 = i + 1;
            if (i2 == -1 && !secondaryScreenItem.isEnable()) {
                arrayList.add(new ShortcutListItem(ResourceExtKt.getString(wzi.g5), -1, false, 1, 0, false, 48, null));
                i2 = i;
            }
            ShortcutListItem shortcutListItemValueOf = ShortcutListItem.INSTANCE.valueOf(secondaryScreenItem);
            if (!TextUtils.isEmpty(shortcutListItemValueOf.getName())) {
                arrayList.add(shortcutListItemValueOf);
            }
            i = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final List<ShortcutListItem> deepCopy(@NotNull List<ShortcutListItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Gson gson = new Gson();
        Object objFromJson = gson.fromJson(gson.toJson(list), new TypeToken<List<ShortcutListItem>>() { // from class: com.xiaomi.fitness.devicesettings.common.extensions.ListExtensionKt.deepCopy.1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (List) objFromJson;
    }

    @Nullable
    public static final ShortcutListItem findItem(@NotNull List<ShortcutListItem> list, @NotNull ShortcutListItem item) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        for (ShortcutListItem shortcutListItem : list) {
            if (shortcutListItem.getSubType() == item.getSubType()) {
                return shortcutListItem;
            }
        }
        Logger.w("not find item(" + item.getSubType() + ") in dataList", new Object[0]);
        return null;
    }
}
