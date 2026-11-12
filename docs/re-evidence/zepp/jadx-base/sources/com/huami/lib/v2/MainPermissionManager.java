package com.huami.lib.v2;

import android.os.Build;
import androidx.annotation.WorkerThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.permission.R;
import com.huami.utils.permissionx.PermissionResult;
import com.huami.utils.permissionx.business.AppSettingsRationaleWithCode;
import com.huami.utils.permissionx.business.PermissionXKt;
import com.huami.utils.permissionx.dsl.RequestMultiplePermissionDsl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.collections.h;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u000bH'J\b\u0010\u0012\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH'J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u0013\u001a\u00020\u000bH&J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0014\u001a\u00020\bH&J\b\u0010\u0015\u001a\u00020\bH&J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000bJ\u0016\u0010\u0019\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH&J\u0016\u0010\u001a\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH&R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/lib/v2/MainPermissionManager;", "", "", "deviceName", "Lcom/huami/lib/v2/MainPermissionsRationale;", "e", "Lcom/huami/utils/permissionx/business/AppSettingsRationaleWithCode;", GoogleApiAvailabilityLight.a, "", "c", "b", "", "supportWeather", "supportInComingCall", "boundWeightDevice", "", "a", "hasBoundBleDevice", "hasBoundWeightDevice", "isIncallNameDisplayEnabled", "onLocationPermissionGranted", "enableBluetooth", "isChineseUser", "checkAndRequestPermission", "permissions", "onPermissionsDenied", "onPermissionsGrant", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Z", "hasBoundDevice", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "zeppPermission_release"}, k = 1, mv = {1, 5, 1})
public abstract class MainPermissionManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppCompatActivity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isChineseUser;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean supportWeather;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean hasBoundDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.lib.v2.MainPermissionManager$checkAndRequestPermission$1", f = "MainPermissionManager.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX INFO: renamed from: com.huami.lib.v2.MainPermissionManager$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.lib.v2.MainPermissionManager$checkAndRequestPermission$1$1", f = "MainPermissionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0463a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ MainPermissionManager c;
            public final /* synthetic */ List<String> d;
            public final /* synthetic */ String e;
            public final /* synthetic */ MainPermissionsRationale f;
            public final /* synthetic */ AppSettingsRationaleWithCode g;
            public final /* synthetic */ Function1<RequestMultiplePermissionDsl, Unit> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0463a(boolean z, MainPermissionManager mainPermissionManager, List<String> list, String str, MainPermissionsRationale mainPermissionsRationale, AppSettingsRationaleWithCode appSettingsRationaleWithCode, Function1<? super RequestMultiplePermissionDsl, Unit> function1, Continuation<? super C0463a> continuation) {
                super(2, continuation);
                this.b = z;
                this.c = mainPermissionManager;
                this.d = list;
                this.e = str;
                this.f = mainPermissionsRationale;
                this.g = appSettingsRationaleWithCode;
                this.h = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0463a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0463a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.b) {
                    PermissionXKt.withPermissionsOnlyOnce(this.c.activity, this.d, this.e, this.f, this.g, this.h);
                } else {
                    PermissionXKt.withPermissions(this.c.activity, this.d, this.e, this.f, this.g, this.h);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<RequestMultiplePermissionDsl, Unit> {
            public final /* synthetic */ MainPermissionManager a;

            /* JADX INFO: renamed from: com.huami.lib.v2.MainPermissionManager$a$b$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0464a extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
                public final /* synthetic */ MainPermissionManager a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0464a(MainPermissionManager mainPermissionManager) {
                    super(1);
                    this.a = mainPermissionManager;
                }

                public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                    this.a.onPermissionsGrant(CollectionsKt___CollectionsKt.toList(map.keySet()));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                    a(map);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.huami.lib.v2.MainPermissionManager$a$b$b, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0465b extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
                public final /* synthetic */ MainPermissionManager a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0465b(MainPermissionManager mainPermissionManager) {
                    super(1);
                    this.a = mainPermissionManager;
                }

                public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                    this.a.onPermissionsDenied(CollectionsKt___CollectionsKt.toList(map.keySet()));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                    a(map);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
                public final /* synthetic */ MainPermissionManager a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(MainPermissionManager mainPermissionManager) {
                    super(1);
                    this.a = mainPermissionManager;
                }

                public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                    if (this.a.hasBoundDevice) {
                        this.a.c();
                        this.a.b();
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                    a(map);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MainPermissionManager mainPermissionManager) {
                super(1);
                this.a = mainPermissionManager;
            }

            public final void a(@NotNull RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
                requestMultiplePermissionDsl.onPermissionsGranted(new C0464a(this.a));
                requestMultiplePermissionDsl.onPermissionsDenied(new C0465b(this.a));
                requestMultiplePermissionDsl.onAllPermissionResult(new c(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
                a(requestMultiplePermissionDsl);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainPermissionManager.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MainPermissionManager mainPermissionManager = MainPermissionManager.this;
                mainPermissionManager.hasBoundDevice = mainPermissionManager.hasBoundBleDevice();
                MainPermissionManager mainPermissionManager2 = MainPermissionManager.this;
                mainPermissionManager2.supportWeather = mainPermissionManager2.supportWeather();
                if (!MainPermissionManager.this.hasBoundDevice && !MainPermissionManager.this.supportWeather) {
                    return Unit.INSTANCE;
                }
                String strDeviceName = MainPermissionManager.this.deviceName();
                boolean zSupportInComingCall = MainPermissionManager.this.supportInComingCall();
                boolean zHasBoundWeightDevice = MainPermissionManager.this.hasBoundWeightDevice();
                MainPermissionManager mainPermissionManager3 = MainPermissionManager.this;
                List listA = mainPermissionManager3.a(mainPermissionManager3.supportWeather, zSupportInComingCall, zHasBoundWeightDevice);
                MainPermissionsRationale mainPermissionsRationaleE = MainPermissionManager.this.e(strDeviceName);
                AppSettingsRationaleWithCode appSettingsRationaleWithCodeD = MainPermissionManager.this.d();
                b bVar = new b(MainPermissionManager.this);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C0463a c0463a = new C0463a(this.c, MainPermissionManager.this, listA, "key_home_band_device", mainPermissionsRationaleE, appSettingsRationaleWithCodeD, bVar, null);
                this.a = 1;
                if (BuildersKt.withContext(main, c0463a, this) == coroutine_suspended) {
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

    public MainPermissionManager(@NotNull AppCompatActivity appCompatActivity) {
        this.activity = appCompatActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> a(boolean supportWeather, boolean supportInComingCall, boolean boundWeightDevice) {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            h.addAll(arrayList, new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_ADVERTISE"});
        }
        if (supportWeather || boundWeightDevice) {
            if (i < 31) {
                arrayList.add("android.permission.ACCESS_FINE_LOCATION");
            } else if (supportWeather) {
                arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
            }
        }
        if (supportInComingCall) {
            if (isIncallNameDisplayEnabled()) {
                arrayList.add("android.permission.READ_CONTACTS");
            }
            if (i >= 28) {
                arrayList.add("android.permission.READ_CALL_LOG");
            }
            arrayList.add("android.permission.READ_PHONE_STATE");
            arrayList.add("android.permission.CALL_PHONE");
            if (i >= 26) {
                arrayList.add("android.permission.ANSWER_PHONE_CALLS");
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        if (Build.VERSION.SDK_INT < 31 || ZeppPermissionManagerKt.hasPermission(this.activity, "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_ADVERTISE")) {
            enableBluetooth();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (ZeppPermissionManagerKt.hasPermission(this.activity, "android.permission.ACCESS_COARSE_LOCATION")) {
            onLocationPermissionGranted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppSettingsRationaleWithCode d() {
        int i = Build.VERSION.SDK_INT;
        String str = i >= 31 ? "android.permission.ACCESS_COARSE_LOCATION" : "android.permission.ACCESS_FINE_LOCATION";
        ArrayList arrayList = new ArrayList();
        if (i >= 31) {
            arrayList.add("android.permission.BLUETOOTH_SCAN");
            arrayList.add("android.permission.BLUETOOTH_CONNECT");
            arrayList.add("android.permission.BLUETOOTH_ADVERTISE");
        }
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf("android.permission.READ_CONTACTS", "android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE");
        if (i >= 26) {
            listMutableListOf.add("android.permission.ANSWER_PHONE_CALLS");
        }
        Map mapMapOf = r.mapOf(TuplesKt.to(Integer.valueOf(R.string.permission_denied_msg_home_location), e.listOf(str)), TuplesKt.to(Integer.valueOf(R.string.permission_denied_msg_bluetooth), arrayList), TuplesKt.to(Integer.valueOf(R.string.permission_denied_incomming_call), listMutableListOf));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapMapOf.entrySet()) {
            if (!((List) entry.getValue()).isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new MainAppSettingsRationale(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainPermissionsRationale e(String deviceName) {
        return new MainPermissionsRationale(this.activity.getString(R.string.permission_rationale_home_band_device, new Object[]{deviceName}), this.isChineseUser, GravityCompat.START);
    }

    public final void checkAndRequestPermission(boolean isChineseUser) {
        this.isChineseUser = isChineseUser;
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this.activity), Dispatchers.getIO(), null, new a(isChineseUser, null), 2, null);
    }

    @NotNull
    public abstract String deviceName();

    public abstract void enableBluetooth();

    @WorkerThread
    public abstract boolean hasBoundBleDevice();

    public abstract boolean hasBoundWeightDevice();

    public abstract boolean isIncallNameDisplayEnabled();

    public abstract void onLocationPermissionGranted();

    public abstract void onPermissionsDenied(@NotNull List<String> permissions);

    public abstract void onPermissionsGrant(@NotNull List<String> permissions);

    public abstract boolean supportInComingCall();

    @WorkerThread
    public abstract boolean supportWeather();
}
