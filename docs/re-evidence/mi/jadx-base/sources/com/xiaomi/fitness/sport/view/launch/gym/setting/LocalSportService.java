package com.xiaomi.fitness.sport.view.launch.gym.setting;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.sport.model.LocalDeviceUpgradeModel;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/device/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportService;", "", "upgradeLocalDevice", "Lcom/xiaomi/fitness/net/response/BaseResult;", "versionInfo", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkLocalDeviceVersion", "Lcom/xiaomi/fitness/sport/model/LocalDeviceUpgradeModel$CheckUpgradeRequest;", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LocalSportService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String PATH = "healthapp/device/";

    @NotNull
    public static final String SECRET_PATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportService$Companion;", "", "<init>", "()V", "PATH", "", "SECRET_PATH", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String PATH = "healthapp/device/";

        @NotNull
        public static final String SECRET_PATH = "healthapp/";

        private Companion() {
        }
    }

    @Nullable
    @uua("check_ot_device_version")
    Object checkLocalDeviceVersion(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<LocalDeviceUpgradeModel.CheckUpgradeRequest>> continuation);

    @Nullable
    @uua("ot_device_upgrade")
    Object upgradeLocalDevice(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<Object>> continuation);
}
