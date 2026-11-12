package com.xiaomi.hm.health.training.api.constant;

/* JADX INFO: loaded from: classes21.dex */
public interface TrainingWebConst {
    public static final int ORDER_PAGE_SIZE = 20;
    public static final int PAGE_SIZE = 15;

    public interface Path {
        public static final String DICTIONARIES = "dictionaries/{type}";
        public static final String JOINED_TRAININGS = "users/{userId}/joinedTrainings";
        public static final String JOIN_TRAININGS = "users/{userId}/joinTrainings/{id}";
        public static final String ORDER = "users/{userId}/orders";
        public static final String RANKING_LIST = "rankingList";
        public static final String SAVE_TRAINING_RECORD = "users/{userId}/trainings/{trainingId}";
        public static final String SETTINGS = "apps/com.xiaomi.hm.health/settings";
        public static final String TRAININGS = "trainings";
        public static final String TRAINING_DETAIL = "trainings/{id}";
        public static final String TRAINING_KNOWLEDGE = "users/{userId}/trainingKnowledge";
        public static final String TRAINING_RECORD = "users/{userId}/trainingRecords/{trainingId}";
        public static final String TRAINING_RECORDS = "users/{userId}/trainingRecords";
        public static final String VIDEO_URLS = "users/{userId}/products/{productId}/delivery";
    }

    public interface QueryParam {
        public static final String ADDRESS_CODE = "addressCode";
        public static final String BODY_PARTS = "location";
        public static final String DEFINITION = "definition";
        public static final String DELIVERY_ID = "deliveryId";
        public static final String DIFFICULTY = "difficultyDegree";
        public static final String DISPLAY_LOCATION = "displayLocation";
        public static final String END = "end";
        public static final String END_TIME = "endTime";
        public static final String FINISH_TIME = "finishTime";
        public static final String GENDER = "gender";
        public static final String INSTRUMENT = "instrument";
        public static final String LIMIT = "limit";
        public static final String MODE = "mode";
        public static final String NAME = "name";
        public static final String NEXT = "next";
        public static final String ORDERSTATUS = "orderStatus";
        public static final String PARTNERID = "partnerId";
        public static final String SETTING_NAME = "settingName";
        public static final String SKUID = "skuId";
        public static final String START = "start";
        public static final String START_TIME = "startTime";
        public static final String STREAM_TYPE = "streamType";
        public static final String TRAININGID = "trainingId";
        public static final String TRAINING_TYPE = "trainingType";
        public static final String USER_ID = "userId";
        public static final String VIDEO_FORMAT = "format";
    }

    public interface Value {

        public interface Definition {
            public static final String LD = "LD";
        }

        public interface Dictionary {
            public static final String TRAINING_BODYPART = "TRAINING_LOCATION";
            public static final String TRAINING_INSTRUMENT = "TRAINING_INSTRUMENT";
        }

        public interface Difficulty {
            public static final int INTERMEDIATE = 2;
            public static final int JUNIOR = 1;
            public static final int SENIOR = 3;
        }

        public interface DisplayLocation {
            public static final String DETAIL_PAGE = "DETAIL_PAGE";
            public static final String LIST_PAGE = "LIST_PAGE";
            public static final String SPORT_PAGE = "SPORT_PAGE";
            public static final String STATUS_PAGE = "STATUS_PAGE";
        }

        public interface Gender {
            public static final int FEMALE = 0;
            public static final int MALE = 1;
        }

        public interface LabelDirection {
            public static final String LEFT = "left";
            public static final String RIGHT = "right";
        }

        public interface Limit {
            public static final int COURSE_DETAIL_RECOMMEND = 6;
            public static final int STATUS_PAGE = 6;
        }

        public interface Mode {
            public static final String RANGE = "RANGE";
        }

        public interface OrderStatus {
            public static final String DELIVERING = "DELIVERING";
            public static final String PAID = "PAID";
            public static final String UNPAID = "UNPAID";
        }

        public interface PayChannel {
            public static final String ALIPAY = "MIFIT_ALI";
            public static final String WECHAT = "MIFIT_WECHAT";
        }

        public interface Ranking {
            public static final String COURSE_PLAYING = "coures_ID_calorie";
        }

        public interface Settings {
            public static final String VIDEO_IMAGE_POST = "huami.mifit.video.config.picture";
        }

        public interface StreamType {
            public static final String VIDEO = "video";
        }

        public interface TrainingType {
            public static final String FEATURED_COURSE = "EXCELLENT_COURSE";
            public static final String SINGLE_TRAINING = "SINGLE_TRAINING";
            public static final String YOGA = "YOGA";
        }

        public interface VideoDemoDurationUnit {
            public static final String MINUTES = "MINUTES";
            public static final String PERCENT = "PERCENT";
        }

        public interface VideoFormat {
            public static final String MP4 = "mp4";
        }
    }
}
