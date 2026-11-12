package com.huami.femalehealth.logiclib.api;

import com.huami.android.vo.ApiResponse;
import com.huami.femalehealth.logiclib.api.pojo.BaseSettingBean;
import com.huami.femalehealth.logiclib.api.pojo.FirstUseInfoBean;
import com.huami.femalehealth.logiclib.api.pojo.HistoryDetailBean;
import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import com.huami.femalehealth.logiclib.api.pojo.Items;
import com.huami.femalehealth.logiclib.api.pojo.MenstruationRecordBean;
import com.huami.femalehealth.logiclib.api.pojo.MenstruationStatusBean;
import com.huami.femalehealth.logiclib.api.pojo.TestData;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&J9\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\bH&J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0002H&J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0018H&J \u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH&J \u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0018H&J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020!H&¨\u0006#"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "", "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/femalehealth/logiclib/api/pojo/Items;", "Lcom/huami/femalehealth/logiclib/api/pojo/TestData;", "loadTestData", "", "limit", "", "next", "", WebConst.QueryParam.MONTHLY_STATISTICS, "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "loadHistory", "(ILjava/lang/String;Ljava/lang/Long;)Lcom/huami/android/vo/ApiResponse;", "id", "", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryDetailBean;", "loadHistoryDetail", "Lcom/huami/femalehealth/logiclib/api/pojo/BaseSettingBean;", LargeWatchSkinActivity.KEY_BEAN, "initSetting", "Lcom/huami/femalehealth/logiclib/api/pojo/FirstUseInfoBean;", "getFirstUseInfo", "Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationRecordBean;", "menstruationBegin", "", "isEnd", "menstruationEndClick", "Lcom/huami/femalehealth/logiclib/api/DeleteType;", "type", "deleteMenstruation", "menstruationEdit", "Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationStatusBean;", "menstruationStatus", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public interface FemaleHealthWebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ ApiResponse loadHistory$default(FemaleHealthWebApi femaleHealthWebApi, int i, String str, Long l, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadHistory");
            }
            if ((i2 & 4) != 0) {
                l = null;
            }
            return femaleHealthWebApi.loadHistory(i, str, l);
        }
    }

    @Nullable
    ApiResponse<String> deleteMenstruation(@NotNull String id, @NotNull DeleteType type);

    @Nullable
    ApiResponse<FirstUseInfoBean> getFirstUseInfo();

    @Nullable
    ApiResponse<String> initSetting(@NotNull BaseSettingBean bean);

    @NotNull
    ApiResponse<Items<HistoryItemBean>> loadHistory(int limit, @Nullable String next, @Nullable Long monthlyStatistics);

    @Nullable
    ApiResponse<List<HistoryDetailBean>> loadHistoryDetail(@NotNull String id);

    @NotNull
    ApiResponse<Items<TestData>> loadTestData();

    @Nullable
    ApiResponse<MenstruationRecordBean> menstruationBegin(@NotNull MenstruationRecordBean bean);

    @Nullable
    ApiResponse<MenstruationRecordBean> menstruationEdit(@NotNull MenstruationRecordBean bean);

    @Nullable
    ApiResponse<String> menstruationEndClick(@NotNull String id, boolean isEnd);

    @Nullable
    ApiResponse<MenstruationStatusBean> menstruationStatus(@NotNull MenstruationStatusBean bean);
}
