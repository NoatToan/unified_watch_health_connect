package com.xiaomi.fitness.watch.face.di;

import com.xiaomi.fitness.device.contact.export.DeviceSyncer;
import com.xiaomi.fitness.watch.face.base.FaceCommonInterceptor;
import com.xiaomi.fitness.watch.face.export.FaceSyncer;
import com.xiaomi.fitness.watch.face.export.FaceSyncerImpl;
import kotlin.Metadata;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/di/FaceSyncModule;", "", "<init>", "()V", "bindDeviceSyncer", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncer;", "syncListener", "Lcom/xiaomi/fitness/watch/face/export/FaceSyncerImpl;", "bindSyncer", "Lcom/xiaomi/fitness/watch/face/export/FaceSyncer;", "syncer", "bindCloudInterceptor", "Lokhttp3/Interceptor;", "interceptor", "Lcom/xiaomi/fitness/watch/face/base/FaceCommonInterceptor;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FaceSyncModule {
    @NotNull
    public abstract Interceptor bindCloudInterceptor(@NotNull FaceCommonInterceptor interceptor);

    @NotNull
    public abstract DeviceSyncer bindDeviceSyncer(@NotNull FaceSyncerImpl syncListener);

    @NotNull
    public abstract FaceSyncer bindSyncer(@NotNull FaceSyncerImpl syncer);
}
