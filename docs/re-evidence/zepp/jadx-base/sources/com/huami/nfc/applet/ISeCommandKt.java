package com.huami.nfc.applet;

import com.huami.nfc.applet.city.CityAppletExtensionsKt;
import com.huami.nfc.base.SeResponseErrorException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000\"\u0016\u0010\u000b\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0016\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/nfc/applet/ISeCommand;", "", "data", "sendWithException", "aid", "selectWithException", "", "verifyPIN", "", "isInstalled", "path", "CMD_APDU_SELECTED", "Ljava/lang/String;", "", "RPDU_NEED_JUDGE", "B", "nfc-applet_release"}, k = 2, mv = {1, 5, 1})
public final class ISeCommandKt {

    @NotNull
    public static final String CMD_APDU_SELECTED = "00A40400%02x%s";
    public static final byte RPDU_NEED_JUDGE = 108;

    public static final boolean isInstalled(@NotNull ISeCommand iSeCommand, @NotNull String str) {
        return CityAppletExtensionsKt.isSuccess(iSeCommand.select(str));
    }

    @NotNull
    public static final String selectWithException(@NotNull ISeCommand iSeCommand, @NotNull String str) throws SeResponseErrorException {
        String strSelect = iSeCommand.select(str);
        if (CityAppletExtensionsKt.isSuccess(strSelect)) {
            return strSelect;
        }
        throw new SeResponseErrorException(str, strSelect);
    }

    @NotNull
    public static final String sendWithException(@NotNull ISeCommand iSeCommand, @NotNull String str) throws SeResponseErrorException {
        String strSend = iSeCommand.send(str);
        if (CityAppletExtensionsKt.isSuccess(strSend)) {
            return strSend;
        }
        throw new SeResponseErrorException(str, strSend);
    }

    public static final void verifyPIN(@NotNull ISeCommand iSeCommand) throws SeResponseErrorException {
        sendWithException(iSeCommand, "0020000003123456");
    }

    public static final boolean isInstalled(@NotNull ISeCommand iSeCommand, @NotNull String str, @NotNull String str2) {
        if (CityAppletExtensionsKt.isSuccess(iSeCommand.select(str))) {
            return CityAppletExtensionsKt.isSuccess(iSeCommand.send(str2));
        }
        return false;
    }
}
