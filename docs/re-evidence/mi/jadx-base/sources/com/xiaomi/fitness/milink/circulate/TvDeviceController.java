package com.xiaomi.fitness.milink.circulate;

import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.milink.util.AudioServiceControllerExtKt;
import com.xiaomi.fitness.milink.util.MilinkHelper;
import defpackage.h4q;
import defpackage.yo1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0002R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/milink/circulate/TvDeviceController;", "Lcom/xiaomi/fitness/milink/circulate/BaseDeviceController;", "deviceInfo", "Lcom/miui/circulate/api/service/CirculateDeviceInfo;", "<init>", "(Lcom/miui/circulate/api/service/CirculateDeviceInfo;)V", "onServiceFound", "", "serviceInfo", "Lcom/miui/circulate/api/service/CirculateServiceInfo;", "onConnect", "onDisconnect", "onPlayStateChange", "state", "", "onMediaInfoChange", "metaData", "Lcom/miui/circulate/api/protocol/audio/support/MediaMetaData;", "updateTvAudioInfo", "isConnect", "", "onSearchConnect", "handleTvControl", "cmd", "connectToTv", "TAG", "", "getTAG", "()Ljava/lang/String;", "Companion", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TvDeviceController extends BaseDeviceController {

    @NotNull
    private static final String WINDOW_TYPE_DEVICE_CENTER = "DeviceCenter";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TvDeviceController(@NotNull CirculateDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
    }

    private final void connectToTv() {
        h4q tvController = MilinkHelper.INSTANCE.getTvController();
        if (tvController != null) {
            tvController.b(getDeviceInfo(), SystemProperties.INSTANCE.isHyperOs() ? "NewSportsHealth" : "OldSportsHealth", new h4q.b() { // from class: com.xiaomi.fitness.milink.circulate.TvDeviceController.connectToTv.1
                @Override // h4q.b
                public void isHighVersionCallback(boolean p0) {
                }

                @Override // h4q.b
                public void onAuthenticationChange(boolean p0) {
                }

                @Override // h4q.b
                public void onFinish(int code) {
                    Logger.i(TvDeviceController.this.getTAG(), "connectToTv, code: " + code);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    private final void updateTvAudioInfo(boolean isConnect) {
        MediaMetaData latestMediaInfo;
        Logger.i(getTAG(), "updateTvAudioInfo cause connect: " + isConnect);
        synchronized (getMLock()) {
            try {
                if (isConnect) {
                    PhoneDeviceController localDeviceController = MilinkHelper.INSTANCE.getLocalDeviceController();
                    if (localDeviceController != null) {
                        latestMediaInfo = localDeviceController.getMediaMetaData();
                    } else {
                        latestMediaInfo = null;
                    }
                } else {
                    yo1 audioServiceController = MilinkHelper.INSTANCE.getAudioServiceController();
                    if (audioServiceController != null) {
                        latestMediaInfo = AudioServiceControllerExtKt.getLatestMediaInfo(audioServiceController, getDeviceInfo());
                    } else {
                        latestMediaInfo = null;
                    }
                }
                setMediaMetaData(latestMediaInfo);
                String tag = getTAG();
                String str = getDeviceInfo().c;
                MediaMetaData mediaMetaData = getMediaMetaData();
                Logger.i(tag, "updateMediaInfo " + str + "'s mediaInfo: " + (mediaMetaData != null ? mediaMetaData.e() : null));
                int latestPlayState = 0;
                if (isConnect) {
                    PhoneDeviceController localDeviceController2 = MilinkHelper.INSTANCE.getLocalDeviceController();
                    if (localDeviceController2 != null) {
                        latestPlayState = localDeviceController2.getPlayState();
                    }
                } else {
                    yo1 audioServiceController2 = MilinkHelper.INSTANCE.getAudioServiceController();
                    if (audioServiceController2 != null) {
                        latestPlayState = AudioServiceControllerExtKt.getLatestPlayState(audioServiceController2, getDeviceInfo());
                    }
                }
                setPlayState(latestPlayState);
                Logger.i(getTAG(), "updateMediaInfo " + getDeviceInfo().c + "'s playState: " + getPlayState());
                MilinkHelper.INSTANCE.updateCirculateDeviceWrapperList(this);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    @NotNull
    public String getTAG() {
        return "MilinkHelper_Tv";
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void handleTvControl(int cmd) {
        super.handleTvControl(cmd);
        switch (cmd) {
            case 0:
                connectToTv();
                break;
            case 1:
                h4q tvController = MilinkHelper.INSTANCE.getTvController();
                if (tvController != null) {
                    tvController.d();
                }
                break;
            case 2:
                h4q tvController2 = MilinkHelper.INSTANCE.getTvController();
                if (tvController2 != null) {
                    tvController2.l(true);
                }
                break;
            case 3:
                h4q tvController3 = MilinkHelper.INSTANCE.getTvController();
                if (tvController3 != null) {
                    tvController3.e(true);
                }
                break;
            case 4:
                h4q tvController4 = MilinkHelper.INSTANCE.getTvController();
                if (tvController4 != null) {
                    tvController4.g(true);
                }
                break;
            case 5:
                h4q tvController5 = MilinkHelper.INSTANCE.getTvController();
                if (tvController5 != null) {
                    tvController5.k(true);
                }
                break;
            case 6:
                h4q tvController6 = MilinkHelper.INSTANCE.getTvController();
                if (tvController6 != null) {
                    tvController6.f();
                }
                break;
            case 7:
                h4q tvController7 = MilinkHelper.INSTANCE.getTvController();
                if (tvController7 != null) {
                    tvController7.h();
                }
                break;
            case 8:
                h4q tvController8 = MilinkHelper.INSTANCE.getTvController();
                if (tvController8 != null) {
                    tvController8.a();
                }
                break;
            case 9:
                h4q tvController9 = MilinkHelper.INSTANCE.getTvController();
                if (tvController9 != null) {
                    tvController9.n(true);
                }
                break;
            case 10:
                h4q tvController10 = MilinkHelper.INSTANCE.getTvController();
                if (tvController10 != null) {
                    tvController10.m(true);
                }
                break;
            case 11:
                h4q tvController11 = MilinkHelper.INSTANCE.getTvController();
                if (tvController11 != null) {
                    tvController11.j();
                }
                break;
            case 12:
                h4q tvController12 = MilinkHelper.INSTANCE.getTvController();
                if (tvController12 != null) {
                    tvController12.i();
                }
                break;
        }
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void onConnect(@Nullable CirculateServiceInfo serviceInfo) {
        super.onConnect(serviceInfo);
        Logger.i(getTAG(), "onConnect");
        setSpeaker(true);
        updateTvAudioInfo(true);
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void onDisconnect() {
        super.onDisconnect();
        Logger.i(getTAG(), "onDisconnect");
        setSpeaker(false);
        updateTvAudioInfo(false);
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void onMediaInfoChange(@Nullable MediaMetaData metaData) {
        super.onMediaInfoChange(metaData);
        synchronized (getMLock()) {
            try {
                setMediaMetaData(metaData);
                String tag = getTAG();
                String str = getDeviceInfo().c;
                MediaMetaData mediaMetaData = getMediaMetaData();
                Logger.i(tag, "updateMediaInfo " + str + "'s mediaMetaData: " + (mediaMetaData != null ? mediaMetaData.e() : null));
                MilinkHelper.INSTANCE.updateCirculateDeviceWrapperList(this);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void onPlayStateChange(int state) {
        super.onPlayStateChange(state);
        synchronized (getMLock()) {
            setPlayState(state);
            Logger.i(getTAG(), "updateMediaInfo " + getDeviceInfo().c + "'s playState: " + getPlayState());
            MilinkHelper.INSTANCE.updateCirculateDeviceWrapperList(this);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public boolean onSearchConnect() {
        for (CirculateServiceInfo circulateServiceInfo : getDeviceInfo().i) {
            if (circulateServiceInfo.c == 65536 && circulateServiceInfo.e()) {
                BaseDeviceController.onConnect$default(this, null, 1, null);
                return true;
            }
        }
        return super.onSearchConnect();
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void onServiceFound(@NotNull CirculateServiceInfo serviceInfo) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        super.onServiceFound(serviceInfo);
        Logger.i(getTAG(), "onServiceFound");
        if (serviceInfo.c == 65536) {
            if (serviceInfo.d != 2) {
                synchronized (getMLock()) {
                    MilinkHelper.INSTANCE.updateCirculateDeviceWrapperList(this);
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            Logger.i(getTAG(), "onServiceFound tv connect yet: " + getDeviceInfo().c);
            setSpeaker(true);
            updateTvAudioInfo(true);
            String id = getDeviceInfo().f10301a;
            Intrinsics.checkNotNullExpressionValue(id, "id");
            updateOutputId(id);
        }
    }
}
