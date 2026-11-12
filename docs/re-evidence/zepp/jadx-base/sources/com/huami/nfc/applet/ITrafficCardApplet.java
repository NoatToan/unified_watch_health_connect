package com.huami.nfc.applet;

import com.huami.nfc.base.SeResponseErrorException;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000e"}, d2 = {"Lcom/huami/nfc/applet/ITrafficCardApplet;", "", "", "aid", "", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "getChargeRecord", "", "isInstalled", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public interface ITrafficCardApplet {
    int getBalance(@NotNull String aid) throws SeResponseErrorException;

    @NotNull
    CardInfo getCardInfo(@NotNull String aid) throws SeResponseErrorException;

    @NotNull
    List<TransEntity> getChargeRecord(@NotNull String aid) throws SeResponseErrorException;

    @NotNull
    List<TransEntity> getTransRecord(@NotNull String aid) throws SeResponseErrorException;

    boolean isInstalled(@NotNull String aid);
}
