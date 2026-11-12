package com.mi.health.course.api;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mi.health.course.api.CourseRequestV3;
import com.mi.health.course.data.CourseCatalogResp;
import com.mi.health.course.export.data.AidongVipUserInfo;
import com.mi.health.course.export.data.CourseCatalogConfigData;
import com.mi.health.course.export.data.CourseInfoItem;
import com.mi.health.course.export.data.CourseInfoList;
import com.mi.health.course.export.data.CourseItem;
import com.mi.health.course.export.data.CourseListData;
import com.mi.health.course.export.data.CourseListRequestV3;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.export.data.CourseSeriesInfoData;
import com.mi.health.course.export.data.CourseSeriesRecommend;
import com.mi.health.course.export.data.CourseVideo;
import com.mi.health.course.export.data.ReqItemList;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import dagger.hilt.android.EntryPointAccessors;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001IB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086@¢\u0006\u0002\u0010\u0013JJ\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ@\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0086@¢\u0006\u0002\u0010$J \u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010&J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0086@¢\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020-2\u0006\u0010)\u001a\u00020*H\u0086@¢\u0006\u0002\u0010+J\u0016\u0010.\u001a\u00020/2\u0006\u0010)\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u00100J\"\u00101\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u00102J\u0018\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u00100J\u0010\u00106\u001a\u0004\u0018\u000107H\u0086@¢\u0006\u0002\u0010\u0013J0\u00108\u001a\u0002092\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002090;2\u0014\b\u0002\u0010=\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u0002090;J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0086@¢\u0006\u0002\u0010CJ\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0086@¢\u0006\u0002\u0010HR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006J"}, d2 = {"Lcom/mi/health/course/api/CourseRequestV3;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/mi/health/course/api/CourseV3Service;", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "requestOld", "Lcom/mi/health/course/api/CourseRequest;", "getRequestOld", "()Lcom/mi/health/course/api/CourseRequest;", "setRequestOld", "(Lcom/mi/health/course/api/CourseRequest;)V", "getCourseCatalog", "Lcom/mi/health/course/data/CourseCatalogResp;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseList", "Lcom/mi/health/course/export/data/CourseModel$CourseListData;", "scene", "", "type", "", "tags", "nextKey", "count", "", "(Ljava/lang/String;[ILjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAidongCourseList", "Lcom/mi/health/course/export/data/CourseListData;", "category", "filter", TSMAuthContants.PARAM_KEYWORD, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAidongSeriesList", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSeriesInfo", "Lcom/mi/health/course/export/data/CourseSeriesInfoData;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseDetail", "Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;", "getCourseVideo", "Lcom/mi/health/course/export/data/CourseVideo;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseRecommend", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseSeriesRecommend", "Lcom/mi/health/course/export/data/CourseSeriesRecommend;", "params", "getCourseCatalogConfig", "Lcom/mi/health/course/export/data/CourseCatalogConfigData;", "getAidongMemberUserInfoOnce", "", "success", "Lkotlin/Function1;", "Lcom/mi/health/course/export/data/AidongVipUserInfo;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "getCourseInfos", "Lcom/mi/health/course/export/data/CourseInfoList;", "reqItemList", "Lcom/mi/health/course/export/data/ReqItemList;", "(Lcom/mi/health/course/export/data/ReqItemList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseInfo", "Lcom/mi/health/course/export/data/CourseInfoItem;", "reqItem", "Lcom/mi/health/course/export/data/CourseItem;", "(Lcom/mi/health/course/export/data/CourseItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseRequestV3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseRequestV3.kt\ncom/mi/health/course/api/CourseRequestV3\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,153:1\n141#2:154\n141#2:158\n141#2:162\n141#2:166\n141#2:170\n141#2:174\n141#2:178\n141#2:182\n141#2:186\n141#2:190\n89#2,5:194\n141#2:199\n141#2:203\n31#3:155\n28#3,2:156\n31#3:159\n28#3,2:160\n31#3:163\n28#3,2:164\n31#3:167\n28#3,2:168\n31#3:171\n28#3,2:172\n31#3:175\n28#3,2:176\n31#3:179\n28#3,2:180\n31#3:183\n28#3,2:184\n31#3:187\n28#3,2:188\n31#3:191\n28#3,2:192\n31#3:200\n28#3,2:201\n31#3:204\n28#3,2:205\n*S KotlinDebug\n*F\n+ 1 CourseRequestV3.kt\ncom/mi/health/course/api/CourseRequestV3\n*L\n48#1:154\n62#1:158\n77#1:162\n85#1:166\n93#1:170\n100#1:174\n104#1:178\n110#1:182\n114#1:186\n118#1:190\n128#1:194,5\n144#1:199\n149#1:203\n48#1:155\n48#1:156,2\n62#1:159\n62#1:160,2\n77#1:163\n77#1:164,2\n85#1:167\n85#1:168,2\n93#1:171\n93#1:172,2\n100#1:175\n100#1:176,2\n104#1:179\n104#1:180,2\n110#1:183\n110#1:184,2\n114#1:187\n114#1:188,2\n118#1:191\n118#1:192,2\n144#1:200\n144#1:201,2\n149#1:204\n149#1:205,2\n*E\n"})
public final class CourseRequestV3 extends BaseRequest<CourseV3Service> {

