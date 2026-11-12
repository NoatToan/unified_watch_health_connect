package com.xiaomi.fitness.access.misport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.access.misport.MiSportImportUtilKt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0006\u0010\r\u001a\u00020\u000e\u001a\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0007\u001a\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011\u001a\u0006\u0010\u001d\u001a\u00020\u001b\u001a\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"REQUEST_CODE", "", "KEY_AUTH_URL", "", "LOG_TAG", "MI_SPORT_PKG", "REDIRECT_URI", "AUTH_HUAMI_URL", "MIGRATE_STATUS_NONE", "MIGRATE_STATUS_MIGRATING", "MIGRATE_STATUS_FAILE", "MIGRATE_STATUS_SUCCESS", "MIGRATE_STATUS_CANCEL", "buildMiSportUri", "Landroid/net/Uri;", "dataObserver", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/xiaomi/fitness/access/misport/OnConfigChange;", "handler", "Landroid/os/Handler;", "isPkgInstall", "", "context", "Landroid/content/Context;", Constants.KEY_PACKAGE_NAME, "isShowMiSportView", "addDataObserver", "", "action", "notifyObserver", "removeObserver", "access-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMiSportImportUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiSportImportUtil.kt\ncom/xiaomi/fitness/access/misport/MiSportImportUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1863#2,2:105\n*S KotlinDebug\n*F\n+ 1 MiSportImportUtil.kt\ncom/xiaomi/fitness/access/misport/MiSportImportUtilKt\n*L\n100#1:105,2\n*E\n"})
public final class MiSportImportUtilKt {

    @NotNull
    public static final String AUTH_HUAMI_URL = "https://user.huami.com/oauth2/index.html#/login?redirect_uri=https%3A%2F%2Fregion.hlth.io.mi.com%2Fthird-oauth%2Fv3%2Fcallback&client_id=v2N0da410c4d77c4d2fa8b3cd5e4d08ec2b&token=access%2Crefresh&response_type=code&state=%2Fapplinks%2Fmisport";

    @NotNull
    public static final String KEY_AUTH_URL = "URL";

    @NotNull
    public static final String LOG_TAG = "misport_migrate";
    public static final int MIGRATE_STATUS_CANCEL = 3;
    public static final int MIGRATE_STATUS_FAILE = -1;
    public static final int MIGRATE_STATUS_MIGRATING = 1;
    public static final int MIGRATE_STATUS_NONE = -2;
    public static final int MIGRATE_STATUS_SUCCESS = 2;

    @NotNull
    public static final String MI_SPORT_PKG = "com.xiaomi.hm.health";

    @NotNull
    public static final String REDIRECT_URI = "https://region.hlth.io.mi.com/third-oauth/v3/callback";
    public static final int REQUEST_CODE = 10011;

    @NotNull
    private static final CopyOnWriteArraySet<OnConfigChange> dataObserver = new CopyOnWriteArraySet<>();

    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper());

    public static final void addDataObserver(@NotNull OnConfigChange action) {
        Intrinsics.checkNotNullParameter(action, "action");
        CopyOnWriteArraySet<OnConfigChange> copyOnWriteArraySet = dataObserver;
        if (copyOnWriteArraySet.contains(action)) {
            return;
        }
        copyOnWriteArraySet.add(action);
    }

    @NotNull
    public static final Uri buildMiSportUri() {
        Uri uri = Uri.parse(AUTH_HUAMI_URL);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        return uri;
    }

    @SuppressLint({"WrongConstant"})
    public static final boolean isPkgInstall(@NotNull Context context, @NotNull String pkgName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        try {
            Intrinsics.checkNotNullExpressionValue(context.getPackageManager().getPackageInfo(pkgName, 0), "getPackageInfo(...)");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean isShowMiSportView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return isPkgInstall(context, MI_SPORT_PKG);
    }

    public static final void notifyObserver() {
        handler.post(new Runnable() { // from class: gwf
            @Override // java.lang.Runnable
            public final void run() {
                MiSportImportUtilKt.notifyObserver$lambda$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObserver$lambda$1() {
        Iterator<T> it = dataObserver.iterator();
        while (it.hasNext()) {
            ((OnConfigChange) it.next()).onDataChange();
        }
    }

    public static final void removeObserver(@NotNull OnConfigChange action) {
        Intrinsics.checkNotNullParameter(action, "action");
        dataObserver.remove(action);
    }
}
