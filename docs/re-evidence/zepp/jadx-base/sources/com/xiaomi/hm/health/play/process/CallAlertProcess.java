package com.xiaomi.hm.health.play.process;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.play.PlayTool;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/play/process/CallAlertProcess;", "Lcom/xiaomi/hm/health/play/process/IPlayToolsProcess;", "Lcom/xiaomi/hm/health/play/PlayTool;", SessionDescription.s, "", "process", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CallAlertProcess implements IPlayToolsProcess {
    @Override // com.xiaomi.hm.health.play.process.IPlayToolsProcess
    public void process(@NotNull PlayTool tool) {
        tool.setToolNameRes(HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(20) ? Integer.valueOf(R.string.app_sort_phone) : Integer.valueOf(R.string.incoming_call_alert));
    }
}
