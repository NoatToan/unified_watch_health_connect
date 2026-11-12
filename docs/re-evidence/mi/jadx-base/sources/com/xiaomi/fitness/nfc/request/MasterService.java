package com.xiaomi.fitness.nfc.request;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.nfc.entity.MasterRegions;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://region.hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/nfc/request/MasterService;", "", "getSupportMasterRegions", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/nfc/entity/MasterRegions;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MasterService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HEALTH_REGION_HOST = "region.hlth.io.mi.com";

    @NotNull
    public static final String HEALTH_REGION_URL = "https://region.hlth.io.mi.com/";

    @NotNull
    public static final String REGION_PATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/nfc/request/MasterService$Companion;", "", "<init>", "()V", "REGION_PATH", "", "HEALTH_REGION_HOST", "HEALTH_REGION_URL", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HEALTH_REGION_HOST = "region.hlth.io.mi.com";

        @NotNull
        public static final String HEALTH_REGION_URL = "https://region.hlth.io.mi.com/";

        @NotNull
        public static final String REGION_PATH = "healthapp/";

        private Companion() {
        }
    }

    @Secret(encryptResponse = false, loginPolicy = 1)
    @Nullable
    @uua("stat/get_support_bank_regions")
    Object getSupportMasterRegions(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<MasterRegions>> continuation);
}
