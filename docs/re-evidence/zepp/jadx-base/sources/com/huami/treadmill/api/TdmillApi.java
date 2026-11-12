package com.huami.treadmill.api;

import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.WebConst;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.data.TdLine;
import com.huami.treadmill.data.TdLineDetail;
import com.huami.treadmill.data.TdLineDetailRun;
import com.huami.treadmill.data.TdPromotionLine;
import com.huami.treadmill.data.TdRankingList;
import com.huami.treadmill.data.TdSpeedKingBean;
import com.huami.treadmill.data.TdkingBean;
import com.loc.z;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J,\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u001b"}, d2 = {"Lcom/huami/treadmill/api/TdmillApi;", "", "Lcom/huami/treadmill/api/ApiResponse;", "Lcom/huami/treadmill/data/Items;", "Lcom/huami/treadmill/data/TdPromotionLine;", "getPromotionLines", "", "id", "Lcom/huami/treadmill/data/TdLineDetailRun;", "getOriginLine", "", "nextKey", "Lcom/huami/treadmill/data/TdLine;", "getLines", "time", "next", "Lcom/huami/treadmill/data/TdLineDetail;", "getLineDetail", "Lcom/huami/treadmill/data/TdRankingList;", "getDiligentRank", "getSpeedRank", "Lcom/huami/treadmill/data/TdkingBean;", "getDiligentKins", "Lcom/huami/treadmill/data/TdSpeedKingBean;", "getSpeedKins", "getPromotionLinesDetail", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public interface TdmillApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String LINE_DETAILS = "queryTrainings";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\bB\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bB\u0010CR\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001c\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u001c\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u001c\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u001c\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R\u001c\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u001c\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u001c\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u001c\u00104\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u001c\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u001c\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R\u001c\u0010=\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u001c\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R\u0016\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u0004¨\u0006D"}, d2 = {"Lcom/huami/treadmill/api/TdmillApi$Companion;", "", "", "b", "Ljava/lang/String;", "getBASE_URL", "()Ljava/lang/String;", "BASE_URL", "c", "getTRAINING_LIST", "TRAINING_LIST", GoogleApiAvailabilityLight.a, "getTRAINING_DETAIL", "TRAINING_DETAIL", "e", "getTRAINING_HISTORY", "TRAINING_HISTORY", "f", "getRANKING_LIST", "RANKING_LIST", "g", "getRANKING_DAILY_TOP", "RANKING_DAILY_TOP", "h", "getPARAM_GENDER", "PARAM_GENDER", "i", "getPARAM_BMITYPE", "PARAM_BMITYPE", z.j, "getPARAM_DISPLAY_LOCATION", "PARAM_DISPLAY_LOCATION", hl.k, "getPARAM_FINISH_TIME", "PARAM_FINISH_TIME", "l", "getPARAM_START_TIME", "PARAM_START_TIME", "m", "getPARAM_END_TIME", "PARAM_END_TIME", GoogleApiAvailabilityLight.b, "getPARAM_LIMIT", "PARAM_LIMIT", "o", "getPARAM_NEXT", "PARAM_NEXT", b.r, "getPARAM_ISDETAIL", "PARAM_ISDETAIL", DTransferConstants.SEARCH_KEY, "getPARAM_TRAINING_TYPE", "PARAM_TRAINING_TYPE", "r", "getPARAM_TRAIN_LEVEL", "PARAM_TRAIN_LEVEL", SOAP.XMLNS, "getPARAM_TRAIN_LOCATION", "PARAM_TRAIN_LOCATION", "t", "getPARAM_TRAIN_INSTRUMENT", "PARAM_TRAIN_INSTRUMENT", "u", "getPARAM_START", "PARAM_START", "LINE_DETAILS", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String LINE_DETAILS = "queryTrainings";
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final String BASE_URL = "";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private static final String TRAINING_LIST = "trainings";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private static final String TRAINING_DETAIL = "trainings/%s";

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private static final String TRAINING_HISTORY = "trainings/%s/trainingHistories";

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private static final String RANKING_LIST = TrainingWebConst.Path.RANKING_LIST;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        private static final String RANKING_DAILY_TOP = "rankingDailyTop";

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_GENDER = "gender";

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_BMITYPE = "BMIType";

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_DISPLAY_LOCATION = "displayLocation";

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_FINISH_TIME = "finishTime";

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_START_TIME = "startTime";

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_END_TIME = "endTime";

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_LIMIT = "limit";

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_NEXT = "next";

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_ISDETAIL = WebConst.QueryParam.IS_DETAIL;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_TRAINING_TYPE = "trainingType";

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_TRAIN_LEVEL = "difficultyDegree";

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_TRAIN_LOCATION = "location";

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_TRAIN_INSTRUMENT = "instrument";

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @NotNull
        private static final String PARAM_START = "start";

        private Companion() {
        }

        @NotNull
        public final String getBASE_URL() {
            return BASE_URL;
        }

        @NotNull
        public final String getPARAM_BMITYPE() {
            return PARAM_BMITYPE;
        }

        @NotNull
        public final String getPARAM_DISPLAY_LOCATION() {
            return PARAM_DISPLAY_LOCATION;
        }

        @NotNull
        public final String getPARAM_END_TIME() {
            return PARAM_END_TIME;
        }

        @NotNull
        public final String getPARAM_FINISH_TIME() {
            return PARAM_FINISH_TIME;
        }

        @NotNull
        public final String getPARAM_GENDER() {
            return PARAM_GENDER;
        }

        @NotNull
        public final String getPARAM_ISDETAIL() {
            return PARAM_ISDETAIL;
        }

        @NotNull
        public final String getPARAM_LIMIT() {
            return PARAM_LIMIT;
        }

        @NotNull
        public final String getPARAM_NEXT() {
            return PARAM_NEXT;
        }

        @NotNull
        public final String getPARAM_START() {
            return PARAM_START;
        }

        @NotNull
        public final String getPARAM_START_TIME() {
            return PARAM_START_TIME;
        }

        @NotNull
        public final String getPARAM_TRAINING_TYPE() {
            return PARAM_TRAINING_TYPE;
        }

        @NotNull
        public final String getPARAM_TRAIN_INSTRUMENT() {
            return PARAM_TRAIN_INSTRUMENT;
        }

        @NotNull
        public final String getPARAM_TRAIN_LEVEL() {
            return PARAM_TRAIN_LEVEL;
        }

        @NotNull
        public final String getPARAM_TRAIN_LOCATION() {
            return PARAM_TRAIN_LOCATION;
        }

        @NotNull
        public final String getRANKING_DAILY_TOP() {
            return RANKING_DAILY_TOP;
        }

        @NotNull
        public final String getRANKING_LIST() {
            return RANKING_LIST;
        }

        @NotNull
        public final String getTRAINING_DETAIL() {
            return TRAINING_DETAIL;
        }

        @NotNull
        public final String getTRAINING_HISTORY() {
            return TRAINING_HISTORY;
        }

        @NotNull
        public final String getTRAINING_LIST() {
            return TRAINING_LIST;
        }
    }

    @NotNull
    ApiResponse<Items<TdkingBean>> getDiligentKins(long id, @Nullable String nextKey);

    @NotNull
    ApiResponse<TdRankingList> getDiligentRank(long id);

    @NotNull
    ApiResponse<Items<TdLineDetail>> getLineDetail(long id, long time, long next);

    @NotNull
    ApiResponse<Items<TdLine>> getLines(@Nullable String nextKey);

    @NotNull
    ApiResponse<TdLineDetailRun> getOriginLine(long id);

    @NotNull
    ApiResponse<Items<TdPromotionLine>> getPromotionLines();

    @NotNull
    ApiResponse<TdPromotionLine> getPromotionLinesDetail(long id);

    @NotNull
    ApiResponse<Items<TdSpeedKingBean>> getSpeedKins(long id, @Nullable String nextKey);

    @NotNull
    ApiResponse<TdRankingList> getSpeedRank(long id);
}
