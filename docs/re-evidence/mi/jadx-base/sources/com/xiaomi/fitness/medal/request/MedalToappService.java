package com.xiaomi.fitness.medal.request;

import com.xiaomi.fitness.medal.bean.BackgroundPopUp;
import com.xiaomi.fitness.net.response.BaseData;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://watch.iot.mi.com/", path = "cgi-op/api/v1/toapp/")
@Secret(pathPrefix = "", sid = "miothealth")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bg\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010JF\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\bH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/medal/request/MedalToappService;", "", "getBackgroundPopup", "Lcom/xiaomi/fitness/net/response/BaseData;", "Lcom/xiaomi/fitness/medal/bean/BackgroundPopUp;", "terminalType", "", "terminalVersion", "", "appVersion", "deviceModel", "type", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postPopupStatus", "data", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MedalToappService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HEALTH_TOAPP_HOST = "https://watch.iot.mi.com/";

    @NotNull
    public static final String HEALTH_TOAPP_PATH = "cgi-op/api/v1/toapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/medal/request/MedalToappService$Companion;", "", "<init>", "()V", "HEALTH_TOAPP_PATH", "", "HEALTH_TOAPP_HOST", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HEALTH_TOAPP_HOST = "https://watch.iot.mi.com/";

        @NotNull
        public static final String HEALTH_TOAPP_PATH = "cgi-op/api/v1/toapp/";

        private Companion() {
        }
    }

    @Nullable
    @uua("wear/popup/get")
    Object getBackgroundPopup(@xfi("terminalType") int i, @NotNull @xfi("terminalVersion") String str, @NotNull @xfi("appVersion") String str2, @NotNull @xfi("deviceModel") String str3, @xfi("popupType") int i2, @NotNull Continuation<? super BaseData<BackgroundPopUp>> continuation);

    @u0a
    @ngh("wear/popup/status")
    @Nullable
    Object postPopupStatus(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseData<BackgroundPopUp>> continuation);
}
