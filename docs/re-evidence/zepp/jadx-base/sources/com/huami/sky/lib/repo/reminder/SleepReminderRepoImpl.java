package com.huami.sky.lib.repo.reminder;

import com.huami.sky.lib.entity.SleepReminderInfo;
import com.huami.sky.lib.properties.SkyReminderProperties;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import com.xiaomi.hm.health.bt.model.HMSilentConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\tR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/sky/lib/repo/reminder/SleepReminderRepoImpl;", "Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;", "Lcom/huami/sky/lib/entity/SleepReminderInfo;", "a", "sleepReminderInfo", "", "saveSleepReminderToServer", "(Lcom/huami/sky/lib/entity/SleepReminderInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSleepReminderInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "sleepReminderFlow", "<init>", "()V", "Companion", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SleepReminderRepoImpl implements ISleepReminderRepo {
    private static final int b = 60;
    private static final int c = 22;
    private static final int d = 1;
    private static final int e = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableStateFlow<SleepReminderInfo> sleepReminderFlow = StateFlowKt.MutableStateFlow(a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ SleepReminderInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SleepReminderInfo sleepReminderInfo) {
            super(0);
            this.a = sleepReminderInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取到入睡提醒信息：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.lib.repo.reminder.SleepReminderRepoImpl", f = "SleepReminderRepoImpl.kt", i = {}, l = {38}, m = "sleepReminderInfo", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return SleepReminderRepoImpl.this.sleepReminderInfo(this);
        }
    }

    private final SleepReminderInfo a() {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (true) {
            int i2 = i + 1;
            arrayList.add(Integer.valueOf(i));
            if (i2 > 5) {
                return new SleepReminderInfo(0, arrayList, HMSilentConfig.DEFAULT_ONTIME_INDEX);
            }
            i = i2;
        }
    }

    @Override // com.huami.sky.lib.repo.reminder.ISleepReminderRepo
    @Nullable
    public Object getSleepReminderInfo(@NotNull Continuation<? super SleepReminderInfo> continuation) {
        SleepReminderInfo sleepReminderInfo = SkyReminderProperties.INSTANCE.getSkySleepReminder().get();
        if (sleepReminderInfo == null) {
            sleepReminderInfo = null;
        } else {
            HMLog.info("SleepReminderRepoImpl", new a(sleepReminderInfo));
        }
        return sleepReminderInfo == null ? a() : sleepReminderInfo;
    }

    @Override // com.huami.sky.lib.repo.reminder.ISleepReminderRepo
    @Nullable
    public Object saveSleepReminderToServer(@NotNull SleepReminderInfo sleepReminderInfo, @NotNull Continuation<? super Unit> continuation) {
        SkyReminderProperties.INSTANCE.getSkySleepReminder().set(sleepReminderInfo);
        UserPropertyManager.INSTANCE.schedulePushAll();
        this.sleepReminderFlow.setValue(sleepReminderInfo);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.sky.lib.repo.reminder.ISleepReminderRepo
    @Nullable
    public Object sleepReminderInfo(@NotNull Continuation<? super Flow<SleepReminderInfo>> continuation) {
        b bVar;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.e = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<SleepReminderInfo> mutableStateFlow3 = this.sleepReminderFlow;
            bVar.a = mutableStateFlow3;
            bVar.b = mutableStateFlow3;
            bVar.e = 1;
            Object sleepReminderInfo = getSleepReminderInfo(bVar);
            if (sleepReminderInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableStateFlow = mutableStateFlow3;
            obj = sleepReminderInfo;
            mutableStateFlow2 = mutableStateFlow;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow = (MutableStateFlow) bVar.b;
            mutableStateFlow2 = (MutableStateFlow) bVar.a;
            ResultKt.throwOnFailure(obj);
        }
        mutableStateFlow.setValue(obj);
        return mutableStateFlow2;
    }
}
