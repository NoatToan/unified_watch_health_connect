package com.huami.moving.ui.sport.detail.segment.dialog;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huami.tools.analytics.DbUtils;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSystemBarTintSupport;", "", "Landroid/content/Context;", "c", "", "a", DbUtils.Const.Table.CONTEXT, "key", "b", "", "isSupport", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportSegmentSystemBarTintSupport {

    @NotNull
    public static final SportSegmentSystemBarTintSupport INSTANCE = new SportSegmentSystemBarTintSupport();

    private SportSegmentSystemBarTintSupport() {
    }

    private final String a(Context c) {
        return b(c, "ro.miui.ui.version.name");
    }

    private final String b(Context context, String key) throws IllegalArgumentException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            Object objInvoke = clsLoadClass.getMethod("get", (Class[]) Arrays.copyOf(new Class[]{String.class}, 1)).invoke(clsLoadClass, Arrays.copyOf(new Object[]{key}, 1));
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            return "";
        }
    }

    public final boolean isSupport(@NotNull Context context) {
        return (!TextUtils.isEmpty(a(context)) && Build.VERSION.SDK_INT >= 19) || Build.VERSION.SDK_INT >= 21;
    }
}
