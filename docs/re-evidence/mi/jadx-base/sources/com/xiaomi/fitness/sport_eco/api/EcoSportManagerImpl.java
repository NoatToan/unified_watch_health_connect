package com.xiaomi.fitness.sport_eco.api;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.eco.export.EcoSportManager;
import com.xiaomi.fitness.sport_eco.api.EcoSportManagerImpl;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import defpackage.fw7;
import defpackage.lp5;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/api/EcoSportManagerImpl;", "Lcom/xiaomi/fitness/sport/eco/export/EcoSportManager;", "Landroid/content/Context;", "context", "Landroid/app/ActivityOptions;", "activityOptions", "", "goToGymLaunchSportActivity", "(Landroid/content/Context;Landroid/app/ActivityOptions;)V", "", "did", "", "timestamp", "", DailyRecordKey.sportType, "Lfw7;", "callback", "openSportReport", "(Landroid/content/Context;Ljava/lang/String;JILfw7;)V", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoSportManagerImpl implements EcoSportManager {

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.api.EcoSportManagerImpl$openSportReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.api.EcoSportManagerImpl$openSportReport$1", f = "EcoSportApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ fw7 $callback;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $did;
        final /* synthetic */ int $sportType;
        final /* synthetic */ long $timestamp;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.api.EcoSportManagerImpl$openSportReport$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.api.EcoSportManagerImpl$openSportReport$1$1", f = "EcoSportApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ fw7 $callback;
            final /* synthetic */ Context $context;
            final /* synthetic */ SportBasicReport $theSportReport;
            final /* synthetic */ long $timestamp;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07831(SportBasicReport sportBasicReport, fw7 fw7Var, long j, Context context, Continuation<? super C07831> continuation) {
                super(2, continuation);
                this.$theSportReport = sportBasicReport;
                this.$callback = fw7Var;
                this.$timestamp = j;
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07831(this.$theSportReport, this.$callback, this.$timestamp, this.$context, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$theSportReport != null) {
                    this.$callback.invoke(Boxing.boxBoolean(true));
                    Bundle bundle = new Bundle();
                    bundle.putLong("time_stamp", this.$timestamp);
                    bundle.putSerializable("sport_report", this.$theSportReport);
                    bundle.putInt("sport_type", lp5.a(this.$theSportReport));
                    SportRecordApi.DefaultImpls.goSportDetail$default(SportRecordApiKt.getSportRecordApi(), this.$context, bundle, this.$theSportReport, false, 8, null);
                } else {
                    Logger.i("EcoSportManagerImpl", "openSportReport() theSportReport is null");
                    this.$callback.invoke(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i, long j, fw7 fw7Var, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$sportType = i;
            this.$timestamp = j;
            this.$callback = fw7Var;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$did, this.$sportType, this.$timestamp, this.$callback, this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AnyExtKt.main$default(null, new C07831(FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).getTheSportReport(this.$did, this.$sportType, this.$timestamp), this.$callback, this.$timestamp, this.$context, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goToGymLaunchSportActivity$lambda$0(Intent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.sport.eco.export.EcoSportManager
    public void goToGymLaunchSportActivity(@NotNull Context context, @Nullable ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        LaunchExtensionKt.startActivity(context, GymLaunchEcoSportActivity.class, activityOptions, new Function1() { // from class: ny7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoSportManagerImpl.goToGymLaunchSportActivity$lambda$0((Intent) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport.eco.export.EcoSportManager
    public void openSportReport(@NotNull Context context, @NotNull String did, long timestamp, int sportType, @NotNull fw7 callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AnyExtKt.io$default(null, new AnonymousClass1(did, sportType, timestamp, callback, context, null), 1, null);
    }
}
