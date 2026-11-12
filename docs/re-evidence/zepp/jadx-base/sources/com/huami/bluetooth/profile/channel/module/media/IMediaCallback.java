package com.huami.bluetooth.profile.channel.module.media;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/IMediaCallback;", "", "Lcom/huami/bluetooth/profile/channel/module/media/RequestImage;", "image", "", "onRequestImage", "Lcom/huami/bluetooth/profile/channel/module/media/RequestAudio;", "audio", "onRequestAudio", "Lcom/huami/bluetooth/profile/channel/module/media/AudioControl;", SessionDescription.n, "onAudioControl", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IMediaCallback {
    void onAudioControl(@NotNull AudioControl control);

    void onRequestAudio(@NotNull RequestAudio audio);

    void onRequestImage(@NotNull RequestImage image);
}
