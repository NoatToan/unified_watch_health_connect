package com.huami.bodymeasurements.temperature.model.koin.api;

import com.huami.bodymeasurements.temperature.model.koin.data.TempBarConfig;
import com.huami.bodymeasurements.temperature.model.koin.data.TempUserInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u0004H&¨\u0006\u0010"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/koin/api/TempExternalApi;", "", "", "getTempUnit", "", "isFriend", "", "getAppName", "userId", "Lcom/huami/bodymeasurements/temperature/model/koin/data/TempUserInfo;", "getUserInfo", "showAddEntrance", "showHistoryEntrance", "Lcom/huami/bodymeasurements/temperature/model/koin/data/TempBarConfig;", "getBarConfig", "supportWristTempDevice", "temperature_release"}, k = 1, mv = {1, 5, 1})
public interface TempExternalApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean showAddEntrance(@NotNull TempExternalApi tempExternalApi) {
            return true;
        }

        public static boolean showHistoryEntrance(@NotNull TempExternalApi tempExternalApi) {
            return true;
        }
    }

    @NotNull
    String getAppName();

    @NotNull
    TempBarConfig getBarConfig();

    int getTempUnit();

    @NotNull
    TempUserInfo getUserInfo(@NotNull String userId);

    boolean isFriend();

    boolean showAddEntrance();

    boolean showHistoryEntrance();

    boolean supportWristTempDevice();
}
