package com.xiaomi.fitness.device.manager.export.bean;

import android.content.Context;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.MutableLiveData;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabDeviceBannerSettingsItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 (2\u00020\u0001:\u0001(BÎ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u001b\b\u0002\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0003J\u001e\u0010\"\u001a\u00020\u00122\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010J\u000e\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0014J\u001e\u0010&\u001a\u00020\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010J\u000e\u0010'\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0014R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/TabDeviceBannerSettingsItem;", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "itemType", "", "type", "icon", "title", "Landroidx/lifecycle/MutableLiveData;", "", Column.SUBTITLE, "more", "", "remind", "Landroidx/databinding/ObservableBoolean;", "remindText", "onClickListener", "Lkotlin/Function1;", "Landroid/content/Context;", "", "onCloseListener", "Landroid/view/View;", "onOpenListener", "itemVisible", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lkotlin/ExtensionFunctionType;", "<init>", "(IIILandroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;ZLandroidx/databinding/ObservableBoolean;Landroidx/lifecycle/MutableLiveData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "value", "Landroidx/databinding/ObservableInt;", "remindType", "getRemindType", "()Landroidx/databinding/ObservableInt;", "setRemindType", "status", "setOnCloseListener", "onCloseClickListener", "handleOnCloseListener", "view", "setOnOpenListener", "handleOpenListener", "Companion", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TabDeviceBannerSettingsItem extends TabContentItem {
    public static final int REMIND_TYPE_DATA = 6;
    public static final int REMIND_TYPE_IN_CALL = 2;
    public static final int REMIND_TYPE_KEEP_ALIVE = 3;
    public static final int REMIND_TYPE_NOTIFICATION = 1;
    public static final int REMIND_TYPE_OFF = -1;
    public static final int REMIND_TYPE_UN_LIMIT = 4;
    public static final int REMIND_TYPE_UPDATE = 5;

    @Nullable
    private Function1<? super View, Unit> onCloseListener;

    @Nullable
    private Function1<? super View, Unit> onOpenListener;

    @NotNull
    private ObservableInt remindType;

    public /* synthetic */ TabDeviceBannerSettingsItem(int i, int i2, int i3, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, boolean z, ObservableBoolean observableBoolean, MutableLiveData mutableLiveData3, Function1 function1, Function1 function2, Function1 function3, Function1 function4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? -1 : i3, mutableLiveData, (i4 & 16) != 0 ? null : mutableLiveData2, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? null : observableBoolean, (i4 & 128) != 0 ? null : mutableLiveData3, (i4 & 256) != 0 ? null : function1, (i4 & 512) != 0 ? null : function2, (i4 & 1024) != 0 ? null : function3, (i4 & 2048) != 0 ? null : function4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOnCloseListener$default(TabDeviceBannerSettingsItem tabDeviceBannerSettingsItem, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        tabDeviceBannerSettingsItem.setOnCloseListener(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOnOpenListener$default(TabDeviceBannerSettingsItem tabDeviceBannerSettingsItem, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        tabDeviceBannerSettingsItem.setOnOpenListener(function1);
    }

    @NotNull
    public final ObservableInt getRemindType() {
        return this.remindType;
    }

    public final void handleOnCloseListener(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Function1<? super View, Unit> function1 = this.onCloseListener;
        if (function1 != null) {
            function1.invoke2(view);
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.0.0.0.36386"), "name", "Device_page_PermissionApplication", "type", 2);
    }

    public final void handleOpenListener(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Function1<? super View, Unit> function1 = this.onOpenListener;
        if (function1 != null) {
            function1.invoke2(view);
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.0.0.0.36386"), "name", "Device_page_PermissionApplication", "type", 1);
    }

    public final void setOnCloseListener(@Nullable Function1<? super View, Unit> onCloseClickListener) {
        this.onCloseListener = onCloseClickListener;
    }

    public final void setOnOpenListener(@Nullable Function1<? super View, Unit> onOpenListener) {
        this.onOpenListener = onOpenListener;
    }

    public final void setRemindType(int status) {
        if (this.remindType.get() == status) {
            this.remindType.notifyChange();
        }
        this.remindType.set(status);
        this.remindType.set(status);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabDeviceBannerSettingsItem(int i, int i2, int i3, @NotNull MutableLiveData<String> title, @Nullable MutableLiveData<String> mutableLiveData, boolean z, @Nullable ObservableBoolean observableBoolean, @Nullable MutableLiveData<String> mutableLiveData2, @Nullable Function1<? super Context, Unit> function1, @Nullable Function1<? super View, Unit> function2, @Nullable Function1<? super View, Unit> function3, @Nullable Function1<? super WearableDeviceModel, Boolean> function4) {
        super(i, i2, i3, title, mutableLiveData, z, observableBoolean, mutableLiveData2, new Function1() { // from class: xyo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(TabDeviceBannerSettingsItem._init_$lambda$0((WearableDeviceModel) obj));
            }
        }, function1, function4, null, null, 6144, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.onCloseListener = function2;
        this.onOpenListener = function3;
        this.remindType = new ObservableInt(-1);
    }
}
