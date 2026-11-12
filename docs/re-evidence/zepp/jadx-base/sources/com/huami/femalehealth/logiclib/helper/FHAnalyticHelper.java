package com.huami.femalehealth.logiclib.helper;

import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.builder.ExceptionEventBuilder;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0002H\u0002JC\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\b\fH\u0082\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\bR\u0016\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/huami/femalehealth/logiclib/helper/FHAnalyticHelper;", "", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "e", "b", "c", "a", "R", "", "id", "fr", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "f", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "eventBuilder", "", GoogleApiAvailabilityLight.a, "visitFemale", "TAG", "Ljava/lang/String;", "ID", "TP", "FR", "POS", "EVENT_ID_VISIT_WOMEN", "FR_SPORT", "FR_STATUS_CARD", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class FHAnalyticHelper {

    @NotNull
    public static final String FR = "fr";

    @NotNull
    public static final String FR_SPORT = "sport";

    @NotNull
    public static final String FR_STATUS_CARD = "status_card";

    @NotNull
    public static final String ID = "id";

    @NotNull
    public static final FHAnalyticHelper INSTANCE = new FHAnalyticHelper();

    @NotNull
    public static final String POS = "pos";

    @NotNull
    public static final String TAG = "FHAnalyticHelper";

    @NotNull
    public static final String TP = "tp";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String EVENT_ID_VISIT_WOMEN = "DETAIL_WOMEN_V";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.helper.FHAnalyticHelper$recordDelegate$1", f = "FHAnalyticHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
                } else if (obj2 instanceof CalculationEventBuilder) {
                    Analytics.recordEvent((CalculationEventBuilder) obj2);
                } else if (obj2 instanceof ExceptionEventBuilder) {
                    Analytics.recordEvent((ExceptionEventBuilder) obj2);
                }
            } catch (Throwable th) {
                Log.e(FHAnalyticHelper.TAG, "error", th);
            }
            return Unit.INSTANCE;
        }
    }

    private FHAnalyticHelper() {
    }

    private final CountEventBuilder a(CountEventBuilder countEventBuilder) {
        countEventBuilder.setRealTimeRecord(false);
        return countEventBuilder;
    }

    private final CountEventBuilder b(CountEventBuilder countEventBuilder) {
        countEventBuilder.setAnonymous(true);
        countEventBuilder.setIdentified(false);
        return countEventBuilder;
    }

    private final CountEventBuilder c(CountEventBuilder countEventBuilder) {
        countEventBuilder.setRealTimeRecord(true);
        return countEventBuilder;
    }

    private final void d(Object eventBuilder) {
        BuildersKt.launch(GlobalScope.INSTANCE, Dispatchers.getDefault(), CoroutineStart.DEFAULT, new a(eventBuilder, null));
    }

    private final CountEventBuilder e(CountEventBuilder countEventBuilder) {
        countEventBuilder.setAnonymous(false);
        countEventBuilder.setIdentified(true);
        return countEventBuilder;
    }

    private final <R> R f(String id, String fr, Function1<? super CountEventBuilder, ? extends R> block) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(id);
        if (fr != null) {
            countEventBuilder.addExtra("fr", fr);
        }
        return block.invoke(countEventBuilder);
    }

    public static /* synthetic */ Object g(FHAnalyticHelper fHAnalyticHelper, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        CountEventBuilder countEventBuilder = new CountEventBuilder(str);
        if (str2 != null) {
            countEventBuilder.addExtra("fr", str2);
        }
        return function1.invoke(countEventBuilder);
    }

    public final void visitFemale(@NotNull String fr) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(EVENT_ID_VISIT_WOMEN);
        countEventBuilder.addExtra("fr", fr);
        FHAnalyticHelper fHAnalyticHelper = INSTANCE;
        fHAnalyticHelper.e(countEventBuilder);
        d(fHAnalyticHelper.a(countEventBuilder));
    }
}
