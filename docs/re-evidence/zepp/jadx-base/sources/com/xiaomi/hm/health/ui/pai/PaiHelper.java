package com.xiaomi.hm.health.ui.pai;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import com.huami.device.feature.health.HealthDetect;
import com.huami.pai.dc.PaiWebConst;
import com.huami.pai.koin.ScopesAndQualifersKt;
import com.huami.pai.p004const.SharedPrefConst;
import com.huami.pai.sp.ISharedPref;
import com.huami.pai.ui.history.PAIHistroyRepo;
import com.huami.pai.ui.hrsetting.IHeartRateSettingFactory;
import com.huami.pai.vo.PAIDataVo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.dataflow.HealthData;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.model.summery.Pai;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0007J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/ui/pai/PaiHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isSupportPaiButDisabled", "isGt2", "isHealthDetect", "Lcom/xiaomi/hm/health/model/summery/Pai;", "rawPai", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "insertPaiToIndependentDb", "Landroidx/lifecycle/LiveData;", "showPaiToast", "Landroidx/fragment/app/FragmentActivity;", "Lcom/huami/pai/ui/history/PAIHistroyRepo;", "Lcom/huami/pai/vo/PAIDataVo;", "refreshPaiWithTime", "enableFullHeartRate", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PaiHelper {

    @NotNull
    public static final PaiHelper INSTANCE = new PaiHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.pai.PaiHelper$insertPaiToIndependentDb$1", f = "PaiHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Pai b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Pai pai, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = pai;
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
            ScopesAndQualifersKt.paiDb(GlobalContext.INSTANCE.get()).paiDao().insertPai(PaiHelperKt.a(this.b));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.pai.PaiHelper$showPaiToast$1", f = "PaiHelper.kt", i = {}, l = {135, 138, 140}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<Boolean> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.b;
                HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
                HMDeviceSource boundDeviceSource2 = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WATCH);
                HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
                if (boundDeviceSource == hMDeviceSource && boundDeviceSource2 == hMDeviceSource) {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                    this.a = 1;
                    if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (boundDeviceSource != hMDeviceSource) {
                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(!ConfigHelperKt.hasFeature(Feature.PAI_SOURCE_S, boundDeviceSource));
                    this.a = 2;
                    if (liveDataScope.emit(boolBoxBoolean2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Boolean boolBoxBoolean3 = Boxing.boxBoolean(!ConfigHelperKt.hasFeature(Feature.PAI_SOURCE_S, boundDeviceSource2));
                    this.a = 3;
                    if (liveDataScope.emit(boolBoxBoolean3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.pai.PaiHelper$refreshPaiWithTime$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.pai.PaiHelper$refreshPaiWithTime$1", f = "PaiHelper.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PAIHistroyRepo<PAIDataVo> b;
        public final /* synthetic */ Ref.LongRef c;
        public final /* synthetic */ ISharedPref d;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.pai.PaiHelper$refreshPaiWithTime$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/huami/pai/vo/PAIDataVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.ui.pai.PaiHelper$refreshPaiWithTime$1$1", f = "PaiHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<List<PAIDataVo>, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ PAIHistroyRepo<PAIDataVo> c;
            public final /* synthetic */ ISharedPref d;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.pai.PaiHelper$refreshPaiWithTime$1$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C1025a extends Lambda implements Function0<String> {
                public final /* synthetic */ PAIDataVo a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1025a(PAIDataVo pAIDataVo) {
                    super(0);
                    this.a = pAIDataVo;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "paiStr Re " + this.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PAIHistroyRepo<PAIDataVo> pAIHistroyRepo, ISharedPref iSharedPref, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = pAIHistroyRepo;
                this.d = iSharedPref;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Nullable List<PAIDataVo> list, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.c, this.d, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                List listTakeLast;
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.b;
                if (list != null && (listTakeLast = CollectionsKt___CollectionsKt.takeLast(list, 15)) != null) {
                    Iterator it2 = listTakeLast.iterator();
                    while (it2.hasNext()) {
                        HMLog.info(PaiWebConst.Tag.HTTP_TAG, new C1025a((PAIDataVo) it2.next()));
                    }
                }
                if (list != null) {
                    ISharedPref iSharedPref = this.d;
                    if (!list.isEmpty()) {
                        iSharedPref.saveString(SharedPrefConst.KEY_PAI_LAST_DOWNLOAD_TIME, String.valueOf(((PAIDataVo) CollectionsKt.last(list)).getTimestamp()));
                    }
                }
                this.c.saveUserPaiLocal(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.pai.PaiHelper$refreshPaiWithTime$1$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/huami/pai/vo/PAIDataVo;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.ui.pai.PaiHelper$refreshPaiWithTime$1$2", f = "PaiHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function3<FlowCollector<? super List<PAIDataVo>>, Throwable, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.pai.PaiHelper$refreshPaiWithTime$1$b$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "paiStr Ex " + this.a;
                }
            }

            public b(Continuation<? super b> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull FlowCollector<? super List<PAIDataVo>> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
                b bVar = new b(continuation);
                bVar.b = th;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HMLog.info(PaiWebConst.Tag.HTTP_TAG, new a((Throwable) this.b));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PAIHistroyRepo<PAIDataVo> pAIHistroyRepo, Ref.LongRef longRef, ISharedPref iSharedPref, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.b = pAIHistroyRepo;
            this.c = longRef;
            this.d = iSharedPref;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowM4456catch = FlowKt.m4456catch(FlowKt.flowOn(FlowKt.onEach(this.b.getRemoteChangedDatas(this.c.element), new a(this.b, this.d, null)), Dispatchers.getIO()), new b(null));
                FlowCollector<List<PAIDataVo>> flowCollector = new FlowCollector<List<PAIDataVo>>() { // from class: com.xiaomi.hm.health.ui.pai.PaiHelper$refreshPaiWithTime$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(List<PAIDataVo> list, @NotNull Continuation<? super Unit> continuation) {
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (flowM4456catch.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private PaiHelper() {
    }

    @JvmStatic
    public static final void insertPaiToIndependentDb(@NotNull Pai rawPai, @NotNull CoroutineScope coroutineScope) {
        e.f(coroutineScope, Dispatchers.getIO(), null, new a(rawPai, null), 2, null);
    }

    @JvmStatic
    public static final boolean isGt2() {
        return HMDeviceConfig.hasFeatureGT2(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI));
    }

    @JvmStatic
    public static final boolean isHealthDetect() {
        return HMDeviceManager.getInstance().supportHealthDetect();
    }

    @JvmStatic
    public static final boolean isSupportPaiButDisabled(@NotNull Context context) {
        if (!HMDeviceConfig.hasBoundPai() || HMDeviceConfig.isVirtual()) {
            return false;
        }
        if (HMDeviceConfig.hasBoundClassicWatch()) {
            if (!HealthData.isAllDayHR(context)) {
                return true;
            }
        } else if (!HealthDetect.INSTANCE.getHealthConfig().isDeviceAlldayHrMeasure()) {
            return true;
        }
        return false;
    }

    @JvmStatic
    @NotNull
    public static final LiveData<Boolean> showPaiToast() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new b(null), 3, (Object) null);
    }

    public final void enableFullHeartRate(@NotNull Context context) {
        if (context instanceof FragmentActivity) {
            try {
                ((IHeartRateSettingFactory) ScopesAndQualifersKt.paiScope(KoinJavaComponent.getKoin()).get(Reflection.getOrCreateKotlinClass(IHeartRateSettingFactory.class), null, null)).getHrDevice(1).setHeartRate(context);
            } catch (Exception unused) {
            }
        }
    }

    @NotNull
    public final PAIHistroyRepo<PAIDataVo> refreshPaiWithTime(@NotNull FragmentActivity context) {
        GlobalContext globalContext = GlobalContext.INSTANCE;
        PAIHistroyRepo<PAIDataVo> pAIHistroyRepo = (PAIHistroyRepo) ScopesAndQualifersKt.paiScope(globalContext.get()).get(Reflection.getOrCreateKotlinClass(PAIHistroyRepo.class), null, null);
        ISharedPref iSharedPref = (ISharedPref) ScopesAndQualifersKt.paiScope(globalContext.get()).get(Reflection.getOrCreateKotlinClass(ISharedPref.class), null, null);
        Ref.LongRef longRef = new Ref.LongRef();
        try {
            Long longOrNull = l.toLongOrNull(iSharedPref.getString(SharedPrefConst.KEY_PAI_LAST_DOWNLOAD_TIME, "0"));
            longRef.element = longOrNull == null ? 0L : longOrNull.longValue();
        } catch (Exception unused) {
        }
        e.f(LifecycleOwnerKt.getLifecycleScope(context), null, null, new AnonymousClass1(pAIHistroyRepo, longRef, iSharedPref, null), 3, null);
        return pAIHistroyRepo;
    }
}
