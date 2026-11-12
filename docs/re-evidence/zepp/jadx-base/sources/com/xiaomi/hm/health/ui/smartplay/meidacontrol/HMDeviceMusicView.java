package com.xiaomi.hm.health.ui.smartplay.meidacontrol;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.musiccontrol.bean.VolumeInfo;
import com.huami.musiccontrol.musicview.IDeviceMusicView;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/meidacontrol/HMDeviceMusicView;", "Lcom/huami/musiccontrol/musicview/IDeviceMusicView;", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;", "command", "", "handleCommand", "Lcom/huami/musiccontrol/musicview/IDeviceMusicView$IDeviceMusicViewListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setViewListener", "Lcom/huami/musiccontrol/bean/MusicInfo;", WebConstant.QueryParam.TYPE_MUSIC, "", "showMusic", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "playInfo", "showMusicAndState", "showNoPermission", "showPlayState", "Lcom/huami/musiccontrol/bean/VolumeInfo;", "volume", "showVolume", "supportMusicControl", "a", "Lcom/huami/musiccontrol/musicview/IDeviceMusicView$IDeviceMusicViewListener;", "viewListener", "Lcom/xiaomi/hm/health/ui/smartplay/meidacontrol/HMDeviceMusicViewModel;", "b", "Lcom/xiaomi/hm/health/ui/smartplay/meidacontrol/HMDeviceMusicViewModel;", "viewModel", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HMDeviceMusicView implements IDeviceMusicView {

    @NotNull
    private static final String c = "HMDeviceMusicView";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private IDeviceMusicView.IDeviceMusicViewListener viewListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceMusicViewModel viewModel = new HMDeviceMusicViewModel();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMMusicControl.DeviceCommand.values().length];
            iArr[HMMusicControl.DeviceCommand.START.ordinal()] = 1;
            iArr[HMMusicControl.DeviceCommand.STOP.ordinal()] = 2;
            iArr[HMMusicControl.DeviceCommand.NEXT.ordinal()] = 3;
            iArr[HMMusicControl.DeviceCommand.PREV.ordinal()] = 4;
            iArr[HMMusicControl.DeviceCommand.PLAY.ordinal()] = 5;
            iArr[HMMusicControl.DeviceCommand.PAUSE.ordinal()] = 6;
            iArr[HMMusicControl.DeviceCommand.VOL_UP.ordinal()] = 7;
            iArr[HMMusicControl.DeviceCommand.VOL_DOWN.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMMusicControl.DeviceCommand a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMMusicControl.DeviceCommand deviceCommand) {
            super(0);
            this.a = deviceCommand;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handle command: " + ((int) this.a.getValue());
        }
    }

    public final void handleCommand(@NotNull HMMusicControl.DeviceCommand command) {
        HMLog.info(c, new a(command));
        switch (WhenMappings.$EnumSwitchMapping$0[command.ordinal()]) {
            case 1:
                IDeviceMusicView.IDeviceMusicViewListener iDeviceMusicViewListener = this.viewListener;
                if (iDeviceMusicViewListener != null) {
                    iDeviceMusicViewListener.onEnterControlView();
                    break;
                }
                break;
            case 2:
                IDeviceMusicView.IDeviceMusicViewListener iDeviceMusicViewListener2 = this.viewListener;
                if (iDeviceMusicViewListener2 != null) {
                    iDeviceMusicViewListener2.onExitControlView();
                    break;
                }
                break;
            case 3:
                IDeviceMusicView.IDeviceMusicViewListener iDeviceMusicViewListener3 = this.viewListener;
                if (iDeviceMusicViewListener3 != null) {
                    iDeviceMusicViewListener3.onNextClick();
                    break;
                }
                break;
            case 4:
                IDeviceMusicView.IDeviceMusicViewListener iDeviceMusicViewListener4 = this.viewListener;
                if (iDeviceMusicViewListener4 != null) {
                    iDeviceMusicViewListener4.onPreClick();
                    break;
                }
                break;
            case 5:
                IDeviceMusicView.IDeviceMusicViewListener iDeviceMusicViewListener5 = this.viewListener;
                if (iDeviceMusicViewListener5 != null) {
                    iDeviceMusicViewListener5.onPlayClick();
                    break;
                }
                break;
            case 6:
                IDeviceMusicView.IDeviceMusicViewListener iDeviceMusicViewListener6 = this.viewListener;
                if (iDeviceMusicViewListener6 != null) {
                    iDeviceMusicViewListener6.onPauseClick();
                    break;
                }
                break;
            case 7:
                IDeviceMusicView.IDeviceMusicViewListener iDeviceMusicViewListener7 = this.viewListener;
                if (iDeviceMusicViewListener7 != null) {
                    iDeviceMusicViewListener7.onVolumeUpClick();
                    break;
                }
                break;
            case 8:
                IDeviceMusicView.IDeviceMusicViewListener iDeviceMusicViewListener8 = this.viewListener;
                if (iDeviceMusicViewListener8 != null) {
                    iDeviceMusicViewListener8.onVolumeDownClick();
                    break;
                }
                break;
        }
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    public void setViewListener(@NotNull IDeviceMusicView.IDeviceMusicViewListener listener) {
        this.viewListener = listener;
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    public boolean showMusic(@NotNull MusicInfo music) {
        this.viewModel.showMusic(music);
        return true;
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    public boolean showMusicAndState(@NotNull MusicInfo music, @NotNull MusicPlayInfo playInfo) {
        this.viewModel.showMusicAndState(music, playInfo);
        return true;
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    public boolean showNoPermission() {
        this.viewModel.showNoPermission();
        return true;
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    public boolean showPlayState(@NotNull MusicPlayInfo playInfo) {
        this.viewModel.showPlayState(playInfo);
        return true;
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    public boolean showVolume(@NotNull VolumeInfo volume) {
        this.viewModel.showVolume(volume);
        return true;
    }

    @Override // com.huami.musiccontrol.musicview.IDeviceMusicView
    public boolean supportMusicControl() {
        return this.viewModel.supportMusicControl();
    }
}
