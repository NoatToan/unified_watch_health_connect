package androidx.health.connect.client;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.UserManager;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.impl.HealthConnectClientImpl;
import androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import androidx.health.connect.client.request.AggregateGroupByPeriodRequest;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ChangesTokenRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.connect.client.response.ChangesResponse;
import androidx.health.connect.client.response.InsertRecordsResponse;
import androidx.health.connect.client.response.ReadRecordResponse;
import androidx.health.connect.client.response.ReadRecordsResponse;
import androidx.health.connect.client.time.TimeRangeFilter;
import androidx.health.platform.client.HealthDataService;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import defpackage.dhh;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 62\u00020\u0001:\u000256J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\b\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH¦@¢\u0006\u0002\u0010\u001bJ:\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\fH¦@¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH¦@¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020%H¦@¢\u0006\u0002\u0010&J\u001c\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\fH¦@¢\u0006\u0002\u0010*J4\u0010+\u001a\b\u0012\u0004\u0012\u0002H-0,\"\b\b\u0000\u0010-*\u00020\u00182\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H-0\u00172\u0006\u0010.\u001a\u00020\u001dH¦@¢\u0006\u0002\u0010/J,\u00100\u001a\b\u0012\u0004\u0012\u0002H-01\"\b\b\u0000\u0010-*\u00020\u00182\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H-02H¦@¢\u0006\u0002\u00103J\u001c\u00104\u001a\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\fH¦@¢\u0006\u0002\u0010*R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00067À\u0006\u0003"}, d2 = {"Landroidx/health/connect/client/HealthConnectClient;", "", "permissionController", "Landroidx/health/connect/client/PermissionController;", "getPermissionController", "()Landroidx/health/connect/client/PermissionController;", "aggregate", "Landroidx/health/connect/client/aggregate/AggregationResult;", "request", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByDuration", "", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByPeriod", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRecords", "", "recordType", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "timeRangeFilter", "Landroidx/health/connect/client/time/TimeRangeFilter;", "(Lkotlin/reflect/KClass;Landroidx/health/connect/client/time/TimeRangeFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordIdsList", "", "clientRecordIdsList", "(Lkotlin/reflect/KClass;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChanges", "Landroidx/health/connect/client/response/ChangesResponse;", "changesToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChangesToken", "Landroidx/health/connect/client/request/ChangesTokenRequest;", "(Landroidx/health/connect/client/request/ChangesTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRecords", "Landroidx/health/connect/client/response/InsertRecordsResponse;", "records", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecord", "Landroidx/health/connect/client/response/ReadRecordResponse;", "T", "recordId", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecords", "Landroidx/health/connect/client/response/ReadRecordsResponse;", "Landroidx/health/connect/client/request/ReadRecordsRequest;", "(Landroidx/health/connect/client/request/ReadRecordsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRecords", "Api33Impl", "Companion", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface HealthConnectClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int DEFAULT_PROVIDER_MIN_VERSION_CODE = 68623;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final String DEFAULT_PROVIDER_PACKAGE_NAME = "com.google.android.apps.healthdata";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final String HEALTH_CONNECT_CLIENT_TAG = "HealthConnectClient";
    public static final int SDK_AVAILABLE = 3;
    public static final int SDK_UNAVAILABLE = 1;
    public static final int SDK_UNAVAILABLE_PROVIDER_UPDATE_REQUIRED = 2;

    @RequiresApi(33)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/health/connect/client/HealthConnectClient$Api33Impl;", "", "()V", "isProfile", "", "context", "Landroid/content/Context;", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Impl {

        @NotNull
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        @JvmStatic
        public static final boolean isProfile(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService(SceneRecogBroadcastReceiver.FROM_USER);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.UserManager");
            return ((UserManager) systemService).isProfile();
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u0010*J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00068\u0000X\u0081T¢\u0006\u0006\n\u0004\b$\u0010%R \u0010&\u001a\u00020\u00048GX\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010#\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u001a\u0010+\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010(R\u0014\u0010-\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010%R\u0014\u0010.\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010%R\u0014\u0010/\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010%R\u0014\u00100\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b0\u0010#¨\u00062"}, d2 = {"Landroidx/health/connect/client/HealthConnectClient$Companion;", "", "Landroid/content/pm/PackageManager;", "packageManager", "", "packageName", "", CommonConstants.KEY_VERSION_CODE, "", "isPackageInstalled", "(Landroid/content/pm/PackageManager;Ljava/lang/String;I)Z", "Landroid/content/Context;", "context", "isProfileInAndroidU", "(Landroid/content/Context;)Z", "providerPackageName", "getSdkStatus", "(Landroid/content/Context;Ljava/lang/String;)I", "Landroidx/health/connect/client/HealthConnectClient;", "getOrCreate", "(Landroid/content/Context;Ljava/lang/String;)Landroidx/health/connect/client/HealthConnectClient;", "Landroid/content/Intent;", "getHealthConnectManageDataIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "isSdkVersionSufficient$connect_client_release", "()Z", "isSdkVersionSufficient", "providerVersionCode", "isProviderAvailable$connect_client_release", "(Landroid/content/Context;Ljava/lang/String;I)Z", "isProviderAvailable", "hasBindableService$connect_client_release", "(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z", "hasBindableService", "DEFAULT_PROVIDER_PACKAGE_NAME", "Ljava/lang/String;", "DEFAULT_PROVIDER_MIN_VERSION_CODE", "I", "ACTION_HEALTH_CONNECT_SETTINGS", "getHealthConnectSettingsAction", "()Ljava/lang/String;", "getHealthConnectSettingsAction$annotations", "()V", "ACTION_HEALTH_CONNECT_MANAGE_DATA", "getACTION_HEALTH_CONNECT_MANAGE_DATA$connect_client_release", "SDK_UNAVAILABLE", "SDK_UNAVAILABLE_PROVIDER_UPDATE_REQUIRED", "SDK_AVAILABLE", "HEALTH_CONNECT_CLIENT_TAG", "<init>", "connect-client_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        private static final String ACTION_HEALTH_CONNECT_MANAGE_DATA;

        @NotNull
        private static final String ACTION_HEALTH_CONNECT_SETTINGS;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static final int DEFAULT_PROVIDER_MIN_VERSION_CODE = 68623;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final String DEFAULT_PROVIDER_PACKAGE_NAME = "com.google.android.apps.healthdata";

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final String HEALTH_CONNECT_CLIENT_TAG = "HealthConnectClient";
        public static final int SDK_AVAILABLE = 3;
        public static final int SDK_UNAVAILABLE = 1;
        public static final int SDK_UNAVAILABLE_PROVIDER_UPDATE_REQUIRED = 2;

        static {
            int i = Build.VERSION.SDK_INT;
            ACTION_HEALTH_CONNECT_SETTINGS = i >= 34 ? "android.health.connect.action.HEALTH_HOME_SETTINGS" : "androidx.health.ACTION_HEALTH_CONNECT_SETTINGS";
            ACTION_HEALTH_CONNECT_MANAGE_DATA = i >= 34 ? "android.health.connect.action.MANAGE_HEALTH_DATA" : "androidx.health.ACTION_MANAGE_HEALTH_DATA";
        }

        private Companion() {
        }

        public static /* synthetic */ Intent getHealthConnectManageDataIntent$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "com.google.android.apps.healthdata";
            }
            return companion.getHealthConnectManageDataIntent(context, str);
        }

        @JvmStatic
        public static /* synthetic */ void getHealthConnectSettingsAction$annotations() {
        }

        public static /* synthetic */ HealthConnectClient getOrCreate$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "com.google.android.apps.healthdata";
            }
            return companion.getOrCreate(context, str);
        }

        public static /* synthetic */ int getSdkStatus$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "com.google.android.apps.healthdata";
            }
            return companion.getSdkStatus(context, str);
        }

        private final boolean isPackageInstalled(PackageManager packageManager, String packageName, int versionCode) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                    @S…= */ 0)\n                }");
                if (packageInfo.applicationInfo.enabled) {
                    return (!Intrinsics.areEqual(packageName, "com.google.android.apps.healthdata") || dhh.a(packageInfo) >= ((long) versionCode)) && hasBindableService$connect_client_release(packageManager, packageName);
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        public static /* synthetic */ boolean isPackageInstalled$default(Companion companion, PackageManager packageManager, String str, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 68623;
            }
            return companion.isPackageInstalled(packageManager, str, i);
        }

        private final boolean isProfileInAndroidU(Context context) {
            return Build.VERSION.SDK_INT >= 34 && Api33Impl.isProfile(context);
        }

        public static /* synthetic */ boolean isProviderAvailable$connect_client_release$default(Companion companion, Context context, String str, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = "com.google.android.apps.healthdata";
            }
            if ((i2 & 4) != 0) {
                i = 68623;
            }
            return companion.isProviderAvailable$connect_client_release(context, str, i);
        }

        @NotNull
        public final String getACTION_HEALTH_CONNECT_MANAGE_DATA$connect_client_release() {
            return ACTION_HEALTH_CONNECT_MANAGE_DATA;
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final Intent getHealthConnectManageDataIntent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getHealthConnectManageDataIntent$default(this, context, null, 2, null);
        }

        @JvmName(name = "getHealthConnectSettingsAction")
        @NotNull
        public final String getHealthConnectSettingsAction() {
            return ACTION_HEALTH_CONNECT_SETTINGS;
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final HealthConnectClient getOrCreate(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getOrCreate$default(this, context, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final int getSdkStatus(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getSdkStatus$default(this, context, null, 2, null);
        }

        public final boolean hasBindableService$connect_client_release(@NotNull PackageManager packageManager, @NotNull String packageName) {
            Intrinsics.checkNotNullParameter(packageManager, "packageManager");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intent intent = new Intent();
            intent.setPackage(packageName);
            intent.setAction(HealthDataService.ANDROID_HEALTH_PLATFORM_SERVICE_BIND_ACTION);
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "packageManager.queryIntentServices(bindIntent, 0)");
            return !listQueryIntentServices.isEmpty();
        }

        public final boolean isProviderAvailable$connect_client_release(@NotNull Context context, @NotNull String providerPackageName, int providerVersionCode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(providerPackageName, "providerPackageName");
            if (Build.VERSION.SDK_INT >= 34) {
                return true;
            }
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            return isPackageInstalled(packageManager, providerPackageName, providerVersionCode);
        }

        @ChecksSdkIntAtLeast(api = 28)
        public final boolean isSdkVersionSufficient$connect_client_release() {
            return Build.VERSION.SDK_INT >= 28;
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final Intent getHealthConnectManageDataIntent(@NotNull Context context, @NotNull String providerPackageName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(providerPackageName, "providerPackageName");
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(ACTION_HEALTH_CONNECT_MANAGE_DATA);
            return (!isProviderAvailable$connect_client_release$default(this, context, providerPackageName, 0, 4, null) || packageManager.resolveActivity(intent, 0) == null) ? new Intent(ACTION_HEALTH_CONNECT_SETTINGS) : intent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @JvmOverloads
        @NotNull
        public final HealthConnectClient getOrCreate(@NotNull Context context, @NotNull String providerPackageName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(providerPackageName, "providerPackageName");
            int sdkStatus = getSdkStatus(context, providerPackageName);
            if (sdkStatus == 1) {
                throw new UnsupportedOperationException("SDK version too low or running in a profile");
            }
            int i = 2;
            if (sdkStatus != 2) {
                return Build.VERSION.SDK_INT >= 34 ? new HealthConnectClientUpsideDownImpl(context) : new HealthConnectClientImpl(HealthDataService.INSTANCE.getClient(context, providerPackageName), null, i, 0 == true ? 1 : 0);
            }
            throw new IllegalStateException("Service not available");
        }

        @JvmStatic
        @JvmOverloads
        public final int getSdkStatus(@NotNull Context context, @NotNull String providerPackageName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(providerPackageName, "providerPackageName");
            if (!isSdkVersionSufficient$connect_client_release() || isProfileInAndroidU(context)) {
                return 1;
            }
            return !isProviderAvailable$connect_client_release$default(this, context, providerPackageName, 0, 4, null) ? 2 : 3;
        }
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    static Intent getHealthConnectManageDataIntent(@NotNull Context context) {
        return INSTANCE.getHealthConnectManageDataIntent(context);
    }

    @JvmName(name = "getHealthConnectSettingsAction")
    @NotNull
    static String getHealthConnectSettingsAction() {
        return INSTANCE.getHealthConnectSettingsAction();
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    static HealthConnectClient getOrCreate(@NotNull Context context) {
        return INSTANCE.getOrCreate(context);
    }

    @JvmStatic
    @JvmOverloads
    static int getSdkStatus(@NotNull Context context) {
        return INSTANCE.getSdkStatus(context);
    }

    @Nullable
    Object aggregate(@NotNull AggregateRequest aggregateRequest, @NotNull Continuation<? super AggregationResult> continuation);

    @Nullable
    Object aggregateGroupByDuration(@NotNull AggregateGroupByDurationRequest aggregateGroupByDurationRequest, @NotNull Continuation<? super List<AggregationResultGroupedByDuration>> continuation);

    @Nullable
    Object aggregateGroupByPeriod(@NotNull AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest, @NotNull Continuation<? super List<AggregationResultGroupedByPeriod>> continuation);

    @Nullable
    Object deleteRecords(@NotNull KClass<? extends Record> kClass, @NotNull TimeRangeFilter timeRangeFilter, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object deleteRecords(@NotNull KClass<? extends Record> kClass, @NotNull List<String> list, @NotNull List<String> list2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getChanges(@NotNull String str, @NotNull Continuation<? super ChangesResponse> continuation);

    @Nullable
    Object getChangesToken(@NotNull ChangesTokenRequest changesTokenRequest, @NotNull Continuation<? super String> continuation);

    @NotNull
    PermissionController getPermissionController();

    @Nullable
    Object insertRecords(@NotNull List<? extends Record> list, @NotNull Continuation<? super InsertRecordsResponse> continuation);

    @Nullable
    <T extends Record> Object readRecord(@NotNull KClass<T> kClass, @NotNull String str, @NotNull Continuation<? super ReadRecordResponse<T>> continuation);

    @Nullable
    <T extends Record> Object readRecords(@NotNull ReadRecordsRequest<T> readRecordsRequest, @NotNull Continuation<? super ReadRecordsResponse<T>> continuation);

    @Nullable
    Object updateRecords(@NotNull List<? extends Record> list, @NotNull Continuation<? super Unit> continuation);

    @JvmStatic
    @JvmOverloads
    @NotNull
    static Intent getHealthConnectManageDataIntent(@NotNull Context context, @NotNull String str) {
        return INSTANCE.getHealthConnectManageDataIntent(context, str);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    static HealthConnectClient getOrCreate(@NotNull Context context, @NotNull String str) {
        return INSTANCE.getOrCreate(context, str);
    }

    @JvmStatic
    @JvmOverloads
    static int getSdkStatus(@NotNull Context context, @NotNull String str) {
        return INSTANCE.getSdkStatus(context, str);
    }
}
