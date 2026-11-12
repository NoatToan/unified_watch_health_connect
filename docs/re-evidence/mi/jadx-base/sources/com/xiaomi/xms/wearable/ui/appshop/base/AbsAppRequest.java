package com.xiaomi.xms.wearable.ui.appshop.base;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.xms.wearable.request.ThirdAppService;
import com.xiaomi.xms.wearable.ui.appshop.model.WatchAppListData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\u0002H\u0014JY\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062 \u0010\u000f\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000b0\u0012j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0011`\u00102\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u0012j\u0002`\u0014H&¢\u0006\u0002\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/base/AbsAppRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/xms/wearable/request/ThirdAppService;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getService", "loadAppList", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "nextKey", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppListBean;", "Lkotlin/Function1;", "fail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbsAppRequest extends BaseRequest<ThirdAppService> {

    @NotNull
    private final String TAG = "AbsAppRequest";

    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    public abstract void loadAppList(@NotNull WearableDeviceModel deviceModel, @Nullable String nextKey, @NotNull Function1<? super WatchAppListData.WatchAppListBean, Unit> success, @NotNull Function1<? super ApiException, Unit> fail);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.net.BaseRequest
    @NotNull
    public ThirdAppService getService() {
        return (ThirdAppService) getRepository().getService(ThirdAppService.class);
    }
}
