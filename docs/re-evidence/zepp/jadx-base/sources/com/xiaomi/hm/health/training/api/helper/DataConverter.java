package com.xiaomi.hm.health.training.api.helper;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.hm.health.training.api.bean.ContentItem;
import com.xiaomi.hm.health.training.api.bean.FilterItem;
import com.xiaomi.hm.health.training.api.bean.FreeTimeRange;
import com.xiaomi.hm.health.training.api.bean.Knowledge;
import com.xiaomi.hm.health.training.api.bean.Label;
import com.xiaomi.hm.health.training.api.bean.LongGenderTuple;
import com.xiaomi.hm.health.training.api.bean.PaidOrder;
import com.xiaomi.hm.health.training.api.bean.PartnerInfo;
import com.xiaomi.hm.health.training.api.bean.SkusItem;
import com.xiaomi.hm.health.training.api.bean.StringGenderTuple;
import com.xiaomi.hm.health.training.api.bean.TrainingItem;
import com.xiaomi.hm.health.training.api.bean.VideoItem;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.xiaomi.hm.health.training.api.entity.ActionOrYogaTraining;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseDetail;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseDetailItem;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseForPlay;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseItem;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseListItem;
import com.xiaomi.hm.health.training.api.entity.FeaturedCoursePartnerInfo;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseVideo;
import com.xiaomi.hm.health.training.api.entity.PaidOrderListItem;
import com.xiaomi.hm.health.training.api.entity.SimpleFeaturedCourse;
import com.xiaomi.hm.health.training.api.entity.TrainingKnowledge;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.helper.DataConverter;
import com.xiaomi.hm.health.training.api.util.Loggers;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes21.dex */
public class DataConverter {
    private static Gson a = null;
    private static final String b = "Train-DataConverter";

    public class a extends TypeToken<PartnerInfo> {
    }

