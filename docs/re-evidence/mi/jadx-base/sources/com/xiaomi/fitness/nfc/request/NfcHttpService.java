package com.xiaomi.fitness.nfc.request;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.nfc.entity.MasterRegions;
import defpackage.erg;
import defpackage.frg;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/nfc/request/NfcHttpService;", "", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lerg;", "getUserAllDoorLock", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "data", "Lfrg;", "getAllNfcDoorLock", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fitness/nfc/entity/MasterRegions;", "getSupportMasterRegions", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface NfcHttpService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String PATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/nfc/request/NfcHttpService$Companion;", "", "<init>", "()V", "HOST", "", "PATH", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String PATH = "healthapp/";

        private Companion() {
        }
    }

    @Secret(encryptResponse = false)
    @Nullable
    @uua("product/get_all_nfcdoorlock")
    Object getAllNfcDoorLock(@NotNull @xfi("data") String str, @NotNull Continuation<? super frg> continuation);

    @Secret(encryptResponse = false, loginPolicy = 1)
    @Nullable
    @uua("stat/get_support_bank_regions")
    Object getSupportMasterRegions(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<MasterRegions>> continuation);

    @Nullable
    @uua("device/get_user_all_nfcdoorlock")
    Object getUserAllDoorLock(@NotNull Continuation<? super BaseResult<erg>> continuation);
}
