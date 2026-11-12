package com.xiaomi.hm.health.bodyfat.utils;

import android.view.View;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bt.model.MeasureData;
import com.xiaomi.hm.health.bt.model.MeasureState;
import com.xiaomi.hm.health.databases.model.UserInfos;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\n\u0010\b\u001a\u00020\u0000*\u00020\u0007\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\n\u001a\u0012\u0010\u000f\u001a\u00020\n*\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u001a(\u0010\u0014\u001a\u00020\u0005*\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0012¨\u0006\u0015"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/model/MeasureState;", "state", "Lcom/xiaomi/hm/health/bt/model/MeasureData;", "data", "", "measureStateLog", "Lcom/huami/network/base/model/HMHttpResponseData;", "errorMsg", "", "", "isReverse", "millsToSecond", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "user", "isChange", "Landroid/view/View;", "delay", "Lkotlin/Function1;", "action", "smartClick", "bodyfat_midongRelease"}, k = 2, mv = {1, 5, 1})
public final class ExtentionUtilsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MeasureState.values().length];
            iArr[MeasureState.MEASURING_WEIGHT.ordinal()] = 1;
            iArr[MeasureState.MEASURING_HR.ordinal()] = 2;
            iArr[MeasureState.MEASURING_IMPEDANCE.ordinal()] = 3;
            iArr[MeasureState.MEASURING_PRESSURE.ordinal()] = 4;
            iArr[MeasureState.MEASURING_FINISHED.ordinal()] = 5;
            iArr[MeasureState.NONE.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt$smartClick$1$1", f = "ExtentionUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function1<View, Unit> c;
        public final /* synthetic */ View d;
        public final /* synthetic */ long e;
        public final /* synthetic */ View f;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt$smartClick$1$1$1", f = "ExtentionUtils.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0786a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ View c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0786a(long j, View view, Continuation<? super C0786a> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = view;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0786a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0786a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    this.a = 1;
                    if (DelayKt.delay(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.c.setClickable(true);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super View, Unit> function1, View view, long j, View view2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = function1;
            this.d = view;
            this.e = j;
            this.f = view2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.c, this.d, this.e, this.f, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            this.c.invoke(this.d);
            e.f(coroutineScope, null, null, new C0786a(this.e, this.f, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, long j, View view, View view2) {
        view2.setClickable(false);
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new a(function1, view2, j, view, null), 3, null);
    }

    @NotNull
    public static final String errorMsg(@NotNull HMHttpResponseData hMHttpResponseData) {
        return hMHttpResponseData.getResponseBody() != null ? new String(hMHttpResponseData.getResponseBody(), Charsets.UTF_8) : "";
    }

    public static final boolean isChange(@NotNull UserInfos userInfos, @NotNull UserInfos userInfos2) {
        return (Intrinsics.areEqual(userInfos2.getBirthday(), userInfos.getBirthday()) && Intrinsics.areEqual(userInfos2.getHeight(), userInfos.getHeight()) && Intrinsics.areEqual(userInfos2.getTargetWeight(), userInfos.getTargetWeight())) ? false : true;
    }

    public static final void measureStateLog(@NotNull String str, @NotNull MeasureState measureState, @Nullable MeasureData measureData) {
        String str2;
        switch (WhenMappings.$EnumSwitchMapping$0[measureState.ordinal()]) {
            case 1:
                str2 = "MEASURING_WEIGHT";
                break;
            case 2:
                str2 = "MEASURING_HR";
                break;
            case 3:
                str2 = "MEASURING_IMPEDANCE";
                break;
            case 4:
                str2 = "MEASURING_PRESSURE";
                break;
            case 5:
                str2 = "MEASURING_FINISHED";
                break;
            case 6:
                str2 = NoticesEntity.LOOP_TYPE_NONE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        HMLog.v("WeightingHan", str + "--state--" + str2 + "\ndata--" + measureData + "\n-----------\n----------", new Object[0]);
    }

    public static final long millsToSecond(long j, boolean z) {
        if (z) {
            return String.valueOf(j).length() == 10 ? j * ((long) 1000) : j;
        }
        return String.valueOf(j).length() == 13 ? j / ((long) 1000) : j;
    }

    public static /* synthetic */ long millsToSecond$default(long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return millsToSecond(j, z);
    }

    public static final void smartClick(@NotNull final View view, final long j, @NotNull final Function1<? super View, Unit> function1) {
        view.setOnClickListener(new View.OnClickListener() { // from class: wx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ExtentionUtilsKt.b(function1, j, view, view2);
            }
        });
    }

    public static /* synthetic */ void smartClick$default(View view, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        smartClick(view, j, function1);
    }
}
