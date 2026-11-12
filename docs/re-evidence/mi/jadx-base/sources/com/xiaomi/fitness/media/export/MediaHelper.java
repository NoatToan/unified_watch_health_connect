package com.xiaomi.fitness.media.export;

import android.content.ComponentName;
import android.media.RemoteController;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import defpackage.vkf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 22\u00020\u0001:\u00012J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u0014\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u0015J\u001b\u0010!\u001a\u00020\u00112\n\u0010 \u001a\u00060\u001eR\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#H&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0011H&¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0002H&¢\u0006\u0004\b*\u0010\u0015J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b-\u0010.J\u0019\u0010*\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010/H&¢\u0006\u0004\b*\u00101¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/media/export/MediaHelper;", "", "", "state", "onAivsControl", "(I)I", "", "raise", "onAivsAdjustVolume", "(Z)I", "volume", "percent", "onAivsSetVolume", "(IZ)I", "mute", "onAivsSetMute", "clearing", "", "onClientChange", "(Z)V", "onClientPlaybackStateUpdate", "(I)V", "", "stateChangeTimeMs", "currentPosMs", "", "speed", "(IJJF)V", "transportControlFlags", "onClientTransportControlUpdate", "Landroid/media/RemoteController$MetadataEditor;", "Landroid/media/RemoteController;", "metadataEditor", "onClientMetadataUpdate", "(Landroid/media/RemoteController$MetadataEditor;)V", "Landroid/content/ComponentName;", "componentName", "registerRemoteController", "(Landroid/content/ComponentName;)V", LifecycleConstantKt.ON_DESTROY, "()V", "controll", "onControl", "", "did", "onRequest", "(Ljava/lang/String;)V", "Lvkf;", Feature.MEDIA, "(Lvkf;)V", "Companion", "media-export_release"}, k = 1, mv = {2, 0, 0})
public interface MediaHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/media/export/MediaHelper$Companion;", "", "<init>", "()V", "media-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    int onAivsAdjustVolume(boolean raise);

    int onAivsControl(int state);

    int onAivsSetMute(boolean mute);

    int onAivsSetVolume(int volume, boolean percent);

    void onClientChange(boolean clearing);

    void onClientMetadataUpdate(@NotNull RemoteController.MetadataEditor metadataEditor);

    void onClientPlaybackStateUpdate(int state);

    void onClientPlaybackStateUpdate(int state, long stateChangeTimeMs, long currentPosMs, float speed);

    void onClientTransportControlUpdate(int transportControlFlags);

    void onControl(int controll);

    void onControl(@Nullable vkf media);

    void onDestroy();

    void onRequest(@NotNull String did);

    void registerRemoteController(@Nullable ComponentName componentName);
}
