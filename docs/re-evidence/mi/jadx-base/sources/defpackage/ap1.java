package defpackage;

import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.miui.circulate.api.protocol.audio.support.PlayCapacity;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ap1 extends iyc {
    void onBufferStateChange(CirculateDeviceInfo circulateDeviceInfo, int i);

    void onMediaInfoChange(CirculateDeviceInfo circulateDeviceInfo, MediaMetaData mediaMetaData);

    void onMirrorModeChange(CirculateDeviceInfo circulateDeviceInfo, int i);

    void onPlayStateChange(CirculateDeviceInfo circulateDeviceInfo, int i);

    void onPositionChange(CirculateDeviceInfo circulateDeviceInfo, long j);

    void onSourceAudioListUpdate(CirculateDeviceInfo circulateDeviceInfo, List<MediaMetaData> list);

    void onSourceExecuteFail(CirculateDeviceInfo circulateDeviceInfo, String str);

    void onSourceExecuteSuccess(CirculateDeviceInfo circulateDeviceInfo, String str);

    void onSourceLoopTypeUpdate(CirculateDeviceInfo circulateDeviceInfo, int i);

    void onSourcePlayCapacityUpdate(CirculateDeviceInfo circulateDeviceInfo, PlayCapacity playCapacity);

    void onVolumeChange(CirculateDeviceInfo circulateDeviceInfo, int i);
}
