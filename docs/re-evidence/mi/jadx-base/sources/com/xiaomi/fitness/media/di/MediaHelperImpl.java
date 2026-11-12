package com.xiaomi.fitness.media.di;

import android.content.ComponentName;
import android.media.RemoteController;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.media.MediaSyncManager;
import com.xiaomi.fitness.media.export.MediaHelper;
import defpackage.vkf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b2\u0010(J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0014\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u0015J\u001b\u0010!\u001a\u00020\u00112\n\u0010 \u001a\u00060\u001eR\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010\u0015J\u0019\u0010*\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b*\u0010-J\u0017\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/media/di/MediaHelperImpl;", "Lcom/xiaomi/fitness/media/export/MediaHelper;", "", "state", "onAivsControl", "(I)I", "", "raise", "onAivsAdjustVolume", "(Z)I", "volume", "percent", "onAivsSetVolume", "(IZ)I", "mute", "onAivsSetMute", "clearing", "", "onClientChange", "(Z)V", "onClientPlaybackStateUpdate", "(I)V", "", "stateChangeTimeMs", "currentPosMs", "", "speed", "(IJJF)V", "transportControlFlags", "onClientTransportControlUpdate", "Landroid/media/RemoteController$MetadataEditor;", "Landroid/media/RemoteController;", "metadataEditor", "onClientMetadataUpdate", "(Landroid/media/RemoteController$MetadataEditor;)V", "Landroid/content/ComponentName;", "componentName", "registerRemoteController", "(Landroid/content/ComponentName;)V", LifecycleConstantKt.ON_DESTROY, "()V", "controll", "onControl", "Lvkf;", Feature.MEDIA, "(Lvkf;)V", "", "did", "onRequest", "(Ljava/lang/String;)V", "<init>", "media_release"}, k = 1, mv = {2, 0, 0})
public final class MediaHelperImpl implements MediaHelper {
    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public int onAivsAdjustVolume(boolean raise) {
        return MediaSyncManager.INSTANCE.getInstance().onAivsAdjustVolume(raise);
    }

    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public int onAivsControl(int state) {
        return MediaSyncManager.INSTANCE.getInstance().onAivsControl(state);
    }

    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public int onAivsSetMute(boolean mute) {
        return MediaSyncManager.INSTANCE.getInstance().onAivsSetMute(mute);
    }

    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public int onAivsSetVolume(int volume, boolean percent) {
        return MediaSyncManager.INSTANCE.getInstance().onAivsSetVolume(volume, percent);
    }

    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public void onClientChange(boolean clearing) {
        MediaSyncManager.INSTANCE.getInstance().onClientChange(clearing);
    }

    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public void onClientMetadataUpdate(@NotNull RemoteController.MetadataEditor metadataEditor) {
        Intrinsics.checkNotNullParameter(metadataEditor, "metadataEditor");
        MediaSyncManager.INSTANCE.getInstance().onClientMetadataUpdate(metadataEditor);
    }

    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public void onClientPlaybackStateUpdate(int state) {
        MediaSyncManager.INSTANCE.getInstance().onClientPlaybackStateUpdate(state);
    }

    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public void onClientTransportControlUpdate(int transportControlFlags) {
        MediaSyncManager.INSTANCE.getInstance().onClientTransportControlUpdate(transportControlFlags);
    }

    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public void onControl(int controll) {
        MediaSyncManager.INSTANCE.getInstance().onControl(controll);
    }

    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public void onDestroy() {
        Logger.i("MediaSyncManager", LifecycleConstantKt.ON_DESTROY);
        MediaSyncManager.INSTANCE.getInstance().onDestroy();
    }

    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public void onRequest(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        MediaSyncManager.INSTANCE.getInstance().onRequest(did);
    }

    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public void registerRemoteController(@Nullable ComponentName componentName) {
        Logger.i("MediaSyncManager", "registerRemoteController");
        MediaSyncManager.INSTANCE.getInstance().registerRemoteController(componentName);
    }

    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public void onClientPlaybackStateUpdate(int state, long stateChangeTimeMs, long currentPosMs, float speed) {
        MediaSyncManager.INSTANCE.getInstance().onClientPlaybackStateUpdate(state, stateChangeTimeMs, currentPosMs, speed);
    }

    @Override // com.xiaomi.fitness.media.export.MediaHelper
    public void onControl(@Nullable vkf media) {
        Logger.i("MediaSyncManager", "onControl media");
        MediaSyncManager.INSTANCE.getInstance().onControl(media);
    }
}
