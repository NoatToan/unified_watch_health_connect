package com.huami.bluetooth.profile.channel.module.amc;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerApi;", "", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl;", SessionDescription.n, "", "sendMusicControl", "Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerCallback;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerControllerListener", "unregisterControllerListener", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface MusicControllerApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int VERSION_1 = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerApi$Companion;", "", "", "VERSION_1", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int VERSION_1 = 1;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    void registerControllerListener(@NotNull MusicControllerCallback listener);

    boolean sendMusicControl(@NotNull HMMusicControl control);

    void unregisterControllerListener(@NotNull MusicControllerCallback listener);
}
