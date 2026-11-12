package com.xiaomi.xms.wearable.request;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.xms.wearable.ui.appshop.model.GetWeichatLicense;
import com.xiaomi.xms.wearable.ui.appshop.model.WatchAppListData;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(sid = "miothealth")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/xms/wearable/request/ThirdAppService;", "", "getWatchAppList", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppListBean;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMultiWatchAppList", "getWeichatLicense", "Lcom/xiaomi/xms/wearable/ui/appshop/model/GetWeichatLicense;", "did", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ThirdAppService {

    @NotNull
    public static final String APP_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String APP_PATH = "app/v1/";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/xms/wearable/request/ThirdAppService$Companion;", "", "<init>", "()V", "APP_HOST", "", "APP_PATH", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String APP_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String APP_PATH = "app/v1/";

        private Companion() {
        }
    }

    @Nullable
    @uua("watch/appstore/multi_get_watch_app_info")
    Object getMultiWatchAppList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<WatchAppListData.WatchAppListBean>> continuation);

    @Nullable
    @uua("watch/appstore/get_watch_app_list")
    Object getWatchAppList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<WatchAppListData.WatchAppListBean>> continuation);

    @u0a
    @ngh("thirdapp/get_wechat_license_sign")
    @Nullable
    Object getWeichatLicense(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super GetWeichatLicense> continuation);
}
