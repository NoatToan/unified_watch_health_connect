package com.xiaomi.fitness.net;

import com.google.gson.Gson;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.model.SportsReportOperationalInfo;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.net.SportRecordRouteRequest;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004Ju\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0013j\b\u0012\u0004\u0012\u00020\u0012`\u00112\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0015¢\u0006\u0002\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/net/SportRecordRouteRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/net/SportsRecordRouteApiService;", "<init>", "()V", "getSportsReportOperationalData", "", "sid", "", "key", SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, "", SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, "course_id", "source_type", "", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/fitness/detail/model/SportsReportOperationalInfo;", "Lkotlin/Function1;", "error", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportRecordRouteRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordRouteRequest.kt\ncom/xiaomi/fitness/net/SportRecordRouteRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,59:1\n89#2,5:60\n*S KotlinDebug\n*F\n+ 1 SportRecordRouteRequest.kt\ncom/xiaomi/fitness/net/SportRecordRouteRequest\n*L\n42#1:60,5\n*E\n"})
public final class SportRecordRouteRequest extends BaseRequest<SportsRecordRouteApiService> {

    @NotNull
    public static final String KEY_CATEGORY = "category";

    @NotNull
    public static final String KEY_LATITUDE = "latitude";

    @NotNull
    public static final String KEY_LIMIT = "limit";

    @NotNull
    public static final String KEY_LONGITUDE = "longitude";

    @NotNull
    public static final String KEY_RANK_CATEGORY = "rank_category";

    @NotNull
    public static final String KEY_ROUTE_DETAIL = "route_detail";

    @NotNull
    public static final String KEY_ROUTE_ID = "route_id";

    @NotNull
    public static final String KEY_SID = "sid";

    @NotNull
    public static final String KEY_SPORT_RECORD_KEY = "key";

    @NotNull
    public static final String KEY_SPORT_TIME = "time";

    @NotNull
    public static final String TAG = "SportRecordRouteRequest";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SportRecordRouteRequest instance = new SportRecordRouteRequest();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/net/SportRecordRouteRequest$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/net/SportRecordRouteRequest;", "getInstance", "()Lcom/xiaomi/fitness/net/SportRecordRouteRequest;", "KEY_ROUTE_DETAIL", "", "KEY_RANK_CATEGORY", "KEY_ROUTE_ID", "KEY_LIMIT", "KEY_SID", "KEY_SPORT_RECORD_KEY", "KEY_SPORT_TIME", "KEY_LONGITUDE", "KEY_LATITUDE", "KEY_CATEGORY", "TAG", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SportRecordRouteRequest getInstance() {
            return SportRecordRouteRequest.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.SportRecordRouteRequest$getSportsReportOperationalData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/detail/model/SportsReportOperationalInfo;", "it", "Lcom/xiaomi/fitness/net/SportsRecordRouteApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.SportRecordRouteRequest$getSportsReportOperationalData$1", f = "SportRecordRouteRequest.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<SportsRecordRouteApiService, Continuation<? super BaseResult<SportsReportOperationalInfo>>, Object> {
        final /* synthetic */ String $course_id;
        final /* synthetic */ long $end_time;
        final /* synthetic */ String $key;
        final /* synthetic */ String $sid;
        final /* synthetic */ Integer $source_type;
        final /* synthetic */ long $start_time;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, long j, long j2, String str3, Integer num, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sid = str;
            this.$key = str2;
            this.$start_time = j;
            this.$end_time = j2;
            this.$course_id = str3;
            this.$source_type = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sid, this.$key, this.$start_time, this.$end_time, this.$course_id, this.$source_type, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SportsRecordRouteApiService sportsRecordRouteApiService, Continuation<? super BaseResult<SportsReportOperationalInfo>> continuation) {
            return ((AnonymousClass1) create(sportsRecordRouteApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SportsRecordRouteApiService sportsRecordRouteApiService = (SportsRecordRouteApiService) this.L$0;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sid", this.$sid);
                linkedHashMap.put("key", this.$key);
                linkedHashMap.put(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, Boxing.boxLong(this.$start_time));
                linkedHashMap.put(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, Boxing.boxLong(this.$end_time));
                String str = this.$course_id;
                if (str != null) {
                    linkedHashMap.put("course_id", str);
                }
                Integer num = this.$source_type;
                if (num != null) {
                    linkedHashMap.put("source_type", num);
                }
                String json = new Gson().toJson(linkedHashMap);
                Logger.i(SportRecordRouteRequest.TAG, "request = " + json);
                Intrinsics.checkNotNull(json);
                this.label = 1;
                obj = sportsRecordRouteApiService.getSportsReportOperationalData(json, this);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSportsReportOperationalData$lambda$0(Function1 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        error.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSportsReportOperationalData$lambda$1(Function1 success, SportsReportOperationalInfo it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    public final void getSportsReportOperationalData(@NotNull String sid, @NotNull String key, long start_time, long end_time, @Nullable String course_id, @Nullable Integer source_type, @NotNull final Function1<? super SportsReportOperationalInfo, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(sid, key, start_time, end_time, course_id, source_type, null)).error(new Function1() { // from class: bun
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordRouteRequest.getSportsReportOperationalData$lambda$0(error, (ApiException) obj);
            }
        }).success(new Function1() { // from class: cun
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordRouteRequest.getSportsReportOperationalData$lambda$1(success, (SportsReportOperationalInfo) obj);
            }
        });
    }
}
