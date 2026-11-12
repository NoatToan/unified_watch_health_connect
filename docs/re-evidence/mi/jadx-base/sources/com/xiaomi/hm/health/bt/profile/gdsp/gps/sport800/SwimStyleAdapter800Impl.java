package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SwimStyleAdapter800Impl;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SwimStyleAdapter;", "()V", "convertToAppDefine", "", "style", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SwimStyleAdapter800Impl implements SwimStyleAdapter {
    private static final int SPORT_SWIM_TYPE_BACKSTROKE = 3;
    private static final int SPORT_SWIM_TYPE_BREASTSTROKE = 1;
    private static final int SPORT_SWIM_TYPE_BUTTERFLY = 4;
    private static final int SPORT_SWIM_TYPE_FREESTYLE = 2;
    private static final int SPORT_SWIM_TYPE_MIXED = 6;
    private static final int SPORT_SWIM_TYPE_UNKNOW = 5;

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SwimStyleAdapter
    public int convertToAppDefine(int style) {
        if (style == 1) {
            return 1;
        }
        if (style == 2) {
            return 2;
        }
        if (style == 3) {
            return 3;
        }
        if (style != 4) {
            return style != 6 ? 5 : 4;
        }
        return 6;
    }
}
