package com.xiaomi.fitness.health.curse.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.fitness.export.api.CurseApi;
import com.xiaomi.fit.fitness.export.data.annotation.MenstruationHp;
import com.xiaomi.fit.fitness.export.data.annotation.MenstruationMood;
import com.xiaomi.fit.fitness.export.data.annotation.MenstruationPain;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0012J\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/curse/vm/CurseSymVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "api", "Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "getApi", "()Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "setApi", "(Lcom/xiaomi/fit/fitness/export/api/CurseApi;)V", "uploadEmitter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "getUploadEmitter", "()Landroidx/lifecycle/MutableLiveData;", "uploadSymptom", "", "dayMills", "", MedicalIdSPContract.PREF_BLOOD_TYPE, "", "motion", "hurt", "dayDataEmitter", "getDayDataEmitter", "reqSymptom", "mills", "attach", "savedInstanceState", "Landroid/os/Bundle;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseSymVM extends AbsViewModel {
    public CurseApi api;

    @NotNull
    private final MutableLiveData<WomenHealthSymptoms> uploadEmitter = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<WomenHealthSymptoms> dayDataEmitter = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSymVM$reqSymptom$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSymVM$reqSymptom$1", f = "CurseSymVM.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $mills;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$mills = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseSymVM.this.new AnonymousClass1(this.$mills, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                CurseSymVM$reqSymptom$1$data$1 curseSymVM$reqSymptom$1$data$1 = new CurseSymVM$reqSymptom$1$data$1(CurseSymVM.this, this.$mills, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, curseSymVM$reqSymptom$1$data$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CurseSymVM.this.getDayDataEmitter().setValue((WomenHealthSymptoms) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSymVM$uploadSymptom$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSymVM$uploadSymptom$1", f = "CurseSymVM.kt", i = {0}, l = {34}, m = "invokeSuspend", n = {EcgReportKey.symptom}, s = {"L$0"})
    public static final class C24471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $blood;
        final /* synthetic */ long $dayMills;
        final /* synthetic */ int $hurt;
        final /* synthetic */ int $motion;
        Object L$0;
        int label;
        final /* synthetic */ CurseSymVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24471(int i, int i2, int i3, long j, CurseSymVM curseSymVM, Continuation<? super C24471> continuation) {
            super(2, continuation);
            this.$blood = i;
            this.$motion = i2;
            this.$hurt = i3;
            this.$dayMills = j;
            this.this$0 = curseSymVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24471(this.$blood, this.$motion, this.$hurt, this.$dayMills, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WomenHealthSymptoms womenHealthSymptoms;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.$blood;
                Integer numBoxInt = i2 < 0 ? null : Boxing.boxInt(i2);
                int i3 = this.$motion;
                Integer numBoxInt2 = i3 < 0 ? null : Boxing.boxInt(i3);
                int i4 = this.$hurt;
                WomenHealthSymptoms womenHealthSymptoms2 = new WomenHealthSymptoms(this.$dayMills / ((long) 1000), numBoxInt, numBoxInt2, i4 < 0 ? null : Boxing.boxInt(i4));
                CoroutineDispatcher io2 = Dispatchers.getIO();
                CurseSymVM$uploadSymptom$1$ok$1 curseSymVM$uploadSymptom$1$ok$1 = new CurseSymVM$uploadSymptom$1$ok$1(this.this$0, womenHealthSymptoms2, null);
                this.L$0 = womenHealthSymptoms2;
                this.label = 1;
                Object objWithContext = BuildersKt.withContext(io2, curseSymVM$uploadSymptom$1$ok$1, this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                womenHealthSymptoms = womenHealthSymptoms2;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                womenHealthSymptoms = (WomenHealthSymptoms) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.d("CurseSymVM", "uploadSymptom: " + zBooleanValue);
            if (zBooleanValue) {
                this.this$0.getUploadEmitter().setValue(womenHealthSymptoms);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final CurseApi getApi() {
        CurseApi curseApi = this.api;
        if (curseApi != null) {
            return curseApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("api");
        return null;
    }

    @NotNull
    public final MutableLiveData<WomenHealthSymptoms> getDayDataEmitter() {
        return this.dayDataEmitter;
    }

    @NotNull
    public final MutableLiveData<WomenHealthSymptoms> getUploadEmitter() {
        return this.uploadEmitter;
    }

    public final void reqSymptom(long mills) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(mills, null), 3, null);
    }

    public final void setApi(@NotNull CurseApi curseApi) {
        Intrinsics.checkNotNullParameter(curseApi, "<set-?>");
        this.api = curseApi;
    }

    public final void uploadSymptom(long dayMills, @MenstruationHp int blood, @MenstruationMood int motion, @MenstruationPain int hurt) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C24471(blood, motion, hurt, dayMills, this, null), 3, null);
    }
}
