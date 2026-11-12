package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SwimStyleAdapter;", "", "convertToAppDefine", "", "style", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface SwimStyleAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int SWIM_BACKSTROKE = 3;
    public static final int SWIM_BREASTSTROKE = 1;
    public static final int SWIM_BUTTERFLY = 6;
    public static final int SWIM_FREESTYLE = 2;
    public static final int SWIM_MEDLEY = 4;
    public static final int UNKNOWN = 5;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SwimStyleAdapter$Companion;", "", "()V", "SWIM_BACKSTROKE", "", "SWIM_BREASTSTROKE", "SWIM_BUTTERFLY", "SWIM_FREESTYLE", "SWIM_MEDLEY", DeviceTypes.UNKNOWN, "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int SWIM_BACKSTROKE = 3;
        public static final int SWIM_BREASTSTROKE = 1;
        public static final int SWIM_BUTTERFLY = 6;
        public static final int SWIM_FREESTYLE = 2;
        public static final int SWIM_MEDLEY = 4;
        public static final int UNKNOWN = 5;

        private Companion() {
        }
    }

    int convertToAppDefine(int style);
}
