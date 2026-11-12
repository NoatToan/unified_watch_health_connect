package com.xiaomi.hm.health.ui.diagnosis;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.PermissionChecker;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.ui.smartplay.NotificationAccessService;
import com.xiaomi.hm.health.utils.Utils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004`\t2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/ui/diagnosis/AppUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isNotificationPermissionEnabled", "isNotificationListenerServiceRunning", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "checkPhonePermission", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppUtil {

    @NotNull
    public static final AppUtil INSTANCE = new AppUtil();

    private AppUtil() {
    }

    @NotNull
    public final HashMap<String, Boolean> checkPhonePermission(@NotNull Context context) {
        HashMap<String, Boolean> map = new HashMap<>();
        String[] strArr = {"android.permission.READ_PHONE_STATE", "android.permission.READ_CALL_LOG", "android.permission.READ_CONTACTS"};
        int i = 0;
        while (i < 3) {
            String str = strArr[i];
            i++;
            map.put(str, Boolean.valueOf(PermissionChecker.checkSelfPermission(context, str) == 0));
        }
        return map;
    }

    public final boolean isNotificationListenerServiceRunning(@NotNull Context context) {
        return Utils.isServiceRunning(context, Reflection.getOrCreateKotlinClass(NotificationAccessService.class).getQualifiedName());
    }

    public final boolean isNotificationPermissionEnabled(@NotNull Context context) {
        return NotificationManagerCompat.getEnabledListenerPackages(context).contains(context.getPackageName());
    }
}
