package com.xiaomi.fitness.habit.request;

import com.example.habit.export.HabitBean;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.habit.bean.AddHabitResp;
import com.xiaomi.fitness.habit.bean.CommonBoolResult;
import com.xiaomi.fitness.habit.bean.HabitListBean;
import com.xiaomi.fitness.habit.bean.HabitPunchResult;
import com.xiaomi.fitness.habit.bean.HabitResult;
import com.xiaomi.fitness.habit.bean.HabitShopBean;
import com.xiaomi.fitness.habit.bean.HabitTodayResult;
import com.xiaomi.fitness.habit.bean.Share;
import com.xiaomi.fitness.habit.request.HabitRequest;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import defpackage.b0j;
import defpackage.h4b;
import defpackage.hfb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J>\u0010\u0005\u001a\u00020\u00062\"\u0010\u0007\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\u000bj\b\u0012\u0004\u0012\u00020\n`\t\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\bJ4\u0010\u000e\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\bJ8\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\bJ.\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\bJL\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\bJ6\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\bJ0\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/habit/request/HabitRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/habit/request/HabitService;", "<init>", "()V", "list", "", "success", "Lkotlin/Function1;", "Lkotlin/collections/ArrayList;", "Lcom/example/habit/export/HabitBean;", "Ljava/util/ArrayList;", "fail", "", "myHabitList", "habitDetail", "typeId", "", "todayPunch", "Lcom/xiaomi/fitness/habit/bean/HabitTodayResult;", "habitPunch", "hour", "", "minute", "", "Lcom/xiaomi/fitness/habit/bean/Share;", "addHabit", "data", "Lcom/xiaomi/fitness/habit/bean/AddHabitResp;", "deleteHabits", "Lkotlin/Function0;", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHabitRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitRequest.kt\ncom/xiaomi/fitness/habit/request/HabitRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n89#2,5:175\n89#2,5:180\n89#2,5:185\n89#2,5:190\n89#2,5:195\n89#2,5:200\n89#2,5:205\n1863#3,2:210\n1863#3,2:212\n*S KotlinDebug\n*F\n+ 1 HabitRequest.kt\ncom/xiaomi/fitness/habit/request/HabitRequest\n*L\n22#1:175,5\n46#1:180,5\n73#1:185,5\n93#1:190,5\n115#1:195,5\n140#1:200,5\n160#1:205,5\n30#1:210,2\n54#1:212,2\n*E\n"})
public final class HabitRequest extends BaseRequest<HabitService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.request.HabitRequest$addHabit$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/habit/bean/HabitResult;", "Lcom/xiaomi/fitness/habit/bean/AddHabitResp;", "it", "Lcom/xiaomi/fitness/habit/request/HabitService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.habit.request.HabitRequest$addHabit$1", f = "HabitRequest.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<HabitService, Continuation<? super HabitResult<AddHabitResp>>, Object> {
        final /* synthetic */ String $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HabitService habitService, Continuation<? super HabitResult<AddHabitResp>> continuation) {
            return ((AnonymousClass1) create(habitService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HabitService habitService = (HabitService) this.L$0;
                String str = this.$data;
                this.label = 1;
                obj = habitService.addHabit(str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.request.HabitRequest$deleteHabits$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/habit/bean/HabitResult;", "Lcom/xiaomi/fitness/habit/bean/CommonBoolResult;", "it", "Lcom/xiaomi/fitness/habit/request/HabitService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.habit.request.HabitRequest$deleteHabits$1", f = "HabitRequest.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23991 extends SuspendLambda implements Function2<HabitService, Continuation<? super HabitResult<CommonBoolResult>>, Object> {
        final /* synthetic */ String $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23991(String str, Continuation<? super C23991> continuation) {
            super(2, continuation);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C23991 c23991 = new C23991(this.$data, continuation);
            c23991.L$0 = obj;
            return c23991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HabitService habitService, Continuation<? super HabitResult<CommonBoolResult>> continuation) {
            return ((C23991) create(habitService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HabitService habitService = (HabitService) this.L$0;
                String str = this.$data;
                this.label = 1;
                obj = habitService.deleteHabits(str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.request.HabitRequest$habitDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/habit/bean/HabitResult;", "Lcom/example/habit/export/HabitBean;", "it", "Lcom/xiaomi/fitness/habit/request/HabitService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.habit.request.HabitRequest$habitDetail$1", f = "HabitRequest.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24001 extends SuspendLambda implements Function2<HabitService, Continuation<? super HabitResult<HabitBean>>, Object> {
        final /* synthetic */ long $typeId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24001(long j, Continuation<? super C24001> continuation) {
            super(2, continuation);
            this.$typeId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24001 c24001 = new C24001(this.$typeId, continuation);
            c24001.L$0 = obj;
            return c24001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HabitService habitService, Continuation<? super HabitResult<HabitBean>> continuation) {
            return ((C24001) create(habitService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HabitService habitService = (HabitService) this.L$0;
                long j = this.$typeId;
                this.label = 1;
                obj = habitService.habitDetail(j, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.request.HabitRequest$habitPunch$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/habit/bean/HabitResult;", "Lcom/xiaomi/fitness/habit/bean/HabitPunchResult;", "it", "Lcom/xiaomi/fitness/habit/request/HabitService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.habit.request.HabitRequest$habitPunch$1", f = "HabitRequest.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24011 extends SuspendLambda implements Function2<HabitService, Continuation<? super HabitResult<HabitPunchResult>>, Object> {
        final /* synthetic */ int $hour;
        final /* synthetic */ int $minute;
        final /* synthetic */ long $typeId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24011(long j, int i, int i2, Continuation<? super C24011> continuation) {
            super(2, continuation);
            this.$typeId = j;
            this.$hour = i;
            this.$minute = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24011 c24011 = new C24011(this.$typeId, this.$hour, this.$minute, continuation);
            c24011.L$0 = obj;
            return c24011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HabitService habitService, Continuation<? super HabitResult<HabitPunchResult>> continuation) {
            return ((C24011) create(habitService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HabitService habitService = (HabitService) this.L$0;
                long j = this.$typeId;
                String strB = h4b.b(j == Long.MIN_VALUE ? MapsKt__MapsKt.emptyMap() : MapsKt__MapsKt.mapOf(TuplesKt.to("typeId", Boxing.boxLong(j)), TuplesKt.to("hour", Boxing.boxInt(this.$hour)), TuplesKt.to("minute", Boxing.boxInt(this.$minute))));
                Intrinsics.checkNotNullExpressionValue(strB, "toDataEasyJson(...)");
                this.label = 1;
                obj = habitService.habitPunch(strB, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.request.HabitRequest$list$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/habit/bean/HabitResult;", "Lcom/xiaomi/fitness/habit/bean/HabitShopBean;", "it", "Lcom/xiaomi/fitness/habit/request/HabitService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.habit.request.HabitRequest$list$1", f = "HabitRequest.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24021 extends SuspendLambda implements Function2<HabitService, Continuation<? super HabitResult<HabitShopBean>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C24021(Continuation<? super C24021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24021 c24021 = new C24021(continuation);
            c24021.L$0 = obj;
            return c24021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HabitService habitService, Continuation<? super HabitResult<HabitShopBean>> continuation) {
            return ((C24021) create(habitService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HabitService habitService = (HabitService) this.L$0;
                this.label = 1;
                obj = habitService.habitShopList(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.request.HabitRequest$myHabitList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/habit/bean/HabitResult;", "Lcom/xiaomi/fitness/habit/bean/HabitListBean;", "it", "Lcom/xiaomi/fitness/habit/request/HabitService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.habit.request.HabitRequest$myHabitList$1", f = "HabitRequest.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24031 extends SuspendLambda implements Function2<HabitService, Continuation<? super HabitResult<HabitListBean>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C24031(Continuation<? super C24031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24031 c24031 = new C24031(continuation);
            c24031.L$0 = obj;
            return c24031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HabitService habitService, Continuation<? super HabitResult<HabitListBean>> continuation) {
            return ((C24031) create(habitService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HabitService habitService = (HabitService) this.L$0;
                this.label = 1;
                obj = habitService.myHabitList(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.request.HabitRequest$todayPunch$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/habit/bean/HabitResult;", "Lcom/xiaomi/fitness/habit/bean/HabitTodayResult;", "it", "Lcom/xiaomi/fitness/habit/request/HabitService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.habit.request.HabitRequest$todayPunch$1", f = "HabitRequest.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24041 extends SuspendLambda implements Function2<HabitService, Continuation<? super HabitResult<HabitTodayResult>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C24041(Continuation<? super C24041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24041 c24041 = new C24041(continuation);
            c24041.L$0 = obj;
            return c24041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HabitService habitService, Continuation<? super HabitResult<HabitTodayResult>> continuation) {
            return ((C24041) create(habitService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HabitService habitService = (HabitService) this.L$0;
                this.label = 1;
                obj = habitService.todayList(this);
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
    public static final Unit addHabit$lambda$12(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        hfb.c("addHabit", it);
        String string = AppUtil.getApp().getString(b0j.l);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fail.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addHabit$lambda$13(Function1 success, Function1 fail, HabitResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isSuccess()) {
            Object data = it.getData();
            Intrinsics.checkNotNull(data);
            success.invoke2(data);
        } else {
            hfb.b("addHabit code:" + it.getCode());
            String string = AppUtil.getApp().getString(b0j.l);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fail.invoke2(string);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteHabits$lambda$14(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        hfb.c("deleteHabits", it);
        String string = AppUtil.getApp().getString(b0j.common_delete_failure);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fail.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteHabits$lambda$15(Function0 success, Function1 fail, HabitResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isSuccess()) {
            success.invoke();
        } else {
            hfb.b("deleteHabits code:" + it.getCode());
            String string = AppUtil.getApp().getString(b0j.common_delete_failure);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fail.invoke2(string);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit habitDetail$lambda$6(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        hfb.c("habitDetail", it);
        String string = AppUtil.getApp().getString(b0j.o);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fail.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit habitDetail$lambda$7(Function1 success, HabitResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isSuccess() || it.getData() == null) {
            hfb.b("habitDetail code:" + it.getCode());
            success.invoke2(it.getData());
        } else {
            Object data = it.getData();
            Intrinsics.checkNotNull(data);
            ((HabitBean) data).initLoadFromNet();
            success.invoke2(it.getData());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit habitPunch$lambda$10(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        hfb.c("habitPunch", it);
        String string = AppUtil.getApp().getString(b0j.o);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fail.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit habitPunch$lambda$11(Function1 success, Function1 fail, HabitResult it) {
        List<Share> arrayList;
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        HabitPunchResult habitPunchResult = (HabitPunchResult) it.getData();
        if (habitPunchResult == null || !habitPunchResult.getResult()) {
            hfb.b("habitPunch code:" + it.getCode());
            String string = AppUtil.getApp().getString(b0j.o);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fail.invoke2(string);
        } else {
            HabitPunchResult habitPunchResult2 = (HabitPunchResult) it.getData();
            if (habitPunchResult2 == null || (arrayList = habitPunchResult2.getShare()) == null) {
                arrayList = new ArrayList<>();
            }
            hfb.b("habitPunch json:" + h4b.c(arrayList));
            success.invoke2(arrayList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit list$lambda$0(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        hfb.c("habitShopList", it);
        String string = AppUtil.getApp().getString(b0j.o);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fail.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit list$lambda$2(Function1 success, Function1 fail, HabitResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isSuccess() || it.getData() == null) {
            hfb.b("habitShopList code:" + it.getCode());
            String string = AppUtil.getApp().getString(b0j.o);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fail.invoke2(string);
        } else {
            Object data = it.getData();
            Intrinsics.checkNotNull(data);
            ArrayList<HabitBean> arrayList = ((HabitShopBean) data).habits;
            Intrinsics.checkNotNull(arrayList);
            Iterator<T> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((HabitBean) it2.next()).initLoadFromNet();
            }
            success.invoke2(arrayList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit myHabitList$lambda$3(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        hfb.c("myHabitList", it);
        String string = AppUtil.getApp().getString(b0j.o);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fail.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit myHabitList$lambda$5(Function1 success, Function1 fail, HabitResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isSuccess()) {
            Object data = it.getData();
            Intrinsics.checkNotNull(data);
            ArrayList<HabitBean> arrayList = ((HabitListBean) data).habits;
            Intrinsics.checkNotNull(arrayList);
            Iterator<T> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((HabitBean) it2.next()).initLoadFromNet();
            }
            success.invoke2(arrayList);
        } else {
            hfb.b("myHabitList code:" + it.getCode());
            String string = AppUtil.getApp().getString(b0j.o);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fail.invoke2(string);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit todayPunch$lambda$8(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        hfb.c("todayPunch", it);
        String string = AppUtil.getApp().getString(b0j.o);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fail.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit todayPunch$lambda$9(Function1 success, Function1 fail, HabitResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isSuccess() || it.getData() == null) {
            hfb.b("todayPunch code:" + it.getCode());
            String string = AppUtil.getApp().getString(b0j.o);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fail.invoke2(string);
        } else {
            Object data = it.getData();
            Intrinsics.checkNotNull(data);
            success.invoke2(data);
        }
        return Unit.INSTANCE;
    }

    public final void addHabit(@NotNull String data, @NotNull final Function1<? super AddHabitResp, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(data, null)).error(new Function1() { // from class: uhb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitRequest.addHabit$lambda$12(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: zhb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitRequest.addHabit$lambda$13(success, fail, (HabitResult) obj);
            }
        });
    }

    public final void deleteHabits(@NotNull String data, @NotNull final Function0<Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C23991(data, null)).error(new Function1() { // from class: gib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitRequest.deleteHabits$lambda$14(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: hib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitRequest.deleteHabits$lambda$15(success, fail, (HabitResult) obj);
            }
        });
    }

    public final void habitDetail(long typeId, @NotNull final Function1<? super HabitBean, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C24001(typeId, null)).error(new Function1() { // from class: eib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitRequest.habitDetail$lambda$6(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: fib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitRequest.habitDetail$lambda$7(success, (HabitResult) obj);
            }
        });
    }

    public final void habitPunch(long typeId, int hour, int minute, @NotNull final Function1<? super List<Share>, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C24011(typeId, hour, minute, null)).error(new Function1() { // from class: xhb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitRequest.habitPunch$lambda$10(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: yhb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitRequest.habitPunch$lambda$11(success, fail, (HabitResult) obj);
            }
        });
    }

    public final void list(@NotNull final Function1<? super ArrayList<HabitBean>, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C24021(null)).error(new Function1() { // from class: aib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitRequest.list$lambda$0(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: bib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitRequest.list$lambda$2(success, fail, (HabitResult) obj);
            }
        });
    }

    public final void myHabitList(@NotNull final Function1<? super ArrayList<HabitBean>, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            String string = AppUtil.getApp().getString(b0j.o);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fail.invoke2(string);
        } else {
            new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C24031(null)).error(new Function1() { // from class: cib
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HabitRequest.myHabitList$lambda$3(fail, (ApiException) obj);
                }
            }).success(new Function1() { // from class: dib
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HabitRequest.myHabitList$lambda$5(success, fail, (HabitResult) obj);
                }
            });
        }
    }

    public final void todayPunch(@NotNull final Function1<? super HabitTodayResult, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C24041(null)).error(new Function1() { // from class: vhb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitRequest.todayPunch$lambda$8(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: whb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitRequest.todayPunch$lambda$9(success, fail, (HabitResult) obj);
            }
        });
    }
}
