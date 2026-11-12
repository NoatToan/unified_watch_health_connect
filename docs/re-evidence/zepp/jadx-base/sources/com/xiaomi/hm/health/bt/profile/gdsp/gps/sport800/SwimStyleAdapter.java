package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SwimStyleAdapter;", "", "", "style", "convertToAppDefine", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface SwimStyleAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int SWIM_BACKSTROKE = 3;
    public static final int SWIM_BREASTSTROKE = 1;
    public static final int SWIM_BUTTERFLY = 6;
    public static final int SWIM_FREESTYLE = 2;
    public static final int SWIM_MEDLEY = 4;
    public static final int UNKNOWN = 5;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SwimStyleAdapter$Companion;", "", "", "SWIM_BREASTSTROKE", LogUtil.I, "SWIM_FREESTYLE", "SWIM_BACKSTROKE", "SWIM_MEDLEY", "UNKNOWN", "SWIM_BUTTERFLY", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int SWIM_BACKSTROKE = 3;
        public static final int SWIM_BREASTSTROKE = 1;
        public static final int SWIM_BUTTERFLY = 6;
        public static final int SWIM_FREESTYLE = 2;
        public static final int SWIM_MEDLEY = 4;
        public static final int UNKNOWN = 5;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    int convertToAppDefine(int style);
}
