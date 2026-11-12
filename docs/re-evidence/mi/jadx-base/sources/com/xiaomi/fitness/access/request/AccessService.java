package com.xiaomi.fitness.access.request;

import com.xiaomi.fitness.access.export.bean.MiSportData;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 22\u00020\u0001:\u00012J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H§@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H§@¢\u0006\u0002\u0010\fJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003H§@¢\u0006\u0002\u0010\fJ\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003H§@¢\u0006\u0002\u0010\fJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003H§@¢\u0006\u0002\u0010\fJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0003H§@¢\u0006\u0002\u0010\fJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0003H§@¢\u0006\u0002\u0010\fJ\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0003H§@¢\u0006\u0002\u0010\fJ\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/access/request/AccessService;", "", "unBindWechat", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/access/request/BoolRetResult;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindWechat", "Lcom/xiaomi/fitness/access/request/MiscModel$WechatBindResult;", "getAlipayBindStatus", "Lcom/xiaomi/fitness/access/request/MiscModel$AlipayBindResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unBindAlipay", "getAlipayQueryString", "bindAlipay", "getMiSportStatus", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportStatusList;", "locale", "getMiSportDataItem", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportDataList;", "getMiSportLastMigrateStatus", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportStatus;", "postMiSportDataMigrate", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MigrateResponse;", "code", "getStravaBindStatus", "Lcom/xiaomi/fitness/access/request/MiscModel$StravaBindResult;", "bindStrava", "unbindStrava", "getProductList", "Lcom/xiaomi/fitness/access/request/MiscModel$ProductResult;", "getDeviceBindStatus", "Lcom/xiaomi/fitness/access/request/MiscModel$BindStatus;", "getDeviceTicket", "Lcom/xiaomi/fitness/access/request/MiscModel$DeviceTicket;", "unbindDeviceFromWechat", "Lcom/xiaomi/fitness/access/request/MiscModel$UnbindDeviceFromWechat;", "bindGoogleFit", "Lcom/xiaomi/fitness/access/request/GoogleFitBindResultModel;", "unbindGoogleFit", "Lcom/xiaomi/fitness/access/request/GoogleFitUnbindResultModel;", "getGoogleFitBindStatus", "Lcom/xiaomi/fitness/access/request/GetGoogleFitBindStatusResultModel;", "bindThirdParty", "Lcom/xiaomi/fitness/access/request/ThirdPartyBindResultModel;", "getThirdPartyBindStatus", "Lcom/xiaomi/fitness/access/request/ThirdPartyBindStatusResultModel;", "unbindThirdParty", "Lcom/xiaomi/fitness/access/request/ThirdPartyUnbindResultModel;", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AccessService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String WECHARTHOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String WECHARTPATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/access/request/AccessService$Companion;", "", "<init>", "()V", "WECHARTHOST", "", "WECHARTPATH", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String WECHARTHOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String WECHARTPATH = "healthapp/";

        private Companion() {
        }
    }

    @u0a
    @ngh("third/alipay/bind_alipay_user")
    @Nullable
    Object bindAlipay(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<MiscModel.AlipayBindResult>> continuation);

    @u0a
    @ngh("third/googlefit/bind")
    @Nullable
    Object bindGoogleFit(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<GoogleFitBindResultModel>> continuation);

    @u0a
    @ngh("third/strava/bind_authorize_strava")
    @Nullable
    Object bindStrava(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<MiscModel.StravaBindResult>> continuation);

    @u0a
    @ngh("third/bind/oauth2")
    @Nullable
    Object bindThirdParty(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<ThirdPartyBindResultModel>> continuation);

    @Nullable
    @uua("open/bind_to_wechat")
    Object bindWechat(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<MiscModel.WechatBindResult>> continuation);

    @Nullable
    @uua("third/alipay/get_bind_status")
    Object getAlipayBindStatus(@NotNull Continuation<? super BaseResult<MiscModel.AlipayBindResult>> continuation);

    @u0a
    @ngh("third/alipay/gen_request_query")
    @Nullable
    Object getAlipayQueryString(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<MiscModel.AlipayBindResult>> continuation);

    @u0a
    @ngh("third/wechat_hardware_platform/get_bind_status")
    @Nullable
    Object getDeviceBindStatus(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<MiscModel.BindStatus>> continuation);

    @u0a
    @ngh("third/wechat_hardware_platform/get_bind_ticket")
    @Nullable
    Object getDeviceTicket(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<MiscModel.DeviceTicket>> continuation);

    @Nullable
    @uua("third/googlefit/bind_state")
    Object getGoogleFitBindStatus(@NotNull Continuation<? super BaseResult<GetGoogleFitBindStatusResultModel>> continuation);

    @Nullable
    @uua("huami/data_migrate/auth_list")
    Object getMiSportDataItem(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<MiSportData.MiSportDataList>> continuation);

    @Nullable
    @uua("huami/data_migrate/latest_record")
    Object getMiSportLastMigrateStatus(@NotNull Continuation<? super BaseResult<MiSportData.MiSportStatus>> continuation);

    @Nullable
    @uua("huami/data_migrate/item_status")
    Object getMiSportStatus(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<MiSportData.MiSportStatusList>> continuation);

    @Nullable
    @uua("third/wechat_hardware_platform/get_product_list")
    Object getProductList(@NotNull Continuation<? super BaseResult<MiscModel.ProductResult>> continuation);

    @Nullable
    @uua("third/strava/get_bind_status")
    Object getStravaBindStatus(@NotNull Continuation<? super BaseResult<MiscModel.StravaBindResult>> continuation);

    @Nullable
    @uua("third/get_bind_status")
    Object getThirdPartyBindStatus(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<ThirdPartyBindStatusResultModel>> continuation);

    @u0a
    @ngh("huami/data_migrate/trigger")
    @Nullable
    Object postMiSportDataMigrate(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<MiSportData.MigrateResponse>> continuation);

    @Nullable
    @uua("third/alipay/unbind_alipay_user")
    Object unBindAlipay(@NotNull Continuation<? super BaseResult<MiscModel.AlipayBindResult>> continuation);

    @Nullable
    @uua("third/wechat/unbind_wechat")
    Object unBindWechat(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<BoolRetResult>> continuation);

    @u0a
    @ngh("third/wechat_hardware_platform/device_unbind")
    @Nullable
    Object unbindDeviceFromWechat(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<MiscModel.UnbindDeviceFromWechat>> continuation);

    @Nullable
    @uua("third/googlefit/unbind")
    Object unbindGoogleFit(@NotNull Continuation<? super BaseResult<GoogleFitUnbindResultModel>> continuation);

    @Nullable
    @uua("third/strava/unbind_strava")
    Object unbindStrava(@NotNull Continuation<? super BaseResult<MiscModel.StravaBindResult>> continuation);

    @Nullable
    @uua("third/unbind")
    Object unbindThirdParty(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<ThirdPartyUnbindResultModel>> continuation);
}
