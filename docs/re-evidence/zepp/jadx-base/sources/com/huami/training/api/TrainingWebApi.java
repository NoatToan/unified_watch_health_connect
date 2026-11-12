package com.huami.training.api;

import com.huami.training.api.pojo.CardBean;
import com.huami.training.api.pojo.Items;
import com.huami.training.api.pojo.JoinedTrainingBean;
import com.huami.training.api.pojo.TrainingBean;
import com.huami.training.api.pojo.TrainingConfig;
import com.huami.training.api.pojo.TrainingPlanBean;
import com.huami.training.dto.App;
import com.huami.training.vo.ApiResponse;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\b\u001a\u00020\u0007H&J?\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&Já\u0001\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\u00042\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b-\u0010.J\"\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\u00042\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH&¨\u00061"}, d2 = {"Lcom/huami/training/api/TrainingWebApi;", "", "Lcom/huami/training/dto/App;", "app", "Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/api/pojo/TrainingConfig;", "loadConfigurations", "", "needDetail", "Lcom/huami/training/api/pojo/TrainingPlanBean;", "loadTrainingPlan", "isMale", "", "nextPageKey", "", com.huami.sleepassistant.apilib.utils.WebConst.QueryParam.PAGE_SIZE, "Lcom/huami/training/api/pojo/Items;", "Lcom/huami/training/api/pojo/JoinedTrainingBean;", "loadJoinedTrainings", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/huami/training/vo/ApiResponse;", "", "query", "mode", "Lcom/huami/training/api/pojo/TrainingBean;", "search", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/huami/training/vo/ApiResponse;", "Lcom/huami/training/api/pojo/CardBean;", "loadEntranceCards", "", "Lcom/huami/training/api/TrainingTypeBo;", "trainingType", "Lcom/huami/training/api/DisplayLocationBo;", "displayLocation", "addressCode", "Lcom/huami/training/api/DifficultyBo;", "difficulty", "bodyParts", "instrument", "partnerId", WebConst.QueryParam.PARTNER_HUAMI_ID, "trainingId", WebConst.QueryParam.FILTER_MODE, WebConst.QueryParam.FILTER_MODE_ORDER, "tag", "name", "loadTrainings", "(Ljava/util/Set;Lcom/huami/training/api/DisplayLocationBo;Ljava/lang/Boolean;Ljava/lang/String;Lcom/huami/training/api/DifficultyBo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/huami/training/vo/ApiResponse;", "ids", "batchLoadTrainings", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface TrainingWebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ ApiResponse loadJoinedTrainings$default(TrainingWebApi trainingWebApi, Boolean bool, Long l, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadJoinedTrainings");
            }
            if ((i & 1) != 0) {
                bool = null;
            }
            if ((i & 2) != 0) {
                l = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return trainingWebApi.loadJoinedTrainings(bool, l, num);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiResponse loadTrainings$default(TrainingWebApi trainingWebApi, Set set, DisplayLocationBo displayLocationBo, Boolean bool, String str, DifficultyBo difficultyBo, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, Long l2, Integer num, int i, Object obj) {
            if (obj == null) {
                return trainingWebApi.loadTrainings((i & 1) != 0 ? y.setOf((Object[]) new TrainingTypeBo[]{TrainingTypeBo.ACTION, TrainingTypeBo.FEATURED_COURSE}) : set, (i & 2) != 0 ? null : displayLocationBo, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : difficultyBo, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : str9, (i & 16384) != 0 ? null : l2, (i & 32768) != 0 ? null : num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadTrainings");
        }
    }

    @NotNull
    ApiResponse<Items<TrainingBean>> batchLoadTrainings(@NotNull Set<Long> ids);

    @NotNull
    ApiResponse<TrainingConfig> loadConfigurations(@NotNull App app);

    @NotNull
    ApiResponse<CardBean> loadEntranceCards(@NotNull App app);

    @NotNull
    ApiResponse<Items<JoinedTrainingBean>> loadJoinedTrainings(@Nullable Boolean isMale, @Nullable Long nextPageKey, @Nullable Integer pageSize);

    @NotNull
    ApiResponse<TrainingPlanBean> loadTrainingPlan(boolean needDetail);

    @NotNull
    ApiResponse<Items<TrainingBean>> loadTrainings(@Nullable Set<? extends TrainingTypeBo> trainingType, @Nullable DisplayLocationBo displayLocation, @Nullable Boolean isMale, @Nullable String addressCode, @Nullable DifficultyBo difficulty, @Nullable String bodyParts, @Nullable String instrument, @Nullable String partnerId, @Nullable String partnerHuamiId, @Nullable Long trainingId, @Nullable String filterMode, @Nullable String filterModeOrder, @Nullable String tag, @Nullable String name, @Nullable Long nextPageKey, @Nullable Integer pageSize);

    @NotNull
    ApiResponse<Items<TrainingBean>> search(@NotNull String query, @NotNull String mode, @Nullable Long nextPageKey);
}
