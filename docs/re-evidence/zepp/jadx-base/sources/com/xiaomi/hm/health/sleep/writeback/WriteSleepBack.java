package com.xiaomi.hm.health.sleep.writeback;

import com.google.gson.Gson;
import com.huami.bluetooth.feature.sleep.SleepDataSource;
import com.huami.bluetooth.feature.sleep.WriteSleepDataJob;
import com.huami.bluetooth.profile.channel.module.sleep.DataFlag;
import com.huami.bluetooth.profile.channel.module.sleep.SleepData;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.datautil.HMBraceletDateDataUtil;
import com.xiaomi.hm.health.device.HMDeviceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0007J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/sleep/writeback/WriteSleepBack;", "", "", "doWrite", "", "start", "end", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;", "flag", "", "Lcom/huami/bluetooth/profile/channel/module/sleep/SleepData;", "assembleSleepData", "tag", "Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/sleep/writeback/SleepDataConvert;", "dataConvert$delegate", "Lkotlin/Lazy;", "getDataConvert", "()Lcom/xiaomi/hm/health/sleep/writeback/SleepDataConvert;", "dataConvert", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WriteSleepBack {

    @NotNull
    private static final String tag = "WriteSleepBack";

    @NotNull
    public static final WriteSleepBack INSTANCE = new WriteSleepBack();

    @NotNull
    private static final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    /* JADX INFO: renamed from: dataConvert$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy dataConvert = LazyKt__LazyJVMKt.lazy(new Function0<SleepDataConvert>() { // from class: com.xiaomi.hm.health.sleep.writeback.WriteSleepBack$dataConvert$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final SleepDataConvert getA() {
            return new SleepDataConvert();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.hm.health.sleep.writeback.WriteSleepBack$doWrite$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.sleep.writeback.WriteSleepBack$doWrite$1", f = "WriteSleepBack.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class C16451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C16451(Continuation<? super C16451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C16451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C16451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBaseDevice device = HMDeviceManager.getInstance().getDevice();
                if (device != null) {
                    HMLog.info(WriteSleepBack.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.writeback.WriteSleepBack$doWrite$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "doWrite startAsync";
                        }
                    });
                    Deferred deferredStartAsync$default = WriteSleepDataJob.startAsync$default(new WriteSleepDataJob(device), new SleepDataSource() { // from class: com.xiaomi.hm.health.sleep.writeback.WriteSleepBack$doWrite$1$1$2
                        @Override // com.huami.bluetooth.feature.sleep.SleepDataSource
                        @NotNull
                        public List<SleepData> getData(@NotNull String start, @NotNull String end, @NotNull DataFlag flag) {
                            return WriteSleepBack.INSTANCE.assembleSleepData(start, end, flag);
                        }
                    }, null, null, 6, null);
                    this.L$0 = device;
                    this.label = 1;
                    if (deferredStartAsync$default.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private WriteSleepBack() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SleepData> assembleSleepData(final String start, final String end, final DataFlag flag) {
        final ArrayList arrayList = new ArrayList();
        HMLog.info(tag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.writeback.WriteSleepBack.assembleSleepData.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "assembleSleepData";
            }
        });
        List<DateData> regionData = HMBraceletDateDataUtil.getRegionData(start, end);
        if (regionData != null) {
            if (!(!regionData.isEmpty())) {
                regionData = null;
            }
            if (regionData != null) {
                for (final DateData dateData : regionData) {
                    try {
                        final SleepSummary sleepSummary = (SleepSummary) new Gson().fromJson(dateData.getSummary(), SleepSummary.class);
                        HMLog.info(tag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.writeback.WriteSleepBack$assembleSleepData$3$1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final String getA() {
                                return "assembleSleepData summary = " + sleepSummary;
                            }
                        });
                        SleepData sleepDataConvert = INSTANCE.getDataConvert().convert(dateData.getDate(), sleepSummary, flag);
                        if (sleepDataConvert != null) {
                            arrayList.add(sleepDataConvert);
                        }
                    } catch (Exception unused) {
                        HMLog.info(tag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.writeback.WriteSleepBack$assembleSleepData$3$3
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final String getA() {
                                return "异常summary：" + dateData.getSummary();
                            }
                        });
                    }
                }
            }
        }
        HMLog.info(tag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.writeback.WriteSleepBack.assembleSleepData.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "Assemble sleep data : " + start + " -- " + end + " -- " + flag + " >>> " + arrayList + " ";
            }
        });
        return arrayList;
    }

    @JvmStatic
    public static final void doWrite() {
        e.f(scope, Dispatchers.getIO(), null, new C16451(null), 2, null);
    }

    private final SleepDataConvert getDataConvert() {
        return (SleepDataConvert) dataConvert.getValue();
    }
}
