package com.huami.device.feature.notification.module;

import android.media.RemoteController;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J(\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0018\u00010\u0010R\u00020\u0011H&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¨\u0006\u0017"}, d2 = {"Lcom/huami/device/feature/notification/module/IMusicRemoteControl;", "Lcom/huami/device/feature/notification/module/INotificationListener;", "", "clearing", "", "onClientChange", "", "state", "onClientPlaybackStateUpdate", "", "stateChangeTimeMs", "currentPosMs", "", "speed", "transportControlFlags", "onClientTransportControlUpdate", "Landroid/media/RemoteController$MetadataEditor;", "Landroid/media/RemoteController;", "metadataEditor", "onClientMetadataUpdate", "", "command", "onMusicControlReceived", "notification_release"}, k = 1, mv = {1, 5, 1})
public interface IMusicRemoteControl extends INotificationListener {
    void onClientChange(boolean clearing);

    void onClientMetadataUpdate(@Nullable RemoteController.MetadataEditor metadataEditor);

    void onClientPlaybackStateUpdate(int state);

    void onClientPlaybackStateUpdate(int state, long stateChangeTimeMs, long currentPosMs, float speed);

    void onClientTransportControlUpdate(int transportControlFlags);

    void onMusicControlReceived(byte command);
}
