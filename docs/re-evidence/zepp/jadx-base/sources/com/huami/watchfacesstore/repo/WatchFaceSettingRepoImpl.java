package com.huami.watchfacesstore.repo;

import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.repo.SettingRepo;
import com.huami.tools.log.HMLog;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.huami.watchfacesstore.api.SettingApi;
import com.huami.watchfacesstore.bean.WatchFaceSetting;
import com.huami.watchfacesstore.device.channel.DeviceInfo;
import com.huami.watchfacesstore.room.WatchFaceDataBase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u0003H\u0002J\u0013\u0010\u000b\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016J\u0013\u0010\u000f\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010!\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u0017\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/huami/watchfacesstore/repo/WatchFaceSettingRepoImpl;", "Lcom/huami/watchfacesstore/repo/WatchFaceSettingRepo;", "Lorg/koin/core/component/KoinComponent;", "", "payEnableDevices", "", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "", "e", "getSettingAndSave", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isSupportPay", "deleteRecordBySetting", "Lcom/huami/watchfacesstore/api/SettingApi;", "Lcom/huami/watchfacesstore/api/SettingApi;", "api", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "c", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kv", "Lcom/huami/watchfacesstore/device/channel/DeviceInfo;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/watchfacesstore/device/channel/DeviceInfo;", "deviceInfo", "Lcom/huami/watchfacesstore/room/WatchFaceDataBase;", "()Lcom/huami/watchfacesstore/room/WatchFaceDataBase;", UserDataStore.DATE_OF_BIRTH, "<init>", "(Lcom/huami/watchfacesstore/api/SettingApi;Lkotlinx/coroutines/CoroutineDispatcher;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceSettingRepoImpl implements WatchFaceSettingRepo, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SettingApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence kv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy db;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.repo.WatchFaceSettingRepoImpl$deleteRecordByDevice$2", f = "WatchFaceSettingRepoImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX INFO: renamed from: com.huami.watchfacesstore.repo.WatchFaceSettingRepoImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0683a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0683a(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "deleteWatchFaceInfoByDevice rows: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceSettingRepoImpl.this.new a(this.c, continuation);
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
            HMLog.info(SettingRepo.TAG, new C0683a(WatchFaceSettingRepoImpl.this.c().watchFaceDao().deleteWatchFaceInfoByDevice(WatchFaceSettingRepoImpl.this.e(this.c))));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deleteRecordBySetting: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "local is diff with online, need delete " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "local is same with online, don't need delete";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.repo.WatchFaceSettingRepoImpl$getSettingAndSave$2", f = "WatchFaceSettingRepoImpl.kt", i = {0}, l = {38}, m = "invokeSuspend", n = {"it"}, s = {"L$1"})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public Object a;
        public Object b;
        public int c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ WatchFaceSetting a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceSetting watchFaceSetting) {
                super(0);
                this.a = watchFaceSetting;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "fetchSetting online: " + this.a.getPayEnableDevices();
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceSettingRepoImpl.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WatchFaceSettingRepoImpl watchFaceSettingRepoImpl;
            WatchFaceSetting watchFaceSetting;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchFaceSetting watchFaceSettingFetchSetting = WatchFaceSettingRepoImpl.this.api.fetchSetting();
                if (watchFaceSettingFetchSetting == null) {
                    return null;
                }
                watchFaceSettingRepoImpl = WatchFaceSettingRepoImpl.this;
                HMLog.info(SettingRepo.TAG, new a(watchFaceSettingFetchSetting));
                String payEnableDevices = watchFaceSettingFetchSetting.getPayEnableDevices();
                this.a = watchFaceSettingRepoImpl;
                this.b = watchFaceSettingFetchSetting;
                this.c = 1;
                if (watchFaceSettingRepoImpl.b(payEnableDevices, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                watchFaceSetting = watchFaceSettingFetchSetting;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                watchFaceSetting = (WatchFaceSetting) this.b;
                watchFaceSettingRepoImpl = (WatchFaceSettingRepoImpl) this.a;
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(watchFaceSettingRepoImpl.kv.setValue("wf.setting.key", watchFaceSetting.getPayEnableDevices()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetchSetting local: " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchFaceSettingRepoImpl(@NotNull SettingApi settingApi, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.api = settingApi;
        this.defaultDispatcher = coroutineDispatcher;
        final Qualifier qualifier = null;
        this.kv = KvKit.getKvPersistence$default("wfKvName", false, 2, null);
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceInfo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceInfo>() { // from class: com.huami.watchfacesstore.repo.WatchFaceSettingRepoImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.watchfacesstore.device.channel.DeviceInfo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceInfo invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceInfo.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.db = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<WatchFaceDataBase>() { // from class: com.huami.watchfacesstore.repo.WatchFaceSettingRepoImpl$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.watchfacesstore.room.WatchFaceDataBase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WatchFaceDataBase invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WatchFaceDataBase.class), objArr2, objArr3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(String str, Continuation<? super Unit> continuation) throws Throwable {
        if (!(str.length() > 0)) {
            return Unit.INSTANCE;
        }
        Object objWithContext = BuildersKt.withContext(this.defaultDispatcher, new a(str, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(String str, Continuation<? super Unit> continuation) throws Throwable {
        String str2 = (String) this.kv.getValue("wf.setting.key", "");
        if (Intrinsics.areEqual(str, str2)) {
            HMLog.info(SettingRepo.TAG, d.a);
            return Unit.INSTANCE;
        }
        List<String> listE = e(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (!Boxing.boxBoolean(StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) obj, false, 2, (Object) null)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        HMLog.info(SettingRepo.TAG, new c(strJoinToString$default));
        Object objA = a(strJoinToString$default, continuation);
        return objA == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WatchFaceDataBase c() {
        return (WatchFaceDataBase) this.db.getValue();
    }

    private final DeviceInfo d() {
        return (DeviceInfo) this.deviceInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> e(String str) {
        return StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
    }

    @Override // com.huami.watchfacesstore.repo.WatchFaceSettingRepo
    @Nullable
    public Object deleteRecordBySetting(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        String str = (String) this.kv.getValue("wf.setting.key", "");
        HMLog.info(SettingRepo.TAG, new b(str));
        Object objA = a(str, continuation);
        return objA == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.watchfacesstore.repo.WatchFaceSettingRepo
    @Nullable
    public Object getSettingAndSave(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(this.defaultDispatcher, new e(null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Override // com.huami.watchfacesstore.repo.WatchFaceSettingRepo
    public boolean isSupportPay() {
        String str = (String) this.kv.getValue("wf.setting.key", "");
        HMLog.info(SettingRepo.TAG, new f(str));
        for (String str2 : e(str)) {
            if (Intrinsics.areEqual(str2, "*") || Intrinsics.areEqual(str2, d().getDeviceId())) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ WatchFaceSettingRepoImpl(SettingApi settingApi, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(settingApi, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
