package com.huami.lib.v2;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.lib.ZeppPermissionConfig;
import com.huami.permission.R;
import com.huami.tools.log.HMLog;
import com.huami.utils.easypermission.manager.PermissionConfigManager;
import com.huami.utils.easypermission.manager.PermissionManagerActivity;
import com.huami.utils.permissionx.Logger;
import com.huami.utils.permissionx.PermissionRationaleConfig;
import com.huami.utils.permissionx.PermissionX;
import com.huami.utils.permissionx.rationale.DefaultAppSettingsRationale;
import com.huami.utils.permissionx.rationale.DefaultPermissionsRationale;
import com.huami.utils.permissionx.rationale.PermissionRationaleInfo;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0016\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¨\u0006\r"}, d2 = {"Lcom/huami/lib/v2/ZeppPermissionManager;", "", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "", "Lcom/huami/utils/permissionx/rationale/PermissionRationaleInfo;", "rationaleInfo", "", PointCategory.INIT, "Lcom/huami/utils/permissionx/PermissionRationaleConfig;", "a", "<init>", "()V", "zeppPermission_release"}, k = 1, mv = {1, 5, 1})
public final class ZeppPermissionManager {

    @NotNull
    public static final ZeppPermissionManager INSTANCE = new ZeppPermissionManager();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"Landroid/app/Activity;", "activity", "", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Activity, List<? extends String>, Unit> {
        public static final a a = new a();

        public a() {
            super(2);
        }

        public final void a(@NotNull Activity activity, @NotNull List<String> list) {
            activity.startActivity(new Intent(activity, (Class<?>) PermissionManagerActivity.class));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Activity activity, List<? extends String> list) {
            a(activity, list);
            return Unit.INSTANCE;
        }
    }

    private ZeppPermissionManager() {
    }

    private final PermissionRationaleConfig a(List<PermissionRationaleInfo> rationaleInfo) {
        PermissionRationaleConfig permissionRationaleConfig = new PermissionRationaleConfig();
        PermissionRationaleInfo.Companion companion = PermissionRationaleInfo.INSTANCE;
        permissionRationaleConfig.addRationale(PermissionRationaleInfo.Companion.create$default(companion, "android.permission.CAMERA", R.string.permission_rationale_msg_camera_select_image, null, 4, null));
        permissionRationaleConfig.addRationale(PermissionRationaleInfo.Companion.create$default(companion, "android.permission.WRITE_EXTERNAL_STORAGE", R.string.permission_rationale_storage_select_image, null, 4, null));
        permissionRationaleConfig.addAppSettingRationale(PermissionRationaleInfo.Companion.create$default(companion, "android.permission.CAMERA", R.string.permission_denied_msg_camera_select_camera, null, 4, null));
        permissionRationaleConfig.addAppSettingRationale(PermissionRationaleInfo.Companion.create$default(companion, "android.permission.WRITE_EXTERNAL_STORAGE", R.string.permission_denied_msg_storage_select_image, null, 4, null));
        Iterator<T> it2 = rationaleInfo.iterator();
        while (it2.hasNext()) {
            permissionRationaleConfig.addAppSettingRationale((PermissionRationaleInfo) it2.next());
        }
        return permissionRationaleConfig;
    }

    @JvmStatic
    @JvmOverloads
    public static final void init(@NotNull Application application) {
        init$default(application, null, 2, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void init(@NotNull Application application, @NotNull List<PermissionRationaleInfo> rationaleInfo) {
        PermissionX permissionX = PermissionX.INSTANCE;
        permissionX.setDefaultPermissionsRationaleWithCode(new DefaultPermissionsRationale(0, 0, 3, null));
        permissionX.setDefaultAppSettingsRationaleWithCode(new DefaultAppSettingsRationale(0, 0, 0, a.a, 7, null));
        permissionX.setRationalesConfig(INSTANCE.a(rationaleInfo));
        permissionX.setLogger(new Logger() { // from class: com.huami.lib.v2.ZeppPermissionManager.init.2

            /* JADX INFO: renamed from: com.huami.lib.v2.ZeppPermissionManager$init$2$a */
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
                    return "permission request error:" + this.a;
                }
            }

            /* JADX INFO: renamed from: com.huami.lib.v2.ZeppPermissionManager$init$2$b */
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
                    return "permission request info:" + this.a;
                }
            }

            /* JADX INFO: renamed from: com.huami.lib.v2.ZeppPermissionManager$init$2$c */
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
                    return "permission request warn:" + this.a;
                }
            }

            @Override // com.huami.utils.permissionx.Logger
            public void error(@NotNull String message) {
                HMLog.error$default("PermissionX", null, null, new a(message), 6, null);
            }

            @Override // com.huami.utils.permissionx.Logger
            public void info(@NotNull String message) {
                HMLog.info("PermissionX", new b(message));
            }

            @Override // com.huami.utils.permissionx.Logger
            public void warning(@NotNull String message) {
                HMLog.warn$default("PermissionX", null, new c(message), 2, null);
            }
        });
        PermissionConfigManager.INSTANCE.initConfig(new ZeppPermissionConfig(application));
    }

    public static /* synthetic */ void init$default(Application application, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        init(application, list);
    }
}
