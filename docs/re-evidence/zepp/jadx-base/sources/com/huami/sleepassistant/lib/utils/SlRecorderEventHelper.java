package com.huami.sleepassistant.lib.utils;

import android.util.Log;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.bean.BaseEvent;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.builder.ExceptionEventBuilder;
import com.huami.sleepassistant.lib.utils.tools.HmWebSocketServer;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/SlRecorderEventHelper;", "", "Lcom/huami/mifit/analytics/bean/BaseEvent;", "e", "", "a", "eventBuilder", "recordDelegate", "", SlRecorderEventHelper.DECOMPRESSION_INTRO_START_V, "Ljava/lang/String;", SlRecorderEventHelper.DECOMPRESSION_INTRO_START_C, SlRecorderEventHelper.DECOMPRESSION_READY_BEGIN_V, SlRecorderEventHelper.DECOMPRESSION_READY_BEGIN_C, "<init>", "()V", "BreatheTrainHelper", "SleepEventHelper", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SlRecorderEventHelper {

    @NotNull
    public static final String DECOMPRESSION_INTRO_START_C = "DECOMPRESSION_INTRO_START_C";

    @NotNull
    public static final String DECOMPRESSION_INTRO_START_V = "DECOMPRESSION_INTRO_START_V";

    @NotNull
    public static final String DECOMPRESSION_READY_BEGIN_C = "DECOMPRESSION_READY_BEGIN_C";

    @NotNull
    public static final String DECOMPRESSION_READY_BEGIN_V = "DECOMPRESSION_READY_BEGIN_V";

    @NotNull
    public static final SlRecorderEventHelper INSTANCE = new SlRecorderEventHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¨\u0006\u000e"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/SlRecorderEventHelper$BreatheTrainHelper;", "", "", "inAssistant", "inBreatheAssistant", "breatheTrainingCount", "", "duration", "breatheTrainingTime", "", DbUtils.Const.Columns.Event.EVENT_ID, "uploadButtonEvent", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class BreatheTrainHelper {

        @NotNull
        public static final BreatheTrainHelper INSTANCE = new BreatheTrainHelper();

        private BreatheTrainHelper() {
        }

        public final void breatheTrainingCount() {
            SlRecorderEventHelper slRecorderEventHelper = SlRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("ASSTR_CPL");
            SlRecorderEventHelperKt.recordUser(countEventBuilder);
            slRecorderEventHelper.recordDelegate(SlRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void breatheTrainingTime(long duration) {
            SlRecorderEventHelper.INSTANCE.recordDelegate(new CalculationEventBuilder("ASSTR_T", duration).setAnonymous(false).setIdentified(true).setRealTimeRecord(true).addExtra("time", String.valueOf(duration)));
        }

        public final void inAssistant() {
            SlRecorderEventHelper slRecorderEventHelper = SlRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("ASST_V");
            SlRecorderEventHelperKt.recordUser(countEventBuilder);
            slRecorderEventHelper.recordDelegate(SlRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void inBreatheAssistant() {
            SlRecorderEventHelper slRecorderEventHelper = SlRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("ASSTR_V");
            SlRecorderEventHelperKt.recordUser(countEventBuilder);
            slRecorderEventHelper.recordDelegate(SlRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void uploadButtonEvent(@NotNull String eventId) {
            SlRecorderEventHelper slRecorderEventHelper = SlRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder(eventId);
            SlRecorderEventHelperKt.recordUser(countEventBuilder);
            slRecorderEventHelper.recordDelegate(SlRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¨\u0006\u000e"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/SlRecorderEventHelper$SleepEventHelper;", "", "", "playMusic", "inPlayMusic", "", "id", "playHotMusic", "type", "", "duration", "stayPlayTime", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class SleepEventHelper {

        @NotNull
        public static final SleepEventHelper INSTANCE = new SleepEventHelper();

        private SleepEventHelper() {
        }

        public final void inPlayMusic() {
            SlRecorderEventHelper slRecorderEventHelper = SlRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("ASSTSLEEP_V");
            SlRecorderEventHelperKt.recordUser(countEventBuilder);
            slRecorderEventHelper.recordDelegate(SlRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void playHotMusic(@NotNull String id) {
            SlRecorderEventHelper slRecorderEventHelper = SlRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("ASSTSLEEP_HOT_C");
            countEventBuilder.addExtra("id", id);
            SlRecorderEventHelperKt.recordUser(countEventBuilder);
            slRecorderEventHelper.recordDelegate(SlRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void playMusic() {
            SlRecorderEventHelper slRecorderEventHelper = SlRecorderEventHelper.INSTANCE;
            CountEventBuilder countEventBuilder = new CountEventBuilder("ASSTSLEEP_PLAY");
            SlRecorderEventHelperKt.recordUser(countEventBuilder);
            slRecorderEventHelper.recordDelegate(SlRecorderEventHelperKt.notRealTimeUpload(countEventBuilder));
        }

        public final void stayPlayTime(@NotNull String type, long duration) {
            SlRecorderEventHelper.INSTANCE.recordDelegate(new CalculationEventBuilder("ASSTSLEEP_T", duration).setAnonymous(false).setIdentified(true).setRealTimeRecord(true).addExtra("time", String.valueOf(duration)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleepassistant.lib.utils.SlRecorderEventHelper$recordDelegate$1", f = "SlRecorderEventHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
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
            try {
                Object obj2 = this.b;
                if (obj2 instanceof CountEventBuilder) {
                    Analytics.recordEvent((CountEventBuilder) obj2);
                    SlRecorderEventHelper.INSTANCE.a(((CountEventBuilder) this.b).build());
                } else if (obj2 instanceof CalculationEventBuilder) {
                    Analytics.recordEvent((CalculationEventBuilder) obj2);
                    SlRecorderEventHelper.INSTANCE.a(((CalculationEventBuilder) this.b).build());
                } else if (obj2 instanceof ExceptionEventBuilder) {
                    Analytics.recordEvent((ExceptionEventBuilder) obj2);
                    SlRecorderEventHelper.INSTANCE.a(((ExceptionEventBuilder) this.b).build());
                }
            } catch (Exception e) {
                Log.e(HmWebSocketServer.tag, "error", e);
            } catch (Throwable th) {
                Log.e(HmWebSocketServer.tag, "error", th);
            }
            return Unit.INSTANCE;
        }
    }

    private SlRecorderEventHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(BaseEvent e) {
    }

    public final void recordDelegate(@Nullable Object eventBuilder) {
        BuildersKt.launch(GlobalScope.INSTANCE, Dispatchers.getDefault(), CoroutineStart.DEFAULT, new a(eventBuilder, null));
    }
}
