package com.xiaomi.hm.health.bodyfat.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.huami.tools.analytics.DbUtils;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u000e¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/utils/Utils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "resInt", "", "getColors", "", "str", "", "defaultValue", "toLongValue", "c", "", "isNetworkConnected", "getScreenWidth", "height", "cm2inch", "isChineseLanguage", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class Utils {

    @NotNull
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public static /* synthetic */ long toLongValue$default(Utils utils, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return utils.toLongValue(str, j);
    }

    public final int cm2inch(int height) {
        return (int) Math.round(((double) height) * 0.394d);
    }

    @NotNull
    public final int[] getColors(@NotNull Context context, int resInt) {
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(resInt);
        int[] iArr = new int[typedArrayObtainTypedArray.length()];
        int length = typedArrayObtainTypedArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                iArr[i] = typedArrayObtainTypedArray.getColor(i, 0);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        typedArrayObtainTypedArray.recycle();
        return iArr;
    }

    public final int getScreenWidth(@NotNull Context context) {
        Object systemService = context.getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public final boolean isChineseLanguage() {
        return Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage());
    }

    public final boolean isNetworkConnected(@NotNull Context c) {
        Object systemService = c.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final long toLongValue(@Nullable String str, long defaultValue) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return defaultValue;
    }
}
