package com.xiaomi.fitness.pay.result;

import android.app.Application;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.pay.OrderInfo;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import com.xiaomi.fitness.pay.result.PayResultModel;
import defpackage.r0j;
import defpackage.yni;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u000bJ\u000e\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020\u000bR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u000b0\u000b0\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010%\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u000b0\u000b0\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR(\u0010(\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u000b0\u000b0\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u001a\u00104\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010.\"\u0004\b6\u00100¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/pay/result/PayResultModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel$delegate", "Lkotlin/Lazy;", OrderInfo.KEY_ORDERSTATUS, "", "getOrderStatus", "()Ljava/lang/String;", "setOrderStatus", "(Ljava/lang/String;)V", "skuName", "getSkuName", "setSkuName", "isCourseVip", "", "()Z", "setCourseVip", "(Z)V", "statusString", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "getStatusString", "()Landroidx/lifecycle/MutableLiveData;", "setStatusString", "(Landroidx/lifecycle/MutableLiveData;)V", "statusIcon", "Landroidx/databinding/ObservableInt;", "getStatusIcon", "()Landroidx/databinding/ObservableInt;", "setStatusIcon", "(Landroidx/databinding/ObservableInt;)V", "statusDescString", "getStatusDescString", "setStatusDescString", "nextString", "getNextString", "setNextString", "paySuccess", "Landroidx/databinding/ObservableBoolean;", "getPaySuccess", "()Landroidx/databinding/ObservableBoolean;", "setPaySuccess", "(Landroidx/databinding/ObservableBoolean;)V", "nextBtnEnabled", "getNextBtnEnabled", "setNextBtnEnabled", "hasRecommend", "getHasRecommend", "setHasRecommend", "processOrderStatus", "", "status", "refreshTimerText", "left", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PayResultModel extends BaseModel {
    private boolean isCourseVip;

    /* JADX INFO: renamed from: deviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: loh
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayResultModel.deviceModel_delegate$lambda$0();
        }
    });

    @NotNull
    private String orderStatus = OrderStatus.IN_PAYMENT;

    @NotNull
    private String skuName = "";

    @NotNull
    private MutableLiveData<String> statusString = new MutableLiveData<>("");

    @NotNull
    private ObservableInt statusIcon = new ObservableInt();

    @NotNull
    private MutableLiveData<String> statusDescString = new MutableLiveData<>("");

    @NotNull
    private MutableLiveData<String> nextString = new MutableLiveData<>("");

    @NotNull
    private ObservableBoolean paySuccess = new ObservableBoolean(false);

    @NotNull
    private ObservableBoolean nextBtnEnabled = new ObservableBoolean(false);

    @NotNull
    private ObservableBoolean hasRecommend = new ObservableBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel deviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @Nullable
    public final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) this.deviceModel.getValue();
    }

    @NotNull
    public final ObservableBoolean getHasRecommend() {
        return this.hasRecommend;
    }

    @NotNull
    public final ObservableBoolean getNextBtnEnabled() {
        return this.nextBtnEnabled;
    }

    @NotNull
    public final MutableLiveData<String> getNextString() {
        return this.nextString;
    }

    @NotNull
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @NotNull
    public final ObservableBoolean getPaySuccess() {
        return this.paySuccess;
    }

    @NotNull
    public final String getSkuName() {
        return this.skuName;
    }

    @NotNull
    public final MutableLiveData<String> getStatusDescString() {
        return this.statusDescString;
    }

    @NotNull
    public final ObservableInt getStatusIcon() {
        return this.statusIcon;
    }

    @NotNull
    public final MutableLiveData<String> getStatusString() {
        return this.statusString;
    }

    /* JADX INFO: renamed from: isCourseVip, reason: from getter */
    public final boolean getIsCourseVip() {
        return this.isCourseVip;
    }

    public final void processOrderStatus(@NotNull String status) {
        int i;
        Intrinsics.checkNotNullParameter(status, "status");
        this.orderStatus = status;
        int iHashCode = status.hashCode();
        if (iHashCode == 127054372) {
            if (status.equals(OrderStatus.PAYMENT_FAIL)) {
                this.statusDescString.postValue(ApplicationExtKt.getApplication().getString(r0j.R));
                this.statusIcon.set(yni.g);
                this.nextString.postValue(ApplicationExtKt.getApplication().getString(r0j.T));
                this.paySuccess.set(false);
                this.nextBtnEnabled.set(true);
                return;
            }
            return;
        }
        if (iHashCode != 430128957) {
            if (iHashCode == 513390849 && status.equals(OrderStatus.IN_PAYMENT)) {
                this.statusDescString.postValue(ApplicationExtKt.getApplication().getString(r0j.R));
                this.statusIcon.set(yni.i);
                this.nextString.postValue(ApplicationExtKt.getApplication().getString(r0j.T));
                this.paySuccess.set(false);
                this.nextBtnEnabled.set(false);
                return;
            }
            return;
        }
        if (status.equals(OrderStatus.PAYMENT_SUCCESS)) {
            this.statusString.postValue(ApplicationExtKt.getApplication().getString(r0j.Q));
            this.statusDescString.postValue(this.skuName);
            this.statusIcon.set(yni.h);
            MutableLiveData<String> mutableLiveData = this.nextString;
            Application application = ApplicationExtKt.getApplication();
            if (this.isCourseVip) {
                i = r0j.U;
            } else {
                WearableDeviceModel deviceModel = getDeviceModel();
                i = (deviceModel == null || !DeviceModelExtKt.isBandType(deviceModel)) ? r0j.O : r0j.P;
            }
            mutableLiveData.postValue(application.getString(i));
            this.paySuccess.set(true);
            this.nextBtnEnabled.set(true);
        }
    }

    public final void refreshTimerText(@NotNull String left) {
        Intrinsics.checkNotNullParameter(left, "left");
        this.statusString.postValue(ApplicationExtKt.getApplication().getString(r0j.S, left));
    }

    public final void setCourseVip(boolean z) {
        this.isCourseVip = z;
    }

    public final void setHasRecommend(@NotNull ObservableBoolean observableBoolean) {
        Intrinsics.checkNotNullParameter(observableBoolean, "<set-?>");
        this.hasRecommend = observableBoolean;
    }

    public final void setNextBtnEnabled(@NotNull ObservableBoolean observableBoolean) {
        Intrinsics.checkNotNullParameter(observableBoolean, "<set-?>");
        this.nextBtnEnabled = observableBoolean;
    }

    public final void setNextString(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.nextString = mutableLiveData;
    }

    public final void setOrderStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderStatus = str;
    }

    public final void setPaySuccess(@NotNull ObservableBoolean observableBoolean) {
        Intrinsics.checkNotNullParameter(observableBoolean, "<set-?>");
        this.paySuccess = observableBoolean;
    }

    public final void setSkuName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.skuName = str;
    }

    public final void setStatusDescString(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.statusDescString = mutableLiveData;
    }

    public final void setStatusIcon(@NotNull ObservableInt observableInt) {
        Intrinsics.checkNotNullParameter(observableInt, "<set-?>");
        this.statusIcon = observableInt;
    }

    public final void setStatusString(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.statusString = mutableLiveData;
    }
}
