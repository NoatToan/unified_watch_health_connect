package com.huami.musiccontrol.controller;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.musiccontrol.bean.VolumeInfo;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\rJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H&J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH&¨\u0006\u000e"}, d2 = {"Lcom/huami/musiccontrol/controller/IVolumeController;", "", "", PointCategory.INIT, "deInit", "volumeUp", "volumeDown", "Lcom/huami/musiccontrol/bean/VolumeInfo;", "getCurrentVolume", "Lcom/huami/musiccontrol/controller/IVolumeController$IVolumeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setVolumeListener", "IVolumeListener", "music_control_release"}, k = 1, mv = {1, 4, 1})
public interface IVolumeController {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/musiccontrol/controller/IVolumeController$IVolumeListener;", "", "Lcom/huami/musiccontrol/bean/VolumeInfo;", "volumeInfo", "", "onVolumeChanged", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public interface IVolumeListener {
        void onVolumeChanged(@NotNull VolumeInfo volumeInfo);
    }

    boolean deInit();

    @NotNull
    VolumeInfo getCurrentVolume();

    boolean init();

    void setVolumeListener(@Nullable IVolumeListener listener);

    boolean volumeDown();

    boolean volumeUp();
}
