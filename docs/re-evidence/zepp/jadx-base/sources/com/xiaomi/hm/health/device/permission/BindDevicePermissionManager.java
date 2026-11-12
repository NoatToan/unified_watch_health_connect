package com.xiaomi.hm.health.device.permission;

import android.app.Application;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentActivity;
import com.huami.lib.v2.MainAppSettingsRationale;
import com.huami.lib.v2.MainPermissionsRationale;
import com.huami.lib.v2.ZeppPermissionManagerKt;
import com.huami.permission.R;
import com.huami.utils.permissionx.PermissionResult;
import com.huami.utils.permissionx.business.PermissionXKt;
import com.huami.utils.permissionx.dsl.RequestMultiplePermissionDsl;
import com.huami.utils.permissionx.dsl.RequestPermissionDsl;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.notification.TransportUri;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\u0002H&J\u0006\u0010\f\u001a\u00020\u0002J)\u0010\u0012\u001a\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00020\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/permission/BindDevicePermissionManager;", "", "", "b", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "a", "launchBindPage", "cleanBindType", "checkLocationServiceOpen", "applyOpenLocationService", "requestBindDevicePermissions", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "allow", "requestResult", "requestCameraPermission", "Landroidx/fragment/app/FragmentActivity;", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class BindDevicePermissionManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_REQUEST_CODE_DEVICE_BIND = "key_device_bind";

    @NotNull
    public static final String KEY_REQUEST_CODE_DEVICE_BIND_CAMERA = "key_device_bind_camera";

    @NotNull
    public static final String KEY_REQUEST_CODE_DEVICE_BIND_LOCATION = "key_device_bind";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FragmentActivity activity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J)\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\b\nH\u0007R\u0016\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/permission/BindDevicePermissionManager$Companion;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlin/Function0;", "", "allowCallback", "requestBlueAndCameraPermission", "Lkotlin/Function1;", "Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "requestBluePermission", "", "KEY_REQUEST_CODE_DEVICE_BIND", "Ljava/lang/String;", "KEY_REQUEST_CODE_DEVICE_BIND_CAMERA", "KEY_REQUEST_CODE_DEVICE_BIND_LOCATION", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<RequestMultiplePermissionDsl, Unit> {
            public final /* synthetic */ List<String> a;
            public final /* synthetic */ String b;
            public final /* synthetic */ FragmentActivity c;
            public final /* synthetic */ Function0<Unit> d;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.permission.BindDevicePermissionManager$Companion$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0833a extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
                public final /* synthetic */ List<String> a;
                public final /* synthetic */ String b;
                public final /* synthetic */ FragmentActivity c;
                public final /* synthetic */ Function0<Unit> d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0833a(List<String> list, String str, FragmentActivity fragmentActivity, Function0<Unit> function0) {
                    super(1);
                    this.a = list;
                    this.b = str;
                    this.c = fragmentActivity;
                    this.d = function0;
                }

                public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                    if (map.keySet().containsAll(CollectionsKt___CollectionsKt.plus((Collection<? extends String>) this.a, this.b))) {
                        Application application = this.c.getApplication();
                        CompanionApplication companionApplication = application instanceof CompanionApplication ? (CompanionApplication) application : null;
                        if (companionApplication != null) {
                            companionApplication.initPhoneConnection();
                        }
                        this.d.getA();
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                    a(map);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<String> list, String str, FragmentActivity fragmentActivity, Function0<Unit> function0) {
                super(1);
                this.a = list;
                this.b = str;
                this.c = fragmentActivity;
                this.d = function0;
            }

            public final void a(@NotNull RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
                requestMultiplePermissionDsl.onPermissionsGranted(new C0833a(this.a, this.b, this.c, this.d));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
                a(requestMultiplePermissionDsl);
                return Unit.INSTANCE;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @RequiresApi(31)
        public final void requestBlueAndCameraPermission(@NotNull FragmentActivity activity, @NotNull Function0<Unit> allowCallback) {
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_ADVERTISE"});
            int i = R.string.permission_denied_msg_bluetooth;
            StringBuffer stringBuffer = new StringBuffer(activity.getString(i));
            stringBuffer.append("\n");
            int i2 = R.string.permission_denied_msg_camera_bind_shoes;
            stringBuffer.append(activity.getString(i2));
            PermissionXKt.withPermissions(activity, CollectionsKt___CollectionsKt.plus((Collection<? extends String>) listListOf, "android.permission.CAMERA"), "key_device_bind", new MainPermissionsRationale(stringBuffer.toString(), false, 0, 4, null), new MainAppSettingsRationale(r.mapOf(TuplesKt.to(Integer.valueOf(i), listListOf), TuplesKt.to(Integer.valueOf(i2), e.listOf("android.permission.CAMERA")))), new a(listListOf, "android.permission.CAMERA", activity, allowCallback));
        }

        @RequiresApi(31)
        public final void requestBluePermission(@NotNull FragmentActivity activity, @NotNull Function1<? super RequestMultiplePermissionDsl, Unit> block) {
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_ADVERTISE"});
            int i = R.string.permission_denied_msg_bluetooth;
            PermissionXKt.withPermissions(activity, listListOf, "key_device_bind", new MainPermissionsRationale(activity.getString(i), false, 0, 4, null), new MainAppSettingsRationale(q.mapOf(TuplesKt.to(Integer.valueOf(i), listListOf))), block);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<RequestMultiplePermissionDsl, Unit> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.permission.BindDevicePermissionManager$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0834a extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
            public final /* synthetic */ BindDevicePermissionManager a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0834a(BindDevicePermissionManager bindDevicePermissionManager) {
                super(1);
                this.a = bindDevicePermissionManager;
            }

            public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                Application application = this.a.activity.getApplication();
                CompanionApplication companionApplication = application instanceof CompanionApplication ? (CompanionApplication) application : null;
                if (companionApplication != null) {
                    companionApplication.initPhoneConnection();
                }
                this.a.launchBindPage();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                a(map);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
            public final /* synthetic */ BindDevicePermissionManager a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(BindDevicePermissionManager bindDevicePermissionManager) {
                super(1);
                this.a = bindDevicePermissionManager;
            }

            public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                this.a.cleanBindType();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                a(map);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            requestMultiplePermissionDsl.onPermissionsGranted(new C0834a(BindDevicePermissionManager.this));
            requestMultiplePermissionDsl.onPermissionsDenied(new b(BindDevicePermissionManager.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            a(requestMultiplePermissionDsl);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestPermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<RequestPermissionDsl, Unit> {
        public final /* synthetic */ Function1<Boolean, Unit> a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Function1<Boolean, Unit> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Boolean, Unit> function1) {
                super(0);
                this.a = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.invoke(Boolean.TRUE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.permission.BindDevicePermissionManager$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0835b extends Lambda implements Function1<PermissionResult, Unit> {
            public final /* synthetic */ Function1<Boolean, Unit> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0835b(Function1<? super Boolean, Unit> function1) {
                super(1);
                this.a = function1;
            }

            public final void a(@NotNull PermissionResult permissionResult) {
                this.a.invoke(Boolean.FALSE);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PermissionResult permissionResult) {
                a(permissionResult);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Boolean, Unit> function1) {
            super(1);
            this.a = function1;
        }

        public final void a(@NotNull RequestPermissionDsl requestPermissionDsl) {
            requestPermissionDsl.onPermissionGranted(new a(this.a));
            requestPermissionDsl.onPermissionDenied(new C0835b(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestPermissionDsl requestPermissionDsl) {
            a(requestPermissionDsl);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestPermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<RequestPermissionDsl, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ BindDevicePermissionManager a;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.permission.BindDevicePermissionManager$c$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestPermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0836a extends Lambda implements Function1<RequestPermissionDsl, Unit> {
                public final /* synthetic */ BindDevicePermissionManager a;

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.permission.BindDevicePermissionManager$c$a$a$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0837a extends Lambda implements Function1<PermissionResult, Unit> {
                    public final /* synthetic */ BindDevicePermissionManager a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0837a(BindDevicePermissionManager bindDevicePermissionManager) {
                        super(1);
                        this.a = bindDevicePermissionManager;
                    }

                    public final void a(@NotNull PermissionResult permissionResult) {
                        this.a.launchBindPage();
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PermissionResult permissionResult) {
                        a(permissionResult);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0836a(BindDevicePermissionManager bindDevicePermissionManager) {
                    super(1);
                    this.a = bindDevicePermissionManager;
                }

                public final void a(@NotNull RequestPermissionDsl requestPermissionDsl) {
                    requestPermissionDsl.onPermissionResult(new C0837a(this.a));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RequestPermissionDsl requestPermissionDsl) {
                    a(requestPermissionDsl);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BindDevicePermissionManager bindDevicePermissionManager) {
                super(0);
                this.a = bindDevicePermissionManager;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (!this.a.checkLocationServiceOpen()) {
                    this.a.applyOpenLocationService();
                    this.a.cleanBindType();
                } else if (Build.VERSION.SDK_INT >= 29) {
                    PermissionXKt.withPermission(this.a.activity, "android.permission.ACCESS_BACKGROUND_LOCATION", "key_device_bind", null, new MainAppSettingsRationale(R.string.permission_bind_device_background_location, "android.permission.ACCESS_BACKGROUND_LOCATION"), new C0836a(this.a));
                } else {
                    this.a.launchBindPage();
                }
            }
        }

        public c() {
            super(1);
        }

        public final void a(@NotNull RequestPermissionDsl requestPermissionDsl) {
            requestPermissionDsl.onPermissionGranted(new a(BindDevicePermissionManager.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestPermissionDsl requestPermissionDsl) {
            a(requestPermissionDsl);
            return Unit.INSTANCE;
        }
    }

    public BindDevicePermissionManager(@NotNull FragmentActivity fragmentActivity) {
        this.activity = fragmentActivity;
    }

    @RequiresApi(31)
    private final boolean a(FragmentActivity activity) {
        return ZeppPermissionManagerKt.hasPermission(activity, "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_ADVERTISE");
    }

    private final void b() {
        FragmentActivity fragmentActivity = this.activity;
        PermissionXKt.withPermission(fragmentActivity, "android.permission.ACCESS_FINE_LOCATION", "key_device_bind", new MainPermissionsRationale(fragmentActivity.getString(R.string.permission_rationale_location_for_ble), false, GravityCompat.START, 2, null), new MainAppSettingsRationale(R.string.permission_denied_msg_location_for_ble, "android.permission.ACCESS_FINE_LOCATION"), new c());
    }

    public abstract void applyOpenLocationService();

    public abstract boolean checkLocationServiceOpen();

    public abstract void cleanBindType();

    public abstract void launchBindPage();

    public final void requestBindDevicePermissions() {
        if (Build.VERSION.SDK_INT > 30) {
            INSTANCE.requestBluePermission(this.activity, new a());
        } else {
            b();
        }
    }

    public final void requestCameraPermission(@NotNull Function1<? super Boolean, Unit> requestResult) {
        FragmentActivity fragmentActivity = this.activity;
        int i = R.string.permission_denied_msg_camera_bind_shoes;
        PermissionXKt.withPermission(fragmentActivity, "android.permission.CAMERA", "key_device_bind_camera", new MainPermissionsRationale(fragmentActivity.getString(i), false, 0, 6, null), new MainAppSettingsRationale(i, "android.permission.CAMERA"), new b(requestResult));
    }
}
