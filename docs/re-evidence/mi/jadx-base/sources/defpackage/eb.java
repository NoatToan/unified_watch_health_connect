package defpackage;

import com.huami.bluetooth.profile.channel.module.OtaModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.dfu.DfuState;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u001c\u0010\n\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0000\u001a\u001e\u0010\u0004\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u000e\u0010\n\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b\u001a\u000e\u0010\u0004\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b\u001a\u0016\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0012¨\u0006\u0014"}, d2 = {"", "Lxd;", "list", "Lib;", PluginDeviceInfo.FMODEL, "Lyd;", "type", "firmwares", "Lni;", "encoders", PluginDeviceInfo.FDESC, "Lne;", "bleDevice", "", "isForce", "Lcom/xiaomi/hm/health/bt/sdk/fw/IFirmwareProgressCallback;", "callback", "hmMiLiProDevice", "Lun;", "", "btData_wearRelease"}, k = 2, mv = {1, 7, 1})
public final class eb {

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bletool.device.firmware.FwCheckKt$getDeviceOtaResult$1", f = "FwCheck.kt", i = {}, l = {98, 99}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ ne u;
        public final /* synthetic */ un v;

        /* JADX INFO: renamed from: eb$a$a, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bletool.device.firmware.FwCheckKt$getDeviceOtaResult$1$1", f = "FwCheck.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0922a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ un u;
            public final /* synthetic */ OtaResult v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0922a(un unVar, OtaResult otaResult, Continuation<? super C0922a> continuation) {
                super(2, continuation);
                this.u = unVar;
                this.v = otaResult;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0922a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0922a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.u.a(this.v);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ne neVar, un unVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.u = neVar;
            this.v = unVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.u, this.v, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x004e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OtaResult otaResult;
            MainCoroutineDispatcher main;
            C0922a c0922a;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            OtaModule otaModule = (OtaModule) this.u.y(OtaModule.class);
            if (otaModule != null) {
                this.t = 1;
                obj = otaModule.getOtaInfo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                otaResult = null;
            }
            main = Dispatchers.getMain();
            c0922a = new C0922a(this.v, otaResult, null);
            this.t = 2;
            if (BuildersKt.withContext(main, c0922a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            otaResult = (OtaResult) obj;
            main = Dispatchers.getMain();
            c0922a = new C0922a(this.v, otaResult, null);
            this.t = 2;
            if (BuildersKt.withContext(main, c0922a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", PluginDeviceInfo.FMODEL, "kotlin.jvm.PlatformType", PluginDeviceInfo.FDESC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((xd) t).h().a() & 255), Integer.valueOf(((xd) t2).h().a() & 255));
        }
    }

    @NotNull
    public static final xd a(@NotNull yd type, @NotNull List<? extends xd> firmwares) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(firmwares, "firmwares");
        return b(type, a(firmwares));
    }

    @NotNull
    public static final xd b(@NotNull yd type, @NotNull List<? extends ni> encoders) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(encoders, "encoders");
        jv jvVar = new jv(4, 0, 0, true);
        jvVar.a(encoders);
        return new xd(new File(jvVar.a()).getAbsolutePath(), type);
    }

    public static final boolean a(@NotNull ne bleDevice, boolean z, @NotNull IFirmwareProgressCallback callback) {
        Object objM886constructorimpl;
        Object objM886constructorimpl2;
        Intrinsics.checkNotNullParameter(bleDevice, "bleDevice");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!z) {
            td tdVar = td.f34581a;
            qd qdVarP = bleDevice.P();
            Intrinsics.checkNotNullExpressionValue(qdVarP, "bleDevice.deviceSource");
            if (tdVar.a(qdVarP)) {
                try {
                    Result.Companion companion = Result.Companion;
                    objM886constructorimpl2 = Result.m886constructorimpl(bleDevice.Y1());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM886constructorimpl2 = Result.m886constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl2);
                if (thM889exceptionOrNullimpl != null) {
                    t5t.d("FwCheck", "dfuState is null:" + thM889exceptionOrNullimpl);
                }
                if (Result.m892isFailureimpl(objM886constructorimpl2)) {
                    objM886constructorimpl2 = null;
                }
                DfuState dfuState = (DfuState) objM886constructorimpl2;
                if ((dfuState != null && dfuState.getState() == 32) || ((dfuState != null && dfuState.getState() == 33) || (dfuState != null && dfuState.getState() == 48))) {
                    t5t.d("FwCheck", "not upgrade when DfuState=" + dfuState.getState());
                    callback.onError(dfuState.getState());
                    return false;
                }
            }
        }
        if (b(bleDevice)) {
            try {
                Result.Companion companion3 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(bleDevice.X3());
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM889exceptionOrNullimpl2 = Result.m889exceptionOrNullimpl(objM886constructorimpl);
            if (thM889exceptionOrNullimpl2 != null) {
                t5t.d("FwCheck", "dfuV5UpgradeStatus is null:" + thM889exceptionOrNullimpl2);
            }
            UpgradeStatus upgradeStatus = (UpgradeStatus) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
            if (upgradeStatus != null && upgradeStatus != UpgradeStatus.IDLE) {
                t5t.d("FwCheck", "not upgrade when UpgradeStatus=" + upgradeStatus);
                callback.onError(9);
                return false;
            }
        }
        t5t.d("FwCheck", "upgrade start");
        return true;
    }

    public static final boolean b(@NotNull ne bleDevice) {
        Intrinsics.checkNotNullParameter(bleDevice, "bleDevice");
        g4s g4sVarO = bleDevice.O();
        Feature featureA = g4sVarO != null ? g4sVarO.A() : null;
        if (featureA == null) {
            return false;
        }
        return featureA.hasBase(0);
    }

    public static final boolean a(@NotNull ne bleDevice) {
        Intrinsics.checkNotNullParameter(bleDevice, "bleDevice");
        g4s g4sVarO = bleDevice.O();
        Feature featureA = g4sVarO != null ? g4sVarO.A() : null;
        return featureA != null && featureA.hasBase(3) && featureA.hasBase(1);
    }

    public static final void a(@NotNull ne hmMiLiProDevice, @NotNull un callback) {
        Intrinsics.checkNotNullParameter(hmMiLiProDevice, "hmMiLiProDevice");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(hmMiLiProDevice, callback, null), 2, null);
    }

    @NotNull
    public static final List<ib> a(@NotNull List<? extends xd> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<xd> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new b());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
        for (xd xdVar : listSortedWith) {
            String strG = xdVar.g();
            Intrinsics.checkNotNullExpressionValue(strG, "it.fwPath");
            yd ydVarH = xdVar.h();
            Intrinsics.checkNotNullExpressionValue(ydVarH, "it.fwType");
            arrayList.add(new ib(strG, ydVarH));
        }
        return arrayList;
    }
}
