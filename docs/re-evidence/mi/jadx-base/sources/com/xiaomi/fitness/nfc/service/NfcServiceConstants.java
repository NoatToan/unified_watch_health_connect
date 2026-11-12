package com.xiaomi.fitness.nfc.service;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0015X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0015X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u0015X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/nfc/service/NfcServiceConstants;", "", "<init>", "()V", "sSuccessCode", "", "getSSuccessCode", "()I", "sNoSign", "getSNoSign", "sNoConnect", "getSNoConnect", "sInvalidParam", "getSInvalidParam", "sNotLogin", "getSNotLogin", "sTimeOut", "getSTimeOut", "sUnknown", "getSUnknown", "sKeyIsExpect", "", "getSKeyIsExpect", "()Ljava/lang/String;", "sKeyCommands", "getSKeyCommands", "sKeyExpectCommands", "getSKeyExpectCommands", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcServiceConstants {
    private static final int sSuccessCode = 0;

    @NotNull
    public static final NfcServiceConstants INSTANCE = new NfcServiceConstants();
    private static final int sNoSign = 1;
    private static final int sNoConnect = 2;
    private static final int sInvalidParam = 3;
    private static final int sNotLogin = 4;
    private static final int sTimeOut = 60;
    private static final int sUnknown = 99;

    @NotNull
    private static final String sKeyIsExpect = "sKeyIsExpect";

    @NotNull
    private static final String sKeyCommands = "sKeyCommands";

    @NotNull
    private static final String sKeyExpectCommands = "sKeyExpectCommands";

    private NfcServiceConstants() {
    }

    public final int getSInvalidParam() {
        return sInvalidParam;
    }

    @NotNull
    public final String getSKeyCommands() {
        return sKeyCommands;
    }

    @NotNull
    public final String getSKeyExpectCommands() {
        return sKeyExpectCommands;
    }

    @NotNull
    public final String getSKeyIsExpect() {
        return sKeyIsExpect;
    }

    public final int getSNoConnect() {
        return sNoConnect;
    }

    public final int getSNoSign() {
        return sNoSign;
    }

    public final int getSNotLogin() {
        return sNotLogin;
    }

    public final int getSSuccessCode() {
        return sSuccessCode;
    }

    public final int getSTimeOut() {
        return sTimeOut;
    }

    public final int getSUnknown() {
        return sUnknown;
    }
}
