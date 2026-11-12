package com.xiaomi.hm.health.traininglib.util;

import android.content.Context;
import com.huami.mifit.analytics.Analytics;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingAnalytics {
    public static final String STATUS_VIEW_OUTVIEW = "Dashboard_Out";
    public static final String STATUS_VIEW_OUT_MAIN_LIST_TRAINING = "ListTraining";

    public static final class EventId {
        public static final String ADDTRAININGCOURSES_OPERATE = "AddTrainingCourses_Operate";
        public static final String ADDTRAINING_OPERATE = "AddTraining_Operate";
        public static final String ADDTRAINING_VIEWNUM = "AddTraining_ViewNum";
        public static final String ADD_COURSE_CLICK = "AddCourse_Click";
        public static final String CONFIRM_PURCHASE_CLICK = "ConfirmPurchase_Click";
        public static final String CONFIRM_PURCHASE_VIEW_NUM = "ConfirmPurchase_ViewNum";
        public static final String COURSELIST_CN = "CourseList_CN";
        public static final String COURSELIST_VN = "CourseList_VN";
        public static final String COURSE_INTRODUCTION_VIEWNUM = "CourseIntroduction_ViewNum";
        public static final String COURSE_NETWORK_STATUS = "Course_NetworkStatus";
        public static final String COURSE_PAGE_VIEWNUM = "CoursePage_ViewNum";
        public static final String COURSE_PARTNER_CN = "CoursePartner_CN";
        public static final String COURSE_PARTNER_VN = "CoursePartner_VN";
        public static final String COURSE_VIDEO_LIST_VIEWNUM = "CourseVideoList_ViewNum";
        public static final String CUSTOMIZEDCOURSES_VIEWNUM = "CustomizedCourses_ViewNum";
        public static final String DOMESTIC_SPORTS_OPERATE = "DomesticSports_Operate";
        public static final String ENTER_MIFIT_CN = "EnterMifit_CN";
        public static final String FEATUREDRECOMMENDCOURSE_CN = "FeaturedRecommendCourse_CN";
        public static final String FEATUREDRECOMMENDCOURSE_VN = "FeaturedRecommendCourse_VN";
        public static final String FEATUREDRECOMMENDMORE_CN = "FeaturedRecommendMore_CN";
        public static final String FEATUREDRECOMMEND_VN = "FeaturedRecommend_VN";
        public static final String FEATURED_ARTICLES_CLICK = "FeaturedArticles_Click";
        public static final String FEATURED_ARTICLES_SPORTS_VIEWNUM = "FeaturedArticlesSports_ViewNum";
        public static final String FEATURED_ARTICLES_STATUS_VIEWNUM = "FeaturedArticlesStatus_ViewNum";
        public static final String FEATURED_ARTICLE_BLOCK_VN = "FeaturedArticleBlock_VN";
        public static final String FEATURED_ARTICLE_C = "FeaturedArticle_C";
        public static final String FEATURED_ARTICLE_CONTENT_C = "FeaturedArticleContent_C";
        public static final String FEATURED_ARTICLE_CONTENT_V = "FeaturedArticleContent_V";
        public static final String FEATURED_ARTICLE_LIST_VIEWNUM = "FeaturedArticleList_ViewNum";
        public static final String FEATURED_ARTICLE_SPORTS_CLICK = "FeaturedArticleSports_Click";
        public static final String FEATURED_ARTICLE_STATUS_CLICK = "FeaturedArticleStatus_Click";
        public static final String FEATURED_ARTICLE_V = "FeaturedArticle_V";
        public static final String FEATURED_RECOMMEND_BLOCK_CN = "FeaturedRecommendBlock_CN";
        public static final String FEATURED_RECOMMEND_BLOCK_VN = "FeaturedRecommendBlock_VN";
        public static final String FEATURED_RECOMMEND_VN = "FeaturedRecommend_VN";
        public static final String HEALTH_NEWS_C = "HealthNews_C";
        public static final String HEALTH_NEWS_CONTENT_C = "HealthNewsContent_C";
        public static final String HEALTH_NEWS_CONTENT_V = "HealthNewsContent_V";
        public static final String HEALTH_NEWS_V = "HealthNews_V";
        public static final String HYPERTEXT_CLICK_NUM = "HyperText_ClickNum";
        public static final String HYPER_TEXT_VIEWNUM = "HyperText_ViewNum";
        public static final String JOINEDTRAINING_OPERATE = "JoinedTraining_Operate";
        public static final String JOIN_TRAINING_C = "JoinTraining_C";
        public static final String JOIN_TRAINING_V = "JoinTraining_V";
        public static final String LOOP_CLICK = "Loop_Click";
        public static final String LOOP_VIEWNUM = "Loop_ViewNum";
        public static final String MOVEMENT_DETAIL_VIEW_NUM = "MovementDetail_ViewNum";
        public static final String MOVEMENT_LIST_VIEW_NUM = "MovementList_ViewNum";
        public static final String PARTNER_PAGE_VN = "PartnerPage_VN";
        public static final String POPULARITY_TRAINING_CLICK = "PopularityTraining_Click";
        public static final String PROMOTION_CLICK_NUM = "Promotion_ClickNum";
        public static final String PROMOTION_VIEWNUM = "Promotion_ViewNum";
        public static final String PURCHASE_COURSE_CLICK = "PurchaseCourse_Click";
        public static final String PURCHASE_COURSE_VIEW_NUM = "PurchaseCourse_ViewNum";
        public static final String PURCHASE_FAILED = "Purchase_Failed";
        public static final String PURCHASE_SUCCESS = "Purchase_Success";
        public static final String QUIT_COURSE_CLICK = "QuitCourse_Click";
        public static final String RECOMMEND_TRAINING_CLICK = "RecommendTraining_Click";
        public static final String SEETRAINING_SOURCE = "SeeTraining_Source";
        public static final String SETTING_HEART_RATE_TIPS = "Setting_HeartRateTips";
        public static final String SETTING_MAX_HEART_RATE = "Setting_MaxHeartRate";
        public static final String SET_VIEW_NUM = "Set_ViewNum";
        public static final String SPECIALTRAININGMORE_CLICK = "SpecialTrainingMore_Click";
        public static final String SPECIALTRAININGTOTAL_CLICK = "SpecialTrainingTotal_Click";
        public static final String SPECIALTRAINING_X = "SpecialTraining_%s";
        public static final String TRAININGCOURSES_OUT = "TrainingCourses_Out";
        public static final String TRAININGCOURSES_VIEWNUM = "TrainingCourses_ViewNum";
        public static final String TRAININGKNOWLEDGE_CLICK = "TrainingKnowledge_Click";
        public static final String TRAINING_BREAK_OPERAT = "TrainingBreak_Operate";
        public static final String TRAINING_BREAK_PROMOTION_VIEWNUM = "TrainingBreakPromotion_ViewNum";
        public static final String TRAINING_COURSES_C = "TrainingCourses_C";
        public static final String TRAINING_COURSES_CONTENT_C = "TrainingCoursesContent_C";
        public static final String TRAINING_COURSES_CONTENT_V = "TrainingCoursesContent_V";
        public static final String TRAINING_COURSES_V = "TrainingCourses_V";
        public static final String TRAINING_FINISHED_OPERAT = "TrainingFinished_Operate";
        public static final String TRAINING_HISTORY_SPORTS_CLICK = "TrainingHistorySports_Click";
        public static final String TRAINING_HISTORY_STATUS_CLICK = "TrainingHistoryStatus_Click";
        public static final String TRAINING_PAUSE_OPERAT = "TrainingPause_Operate";
        public static final String TRAINING_PAUSE_PROMOTION_VIEWNUM = "TrainingPausePromotion_ViewNum";
        public static final String TRAINING_PLAY_OPERATE = "TrainingPlay_Operate";
        public static final String TRAINING_QUIT_OPERAT = "TrainingQuit_Operate";
        public static final String TRAIN_SHARE = "Train_Share";
        public static final String VIDEO_PLAY_CLICK = "VideoPlay_Click";
        public static final String VIDEO_PLAY_DURATION = "VideoPlay_Duration";
        public static final String VIDEO_PLAY_OPERATE = "VideoPlay_Operate";
        public static final String VIDEO_PREVIEW_CLICK = "VideoPreview_Click";
    }

    public static final class ParamKey {
        public static final String AD_ID = "id";
        public static final String AD_NAME = "name";
        public static final String BLOCK_NAME = "BlockName";
        public static final String CONTINUE_PLAYING = "ContinuePlaying";
        public static final String COURSE_ID = "CourseID";
        public static final String ID = "ID";
        public static final String NETWORK = "Network";
        public static final String PAGE_SOURCE = "PageSource";
        public static final String PARTNER_ID = "PartnerID";
        public static final String POSITION = "Position";
        public static final String PRICE = "Price";
        public static final String PURCHASE_METHOD = "PurchaseMethod";
        public static final String SOURCE = "Source";
        public static final String STATE = "State";
        public static final String VIDEO_ID = "VideoID";
    }

    public static final class ParamValue {

        public static final class AddTrainingOperate {
            public static final String ALL_TRAINING = "AllTraining";
            public static final String CLASSIC_TRAINING = "ClassicTraining";
            public static final String POPULARITY_ADD = "PopularityAdd";
            public static final String SPECIAL_TRAINING = "SpecialTraining";
            public static final String TRAINING_KNOWLEDGE = "TrainingKnowledge";
        }

        public static final class ContinuePlaying {
            public static final String NO = "No";
            public static final String YES = "Yes";
        }

        public static final class DomesticSportsOperate {
            public static final String ADD_TRAINING = "AddTraining";
            public static final String CUSTOMIZED__COURSES = "CustomizedCourses";
            public static final String FEATURED_ARTICLES = "FeaturedArticles";
            public static final String PARTICIPATED_TRAINING = "ParticipatedTraining";
            public static final String POPULARITY = "Popularity";
            public static final String RECOMMEND = "Recommend";
            public static final String TRAINING_COURSES = "TrainingCourses";
        }

        public static final class JoinState {
            public static final String JOIN = "Join";
            public static final String NOT_JOIN = "NotJoin";
        }

        public static final class JoinedTrainingOperate {
            public static final String CANCEL = "Cancel";
            public static final String COACH_DESCRIPTION = "CoachDescription";
            public static final String COACH_HOMEPAGE = "CoachHomepage";
            public static final String DOWNLOAD = "Download";
            public static final String MORE = "More";
            public static final String MOVEMENT_DETAIL = "MovementDetail";
            public static final String MOVEMENT_LIST = "MovementList";
            public static final String QUIT = "Quit";
            public static final String SETTINGS = "Settings";
            public static final String START = "Start";
            public static final String TRAINING_DESCRIPTION = "TrainingDescription";
        }

        public static final class Network {
            public static final String NOT_WIFI = "非wifi";
            public static final String NO_NETWORK = "NoNetwork";
            public static final String WIFI = "wifi";
        }

        public static final class PageSource {
            public static final String ADD_TRAINING = "添加训练页";
            public static final String FEATURED_COURSE_DETAIL = "课程详情页";
            public static final String SPORT = "运动页首页";
            public static final String STATUS = "状态页首页";
        }

        public static final class Price {
            public static final String FREE = "Free";
            public static final String PAID = "Paid";
        }

        public static final class PurchaseMethod {
            public static final String ALIPAY = "支付宝";
            public static final String WECHAT = "微信";
        }

        public static final class PurchaseSource {
            public static final String DEMO_GUIDE = "试看播放器-引导条";
            public static final String DETAIL_BUTTON = "课程详情页购买按钮";
            public static final String END_GUIDE = "结束引导购买按钮";
            public static final String PAUSE_GUIDE = "暂停引导购买按钮";
        }

        public static final class SeeTrainingSource {
            public static final String ALL_TRAINING_LIST = "AllTraining";
            public static final String HISTORY = "History";
            public static final String JOINED_TRAINING = "JoinedTraining";
            public static final String POPULARITY_TRAINING = "PopularityTraining";
            public static final String RECOMMEND_TRAINING = "RecommendTraining";
            public static final String SPECIAL_TRAINING = "SpecialTraining";
            public static final String TRAINING_BANNER = "Loop_Training";
            public static final String TRAINING_COLLECTION_LIST = "Loop_SpecialTraining";
        }

        public static final class SettingMaxHeartRate {
            public static final String TRAINING = "Training";
        }

        public static final class Source {
            public static final String ADD_NEW_TRAINING = "添加新训练";
            public static final String JOIN_TRAINING = "参加自由训练";
        }

        public static final class SportsHistoryOperate {
            public static final String MONTH = "Month";
            public static final String TOTAL = "Total";
            public static final String WEEK = "Week";
        }

        public static class TrainShare {
            public static final String FACEBOOK = "Facebook";
            public static final String LINE = "Line";
            public static final String MIFIT = "MiFit";
            public static final String MOMENTS = "Moments";
            public static final String QQ = "QQ";
            public static final String QQZONE = "QQZone";
            public static final String SAVE = "Save";
            public static final String TWITTER = "Twitter";
            public static final String WECHAT = "Wechat";
            public static final String WEIBO = "Weibo";
        }

        public static class TrainingBreakControl {
            public static final String MovementDetail = "MovementDetail";
            public static final String SKIP = "Skip";
        }

        public static class TrainingCoursesOut {
            public static final String MORE = "More";
            public static final String NOT_STARTED_ARTICLES = "NotStartedArticles";
            public static final String QUIT_COURSES = "QuitCourses";
            public static final String REST_ARTICLES = "RestArticles";
            public static final String SETTINGS = "Settings";
            public static final String START = "Start";
            public static final String TRAINING_REMIND = "TrainingRemind";
        }

        public static class TrainingPauseControl {
            public static final String MovementDetail = "MovementDetail";
            public static final String RESUME = "Resume";
        }

        public static class TrainingPlayControl {
            public static final String BGM_OFF = "Background Off";
            public static final String BGM_ON = "Background On";
            public static final String FAST_FORWARD = "Fast Forward";
            public static final String FAST_REWIND = "Fast Rewind";
            public static final String HIDDEN = "Hidden";
            public static final String PAUSE = "Pause";
            public static final String QUIT = "Quit";
        }

        public static final class VideoPlayOp {
            public static final String LIGHT = "Light";
            public static final String LOCK = "Lock";
            public static final String PAUSE = "Pause";
            public static final String PLAY_NEXT = "PlayNext";
            public static final String REPLAY = "Replay";
            public static final String RESUME = "Resume";
            public static final String UNLOCK = "Unlock";
            public static final String VOLUME = "Volumn";
        }

        public static final class WatchDemoSource {
            public static final String FIRST_VIDEO = "首视频试看";
            public static final String HEADER = "头图试看";
        }
    }

    @Deprecated
    public static void event(Context context, String str) {
        Analytics.event(context, str);
    }

    @Deprecated
    public static void event(Context context, String str, String str2) {
        Analytics.event(context, str, str2);
    }
}