    @NotNull
    public static final String AIDONG_COURSE_PRODUCT_CODE = "com.gitv.aidongtigan.vip";

    @NotNull
    public static final String KEY_PRODUCT_CODE = "product_code";

    @NotNull
    public static final String KEY_VIP_TYPE = "vip_type";
    public Gson gson;
    public CourseRequest requestOld;

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequestV3$getAidongCourseList$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequestV3", f = "CourseRequestV3.kt", i = {}, l = {77}, m = "getAidongCourseList", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequestV3.this.getAidongCourseList(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequestV3$getAidongMemberUserInfoOnce$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/health/course/export/data/AidongVipUserInfo;", "it", "Lcom/mi/health/course/api/CourseV3Service;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequestV3$getAidongMemberUserInfoOnce$2", f = "CourseRequestV3.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CourseV3Service, Continuation<? super BaseResult<AidongVipUserInfo>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = CourseRequestV3.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CourseV3Service courseV3Service, Continuation<? super BaseResult<AidongVipUserInfo>> continuation) {
            return ((AnonymousClass2) create(courseV3Service, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseV3Service courseV3Service = (CourseV3Service) this.L$0;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(CourseRequestV3.KEY_PRODUCT_CODE, CourseRequestV3.AIDONG_COURSE_PRODUCT_CODE);
                linkedHashMap.put(CourseRequestV3.KEY_VIP_TYPE, Boxing.boxInt(0));
                String json = CourseRequestV3.this.getGson().toJson(linkedHashMap);
                Intrinsics.checkNotNull(json);
                this.label = 1;
                obj = courseV3Service.getAidongMemberUserInfo(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequestV3$getAidongSeriesList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequestV3", f = "CourseRequestV3.kt", i = {}, l = {85}, m = "getAidongSeriesList", n = {}, s = {})
    public static final class C14381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14381(Continuation<? super C14381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequestV3.this.getAidongSeriesList(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequestV3$getCourseCatalog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequestV3", f = "CourseRequestV3.kt", i = {}, l = {48}, m = "getCourseCatalog", n = {}, s = {})
    public static final class C14391 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14391(Continuation<? super C14391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequestV3.this.getCourseCatalog(this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequestV3$getCourseCatalogConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequestV3", f = "CourseRequestV3.kt", i = {}, l = {118}, m = "getCourseCatalogConfig", n = {}, s = {})
    public static final class C14401 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14401(Continuation<? super C14401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequestV3.this.getCourseCatalogConfig(this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequestV3$getCourseDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequestV3", f = "CourseRequestV3.kt", i = {}, l = {100}, m = "getCourseDetail", n = {}, s = {})
    public static final class C14411 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14411(Continuation<? super C14411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequestV3.this.getCourseDetail(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequestV3$getCourseInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequestV3", f = "CourseRequestV3.kt", i = {}, l = {149}, m = "getCourseInfo", n = {}, s = {})
    public static final class C14421 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14421(Continuation<? super C14421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequestV3.this.getCourseInfo(null, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequestV3$getCourseInfos$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequestV3", f = "CourseRequestV3.kt", i = {}, l = {144}, m = "getCourseInfos", n = {}, s = {})
    public static final class C14431 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14431(Continuation<? super C14431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequestV3.this.getCourseInfos(null, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequestV3$getCourseList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequestV3", f = "CourseRequestV3.kt", i = {}, l = {62}, m = "getCourseList", n = {}, s = {})
    public static final class C14441 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14441(Continuation<? super C14441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequestV3.this.getCourseList(null, null, null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequestV3$getCourseRecommend$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequestV3", f = "CourseRequestV3.kt", i = {}, l = {110}, m = "getCourseRecommend", n = {}, s = {})
    public static final class C14451 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14451(Continuation<? super C14451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequestV3.this.getCourseRecommend(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequestV3$getCourseSeriesRecommend$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequestV3", f = "CourseRequestV3.kt", i = {}, l = {114}, m = "getCourseSeriesRecommend", n = {}, s = {})
    public static final class C14461 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14461(Continuation<? super C14461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequestV3.this.getCourseSeriesRecommend(null, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequestV3$getCourseVideo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequestV3", f = "CourseRequestV3.kt", i = {}, l = {104}, m = "getCourseVideo", n = {}, s = {})
    public static final class C14471 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14471(Continuation<? super C14471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequestV3.this.getCourseVideo(null, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequestV3$getSeriesInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequestV3", f = "CourseRequestV3.kt", i = {}, l = {93}, m = "getSeriesInfo", n = {}, s = {})
    public static final class C14481 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14481(Continuation<? super C14481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequestV3.this.getSeriesInfo(0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAidongMemberUserInfoOnce$default(CourseRequestV3 courseRequestV3, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: zv4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return CourseRequestV3.getAidongMemberUserInfoOnce$lambda$2((ApiException) obj2);
                }
            };
        }
        courseRequestV3.getAidongMemberUserInfoOnce(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAidongMemberUserInfoOnce$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object getCourseRecommend$default(CourseRequestV3 courseRequestV3, String str, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 20;
        }
        return courseRequestV3.getCourseRecommend(str, i, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getAidongCourseList(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull Continuation<? super CourseListData> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object aidongCourseList = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(aidongCourseList);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("category", str);
            jsonObject.addProperty("filter", str2);
            jsonObject.addProperty(TSMAuthContants.PARAM_KEYWORD, str3);
            jsonObject.addProperty(RouteRequest.KEY_NEXT_KEY, str4);
            String string = jsonObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            CourseV3Service mService = getMService();
            anonymousClass1.label = 1;
            aidongCourseList = mService.getAidongCourseList(string, anonymousClass1);
            if (aidongCourseList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(aidongCourseList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(aidongCourseList);
    }

    public final void getAidongMemberUserInfoOnce(@NotNull Function1<? super AidongVipUserInfo, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(null)).error(error).success(success);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getAidongSeriesList(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super CourseListData> continuation) {
        C14381 c14381;
        if (continuation instanceof C14381) {
            c14381 = (C14381) continuation;
            int i = c14381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14381.label = i - Integer.MIN_VALUE;
            } else {
                c14381 = new C14381(continuation);
            }
        } else {
            c14381 = new C14381(continuation);
        }
        Object courseSeriesList = c14381.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(courseSeriesList);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("category", str);
            jsonObject.addProperty(RouteRequest.KEY_NEXT_KEY, str2);
            String string = jsonObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            CourseV3Service mService = getMService();
            c14381.label = 1;
            courseSeriesList = mService.getCourseSeriesList(string, c14381);
            if (courseSeriesList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(courseSeriesList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(courseSeriesList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCourseCatalog(@NotNull Continuation<? super CourseCatalogResp> continuation) {
        C14391 c14391;
        if (continuation instanceof C14391) {
            c14391 = (C14391) continuation;
            int i = c14391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14391.label = i - Integer.MIN_VALUE;
            } else {
                c14391 = new C14391(continuation);
            }
        } else {
            c14391 = new C14391(continuation);
        }
        Object catalog = c14391.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14391.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(catalog);
            CourseV3Service mService = getMService();
            c14391.label = 1;
            catalog = mService.getCatalog(c14391);
            if (catalog == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(catalog);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(catalog);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCourseCatalogConfig(@NotNull Continuation<? super CourseCatalogConfigData> continuation) {
        C14401 c14401;
        if (continuation instanceof C14401) {
            c14401 = (C14401) continuation;
            int i = c14401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14401.label = i - Integer.MIN_VALUE;
            } else {
                c14401 = new C14401(continuation);
            }
        } else {
            c14401 = new C14401(continuation);
        }
        Object courseCatalogConfig = c14401.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(courseCatalogConfig);
            CourseV3Service mService = getMService();
            c14401.label = 1;
            courseCatalogConfig = mService.getCourseCatalogConfig(c14401);
            if (courseCatalogConfig == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(courseCatalogConfig);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(courseCatalogConfig);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCourseDetail(long j, @NotNull Continuation<? super CourseModel.CourseDetailResult> continuation) {
        C14411 c14411;
        if (continuation instanceof C14411) {
            c14411 = (C14411) continuation;
            int i = c14411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14411.label = i - Integer.MIN_VALUE;
            } else {
                c14411 = new C14411(continuation);
            }
        } else {
            c14411 = new C14411(continuation);
        }
        Object courseDetail = c14411.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14411.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(courseDetail);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("course_id", Boxing.boxLong(j));
            CourseV3Service mService = getMService();
            String string = jsonObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            c14411.label = 1;
            courseDetail = mService.getCourseDetail(string, c14411);
            if (courseDetail == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(courseDetail);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(courseDetail);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCourseInfo(@NotNull CourseItem courseItem, @NotNull Continuation<? super CourseInfoItem> continuation) {
        C14421 c14421;
        if (continuation instanceof C14421) {
            c14421 = (C14421) continuation;
            int i = c14421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14421.label = i - Integer.MIN_VALUE;
            } else {
                c14421 = new C14421(continuation);
            }
        } else {
            c14421 = new C14421(continuation);
        }
        Object courseInfo = c14421.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14421.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(courseInfo);
            String json = getGson().toJson(courseItem);
            CourseV3Service mService = getMService();
            Intrinsics.checkNotNull(json);
            c14421.label = 1;
            courseInfo = mService.getCourseInfo(json, c14421);
            if (courseInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(courseInfo);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(courseInfo);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCourseInfos(@NotNull ReqItemList reqItemList, @NotNull Continuation<? super CourseInfoList> continuation) {
        C14431 c14431;
        if (continuation instanceof C14431) {
            c14431 = (C14431) continuation;
            int i = c14431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14431.label = i - Integer.MIN_VALUE;
            } else {
                c14431 = new C14431(continuation);
            }
        } else {
            c14431 = new C14431(continuation);
        }
        Object courseInfos = c14431.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14431.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(courseInfos);
            String json = getGson().toJson(reqItemList);
            CourseV3Service mService = getMService();
            Intrinsics.checkNotNull(json);
            c14431.label = 1;
            courseInfos = mService.getCourseInfos(json, c14431);
            if (courseInfos == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(courseInfos);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(courseInfos);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object getCourseList(@Nullable String str, @Nullable int[] iArr, @Nullable String str2, @Nullable String str3, int i, @NotNull Continuation<? super CourseModel.CourseListData> continuation) {
        C14441 c14441;
        if (continuation instanceof C14441) {
            c14441 = (C14441) continuation;
            int i2 = c14441.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c14441.label = i2 - Integer.MIN_VALUE;
            } else {
                c14441 = new C14441(continuation);
            }
        } else {
            c14441 = new C14441(continuation);
        }
        Object courseList = c14441.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c14441.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(courseList);
            String json = getGson().toJson(new CourseListRequestV3(str, iArr, str2, str3, i));
            CourseV3Service mService = getMService();
            Intrinsics.checkNotNull(json);
            c14441.label = 1;
            courseList = mService.getCourseList(json, c14441);
            if (courseList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(courseList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(courseList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCourseRecommend(@NotNull String str, int i, @NotNull Continuation<? super CourseModel.CourseListData> continuation) {
        C14451 c14451;
        if (continuation instanceof C14451) {
            c14451 = (C14451) continuation;
            int i2 = c14451.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c14451.label = i2 - Integer.MIN_VALUE;
            } else {
                c14451 = new C14451(continuation);
            }
        } else {
            c14451 = new C14451(continuation);
        }
        Object courseRecommend = c14451.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c14451.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(courseRecommend);
            CourseModel.CourseRecommendReq courseRecommendReq = new CourseModel.CourseRecommendReq(str, i);
            CourseV3Service mService = getMService();
            String json = getGson().toJson(courseRecommendReq);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c14451.label = 1;
            courseRecommend = mService.getCourseRecommend(json, c14451);
            if (courseRecommend == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(courseRecommend);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(courseRecommend);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCourseSeriesRecommend(@NotNull String str, @NotNull Continuation<? super CourseSeriesRecommend> continuation) {
        C14461 c14461;
        if (continuation instanceof C14461) {
            c14461 = (C14461) continuation;
            int i = c14461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14461.label = i - Integer.MIN_VALUE;
            } else {
                c14461 = new C14461(continuation);
            }
        } else {
            c14461 = new C14461(continuation);
        }
        Object courseSeriesRecommend = c14461.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14461.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(courseSeriesRecommend);
            CourseV3Service mService = getMService();
            c14461.label = 1;
            courseSeriesRecommend = mService.getCourseSeriesRecommend(str, c14461);
            if (courseSeriesRecommend == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(courseSeriesRecommend);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(courseSeriesRecommend);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCourseVideo(@NotNull String str, @NotNull Continuation<? super CourseVideo> continuation) {
        C14471 c14471;
        if (continuation instanceof C14471) {
            c14471 = (C14471) continuation;
            int i = c14471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14471.label = i - Integer.MIN_VALUE;
            } else {
                c14471 = new C14471(continuation);
            }
        } else {
            c14471 = new C14471(continuation);
        }
        Object courseVideo = c14471.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14471.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(courseVideo);
            CourseV3Service mService = getMService();
            c14471.label = 1;
            courseVideo = mService.getCourseVideo(str, c14471);
            if (courseVideo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(courseVideo);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(courseVideo);
    }

    @NotNull
    public final Gson getGson() {
        Gson gson = this.gson;
        if (gson != null) {
            return gson;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gson");
        return null;
    }

    @NotNull
    public final CourseRequest getRequestOld() {
        CourseRequest courseRequest = this.requestOld;
        if (courseRequest != null) {
            return courseRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("requestOld");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSeriesInfo(long j, @NotNull Continuation<? super CourseSeriesInfoData> continuation) {
        C14481 c14481;
        if (continuation instanceof C14481) {
            c14481 = (C14481) continuation;
            int i = c14481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14481.label = i - Integer.MIN_VALUE;
            } else {
                c14481 = new C14481(continuation);
            }
        } else {
            c14481 = new C14481(continuation);
        }
        Object courseSeriesDetail = c14481.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14481.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(courseSeriesDetail);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("id", Boxing.boxLong(j));
            CourseV3Service mService = getMService();
            String string = jsonObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            c14481.label = 1;
            courseSeriesDetail = mService.getCourseSeriesDetail(string, c14481);
            if (courseSeriesDetail == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(courseSeriesDetail);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(courseSeriesDetail);
    }

    public final void setGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }

    public final void setRequestOld(@NotNull CourseRequest courseRequest) {
        Intrinsics.checkNotNullParameter(courseRequest, "<set-?>");
        this.requestOld = courseRequest;
    }
}
