package com.xiaomi.hm.health.bt.classic;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u0005\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\r\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0016\u0010\u0006\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0016\u0010\u0007\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0016\u0010\b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0016\u0010\t\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0016\u0010\n\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0016\u0010\u000b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0016\u0010\f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0016\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0016\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\"\u0016\u0010\u0011\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0016\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f\"\u0016\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f\"\u0016\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f\"\u0016\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f\"\u0016\u0010\u0016\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f\"\u0016\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000f\"\u0016\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000f\"\u0016\u0010\u0019\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"", "TYPE_DIY", "B", "TYPE_POPULAR", "TYPE_DANCE", "TYPE_BLUE", "TYPE_CLASSIC", "TYPE_JAZZ", "TYPE_SLOW", "TYPE_ELECTRONIC", "TYPE_ROCK", "TYPE_COUNTRY", "TYPE_VOICE", "", "FREQUENCY_COUNT", LogUtil.I, "FREQ_1", "FREQ_2", "FREQ_3", "FREQ_4", "FREQ_5", "FREQ_6", "FREQ_7", "FREQ_8", "FREQ_9", "FREQ_10", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class EqEntityKt {
    public static final int FREQUENCY_COUNT = 10;
    public static final int FREQ_1 = 63;
    public static final int FREQ_10 = 16000;
    public static final int FREQ_2 = 100;
    public static final int FREQ_3 = 160;
    public static final int FREQ_4 = 250;
    public static final int FREQ_5 = 500;
    public static final int FREQ_6 = 1000;
    public static final int FREQ_7 = 2000;
    public static final int FREQ_8 = 4000;
    public static final int FREQ_9 = 8000;
    public static final byte TYPE_BLUE = 3;
    public static final byte TYPE_CLASSIC = 4;
    public static final byte TYPE_COUNTRY = 9;
    public static final byte TYPE_DANCE = 2;
    public static final byte TYPE_DIY = 0;
    public static final byte TYPE_ELECTRONIC = 7;
    public static final byte TYPE_JAZZ = 5;
    public static final byte TYPE_POPULAR = 1;
    public static final byte TYPE_ROCK = 8;
    public static final byte TYPE_SLOW = 6;
    public static final byte TYPE_VOICE = 10;
}
