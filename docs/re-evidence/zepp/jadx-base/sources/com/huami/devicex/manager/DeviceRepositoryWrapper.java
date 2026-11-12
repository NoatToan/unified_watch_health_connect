package com.huami.devicex.manager;

import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.devicex.DeviceXBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.databases.model.DeviceDao;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u0010\u001a\u00020\u000fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\rJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\rJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\rJ\u0010\u0010\u0016\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/devicex/manager/DeviceRepositoryWrapper;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", "a", "", "hasBoundDevice", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "hasBoundInHistory", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "findBindAndActiveDevices", "", "dumpDeviceTable", "getDeviceListOrdered", "findMozartDeviceState", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "findEarliestBoundTime", "findAllBoundDeviceInOrder", "isBondedOnSystem", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "deviceRepositoryApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceRepositoryWrapper implements KoinComponent {

    @NotNull
    private static final String b = "DeviceRepositoryWrapper";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceRepositoryApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.devicex.manager.DeviceRepositoryWrapper$dumpDeviceTable$1", f = "DeviceRepositoryWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.devicex.manager.DeviceRepositoryWrapper$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0373a extends Lambda implements Function0<String> {
            public static final C0373a a = new C0373a();

            public C0373a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "dumpDeviceTable";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "-------------------------------------------------------------";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ DeviceRepositoryWrapper a;
            public final /* synthetic */ Device b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(DeviceRepositoryWrapper deviceRepositoryWrapper, Device device) {
                super(0);
                this.a = deviceRepositoryWrapper;
                this.b = device;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "dumpDeviceTable: " + this.a.a(this.b);
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
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "-------------------------------------------------------------";
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceRepositoryWrapper.this.new a(continuation);
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
            List<Device> listFindAll = DeviceRepositoryWrapper.this.b().findAll();
            HMLog.info(DeviceRepositoryWrapper.b, C0373a.a);
            HMLog.info(DeviceRepositoryWrapper.b, b.a);
            DeviceRepositoryWrapper deviceRepositoryWrapper = DeviceRepositoryWrapper.this;
            Iterator<T> it2 = listFindAll.iterator();
            while (it2.hasNext()) {
                HMLog.info(DeviceRepositoryWrapper.b, new c(deviceRepositoryWrapper, (Device) it2.next()));
            }
            HMLog.info(DeviceRepositoryWrapper.b, d.a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ List<Device> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, List<Device> list) {
            super(0);
            this.a = str;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "query address: " + this.a + " device list size: " + this.b.size();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceRepositoryWrapper() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceRepositoryApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceRepositoryApi>() { // from class: com.huami.devicex.manager.DeviceRepositoryWrapper$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceRepositoryApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceRepositoryApi.class), qualifier, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(Device device) {
        if (device == null) {
            return "";
        }
        return "source:" + device.getDevice_source() + ", mac:" + device.getDevice_address() + ", active:" + device.getActiveStatus() + ", bind:" + device.getDevice_bind_status();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceRepositoryApi b() {
        return (DeviceRepositoryApi) this.deviceRepositoryApi.getValue();
    }

    public final void dumpDeviceTable() {
        if (DeviceXBuilder.INSTANCE.isDebug()) {
            e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(ExtKt.getExceptionHandler())), null, null, new a(null), 3, null);
        }
    }

    @NotNull
    public final List<Device> findAllBoundDeviceInOrder() {
        List<Device> list = HMDaoManager.getInstance().getDeviceDao().queryBuilder().where(DeviceDao.Properties.Device_bind_status.eq(1), new WhereCondition[0]).orderDesc(DeviceDao.Properties.ActiveStatus).orderAsc(DeviceDao.Properties.Device_type).list();
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final List<Device> findBindAndActiveDevices(@NotNull HMDeviceType type) {
        List<Device> listFindBoundDevices = b().findBoundDevices(type);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFindBoundDevices) {
            Integer activeStatus = ((Device) obj).getActiveStatus();
            if (activeStatus != null && activeStatus.intValue() == 1) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    @NotNull
    public final List<Device> findEarliestBoundTime(@NotNull String address) {
        List<Device> list = HMDaoManager.getInstance().getDeviceDao().queryBuilder().where(DeviceDao.Properties.Device_address.eq(address), new WhereCondition[0]).orderAsc(DeviceDao.Properties.Device_bind_time).list();
        if (DeviceXBuilder.INSTANCE.isDebug()) {
            HMLog.info(b, new b(address, list));
        }
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final List<Device> findMozartDeviceState() {
        List<Device> list = HMDaoManager.getInstance().getDeviceDao().queryBuilder().where(DeviceDao.Properties.Device_type.eq(Integer.valueOf(HMDeviceType.HEADSET.getValue())), DeviceDao.Properties.Device_source.in(Integer.valueOf(HMDeviceSource.OTHER_MOZART.getValue()), Integer.valueOf(HMDeviceSource.OTHER_HAYDN.getValue()), Integer.valueOf(HMDeviceSource.OTHER_LULLABY.getValue())), DeviceDao.Properties.Device_bind_status.eq(1), DeviceDao.Properties.ActiveStatus.eq(1)).orderDesc(DeviceDao.Properties.Device_bind_time).list();
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final List<Device> getDeviceListOrdered() {
        Integer activeStatus;
        List<Device> listFindAll = b().findAll();
        dumpDeviceTable();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listFindAll.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Integer activeStatus2 = ((Device) next).getActiveStatus();
            if (activeStatus2 != null && 1 == activeStatus2.intValue()) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List<Device> listE = com.huami.devicex.manager.b.e(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listFindAll) {
            Device device = (Device) obj;
            Integer device_bind_status = device.getDevice_bind_status();
            if (device_bind_status != null && 1 == device_bind_status.intValue() && (activeStatus = device.getActiveStatus()) != null && activeStatus.intValue() == 0) {
                arrayList2.add(obj);
            }
        }
        listE.addAll(com.huami.devicex.manager.b.e(arrayList2));
        return listE;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean hasBoundDevice() {
        List<Device> list = HMDaoManager.getInstance().getDeviceDao().queryBuilder().where(DeviceDao.Properties.Device_bind_status.eq(1), new WhereCondition[0]).orderDesc(DeviceDao.Properties.ActiveStatus).orderAsc(DeviceDao.Properties.Device_type).list();
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        if (list.isEmpty()) {
            return false;
        }
        if (list.size() != 1) {
            return true;
        }
        Integer device_source = list.get(0).getDevice_source();
        return device_source == null || device_source.intValue() != HMDeviceSource.SENSORHUB.getValue();
    }

    public final boolean hasBoundInHistory(@NotNull HMDeviceSource source) {
        List<Device> list = HMDaoManager.getInstance().getDeviceDao().queryBuilder().where(DeviceDao.Properties.Device_source.eq(Integer.valueOf(source.getValue())), new WhereCondition[0]).list();
        return list != null && list.size() > 0;
    }

    public final boolean isBondedOnSystem(@Nullable String address) {
        if (address == null) {
            return false;
        }
        return com.huami.devicex.manager.b.b(address);
    }
}
