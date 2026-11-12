package com.xiaomi.hm.health.device.permission;

import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.huami.lib.v2.MainAppSettingsRationale;
import com.huami.lib.v2.MainPermissionsRationale;
import com.huami.permission.R;
import com.huami.utils.permissionx.PermissionResult;
import com.huami.utils.permissionx.business.PermissionXKt;
import com.huami.utils.permissionx.dsl.RequestMultiplePermissionDsl;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.e;
import kotlin.collections.q;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/permission/WeightPermissionManager;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlin/Function0;", "", "grantedCallback", "requestWeightPermission", "", "a", "Ljava/lang/String;", "KEY_WEIGHT_LOCATION", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightPermissionManager {

    @NotNull
    public static final WeightPermissionManager INSTANCE = new WeightPermissionManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_WEIGHT_LOCATION = "key_weight_location";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<RequestMultiplePermissionDsl, Unit> {
        public final /* synthetic */ Function0<Unit> a;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.permission.WeightPermissionManager$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0838a extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
            public final /* synthetic */ Function0<Unit> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0838a(Function0<Unit> function0) {
                super(1);
                this.a = function0;
            }

            public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                Function0<Unit> function0 = this.a;
                if (function0 == null) {
                    return;
                }
                function0.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                a(map);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0) {
            super(1);
            this.a = function0;
        }

        public final void a(@NotNull RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            requestMultiplePermissionDsl.onPermissionsGranted(new C0838a(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            a(requestMultiplePermissionDsl);
            return Unit.INSTANCE;
        }
    }

    private WeightPermissionManager() {
    }

    @JvmStatic
    public static final void requestWeightPermission(@NotNull FragmentActivity activity, @Nullable Function0<Unit> grantedCallback) {
        Pair pair = Build.VERSION.SDK_INT >= 31 ? TuplesKt.to(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_ADVERTISE"}), Integer.valueOf(R.string.permission_denied_msg_bluetooth)) : TuplesKt.to(e.listOf("android.permission.ACCESS_FINE_LOCATION"), Integer.valueOf(R.string.permission_denied_msg_bluetooth));
        List list = (List) pair.component1();
        int iIntValue = ((Number) pair.component2()).intValue();
        PermissionXKt.withPermissions(activity, list, "key_weight_location", new MainPermissionsRationale(activity.getString(iIntValue), false, 0, 6, null), new MainAppSettingsRationale(q.mapOf(TuplesKt.to(Integer.valueOf(iIntValue), list))), new a(grantedCallback));
    }

    public static /* synthetic */ void requestWeightPermission$default(FragmentActivity fragmentActivity, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        requestWeightPermission(fragmentActivity, function0);
    }
}
