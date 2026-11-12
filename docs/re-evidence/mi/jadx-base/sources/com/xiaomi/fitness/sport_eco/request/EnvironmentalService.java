package com.xiaomi.fitness.sport_eco.request;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpModel;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "app/v1/")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/request/EnvironmentalService;", "", "requestEcoApi", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpModel$RespData;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EnvironmentalService {

    @NotNull
    public static final String ADD_ENVIRONMENTAL = "eco/general-equipment/exercise_bike/ep/add";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String PATH = "app/v1/";

    @NotNull
    public static final String QUERY_ENVIRONMENTAL = "eco/general-equipment/exercise_bike/ep/query";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/request/EnvironmentalService$Companion;", "", "<init>", "()V", "PATH", "", "HOST", "QUERY_ENVIRONMENTAL", "ADD_ENVIRONMENTAL", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String ADD_ENVIRONMENTAL = "eco/general-equipment/exercise_bike/ep/add";

        @NotNull
        public static final String HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String PATH = "app/v1/";

        @NotNull
        public static final String QUERY_ENVIRONMENTAL = "eco/general-equipment/exercise_bike/ep/query";

        private Companion() {
        }
    }

    @u0a
    @ngh("eco/api_proxy")
    @Nullable
    Object requestEcoApi(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<FtpModel.RespData>> continuation);
}
