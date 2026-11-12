package com.fitness.permission.manager.export;

import android.app.Activity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014JZ\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&J\b\u0010\u000e\u001a\u00020\u0003H&J(\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lcom/fitness/permission/manager/export/IPermissionManager;", "", "showGuideSystemOpenPermissionWhenDeniedIfNeed", "", "targetPermission", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "deniedList", "", "excludeNonEssentialPermission", "notShowGuide", "Lkotlin/Function0;", "showGuide", "statisticAppPermission", "statisticAppPermissionOnResult", "grantedList", "statisticNotificationListenPermission", "grant", "", "Companion", "permission-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IPermissionManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fitness/permission/manager/export/IPermissionManager$Companion;", "", "<init>", "()V", "permission-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showGuideSystemOpenPermissionWhenDeniedIfNeed$default(IPermissionManager iPermissionManager, String str, Activity activity, List list, List list2, Function0 function0, Function0 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showGuideSystemOpenPermissionWhenDeniedIfNeed");
            }
            if ((i & 4) != 0) {
                list = Collections.singletonList(str);
            }
            List list3 = list;
            if ((i & 8) != 0) {
                list2 = null;
            }
            List list4 = list2;
            if ((i & 16) != 0) {
                function0 = new Function0() { // from class: awc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
            }
            iPermissionManager.showGuideSystemOpenPermissionWhenDeniedIfNeed(str, activity, list3, list4, function0, function1);
        }
    }

    void showGuideSystemOpenPermissionWhenDeniedIfNeed(@NotNull String targetPermission, @NotNull Activity activity, @NotNull List<String> deniedList, @Nullable List<String> excludeNonEssentialPermission, @NotNull Function0<Unit> notShowGuide, @NotNull Function0<Unit> showGuide);

    void statisticAppPermission();

    void statisticAppPermissionOnResult(@Nullable List<String> grantedList, @Nullable List<String> deniedList);

    void statisticNotificationListenPermission(boolean grant);
}
