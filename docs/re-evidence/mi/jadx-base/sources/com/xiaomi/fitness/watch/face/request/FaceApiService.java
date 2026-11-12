package com.xiaomi.fitness.watch.face.request;

import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.watch.face.data.FaceIconZipRes;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@BaseUrl(host = "https://watch-appstore.iot.mi.com/", path = "api/watchface/")
@Secret(encryptResponse = false, sid = "miothealth")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J<\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceApiService;", "", "getFaceDetail", "Lcom/xiaomi/fitness/watch/face/request/FaceResult;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "model", "", "id", "model_version", "ids", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFaceDataIcon", "Lcom/xiaomi/fitness/watch/face/data/FaceIconZipRes$DataBean;", "version", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FaceApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String FACE_HOST = "https://watch-appstore.iot.mi.com/";

    @NotNull
    public static final String FACE_PATH = "api/watchface/";

    @NotNull
    public static final String HEALTH_SID = "miothealth";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceApiService$Companion;", "", "<init>", "()V", "FACE_HOST", "", "FACE_PATH", "HEALTH_SID", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String FACE_HOST = "https://watch-appstore.iot.mi.com/";

        @NotNull
        public static final String FACE_PATH = "api/watchface/";

        @NotNull
        public static final String HEALTH_SID = "miothealth";

        private Companion() {
        }
    }

    @Nullable
    @uua("prize/function_icon_config")
    Object getFaceDataIcon(@NotNull @xfi("model") String str, @xfi("version") int i, @NotNull Continuation<? super FaceResult<FaceIconZipRes.DataBean>> continuation);

    @Nullable
    @uua("prize/detail")
    Object getFaceDetail(@NotNull @xfi("model") String str, @NotNull @xfi("id") String str2, @NotNull @xfi("firmware_version") String str3, @NotNull @xfi("owned_ids") String str4, @NotNull Continuation<? super FaceResult<FaceData>> continuation);
}
