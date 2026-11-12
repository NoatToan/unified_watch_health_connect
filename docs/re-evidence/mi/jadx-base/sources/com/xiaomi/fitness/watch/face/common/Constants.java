package com.xiaomi.fitness.watch.face.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/watch/face/common/Constants;", "", "<init>", "()V", "MODEL_HOUYI", "", "HOUYI_VERSION_FORCE", "operationHost", "marketHost", "wearOsOriginFaceList", "", "getWearOsOriginFaceList", "()Ljava/util/List;", "photoFaceClassSubName", "getPhotoFaceClassSubName", "()Ljava/lang/String;", "photoFaceApkList", "getPhotoFaceApkList", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Constants {

    @NotNull
    public static final String HOUYI_VERSION_FORCE = "1.0.168";

    @NotNull
    public static final String MODEL_HOUYI = "midr.watch.ds";

    @NotNull
    public static final String marketHost = "https://watch-appstore.iot.mi.com/";

    @NotNull
    public static final String operationHost = "https://watch.iot.mi.com";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    private static final List<String> wearOsOriginFaceList = CollectionsKt__CollectionsJVMKt.listOf("");

    @NotNull
    private static final String photoFaceClassSubName = "com.xiaomi.wearable.watchface.AlbumWatchFaceService";

    @NotNull
    private static final List<String> photoFaceApkList = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"com.xiaomi.wearable.watchface.AlbumWatchFaceService1", "com.xiaomi.wearable.watchface.AlbumWatchFaceService2", "com.xiaomi.wearable.watchface.AlbumWatchFaceService3"});

    private Constants() {
    }

    @NotNull
    public final List<String> getPhotoFaceApkList() {
        return photoFaceApkList;
    }

    @NotNull
    public final String getPhotoFaceClassSubName() {
        return photoFaceClassSubName;
    }

    @NotNull
    public final List<String> getWearOsOriginFaceList() {
        return wearOsOriginFaceList;
    }
}
