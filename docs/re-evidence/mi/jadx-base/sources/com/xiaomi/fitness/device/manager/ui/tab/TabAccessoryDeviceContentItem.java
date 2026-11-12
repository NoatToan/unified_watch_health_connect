package com.xiaomi.fitness.device.manager.ui.tab;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;
import com.mibi.sdk.component.Constants;
import com.miui.circulate.device.api.Column;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/TabAccessoryDeviceContentItem;", "Lcom/xiaomi/fitness/device/manager/ui/tab/TabDeviceContentItem;", "did", "", "mode", "", "itemType", "type", "icon", Constants.KEY_RECHARGE_ICON_URL, "Landroidx/lifecycle/MutableLiveData;", "title", Column.SUBTITLE, "more", "", "remind", "Landroidx/databinding/ObservableBoolean;", "remindText", "<init>", "(Ljava/lang/String;IIIILandroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;ZLandroidx/databinding/ObservableBoolean;Landroidx/lifecycle/MutableLiveData;)V", "getDid", "()Ljava/lang/String;", "getMode", "()I", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TabAccessoryDeviceContentItem extends TabDeviceContentItem {

    @NotNull
    private final String did;
    private final int mode;

    public /* synthetic */ TabAccessoryDeviceContentItem(String str, int i, int i2, int i3, int i4, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, MutableLiveData mutableLiveData3, boolean z, ObservableBoolean observableBoolean, MutableLiveData mutableLiveData4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, (i5 & 16) != 0 ? -1 : i4, (i5 & 32) != 0 ? null : mutableLiveData, mutableLiveData2, (i5 & 128) != 0 ? null : mutableLiveData3, (i5 & 256) != 0 ? true : z, (i5 & 512) != 0 ? null : observableBoolean, (i5 & 1024) != 0 ? null : mutableLiveData4);
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final int getMode() {
        return this.mode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabAccessoryDeviceContentItem(@NotNull String did, int i, int i2, int i3, int i4, @Nullable MutableLiveData<String> mutableLiveData, @NotNull MutableLiveData<String> title, @Nullable MutableLiveData<String> mutableLiveData2, boolean z, @Nullable ObservableBoolean observableBoolean, @Nullable MutableLiveData<String> mutableLiveData3) {
        super(i2, i3, i4, mutableLiveData, title, mutableLiveData2, z, observableBoolean, mutableLiveData3);
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(title, "title");
        this.did = did;
        this.mode = i;
    }
}
