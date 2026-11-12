package com.xiaomi.fitness.nfc.request;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoResponse;
import com.xiaomi.fitness.nfc.bean.yoyo.DisableCardResponse;
import com.xiaomi.fitness.nfc.bean.yoyo.EasyCardResponse;
import com.xiaomi.fitness.nfc.bean.yoyo.PullCommandResponse;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "app/v1/")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/nfc/request/NfcHttpNewService;", "", "cardInfo", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/nfc/bean/yoyo/EasyCardResponse;", "Lcom/xiaomi/fitness/nfc/bean/yoyo/CardInfoResponse;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullCommand", "Lcom/xiaomi/fitness/nfc/bean/yoyo/PullCommandResponse;", "disableCard", "Lcom/xiaomi/fitness/nfc/bean/yoyo/DisableCardResponse;", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NfcHttpNewService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String PATH = "app/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/nfc/request/NfcHttpNewService$Companion;", "", "<init>", "()V", "HOST", "", "PATH", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String PATH = "app/v1/";

        private Companion() {
        }
    }

    @Nullable
    @uua("easycard/card_info")
    Object cardInfo(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<EasyCardResponse<CardInfoResponse>>> continuation);

    @Nullable
    @uua("easycard/disable_card")
    Object disableCard(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<DisableCardResponse>> continuation);

    @Nullable
    @uua("easycard/command_script")
    Object pullCommand(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<EasyCardResponse<PullCommandResponse>>> continuation);
}
