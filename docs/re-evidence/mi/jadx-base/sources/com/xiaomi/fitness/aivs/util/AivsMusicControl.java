package com.xiaomi.fitness.aivs.util;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.media.export.MediaHelper;
import com.xiaomi.fitness.media.export.MediaHelperExtKt;
import com.xiaomi.fitness.milink.export.MilinkManager;
import com.xiaomi.fitness.milink.export.MilinkManagerExtKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/aivs/util/AivsMusicControl;", "", "<init>", "()V", "isSupportMilink", "", "()Z", "onAivsControl", "", "state", "onAivsAdjustVolume", "raise", "onAivsSetVolume", "volume", "percent", "onAivsSetMute", "mute", "TAG", "", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AivsMusicControl {

    @NotNull
    public static final AivsMusicControl INSTANCE = new AivsMusicControl();

    @NotNull
    private static final String TAG = "AivsMusicControl";

    private AivsMusicControl() {
    }

    public final boolean isSupportMilink() {
        MilinkManager.Companion companion = MilinkManager.INSTANCE;
        return MilinkManagerExtKt.getInstance(companion).isPhoneSupportMilink() && MilinkManagerExtKt.getInstance(companion).isDeviceSupportMilink();
    }

    public final int onAivsAdjustVolume(boolean raise) {
        return MediaHelperExtKt.getInstance(MediaHelper.INSTANCE).onAivsAdjustVolume(raise);
    }

    public final int onAivsControl(int state) {
        Logger.i(TAG, "onAivsControl: " + state + " isSupportMilink: " + isSupportMilink());
        return isSupportMilink() ? MilinkManagerExtKt.getInstance(MilinkManager.INSTANCE).onAivsControl(state) : MediaHelperExtKt.getInstance(MediaHelper.INSTANCE).onAivsControl(state);
    }

    public final int onAivsSetMute(boolean mute) {
        return MediaHelperExtKt.getInstance(MediaHelper.INSTANCE).onAivsSetMute(mute);
    }

    public final int onAivsSetVolume(int volume, boolean percent) {
        Logger.i(TAG, "onAivsSetVolume: " + volume + " isSupportMilink: " + isSupportMilink());
        return isSupportMilink() ? MilinkManagerExtKt.getInstance(MilinkManager.INSTANCE).onAivsSetVolume(volume) : MediaHelperExtKt.getInstance(MediaHelper.INSTANCE).onAivsSetVolume(volume, percent);
    }
}