    private static String c(String str, long j) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
    }

    public static Gson d() {
        if (a == null) {
            a = new GsonBuilder().create();
        }
        return a;
    }

    @Nullable
    private static FeaturedCoursePartnerInfo e(@Nullable TrainingItem trainingItem) {
        if (trainingItem == null || TextUtils.isEmpty(trainingItem.partnerInfo)) {
            return null;
        }
        PartnerInfo partnerInfo = (PartnerInfo) m(trainingItem.partnerInfo, new a().getType());
        FeaturedCoursePartnerInfo featuredCoursePartnerInfo = new FeaturedCoursePartnerInfo();
        featuredCoursePartnerInfo.id = partnerInfo.id;
        featuredCoursePartnerInfo.partnerTitle = partnerInfo.partnerTitle;
        featuredCoursePartnerInfo.partnerRecommendation = partnerInfo.partnerRecommendation;
        featuredCoursePartnerInfo.partnerIntroduction = partnerInfo.partnerIntroduction;
        featuredCoursePartnerInfo.partnerLogo = partnerInfo.partnerLogo;
        featuredCoursePartnerInfo.partnerBackgroundImg = partnerInfo.partnerBackgroundImg;
        featuredCoursePartnerInfo.mifitCircleUrl = partnerInfo.mifitCircleUrl;
        return featuredCoursePartnerInfo;
    }

    @Nullable
    private static String f(@Nullable TrainingItem trainingItem) {
        SkusItem skuItem = getSkuItem(trainingItem);
        if (skuItem != null) {
            return skuItem.skuId;
        }
        return null;
    }

    @Nullable
    private static List<com.xiaomi.hm.health.training.api.entity.SkusItem> g(@Nullable TrainingItem trainingItem) {
        List<SkusItem> list;
        if (trainingItem == null || (list = trainingItem.skus) == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SkusItem skusItem : trainingItem.skus) {
            com.xiaomi.hm.health.training.api.entity.SkusItem skusItem2 = new com.xiaomi.hm.health.training.api.entity.SkusItem();
            skusItem2.skuId = skusItem.skuId;
            skusItem2.originalPrice = skusItem.originalPrice;
            skusItem2.salePrice = skusItem.salePrice;
            skusItem2.isPurchased = skusItem.isPurchased;
            skusItem2.expiry = skusItem.expiry;
            FreeTimeRange freeTimeRange = skusItem.freeTimeRange;
            if (freeTimeRange != null) {
                skusItem2.freeRangeStart = c("yyyy-MM-dd", freeTimeRange.startAt);
                skusItem2.freeRangeEnd = c("yyyy-MM-dd", skusItem.freeTimeRange.endAt);
            }
            arrayList.add(skusItem2);
        }
        return arrayList;
    }

    public static List<FeaturedCourseItem> getLimitFeaturedCourses(@Nullable List<FeaturedCourseItem> list, int i) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        int iMin = Math.min(i, list.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(list.get(i2));
        }
        return arrayList;
    }

    @Nullable
    public static SkusItem getSkuItem(@Nullable TrainingItem trainingItem) {
        List<SkusItem> list;
        if (trainingItem == null || (list = trainingItem.skus) == null || list.isEmpty()) {
            return null;
        }
        return trainingItem.skus.get(0);
    }

    @Nullable
    private static List<FeaturedCourseDetailItem> h(@Nullable TrainingItem trainingItem) {
        if (!j(trainingItem)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<ContentItem> list = trainingItem.content;
        if (list != null && !list.isEmpty()) {
            Iterator<ContentItem> it2 = trainingItem.content.iterator();
            while (it2.hasNext()) {
                for (VideoItem videoItem : it2.next().videos) {
                    FeaturedCourseDetailItem featuredCourseDetailItem = new FeaturedCourseDetailItem();
                    featuredCourseDetailItem.id = String.valueOf(videoItem.id);
                    featuredCourseDetailItem.name = videoItem.name;
                    featuredCourseDetailItem.duration = videoItem.duration;
                    featuredCourseDetailItem.consumption = Long.valueOf(videoItem.consumption);
                    featuredCourseDetailItem.instrument = videoItem.instrument;
                    featuredCourseDetailItem.participantNumber = Long.valueOf(videoItem.participantNumber);
                    featuredCourseDetailItem.thumbnail = videoItem.thumbnail;
                    featuredCourseDetailItem.isFree = Boolean.valueOf(videoItem.isFree);
                    arrayList.add(featuredCourseDetailItem);
                }
            }
        }
        return arrayList;
    }

    private static boolean i(@Nullable TrainingItem trainingItem) {
        SkusItem skuItem = getSkuItem(trainingItem);
        return skuItem != null && skuItem.isPurchased.booleanValue();
    }

    public static boolean isFreeFeaturedCourse(@Nullable TrainingItem trainingItem) {
        Float f;
        SkusItem skuItem = getSkuItem(trainingItem);
        return (skuItem == null || (f = skuItem.salePrice) == null || f.floatValue() != 0.0f) ? false : true;
    }

    private static boolean j(@Nullable TrainingItem trainingItem) {
        SkusItem skuItem = getSkuItem(trainingItem);
        return (trainingItem == null || skuItem == null || skuItem.isPurchased == null || skuItem.salePrice == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object k() {
        return "解析json出现错误";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object l() {
        return "检测到是试看样片，但没有限制试看多久";
    }

    private static <T> T m(String str, Type type) {
        try {
            return (T) d().fromJson(str, type);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            Loggers.getLogger().w(b, new Supplier() { // from class: s21
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return DataConverter.k();
                }
            });
            return null;
        }
    }

    private static ActionOrYogaTraining n(TrainingItem trainingItem, boolean z) {
        ActionOrYogaTraining actionOrYogaTraining = new ActionOrYogaTraining();
        actionOrYogaTraining.id = trainingItem.id;
        actionOrYogaTraining.name = trainingItem.name;
        actionOrYogaTraining.hasJoined = trainingItem.isParticipate;
        actionOrYogaTraining.numberOfParticipants = trainingItem.participantNumber;
        actionOrYogaTraining.isYoga = "YOGA".equals(trainingItem.trainingType);
        actionOrYogaTraining.difficulty = trainingItem.difficultyDegree;
        StringGenderTuple stringGenderTuple = trainingItem.largeListImageUrl;
        if (stringGenderTuple != null) {
            actionOrYogaTraining.largeListImageUrl = z ? stringGenderTuple.male : stringGenderTuple.female;
        }
        LongGenderTuple longGenderTuple = trainingItem.duration;
        if (longGenderTuple != null) {
            actionOrYogaTraining.duration = z ? longGenderTuple.male : longGenderTuple.female;
        }
        FilterItem filterItem = trainingItem.instrument;
        actionOrYogaTraining.instrument = filterItem != null ? filterItem.name : null;
        List<FilterItem> list = trainingItem.bodyparts;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<FilterItem> it2 = trainingItem.bodyparts.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().name);
            }
            actionOrYogaTraining.bodyparts = arrayList;
        }
        return actionOrYogaTraining;
    }

    @NonNull
    public static List<ActionOrYogaTraining> toActionOrYogaTrainingList(@Nullable List<TrainingItem> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator<TrainingItem> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(n(it2.next(), z));
            }
        }
        return arrayList;
    }

    @NonNull
    public static List<PaidOrderListItem> toCourseOrderList(@Nullable List<PaidOrder> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<PaidOrder> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(toCourseOrderListItem(it2.next()));
            }
        }
        return arrayList;
    }

    public static PaidOrderListItem toCourseOrderListItem(@NonNull PaidOrder paidOrder) {
        PaidOrder.PaidOrderSkusItem paidOrderSkusItem;
        PaidOrderListItem paidOrderListItem = new PaidOrderListItem();
        paidOrderListItem.id = paidOrder.orderId;
        paidOrderListItem.name = paidOrder.description;
        paidOrderListItem.salePrice = paidOrder.saleAmount;
        paidOrderListItem.date = paidOrder.paidAt;
        List<PaidOrder.PaidOrderSkusItem> list = paidOrder.skus;
        if (list != null && !list.isEmpty() && (paidOrderSkusItem = paidOrder.skus.get(0)) != null) {
            paidOrderListItem.productId = paidOrderSkusItem.productId;
            paidOrderListItem.img = paidOrderSkusItem.imgUrl;
        }
        return paidOrderListItem;
    }

    public static FeaturedCourseDetail toFeaturedCourseDetail(TrainingItem trainingItem) {
        FeaturedCourseDetail featuredCourseDetail = new FeaturedCourseDetail();
        featuredCourseDetail.id = Long.valueOf(trainingItem.id);
        featuredCourseDetail.name = trainingItem.name;
        featuredCourseDetail.detailImgUrl = trainingItem.detailImgUrl;
        featuredCourseDetail.actionAmount = trainingItem.actionAmount;
        featuredCourseDetail.consumption = Integer.valueOf(trainingItem.consumption);
        featuredCourseDetail.participantNumber = Integer.valueOf(trainingItem.participantNumber);
        featuredCourseDetail.externalLink = trainingItem.externalLink;
        featuredCourseDetail.isParticipate = trainingItem.isParticipate;
        featuredCourseDetail.isPurchase = i(trainingItem);
        featuredCourseDetail.isFree = isFreeFeaturedCourse(trainingItem);
        featuredCourseDetail.difficultyDegree = Integer.valueOf(trainingItem.difficultyDegree);
        featuredCourseDetail.videos = h(trainingItem);
        featuredCourseDetail.skus = g(trainingItem);
        featuredCourseDetail.isComplete = j(trainingItem);
        List<com.xiaomi.hm.health.training.api.entity.SkusItem> list = featuredCourseDetail.skus;
        if (list != null && !list.isEmpty()) {
            featuredCourseDetail.skusItem = featuredCourseDetail.skus.get(0);
        }
        featuredCourseDetail.partnerInfo = e(trainingItem);
        return featuredCourseDetail;
    }

    public static FeaturedCourseForPlay toFeaturedCourseForPlay(@NonNull TrainingItem trainingItem) {
        FeaturedCourseForPlay featuredCourseForPlay = new FeaturedCourseForPlay();
        featuredCourseForPlay.id = String.valueOf(trainingItem.id);
        featuredCourseForPlay.isParticipate = trainingItem.isParticipate;
        featuredCourseForPlay.skuId = f(trainingItem);
        featuredCourseForPlay.isFree = isFreeFeaturedCourse(trainingItem);
        boolean zI = i(trainingItem);
        if (!featuredCourseForPlay.isFree && !featuredCourseForPlay.isParticipate && zI) {
            featuredCourseForPlay.isFree = true;
        }
        ArrayList arrayList = new ArrayList();
        List<ContentItem> list = trainingItem.content;
        if (list != null) {
            Iterator<ContentItem> it2 = list.iterator();
            while (it2.hasNext()) {
                List<VideoItem> list2 = it2.next().videos;
                if (list2 != null) {
                    for (VideoItem videoItem : list2) {
                        FeaturedCourseVideo featuredCourseVideo = new FeaturedCourseVideo();
                        featuredCourseVideo.id = String.valueOf(videoItem.id);
                        featuredCourseVideo.name = videoItem.name;
                        featuredCourseVideo.consumption = videoItem.consumption;
                        if (featuredCourseForPlay.isFree || (trainingItem.isParticipate && zI)) {
                            featuredCourseVideo.isDemo = false;
                        } else {
                            featuredCourseVideo.isDemo = videoItem.isFree;
                            String str = videoItem.freeUnit;
                            if (str != null) {
                                if (TrainingWebConst.Value.VideoDemoDurationUnit.MINUTES.equals(str)) {
                                    featuredCourseVideo.demoDuration = Long.valueOf(TimeUnit.MINUTES.toMillis(videoItem.freeDuration));
                                } else if (TrainingWebConst.Value.VideoDemoDurationUnit.PERCENT.equals(videoItem.freeUnit)) {
                                    featuredCourseVideo.demoPercent = Float.valueOf((videoItem.freeDuration * 1.0f) / 100.0f);
                                } else {
                                    Loggers.getLogger().w(b, new Supplier() { // from class: r21
                                        @Override // com.xiaomi.hm.health.training.api.function.Supplier
                                        public final Object get() {
                                            return DataConverter.l();
                                        }
                                    });
                                }
                            }
                        }
                        arrayList.add(featuredCourseVideo);
                    }
                }
            }
        }
        featuredCourseForPlay.videos = arrayList;
        return featuredCourseForPlay;
    }

    public static FeaturedCourseItem toFeaturedCourseItemForStatus(@NonNull TrainingItem trainingItem) {
        Label label;
        FeaturedCourseItem featuredCourseItem = new FeaturedCourseItem();
        featuredCourseItem.id = String.valueOf(trainingItem.id);
        featuredCourseItem.name = trainingItem.name;
        featuredCourseItem.actionAmount = trainingItem.actionAmount;
        featuredCourseItem.difficultyDegree = Integer.valueOf(trainingItem.difficultyDegree);
        featuredCourseItem.participantNumber = Integer.valueOf(trainingItem.participantNumber);
        featuredCourseItem.remainingTime = trainingItem.courseRemainingTime;
        featuredCourseItem.listImgUrl = trainingItem.listImgUrl;
        List<Label> list = trainingItem.courseLabels;
        if (list != null && !list.isEmpty() && (label = trainingItem.courseLabels.get(0)) != null && label.direction.equals("right")) {
            featuredCourseItem.labelValue = label.value;
        }
        return featuredCourseItem;
    }

    @NonNull
    public static List<FeaturedCourseListItem> toFeaturedCourseList(@Nullable List<TrainingItem> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<TrainingItem> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(toFeaturedCourseListItem(it2.next()));
            }
        }
        return arrayList;
    }

    public static List<FeaturedCourseItem> toFeaturedCourseListForStatus(@Nullable List<TrainingItem> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<TrainingItem> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(toFeaturedCourseItemForStatus(it2.next()));
            }
        }
        return arrayList;
    }

    public static FeaturedCourseListItem toFeaturedCourseListItem(@NonNull TrainingItem trainingItem) {
        Label label;
        FeaturedCourseListItem featuredCourseListItem = new FeaturedCourseListItem();
        featuredCourseListItem.id = String.valueOf(trainingItem.id);
        featuredCourseListItem.name = trainingItem.name;
        featuredCourseListItem.actionAmount = trainingItem.actionAmount;
        featuredCourseListItem.difficultyDegree = Integer.valueOf(trainingItem.difficultyDegree);
        featuredCourseListItem.salePrice = Float.valueOf(trainingItem.courseCurrentPrice);
        featuredCourseListItem.participantNumber = Integer.valueOf(trainingItem.participantNumber);
        featuredCourseListItem.remainingTime = Long.valueOf(trainingItem.courseRemainingTime);
        featuredCourseListItem.listImgUrl = trainingItem.listImgUrl;
        List<Label> list = trainingItem.courseLabels;
        if (list != null && !list.isEmpty() && (label = trainingItem.courseLabels.get(0)) != null && label.direction.equals("right")) {
            featuredCourseListItem.labelValue = label.value;
        }
        return featuredCourseListItem;
    }

    @NonNull
    public static List<String> toFilterNames(@Nullable List<FilterItem> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator<FilterItem> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().name);
            }
        }
        return arrayList;
    }

    public static SimpleFeaturedCourse toSimpleFeaturedCourse(@NonNull TrainingItem trainingItem) {
        Label label;
        SimpleFeaturedCourse simpleFeaturedCourse = new SimpleFeaturedCourse();
        simpleFeaturedCourse.id = String.valueOf(trainingItem.id);
        simpleFeaturedCourse.name = trainingItem.courseTitle;
        simpleFeaturedCourse.description = trainingItem.courseDescription;
        simpleFeaturedCourse.imageUrl = trainingItem.listImgUrl;
        List<Label> list = trainingItem.courseLabels;
        if (list != null && !list.isEmpty() && (label = trainingItem.courseLabels.get(0)) != null && label.direction.equals("right")) {
            simpleFeaturedCourse.labelValue = label.value;
        }
        return simpleFeaturedCourse;
    }

    public static List<SimpleFeaturedCourse> toSimpleFeaturedCourses(@Nullable List<TrainingItem> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<TrainingItem> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(toSimpleFeaturedCourse(it2.next()));
            }
        }
        return arrayList;
    }

    public static List<TrainingKnowledge> toTrainingKnowledgeList(@Nullable List<Knowledge> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (Knowledge knowledge : list) {
                TrainingKnowledge trainingKnowledge = new TrainingKnowledge();
                trainingKnowledge.id = knowledge.id;
                trainingKnowledge.imageUrl = knowledge.imgUrl;
                trainingKnowledge.title = knowledge.title;
                trainingKnowledge.description = knowledge.description;
                trainingKnowledge.articleUrl = knowledge.url;
                trainingKnowledge.sortOrder = knowledge.sortOrder;
                arrayList.add(trainingKnowledge);
            }
        }
        return arrayList;
    }
}
