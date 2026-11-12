package com.xiaomi.fitness.settingitem.net;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.settingitem.net.model.SettingItemModel;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/SettingItemService;", "", "sendDeviceBigSetting", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SetConfigResult;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeviceBigSetting", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SettingItemResult;", "sendDeviceSetting", "getDeviceSetting", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$GetConfigByModuleResult;", "Companion", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SettingItemService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String PATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/SettingItemService$Companion;", "", "<init>", "()V", "HOST", "", "PATH", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String PATH = "healthapp/";

        private Companion() {
        }
    }

    @u0a
    @ngh("setting/get_user_device_big_setting")
    @Nullable
    Object getDeviceBigSetting(@Nullable @zk9("data") String str, @NotNull Continuation<? super BaseResult<SettingItemModel.SettingItemResult>> continuation);

    @u0a
    @ngh("setting/get_user_device_settings")
    @Nullable
    Object getDeviceSetting(@Nullable @zk9("data") String str, @NotNull Continuation<? super BaseResult<SettingItemModel.GetConfigByModuleResult>> continuation);

    @u0a
    @ngh("setting/set_user_device_big_setting")
    @Nullable
    Object sendDeviceBigSetting(@Nullable @zk9("data") String str, @NotNull Continuation<? super BaseResult<SettingItemModel.SetConfigResult>> continuation);

    @u0a
    @ngh("setting/set_user_device_settings")
    @Nullable
    Object sendDeviceSetting(@Nullable @zk9("data") String str, @NotNull Continuation<? super BaseResult<SettingItemModel.SetConfigResult>> continuation);
}
