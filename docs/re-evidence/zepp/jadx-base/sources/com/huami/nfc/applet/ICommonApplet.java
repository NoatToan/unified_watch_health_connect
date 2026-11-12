package com.huami.nfc.applet;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\f\u001a\u00020\u0002H&J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH&J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH&J\n\u0010\u0011\u001a\u0004\u0018\u00010\nH&J\b\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0013"}, d2 = {"Lcom/huami/nfc/applet/ICommonApplet;", "", "", "getCplc", "aid", "", "isDefault", "activateCard", "activateCardBySearchSe", "activateCardByResponse", "Lcom/huami/nfc/applet/AppletState;", "getAppletState", "getAppletInfoFromSe", "", "aids", "getAppletStateFromSe", "getAppletsState", "getActiveApplet", "getLingNanTongCityCode", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public interface ICommonApplet {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List getAppletStateFromSe$default(ICommonApplet iCommonApplet, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppletStateFromSe");
            }
            if ((i & 1) != 0) {
                list = BusCardExtensions.getAllAppletAids();
            }
            return iCommonApplet.getAppletStateFromSe(list);
        }
    }

    boolean activateCard(@NotNull String aid, boolean isDefault);

    boolean activateCardByResponse(@NotNull String aid, boolean isDefault);

    boolean activateCardBySearchSe(@NotNull String aid, boolean isDefault);

    @Nullable
    AppletState getActiveApplet();

    @NotNull
    String getAppletInfoFromSe();

    @NotNull
    AppletState getAppletState(@NotNull String aid);

    @NotNull
    List<AppletState> getAppletStateFromSe(@NotNull List<String> aids);

    @NotNull
    List<AppletState> getAppletsState(@NotNull List<String> aids);

    @NotNull
    String getCplc();

    @NotNull
    String getLingNanTongCityCode();
}
