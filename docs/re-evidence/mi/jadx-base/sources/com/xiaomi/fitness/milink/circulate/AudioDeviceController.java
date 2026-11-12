package com.xiaomi.fitness.milink.circulate;

import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.milink.bean.ExtraAudioData;
import com.xiaomi.fitness.milink.util.AudioServiceControllerExtKt;
import com.xiaomi.fitness.milink.util.MilinkHelper;
import defpackage.yo1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u001e\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/milink/circulate/AudioDeviceController;", "Lcom/xiaomi/fitness/milink/circulate/BaseDeviceController;", "deviceInfo", "Lcom/miui/circulate/api/service/CirculateDeviceInfo;", "<init>", "(Lcom/miui/circulate/api/service/CirculateDeviceInfo;)V", "changeMediaEventTime", "", "getChangeMediaEventTime", "()J", "setChangeMediaEventTime", "(J)V", "onConnect", "", "serviceInfo", "Lcom/miui/circulate/api/service/CirculateServiceInfo;", "onDisconnect", "updateAllInfo", "isCirculate", "", "updateMediaInfo", "updateLatestPosition", "getVolume", "", "onMediaInfoChange", "metaData", "Lcom/miui/circulate/api/protocol/audio/support/MediaMetaData;", "onVolumeChange", "volume", "onPositionChange", "position", "TAG", "", "getTAG", "()Ljava/lang/String;", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class AudioDeviceController extends BaseDeviceController {
    private long changeMediaEventTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioDeviceController(@NotNull CirculateDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
    }

    public static /* synthetic */ void updateAllInfo$default(AudioDeviceController audioDeviceController, CirculateServiceInfo circulateServiceInfo, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAllInfo");
        }
        if ((i & 1) != 0) {
            circulateServiceInfo = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        audioDeviceController.updateAllInfo(circulateServiceInfo, z);
    }

    private final void updateMediaInfo(boolean isCirculate) {
        MediaMetaData latestMediaInfo;
        int latestPlayState;
        MediaController currentMediaController;
        PlaybackState playbackState;
        synchronized (getMLock()) {
            try {
                if (isCirculate) {
                    PhoneDeviceController localDeviceController = MilinkHelper.INSTANCE.getLocalDeviceController();
                    latestMediaInfo = localDeviceController != null ? localDeviceController.getMediaMetaData() : null;
                } else {
                    latestMediaInfo = AudioServiceControllerExtKt.getLatestMediaInfo(MilinkHelper.INSTANCE.getAudioServiceController(), getDeviceInfo());
                }
                setMediaMetaData(latestMediaInfo);
                String tag = getTAG();
                String str = getDeviceInfo().c;
                MediaMetaData mediaMetaData = getMediaMetaData();
                Logger.i(tag, "updateMediaInfo " + str + "'s mediaInfo: " + (mediaMetaData != null ? mediaMetaData.e() : null));
                if (isCirculate) {
                    PhoneDeviceController localDeviceController2 = MilinkHelper.INSTANCE.getLocalDeviceController();
                    latestPlayState = localDeviceController2 != null ? localDeviceController2.getPlayState() : 0;
                } else {
                    latestPlayState = AudioServiceControllerExtKt.getLatestPlayState(MilinkHelper.INSTANCE.getAudioServiceController(), getDeviceInfo());
                }
                setPlayState(latestPlayState);
                Logger.i(getTAG(), "updateMediaInfo " + getDeviceInfo().c + "'s playState: " + getPlayState());
                if (getExtraAudioData() == null) {
                    setExtraAudioData(new ExtraAudioData(0, 0L, 3, null));
                }
                int volume = getVolume();
                ExtraAudioData extraAudioData = getExtraAudioData();
                if (extraAudioData != null) {
                    extraAudioData.setVolume(volume);
                }
                Logger.i(getTAG(), "updateMediaInfo " + getDeviceInfo().c + "'s volume: " + volume);
                if (isCirculate) {
                    ExtraAudioData extraAudioData2 = getExtraAudioData();
                    if (extraAudioData2 != null) {
                        PhoneDeviceController localDeviceController3 = MilinkHelper.INSTANCE.getLocalDeviceController();
                        extraAudioData2.setPosition((localDeviceController3 == null || (currentMediaController = localDeviceController3.getCurrentMediaController()) == null || (playbackState = currentMediaController.getPlaybackState()) == null) ? 0L : playbackState.getPosition());
                    }
                    MilinkHelper.INSTANCE.updateCirculateDeviceWrapperList(this);
                    Unit unit = Unit.INSTANCE;
                } else {
                    MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                    milinkHelper.updateCirculateDeviceWrapperList(this);
                    yo1 audioServiceController = milinkHelper.getAudioServiceController();
                    if (audioServiceController != null) {
                        AudioServiceControllerExtKt.getLatestPosition(audioServiceController, getDeviceInfo());
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long getChangeMediaEventTime() {
        return this.changeMediaEventTime;
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    @NotNull
    public String getTAG() {
        return "MilinkHelper_Audio";
    }

    public int getVolume() {
        return 0;
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void onConnect(@Nullable CirculateServiceInfo serviceInfo) {
        super.onConnect(serviceInfo);
        Logger.i(getTAG(), "onConnect");
        updateAllInfo(null, true);
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void onDisconnect() {
        super.onDisconnect();
        Logger.i(getTAG(), "onDisconnect");
        updateAllInfo$default(this, null, false, 3, null);
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void onMediaInfoChange(@Nullable MediaMetaData metaData) {
        synchronized (getMLock()) {
            setMediaMetaData(metaData);
            AudioServiceControllerExtKt.getLatestPosition(MilinkHelper.INSTANCE.getAudioServiceController(), getDeviceInfo());
            Unit unit = Unit.INSTANCE;
        }
    }

    public void onPositionChange(long position) {
        synchronized (getMLock()) {
            try {
                if (getExtraAudioData() == null) {
                    setExtraAudioData(new ExtraAudioData(0, 0L, 3, null));
                }
                ExtraAudioData extraAudioData = getExtraAudioData();
                if (extraAudioData != null) {
                    extraAudioData.setPosition(position);
                }
                MilinkHelper.INSTANCE.updateCirculateDeviceWrapperList(this);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onVolumeChange(int volume) {
    }

    public final void setChangeMediaEventTime(long j) {
        this.changeMediaEventTime = j;
    }

    public void updateAllInfo(@Nullable CirculateServiceInfo serviceInfo, boolean isCirculate) {
        boolean z;
        if (serviceInfo == null) {
            setSpeaker(isCirculate);
            updateMediaInfo(isCirculate);
            return;
        }
        if (serviceInfo.c == 65536) {
            if (serviceInfo.d == 2) {
                Logger.i(getTAG(), "updateAudioDevice device connect yet: " + getDeviceInfo().c);
                z = true;
            } else {
                z = false;
            }
            setSpeaker(z);
            updateMediaInfo(z);
            if (z) {
                String id = getDeviceInfo().f10301a;
                Intrinsics.checkNotNullExpressionValue(id, "id");
                updateOutputId(id);
            }
        }
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void updateLatestPosition(boolean isCirculate) {
        MediaController currentMediaController;
        PlaybackState playbackState;
        super.updateLatestPosition(isCirculate);
        if (!isCirculate) {
            yo1 audioServiceController = MilinkHelper.INSTANCE.getAudioServiceController();
            if (audioServiceController != null) {
                AudioServiceControllerExtKt.getLatestPosition(audioServiceController, getDeviceInfo());
                return;
            }
            return;
        }
        synchronized (getMLock()) {
            try {
                if (getExtraAudioData() == null) {
                    setExtraAudioData(new ExtraAudioData(0, 0L, 3, null));
                }
                ExtraAudioData extraAudioData = getExtraAudioData();
                if (extraAudioData != null) {
                    PhoneDeviceController localDeviceController = MilinkHelper.INSTANCE.getLocalDeviceController();
                    extraAudioData.setPosition((localDeviceController == null || (currentMediaController = localDeviceController.getCurrentMediaController()) == null || (playbackState = currentMediaController.getPlaybackState()) == null) ? 0L : playbackState.getPosition());
                }
                MilinkHelper.INSTANCE.updateCirculateDeviceWrapperList(this);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
