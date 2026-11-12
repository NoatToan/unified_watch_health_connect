package com.xiaomi.fitness.sport_eco_manager.remind;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fit.data.common.data.sport.SportSummary;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import defpackage.jz6;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/remind/SportRequest;", "", "", DailyRecordKey.sportType, "Lcom/xiaomi/fitness/sport_eco_manager/remind/SportRequest$OnSportMaxRecord;", "onSportMaxRecord", "", "requestBasetRecordFromService", "(ILcom/xiaomi/fitness/sport_eco_manager/remind/SportRequest$OnSportMaxRecord;)V", CervicalMucusRecord.Appearance.CLEAR, "()V", "", "TAG", "Ljava/lang/String;", "Ljz6;", "reuqestSportSummaryTask", "Ljz6;", "<init>", "OnSportMaxRecord", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportRequest {

    @NotNull
    public static final SportRequest INSTANCE = new SportRequest();

    @NotNull
    private static final String TAG = "SportRequest";

    @Nullable
    private static jz6 reuqestSportSummaryTask;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/remind/SportRequest$OnSportMaxRecord;", "", "onRecord", "", "maxDistance", "", "maxDuration", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnSportMaxRecord {
        void onRecord(int maxDistance, int maxDuration);
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco_manager.remind.SportRequest$requestBasetRecordFromService$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco_manager.remind.SportRequest$requestBasetRecordFromService$1", f = "SportRequest.kt", i = {}, l = {25, 26, 27, 28}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OnSportMaxRecord $onSportMaxRecord;
        final /* synthetic */ int $sportType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, OnSportMaxRecord onSportMaxRecord, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sportType = i;
            this.$onSportMaxRecord = onSportMaxRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$sportType, this.$onSportMaxRecord, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SportSummary sportSummary;
            SportSummary.MaxData maxData;
            SportSummary.MaxValue maxValue;
            SportSummary.MaxData maxData2;
            SportSummary.MaxValue maxValue2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.$sportType;
                if (i2 != 1) {
                    if (i2 == 2) {
                        SportSummaryApi sportSummaryApi = FitnessDataExtKt.getSportSummaryApi();
                        this.label = 4;
                        obj = sportSummaryApi.getTotalSummary("walking", this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sportSummary = (SportSummary) obj;
                    } else if (i2 != 3) {
                        if (i2 == 6) {
                            SportSummaryApi sportSummaryApi2 = FitnessDataExtKt.getSportSummaryApi();
                            this.label = 2;
                            obj = sportSummaryApi2.getTotalSummary("outdoor_riding", this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            sportSummary = (SportSummary) obj;
                        } else if (i2 != 7) {
                            sportSummary = null;
                        } else {
                            SportSummaryApi sportSummaryApi3 = FitnessDataExtKt.getSportSummaryApi();
                            this.label = 3;
                            obj = sportSummaryApi3.getTotalSummary("indoor_riding", this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            sportSummary = (SportSummary) obj;
                        }
                    }
                }
                SportSummaryApi sportSummaryApi4 = FitnessDataExtKt.getSportSummaryApi();
                this.label = 1;
                obj = sportSummaryApi4.getTotalSummary("running", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sportSummary = (SportSummary) obj;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                sportSummary = (SportSummary) obj;
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                sportSummary = (SportSummary) obj;
            } else if (i == 3) {
                ResultKt.throwOnFailure(obj);
                sportSummary = (SportSummary) obj;
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                sportSummary = (SportSummary) obj;
            }
            if (sportSummary != null) {
                OnSportMaxRecord onSportMaxRecord = this.$onSportMaxRecord;
                SportSummary.SummaryData summaryData = sportSummary.info;
                int i3 = 0;
                int i4 = (summaryData == null || (maxData2 = summaryData.max_distance) == null || (maxValue2 = maxData2.value) == null) ? 0 : (int) maxValue2.intValue;
                if (summaryData != null && (maxData = summaryData.max_duration) != null && (maxValue = maxData.value) != null) {
                    i3 = (int) maxValue.intValue;
                }
                onSportMaxRecord.onRecord(i4, i3);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private SportRequest() {
    }

    public final void clear() {
        jz6 jz6Var = reuqestSportSummaryTask;
        if (jz6Var != null) {
            jz6Var.dispose();
            reuqestSportSummaryTask = null;
        }
    }

    public final void requestBasetRecordFromService(int sportType, @NotNull OnSportMaxRecord onSportMaxRecord) {
        Intrinsics.checkNotNullParameter(onSportMaxRecord, "onSportMaxRecord");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(sportType, onSportMaxRecord, null), 3, null);
    }
}
