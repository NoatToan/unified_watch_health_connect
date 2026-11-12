package com.xiaomi.hm.health.training.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.huami.android.tools.pay.ali.AliPay;
import com.huami.android.tools.pay.ali.AliPayResponse;
import com.huami.android.tools.pay.wechat.WeChatPay;
import com.huami.android.tools.pay.wechat.WeChatResponse;
import com.xiaomi.hm.health.training.api.CloudTrainingDataSource;
import com.xiaomi.hm.health.training.api.bean.ContentItem;
import com.xiaomi.hm.health.training.api.bean.FilterItem;
import com.xiaomi.hm.health.training.api.bean.Items;
import com.xiaomi.hm.health.training.api.bean.SkusItem;
import com.xiaomi.hm.health.training.api.bean.TrainingItem;
import com.xiaomi.hm.health.training.api.bean.VideoItem;
import com.xiaomi.hm.health.training.api.bean.VideoPostConfig;
import com.xiaomi.hm.health.training.api.bean.VideoPosts;
import com.xiaomi.hm.health.training.api.bus.TrainingBus;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.xiaomi.hm.health.training.api.entity.ActionOrYogaTraining;
import com.xiaomi.hm.health.training.api.entity.ErrorCode;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseDetail;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseForPlay;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseItem;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseListItem;
import com.xiaomi.hm.health.training.api.entity.InstrumentsAndBodyparts;
import com.xiaomi.hm.health.training.api.entity.Listing;
import com.xiaomi.hm.health.training.api.entity.PaidOrderListItem;
import com.xiaomi.hm.health.training.api.entity.PayChannel;
import com.xiaomi.hm.health.training.api.entity.PayOrderParams;
import com.xiaomi.hm.health.training.api.entity.PayOrderResult;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.SimpleFeaturedCourse;
import com.xiaomi.hm.health.training.api.entity.StartEndVideoPost;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.api.entity.TrainingKnowledge;
import com.xiaomi.hm.health.training.api.entity.TrainingRecord;
import com.xiaomi.hm.health.training.api.entity.User;
import com.xiaomi.hm.health.training.api.entity.VideoPost;
import com.xiaomi.hm.health.training.api.entity.VideoRecord;
import com.xiaomi.hm.health.training.api.entity.VideoUrl;
import com.xiaomi.hm.health.training.api.function.Consumer;
import com.xiaomi.hm.health.training.api.function.Function;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.helper.DataConverter;
import com.xiaomi.hm.health.training.api.helper.ErrorParser;
import com.xiaomi.hm.health.training.api.paging.ActionTrainingDataSourceFactory;
import com.xiaomi.hm.health.training.api.paging.CourseOrderDataSourceFactory;
import com.xiaomi.hm.health.training.api.paging.FeaturedCourseDataSourceFactory;
import com.xiaomi.hm.health.training.api.paging.ItemKeyedTrainingKnowledgeDataSource;
import com.xiaomi.hm.health.training.api.paging.PageKeyedActionTrainingDataSource;
import com.xiaomi.hm.health.training.api.paging.PageKeyedCourseOrderDataSource;
import com.xiaomi.hm.health.training.api.paging.PageKeyedFeaturedCourseDataSource;
import com.xiaomi.hm.health.training.api.paging.TrainingKnowledgeDataSourceFactory;
import com.xiaomi.hm.health.training.api.util.Loggers;
import defpackage.lu0;
import defpackage.uv0;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes21.dex */
public class CloudTrainingDataSource implements TrainingDataSource {
    private static final String f = "Train-CloudTrainingDataSource";
    private Context a;
    private IWebApi b;
    private Provider<User> c;
    private Provider<String> d;
    private com.xiaomi.hm.health.training.api.b e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends MutableLiveData<T> {
        private AtomicBoolean a = new AtomicBoolean(false);
        public final /* synthetic */ Consumer b;

        public a(Consumer consumer) {
            this.b = consumer;
        }

        @Override // androidx.p008lifecycle.LiveData
        public void onActive() {
            if (this.a.compareAndSet(false, true)) {
                this.b.accept(this);
            }
        }

        @Override // androidx.p008lifecycle.LiveData
        public void onInactive() {
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PayChannel.values().length];
            a = iArr;
            try {
                iArr[PayChannel.WECHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PayChannel.ALIPAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public CloudTrainingDataSource(@NonNull Context context, @NonNull Provider<User> provider, @NonNull Provider<String> provider2) {
        this.a = context;
        this.c = provider;
        this.d = provider2;
        this.e = new com.xiaomi.hm.health.training.api.b(context);
        this.b = new e(new l(), this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(PayOrderParams payOrderParams, MutableLiveData mutableLiveData, Resource resource) throws Exception {
        List<SkusItem> list;
        if (resource.getStatus() == Status.SUCCESS) {
            String str = payOrderParams.courseId;
            if (str != null) {
                boolean z = false;
                TrainingItem trainingItemB = this.e.b(str);
                if (trainingItemB != null && (list = trainingItemB.skus) != null && !list.isEmpty()) {
                    for (SkusItem skusItem : trainingItemB.skus) {
                        if (TextUtils.equals(payOrderParams.skuId, skusItem.skuId)) {
                            skusItem.isPurchased = Boolean.TRUE;
                            z = true;
                            Loggers.getLogger().v(f, new Supplier() { // from class: hu0
                                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                                public final Object get() {
                                    return CloudTrainingDataSource.x0();
                                }
                            });
                            break;
                        }
                    }
                }
                if (!z) {
                    Loggers.getLogger().w(f, new Supplier() { // from class: du0
                        @Override // com.xiaomi.hm.health.training.api.function.Supplier
                        public final Object get() {
                            return CloudTrainingDataSource.y0();
                        }
                    });
                }
            } else {
                Loggers.getLogger().w(f, new Supplier() { // from class: cu0
                    @Override // com.xiaomi.hm.health.training.api.function.Supplier
                    public final Object get() {
                        return CloudTrainingDataSource.z0();
                    }
                });
            }
        }
        mutableLiveData.postValue(new PayOrderResult.PayResult(resource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object A1(boolean z, TrainingRecord trainingRecord) {
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[2];
        objArr[0] = z ? "成功" : "失败";
        objArr[1] = trainingRecord;
        return String.format(locale, "训练历史记录上传至云端，并更新数据库%s，%s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B0(PayOrderParams payOrderParams, MutableLiveData mutableLiveData, Throwable th) throws Exception {
        mutableLiveData.postValue(new PayOrderResult.PayResult(ErrorParser.toErrorResource(th, payOrderParams.payChannel, "支付精品课程")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ TrainingRecord B1(final TrainingRecord trainingRecord) throws Exception {
        String str;
        int i;
        List<VideoItem> list;
        TrainingItem trainingItemB = this.e.b(trainingRecord.trainingId);
        if (trainingItemB != null) {
            trainingItemB.finishNumber++;
            Function function = new Function() { // from class: qt0
                @Override // com.xiaomi.hm.health.training.api.function.Function
                public final Object apply(Object obj) {
                    return CloudTrainingDataSource.y1(trainingRecord, (VideoItem) obj);
                }
            };
            List<ContentItem> list2 = trainingItemB.content;
            if (list2 != null) {
                for (ContentItem contentItem : list2) {
                    if (contentItem != null && (list = contentItem.videos) != null) {
                        for (VideoItem videoItem : list) {
                            VideoRecord videoRecord = (VideoRecord) function.apply(videoItem);
                            if (videoRecord != null) {
                                videoItem.participantNumber += (long) videoRecord.watchedCount;
                            }
                        }
                    }
                }
            }
            str = trainingItemB.name;
            i = trainingItemB.finishNumber;
        } else {
            str = null;
            i = 0;
        }
        final boolean zD = j.d(trainingRecord, str, i, false, null);
        Loggers.getLogger().v(f, new Supplier() { // from class: wt0
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return CloudTrainingDataSource.z1(zD, trainingRecord);
            }
        });
        final boolean zD2 = j.d(trainingRecord, str, i, true, Long.valueOf(this.b.uploadHistoryRecord(this.c.get().getUid(), trainingRecord.trainingId, trainingRecord.startTime, trainingRecord.endTime, trainingRecord.duration, trainingRecord.consumption, trainingRecord.watchedVideos)));
        Loggers.getLogger().v(f, new Supplier() { // from class: xt0
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return CloudTrainingDataSource.A1(zD2, trainingRecord);
            }
        });
        return trainingRecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean C0(Resource resource) throws Exception {
        return resource.getStatus() == Status.SUCCESS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C1(MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, Resource resource) throws Exception {
        mutableLiveData.postValue(resource);
        mutableLiveData2.postValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean D0(PayOrderParams payOrderParams, Resource resource) throws Exception {
        return Boolean.valueOf(this.b.joinTraining(this.c.get().getUid(), payOrderParams.courseId, payOrderParams.skuId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D1(TrainingRecord trainingRecord, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, Throwable th) throws Exception {
        Resource errorResource = ErrorParser.toErrorResource(th, trainingRecord, "保存训练历史记录");
        mutableLiveData.postValue(errorResource);
        mutableLiveData2.postValue(errorResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(MutableLiveData mutableLiveData, PayOrderParams payOrderParams, Boolean bool) throws Exception {
        TrainingItem trainingItemB;
        mutableLiveData.setValue(new PayOrderResult.JoinResult(Resource.success(bool)));
        if (!bool.booleanValue() || (trainingItemB = this.e.b(payOrderParams.courseId)) == null) {
            return;
        }
        TrainingBus.joinedFeaturedCourse().postValue(Resource.success(DataConverter.toSimpleFeaturedCourse(trainingItemB)));
    }

    private static <T> LiveData<Resource<T>> E1(@NonNull final String str, @NonNull final Flowable<Resource<T>> flowable) {
        return o0(new Consumer() { // from class: vw0
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                CloudTrainingDataSource.M0(flowable, str, (MutableLiveData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F0(MutableLiveData mutableLiveData, Throwable th) throws Exception {
        mutableLiveData.setValue(new PayOrderResult.JoinResult(ErrorParser.toErrorResource(th, "参加精品课程")));
    }

    private Resource<PayChannel> F1(@NonNull Activity activity, @NonNull final String str) {
        String code;
        Loggers.getLogger().d(f, new Supplier() { // from class: ut0
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return CloudTrainingDataSource.p1(str);
            }
        });
        final AliPayResponse aliPayResponsePay = new AliPay().pay(activity, str);
        if (aliPayResponsePay.isSuccessful()) {
            Loggers.getLogger().d(f, new Supplier() { // from class: fu0
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return CloudTrainingDataSource.q1();
                }
            });
            return Resource.success(PayChannel.ALIPAY);
        }
        if ("6001".equals(aliPayResponsePay.getCode())) {
            Loggers.getLogger().d(f, new Supplier() { // from class: yt0
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return CloudTrainingDataSource.r1();
                }
            });
            code = ErrorCode.PAYMENT_CANCELLED;
        } else {
            code = aliPayResponsePay.getCode();
            Loggers.getLogger().w(f, new Supplier() { // from class: rt0
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return CloudTrainingDataSource.s1(aliPayResponsePay);
                }
            });
        }
        return Resource.error(code, aliPayResponsePay.getMessage(), PayChannel.ALIPAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VideoPost G0(VideoPosts.Post post) {
        if (post == null) {
            return null;
        }
        long jA = f.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (timeUnit.toMillis(post.startTime) > jA || jA > timeUnit.toMillis(post.endTime) || !i.b(this.a, post.picture)) {
            return null;
        }
        VideoPost videoPost = new VideoPost();
        videoPost.imageUrl = post.picture;
        videoPost.duration = timeUnit.toMillis(post.duration);
        return videoPost;
    }

    private Resource<PayChannel> G1(@NonNull Activity activity, @NonNull final String str) {
        String strValueOf;
        Loggers.getLogger().d(f, new Supplier() { // from class: vt0
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return CloudTrainingDataSource.t1(str);
            }
        });
        final WeChatResponse weChatResponsePay = WeChatPay.pay(activity, str);
        if (weChatResponsePay.getCode() == 0) {
            Loggers.getLogger().d(f, new Supplier() { // from class: au0
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return CloudTrainingDataSource.u1();
                }
            });
            return Resource.success(PayChannel.WECHAT);
        }
        if (weChatResponsePay.getCode() == -2) {
            Loggers.getLogger().d(f, new Supplier() { // from class: bu0
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return CloudTrainingDataSource.v1();
                }
            });
            strValueOf = ErrorCode.PAYMENT_CANCELLED;
        } else {
            strValueOf = String.valueOf(weChatResponsePay.getCode());
            Loggers.getLogger().w(f, new Supplier() { // from class: st0
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return CloudTrainingDataSource.w1(weChatResponsePay);
                }
            });
        }
        return Resource.error(strValueOf, weChatResponsePay.getMessage(), PayChannel.WECHAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean H0(String str, String str2) throws Exception {
        return Boolean.valueOf(this.b.joinTraining(this.c.get().getUid(), str, str2));
    }

    private static <T> io.reactivex.functions.Consumer<Throwable> H1(final MutableLiveData<Resource<T>> mutableLiveData, final String str) {
        return new io.reactivex.functions.Consumer() { // from class: bv0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CloudTrainingDataSource.x1(str, mutableLiveData, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(String str, MutableLiveData mutableLiveData, Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            Resource<SimpleFeaturedCourse> resourceError = Resource.error(ErrorCode.NOT_FOUND, "学习课程失败", null);
            TrainingBus.joinedFeaturedCourse().postValue(resourceError);
            mutableLiveData.setValue(resourceError);
            return;
        }
        TrainingItem trainingItemB = this.e.b(str);
        if (trainingItemB == null) {
            TrainingBus.joinedFeaturedCourse().postValue(Resource.success(null));
            mutableLiveData.setValue(null);
        } else {
            Resource<SimpleFeaturedCourse> resourceSuccess = Resource.success(DataConverter.toSimpleFeaturedCourse(trainingItemB));
            TrainingBus.joinedFeaturedCourse().postValue(resourceSuccess);
            mutableLiveData.setValue(resourceSuccess);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J0(MutableLiveData mutableLiveData, Throwable th) throws Exception {
        Resource<SimpleFeaturedCourse> errorResource = ErrorParser.toErrorResource(th, null, "学习课程");
        TrainingBus.joinedFeaturedCourse().postValue(errorResource);
        mutableLiveData.setValue(errorResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K0(ActionTrainingDataSourceFactory actionTrainingDataSourceFactory) {
        PageKeyedActionTrainingDataSource value = actionTrainingDataSourceFactory.getSourceLiveData().getValue();
        if (value != null) {
            value.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L0(ActionTrainingDataSourceFactory actionTrainingDataSourceFactory) {
        PageKeyedActionTrainingDataSource value = actionTrainingDataSourceFactory.getSourceLiveData().getValue();
        if (value != null) {
            value.retryAllFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M0(Flowable flowable, String str, MutableLiveData mutableLiveData) {
        Flowable flowableObserveOn = flowable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Objects.requireNonNull(mutableLiveData);
        flowableObserveOn.subscribe(new lu0(mutableLiveData), H1(mutableLiveData, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ TrainingItem N0(String str) throws Exception {
        return this.b.loadTrainingDetail(str, Boolean.valueOf(this.c.get().isMale()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O0(FeaturedCourseDataSourceFactory featuredCourseDataSourceFactory) {
        PageKeyedFeaturedCourseDataSource value = featuredCourseDataSourceFactory.getSourceLiveData().getValue();
        if (value != null) {
            value.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P0(FeaturedCourseDataSourceFactory featuredCourseDataSourceFactory) {
        PageKeyedFeaturedCourseDataSource value = featuredCourseDataSourceFactory.getSourceLiveData().getValue();
        if (value != null) {
            value.retryAllFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Items Q0() throws Exception {
        return this.b.loadTrainings("EXCELLENT_COURSE", TrainingWebConst.Value.DisplayLocation.SPORT_PAGE, Boolean.valueOf(this.c.get().isMale()), this.d.get(), null, null, null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List R0(Items items) throws Exception {
        return DataConverter.toSimpleFeaturedCourses(items.items);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Items S0(String str) throws Exception {
        return this.b.loadTrainings("EXCELLENT_COURSE", null, Boolean.valueOf(this.c.get().isMale()), this.d.get(), null, null, null, null, null, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List T0(Items items) throws Exception {
        return DataConverter.toFeaturedCourseListForStatus(items.items);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ TrainingItem U0(String str) throws Exception {
        return this.e.b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(FeaturedCourseForPlay featuredCourseForPlay) throws Exception {
        featuredCourseForPlay.videoPosts = p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Items W0() throws Exception {
        return this.b.loadTrainings("EXCELLENT_COURSE", TrainingWebConst.Value.DisplayLocation.STATUS_PAGE, Boolean.valueOf(this.c.get().isMale()), this.d.get(), null, null, null, null, 6, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List X0(Items items) throws Exception {
        return DataConverter.toFeaturedCourseListForStatus(items.items);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VideoUrl Y0(String str, String str2) throws Exception {
        return this.b.loadVideoUrls(this.c.get().getUid(), str2, Collections.singletonList(str)).get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InstrumentsAndBodyparts Z0() throws Exception {
        Items<FilterItem> itemsLoadInstruments = this.b.loadInstruments();
        Items<FilterItem> itemsLoadBodyParts = this.b.loadBodyParts();
        InstrumentsAndBodyparts instrumentsAndBodyparts = new InstrumentsAndBodyparts();
        instrumentsAndBodyparts.instruments = DataConverter.toFilterNames(itemsLoadInstruments.items);
        instrumentsAndBodyparts.bodyparts = DataConverter.toFilterNames(itemsLoadBodyParts.items);
        return instrumentsAndBodyparts;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a1(CourseOrderDataSourceFactory courseOrderDataSourceFactory) {
        PageKeyedCourseOrderDataSource value = courseOrderDataSourceFactory.getSourceLiveData().getValue();
        if (value != null) {
            value.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b1(CourseOrderDataSourceFactory courseOrderDataSourceFactory) {
        PageKeyedCourseOrderDataSource value = courseOrderDataSourceFactory.getSourceLiveData().getValue();
        if (value != null) {
            value.retryAllFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Items c1(Long l) throws Exception {
        return this.b.loadTrainings("EXCELLENT_COURSE", TrainingWebConst.Value.DisplayLocation.DETAIL_PAGE, Boolean.valueOf(this.c.get().isMale()), this.d.get(), null, null, null, null, null, null, l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List d1(Items items) throws Exception {
        return DataConverter.toFeaturedCourseListForStatus(items.items);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e1(TrainingKnowledgeDataSourceFactory trainingKnowledgeDataSourceFactory) {
        ItemKeyedTrainingKnowledgeDataSource value = trainingKnowledgeDataSourceFactory.getSourceLiveData().getValue();
        if (value != null) {
            value.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f1(TrainingKnowledgeDataSourceFactory trainingKnowledgeDataSourceFactory) {
        ItemKeyedTrainingKnowledgeDataSource value = trainingKnowledgeDataSourceFactory.getSourceLiveData().getValue();
        if (value != null) {
            value.retryAllFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g1() {
        return "加载用户信息出错";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h1(Throwable th) throws Exception {
        Loggers.getLogger().w(f, new Supplier() { // from class: gu0
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return CloudTrainingDataSource.g1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i1(final MutableLiveData mutableLiveData) {
        final Provider<User> provider = this.c;
        Objects.requireNonNull(provider);
        Flowable flowableObserveOn = Flowable.fromCallable(new Callable() { // from class: tw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (User) provider.get();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Objects.requireNonNull(mutableLiveData);
        flowableObserveOn.subscribe(new io.reactivex.functions.Consumer() { // from class: mu0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                mutableLiveData.setValue((User) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: cv0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CloudTrainingDataSource.h1((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VideoPostConfig j1() throws Exception {
        return this.b.loadVideoPost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object k1() {
        return "缓存了精品课程视频前后帖信息";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object l1() {
        return "未配置精品课程视频前后贴";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m1(VideoPostConfig videoPostConfig) throws Exception {
        VideoPosts videoPosts = videoPostConfig.videoPosts;
        if (videoPosts == null) {
            Loggers.getLogger().v(f, new Supplier() { // from class: iu0
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return CloudTrainingDataSource.l1();
                }
            });
            return;
        }
        this.e.f(videoPosts);
        VideoPosts.Post post = videoPostConfig.videoPosts.front;
        if (post != null) {
            i.a(this.a, post.picture);
        }
        VideoPosts.Post post2 = videoPostConfig.videoPosts.back;
        if (post2 != null) {
            i.a(this.a, post2.picture);
        }
        Loggers.getLogger().v(f, new Supplier() { // from class: eu0
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return CloudTrainingDataSource.k1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object n1() {
        return "加载精品课程视频前后贴信息时发生错误";
    }

    private static <T> MutableLiveData<T> o0(Consumer<MutableLiveData<T>> consumer) {
        return new a(consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o1(Throwable th) throws Exception {
        Loggers.getLogger().w(f, th, new Supplier() { // from class: ju0
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return CloudTrainingDataSource.n1();
            }
        });
    }

    @Nullable
    private StartEndVideoPost p0() {
        VideoPosts videoPostsC = this.e.c();
        if (videoPostsC == null) {
            return null;
        }
        Function function = new Function() { // from class: pt0
            @Override // com.xiaomi.hm.health.training.api.function.Function
            public final Object apply(Object obj) {
                return this.a.G0((VideoPosts.Post) obj);
            }
        };
        StartEndVideoPost startEndVideoPost = new StartEndVideoPost();
        startEndVideoPost.startPost = (VideoPost) function.apply(videoPostsC.front);
        startEndVideoPost.endPost = (VideoPost) function.apply(videoPostsC.back);
        return startEndVideoPost;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object p1(String str) {
        return "启动支付宝支付" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean q0(String str, String str2) throws Exception {
        return Boolean.valueOf(this.b.exitTraining(this.c.get().getUid(), str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q1() {
        return "支付宝支付成功";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r0(Boolean bool, String str, String str2) {
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[3];
        objArr[0] = bool.booleanValue() ? "成功" : "失败";
        objArr[1] = str;
        objArr[2] = str2;
        return String.format(locale, "退出训练%s，trainingId: %s , skuId: %s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r1() {
        return "取消了支付宝支付";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(final String str, final String str2, final Boolean bool) throws Exception {
        Loggers.getLogger().v(f, new Supplier() { // from class: tt0
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return CloudTrainingDataSource.r0(bool, str, str2);
            }
        });
        if (bool.booleanValue()) {
            TrainingItem trainingItemB = this.e.b(str);
            if (trainingItemB != null) {
                TrainingBus.exitedFeaturedCourse().postValue(DataConverter.toSimpleFeaturedCourse(trainingItemB));
            } else {
                TrainingBus.exitedFeaturedCourse().postValue(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object s1(AliPayResponse aliPayResponse) {
        return String.format(Locale.CHINA, "支付宝支付失败, code: %s, msg: %s", aliPayResponse.getCode(), aliPayResponse.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String t0(PayOrderParams payOrderParams) throws Exception {
        return this.b.generatePayOrder(this.c.get().getUid(), payOrderParams.payChannel, payOrderParams.skuId, payOrderParams.description);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object t1(String str) {
        return "启动微信支付" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u0(MutableLiveData mutableLiveData, String str) throws Exception {
        mutableLiveData.postValue(new PayOrderResult.OrderResult(Resource.success(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object u1() {
        return "微信支付成功";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v0(MutableLiveData mutableLiveData, Throwable th) throws Exception {
        mutableLiveData.postValue(new PayOrderResult.OrderResult(ErrorParser.toErrorResource(th, null, "生成付费精品课程的订单")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object v1() {
        return "取消了微信支付";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource w0(PayOrderParams payOrderParams, Activity activity, String str) throws Exception {
        int i = b.a[payOrderParams.payChannel.ordinal()];
        if (i == 1) {
            return G1(activity, str);
        }
        if (i == 2) {
            return F1(activity, str);
        }
        throw new IllegalArgumentException("不支持的支付渠道: " + payOrderParams.payChannel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object w1(WeChatResponse weChatResponse) {
        return String.format(Locale.CHINA, "微信支付失败, code: %s, msg: %s", Integer.valueOf(weChatResponse.getCode()), weChatResponse.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object x0() {
        return "支付成功，课程信息缓存信息已标记为已购买";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x1(String str, MutableLiveData mutableLiveData, Throwable th) throws Exception {
        mutableLiveData.postValue(ErrorParser.toErrorResource(th, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object y0() {
        return "支付成功，期望更新课程信息缓存，但未能找到缓存或未能找到对应的skuId";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ VideoRecord y1(TrainingRecord trainingRecord, VideoItem videoItem) {
        for (VideoRecord videoRecord : trainingRecord.watchedVideos) {
            if (TextUtils.equals(videoRecord.id, String.valueOf(videoItem.id))) {
                return videoRecord;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object z0() {
        return "支付成功，期望更新课程信息缓存，但缺少课程id参数";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object z1(boolean z, TrainingRecord trainingRecord) {
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[2];
        objArr[0] = z ? "成功" : "失败";
        objArr[1] = trainingRecord;
        return String.format(locale, "训练历史记录保存到数据库%s，%s", objArr);
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    @SuppressLint({"CheckResult"})
    public LiveData<Resource<Boolean>> exitTrainings(@NonNull final String str, final String str2) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        Flowable.fromCallable(new Callable() { // from class: qw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.q0(str, str2);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: yu0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.s0(str, str2, (Boolean) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: tv0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Resource.success((Boolean) obj);
            }
        }).startWith(Resource.loading(null)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new lu0(mutableLiveData), H1(mutableLiveData, "退出训练"));
        return mutableLiveData;
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    @SuppressLint({"CheckResult"})
    public LiveData<PayOrderResult> generateOrderAndPayForFeaturedCourse(@NonNull final Activity activity, @NonNull final PayOrderParams payOrderParams) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.postValue(new PayOrderResult.OrderResult(Resource.loading(null)));
        Flowable.fromCallable(new Callable() { // from class: jw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.t0(payOrderParams);
            }
        }).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).doOnNext(new io.reactivex.functions.Consumer() { // from class: nu0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CloudTrainingDataSource.u0(mutableLiveData, (String) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: ou0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CloudTrainingDataSource.v0(mutableLiveData, (Throwable) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: fv0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.w0(payOrderParams, activity, (String) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: wu0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.A0(payOrderParams, mutableLiveData, (Resource) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: zu0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CloudTrainingDataSource.B0(payOrderParams, mutableLiveData, (Throwable) obj);
            }
        }).filter(new Predicate() { // from class: vv0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return CloudTrainingDataSource.C0((Resource) obj);
            }
        }).onErrorResumeNext(Flowable.empty()).map(new io.reactivex.functions.Function() { // from class: ev0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.D0(payOrderParams, (Resource) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: uu0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.E0(mutableLiveData, payOrderParams, (Boolean) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: pu0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CloudTrainingDataSource.F0(mutableLiveData, (Throwable) obj);
            }
        });
        return mutableLiveData;
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    @SuppressLint({"CheckResult"})
    public LiveData<Resource<SimpleFeaturedCourse>> joinTrainings(@NonNull final String str, final String str2) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Resource.loading(null));
        Flowable.fromCallable(new Callable() { // from class: rw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.H0(str, str2);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: xu0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.I0(str, mutableLiveData, (Boolean) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: qu0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CloudTrainingDataSource.J0(mutableLiveData, (Throwable) obj);
            }
        });
        return mutableLiveData;
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    public Listing<ActionOrYogaTraining> loadActionOrYogaTrainings(@NonNull Supplier<String> supplier, @NonNull Supplier<String> supplier2, @NonNull Supplier<String> supplier3) {
        final ActionTrainingDataSourceFactory actionTrainingDataSourceFactory = new ActionTrainingDataSourceFactory(this.b, this.c, ArchTaskExecutor.getIOThreadExecutor(), supplier, supplier2, supplier3);
        return new Listing<>(new LivePagedListBuilder(actionTrainingDataSourceFactory, new PagedList.Config.Builder().setEnablePlaceholders(false).setInitialLoadSizeHint(15).setPageSize(15).build()).build(), Transformations.switchMap(actionTrainingDataSourceFactory.getSourceLiveData(), new androidx.arch.core.util.Function() { // from class: vu0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ((PageKeyedActionTrainingDataSource) obj).getNetworkState();
            }
        }), Transformations.switchMap(actionTrainingDataSourceFactory.getSourceLiveData(), new androidx.arch.core.util.Function() { // from class: ku0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ((PageKeyedActionTrainingDataSource) obj).getInitialLoad();
            }
        }), new Runnable() { // from class: xv0
            @Override // java.lang.Runnable
            public final void run() {
                CloudTrainingDataSource.K0(actionTrainingDataSourceFactory);
            }
        }, new Runnable() { // from class: wv0
            @Override // java.lang.Runnable
            public final void run() {
                CloudTrainingDataSource.L0(actionTrainingDataSourceFactory);
            }
        });
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    public LiveData<Resource<FeaturedCourseDetail>> loadFeaturedCoursesForDetail(final String str) {
        return E1("加载精品课程详情", Flowable.fromCallable(new Callable() { // from class: ow0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.N0(str);
            }
        }).map(new io.reactivex.functions.Function() { // from class: lv0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return DataConverter.toFeaturedCourseDetail((TrainingItem) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: nv0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Resource.success((FeaturedCourseDetail) obj);
            }
        }).startWith(Resource.loading(null)));
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    public Listing<FeaturedCourseListItem> loadFeaturedCoursesForList() {
        final FeaturedCourseDataSourceFactory featuredCourseDataSourceFactory = new FeaturedCourseDataSourceFactory(this.b, this.c, ArchTaskExecutor.getIOThreadExecutor());
        return new Listing<>(new LivePagedListBuilder(featuredCourseDataSourceFactory, new PagedList.Config.Builder().setEnablePlaceholders(false).setInitialLoadSizeHint(15).setPageSize(15).build()).build(), Transformations.switchMap(featuredCourseDataSourceFactory.getSourceLiveData(), new androidx.arch.core.util.Function() { // from class: nw0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ((PageKeyedFeaturedCourseDataSource) obj).getNetworkState();
            }
        }), Transformations.switchMap(featuredCourseDataSourceFactory.getSourceLiveData(), new androidx.arch.core.util.Function() { // from class: cw0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ((PageKeyedFeaturedCourseDataSource) obj).getInitialLoad();
            }
        }), new Runnable() { // from class: aw0
            @Override // java.lang.Runnable
            public final void run() {
                CloudTrainingDataSource.O0(featuredCourseDataSourceFactory);
            }
        }, new Runnable() { // from class: bw0
            @Override // java.lang.Runnable
            public final void run() {
                CloudTrainingDataSource.P0(featuredCourseDataSourceFactory);
            }
        });
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    public LiveData<Resource<List<SimpleFeaturedCourse>>> loadFeaturedCoursesForMain() {
        return E1("加载训练首页的精品课程列表", Flowable.fromCallable(new Callable() { // from class: iw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.Q0();
            }
        }).map(new io.reactivex.functions.Function() { // from class: iv0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CloudTrainingDataSource.R0((Items) obj);
            }
        }).map(uv0.a));
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    public LiveData<Resource<List<FeaturedCourseItem>>> loadFeaturedCoursesForPartner(final String str) {
        return E1("加载合作方精品课程列表", Flowable.fromCallable(new Callable() { // from class: mw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.S0(str);
            }
        }).map(new io.reactivex.functions.Function() { // from class: kv0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CloudTrainingDataSource.T0((Items) obj);
            }
        }).map(uv0.a).startWith(Resource.loading(null)));
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    public LiveData<Resource<FeaturedCourseForPlay>> loadFeaturedCoursesForPlay(@NonNull final String str) {
        return E1("加载精品课程播放页视频列表", Flowable.fromCallable(new Callable() { // from class: pw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.U0(str);
            }
        }).map(new io.reactivex.functions.Function() { // from class: mv0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return DataConverter.toFeaturedCourseForPlay((TrainingItem) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: tu0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.V0((FeaturedCourseForPlay) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: ov0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Resource.success((FeaturedCourseForPlay) obj);
            }
        }));
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    public LiveData<Resource<List<FeaturedCourseItem>>> loadFeaturedCoursesForStatus() {
        return E1("加载状态首页的精品课程列表", Flowable.fromCallable(new Callable() { // from class: fw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.W0();
            }
        }).map(new io.reactivex.functions.Function() { // from class: jv0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CloudTrainingDataSource.X0((Items) obj);
            }
        }).map(uv0.a));
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    public LiveData<Resource<VideoUrl>> loadFeaturedCoursesVideoUrl(@NonNull final String str, @NonNull final String str2) {
        return E1("加载精品课程视频播放地址", Flowable.fromCallable(new Callable() { // from class: sw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.Y0(str2, str);
            }
        }).map(new io.reactivex.functions.Function() { // from class: sv0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Resource.success((VideoUrl) obj);
            }
        }).startWith(Resource.loading(null)));
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    public LiveData<Resource<InstrumentsAndBodyparts>> loadInstrumentsAndBodyparts() {
        return E1("加载训练器械和训练部位过滤项", Flowable.fromCallable(new Callable() { // from class: gw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.Z0();
            }
        }).map(new io.reactivex.functions.Function() { // from class: pv0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Resource.success((InstrumentsAndBodyparts) obj);
            }
        }));
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    public Listing<PaidOrderListItem> loadPaidOrderForList() {
        final CourseOrderDataSourceFactory courseOrderDataSourceFactory = new CourseOrderDataSourceFactory(this.b, this.c, ArchTaskExecutor.getIOThreadExecutor());
        return new Listing<>(new LivePagedListBuilder(courseOrderDataSourceFactory, new PagedList.Config.Builder().setEnablePlaceholders(false).setInitialLoadSizeHint(20).setPageSize(20).build()).build(), Transformations.switchMap(courseOrderDataSourceFactory.getSourceLiveData(), new androidx.arch.core.util.Function() { // from class: rv0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ((PageKeyedCourseOrderDataSource) obj).getNetworkState();
            }
        }), Transformations.switchMap(courseOrderDataSourceFactory.getSourceLiveData(), new androidx.arch.core.util.Function() { // from class: gv0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ((PageKeyedCourseOrderDataSource) obj).getInitialLoad();
            }
        }), new Runnable() { // from class: zv0
            @Override // java.lang.Runnable
            public final void run() {
                CloudTrainingDataSource.a1(courseOrderDataSourceFactory);
            }
        }, new Runnable() { // from class: yv0
            @Override // java.lang.Runnable
            public final void run() {
                CloudTrainingDataSource.b1(courseOrderDataSourceFactory);
            }
        });
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    public LiveData<Resource<List<FeaturedCourseItem>>> loadRecommendedCoursesForDetail(final Long l) {
        return E1("加载课程详情相关推荐课程列表", Flowable.fromCallable(new Callable() { // from class: lw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c1(l);
            }
        }).map(new io.reactivex.functions.Function() { // from class: hv0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CloudTrainingDataSource.d1((Items) obj);
            }
        }).map(uv0.a));
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    public Listing<TrainingKnowledge> loadTrainingKnowledge() {
        final TrainingKnowledgeDataSourceFactory trainingKnowledgeDataSourceFactory = new TrainingKnowledgeDataSourceFactory(this.b, this.c, ArchTaskExecutor.getIOThreadExecutor());
        return new Listing<>(new LivePagedListBuilder(trainingKnowledgeDataSourceFactory, new PagedList.Config.Builder().setEnablePlaceholders(false).setInitialLoadSizeHint(15).setPageSize(15).build()).build(), Transformations.switchMap(trainingKnowledgeDataSourceFactory.getSourceLiveData(), new androidx.arch.core.util.Function() { // from class: zt0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ((ItemKeyedTrainingKnowledgeDataSource) obj).getNetworkState();
            }
        }), Transformations.switchMap(trainingKnowledgeDataSourceFactory.getSourceLiveData(), new androidx.arch.core.util.Function() { // from class: ot0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ((ItemKeyedTrainingKnowledgeDataSource) obj).getInitialLoad();
            }
        }), new Runnable() { // from class: dw0
            @Override // java.lang.Runnable
            public final void run() {
                CloudTrainingDataSource.e1(trainingKnowledgeDataSourceFactory);
            }
        }, new Runnable() { // from class: ew0
            @Override // java.lang.Runnable
            public final void run() {
                CloudTrainingDataSource.f1(trainingKnowledgeDataSourceFactory);
            }
        });
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    @SuppressLint({"CheckResult"})
    public LiveData<User> loadUser() {
        return o0(new Consumer() { // from class: uw0
            @Override // com.xiaomi.hm.health.training.api.function.Consumer
            public final void accept(Object obj) {
                this.a.i1((MutableLiveData) obj);
            }
        });
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    @SuppressLint({"CheckResult"})
    public void loadVideoPosts() {
        Flowable.fromCallable(new Callable() { // from class: hw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.j1();
            }
        }).subscribeOn(Schedulers.io()).subscribe(new io.reactivex.functions.Consumer() { // from class: su0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.m1((VideoPostConfig) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: dv0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CloudTrainingDataSource.o1((Throwable) obj);
            }
        });
    }

    @Override // com.xiaomi.hm.health.training.api.TrainingDataSource
    @SuppressLint({"CheckResult"})
    public LiveData<Resource<TrainingRecord>> saveTrainingRecord(@NonNull final TrainingRecord trainingRecord) {
        final MutableLiveData<Resource<TrainingRecord>> mutableLiveDataFinishedCourseTraining = TrainingBus.finishedCourseTraining();
        final MutableLiveData mutableLiveData = new MutableLiveData();
        Flowable.fromCallable(new Callable() { // from class: kw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.B1(trainingRecord);
            }
        }).map(new io.reactivex.functions.Function() { // from class: qv0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Resource.success((TrainingRecord) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: ru0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CloudTrainingDataSource.C1(mutableLiveData, mutableLiveDataFinishedCourseTraining, (Resource) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: av0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CloudTrainingDataSource.D1(trainingRecord, mutableLiveData, mutableLiveDataFinishedCourseTraining, (Throwable) obj);
            }
        });
        return mutableLiveData;
    }
}
