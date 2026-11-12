package com.huami.sky.ui.play;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.ui.play.SkyPlayAlarmJump;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/huami/sky/ui/play/SkyPlayAlarmJump;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "", "packageNameList", "", "h", "c", "packageName", "", GoogleApiAvailabilityLight.a, "Landroid/content/pm/PackageInfo;", "pInfo", "e", "openClock", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "networkIO", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "mainHandler", "<init>", "()V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlayAlarmJump {
    private static final int c = 11;
    private static final int d = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Executor networkIO = Executors.newFixedThreadPool(3);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    private final List<String> c(Context context) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        int size = installedPackages.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                PackageInfo packageInfo = installedPackages.get(i);
                if (packageInfo.versionName != null) {
                    arrayList.add(packageInfo.packageName);
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    private final boolean d(String packageName) {
        return StringsKt__StringsKt.indexOf$default((CharSequence) packageName, "clock", 0, false, 6, (Object) null) != -1 && StringsKt__StringsKt.indexOf$default((CharSequence) packageName, "widget", 0, false, 6, (Object) null) == -1;
    }

    private final boolean e(PackageInfo pInfo) {
        int i = pInfo.applicationInfo.flags;
        return ((i & 1) == 0 && (i & 128) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final SkyPlayAlarmJump skyPlayAlarmJump, final Context context) {
        List<String> listC = skyPlayAlarmJump.c(context);
        int size = listC.size();
        final ArrayList arrayList = new ArrayList();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (listC.get(i).length() > 11 && skyPlayAlarmJump.d(listC.get(i))) {
                    try {
                        if (skyPlayAlarmJump.e(context.getPackageManager().getPackageInfo(listC.get(i), 0))) {
                            arrayList.add(listC.get(i));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (i2 >= size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        skyPlayAlarmJump.mainHandler.post(new Runnable() { // from class: jy6
            @Override // java.lang.Runnable
            public final void run() {
                SkyPlayAlarmJump.g(this.a, context, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SkyPlayAlarmJump skyPlayAlarmJump, Context context, List list) {
        skyPlayAlarmJump.h(context, list);
    }

    private final void h(Context context, List<String> packageNameList) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageNameList.isEmpty() ^ true ? packageNameList.get(0) : "");
        if (launchIntentForPackage != null) {
            context.startActivity(launchIntentForPackage);
        } else {
            context.startActivity(new Intent("android.intent.action.SET_ALARM"));
        }
    }

    public final void openClock(@NotNull final Context context) {
        this.networkIO.execute(new Runnable() { // from class: iy6
            @Override // java.lang.Runnable
            public final void run() {
                SkyPlayAlarmJump.f(this.a, context);
            }
        });
    }
}
