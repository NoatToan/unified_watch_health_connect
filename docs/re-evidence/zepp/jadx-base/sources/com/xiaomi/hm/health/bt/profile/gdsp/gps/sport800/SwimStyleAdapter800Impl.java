package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SwimStyleAdapter800Impl;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/SwimStyleAdapter;", "", "style", "convertToAppDefine", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SwimStyleAdapter800Impl implements SwimStyleAdapter {
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final int d = 4;
    private static final int e = 5;
    private static final int f = 6;

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SwimStyleAdapter
    public int convertToAppDefine(int style) {
        switch (style) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
            default:
                return 5;
            case 6:
                return 4;
        }
    }
}
