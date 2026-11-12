package com.xiaomi.fitness.membership.api;

import com.xiaomi.fitness.membership.export.data.MembershipListResponse;
import com.xiaomi.fitness.membership.export.data.VipConfigInfo;
import com.xiaomi.fitness.membership.export.data.VipExpiredFaceResponse;
import com.xiaomi.fitness.membership.export.data.VipInfoResult;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.emb;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://watch.iot.mi.com/", path = "ops/v1/")
@Secret(encryptResponse = true, loginPolicy = 3, sid = "miothealth")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H§@¢\u0006\u0002\u0010\u0005J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/membership/api/MembershipApiService;", "", "getVipInfo", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/membership/export/data/VipInfoResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOperationConfig", "Lcom/xiaomi/fitness/membership/export/data/VipConfigInfo;", "getVipList", "Lcom/xiaomi/fitness/membership/export/data/MembershipListResponse;", "checkVipExpiredFaceList", "Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceResponse;", "params", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MembershipApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HTTP_HOST = "https://watch.iot.mi.com/";

    @NotNull
    public static final String HTTP_PATH = "ops/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/membership/api/MembershipApiService$Companion;", "", "<init>", "()V", "HTTP_PATH", "", "HTTP_HOST", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HTTP_HOST = "https://watch.iot.mi.com/";

        @NotNull
        public static final String HTTP_PATH = "ops/v1/";

        private Companion() {
        }
    }

    @u0a
    @ngh("popup/business/record")
    @Nullable
    Object checkVipExpiredFaceList(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<VipExpiredFaceResponse>> continuation);

    @emb({"Cookie:auth_key=rwelJuWBFJxmbMKD"})
    @Nullable
    @uua("membership/config")
    Object getOperationConfig(@NotNull Continuation<? super BaseResult<VipConfigInfo>> continuation);

    @Nullable
    @uua("membership/info")
    Object getVipInfo(@NotNull Continuation<? super BaseResult<VipInfoResult>> continuation);

    @Nullable
    @uua("membership/list")
    Object getVipList(@NotNull Continuation<? super BaseResult<MembershipListResponse>> continuation);
}
