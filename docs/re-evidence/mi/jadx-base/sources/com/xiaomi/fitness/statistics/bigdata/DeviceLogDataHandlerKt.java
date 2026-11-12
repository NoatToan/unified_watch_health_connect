package com.xiaomi.fitness.statistics.bigdata;

import com.mibi.sdk.common.CommonConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"TYPE_VOICE", "", "VERSION_0", "", "CMD_LOG", "CMD_ONETRACK", "CMD_LOG_STR", "", "CMD_ONETRACK_STR", "TAG", "HEAD_LENGTH", "DATA_START_INDEX", "SUCCESS", "NO_DATA", "BUSY", CommonConstants.Mgc.STATUS_FAIL, "statistics_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceLogDataHandlerKt {
    private static final int BUSY = 2;
    private static final int CMD_LOG = 129;

    @NotNull
    private static final String CMD_LOG_STR = "devicelog";
    private static final int CMD_ONETRACK = 130;

    @NotNull
    private static final String CMD_ONETRACK_STR = "onetrack";
    private static final int DATA_START_INDEX = 6;
    private static final int FAIL = 10;
    private static final int HEAD_LENGTH = 5;
    private static final int NO_DATA = 1;
    private static final int SUCCESS = 0;

    @NotNull
    private static final String TAG = "DeviceLogDataHandler";
    public static final int TYPE_VOICE = 103;
    private static final byte VERSION_0 = 0;
}
