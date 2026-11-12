package com.xiaomi.fit.data.common.data.aireco;

import android.os.Build;
import android.os.Bundle;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0006\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003\u001a\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\n\u0010\u0002\u001a\u00020\u0015\"\u00020\u0003\u001a\u001a\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u001d\u001a\u00020\u00032\b\b\u0001\u0010\u001e\u001a\u00020\u0003\u001a\u0010\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u0003\u001a\u001a\u0010 \u001a\u00020!2\n\u0010\u0002\u001a\u00020\u0015\"\u00020\u00032\u0006\u0010\"\u001a\u00020\u000f\"\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u000e\u0010\u0017\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"createRainbowIntentionDto", "Lcom/xiaomi/fit/data/common/data/aireco/IntentionDataDto;", "intentionType", "", "tomorrow", "", "createStepsIntentionDto", "createSleepIntentionDto", "get6To9PMIntentionPeriodList", "", "Lcom/xiaomi/fit/data/common/data/aireco/IntentionPeriod;", "getIntentionPeriod", "startOffsetInHourFromTodayZero", "endOffsetInHourFromTodayZero", "getWidgetIntentId", "", "airEcoVersionSupportsIntentionAccess", "supportAirEcoIntentionAccess", "getSupportAirEcoIntentionAccess", "()Z", "getIntentionDtoList", "", "getDto", "PRIORITY_SCORE_CHECK_SLEEP_RECORD", "PRIORITY_SCORE_RAINBOW_ALL_FINISH", "PRIORITY_SCORE_STEP_GOAL_FINISH", "PRIORITY_SCORE_STEP_GOAL_NOT_FINISH", "PRIORITY_SCORE_RAINBOW_NOT_FINISH", "PRIORITY_SCORE_RAINBOW_PARTIAL_FINISH", "getPriorityScore", "type", "getIntentionName", "sendNotifyIntentionToAirEcoIfSupportive", "", "callSite", "TAG", "fitness-common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAirEcoAccessExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirEcoAccessExt.kt\ncom/xiaomi/fit/data/common/data/aireco/AirEcoAccessExtKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,313:1\n13423#2,2:314\n13423#2,2:316\n*S KotlinDebug\n*F\n+ 1 AirEcoAccessExt.kt\ncom/xiaomi/fit/data/common/data/aireco/AirEcoAccessExtKt\n*L\n193#1:314,2\n275#1:316,2\n*E\n"})
public final class AirEcoAccessExtKt {
    public static final int PRIORITY_SCORE_CHECK_SLEEP_RECORD = 47;
    public static final int PRIORITY_SCORE_RAINBOW_ALL_FINISH = 24;
    public static final int PRIORITY_SCORE_RAINBOW_NOT_FINISH = 22;
    public static final int PRIORITY_SCORE_RAINBOW_PARTIAL_FINISH = 22;
    public static final int PRIORITY_SCORE_STEP_GOAL_FINISH = 24;
    public static final int PRIORITY_SCORE_STEP_GOAL_NOT_FINISH = 22;

    @NotNull
    public static final String TAG = "AirEcoAccessExt";
    public static final boolean airEcoVersionSupportsIntentionAccess = true;

    /* JADX INFO: renamed from: com.xiaomi.fit.data.common.data.aireco.AirEcoAccessExtKt$sendNotifyIntentionToAirEcoIfSupportive$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.data.common.data.aireco.AirEcoAccessExtKt$sendNotifyIntentionToAirEcoIfSupportive$2", f = "AirEcoAccessExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bundle $bundle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Bundle bundle, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$bundle = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$bundle, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String string;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Bundle bundleCall = ApplicationExtKt.getApplication().getContentResolver().call(AirEcoIntentionConstants.INTENTION_AUTHORITY_URI, AirEcoIntentionConstants.NOTIFY_CALL_METHOD, (String) null, this.$bundle);
                int i = bundleCall != null ? bundleCall.getInt("code") : 0;
                if (bundleCall == null || (string = bundleCall.getString("message")) == null) {
                    string = "";
                }
                Logger.i(AirEcoAccessExtKt.TAG, "sendNotifyIntentionToAirEcoIfSupportive succeeded. code=" + i + " message=" + string);
            } catch (Exception e) {
                Logger.i(AirEcoAccessExtKt.TAG, "sendNotifyIntentionToAirEcoIfSupportive failed. exception=" + e);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @NotNull
    public static final IntentionDataDto createRainbowIntentionDto(@IntentionType int i, boolean z) {
        String str;
        if (i != 1) {
            str = AirEcoIntentionConstants.INSTANCE_ID_RAINBOW_NOT_COMPLETE;
            if (i != 4 && i == 5) {
                str = AirEcoIntentionConstants.INSTANCE_ID_RAINBOW_PARTIAL_COMPLETE;
            }
        } else {
            str = AirEcoIntentionConstants.INSTANCE_ID_RAINBOW_ALL_COMPLETE;
        }
        IntentionDataDto intentionDataDto = new IntentionDataDto(str);
        IntentionProperty intentionProperty = new IntentionProperty();
        intentionProperty.setIntentId(AirEcoIntentionConstants.INTENTION_NAME_ID_RAINBOW);
        intentionProperty.setName(AirEcoIntentionConstants.INTENTION_NAME_RAINBOW);
        intentionDataDto.setIntentionProperty(intentionProperty);
        IntentionTarget intentionTarget = new IntentionTarget();
        intentionTarget.setImplUniqueCode(AirEcoIntentionConstants.WIDGET_RAINBOW_2_2_ID);
        IntentionWidgetInfo intentionWidgetInfo = new IntentionWidgetInfo();
        intentionWidgetInfo.setWidgetProviderName(AirEcoIntentionConstants.WIDGET_PROVIDER_NAME_RAINBOW_2_2);
        intentionTarget.setWidgetImplInfo(intentionWidgetInfo);
        intentionDataDto.setIntentId(AirEcoIntentionConstants.INTENTION_NAME_ID_RAINBOW);
        intentionDataDto.setTarget(CollectionsKt__CollectionsJVMKt.listOf(intentionTarget));
        if (i == 4) {
            intentionDataDto.setPeriodList(get6To9PMIntentionPeriodList(z));
        }
        intentionDataDto.setEventType(1);
        intentionDataDto.setCreateTime(System.currentTimeMillis());
        IntentionRanking intentionRanking = new IntentionRanking();
        intentionRanking.setRanking(getPriorityScore(i));
        intentionDataDto.setRanking(intentionRanking);
        return intentionDataDto;
    }

    public static /* synthetic */ IntentionDataDto createRainbowIntentionDto$default(int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return createRainbowIntentionDto(i, z);
    }

