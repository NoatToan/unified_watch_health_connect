package com.xiaomi.hm.health.play.process;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.play.PlayTool;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/play/process/EventReminderProcess;", "Lcom/xiaomi/hm/health/play/process/IPlayToolsProcess;", "Lcom/xiaomi/hm/health/play/PlayTool;", SessionDescription.s, "", "isSupportSchedule", "", "a", "process", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EventReminderProcess implements IPlayToolsProcess {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMDeviceSource hMDeviceSource) {
            super(0);
            this.a = hMDeviceSource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "是不是当前绑定的设备：" + this.a;
        }
    }

    private final void a(PlayTool tool, boolean isSupportSchedule) {
        if (isSupportSchedule) {
            tool.setToolNameRes(Integer.valueOf(R.string.schedule));
            tool.setToolIconRes(Integer.valueOf(R.drawable.play_icon_schedule));
            tool.setSubLongTitleRes(R.string.play_tool_not_schedule);
        } else {
            tool.setToolNameRes(Integer.valueOf(R.string.small_tool_item_reminder));
            tool.setToolIconRes(Integer.valueOf(R.drawable.play_icon_reminder));
            tool.setSubLongTitleRes(R.string.play_tool_not_event_reminder);
        }
    }

    @Override // com.xiaomi.hm.health.play.process.IPlayToolsProcess
    public void process(@NotNull PlayTool tool) {
        if (tool.isDeviceActive()) {
            HMLog.info$default(null, new a(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI)), 1, null);
            a(tool, ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_EVENT_REMIND_NEW_NAME));
            return;
        }
        boolean z = false;
        Iterator<T> it2 = HMDeviceManager.getDeviceListOrdered().iterator();
        while (it2.hasNext()) {
            if (ConfigHelperKt.hasFeature(Feature.SUPPORT_EVENT_REMIND_NEW_NAME, HMDeviceSource.fromValue(((Device) it2.next()).getDevice_source().intValue()))) {
                z = true;
            }
        }
        a(tool, z);
    }
}
