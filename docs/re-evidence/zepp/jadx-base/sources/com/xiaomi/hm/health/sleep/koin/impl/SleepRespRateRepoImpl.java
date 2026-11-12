package com.xiaomi.hm.health.sleep.koin.impl;

import com.huami.respiratoryrate.core.RespRateConstants;
import com.huami.respiratoryrate.core.koin.RespRateKoinScopeKt;
import com.huami.respiratoryrate.service.IRespiratoryRateService;
import com.huami.respiratoryrate.service.RespiratoryRate;
import com.huami.sleep.daysleep.daydetail.repo.IRespRateRepo;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/sleep/koin/impl/SleepRespRateRepoImpl;", "Lcom/huami/sleep/daysleep/daydetail/repo/IRespRateRepo;", "", "start", "end", "", "getRespRateList", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepRespRateRepoImpl implements IRespRateRepo {
    public static final int MIN_UNIT = 60000;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.sleep.koin.impl.SleepRespRateRepoImpl$getRespRateList$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.sleep.koin.impl.SleepRespRateRepoImpl", f = "SleepRespRateRepoImpl.kt", i = {}, l = {22}, m = "getRespRateList", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepRespRateRepoImpl.this.getRespRateList(0L, 0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.sleep.daysleep.daydetail.repo.IRespRateRepo
    @Nullable
    public Object getRespRateList(long j, final long j2, @NotNull Continuation<? super byte[]> continuation) {
        AnonymousClass1 anonymousClass1;
        byte[] bArr;
        long j3;
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
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object respRateList = anonymousClass2.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(respRateList);
            long j4 = 60000;
            final long j5 = j / j4;
            final long j6 = 1 + ((j2 - j) / j4);
            byte[] bArr2 = new byte[(int) j6];
            HMLog.info(RespRateConstants.TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.koin.impl.SleepRespRateRepoImpl.getRespRateList.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "start:" + j5 + ",end:" + (j2 / ((long) 60000)) + ",length:" + j6;
                }
            });
            IRespiratoryRateService iRespiratoryRateService = (IRespiratoryRateService) RespRateKoinScopeKt.getRespRateKoinScope().get(Reflection.getOrCreateKotlinClass(IRespiratoryRateService.class), null, null);
            anonymousClass2.L$0 = bArr2;
            anonymousClass2.J$0 = j5;
            z = true;
            anonymousClass2.label = 1;
            respRateList = iRespiratoryRateService.getRespRateList(j, j2, anonymousClass2);
            if (respRateList == coroutine_suspended) {
                return coroutine_suspended;
            }
            bArr = bArr2;
            j3 = j5;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = anonymousClass2.J$0;
            bArr = (byte[]) anonymousClass2.L$0;
            ResultKt.throwOnFailure(respRateList);
        }
        final List<RespiratoryRate> list = (List) respRateList;
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            HMLog.info(RespRateConstants.TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.koin.impl.SleepRespRateRepoImpl.getRespRateList.3
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "respRate is Empty";
                }
            });
            return new byte[0];
        }
        HMLog.info(RespRateConstants.TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.koin.impl.SleepRespRateRepoImpl.getRespRateList.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "respRate list size:" + list.size();
            }
        });
        for (RespiratoryRate respiratoryRate : list) {
            bArr[(int) ((respiratoryRate.getTimeStamp() / ((long) 60)) - j3)] = (byte) respiratoryRate.getRespRate();
        }
        return bArr;
    }
}
