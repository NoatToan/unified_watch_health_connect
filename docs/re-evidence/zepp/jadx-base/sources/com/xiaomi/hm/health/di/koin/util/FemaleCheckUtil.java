package com.xiaomi.hm.health.di.koin.util;

import com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel;
import com.huami.femalehealth.uilib.viewmodel.StatusViewModel;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0013\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0013\u0010\t\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0013\u0010\f\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/util/FemaleCheckUtil;", "", "Lcom/huami/femalehealth/uilib/viewmodel/StatusViewModel;", "a", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/femalehealth/uilib/viewmodel/FemaleMifitViewModel;", "getFemaleViewModel", "hasData", "checkUserGenderFemale", "checkWomenHealthEnable", "checkFemaleHealthCardVisible", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FemaleCheckUtil {

    @NotNull
    public static final FemaleCheckUtil INSTANCE = new FemaleCheckUtil();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.util.FemaleCheckUtil", f = "FemaleCheckUtil.kt", i = {0}, l = {62}, m = "checkFemaleHealthCardVisible", n = {"deviceSource"}, s = {"L$1"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return FemaleCheckUtil.this.checkFemaleHealthCardVisible(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.util.FemaleCheckUtil", f = "FemaleCheckUtil.kt", i = {}, l = {49}, m = "suspendHasData", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return FemaleCheckUtil.this.b(this);
        }
    }

    private FemaleCheckUtil() {
    }

    private final StatusViewModel a() {
        return (StatusViewModel) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(StatusViewModel.class), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Continuation<? super Boolean> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objSuspendUpdateAndCheckHasData = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.c;
        boolean zBooleanValue = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSuspendUpdateAndCheckHasData);
            StatusViewModel statusViewModelA = a();
            if (statusViewModelA != null) {
                bVar.c = 1;
                objSuspendUpdateAndCheckHasData = statusViewModelA.suspendUpdateAndCheckHasData(bVar);
                if (objSuspendUpdateAndCheckHasData == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objSuspendUpdateAndCheckHasData);
        Boolean bool = (Boolean) objSuspendUpdateAndCheckHasData;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object checkFemaleHealthCardVisible(@NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        HMDeviceSource hMDeviceSource;
        FemaleCheckUtil femaleCheckUtil;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.e;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
            HMDeviceSource boundDeviceSource = hMDeviceManager.getBoundDeviceSource(hMDeviceManager.getMajorDeviceType());
            aVar.a = this;
            aVar.b = boundDeviceSource;
            aVar.e = 1;
            Object objB = b(aVar);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            hMDeviceSource = boundDeviceSource;
            obj = objB;
            femaleCheckUtil = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hMDeviceSource = (HMDeviceSource) aVar.b;
            femaleCheckUtil = (FemaleCheckUtil) aVar.a;
            ResultKt.throwOnFailure(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!ConfigHelperKt.hasFeature(Feature.FEMALE_HEALTH, hMDeviceSource) ? !zBooleanValue : !femaleCheckUtil.checkUserGenderFemale() && !femaleCheckUtil.checkWomenHealthEnable() && !zBooleanValue) {
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    public final boolean checkUserGenderFemale() {
        return HMPersonInfo.getInstance().getUserInfo().getGender() == 0;
    }

    public final boolean checkWomenHealthEnable() {
        return HMAppSortDataManager.getInstance().supportWomenHealth();
    }

    @Nullable
    public final FemaleMifitViewModel getFemaleViewModel() {
        return (FemaleMifitViewModel) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(FemaleMifitViewModel.class), null, null);
    }

    @Nullable
    public final Object hasData(@NotNull Continuation<? super Boolean> continuation) {
        Boolean boolBoxBoolean;
        StatusViewModel statusViewModelA = a();
        boolean zBooleanValue = false;
        if (statusViewModelA != null && (boolBoxBoolean = Boxing.boxBoolean(statusViewModelA.updateAndCheckHasData())) != null) {
            zBooleanValue = boolBoxBoolean.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }
}
