package com.xiaomi.fitness.devicesettings.bluttooth.audio.net;

import com.xiaomi.fitness.devicesettings.bluttooth.audio.AsrResult;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.DeleteResultList;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.GetUploadUrl;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.SummaryAllowed;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.SummaryResultList;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.TransResultList;
import com.xiaomi.fitness.net.response.BaseResult;
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

/* JADX INFO: loaded from: classes8.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H§@¢\u0006\u0002\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsService;", "", "getUploadUrl", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/GetUploadUrl;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransResult", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TransResultList;", "postTransTask", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AsrResult;", "deleteTransTask", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/DeleteResultList;", "getSummaryUploadUrl", "submitSummaryTask", "getSummaryResult", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/SummaryResultList;", "deleteSummary", "allowSummary", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/SummaryAllowed;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceSettingsService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HEADSET_PATH = "app/v1/";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsService$Companion;", "", "<init>", "()V", "HEADSET_PATH", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HEADSET_PATH = "app/v1/";

        private Companion() {
        }
    }

    @Nullable
    @uua("abstract/allow")
    Object allowSummary(@NotNull Continuation<? super BaseResult<SummaryAllowed>> continuation);

    @u0a
    @ngh("abstract/delete")
    @Nullable
    Object deleteSummary(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DeleteResultList>> continuation);

    @u0a
    @ngh("asr/delete_audio_and_transret")
    @Nullable
    Object deleteTransTask(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DeleteResultList>> continuation);

    @Nullable
    @uua("abstract/gen_download_url")
    Object getSummaryResult(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<SummaryResultList>> continuation);

    @Nullable
    @uua("abstract/gen_transcript_upload_url")
    Object getSummaryUploadUrl(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetUploadUrl>> continuation);

    @Nullable
    @uua("asr/gen_transret_download_url")
    Object getTransResult(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<TransResultList>> continuation);

    @Nullable
    @uua("asr/gen_audio_upload_url")
    Object getUploadUrl(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetUploadUrl>> continuation);

    @u0a
    @ngh("asr/gen_audio_trans_task")
    @Nullable
    Object postTransTask(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<AsrResult>> continuation);

    @u0a
    @ngh("abstract/submit_task")
    @Nullable
    Object submitSummaryTask(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<AsrResult>> continuation);
}
