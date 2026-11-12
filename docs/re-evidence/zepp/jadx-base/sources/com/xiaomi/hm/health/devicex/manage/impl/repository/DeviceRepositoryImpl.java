package com.xiaomi.hm.health.devicex.manage.impl.repository;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.common.base.Stopwatch;
import com.huami.account.service.proxy.KoinComponentAdapter;
import com.huami.devicex.manager.DeviceRepositoryWrapper;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.databases.model.DeviceDao;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.headset.MozartDeviceStateService;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceMigrationApi;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001FB\u0007¢\u0006\u0004\bD\u0010EJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J4\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0004\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nH\u0082\b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00112\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J#\u0010\u0015\u001a\u00020\u00112\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u0016\u001a\u00020\u00112\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u000e\"\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\bH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0014\u0010&\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010\bH\u0016J\u0014\u0010'\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010\bH\u0016J/\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\u0006\u0010)\u001a\u00020(2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0\u000e\"\u00020(¢\u0006\u0004\b+\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\bH\u0016J\u0010\u0010/\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\bH\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u0016J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u0016J\n\u00102\u001a\u0004\u0018\u00010\u000fH\u0016J\"\u00105\u001a\u00020\u00112\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001903H\u0016J\u0018\u00109\u001a\u00020\u00112\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u000206H\u0016R\u001d\u0010>\u001a\u00020:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=R\u001c\u0010C\u001a\u00020?8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/impl/repository/DeviceRepositoryImpl;", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceMigrationApi;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/account/service/proxy/KoinComponentAdapter;", "Lcom/xiaomi/hm/health/databases/model/DeviceDao;", "b", "K", "", "debugName", "Lkotlin/Function0;", UserDataStore.FIRST_NAME, "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "Lcom/xiaomi/hm/health/databases/model/Device;", "devices", "", "insertOrReplaceInTx", "([Lcom/xiaomi/hm/health/databases/model/Device;)V", "insertOrReplace", "update", "updateDeviceInTx", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "findBoundDevices", "([Lcom/xiaomi/hm/health/bt/device/HMDeviceType;)Ljava/util/List;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "findBoundDevice", "mac", "findActiveDevices", "findTopOneDevice", "findMigrateDevices", "findMigrateDevicesAll", "findBoundDeviceId", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "findDeviceByAddress", "findBoundDeviceByAddress", "Lorg/greenrobot/greendao/query/WhereCondition;", "condition", "conditionMore", "findDeviceByConditions", "(Lorg/greenrobot/greendao/query/WhereCondition;[Lorg/greenrobot/greendao/query/WhereCondition;)Ljava/util/List;", "id", "findDeviceById", "deleteById", "findAllActiveDevices", "findAll", "getActiveHeadset", "", "deviceMap", "migrateDeviceInfoToDb", "", "fromVersion", "targetVersion", "migrate", "Lcom/huami/devicex/manager/DeviceRepositoryWrapper;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceRepositoryWrapper;", "deviceRepositoryWrapper", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceRepositoryImpl implements DeviceRepositoryApi, DeviceMigrationApi, CoroutineScope, KoinComponentAdapter {
    private static final int c = 1;
    private static final int d = 1;
    private static final int e = 1;

    @NotNull
    private static final String f = "DeviceStoreApi";

    @NotNull
    private static final String g = "[DumpDevice]";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceRepositoryWrapper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CoroutineContext coroutineContext;
    private static int h = 3;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device id [" + this.a + "] is not exits";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Device a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Device device) {
            super(0);
            this.a = device;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deleteById device: " + HMDeviceManager.deviceToString(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return String.valueOf(this.a);
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
            return "getActiveHeadset - no devices!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getActiveHeadset - no adapter!";
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
            return "getActiveHeadset - latest: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getActiveHeadset - playing: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getActiveHeadset - A2dp: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "insertOrReplace";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Device a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Device device) {
            super(0);
            this.a = device;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "insertOrReplace device: " + HMDeviceManager.deviceToString(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "insertOrReplaceInTx";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ Device a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Device device) {
            super(0);
            this.a = device;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "insertOrReplaceInTx device: " + HMDeviceManager.deviceToString(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<Device, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Device a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Device device) {
                super(0);
                this.a = device;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "migrateDeviceInfoToDb device: " + HMDeviceManager.deviceToString(this.a);
            }
        }

        public m() {
            super(1);
        }

        public final void a(@NotNull Device device) {
            QueryBuilder<Device> queryBuilderWhere;
            QueryBuilder<Device> queryBuilder = DeviceRepositoryImpl.this.b().queryBuilder();
            List<Device> list = null;
            boolean z = true;
            if (queryBuilder != null && (queryBuilderWhere = queryBuilder.where(DeviceDao.Properties.Device_address.eq(device.getDevice_address()), DeviceDao.Properties.Device_type.eq(device.getDevice_type()), DeviceDao.Properties.Device_source.eq(device.getDevice_source()))) != null) {
                list = queryBuilderWhere.list();
            }
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (z) {
                HMLog.info(DeviceRepositoryImpl.g, new a(device));
                DeviceRepositoryImpl.this.b().insertOrReplace(device);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Device device) {
            a(device);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "update";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ Device a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Device device) {
            super(0);
            this.a = device;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "update device: " + HMDeviceManager.deviceToString(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "updateDeviceInTx";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ Device a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Device device) {
            super(0);
            this.a = device;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "updateDeviceInTx device: " + HMDeviceManager.deviceToString(this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceRepositoryImpl() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceRepositoryWrapper = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceRepositoryWrapper>() { // from class: com.xiaomi.hm.health.devicex.manage.impl.repository.DeviceRepositoryImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceRepositoryWrapper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceRepositoryWrapper invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceRepositoryWrapper.class), qualifier, objArr);
            }
        });
        this.coroutineContext = Dispatchers.getIO();
        h = 5;
    }

    private final DeviceRepositoryWrapper a() {
        return (DeviceRepositoryWrapper) this.deviceRepositoryWrapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceDao b() throws Exception {
        DeviceDao deviceDao = HMDaoManager.getInstance().getDeviceDao();
        if (deviceDao != null) {
            return deviceDao;
        }
        throw new Exception("DeviceDao can not be null here.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K> K c(String debugName, Function0<? extends K> fn) {
        T tInvoke;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(debugName));
        }
        try {
            tInvoke = fn.invoke();
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
            tInvoke = (K) null;
        }
        objectRef.element = tInvoke;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t = objectRef.element;
            if (t instanceof List) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj : (List) t) {
                    if (obj instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1(debugName, obj));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(debugName));
            } else if (t instanceof Device) {
                T t2 = objectRef.element;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t2).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6(debugName, objectRef));
            }
        }
        return (K) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object d(DeviceRepositoryImpl deviceRepositoryImpl, String str, Function0 function0, int i2, Object obj) {
        T tInvoke;
        if ((i2 & 1) != 0) {
            str = "";
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(str));
        }
        try {
            tInvoke = function0.invoke();
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
            tInvoke = 0;
        }
        objectRef.element = tInvoke;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t = objectRef.element;
            if (t instanceof List) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj2 : (List) t) {
                    if (obj2 instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj2).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1(str, obj2));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(str));
            } else if (t instanceof Device) {
                T t2 = objectRef.element;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t2).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6(str, objectRef));
            }
        }
        return objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    public void deleteById(@NotNull String id) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        T t = 0;
        try {
            Device deviceFindDeviceById = findDeviceById(id);
            if (deviceFindDeviceById == null) {
                HMLog.warn$default(f, null, new a(id), 2, null);
            } else {
                HMLog.info(g, new b(deviceFindDeviceById));
                b().delete(deviceFindDeviceById);
            }
            t = Unit.INSTANCE;
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
        }
        objectRef.element = t;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t2 = objectRef.element;
            if (!(t2 instanceof List)) {
                if (!(t2 instanceof Device)) {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
                    return;
                }
                T t3 = objectRef.element;
                Objects.requireNonNull(t3, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t3).printShortInfo();
                return;
            }
            Objects.requireNonNull(t2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            for (Object obj : (List) t2) {
                if (obj instanceof Device) {
                    new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                } else {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                }
            }
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    @NotNull
    public List<Device> findActiveDevices(@NotNull HMDeviceType type) {
        QueryBuilder<Device> queryBuilderWhere;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        T list = 0;
        list = 0;
        list = 0;
        try {
            QueryBuilder<Device> queryBuilder = b().queryBuilder();
            if (queryBuilder != null && (queryBuilderWhere = queryBuilder.where(DeviceDao.Properties.Device_bind_status.eq(1), DeviceDao.Properties.ActiveStatus.eq(1), DeviceDao.Properties.Device_type.eq(Integer.valueOf(type.getValue())))) != null) {
                list = queryBuilderWhere.list();
            }
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
        }
        objectRef.element = list;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t = objectRef.element;
            if (t instanceof List) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj : (List) t) {
                    if (obj instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
            } else if (t instanceof Device) {
                T t2 = objectRef.element;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t2).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
            }
        }
        List<Device> list2 = (List) objectRef.element;
        return list2 == null ? CollectionsKt__CollectionsKt.emptyList() : list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    @NotNull
    public List<Device> findAll() {
        T tLoadAll;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        try {
            tLoadAll = b().loadAll();
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
            tLoadAll = 0;
        }
        objectRef.element = tLoadAll;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t = objectRef.element;
            if (t instanceof List) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj : (List) t) {
                    if (obj instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
            } else if (t instanceof Device) {
                T t2 = objectRef.element;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t2).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
            }
        }
        List<Device> list = (List) objectRef.element;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    @NotNull
    public List<Device> findAllActiveDevices() {
        QueryBuilder<Device> queryBuilderWhere;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        T list = 0;
        list = 0;
        list = 0;
        try {
            QueryBuilder<Device> queryBuilder = b().queryBuilder();
            if (queryBuilder != null && (queryBuilderWhere = queryBuilder.where(DeviceDao.Properties.Device_bind_status.eq(1), DeviceDao.Properties.ActiveStatus.eq(1))) != null) {
                list = queryBuilderWhere.list();
            }
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
        }
        objectRef.element = list;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t = objectRef.element;
            if (t instanceof List) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj : (List) t) {
                    if (obj instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
            } else if (t instanceof Device) {
                T t2 = objectRef.element;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t2).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
            }
        }
        List<Device> list2 = (List) objectRef.element;
        return list2 == null ? CollectionsKt__CollectionsKt.emptyList() : list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    @NotNull
    public List<Device> findBoundDevice(@NotNull HMDeviceSource source) {
        QueryBuilder<Device> queryBuilderWhere;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        T t = 0;
        try {
            QueryBuilder<Device> queryBuilder = b().queryBuilder();
            List<Device> list = (queryBuilder == null || (queryBuilderWhere = queryBuilder.where(DeviceDao.Properties.Device_bind_status.eq(1), DeviceDao.Properties.Device_source.eq(Integer.valueOf(source.getValue())))) == null) ? null : queryBuilderWhere.list();
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            t = list;
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
        }
        objectRef.element = t;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t2 = objectRef.element;
            if (t2 instanceof List) {
                Objects.requireNonNull(t2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj : (List) t2) {
                    if (obj instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
            } else if (t2 instanceof Device) {
                T t3 = objectRef.element;
                Objects.requireNonNull(t3, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t3).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
            }
        }
        List<Device> list2 = (List) objectRef.element;
        return list2 == null ? CollectionsKt__CollectionsKt.emptyList() : list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    @Nullable
    public Device findBoundDeviceByAddress(@Nullable String address) {
        QueryBuilder<Device> queryBuilderWhere;
        Query<Device> queryBuild;
        T tUnique = 0;
        tUnique = 0;
        tUnique = 0;
        tUnique = 0;
        if (address == null) {
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        try {
            QueryBuilder<Device> queryBuilder = b().queryBuilder();
            if (queryBuilder != null && (queryBuilderWhere = queryBuilder.where(DeviceDao.Properties.Device_address.eq(address), DeviceDao.Properties.Device_bind_status.eq(1))) != null && (queryBuild = queryBuilderWhere.build()) != null) {
                tUnique = queryBuild.unique();
            }
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
        }
        objectRef.element = tUnique;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t = objectRef.element;
            if (t instanceof List) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj : (List) t) {
                    if (obj instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
            } else if (t instanceof Device) {
                T t2 = objectRef.element;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t2).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
            }
        }
        return (Device) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    @Nullable
    public String findBoundDeviceId(@NotNull HMDeviceType type) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        T device_id = 0;
        device_id = 0;
        try {
            Device device = (Device) CollectionsKt.firstOrNull((List) findActiveDevices(type));
            if (device != null) {
                device_id = device.getDevice_id();
            }
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
        }
        objectRef.element = device_id;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t = objectRef.element;
            if (t instanceof List) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj : (List) t) {
                    if (obj instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
            } else if (t instanceof Device) {
                T t2 = objectRef.element;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t2).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
            }
        }
        return (String) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    @NotNull
    public List<Device> findBoundDevices(@NotNull HMDeviceType... type) {
        T list;
        QueryBuilder<Device> queryBuilderWhere;
        T list2;
        QueryBuilder<Device> queryBuilderWhere2;
        T list3;
        QueryBuilder<Device> queryBuilderWhere3;
        if (type.length == 0) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
            if (3 == h) {
                stopwatchCreateUnstarted.start();
                HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
            }
            try {
                QueryBuilder<Device> queryBuilder = b().queryBuilder();
                list3 = (queryBuilder == null || (queryBuilderWhere3 = queryBuilder.where(DeviceDao.Properties.Device_bind_status.eq(1), new WhereCondition[0])) == null) ? 0 : queryBuilderWhere3.list();
            } catch (Throwable th) {
                HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
            }
            objectRef.element = list3;
            if (3 == h) {
                stopwatchCreateUnstarted.stop();
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
                T t = objectRef.element;
                if (t instanceof List) {
                    Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    for (Object obj : (List) t) {
                        if (obj instanceof Device) {
                            new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                        } else {
                            HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                        }
                    }
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
                } else if (t instanceof Device) {
                    T t2 = objectRef.element;
                    Objects.requireNonNull(t2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                    new DevicePrintWrapper(f, (Device) t2).printShortInfo();
                } else {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
                }
            }
            List<Device> list4 = (List) objectRef.element;
            return list4 == null ? CollectionsKt__CollectionsKt.emptyList() : list4;
        }
        if (type.length == 1) {
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Stopwatch stopwatchCreateUnstarted2 = Stopwatch.createUnstarted();
            if (3 == h) {
                stopwatchCreateUnstarted2.start();
                HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
            }
            try {
                QueryBuilder<Device> queryBuilder2 = b().queryBuilder();
                list2 = (queryBuilder2 == null || (queryBuilderWhere2 = queryBuilder2.where(DeviceDao.Properties.Device_bind_status.eq(1), DeviceDao.Properties.Device_type.eq(Integer.valueOf(((HMDeviceType) ArraysKt.first(type)).getValue())))) == null) ? 0 : queryBuilderWhere2.list();
            } catch (Throwable th2) {
                HMLog.error(f, "001", th2, DeviceRepositoryImpl$useBackend$2.INSTANCE);
            }
            objectRef2.element = list2;
            if (3 == h) {
                stopwatchCreateUnstarted2.stop();
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted2));
                T t3 = objectRef2.element;
                if (t3 instanceof List) {
                    Objects.requireNonNull(t3, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    for (Object obj2 : (List) t3) {
                        if (obj2 instanceof Device) {
                            new DevicePrintWrapper(f, (Device) obj2).printShortInfo();
                        } else {
                            HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj2));
                        }
                    }
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
                } else if (t3 instanceof Device) {
                    T t4 = objectRef2.element;
                    Objects.requireNonNull(t4, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                    new DevicePrintWrapper(f, (Device) t4).printShortInfo();
                } else {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef2));
                }
            }
            List<Device> list5 = (List) objectRef2.element;
            return list5 == null ? CollectionsKt__CollectionsKt.emptyList() : list5;
        }
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted3 = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted3.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        try {
            List[] listArr = new List[1];
            ArrayList arrayList = new ArrayList(type.length);
            int length = type.length;
            int i2 = 0;
            while (i2 < length) {
                HMDeviceType hMDeviceType = type[i2];
                i2++;
                arrayList.add(Integer.valueOf(hMDeviceType.getValue()));
            }
            listArr[0] = arrayList;
            QueryBuilder<Device> queryBuilder3 = b().queryBuilder();
            list = (queryBuilder3 == null || (queryBuilderWhere = queryBuilder3.where(DeviceDao.Properties.Device_bind_status.eq(1), DeviceDao.Properties.Device_type.in(listArr))) == null) ? 0 : queryBuilderWhere.list();
        } catch (Throwable th3) {
            HMLog.error(f, "001", th3, DeviceRepositoryImpl$useBackend$2.INSTANCE);
        }
        objectRef3.element = list;
        if (3 == h) {
            stopwatchCreateUnstarted3.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted3));
            T t5 = objectRef3.element;
            if (t5 instanceof List) {
                Objects.requireNonNull(t5, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj3 : (List) t5) {
                    if (obj3 instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj3).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj3));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
            } else if (t5 instanceof Device) {
                T t6 = objectRef3.element;
                Objects.requireNonNull(t6, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t6).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef3));
            }
        }
        List<Device> list6 = (List) objectRef3.element;
        return list6 == null ? CollectionsKt__CollectionsKt.emptyList() : list6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    @Nullable
    public Device findDeviceByAddress(@Nullable String address) {
        QueryBuilder<Device> queryBuilderWhere;
        Query<Device> queryBuild;
        T tUnique = 0;
        tUnique = 0;
        tUnique = 0;
        tUnique = 0;
        if (address == null) {
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        try {
            QueryBuilder<Device> queryBuilder = b().queryBuilder();
            if (queryBuilder != null && (queryBuilderWhere = queryBuilder.where(DeviceDao.Properties.Device_address.eq(address), new WhereCondition[0])) != null && (queryBuild = queryBuilderWhere.build()) != null) {
                tUnique = queryBuild.unique();
            }
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
        }
        objectRef.element = tUnique;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t = objectRef.element;
            if (t instanceof List) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj : (List) t) {
                    if (obj instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
            } else if (t instanceof Device) {
                T t2 = objectRef.element;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t2).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
            }
        }
        return (Device) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<Device> findDeviceByConditions(@NotNull WhereCondition condition, @NotNull WhereCondition... conditionMore) {
        QueryBuilder<Device> queryBuilderWhere;
        Query<Device> queryBuild;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        T list = 0;
        list = 0;
        list = 0;
        list = 0;
        try {
            QueryBuilder<Device> queryBuilder = b().queryBuilder();
            if (queryBuilder != null && (queryBuilderWhere = queryBuilder.where(condition, (WhereCondition[]) Arrays.copyOf(conditionMore, conditionMore.length))) != null && (queryBuild = queryBuilderWhere.build()) != null) {
                list = queryBuild.list();
            }
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
        }
        objectRef.element = list;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t = objectRef.element;
            if (t instanceof List) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj : (List) t) {
                    if (obj instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
            } else if (t instanceof Device) {
                T t2 = objectRef.element;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t2).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
            }
        }
        List<Device> list2 = (List) objectRef.element;
        return list2 == null ? CollectionsKt__CollectionsKt.emptyList() : list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    @Nullable
    public Device findDeviceById(@NotNull String id) {
        QueryBuilder<Device> queryBuilderWhere;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        T t = 0;
        try {
            QueryBuilder<Device> queryBuilder = b().queryBuilder();
            List<Device> list = (queryBuilder == null || (queryBuilderWhere = queryBuilder.where(DeviceDao.Properties.Device_id.eq(id), new WhereCondition[0])) == null) ? null : queryBuilderWhere.list();
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            t = (Device) CollectionsKt.firstOrNull((List) list);
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
        }
        objectRef.element = t;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t2 = objectRef.element;
            if (t2 instanceof List) {
                Objects.requireNonNull(t2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj : (List) t2) {
                    if (obj instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
            } else if (t2 instanceof Device) {
                T t3 = objectRef.element;
                Objects.requireNonNull(t3, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t3).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
            }
        }
        return (Device) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceMigrationApi
    @NotNull
    public List<Device> findMigrateDevices() {
        QueryBuilder<Device> queryBuilderWhere;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        T list = 0;
        list = 0;
        list = 0;
        try {
            QueryBuilder<Device> queryBuilder = b().queryBuilder();
            if (queryBuilder != null && (queryBuilderWhere = queryBuilder.where(DeviceDao.Properties.Migrate_device.eq(1), DeviceDao.Properties.Device_bind_status.eq(1))) != null) {
                list = queryBuilderWhere.list();
            }
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
        }
        objectRef.element = list;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t = objectRef.element;
            if (t instanceof List) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj : (List) t) {
                    if (obj instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
            } else if (t instanceof Device) {
                T t2 = objectRef.element;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t2).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
            }
        }
        List<Device> list2 = (List) objectRef.element;
        return list2 == null ? CollectionsKt__CollectionsKt.emptyList() : list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceMigrationApi
    @NotNull
    public List<Device> findMigrateDevicesAll() {
        QueryBuilder<Device> queryBuilderWhere;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        T list = 0;
        list = 0;
        list = 0;
        try {
            QueryBuilder<Device> queryBuilder = b().queryBuilder();
            if (queryBuilder != null && (queryBuilderWhere = queryBuilder.where(DeviceDao.Properties.Migrate_device.eq(1), new WhereCondition[0])) != null) {
                list = queryBuilderWhere.list();
            }
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
        }
        objectRef.element = list;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t = objectRef.element;
            if (t instanceof List) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj : (List) t) {
                    if (obj instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
            } else if (t instanceof Device) {
                T t2 = objectRef.element;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t2).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
            }
        }
        List<Device> list2 = (List) objectRef.element;
        return list2 == null ? CollectionsKt__CollectionsKt.emptyList() : list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    @Nullable
    public Device findTopOneDevice(@NotNull HMDeviceType type) {
        T tUnique;
        Device activeHeadset;
        QueryBuilder<Device> queryBuilderWhere;
        try {
            if (type == HMDeviceType.HEADSET) {
                activeHeadset = getActiveHeadset();
            } else {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
                if (3 == h) {
                    stopwatchCreateUnstarted.start();
                    HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
                }
                try {
                    QueryBuilder<Device> queryBuilder = b().queryBuilder();
                    tUnique = (queryBuilder == null || (queryBuilderWhere = queryBuilder.where(DeviceDao.Properties.Device_bind_status.eq(1), DeviceDao.Properties.Device_type.eq(Integer.valueOf(type.getValue())))) == null) ? 0 : queryBuilderWhere.unique();
                } catch (Throwable th) {
                    HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
                }
                objectRef.element = tUnique;
                if (3 == h) {
                    stopwatchCreateUnstarted.stop();
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
                    T t = objectRef.element;
                    if (t instanceof List) {
                        if (t == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                        }
                        for (Object obj : (List) t) {
                            if (obj instanceof Device) {
                                new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                            } else {
                                HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                            }
                        }
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
                    } else if (t instanceof Device) {
                        T t2 = objectRef.element;
                        if (t2 == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                        }
                        new DevicePrintWrapper(f, (Device) t2).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
                    }
                }
                activeHeadset = (Device) objectRef.element;
            }
            return activeHeadset;
        } catch (Exception e2) {
            HMLog.error$default(f, null, e2, new c(e2), 2, null);
            return null;
        }
    }

    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    @Nullable
    public Device getActiveHeadset() {
        List<Device> listFindMozartDeviceState = a().findMozartDeviceState();
        Device device = null;
        if (listFindMozartDeviceState.isEmpty()) {
            HMLog.info(f, d.a);
            return null;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            HMLog.info(f, e.a);
            return listFindMozartDeviceState.get(0);
        }
        MozartDeviceStateService mozartDeviceStateService = MozartDeviceStateService.INSTANCE.get();
        Device device2 = null;
        Device device3 = null;
        for (Device device4 : listFindMozartDeviceState) {
            String device_address = device4.getDevice_address();
            if (a().isBondedOnSystem(device_address)) {
                if (device3 == null) {
                    HMLog.info(f, new f(device_address));
                    device3 = device4;
                }
                BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(device_address);
                if (device == null && mozartDeviceStateService.isA2dpPlaying(remoteDevice)) {
                    HMLog.info(f, new g(device_address));
                    device = device4;
                }
                if (device2 == null && mozartDeviceStateService.isA2dpConnected(remoteDevice)) {
                    HMLog.info(f, new h(device_address));
                    device2 = device4;
                }
            }
        }
        if (device != null) {
            return device;
        }
        return device2 != null ? device2 : device3;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    public void insertOrReplace(@NotNull Device... devices) {
        T t;
        HMLog.info(f, i.a);
        int length = devices.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            Device device = devices[i3];
            i3++;
            HMLog.info(g, new j(device));
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        try {
            int length2 = devices.length;
            while (i2 < length2) {
                Device device2 = devices[i2];
                i2++;
                b().insertOrReplace(device2);
            }
            t = Unit.INSTANCE;
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
            t = 0;
        }
        objectRef.element = t;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t2 = objectRef.element;
            if (!(t2 instanceof List)) {
                if (!(t2 instanceof Device)) {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
                    return;
                }
                T t3 = objectRef.element;
                Objects.requireNonNull(t3, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t3).printShortInfo();
                return;
            }
            Objects.requireNonNull(t2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            for (Object obj : (List) t2) {
                if (obj instanceof Device) {
                    new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                } else {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                }
            }
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    public void insertOrReplaceInTx(@NotNull Device... devices) {
        T t;
        HMLog.info(f, k.a);
        int length = devices.length;
        int i2 = 0;
        while (i2 < length) {
            Device device = devices[i2];
            i2++;
            HMLog.info(g, new l(device));
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        try {
            int length2 = devices.length;
            int i3 = 0;
            while (i3 < length2) {
                Device device2 = devices[i3];
                i3++;
                b().insertInTx(device2);
            }
            t = Unit.INSTANCE;
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
            t = 0;
        }
        objectRef.element = t;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t2 = objectRef.element;
            if (!(t2 instanceof List)) {
                if (!(t2 instanceof Device)) {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
                    return;
                }
                T t3 = objectRef.element;
                Objects.requireNonNull(t3, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t3).printShortInfo();
                return;
            }
            Objects.requireNonNull(t2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            for (Object obj : (List) t2) {
                if (obj instanceof Device) {
                    new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                } else {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                }
            }
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
        }
    }

    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceMigrationApi
    public void migrate(int fromVersion, int targetVersion) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceMigrationApi
    public void migrateDeviceInfoToDb(@NotNull Map<HMDeviceType, ? extends List<? extends Device>> deviceMap) {
        T t;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        try {
            m mVar = new m();
            Iterator<T> it2 = deviceMap.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((List) it2.next()).iterator();
                while (it3.hasNext()) {
                    mVar.invoke((Device) it3.next());
                }
            }
            t = Unit.INSTANCE;
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
            t = 0;
        }
        objectRef.element = t;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t2 = objectRef.element;
            if (!(t2 instanceof List)) {
                if (!(t2 instanceof Device)) {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
                    return;
                }
                T t3 = objectRef.element;
                Objects.requireNonNull(t3, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t3).printShortInfo();
                return;
            }
            Objects.requireNonNull(t2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            for (Object obj : (List) t2) {
                if (obj instanceof Device) {
                    new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                } else {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                }
            }
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    public void update(@NotNull Device... devices) {
        T t;
        HMLog.info(f, n.a);
        int length = devices.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            Device device = devices[i3];
            i3++;
            HMLog.info(g, new o(device));
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        try {
            int length2 = devices.length;
            while (i2 < length2) {
                Device device2 = devices[i2];
                i2++;
                b().update(device2);
            }
            t = Unit.INSTANCE;
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
            t = 0;
        }
        objectRef.element = t;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t2 = objectRef.element;
            if (!(t2 instanceof List)) {
                if (!(t2 instanceof Device)) {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
                    return;
                }
                T t3 = objectRef.element;
                Objects.requireNonNull(t3, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t3).printShortInfo();
                return;
            }
            Objects.requireNonNull(t2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            for (Object obj : (List) t2) {
                if (obj instanceof Device) {
                    new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                } else {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                }
            }
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    public void updateDeviceInTx(@NotNull Device... devices) {
        T t;
        HMLog.info(f, p.a);
        int length = devices.length;
        int i2 = 0;
        while (i2 < length) {
            Device device = devices[i2];
            i2++;
            HMLog.info(g, new q(device));
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        try {
            b().updateInTx(Arrays.copyOf(devices, devices.length));
            t = Unit.INSTANCE;
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
            t = 0;
        }
        objectRef.element = t;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t2 = objectRef.element;
            if (!(t2 instanceof List)) {
                if (!(t2 instanceof Device)) {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
                    return;
                }
                T t3 = objectRef.element;
                Objects.requireNonNull(t3, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t3).printShortInfo();
                return;
            }
            Objects.requireNonNull(t2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            for (Object obj : (List) t2) {
                if (obj instanceof Device) {
                    new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                } else {
                    HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                }
            }
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi
    @Nullable
    public Device findBoundDevice(@NotNull HMDeviceType type, @NotNull String mac) {
        QueryBuilder<Device> queryBuilderWhere;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Stopwatch stopwatchCreateUnstarted = Stopwatch.createUnstarted();
        if (3 == h) {
            stopwatchCreateUnstarted.start();
            HMLog.debug(f, new DeviceRepositoryImpl$useBackend$1(""));
        }
        T tUnique = 0;
        tUnique = 0;
        tUnique = 0;
        try {
            QueryBuilder<Device> queryBuilder = b().queryBuilder();
            if (queryBuilder != null && (queryBuilderWhere = queryBuilder.where(DeviceDao.Properties.Device_bind_status.eq(1), DeviceDao.Properties.Device_type.eq(Integer.valueOf(type.getValue())), DeviceDao.Properties.Device_address.eq(mac))) != null) {
                tUnique = queryBuilderWhere.unique();
            }
        } catch (Throwable th) {
            HMLog.error(f, "001", th, DeviceRepositoryImpl$useBackend$2.INSTANCE);
        }
        objectRef.element = tUnique;
        if (3 == h) {
            stopwatchCreateUnstarted.stop();
            HMLog.info(f, new DeviceRepositoryImpl$useBackend$3(stopwatchCreateUnstarted));
            T t = objectRef.element;
            if (t instanceof List) {
                Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.collections.List<*>");
                for (Object obj : (List) t) {
                    if (obj instanceof Device) {
                        new DevicePrintWrapper(f, (Device) obj).printShortInfo();
                    } else {
                        HMLog.info(f, new DeviceRepositoryImpl$useBackend$4$1("", obj));
                    }
                }
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$5(""));
            } else if (t instanceof Device) {
                T t2 = objectRef.element;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
                new DevicePrintWrapper(f, (Device) t2).printShortInfo();
            } else {
                HMLog.info(f, new DeviceRepositoryImpl$useBackend$6("", objectRef));
            }
        }
        return (Device) objectRef.element;
    }
}
