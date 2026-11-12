package com.xiaomi.hm.health.bt.profile.sport;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000e\u001a\u00020\u0006H&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/ISportSupplementPanelApi;", "", "Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;", "sportConfig", "Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initPanel", "Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;", "command", "Lcom/xiaomi/hm/health/bt/profile/sport/SportInfo;", "sportInfo", SessionDescription.n, "controlWithoutHeartbeat", "release", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface ISportSupplementPanelApi {
    void control(@NotNull SportCommand command, @Nullable SportInfo sportInfo);

    void controlWithoutHeartbeat(@NotNull SportCommand command, @Nullable SportInfo sportInfo);

    void initPanel(@NotNull SportConfig sportConfig, @NotNull IHMSportListener listener);

    void release();
}
