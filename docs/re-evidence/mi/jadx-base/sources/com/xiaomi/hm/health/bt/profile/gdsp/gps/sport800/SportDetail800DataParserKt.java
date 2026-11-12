package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u001a\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"PARAM_AUTO_SEGMENT", "", "PARAM_FUSE", "PARAM_INTERVAL_SEGMENT", "PARAM_MANUAL_SEGMENT", "PARAM_ROPE_SKIPPING_SEGMENT", "PARAM_SKIING_SEGMENT", "PARAM_TRAIN", "SPORT_PRO_TYPE_AUTO_LAP", "SPORT_PRO_TYPE_FUSE", "SPORT_PRO_TYPE_GROUP", "SPORT_PRO_TYPE_HAND_LAP", "SPORT_PRO_TYPE_TRAIN", "lapTypeAdapt", "typeFromDevice", DailyRecordKey.sportType, "bluetooth_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SportDetail800DataParserKt {
    private static final int PARAM_AUTO_SEGMENT = 1;
    private static final int PARAM_FUSE = 5;
    private static final int PARAM_INTERVAL_SEGMENT = 2;
    private static final int PARAM_MANUAL_SEGMENT = 0;
    private static final int PARAM_ROPE_SKIPPING_SEGMENT = 4;
    private static final int PARAM_SKIING_SEGMENT = 3;
    private static final int PARAM_TRAIN = 6;
    private static final int SPORT_PRO_TYPE_AUTO_LAP = 1;
    private static final int SPORT_PRO_TYPE_FUSE = 3;
    private static final int SPORT_PRO_TYPE_GROUP = 2;
    private static final int SPORT_PRO_TYPE_HAND_LAP = 0;
    private static final int SPORT_PRO_TYPE_TRAIN = 4;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int lapTypeAdapt(int i, int i2) {
        if (i == 2) {
            return i2 == SportType.SPORT_TYPE_JUMP_ROPE.getTypeValue() ? 4 : 0;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i;
        }
        return 6;
    }
}
