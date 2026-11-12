package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u001c\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0007\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004\"\u0016\u0010\t\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004\"\u0016\u0010\u000b\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004\"\u0016\u0010\r\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004\"\u0016\u0010\u000f\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004\"\u0016\u0010\u0011\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004\"\u0016\u0010\u0013\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004\"\u0016\u0010\u0015\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004\"\u0016\u0010\u0017\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004\"\u0016\u0010\u0019\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004\"\u0016\u0010\u001b\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004¨\u0006\u001c"}, d2 = {"", "typeFromDevice", "sportType", "a", LogUtil.I, "SPORT_PRO_TYPE_HAND_LAP", "b", "SPORT_PRO_TYPE_AUTO_LAP", "c", "SPORT_PRO_TYPE_GROUP", GoogleApiAvailabilityLight.a, "SPORT_PRO_TYPE_FUSE", "e", "SPORT_PRO_TYPE_TRAIN", "f", "PARAM_MANUAL_SEGMENT", "g", "PARAM_AUTO_SEGMENT", "h", "PARAM_INTERVAL_SEGMENT", "i", "PARAM_SKIING_SEGMENT", z.j, "PARAM_ROPE_SKIPPING_SEGMENT", hl.k, "PARAM_FUSE", "l", "PARAM_TRAIN", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class SportDetail800DataParserKt {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;
    private static final int j = 4;
    private static final int k = 5;
    private static final int l = 6;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(int i2, int i3) {
        if (i2 == 2) {
            return i3 == SportType.SPORT_TYPE_JUMP_ROPE.getTypeValue() ? 4 : 0;
        }
        if (i2 == 3) {
            return 5;
        }
        if (i2 != 4) {
            return i2;
        }
        return 6;
    }
}
