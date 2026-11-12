package com.xiaomi.fitness.sync.net;

import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.sync.model.StockHostResp;
import defpackage.uua;
import defpackage.yfi;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@BaseUrl(host = "https://cg.play-analytics.com")
@Secret(encryptResponse = false)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bJ$\u0010\u0002\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sync/net/StockHostService;", "", "getStockHost", "Lcom/xiaomi/fitness/sync/model/StockHostResp;", "data", "Ljava/util/HashMap;", "", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface StockHostService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HOST = "https://cg.play-analytics.com";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sync/net/StockHostService$Companion;", "", "<init>", "()V", "HOST", "", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HOST = "https://cg.play-analytics.com";

        private Companion() {
        }
    }

    @Nullable
    @uua("/")
    Object getStockHost(@yfi @NotNull HashMap<String, String> map, @NotNull Continuation<? super StockHostResp> continuation);
}
