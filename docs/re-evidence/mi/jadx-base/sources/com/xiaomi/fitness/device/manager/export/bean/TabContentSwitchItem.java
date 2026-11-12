package com.xiaomi.fitness.device.manager.export.bean;

import android.content.Context;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.MutableLiveData;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.IItemChangesWithDevice;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentSwitchItem;
import defpackage.p80;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B¸\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007\u0012\u001b\b\u0002\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f¢\u0006\u0002\b\u0013\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0004J\u001e\u0010 \u001a\u00020\u000e2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fJ\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0010J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/TabContentSwitchItem;", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "Lcom/xiaomi/fitness/device/manager/export/IItemChangesWithDevice;", "type", "", "icon", "title", "Landroidx/lifecycle/MutableLiveData;", "", "itemType", Column.SUBTITLE, "onClickListener", "Lkotlin/Function1;", "Landroid/content/Context;", "", "switchOn", "", "itemVisible", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lkotlin/ExtensionFunctionType;", "onCheckedChangeListener", "onDeviceChangeListener", "<init>", "(IILandroidx/lifecycle/MutableLiveData;ILandroidx/lifecycle/MutableLiveData;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/MutableLiveData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getSwitchOn", "()Landroidx/lifecycle/MutableLiveData;", "value", "Landroidx/databinding/ObservableInt;", "status", "getStatus", "()Landroidx/databinding/ObservableInt;", "setStatus", "setOnCheckedChanged", "handleSwitchChanged", "isChecked", "onDeviceChanged", "did", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TabContentSwitchItem extends TabContentItem implements IItemChangesWithDevice {

    @Nullable
    private Function1<? super Boolean, Unit> onCheckedChangeListener;

    @Nullable
    private Function1<? super String, Unit> onDeviceChangeListener;

    @NotNull
    private ObservableInt status;

    @NotNull
    private final MutableLiveData<Boolean> switchOn;

    public /* synthetic */ TabContentSwitchItem(int i, int i2, MutableLiveData mutableLiveData, int i3, MutableLiveData mutableLiveData2, Function1 function1, MutableLiveData mutableLiveData3, Function1 function2, Function1 function3, Function1 function4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? -1 : i2, mutableLiveData, (i4 & 8) != 0 ? 13 : i3, (i4 & 16) != 0 ? null : mutableLiveData2, (i4 & 32) != 0 ? null : function1, (i4 & 64) != 0 ? new MutableLiveData(Boolean.FALSE) : mutableLiveData3, (i4 & 128) != 0 ? null : function2, (i4 & 256) != 0 ? null : function3, (i4 & 512) != 0 ? null : function4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(TabContentSwitchItem this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "context");
        if (p80.a(context)) {
            boolean zAreEqual = Intrinsics.areEqual(this$0.switchOn.getValue(), Boolean.TRUE);
            Function1<? super Boolean, Unit> function1 = this$0.onCheckedChangeListener;
            if (function1 != null) {
                function1.invoke2(Boolean.valueOf(!zAreEqual));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOnCheckedChanged$default(TabContentSwitchItem tabContentSwitchItem, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        tabContentSwitchItem.setOnCheckedChanged(function1);
    }

    @NotNull
    public final ObservableInt getStatus() {
        return this.status;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSwitchOn() {
        return this.switchOn;
    }

    public final void handleSwitchChanged(boolean isChecked) {
        Logger.d("handleSwitchChanged " + getType() + " " + isChecked, new Object[0]);
        this.switchOn.postValue(Boolean.valueOf(isChecked ^ true));
        Function1<? super Boolean, Unit> function1 = this.onCheckedChangeListener;
        if (function1 != null) {
            function1.invoke2(Boolean.valueOf(isChecked));
        }
        reportData(false);
    }

    @Override // com.xiaomi.fitness.device.manager.export.IItemChangesWithDevice
    public void onDeviceChanged(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Function1<? super String, Unit> function1 = this.onDeviceChangeListener;
        if (function1 != null) {
            function1.invoke2(did);
        }
    }

    public final void setOnCheckedChanged(@Nullable Function1<? super Boolean, Unit> onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public final void setStatus(int status) {
        if (this.status.get() == status) {
            this.status.notifyChange();
        }
        this.status.set(status);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabContentSwitchItem(int i, int i2, @NotNull MutableLiveData<String> title, int i3, @Nullable MutableLiveData<String> mutableLiveData, @Nullable Function1<? super Context, Unit> function1, @NotNull MutableLiveData<Boolean> switchOn, @Nullable Function1<? super WearableDeviceModel, Boolean> function2, @Nullable Function1<? super Boolean, Unit> function3, @Nullable Function1<? super String, Unit> function4) {
        super(i3, i, i2, title, mutableLiveData, false, null, null, null, function1, function2, null, null, 6624, null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(switchOn, "switchOn");
        this.switchOn = switchOn;
        this.onCheckedChangeListener = function3;
        this.onDeviceChangeListener = function4;
        this.status = new ObservableInt(0);
        if (function1 == null) {
            setOnClickListener(new Function1() { // from class: wyo
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TabContentSwitchItem._init_$lambda$0(this.f38481a, (Context) obj);
                }
            });
        }
    }
}
