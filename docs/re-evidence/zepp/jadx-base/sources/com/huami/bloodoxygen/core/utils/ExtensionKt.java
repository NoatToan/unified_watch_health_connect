package com.huami.bloodoxygen.core.utils;

import androidx.exifinterface.media.ExifInterface;
import com.huami.algo.healthcare.Spo2Info;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.local.config.BloodOxygenCoroutineScope;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.local.process.OdiFactory;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.bloodoxygen.service.odi.SleepBreathScore;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\f\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\f\u0010\t\u001a\u00020\u0000*\u00020\u0001H\u0000\u001a\f\u0010\n\u001a\u00020\u0000*\u00020\u0001H\u0000\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u001a\n\u0010\u0011\u001a\u00020\u0010*\u00020\u000b\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u000b\u001a\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u001a\f\u0010\u0018\u001a\u00020\u0012*\u00020\u0001H\u0000\u001a\f\u0010\u001a\u001a\u00020\u0019*\u00020\u0001H\u0000\u001a/\u0010 \u001a\u00020\u0012*\u00020\u00192!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00120\u001bH\u0000\u001aQ\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010!*\b\u0012\u0004\u0012\u00028\u00000\"2'\u0010\u001f\u001a#\b\u0001\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%\u0012\u0006\u0012\u0004\u0018\u00010'0#¢\u0006\u0002\b(H\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"", "", "toYMD", "Ljava/util/TimeZone;", "timeZone", "toYMDHMS", "toZeroTimestamp", "toLastTimestamp", "toOneSecondBefore", "yMDHMSToTimestamp", "yMDToTimestamp", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/bloodoxygen/service/odi/SleepBreathScore;", "getSleepBreathScore", "", "getValid", "", "isValid", "hour", "", "odi", "a", "isOdi", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "toSubType", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "type", TransportUri.ACTION_BLOCK, "handle", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onStartInScope", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "core_release"}, k = 2, mv = {1, 5, 1})
public final class ExtensionKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BloodOxygen.SubType.values().length];
            iArr[BloodOxygen.SubType.ALL.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.utils.ExtensionKt$onStartInScope$1", f = "Extension.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> c;

        /* JADX INFO: renamed from: com.huami.bloodoxygen.core.utils.ExtensionKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bloodoxygen.core.utils.ExtensionKt$onStartInScope$1$1$1", f = "Extension.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0295a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            private /* synthetic */ Object b;
            public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> c;

            /* JADX INFO: renamed from: com.huami.bloodoxygen.core.utils.ExtensionKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0296a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0296a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "error " + this.a.getMessage();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0295a(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C0295a> continuation) {
                super(2, continuation);
                this.c = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0295a c0295a = new C0295a(this.c, continuation);
                c0295a.b = obj;
                return c0295a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0295a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM3845constructorimpl;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.b;
                        Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.c;
                        Result.Companion companion = Result.Companion;
                        this.a = 1;
                        if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.info("onStartInScope block running", new C0296a(thM3848exceptionOrNullimpl));
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "error " + this.a.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.c, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super T> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.c;
            try {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(e.f((CoroutineScope) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(BloodOxygenCoroutineScope.class), null, null), null, null, new C0295a(function2, null), 3, null));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info("onStartInScope", new b(thM3848exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    private static final boolean a(int i, float f) {
        BloodOxygen.OdiWatch odiWatch = BloodOxygen.OdiWatch.INSTANCE;
        return (i < 2 && f >= 80.0f) || (i >= 2 && f >= 40.0f);
    }

    @NotNull
    public static final SleepBreathScore getSleepBreathScore(@NotNull Odi odi, @NotNull IBloodOxygenRepo iBloodOxygenRepo) {
        if (odi.getScore() < 0 || odi.getDispCode() < 0) {
            Spo2Info spo2ScoreAndDispCode = OdiFactory.Companion.getSpo2ScoreAndDispCode(odi.getCost(), odi.getOdi());
            odi.setScore(spo2ScoreAndDispCode.sleepBreathingScore);
            odi.setDispCode(spo2ScoreAndDispCode.sleepBreathingScoreCode);
            odi.setUploaded(false);
            iBloodOxygenRepo.addLocalOdi(odi);
        }
        return new SleepBreathScore(odi.getScore(), odi.getCost(), odi.getTimestamp(), odi.getDispCode());
    }

    public static final int getValid(@NotNull Odi odi) {
        int iSecondToHour = (int) BloodOxygenUtils.INSTANCE.secondToHour(odi.getCost());
        if (iSecondToHour >= 4) {
            return 2;
        }
        return a(iSecondToHour, odi.getOdi()) ? 1 : 0;
    }

    public static final boolean handle(@NotNull BloodOxygen.SubType subType, @NotNull Function1<? super BloodOxygen.SubType, Boolean> function1) {
        if (WhenMappings.$EnumSwitchMapping$0[subType.ordinal()] != 1) {
            return function1.invoke(subType).booleanValue();
        }
        BloodOxygen.SubType[] subTypeArrValues = BloodOxygen.SubType.values();
        ArrayList<BloodOxygen.SubType> arrayList = new ArrayList();
        int length = subTypeArrValues.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            BloodOxygen.SubType subType2 = subTypeArrValues[i];
            if (z) {
                arrayList.add(subType2);
            } else if (!(subType2 == BloodOxygen.SubType.ALL)) {
                arrayList.add(subType2);
                z = true;
            }
        }
        while (true) {
            boolean z2 = true;
            for (BloodOxygen.SubType subType3 : arrayList) {
                if (!z2 || !function1.invoke(subType3).booleanValue()) {
                    z2 = false;
                }
            }
            return z2;
        }
    }

    public static final boolean isOdi(@NotNull String str) {
        return Intrinsics.areEqual(str, BloodOxygen.SubType.ODI.getString());
    }

    public static final boolean isValid(@NotNull Odi odi) {
        return odi.getValid() == 1 || odi.getValid() == 2;
    }

    @NotNull
    public static final <T> Flow<T> onStartInScope(@NotNull Flow<? extends T> flow, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt.onStart(flow, new a(function2, null));
    }

    public static final long toLastTimestamp(long j) {
        return BloodOxygenUtils.INSTANCE.getLastTimeInMillis(j);
    }

    public static final long toOneSecondBefore(long j) {
        return j - ((long) 1000);
    }

    @NotNull
    public static final BloodOxygen.SubType toSubType(@NotNull String str) {
        return BloodOxygen.SubType.valueOf(str.toUpperCase());
    }

    @NotNull
    public static final String toYMD(long j) {
        return BloodOxygenUtils.INSTANCE.timestampToYMD(j);
    }

    @NotNull
    public static final String toYMDHMS(long j, @NotNull TimeZone timeZone) {
        return BloodOxygenUtils.INSTANCE.timestampToYMDHMS(j, timeZone);
    }

    public static /* synthetic */ String toYMDHMS$default(long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 1) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return toYMDHMS(j, timeZone);
    }

    public static final long toZeroTimestamp(long j) {
        return BloodOxygenUtils.INSTANCE.getZeroTimeInMillis(j);
    }

    public static final long yMDHMSToTimestamp(@NotNull String str) {
        return BloodOxygenUtils.INSTANCE.yMDHMSToTimestamp(str);
    }

    public static final long yMDToTimestamp(@NotNull String str) {
        return BloodOxygenUtils.INSTANCE.yMDToTimestamp(str);
    }
}
