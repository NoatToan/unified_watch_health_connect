package com.xiaomi.fitness.watch.face.request;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.watch.face.data.DeviceFaceIndexList;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketOperation;
import com.xiaomi.fitness.watch.face.data.FaceDesignerCapabilityResult;
import com.xiaomi.fitness.watch.face.data.FaceDesignerCheckWLResult;
import com.xiaomi.fitness.watch.face.data.FaceDesignerLicenseResult;
import com.xiaomi.fitness.watch.face.data.FaceEntranceRespV4;
import com.xiaomi.fitness.watch.face.data.FaceTabAllResp;
import com.xiaomi.fitness.watch.face.export.data.FaceDownloadResultV2;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@BaseUrl(host = "https://watch.iot.mi.com/", path = "ops/v1/")
@Secret(encryptResponse = true, sid = "miothealth")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 #2\u00020\u0001:\u0001#J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2;", "", "getFaceDetail", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/watch/face/request/FaceDetailResultV2;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFaceList", "Lcom/xiaomi/fitness/watch/face/request/FaceListResultV2;", "getPaidFaceList", "Lcom/xiaomi/fitness/watch/face/request/FacePaidListResponse;", "checkFaceUnavailable", "Lcom/xiaomi/fitness/watch/face/request/FaceUnavailableListResponse;", "getDeviceFaceMarketOperation", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketOperation;", "getDeviceFaceMarketIndex", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceIndexList;", "getFaceTabAll", "Lcom/xiaomi/fitness/watch/face/data/FaceTabAllResp;", "requestDownload", "Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2;", "getFaceEntranceV4", "Lcom/xiaomi/fitness/watch/face/data/FaceEntranceRespV4;", "getFaceEntranceV2", "getFaceOperationList", "Lcom/xiaomi/fitness/watch/face/request/FaceOperationListResult;", "getUserActionList", "Lcom/xiaomi/fitness/watch/face/request/FaceUserActionResult;", "checkDesignerWhiteList", "Lcom/xiaomi/fitness/watch/face/data/FaceDesignerCheckWLResult;", "requestFaceCapability", "Lcom/xiaomi/fitness/watch/face/data/FaceDesignerCapabilityResult;", "requestLicense", "Lcom/xiaomi/fitness/watch/face/data/FaceDesignerLicenseResult;", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FaceApiServiceV2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String FACE_HOST_V2 = "https://watch.iot.mi.com/";

    @NotNull
    public static final String FACE_PATH_V2 = "ops/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceApiServiceV2$Companion;", "", "<init>", "()V", "FACE_HOST_V2", "", "FACE_PATH_V2", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String FACE_HOST_V2 = "https://watch.iot.mi.com/";

        @NotNull
        public static final String FACE_PATH_V2 = "ops/v1/";

        private Companion() {
        }
    }

    @Nullable
    @uua("watchface/designer/check_whitelist")
    Object checkDesignerWhiteList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FaceDesignerCheckWLResult>> continuation);

    @Nullable
    @uua("paidwatchface/check")
    Object checkFaceUnavailable(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FaceUnavailableListResponse>> continuation);

    @Nullable
    @uua("paidwatchface/index")
    Object getDeviceFaceMarketIndex(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<DeviceFaceIndexList>> continuation);

    @Nullable
    @uua("paidwatchface/operation")
    Object getDeviceFaceMarketOperation(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<DeviceFaceMarketOperation>> continuation);

    @Nullable
    @uua("paidwatchface/detail")
    Object getFaceDetail(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FaceDetailResultV2>> continuation);

    @Nullable
    @uua("mall/watchface/entrance")
    Object getFaceEntranceV2(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FaceEntranceRespV4>> continuation);

    @Nullable
    @uua("paidwatchface/entrance/v2")
    Object getFaceEntranceV4(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FaceEntranceRespV4>> continuation);

    @Nullable
    @uua("paidwatchface/list")
    Object getFaceList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FaceListResultV2>> continuation);

    @Nullable
    @uua("paidwatchface/operation/list")
    Object getFaceOperationList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FaceOperationListResult>> continuation);

    @Nullable
    @uua("paidwatchface/tab/all")
    Object getFaceTabAll(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FaceTabAllResp>> continuation);

    @Nullable
    @uua("paidwatchface/user/list")
    Object getPaidFaceList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FacePaidListResponse>> continuation);

    @Nullable
    @uua("paidwatchface/user_action/list")
    Object getUserActionList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FaceUserActionResult>> continuation);

    @Nullable
    @uua("paidwatchface/download")
    Object requestDownload(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FaceDownloadResultV2>> continuation);

    @Nullable
    @uua("watchface/device/capability")
    Object requestFaceCapability(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FaceDesignerCapabilityResult>> continuation);

    @Nullable
    @uua("watchface/designer/license")
    Object requestLicense(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FaceDesignerLicenseResult>> continuation);
}
