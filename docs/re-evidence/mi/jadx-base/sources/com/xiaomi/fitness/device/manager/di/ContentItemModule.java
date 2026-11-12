package com.xiaomi.fitness.device.manager.di;

import android.app.Application;
import android.content.Context;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.utils.MarketUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.di.ContentItemModule;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.ui.tab.TabDeviceContentItem;
import defpackage.uzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J}\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/device/manager/di/ContentItemModule;", "", "<init>", "()V", "provideDeviceStatusItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "provideDeviceHintItem", "buildTabContentItem", "icon", "", "title", "type", "itemType", Column.SUBTITLE, "more", "", "remind", "remindText", "", "needConnect", "onClickListener", "Lkotlin/Function1;", "Landroid/content/Context;", "", "(IIIILjava/lang/Integer;ZZLjava/lang/String;ZLkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContentItemModule {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final TabContentItem buildTabContentItem(int icon, int title, int type, int itemType, Integer subtitle, boolean more, boolean remind, String remindText, final boolean needConnect, Function1<? super Context, Unit> onClickListener) {
        MutableLiveData<String> liveData;
        if (subtitle != null) {
            String string = ApplicationExtKt.getApplication().getString(subtitle.intValue());
            if (string != null) {
                liveData = StringExtKt.toLiveData(string);
            } else {
                liveData = null;
            }
        } else {
            liveData = null;
        }
        String string2 = ApplicationExtKt.getApplication().getString(title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new TabContentItem(itemType, type, icon, StringExtKt.toLiveData(string2), liveData, more, new ObservableBoolean(remind), remindText != null ? StringExtKt.toLiveData(remindText) : null, new Function1() { // from class: xh4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(ContentItemModule.buildTabContentItem$lambda$2(needConnect, (WearableDeviceModel) obj));
            }
        }, onClickListener, null, null, null, 7168, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabContentItem buildTabContentItem$default(ContentItemModule contentItemModule, int i, int i2, int i3, int i4, Integer num, boolean z, boolean z2, String str, boolean z3, Function1 function1, int i5, Object obj) {
        return contentItemModule.buildTabContentItem(i, i2, i3, (i5 & 8) != 0 ? 11 : i4, (i5 & 16) != 0 ? null : num, (i5 & 32) != 0 ? true : z, (i5 & 64) != 0 ? false : z2, (i5 & 128) != 0 ? null : str, (i5 & 256) != 0 ? true : z3, (i5 & 512) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildTabContentItem$lambda$2(boolean z, WearableDeviceModel TabContentItem) {
        Intrinsics.checkNotNullParameter(TabContentItem, "$this$TabContentItem");
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideDeviceHintItem$lambda$0(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Application application = ApplicationExtKt.getApplication();
        MarketUtil marketUtil = MarketUtil.INSTANCE;
        if (MarketUtil.checkAppInstalled(application, marketUtil.getWEAROS_PAKAGENAME())) {
            marketUtil.startWearOsApp();
        } else {
            marketUtil.launchAppDetailForWearOs(ApplicationExtKt.getApplication());
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final TabContentItem provideDeviceHintItem() {
        return buildTabContentItem$default(this, -1, uzi.f2, 99, 0, null, false, false, null, false, new Function1() { // from class: wh4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ContentItemModule.provideDeviceHintItem$lambda$0((Context) obj);
            }
        }, 472, null);
    }

    @NotNull
    public final TabContentItem provideDeviceStatusItem() {
        String name;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (name = DeviceModelExtKt.getName(wearableDeviceModel)) == null) {
            name = "";
        }
        String deviceIconUrl = wearableDeviceModel != null ? DeviceModelExtKt.getDeviceIconUrl(wearableDeviceModel, 2) : null;
        return new TabDeviceContentItem(10, 5, 0, deviceIconUrl != null ? StringExtKt.toLiveData(deviceIconUrl) : null, StringExtKt.toLiveData(name), null, false, null, null, 484, null);
    }
}
