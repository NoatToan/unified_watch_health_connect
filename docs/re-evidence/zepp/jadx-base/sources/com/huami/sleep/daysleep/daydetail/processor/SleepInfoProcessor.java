package com.huami.sleep.daysleep.daydetail.processor;

import com.huami.sleep.daysleep.daydetail.vo.SleepShowData;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.koin.IDeviceManager;
import com.huami.sleep.sleephome.vo.RightSelectShowInfo;
import com.huami.sleep.util.SleepDataUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/processor/SleepInfoProcessor;", "", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "", "a", "", "date", "b", "hasNapSleep", "", "getNapSleepDuration", "userId", "Lcom/huami/sleep/sleephome/vo/RightSelectShowInfo;", "getTitleBarRightShowDetail", "(Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/hm/health/dataprocess/SleepInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mTag", "Ljava/lang/String;", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepInfoProcessor {

    @NotNull
    public static final SleepInfoProcessor INSTANCE = new SleepInfoProcessor();

    @NotNull
    public static final String mTag = "SleepInfoProcessor";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.processor.SleepInfoProcessor", f = "SleepInfoProcessor.kt", i = {0, 0}, l = {47}, m = "getTitleBarRightShowDetail", n = {"date", "sleepInfo"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return SleepInfoProcessor.this.getTitleBarRightShowDetail(null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ RightSelectShowInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, RightSelectShowInfo rightSelectShowInfo) {
            super(0);
            this.a = str;
            this.b = rightSelectShowInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + "  " + this.b;
        }
    }

    private SleepInfoProcessor() {
    }

    private final boolean a(SleepInfo sleepInfo) {
        return sleepInfo != null && sleepInfo.getHasSleep();
    }

    private final boolean b(String date) {
        return Intrinsics.areEqual(SportDay.getToday().getKey(), date);
    }

    public final int getNapSleepDuration(@Nullable SleepInfo sleepInfo) {
        SleepShowData sleepShowData = SleepDataUtil.INSTANCE.parse2Nap(sleepInfo);
        return ((sleepShowData.getDeepDurationHour() + sleepShowData.getLightDurationHour()) * 60) + sleepShowData.getDeepDurationMin() + sleepShowData.getLightDurationMin() + sleepShowData.getDreamTime();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c A[PHI: r7 r8
      0x006c: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:20:0x004f, B:17:0x0048, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r8v1 com.xiaomi.hm.health.dataprocess.SleepInfo) = 
      (r8v0 com.xiaomi.hm.health.dataprocess.SleepInfo)
      (r8v0 com.xiaomi.hm.health.dataprocess.SleepInfo)
      (r8v5 com.xiaomi.hm.health.dataprocess.SleepInfo)
     binds: [B:20:0x004f, B:17:0x0048, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getTitleBarRightShowDetail(@NotNull String str, @NotNull String str2, @Nullable SleepInfo sleepInfo, @NotNull Continuation<? super RightSelectShowInfo> continuation) {
        a aVar;
        boolean z;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objIsMutiSource = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.e;
        boolean z2 = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objIsMutiSource);
            if ((a(sleepInfo) || hasNapSleep(sleepInfo)) && b(str2)) {
                IDeviceManager deviceManager = KoinExtKt.getDeviceManager();
                aVar.a = str2;
                aVar.b = sleepInfo;
                aVar.e = 1;
                objIsMutiSource = deviceManager.isMutiSource(str, str2, aVar);
                if (objIsMutiSource == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                z = false;
            }
            if (sleepInfo != null && sleepInfo.getSleepCount() > 0 && sleepInfo.getRemCount() > 0) {
                z2 = true;
            }
            RightSelectShowInfo rightSelectShowInfo = new RightSelectShowInfo(z, true, z2);
            HMLog.info(mTag, new b(str2, rightSelectShowInfo));
            return rightSelectShowInfo;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SleepInfo sleepInfo2 = (SleepInfo) aVar.b;
        str2 = (String) aVar.a;
        ResultKt.throwOnFailure(objIsMutiSource);
        sleepInfo = sleepInfo2;
        if (((Boolean) objIsMutiSource).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (sleepInfo != null) {
            z2 = true;
        }
        RightSelectShowInfo rightSelectShowInfo2 = new RightSelectShowInfo(z, true, z2);
        HMLog.info(mTag, new b(str2, rightSelectShowInfo2));
        return rightSelectShowInfo2;
    }

    public final boolean hasNapSleep(@Nullable SleepInfo sleepInfo) {
        if (sleepInfo == null) {
            return false;
        }
        return sleepInfo.isShortSleepSupported();
    }
}
