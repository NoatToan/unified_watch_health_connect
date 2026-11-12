package com.xiaomi.fitness.common.utils;

import android.annotation.SuppressLint;
import android.app.AppOpsManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import android.provider.Settings;
import com.miui.tsmclient.model.ErrorCode;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/common/utils/DisplayPopupWindowWhileRunningInBgUtil;", "", "<init>", "()V", "displayPopupWindowWhileRunningInBg", "", "context", "Landroid/content/Context;", "isXiaomiBgStartPermissionAllowed", "isVivoBgStartPermissionAllowed", "getVivoBgStartPermissionStatus", "", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DisplayPopupWindowWhileRunningInBgUtil {

    @NotNull
    public static final DisplayPopupWindowWhileRunningInBgUtil INSTANCE = new DisplayPopupWindowWhileRunningInBgUtil();

    private DisplayPopupWindowWhileRunningInBgUtil() {
    }

    @SuppressLint({"Range"})
    private final int getVivoBgStartPermissionStatus(Context context) {
        Uri uri = Uri.parse("content://com.vivo.permissionmanager.provider.permission/start_bg_activity");
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        int i = 1;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, null, "pkgname = ?", new String[]{context.getPackageName()}, null);
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    i = cursor2.moveToFirst() ? cursor2.getInt(cursor2.getColumnIndex("currentstate")) : 1;
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursor, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(cursor, th);
                        throw th2;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    private final boolean isVivoBgStartPermissionAllowed(Context context) {
        return getVivoBgStartPermissionStatus(context) == 0;
    }

    private final boolean isXiaomiBgStartPermissionAllowed(Context context) {
        Object systemService = context.getSystemService("appops");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
        AppOpsManager appOpsManager = (AppOpsManager) systemService;
        try {
            Class<?> cls = appOpsManager.getClass();
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
            Object objInvoke = method.invoke(appOpsManager, Integer.valueOf(ErrorCode.SE_APP_NOT_FOUND), Integer.valueOf(Process.myUid()), context.getPackageName());
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objInvoke).intValue() == 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean displayPopupWindowWhileRunningInBg(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (RomUtils.isXiaomi()) {
            return isXiaomiBgStartPermissionAllowed(context);
        }
        RomUtils romUtils = RomUtils.INSTANCE;
        if (romUtils.isVivo()) {
            return isVivoBgStartPermissionAllowed(context);
        }
        if (romUtils.isOppo()) {
            return Settings.canDrawOverlays(context);
        }
        return true;
    }
}
