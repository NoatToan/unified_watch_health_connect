package com.xiaomi.fitness.mine.weeklyreport;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.mine.weeklyreport.WeekReportRequest;
import com.xiaomi.fitness.mine.weeklyreport.WeekReportResult;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u001a\u0010\u0007\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0004\u0012\u00020\u00060\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/mine/weeklyreport/WeekReportRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/mine/weeklyreport/WeekReportRequestInterface;", "<init>", "()V", "getWeekReportList", "", "success", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/mine/weeklyreport/WeekReportItem;", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWeekReportRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeekReportRequest.kt\ncom/xiaomi/fitness/mine/weeklyreport/WeekReportRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,21:1\n89#2,5:22\n*S KotlinDebug\n*F\n+ 1 WeekReportRequest.kt\ncom/xiaomi/fitness/mine/weeklyreport/WeekReportRequest\n*L\n9#1:22,5\n*E\n"})
public final class WeekReportRequest extends BaseRequest<WeekReportRequestInterface> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.weeklyreport.WeekReportRequest$getWeekReportList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/mine/weeklyreport/WeekReportResult;", "Lcom/xiaomi/fitness/mine/weeklyreport/WeekReportListResponse;", "it", "Lcom/xiaomi/fitness/mine/weeklyreport/WeekReportRequestInterface;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.weeklyreport.WeekReportRequest$getWeekReportList$1", f = "WeekReportRequest.kt", i = {}, l = {10}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WeekReportRequestInterface, Continuation<? super WeekReportResult<WeekReportListResponse>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WeekReportRequestInterface weekReportRequestInterface, Continuation<? super WeekReportResult<WeekReportListResponse>> continuation) {
            return ((AnonymousClass1) create(weekReportRequestInterface, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WeekReportRequestInterface weekReportRequestInterface = (WeekReportRequestInterface) this.L$0;
                this.label = 1;
                obj = weekReportRequestInterface.getWeekReportList(this);
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
    public static final Unit getWeekReportList$lambda$0(Function1 success, ApiException it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d("WeekReportRequest", "getWeekReportList error");
        success.invoke2(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeekReportList$lambda$1(Function1 success, WeekReportResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d("WeekReportRequest", "getWeekReportList:" + it.getData());
        WeekReportListResponse weekReportListResponse = (WeekReportListResponse) it.getData();
        List<WeekReportItem> list = weekReportListResponse != null ? weekReportListResponse.getList() : null;
        if (list == null || list.isEmpty()) {
            success.invoke2(null);
        } else {
            Object data = it.getData();
            Intrinsics.checkNotNull(data);
            success.invoke2(((WeekReportListResponse) data).getList());
        }
        return Unit.INSTANCE;
    }

    public final void getWeekReportList(@NotNull final Function1<? super List<WeekReportItem>, Unit> success) {
        Intrinsics.checkNotNullParameter(success, "success");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(null)).error(new Function1() { // from class: idr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeekReportRequest.getWeekReportList$lambda$0(success, (ApiException) obj);
            }
        }).success(new Function1() { // from class: jdr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeekReportRequest.getWeekReportList$lambda$1(success, (WeekReportResult) obj);
            }
        });
    }
}