    @NotNull
    public static final IntentionDataDto createSleepIntentionDto() {
        IntentionDataDto intentionDataDto = new IntentionDataDto(AirEcoIntentionConstants.INTENTION_NAME_SLEEP);
        IntentionProperty intentionProperty = new IntentionProperty();
        intentionProperty.setIntentId(AirEcoIntentionConstants.INTENTION_NAME_ID_SLEEP);
        intentionProperty.setName(AirEcoIntentionConstants.INTENTION_NAME_SLEEP);
        intentionDataDto.setIntentionProperty(intentionProperty);
        IntentionTarget intentionTarget = new IntentionTarget();
        intentionTarget.setImplUniqueCode(AirEcoIntentionConstants.WIDGET_SLEEP_2_2_ID);
        IntentionWidgetInfo intentionWidgetInfo = new IntentionWidgetInfo();
        intentionWidgetInfo.setWidgetProviderName(AirEcoIntentionConstants.WIDGET_PROVIDER_NAME_SLEEP_2_2);
        intentionTarget.setWidgetImplInfo(intentionWidgetInfo);
        intentionDataDto.setTarget(CollectionsKt__CollectionsJVMKt.listOf(intentionTarget));
        intentionDataDto.setIntentId(AirEcoIntentionConstants.INTENTION_NAME_ID_SLEEP);
        intentionDataDto.setEventType(1);
        intentionDataDto.setCreateTime(System.currentTimeMillis());
        IntentionRanking intentionRanking = new IntentionRanking();
        intentionRanking.setRanking(getPriorityScore(0));
        intentionDataDto.setRanking(intentionRanking);
        return intentionDataDto;
    }

    @NotNull
    public static final IntentionDataDto createStepsIntentionDto(@IntentionType int i, boolean z) {
        IntentionDataDto intentionDataDto = new IntentionDataDto(i != 2 ? AirEcoIntentionConstants.INSTANCE_ID_STEP_NOT_COMPLETE : AirEcoIntentionConstants.INSTANCE_ID_STEP_COMPLETE);
        IntentionProperty intentionProperty = new IntentionProperty();
        intentionProperty.setIntentId(AirEcoIntentionConstants.INTENTION_NAME_ID_STEPS);
        intentionProperty.setName(AirEcoIntentionConstants.INTENTION_NAME_STEPS);
        intentionDataDto.setIntentionProperty(intentionProperty);
        IntentionTarget intentionTarget = new IntentionTarget();
        intentionTarget.setImplUniqueCode(AirEcoIntentionConstants.WIDGET_STEP_2_2_ID);
        IntentionWidgetInfo intentionWidgetInfo = new IntentionWidgetInfo();
        intentionWidgetInfo.setWidgetProviderName(AirEcoIntentionConstants.WIDGET_PROVIDER_NAME_STEPS_2_2);
        intentionTarget.setWidgetImplInfo(intentionWidgetInfo);
        intentionDataDto.setTarget(CollectionsKt__CollectionsJVMKt.listOf(intentionTarget));
        if (i == 3) {
            intentionDataDto.setPeriodList(get6To9PMIntentionPeriodList(z));
        }
        intentionDataDto.setIntentId(AirEcoIntentionConstants.INTENTION_NAME_ID_STEPS);
        intentionDataDto.setEventType(1);
        intentionDataDto.setCreateTime(System.currentTimeMillis());
        IntentionRanking intentionRanking = new IntentionRanking();
        intentionRanking.setRanking(getPriorityScore(i));
        intentionDataDto.setRanking(intentionRanking);
        return intentionDataDto;
    }

