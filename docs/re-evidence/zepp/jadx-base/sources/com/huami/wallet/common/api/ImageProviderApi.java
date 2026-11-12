package com.huami.wallet.common.api;

import com.huami.nfc.base.PayResponse;
import com.huami.wallet.common.entity.SupportMasterCountry;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H&J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&J,\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¨\u0006\u000e"}, d2 = {"Lcom/huami/wallet/common/api/ImageProviderApi;", "", "", "appName", "settingName", "mode", "Lcom/huami/nfc/base/PayResponse;", "", "getPreloadResInfo", "key", "getImageUrlByKey", "", "Lcom/huami/wallet/common/entity/SupportMasterCountry;", "getSupportMasterByKey", "common_release"}, k = 1, mv = {1, 5, 1})
public interface ImageProviderApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PayResponse getPreloadResInfo$default(ImageProviderApi imageProviderApi, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPreloadResInfo");
            }
            if ((i & 4) != 0) {
                str3 = "RANGE";
            }
            return imageProviderApi.getPreloadResInfo(str, str2, str3);
        }
    }

    @NotNull
    PayResponse<String> getImageUrlByKey(@NotNull String appName, @NotNull String settingName, @NotNull String key);

    @NotNull
    PayResponse<Map<String, String>> getPreloadResInfo(@NotNull String appName, @NotNull String settingName, @NotNull String mode);

    @NotNull
    PayResponse<List<SupportMasterCountry>> getSupportMasterByKey(@NotNull String appName, @NotNull String settingName, @NotNull String key);
}
