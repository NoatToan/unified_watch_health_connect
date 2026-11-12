package com.xiaomi.fitness.pay.channel;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.pay.OrderInfo;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import defpackage.r0j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0006R(\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/pay/channel/PayChannelModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "timerString", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getTimerString", "()Landroidx/lifecycle/MutableLiveData;", "setTimerString", "(Landroidx/lifecycle/MutableLiveData;)V", "orderValid", "Landroidx/databinding/ObservableBoolean;", "getOrderValid", "()Landroidx/databinding/ObservableBoolean;", "setOrderValid", "(Landroidx/databinding/ObservableBoolean;)V", "channelListValid", "getChannelListValid", "setChannelListValid", "setChannelList", "", "list", "", OrderInfo.KEY_ORDERSTATUS, "processOrderStatus", "status", "setTimerLeft", "left", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PayChannelModel extends BaseModel {

    @NotNull
    private MutableLiveData<String> timerString = new MutableLiveData<>("");

    @NotNull
    private ObservableBoolean orderValid = new ObservableBoolean(true);

    @NotNull
    private ObservableBoolean channelListValid = new ObservableBoolean(false);

    @NotNull
    private String orderStatus = OrderStatus.INVALID;

    @NotNull
    public final ObservableBoolean getChannelListValid() {
        return this.channelListValid;
    }

    @NotNull
    public final ObservableBoolean getOrderValid() {
        return this.orderValid;
    }

    @NotNull
    public final MutableLiveData<String> getTimerString() {
        return this.timerString;
    }

    public final void processOrderStatus(@NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.orderStatus = status;
        this.orderValid.set(Intrinsics.areEqual(status, OrderStatus.IN_PAYMENT));
    }

    public final void setChannelList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.channelListValid.set(!list.isEmpty());
    }

    public final void setChannelListValid(@NotNull ObservableBoolean observableBoolean) {
        Intrinsics.checkNotNullParameter(observableBoolean, "<set-?>");
        this.channelListValid = observableBoolean;
    }

    public final void setOrderValid(@NotNull ObservableBoolean observableBoolean) {
        Intrinsics.checkNotNullParameter(observableBoolean, "<set-?>");
        this.orderValid = observableBoolean;
    }

    public final void setTimerLeft(@NotNull String left) {
        Intrinsics.checkNotNullParameter(left, "left");
        this.timerString.postValue(ApplicationExtKt.getApplication().getString(r0j.q, left));
    }

    public final void setTimerString(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.timerString = mutableLiveData;
    }
}
