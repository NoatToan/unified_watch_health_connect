package com.huami.worldclock.home;

import android.content.Context;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.DataChangeCallback;
import com.huami.bluetooth.profile.channel.module.WorldClockModule;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.worldclock.WorldClockCoroutineExceptionHandlerKt;
import com.huami.worldclock.bean.AppType;
import com.huami.worldclock.bean.Operation;
import com.huami.worldclock.bean.WorldClockBean;
import com.huami.worldclock.controller.IWorldClockController;
import com.huami.worldclock.controller.WorldClockController;
import com.huami.worldclock.koin.DeviceScopesAndQualifierKt;
import com.huami.worldclock.manager.TransformHelper;
import com.huami.worldclock.manager.WorldClockConfig;
import com.huami.worldclock.manager.WorldClockDataFactory;
import com.huami.worldclock.utils.DeviceLanguageUtils;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.worldclock.WorldTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001A\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0001OB\u0007¢\u0006\u0004\bM\u0010NJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J&\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0003J\u0016\u0010\u0015\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0006J\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0006J\u0016\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\b\u0010\u001f\u001a\u00020\u0003H\u0014R$\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0'0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R*\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\"R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\"R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0016\u00100\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010/R\u001f\u00104\u001a\u0004\u0018\u0001018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b!\u00103R\u001d\u00108\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b(\u00107R\u001d\u0010<\u001a\u0002098B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b$\u0010;R\u001f\u0010@\u001a\u0004\u0018\u00010=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b,\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR!\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b0E8F@\u0006¢\u0006\u0006\u001a\u0004\bF\u0010GR%\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0'0E8F@\u0006¢\u0006\u0006\u001a\u0004\bH\u0010GR'\u0010K\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'0E8F@\u0006¢\u0006\u0006\u001a\u0004\bJ\u0010GR\u0019\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0E8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001c\u0010GR\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100E8F@\u0006¢\u0006\u0006\u001a\u0004\bL\u0010G¨\u0006P"}, d2 = {"Lcom/huami/worldclock/home/WorldClockHomeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "h", "", "Lcom/huami/worldclock/bean/WorldClockBean;", "collections", "g", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "worldClockList", "Lcom/huami/worldclock/bean/Operation;", "operation", "f", "Lcom/huami/worldclock/bean/AppType;", "appType", "setAppType", "getWorldCityList", "worldClockBean", "addNewWorldClock", "deleteWorldClock", "", "srcPosition", "targetPosition", "swapList", "", "isEdit", "setIsEdit", "updateEditSource", "onCleared", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "_worldClockList", "b", "Ljava/util/List;", "_editWorldClockList", "Lkotlin/Pair;", "c", "_showLoading", GoogleApiAvailabilityLight.a, "_result", "e", "_isEdit", "_appType", "Lcom/huami/worldclock/bean/Operation;", "_operatorInEditStatus", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmBaseDevice", "Lcom/huami/worldclock/manager/WorldClockDataFactory;", "i", "()Lcom/huami/worldclock/manager/WorldClockDataFactory;", "worldClockDataFactory", "Lcom/huami/worldclock/controller/IWorldClockController;", z.j, "()Lcom/huami/worldclock/controller/IWorldClockController;", "worldClockController", "Lcom/huami/bluetooth/profile/channel/module/WorldClockModule;", hl.k, "()Lcom/huami/bluetooth/profile/channel/module/WorldClockModule;", "worldClockModule", "com/huami/worldclock/home/WorldClockHomeViewModel$dataChangeCallback$1", "l", "Lcom/huami/worldclock/home/WorldClockHomeViewModel$dataChangeCallback$1;", "dataChangeCallback", "Landroidx/lifecycle/LiveData;", "getWorldClockList", "()Landroidx/lifecycle/LiveData;", "getShowLoading", "showLoading", "getResult", "result", "getAppType", "<init>", "()V", "Companion", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class WorldClockHomeViewModel extends ViewModel implements KoinComponent {

    @NotNull
    private static final String m = "WorldClockHomeViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<WorldClockBean>> _worldClockList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<WorldClockBean> _editWorldClockList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Operation, Boolean>> _showLoading;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Operation, Boolean>> _result;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _isEdit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<AppType> _appType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private Operation _operatorInEditStatus;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmBaseDevice;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy worldClockDataFactory;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy worldClockController;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy worldClockModule;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final WorldClockHomeViewModel$dataChangeCallback$1 dataChangeCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.worldclock.home.WorldClockHomeViewModel$1", f = "WorldClockHomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockHomeViewModel.this.new a(continuation);
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
            WorldClockHomeViewModel.this.h();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.worldclock.home.WorldClockHomeViewModel$getWorldCityList$1", f = "WorldClockHomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockHomeViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableLiveData mutableLiveData = WorldClockHomeViewModel.this._worldClockList;
            WorldClockHomeViewModel worldClockHomeViewModel = WorldClockHomeViewModel.this;
            if (mutableLiveData.getValue() == 0) {
                List<WorldClockBean> localWorldClock = WorldClockConfig.INSTANCE.getLocalWorldClock();
                mutableLiveData.postValue(localWorldClock);
                worldClockHomeViewModel.g(localWorldClock);
            } else {
                WorldClockConfig.INSTANCE.updateWorldClockList((List) mutableLiveData.getValue());
                worldClockHomeViewModel.g((Collection) mutableLiveData.getValue());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.worldclock.home.WorldClockHomeViewModel$handleAddAction$1", f = "WorldClockHomeViewModel.kt", i = {}, l = {219, 240}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context c;
        public final /* synthetic */ List<WorldClockBean> d;
        public final /* synthetic */ Operation e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Locale a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Locale locale) {
                super(0);
                this.a = locale;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                StringBuilder sb = new StringBuilder();
                Locale locale = this.a;
                sb.append((Object) (locale == null ? null : locale.getCountry()));
                sb.append("--");
                Locale locale2 = this.a;
                sb.append((Object) (locale2 != null ? locale2.getLanguage() : null));
                return sb.toString();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, List<WorldClockBean> list, Operation operation, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = context;
            this.d = list;
            this.e = operation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockHomeViewModel.this.new c(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002c  */
        /* JADX WARN: Code duplicated, block: B:21:0x0042  */
        /* JADX WARN: Code duplicated, block: B:22:0x004f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0052  */
        /* JADX WARN: Code duplicated, block: B:25:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x0062  */
        /* JADX WARN: Code duplicated, block: B:31:0x008c  */
        /* JADX WARN: Code duplicated, block: B:33:0x0094  */
        /* JADX WARN: Code duplicated, block: B:36:0x009b  */
        /* JADX WARN: Code duplicated, block: B:37:0x009d  */
        /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:50:0x00c4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:54:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:60:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:65:0x00b1 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int iIntValue;
            List<WorldClockBean> deviceBuiltInWorldCity;
            List<WorldClockBean> listCombinationData;
            Locale deviceLanguageToLocale;
            Context context;
            ArrayList arrayList;
            int i;
            WorldClockModule worldClockModuleE;
            WorldClockBean worldClockBean;
            WorldTime worldTimeWorldClockBeanToWorldTime;
            boolean zBooleanValue;
            List list;
            Boolean bool;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                bool = (Boolean) obj;
                if (bool == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                if (zBooleanValue) {
                    ArrayList arrayList2 = new ArrayList(this.d);
                    WorldClockHomeViewModel.this._worldClockList.postValue(arrayList2);
                    WorldClockHomeViewModel.this.g(arrayList2);
                    WorldClockConfig.INSTANCE.updateWorldClockList(arrayList2);
                } else {
                    list = (List) WorldClockHomeViewModel.this._worldClockList.getValue();
                    if (list != null) {
                        WorldClockHomeViewModel worldClockHomeViewModel = WorldClockHomeViewModel.this;
                        worldClockHomeViewModel._editWorldClockList.clear();
                        worldClockHomeViewModel._editWorldClockList.addAll(list);
                    }
                }
                WorldClockHomeViewModel.this._showLoading.postValue(new Pair(this.e, Boxing.boxBoolean(false)));
                WorldClockHomeViewModel.this._result.postValue(new Pair(this.e, Boxing.boxBoolean(zBooleanValue)));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WorldClockModule worldClockModuleE2 = WorldClockHomeViewModel.this.e();
            if (worldClockModuleE2 == null) {
                iIntValue = 0;
            } else {
                this.a = 1;
                obj = WorldClockModule.queryVersion$default(worldClockModuleE2, false, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (iIntValue > 1) {
                deviceBuiltInWorldCity = WorldClockHomeViewModel.this.c().getDeviceBuiltInWorldCity(this.c);
            } else {
                deviceBuiltInWorldCity = null;
            }
            if (deviceBuiltInWorldCity == null) {
                listCombinationData = null;
            } else {
                listCombinationData = WorldClockHomeViewModel.this.c().combinationData(this.d, deviceBuiltInWorldCity);
            }
            if (listCombinationData == null) {
                listCombinationData = this.d;
            }
            deviceLanguageToLocale = DeviceLanguageUtils.INSTANCE.parseDeviceLanguageToLocale(WorldClockHomeViewModel.this.a());
            HMLog.info(WorldClockHomeViewModel.m, new a(deviceLanguageToLocale));
            context = this.c;
            arrayList = new ArrayList();
            i = 0;
            for (Object obj2 : listCombinationData) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                worldClockBean = (WorldClockBean) obj2;
                if (deviceLanguageToLocale == null) {
                    worldTimeWorldClockBeanToWorldTime = null;
                } else {
                    TransformHelper transformHelper = TransformHelper.INSTANCE;
                    if (!worldClockBean.isShow()) {
                        i = 255;
                    }
                    worldTimeWorldClockBeanToWorldTime = transformHelper.worldClockBeanToWorldTime(context, deviceLanguageToLocale, worldClockBean, i);
                }
                if (worldTimeWorldClockBeanToWorldTime != null) {
                    arrayList.add(worldTimeWorldClockBeanToWorldTime);
                }
                i = i3;
            }
            worldClockModuleE = WorldClockHomeViewModel.this.e();
            if (worldClockModuleE == null) {
                zBooleanValue = false;
            } else {
                this.a = 2;
                obj = worldClockModuleE.setWorldClock(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bool = (Boolean) obj;
                if (bool == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
            }
            if (zBooleanValue) {
                ArrayList arrayList3 = new ArrayList(this.d);
                WorldClockHomeViewModel.this._worldClockList.postValue(arrayList3);
                WorldClockHomeViewModel.this.g(arrayList3);
                WorldClockConfig.INSTANCE.updateWorldClockList(arrayList3);
            } else {
                list = (List) WorldClockHomeViewModel.this._worldClockList.getValue();
                if (list != null) {
                    WorldClockHomeViewModel worldClockHomeViewModel2 = WorldClockHomeViewModel.this;
                    worldClockHomeViewModel2._editWorldClockList.clear();
                    worldClockHomeViewModel2._editWorldClockList.addAll(list);
                }
            }
            WorldClockHomeViewModel.this._showLoading.postValue(new Pair(this.e, Boxing.boxBoolean(false)));
            WorldClockHomeViewModel.this._result.postValue(new Pair(this.e, Boxing.boxBoolean(zBooleanValue)));
            return Unit.INSTANCE;
            Integer num = (Integer) obj;
            if (num == null) {
                iIntValue = 0;
            } else {
                iIntValue = num.intValue();
            }
            if (iIntValue > 1) {
                deviceBuiltInWorldCity = WorldClockHomeViewModel.this.c().getDeviceBuiltInWorldCity(this.c);
            } else {
                deviceBuiltInWorldCity = null;
            }
            if (deviceBuiltInWorldCity == null) {
                listCombinationData = null;
            } else {
                listCombinationData = WorldClockHomeViewModel.this.c().combinationData(this.d, deviceBuiltInWorldCity);
            }
            if (listCombinationData == null) {
                listCombinationData = this.d;
            }
            deviceLanguageToLocale = DeviceLanguageUtils.INSTANCE.parseDeviceLanguageToLocale(WorldClockHomeViewModel.this.a());
            HMLog.info(WorldClockHomeViewModel.m, new a(deviceLanguageToLocale));
            context = this.c;
            arrayList = new ArrayList();
            i = 0;
            while (r13.hasNext()) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                worldClockBean = (WorldClockBean) obj2;
                if (deviceLanguageToLocale == null) {
                    worldTimeWorldClockBeanToWorldTime = null;
                } else {
                    TransformHelper transformHelper2 = TransformHelper.INSTANCE;
                    if (!worldClockBean.isShow()) {
                        i = 255;
                    }
                    worldTimeWorldClockBeanToWorldTime = transformHelper2.worldClockBeanToWorldTime(context, deviceLanguageToLocale, worldClockBean, i);
                }
                if (worldTimeWorldClockBeanToWorldTime != null) {
                    arrayList.add(worldTimeWorldClockBeanToWorldTime);
                }
                i = i4;
            }
            worldClockModuleE = WorldClockHomeViewModel.this.e();
            if (worldClockModuleE == null) {
                zBooleanValue = false;
            } else {
                this.a = 2;
                obj = worldClockModuleE.setWorldClock(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bool = (Boolean) obj;
                if (bool == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
            }
            if (zBooleanValue) {
                ArrayList arrayList4 = new ArrayList(this.d);
                WorldClockHomeViewModel.this._worldClockList.postValue(arrayList4);
                WorldClockHomeViewModel.this.g(arrayList4);
                WorldClockConfig.INSTANCE.updateWorldClockList(arrayList4);
            } else {
                list = (List) WorldClockHomeViewModel.this._worldClockList.getValue();
                if (list != null) {
                    WorldClockHomeViewModel worldClockHomeViewModel3 = WorldClockHomeViewModel.this;
                    worldClockHomeViewModel3._editWorldClockList.clear();
                    worldClockHomeViewModel3._editWorldClockList.addAll(list);
                }
            }
            WorldClockHomeViewModel.this._showLoading.postValue(new Pair(this.e, Boxing.boxBoolean(false)));
            WorldClockHomeViewModel.this._result.postValue(new Pair(this.e, Boxing.boxBoolean(zBooleanValue)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<HMBaseDevice> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMBaseDevice getA() {
            return DeviceScopesAndQualifierKt.getDeviceHolder(WorldClockHomeViewModel.this.getKoin()).getHmBaseDevice(HMDeviceType.MILI);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.worldclock.home.WorldClockHomeViewModel$queryWorClock$1", f = "WorldClockHomeViewModel.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/worldclock/bean/WorldClockBean;", "list", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<List<? extends WorldClockBean>, Unit> {
            public final /* synthetic */ WorldClockHomeViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WorldClockHomeViewModel worldClockHomeViewModel) {
                super(1);
                this.a = worldClockHomeViewModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends WorldClockBean> list) {
                invoke2((List<WorldClockBean>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<WorldClockBean> list) {
                this.a.setIsEdit(false);
                this.a._worldClockList.postValue(CollectionsKt___CollectionsKt.toMutableList((Collection) list));
                this.a.g(CollectionsKt___CollectionsKt.toMutableList((Collection) list));
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WorldClockHomeViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = WorldClockHomeViewModel.this.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
                WorldClockHomeViewModel worldClockHomeViewModel = WorldClockHomeViewModel.this;
                IWorldClockController iWorldClockControllerB = worldClockHomeViewModel.b();
                a aVar = new a(worldClockHomeViewModel);
                this.a = obj2;
                this.b = 1;
                if (iWorldClockControllerB.queryWorldTime((Context) obj2, aVar, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/worldclock/controller/WorldClockController;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<WorldClockController> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorldClockController getA() {
            return new WorldClockController();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/worldclock/manager/WorldClockDataFactory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<WorldClockDataFactory> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorldClockDataFactory getA() {
            return new WorldClockDataFactory();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/WorldClockModule;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<WorldClockModule> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorldClockModule getA() {
            HMBaseDevice hMBaseDeviceA;
            HMBaseDevice hMBaseDeviceA2 = WorldClockHomeViewModel.this.a();
            if (!(hMBaseDeviceA2 == null ? true : hMBaseDeviceA2 instanceof HMMiLiProDevice) || (hMBaseDeviceA = WorldClockHomeViewModel.this.a()) == null) {
                return null;
            }
            return (WorldClockModule) hMBaseDeviceA.getChannelModule(WorldClockModule.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.huami.bluetooth.profile.channel.module.DataChangeCallback, com.huami.worldclock.home.WorldClockHomeViewModel$dataChangeCallback$1] */
    public WorldClockHomeViewModel() {
        MutableLiveData<List<WorldClockBean>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        Unit unit = Unit.INSTANCE;
        this._worldClockList = mutableLiveData;
        this._editWorldClockList = new ArrayList();
        MutableLiveData<Pair<Operation, Boolean>> mutableLiveData2 = new MutableLiveData<>();
        Operation operation = Operation.NULL;
        Boolean bool = Boolean.FALSE;
        mutableLiveData2.setValue(new Pair<>(operation, bool));
        this._showLoading = mutableLiveData2;
        MutableLiveData<Pair<Operation, Boolean>> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(new Pair<>(operation, null));
        this._result = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        mutableLiveData4.setValue(bool);
        this._isEdit = mutableLiveData4;
        MutableLiveData<AppType> mutableLiveData5 = new MutableLiveData<>();
        mutableLiveData5.setValue(AppType.MIDONG);
        this._appType = mutableLiveData5;
        this._operatorInEditStatus = operation;
        this.hmBaseDevice = LazyKt__LazyJVMKt.lazy(new d());
        this.worldClockDataFactory = LazyKt__LazyJVMKt.lazy(h.a);
        this.worldClockController = LazyKt__LazyJVMKt.lazy(g.a);
        this.worldClockModule = LazyKt__LazyJVMKt.lazy(new i());
        ?? r0 = new DataChangeCallback() { // from class: com.huami.worldclock.home.WorldClockHomeViewModel$dataChangeCallback$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "world clock onNotify";
                }
            }

            @Override // com.huami.bluetooth.profile.channel.module.DataChangeCallback
            public void onNotify() {
                HMLog.info("WorldClockHomeViewModel", a.a);
                this.a.h();
            }
        };
        this.dataChangeCallback = r0;
        WorldClockModule worldClockModuleE = e();
        if (worldClockModuleE != 0) {
            worldClockModuleE.registerDataCallback(r0);
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBaseDevice a() {
        return (HMBaseDevice) this.hmBaseDevice.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IWorldClockController b() {
        return (IWorldClockController) this.worldClockController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WorldClockDataFactory c() {
        return (WorldClockDataFactory) this.worldClockDataFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WorldClockModule e() {
        return (WorldClockModule) this.worldClockModule.getValue();
    }

    private final void f(Context context, List<WorldClockBean> worldClockList, Operation operation) {
        this._showLoading.setValue(new Pair<>(operation, Boolean.TRUE));
        this._result.setValue(new Pair<>(operation, null));
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), WorldClockCoroutineExceptionHandlerKt.getWorldClockExceptionHandler().plus(Dispatchers.getIO()), null, new c(context, worldClockList, operation, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Collection<WorldClockBean> collections) {
        this._editWorldClockList.clear();
        this._editWorldClockList.addAll(collections);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        try {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(null), 2, null);
        } catch (Exception e2) {
            HMLog.info(m, new f(e2));
        }
    }

    public final void addNewWorldClock(@NotNull Context context, @NotNull WorldClockBean worldClockBean) {
        this._editWorldClockList.add(0, worldClockBean);
        f(context, this._editWorldClockList, Operation.ADD);
    }

    public final void deleteWorldClock(@NotNull Context context, @NotNull WorldClockBean worldClockBean) {
        this._editWorldClockList.remove(worldClockBean);
        if (Intrinsics.areEqual(this._isEdit.getValue(), Boolean.TRUE)) {
            this._operatorInEditStatus = Operation.DELETE;
        } else {
            f(context, this._editWorldClockList, Operation.DELETE);
        }
    }

    @NotNull
    public final LiveData<AppType> getAppType() {
        return this._appType;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final LiveData<Pair<Operation, Boolean>> getResult() {
        return this._result;
    }

    @NotNull
    public final LiveData<Pair<Operation, Boolean>> getShowLoading() {
        return this._showLoading;
    }

    public final void getWorldCityList() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(null), 2, null);
    }

    @NotNull
    public final LiveData<List<WorldClockBean>> getWorldClockList() {
        return this._worldClockList;
    }

    @NotNull
    public final LiveData<Boolean> isEdit() {
        return this._isEdit;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        WorldClockModule worldClockModuleE = e();
        if (worldClockModuleE != null) {
            worldClockModuleE.unRegisterDataCallback(this.dataChangeCallback);
        }
        super.onCleared();
    }

    public final void setAppType(@NotNull AppType appType) {
        this._appType.setValue(appType);
    }

    public final void setIsEdit(boolean isEdit) {
        List<WorldClockBean> value = this._worldClockList.getValue();
        if (value != null) {
            this._editWorldClockList.clear();
            this._editWorldClockList.addAll(value);
        }
        if (!isEdit && Intrinsics.areEqual(this._isEdit.getValue(), Boolean.TRUE)) {
            this._result.postValue(new Pair<>(Operation.NULL, Boolean.FALSE));
        }
        this._isEdit.postValue(Boolean.valueOf(isEdit));
    }

    public final void swapList(int srcPosition, int targetPosition) {
        if (Intrinsics.areEqual(this._isEdit.getValue(), Boolean.TRUE)) {
            this._operatorInEditStatus = Operation.SORT;
            Collections.swap(this._editWorldClockList, srcPosition, targetPosition);
        }
    }

    public final void updateEditSource(@NotNull Context context) {
        this._isEdit.setValue(Boolean.FALSE);
        Operation operation = this._operatorInEditStatus;
        Operation operation2 = Operation.NULL;
        if (operation == operation2) {
            return;
        }
        this._operatorInEditStatus = operation2;
        f(context, this._editWorldClockList, Operation.EDIT_COMPLETE);
    }
}
