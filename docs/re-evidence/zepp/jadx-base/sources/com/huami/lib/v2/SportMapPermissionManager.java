package com.huami.lib.v2;

import android.os.Build;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentActivity;
import com.huami.lib.PermissionConstant;
import com.huami.permission.R;
import com.huami.utils.permissionx.PermissionResult;
import com.huami.utils.permissionx.business.PermissionXKt;
import com.huami.utils.permissionx.dsl.RequestMultiplePermissionDsl;
import com.huami.utils.permissionx.dsl.RequestPermissionDsl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.e;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0014\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/lib/v2/SportMapPermissionManager;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "c", "b", "", "", "a", "Lkotlin/Function0;", "whenGetLocationCallback", "applySuccessCallback", "requestLocationPermission", "Lkotlin/jvm/functions/Function0;", "<init>", "()V", "zeppPermission_release"}, k = 1, mv = {1, 5, 1})
public final class SportMapPermissionManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> whenGetLocationCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestPermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<RequestPermissionDsl, Unit> {

        /* JADX INFO: renamed from: com.huami.lib.v2.SportMapPermissionManager$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0468a extends Lambda implements Function1<PermissionResult, Unit> {
            public final /* synthetic */ SportMapPermissionManager a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0468a(SportMapPermissionManager sportMapPermissionManager) {
                super(1);
                this.a = sportMapPermissionManager;
            }

            public final void a(@NotNull PermissionResult permissionResult) {
                Function0 function0 = this.a.whenGetLocationCallback;
                if (function0 == null) {
                    return;
                }
                function0.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PermissionResult permissionResult) {
                a(permissionResult);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull RequestPermissionDsl requestPermissionDsl) {
            requestPermissionDsl.onPermissionResult(new C0468a(SportMapPermissionManager.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestPermissionDsl requestPermissionDsl) {
            a(requestPermissionDsl);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<RequestMultiplePermissionDsl, Unit> {
        public final /* synthetic */ FragmentActivity b;
        public final /* synthetic */ boolean c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
            public final /* synthetic */ SportMapPermissionManager a;
            public final /* synthetic */ FragmentActivity b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportMapPermissionManager sportMapPermissionManager, FragmentActivity fragmentActivity) {
                super(1);
                this.a = sportMapPermissionManager;
                this.b = fragmentActivity;
            }

            public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                if (map.keySet().contains("android.permission.ACCESS_FINE_LOCATION")) {
                    this.a.b(this.b);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                a(map);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.lib.v2.SportMapPermissionManager$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0469b extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ SportMapPermissionManager b;
            public final /* synthetic */ FragmentActivity c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0469b(boolean z, SportMapPermissionManager sportMapPermissionManager, FragmentActivity fragmentActivity) {
                super(1);
                this.a = z;
                this.b = sportMapPermissionManager;
                this.c = fragmentActivity;
            }

            public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                if (map.keySet().contains("android.permission.ACCESS_FINE_LOCATION")) {
                    PermissionResult permissionResult = map.get("android.permission.ACCESS_FINE_LOCATION");
                    PermissionResult.SystemDenied systemDenied = permissionResult instanceof PermissionResult.SystemDenied ? (PermissionResult.SystemDenied) permissionResult : null;
                    Boolean boolValueOf = systemDenied != null ? Boolean.valueOf(systemDenied.getIsNeverAsk()) : null;
                    if (this.a || Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                        this.b.c(this.c);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                a(map);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FragmentActivity fragmentActivity, boolean z) {
            super(1);
            this.b = fragmentActivity;
            this.c = z;
        }

        public final void a(@NotNull RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            requestMultiplePermissionDsl.onPermissionsGranted(new a(SportMapPermissionManager.this, this.b));
            requestMultiplePermissionDsl.onPermissionsDenied(new C0469b(this.c, SportMapPermissionManager.this, this.b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            a(requestMultiplePermissionDsl);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<RequestMultiplePermissionDsl, Unit> {
        public final /* synthetic */ FragmentActivity b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
            public final /* synthetic */ SportMapPermissionManager a;
            public final /* synthetic */ FragmentActivity b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportMapPermissionManager sportMapPermissionManager, FragmentActivity fragmentActivity) {
                super(1);
                this.a = sportMapPermissionManager;
                this.b = fragmentActivity;
            }

            public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                if (map.keySet().contains("android.permission.ACCESS_FINE_LOCATION")) {
                    this.a.b(this.b);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                a(map);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FragmentActivity fragmentActivity) {
            super(1);
            this.b = fragmentActivity;
        }

        public final void a(@NotNull RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            requestMultiplePermissionDsl.onPermissionsGranted(new a(SportMapPermissionManager.this, this.b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            a(requestMultiplePermissionDsl);
            return Unit.INSTANCE;
        }
    }

    private final List<String> a() {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        if (i >= 29) {
            arrayList.add("android.permission.ACTIVITY_RECOGNITION");
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(FragmentActivity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            PermissionXKt.withPermission(activity, "android.permission.ACCESS_BACKGROUND_LOCATION", "", null, new SportAppSettingsRationale(q.mapOf(TuplesKt.to(Integer.valueOf(R.string.permission_denied_msg_activity), e.listOf("android.permission.ACCESS_BACKGROUND_LOCATION")))), new a());
            return;
        }
        Function0<Unit> function0 = this.whenGetLocationCallback;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(FragmentActivity activity) {
        if (Build.VERSION.SDK_INT <= 29) {
            return;
        }
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
        PermissionXKt.withPermissions(activity, listListOf, PermissionConstant.KEY_SPORT_LOCATION_FIND, new MainPermissionsRationale(activity.getString(R.string.permission_denied_msg_activity), false, 0, 6, null), new SportAppSettingsRationale(q.mapOf(TuplesKt.to(Integer.valueOf(R.string.permission_denied_msg_location_new), listListOf))), new c(activity));
    }

    public final void applySuccessCallback(@NotNull Function0<Unit> whenGetLocationCallback) {
        this.whenGetLocationCallback = whenGetLocationCallback;
    }

    public final void requestLocationPermission(@NotNull FragmentActivity activity) {
        List<String> listA = a();
        boolean z = Build.VERSION.SDK_INT >= 31 && !ZeppPermissionManagerKt.hasPermission(activity, "android.permission.ACCESS_COARSE_LOCATION");
        MainPermissionsRationale mainPermissionsRationale = new MainPermissionsRationale(activity.getString(R.string.permission_request_msg_location_new), false, GravityCompat.START, 2, null);
        SportAppSettingsRationale sportAppSettingsRationale = new SportAppSettingsRationale(q.mapOf(TuplesKt.to(Integer.valueOf(R.string.permission_denied_msg_location_new), listA)));
        sportAppSettingsRationale.updateShowAppSettingRationale(activity);
        Unit unit = Unit.INSTANCE;
        PermissionXKt.withPermissions(activity, listA, "main_sport_location", mainPermissionsRationale, sportAppSettingsRationale, new b(activity, z));
    }
}
