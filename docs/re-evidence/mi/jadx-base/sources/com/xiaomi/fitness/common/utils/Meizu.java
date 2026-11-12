package com.xiaomi.fitness.common.utils;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0003J\u0006\u0010\u000b\u001a\u00020\u0005J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/common/utils/Meizu;", "", "<init>", "()V", "checkFloatWindowPermission", "", "context", "Landroid/content/Context;", "checkOp", "op", "", "checkIsMeizuRom", "getSystemProperty", "", "propName", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Meizu {

    @NotNull
    public static final Meizu INSTANCE = new Meizu();

    private Meizu() {
    }

    @TargetApi(19)
    private final boolean checkOp(Context context, int op) {
        Object systemService = context.getSystemService("appops");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
        AppOpsManager appOpsManager = (AppOpsManager) systemService;
        try {
            Class cls = Integer.TYPE;
            Object objInvoke = AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, Integer.valueOf(op), Integer.valueOf(Binder.getCallingUid()), context.getPackageName());
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objInvoke).intValue() == 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean checkFloatWindowPermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return checkOp(context, 24);
    }

    public final boolean checkIsMeizuRom() throws Throwable {
        String systemProperty = getSystemProperty("ro.build.display.id");
        if (systemProperty == null) {
            systemProperty = "";
        }
        if (TextUtils.isEmpty(systemProperty)) {
            return false;
        }
        if (!StringsKt__StringsKt.contains$default((CharSequence) systemProperty, (CharSequence) "flyme", false, 2, (Object) null)) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = systemProperty.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "flyme", false, 2, (Object) null)) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final String getSystemProperty(@NotNull String propName) throws Throwable {
        BufferedReader bufferedReader;
        Intrinsics.checkNotNullParameter(propName, "propName");
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + propName).getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return line;
            } catch (IOException unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
