package com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact;

import com.xiaomi.fitness.net.url.BaseUrl;
import defpackage.emb;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0018\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactApiService;", "", "getGuideJson", "param", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EmergencyContactApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String PATH = "app/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactApiService$Companion;", "", "<init>", "()V", "HOST", "", "PATH", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String PATH = "app/";

        private Companion() {
        }
    }

    @emb({"Cookie:auth_key=rwelJuWBFJxmbMKD"})
    @Nullable
    @uua("v1/resource/download/?")
    Object getGuideJson(@NotNull @xfi("data") String str, @NotNull Continuation<Object> continuation);
}
