package com.huami.device.feature.notification.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.view.Display;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.hardware.display.DisplayManagerCompat;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0002J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u001c\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0010\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/device/feature/notification/utils/AppUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/lang/Class;", "clazz", "", "a", "", "pkg", "getAppName", "isNotificationAccessEnabled", "isAppInstalled", "isServiceNotRunning", "isScreenOn", "Ljava/lang/String;", "logTag", "<init>", "()V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class AppUtil {

    @NotNull
    public static final AppUtil INSTANCE = new AppUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String logTag = "NotificationLog_AppUtil";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getAppName is empty. try labelRes";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getAppName exception: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("package: ", this.a.getPackageName());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("enabled package: ", this.a);
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
            return "runningServices is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Class<Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Class<Object> cls) {
            super(0);
            this.a = cls;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("service class: ", this.a.getName());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ ActivityManager.RunningServiceInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ActivityManager.RunningServiceInfo runningServiceInfo) {
            super(0);
            this.a = runningServiceInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("running services: ", this.a.service);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Display a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Display display) {
            super(0);
            this.a = display;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "display name: " + ((Object) this.a.getName()) + " display state: " + this.a.getState();
        }
    }

    private AppUtil() {
    }

    private final boolean a(Context context, Class<Object> clazz) {
        Unit unit;
        Object systemService = context.getSystemService("activity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE);
        if (runningServices == null) {
            unit = null;
        } else {
            Iterator<T> it2 = runningServices.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(((ActivityManager.RunningServiceInfo) it2.next()).service.getClassName(), clazz.getName())) {
                    return true;
                }
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            HMLog.info(logTag, e.a);
        }
        HMLog.info(logTag, new f(clazz));
        if (runningServices == null) {
            return false;
        }
        Iterator<T> it3 = runningServices.iterator();
        while (it3.hasNext()) {
            HMLog.info(logTag, new g((ActivityManager.RunningServiceInfo) it3.next()));
        }
        return false;
    }

    @NotNull
    public final String getAppName(@NotNull Context context, @NotNull String pkg) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(pkg, 0);
            String string = packageInfo.applicationInfo.loadLabel(context.getPackageManager()).toString();
            if (!(string.length() == 0)) {
                return string;
            }
            HMLog.info(logTag, a.a);
            return context.getString(packageInfo.applicationInfo.labelRes);
        } catch (Exception e2) {
            HMLog.info(logTag, new b(e2));
            return "";
        }
    }

    public final boolean isAppInstalled(@NotNull Context context, @NotNull String pkg) {
        return context.getPackageManager().getPackageInfo(pkg, 0) != null;
    }

    public final boolean isNotificationAccessEnabled(@NotNull Context context) {
        Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(context);
        boolean zContains = enabledListenerPackages.contains(context.getPackageName());
        if (!zContains) {
            HMLog.info(logTag, new c(context));
            Iterator<T> it2 = enabledListenerPackages.iterator();
            while (it2.hasNext()) {
                HMLog.info(logTag, new d((String) it2.next()));
            }
        }
        return zContains;
    }

    public final boolean isScreenOn(@NotNull Context context) {
        for (Display display : DisplayManagerCompat.getInstance(context).getDisplays()) {
            HMLog.info(logTag, new h(display));
            if (display.getState() == 2) {
                return true;
            }
        }
        return false;
    }

    public final boolean isServiceNotRunning(@NotNull Context context, @NotNull Class<Object> clazz) {
        return !a(context, clazz);
    }
}