    public static /* synthetic */ IntentionDataDto createStepsIntentionDto$default(int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return createStepsIntentionDto(i, z);
    }

    @NotNull
    public static final List<IntentionPeriod> get6To9PMIntentionPeriodList(boolean z) {
        int i;
        int i2;
        if (z) {
            i = 42;
            i2 = 45;
        } else {
            i = 18;
            i2 = 21;
        }
        return CollectionsKt__CollectionsJVMKt.listOf(getIntentionPeriod(i, i2));
    }

    private static final IntentionDataDto getDto(int i, boolean z) {
        if (i == 0) {
            return createSleepIntentionDto();
        }
        if (i == 1) {
            return createRainbowIntentionDto$default(1, false, 2, null);
        }
        if (i == 2) {
            return createStepsIntentionDto$default(2, false, 2, null);
        }
        if (i == 3) {
            return createStepsIntentionDto(3, z);
        }
        if (i != 4) {
            return i != 5 ? createSleepIntentionDto() : createRainbowIntentionDto$default(5, false, 2, null);
        }
        return createRainbowIntentionDto(4, z);
    }

    public static /* synthetic */ IntentionDataDto getDto$default(int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return getDto(i, z);
    }

    @NotNull
    public static final List<IntentionDataDto> getIntentionDtoList(@NotNull int... intentionType) {
        Intrinsics.checkNotNullParameter(intentionType, "intentionType");
        ArrayList arrayList = new ArrayList();
        for (int i : intentionType) {
            arrayList.add(getDto$default(i, false, 2, null));
            if (i == 2) {
                arrayList.add(getDto(3, true));
            } else if (i == 5) {
                arrayList.add(getDto(4, true));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final String getIntentionName(@IntentionType int i) {
        if (i == 0) {
            return "CHECK_SLEEP_REPORT";
        }
        if (i == 1) {
            return "RAINBOW_ALL_FINISH";
        }
        if (i == 2) {
            return "STEP_GOAL_FINISH";
        }
        if (i == 3) {
            return "STEP_GOAL_NOT_FINISH";
        }
        if (i != 4) {
            return i != 5 ? DeviceTypes.UNKNOWN : "RAINBOW_PARTIAL_FINISH";
        }
        return "RAINBOW_NOT_FINISH";
    }

    @NotNull
    public static final IntentionPeriod getIntentionPeriod(int i, int i2) {
        long j = 1000;
        long jChangeZeroOfTheDay = FitnessDateUtils.changeZeroOfTheDay(System.currentTimeMillis() / j, FitnessDateUtils.getCurrentTZOffsetInSec());
        TimeUnit timeUnit = TimeUnit.HOURS;
        return new IntentionPeriod((timeUnit.toSeconds(i) + jChangeZeroOfTheDay) * j, (jChangeZeroOfTheDay + timeUnit.toSeconds(i2)) * j);
    }

    public static final int getPriorityScore(@IntentionType int i) {
        if (i == 0) {
            return 47;
        }
        if (i == 1 || i == 2) {
            return 24;
        }
        return (i == 3 || i == 4 || i == 5) ? 22 : 0;
    }

    public static final boolean getSupportAirEcoIntentionAccess() {
        return !AppUtil.INSTANCE.isPlayChannel() && RomUtils.INSTANCE.isMIUIRom(ApplicationExtKt.getApplication()) && Build.VERSION.SDK_INT >= 29;
    }

    @Nullable
    public static final String getWidgetIntentId(@IntentionType int i) {
        if (i == 0) {
            return AirEcoIntentionConstants.INTENTION_NAME_SLEEP;
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                return AirEcoIntentionConstants.INTENTION_NAME_STEPS;
            }
            if (i != 4 && i != 5) {
                return null;
            }
        }
        return AirEcoIntentionConstants.INTENTION_NAME_RAINBOW;
    }

    public static final void sendNotifyIntentionToAirEcoIfSupportive(@NotNull int[] intentionType, @NotNull String callSite) {
        Intrinsics.checkNotNullParameter(intentionType, "intentionType");
        Intrinsics.checkNotNullParameter(callSite, "callSite");
        for (int i : intentionType) {
            Logger.i(TAG, "sendNotifyIntentionToAirEcoIfSupportive intentionType=" + i + " intentionName=" + getIntentionName(i) + " callSite=" + callSite);
        }
        if (getSupportAirEcoIntentionAccess()) {
            Bundle bundle = new Bundle();
            List<IntentionDataDto> intentionDtoList = getIntentionDtoList(Arrays.copyOf(intentionType, intentionType.length));
            if (intentionDtoList.isEmpty()) {
                return;
            }
            String strA = xpd.a(intentionDtoList);
            Logger.i(TAG, "sendNotifyIntentionToAirEcoIfSupportive intentionListJsonStr=" + strA);
            bundle.putString("key_param_intention", strA);
            AnyExtKt.io$default(null, new AnonymousClass2(bundle, null), 1, null);
        }
    }
}
