package com.xiaomi.fitness.watch.face.request;

import defpackage.djo;
import defpackage.kdq;
import defpackage.o4h;
import defpackage.prk;
import defpackage.uua;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceDownloadService;", "", "", "url", "Lo4h;", "Lprk;", "Lokhttp3/ResponseBody;", "downloadFace", "(Ljava/lang/String;)Lo4h;", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface FaceDownloadService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String DOWNLOAD_HOST = "https://watch.iot.mi.com/";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceDownloadService$Companion;", "", "<init>", "()V", "DOWNLOAD_HOST", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String DOWNLOAD_HOST = "https://watch.iot.mi.com/";

        private Companion() {
        }
    }

    @djo
    @NotNull
    @uua
    o4h<prk<ResponseBody>> downloadFace(@kdq @NotNull String url);
}
