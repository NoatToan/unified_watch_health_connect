package com.huami.training.api;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.zxing.Intents;
import com.huami.hmchartui.utils.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/training/api/WebConst;", "", "", "PAGE_SIZE", LogUtil.I, "<init>", "()V", MAPCookie.KEY_PATH, "QueryParam", "Value", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WebConst {

    @NotNull
    public static final WebConst INSTANCE = new WebConst();
    public static final int PAGE_SIZE = 20;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/huami/training/api/WebConst$Path;", "", "", "TRAININGS", "Ljava/lang/String;", "QUERY_TRAININGS", "JOINED_TRAININGS", "TRAINING_PLAN", "SETTINGS", "CARD", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final String CARD = "discovery/{social}/cards";

        @NotNull
        public static final Path INSTANCE = new Path();

        @NotNull
        public static final String JOINED_TRAININGS = "users/{userId}/joinedTrainings";

        @NotNull
        public static final String QUERY_TRAININGS = "queryTrainings";

        @NotNull
        public static final String SETTINGS = "apps/{appname}/settings";

        @NotNull
        public static final String TRAININGS = "trainings";

        @NotNull
        public static final String TRAINING_PLAN = "users/{userId}/trainingPlan";

        private Path() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004¨\u0006\u001e"}, d2 = {"Lcom/huami/training/api/WebConst$QueryParam;", "", "", "NEXT", "Ljava/lang/String;", "LIMIT", "GENDER", "DIFFICULTY", "BODY_PARTS", "INSTRUMENT", "TRAINING_TYPE", "DISPLAY_LOCATION", "PARTNER_ID", "PARTNER_HUAMI_ID", "TRAINING_ID", "ADDRESS_CODE", "SETTING_NAME", "MODE", Constant.USER_ID, Intents.WifiConnect.TYPE, "PARAM_ADCODE", "REGION", "COUNTRY", "TAG", "NAME", "FILTER_MODE", "FILTER_MODE_ORDER", "IS_DETAIL", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryParam {

        @NotNull
        public static final String ADDRESS_CODE = "addressCode";

        @NotNull
        public static final String BODY_PARTS = "location";

        @NotNull
        public static final String COUNTRY = "user_country";

        @NotNull
        public static final String DIFFICULTY = "difficultyDegree";

        @NotNull
        public static final String DISPLAY_LOCATION = "displayLocation";

        @NotNull
        public static final String FILTER_MODE = "filterMode";

        @NotNull
        public static final String FILTER_MODE_ORDER = "filterModeOrder";

        @NotNull
        public static final String GENDER = "gender";

        @NotNull
        public static final QueryParam INSTANCE = new QueryParam();

        @NotNull
        public static final String INSTRUMENT = "instrument";

        @NotNull
        public static final String IS_DETAIL = "isDetail";

        @NotNull
        public static final String LIMIT = "limit";

        @NotNull
        public static final String MODE = "mode";

        @NotNull
        public static final String NAME = "name";

        @NotNull
        public static final String NEXT = "next";

        @NotNull
        public static final String PARAM_ADCODE = "adcode";

        @NotNull
        public static final String PARTNER_HUAMI_ID = "partnerHuamiId";

        @NotNull
        public static final String PARTNER_ID = "partnerId";

        @NotNull
        public static final String REGION = "user_region";

        @NotNull
        public static final String SETTING_NAME = "settingName";

        @NotNull
        public static final String TAG = "tag";

        @NotNull
        public static final String TRAINING_ID = "trainingId";

        @NotNull
        public static final String TRAINING_TYPE = "trainingType";

        @NotNull
        public static final String TYPE = "types";

        @NotNull
        public static final String USER_ID = "userid";

        private QueryParam() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/huami/training/api/WebConst$Value;", "", "<init>", "()V", "CARD_TYPE", "Gender", "Mode", "PageSize", "Settings", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Value {

        @NotNull
        public static final Value INSTANCE = new Value();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/training/api/WebConst$Value$CARD_TYPE;", "", "", "CAROUSEL", "Ljava/lang/String;", "SUBJECT", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class CARD_TYPE {

            @NotNull
            public static final String CAROUSEL = "course_carousel";

            @NotNull
            public static final CARD_TYPE INSTANCE = new CARD_TYPE();

            @NotNull
            public static final String SUBJECT = "course_subject";

            private CARD_TYPE() {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/training/api/WebConst$Value$Gender;", "", "", "FEMALE", LogUtil.I, "MALE", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class Gender {
            public static final int FEMALE = 0;

            @NotNull
            public static final Gender INSTANCE = new Gender();
            public static final int MALE = 0;

            private Gender() {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/training/api/WebConst$Value$Mode;", "", "", "SINGLE", "Ljava/lang/String;", "RANGE", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class Mode {

            @NotNull
            public static final Mode INSTANCE = new Mode();

            @NotNull
            public static final String RANGE = "RANGE";

            @NotNull
            public static final String SINGLE = "SINGLE";

            private Mode() {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/training/api/WebConst$Value$PageSize;", "", "", "TODAY_TRAINING", LogUtil.I, "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class PageSize {

            @NotNull
            public static final PageSize INSTANCE = new PageSize();
            public static final int TODAY_TRAINING = 6;

            private PageSize() {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/training/api/WebConst$Value$Settings;", "", "", "TRAINING", "Ljava/lang/String;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class Settings {

            @NotNull
            public static final Settings INSTANCE = new Settings();

            @NotNull
            public static final String TRAINING = "huami.mifit.training";

            private Settings() {
            }
        }

        private Value() {
        }
    }

    private WebConst() {
    }
}
