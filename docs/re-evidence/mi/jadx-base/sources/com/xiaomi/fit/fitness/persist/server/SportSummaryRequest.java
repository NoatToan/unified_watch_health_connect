package com.xiaomi.fit.fitness.persist.server;

import com.google.gson.Gson;
import com.xiaomi.fit.fitness.persist.server.data.GetBatchSportSummary;
import com.xiaomi.fit.fitness.persist.server.data.GetSportReportByTime;
import com.xiaomi.fit.fitness.persist.server.data.GetSportSummary;
import com.xiaomi.fit.fitness.persist.server.data.SportCategoryKey;
import com.xiaomi.fit.fitness.persist.server.data.SportCategoryRes;
import com.xiaomi.fit.fitness.persist.server.data.SportReportModel;
import com.xiaomi.fit.fitness.persist.server.data.SportReportResultByTime;
import com.xiaomi.fit.fitness.persist.server.data.SportSummaryRes;
import com.xiaomi.fit.fitness.persist.server.service.FitnessApiService;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import dagger.hilt.android.EntryPointAccessors;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/SportSummaryRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fit/fitness/persist/server/service/FitnessApiService;", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "getSportSummary", "Lcom/xiaomi/fit/fitness/persist/server/data/SportSummaryRes;", "requestParam", "Lcom/xiaomi/fit/fitness/persist/server/data/GetSportSummary;", "(Lcom/xiaomi/fit/fitness/persist/server/data/GetSportSummary;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBatchSportSummary", "param", "Lcom/xiaomi/fit/fitness/persist/server/data/GetBatchSportSummary;", "(Lcom/xiaomi/fit/fitness/persist/server/data/GetBatchSportSummary;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFirstSport", "", "Lcom/xiaomi/fit/fitness/persist/server/data/SportReportModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSportCategories", "Lcom/xiaomi/fit/fitness/persist/server/data/SportCategoryRes;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportSummaryRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSummaryRequest.kt\ncom/xiaomi/fit/fitness/persist/server/SportSummaryRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,32:1\n141#2:33\n141#2:37\n141#2:41\n141#2:45\n31#3:34\n28#3,2:35\n31#3:38\n28#3,2:39\n31#3:42\n28#3,2:43\n31#3:46\n28#3,2:47\n*S KotlinDebug\n*F\n+ 1 SportSummaryRequest.kt\ncom/xiaomi/fit/fitness/persist/server/SportSummaryRequest\n*L\n17#1:33\n22#1:37\n27#1:41\n31#1:45\n17#1:34\n17#1:35,2\n22#1:38\n22#1:39,2\n27#1:42\n27#1:43,2\n31#1:46\n31#1:47,2\n*E\n"})
public final class SportSummaryRequest extends BaseRequest<FitnessApiService> {
    public Gson gson;

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.SportSummaryRequest$getBatchSportSummary$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.SportSummaryRequest", f = "SportSummaryRequest.kt", i = {}, l = {22}, m = "getBatchSportSummary", n = {}, s = {})
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
            return SportSummaryRequest.this.getBatchSportSummary(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.SportSummaryRequest$getFirstSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.SportSummaryRequest", f = "SportSummaryRequest.kt", i = {}, l = {27}, m = "getFirstSport", n = {}, s = {})
    public static final class C16961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16961(Continuation<? super C16961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSummaryRequest.this.getFirstSport(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.SportSummaryRequest$getSportCategories$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.SportSummaryRequest", f = "SportSummaryRequest.kt", i = {}, l = {31}, m = "getSportCategories", n = {}, s = {})
    public static final class C16971 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16971(Continuation<? super C16971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSummaryRequest.this.getSportCategories(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.SportSummaryRequest$getSportSummary$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.SportSummaryRequest", f = "SportSummaryRequest.kt", i = {}, l = {17}, m = "getSportSummary", n = {}, s = {})
    public static final class C16981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16981(Continuation<? super C16981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSummaryRequest.this.getSportSummary(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getBatchSportSummary(@NotNull GetBatchSportSummary getBatchSportSummary, @NotNull Continuation<? super SportSummaryRes> continuation) {
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
        Object batchSportSummary = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(batchSportSummary);
            String json = getGson().toJson(getBatchSportSummary);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            anonymousClass1.label = 1;
            batchSportSummary = mService.getBatchSportSummary(json, anonymousClass1);
            if (batchSportSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(batchSportSummary);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(batchSportSummary);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getFirstSport(@NotNull Continuation<? super List<SportReportModel>> continuation) {
        C16961 c16961;
        if (continuation instanceof C16961) {
            c16961 = (C16961) continuation;
            int i = c16961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16961.label = i - Integer.MIN_VALUE;
            } else {
                c16961 = new C16961(continuation);
            }
        } else {
            c16961 = new C16961(continuation);
        }
        Object sportRecordsByTime = c16961.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16961.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(sportRecordsByTime);
            String json = getGson().toJson(new GetSportReportByTime(null, Boxing.boxLong(0L), null, null, null, Boxing.boxInt(1)));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16961.label = 1;
            sportRecordsByTime = mService.getSportRecordsByTime(json, c16961);
            if (sportRecordsByTime == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(sportRecordsByTime);
        }
        SportReportResultByTime sportReportResultByTime = (SportReportResultByTime) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(sportRecordsByTime);
        if (sportReportResultByTime != null) {
            return sportReportResultByTime.getSportList();
        }
        return null;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSportCategories(@NotNull Continuation<? super SportCategoryRes> continuation) {
        C16971 c16971;
        if (continuation instanceof C16971) {
            c16971 = (C16971) continuation;
            int i = c16971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16971.label = i - Integer.MIN_VALUE;
            } else {
                c16971 = new C16971(continuation);
            }
        } else {
            c16971 = new C16971(continuation);
        }
        Object sportCategories = c16971.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16971.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(sportCategories);
            FitnessApiService mService = getMService();
            String json = getGson().toJson(new SportCategoryKey(0, null, 3, null));
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c16971.label = 1;
            sportCategories = mService.getSportCategories(json, c16971);
            if (sportCategories == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(sportCategories);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(sportCategories);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSportSummary(@NotNull GetSportSummary getSportSummary, @NotNull Continuation<? super SportSummaryRes> continuation) {
        C16981 c16981;
        if (continuation instanceof C16981) {
            c16981 = (C16981) continuation;
            int i = c16981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16981.label = i - Integer.MIN_VALUE;
            } else {
                c16981 = new C16981(continuation);
            }
        } else {
            c16981 = new C16981(continuation);
        }
        Object sportSummary = c16981.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16981.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(sportSummary);
            String json = getGson().toJson(getSportSummary);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16981.label = 1;
            sportSummary = mService.getSportSummary(json, c16981);
            if (sportSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(sportSummary);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(sportSummary);
    }

    public final void setGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }
}
