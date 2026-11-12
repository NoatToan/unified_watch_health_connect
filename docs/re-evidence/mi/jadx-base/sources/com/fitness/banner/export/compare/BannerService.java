package com.fitness.banner.export.compare;

import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.net.response.BaseData;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.emb;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@BaseUrl(host = "https://watch.iot.mi.com/")
@Secret(loginPolicy = 3, sid = "miothealth")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J<\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/fitness/banner/export/compare/BannerService;", "", "fetchBannerV2", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/fitness/banner/export/compare/BannerResponseResultV2;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchBannerV1", "Lcom/xiaomi/fitness/net/response/BaseData;", "Lcom/fitness/banner/export/compare/BannerResponseResultV1;", OneTrackExtKt.KEY_BUSINESS, "group", "", "limit", "appVersion", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getABTestResult", "Lcom/fitness/banner/export/compare/ABTestResponseResult;", "Companion", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BannerService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HEATH_HOST = "https://watch.iot.mi.com/";

    @NotNull
    public static final String MIOT_HEALTH = "miothealth";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/fitness/banner/export/compare/BannerService$Companion;", "", "<init>", "()V", "BASE_HOST", "", "HEATH_HOST", "MIOT_HEALTH", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final String BASE_HOST = "watch.iot.mi.com";

        @NotNull
        public static final String HEATH_HOST = "https://watch.iot.mi.com/";

        @NotNull
        public static final String MIOT_HEALTH = "miothealth";

        private Companion() {
        }
    }

    @Secret(encryptResponse = false, loginPolicy = 3, sid = "miothealth")
    @Nullable
    @uua("cgi-op/api/v1/watch/health/resource")
    Object fetchBannerV1(@NotNull @xfi(OneTrackExtKt.KEY_BUSINESS) String str, @xfi("group") int i, @xfi("limit") int i2, @NotNull @xfi("version") String str2, @NotNull Continuation<? super BaseData<BannerResponseResultV1>> continuation);

    @Secret(loginPolicy = 3, sid = "miothealth")
    @Nullable
    @uua("ops/v1/resource/banner_list")
    Object fetchBannerV2(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<BannerResponseResultV2>> continuation);

    @ngh("ops/v1/abtest/result")
    @emb({"Cookie:auth_key=rwelJuWBFJxmbMKD"})
    @Nullable
    @u0a
    @Secret(loginPolicy = 3, sid = "miothealth")
    Object getABTestResult(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<ABTestResponseResult>> continuation);
}
