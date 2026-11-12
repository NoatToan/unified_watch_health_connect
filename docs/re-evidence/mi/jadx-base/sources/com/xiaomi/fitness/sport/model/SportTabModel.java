package com.xiaomi.fitness.sport.model;

import com.example.statistics.export.OneTrackExtKt;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerItem;
import com.fitness.banner.export.BannerRequestParam;
import com.fitness.banner.export.BusinessKey;
import com.fitness.banner.export.IBanner;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.sport.bean.BaseSportItemBean;
import com.xiaomi.fitness.sport.bean.CourseRecommendBean;
import com.xiaomi.fitness.sport.bean.JustDanceBean;
import com.xiaomi.fitness.sport.bean.LaunchSportEntrance;
import com.xiaomi.fitness.sport.bean.LocalSportBean;
import com.xiaomi.fitness.sport.bean.MotionSensingSportBean;
import com.xiaomi.fitness.sport.bean.NormalSportBean;
import com.xiaomi.fitness.sport.bean.RecommendSportBean;
import com.xiaomi.fitness.sport.bean.RecommendSportListBean;
import com.xiaomi.fitness.sport.extension.DeviceModelExtKt;
import com.xiaomi.fitness.sport.interfaces.ISportDataListener;
import com.xiaomi.fitness.sport.model.SportTabModel;
import defpackage.c1j;
import defpackage.eoi;
import defpackage.k02;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J \u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001dR \u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u001e\u0010\n\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u000b¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport/model/SportTabModel;", "Lcom/xiaomi/fitness/sport/model/SportModel;", "", "Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;", "<init>", "()V", "normalSportList", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "sportTitle", "", "", "Lkotlin/jvm/internal/EnhancedNullability;", "getSportTitle", "()[Ljava/lang/String;", "[Ljava/lang/String;", "firstCollect", "", "courseFlag", "buildRunningRouteData", "", "buildNormalSportList", "buildLocalSportList", "refresh", "reqCourseRecommend", "ifAnySupportJustDance", "loadBannerList", "group", "", OneTrackExtKt.KEY_BUSINESS, "count", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportTabModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportTabModel.kt\ncom/xiaomi/fitness/sport/model/SportTabModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,250:1\n388#2,7:251\n*S KotlinDebug\n*F\n+ 1 SportTabModel.kt\ncom/xiaomi/fitness/sport/model/SportTabModel\n*L\n232#1:251,7\n*E\n"})
public final class SportTabModel extends SportModel<List<BaseSportItemBean>> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Integer[] sportImg = {Integer.valueOf(eoi.L1), Integer.valueOf(eoi.L1), Integer.valueOf(eoi.L1), Integer.valueOf(eoi.L1), Integer.valueOf(eoi.L1)};

    @NotNull
    private static final Integer[] sportLogo = {Integer.valueOf(eoi.o), Integer.valueOf(eoi.E), Integer.valueOf(eoi.f), Integer.valueOf(eoi.v), Integer.valueOf(eoi.g)};
    private final boolean courseFlag;

    @NotNull
    private ArrayList<BaseSportItemBean> normalSportList = new ArrayList<>();

    @NotNull
    private final String[] sportTitle = {ApplicationExtKt.getApplication().getResources().getString(c1j.d4), ApplicationExtKt.getApplication().getResources().getString(c1j.z5), ApplicationExtKt.getApplication().getResources().getString(c1j.c1), ApplicationExtKt.getApplication().getResources().getString(c1j.b4), ApplicationExtKt.getApplication().getResources().getString(c1j.B1)};
    private boolean firstCollect = true;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.model.SportTabModel$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.model.SportTabModel$1", f = "SportTabModel.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportTabModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Integer> flowObserverRecentCount = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).observerRecentCount(CourseApiKt.getCOURSE_TAG_TIME_SEC());
                final SportTabModel sportTabModel = SportTabModel.this;
                FlowCollector<? super Integer> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.sport.model.SportTabModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(int i2, Continuation<? super Unit> continuation) {
                        Logger.i("CourseRecommend", "tab report count = " + i2 + " , first = " + sportTabModel.firstCollect);
                        if (sportTabModel.firstCollect) {
                            sportTabModel.firstCollect = false;
                        } else {
                            sportTabModel.reqCourseRecommend();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowObserverRecentCount.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/model/SportTabModel$Companion;", "", "<init>", "()V", "sportImg", "", "", "getSportImg", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "sportLogo", "getSportLogo", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Integer[] getSportImg() {
            return SportTabModel.sportImg;
        }

        @NotNull
        public final Integer[] getSportLogo() {
            return SportTabModel.sportLogo;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.model.SportTabModel$reqCourseRecommend$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.model.SportTabModel$reqCourseRecommend$1", f = "SportTabModel.kt", i = {}, l = {164, 175}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSportTabModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportTabModel.kt\ncom/xiaomi/fitness/sport/model/SportTabModel$reqCourseRecommend$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,250:1\n388#2,7:251\n388#2,7:258\n*S KotlinDebug\n*F\n+ 1 SportTabModel.kt\ncom/xiaomi/fitness/sport/model/SportTabModel$reqCourseRecommend$1\n*L\n179#1:251,7\n181#1:258,7\n*E\n"})
    public static final class C29471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C29471(Continuation<? super C29471> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$2(BaseSportItemBean baseSportItemBean) {
            return (baseSportItemBean instanceof CourseRecommendBean) || (baseSportItemBean instanceof MotionSensingSportBean) || (baseSportItemBean instanceof JustDanceBean);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportTabModel.this.new C29471(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<CourseModel.CourseData> list;
            int iNextIndex;
            int iNextIndex2;
            ISportDataListener<List<BaseSportItemBean>> iSportDataListener;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CourseModel.CourseListData courseListData = (CourseModel.CourseListData) obj;
                List<CourseModel.CourseData> list2 = courseListData != null ? courseListData.courseList : null;
                list = list2;
                if (list != null || list.isEmpty()) {
                    return Unit.INSTANCE;
                }
                ArrayList arrayList = SportTabModel.this.normalSportList;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    iNextIndex = -1;
                    if (!listIterator.hasPrevious()) {
                        iNextIndex2 = -1;
                        break;
                    }
                    BaseSportItemBean baseSportItemBean = (BaseSportItemBean) listIterator.previous();
                    if ((baseSportItemBean instanceof RecommendSportListBean) && ((RecommendSportListBean) baseSportItemBean).getSmallStyle()) {
                        iNextIndex2 = listIterator.nextIndex();
                        break;
                    }
                }
                if (iNextIndex2 == -1) {
                    ArrayList arrayList2 = SportTabModel.this.normalSportList;
                    ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                    while (listIterator2.hasPrevious()) {
                        if (((BaseSportItemBean) listIterator2.previous()) instanceof LocalSportBean) {
                            iNextIndex = listIterator2.nextIndex();
                            break;
                        }
                    }
                } else {
                    iNextIndex = iNextIndex2;
                }
                MotionSensingSportBean motionSensingSportBean = new MotionSensingSportBean();
                CollectionsKt__MutableCollectionsKt.removeAll((List) SportTabModel.this.normalSportList, new Function1() { // from class: com.xiaomi.fitness.sport.model.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return Boolean.valueOf(SportTabModel.C29471.invokeSuspend$lambda$2((BaseSportItemBean) obj2));
                    }
                });
                SportTabModel.this.normalSportList.add(iNextIndex + 1, motionSensingSportBean);
                int i2 = iNextIndex + 2;
                if (SportTabModel.this.ifAnySupportJustDance()) {
                    SportTabModel.this.normalSportList.add(i2, new JustDanceBean());
                    i2 = iNextIndex + 3;
                }
                SportTabModel.this.normalSportList.add(i2, new CourseRecommendBean(list2, null, null, 4, null));
                WeakReference<ISportDataListener<List<BaseSportItemBean>>> weak = SportTabModel.this.getWeak();
                if (weak != null && (iSportDataListener = weak.get()) != null) {
                    iSportDataListener.onSuccess(SportTabModel.this.normalSportList);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            SportTabModel$reqCourseRecommend$1$tag$1 sportTabModel$reqCourseRecommend$1$tag$1 = new SportTabModel$reqCourseRecommend$1$tag$1(null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, sportTabModel$reqCourseRecommend$1$tag$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            CourseApi courseApi = CourseApiKt.getCourseApi();
            String courseScene = CourseApiKt.getCourseScene(CourseApiKt.COURSE_PAGE_TAB, (String) obj);
            this.label = 2;
            obj = courseApi.getCourseRecommend(courseScene, 3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            CourseModel.CourseListData courseListData2 = (CourseModel.CourseListData) obj;
            List<CourseModel.CourseData> list3 = courseListData2 != null ? courseListData2.courseList : null;
            list = list3;
            if (list != null) {
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SportTabModel() {
        boolean z = !AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE)) && RegionPreference.INSTANCE.getPRIVACY_AGREE();
        this.courseFlag = z;
        buildNormalSportList();
        buildRunningRouteData();
        buildLocalSportList();
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new AnonymousClass1(null), 3, null);
            AccountManagerExtKt.getInstance(AccountManager.INSTANCE).addAccountListener(new Function1() { // from class: c4o
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportTabModel._init_$lambda$1(this.f4921a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(SportTabModel this$0, boolean z) {
        ISportDataListener<List<BaseSportItemBean>> iSportDataListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.reqCourseRecommend();
        } else {
            CollectionsKt__MutableCollectionsKt.removeAll((List) this$0.normalSportList, new Function1() { // from class: d4o
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(SportTabModel.lambda$1$lambda$0((BaseSportItemBean) obj));
                }
            });
            WeakReference<ISportDataListener<List<BaseSportItemBean>>> weak = this$0.getWeak();
            if (weak != null && (iSportDataListener = weak.get()) != null) {
                iSportDataListener.onSuccess(this$0.normalSportList);
            }
        }
        return Unit.INSTANCE;
    }

    private final void buildLocalSportList() {
        LocalSportBean localSportBean = new LocalSportBean();
        localSportBean.setBackResource(eoi.d2);
        localSportBean.setLocalTitle(ApplicationExtKt.getApplication().getResources().getString(c1j.I2));
        localSportBean.setModel("ksmb.treadmill.m1v1");
        localSportBean.setTag(ApplicationExtKt.getApplication().getResources().getString(c1j.e0));
        localSportBean.setLocalSource(ApplicationExtKt.getApplication().getResources().getString(c1j.k5));
        this.normalSportList.add(localSportBean);
    }

    private final void buildNormalSportList() {
        NormalSportBean normalSportBean = new NormalSportBean();
        Integer[] numArr = sportLogo;
        int iIntValue = numArr[0].intValue();
        Integer[] numArr2 = sportImg;
        int iIntValue2 = numArr2[0].intValue();
        String str = this.sportTitle[0];
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        String string = ApplicationExtKt.getApplication().getResources().getString(c1j.d4);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        LaunchSportEntrance launchSportEntrance = new LaunchSportEntrance(1, iIntValue, iIntValue2, str, string, eoi.p);
        int iIntValue3 = numArr[1].intValue();
        int iIntValue4 = numArr2[1].intValue();
        String str2 = this.sportTitle[1];
        Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
        String string2 = ApplicationExtKt.getApplication().getResources().getString(c1j.z5);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        LaunchSportEntrance launchSportEntrance2 = new LaunchSportEntrance(2, iIntValue3, iIntValue4, str2, string2, eoi.D);
        int iIntValue5 = numArr[2].intValue();
        int iIntValue6 = numArr2[2].intValue();
        String str3 = this.sportTitle[2];
        Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
        String string3 = ApplicationExtKt.getApplication().getResources().getString(c1j.c1);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        LaunchSportEntrance launchSportEntrance3 = new LaunchSportEntrance(6, iIntValue5, iIntValue6, str3, string3, eoi.c);
        int iIntValue7 = numArr[3].intValue();
        int iIntValue8 = numArr2[3].intValue();
        String str4 = this.sportTitle[3];
        Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
        String string4 = ApplicationExtKt.getApplication().getResources().getString(c1j.b4);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        LaunchSportEntrance launchSportEntrance4 = new LaunchSportEntrance(3, iIntValue7, iIntValue8, str4, string4, eoi.h);
        List<LaunchSportEntrance> launchSportEntranceList = normalSportBean.getLaunchSportEntranceList();
        ListExtKt.add(launchSportEntranceList, launchSportEntrance);
        ListExtKt.add(launchSportEntranceList, launchSportEntrance2);
        ListExtKt.add(launchSportEntranceList, launchSportEntrance3);
        ListExtKt.add(launchSportEntranceList, launchSportEntrance4);
        this.normalSportList.add(normalSportBean);
    }

    private final void buildRunningRouteData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ifAnySupportJustDance() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.supportJustDance(wearableDeviceModel)) {
            return true;
        }
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) CollectionsKt___CollectionsKt.firstOrNull((List) DeviceManagerExtKt.getInstance(companion).getAccessoryDeviceModels());
        if (wearableDeviceModel2 == null) {
            return false;
        }
        return DeviceModelExtKt.supportJustDance(wearableDeviceModel2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$1$lambda$0(BaseSportItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof CourseRecommendBean;
    }

    public static /* synthetic */ void loadBannerList$default(SportTabModel sportTabModel, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        sportTabModel.loadBannerList(i, str, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBannerList$lambda$5(String business, SportTabModel this$0, List it) {
        ISportDataListener<List<BaseSportItemBean>> iSportDataListener;
        Intrinsics.checkNotNullParameter(business, "$business");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        k02.b("getBannerList " + business + " ,result " + it);
        if (it.isEmpty()) {
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        boolean zAreEqual = Intrinsics.areEqual(business, BusinessKey.BUSINESS_TAB_SPORT);
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            BannerItem bannerItem = (BannerItem) it2.next();
            RecommendSportBean recommendSportBean = new RecommendSportBean();
            bannerItem.setSmallImage(zAreEqual);
            bannerItem.setKey("key-" + bannerItem.getId());
            Pair<String, Map<String, Object>> bannerV1ExposeEventAndParams = BannerExtKt.getINSTANCE(IBanner.INSTANCE).getBannerV1ExposeEventAndParams(bannerItem);
            bannerItem.setEventName(bannerV1ExposeEventAndParams.getFirst());
            bannerItem.setParams((Map) bannerV1ExposeEventAndParams.getSecond());
            recommendSportBean.setBannerItem(bannerItem);
            arrayList.add(recommendSportBean);
        }
        if (zAreEqual) {
            int iNextIndex = -1;
            RecommendSportListBean recommendSportListBean = new RecommendSportListBean(arrayList, zAreEqual, -1);
            ArrayList<BaseSportItemBean> arrayList2 = this$0.normalSportList;
            ListIterator<BaseSportItemBean> listIterator = arrayList2.listIterator(arrayList2.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous() instanceof LocalSportBean) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            CollectionsKt__MutableCollectionsKt.removeAll((List) this$0.normalSportList, new Function1() { // from class: a4o
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(SportTabModel.loadBannerList$lambda$5$lambda$4((BaseSportItemBean) obj));
                }
            });
            this$0.normalSportList.add(iNextIndex + 1, recommendSportListBean);
        } else {
            this$0.normalSportList.add(new RecommendSportListBean(arrayList, zAreEqual, c1j.T));
        }
        WeakReference<ISportDataListener<List<BaseSportItemBean>>> weak = this$0.getWeak();
        if (weak != null && (iSportDataListener = weak.get()) != null) {
            iSportDataListener.onSuccess(this$0.normalSportList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean loadBannerList$lambda$5$lambda$4(BaseSportItemBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return (item instanceof RecommendSportListBean) && ((RecommendSportListBean) item).getSmallStyle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBannerList$lambda$6(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k02.a("getBannerList", it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reqCourseRecommend() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() && this.courseFlag) {
            ScopeExtKt.scopeNet$default(null, new C29471(null), 1, null).m503catch(new Function2() { // from class: b4o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportTabModel.reqCourseRecommend$lambda$2((AndroidScope) obj, (Throwable) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqCourseRecommend$lambda$2(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e("CourseRecommend", "reqCourseRecommend: error = " + it.getMessage());
        return Unit.INSTANCE;
    }

    @NotNull
    public final String[] getSportTitle() {
        return this.sportTitle;
    }

    public final void loadBannerList(int group, @NotNull final String business, int count) {
        Intrinsics.checkNotNullParameter(business, "business");
        BannerExtKt.getINSTANCE(IBanner.INSTANCE).getBannerListAsyncV1(new BannerRequestParam(business, group, count), new Function1() { // from class: e4o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportTabModel.loadBannerList$lambda$5(business, this, (List) obj);
            }
        }, new Function1() { // from class: f4o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportTabModel.loadBannerList$lambda$6((ApiException) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport.model.SportModel
    public void refresh() {
        ISportDataListener<List<BaseSportItemBean>> iSportDataListener;
        super.refresh();
        WeakReference<ISportDataListener<List<BaseSportItemBean>>> weak = getWeak();
        if (weak != null && (iSportDataListener = weak.get()) != null) {
            iSportDataListener.onSuccess(this.normalSportList);
        }
        Logger.d("CourseRecommend", "start reqCourseRecommend");
        reqCourseRecommend();
    }
}
