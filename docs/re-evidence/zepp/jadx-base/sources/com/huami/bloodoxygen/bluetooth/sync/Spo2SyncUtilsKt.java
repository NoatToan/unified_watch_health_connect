package com.huami.bloodoxygen.bluetooth.sync;

import com.huami.bloodoxygen.bluetooth.synctime.remote.api.property.BloodOxygenSyncTime;
import com.huami.bloodoxygen.bluetooth.usecase.synctime.GetBleSyncTimeUseCase;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.core.local.config.BloodOxygenCoroutineScope;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u001a\u001e\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u001a(\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u001a\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a2\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001\"\u0016\u0010\u0011\u001a\u00020\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "", "userId", "snFromSnService", "", "syncClickSpo2", "syncOsaProcess", "", "isYorkAndVersionNotSupport", "syncOsaEvent", "", "b", "syncOsa", "syncSpo2", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "a", "()Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "bleSyncTime", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class Spo2SyncUtilsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.bluetooth.sync.Spo2SyncUtilsKt$syncSpo2$1", f = "Spo2SyncUtils.kt", i = {0, 0, 0}, l = {111, 115, 117}, m = "invokeSuspend", n = {"dataList", "callback", "$this$invokeSuspend_u24lambda_u2d0"}, s = {"L$1", "L$2", "L$5"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public boolean h;
        public boolean i;
        public int j;
        public final /* synthetic */ String k;
        public final /* synthetic */ HMMiLiProDevice l;
        public final /* synthetic */ String m;
        public final /* synthetic */ boolean n;
        public final /* synthetic */ boolean o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, HMMiLiProDevice hMMiLiProDevice, String str2, boolean z, boolean z2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.k = str;
            this.l = hMMiLiProDevice;
            this.m = str2;
            this.n = z;
            this.o = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.k, this.l, this.m, this.n, this.o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x011b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x011c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ArrayList arrayList;
            boolean z;
            HMMiLiProDevice hMMiLiProDevice;
            Object objC;
            BloodOxygenSyncTime bloodOxygenSyncTime;
            ArrayList arrayList2;
            boolean z2;
            Spo2DataCallback spo2DataCallback;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Object objC2;
            ArrayList arrayList5;
            HMMiLiProDevice hMMiLiProDevice2;
            Spo2DataCallback spo2DataCallback2;
            ArrayList arrayList6;
            Object objC3;
            ArrayList arrayList7;
            ArrayList arrayList8;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.j;
            if (i != 0) {
                if (i == 1) {
                    z2 = this.i;
                    boolean z3 = this.h;
                    ArrayList arrayList9 = (ArrayList) this.g;
                    ArrayList arrayList10 = (ArrayList) this.f;
                    HMMiLiProDevice hMMiLiProDevice3 = (HMMiLiProDevice) this.e;
                    ArrayList arrayList11 = (ArrayList) this.d;
                    Spo2DataCallback spo2DataCallback3 = (Spo2DataCallback) this.c;
                    ArrayList arrayList12 = (ArrayList) this.b;
                    bloodOxygenSyncTime = (BloodOxygenSyncTime) this.a;
                    ResultKt.throwOnFailure(obj);
                    arrayList2 = arrayList12;
                    spo2DataCallback = spo2DataCallback3;
                    arrayList4 = arrayList11;
                    hMMiLiProDevice = hMMiLiProDevice3;
                    arrayList3 = arrayList9;
                    arrayList = arrayList10;
                    z = z3;
                    objC = obj;
                } else if (i == 2) {
                    z2 = this.h;
                    ArrayList arrayList13 = (ArrayList) this.g;
                    arrayList5 = (ArrayList) this.f;
                    HMMiLiProDevice hMMiLiProDevice4 = (HMMiLiProDevice) this.e;
                    ArrayList arrayList14 = (ArrayList) this.d;
                    spo2DataCallback2 = (Spo2DataCallback) this.c;
                    arrayList6 = (ArrayList) this.b;
                    BloodOxygenSyncTime bloodOxygenSyncTime2 = (BloodOxygenSyncTime) this.a;
                    ResultKt.throwOnFailure(obj);
                    bloodOxygenSyncTime = bloodOxygenSyncTime2;
                    arrayList4 = arrayList14;
                    hMMiLiProDevice2 = hMMiLiProDevice4;
                    arrayList = arrayList13;
                    objC2 = obj;
                    arrayList.addAll((Collection) objC2);
                    long osaEventTime = bloodOxygenSyncTime.getOsaEventTime();
                    byte b = Spo2SyncUtilsKt.b(z2);
                    this.a = arrayList6;
                    this.b = spo2DataCallback2;
                    this.c = arrayList4;
                    this.d = arrayList5;
                    this.e = null;
                    this.f = null;
                    this.g = null;
                    this.j = 3;
                    objC3 = Spo2SyncUtilsKt.c(hMMiLiProDevice2, osaEventTime, b, this);
                    if (objC3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList7 = arrayList5;
                    arrayList8 = arrayList6;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList7 = (ArrayList) this.d;
                    Spo2DataCallback spo2DataCallback4 = (Spo2DataCallback) this.b;
                    arrayList8 = (ArrayList) this.a;
                    ResultKt.throwOnFailure(obj);
                    spo2DataCallback2 = spo2DataCallback4;
                    objC3 = obj;
                }
                arrayList7.addAll((Collection) objC3);
                arrayList2 = arrayList8;
                spo2DataCallback = spo2DataCallback2;
                spo2DataCallback.onFinish((List<? extends Spo2Data>) arrayList2);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            BloodOxygenSyncTime bloodOxygenSyncTimeA = Spo2SyncUtilsKt.a();
            arrayList = new ArrayList();
            Spo2DataCallback spo2DataCallback5 = new Spo2DataCallback(bloodOxygenSyncTimeA, this.k, this.l.getDeviceInfo(), this.m);
            z = this.n;
            boolean z4 = this.o;
            hMMiLiProDevice = this.l;
            long clickSpo2Time = bloodOxygenSyncTimeA.getClickSpo2Time();
            this.a = bloodOxygenSyncTimeA;
            this.b = arrayList;
            this.c = spo2DataCallback5;
            this.d = arrayList;
            this.e = hMMiLiProDevice;
            this.f = arrayList;
            this.g = arrayList;
            this.h = z;
            this.i = z4;
            this.j = 1;
            objC = Spo2SyncUtilsKt.c(hMMiLiProDevice, clickSpo2Time, (byte) 37, this);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            bloodOxygenSyncTime = bloodOxygenSyncTimeA;
            arrayList2 = arrayList;
            z2 = z4;
            spo2DataCallback = spo2DataCallback5;
            arrayList3 = arrayList2;
            arrayList4 = arrayList3;
            arrayList3.addAll((Collection) objC);
            if (z) {
                long osaProcessTime = bloodOxygenSyncTime.getOsaProcessTime();
                this.a = bloodOxygenSyncTime;
                this.b = arrayList2;
                this.c = spo2DataCallback;
                this.d = arrayList4;
                this.e = hMMiLiProDevice;
                this.f = arrayList;
                this.g = arrayList;
                this.h = z2;
                this.j = 2;
                objC2 = Spo2SyncUtilsKt.c(hMMiLiProDevice, osaProcessTime, (byte) 38, this);
                if (objC2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList5 = arrayList;
                hMMiLiProDevice2 = hMMiLiProDevice;
                spo2DataCallback2 = spo2DataCallback;
                arrayList6 = arrayList2;
                arrayList.addAll((Collection) objC2);
                long osaEventTime2 = bloodOxygenSyncTime.getOsaEventTime();
                byte b2 = Spo2SyncUtilsKt.b(z2);
                this.a = arrayList6;
                this.b = spo2DataCallback2;
                this.c = arrayList4;
                this.d = arrayList5;
                this.e = null;
                this.f = null;
                this.g = null;
                this.j = 3;
                objC3 = Spo2SyncUtilsKt.c(hMMiLiProDevice2, osaEventTime2, b2, this);
                if (objC3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList7 = arrayList5;
                arrayList8 = arrayList6;
                arrayList7.addAll((Collection) objC3);
                arrayList2 = arrayList8;
                spo2DataCallback = spo2DataCallback2;
            }
            spo2DataCallback.onFinish((List<? extends Spo2Data>) arrayList2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BloodOxygenSyncTime a() {
        return ((GetBleSyncTimeUseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(GetBleSyncTimeUseCase.class), null, null)).execute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte b(boolean z) {
        return z ? (byte) 43 : (byte) 39;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(HMMiLiProDevice hMMiLiProDevice, long j, byte b, Continuation<? super List<? extends Spo2Data>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * ((long) 1000));
        Unit unit = Unit.INSTANCE;
        hMMiLiProDevice.startSyncSpo2Data(calendar, b, new HMCallback<List<? extends Spo2Data>>() { // from class: com.huami.bloodoxygen.bluetooth.sync.Spo2SyncUtilsKt$syncSpo2$syncData$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(false);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(@Nullable List<? extends Spo2Data> data) {
                super.onFinish(data);
                CancellableContinuation<List<? extends Spo2Data>> cancellableContinuation = cancellableContinuationImpl;
                if (data == null) {
                    data = new ArrayList<>();
                }
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m3845constructorimpl(data));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final void syncClickSpo2(@NotNull HMMiLiProDevice hMMiLiProDevice, @NotNull String str, @Nullable String str2) {
        BloodOxygenSyncTime bloodOxygenSyncTimeA = a();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(bloodOxygenSyncTimeA.getClickSpo2Time() * ((long) 1000));
        Unit unit = Unit.INSTANCE;
        hMMiLiProDevice.startSyncSpo2Data(calendar, (byte) 37, new Spo2DataCallback(bloodOxygenSyncTimeA, str, hMMiLiProDevice.getDeviceInfo(), str2));
    }

    public static /* synthetic */ void syncClickSpo2$default(HMMiLiProDevice hMMiLiProDevice, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        syncClickSpo2(hMMiLiProDevice, str, str2);
    }

    public static final void syncOsaEvent(@NotNull HMMiLiProDevice hMMiLiProDevice, @NotNull String str, boolean z, @Nullable String str2) {
        BloodOxygenSyncTime bloodOxygenSyncTimeA = a();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(bloodOxygenSyncTimeA.getOsaEventTime() * ((long) 1000));
        Unit unit = Unit.INSTANCE;
        hMMiLiProDevice.startSyncSpo2Data(calendar, b(z), new Spo2DataCallback(bloodOxygenSyncTimeA, str, hMMiLiProDevice.getDeviceInfo(), str2));
    }

    public static /* synthetic */ void syncOsaEvent$default(HMMiLiProDevice hMMiLiProDevice, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        syncOsaEvent(hMMiLiProDevice, str, z, str2);
    }

    public static final void syncOsaProcess(@NotNull HMMiLiProDevice hMMiLiProDevice, @NotNull String str, @Nullable String str2) {
        BloodOxygenSyncTime bloodOxygenSyncTimeA = a();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(bloodOxygenSyncTimeA.getOsaProcessTime() * ((long) 1000));
        Unit unit = Unit.INSTANCE;
        hMMiLiProDevice.startSyncSpo2Data(calendar, (byte) 38, new Spo2DataCallback(bloodOxygenSyncTimeA, str, hMMiLiProDevice.getDeviceInfo(), str2));
    }

    public static /* synthetic */ void syncOsaProcess$default(HMMiLiProDevice hMMiLiProDevice, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        syncOsaProcess(hMMiLiProDevice, str, str2);
    }

    public static final void syncSpo2(@NotNull HMMiLiProDevice hMMiLiProDevice, @NotNull String str, boolean z, boolean z2, @Nullable String str2) {
        BloodOxygenCoroutineScope bloodOxygenCoroutineScope = (BloodOxygenCoroutineScope) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().getOrNull(Reflection.getOrCreateKotlinClass(BloodOxygenCoroutineScope.class), null, null);
        if (bloodOxygenCoroutineScope == null) {
            return;
        }
        e.f(bloodOxygenCoroutineScope, null, null, new a(str, hMMiLiProDevice, str2, z, z2, null), 3, null);
    }

    public static /* synthetic */ void syncSpo2$default(HMMiLiProDevice hMMiLiProDevice, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        syncSpo2(hMMiLiProDevice, str, z, z2, str2);
    }
}
