package com.huami.bluetooth.profile.channel.module.assistant.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\f\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0016\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\b\"\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\b\"\u0016\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\b\"\u0016\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\b\"\u0016\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\b\"\u0016\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\b\"\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"", "TIMEOUT", "J", "", "ASSISTANT_MODULE", LogUtil.I, "", "CMD_QUERY_VERSION", "B", "R_QUERY_VERSION", "CMD_QUERY_DEVICE_SETTING", "R_QUERY_DEVICE_SETTING", "CMD_UPDATE_SETTING", "R_UPDATE_SETTING", "CMD_QUERY_CARD_SETTING", "R_QUERY_CARD_SETTING", "CMD_UPDATE_CARD_SETTING", "R_UPDATE_CARD_SETTING", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class CmdKt {
    public static final int ASSISTANT_MODULE = 9;
    public static final byte CMD_QUERY_CARD_SETTING = 7;
    public static final byte CMD_QUERY_DEVICE_SETTING = 3;
    public static final byte CMD_QUERY_VERSION = 1;
    public static final byte CMD_UPDATE_CARD_SETTING = 9;
    public static final byte CMD_UPDATE_SETTING = 5;
    public static final byte R_QUERY_CARD_SETTING = 8;
    public static final byte R_QUERY_DEVICE_SETTING = 4;
    public static final byte R_QUERY_VERSION = 2;
    public static final byte R_UPDATE_CARD_SETTING = 10;
    public static final byte R_UPDATE_SETTING = 6;
    public static final long TIMEOUT = 3000;
}
