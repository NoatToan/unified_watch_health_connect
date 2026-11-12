package com.xiaomi.fitness.electronic.scale;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.electronic.scale.AboutDeviceViewModel;
import com.xiaomi.fitness.electronic.scale.config.EcoDeviceConfigFactory;
import com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper;
import com.xiaomi.fitness.electronic.scale.request.ScaleRequest;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.qal;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bJ\u0012\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/AboutDeviceViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "scaleRequest", "Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;", "getScaleRequest", "()Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;", "setScaleRequest", "(Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;)V", "did", "", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "deviceModel", "getDeviceModel", "setDeviceModel", "macAddress", "getMacAddress", "setMacAddress", "firmwareVersion", "getFirmwareVersion", "setFirmwareVersion", "serialNumber", "getSerialNumber", "setSerialNumber", "deviceConfig", "Lcom/xiaomi/fitness/electronic/scale/config/main/BaseDeviceConfig;", "init", "", "model", "attach", "savedInstanceState", "Landroid/os/Bundle;", "recallReminder", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AboutDeviceViewModel extends AbsViewModel {
    private BaseDeviceConfig deviceConfig;

    @Nullable
    private String did;
    public ScaleRequest scaleRequest;

    @NotNull
    private String deviceModel = "hmpace.bracelet.v5h";

    @NotNull
    private String macAddress = "MAC地址";

    @NotNull
    private String firmwareVersion = "v1.0.2.66_ansreid_167";

    @NotNull
    private String serialNumber = "622441567d9il2";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recallReminder$lambda$1(final AboutDeviceViewModel this$0, final BaseActivity activity, ScaleData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        qal.c("recallReminder, deleteRecord success, resp is " + it.getResp());
        VirtualAccountHelper virtualAccountHelper = VirtualAccountHelper.INSTANCE;
        String userId = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
        Long lValueOf = userId != null ? Long.valueOf(Long.parseLong(userId)) : null;
        Intrinsics.checkNotNull(lValueOf);
        long jLongValue = lValueOf.longValue();
        String str = this$0.did;
        Intrinsics.checkNotNull(str);
        virtualAccountHelper.deleteVirtualAccount(jLongValue, str, new Function0() { // from class: vy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AboutDeviceViewModel.recallReminder$lambda$1$lambda$0(this.f37350a, activity);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recallReminder$lambda$1$lambda$0(AboutDeviceViewModel this$0, BaseActivity activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        qal.c("recallReminder, VirtualAccountHelper.deleteVirtualAccount success");
        BaseDeviceConfig baseDeviceConfig = this$0.deviceConfig;
        if (baseDeviceConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceConfig");
            baseDeviceConfig = null;
        }
        String str = this$0.did;
        Intrinsics.checkNotNull(str);
        baseDeviceConfig.unbindDevice(activity, str, new AboutDeviceViewModel$recallReminder$1$1$1(activity, this$0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recallReminder$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        qal.b("recallReminder, deleteRecord failed,  error: " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    public final String getMacAddress() {
        return this.macAddress;
    }

    @NotNull
    public final ScaleRequest getScaleRequest() {
        ScaleRequest scaleRequest = this.scaleRequest;
        if (scaleRequest != null) {
            return scaleRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("scaleRequest");
        return null;
    }

    @NotNull
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public final void init(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.deviceConfig = EcoDeviceConfigFactory.INSTANCE.newDeviceConfig(model);
    }

    public final void recallReminder(@NotNull final BaseActivity activity) throws JSONException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.did == null) {
            qal.b("recallReminder did == null");
            return;
        }
        if (!NetworkExtKt.isNetworkAvailable()) {
            String string = activity.getString(zzi.e4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(activity, string);
        } else {
            ScaleRequest scaleRequest = getScaleRequest();
            CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
            String str = this.did;
            Intrinsics.checkNotNull(str);
            scaleRequest.deleteRecord(viewModelScope, str, new Function1() { // from class: ty
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AboutDeviceViewModel.recallReminder$lambda$1(this.f35171a, activity, (ScaleData) obj);
                }
            }, new Function1() { // from class: uy
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AboutDeviceViewModel.recallReminder$lambda$2((ApiException) obj);
                }
            });
        }
    }

    public final void setDeviceModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceModel = str;
    }

    public final void setDid(@Nullable String str) {
        this.did = str;
    }

    public final void setFirmwareVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firmwareVersion = str;
    }

    public final void setMacAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.macAddress = str;
    }

    public final void setScaleRequest(@NotNull ScaleRequest scaleRequest) {
        Intrinsics.checkNotNullParameter(scaleRequest, "<set-?>");
        this.scaleRequest = scaleRequest;
    }

    public final void setSerialNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serialNumber = str;
    }
}
