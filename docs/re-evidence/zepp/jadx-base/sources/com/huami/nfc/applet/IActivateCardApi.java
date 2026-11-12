package com.huami.nfc.applet;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/huami/nfc/applet/IActivateCardApi;", "", "", "aid", "", "isDefault", "activateCard", "", "getAppletAids", "getAppletInfoFromSe", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public interface IActivateCardApi {
    boolean activateCard(@NotNull String aid, boolean isDefault);

    @NotNull
    List<String> getAppletAids();

    @NotNull
    String getAppletInfoFromSe();
}
