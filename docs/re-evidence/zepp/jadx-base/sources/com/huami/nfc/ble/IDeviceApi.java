package com.huami.nfc.ble;

import com.huami.nfc.applet.CardScheduleTime;
import com.huami.nfc.base.PayResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\rH&J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H&J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\u0015\u001a\u00020\u0014H&J&\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u0019\u001a\u00020\u0017H&J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u0019\u001a\u00020\u0017H&¨\u0006\u001c"}, d2 = {"Lcom/huami/nfc/ble/IDeviceApi;", "", "", "aid", "Lcom/huami/nfc/ble/AppletType;", "type", "Lcom/huami/nfc/base/PayResponse;", "", "activeApplet", "issueApplet", "deleteApplet", "name", "updateAppletInfo", "Lcom/huami/nfc/ble/AppletEntity;", "entity", "notifyAppletInfoForWatch", "", "notifyAppletInfoListForWatch", "deleteAppletForWatch", "closeNfcTagReader", "", "isSupportScheduleTime", "", "Lcom/huami/nfc/applet/CardScheduleTime;", "queryScheduleTime", "cardScheduleTime", "deleteScheduleTime", "setScheduleTime", "nfc-ble_release"}, k = 1, mv = {1, 5, 1})
public interface IDeviceApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PayResponse updateAppletInfo$default(IDeviceApi iDeviceApi, String str, String str2, AppletType appletType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAppletInfo");
            }
            if ((i & 4) != 0) {
                appletType = null;
            }
            return iDeviceApi.updateAppletInfo(str, str2, appletType);
        }
    }

    @NotNull
    PayResponse<Unit> activeApplet(@NotNull String aid, @NotNull AppletType type);

    @NotNull
    PayResponse<Unit> closeNfcTagReader();

    @NotNull
    PayResponse<Unit> deleteApplet(@NotNull String aid, @NotNull AppletType type);

    @NotNull
    PayResponse<Unit> deleteAppletForWatch(@NotNull String aid, @NotNull AppletType type);

    @NotNull
    PayResponse<Boolean> deleteScheduleTime(@NotNull CardScheduleTime cardScheduleTime);

    boolean isSupportScheduleTime();

    @NotNull
    PayResponse<Unit> issueApplet(@NotNull String aid, @NotNull AppletType type);

    @NotNull
    PayResponse<Unit> notifyAppletInfoForWatch(@NotNull AppletEntity entity);

    @NotNull
    PayResponse<Unit> notifyAppletInfoListForWatch(@NotNull List<AppletEntity> entity);

    @NotNull
    PayResponse<List<CardScheduleTime>> queryScheduleTime(@NotNull AppletType type, @NotNull String aid);

    @NotNull
    PayResponse<Boolean> setScheduleTime(@NotNull CardScheduleTime cardScheduleTime);

    @NotNull
    PayResponse<Unit> updateAppletInfo(@NotNull String name, @NotNull String aid);

    @NotNull
    PayResponse<Unit> updateAppletInfo(@NotNull String name, @NotNull String aid, @Nullable AppletType type);
}
