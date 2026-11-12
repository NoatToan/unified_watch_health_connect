package com.xiaomi.fitness.device.manager.ui.tab;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.MutableLiveData;
import com.mibi.sdk.component.Constants;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.DeviceStatus;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.ui.tab.TabDeviceContentItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0003J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u001e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/TabDeviceContentItem;", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "itemType", "", "type", "icon", Constants.KEY_RECHARGE_ICON_URL, "Landroidx/lifecycle/MutableLiveData;", "", "title", Column.SUBTITLE, "more", "", "remind", "Landroidx/databinding/ObservableBoolean;", "remindText", "<init>", "(IIILandroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;ZLandroidx/databinding/ObservableBoolean;Landroidx/lifecycle/MutableLiveData;)V", "getIconUrl", "()Landroidx/lifecycle/MutableLiveData;", "setIconUrl", "(Landroidx/lifecycle/MutableLiveData;)V", "value", "Landroidx/databinding/ObservableInt;", "status", "getStatus", "()Landroidx/databinding/ObservableInt;", "setStatus", "", "faceUrl", "getFaceUrl", "supportSwitchWearMode", "getSupportSwitchWearMode", "()Landroidx/databinding/ObservableBoolean;", "setSupportSwitchWearMode", "support", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class TabDeviceContentItem extends TabContentItem {

    @NotNull
    private final MutableLiveData<String> faceUrl;

    @Nullable
    private MutableLiveData<String> iconUrl;

    @NotNull
    private ObservableInt status;

    @NotNull
    private ObservableBoolean supportSwitchWearMode;

    public /* synthetic */ TabDeviceContentItem(int i, int i2, int i3, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, MutableLiveData mutableLiveData3, boolean z, ObservableBoolean observableBoolean, MutableLiveData mutableLiveData4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? -1 : i3, (i4 & 8) != 0 ? null : mutableLiveData, mutableLiveData2, (i4 & 32) != 0 ? null : mutableLiveData3, (i4 & 64) != 0 ? true : z, (i4 & 128) != 0 ? null : observableBoolean, (i4 & 256) != 0 ? null : mutableLiveData4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return false;
    }

    @NotNull
    public final MutableLiveData<String> getFaceUrl() {
        return this.faceUrl;
    }

    @Nullable
    public final MutableLiveData<String> getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final ObservableInt getStatus() {
        return this.status;
    }

    @NotNull
    public final ObservableBoolean getSupportSwitchWearMode() {
        return this.supportSwitchWearMode;
    }

    public final void setIconUrl(@Nullable MutableLiveData<String> mutableLiveData) {
        this.iconUrl = mutableLiveData;
    }

    public final void setStatus(int status) {
        DeviceModelExtKt.logi("TabDeviceContentItem", "setStatus  type " + getType() + " " + DeviceStatus.INSTANCE.statusToString(status));
        if (this.status.get() == status) {
            this.status.notifyChange();
        }
        this.status.set(status);
    }

    public final void setSupportSwitchWearMode(boolean support) {
        if (this.supportSwitchWearMode.get() == support) {
            this.supportSwitchWearMode.notifyChange();
        }
        this.supportSwitchWearMode.set(support);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabDeviceContentItem(int i, int i2, int i3, @Nullable MutableLiveData<String> mutableLiveData, @NotNull MutableLiveData<String> title, @Nullable MutableLiveData<String> mutableLiveData2, boolean z, @Nullable ObservableBoolean observableBoolean, @Nullable MutableLiveData<String> mutableLiveData3) {
        super(i, i2, i3, title, mutableLiveData2, z, observableBoolean, mutableLiveData3, new Function1() { // from class: yyo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TabDeviceContentItem._init_$lambda$0((WearableDeviceModel) obj));
            }
        }, null, null, null, null, 7680, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.iconUrl = mutableLiveData;
        this.status = new ObservableInt(0);
        this.faceUrl = new MutableLiveData<>(null);
        this.supportSwitchWearMode = new ObservableBoolean(false);
    }
}
